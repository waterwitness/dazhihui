package com.tencent.qalsdk.sdk;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;

public class ai
{
  public static c a(ToServiceMsg paramToServiceMsg)
  {
    paramToServiceMsg = new JceInputStream((byte[])paramToServiceMsg.getAttribute("to_push_cmdCallbackerInfo"));
    c localc = new c();
    localc.readFrom(paramToServiceMsg);
    return localc;
  }
  
  public static d a(FromServiceMsg paramFromServiceMsg)
  {
    paramFromServiceMsg = new JceInputStream((byte[])paramFromServiceMsg.getAttribute("to_set_connInfo"));
    d locald = new d();
    locald.readFrom(paramFromServiceMsg);
    return locald;
  }
  
  public static void a(FromServiceMsg paramFromServiceMsg, d paramd)
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    paramd.writeTo(localJceOutputStream);
    paramFromServiceMsg.addAttribute("to_set_connInfo", localJceOutputStream.toByteArray());
  }
  
  public static void a(ToServiceMsg paramToServiceMsg, a parama)
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    parama.writeTo(localJceOutputStream);
    paramToServiceMsg.addAttribute("to_set_accountInfo", localJceOutputStream.toByteArray());
  }
  
  public static void a(ToServiceMsg paramToServiceMsg, ah paramah)
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    paramah.writeTo(localJceOutputStream);
    paramToServiceMsg.addAttribute("to_push_pushRegisterInfo", localJceOutputStream.toByteArray());
  }
  
  public static void a(ToServiceMsg paramToServiceMsg, c paramc)
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    paramc.writeTo(localJceOutputStream);
    paramToServiceMsg.addAttribute("to_push_cmdCallbackerInfo", localJceOutputStream.toByteArray());
  }
  
  public static ah b(ToServiceMsg paramToServiceMsg)
  {
    paramToServiceMsg = new JceInputStream((byte[])paramToServiceMsg.getAttribute("to_push_pushRegisterInfo"));
    ah localah = new ah();
    localah.readFrom(paramToServiceMsg);
    return localah;
  }
  
  public static a c(ToServiceMsg paramToServiceMsg)
  {
    paramToServiceMsg = new JceInputStream((byte[])paramToServiceMsg.getAttribute("to_set_accountInfo"));
    a locala = new a();
    locala.readFrom(paramToServiceMsg);
    return locala;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\sdk\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */