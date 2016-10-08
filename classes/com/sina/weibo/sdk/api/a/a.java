package com.sina.weibo.sdk.api.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static final Uri a = Uri.parse("content://com.sina.weibo.sdkProvider/query/package");
  
  public static b a(Context paramContext)
  {
    b localb2 = b(paramContext);
    b localb1 = localb2;
    if (localb2 == null) {
      localb1 = c(paramContext);
    }
    return localb1;
  }
  
  public static b a(Context paramContext, String paramString)
  {
    Object localObject;
    if ((paramContext == null) || (paramString == null)) {
      localObject = null;
    }
    do
    {
      b localb;
      do
      {
        return (b)localObject;
        localb = c(paramContext, paramString);
        localObject = localb;
      } while (localb != null);
      paramContext = b(paramContext);
      if (paramContext == null) {
        break;
      }
      localObject = paramContext;
    } while (paramString.equals(paramContext.a));
    return null;
  }
  
  public static boolean a(int paramInt)
  {
    return paramInt >= 10350;
  }
  
  public static boolean a(Signature[] paramArrayOfSignature, String paramString)
  {
    if ((paramArrayOfSignature == null) || (paramString == null)) {}
    for (;;)
    {
      return false;
      int j = paramArrayOfSignature.length;
      int i = 0;
      while (i < j)
      {
        if (paramString.equals(com.sina.weibo.sdk.b.b.a(paramArrayOfSignature[i].toByteArray())))
        {
          com.sina.weibo.sdk.b.a.a("ApiUtils", "check pass");
          return true;
        }
        i += 1;
      }
    }
  }
  
  /* Error */
  private static b b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 72	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_1
    //   5: aload_1
    //   6: getstatic 18	com/sina/weibo/sdk/api/a/a:a	Landroid/net/Uri;
    //   9: aconst_null
    //   10: aconst_null
    //   11: aconst_null
    //   12: aconst_null
    //   13: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore_2
    //   17: aload_2
    //   18: ifnonnull +17 -> 35
    //   21: aload_2
    //   22: ifnull +9 -> 31
    //   25: aload_2
    //   26: invokeinterface 83 1 0
    //   31: aconst_null
    //   32: astore_0
    //   33: aload_0
    //   34: areturn
    //   35: aload_2
    //   36: astore_1
    //   37: aload_2
    //   38: ldc 85
    //   40: invokeinterface 89 2 0
    //   45: istore 5
    //   47: aload_2
    //   48: astore_1
    //   49: aload_2
    //   50: ldc 91
    //   52: invokeinterface 89 2 0
    //   57: istore 6
    //   59: aload_2
    //   60: astore_1
    //   61: aload_2
    //   62: invokeinterface 95 1 0
    //   67: ifeq +155 -> 222
    //   70: aload_2
    //   71: astore_1
    //   72: aload_2
    //   73: iload 5
    //   75: invokeinterface 99 2 0
    //   80: astore_3
    //   81: aload_2
    //   82: astore_1
    //   83: aload_3
    //   84: invokestatic 104	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   87: istore 5
    //   89: aload_2
    //   90: astore_1
    //   91: aload_2
    //   92: iload 6
    //   94: invokeinterface 99 2 0
    //   99: astore 4
    //   101: aload_2
    //   102: astore_1
    //   103: aload 4
    //   105: invokestatic 110	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   108: ifne +114 -> 222
    //   111: aload_2
    //   112: astore_1
    //   113: aload_0
    //   114: aload 4
    //   116: invokestatic 113	com/sina/weibo/sdk/api/a/a:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   119: ifeq +103 -> 222
    //   122: aload_2
    //   123: astore_1
    //   124: new 31	com/sina/weibo/sdk/api/a/b
    //   127: dup
    //   128: invokespecial 116	com/sina/weibo/sdk/api/a/b:<init>	()V
    //   131: astore_3
    //   132: aload_2
    //   133: astore_1
    //   134: aload_3
    //   135: aload 4
    //   137: putfield 34	com/sina/weibo/sdk/api/a/b:a	Ljava/lang/String;
    //   140: aload_2
    //   141: astore_1
    //   142: aload_3
    //   143: iload 5
    //   145: putfield 119	com/sina/weibo/sdk/api/a/b:b	I
    //   148: aload_3
    //   149: astore_0
    //   150: aload_2
    //   151: ifnull -118 -> 33
    //   154: aload_2
    //   155: invokeinterface 83 1 0
    //   160: aload_3
    //   161: areturn
    //   162: astore_3
    //   163: aload_2
    //   164: astore_1
    //   165: aload_3
    //   166: invokevirtual 122	java/lang/NumberFormatException:printStackTrace	()V
    //   169: iconst_m1
    //   170: istore 5
    //   172: goto -83 -> 89
    //   175: astore_0
    //   176: aconst_null
    //   177: astore_2
    //   178: aload_2
    //   179: astore_1
    //   180: aload_0
    //   181: invokevirtual 123	java/lang/Exception:printStackTrace	()V
    //   184: aload_2
    //   185: astore_1
    //   186: ldc 55
    //   188: aload_0
    //   189: invokevirtual 127	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   192: invokestatic 129	com/sina/weibo/sdk/b/a:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: aload_2
    //   196: ifnull +9 -> 205
    //   199: aload_2
    //   200: invokeinterface 83 1 0
    //   205: aconst_null
    //   206: areturn
    //   207: astore_0
    //   208: aconst_null
    //   209: astore_1
    //   210: aload_1
    //   211: ifnull +9 -> 220
    //   214: aload_1
    //   215: invokeinterface 83 1 0
    //   220: aload_0
    //   221: athrow
    //   222: aload_2
    //   223: ifnull -18 -> 205
    //   226: aload_2
    //   227: invokeinterface 83 1 0
    //   232: goto -27 -> 205
    //   235: astore_0
    //   236: goto -26 -> 210
    //   239: astore_0
    //   240: goto -62 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	paramContext	Context
    //   4	211	1	localObject1	Object
    //   16	211	2	localCursor	android.database.Cursor
    //   80	81	3	localObject2	Object
    //   162	4	3	localNumberFormatException	NumberFormatException
    //   99	37	4	str	String
    //   45	126	5	i	int
    //   57	36	6	j	int
    // Exception table:
    //   from	to	target	type
    //   83	89	162	java/lang/NumberFormatException
    //   5	17	175	java/lang/Exception
    //   5	17	207	finally
    //   37	47	235	finally
    //   49	59	235	finally
    //   61	70	235	finally
    //   72	81	235	finally
    //   83	89	235	finally
    //   91	101	235	finally
    //   103	111	235	finally
    //   113	122	235	finally
    //   124	132	235	finally
    //   134	140	235	finally
    //   142	148	235	finally
    //   165	169	235	finally
    //   180	184	235	finally
    //   186	195	235	finally
    //   37	47	239	java/lang/Exception
    //   49	59	239	java/lang/Exception
    //   61	70	239	java/lang/Exception
    //   72	81	239	java/lang/Exception
    //   83	89	239	java/lang/Exception
    //   91	101	239	java/lang/Exception
    //   103	111	239	java/lang/Exception
    //   113	122	239	java/lang/Exception
    //   124	132	239	java/lang/Exception
    //   134	140	239	java/lang/Exception
    //   142	148	239	java/lang/Exception
    //   165	169	239	java/lang/Exception
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      return a(paramContext.signatures, "18da2bf10352443a00a5e046d9fca6bd");
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private static b c(Context paramContext)
  {
    Object localObject1 = new Intent("com.sina.weibo.action.sdkidentity");
    ((Intent)localObject1).addCategory("android.intent.category.DEFAULT");
    localObject1 = paramContext.getPackageManager().queryIntentServices((Intent)localObject1, 0);
    if ((localObject1 == null) || (((List)localObject1).isEmpty())) {
      return null;
    }
    localObject1 = ((List)localObject1).iterator();
    Object localObject2;
    do
    {
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          return null;
        }
        localObject2 = (ResolveInfo)((Iterator)localObject1).next();
      } while ((((ResolveInfo)localObject2).serviceInfo == null) || (((ResolveInfo)localObject2).serviceInfo.applicationInfo == null) || (((ResolveInfo)localObject2).serviceInfo.applicationInfo.packageName == null) || (((ResolveInfo)localObject2).serviceInfo.applicationInfo.packageName.length() == 0));
      localObject2 = c(paramContext, ((ResolveInfo)localObject2).serviceInfo.applicationInfo.packageName);
    } while (localObject2 == null);
    return (b)localObject2;
  }
  
  /* Error */
  private static b c(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: aload_1
    //   5: ifnonnull +7 -> 12
    //   8: aconst_null
    //   9: astore_0
    //   10: aload_0
    //   11: areturn
    //   12: aload_0
    //   13: aload_1
    //   14: iconst_2
    //   15: invokevirtual 214	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   18: astore_2
    //   19: sipush 1024
    //   22: newarray <illegal type>
    //   24: astore 4
    //   26: aload_2
    //   27: invokevirtual 218	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   30: ldc -36
    //   32: invokevirtual 226	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   35: astore_3
    //   36: aload_3
    //   37: astore_2
    //   38: new 228	java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial 229	java/lang/StringBuilder:<init>	()V
    //   45: astore 5
    //   47: aload_3
    //   48: astore_2
    //   49: aload_3
    //   50: aload 4
    //   52: iconst_0
    //   53: sipush 1024
    //   56: invokevirtual 235	java/io/InputStream:read	([BII)I
    //   59: istore 6
    //   61: iload 6
    //   63: iconst_m1
    //   64: if_icmpne +40 -> 104
    //   67: aload_3
    //   68: astore_2
    //   69: aload 5
    //   71: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 110	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   77: ifne +17 -> 94
    //   80: aload_3
    //   81: astore_2
    //   82: aload_0
    //   83: aload_1
    //   84: invokestatic 113	com/sina/weibo/sdk/api/a/a:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   87: istore 7
    //   89: iload 7
    //   91: ifne +53 -> 144
    //   94: aload_3
    //   95: ifnull +7 -> 102
    //   98: aload_3
    //   99: invokevirtual 239	java/io/InputStream:close	()V
    //   102: aconst_null
    //   103: areturn
    //   104: aload_3
    //   105: astore_2
    //   106: aload 5
    //   108: new 36	java/lang/String
    //   111: dup
    //   112: aload 4
    //   114: iconst_0
    //   115: iload 6
    //   117: invokespecial 242	java/lang/String:<init>	([BII)V
    //   120: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: goto -77 -> 47
    //   127: astore_0
    //   128: aload_3
    //   129: astore_2
    //   130: aload_0
    //   131: invokevirtual 247	android/content/pm/PackageManager$NameNotFoundException:printStackTrace	()V
    //   134: aload_3
    //   135: ifnull +7 -> 142
    //   138: aload_3
    //   139: invokevirtual 239	java/io/InputStream:close	()V
    //   142: aconst_null
    //   143: areturn
    //   144: aload_3
    //   145: astore_2
    //   146: new 249	org/json/JSONObject
    //   149: dup
    //   150: aload 5
    //   152: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokespecial 250	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   158: ldc 85
    //   160: iconst_m1
    //   161: invokevirtual 254	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   164: istore 6
    //   166: aload_3
    //   167: astore_2
    //   168: new 31	com/sina/weibo/sdk/api/a/b
    //   171: dup
    //   172: invokespecial 116	com/sina/weibo/sdk/api/a/b:<init>	()V
    //   175: astore 4
    //   177: aload_3
    //   178: astore_2
    //   179: aload 4
    //   181: aload_1
    //   182: putfield 34	com/sina/weibo/sdk/api/a/b:a	Ljava/lang/String;
    //   185: aload_3
    //   186: astore_2
    //   187: aload 4
    //   189: iload 6
    //   191: putfield 119	com/sina/weibo/sdk/api/a/b:b	I
    //   194: aload 4
    //   196: astore_0
    //   197: aload_3
    //   198: ifnull -188 -> 10
    //   201: aload_3
    //   202: invokevirtual 239	java/io/InputStream:close	()V
    //   205: aload 4
    //   207: areturn
    //   208: astore_0
    //   209: aload 4
    //   211: areturn
    //   212: astore_0
    //   213: aconst_null
    //   214: astore_3
    //   215: aload_3
    //   216: astore_2
    //   217: aload_0
    //   218: invokevirtual 255	java/io/IOException:printStackTrace	()V
    //   221: aload_3
    //   222: ifnull -80 -> 142
    //   225: aload_3
    //   226: invokevirtual 239	java/io/InputStream:close	()V
    //   229: goto -87 -> 142
    //   232: astore_0
    //   233: goto -91 -> 142
    //   236: astore_0
    //   237: aconst_null
    //   238: astore_3
    //   239: aload_3
    //   240: astore_2
    //   241: aload_0
    //   242: invokevirtual 256	org/json/JSONException:printStackTrace	()V
    //   245: aload_3
    //   246: ifnull -104 -> 142
    //   249: aload_3
    //   250: invokevirtual 239	java/io/InputStream:close	()V
    //   253: goto -111 -> 142
    //   256: astore_0
    //   257: goto -115 -> 142
    //   260: astore_0
    //   261: aconst_null
    //   262: astore_3
    //   263: aload_3
    //   264: astore_2
    //   265: ldc 55
    //   267: aload_0
    //   268: invokevirtual 127	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   271: invokestatic 129	com/sina/weibo/sdk/b/a:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   274: aload_3
    //   275: ifnull -133 -> 142
    //   278: aload_3
    //   279: invokevirtual 239	java/io/InputStream:close	()V
    //   282: goto -140 -> 142
    //   285: astore_0
    //   286: goto -144 -> 142
    //   289: astore_0
    //   290: aconst_null
    //   291: astore_2
    //   292: aload_2
    //   293: ifnull +7 -> 300
    //   296: aload_2
    //   297: invokevirtual 239	java/io/InputStream:close	()V
    //   300: aload_0
    //   301: athrow
    //   302: astore_0
    //   303: goto -201 -> 102
    //   306: astore_0
    //   307: goto -165 -> 142
    //   310: astore_1
    //   311: goto -11 -> 300
    //   314: astore_0
    //   315: goto -23 -> 292
    //   318: astore_0
    //   319: goto -56 -> 263
    //   322: astore_0
    //   323: goto -84 -> 239
    //   326: astore_0
    //   327: goto -112 -> 215
    //   330: astore_0
    //   331: aconst_null
    //   332: astore_3
    //   333: goto -205 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	336	0	paramContext	Context
    //   0	336	1	paramString	String
    //   18	279	2	localObject1	Object
    //   35	298	3	localInputStream	java.io.InputStream
    //   24	186	4	localObject2	Object
    //   45	106	5	localStringBuilder	StringBuilder
    //   59	131	6	i	int
    //   87	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   38	47	127	android/content/pm/PackageManager$NameNotFoundException
    //   49	61	127	android/content/pm/PackageManager$NameNotFoundException
    //   69	80	127	android/content/pm/PackageManager$NameNotFoundException
    //   82	89	127	android/content/pm/PackageManager$NameNotFoundException
    //   106	124	127	android/content/pm/PackageManager$NameNotFoundException
    //   146	166	127	android/content/pm/PackageManager$NameNotFoundException
    //   168	177	127	android/content/pm/PackageManager$NameNotFoundException
    //   179	185	127	android/content/pm/PackageManager$NameNotFoundException
    //   187	194	127	android/content/pm/PackageManager$NameNotFoundException
    //   201	205	208	java/io/IOException
    //   12	36	212	java/io/IOException
    //   225	229	232	java/io/IOException
    //   12	36	236	org/json/JSONException
    //   249	253	256	java/io/IOException
    //   12	36	260	java/lang/Exception
    //   278	282	285	java/io/IOException
    //   12	36	289	finally
    //   98	102	302	java/io/IOException
    //   138	142	306	java/io/IOException
    //   296	300	310	java/io/IOException
    //   38	47	314	finally
    //   49	61	314	finally
    //   69	80	314	finally
    //   82	89	314	finally
    //   106	124	314	finally
    //   130	134	314	finally
    //   146	166	314	finally
    //   168	177	314	finally
    //   179	185	314	finally
    //   187	194	314	finally
    //   217	221	314	finally
    //   241	245	314	finally
    //   265	274	314	finally
    //   38	47	318	java/lang/Exception
    //   49	61	318	java/lang/Exception
    //   69	80	318	java/lang/Exception
    //   82	89	318	java/lang/Exception
    //   106	124	318	java/lang/Exception
    //   146	166	318	java/lang/Exception
    //   168	177	318	java/lang/Exception
    //   179	185	318	java/lang/Exception
    //   187	194	318	java/lang/Exception
    //   38	47	322	org/json/JSONException
    //   49	61	322	org/json/JSONException
    //   69	80	322	org/json/JSONException
    //   82	89	322	org/json/JSONException
    //   106	124	322	org/json/JSONException
    //   146	166	322	org/json/JSONException
    //   168	177	322	org/json/JSONException
    //   179	185	322	org/json/JSONException
    //   187	194	322	org/json/JSONException
    //   38	47	326	java/io/IOException
    //   49	61	326	java/io/IOException
    //   69	80	326	java/io/IOException
    //   82	89	326	java/io/IOException
    //   106	124	326	java/io/IOException
    //   146	166	326	java/io/IOException
    //   168	177	326	java/io/IOException
    //   179	185	326	java/io/IOException
    //   187	194	326	java/io/IOException
    //   12	36	330	android/content/pm/PackageManager$NameNotFoundException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */