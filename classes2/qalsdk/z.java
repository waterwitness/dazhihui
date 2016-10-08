package qalsdk;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class z
  extends SQLiteOpenHelper
{
  public z(Context paramContext)
  {
    super(paramContext, "qalcache.sqlite", null, 2);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS t_cache_meta(key CHARACTOR(32) PRIMARY KEY, accessTime BIGINT DEFAULT 0, ttl BIGINT DEFAULT 0, softTtl BIGINT DEFAULT 0, entrySize INT DEFAULT 0,checksum INT DEFAULT 0,etag CHARACTOR(64) DEFAULT NULL,lastModified CHARACTOR(64) DEFAULT NULL,isPartial INT DEFAULT 0)");
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS t_cache_summary(id BIGINT PRIMARY KEY,currentSize BIGINT DEFAULT 0)");
      paramSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;PRAGMA synchronous = OFF;PRAGMA journal_mode = MEMORY;");
      paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_acctime ON t_cache_meta(accessTime)");
      return;
    }
    catch (SQLException paramSQLiteDatabase)
    {
      paramSQLiteDatabase.printStackTrace();
    }
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    super.onOpen(paramSQLiteDatabase);
    try
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS t_cache_meta(key CHARACTOR(32) PRIMARY KEY, accessTime BIGINT DEFAULT 0, ttl BIGINT DEFAULT 0, softTtl BIGINT DEFAULT 0, entrySize INT DEFAULT 0,checksum INT DEFAULT 0,etag CHARACTOR(64) DEFAULT NULL,lastModified CHARACTOR(64) DEFAULT NULL,isPartial INT DEFAULT 0)");
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS t_cache_summary(id BIGINT PRIMARY KEY,currentSize BIGINT DEFAULT 0)");
      paramSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;PRAGMA synchronous = OFF;PRAGMA journal_mode = MEMORY;");
      paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_acctime ON t_cache_meta(accessTime)");
      return;
    }
    catch (SQLException paramSQLiteDatabase)
    {
      paramSQLiteDatabase.printStackTrace();
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      paramSQLiteDatabase.execSQL("drop table t_cache_meta");
      paramSQLiteDatabase.execSQL("drop table t_cache_summary");
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS t_cache_meta(key CHARACTOR(32) PRIMARY KEY, accessTime BIGINT DEFAULT 0, ttl BIGINT DEFAULT 0, softTtl BIGINT DEFAULT 0, entrySize INT DEFAULT 0,checksum INT DEFAULT 0,etag CHARACTOR(64) DEFAULT NULL,lastModified CHARACTOR(64) DEFAULT NULL,isPartial INT DEFAULT 0)");
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS t_cache_summary(id BIGINT PRIMARY KEY,currentSize BIGINT DEFAULT 0)");
      paramSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;PRAGMA synchronous = OFF;PRAGMA journal_mode = MEMORY;");
      paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_acctime ON t_cache_meta(accessTime)");
      return;
    }
    catch (SQLException paramSQLiteDatabase)
    {
      paramSQLiteDatabase.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */