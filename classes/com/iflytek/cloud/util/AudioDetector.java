package com.iflytek.cloud.util;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.as;
import com.iflytek.thirdparty.at;

public abstract class AudioDetector
{
  public static final int DEF_BOS = 1200;
  public static final String DEF_ENGINE_TYPE = "fixfront";
  public static final int DEF_EOS = 20000;
  public static final int DEF_RATE = 16000;
  public static final String EARLY_START = "early_start";
  public static final int MAX_BUF_LEN = 32768;
  public static final String RES_PATH = "vad_res_path";
  public static final String SUB_TIMEOUT = "sub_timeout";
  public static final String THRESHOLD = "threshold";
  public static final String TYPE_FIXFRONT = "fixfront";
  public static final String TYPE_META = "meta";
  public static final String VAD_ENGINE = "vad_engine";
  protected static AudioDetector a = null;
  protected static Object b = new Object();
  
  protected AudioDetector(Context paramContext, String paramString) {}
  
  private static AudioDetector a(Context paramContext, String paramString)
  {
    Object localObject = new aa();
    ((aa)localObject).a(paramString);
    String str = ((aa)localObject).e("lib_name");
    if ((TextUtils.isEmpty(str)) || (a(str)))
    {
      localObject = ((aa)localObject).b("vad_engine", "fixfront");
      if ("fixfront".equalsIgnoreCase((String)localObject)) {
        return new as(paramContext, paramString);
      }
      if ("meta".equalsIgnoreCase((String)localObject)) {
        return new at(paramContext, paramString);
      }
      X.b("detector factory unmatched engine type: " + (String)localObject);
      return null;
    }
    X.b("detector factory load library failed: " + str);
    return null;
  }
  
  private static boolean a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {}
    try
    {
      System.loadLibrary(paramString);
      return true;
    }
    catch (Exception paramString)
    {
      X.b("Load library failed.");
      paramString.printStackTrace();
    }
    return false;
  }
  
  public static AudioDetector createDetector(Context paramContext, String paramString)
  {
    X.a("createDetector enter, context: " + paramContext + ", param: " + paramString);
    synchronized (b)
    {
      if (a == null) {
        a = a(paramContext, paramString);
      }
      X.a("createDetector leave");
      return a;
    }
  }
  
  public static AudioDetector getDetector()
  {
    synchronized (b)
    {
      X.a("getDetector enter");
      return a;
    }
  }
  
  public abstract boolean destroy();
  
  public abstract AudioDetector.DetectorResult detect(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract void reset();
  
  public abstract void setParameter(String paramString1, String paramString2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\AudioDetector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */