package com.baidu.location.c;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

class f
  extends AsyncTask
{
  private f(e parame) {}
  
  protected Boolean a(Boolean... paramVarArgs)
  {
    Object localObject1 = null;
    if (paramVarArgs.length != 4) {
      return Boolean.valueOf(false);
    }
    try
    {
      localObject2 = SQLiteDatabase.openOrCreateDatabase(e.c(), null);
      localObject1 = localObject2;
    }
    catch (Exception localException2)
    {
      Object localObject2;
      int i;
      for (;;) {}
    }
    if (localObject1 == null) {
      return Boolean.valueOf(false);
    }
    i = (int)(System.currentTimeMillis() >> 28);
    for (;;)
    {
      try
      {
        ((SQLiteDatabase)localObject1).beginTransaction();
        if (paramVarArgs[0].booleanValue()) {
          localObject2 = "delete from wof where ac < " + (i - 35);
        }
      }
      catch (Exception paramVarArgs)
      {
        continue;
      }
      try
      {
        ((SQLiteDatabase)localObject1).execSQL((String)localObject2);
        if (paramVarArgs[1].booleanValue()) {
          paramVarArgs = "delete from bdcltb09 where ac is NULL or ac < " + (i - 130);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          ((SQLiteDatabase)localObject1).execSQL(paramVarArgs);
          ((SQLiteDatabase)localObject1).setTransactionSuccessful();
          ((SQLiteDatabase)localObject1).endTransaction();
          ((SQLiteDatabase)localObject1).close();
          return Boolean.valueOf(true);
          localException1 = localException1;
        }
        catch (Exception paramVarArgs) {}
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */