package com.the.common.constant;

import java.time.LocalTime;

public class Constants {

  public static final class Notification {
    public final static String TITLE_LOG_VACATION = "Log vacation day";
    public final static String CONTENT_LOG_VACATION = " '%s' want you approve request log vacation";
  }

  public static final class TimeRegulations {
    public final static long TIME_OFFICE = 8;
    public final static LocalTime WORK_START_TIME_DAY = LocalTime.of(8, 30, 0);

    public final static LocalTime WORK_END_TIME_MORNING = LocalTime.of(12, 0, 0);
    public final static LocalTime WORK_START_TIME_AFTERNOON = LocalTime.of(13, 0, 0);
    public final static LocalTime WORK_END_TIME_DAY = LocalTime.of(17, 30, 0);

  }

  public final static long TIME_OFFICE = 8;

  public final class UrlRole {
    public static final String ROLE_MANAGER_PERSONAL = "/api/manager-personal";
    public static final String ROLE_ALL = "/api/all";
    public static final String ROLE_EMPLOYEE = "/api/employee";
    public static final String ROLE_USER = "/api/user";
  }

  public static final class Common {
    public static final String VTI_TITLE = "VTI";

    public static final String VTI_EMAIL = "@vti.com.vn";
  }

  public static final class AuthService {
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
