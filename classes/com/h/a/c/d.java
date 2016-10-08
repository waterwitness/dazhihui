package com.h.a.c;

import android.content.Context;
import android.provider.Settings.System;
import com.h.a.a.a.b;
import com.h.a.a.a.f;
import com.h.a.a.a.g;
import com.h.a.a.a.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class d
{
  private static final Object b = new Object();
  private static d c = null;
  private static final String j = ".UTSystemConfig" + File.separator + "Global";
  private Context a = null;
  private String d = null;
  private e e = null;
  private String f = "xx_utdid_key";
  private String g = "xx_utdid_domain";
  private com.h.a.b.a.e h = null;
  private com.h.a.b.a.e i = null;
  private Pattern k = Pattern.compile("[^0-9a-zA-Z=/+]+");
  
  public d(Context paramContext)
  {
    this.a = paramContext;
    this.i = new com.h.a.b.a.e(paramContext, j, "Alvin2", false, true);
    this.h = new com.h.a.b.a.e(paramContext, ".DataStorage", "ContextData", false, true);
    this.e = new e();
    this.f = String.format("K_%d", new Object[] { Integer.valueOf(h.b(this.f)) });
    this.g = String.format("D_%d", new Object[] { Integer.valueOf(h.b(this.g)) });
  }
  
  public static d a(Context paramContext)
  {
    if ((paramContext != null) && (c == null)) {}
    synchronized (b)
    {
      if (c == null)
      {
        c = new d(paramContext);
        c.b();
      }
      return c;
    }
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    Mac localMac = Mac.getInstance("HmacSHA1");
    localMac.init(new SecretKeySpec("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes(), localMac.getAlgorithm()));
    return b.b(localMac.doFinal(paramArrayOfByte), 2);
  }
  
  private void a(String paramString)
  {
    if (f(paramString))
    {
      String str = paramString;
      if (paramString.endsWith("\n")) {
        str = paramString.substring(0, paramString.length() - 1);
      }
      if ((str.length() == 24) && (this.i != null))
      {
        this.i.a("UTDID2", str);
        this.i.a();
      }
    }
  }
  
  private void b()
  {
    int n = 1;
    int m;
    if (this.i != null)
    {
      if (h.a(this.i.b("UTDID2")))
      {
        String str = this.i.b("UTDID");
        if (!h.a(str)) {
          a(str);
        }
      }
      m = 0;
      if (!h.a(this.i.b("DID")))
      {
        this.i.a("DID");
        m = 1;
      }
      if (!h.a(this.i.b("EI")))
      {
        this.i.a("EI");
        m = 1;
      }
      if (h.a(this.i.b("SI"))) {
        break label139;
      }
      this.i.a("SI");
      m = n;
    }
    label139:
    for (;;)
    {
      if (m != 0) {
        this.i.a();
      }
      return;
    }
  }
  
  private void b(String paramString)
  {
    if ((paramString != null) && (this.h != null) && (!paramString.equals(this.h.b(this.f))))
    {
      this.h.a(this.f, paramString);
      this.h.a();
    }
  }
  
  private String c()
  {
    if (this.i != null)
    {
      String str = this.i.b("UTDID2");
      if ((!h.a(str)) && (this.e.a(str) != null)) {
        return str;
      }
    }
    return null;
  }
  
  private void c(String paramString)
  {
    String str1;
    if ((this.a.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0) && (f(paramString)))
    {
      str1 = paramString;
      if (paramString.endsWith("\n")) {
        str1 = paramString.substring(0, paramString.length() - 1);
      }
      if (24 == str1.length()) {
        paramString = null;
      }
    }
    try
    {
      String str2 = Settings.System.getString(this.a.getContentResolver(), "mqBRboGZkQPcAkyk");
      paramString = str2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (!f(paramString)) {}
    try
    {
      Settings.System.putString(this.a.getContentResolver(), "mqBRboGZkQPcAkyk", str1);
      return;
    }
    catch (Exception paramString) {}
  }
  
  private void d(String paramString)
  {
    Object localObject = null;
    try
    {
      String str = Settings.System.getString(this.a.getContentResolver(), "dxCRMxhQkdGePGnp");
      localObject = str;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (!paramString.equals(localObject)) {}
    try
    {
      Settings.System.putString(this.a.getContentResolver(), "dxCRMxhQkdGePGnp", paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  private final byte[] d()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int m = (int)(System.currentTimeMillis() / 1000L);
    int n = new Random().nextInt();
    Object localObject = f.a(m);
    byte[] arrayOfByte = f.a(n);
    localByteArrayOutputStream.write((byte[])localObject, 0, 4);
    localByteArrayOutputStream.write(arrayOfByte, 0, 4);
    localByteArrayOutputStream.write(3);
    localByteArrayOutputStream.write(0);
    try
    {
      localObject = g.a(this.a);
      localByteArrayOutputStream.write(f.a(h.b((String)localObject)), 0, 4);
      localByteArrayOutputStream.write(f.a(h.b(a(localByteArrayOutputStream.toByteArray()))));
      return localByteArrayOutputStream.toByteArray();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = new Random().nextInt();
      }
    }
  }
  
  private void e(String paramString)
  {
    if ((this.a.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0) && (paramString != null)) {
      d(paramString);
    }
  }
  
  private boolean f(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      String str = paramString;
      if (paramString.endsWith("\n")) {
        str = paramString.substring(0, paramString.length() - 1);
      }
      bool1 = bool2;
      if (24 == str.length())
      {
        bool1 = bool2;
        if (!this.k.matcher(str).find()) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  /* Error */
  public String a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: ldc_w 293
    //   21: astore_2
    //   22: aload_0
    //   23: getfield 59	com/h/a/c/d:a	Landroid/content/Context;
    //   26: invokevirtual 220	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   29: ldc -34
    //   31: invokestatic 228	android/provider/Settings$System:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   34: astore_1
    //   35: aload_1
    //   36: astore_2
    //   37: aload_2
    //   38: astore_1
    //   39: aload_0
    //   40: aload_2
    //   41: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   44: ifne -30 -> 14
    //   47: new 295	com/h/a/c/f
    //   50: dup
    //   51: invokespecial 296	com/h/a/c/f:<init>	()V
    //   54: astore_3
    //   55: iconst_0
    //   56: istore 5
    //   58: aload_0
    //   59: getfield 59	com/h/a/c/d:a	Landroid/content/Context;
    //   62: invokevirtual 220	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   65: ldc -22
    //   67: invokestatic 228	android/provider/Settings$System:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   70: astore_1
    //   71: aload_1
    //   72: invokestatic 190	com/h/a/a/a/h:a	(Ljava/lang/String;)Z
    //   75: ifne +372 -> 447
    //   78: aload_3
    //   79: aload_1
    //   80: invokevirtual 297	com/h/a/c/f:b	(Ljava/lang/String;)Ljava/lang/String;
    //   83: astore_2
    //   84: aload_0
    //   85: aload_2
    //   86: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   89: ifeq +24 -> 113
    //   92: aload_0
    //   93: aload_2
    //   94: invokespecial 299	com/h/a/c/d:c	(Ljava/lang/String;)V
    //   97: aload_2
    //   98: astore_1
    //   99: goto -85 -> 14
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    //   107: astore_1
    //   108: aconst_null
    //   109: astore_1
    //   110: goto -39 -> 71
    //   113: aload_3
    //   114: aload_1
    //   115: invokevirtual 300	com/h/a/c/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   118: astore_2
    //   119: aload_0
    //   120: aload_2
    //   121: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   124: ifeq +316 -> 440
    //   127: aload_0
    //   128: getfield 63	com/h/a/c/d:e	Lcom/h/a/c/e;
    //   131: aload_2
    //   132: invokevirtual 207	com/h/a/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   135: astore_2
    //   136: aload_2
    //   137: invokestatic 190	com/h/a/a/a/h:a	(Ljava/lang/String;)Z
    //   140: ifne +300 -> 440
    //   143: aload_0
    //   144: aload_2
    //   145: invokespecial 302	com/h/a/c/d:e	(Ljava/lang/String;)V
    //   148: aload_0
    //   149: getfield 59	com/h/a/c/d:a	Landroid/content/Context;
    //   152: invokevirtual 220	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   155: ldc -22
    //   157: invokestatic 228	android/provider/Settings$System:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   160: astore_2
    //   161: aload_2
    //   162: astore_1
    //   163: aload_0
    //   164: getfield 63	com/h/a/c/d:e	Lcom/h/a/c/e;
    //   167: aload_1
    //   168: invokevirtual 303	com/h/a/c/e:b	(Ljava/lang/String;)Ljava/lang/String;
    //   171: astore_2
    //   172: aload_0
    //   173: aload_2
    //   174: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   177: ifeq +34 -> 211
    //   180: aload_0
    //   181: aload_2
    //   182: putfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   185: aload_0
    //   186: aload_2
    //   187: invokespecial 194	com/h/a/c/d:a	(Ljava/lang/String;)V
    //   190: aload_0
    //   191: aload_1
    //   192: invokespecial 305	com/h/a/c/d:b	(Ljava/lang/String;)V
    //   195: aload_0
    //   196: aload_0
    //   197: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   200: invokespecial 299	com/h/a/c/d:c	(Ljava/lang/String;)V
    //   203: aload_0
    //   204: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   207: astore_1
    //   208: goto -194 -> 14
    //   211: aload_0
    //   212: invokespecial 307	com/h/a/c/d:c	()Ljava/lang/String;
    //   215: astore_1
    //   216: aload_0
    //   217: aload_1
    //   218: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   221: ifeq +40 -> 261
    //   224: aload_0
    //   225: getfield 63	com/h/a/c/d:e	Lcom/h/a/c/e;
    //   228: aload_1
    //   229: invokevirtual 207	com/h/a/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   232: astore_2
    //   233: iload 5
    //   235: ifeq +8 -> 243
    //   238: aload_0
    //   239: aload_2
    //   240: invokespecial 302	com/h/a/c/d:e	(Ljava/lang/String;)V
    //   243: aload_0
    //   244: aload_1
    //   245: invokespecial 299	com/h/a/c/d:c	(Ljava/lang/String;)V
    //   248: aload_0
    //   249: aload_2
    //   250: invokespecial 305	com/h/a/c/d:b	(Ljava/lang/String;)V
    //   253: aload_0
    //   254: aload_1
    //   255: putfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   258: goto -244 -> 14
    //   261: aload_0
    //   262: getfield 73	com/h/a/c/d:h	Lcom/h/a/b/a/e;
    //   265: aload_0
    //   266: getfield 67	com/h/a/c/d:f	Ljava/lang/String;
    //   269: invokevirtual 188	com/h/a/b/a/e:b	(Ljava/lang/String;)Ljava/lang/String;
    //   272: astore 4
    //   274: aload 4
    //   276: invokestatic 190	com/h/a/a/a/h:a	(Ljava/lang/String;)Z
    //   279: ifne +85 -> 364
    //   282: aload_3
    //   283: aload 4
    //   285: invokevirtual 300	com/h/a/c/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   288: astore_2
    //   289: aload_2
    //   290: astore_1
    //   291: aload_0
    //   292: aload_2
    //   293: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   296: ifne +13 -> 309
    //   299: aload_0
    //   300: getfield 63	com/h/a/c/d:e	Lcom/h/a/c/e;
    //   303: aload 4
    //   305: invokevirtual 303	com/h/a/c/e:b	(Ljava/lang/String;)Ljava/lang/String;
    //   308: astore_1
    //   309: aload_0
    //   310: aload_1
    //   311: invokespecial 164	com/h/a/c/d:f	(Ljava/lang/String;)Z
    //   314: ifeq +50 -> 364
    //   317: aload_0
    //   318: getfield 63	com/h/a/c/d:e	Lcom/h/a/c/e;
    //   321: aload_1
    //   322: invokevirtual 207	com/h/a/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   325: astore_2
    //   326: aload_1
    //   327: invokestatic 190	com/h/a/a/a/h:a	(Ljava/lang/String;)Z
    //   330: ifne +34 -> 364
    //   333: aload_0
    //   334: aload_1
    //   335: putfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   338: iload 5
    //   340: ifeq +8 -> 348
    //   343: aload_0
    //   344: aload_2
    //   345: invokespecial 302	com/h/a/c/d:e	(Ljava/lang/String;)V
    //   348: aload_0
    //   349: aload_0
    //   350: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   353: invokespecial 194	com/h/a/c/d:a	(Ljava/lang/String;)V
    //   356: aload_0
    //   357: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   360: astore_1
    //   361: goto -347 -> 14
    //   364: aload_0
    //   365: invokespecial 309	com/h/a/c/d:d	()[B
    //   368: astore_1
    //   369: aload_1
    //   370: ifnull +61 -> 431
    //   373: aload_0
    //   374: aload_1
    //   375: iconst_2
    //   376: invokestatic 161	com/h/a/a/a/b:b	([BI)Ljava/lang/String;
    //   379: putfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   382: aload_0
    //   383: aload_0
    //   384: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   387: invokespecial 194	com/h/a/c/d:a	(Ljava/lang/String;)V
    //   390: aload_0
    //   391: getfield 63	com/h/a/c/d:e	Lcom/h/a/c/e;
    //   394: aload_1
    //   395: invokevirtual 310	com/h/a/c/e:a	([B)Ljava/lang/String;
    //   398: astore_1
    //   399: aload_1
    //   400: ifnull +18 -> 418
    //   403: iload 5
    //   405: ifeq +8 -> 413
    //   408: aload_0
    //   409: aload_1
    //   410: invokespecial 302	com/h/a/c/d:e	(Ljava/lang/String;)V
    //   413: aload_0
    //   414: aload_1
    //   415: invokespecial 305	com/h/a/c/d:b	(Ljava/lang/String;)V
    //   418: aload_0
    //   419: getfield 61	com/h/a/c/d:d	Ljava/lang/String;
    //   422: astore_1
    //   423: goto -409 -> 14
    //   426: astore_1
    //   427: aload_1
    //   428: invokevirtual 313	java/lang/Exception:printStackTrace	()V
    //   431: aconst_null
    //   432: astore_1
    //   433: goto -419 -> 14
    //   436: astore_1
    //   437: goto -400 -> 37
    //   440: goto -277 -> 163
    //   443: astore_2
    //   444: goto -281 -> 163
    //   447: iconst_1
    //   448: istore 5
    //   450: goto -239 -> 211
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	453	0	this	d
    //   13	86	1	localObject1	Object
    //   102	4	1	localObject2	Object
    //   107	1	1	localException1	Exception
    //   109	314	1	localObject3	Object
    //   426	2	1	localException2	Exception
    //   432	1	1	localObject4	Object
    //   436	1	1	localException3	Exception
    //   21	324	2	localObject5	Object
    //   443	1	2	localException4	Exception
    //   54	229	3	localf	f
    //   272	32	4	str	String
    //   56	393	5	m	int
    // Exception table:
    //   from	to	target	type
    //   2	14	102	finally
    //   22	35	102	finally
    //   39	55	102	finally
    //   58	71	102	finally
    //   71	97	102	finally
    //   113	148	102	finally
    //   148	161	102	finally
    //   163	172	102	finally
    //   172	208	102	finally
    //   211	233	102	finally
    //   238	243	102	finally
    //   243	258	102	finally
    //   261	289	102	finally
    //   291	309	102	finally
    //   309	338	102	finally
    //   343	348	102	finally
    //   348	361	102	finally
    //   364	369	102	finally
    //   373	399	102	finally
    //   408	413	102	finally
    //   413	418	102	finally
    //   418	423	102	finally
    //   427	431	102	finally
    //   58	71	107	java/lang/Exception
    //   364	369	426	java/lang/Exception
    //   373	399	426	java/lang/Exception
    //   408	413	426	java/lang/Exception
    //   413	418	426	java/lang/Exception
    //   418	423	426	java/lang/Exception
    //   22	35	436	java/lang/Exception
    //   148	161	443	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */