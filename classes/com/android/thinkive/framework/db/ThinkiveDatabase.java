package com.android.thinkive.framework.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.thinkive.framework.cache.DataDiskCache.CacheHeader;
import com.android.thinkive.framework.download.DownloadItemBean;
import com.android.thinkive.framework.download.DownloadStatus;
import java.util.ArrayList;
import java.util.HashMap;

public class ThinkiveDatabase
{
  private static final String DB_NAME = "thinkive.db";
  private static int DB_VERISON = 3;
  private static ThinkiveDatabase sInstance;
  private Context mContext;
  private ThinkiveDatabase.DatabaseHelper mDatabaseHelper = null;
  
  private ThinkiveDatabase(Context paramContext)
  {
    this.mContext = paramContext;
    this.mDatabaseHelper = new ThinkiveDatabase.DatabaseHelper(this.mContext);
  }
  
  private ContentValues buildDownloadValues(DownloadItemBean paramDownloadItemBean)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("taskid", paramDownloadItemBean.getTaskId());
    localContentValues.put("url", paramDownloadItemBean.getUrl());
    localContentValues.put("mimeType", paramDownloadItemBean.getMimeType());
    localContentValues.put("savePath", paramDownloadItemBean.getSavePath());
    localContentValues.put("finishedSize", Long.valueOf(paramDownloadItemBean.getFinishedSize()));
    localContentValues.put("totalSize", Long.valueOf(paramDownloadItemBean.getTotalSize()));
    localContentValues.put("name", paramDownloadItemBean.getName());
    localContentValues.put("status", Integer.valueOf(paramDownloadItemBean.getStatus().ordinal()));
    return localContentValues;
  }
  
  public static ThinkiveDatabase getInstance(Context paramContext)
  {
    try
    {
      if (sInstance == null) {
        sInstance = new ThinkiveDatabase(paramContext);
      }
      paramContext = sInstance;
      return paramContext;
    }
    finally {}
  }
  
  private boolean isMapRecordExist(String paramString)
  {
    paramString = this.mDatabaseHelper.getReadableDatabase().query(MapTable.MapEntry.TABLE_NAME, MapTable.TABLE_COLUMNS, "key=?", new String[] { paramString }, null, null, null);
    if ((paramString != null) && (paramString.getCount() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      if (paramString != null) {
        paramString.close();
      }
      return bool;
    }
  }
  
  private DownloadItemBean restoreDownloadItemFromCursor(Cursor paramCursor)
  {
    DownloadItemBean localDownloadItemBean = new DownloadItemBean();
    localDownloadItemBean.setTaskId(paramCursor.getString(paramCursor.getColumnIndex("taskid")));
    localDownloadItemBean.setName(paramCursor.getString(paramCursor.getColumnIndex("name")));
    localDownloadItemBean.setUrl(paramCursor.getString(paramCursor.getColumnIndex("url")));
    localDownloadItemBean.setMimeType(paramCursor.getString(paramCursor.getColumnIndex("mimeType")));
    localDownloadItemBean.setSavePath(paramCursor.getString(paramCursor.getColumnIndex("savePath")));
    localDownloadItemBean.setFinishedSize(paramCursor.getLong(paramCursor.getColumnIndex("finishedSize")));
    localDownloadItemBean.setTotalSize(paramCursor.getLong(paramCursor.getColumnIndex("totalSize")));
    localDownloadItemBean.setStatus(DownloadStatus.valueOf(paramCursor.getInt(paramCursor.getColumnIndex("status"))));
    return localDownloadItemBean;
  }
  
  public void close()
  {
    if (sInstance != null)
    {
      this.mDatabaseHelper.close();
      sInstance = null;
    }
  }
  
  public boolean deleteAllDataCache()
  {
    return this.mDatabaseHelper.getWritableDatabase().delete(DataCacheTable.DataCacheEntry.TABLE_NAME, null, null) > 0;
  }
  
  public boolean deleteAllMapData()
  {
    return this.mDatabaseHelper.getWritableDatabase().delete(MapTable.MapEntry.TABLE_NAME, null, null) > 0;
  }
  
  public boolean deleteAllServerUrlData()
  {
    return this.mDatabaseHelper.getWritableDatabase().delete(ServerUrlTable.ServerUrlEntry.TABLE_NAME, null, null) > 0;
  }
  
  public boolean deleteDataCache(String paramString)
  {
    return this.mDatabaseHelper.getWritableDatabase().delete(DataCacheTable.DataCacheEntry.TABLE_NAME, "key=?", new String[] { paramString }) > 0;
  }
  
  public boolean deleteMapData(String paramString)
  {
    return this.mDatabaseHelper.getWritableDatabase().delete(MapTable.MapEntry.TABLE_NAME, "key=?", new String[] { paramString }) > 0;
  }
  
  public boolean deleteServerUrlData(String paramString)
  {
    return this.mDatabaseHelper.getWritableDatabase().delete(ServerUrlTable.ServerUrlEntry.TABLE_NAME, "config_name=?", new String[] { paramString }) > 0;
  }
  
  public DownloadItemBean findDownloadItemById(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = null;
    if (TextUtils.isEmpty(paramString)) {
      localObject = localCursor;
    }
    do
    {
      return (DownloadItemBean)localObject;
      localCursor = this.mDatabaseHelper.getReadableDatabase().query(DownloadTable.DownloadEntry.TABLE_NAME, null, "taskid=?", new String[] { paramString }, null, null, null);
      paramString = (String)localObject;
      if (localCursor != null)
      {
        paramString = (String)localObject;
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToNext();
          paramString = restoreDownloadItemFromCursor(localCursor);
        }
      }
      localObject = paramString;
    } while (localCursor == null);
    localCursor.close();
    return paramString;
  }
  
  public DownloadItemBean findDownloadItemByUrl(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = null;
    if (TextUtils.isEmpty(paramString)) {
      localObject = localCursor;
    }
    do
    {
      return (DownloadItemBean)localObject;
      localCursor = this.mDatabaseHelper.getReadableDatabase().query(DownloadTable.DownloadEntry.TABLE_NAME, null, "url=?", new String[] { paramString }, null, null, null);
      paramString = (String)localObject;
      if (localCursor != null)
      {
        paramString = (String)localObject;
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToNext();
          paramString = restoreDownloadItemFromCursor(localCursor);
        }
      }
      localObject = paramString;
    } while (localCursor == null);
    localCursor.close();
    return paramString;
  }
  
  public ArrayList<DataDiskCache.CacheHeader> getAllDataCache()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.mDatabaseHelper.getReadableDatabase().query(DataCacheTable.DataCacheEntry.TABLE_NAME, DataCacheTable.TABLE_COLUMNS, null, null, null, null, null);
    for (;;)
    {
      if (!localCursor.moveToNext())
      {
        if (localCursor != null) {
          localCursor.close();
        }
        return localArrayList;
      }
      String str1 = localCursor.getString(localCursor.getColumnIndex("key"));
      String str2 = localCursor.getString(localCursor.getColumnIndex("size"));
      String str3 = localCursor.getString(localCursor.getColumnIndex("ttl"));
      DataDiskCache.CacheHeader localCacheHeader = new DataDiskCache.CacheHeader();
      localCacheHeader.key = str1;
      localCacheHeader.size = Long.parseLong(str2);
      localCacheHeader.ttl = Long.parseLong(str3);
      localArrayList.add(localCacheHeader);
    }
  }
  
  public ArrayList<DownloadItemBean> getAllDownloadItem()
  {
    Object localObject = this.mDatabaseHelper.getReadableDatabase();
    ArrayList localArrayList = new ArrayList();
    localObject = ((SQLiteDatabase)localObject).query(DownloadTable.DownloadEntry.TABLE_NAME, null, null, null, null, null, null);
    for (;;)
    {
      if (!((Cursor)localObject).moveToNext())
      {
        ((Cursor)localObject).close();
        return localArrayList;
      }
      localArrayList.add(restoreDownloadItemFromCursor((Cursor)localObject));
    }
  }
  
  public HashMap<String, String> getAllServerUrlData()
  {
    HashMap localHashMap = new HashMap();
    Cursor localCursor = this.mDatabaseHelper.getReadableDatabase().query(ServerUrlTable.ServerUrlEntry.TABLE_NAME, ServerUrlTable.TABLE_COLUMNS, null, null, null, null, null);
    for (;;)
    {
      if (!localCursor.moveToNext())
      {
        if (localCursor != null) {
          localCursor.close();
        }
        return localHashMap;
      }
      localHashMap.put(localCursor.getString(localCursor.getColumnIndex("config_name")), localCursor.getString(localCursor.getColumnIndex("config_value")));
    }
  }
  
  public DataDiskCache.CacheHeader getDataCache(String paramString)
  {
    String str1 = null;
    Cursor localCursor = this.mDatabaseHelper.getReadableDatabase().query(DataCacheTable.DataCacheEntry.TABLE_NAME, DataCacheTable.TABLE_COLUMNS, "key=?", new String[] { paramString }, null, null, null);
    Object localObject = str1;
    if (localCursor != null)
    {
      localObject = str1;
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        localObject = new DataDiskCache.CacheHeader();
        str1 = localCursor.getString(localCursor.getColumnIndex("size"));
        String str2 = localCursor.getString(localCursor.getColumnIndex("ttl"));
        ((DataDiskCache.CacheHeader)localObject).key = paramString;
        ((DataDiskCache.CacheHeader)localObject).size = Long.parseLong(str1);
        ((DataDiskCache.CacheHeader)localObject).ttl = Long.parseLong(str2);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return (DataDiskCache.CacheHeader)localObject;
  }
  
  public String getMapData(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = this.mDatabaseHelper.getReadableDatabase().query(MapTable.MapEntry.TABLE_NAME, MapTable.TABLE_COLUMNS, "key=?", new String[] { paramString }, null, null, null);
    paramString = (String)localObject;
    if (localCursor != null)
    {
      paramString = (String)localObject;
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        paramString = localCursor.getString(localCursor.getColumnIndex("value"));
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return paramString;
  }
  
  public String getServerUrlData(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = this.mDatabaseHelper.getReadableDatabase().query(ServerUrlTable.ServerUrlEntry.TABLE_NAME, ServerUrlTable.TABLE_COLUMNS, "config_name=?", new String[] { paramString }, null, null, null);
    paramString = (String)localObject;
    if (localCursor != null)
    {
      paramString = (String)localObject;
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        paramString = localCursor.getString(localCursor.getColumnIndex("config_value"));
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return paramString;
  }
  
  public long insertDataCache(DataDiskCache.CacheHeader paramCacheHeader)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    String str = paramCacheHeader.key;
    long l1 = paramCacheHeader.size;
    long l2 = paramCacheHeader.ttl;
    if (isDataCacheRecordExist(str)) {
      return updateDataCache(paramCacheHeader);
    }
    paramCacheHeader = new ContentValues();
    paramCacheHeader.put("key", str);
    paramCacheHeader.put("size", String.valueOf(l1));
    paramCacheHeader.put("ttl", String.valueOf(l2));
    return localSQLiteDatabase.insert(DataCacheTable.DataCacheEntry.TABLE_NAME, null, paramCacheHeader);
  }
  
  public long insertMapData(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    if (isMapRecordExist(paramString1)) {
      return updateMapData(paramString1, paramString2);
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", paramString1);
    localContentValues.put("value", paramString2);
    return localSQLiteDatabase.insert(MapTable.MapEntry.TABLE_NAME, null, localContentValues);
  }
  
  public long insertServerUrlData(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    if (isServerUrlRecordExist(paramString1)) {
      return updateServerUrlData(paramString1, paramString2);
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("config_name", paramString1);
    localContentValues.put("config_value", paramString2);
    return localSQLiteDatabase.insert(ServerUrlTable.ServerUrlEntry.TABLE_NAME, null, localContentValues);
  }
  
  public boolean isDataCacheRecordExist(String paramString)
  {
    paramString = this.mDatabaseHelper.getReadableDatabase().query(DataCacheTable.DataCacheEntry.TABLE_NAME, DataCacheTable.TABLE_COLUMNS, "key=?", new String[] { paramString }, null, null, null);
    if ((paramString != null) && (paramString.getCount() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      if (paramString != null) {
        paramString.close();
      }
      return bool;
    }
  }
  
  public boolean isServerUrlRecordExist(String paramString)
  {
    paramString = this.mDatabaseHelper.getReadableDatabase().query(ServerUrlTable.ServerUrlEntry.TABLE_NAME, ServerUrlTable.TABLE_COLUMNS, "config_name=?", new String[] { paramString }, null, null, null);
    if ((paramString != null) && (paramString.getCount() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      if (paramString != null) {
        paramString.close();
      }
      return bool;
    }
  }
  
  public long saveDownloadItem(DownloadItemBean paramDownloadItemBean)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    paramDownloadItemBean = buildDownloadValues(paramDownloadItemBean);
    return localSQLiteDatabase.insert(DownloadTable.DownloadEntry.TABLE_NAME, null, paramDownloadItemBean);
  }
  
  public int updateDataCache(DataDiskCache.CacheHeader paramCacheHeader)
  {
    String str = paramCacheHeader.key;
    long l1 = paramCacheHeader.size;
    long l2 = paramCacheHeader.ttl;
    paramCacheHeader = this.mDatabaseHelper.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", str);
    localContentValues.put("size", String.valueOf(l1));
    localContentValues.put("ttl", String.valueOf(l2));
    return paramCacheHeader.update(DataCacheTable.DataCacheEntry.TABLE_NAME, localContentValues, "key=?", new String[] { str });
  }
  
  public long updateDownloadItem(DownloadItemBean paramDownloadItemBean)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    ContentValues localContentValues = buildDownloadValues(paramDownloadItemBean);
    return localSQLiteDatabase.update(DownloadTable.DownloadEntry.TABLE_NAME, localContentValues, "taskid=?", new String[] { paramDownloadItemBean.getTaskId() });
  }
  
  public int updateMapData(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", paramString1);
    localContentValues.put("value", paramString2);
    return localSQLiteDatabase.update(MapTable.MapEntry.TABLE_NAME, localContentValues, "key=?", new String[] { paramString1 });
  }
  
  public int updateServerUrlData(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.mDatabaseHelper.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("config_name", paramString1);
    localContentValues.put("config_value", paramString2);
    return localSQLiteDatabase.update(ServerUrlTable.ServerUrlEntry.TABLE_NAME, localContentValues, "config_name=?", new String[] { paramString1 });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\db\ThinkiveDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */