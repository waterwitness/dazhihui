package com.tencent;

import com.tencent.timint.TIMIntManager;

public class TIMRelay
{
  private static TIMRelay instance = new TIMRelay();
  private static final String serviceCmd_empty = "imopen_passthrough.callback_emp";
  private static final String serviceCmd_encrypt = "imopen_passthrough.callback";
  private static final String tag = "imsdk.TIMRelay";
  
  public static TIMRelay getInstance()
  {
    return instance;
  }
  
  public void sendDataWithEncryption(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    TIMIntManager.getInstance().request("imopen_passthrough.callback", paramArrayOfByte, paramTIMValueCallBack);
  }
  
  public void sendDataWithEncryption(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    TIMIntManager.getInstance().request("imopen_passthrough.callback", paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
  
  public void sendDataWithoutEncryption(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    TIMIntManager.getInstance().request("imopen_passthrough.callback_emp", paramArrayOfByte, paramTIMValueCallBack);
  }
  
  public void sendDataWithoutEncryption(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    TIMIntManager.getInstance().request("imopen_passthrough.callback_emp", paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMRelay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */