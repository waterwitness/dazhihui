package com.iflytek.msc;

import android.graphics.Bitmap;
import com.iflytek.thirdparty.X;
import java.io.FileDescriptor;

public class MSC
{
  private static boolean a = false;
  
  public static final native int DebugLog(boolean paramBoolean);
  
  public static final native int QHCRDataWrite(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2);
  
  public static final native int QHCRFini();
  
  public static final native byte[] QHCRGetResult(char[] paramArrayOfChar, byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QHCRInit(byte[] paramArrayOfByte);
  
  public static final native int QHCRLogEvent(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native char[] QHCRSessionBegin(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QHCRSessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static native byte[] QIFDFacedetect(Bitmap paramBitmap, int paramInt, Object paramObject);
  
  public static native int QIFDFini();
  
  public static native void QIFDInit(byte[] paramArrayOfByte, Object paramObject);
  
  public static native byte[] QIFDMultitracker(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Object paramObject);
  
  public static final native int QISEAudioWrite(char[] paramArrayOfChar, byte[] paramArrayOfByte, int paramInt1, int paramInt2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISEFini();
  
  public static final native int QISEGetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native byte[] QISEGetResult(char[] paramArrayOfChar, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISEInit(byte[] paramArrayOfByte);
  
  public static final native char[] QISESessionBegin(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISESessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int QISETextPut(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native int QISRAudioWrite(char[] paramArrayOfChar, byte[] paramArrayOfByte, int paramInt1, int paramInt2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISRBuildGrammar(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, String paramString, Object paramObject);
  
  public static final native int QISRFini();
  
  public static final native int QISRGetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native byte[] QISRGetResult(char[] paramArrayOfChar, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISRGrammarActivate(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native int QISRInit(byte[] paramArrayOfByte);
  
  public static final native int QISRLogEvent(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native int QISRRegisterNotify(char[] paramArrayOfChar, String paramString1, String paramString2, String paramString3, Object paramObject);
  
  public static final native char[] QISRSessionBegin(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISRSessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int QISRSetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native int QISRUpdateLexicon(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, String paramString, Object paramObject);
  
  public static final native byte[] QISRUploadData(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISVAudioWrite(char[] paramArrayOfChar1, char[] paramArrayOfChar2, byte[] paramArrayOfByte, int paramInt1, int paramInt2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISVFini();
  
  public static final native int QISVGetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native byte[] QISVGetResult(char[] paramArrayOfChar1, char[] paramArrayOfChar2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISVInit(byte[] paramArrayOfByte);
  
  public static final native char[] QISVQueDelModel(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISVQueDelModelRelease(char[] paramArrayOfChar);
  
  public static final native char[] QISVSessionBegin(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QISVSessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int QIVWAudioWrite(char[] paramArrayOfChar, byte[] paramArrayOfByte, int paramInt1, int paramInt2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QIVWGetResInfo(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QIVWRegisterNotify(char[] paramArrayOfChar, String paramString, Object paramObject);
  
  public static final native int QIVWResMerge(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
  
  public static final native char[] QIVWSessionBegin(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QIVWSessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int QMFVDataWrite(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QMFVGetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native byte[] QMFVGetResult(char[] paramArrayOfChar, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QMFVRegisterNotify(char[] paramArrayOfChar, String paramString1, String paramString2, String paramString3, Object paramObject);
  
  public static final native char[] QMFVSessionBegin(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QMFVSessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int QMFVSetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native int QMSPDownload(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, Object paramObject);
  
  public static final native byte[] QMSPDownloadData(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QMSPGetParam(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native byte[] QMSPGetVersion(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QMSPLogOut();
  
  public static final native int QMSPLogin(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
  
  public static final native int QMSPRegisterNotify(String paramString1, String paramString2);
  
  public static final native byte[] QMSPSearch(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QMSPSetParam(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native byte[] QMSPUploadData(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native byte[] QTTSAudioGet(char[] paramArrayOfChar, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native char[] QTTSAudioInfo(char[] paramArrayOfChar);
  
  public static final native int QTTSFini();
  
  public static final native int QTTSGetParam(char[] paramArrayOfChar, byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QTTSInit(byte[] paramArrayOfByte);
  
  public static final native char[] QTTSSessionBegin(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo);
  
  public static final native int QTTSSessionEnd(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int QTTSTextPut(char[] paramArrayOfChar, byte[] paramArrayOfByte);
  
  public static final native int UMSPLogin(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, Object paramObject);
  
  public static native boolean doARGB2Gray(Bitmap paramBitmap1, Bitmap paramBitmap2);
  
  public static final native int getFileDescriptorFD(FileDescriptor paramFileDescriptor);
  
  public static boolean isIflyVersion()
  {
    X.a("MSC ifly ver: true");
    return true;
  }
  
  public static boolean isLoaded()
  {
    return a;
  }
  
  public static boolean loadLibrary(String paramString)
  {
    if (a) {
      return a;
    }
    try
    {
      System.loadLibrary(paramString);
      a = true;
      X.a("loadLibrary " + paramString + " success");
      return a;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;)
      {
        X.b("loadLibrary " + paramString + " error:" + localUnsatisfiedLinkError);
        a = false;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\msc\MSC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */