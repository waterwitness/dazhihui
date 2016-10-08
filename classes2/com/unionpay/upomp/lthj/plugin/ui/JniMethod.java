package com.unionpay.upomp.lthj.plugin.ui;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.JNIBottomBackData;
import com.unionpay.upomp.lthj.plugin.model.JNIInitBottomData;
import com.unionpay.upomp.lthj.plugin.model.SmsCodeVerfiyData;

public class JniMethod
{
  public static JniMethod instance;
  
  public static JniMethod getJniMethod()
  {
    if (instance == null) {
      instance = new JniMethod();
    }
    return instance;
  }
  
  public native byte[] chackPanDecrypt(byte[] paramArrayOfByte, int paramInt);
  
  public native byte[] chackPanEncrypt(byte[] paramArrayOfByte, int paramInt);
  
  public native byte[] decryptConfig(byte[] paramArrayOfByte, int paramInt);
  
  public native byte[] encryptConfig(byte[] paramArrayOfByte, int paramInt);
  
  public native byte[] encryptPasswdLogin(byte[] paramArrayOfByte, int paramInt);
  
  public native byte[] encryptPinBlock(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2);
  
  public native int initResource(int paramInt, JNIInitBottomData paramJNIInitBottomData, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public native JNIBottomBackData packAndEncrypt(Data paramData, int paramInt);
  
  public native int releaseResource();
  
  public native Data unpackAndDecrypt(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public native int validateSMSCode(SmsCodeVerfiyData paramSmsCodeVerfiyData);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\JniMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */