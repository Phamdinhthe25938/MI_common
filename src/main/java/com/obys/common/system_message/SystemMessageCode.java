package com.obys.common.system_message;

import org.springframework.stereotype.Component;


@Component
public class SystemMessageCode {
    /**
     * ======   Common
     */

    final public class CommonMessage {
        /**
         * ======  success
         */
        public final static String CODE_SUCCESS = "S_00";
        public final static String MESSAGE_SUCCESS = "message.success";
        public final static String SAVE_SUCCESS = "save.message.success";
        public final static String UPDATE_SUCCESS = "update.message.success";
        public final static String DELETE_SUCCESS = "delete.message.success";

        /**
         * ======  error
         */
        public final static String EXIST_IN_SYSTEM = "exist.in.system";
        public final static String NOT_EXIST_IN_SYSTEM = "not.exist.in.system";

    }

    /**
     * ======  auth-service
     */
    final public class AuthService {
        /**
         * ---------------  Validate token ----------
         */

        public final static String CODE_TOKEN_FAIL = "TKF_999";
        public final static String MESSAGE_TOKEN_FAIL = "message.toke.fail";

        /**
         * ----------------  Login -------------------
         */

        /**
         *  Validate use annotation
         */
         public final static String CODE_ANNOTATION_INVALID = "IN_AN_001";
        /**
         * Code And message Success
         */
       public final static String CODE_LOGIN_SUCCESS = "S_L_0001";
       public final static String MESSAGE_LOGIN_SUCCESS = "login.success";

        /**
         * Code And message Error
         */
        public final static String CODE_LOGIN_ERROR= "E_L_0001";
        public final static String MESSAGE_LOGIN_ERROR = "login.error";

        /**
         * ----------------  Registry user -------------------
         */

        /**
         * Code And message Success
         */
        public final static String CODE_REGISTRY_SUCCESS = "S_R_0001";
        public final static String MESSAGE_REGISTRY_SUCCESS = "registry.success";

        /**
         * Code and message error
         */
        public final static String CODE_REGISTRY_USER_NAME_EXIST = "E_R_111";
        public final static String MESSAGE_REGISTRY_USER_NAME_EXIST = "registry.user.name.exist";
        public final static String CODE_REGISTRY_GMAIL_EXIST = "E_R_112";
        public final static String MESSAGE_REGISTRY_GMAIL_EXIST = "registry.gmail.exist";
        public final static String CODE_REGISTRY_PHONE_EXIST = "E_R_111";
        public final static String MESSAGE_REGISTRY_PHONE_EXIST = "registry.phone.exist";
    }

    /**
     * ======  employee-service
     */
    final public class EmployeeService {

        /**
         * kafka communicate
         */
        // send info employee to author service when registry (Code 111)
        public final static String CODE_SEND_INFO_EMPLOYEE = "KC_111";
        public final static String MESSAGE_SEND_INFO_EMPLOYEE = "send.info.employee.fail";


        /**
         * ====== field
         */
        /**== Employee.Class ==**/
        public final static String CODE = "code.employee";
        public final static String ACCOUNT = "account.employee";
        public final static String TELEPHONE = "telephone.employee";
        public final static String EMAIL = "email.employee";
        public final static String NUMBERCCCD = "numberCCCD.employee";


        /**
         * ======  code #_111
         */
        /**== Employee.Class ==**/
        public final static String CODE_CODE_EXIST = "E_CE_111";
        public final static String CODE_ACCOUNT_EXIST = "E_AE_112";
        public final static String CODE_TELEPHONE_EXIST = "E_TE_113";
        public final static String CODE_EMAIL_EXIST = "E_EE_114";
        public final static String CODE_NUMBERCCCD_EXIST = "E_NCE_115";
    }
}