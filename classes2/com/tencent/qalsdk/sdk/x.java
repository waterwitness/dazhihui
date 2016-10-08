package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.ToServiceMsg;
import java.util.HashMap;

public class x
{
  public static ToServiceMsg a(String paramString)
  {
    paramString = new ToServiceMsg(paramString, "0", "cmd_openConn");
    paramString.setMsfCommand(MsfCommand.openConn);
    paramString.setNeedCallback(false);
    paramString.setTimeout(15000L);
    return paramString;
  }
  
  public static boolean a(ToServiceMsg paramToServiceMsg)
  {
    boolean bool = false;
    if (paramToServiceMsg.getAttributes().get("_attr_msg_has_resend_by_10008") != null) {
      bool = ((Boolean)paramToServiceMsg.getAttributes().get("_attr_msg_has_resend_by_10008")).booleanValue();
    }
    return bool;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */