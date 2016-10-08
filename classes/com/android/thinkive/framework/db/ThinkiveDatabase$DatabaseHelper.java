package com.android.thinkive.framework.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.thinkive.framework.util.Log;

class ThinkiveDatabase$DatabaseHelper
  extends SQLiteOpenHelper
{
  public ThinkiveDatabase$DatabaseHelper(Context paramContext)
  {
    this(paramContext, "thinkive.db", ThinkiveDatabase.access$0());
  }
  
  public ThinkiveDatabase$DatabaseHelper(Context paramContext, String paramString, int paramInt)
  {
    this(paramContext, paramString, null, paramInt);
  }
  
  public ThinkiveDatabase$DatabaseHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    Log.d("create table");
    paramSQLiteDatabase.execSQL(MapTable.CREATE_TABLE);
    paramSQLiteDatabase.execSQL(DownloadTable.CREATE_TABLE);
    paramSQLiteDatabase.execSQL(ServerUrlTable.CREATE_TABLE);
    paramSQLiteDatabase.execSQL(DataCacheTable.CREATE_TABLE);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Log.e("thinkive database upgrade oldVersion = " + paramInt1 + " new Version = " + paramInt2);
    if ((paramInt1 == 1) && (paramInt2 == 2)) {
      paramSQLiteDatabase.execSQL(ServerUrlTable.CREATE_TABLE);
    }
    do
    {
      return;
      if ((paramInt1 == 1) && (paramInt2 == 3))
      {
        paramSQLiteDatabase.execSQL(ServerUrlTable.CREATE_TABLE);
        paramSQLiteDatabase.execSQL(DataCacheTable.CREATE_TABLE);
        return;
      }
    } while ((paramInt1 != 2) || (paramInt2 != 3));
    paramSQLiteDatabase.execSQL(DataCacheTable.CREATE_TABLE);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\db\ThinkiveDatabase$DatabaseHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */