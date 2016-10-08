package qalsdk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class r
  extends SQLiteOpenHelper
{
  private static int a = 6;
  private static String b = "create table conntime(_id INTEGER PRIMARY KEY,timestamp INTEGER NOT NULL,cost_time INTEGER NOT NULL,result CHAR NOT NULL,os CHAR(20) ,os_version CHAR(20) ,sdk_version INTEGER NOT NULL,process_status INTEGER NOT NULL,server_ip_port CHAR(100) ,gateway_ip CHAR(20) ,errcode INTEGER DEFAULT 0 ,net_info VAECHAR(500) )";
  
  public r(Context paramContext)
  {
    super(paramContext, "qal_monitor.db", null, a);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(b);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table conntime");
    paramSQLiteDatabase.execSQL(b);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */