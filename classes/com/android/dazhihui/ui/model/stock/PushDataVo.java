package com.android.dazhihui.ui.model.stock;

public class PushDataVo
{
  private long RecordTime;
  private String from;
  private String msg;
  private String to;
  private String type;
  
  public String getFrom()
  {
    return this.from;
  }
  
  public String getMsg()
  {
    return this.msg;
  }
  
  public long getRecordTime()
  {
    return this.RecordTime;
  }
  
  public String getTo()
  {
    return this.to;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setFrom(String paramString)
  {
    this.from = paramString;
  }
  
  public void setMsg(String paramString)
  {
    this.msg = paramString;
  }
  
  public void setRecordTime(long paramLong)
  {
    this.RecordTime = paramLong;
  }
  
  public void setTo(String paramString)
  {
    this.to = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\PushDataVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */