package com.android.dazhihui.c.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class c
  extends SQLiteOpenHelper
{
  public c(b paramb, Context paramContext)
  {
    super(paramContext, "FLAGDATABASE", null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE setting (_id integer primary key autoincrement,setting_key text,setting_value text);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */