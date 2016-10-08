package com.iflytek.thirdparty;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.iflytek.cloud.Setting;
import com.iflytek.cloud.Setting.LOG_LEVEL;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.Version;

public class ac
{
  private static String a = "xiaoyan";
  private static String b = null;
  
  public static String a()
  {
    return SpeechUtility.getUtility().getParameter("appid");
  }
  
  public static String a(Context paramContext)
  {
    Object localObject;
    if (paramContext == null) {
      localObject = "null";
    }
    do
    {
      return (String)localObject;
      aa localaa = G.a(paramContext);
      localObject = localaa.e("os.imsi") + "|" + localaa.e("os.imei");
      paramContext = (Context)localObject;
      if (((String)localObject).length() < 10) {
        paramContext = localaa.e("net.mac");
      }
      if (TextUtils.isEmpty(paramContext)) {
        break;
      }
      localObject = paramContext;
    } while (paramContext.length() > 0);
    return null;
  }
  
  public static String a(Context paramContext, v paramv)
  {
    if (paramContext == null) {
      throw new SpeechError(20012);
    }
    paramv = paramv.v().b();
    b = paramv.b("net_type", b);
    a(paramContext, paramv);
    paramv.a("timeout", "20000", false);
    paramv.a("auth", "1", false);
    paramv.a("msc.ver", Version.getVersion());
    paramv.a("mac", G.a(paramContext).e("net.mac"), false);
    paramv.a("dvc", a(paramContext), false);
    paramv.a("unique_id", S.a(paramContext));
    paramv.a("msc.lat", "" + H.a(paramContext).b("msc.lat"), false);
    paramv.a("msc.lng", "" + H.a(paramContext).b("msc.lng"), false);
    paramv.a(G.b(paramContext));
    a(paramv);
    b(paramContext, paramv);
    paramv.a(ab.c);
    return paramv.toString();
  }
  
  public static String a(Context paramContext, String paramString, v paramv)
  {
    aa localaa = paramv.v().b();
    localaa.c("cloud_grammar");
    a(paramContext, localaa);
    b(paramContext, localaa);
    localaa.a("language", "zh_cn", false);
    localaa.a("result_type", "json", false);
    localaa.a("rse", paramv.r(), false);
    localaa.a("text_encoding", paramv.q(), false);
    localaa.a("ssm", "1", false);
    localaa.a("msc.skin", "0", false);
    if (TextUtils.isEmpty(paramString))
    {
      localaa.a("subject", "iat", false);
      int i = paramv.s();
      localaa.a("auf=audio/L16;rate", Integer.toString(i), false);
      if (i != 16000) {
        break label183;
      }
      localaa.a("aue", "speex-wb", false);
      label134:
      if (!paramv.m()) {
        break label195;
      }
      localaa.a("vad_bos", "5000", false);
      localaa.a("vad_eos", "1800", false);
    }
    for (;;)
    {
      localaa.a(ab.c);
      return localaa.toString();
      localaa.a("subject", "asr", false);
      break;
      label183:
      localaa.a("aue", "speex", false);
      break label134;
      label195:
      localaa.a("vad_bos", "4000", false);
      localaa.a("vad_eos", "700", false);
    }
  }
  
  public static void a(Context paramContext, aa paramaa)
  {
    if ((TextUtils.isEmpty(paramaa.e("net_type"))) && (!TextUtils.isEmpty(b)))
    {
      paramaa.a("net_type", b, false);
      return;
    }
    if (paramContext == null)
    {
      paramaa.a("net_type", "none", false);
      return;
    }
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext == null)
    {
      paramaa.a("net_type", "none", false);
      return;
    }
    paramaa.a("net_type", Q.a(paramContext), false);
    paramaa.a("net_subtype", aa.f(Q.b(paramContext)), false);
  }
  
  private static void a(aa paramaa)
  {
    if ((paramaa == null) || (Setting.getLogLevel() == Setting.LOG_LEVEL.none)) {
      return;
    }
    String str2 = Setting.getLogPath();
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = "/sdcard/msc/msc.log";
    }
    int i = -1;
    if (Setting.getLogLevel() == Setting.LOG_LEVEL.detail) {
      i = 31;
    }
    for (;;)
    {
      M.b(str1);
      paramaa.a("log", str1);
      paramaa.a("lvl", "" + i);
      paramaa.a("output", "1", false);
      return;
      if (Setting.getLogLevel() == Setting.LOG_LEVEL.normal) {
        i = 15;
      } else if (Setting.getLogLevel() == Setting.LOG_LEVEL.low) {
        i = 7;
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while ((!paramString.contains("sms")) && (!paramString.contains("iat"))) {
      return false;
    }
    return true;
  }
  
  public static String b(Context paramContext, v paramv)
  {
    aa localaa = paramv.v().b();
    a(paramContext, localaa);
    b(paramContext, localaa);
    localaa.a("result_type", "json");
    localaa.a("rse", paramv.r());
    localaa.a("text_encoding", paramv.q());
    localaa.a("ssm", "1", false);
    localaa.a("subject", "ivp", false);
    int i = paramv.s();
    localaa.a("auf=audio/L16;rate", Integer.toString(i), false);
    if (i == 16000) {
      localaa.a("aue", "speex-wb;10", false);
    }
    for (;;)
    {
      localaa.a("vad_bos", "3000", false);
      localaa.a("vad_eos", "700", false);
      localaa.a(ab.c);
      return localaa.toString();
      localaa.a("aue", "speex", false);
    }
  }
  
  public static String b(Context paramContext, String paramString, v paramv)
  {
    if (paramString.equals("oneshot")) {
      return a(paramContext, paramv.v().e("cloud_grammar"), paramv);
    }
    paramString = paramv.v().b();
    int i = paramString.a("ivw_net_mode", 0);
    if (i == 0) {
      paramString.a("ivw_net_mode", "0", true);
    }
    for (;;)
    {
      paramString.a(ab.c);
      return paramString.toString();
      if ((2 == i) || (1 == i)) {
        paramString.a("ivw_net_mode", "1", true);
      } else if (Q.a(paramContext)) {
        paramString.a("ivw_net_mode", "1", true);
      } else {
        paramString.a("ivw_net_mode", "0", true);
      }
    }
  }
  
  public static void b(Context paramContext, aa paramaa)
  {
    int j = 0;
    long l = SystemClock.elapsedRealtime();
    if (paramContext == null) {}
    while (!H.b(paramContext)) {
      return;
    }
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        k = paramContext.getPhoneType();
        String str = paramContext.getNetworkOperator();
        m = Integer.parseInt(str.substring(0, 3));
        n = Integer.parseInt(str.substring(3));
        switch (k)
        {
        }
      }
      catch (Exception paramContext)
      {
        int k;
        int m;
        int n;
        X.a("get mmlc failed");
        continue;
        int i = 0;
        continue;
      }
      paramaa.a("mmlc", m + "|" + n + "|" + i + "|" + j);
      X.c("MCC = " + m + "\t MNC = " + n + "\t phoneType = " + k + "\t LAC = " + i + "\t CID = " + j);
      X.c("get mmlc time cost:" + (SystemClock.elapsedRealtime() - l));
      return;
      paramContext = (CdmaCellLocation)paramContext.getCellLocation();
      j = paramContext.getBaseStationId();
      i = paramContext.getNetworkId();
      continue;
      paramContext = (GsmCellLocation)paramContext.getCellLocation();
      j = paramContext.getCid();
      i = paramContext.getLac();
    }
  }
  
  private static void b(aa paramaa)
  {
    String str = SpeechUtility.getUtility().getParameter("ver_tts");
    int i;
    if (!paramaa.g("speed_increase"))
    {
      i = paramaa.a("speed", 50);
      if (i > 100) {
        break label72;
      }
      paramaa.a("speed", "" + i);
      paramaa.a("speed_increase", "1");
    }
    label72:
    do
    {
      return;
      if ((100 < i) && (i <= 150) && ((TextUtils.isEmpty(str)) || (str.contains("5.5."))))
      {
        paramaa.a("speed", "" + (i - 50));
        paramaa.a("speed_increase", "2");
        return;
      }
    } while ((100 >= i) || (i > 200));
    paramaa.a("speed", "" + (i - 100));
    paramaa.a("speed_increase", "4");
  }
  
  public static String c(Context paramContext, aa paramaa)
  {
    paramaa = paramaa.b();
    paramaa.a("appid", SpeechUtility.getUtility().getParameter("appid"));
    paramaa.a(G.b(paramContext));
    paramaa.a("dvc", a(paramContext), false);
    paramaa.a("aue", "raw", false);
    paramaa.a(ab.c);
    return paramaa.toString();
  }
  
  public static String c(Context paramContext, v paramv)
  {
    aa localaa = paramv.v().b();
    a(paramContext, localaa);
    b(paramContext, localaa);
    localaa.a("ssm", "1", false);
    localaa.a("result_type", "json", false);
    localaa.a("rse", paramv.r(), false);
    localaa.a("text_encoding", paramv.q(), false);
    localaa.a(ab.c);
    return localaa.toString();
  }
  
  public static String c(Context paramContext, String paramString, v paramv)
  {
    paramString = paramv.v().b();
    a(paramContext, paramString);
    b(paramContext, paramString);
    paramString.a("sub", "mfv", false);
    paramString.a("prot_ver", "50", false);
    paramString.a("mver", "2.0", false);
    paramString.a("server_url", "http://imfv.openspeech.cn/msp.do", false);
    if ("verify".equals(paramString.e("sst"))) {
      paramString.a("scene_mode", "vfy", false);
    }
    for (;;)
    {
      paramString.a(ab.c);
      return paramString.toString();
      paramString.a("scene_mode", "gen", false);
    }
  }
  
  public static String d(Context paramContext, aa paramaa)
  {
    paramaa = paramaa.b();
    paramaa.a("appid", SpeechUtility.getUtility().getParameter("appid"));
    paramaa.a(G.b(paramContext));
    paramaa.a("dvc", a(paramContext), false);
    paramaa.a(ab.c);
    return paramaa.toString();
  }
  
  public static String d(Context paramContext, v paramv)
  {
    aa localaa = paramv.v().b();
    a(paramContext, localaa);
    b(paramContext, localaa);
    localaa.a("ssm", "1", false);
    int i = paramv.s();
    localaa.a("auf=audio/L16;rate", Integer.toString(i));
    if (i == 16000) {
      localaa.a("aue", "speex-wb", false);
    }
    for (;;)
    {
      localaa.a("voice_name", localaa.b("voice_name", a), true);
      localaa.a("text_encoding", paramv.q(), false);
      b(localaa);
      localaa.a(ab.c);
      return localaa.toString();
      localaa.a("aue", "speex", false);
    }
  }
  
  public static String e(Context paramContext, v paramv)
  {
    aa localaa = paramv.v().b();
    a(paramContext, localaa);
    b(paramContext, localaa);
    localaa.a("ssm", "1", false);
    int i = paramv.s();
    localaa.a("auf=audio/L16;rate", Integer.toString(i), false);
    if (i == 16000) {
      localaa.a("aue", "speex-wb", false);
    }
    for (;;)
    {
      localaa.a("text_encoding", paramv.q(), false);
      localaa.a("plev", "1", false);
      localaa.a("accent", "mandarin", false);
      localaa.a("domain", "ise", false);
      localaa.a("subject", "ise", false);
      localaa.a("result_type", "xml", false);
      localaa.a("vad_bos", "5000", false);
      localaa.a("vad_eos", "1800", false);
      localaa.a("vad_speech_timeout", "2147483647", false);
      localaa.a(ab.c);
      return localaa.toString();
      localaa.a("aue", "speex", false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */