package com.f.a.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class c
  extends SQLiteOpenHelper
{
  private static String a = "plug_info.db";
  private String b;
  private String[] c;
  private String[] d;
  private SQLiteDatabase e;
  
  public c(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, a, paramCursorFactory, cs.c);
  }
  
  public c(Context paramContext, String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this(paramContext, null, null, cs.c);
    this.b = paramString;
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
  }
  
  public Cursor a(int paramInt)
  {
    this.e = getReadableDatabase();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("select * from ").append(this.b).append(" where _id = ").append(paramInt);
    return this.e.rawQuery(localStringBuffer.toString(), null);
  }
  
  public void a()
  {
    if (this.e != null) {
      this.e.close();
    }
  }
  
  public boolean a(int paramInt, ContentValues paramContentValues)
  {
    this.e = getWritableDatabase();
    paramInt = this.e.update(this.b, paramContentValues, "_id = ?", new String[] { paramInt + "" });
    if (this.e != null) {
      this.e.close();
    }
    return paramInt != 0;
  }
  
  public boolean a(ContentValues paramContentValues)
  {
    this.e = getWritableDatabase();
    long l = this.e.insert(this.b, null, paramContentValues);
    if (this.e != null) {
      this.e.close();
    }
    return l != -1L;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    Log.i("PlugDatabaseHelper", "PlugDatabaseHelper onCraete...");
    if ((this.b == null) || (this.c == null) || (this.d == null))
    {
      Log.i("PlugDatabaseHelper", "PlugDatabaseHelper onCraete error..");
      return;
    }
    if (this.c.length != this.d.length)
    {
      Log.i("PlugDatabaseHelper", "PlugDatabaseHelper onCraete error..");
      return;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("CREATE TABLE ").append(this.b).append(" ( _id INTEGER PRIMARY KEY ");
    int i = 0;
    while (i < this.c.length)
    {
      localStringBuffer.append(",").append(this.c[i]).append(" ").append(this.d[i]);
      i += 1;
    }
    localStringBuffer.append(");");
    paramSQLiteDatabase.execSQL(localStringBuffer.toString());
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Log.i("PlugDatabaseHelper", "PlugDatabaseHelper onUpgrade...");
    Log.w("PlugDatabaseHelper", "Upgrading database from version " + paramInt1 + " to " + paramInt2 + ", which will destroy all old data");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.b);
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */