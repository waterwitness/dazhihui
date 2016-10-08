package com.tencent.qalsdk;

public class QALOffLineMsg
{
  private String cmd = null;
  private String identifer = null;
  private byte[] msgBody = null;
  
  public byte[] getBody()
  {
    return this.msgBody;
  }
  
  public String getCmd()
  {
    return this.cmd;
  }
  
  public String getID()
  {
    return this.identifer;
  }
  
  public void setBody(byte[] paramArrayOfByte)
  {
    this.msgBody = paramArrayOfByte;
  }
  
  public void setCmd(String paramString)
  {
    this.cmd = paramString;
  }
  
  public void setID(String paramString)
  {
    this.identifer = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\QALOffLineMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */