package com.android.thinkive.framework.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.android.thinkive.framework.network.NetWorkAgent;
import com.android.thinkive.framework.network.NetWorkState;
import java.util.ArrayList;
import java.util.List;

public class NetWorkUtil
{
  private static final String PING_COMMAND = "ping -c 1 -w 2 ";
  
  public static NetWorkAgent getNetWorkAgent(Context paramContext)
  {
    NetWorkAgent localNetWorkAgent = NetWorkAgent.UN_KNOW;
    paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSimOperator();
    if (paramContext != null)
    {
      if ((paramContext.equals("46000")) || (paramContext.equals("46002"))) {
        return NetWorkAgent.CHINA_MOBILE;
      }
      if (paramContext.equals("46001")) {
        return NetWorkAgent.CHINA_UNICOM;
      }
      if (paramContext.equals("46003")) {
        return NetWorkAgent.CHINA_TELECOM;
      }
    }
    return localNetWorkAgent;
  }
  
  public static NetWorkState getNetWorkStatus(Context paramContext)
  {
    NetWorkState localNetWorkState = NetWorkState.NET_WORK_NO;
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((paramContext != null) && (paramContext.isConnectedOrConnecting()))
    {
      switch (paramContext.getType())
      {
      default: 
        return NetWorkState.NET_WORK_UNKNOWN;
      case 1: 
        return NetWorkState.NET_WORK_WIFI;
      }
      switch (paramContext.getSubtype())
      {
      default: 
        return NetWorkState.NET_WORK_UNKNOWN;
      case 1: 
      case 2: 
      case 4: 
      case 7: 
      case 11: 
        return NetWorkState.NET_WORK_2G;
      case 3: 
      case 5: 
      case 6: 
      case 8: 
      case 9: 
      case 10: 
      case 12: 
      case 14: 
      case 15: 
        return NetWorkState.NET_WORK_3G;
      }
      return NetWorkState.NET_WORK_4G;
    }
    return localNetWorkState;
  }
  
  public static boolean isNetworkConnected(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null) {
        return paramContext.isAvailable();
      }
    }
    return false;
  }
  
  /* Error */
  public static String pingAddress(String paramString)
  {
    // Byte code:
    //   0: new 113	java/lang/StringBuilder
    //   3: dup
    //   4: ldc 115
    //   6: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   16: invokestatic 130	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   19: new 132	java/io/BufferedReader
    //   22: dup
    //   23: new 134	java/io/InputStreamReader
    //   26: dup
    //   27: invokestatic 140	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   30: new 113	java/lang/StringBuilder
    //   33: dup
    //   34: ldc -114
    //   36: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   39: aload_0
    //   40: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokevirtual 146	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   49: invokevirtual 152	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   52: invokespecial 155	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   55: invokespecial 158	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   58: astore_3
    //   59: ldc -96
    //   61: astore_1
    //   62: aload_1
    //   63: astore_0
    //   64: aload_3
    //   65: invokevirtual 163	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   68: astore_2
    //   69: aload_2
    //   70: ifnonnull +5 -> 75
    //   73: aload_1
    //   74: areturn
    //   75: aload_1
    //   76: astore_0
    //   77: new 113	java/lang/StringBuilder
    //   80: dup
    //   81: ldc -91
    //   83: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   86: aload_2
    //   87: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokestatic 130	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   96: aload_1
    //   97: astore_0
    //   98: aload_2
    //   99: ldc -89
    //   101: invokevirtual 171	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   104: ifeq -42 -> 62
    //   107: aload_1
    //   108: astore_0
    //   109: aload_2
    //   110: iconst_4
    //   111: aload_2
    //   112: invokevirtual 174	java/lang/String:length	()I
    //   115: iconst_3
    //   116: isub
    //   117: invokevirtual 178	java/lang/String:substring	(II)Ljava/lang/String;
    //   120: ldc -76
    //   122: invokevirtual 184	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   125: astore_2
    //   126: aload_2
    //   127: ifnull -65 -> 62
    //   130: aload_1
    //   131: astore_0
    //   132: aload_2
    //   133: arraylength
    //   134: ifle -72 -> 62
    //   137: aload_1
    //   138: astore_0
    //   139: aload_2
    //   140: iconst_0
    //   141: aaload
    //   142: ldc -70
    //   144: invokevirtual 184	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   147: astore 4
    //   149: aload_1
    //   150: astore_0
    //   151: aload_2
    //   152: iconst_1
    //   153: aaload
    //   154: ldc -70
    //   156: invokevirtual 184	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   159: astore 5
    //   161: iconst_0
    //   162: istore 6
    //   164: aload_1
    //   165: astore_2
    //   166: aload_2
    //   167: astore_1
    //   168: aload_2
    //   169: astore_0
    //   170: iload 6
    //   172: aload 4
    //   174: arraylength
    //   175: if_icmpge -113 -> 62
    //   178: aload_2
    //   179: astore_1
    //   180: aload 4
    //   182: iload 6
    //   184: aaload
    //   185: ifnull +41 -> 226
    //   188: aload_2
    //   189: astore_1
    //   190: aload_2
    //   191: astore_0
    //   192: aload 4
    //   194: iload 6
    //   196: aaload
    //   197: invokestatic 192	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   200: ifne +26 -> 226
    //   203: aload_2
    //   204: astore_1
    //   205: aload_2
    //   206: astore_0
    //   207: ldc -62
    //   209: aload 4
    //   211: iload 6
    //   213: aaload
    //   214: invokevirtual 43	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   217: ifeq +9 -> 226
    //   220: aload 5
    //   222: iload 6
    //   224: aaload
    //   225: astore_1
    //   226: iload 6
    //   228: iconst_1
    //   229: iadd
    //   230: istore 6
    //   232: aload_1
    //   233: astore_2
    //   234: goto -68 -> 166
    //   237: astore_1
    //   238: ldc -96
    //   240: astore_0
    //   241: aload_1
    //   242: invokevirtual 197	java/io/IOException:printStackTrace	()V
    //   245: aload_0
    //   246: areturn
    //   247: astore_1
    //   248: goto -7 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	paramString	String
    //   61	172	1	localObject1	Object
    //   237	5	1	localIOException1	java.io.IOException
    //   247	1	1	localIOException2	java.io.IOException
    //   68	166	2	localObject2	Object
    //   58	7	3	localBufferedReader	java.io.BufferedReader
    //   147	63	4	arrayOfString1	String[]
    //   159	62	5	arrayOfString2	String[]
    //   162	69	6	i	int
    // Exception table:
    //   from	to	target	type
    //   0	59	237	java/io/IOException
    //   64	69	247	java/io/IOException
    //   77	96	247	java/io/IOException
    //   98	107	247	java/io/IOException
    //   109	126	247	java/io/IOException
    //   132	137	247	java/io/IOException
    //   139	149	247	java/io/IOException
    //   151	161	247	java/io/IOException
    //   170	178	247	java/io/IOException
    //   192	203	247	java/io/IOException
    //   207	220	247	java/io/IOException
  }
  
  public static List<String> pingAddressList(ArrayList<String> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() < 1)) {
      return null;
    }
    localArrayList = new ArrayList();
    int i = 0;
    try
    {
      while (i < paramArrayList.size())
      {
        localArrayList.add(pingAddress((String)paramArrayList.get(i)));
        i += 1;
      }
      return localArrayList;
    }
    catch (Exception paramArrayList)
    {
      paramArrayList.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\NetWorkUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */