package com.alipay.sdk.i;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.alipay.sdk.d.b;
import java.lang.ref.WeakReference;

public final class a
  extends SQLiteOpenHelper
{
  private WeakReference<Context> a;
  
  public a(Context paramContext)
  {
    super(paramContext, "msp.db", null, 1);
    this.a = new WeakReference(paramContext);
  }
  
  static void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    try
    {
      paramSQLiteDatabase.delete("tb_tid", "name=?", new String[] { paramString });
      return;
    }
    catch (Exception paramSQLiteDatabase) {}
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase2 = null;
    SQLiteDatabase localSQLiteDatabase1 = null;
    for (;;)
    {
      try
      {
        paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("select count(*) from tb_tid where name=?", new String[] { c(paramString1, paramString2) });
        localSQLiteDatabase1 = paramSQLiteDatabase;
        localSQLiteDatabase2 = paramSQLiteDatabase;
        if (!paramSQLiteDatabase.moveToFirst()) {
          break label112;
        }
        localSQLiteDatabase1 = paramSQLiteDatabase;
        localSQLiteDatabase2 = paramSQLiteDatabase;
        i = paramSQLiteDatabase.getInt(0);
      }
      catch (Exception paramSQLiteDatabase)
      {
        if (localSQLiteDatabase1 == null) {
          break label103;
        }
        localSQLiteDatabase1.close();
        i = 0;
        continue;
      }
      finally
      {
        if (localSQLiteDatabase2 == null) {
          continue;
        }
        localSQLiteDatabase2.close();
      }
      return i > 0;
      label103:
      int i = 0;
      continue;
      continue;
      label112:
      i = 0;
    }
  }
  
  static String c(String paramString1, String paramString2)
  {
    return paramString1 + paramString2;
  }
  
  /* Error */
  public final String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokevirtual 78	com/alipay/sdk/i/a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore_3
    //   8: aload_3
    //   9: ldc 80
    //   11: iconst_1
    //   12: anewarray 31	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aload_2
    //   19: invokestatic 44	com/alipay/sdk/i/a:c	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   22: aastore
    //   23: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   26: astore_2
    //   27: aload 4
    //   29: astore_1
    //   30: aload_2
    //   31: invokeinterface 54 1 0
    //   36: ifeq +11 -> 47
    //   39: aload_2
    //   40: iconst_0
    //   41: invokeinterface 84 2 0
    //   46: astore_1
    //   47: aload_2
    //   48: ifnull +9 -> 57
    //   51: aload_2
    //   52: invokeinterface 62 1 0
    //   57: aload_3
    //   58: ifnull +136 -> 194
    //   61: aload_3
    //   62: invokevirtual 87	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   65: ifeq +129 -> 194
    //   68: aload_3
    //   69: invokevirtual 88	android/database/sqlite/SQLiteDatabase:close	()V
    //   72: aload_1
    //   73: astore_2
    //   74: aload_1
    //   75: invokestatic 94	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   78: ifne +22 -> 100
    //   81: iconst_2
    //   82: aload_1
    //   83: aload_0
    //   84: getfield 21	com/alipay/sdk/i/a:a	Ljava/lang/ref/WeakReference;
    //   87: invokevirtual 98	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   90: checkcast 100	android/content/Context
    //   93: invokestatic 105	com/alipay/sdk/j/a:c	(Landroid/content/Context;)Ljava/lang/String;
    //   96: invokestatic 110	com/alipay/sdk/d/b:a	(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: astore_2
    //   100: aload_2
    //   101: areturn
    //   102: astore_1
    //   103: aconst_null
    //   104: astore_2
    //   105: aconst_null
    //   106: astore_3
    //   107: aload_2
    //   108: ifnull +9 -> 117
    //   111: aload_2
    //   112: invokeinterface 62 1 0
    //   117: aload_3
    //   118: ifnull +71 -> 189
    //   121: aload_3
    //   122: invokevirtual 87	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   125: ifeq +64 -> 189
    //   128: aload_3
    //   129: invokevirtual 88	android/database/sqlite/SQLiteDatabase:close	()V
    //   132: aconst_null
    //   133: astore_1
    //   134: goto -62 -> 72
    //   137: astore_1
    //   138: aconst_null
    //   139: astore_3
    //   140: aconst_null
    //   141: astore_2
    //   142: aload_2
    //   143: ifnull +9 -> 152
    //   146: aload_2
    //   147: invokeinterface 62 1 0
    //   152: aload_3
    //   153: ifnull +14 -> 167
    //   156: aload_3
    //   157: invokevirtual 87	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   160: ifeq +7 -> 167
    //   163: aload_3
    //   164: invokevirtual 88	android/database/sqlite/SQLiteDatabase:close	()V
    //   167: aload_1
    //   168: athrow
    //   169: astore_1
    //   170: aconst_null
    //   171: astore_2
    //   172: goto -30 -> 142
    //   175: astore_1
    //   176: goto -34 -> 142
    //   179: astore_1
    //   180: aconst_null
    //   181: astore_2
    //   182: goto -75 -> 107
    //   185: astore_1
    //   186: goto -79 -> 107
    //   189: aconst_null
    //   190: astore_1
    //   191: goto -119 -> 72
    //   194: goto -122 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	a
    //   0	197	1	paramString1	String
    //   0	197	2	paramString2	String
    //   7	157	3	localSQLiteDatabase	SQLiteDatabase
    //   1	27	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	8	102	java/lang/Exception
    //   3	8	137	finally
    //   8	27	169	finally
    //   30	47	175	finally
    //   8	27	179	java/lang/Exception
    //   30	47	185	java/lang/Exception
  }
  
  final void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    paramSQLiteDatabase.execSQL("update tb_tid set tid=?, key_tid=?, dt=datetime('now', 'localtime') where name=?", new Object[] { b.a(1, paramString3, com.alipay.sdk.j.a.c((Context)this.a.get())), paramString4, c(paramString1, paramString2) });
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    localObject2 = null;
    localObject1 = null;
    for (;;)
    {
      try
      {
        localSQLiteDatabase = getWritableDatabase();
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        if (!a(localSQLiteDatabase, paramString1, paramString2)) {
          continue;
        }
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        a(localSQLiteDatabase, paramString1, paramString2, paramString3, paramString4);
      }
      catch (Exception paramString1)
      {
        SQLiteDatabase localSQLiteDatabase;
        return;
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        int k = paramString1.getCount() - 14;
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        paramString2 = new String[k];
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        if (!paramString1.moveToFirst()) {
          continue;
        }
        int i = 0;
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        paramString2[i] = paramString1.getString(0);
        int j = i + 1;
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        if (!paramString1.moveToNext()) {
          continue;
        }
        i = j;
        if (k > j) {
          continue;
        }
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        paramString1.close();
        i = 0;
        if (i >= k) {
          continue;
        }
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        if (TextUtils.isEmpty(paramString2[i])) {
          continue;
        }
        localObject1 = localSQLiteDatabase;
        localObject2 = localSQLiteDatabase;
        a(localSQLiteDatabase, paramString2[i]);
        i += 1;
        continue;
      }
      finally
      {
        if ((localObject2 == null) || (!((SQLiteDatabase)localObject2).isOpen())) {
          continue;
        }
        ((SQLiteDatabase)localObject2).close();
      }
      if ((localSQLiteDatabase != null) && (localSQLiteDatabase.isOpen())) {
        localSQLiteDatabase.close();
      }
      return;
      localObject1 = localSQLiteDatabase;
      localObject2 = localSQLiteDatabase;
      paramString3 = b.a(1, paramString3, com.alipay.sdk.j.a.c((Context)this.a.get()));
      localObject1 = localSQLiteDatabase;
      localObject2 = localSQLiteDatabase;
      localSQLiteDatabase.execSQL("insert into tb_tid (name, tid, key_tid, dt) values (?, ?, ?, datetime('now', 'localtime'))", new Object[] { c(paramString1, paramString2), paramString3, paramString4 });
      localObject1 = localSQLiteDatabase;
      localObject2 = localSQLiteDatabase;
      paramString1 = localSQLiteDatabase.rawQuery("select name from tb_tid where tid!='' order by dt asc", null);
      localObject1 = localSQLiteDatabase;
      localObject2 = localSQLiteDatabase;
      if (paramString1.getCount() > 14) {
        continue;
      }
      localObject1 = localSQLiteDatabase;
      localObject2 = localSQLiteDatabase;
      paramString1.close();
    }
  }
  
  /* Error */
  public final String b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: invokevirtual 78	com/alipay/sdk/i/a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: aload_3
    //   12: ldc -113
    //   14: iconst_1
    //   15: anewarray 31	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: aload_2
    //   22: invokestatic 44	com/alipay/sdk/i/a:c	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   25: aastore
    //   26: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_1
    //   30: aload 5
    //   32: astore_2
    //   33: aload_1
    //   34: invokeinterface 54 1 0
    //   39: ifeq +11 -> 50
    //   42: aload_1
    //   43: iconst_0
    //   44: invokeinterface 84 2 0
    //   49: astore_2
    //   50: aload_1
    //   51: ifnull +9 -> 60
    //   54: aload_1
    //   55: invokeinterface 62 1 0
    //   60: aload_2
    //   61: astore_1
    //   62: aload_3
    //   63: ifnull +18 -> 81
    //   66: aload_2
    //   67: astore_1
    //   68: aload_3
    //   69: invokevirtual 87	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   72: ifeq +9 -> 81
    //   75: aload_3
    //   76: invokevirtual 88	android/database/sqlite/SQLiteDatabase:close	()V
    //   79: aload_2
    //   80: astore_1
    //   81: aload_1
    //   82: areturn
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_1
    //   86: aconst_null
    //   87: astore_3
    //   88: aload_1
    //   89: ifnull +9 -> 98
    //   92: aload_1
    //   93: invokeinterface 62 1 0
    //   98: aload 4
    //   100: astore_1
    //   101: aload_3
    //   102: ifnull -21 -> 81
    //   105: aload 4
    //   107: astore_1
    //   108: aload_3
    //   109: invokevirtual 87	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   112: ifeq -31 -> 81
    //   115: aload_3
    //   116: invokevirtual 88	android/database/sqlite/SQLiteDatabase:close	()V
    //   119: aconst_null
    //   120: areturn
    //   121: astore_2
    //   122: aconst_null
    //   123: astore_3
    //   124: aconst_null
    //   125: astore_1
    //   126: aload_1
    //   127: ifnull +9 -> 136
    //   130: aload_1
    //   131: invokeinterface 62 1 0
    //   136: aload_3
    //   137: ifnull +14 -> 151
    //   140: aload_3
    //   141: invokevirtual 87	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   144: ifeq +7 -> 151
    //   147: aload_3
    //   148: invokevirtual 88	android/database/sqlite/SQLiteDatabase:close	()V
    //   151: aload_2
    //   152: athrow
    //   153: astore_2
    //   154: aconst_null
    //   155: astore_1
    //   156: goto -30 -> 126
    //   159: astore_2
    //   160: goto -34 -> 126
    //   163: astore_1
    //   164: aconst_null
    //   165: astore_1
    //   166: goto -78 -> 88
    //   169: astore_2
    //   170: goto -82 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	a
    //   0	173	1	paramString1	String
    //   0	173	2	paramString2	String
    //   10	138	3	localSQLiteDatabase	SQLiteDatabase
    //   1	105	4	localObject1	Object
    //   4	27	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	11	83	java/lang/Exception
    //   6	11	121	finally
    //   11	30	153	finally
    //   33	50	159	finally
    //   11	30	163	java/lang/Exception
    //   33	50	169	java/lang/Exception
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table if not exists tb_tid (name text primary key, tid text, key_tid text, dt datetime);");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table if exists tb_tid");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */