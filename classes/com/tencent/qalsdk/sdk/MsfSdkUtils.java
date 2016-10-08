package com.tencent.qalsdk.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.util.QLog;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MsfSdkUtils
{
  private static final AtomicInteger seqFactory = new AtomicInteger(new Random().nextInt(100000));
  private static final String tag = "MsfSdkUtils";
  public static final SimpleDateFormat timeFormatter = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
  
  public static void addFromMsgProcessName(String paramString, FromServiceMsg paramFromServiceMsg)
  {
    if (paramFromServiceMsg == null) {
      return;
    }
    paramFromServiceMsg.getAttributes().put("to_SenderProcessName", paramString);
  }
  
  public static void addToMsgProcessName(String paramString, ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return;
    }
    paramToServiceMsg.getAttributes().put("to_SenderProcessName", paramString);
  }
  
  public static FromServiceMsg constructResponse(ToServiceMsg paramToServiceMsg, int paramInt, String paramString, Object paramObject)
  {
    if (paramToServiceMsg == null) {
      return new FromServiceMsg();
    }
    paramString = constructResponse(paramToServiceMsg.getUin(), paramToServiceMsg.getServiceCmd(), paramToServiceMsg.getAppId(), paramInt, paramString, paramObject, paramToServiceMsg.getRequestSsoSeq());
    paramString.setAppSeq(paramToServiceMsg.getAppSeq());
    return paramString;
  }
  
  public static FromServiceMsg constructResponse(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, Object paramObject, int paramInt3)
  {
    paramString1 = new FromServiceMsg(paramString1, paramString2);
    paramString1.setAppId(paramInt1);
    if (paramInt2 != 1000) {
      paramString1.setBusinessFail(paramInt2, paramString3);
    }
    for (;;)
    {
      if (paramObject != null) {
        paramString1.addAttribute(paramString2, paramObject);
      }
      paramString1.setRequestSsoSeq(paramInt3);
      return paramString1;
      paramString1.setMsgSuccess();
    }
  }
  
  public static int convertBytes2Int(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] << 24 & 0xFF000000 | paramArrayOfByte[1] << 16 & 0xFF0000 | paramArrayOfByte[2] << 8 & 0xFF00 | paramArrayOfByte[3] << 0 & 0xFF;
  }
  
  public static int convertBytes2Int(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 0)] << 24 & 0xFF000000 | paramArrayOfByte[(paramInt + 1)] << 16 & 0xFF0000 | paramArrayOfByte[(paramInt + 2)] << 8 & 0xFF00 | paramArrayOfByte[(paramInt + 3)] << 0 & 0xFF;
  }
  
  public static byte[] convertInt2Bytes(int paramInt)
  {
    return new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) };
  }
  
  public static int getNextAppSeq()
  {
    try
    {
      int j = seqFactory.incrementAndGet();
      if (j > 1000000) {
        seqFactory.set(new Random().nextInt(100000));
      }
      int i = j;
      if (j == 50000) {
        i = j + 10000;
      }
      return i;
    }
    finally {}
  }
  
  /* Error */
  public static String getProcessName(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +6 -> 7
    //   4: ldc -124
    //   6: areturn
    //   7: aload_0
    //   8: ldc -122
    //   10: invokevirtual 140	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   13: checkcast 142	android/app/ActivityManager
    //   16: invokevirtual 146	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   19: astore_0
    //   20: aload_0
    //   21: invokeinterface 152 1 0
    //   26: astore_1
    //   27: aload_1
    //   28: invokeinterface 158 1 0
    //   33: ifeq +62 -> 95
    //   36: aload_1
    //   37: invokeinterface 162 1 0
    //   42: checkcast 164	android/app/ActivityManager$RunningAppProcessInfo
    //   45: astore_2
    //   46: aload_2
    //   47: ifnull -20 -> 27
    //   50: aload_2
    //   51: getfield 168	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   54: invokestatic 173	android/os/Process:myPid	()I
    //   57: if_icmpne -30 -> 27
    //   60: aload_2
    //   61: getfield 176	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   64: astore_1
    //   65: aload_1
    //   66: areturn
    //   67: astore_0
    //   68: aconst_null
    //   69: astore_0
    //   70: ldc 10
    //   72: iconst_1
    //   73: new 178	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 179	java/lang/StringBuilder:<init>	()V
    //   80: ldc -75
    //   82: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_0
    //   86: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 197	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   95: ldc -124
    //   97: areturn
    //   98: astore_1
    //   99: goto -29 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	paramContext	Context
    //   26	40	1	localObject	Object
    //   98	1	1	localException	Exception
    //   45	16	2	localRunningAppProcessInfo	ActivityManager.RunningAppProcessInfo
    // Exception table:
    //   from	to	target	type
    //   7	20	67	java/lang/Exception
    //   20	27	98	java/lang/Exception
    //   27	46	98	java/lang/Exception
    //   50	65	98	java/lang/Exception
  }
  
  public static String getShortUin(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramString.length() < 4)) {
      return paramString;
    }
    return "*" + paramString.substring(paramString.length() - 4, paramString.length());
  }
  
  public static String insertMtype(String paramString1, String paramString2)
  {
    if (paramString2.contains("mType=")) {}
    do
    {
      do
      {
        return paramString2;
      } while (paramString1 == null);
      int i = paramString2.indexOf("?");
      if (i > 0)
      {
        if (paramString2.length() == i + 1) {
          return paramString2.substring(0, i + 1) + "mType=" + paramString1;
        }
        i = paramString2.indexOf("#", i);
        if (i > -1) {}
        for (paramString1 = paramString2.substring(0, i) + "&mType=" + paramString1 + paramString2.substring(i);; paramString1 = paramString2 + "&mType=" + paramString1) {
          return paramString1;
        }
      }
    } while (paramString2.length() <= 0);
    return paramString2 + "?mType=" + paramString1;
  }
  
  public static boolean isMainProcess(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    paramContext = paramContext.getPackageName();
    int i = Process.myPid();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((localRunningAppProcessInfo.pid == i) && (paramContext.equals(localRunningAppProcessInfo.processName))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean isScreenOn(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    try
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      boolean bool = ((Boolean)paramContext.getClass().getMethod("isScreenOn", new Class[0]).invoke(paramContext, (Object[])null)).booleanValue();
      return bool;
    }
    catch (Exception paramContext)
    {
      QLog.d("MsfSdkUtils", 1, "e = " + paramContext.toString());
    }
    return true;
  }
  
  public static boolean isTopActivity(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    try
    {
      String str = paramContext.getPackageName();
      boolean bool = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getPackageName().equals(str);
      return bool;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean killProcess(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {
      return false;
    }
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if (localRunningAppProcessInfo.processName.equals(paramString))
      {
        Process.killProcess(localRunningAppProcessInfo.pid);
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  public static java.util.Properties loadConfig(String paramString)
  {
    // Byte code:
    //   0: new 311	java/util/Properties
    //   3: dup
    //   4: invokespecial 312	java/util/Properties:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: ifnonnull +5 -> 14
    //   12: aload_2
    //   13: areturn
    //   14: new 314	java/io/FileInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 315	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   22: astore_1
    //   23: aload_2
    //   24: aload_1
    //   25: invokevirtual 319	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   28: aload_1
    //   29: ifnull -17 -> 12
    //   32: aload_1
    //   33: invokevirtual 322	java/io/FileInputStream:close	()V
    //   36: aload_2
    //   37: areturn
    //   38: astore_0
    //   39: aconst_null
    //   40: astore_1
    //   41: aload_1
    //   42: ifnull +7 -> 49
    //   45: aload_1
    //   46: invokevirtual 322	java/io/FileInputStream:close	()V
    //   49: aload_0
    //   50: athrow
    //   51: astore_0
    //   52: goto -11 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramString	String
    //   22	24	1	localFileInputStream	java.io.FileInputStream
    //   7	30	2	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   14	23	38	finally
    //   23	28	51	finally
  }
  
  /* Error */
  public static void saveConfig(String paramString, java.util.Properties paramProperties)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: aload_1
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: new 326	java/io/FileOutputStream
    //   12: dup
    //   13: aload_0
    //   14: iconst_0
    //   15: invokespecial 329	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   18: astore_2
    //   19: aload_1
    //   20: aload_2
    //   21: ldc_w 331
    //   24: invokevirtual 335	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   27: aload_2
    //   28: ifnull -20 -> 8
    //   31: aload_2
    //   32: invokevirtual 336	java/io/FileOutputStream:close	()V
    //   35: return
    //   36: astore_0
    //   37: aconst_null
    //   38: astore_1
    //   39: aload_1
    //   40: ifnull +7 -> 47
    //   43: aload_1
    //   44: invokevirtual 336	java/io/FileOutputStream:close	()V
    //   47: aload_0
    //   48: athrow
    //   49: astore_0
    //   50: aload_2
    //   51: astore_1
    //   52: goto -13 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramString	String
    //   0	55	1	paramProperties	java.util.Properties
    //   18	33	2	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   9	19	36	finally
    //   19	27	49	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\sdk\MsfSdkUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */