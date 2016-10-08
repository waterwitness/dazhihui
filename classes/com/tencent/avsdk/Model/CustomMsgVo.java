package com.tencent.avsdk.Model;

public class CustomMsgVo<T>
{
  private T Frame;
  private String FrameType;
  
  public CustomMsgVo() {}
  
  public CustomMsgVo(T paramT)
  {
    this.Frame = paramT;
    this.FrameType = "req";
  }
  
  public CustomMsgVo(String paramString, T paramT)
  {
    this.Frame = paramT;
    this.FrameType = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Model\CustomMsgVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */