package com.android.dazhihui.c.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.b.g;
import com.android.dazhihui.b.h;
import com.android.dazhihui.b.k;
import com.android.dazhihui.b.l;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.stock.offlinecapital.a;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ag;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class d
{
  private static d e;
  private static Thread f;
  private SQLiteDatabase a;
  private e b;
  private Cursor c;
  private Context d;
  
  private d(Context paramContext)
  {
    this.d = paramContext;
    this.b = new e(this, this.d);
  }
  
  public static d a()
  {
    try
    {
      if (e == null)
      {
        f = Thread.currentThread();
        e = new d(DzhApplication.a().getApplicationContext());
      }
      d locald = e;
      return locald;
    }
    finally {}
  }
  
  public List<k> a(int paramInt)
  {
    this.a = i();
    ArrayList localArrayList = new ArrayList();
    try
    {
      Cursor localCursor = this.a.query("push_template_table", null, "template_message_type = ?", new String[] { String.valueOf(paramInt) }, null, null, "template_time DESC");
      boolean bool;
      k localk;
      if ((localCursor == null) || (localCursor != null)) {
        localCursor.close();
      }
    }
    finally
    {
      try
      {
        for (bool = localCursor.moveToFirst(); bool; bool = localCursor.moveToNext())
        {
          localk = new k();
          localk.a = localCursor.getInt(1);
          localk.b = localCursor.getString(2);
          localk.c = localCursor.getInt(3);
          localk.d = localCursor.getString(4);
          localk.e = localCursor.getString(5);
          localk.f = localCursor.getString(6);
          localk.h = localCursor.getInt(7);
          localk.g = Long.parseLong(localCursor.getString(8));
          localArrayList.add(localk);
        }
        g();
        if (localCursor != null) {
          localCursor.close();
        }
        return localArrayList;
      }
      finally
      {
        for (;;) {}
      }
      localObject1 = finally;
      localCursor = null;
    }
    throw ((Throwable)localObject1);
  }
  
  public Vector<SelfStock> a(String paramString)
  {
    this.a = i();
    localObject = null;
    if (String.valueOf(0).equals(paramString)) {
      localObject = "ping_top ASC";
    }
    Vector localVector = new Vector();
    for (;;)
    {
      try
      {
        localObject = this.a.query("self_stock", null, "self_type = ?", new String[] { paramString }, null, null, (String)localObject, null);
        if (localObject == null) {
          break;
        }
      }
      finally
      {
        String str;
        int i;
        int j;
        int k;
        int m;
        int n;
        int i1;
        int i2;
        int i3;
        localObject = null;
        if (localObject != null) {
          ((Cursor)localObject).close();
        }
      }
      try
      {
        bool1 = ((Cursor)localObject).moveToFirst();
        if (!bool1) {
          continue;
        }
        paramString = ((Cursor)localObject).getString(1);
        str = ((Cursor)localObject).getString(2);
        i = ((Cursor)localObject).getInt(3);
        j = ((Cursor)localObject).getInt(4);
        k = ((Cursor)localObject).getInt(5);
        m = ((Cursor)localObject).getInt(6);
        if (((Cursor)localObject).getInt(7) != 0) {
          break label277;
        }
        bool1 = false;
      }
      finally
      {
        continue;
        bool1 = true;
        continue;
        bool2 = true;
        continue;
      }
      n = ((Cursor)localObject).getInt(8);
      i1 = ((Cursor)localObject).getInt(9);
      i2 = ((Cursor)localObject).getInt(10);
      i3 = ((Cursor)localObject).getInt(11);
      if (((Cursor)localObject).getInt(12) != 0) {
        break label283;
      }
      bool2 = false;
      localVector.add(0, new SelfStock(paramString, str, i, j, k, m, bool1, n, i1, i2, i3, bool2));
      bool1 = ((Cursor)localObject).moveToNext();
      continue;
      g();
    }
    if (localObject != null) {
      ((Cursor)localObject).close();
    }
    return localVector;
  }
  
  public void a(int paramInt1, String paramString, int paramInt2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("news_type", Integer.valueOf(paramInt1));
    localContentValues.put("item_id", paramString);
    localContentValues.put("time", Integer.valueOf(paramInt2));
    this.a = this.b.getWritableDatabase();
    if (this.a.update("read_marks", localContentValues, "item_id=?", new String[] { paramString }) == 0) {
      this.a.insert("read_marks", null, localContentValues);
    }
    a(this.a, paramInt1);
    this.a.close();
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    this.a = paramSQLiteDatabase;
    paramSQLiteDatabase = this.a.query("read_marks", null, "news_type =?", new String[] { String.valueOf(paramInt) }, null, null, null);
    int i;
    if (paramSQLiteDatabase != null)
    {
      i = paramSQLiteDatabase.getCount();
      paramSQLiteDatabase.close();
      if (i > 300)
      {
        com.android.dazhihui.d.n.c(">>> cleanExpiredRecord");
        paramSQLiteDatabase = "DELETE FROM read_marks WHERE news_type = " + paramInt + " and " + "_id" + " NOT IN " + " (SELECT " + "_id" + " FROM " + "read_marks" + " where " + "news_type" + " = " + paramInt;
        paramSQLiteDatabase = paramSQLiteDatabase + " ORDER BY time DESC LIMIT 300)";
        this.a.execSQL(paramSQLiteDatabase);
      }
    }
    else
    {
      return;
    }
    com.android.dazhihui.d.n.c(">>> RmsAdapter type " + paramInt + " items number: " + i);
  }
  
  public void a(g paramg)
  {
    this.a = i();
    Object localObject = this.a.query("push_all_table", null, null, null, null, null, null, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() >= 100))
    {
      if (((Cursor)localObject).moveToFirst())
      {
        String str = ((Cursor)localObject).getString(0);
        this.a.delete("push_all_table", "all_id = ?", new String[] { str });
      }
      ((Cursor)localObject).close();
    }
    g();
    this.a = h();
    localObject = new ContentValues();
    ((ContentValues)localObject).put("all_message_id", Integer.valueOf(paramg.a));
    ((ContentValues)localObject).put("all_mesage_type", Integer.valueOf(paramg.b));
    ((ContentValues)localObject).put("all_mesage_son_type", Integer.valueOf(paramg.c));
    ((ContentValues)localObject).put("all_res", paramg.d);
    ((ContentValues)localObject).put("all_ct", paramg.e);
    ((ContentValues)localObject).put("all_push_time", Long.valueOf(paramg.f));
    ((ContentValues)localObject).put("all_des", paramg.g);
    ((ContentValues)localObject).put("all_exp", paramg.h);
    this.a.insert("push_all_table", null, (ContentValues)localObject);
  }
  
  public void a(h paramh)
  {
    this.a = i();
    Object localObject = this.a.query("push_public_table", null, null, null, null, null, null, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() >= 100))
    {
      if (((Cursor)localObject).moveToFirst())
      {
        String str = ((Cursor)localObject).getString(0);
        this.a.delete("push_public_table", "public_id = ?", new String[] { str });
      }
      ((Cursor)localObject).close();
    }
    g();
    this.a = h();
    localObject = new ContentValues();
    ((ContentValues)localObject).put("public_message_id", Integer.valueOf(paramh.a));
    ((ContentValues)localObject).put("public_name", paramh.b);
    ((ContentValues)localObject).put("public_code", paramh.c);
    ((ContentValues)localObject).put("public_type", Byte.valueOf(paramh.d));
    ((ContentValues)localObject).put("public_param", paramh.e);
    ((ContentValues)localObject).put("pubic_message", paramh.f);
    ((ContentValues)localObject).put("public_push_time", Long.valueOf(paramh.g));
    this.a.insert("push_public_table", null, (ContentValues)localObject);
  }
  
  public void a(k paramk)
  {
    this.a = i();
    int i = paramk.h;
    Object localObject = this.a.query("push_template_table", null, "template_message_type = ?", new String[] { String.valueOf(i) }, null, null, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() >= 100))
    {
      if (((Cursor)localObject).moveToFirst())
      {
        String str = ((Cursor)localObject).getString(0);
        this.a.delete("push_template_table", "template_id = ?", new String[] { str });
      }
      ((Cursor)localObject).close();
    }
    g();
    this.a = h();
    localObject = new ContentValues();
    ((ContentValues)localObject).put("template_message_id", Integer.valueOf(paramk.a));
    ((ContentValues)localObject).put("template_redirect", paramk.b);
    ((ContentValues)localObject).put("template_type", Integer.valueOf(paramk.c));
    ((ContentValues)localObject).put("template_url", paramk.d);
    ((ContentValues)localObject).put("template_code", paramk.e);
    ((ContentValues)localObject).put("template_message", paramk.f);
    ((ContentValues)localObject).put("template_message_type", Integer.valueOf(paramk.h));
    ((ContentValues)localObject).put("template_time", Long.valueOf(paramk.g));
    this.a.insert("push_template_table", null, (ContentValues)localObject);
  }
  
  public void a(l paraml)
  {
    this.a = i();
    Object localObject = this.a.query("push_warn_table", null, null, null, null, null, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() >= 100))
    {
      if (((Cursor)localObject).moveToFirst())
      {
        String str = ((Cursor)localObject).getString(0);
        this.a.delete("push_warn_table", "warn_id = ?", new String[] { str });
      }
      ((Cursor)localObject).close();
    }
    g();
    this.a = h();
    localObject = new ContentValues();
    ((ContentValues)localObject).put("warn_message_id", Integer.valueOf(paraml.a));
    ((ContentValues)localObject).put("warn_name", paraml.c);
    ((ContentValues)localObject).put("warn_code", paraml.b);
    ((ContentValues)localObject).put("warn_message", paraml.d);
    ((ContentValues)localObject).put("warn_time", Long.valueOf(paraml.e));
    this.a.insert("push_warn_table", null, (ContentValues)localObject);
  }
  
  public void a(a parama)
  {
    this.a = h();
    if (this.a != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("buy_or_sell", parama.b());
      localContentValues.put("name", parama.a());
      localContentValues.put("price", parama.c());
      localContentValues.put("amount", parama.d());
      localContentValues.put("code", parama.e());
      this.a.insert("offline_drcj", null, localContentValues);
    }
  }
  
  public void a(ag paramag)
  {
    this.a = h();
    if (this.a != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("quanshang_name", paramag.o());
      localContentValues.put("name", paramag.b());
      localContentValues.put("code", paramag.a());
      localContentValues.put("cost", paramag.n());
      localContentValues.put("amount", Integer.valueOf(paramag.m()));
      localContentValues.put("available_amount", Integer.valueOf(paramag.s()));
      localContentValues.put("type", Integer.valueOf(paramag.u()));
      localContentValues.put("profitorloss", paramag.v());
      localContentValues.put("profitorloss_deviation", paramag.w());
      this.a.insert("offline_capital", null, localContentValues);
    }
  }
  
  public void a(com.android.dazhihui.ui.screen.stock.offlinecapital.n paramn)
  {
    this.a = h();
    if (this.a != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("name", paramn.c());
      localContentValues.put("entrust_state", paramn.e());
      localContentValues.put("entrust_time", paramn.d());
      localContentValues.put("entrust_account", paramn.b());
      localContentValues.put("keyongzijin", paramn.a());
      localContentValues.put("dangriyingkui_deviation", paramn.g());
      localContentValues.put("dangriyingkui_deviation_type", paramn.f());
      paramn = paramn.c();
      this.a.update("offline_entrust", localContentValues, "name = ?", new String[] { paramn });
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    this.a = this.b.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", paramString);
    localContentValues.put("data", Integer.valueOf(paramInt));
    if (this.a.update("dzh_table", localContentValues, "key = ?", new String[] { paramString }) == 0) {
      this.a.insert("dzh_table", null, localContentValues);
    }
  }
  
  public void a(String paramString, long paramLong)
  {
    this.a = this.b.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", paramString);
    localContentValues.put("data", Long.valueOf(paramLong));
    if (this.a.update("dzh_table", localContentValues, "key = ?", new String[] { paramString }) == 0) {
      this.a.insert("dzh_table", null, localContentValues);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.a = this.b.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", paramString1);
    localContentValues.put("data", paramString2);
    if (this.a.update("dzh_table", localContentValues, "key = ?", new String[] { paramString1 }) == 0) {
      this.a.insert("dzh_table", null, localContentValues);
    }
  }
  
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    this.a = this.b.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", paramString);
    localContentValues.put("data", paramArrayOfByte);
    if (this.a.update("dzh_table", localContentValues, "key = ?", new String[] { paramString }) == 0) {
      this.a.insert("dzh_table", null, localContentValues);
    }
  }
  
  public void a(String paramString, String[] paramArrayOfString)
  {
    this.a = this.b.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (i < paramArrayOfString.length)
    {
      localStringBuffer.append(paramArrayOfString[i]);
      if (i == paramArrayOfString.length - 1) {
        localStringBuffer.append("$");
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuffer.append("|");
      }
    }
    paramArrayOfString = localStringBuffer.toString();
    localContentValues.put("key", paramString);
    localContentValues.put("data", paramArrayOfString);
    if (this.a.update("dzh_table", localContentValues, "key = ?", new String[] { paramString }) == 0) {
      this.a.insert("dzh_table", null, localContentValues);
    }
  }
  
  public boolean a(int paramInt, String paramString)
  {
    this.a = this.b.getReadableDatabase();
    paramString = this.a.query("read_marks", null, "news_type = ? and item_id = ?", new String[] { String.valueOf(paramInt), paramString }, null, null, null, null);
    if (paramString != null)
    {
      paramString.moveToFirst();
      paramInt = paramString.getCount();
      paramString.close();
      return paramInt > 0;
    }
    return false;
  }
  
  public int b(String paramString, int paramInt)
  {
    try
    {
      String str = "'" + paramString + "'";
      this.a = this.b.getReadableDatabase();
      paramString = this.a;
      str = "key=" + str;
      this.c = paramString.query("dzh_table", new String[] { "_id", "key", "data" }, str, null, null, null, null);
      int i = this.c.getColumnIndex("data");
      this.c.moveToFirst();
      if (this.c.getCount() == 0) {
        return paramInt;
      }
      i = this.c.getInt(i);
      return i;
    }
    catch (Exception paramString)
    {
      com.android.dazhihui.d.n.c(paramString.toString());
    }
    return paramInt;
  }
  
  public k b(int paramInt)
  {
    Object localObject1 = null;
    this.a = i();
    try
    {
      Object localObject3 = this.a.query("push_template_table", null, "template_message_type = ?", new String[] { String.valueOf(paramInt) }, null, null, "template_time DESC");
      if (localObject3 != null) {}
      ((Cursor)localObject3).close();
    }
    finally
    {
      try
      {
        if (((Cursor)localObject3).moveToFirst())
        {
          localObject1 = new k();
          ((k)localObject1).a = ((Cursor)localObject3).getInt(1);
          ((k)localObject1).b = ((Cursor)localObject3).getString(2);
          ((k)localObject1).c = ((Cursor)localObject3).getInt(3);
          ((k)localObject1).d = ((Cursor)localObject3).getString(4);
          ((k)localObject1).e = ((Cursor)localObject3).getString(5);
          ((k)localObject1).f = ((Cursor)localObject3).getString(6);
          ((k)localObject1).h = ((Cursor)localObject3).getInt(7);
          ((k)localObject1).g = Long.parseLong(((Cursor)localObject3).getString(8));
          ((Cursor)localObject3).close();
          return (k)localObject1;
        }
        ((Cursor)localObject3).close();
        return null;
      }
      finally {}
      localObject4 = finally;
      localObject3 = localObject1;
      localObject1 = localObject4;
    }
    throw ((Throwable)localObject1);
  }
  
  public String b(String paramString)
  {
    try
    {
      String str = "'" + paramString + "'";
      this.a = this.b.getReadableDatabase();
      paramString = this.a;
      str = "key=" + str;
      this.c = paramString.query("dzh_table", new String[] { "_id", "key", "data" }, str, null, null, null, null);
      int i = this.c.getColumnIndex("data");
      this.c.moveToFirst();
      if (this.c.getCount() == 0) {
        return null;
      }
      paramString = this.c.getString(i);
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.android.dazhihui.d.n.c(paramString.toString());
        paramString = null;
      }
    }
    return paramString;
  }
  
  /* Error */
  public List<g> b()
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokevirtual 58	com/android/dazhihui/c/a/d:i	()Landroid/database/sqlite/SQLiteDatabase;
    //   5: putfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   8: new 62	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 63	java/util/ArrayList:<init>	()V
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   20: ldc_w 261
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: ldc_w 529
    //   31: invokevirtual 81	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore_1
    //   35: aload_1
    //   36: ifnull +141 -> 177
    //   39: aload_1
    //   40: invokeinterface 87 1 0
    //   45: istore 4
    //   47: iload 4
    //   49: ifeq +124 -> 173
    //   52: new 273	com/android/dazhihui/b/g
    //   55: dup
    //   56: invokespecial 530	com/android/dazhihui/b/g:<init>	()V
    //   59: astore_3
    //   60: aload_3
    //   61: aload_1
    //   62: iconst_1
    //   63: invokeinterface 94 2 0
    //   68: putfield 274	com/android/dazhihui/b/g:a	I
    //   71: aload_3
    //   72: aload_1
    //   73: iconst_2
    //   74: invokeinterface 94 2 0
    //   79: putfield 278	com/android/dazhihui/b/g:b	I
    //   82: aload_3
    //   83: aload_1
    //   84: iconst_3
    //   85: invokeinterface 94 2 0
    //   90: putfield 281	com/android/dazhihui/b/g:c	I
    //   93: aload_3
    //   94: aload_1
    //   95: iconst_4
    //   96: invokeinterface 100 2 0
    //   101: putfield 284	com/android/dazhihui/b/g:d	Ljava/lang/String;
    //   104: aload_3
    //   105: aload_1
    //   106: iconst_5
    //   107: invokeinterface 100 2 0
    //   112: putfield 287	com/android/dazhihui/b/g:e	Ljava/lang/String;
    //   115: aload_3
    //   116: aload_1
    //   117: bipush 6
    //   119: invokeinterface 100 2 0
    //   124: invokestatic 120	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   127: putfield 291	com/android/dazhihui/b/g:f	J
    //   130: aload_3
    //   131: aload_1
    //   132: bipush 7
    //   134: invokeinterface 100 2 0
    //   139: putfield 301	com/android/dazhihui/b/g:g	Ljava/lang/String;
    //   142: aload_3
    //   143: aload_1
    //   144: bipush 8
    //   146: invokeinterface 100 2 0
    //   151: putfield 305	com/android/dazhihui/b/g:h	Ljava/lang/String;
    //   154: aload_2
    //   155: aload_3
    //   156: invokeinterface 130 2 0
    //   161: pop
    //   162: aload_1
    //   163: invokeinterface 133 1 0
    //   168: istore 4
    //   170: goto -123 -> 47
    //   173: aload_0
    //   174: invokevirtual 135	com/android/dazhihui/c/a/d:g	()V
    //   177: aload_1
    //   178: invokeinterface 138 1 0
    //   183: aload_2
    //   184: areturn
    //   185: astore_2
    //   186: aconst_null
    //   187: astore_1
    //   188: aload_1
    //   189: invokeinterface 138 1 0
    //   194: aload_2
    //   195: athrow
    //   196: astore_2
    //   197: goto -9 -> 188
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	d
    //   34	155	1	localCursor	Cursor
    //   15	169	2	localArrayList	ArrayList
    //   185	10	2	localObject1	Object
    //   196	1	2	localObject2	Object
    //   59	97	3	localg	g
    //   45	124	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	35	185	finally
    //   39	47	196	finally
    //   52	170	196	finally
    //   173	177	196	finally
  }
  
  public void b(com.android.dazhihui.ui.screen.stock.offlinecapital.n paramn)
  {
    this.a = h();
    if (this.a != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("name", paramn.c());
      localContentValues.put("entrust_state", paramn.e());
      localContentValues.put("entrust_time", paramn.d());
      localContentValues.put("entrust_account", paramn.b());
      localContentValues.put("keyongzijin", paramn.a());
      localContentValues.put("dangriyingkui_deviation", paramn.g());
      localContentValues.put("dangriyingkui_deviation_type", paramn.f());
      this.a.insert("offline_entrust", null, localContentValues);
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    this.a = h();
    if (this.a != null) {
      this.a.delete("offline_capital", "quanshang_name  = ? and type = ?", new String[] { paramString1, paramString2 });
    }
  }
  
  public int c(String paramString)
  {
    return b(paramString, 0);
  }
  
  /* Error */
  public List<h> c()
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokevirtual 58	com/android/dazhihui/c/a/d:i	()Landroid/database/sqlite/SQLiteDatabase;
    //   5: putfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   8: new 62	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 63	java/util/ArrayList:<init>	()V
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   20: ldc_w 308
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: ldc_w 537
    //   31: invokevirtual 81	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore_1
    //   35: aload_1
    //   36: ifnull +130 -> 166
    //   39: aload_1
    //   40: invokeinterface 87 1 0
    //   45: istore 4
    //   47: iload 4
    //   49: ifeq +113 -> 162
    //   52: new 314	com/android/dazhihui/b/h
    //   55: dup
    //   56: invokespecial 538	com/android/dazhihui/b/h:<init>	()V
    //   59: astore_3
    //   60: aload_3
    //   61: aload_1
    //   62: iconst_1
    //   63: invokeinterface 94 2 0
    //   68: putfield 315	com/android/dazhihui/b/h:a	I
    //   71: aload_3
    //   72: aload_1
    //   73: iconst_2
    //   74: invokeinterface 100 2 0
    //   79: putfield 318	com/android/dazhihui/b/h:b	Ljava/lang/String;
    //   82: aload_3
    //   83: aload_1
    //   84: iconst_3
    //   85: invokeinterface 100 2 0
    //   90: putfield 322	com/android/dazhihui/b/h:c	Ljava/lang/String;
    //   93: aload_3
    //   94: aload_1
    //   95: iconst_4
    //   96: invokeinterface 94 2 0
    //   101: i2b
    //   102: putfield 327	com/android/dazhihui/b/h:d	B
    //   105: aload_3
    //   106: aload_1
    //   107: iconst_5
    //   108: invokeinterface 100 2 0
    //   113: putfield 338	com/android/dazhihui/b/h:e	Ljava/lang/String;
    //   116: aload_3
    //   117: aload_1
    //   118: bipush 6
    //   120: invokeinterface 100 2 0
    //   125: putfield 341	com/android/dazhihui/b/h:f	Ljava/lang/String;
    //   128: aload_3
    //   129: aload_1
    //   130: bipush 7
    //   132: invokeinterface 100 2 0
    //   137: invokestatic 120	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   140: putfield 344	com/android/dazhihui/b/h:g	J
    //   143: aload_2
    //   144: aload_3
    //   145: invokeinterface 130 2 0
    //   150: pop
    //   151: aload_1
    //   152: invokeinterface 133 1 0
    //   157: istore 4
    //   159: goto -112 -> 47
    //   162: aload_0
    //   163: invokevirtual 135	com/android/dazhihui/c/a/d:g	()V
    //   166: aload_1
    //   167: ifnull +9 -> 176
    //   170: aload_1
    //   171: invokeinterface 138 1 0
    //   176: aload_2
    //   177: areturn
    //   178: astore_2
    //   179: aconst_null
    //   180: astore_1
    //   181: aload_1
    //   182: ifnull +9 -> 191
    //   185: aload_1
    //   186: invokeinterface 138 1 0
    //   191: aload_2
    //   192: athrow
    //   193: astore_2
    //   194: goto -13 -> 181
    //   197: astore_3
    //   198: goto -32 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	d
    //   34	152	1	localCursor	Cursor
    //   15	162	2	localArrayList	ArrayList
    //   178	14	2	localObject1	Object
    //   193	1	2	localObject2	Object
    //   59	86	3	localh	h
    //   197	1	3	localException	Exception
    //   45	113	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	35	178	finally
    //   39	47	193	finally
    //   52	159	193	finally
    //   162	166	193	finally
    //   39	47	197	java/lang/Exception
    //   52	159	197	java/lang/Exception
    //   162	166	197	java/lang/Exception
  }
  
  public Vector<ag> c(String paramString, int paramInt)
  {
    Vector localVector = new Vector();
    try
    {
      this.a = i();
      if (this.a != null)
      {
        paramString = this.a.query("offline_capital", null, "quanshang_name = ? and type = ?", new String[] { paramString, String.valueOf(paramInt) }, null, null, null);
        if (paramString != null) {
          for (boolean bool = paramString.moveToFirst(); bool; bool = paramString.moveToNext()) {
            localVector.add(0, new ag(paramString.getString(1), paramString.getString(2), paramString.getString(3), paramString.getString(4), paramString.getInt(5), paramString.getInt(6), paramString.getInt(7), paramString.getString(8), paramString.getString(9)));
          }
        }
      }
      return localVector;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return localVector;
  }
  
  public long d(String paramString)
  {
    try
    {
      String str = "'" + paramString + "'";
      this.a = this.b.getReadableDatabase();
      paramString = this.a;
      str = "key=" + str;
      this.c = paramString.query("dzh_table", new String[] { "_id", "key", "data" }, str, null, null, null, null);
      int i = this.c.getColumnIndex("data");
      this.c.moveToFirst();
      if (this.c.getCount() == 0) {
        return 0L;
      }
      l = this.c.getLong(i);
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.android.dazhihui.d.n.c(paramString.toString());
        long l = 0L;
      }
    }
    return l;
  }
  
  /* Error */
  public h d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: aload_0
    //   4: invokevirtual 58	com/android/dazhihui/c/a/d:i	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: putfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   10: aload_0
    //   11: getfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 308
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: aconst_null
    //   21: aconst_null
    //   22: ldc_w 537
    //   25: invokevirtual 81	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnull +115 -> 145
    //   33: aload_2
    //   34: invokeinterface 87 1 0
    //   39: ifeq +106 -> 145
    //   42: new 314	com/android/dazhihui/b/h
    //   45: dup
    //   46: invokespecial 538	com/android/dazhihui/b/h:<init>	()V
    //   49: astore_1
    //   50: aload_1
    //   51: aload_2
    //   52: iconst_1
    //   53: invokeinterface 94 2 0
    //   58: putfield 315	com/android/dazhihui/b/h:a	I
    //   61: aload_1
    //   62: aload_2
    //   63: iconst_2
    //   64: invokeinterface 100 2 0
    //   69: putfield 318	com/android/dazhihui/b/h:b	Ljava/lang/String;
    //   72: aload_1
    //   73: aload_2
    //   74: iconst_3
    //   75: invokeinterface 100 2 0
    //   80: putfield 322	com/android/dazhihui/b/h:c	Ljava/lang/String;
    //   83: aload_1
    //   84: aload_2
    //   85: iconst_4
    //   86: invokeinterface 94 2 0
    //   91: i2b
    //   92: putfield 327	com/android/dazhihui/b/h:d	B
    //   95: aload_1
    //   96: aload_2
    //   97: iconst_5
    //   98: invokeinterface 100 2 0
    //   103: putfield 338	com/android/dazhihui/b/h:e	Ljava/lang/String;
    //   106: aload_1
    //   107: aload_2
    //   108: bipush 6
    //   110: invokeinterface 100 2 0
    //   115: putfield 341	com/android/dazhihui/b/h:f	Ljava/lang/String;
    //   118: aload_1
    //   119: aload_2
    //   120: bipush 7
    //   122: invokeinterface 100 2 0
    //   127: invokestatic 120	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   130: putfield 344	com/android/dazhihui/b/h:g	J
    //   133: aload_0
    //   134: invokevirtual 135	com/android/dazhihui/c/a/d:g	()V
    //   137: aload_2
    //   138: invokeinterface 138 1 0
    //   143: aload_1
    //   144: areturn
    //   145: aload_2
    //   146: invokeinterface 138 1 0
    //   151: aconst_null
    //   152: areturn
    //   153: astore_3
    //   154: aload_1
    //   155: astore_2
    //   156: aload_3
    //   157: astore_1
    //   158: aload_2
    //   159: invokeinterface 138 1 0
    //   164: aload_1
    //   165: athrow
    //   166: astore_1
    //   167: goto -9 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	d
    //   1	164	1	localObject1	Object
    //   166	1	1	localObject2	Object
    //   28	131	2	localObject3	Object
    //   153	4	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   10	29	153	finally
    //   33	137	166	finally
  }
  
  /* Error */
  public List<l> e()
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokevirtual 58	com/android/dazhihui/c/a/d:i	()Landroid/database/sqlite/SQLiteDatabase;
    //   5: putfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   8: new 62	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 63	java/util/ArrayList:<init>	()V
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 60	com/android/dazhihui/c/a/d:a	Landroid/database/sqlite/SQLiteDatabase;
    //   20: ldc_w 366
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: ldc_w 556
    //   31: invokevirtual 81	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore_1
    //   35: aload_1
    //   36: ifnull +105 -> 141
    //   39: aload_1
    //   40: invokeinterface 87 1 0
    //   45: istore 4
    //   47: iload 4
    //   49: ifeq +88 -> 137
    //   52: new 372	com/android/dazhihui/b/l
    //   55: dup
    //   56: invokespecial 557	com/android/dazhihui/b/l:<init>	()V
    //   59: astore_3
    //   60: aload_3
    //   61: aload_1
    //   62: iconst_1
    //   63: invokeinterface 94 2 0
    //   68: putfield 373	com/android/dazhihui/b/l:a	I
    //   71: aload_3
    //   72: aload_1
    //   73: iconst_2
    //   74: invokeinterface 100 2 0
    //   79: putfield 376	com/android/dazhihui/b/l:c	Ljava/lang/String;
    //   82: aload_3
    //   83: aload_1
    //   84: iconst_3
    //   85: invokeinterface 100 2 0
    //   90: putfield 379	com/android/dazhihui/b/l:b	Ljava/lang/String;
    //   93: aload_3
    //   94: aload_1
    //   95: iconst_4
    //   96: invokeinterface 100 2 0
    //   101: putfield 382	com/android/dazhihui/b/l:d	Ljava/lang/String;
    //   104: aload_3
    //   105: aload_1
    //   106: iconst_5
    //   107: invokeinterface 100 2 0
    //   112: invokestatic 120	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   115: putfield 386	com/android/dazhihui/b/l:e	J
    //   118: aload_2
    //   119: aload_3
    //   120: invokeinterface 130 2 0
    //   125: pop
    //   126: aload_1
    //   127: invokeinterface 133 1 0
    //   132: istore 4
    //   134: goto -87 -> 47
    //   137: aload_0
    //   138: invokevirtual 135	com/android/dazhihui/c/a/d:g	()V
    //   141: aload_1
    //   142: ifnull +9 -> 151
    //   145: aload_1
    //   146: invokeinterface 138 1 0
    //   151: aload_2
    //   152: areturn
    //   153: astore_2
    //   154: aconst_null
    //   155: astore_1
    //   156: aload_1
    //   157: ifnull +9 -> 166
    //   160: aload_1
    //   161: invokeinterface 138 1 0
    //   166: aload_2
    //   167: athrow
    //   168: astore_2
    //   169: goto -13 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	d
    //   34	127	1	localCursor	Cursor
    //   15	137	2	localArrayList	ArrayList
    //   153	14	2	localObject1	Object
    //   168	1	2	localObject2	Object
    //   59	61	3	locall	l
    //   45	88	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	35	153	finally
    //   39	47	168	finally
    //   52	134	168	finally
    //   137	141	168	finally
  }
  
  public byte[] e(String paramString)
  {
    try
    {
      String str = "'" + paramString + "'";
      this.a = this.b.getReadableDatabase();
      paramString = this.a;
      str = "key=" + str;
      this.c = paramString.query("dzh_table", new String[] { "_id", "key", "data" }, str, null, null, null, null);
      int i = this.c.getColumnIndex("data");
      this.c.moveToFirst();
      if (this.c.getCount() == 0) {
        return null;
      }
      paramString = this.c.getBlob(i);
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.android.dazhihui.d.n.c(paramString.toString());
        paramString = null;
      }
    }
    return paramString;
  }
  
  public l f()
  {
    Object localObject1 = null;
    this.a = i();
    try
    {
      Object localObject3 = this.a.query("push_warn_table", null, null, null, null, null, "warn_time DESC");
      if ((localObject3 == null) || (localObject3 != null)) {
        ((Cursor)localObject3).close();
      }
    }
    finally
    {
      try
      {
        if (((Cursor)localObject3).moveToFirst())
        {
          localObject1 = new l();
          ((l)localObject1).a = ((Cursor)localObject3).getInt(1);
          ((l)localObject1).c = ((Cursor)localObject3).getString(2);
          ((l)localObject1).b = ((Cursor)localObject3).getString(3);
          ((l)localObject1).d = ((Cursor)localObject3).getString(4);
          ((l)localObject1).e = Long.parseLong(((Cursor)localObject3).getString(5));
          g();
          if (localObject3 != null) {
            ((Cursor)localObject3).close();
          }
          return (l)localObject1;
        }
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
        return null;
      }
      finally {}
      localObject4 = finally;
      localObject3 = localObject1;
      localObject1 = localObject4;
    }
    throw ((Throwable)localObject1);
  }
  
  public String[] f(String paramString)
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject = "'" + paramString + "'";
        this.a = this.b.getReadableDatabase();
        paramString = this.a;
        localObject = "key=" + (String)localObject;
        this.c = paramString.query("dzh_table", new String[] { "_id", "key", "data" }, (String)localObject, null, null, null, null);
        i = this.c.getColumnIndex("data");
        this.c.moveToFirst();
        if (this.c.getCount() == 0) {
          return null;
        }
        str = this.c.getString(i);
        localObject = new Vector();
        paramString = new StringBuffer();
        i = 0;
        if (str.charAt(i) != '$') {
          continue;
        }
        ((Vector)localObject).addElement(paramString.toString());
        paramString = new String[((Vector)localObject).size()];
        try
        {
          ((Vector)localObject).toArray(paramString);
          return paramString;
        }
        catch (Exception localException1) {}
      }
      catch (Exception localException2)
      {
        String str;
        paramString = null;
        continue;
      }
      com.android.dazhihui.d.n.c(localException1.toString());
      return paramString;
      if (str.charAt(i) == '|')
      {
        localException1.addElement(paramString.toString());
        paramString = new StringBuffer();
      }
      else
      {
        paramString.append(str.charAt(i));
      }
      i += 1;
    }
  }
  
  public void g()
  {
    Thread localThread = Thread.currentThread();
    if (f != localThread) {
      Log.w("mhw", "close database error");
    }
    do
    {
      return;
      if (this.a != null) {
        this.a.close();
      }
    } while (this.c == null);
    this.c.deactivate();
    this.c.close();
  }
  
  public void g(String paramString)
  {
    this.a = h();
    if (this.a != null) {
      this.a.delete("dzh_table", "key = ?", new String[] { paramString });
    }
  }
  
  public SQLiteDatabase h()
  {
    return this.b.getWritableDatabase();
  }
  
  public void h(String paramString)
  {
    this.a = h();
    if (this.a != null) {
      this.a.delete("offline_capital", "quanshang_name = ? ", new String[] { paramString });
    }
  }
  
  public SQLiteDatabase i()
  {
    return this.b.getReadableDatabase();
  }
  
  public com.android.dazhihui.ui.screen.stock.offlinecapital.n i(String paramString)
  {
    try
    {
      this.a = i();
      if (this.a != null)
      {
        paramString = this.a.query("offline_entrust", null, "name = ?", new String[] { paramString }, null, null, null);
        if ((paramString != null) && (paramString.moveToFirst()))
        {
          paramString = new com.android.dazhihui.ui.screen.stock.offlinecapital.n(paramString.getString(1), paramString.getString(2), paramString.getString(3), paramString.getString(4), paramString.getString(5), paramString.getString(6), paramString.getString(7));
          return paramString;
        }
      }
      return null;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public long j()
  {
    this.a = h();
    if (this.a != null) {
      return this.a.delete("offline_capital", null, null);
    }
    return 0L;
  }
  
  public com.android.dazhihui.ui.screen.stock.offlinecapital.n j(String paramString)
  {
    this.a = i();
    if (this.a != null)
    {
      paramString = this.a.query("offline_entrust", null, "entrust_state = ?", new String[] { paramString }, null, null, null);
      if ((paramString != null) && (paramString.moveToFirst())) {
        return new com.android.dazhihui.ui.screen.stock.offlinecapital.n(paramString.getString(1), paramString.getString(2), paramString.getString(3), paramString.getString(4), paramString.getString(5), paramString.getString(6), paramString.getString(7));
      }
    }
    return null;
  }
  
  public ArrayList<ag> k()
  {
    this.a = i();
    ArrayList localArrayList = new ArrayList();
    if (this.a != null)
    {
      Cursor localCursor = this.a.query("offline_capital", null, null, null, null, null, null, null);
      if (localCursor != null) {
        for (boolean bool = localCursor.moveToFirst(); bool; bool = localCursor.moveToNext()) {
          localArrayList.add(0, new ag(localCursor.getString(1), localCursor.getString(2), localCursor.getString(3), localCursor.getString(4), localCursor.getInt(5), localCursor.getInt(6), localCursor.getInt(7), localCursor.getString(8), localCursor.getString(9)));
        }
      }
    }
    return localArrayList;
  }
  
  public void k(String paramString)
  {
    this.a = h();
    if (this.a != null) {
      this.a.delete("offline_entrust", "name = ? ", new String[] { paramString });
    }
  }
  
  public ArrayList<com.android.dazhihui.ui.screen.stock.offlinecapital.n> l()
  {
    this.a = i();
    ArrayList localArrayList = new ArrayList();
    if (this.a != null)
    {
      Cursor localCursor = this.a.query("offline_entrust", null, null, null, null, null, null, null);
      if (localCursor != null) {
        for (boolean bool = localCursor.moveToFirst(); bool; bool = localCursor.moveToNext()) {
          localArrayList.add(0, new com.android.dazhihui.ui.screen.stock.offlinecapital.n(localCursor.getString(1), localCursor.getString(2), localCursor.getString(3), localCursor.getString(4), localCursor.getString(5), localCursor.getString(6), localCursor.getString(7)));
        }
      }
    }
    return localArrayList;
  }
  
  public ArrayList<a> l(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      this.a = i();
      if (this.a != null)
      {
        paramString = this.a.query("offline_drcj", null, "name = ?", new String[] { paramString }, null, null, null);
        if (paramString != null) {
          for (boolean bool = paramString.moveToFirst(); bool; bool = paramString.moveToNext()) {
            localArrayList.add(0, new a(paramString.getString(1), paramString.getString(2), paramString.getString(3), paramString.getString(4), paramString.getString(5)));
          }
        }
      }
      return localArrayList;
    }
    catch (Exception paramString) {}
    return localArrayList;
  }
  
  public long m()
  {
    this.a = h();
    if (this.a != null) {
      return this.a.delete("offline_entrust", null, null);
    }
    return 0L;
  }
  
  public void m(String paramString)
  {
    this.a = h();
    if (this.a != null) {
      this.a.delete("offline_drcj", "name = ? ", new String[] { paramString });
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */