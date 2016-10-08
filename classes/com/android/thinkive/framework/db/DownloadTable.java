package com.android.thinkive.framework.db;

public class DownloadTable
{
  public static final String CREATE_TABLE = "CREATE TABLE if not exists " + DownloadTable.DownloadEntry.TABLE_NAME + " (" + "_id" + " integer primary key autoincrement, " + "taskid" + " text, " + "name" + " text, " + "url" + " text, " + "mimeType" + " text, " + "savePath" + " text, " + "finishedSize" + " integer, " + "totalSize" + " integer, " + "status" + " integer" + " )";
  public static final String[] TABLE_COLUMNS = { "_id", "taskid", "name", "url", "mimeType", "savePath", "finishedSize", "totalSize", "status" };
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\db\DownloadTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */