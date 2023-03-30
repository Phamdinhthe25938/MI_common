package com.obys.common.constant;

public class Constants {

  public final class UrlRole {
    public static final String ROLE_ADMIN = "/api/admin";
    public static final String ROLE_EMPLOYEE = "/api/employee";
    public static final String ROLE_USER = "/api/user";
  }

  public final class Common {
    public static final String VTI_TITLE = "VTI";

    public static final String VTI_EMAIL = "@vti.com.vn";
  }

  public final class AuthService {
    /**
     * UUID
     */
    public final static String UUID = "UUID";
    /**
     * ======  JWT
     */
    public final static String AUTHORIZATION = "Authorization";
    public final static String BEARER = "Bearer ";
    public static final String KEY_PRIVATE = "abc12345674";
    public static final long EXPIRE_TIME = 86400000000L;

    public static final String ROLE = "Role";

  }
}
