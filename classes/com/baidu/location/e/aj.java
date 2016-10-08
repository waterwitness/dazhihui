package com.baidu.location.e;

import android.os.Environment;
import java.io.File;

class aj
  extends Thread
{
  aj(l paraml) {}
  
  public void run()
  {
    File localFile = new File(Environment.getExternalStorageDirectory() + "/baidu/tempdata", "intime.dat");
    l.a(this.a, localFile, "http://itsdata.map.baidu.com/long-conn-gps/sdk.php");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */