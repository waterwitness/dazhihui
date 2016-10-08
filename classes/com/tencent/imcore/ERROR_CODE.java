package com.tencent.imcore;

public final class ERROR_CODE
{
  public static final ERROR_CODE ERR_BIND_FAIL_GUID_NULL;
  public static final ERROR_CODE ERR_BIND_FAIL_ISBINDING;
  public static final ERROR_CODE ERR_BIND_FAIL_NO_SSOTICKET;
  public static final ERROR_CODE ERR_BIND_FAIL_REG_TIMEOUT;
  public static final ERROR_CODE ERR_BIND_FAIL_REPEATD_BIND;
  public static final ERROR_CODE ERR_BIND_FAIL_TINYID_NULL;
  public static final ERROR_CODE ERR_BIND_FAIL_UNKNOWN;
  public static final ERROR_CODE ERR_BIND_FAIL_UNPACK_REGPACK_FAILED;
  public static final ERROR_CODE ERR_DATABASE_OPERATE_FAILED;
  public static final ERROR_CODE ERR_EXPIRED_SESSION_NODE;
  public static final ERROR_CODE ERR_FILE_TRANS_AUTH_FAILED;
  public static final ERROR_CODE ERR_FILE_TRANS_DOWNLOAD_FAILED;
  public static final ERROR_CODE ERR_FILE_TRANS_NO_SERVER;
  public static final ERROR_CODE ERR_FILE_TRANS_UPLOAD_FAILED;
  public static final ERROR_CODE ERR_FRIENDSHIP_PROXY_LOCAL_CHECK_ERR;
  public static final ERROR_CODE ERR_FRIENDSHIP_PROXY_NOT_SYNCED;
  public static final ERROR_CODE ERR_FRIENDSHIP_PROXY_SYNCED_FAIL;
  public static final ERROR_CODE ERR_FRIENDSHIP_PROXY_SYNCING;
  public static final ERROR_CODE ERR_GROUP_INVALID_FIELD;
  public static final ERROR_CODE ERR_GROUP_STORAGE_DISABLED;
  public static final ERROR_CODE ERR_HTTP_REQ_FAILED;
  public static final ERROR_CODE ERR_INIT_CORE_FAIL;
  public static final ERROR_CODE ERR_INVALID_CONVERSATION;
  public static final ERROR_CODE ERR_INVALID_MSG_ELEM;
  public static final ERROR_CODE ERR_INVALID_PARAMETERS;
  public static final ERROR_CODE ERR_IN_PROGESS;
  public static final ERROR_CODE ERR_LOADGRPINFO_FAILED;
  public static final ERROR_CODE ERR_LOADMSG_FAILED;
  public static final ERROR_CODE ERR_LOGIN_AUTH_FAILED;
  public static final ERROR_CODE ERR_LOGIN_KICKED_OFF_BY_OTHER;
  public static final ERROR_CODE ERR_LOGIN_SIG_EXPIRE;
  public static final ERROR_CODE ERR_NO_SUCC_RESULT;
  public static final ERROR_CODE ERR_OPENBDH_BASE;
  public static final ERROR_CODE ERR_PACKET_FAIL_FLOW_SAVE_FILTERED;
  public static final ERROR_CODE ERR_PACKET_FAIL_LOGIC_ERR;
  public static final ERROR_CODE ERR_PACKET_FAIL_REQ_NO_AUTH;
  public static final ERROR_CODE ERR_PACKET_FAIL_REQ_NO_NET;
  public static final ERROR_CODE ERR_PACKET_FAIL_REQ_ON_RESEND;
  public static final ERROR_CODE ERR_PACKET_FAIL_REQ_OVER_LOAD;
  public static final ERROR_CODE ERR_PACKET_FAIL_REQ_TIMEOUT;
  public static final ERROR_CODE ERR_PACKET_FAIL_RESP_NO_NET;
  public static final ERROR_CODE ERR_PACKET_FAIL_RESP_NO_RESEND;
  public static final ERROR_CODE ERR_PACKET_FAIL_RESP_TIMEOUT;
  public static final ERROR_CODE ERR_PACKET_FAIL_SSO_ERR;
  public static final ERROR_CODE ERR_PACKET_FAIL_UNKNOWN;
  public static final ERROR_CODE ERR_PARSE_RESPONSE_FAILED;
  public static final ERROR_CODE ERR_REQUEST_TIMEOUT;
  public static final ERROR_CODE ERR_REQ_CONTENT_ATTACK;
  public static final ERROR_CODE ERR_REQ_NO_NET_ON_REQ;
  public static final ERROR_CODE ERR_REQ_NO_NET_ON_RSP;
  public static final ERROR_CODE ERR_SDK_NOT_INITIALIZED;
  public static final ERROR_CODE ERR_SDK_NOT_LOGGED_IN;
  public static final ERROR_CODE ERR_SERIALIZE_REQ_FAILED;
  public static final ERROR_CODE ERR_SUCC = new ERROR_CODE("ERR_SUCC", internalJNI.ERR_SUCC_get());
  public static final ERROR_CODE ERR_TO_USER_INVALID;
  public static final ERROR_CODE ERR_USER_SIG_EXPIRED;
  private static int swigNext = 0;
  private static ERROR_CODE[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    ERR_PARSE_RESPONSE_FAILED = new ERROR_CODE("ERR_PARSE_RESPONSE_FAILED", internalJNI.ERR_PARSE_RESPONSE_FAILED_get());
    ERR_SERIALIZE_REQ_FAILED = new ERROR_CODE("ERR_SERIALIZE_REQ_FAILED", internalJNI.ERR_SERIALIZE_REQ_FAILED_get());
    ERR_NO_SUCC_RESULT = new ERROR_CODE("ERR_NO_SUCC_RESULT", internalJNI.ERR_NO_SUCC_RESULT_get());
    ERR_INVALID_CONVERSATION = new ERROR_CODE("ERR_INVALID_CONVERSATION", internalJNI.ERR_INVALID_CONVERSATION_get());
    ERR_LOADMSG_FAILED = new ERROR_CODE("ERR_LOADMSG_FAILED", internalJNI.ERR_LOADMSG_FAILED_get());
    ERR_FILE_TRANS_AUTH_FAILED = new ERROR_CODE("ERR_FILE_TRANS_AUTH_FAILED", internalJNI.ERR_FILE_TRANS_AUTH_FAILED_get());
    ERR_FILE_TRANS_NO_SERVER = new ERROR_CODE("ERR_FILE_TRANS_NO_SERVER", internalJNI.ERR_FILE_TRANS_NO_SERVER_get());
    ERR_FILE_TRANS_UPLOAD_FAILED = new ERROR_CODE("ERR_FILE_TRANS_UPLOAD_FAILED", internalJNI.ERR_FILE_TRANS_UPLOAD_FAILED_get());
    ERR_FILE_TRANS_DOWNLOAD_FAILED = new ERROR_CODE("ERR_FILE_TRANS_DOWNLOAD_FAILED", internalJNI.ERR_FILE_TRANS_DOWNLOAD_FAILED_get());
    ERR_HTTP_REQ_FAILED = new ERROR_CODE("ERR_HTTP_REQ_FAILED", internalJNI.ERR_HTTP_REQ_FAILED_get());
    ERR_TO_USER_INVALID = new ERROR_CODE("ERR_TO_USER_INVALID", internalJNI.ERR_TO_USER_INVALID_get());
    ERR_REQUEST_TIMEOUT = new ERROR_CODE("ERR_REQUEST_TIMEOUT", internalJNI.ERR_REQUEST_TIMEOUT_get());
    ERR_SDK_NOT_INITIALIZED = new ERROR_CODE("ERR_SDK_NOT_INITIALIZED", internalJNI.ERR_SDK_NOT_INITIALIZED_get());
    ERR_SDK_NOT_LOGGED_IN = new ERROR_CODE("ERR_SDK_NOT_LOGGED_IN", internalJNI.ERR_SDK_NOT_LOGGED_IN_get());
    ERR_IN_PROGESS = new ERROR_CODE("ERR_IN_PROGESS", internalJNI.ERR_IN_PROGESS_get());
    ERR_INVALID_MSG_ELEM = new ERROR_CODE("ERR_INVALID_MSG_ELEM", internalJNI.ERR_INVALID_MSG_ELEM_get());
    ERR_INVALID_PARAMETERS = new ERROR_CODE("ERR_INVALID_PARAMETERS", internalJNI.ERR_INVALID_PARAMETERS_get());
    ERR_INIT_CORE_FAIL = new ERROR_CODE("ERR_INIT_CORE_FAIL", internalJNI.ERR_INIT_CORE_FAIL_get());
    ERR_DATABASE_OPERATE_FAILED = new ERROR_CODE("ERR_DATABASE_OPERATE_FAILED", internalJNI.ERR_DATABASE_OPERATE_FAILED_get());
    ERR_EXPIRED_SESSION_NODE = new ERROR_CODE("ERR_EXPIRED_SESSION_NODE", internalJNI.ERR_EXPIRED_SESSION_NODE_get());
    ERR_BIND_FAIL_UNKNOWN = new ERROR_CODE("ERR_BIND_FAIL_UNKNOWN", internalJNI.ERR_BIND_FAIL_UNKNOWN_get());
    ERR_BIND_FAIL_NO_SSOTICKET = new ERROR_CODE("ERR_BIND_FAIL_NO_SSOTICKET", internalJNI.ERR_BIND_FAIL_NO_SSOTICKET_get());
    ERR_BIND_FAIL_REPEATD_BIND = new ERROR_CODE("ERR_BIND_FAIL_REPEATD_BIND", internalJNI.ERR_BIND_FAIL_REPEATD_BIND_get());
    ERR_BIND_FAIL_TINYID_NULL = new ERROR_CODE("ERR_BIND_FAIL_TINYID_NULL", internalJNI.ERR_BIND_FAIL_TINYID_NULL_get());
    ERR_BIND_FAIL_GUID_NULL = new ERROR_CODE("ERR_BIND_FAIL_GUID_NULL", internalJNI.ERR_BIND_FAIL_GUID_NULL_get());
    ERR_BIND_FAIL_UNPACK_REGPACK_FAILED = new ERROR_CODE("ERR_BIND_FAIL_UNPACK_REGPACK_FAILED", internalJNI.ERR_BIND_FAIL_UNPACK_REGPACK_FAILED_get());
    ERR_BIND_FAIL_REG_TIMEOUT = new ERROR_CODE("ERR_BIND_FAIL_REG_TIMEOUT", internalJNI.ERR_BIND_FAIL_REG_TIMEOUT_get());
    ERR_BIND_FAIL_ISBINDING = new ERROR_CODE("ERR_BIND_FAIL_ISBINDING", internalJNI.ERR_BIND_FAIL_ISBINDING_get());
    ERR_PACKET_FAIL_UNKNOWN = new ERROR_CODE("ERR_PACKET_FAIL_UNKNOWN", internalJNI.ERR_PACKET_FAIL_UNKNOWN_get());
    ERR_PACKET_FAIL_REQ_NO_NET = new ERROR_CODE("ERR_PACKET_FAIL_REQ_NO_NET", internalJNI.ERR_PACKET_FAIL_REQ_NO_NET_get());
    ERR_PACKET_FAIL_RESP_NO_NET = new ERROR_CODE("ERR_PACKET_FAIL_RESP_NO_NET", internalJNI.ERR_PACKET_FAIL_RESP_NO_NET_get());
    ERR_PACKET_FAIL_REQ_NO_AUTH = new ERROR_CODE("ERR_PACKET_FAIL_REQ_NO_AUTH", internalJNI.ERR_PACKET_FAIL_REQ_NO_AUTH_get());
    ERR_PACKET_FAIL_SSO_ERR = new ERROR_CODE("ERR_PACKET_FAIL_SSO_ERR", internalJNI.ERR_PACKET_FAIL_SSO_ERR_get());
    ERR_PACKET_FAIL_REQ_TIMEOUT = new ERROR_CODE("ERR_PACKET_FAIL_REQ_TIMEOUT", internalJNI.ERR_PACKET_FAIL_REQ_TIMEOUT_get());
    ERR_PACKET_FAIL_RESP_TIMEOUT = new ERROR_CODE("ERR_PACKET_FAIL_RESP_TIMEOUT", internalJNI.ERR_PACKET_FAIL_RESP_TIMEOUT_get());
    ERR_PACKET_FAIL_REQ_ON_RESEND = new ERROR_CODE("ERR_PACKET_FAIL_REQ_ON_RESEND", internalJNI.ERR_PACKET_FAIL_REQ_ON_RESEND_get());
    ERR_PACKET_FAIL_RESP_NO_RESEND = new ERROR_CODE("ERR_PACKET_FAIL_RESP_NO_RESEND", internalJNI.ERR_PACKET_FAIL_RESP_NO_RESEND_get());
    ERR_PACKET_FAIL_FLOW_SAVE_FILTERED = new ERROR_CODE("ERR_PACKET_FAIL_FLOW_SAVE_FILTERED", internalJNI.ERR_PACKET_FAIL_FLOW_SAVE_FILTERED_get());
    ERR_PACKET_FAIL_REQ_OVER_LOAD = new ERROR_CODE("ERR_PACKET_FAIL_REQ_OVER_LOAD", internalJNI.ERR_PACKET_FAIL_REQ_OVER_LOAD_get());
    ERR_PACKET_FAIL_LOGIC_ERR = new ERROR_CODE("ERR_PACKET_FAIL_LOGIC_ERR", internalJNI.ERR_PACKET_FAIL_LOGIC_ERR_get());
    ERR_FRIENDSHIP_PROXY_NOT_SYNCED = new ERROR_CODE("ERR_FRIENDSHIP_PROXY_NOT_SYNCED", internalJNI.ERR_FRIENDSHIP_PROXY_NOT_SYNCED_get());
    ERR_FRIENDSHIP_PROXY_SYNCING = new ERROR_CODE("ERR_FRIENDSHIP_PROXY_SYNCING", internalJNI.ERR_FRIENDSHIP_PROXY_SYNCING_get());
    ERR_FRIENDSHIP_PROXY_SYNCED_FAIL = new ERROR_CODE("ERR_FRIENDSHIP_PROXY_SYNCED_FAIL", internalJNI.ERR_FRIENDSHIP_PROXY_SYNCED_FAIL_get());
    ERR_FRIENDSHIP_PROXY_LOCAL_CHECK_ERR = new ERROR_CODE("ERR_FRIENDSHIP_PROXY_LOCAL_CHECK_ERR", internalJNI.ERR_FRIENDSHIP_PROXY_LOCAL_CHECK_ERR_get());
    ERR_GROUP_INVALID_FIELD = new ERROR_CODE("ERR_GROUP_INVALID_FIELD", internalJNI.ERR_GROUP_INVALID_FIELD_get());
    ERR_GROUP_STORAGE_DISABLED = new ERROR_CODE("ERR_GROUP_STORAGE_DISABLED", internalJNI.ERR_GROUP_STORAGE_DISABLED_get());
    ERR_LOADGRPINFO_FAILED = new ERROR_CODE("ERR_LOADGRPINFO_FAILED", internalJNI.ERR_LOADGRPINFO_FAILED_get());
    ERR_LOGIN_KICKED_OFF_BY_OTHER = new ERROR_CODE("ERR_LOGIN_KICKED_OFF_BY_OTHER", internalJNI.ERR_LOGIN_KICKED_OFF_BY_OTHER_get());
    ERR_LOGIN_AUTH_FAILED = new ERROR_CODE("ERR_LOGIN_AUTH_FAILED", internalJNI.ERR_LOGIN_AUTH_FAILED_get());
    ERR_USER_SIG_EXPIRED = new ERROR_CODE("ERR_USER_SIG_EXPIRED", internalJNI.ERR_USER_SIG_EXPIRED_get());
    ERR_REQ_NO_NET_ON_REQ = new ERROR_CODE("ERR_REQ_NO_NET_ON_REQ", internalJNI.ERR_REQ_NO_NET_ON_REQ_get());
    ERR_REQ_NO_NET_ON_RSP = new ERROR_CODE("ERR_REQ_NO_NET_ON_RSP", internalJNI.ERR_REQ_NO_NET_ON_RSP_get());
    ERR_REQ_CONTENT_ATTACK = new ERROR_CODE("ERR_REQ_CONTENT_ATTACK", internalJNI.ERR_REQ_CONTENT_ATTACK_get());
    ERR_LOGIN_SIG_EXPIRE = new ERROR_CODE("ERR_LOGIN_SIG_EXPIRE", internalJNI.ERR_LOGIN_SIG_EXPIRE_get());
    ERR_OPENBDH_BASE = new ERROR_CODE("ERR_OPENBDH_BASE", internalJNI.ERR_OPENBDH_BASE_get());
    swigValues = new ERROR_CODE[] { ERR_SUCC, ERR_PARSE_RESPONSE_FAILED, ERR_SERIALIZE_REQ_FAILED, ERR_NO_SUCC_RESULT, ERR_INVALID_CONVERSATION, ERR_LOADMSG_FAILED, ERR_FILE_TRANS_AUTH_FAILED, ERR_FILE_TRANS_NO_SERVER, ERR_FILE_TRANS_UPLOAD_FAILED, ERR_FILE_TRANS_DOWNLOAD_FAILED, ERR_HTTP_REQ_FAILED, ERR_TO_USER_INVALID, ERR_REQUEST_TIMEOUT, ERR_SDK_NOT_INITIALIZED, ERR_SDK_NOT_LOGGED_IN, ERR_IN_PROGESS, ERR_INVALID_MSG_ELEM, ERR_INVALID_PARAMETERS, ERR_INIT_CORE_FAIL, ERR_DATABASE_OPERATE_FAILED, ERR_EXPIRED_SESSION_NODE, ERR_BIND_FAIL_UNKNOWN, ERR_BIND_FAIL_NO_SSOTICKET, ERR_BIND_FAIL_REPEATD_BIND, ERR_BIND_FAIL_TINYID_NULL, ERR_BIND_FAIL_GUID_NULL, ERR_BIND_FAIL_UNPACK_REGPACK_FAILED, ERR_BIND_FAIL_REG_TIMEOUT, ERR_BIND_FAIL_ISBINDING, ERR_PACKET_FAIL_UNKNOWN, ERR_PACKET_FAIL_REQ_NO_NET, ERR_PACKET_FAIL_RESP_NO_NET, ERR_PACKET_FAIL_REQ_NO_AUTH, ERR_PACKET_FAIL_SSO_ERR, ERR_PACKET_FAIL_REQ_TIMEOUT, ERR_PACKET_FAIL_RESP_TIMEOUT, ERR_PACKET_FAIL_REQ_ON_RESEND, ERR_PACKET_FAIL_RESP_NO_RESEND, ERR_PACKET_FAIL_FLOW_SAVE_FILTERED, ERR_PACKET_FAIL_REQ_OVER_LOAD, ERR_PACKET_FAIL_LOGIC_ERR, ERR_FRIENDSHIP_PROXY_NOT_SYNCED, ERR_FRIENDSHIP_PROXY_SYNCING, ERR_FRIENDSHIP_PROXY_SYNCED_FAIL, ERR_FRIENDSHIP_PROXY_LOCAL_CHECK_ERR, ERR_GROUP_INVALID_FIELD, ERR_GROUP_STORAGE_DISABLED, ERR_LOADGRPINFO_FAILED, ERR_LOGIN_KICKED_OFF_BY_OTHER, ERR_LOGIN_AUTH_FAILED, ERR_USER_SIG_EXPIRED, ERR_REQ_NO_NET_ON_REQ, ERR_REQ_NO_NET_ON_RSP, ERR_REQ_CONTENT_ATTACK, ERR_LOGIN_SIG_EXPIRE, ERR_OPENBDH_BASE };
  }
  
  private ERROR_CODE(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private ERROR_CODE(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private ERROR_CODE(String paramString, ERROR_CODE paramERROR_CODE)
  {
    this.swigName = paramString;
    this.swigValue = paramERROR_CODE.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static ERROR_CODE swigToEnum(int paramInt)
  {
    if ((paramInt < swigValues.length) && (paramInt >= 0) && (swigValues[paramInt].swigValue == paramInt)) {
      return swigValues[paramInt];
    }
    int i = 0;
    while (i < swigValues.length)
    {
      if (swigValues[i].swigValue == paramInt) {
        return swigValues[i];
      }
      i += 1;
    }
    throw new IllegalArgumentException("No enum " + ERROR_CODE.class + " with value " + paramInt);
  }
  
  public final int swigValue()
  {
    return this.swigValue;
  }
  
  public final String toString()
  {
    return this.swigName;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\ERROR_CODE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */