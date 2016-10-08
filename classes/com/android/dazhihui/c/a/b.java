package com.android.dazhihui.c.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.android.dazhihui.DzhApplication;

public class b
{
  private static b c;
  private c a;
  private Context b;
  
  private b(Context paramContext)
  {
    this.b = paramContext;
    this.a = new c(this, this.b);
  }
  
  public static b a()
  {
    if (c == null) {}
    try
    {
      if (c == null) {
        c = new b(DzhApplication.a().getApplicationContext());
      }
      return c;
    }
    finally {}
  }
  
  /* Error */
  public String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_1
    //   9: invokestatic 48	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: istore 6
    //   14: iload 6
    //   16: ifeq +9 -> 25
    //   19: aload_2
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: areturn
    //   25: aload_0
    //   26: invokevirtual 51	com/android/dazhihui/c/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnull +297 -> 328
    //   34: aload_3
    //   35: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   38: aload_3
    //   39: ldc 58
    //   41: aconst_null
    //   42: ldc 60
    //   44: iconst_1
    //   45: anewarray 62	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: aconst_null
    //   56: invokevirtual 66	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   59: astore_1
    //   60: aload_1
    //   61: ifnull +19 -> 80
    //   64: aload_2
    //   65: astore 4
    //   67: aload_1
    //   68: invokeinterface 72 1 0
    //   73: istore 6
    //   75: iload 6
    //   77: ifne +47 -> 124
    //   80: aload_1
    //   81: ifnull +9 -> 90
    //   84: aload_1
    //   85: invokeinterface 75 1 0
    //   90: aload_2
    //   91: astore_1
    //   92: aload_3
    //   93: ifnull -72 -> 21
    //   96: aload_3
    //   97: invokevirtual 78	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   100: aload_3
    //   101: invokevirtual 79	android/database/sqlite/SQLiteDatabase:close	()V
    //   104: aload_2
    //   105: astore_1
    //   106: goto -85 -> 21
    //   109: astore_1
    //   110: aload_1
    //   111: invokevirtual 82	java/lang/Exception:printStackTrace	()V
    //   114: aload_2
    //   115: astore_1
    //   116: goto -95 -> 21
    //   119: astore_1
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    //   124: aload_2
    //   125: astore 4
    //   127: aload_1
    //   128: aload_1
    //   129: ldc 84
    //   131: invokeinterface 88 2 0
    //   136: invokeinterface 92 2 0
    //   141: astore_2
    //   142: aload_2
    //   143: astore 4
    //   145: aload_3
    //   146: invokevirtual 95	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   149: aload_1
    //   150: astore 4
    //   152: aload_2
    //   153: astore_1
    //   154: aload 4
    //   156: ifnull +10 -> 166
    //   159: aload 4
    //   161: invokeinterface 75 1 0
    //   166: aload_3
    //   167: ifnull +11 -> 178
    //   170: aload_3
    //   171: invokevirtual 78	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   174: aload_3
    //   175: invokevirtual 79	android/database/sqlite/SQLiteDatabase:close	()V
    //   178: goto -157 -> 21
    //   181: astore_2
    //   182: aload_2
    //   183: invokevirtual 82	java/lang/Exception:printStackTrace	()V
    //   186: goto -8 -> 178
    //   189: astore 4
    //   191: aconst_null
    //   192: astore_1
    //   193: aload 5
    //   195: astore_3
    //   196: aload 4
    //   198: invokevirtual 82	java/lang/Exception:printStackTrace	()V
    //   201: aload_1
    //   202: ifnull +9 -> 211
    //   205: aload_1
    //   206: invokeinterface 75 1 0
    //   211: aload_2
    //   212: astore_1
    //   213: aload_3
    //   214: ifnull -36 -> 178
    //   217: aload_3
    //   218: invokevirtual 78	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   221: aload_3
    //   222: invokevirtual 79	android/database/sqlite/SQLiteDatabase:close	()V
    //   225: aload_2
    //   226: astore_1
    //   227: goto -49 -> 178
    //   230: astore_1
    //   231: aload_1
    //   232: invokevirtual 82	java/lang/Exception:printStackTrace	()V
    //   235: aload_2
    //   236: astore_1
    //   237: goto -59 -> 178
    //   240: aload_3
    //   241: ifnull +9 -> 250
    //   244: aload_3
    //   245: invokeinterface 75 1 0
    //   250: aload_2
    //   251: ifnull +11 -> 262
    //   254: aload_2
    //   255: invokevirtual 78	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   258: aload_2
    //   259: invokevirtual 79	android/database/sqlite/SQLiteDatabase:close	()V
    //   262: aload_1
    //   263: athrow
    //   264: astore_2
    //   265: aload_2
    //   266: invokevirtual 82	java/lang/Exception:printStackTrace	()V
    //   269: goto -7 -> 262
    //   272: astore_1
    //   273: aload_3
    //   274: astore_2
    //   275: aload 4
    //   277: astore_3
    //   278: goto -38 -> 240
    //   281: astore 5
    //   283: aload_1
    //   284: astore 4
    //   286: aload_3
    //   287: astore_2
    //   288: aload 5
    //   290: astore_1
    //   291: aload 4
    //   293: astore_3
    //   294: goto -54 -> 240
    //   297: astore 4
    //   299: aload_3
    //   300: astore_2
    //   301: aload_1
    //   302: astore_3
    //   303: aload 4
    //   305: astore_1
    //   306: goto -66 -> 240
    //   309: astore 4
    //   311: aconst_null
    //   312: astore_1
    //   313: goto -117 -> 196
    //   316: astore 5
    //   318: aload 4
    //   320: astore_2
    //   321: aload 5
    //   323: astore 4
    //   325: goto -129 -> 196
    //   328: aconst_null
    //   329: astore 4
    //   331: aload_2
    //   332: astore_1
    //   333: goto -179 -> 154
    //   336: astore_1
    //   337: aconst_null
    //   338: astore_2
    //   339: aload 4
    //   341: astore_3
    //   342: goto -102 -> 240
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	b
    //   0	345	1	paramString1	String
    //   0	345	2	paramString2	String
    //   29	313	3	localObject1	Object
    //   1	159	4	str1	String
    //   189	87	4	localException1	Exception
    //   284	8	4	str2	String
    //   297	7	4	localObject2	Object
    //   309	10	4	localException2	Exception
    //   323	17	4	localObject3	Object
    //   4	190	5	localObject4	Object
    //   281	8	5	localObject5	Object
    //   316	6	5	localException3	Exception
    //   12	64	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   96	104	109	java/lang/Exception
    //   8	14	119	finally
    //   84	90	119	finally
    //   96	104	119	finally
    //   110	114	119	finally
    //   159	166	119	finally
    //   170	178	119	finally
    //   182	186	119	finally
    //   205	211	119	finally
    //   217	225	119	finally
    //   231	235	119	finally
    //   244	250	119	finally
    //   254	262	119	finally
    //   262	264	119	finally
    //   265	269	119	finally
    //   170	178	181	java/lang/Exception
    //   25	30	189	java/lang/Exception
    //   217	225	230	java/lang/Exception
    //   254	262	264	java/lang/Exception
    //   34	60	272	finally
    //   67	75	281	finally
    //   127	142	281	finally
    //   145	149	281	finally
    //   196	201	297	finally
    //   34	60	309	java/lang/Exception
    //   67	75	316	java/lang/Exception
    //   127	142	316	java/lang/Exception
    //   145	149	316	java/lang/Exception
    //   25	30	336	finally
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    paramString = a(paramString, Boolean.toString(paramBoolean));
    try
    {
      boolean bool = Boolean.parseBoolean(paramString);
      return bool;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramBoolean;
  }
  
  public SQLiteDatabase b()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.a.getReadableDatabase();
      return localSQLiteDatabase;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        Object localObject1 = null;
      }
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */