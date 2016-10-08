package com.tencent.qalsdk.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.support.v4.content.a;
import android.telephony.TelephonyManager;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.util.MD5;
import com.tencent.qalsdk.util.QLog;
import java.util.Arrays;

public class d
{
  static int a = 0;
  static int b = 0;
  static int c = 0;
  static int d = 0;
  static byte[] e = new byte[0];
  public static Context f = null;
  private static final String g = "imsdk.GuidUtil";
  
  public static byte a(byte paramByte)
  {
    if ((paramByte >= 48) && (paramByte <= 57)) {
      return (byte)(paramByte - 48);
    }
    if ((paramByte >= 97) && (paramByte <= 102)) {
      return (byte)(paramByte - 97 + 10);
    }
    if ((paramByte >= 65) && (paramByte <= 70)) {
      return (byte)(paramByte - 65 + 10);
    }
    return 0;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    Object localObject;
    if (paramArrayOfByte == null)
    {
      localObject = "";
      return (String)localObject;
    }
    String str = "";
    int i = 0;
    for (;;)
    {
      localObject = str;
      if (i >= paramArrayOfByte.length) {
        break;
      }
      str = str + Integer.toHexString(paramArrayOfByte[i] >> 4 & 0xF);
      str = str + Integer.toHexString(paramArrayOfByte[i] & 0xF);
      i += 1;
    }
  }
  
  public static void a(Context paramContext)
  {
    f = paramContext;
    byte[] arrayOfByte2 = d(paramContext);
    byte[] arrayOfByte1 = b(paramContext);
    if ((arrayOfByte2 != null) && (arrayOfByte2.length > 0))
    {
      if (arrayOfByte1 != null)
      {
        paramContext = arrayOfByte1;
        if (arrayOfByte1.length > 0) {}
      }
      else
      {
        paramContext = new String("%4;7t>;28<fc.5*6").getBytes();
      }
      if (Arrays.equals(paramContext, arrayOfByte2)) {}
      for (c = 0;; c = 1)
      {
        b = 1;
        a = 0;
        d = 1;
        paramContext = arrayOfByte2;
        e = (byte[])paramContext.clone();
        return;
      }
    }
    if ((arrayOfByte1 != null) && (arrayOfByte1.length > 0)) {
      b = 1;
    }
    for (d = 17;; d = 20)
    {
      b(paramContext, arrayOfByte1);
      c = 0;
      a = 1;
      paramContext = arrayOfByte1;
      break;
      arrayOfByte1 = new String("%4;7t>;28<fc.5*6").getBytes();
      b = 0;
    }
  }
  
  public static void a(Context paramContext, byte[] paramArrayOfByte)
  {
    if ((paramContext != null) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
      paramContext.putString("imei", a(paramArrayOfByte));
      paramContext.commit();
    }
  }
  
  public static byte[] a()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (e != null)
    {
      localObject1 = localObject2;
      if (e.length > 0)
      {
        localObject1 = new byte[e.length];
        System.arraycopy(e, 0, localObject1, 0, e.length);
      }
    }
    return (byte[])localObject1;
  }
  
  public static byte[] a(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return new byte[0];
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    while (i < paramString.length() / 2)
    {
      arrayOfByte[i] = ((byte)((a((byte)paramString.charAt(i * 2)) << 4) + a((byte)paramString.charAt(i * 2 + 1))));
      i += 1;
    }
    return arrayOfByte;
  }
  
  /* Error */
  public static void b(Context paramContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +172 -> 173
    //   4: aload_1
    //   5: ifnull +168 -> 173
    //   8: aload_1
    //   9: arraylength
    //   10: ifle +163 -> 173
    //   13: aconst_null
    //   14: astore 6
    //   16: aconst_null
    //   17: astore 7
    //   19: aconst_null
    //   20: astore 5
    //   22: aload 6
    //   24: astore 4
    //   26: aload 7
    //   28: astore_2
    //   29: new 139	java/io/File
    //   32: dup
    //   33: new 42	java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   40: aload_0
    //   41: invokevirtual 143	android/content/Context:getFilesDir	()Ljava/io/File;
    //   44: invokevirtual 146	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   47: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc -108
    //   52: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: ldc -106
    //   57: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokespecial 151	java/io/File:<init>	(Ljava/lang/String;)V
    //   66: astore 8
    //   68: aload 6
    //   70: astore 4
    //   72: aload 7
    //   74: astore_2
    //   75: aload 8
    //   77: invokevirtual 154	java/io/File:exists	()Z
    //   80: ifne +16 -> 96
    //   83: aload 6
    //   85: astore 4
    //   87: aload 7
    //   89: astore_2
    //   90: aload 8
    //   92: invokevirtual 157	java/io/File:createNewFile	()Z
    //   95: pop
    //   96: aload 5
    //   98: astore_3
    //   99: aload 6
    //   101: astore 4
    //   103: aload 7
    //   105: astore_2
    //   106: aload 8
    //   108: invokevirtual 154	java/io/File:exists	()Z
    //   111: ifeq +44 -> 155
    //   114: aload 5
    //   116: astore_3
    //   117: aload 6
    //   119: astore 4
    //   121: aload 7
    //   123: astore_2
    //   124: aload 8
    //   126: invokevirtual 160	java/io/File:canWrite	()Z
    //   129: ifeq +26 -> 155
    //   132: aload 6
    //   134: astore 4
    //   136: aload 7
    //   138: astore_2
    //   139: new 162	java/io/FileOutputStream
    //   142: dup
    //   143: aload 8
    //   145: iconst_0
    //   146: invokespecial 165	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   149: astore_3
    //   150: aload_3
    //   151: aload_1
    //   152: invokevirtual 169	java/io/FileOutputStream:write	([B)V
    //   155: aload_3
    //   156: astore 4
    //   158: aload_3
    //   159: astore_2
    //   160: aload_0
    //   161: aload_1
    //   162: invokestatic 171	com/tencent/qalsdk/core/d:a	(Landroid/content/Context;[B)V
    //   165: aload_3
    //   166: ifnull +7 -> 173
    //   169: aload_3
    //   170: invokevirtual 174	java/io/FileOutputStream:close	()V
    //   173: return
    //   174: astore_0
    //   175: ldc 18
    //   177: iconst_1
    //   178: new 42	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   185: ldc -80
    //   187: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: aload_0
    //   191: invokevirtual 177	java/io/IOException:toString	()Ljava/lang/String;
    //   194: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   203: return
    //   204: astore_0
    //   205: aload 4
    //   207: astore_2
    //   208: ldc 18
    //   210: iconst_1
    //   211: new 42	java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   218: ldc -80
    //   220: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_0
    //   224: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   227: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   236: aload 4
    //   238: ifnull -65 -> 173
    //   241: aload 4
    //   243: invokevirtual 174	java/io/FileOutputStream:close	()V
    //   246: return
    //   247: astore_0
    //   248: ldc 18
    //   250: iconst_1
    //   251: new 42	java/lang/StringBuilder
    //   254: dup
    //   255: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   258: ldc -80
    //   260: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_0
    //   264: invokevirtual 177	java/io/IOException:toString	()Ljava/lang/String;
    //   267: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   276: return
    //   277: astore_0
    //   278: aload_2
    //   279: ifnull +7 -> 286
    //   282: aload_2
    //   283: invokevirtual 174	java/io/FileOutputStream:close	()V
    //   286: aload_0
    //   287: athrow
    //   288: astore_1
    //   289: ldc 18
    //   291: iconst_1
    //   292: new 42	java/lang/StringBuilder
    //   295: dup
    //   296: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   299: ldc -80
    //   301: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: aload_1
    //   305: invokevirtual 177	java/io/IOException:toString	()Ljava/lang/String;
    //   308: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   314: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   317: goto -31 -> 286
    //   320: astore_0
    //   321: aload_3
    //   322: astore_2
    //   323: goto -45 -> 278
    //   326: astore_0
    //   327: aload_3
    //   328: astore 4
    //   330: goto -125 -> 205
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	paramContext	Context
    //   0	333	1	paramArrayOfByte	byte[]
    //   28	295	2	localObject1	Object
    //   98	230	3	localObject2	Object
    //   24	305	4	localObject3	Object
    //   20	95	5	localObject4	Object
    //   14	119	6	localObject5	Object
    //   17	120	7	localObject6	Object
    //   66	78	8	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   169	173	174	java/io/IOException
    //   29	68	204	java/lang/Exception
    //   75	83	204	java/lang/Exception
    //   90	96	204	java/lang/Exception
    //   106	114	204	java/lang/Exception
    //   124	132	204	java/lang/Exception
    //   139	150	204	java/lang/Exception
    //   160	165	204	java/lang/Exception
    //   241	246	247	java/io/IOException
    //   29	68	277	finally
    //   75	83	277	finally
    //   90	96	277	finally
    //   106	114	277	finally
    //   124	132	277	finally
    //   139	150	277	finally
    //   160	165	277	finally
    //   208	236	277	finally
    //   282	286	288	java/io/IOException
    //   150	155	320	finally
    //   150	155	326	java/lang/Exception
  }
  
  public static byte[] b(Context paramContext)
  {
    Object localObject3 = null;
    for (;;)
    {
      try
      {
        if ((Build.VERSION.SDK_INT < 23) || (a.a(QalService.context, "android.permission.READ_PHONE_STATE") == 0))
        {
          localObject1 = (TelephonyManager)paramContext.getSystemService("phone");
          if (localObject1 != null)
          {
            localObject1 = ((TelephonyManager)localObject1).getDeviceId();
            paramContext = (WifiManager)paramContext.getSystemService("wifi");
            Object localObject2 = localObject3;
            if (paramContext != null)
            {
              paramContext = paramContext.getConnectionInfo();
              localObject2 = localObject3;
              if (paramContext != null) {
                localObject2 = paramContext.getMacAddress();
              }
            }
            paramContext = "";
            if (localObject1 != null) {
              paramContext = "" + (String)localObject1;
            }
            localObject1 = paramContext;
            if (localObject2 != null) {
              localObject1 = paramContext + (String)localObject2;
            }
            if (((String)localObject1).length() <= 0) {
              return new byte[0];
            }
            paramContext = MD5.toMD5Byte(((String)localObject1).getBytes());
            return paramContext;
          }
        }
      }
      catch (Throwable paramContext)
      {
        return new byte[0];
      }
      Object localObject1 = null;
    }
  }
  
  public static byte[] c(Context paramContext)
  {
    try
    {
      paramContext = a(paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("imei", new String("")));
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      QLog.e("imsdk.GuidUtil", 1, "exception: " + paramContext.toString());
    }
    return new byte[0];
  }
  
  /* Error */
  public static byte[] d(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ifnonnull +5 -> 8
    //   6: aload_2
    //   7: areturn
    //   8: iconst_0
    //   9: newarray <illegal type>
    //   11: astore_2
    //   12: new 139	java/io/File
    //   15: dup
    //   16: new 42	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   23: aload_0
    //   24: invokevirtual 143	android/content/Context:getFilesDir	()Ljava/io/File;
    //   27: invokevirtual 146	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   30: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc -108
    //   35: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc -106
    //   40: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokespecial 151	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +294 -> 345
    //   54: aload_1
    //   55: invokevirtual 154	java/io/File:exists	()Z
    //   58: ifeq +287 -> 345
    //   61: new 241	java/io/FileInputStream
    //   64: dup
    //   65: aload_1
    //   66: invokespecial 244	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   69: astore 4
    //   71: aload 4
    //   73: astore_3
    //   74: aload_2
    //   75: astore_1
    //   76: aload 4
    //   78: invokevirtual 247	java/io/FileInputStream:available	()I
    //   81: istore 5
    //   83: aload 4
    //   85: astore_3
    //   86: aload_2
    //   87: astore_1
    //   88: iload 5
    //   90: sipush 1024
    //   93: if_icmpge +30 -> 123
    //   96: aload 4
    //   98: astore_3
    //   99: aload_2
    //   100: astore_1
    //   101: iload 5
    //   103: newarray <illegal type>
    //   105: astore_2
    //   106: aload 4
    //   108: astore_3
    //   109: aload_2
    //   110: astore_1
    //   111: aload 4
    //   113: aload_2
    //   114: invokevirtual 251	java/io/FileInputStream:read	([B)I
    //   117: pop
    //   118: aload_2
    //   119: astore_1
    //   120: aload 4
    //   122: astore_3
    //   123: aload_1
    //   124: astore_2
    //   125: aload_3
    //   126: ifnull +214 -> 340
    //   129: aload_3
    //   130: invokevirtual 252	java/io/FileInputStream:close	()V
    //   133: aload_1
    //   134: ifnull +10 -> 144
    //   137: aload_1
    //   138: astore_2
    //   139: aload_1
    //   140: arraylength
    //   141: ifgt -135 -> 6
    //   144: aload_0
    //   145: invokestatic 254	com/tencent/qalsdk/core/d:c	(Landroid/content/Context;)[B
    //   148: astore_1
    //   149: aload_1
    //   150: astore_2
    //   151: aload_1
    //   152: ifnull -146 -> 6
    //   155: aload_1
    //   156: astore_2
    //   157: aload_1
    //   158: arraylength
    //   159: ifle -153 -> 6
    //   162: aload_0
    //   163: aload_1
    //   164: invokestatic 88	com/tencent/qalsdk/core/d:b	(Landroid/content/Context;[B)V
    //   167: aload_1
    //   168: areturn
    //   169: astore_2
    //   170: ldc 18
    //   172: iconst_1
    //   173: new 42	java/lang/StringBuilder
    //   176: dup
    //   177: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   180: ldc -80
    //   182: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: aload_2
    //   186: invokevirtual 177	java/io/IOException:toString	()Ljava/lang/String;
    //   189: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   198: goto -65 -> 133
    //   201: astore_3
    //   202: aconst_null
    //   203: astore 4
    //   205: aload_2
    //   206: astore_1
    //   207: aload_3
    //   208: astore_2
    //   209: aload 4
    //   211: astore_3
    //   212: ldc 18
    //   214: iconst_1
    //   215: new 42	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   222: ldc -80
    //   224: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: aload_2
    //   228: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   231: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   240: aload_1
    //   241: astore_2
    //   242: aload 4
    //   244: ifnull +96 -> 340
    //   247: aload 4
    //   249: invokevirtual 252	java/io/FileInputStream:close	()V
    //   252: goto -119 -> 133
    //   255: astore_2
    //   256: ldc 18
    //   258: iconst_1
    //   259: new 42	java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   266: ldc -80
    //   268: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload_2
    //   272: invokevirtual 177	java/io/IOException:toString	()Ljava/lang/String;
    //   275: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   281: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   284: goto -151 -> 133
    //   287: astore_0
    //   288: aconst_null
    //   289: astore_3
    //   290: aload_3
    //   291: ifnull +7 -> 298
    //   294: aload_3
    //   295: invokevirtual 252	java/io/FileInputStream:close	()V
    //   298: aload_0
    //   299: athrow
    //   300: astore_1
    //   301: ldc 18
    //   303: iconst_1
    //   304: new 42	java/lang/StringBuilder
    //   307: dup
    //   308: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   311: ldc -80
    //   313: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: aload_1
    //   317: invokevirtual 177	java/io/IOException:toString	()Ljava/lang/String;
    //   320: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: invokestatic 182	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   329: goto -31 -> 298
    //   332: astore_0
    //   333: goto -43 -> 290
    //   336: astore_2
    //   337: goto -128 -> 209
    //   340: aload_2
    //   341: astore_1
    //   342: goto -209 -> 133
    //   345: aconst_null
    //   346: astore_3
    //   347: aload_2
    //   348: astore_1
    //   349: goto -226 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	352	0	paramContext	Context
    //   49	192	1	localObject1	Object
    //   300	17	1	localIOException1	java.io.IOException
    //   341	8	1	localException1	Exception
    //   1	156	2	localObject2	Object
    //   169	37	2	localIOException2	java.io.IOException
    //   208	34	2	localObject3	Object
    //   255	17	2	localIOException3	java.io.IOException
    //   336	12	2	localException2	Exception
    //   73	57	3	localFileInputStream1	java.io.FileInputStream
    //   201	7	3	localException3	Exception
    //   211	136	3	localFileInputStream2	java.io.FileInputStream
    //   69	179	4	localFileInputStream3	java.io.FileInputStream
    //   81	21	5	i	int
    // Exception table:
    //   from	to	target	type
    //   129	133	169	java/io/IOException
    //   12	50	201	java/lang/Exception
    //   54	71	201	java/lang/Exception
    //   247	252	255	java/io/IOException
    //   12	50	287	finally
    //   54	71	287	finally
    //   294	298	300	java/io/IOException
    //   76	83	332	finally
    //   101	106	332	finally
    //   111	118	332	finally
    //   212	240	332	finally
    //   76	83	336	java/lang/Exception
    //   101	106	336	java/lang/Exception
    //   111	118	336	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */