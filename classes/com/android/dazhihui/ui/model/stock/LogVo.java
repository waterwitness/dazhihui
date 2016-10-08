package com.android.dazhihui.ui.model.stock;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.dazhihui.g;
import com.android.dazhihui.w;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class LogVo
{
  public LogVo.Basicinfo basicinfo;
  public String content;
  public LogVo.Extendinfo extendinfo;
  public String time;
  public String type;
  
  public LogVo(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.content = paramString1;
    this.time = paramString2;
    this.type = paramString3;
    this.basicinfo = new LogVo.Basicinfo();
    this.extendinfo = new LogVo.Extendinfo();
    try
    {
      this.basicinfo.appversion = g.a().r();
      this.basicinfo.channelid = String.valueOf(g.a().y());
      this.basicinfo.deviceid = g.a().v();
      this.basicinfo.devicename = (Build.MANUFACTURER + ":" + Build.MODEL);
      this.basicinfo.phonenumber = w.a().k();
      this.basicinfo.systemversion = Build.VERSION.RELEASE;
      this.basicinfo.platformid = g.a().t();
      this.basicinfo.versionCode = String.valueOf(g.a().s());
      if (TextUtils.isEmpty(w.a().f())) {}
      for (paramString1 = "-";; paramString1 = w.a().f())
      {
        this.basicinfo.username = paramString1;
        this.extendinfo.networktype = getNetWorkType(paramContext);
        this.extendinfo.carrier = getOperators(paramContext);
        this.extendinfo.cpu = getCpuName();
        return;
      }
      return;
    }
    catch (Exception paramContext) {}
  }
  
  private String getCpuName()
  {
    try
    {
      Object localObject = new BufferedReader(new FileReader("/proc/cpuinfo")).readLine().split(":\\s+", 2);
      int i = 0;
      while (i < localObject.length) {
        i += 1;
      }
      localObject = localObject[1];
      return (String)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return "-";
  }
  
  private String getNetWorkType(Context paramContext)
  {
    return ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getTypeName();
  }
  
  public String getOperators(Context paramContext)
  {
    paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
    System.out.println(paramContext);
    if ((paramContext.startsWith("46000")) || (paramContext.startsWith("46002")) || (paramContext.startsWith("46007"))) {
      return "移动";
    }
    if ((paramContext.startsWith("46001")) || (paramContext.startsWith("46006"))) {
      return "联通";
    }
    if ((paramContext.startsWith("46003")) || (paramContext.startsWith("46005"))) {
      return "电信";
    }
    return "未知";
  }
  
  /* Error */
  public boolean getRootAhth()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore 6
    //   7: invokestatic 250	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   10: ldc -4
    //   12: invokevirtual 256	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   15: astore_1
    //   16: new 258	java/io/DataOutputStream
    //   19: dup
    //   20: aload_1
    //   21: invokevirtual 264	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   24: invokespecial 267	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   27: astore_2
    //   28: aload_2
    //   29: ldc_w 269
    //   32: invokevirtual 272	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   35: aload_2
    //   36: invokevirtual 275	java/io/DataOutputStream:flush	()V
    //   39: aload_1
    //   40: invokevirtual 278	java/lang/Process:waitFor	()I
    //   43: istore 5
    //   45: iload 5
    //   47: ifne +6 -> 53
    //   50: iconst_1
    //   51: istore 6
    //   53: aload_2
    //   54: ifnull +7 -> 61
    //   57: aload_2
    //   58: invokevirtual 281	java/io/DataOutputStream:close	()V
    //   61: aload_1
    //   62: invokevirtual 284	java/lang/Process:destroy	()V
    //   65: iload 6
    //   67: ireturn
    //   68: astore_1
    //   69: aconst_null
    //   70: astore_1
    //   71: aload_1
    //   72: ifnull +7 -> 79
    //   75: aload_1
    //   76: invokevirtual 281	java/io/DataOutputStream:close	()V
    //   79: aload_2
    //   80: invokevirtual 284	java/lang/Process:destroy	()V
    //   83: iconst_0
    //   84: ireturn
    //   85: astore_1
    //   86: iconst_0
    //   87: ireturn
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_1
    //   91: aload_3
    //   92: ifnull +7 -> 99
    //   95: aload_3
    //   96: invokevirtual 281	java/io/DataOutputStream:close	()V
    //   99: aload_1
    //   100: invokevirtual 284	java/lang/Process:destroy	()V
    //   103: aload_2
    //   104: athrow
    //   105: astore_1
    //   106: goto -3 -> 103
    //   109: astore_2
    //   110: goto -19 -> 91
    //   113: astore 4
    //   115: aload_2
    //   116: astore_3
    //   117: aload 4
    //   119: astore_2
    //   120: goto -29 -> 91
    //   123: astore_2
    //   124: aconst_null
    //   125: astore_3
    //   126: aload_1
    //   127: astore_2
    //   128: aload_3
    //   129: astore_1
    //   130: goto -59 -> 71
    //   133: astore_3
    //   134: aload_1
    //   135: astore_3
    //   136: aload_2
    //   137: astore_1
    //   138: aload_3
    //   139: astore_2
    //   140: goto -69 -> 71
    //   143: astore_1
    //   144: iload 6
    //   146: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	LogVo
    //   15	47	1	localProcess	Process
    //   68	1	1	localException1	Exception
    //   70	6	1	localObject1	Object
    //   85	1	1	localException2	Exception
    //   90	10	1	localObject2	Object
    //   105	22	1	localException3	Exception
    //   129	9	1	localObject3	Object
    //   143	1	1	localException4	Exception
    //   3	77	2	localDataOutputStream	java.io.DataOutputStream
    //   88	16	2	localObject4	Object
    //   109	7	2	localObject5	Object
    //   119	1	2	localObject6	Object
    //   123	1	2	localException5	Exception
    //   127	13	2	localObject7	Object
    //   1	128	3	localObject8	Object
    //   133	1	3	localException6	Exception
    //   135	4	3	localObject9	Object
    //   113	5	4	localObject10	Object
    //   43	3	5	i	int
    //   5	140	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   7	16	68	java/lang/Exception
    //   75	79	85	java/lang/Exception
    //   79	83	85	java/lang/Exception
    //   7	16	88	finally
    //   95	99	105	java/lang/Exception
    //   99	103	105	java/lang/Exception
    //   16	28	109	finally
    //   28	45	113	finally
    //   16	28	123	java/lang/Exception
    //   28	45	133	java/lang/Exception
    //   57	61	143	java/lang/Exception
    //   61	65	143	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LogVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */