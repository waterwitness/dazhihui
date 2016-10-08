package com.android.thinkive.framework.db;

public class DataCacheTable
{
  public static final String CREATE_TABLE = "CREATE TABLE if not exists " + DataCacheTable.DataCacheEntry.TABLE_NAME + " (" + "_id" + " integer primary key autoincrement, " + "key" + " text, " + "size" + " text, " + "ttl" + " text" + " )";
  public static final String[] TABLE_COLUMNS = { "_id", "key", "size", "ttl" };
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\db\DataCacheTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */