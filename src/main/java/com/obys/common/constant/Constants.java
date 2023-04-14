package com.obys.common.constant;

import java.time.LocalTime;

public class Constants {

  public final class TimeRegulations {
    public final static long TIME_OFFICE = 8;
    public final static LocalTime WORK_START_TIME = LocalTime.of(8, 30, 0);
    public final static LocalTime WORK_END_TIME = LocalTime.of(17, 30, 0);

  }

  public final static long TIME_OFFICE = 8;

  public final class UrlRole {
    public static final String ROLE_MANAGER_PERSONAL = "/api/manager-personal";
    public static final String ROLE_ALL = "/api/all";
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
