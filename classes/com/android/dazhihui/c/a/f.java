package com.android.dazhihui.c.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.SelfStock;
import java.util.Vector;

public class f
{
  private static f c;
  private g a;
  private Context b;
  
  private f(Context paramContext)
  {
    this.b = paramContext;
    this.a = new g(this, this.b);
  }
  
  public static f a()
  {
    if (c == null) {}
    try
    {
      if (c == null) {
        c = new f(DzhApplication.a().getApplicationContext());
      }
      return c;
    }
    finally {}
  }
  
  /* Error */
  public long a(SelfStock paramSelfStock)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 43
    //   5: lstore 6
    //   7: aload_0
    //   8: invokevirtual 47	com/android/dazhihui/c/a/f:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore_2
    //   12: lload 6
    //   14: lstore 4
    //   16: aload_2
    //   17: ifnull +175 -> 192
    //   20: new 49	android/content/ContentValues
    //   23: dup
    //   24: invokespecial 50	android/content/ContentValues:<init>	()V
    //   27: astore_3
    //   28: aload_3
    //   29: ldc 52
    //   31: aload_1
    //   32: invokevirtual 58	com/android/dazhihui/ui/model/stock/SelfStock:getName	()Ljava/lang/String;
    //   35: invokevirtual 62	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: aload_3
    //   39: ldc 64
    //   41: aload_1
    //   42: invokevirtual 67	com/android/dazhihui/ui/model/stock/SelfStock:getCode	()Ljava/lang/String;
    //   45: invokevirtual 62	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aload_3
    //   49: ldc 69
    //   51: aload_1
    //   52: invokevirtual 73	com/android/dazhihui/ui/model/stock/SelfStock:getType	()I
    //   55: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   61: aload_3
    //   62: ldc 84
    //   64: aload_1
    //   65: invokevirtual 87	com/android/dazhihui/ui/model/stock/SelfStock:getDecLen	()I
    //   68: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   74: aload_3
    //   75: ldc 89
    //   77: aload_1
    //   78: invokevirtual 92	com/android/dazhihui/ui/model/stock/SelfStock:getClosePrice	()I
    //   81: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   84: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   87: aload_3
    //   88: ldc 94
    //   90: aload_1
    //   91: invokevirtual 97	com/android/dazhihui/ui/model/stock/SelfStock:getLatestPrice	()I
    //   94: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   100: aload_3
    //   101: ldc 99
    //   103: aload_1
    //   104: invokevirtual 103	com/android/dazhihui/ui/model/stock/SelfStock:isLoan	()Z
    //   107: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   110: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   113: aload_3
    //   114: ldc 113
    //   116: aload_1
    //   117: invokevirtual 116	com/android/dazhihui/ui/model/stock/SelfStock:getBulletin	()I
    //   120: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   126: aload_3
    //   127: ldc 118
    //   129: aload_1
    //   130: invokevirtual 121	com/android/dazhihui/ui/model/stock/SelfStock:getSelfType	()I
    //   133: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   139: aload_3
    //   140: ldc 123
    //   142: aload_1
    //   143: invokevirtual 126	com/android/dazhihui/ui/model/stock/SelfStock:getTradeVolumn	()I
    //   146: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   149: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   152: aload_3
    //   153: ldc -128
    //   155: aload_1
    //   156: invokevirtual 131	com/android/dazhihui/ui/model/stock/SelfStock:getTradeNumbers	()I
    //   159: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   162: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   165: aload_3
    //   166: ldc -123
    //   168: aload_1
    //   169: invokevirtual 136	com/android/dazhihui/ui/model/stock/SelfStock:getPingTop	()Z
    //   172: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   175: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   178: aload_2
    //   179: ldc -118
    //   181: aconst_null
    //   182: aload_3
    //   183: invokevirtual 144	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   186: lstore 4
    //   188: aload_2
    //   189: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   192: aload_0
    //   193: monitorexit
    //   194: lload 4
    //   196: lreturn
    //   197: astore_1
    //   198: aload_1
    //   199: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   202: aload_2
    //   203: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   206: lload 6
    //   208: lstore 4
    //   210: goto -18 -> 192
    //   213: astore_1
    //   214: aload_0
    //   215: monitorexit
    //   216: aload_1
    //   217: athrow
    //   218: astore_1
    //   219: aload_2
    //   220: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   223: aload_1
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	f
    //   0	225	1	paramSelfStock	SelfStock
    //   11	209	2	localSQLiteDatabase	SQLiteDatabase
    //   27	156	3	localContentValues	ContentValues
    //   14	195	4	l1	long
    //   5	202	6	l2	long
    // Exception table:
    //   from	to	target	type
    //   20	188	197	java/lang/Exception
    //   7	12	213	finally
    //   188	192	213	finally
    //   202	206	213	finally
    //   219	225	213	finally
    //   20	188	218	finally
    //   198	202	218	finally
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 157	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokevirtual 47	com/android/dazhihui/c/a/f:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull -9 -> 11
    //   23: aload_2
    //   24: ldc -118
    //   26: ldc -97
    //   28: iconst_1
    //   29: anewarray 161	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: aload_1
    //   35: aastore
    //   36: invokevirtual 165	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   39: pop
    //   40: aload_2
    //   41: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   44: goto -33 -> 11
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    //   52: astore_1
    //   53: aload_1
    //   54: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   57: aload_2
    //   58: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   61: goto -50 -> 11
    //   64: astore_1
    //   65: aload_2
    //   66: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   69: aload_1
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	f
    //   0	71	1	paramString	String
    //   18	48	2	localSQLiteDatabase	SQLiteDatabase
    //   6	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	47	finally
    //   14	19	47	finally
    //   40	44	47	finally
    //   57	61	47	finally
    //   65	71	47	finally
    //   23	40	52	java/lang/Exception
    //   23	40	64	finally
    //   53	57	64	finally
  }
  
  /* Error */
  public void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: invokestatic 157	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifne +14 -> 20
    //   9: aload_1
    //   10: invokestatic 157	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: invokevirtual 47	com/android/dazhihui/c/a/f:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_3
    //   28: aload_3
    //   29: ifnull -9 -> 20
    //   32: aload_3
    //   33: ldc -118
    //   35: ldc -89
    //   37: iconst_2
    //   38: anewarray 161	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: aload_1
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: aload_2
    //   48: aastore
    //   49: invokevirtual 165	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   52: pop
    //   53: aload_3
    //   54: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   57: goto -37 -> 20
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: aload_1
    //   67: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   70: aload_3
    //   71: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   74: goto -54 -> 20
    //   77: astore_1
    //   78: aload_3
    //   79: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	f
    //   0	84	1	paramString1	String
    //   0	84	2	paramString2	String
    //   27	52	3	localSQLiteDatabase	SQLiteDatabase
    //   13	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	15	60	finally
    //   23	28	60	finally
    //   53	57	60	finally
    //   70	74	60	finally
    //   78	84	60	finally
    //   32	53	65	java/lang/Exception
    //   32	53	77	finally
    //   66	70	77	finally
  }
  
  /* Error */
  public void a(Vector<SelfStock> paramVector1, Vector<SelfStock> paramVector2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 8
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_1
    //   6: invokevirtual 173	java/util/Vector:size	()I
    //   9: ifgt +17 -> 26
    //   12: aload_2
    //   13: invokevirtual 173	java/util/Vector:size	()I
    //   16: istore 6
    //   18: iload 6
    //   20: ifgt +6 -> 26
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: aload_0
    //   27: invokevirtual 47	com/android/dazhihui/c/a/f:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore_3
    //   31: aload_3
    //   32: ifnull -9 -> 23
    //   35: aload_3
    //   36: invokevirtual 176	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 8
    //   44: istore 7
    //   46: iload 6
    //   48: aload_1
    //   49: invokevirtual 173	java/util/Vector:size	()I
    //   52: if_icmpge +202 -> 254
    //   55: aload_1
    //   56: iload 6
    //   58: invokevirtual 180	java/util/Vector:get	(I)Ljava/lang/Object;
    //   61: checkcast 54	com/android/dazhihui/ui/model/stock/SelfStock
    //   64: astore 4
    //   66: new 49	android/content/ContentValues
    //   69: dup
    //   70: invokespecial 50	android/content/ContentValues:<init>	()V
    //   73: astore 5
    //   75: aload 5
    //   77: ldc 52
    //   79: aload 4
    //   81: invokevirtual 58	com/android/dazhihui/ui/model/stock/SelfStock:getName	()Ljava/lang/String;
    //   84: invokevirtual 62	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload 5
    //   89: ldc 69
    //   91: aload 4
    //   93: invokevirtual 73	com/android/dazhihui/ui/model/stock/SelfStock:getType	()I
    //   96: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   99: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   102: aload 5
    //   104: ldc 84
    //   106: aload 4
    //   108: invokevirtual 87	com/android/dazhihui/ui/model/stock/SelfStock:getDecLen	()I
    //   111: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   114: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   117: aload 5
    //   119: ldc 89
    //   121: aload 4
    //   123: invokevirtual 92	com/android/dazhihui/ui/model/stock/SelfStock:getClosePrice	()I
    //   126: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   132: aload 5
    //   134: ldc 94
    //   136: aload 4
    //   138: invokevirtual 97	com/android/dazhihui/ui/model/stock/SelfStock:getLatestPrice	()I
    //   141: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   144: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   147: aload 5
    //   149: ldc 99
    //   151: aload 4
    //   153: invokevirtual 103	com/android/dazhihui/ui/model/stock/SelfStock:isLoan	()Z
    //   156: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   159: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   162: aload 5
    //   164: ldc 113
    //   166: aload 4
    //   168: invokevirtual 116	com/android/dazhihui/ui/model/stock/SelfStock:getBulletin	()I
    //   171: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   177: aload 5
    //   179: ldc 123
    //   181: aload 4
    //   183: invokevirtual 126	com/android/dazhihui/ui/model/stock/SelfStock:getTradeVolumn	()I
    //   186: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   192: aload 5
    //   194: ldc -128
    //   196: aload 4
    //   198: invokevirtual 131	com/android/dazhihui/ui/model/stock/SelfStock:getTradeNumbers	()I
    //   201: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   204: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   207: aload 5
    //   209: ldc -123
    //   211: aload 4
    //   213: invokevirtual 136	com/android/dazhihui/ui/model/stock/SelfStock:getPingTop	()Z
    //   216: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   219: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   222: aload_3
    //   223: ldc -118
    //   225: aload 5
    //   227: ldc -74
    //   229: iconst_1
    //   230: anewarray 161	java/lang/String
    //   233: dup
    //   234: iconst_0
    //   235: aload 4
    //   237: invokevirtual 67	com/android/dazhihui/ui/model/stock/SelfStock:getCode	()Ljava/lang/String;
    //   240: aastore
    //   241: invokevirtual 186	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   244: pop
    //   245: iload 6
    //   247: iconst_1
    //   248: iadd
    //   249: istore 6
    //   251: goto -209 -> 42
    //   254: iload 7
    //   256: aload_2
    //   257: invokevirtual 173	java/util/Vector:size	()I
    //   260: if_icmpge +190 -> 450
    //   263: aload_2
    //   264: iload 7
    //   266: invokevirtual 180	java/util/Vector:get	(I)Ljava/lang/Object;
    //   269: checkcast 54	com/android/dazhihui/ui/model/stock/SelfStock
    //   272: astore_1
    //   273: new 49	android/content/ContentValues
    //   276: dup
    //   277: invokespecial 50	android/content/ContentValues:<init>	()V
    //   280: astore 4
    //   282: aload 4
    //   284: ldc 52
    //   286: aload_1
    //   287: invokevirtual 58	com/android/dazhihui/ui/model/stock/SelfStock:getName	()Ljava/lang/String;
    //   290: invokevirtual 62	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   293: aload 4
    //   295: ldc 69
    //   297: aload_1
    //   298: invokevirtual 73	com/android/dazhihui/ui/model/stock/SelfStock:getType	()I
    //   301: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   304: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   307: aload 4
    //   309: ldc 84
    //   311: aload_1
    //   312: invokevirtual 87	com/android/dazhihui/ui/model/stock/SelfStock:getDecLen	()I
    //   315: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   318: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   321: aload 4
    //   323: ldc 89
    //   325: aload_1
    //   326: invokevirtual 92	com/android/dazhihui/ui/model/stock/SelfStock:getClosePrice	()I
    //   329: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   332: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   335: aload 4
    //   337: ldc 94
    //   339: aload_1
    //   340: invokevirtual 97	com/android/dazhihui/ui/model/stock/SelfStock:getLatestPrice	()I
    //   343: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   346: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   349: aload 4
    //   351: ldc 99
    //   353: aload_1
    //   354: invokevirtual 103	com/android/dazhihui/ui/model/stock/SelfStock:isLoan	()Z
    //   357: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   360: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   363: aload 4
    //   365: ldc 113
    //   367: aload_1
    //   368: invokevirtual 116	com/android/dazhihui/ui/model/stock/SelfStock:getBulletin	()I
    //   371: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   374: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   377: aload 4
    //   379: ldc 123
    //   381: aload_1
    //   382: invokevirtual 126	com/android/dazhihui/ui/model/stock/SelfStock:getTradeVolumn	()I
    //   385: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   391: aload 4
    //   393: ldc -128
    //   395: aload_1
    //   396: invokevirtual 131	com/android/dazhihui/ui/model/stock/SelfStock:getTradeNumbers	()I
    //   399: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   402: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   405: aload 4
    //   407: ldc -123
    //   409: aload_1
    //   410: invokevirtual 136	com/android/dazhihui/ui/model/stock/SelfStock:getPingTop	()Z
    //   413: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   416: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   419: aload_3
    //   420: ldc -118
    //   422: aload 4
    //   424: ldc -74
    //   426: iconst_1
    //   427: anewarray 161	java/lang/String
    //   430: dup
    //   431: iconst_0
    //   432: aload_1
    //   433: invokevirtual 67	com/android/dazhihui/ui/model/stock/SelfStock:getCode	()Ljava/lang/String;
    //   436: aastore
    //   437: invokevirtual 186	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   440: pop
    //   441: iload 7
    //   443: iconst_1
    //   444: iadd
    //   445: istore 7
    //   447: goto -193 -> 254
    //   450: aload_3
    //   451: invokevirtual 189	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   454: aload_3
    //   455: invokevirtual 192	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   458: aload_3
    //   459: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   462: goto -439 -> 23
    //   465: astore_1
    //   466: aload_0
    //   467: monitorexit
    //   468: aload_1
    //   469: athrow
    //   470: astore_1
    //   471: aload_1
    //   472: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   475: aload_3
    //   476: invokevirtual 192	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   479: aload_3
    //   480: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   483: goto -460 -> 23
    //   486: astore_1
    //   487: aload_3
    //   488: invokevirtual 192	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   491: aload_3
    //   492: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   495: aload_1
    //   496: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	497	0	this	f
    //   0	497	1	paramVector1	Vector<SelfStock>
    //   0	497	2	paramVector2	Vector<SelfStock>
    //   30	462	3	localSQLiteDatabase	SQLiteDatabase
    //   64	359	4	localObject	Object
    //   73	153	5	localContentValues	ContentValues
    //   16	234	6	i	int
    //   44	402	7	j	int
    //   1	42	8	k	int
    // Exception table:
    //   from	to	target	type
    //   5	18	465	finally
    //   26	31	465	finally
    //   454	462	465	finally
    //   475	483	465	finally
    //   487	497	465	finally
    //   35	39	470	java/lang/Exception
    //   46	245	470	java/lang/Exception
    //   254	441	470	java/lang/Exception
    //   450	454	470	java/lang/Exception
    //   35	39	486	finally
    //   46	245	486	finally
    //   254	441	486	finally
    //   450	454	486	finally
    //   471	475	486	finally
  }
  
  public boolean a(Vector<SelfStock> paramVector)
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        int i = paramVector.size();
        if (i <= 0) {
          return bool;
        }
        SQLiteDatabase localSQLiteDatabase = b();
        if (localSQLiteDatabase != null) {
          try
          {
            localSQLiteDatabase.beginTransaction();
            i = paramVector.size() - 1;
            if (i >= 0)
            {
              SelfStock localSelfStock = (SelfStock)paramVector.get(i);
              ContentValues localContentValues = new ContentValues();
              localContentValues.put("name", localSelfStock.getName());
              localContentValues.put("code", localSelfStock.getCode());
              localContentValues.put("type", Integer.valueOf(localSelfStock.getType()));
              localContentValues.put("decf_len", Integer.valueOf(localSelfStock.getDecLen()));
              localContentValues.put("close_price", Integer.valueOf(localSelfStock.getClosePrice()));
              localContentValues.put("latest_price", Integer.valueOf(localSelfStock.getLatestPrice()));
              localContentValues.put("loan", Boolean.valueOf(localSelfStock.isLoan()));
              localContentValues.put("bulletin", Integer.valueOf(localSelfStock.getBulletin()));
              localContentValues.put("self_type", Integer.valueOf(localSelfStock.getSelfType()));
              localContentValues.put("trade_volumn", Integer.valueOf(localSelfStock.getTradeVolumn()));
              localContentValues.put("trade_numbers", Integer.valueOf(localSelfStock.getTradeNumbers()));
              localContentValues.put("ping_top", Boolean.valueOf(localSelfStock.getPingTop()));
              localSQLiteDatabase.insert("self_stock", null, localContentValues);
              i -= 1;
              continue;
            }
            localSQLiteDatabase.setTransactionSuccessful();
            bool = true;
            localSQLiteDatabase.endTransaction();
            localSQLiteDatabase.close();
            continue;
          }
          catch (Exception paramVector)
          {
            paramVector.printStackTrace();
            localSQLiteDatabase.endTransaction();
            localSQLiteDatabase.close();
            bool = false;
            continue;
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
            localSQLiteDatabase.close();
          }
        } else {
          bool = false;
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public int b(SelfStock paramSelfStock)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: invokevirtual 47	com/android/dazhihui/c/a/f:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   9: astore_2
    //   10: iload 5
    //   12: istore 4
    //   14: aload_2
    //   15: ifnull +174 -> 189
    //   18: new 49	android/content/ContentValues
    //   21: dup
    //   22: invokespecial 50	android/content/ContentValues:<init>	()V
    //   25: astore_3
    //   26: aload_3
    //   27: ldc 52
    //   29: aload_1
    //   30: invokevirtual 58	com/android/dazhihui/ui/model/stock/SelfStock:getName	()Ljava/lang/String;
    //   33: invokevirtual 62	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload_3
    //   37: ldc 69
    //   39: aload_1
    //   40: invokevirtual 73	com/android/dazhihui/ui/model/stock/SelfStock:getType	()I
    //   43: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   49: aload_3
    //   50: ldc 84
    //   52: aload_1
    //   53: invokevirtual 87	com/android/dazhihui/ui/model/stock/SelfStock:getDecLen	()I
    //   56: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   59: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   62: aload_3
    //   63: ldc 89
    //   65: aload_1
    //   66: invokevirtual 92	com/android/dazhihui/ui/model/stock/SelfStock:getClosePrice	()I
    //   69: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   75: aload_3
    //   76: ldc 94
    //   78: aload_1
    //   79: invokevirtual 97	com/android/dazhihui/ui/model/stock/SelfStock:getLatestPrice	()I
    //   82: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   85: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   88: aload_3
    //   89: ldc 99
    //   91: aload_1
    //   92: invokevirtual 103	com/android/dazhihui/ui/model/stock/SelfStock:isLoan	()Z
    //   95: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   98: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   101: aload_3
    //   102: ldc 113
    //   104: aload_1
    //   105: invokevirtual 116	com/android/dazhihui/ui/model/stock/SelfStock:getBulletin	()I
    //   108: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   114: aload_3
    //   115: ldc 123
    //   117: aload_1
    //   118: invokevirtual 126	com/android/dazhihui/ui/model/stock/SelfStock:getTradeVolumn	()I
    //   121: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   124: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   127: aload_3
    //   128: ldc -128
    //   130: aload_1
    //   131: invokevirtual 131	com/android/dazhihui/ui/model/stock/SelfStock:getTradeNumbers	()I
    //   134: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: invokevirtual 82	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   140: aload_3
    //   141: ldc -123
    //   143: aload_1
    //   144: invokevirtual 136	com/android/dazhihui/ui/model/stock/SelfStock:getPingTop	()Z
    //   147: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   150: invokevirtual 111	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   153: aload_2
    //   154: ldc -118
    //   156: aload_3
    //   157: ldc -89
    //   159: iconst_2
    //   160: anewarray 161	java/lang/String
    //   163: dup
    //   164: iconst_0
    //   165: aload_1
    //   166: invokevirtual 67	com/android/dazhihui/ui/model/stock/SelfStock:getCode	()Ljava/lang/String;
    //   169: aastore
    //   170: dup
    //   171: iconst_1
    //   172: aload_1
    //   173: invokevirtual 121	com/android/dazhihui/ui/model/stock/SelfStock:getSelfType	()I
    //   176: invokestatic 200	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   179: aastore
    //   180: invokevirtual 186	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   183: istore 4
    //   185: aload_2
    //   186: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   189: aload_0
    //   190: monitorexit
    //   191: iload 4
    //   193: ireturn
    //   194: astore_1
    //   195: aload_1
    //   196: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   199: aload_2
    //   200: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   203: iload 5
    //   205: istore 4
    //   207: goto -18 -> 189
    //   210: astore_1
    //   211: aload_0
    //   212: monitorexit
    //   213: aload_1
    //   214: athrow
    //   215: astore_1
    //   216: aload_2
    //   217: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   220: aload_1
    //   221: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	f
    //   0	222	1	paramSelfStock	SelfStock
    //   9	208	2	localSQLiteDatabase	SQLiteDatabase
    //   25	132	3	localContentValues	ContentValues
    //   12	194	4	i	int
    //   1	203	5	j	int
    // Exception table:
    //   from	to	target	type
    //   18	185	194	java/lang/Exception
    //   5	10	210	finally
    //   185	189	210	finally
    //   199	203	210	finally
    //   216	222	210	finally
    //   18	185	215	finally
    //   195	199	215	finally
  }
  
  public SQLiteDatabase b()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.a.getWritableDatabase();
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
  
  /* Error */
  public Vector<SelfStock> b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 206	com/android/dazhihui/c/a/f:c	()Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_3
    //   7: aconst_null
    //   8: astore_2
    //   9: iconst_0
    //   10: invokestatic 200	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   13: aload_1
    //   14: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   17: ifeq +6 -> 23
    //   20: ldc -44
    //   22: astore_2
    //   23: new 170	java/util/Vector
    //   26: dup
    //   27: invokespecial 213	java/util/Vector:<init>	()V
    //   30: astore 4
    //   32: aload_3
    //   33: ifnull +231 -> 264
    //   36: aload_3
    //   37: ldc -118
    //   39: aconst_null
    //   40: ldc -97
    //   42: iconst_1
    //   43: anewarray 161	java/lang/String
    //   46: dup
    //   47: iconst_0
    //   48: aload_1
    //   49: aastore
    //   50: aconst_null
    //   51: aconst_null
    //   52: aload_2
    //   53: aconst_null
    //   54: invokevirtual 217	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +191 -> 250
    //   62: aload_1
    //   63: invokeinterface 222 1 0
    //   68: istore 14
    //   70: iload 14
    //   72: ifeq +172 -> 244
    //   75: aload_1
    //   76: iconst_1
    //   77: invokeinterface 225 2 0
    //   82: astore_2
    //   83: aload_1
    //   84: iconst_2
    //   85: invokeinterface 225 2 0
    //   90: astore 5
    //   92: aload_1
    //   93: iconst_3
    //   94: invokeinterface 229 2 0
    //   99: istore 6
    //   101: aload_1
    //   102: iconst_4
    //   103: invokeinterface 229 2 0
    //   108: istore 7
    //   110: aload_1
    //   111: iconst_5
    //   112: invokeinterface 229 2 0
    //   117: istore 8
    //   119: aload_1
    //   120: bipush 6
    //   122: invokeinterface 229 2 0
    //   127: istore 9
    //   129: aload_1
    //   130: bipush 7
    //   132: invokeinterface 229 2 0
    //   137: ifne +192 -> 329
    //   140: iconst_0
    //   141: istore 14
    //   143: aload_1
    //   144: bipush 8
    //   146: invokeinterface 229 2 0
    //   151: istore 10
    //   153: aload_1
    //   154: bipush 9
    //   156: invokeinterface 229 2 0
    //   161: istore 11
    //   163: aload_1
    //   164: bipush 10
    //   166: invokeinterface 229 2 0
    //   171: istore 12
    //   173: aload_1
    //   174: bipush 11
    //   176: invokeinterface 229 2 0
    //   181: istore 13
    //   183: aload_1
    //   184: bipush 12
    //   186: invokeinterface 229 2 0
    //   191: ifne +144 -> 335
    //   194: iconst_0
    //   195: istore 15
    //   197: aload 4
    //   199: iconst_0
    //   200: new 54	com/android/dazhihui/ui/model/stock/SelfStock
    //   203: dup
    //   204: aload_2
    //   205: aload 5
    //   207: iload 6
    //   209: iload 7
    //   211: iload 8
    //   213: iload 9
    //   215: iload 14
    //   217: iload 10
    //   219: iload 11
    //   221: iload 12
    //   223: iload 13
    //   225: iload 15
    //   227: invokespecial 232	com/android/dazhihui/ui/model/stock/SelfStock:<init>	(Ljava/lang/String;Ljava/lang/String;IIIIZIIIIZ)V
    //   230: invokevirtual 236	java/util/Vector:add	(ILjava/lang/Object;)V
    //   233: aload_1
    //   234: invokeinterface 239 1 0
    //   239: istore 14
    //   241: goto -171 -> 70
    //   244: aload_1
    //   245: invokeinterface 240 1 0
    //   250: aload_1
    //   251: ifnull +9 -> 260
    //   254: aload_1
    //   255: invokeinterface 240 1 0
    //   260: aload_3
    //   261: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   264: aload_0
    //   265: monitorexit
    //   266: aload 4
    //   268: areturn
    //   269: astore_2
    //   270: aconst_null
    //   271: astore_1
    //   272: aload_2
    //   273: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   276: aload_1
    //   277: ifnull +9 -> 286
    //   280: aload_1
    //   281: invokeinterface 240 1 0
    //   286: aload_3
    //   287: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   290: goto -26 -> 264
    //   293: astore_1
    //   294: aload_0
    //   295: monitorexit
    //   296: aload_1
    //   297: athrow
    //   298: astore_2
    //   299: aconst_null
    //   300: astore_1
    //   301: aload_1
    //   302: ifnull +9 -> 311
    //   305: aload_1
    //   306: invokeinterface 240 1 0
    //   311: aload_3
    //   312: invokevirtual 147	android/database/sqlite/SQLiteDatabase:close	()V
    //   315: aload_2
    //   316: athrow
    //   317: astore_2
    //   318: goto -17 -> 301
    //   321: astore_2
    //   322: goto -21 -> 301
    //   325: astore_2
    //   326: goto -54 -> 272
    //   329: iconst_1
    //   330: istore 14
    //   332: goto -189 -> 143
    //   335: iconst_1
    //   336: istore 15
    //   338: goto -141 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	this	f
    //   0	341	1	paramString	String
    //   8	197	2	str1	String
    //   269	4	2	localException1	Exception
    //   298	18	2	localObject1	Object
    //   317	1	2	localObject2	Object
    //   321	1	2	localObject3	Object
    //   325	1	2	localException2	Exception
    //   6	306	3	localSQLiteDatabase	SQLiteDatabase
    //   30	237	4	localVector	Vector
    //   90	116	5	str2	String
    //   99	109	6	i	int
    //   108	102	7	j	int
    //   117	95	8	k	int
    //   127	87	9	m	int
    //   151	67	10	n	int
    //   161	59	11	i1	int
    //   171	51	12	i2	int
    //   181	43	13	i3	int
    //   68	263	14	bool1	boolean
    //   195	142	15	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   36	58	269	java/lang/Exception
    //   2	7	293	finally
    //   9	20	293	finally
    //   23	32	293	finally
    //   254	260	293	finally
    //   260	264	293	finally
    //   280	286	293	finally
    //   286	290	293	finally
    //   305	311	293	finally
    //   311	317	293	finally
    //   36	58	298	finally
    //   62	70	317	finally
    //   75	140	317	finally
    //   143	194	317	finally
    //   197	241	317	finally
    //   244	250	317	finally
    //   272	276	321	finally
    //   62	70	325	java/lang/Exception
    //   75	140	325	java/lang/Exception
    //   143	194	325	java/lang/Exception
    //   197	241	325	java/lang/Exception
    //   244	250	325	java/lang/Exception
  }
  
  public SQLiteDatabase c()
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */