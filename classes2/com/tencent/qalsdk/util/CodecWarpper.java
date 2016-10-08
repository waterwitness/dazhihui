package com.tencent.qalsdk.util;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CodecWarpper
{
  public static final int CODE_FAIL = -1;
  public static final int CODE_FAIL_DECRYPT_DATA_LEN_ERROR = -5;
  public static final int CODE_FAIL_DECRYPT_EMPTY = -4;
  public static final int CODE_FAIL_DECRYPT_ONCE = -2;
  public static final int CODE_FAIL_DECRYPT_TWICE = -3;
  public static final int CODE_FAIL_PBUNPACK = -8;
  public static final int CODE_FAIL_ZLIB_DATA_LEN_SHORT = -6;
  public static final int CODE_FAIL_ZLIB_UNCOMPRESS_ERROR = -7;
  public static final int CODE_SUCC_DECRYPT_ONCE = 1;
  public static final int CODE_SUCC_DECRYPT_TWICE = 2;
  public static final String NATIVE_LIB_NAME = "codecwrapperV2";
  private static AtomicBoolean isSoLoaded = new AtomicBoolean(false);
  public static String tag = "MSF.C.CodecWarpper";
  
  public static native byte[] encodeRequest(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, String paramString6, byte paramByte1, byte paramByte2, byte[] paramArrayOfByte2);
  
  public static native byte[] getFileStoreKey();
  
  public static native int getMaxPackageSize();
  
  public static void nateiveRemoveAccountKey(String paramString)
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d(tag, 2, "remove " + paramString + " key ");
      }
      removeAccountKey(paramString);
      return;
    }
    finally {}
  }
  
  public static synchronized native void onConnClose();
  
  public static synchronized native void removeAccountKey(String paramString);
  
  public static synchronized native void setAccountKey(String paramString1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, String paramString2);
  
  public static synchronized native void setKsid(byte[] paramArrayOfByte);
  
  public static native void setMaxPackageSize(int paramInt);
  
  public static native void setUseSimpleHead(String paramString, boolean paramBoolean);
  
  public native void init(Context paramContext, boolean paramBoolean);
  
  public abstract void onInvalidData(int paramInt1, int paramInt2);
  
  public void onInvalidDataNative(int paramInt)
  {
    onInvalidData(-5, paramInt);
  }
  
  public abstract void onInvalidSign();
  
  public native void onReceData(byte[] paramArrayOfByte);
  
  public abstract void onResponse(int paramInt1, Object paramObject, int paramInt2);
  
  public abstract void onSSOPingResponse();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\CodecWarpper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */