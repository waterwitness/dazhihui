package com.android.dazhihui.c.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class g
  extends SQLiteOpenHelper
{
  public g(f paramf, Context paramContext)
  {
    super(paramContext, "SELFSTOCK", null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */