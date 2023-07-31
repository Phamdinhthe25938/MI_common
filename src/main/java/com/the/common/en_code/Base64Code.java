package com.the.common.en_code;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Map;

public class Base64Code {

  public static final String KEY = "base64_key";
  public static final String BASE64_CODE = "base64_code";

  public Map<String, String> encrypt(String plainText) {
    try {
      // Generate a new AES key
      KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
      keyGenerator.init(128);
      byte[] secretKeyBytes = keyGenerator.generateKey().getEncoded();

      // Encrypt the plaintext using the AES key
      SecretKeySpec key = new SecretKeySpec(secretKeyBytes, "AES");
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.ENCRYPT_MODE, key);
      byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
      // Encode the encrypted bytes using Base64
      String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);
      // Return the encrypted Base64 string and the AES key
      return Map.of(
          KEY, Base64.getEncoder().encodeToString(secretKeyBytes),
          BASE64_CODE, encryptedBase64
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }


  public String decrypt(String base64Code, String keyOpen) {
    try {
      // Split the encrypted Base64 string and the AES key
      byte[] secretKeyBytes = Base64.getDecoder().decode(keyOpen);

      // Decrypt the Base64-encoded bytes using the AES key
      byte[] encryptedBytes = Base64.getDecoder().decode(base64Code);
      SecretKeySpec key = new SecretKeySpec(secretKeyBytes, "AES");
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.DECRYPT_MODE, key);
      byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

      // Return the decrypted string
      return new String(decryptedBytes);
    } catch (Exception e) {
      return null;
    }
  }
}
