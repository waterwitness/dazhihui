package com.android.thinkive.framework.db;

public class ServerUrlTable
{
  public static final String CREATE_TABLE = "CREATE TABLE if not exists " + ServerUrlTable.ServerUrlEntry.TABLE_NAME + " (" + "_id" + " integer primary key autoincrement, " + "config_name" + " text, " + "config_value" + " text" + " )";
  public static final String[] TABLE_COLUMNS = { "_id", "config_name", "config_value" };
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\db\ServerUrlTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */