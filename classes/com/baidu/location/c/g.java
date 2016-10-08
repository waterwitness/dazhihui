package com.baidu.location.c;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.baidu.location.BDLocation;
import com.baidu.location.h.l;
import com.baidu.location.h.n;

class g
  extends AsyncTask
{
  private g(e parame) {}
  
  protected Boolean a(Object... paramVarArgs)
  {
    if (paramVarArgs.length != 4)
    {
      e.b(this.a, false);
      return Boolean.valueOf(false);
    }
    SQLiteDatabase localSQLiteDatabase2;
    try
    {
      SQLiteDatabase localSQLiteDatabase1 = SQLiteDatabase.openOrCreateDatabase(e.c(), null);
      if (localSQLiteDatabase1 == null)
      {
        e.b(this.a, false);
        return Boolean.valueOf(false);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localSQLiteDatabase2 = null;
      }
    }
    try
    {
      localSQLiteDatabase2.beginTransaction();
      e.a(this.a, (String)paramVarArgs[0], (n)paramVarArgs[1], localSQLiteDatabase2);
      e.a(this.a, (l)paramVarArgs[2], (BDLocation)paramVarArgs[3], localSQLiteDatabase2);
      localSQLiteDatabase2.setTransactionSuccessful();
      localSQLiteDatabase2.endTransaction();
      localSQLiteDatabase2.close();
      e.b(this.a, false);
      return Boolean.valueOf(true);
    }
    catch (Exception paramVarArgs)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */