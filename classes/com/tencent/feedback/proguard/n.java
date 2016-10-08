package com.tencent.feedback.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.feedback.common.e;

public final class n
  extends SQLiteOpenHelper
{
  private Context a;
  
  public n(Context paramContext)
  {
    super(paramContext, "eup_db", null, 14);
    this.a = paramContext;
  }
  
  /* Error */
  private boolean a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 21	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 24	java/util/ArrayList:<init>	()V
    //   9: astore 4
    //   11: aload_1
    //   12: ldc 26
    //   14: iconst_1
    //   15: anewarray 28	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc 30
    //   22: aastore
    //   23: ldc 32
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: invokevirtual 38	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore_3
    //   33: aload_3
    //   34: ifnull +68 -> 102
    //   37: aload_3
    //   38: astore_2
    //   39: aload_3
    //   40: invokeinterface 44 1 0
    //   45: ifeq +57 -> 102
    //   48: aload_3
    //   49: astore_2
    //   50: aload 4
    //   52: aload_3
    //   53: iconst_0
    //   54: invokeinterface 48 2 0
    //   59: invokeinterface 54 2 0
    //   64: pop
    //   65: goto -28 -> 37
    //   68: astore_1
    //   69: aload_3
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 57	java/lang/Throwable:printStackTrace	()V
    //   75: aload_3
    //   76: ifnull +18 -> 94
    //   79: aload_3
    //   80: invokeinterface 60 1 0
    //   85: ifne +9 -> 94
    //   88: aload_3
    //   89: invokeinterface 63 1 0
    //   94: iconst_0
    //   95: istore 6
    //   97: aload_0
    //   98: monitorexit
    //   99: iload 6
    //   101: ireturn
    //   102: aload_3
    //   103: astore_2
    //   104: aload 4
    //   106: invokeinterface 67 1 0
    //   111: ifle +109 -> 220
    //   114: aload_3
    //   115: astore_2
    //   116: aload 4
    //   118: invokeinterface 71 1 0
    //   123: astore 4
    //   125: aload_3
    //   126: astore_2
    //   127: aload 4
    //   129: invokeinterface 76 1 0
    //   134: ifeq +86 -> 220
    //   137: aload_3
    //   138: astore_2
    //   139: aload 4
    //   141: invokeinterface 80 1 0
    //   146: checkcast 28	java/lang/String
    //   149: astore 5
    //   151: aload_3
    //   152: astore_2
    //   153: aload_1
    //   154: getstatic 86	java/util/Locale:US	Ljava/util/Locale;
    //   157: ldc 88
    //   159: iconst_1
    //   160: anewarray 90	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload 5
    //   167: aastore
    //   168: invokestatic 94	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   171: invokevirtual 98	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   174: aload_3
    //   175: astore_2
    //   176: ldc 100
    //   178: iconst_1
    //   179: anewarray 90	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: aload 5
    //   186: aastore
    //   187: invokestatic 106	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: goto -65 -> 125
    //   193: astore_1
    //   194: aload_2
    //   195: ifnull +18 -> 213
    //   198: aload_2
    //   199: invokeinterface 60 1 0
    //   204: ifne +9 -> 213
    //   207: aload_2
    //   208: invokeinterface 63 1 0
    //   213: aload_1
    //   214: athrow
    //   215: astore_1
    //   216: aload_0
    //   217: monitorexit
    //   218: aload_1
    //   219: athrow
    //   220: aload_3
    //   221: ifnull +18 -> 239
    //   224: aload_3
    //   225: invokeinterface 60 1 0
    //   230: ifne +9 -> 239
    //   233: aload_3
    //   234: invokeinterface 63 1 0
    //   239: iconst_1
    //   240: istore 6
    //   242: goto -145 -> 97
    //   245: astore_1
    //   246: aconst_null
    //   247: astore_2
    //   248: goto -54 -> 194
    //   251: astore_1
    //   252: aconst_null
    //   253: astore_3
    //   254: goto -185 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	n
    //   0	257	1	paramSQLiteDatabase	SQLiteDatabase
    //   38	210	2	localCursor1	android.database.Cursor
    //   32	222	3	localCursor2	android.database.Cursor
    //   9	131	4	localObject	Object
    //   149	36	5	str	String
    //   95	146	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   39	48	68	java/lang/Throwable
    //   50	65	68	java/lang/Throwable
    //   104	114	68	java/lang/Throwable
    //   116	125	68	java/lang/Throwable
    //   127	137	68	java/lang/Throwable
    //   139	151	68	java/lang/Throwable
    //   153	174	68	java/lang/Throwable
    //   176	190	68	java/lang/Throwable
    //   39	48	193	finally
    //   50	65	193	finally
    //   71	75	193	finally
    //   104	114	193	finally
    //   116	125	193	finally
    //   127	137	193	finally
    //   139	151	193	finally
    //   153	174	193	finally
    //   176	190	193	finally
    //   79	94	215	finally
    //   198	213	215	finally
    //   213	215	215	finally
    //   224	239	215	finally
    //   2	33	245	finally
    //   2	33	251	java/lang/Throwable
  }
  
  public final SQLiteDatabase getReadableDatabase()
  {
    int i = 0;
    Object localObject = null;
    while ((localObject == null) && (i < 5))
    {
      i += 1;
      try
      {
        SQLiteDatabase localSQLiteDatabase2 = super.getReadableDatabase();
        localObject = localSQLiteDatabase2;
      }
      catch (Throwable localThrowable)
      {
        e.c("rqdp{  getReadableDatabase error count} %d", new Object[] { Integer.valueOf(i) });
        if (i == 5) {
          e.d("rqdp{  error get DB failed}", new Object[0]);
        }
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
      finally {}
    }
    return localSQLiteDatabase1;
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    int i = 0;
    Object localObject = null;
    while ((localObject == null) && (i < 5))
    {
      i += 1;
      try
      {
        SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
        localObject = localSQLiteDatabase2;
      }
      catch (Exception localException)
      {
        e.c("rqdp{  getWritableDatabase error count} %d", new Object[] { Integer.valueOf(i) });
        if (i == 5) {
          e.d("rqdp{  error get DB failed}", new Object[0]);
        }
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
      finally {}
    }
    return localSQLiteDatabase1;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    if (paramSQLiteDatabase != null) {}
    try
    {
      if (m.a != null)
      {
        String[][] arrayOfString = m.a;
        int j = arrayOfString.length;
        while (i < j)
        {
          String[] arrayOfString1 = arrayOfString[i];
          e.g("rqdp{  table:}%s %s", new Object[] { arrayOfString1[0], arrayOfString1[1] });
          paramSQLiteDatabase.execSQL(arrayOfString1[1]);
          i += 1;
        }
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  @android.annotation.TargetApi(11)
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	com/tencent/feedback/proguard/n:a	Landroid/content/Context;
    //   6: invokestatic 163	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   9: pop
    //   10: invokestatic 166	com/tencent/feedback/common/d:c	()Ljava/lang/String;
    //   13: invokestatic 170	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   16: bipush 11
    //   18: if_icmplt +53 -> 71
    //   21: ldc -84
    //   23: iconst_3
    //   24: anewarray 90	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: ldc 10
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: iload_2
    //   35: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   38: aastore
    //   39: dup
    //   40: iconst_2
    //   41: iload_3
    //   42: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   45: aastore
    //   46: invokestatic 106	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: aload_0
    //   50: aload_1
    //   51: invokespecial 174	com/tencent/feedback/proguard/n:a	(Landroid/database/sqlite/SQLiteDatabase;)Z
    //   54: ifeq +20 -> 74
    //   57: ldc -80
    //   59: iconst_0
    //   60: anewarray 90	java/lang/Object
    //   63: invokestatic 106	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: aload_0
    //   67: aload_1
    //   68: invokevirtual 178	com/tencent/feedback/proguard/n:onCreate	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: ldc -76
    //   76: iconst_0
    //   77: anewarray 90	java/lang/Object
    //   80: invokestatic 128	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_0
    //   84: getfield 15	com/tencent/feedback/proguard/n:a	Landroid/content/Context;
    //   87: ldc 10
    //   89: invokevirtual 186	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   92: astore_1
    //   93: aload_1
    //   94: ifnull -23 -> 71
    //   97: aload_1
    //   98: invokevirtual 191	java/io/File:canWrite	()Z
    //   101: ifeq -30 -> 71
    //   104: aload_1
    //   105: invokevirtual 194	java/io/File:delete	()Z
    //   108: pop
    //   109: goto -38 -> 71
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	n
    //   0	117	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	117	2	paramInt1	int
    //   0	117	3	paramInt2	int
    // Exception table:
    //   from	to	target	type
    //   2	71	112	finally
    //   74	93	112	finally
    //   97	109	112	finally
  }
  
  /* Error */
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -58
    //   4: iconst_3
    //   5: anewarray 90	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: ldc 10
    //   12: aastore
    //   13: dup
    //   14: iconst_1
    //   15: iload_2
    //   16: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   19: aastore
    //   20: dup
    //   21: iconst_2
    //   22: iload_3
    //   23: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   26: aastore
    //   27: invokestatic 106	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial 174	com/tencent/feedback/proguard/n:a	(Landroid/database/sqlite/SQLiteDatabase;)Z
    //   35: ifeq +20 -> 55
    //   38: ldc -80
    //   40: iconst_0
    //   41: anewarray 90	java/lang/Object
    //   44: invokestatic 106	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload_0
    //   48: aload_1
    //   49: invokevirtual 178	com/tencent/feedback/proguard/n:onCreate	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: ldc -76
    //   57: iconst_0
    //   58: anewarray 90	java/lang/Object
    //   61: invokestatic 128	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload_0
    //   65: getfield 15	com/tencent/feedback/proguard/n:a	Landroid/content/Context;
    //   68: ldc 10
    //   70: invokevirtual 186	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   73: astore_1
    //   74: aload_1
    //   75: ifnull -23 -> 52
    //   78: aload_1
    //   79: invokevirtual 191	java/io/File:canWrite	()Z
    //   82: ifeq -30 -> 52
    //   85: aload_1
    //   86: invokevirtual 194	java/io/File:delete	()Z
    //   89: pop
    //   90: goto -38 -> 52
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	n
    //   0	98	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	98	2	paramInt1	int
    //   0	98	3	paramInt2	int
    // Exception table:
    //   from	to	target	type
    //   2	52	93	finally
    //   55	74	93	finally
    //   78	90	93	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */