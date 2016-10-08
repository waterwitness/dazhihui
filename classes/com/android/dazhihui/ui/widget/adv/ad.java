package com.android.dazhihui.ui.widget.adv;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.RTBAdvertVo;
import com.android.dazhihui.ui.model.stock.RTBAdvertVo.Adunit;
import com.android.dazhihui.ui.model.stock.RTBAdvertVo.Device;
import com.android.dazhihui.ui.model.stock.RTBAdvertVo.Geo;
import com.tencent.avsdk.Util;
import java.util.Random;
import org.apache.http.util.TextUtils;

public class ad
{
  private static int a(Context paramContext)
  {
    int i = 2;
    int j = Util.getNetWorkType(paramContext);
    if (j == 2) {
      i = 1;
    }
    while (j == 4) {
      return i;
    }
    if (j == 3) {
      return 3;
    }
    if (j == 5) {
      return 4;
    }
    return 0;
  }
  
  public static void a(Context paramContext, int paramInt, ag paramag)
  {
    RTBAdvertVo localRTBAdvertVo = new RTBAdvertVo();
    Object localObject = new Random();
    localRTBAdvertVo.id = String.valueOf(((Random)localObject).nextLong() + System.currentTimeMillis() + localObject.hashCode());
    localRTBAdvertVo.adunit = new RTBAdvertVo.Adunit();
    localRTBAdvertVo.adunit.id = String.valueOf(paramInt);
    localRTBAdvertVo.adunit.height = "480";
    localRTBAdvertVo.adunit.width = "78";
    localRTBAdvertVo.device = new RTBAdvertVo.Device();
    localRTBAdvertVo.istest = true;
    localObject = (TelephonyManager)paramContext.getSystemService("phone");
    try
    {
      if (!TextUtils.isEmpty(((TelephonyManager)localObject).getSimOperator()))
      {
        paramInt = Integer.parseInt(((TelephonyManager)localObject).getSimOperator());
        localRTBAdvertVo.device.carrier = paramInt;
        localRTBAdvertVo.device.connectiontype = a(paramContext);
        localRTBAdvertVo.device.deviceid = g.a().u();
        localRTBAdvertVo.device.os = "android";
        localRTBAdvertVo.device.osv = Build.VERSION.SDK;
        localRTBAdvertVo.device.ua = "";
        localRTBAdvertVo.device.type = 0;
        localRTBAdvertVo.geo = new RTBAdvertVo.Geo();
        localRTBAdvertVo.geo.ip = "";
        new ae(paramag).c(new RTBAdvertVo[] { localRTBAdvertVo });
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        paramInt = 0;
      }
    }
  }
  
  public static void a(String paramString)
  {
    new af().c(new String[] { paramString });
  }
  
  /* Error */
  private static String b(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 182	java/net/URL
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 184	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 188	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   13: checkcast 190	java/net/HttpURLConnection
    //   16: astore_0
    //   17: aload_0
    //   18: iconst_1
    //   19: invokevirtual 194	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   22: aload_0
    //   23: iconst_1
    //   24: invokevirtual 197	java/net/HttpURLConnection:setDoInput	(Z)V
    //   27: aload_0
    //   28: iconst_0
    //   29: invokevirtual 200	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   32: aload_0
    //   33: ldc -54
    //   35: invokevirtual 205	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: sipush 200
    //   42: invokevirtual 209	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   45: aload_0
    //   46: sipush 200
    //   49: invokevirtual 212	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   52: aload_0
    //   53: ldc -42
    //   55: new 216	java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   62: ldc -112
    //   64: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_1
    //   68: arraylength
    //   69: invokevirtual 224	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   72: invokevirtual 227	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokevirtual 231	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_0
    //   79: ldc -23
    //   81: ldc -21
    //   83: invokevirtual 231	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: aload_0
    //   87: ldc -19
    //   89: ldc -17
    //   91: invokevirtual 231	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload_0
    //   95: ldc -15
    //   97: ldc -13
    //   99: invokevirtual 231	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload_0
    //   103: invokevirtual 247	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   106: astore_2
    //   107: aload_2
    //   108: aload_1
    //   109: invokevirtual 253	java/io/OutputStream:write	([B)V
    //   112: aload_2
    //   113: invokevirtual 256	java/io/OutputStream:flush	()V
    //   116: aload_2
    //   117: invokevirtual 259	java/io/OutputStream:close	()V
    //   120: sipush 200
    //   123: aload_0
    //   124: invokevirtual 262	java/net/HttpURLConnection:getResponseCode	()I
    //   127: if_icmpne +91 -> 218
    //   130: new 264	java/lang/StringBuffer
    //   133: dup
    //   134: invokespecial 265	java/lang/StringBuffer:<init>	()V
    //   137: astore_1
    //   138: new 267	java/io/BufferedReader
    //   141: dup
    //   142: new 269	java/io/InputStreamReader
    //   145: dup
    //   146: aload_0
    //   147: invokevirtual 273	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   150: ldc_w 275
    //   153: invokespecial 278	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   156: invokespecial 281	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   159: astore_2
    //   160: aload_2
    //   161: invokevirtual 284	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   164: astore_3
    //   165: aload_3
    //   166: ifnull +33 -> 199
    //   169: aload_1
    //   170: aload_3
    //   171: invokevirtual 287	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   174: ldc_w 289
    //   177: invokevirtual 287	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   180: pop
    //   181: goto -21 -> 160
    //   184: astore_1
    //   185: aload_1
    //   186: invokevirtual 172	java/lang/Exception:printStackTrace	()V
    //   189: aload_0
    //   190: ifnull +7 -> 197
    //   193: aload_0
    //   194: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   197: aconst_null
    //   198: areturn
    //   199: aload_2
    //   200: invokevirtual 293	java/io/BufferedReader:close	()V
    //   203: aload_1
    //   204: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   207: astore_1
    //   208: aload_0
    //   209: ifnull +7 -> 216
    //   212: aload_0
    //   213: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   216: aload_1
    //   217: areturn
    //   218: aload_0
    //   219: ifnull -22 -> 197
    //   222: aload_0
    //   223: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   226: goto -29 -> 197
    //   229: astore_0
    //   230: aload_2
    //   231: astore_1
    //   232: aload_1
    //   233: ifnull +7 -> 240
    //   236: aload_1
    //   237: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   240: aload_0
    //   241: athrow
    //   242: astore_2
    //   243: aload_0
    //   244: astore_1
    //   245: aload_2
    //   246: astore_0
    //   247: goto -15 -> 232
    //   250: astore_2
    //   251: aload_0
    //   252: astore_1
    //   253: aload_2
    //   254: astore_0
    //   255: goto -23 -> 232
    //   258: astore_1
    //   259: aconst_null
    //   260: astore_0
    //   261: goto -76 -> 185
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	paramString	String
    //   0	264	1	paramArrayOfByte	byte[]
    //   1	230	2	localObject1	Object
    //   242	4	2	localObject2	Object
    //   250	4	2	localObject3	Object
    //   164	7	3	str	String
    // Exception table:
    //   from	to	target	type
    //   17	160	184	java/lang/Exception
    //   160	165	184	java/lang/Exception
    //   169	181	184	java/lang/Exception
    //   199	208	184	java/lang/Exception
    //   2	17	229	finally
    //   17	160	242	finally
    //   160	165	242	finally
    //   169	181	242	finally
    //   199	208	242	finally
    //   185	189	250	finally
    //   2	17	258	java/lang/Exception
  }
  
  /* Error */
  private static String c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 182	java/net/URL
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 184	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 188	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   13: checkcast 190	java/net/HttpURLConnection
    //   16: astore_0
    //   17: sipush 200
    //   20: aload_0
    //   21: invokevirtual 262	java/net/HttpURLConnection:getResponseCode	()I
    //   24: if_icmpne +91 -> 115
    //   27: new 264	java/lang/StringBuffer
    //   30: dup
    //   31: invokespecial 265	java/lang/StringBuffer:<init>	()V
    //   34: astore_1
    //   35: new 267	java/io/BufferedReader
    //   38: dup
    //   39: new 269	java/io/InputStreamReader
    //   42: dup
    //   43: aload_0
    //   44: invokevirtual 273	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   47: ldc_w 275
    //   50: invokespecial 278	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   53: invokespecial 281	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   56: astore_2
    //   57: aload_2
    //   58: invokevirtual 284	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   61: astore_3
    //   62: aload_3
    //   63: ifnull +33 -> 96
    //   66: aload_1
    //   67: aload_3
    //   68: invokevirtual 287	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   71: ldc_w 289
    //   74: invokevirtual 287	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   77: pop
    //   78: goto -21 -> 57
    //   81: astore_1
    //   82: aload_1
    //   83: invokevirtual 172	java/lang/Exception:printStackTrace	()V
    //   86: aload_0
    //   87: ifnull +7 -> 94
    //   90: aload_0
    //   91: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   94: aconst_null
    //   95: areturn
    //   96: aload_2
    //   97: invokevirtual 293	java/io/BufferedReader:close	()V
    //   100: aload_1
    //   101: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   104: astore_1
    //   105: aload_0
    //   106: ifnull +7 -> 113
    //   109: aload_0
    //   110: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   113: aload_1
    //   114: areturn
    //   115: aload_0
    //   116: ifnull -22 -> 94
    //   119: aload_0
    //   120: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   123: goto -29 -> 94
    //   126: astore_0
    //   127: aload_1
    //   128: ifnull +7 -> 135
    //   131: aload_1
    //   132: invokevirtual 292	java/net/HttpURLConnection:disconnect	()V
    //   135: aload_0
    //   136: athrow
    //   137: astore_2
    //   138: aload_0
    //   139: astore_1
    //   140: aload_2
    //   141: astore_0
    //   142: goto -15 -> 127
    //   145: astore_2
    //   146: aload_0
    //   147: astore_1
    //   148: aload_2
    //   149: astore_0
    //   150: goto -23 -> 127
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_0
    //   156: goto -74 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	paramString	String
    //   1	66	1	localStringBuffer	StringBuffer
    //   81	20	1	localException1	Exception
    //   104	44	1	str1	String
    //   153	1	1	localException2	Exception
    //   56	41	2	localBufferedReader	java.io.BufferedReader
    //   137	4	2	localObject1	Object
    //   145	4	2	localObject2	Object
    //   61	7	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   17	57	81	java/lang/Exception
    //   57	62	81	java/lang/Exception
    //   66	78	81	java/lang/Exception
    //   96	105	81	java/lang/Exception
    //   2	17	126	finally
    //   17	57	137	finally
    //   57	62	137	finally
    //   66	78	137	finally
    //   96	105	137	finally
    //   82	86	145	finally
    //   2	17	153	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */