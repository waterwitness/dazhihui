package com.tencent.avsdk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.dazhihui.DzhApplication;

public class IlvbDataBase
  extends SQLiteOpenHelper
{
  private static final String COLUMN_SETTING_KEY = "setting_key";
  private static final String COLUMN_SETTING_VALUE = "setting_value";
  private static final String DB_NAME = "ILVBDATABASE";
  private static final String SETTING_TABLE = "setting";
  private static final String SQL_CREATE_SETTING = "CREATE TABLE setting (_id integer primary key autoincrement,setting_key text,setting_value text);";
  private static final int VERSION = 1;
  private static volatile IlvbDataBase sIlvbDataBase = null;
  
  private IlvbDataBase(Context paramContext)
  {
    super(paramContext, "ILVBDATABASE", null, 1);
  }
  
  public static IlvbDataBase getInstance()
  {
    if (sIlvbDataBase == null) {}
    try
    {
      if (sIlvbDataBase == null) {
        sIlvbDataBase = new IlvbDataBase(DzhApplication.a().getApplicationContext());
      }
      return sIlvbDataBase;
    }
    finally {}
  }
  
  /* Error */
  public int delete(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: iconst_0
    //   4: istore 5
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_1
    //   9: invokestatic 59	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: istore 8
    //   14: iload 8
    //   16: ifeq +12 -> 28
    //   19: iload 5
    //   21: istore 6
    //   23: aload_0
    //   24: monitorexit
    //   25: iload 6
    //   27: ireturn
    //   28: aconst_null
    //   29: astore_3
    //   30: aconst_null
    //   31: astore_2
    //   32: iload 6
    //   34: istore 5
    //   36: getstatic 29	com/tencent/avsdk/IlvbDataBase:sIlvbDataBase	Lcom/tencent/avsdk/IlvbDataBase;
    //   39: invokevirtual 63	com/tencent/avsdk/IlvbDataBase:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   42: astore 4
    //   44: iload 6
    //   46: istore 5
    //   48: aload 4
    //   50: astore_2
    //   51: aload 4
    //   53: astore_3
    //   54: aload 4
    //   56: invokevirtual 68	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   59: iload 6
    //   61: istore 5
    //   63: aload 4
    //   65: astore_2
    //   66: aload 4
    //   68: astore_3
    //   69: aload 4
    //   71: ldc 17
    //   73: ldc 70
    //   75: iconst_1
    //   76: anewarray 72	java/lang/String
    //   79: dup
    //   80: iconst_0
    //   81: aload_1
    //   82: aastore
    //   83: invokevirtual 75	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   86: istore 7
    //   88: iload 7
    //   90: istore 5
    //   92: aload 4
    //   94: astore_2
    //   95: aload 4
    //   97: astore_3
    //   98: aload 4
    //   100: invokevirtual 78	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   103: iload 7
    //   105: istore 6
    //   107: aload 4
    //   109: ifnull -86 -> 23
    //   112: aload 4
    //   114: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   117: aload 4
    //   119: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   122: iload 7
    //   124: istore 6
    //   126: goto -103 -> 23
    //   129: astore_1
    //   130: aload_1
    //   131: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   134: iload 7
    //   136: istore 6
    //   138: goto -115 -> 23
    //   141: astore_1
    //   142: aload_0
    //   143: monitorexit
    //   144: aload_1
    //   145: athrow
    //   146: astore_1
    //   147: aload_2
    //   148: astore_3
    //   149: aload_1
    //   150: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   153: iload 5
    //   155: istore 6
    //   157: aload_2
    //   158: ifnull -135 -> 23
    //   161: aload_2
    //   162: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   165: aload_2
    //   166: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   169: iload 5
    //   171: istore 6
    //   173: goto -150 -> 23
    //   176: astore_1
    //   177: aload_1
    //   178: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   181: iload 5
    //   183: istore 6
    //   185: goto -162 -> 23
    //   188: astore_1
    //   189: aload_3
    //   190: ifnull +11 -> 201
    //   193: aload_3
    //   194: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   197: aload_3
    //   198: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   201: aload_1
    //   202: athrow
    //   203: astore_2
    //   204: aload_2
    //   205: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   208: goto -7 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	IlvbDataBase
    //   0	211	1	paramString	String
    //   31	135	2	localObject1	Object
    //   203	2	2	localException	Exception
    //   29	169	3	localObject2	Object
    //   42	76	4	localSQLiteDatabase	SQLiteDatabase
    //   4	178	5	i	int
    //   1	183	6	j	int
    //   86	49	7	k	int
    //   12	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   112	122	129	java/lang/Exception
    //   8	14	141	finally
    //   112	122	141	finally
    //   130	134	141	finally
    //   161	169	141	finally
    //   177	181	141	finally
    //   193	201	141	finally
    //   201	203	141	finally
    //   204	208	141	finally
    //   36	44	146	java/lang/Exception
    //   54	59	146	java/lang/Exception
    //   69	88	146	java/lang/Exception
    //   98	103	146	java/lang/Exception
    //   161	169	176	java/lang/Exception
    //   36	44	188	finally
    //   54	59	188	finally
    //   69	88	188	finally
    //   98	103	188	finally
    //   149	153	188	finally
    //   193	201	203	java/lang/Exception
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    paramString = getString(paramString, Boolean.toString(paramBoolean));
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
  
  public double getDouble(String paramString, double paramDouble)
  {
    paramString = getString(paramString, Double.toString(paramDouble));
    try
    {
      double d = Double.parseDouble(paramString);
      return d;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramDouble;
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    paramString = getString(paramString, Float.toString(paramFloat));
    try
    {
      float f = Float.parseFloat(paramString);
      return f;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramFloat;
  }
  
  public int getInt(String paramString, int paramInt)
  {
    paramString = getString(paramString, Integer.toString(paramInt));
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramInt;
  }
  
  public long getLong(String paramString, long paramLong)
  {
    paramString = getString(paramString, Long.toString(paramLong));
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramLong;
  }
  
  public short getShort(String paramString, short paramShort)
  {
    paramString = getString(paramString, Short.toString(paramShort));
    try
    {
      short s = Short.parseShort(paramString);
      return s;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramShort;
  }
  
  /* Error */
  public String getString(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_1
    //   9: invokestatic 59	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: istore 7
    //   14: iload 7
    //   16: ifeq +9 -> 25
    //   19: aload_2
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: areturn
    //   25: getstatic 29	com/tencent/avsdk/IlvbDataBase:sIlvbDataBase	Lcom/tencent/avsdk/IlvbDataBase;
    //   28: invokevirtual 63	com/tencent/avsdk/IlvbDataBase:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore_3
    //   32: aload_3
    //   33: invokevirtual 68	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   36: aload_3
    //   37: ldc 17
    //   39: aconst_null
    //   40: ldc 70
    //   42: iconst_1
    //   43: anewarray 72	java/lang/String
    //   46: dup
    //   47: iconst_0
    //   48: aload_1
    //   49: aastore
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokevirtual 164	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +16 -> 75
    //   62: aload_1
    //   63: invokeinterface 170 1 0
    //   68: istore 7
    //   70: iload 7
    //   72: ifne +47 -> 119
    //   75: aload_1
    //   76: ifnull +9 -> 85
    //   79: aload_1
    //   80: invokeinterface 171 1 0
    //   85: aload_2
    //   86: astore_1
    //   87: aload_3
    //   88: ifnull -67 -> 21
    //   91: aload_3
    //   92: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   95: aload_3
    //   96: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   99: aload_2
    //   100: astore_1
    //   101: goto -80 -> 21
    //   104: astore_1
    //   105: aload_1
    //   106: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   109: aload_2
    //   110: astore_1
    //   111: goto -90 -> 21
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    //   119: aload_1
    //   120: aload_1
    //   121: ldc 11
    //   123: invokeinterface 174 2 0
    //   128: invokeinterface 176 2 0
    //   133: astore 4
    //   135: aload_3
    //   136: invokevirtual 78	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   139: aload_1
    //   140: ifnull +9 -> 149
    //   143: aload_1
    //   144: invokeinterface 171 1 0
    //   149: aload_3
    //   150: ifnull +11 -> 161
    //   153: aload_3
    //   154: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   157: aload_3
    //   158: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   161: aload 4
    //   163: astore_2
    //   164: aload_2
    //   165: astore_1
    //   166: goto -145 -> 21
    //   169: astore_1
    //   170: aload_1
    //   171: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   174: aload 4
    //   176: astore_2
    //   177: goto -13 -> 164
    //   180: astore 4
    //   182: aconst_null
    //   183: astore 6
    //   185: aload_2
    //   186: astore_1
    //   187: aload 5
    //   189: astore_3
    //   190: aload 6
    //   192: astore_2
    //   193: aload 4
    //   195: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   198: aload_2
    //   199: ifnull +9 -> 208
    //   202: aload_2
    //   203: invokeinterface 171 1 0
    //   208: aload_1
    //   209: astore_2
    //   210: aload_3
    //   211: ifnull -47 -> 164
    //   214: aload_3
    //   215: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   218: aload_3
    //   219: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   222: aload_1
    //   223: astore_2
    //   224: goto -60 -> 164
    //   227: astore_2
    //   228: aload_2
    //   229: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   232: aload_1
    //   233: astore_2
    //   234: goto -70 -> 164
    //   237: aload_3
    //   238: ifnull +9 -> 247
    //   241: aload_3
    //   242: invokeinterface 171 1 0
    //   247: aload_2
    //   248: ifnull +11 -> 259
    //   251: aload_2
    //   252: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   255: aload_2
    //   256: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   259: aload_1
    //   260: athrow
    //   261: astore_2
    //   262: aload_2
    //   263: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   266: goto -7 -> 259
    //   269: astore_1
    //   270: aload_3
    //   271: astore_2
    //   272: aload 4
    //   274: astore_3
    //   275: goto -38 -> 237
    //   278: astore 5
    //   280: aload_1
    //   281: astore 4
    //   283: aload_3
    //   284: astore_2
    //   285: aload 5
    //   287: astore_1
    //   288: aload 4
    //   290: astore_3
    //   291: goto -54 -> 237
    //   294: astore_1
    //   295: aload_2
    //   296: astore 4
    //   298: aload_3
    //   299: astore_2
    //   300: aload 4
    //   302: astore_3
    //   303: goto -66 -> 237
    //   306: astore 4
    //   308: aconst_null
    //   309: astore 5
    //   311: aload_2
    //   312: astore_1
    //   313: aload 5
    //   315: astore_2
    //   316: goto -123 -> 193
    //   319: astore 4
    //   321: aload_1
    //   322: astore 5
    //   324: aload_2
    //   325: astore_1
    //   326: aload 5
    //   328: astore_2
    //   329: goto -136 -> 193
    //   332: astore_2
    //   333: aload_1
    //   334: astore 5
    //   336: aload 4
    //   338: astore_1
    //   339: aload_2
    //   340: astore 4
    //   342: aload 5
    //   344: astore_2
    //   345: goto -152 -> 193
    //   348: astore_1
    //   349: aconst_null
    //   350: astore_2
    //   351: aload 4
    //   353: astore_3
    //   354: goto -117 -> 237
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	this	IlvbDataBase
    //   0	357	1	paramString1	String
    //   0	357	2	paramString2	String
    //   31	323	3	localObject1	Object
    //   1	174	4	str1	String
    //   180	93	4	localException1	Exception
    //   281	20	4	str2	String
    //   306	1	4	localException2	Exception
    //   319	18	4	localException3	Exception
    //   340	12	4	str3	String
    //   4	184	5	localObject2	Object
    //   278	8	5	localObject3	Object
    //   309	34	5	str4	String
    //   183	8	6	localObject4	Object
    //   12	59	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   91	99	104	java/lang/Exception
    //   8	14	114	finally
    //   79	85	114	finally
    //   91	99	114	finally
    //   105	109	114	finally
    //   143	149	114	finally
    //   153	161	114	finally
    //   170	174	114	finally
    //   202	208	114	finally
    //   214	222	114	finally
    //   228	232	114	finally
    //   241	247	114	finally
    //   251	259	114	finally
    //   259	261	114	finally
    //   262	266	114	finally
    //   153	161	169	java/lang/Exception
    //   25	32	180	java/lang/Exception
    //   214	222	227	java/lang/Exception
    //   251	259	261	java/lang/Exception
    //   32	58	269	finally
    //   62	70	278	finally
    //   119	135	278	finally
    //   135	139	278	finally
    //   193	198	294	finally
    //   32	58	306	java/lang/Exception
    //   62	70	319	java/lang/Exception
    //   119	135	319	java/lang/Exception
    //   135	139	332	java/lang/Exception
    //   25	32	348	finally
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE setting (_id integer primary key autoincrement,setting_key text,setting_value text);");
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    super.onDowngrade(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  
  public void putBoolean(String paramString, boolean paramBoolean)
  {
    putString(paramString, Boolean.toString(paramBoolean));
  }
  
  public void putDouble(String paramString, double paramDouble)
  {
    putString(paramString, Double.toString(paramDouble));
  }
  
  public void putFloat(String paramString, float paramFloat)
  {
    putString(paramString, Float.toString(paramFloat));
  }
  
  public void putInt(String paramString, int paramInt)
  {
    putString(paramString, Integer.toString(paramInt));
  }
  
  public void putLong(String paramString, long paramLong)
  {
    putString(paramString, Long.toString(paramLong));
  }
  
  public void putShort(String paramString, short paramShort)
  {
    putString(paramString, Long.toString(paramShort));
  }
  
  /* Error */
  public void putString(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_1
    //   8: invokestatic 59	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   11: istore 7
    //   13: iload 7
    //   15: ifeq +6 -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: getstatic 29	com/tencent/avsdk/IlvbDataBase:sIlvbDataBase	Lcom/tencent/avsdk/IlvbDataBase;
    //   24: invokevirtual 63	com/tencent/avsdk/IlvbDataBase:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore 5
    //   29: aload 5
    //   31: astore_3
    //   32: aload 5
    //   34: astore 4
    //   36: aload 5
    //   38: invokevirtual 68	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   41: aload 5
    //   43: astore_3
    //   44: aload 5
    //   46: astore 4
    //   48: new 205	android/content/ContentValues
    //   51: dup
    //   52: invokespecial 207	android/content/ContentValues:<init>	()V
    //   55: astore 6
    //   57: aload 5
    //   59: astore_3
    //   60: aload 5
    //   62: astore 4
    //   64: aload 6
    //   66: ldc 8
    //   68: aload_1
    //   69: invokevirtual 210	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: aload 5
    //   74: astore_3
    //   75: aload 5
    //   77: astore 4
    //   79: aload 6
    //   81: ldc 11
    //   83: aload_2
    //   84: invokevirtual 210	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload 5
    //   89: astore_3
    //   90: aload 5
    //   92: astore 4
    //   94: aload 5
    //   96: ldc 17
    //   98: aload 6
    //   100: ldc 70
    //   102: iconst_1
    //   103: anewarray 72	java/lang/String
    //   106: dup
    //   107: iconst_0
    //   108: aload_1
    //   109: aastore
    //   110: invokevirtual 214	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   113: ifne +21 -> 134
    //   116: aload 5
    //   118: astore_3
    //   119: aload 5
    //   121: astore 4
    //   123: aload 5
    //   125: ldc 17
    //   127: aconst_null
    //   128: aload 6
    //   130: invokevirtual 218	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   133: pop2
    //   134: aload 5
    //   136: astore_3
    //   137: aload 5
    //   139: astore 4
    //   141: aload 5
    //   143: invokevirtual 78	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   146: aload 5
    //   148: ifnull -130 -> 18
    //   151: aload 5
    //   153: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   156: aload 5
    //   158: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   161: goto -143 -> 18
    //   164: astore_1
    //   165: aload_1
    //   166: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   169: goto -151 -> 18
    //   172: astore_1
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_1
    //   176: athrow
    //   177: astore_1
    //   178: aload_3
    //   179: astore 4
    //   181: aload_1
    //   182: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   185: aload_3
    //   186: ifnull -168 -> 18
    //   189: aload_3
    //   190: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   193: aload_3
    //   194: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   197: goto -179 -> 18
    //   200: astore_1
    //   201: aload_1
    //   202: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   205: goto -187 -> 18
    //   208: astore_1
    //   209: aload 4
    //   211: ifnull +13 -> 224
    //   214: aload 4
    //   216: invokevirtual 81	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   219: aload 4
    //   221: invokevirtual 84	android/database/sqlite/SQLiteDatabase:close	()V
    //   224: aload_1
    //   225: athrow
    //   226: astore_2
    //   227: aload_2
    //   228: invokevirtual 87	java/lang/Exception:printStackTrace	()V
    //   231: goto -7 -> 224
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	IlvbDataBase
    //   0	234	1	paramString1	String
    //   0	234	2	paramString2	String
    //   4	190	3	localObject1	Object
    //   1	219	4	localObject2	Object
    //   27	130	5	localSQLiteDatabase	SQLiteDatabase
    //   55	74	6	localContentValues	android.content.ContentValues
    //   11	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   151	161	164	java/lang/Exception
    //   7	13	172	finally
    //   151	161	172	finally
    //   165	169	172	finally
    //   189	197	172	finally
    //   201	205	172	finally
    //   214	224	172	finally
    //   224	226	172	finally
    //   227	231	172	finally
    //   21	29	177	java/lang/Exception
    //   36	41	177	java/lang/Exception
    //   48	57	177	java/lang/Exception
    //   64	72	177	java/lang/Exception
    //   79	87	177	java/lang/Exception
    //   94	116	177	java/lang/Exception
    //   123	134	177	java/lang/Exception
    //   141	146	177	java/lang/Exception
    //   189	197	200	java/lang/Exception
    //   21	29	208	finally
    //   36	41	208	finally
    //   48	57	208	finally
    //   64	72	208	finally
    //   79	87	208	finally
    //   94	116	208	finally
    //   123	134	208	finally
    //   141	146	208	finally
    //   181	185	208	finally
    //   214	224	226	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\IlvbDataBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */