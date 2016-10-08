package com.tencent.timint;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashMap;
import java.util.Map;

public class DBHelper
  extends SQLiteOpenHelper
{
  private static final int VERSION = 1;
  private static final String quality_report_table_sql = "create table if not exists report(id integer primary key asc autoincrement,data blob)";
  
  public DBHelper(Context paramContext, String paramString)
  {
    this(paramContext, paramString, null, 1);
  }
  
  public DBHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }
  
  public boolean delete(int paramInt)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      long l = localSQLiteDatabase.delete("report", "id=?", new String[] { String.valueOf(paramInt) });
      localSQLiteDatabase.close();
      return l == 1L;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  public boolean insert(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("data", paramArrayOfByte);
      long l = localSQLiteDatabase.insert("report", null, localContentValues);
      localSQLiteDatabase.close();
      if (l > 0L) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return false;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table if not exists report(id integer primary key asc autoincrement,data blob)");
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  
  public Map<String, byte[]> read()
  {
    HashMap localHashMap;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      localHashMap = new HashMap();
      Cursor localCursor = localSQLiteDatabase.rawQuery("select * from report", null);
      while (localCursor.moveToNext()) {
        localHashMap.put(String.valueOf(localCursor.getInt(0)), localCursor.getBlob(1));
      }
      localCursor.close();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return null;
    }
    localException.close();
    return localHashMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\timint\DBHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */