package com.android.thinkive.framework.db;

public class MapTable
{
  public static final String CREATE_TABLE = "CREATE TABLE if not exists " + MapTable.MapEntry.TABLE_NAME + " (" + "_id" + " integer primary key autoincrement, " + "key" + " text, " + "value" + " text" + " )";
  public static final String[] TABLE_COLUMNS = { "_id", "key", "value" };
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\db\MapTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */