package com.tencent.imsdk;

public class QLogImpl$QLogItem
{
  String level;
  String msg;
  String tag;
  Throwable tr;
  
  public QLogImpl$QLogItem(String paramString1, String paramString2, String paramString3, Throwable paramThrowable)
  {
    this.tag = paramString1;
    this.level = paramString2;
    this.msg = paramString3;
    this.tr = paramThrowable;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\QLogImpl$QLogItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */