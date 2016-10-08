package com.baidu.location;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.baidu.location.a.a;
import com.baidu.location.b.e;
import com.baidu.location.b.l;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.RandomAccessFile;

public class f
  extends Service
{
  public static String d = "repll.jar";
  public static Context e = null;
  public static boolean f = false;
  g a = null;
  g b = null;
  g c = null;
  
  public static float a()
  {
    return 6.12F;
  }
  
  private boolean a(File paramFile)
  {
    boolean bool1 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    Object localObject1 = e.a + "/grtcf.dat";
    boolean bool2 = bool4;
    try
    {
      localObject1 = new File((String)localObject1);
      bool2 = bool4;
      if (((File)localObject1).exists())
      {
        bool2 = bool4;
        localObject1 = new RandomAccessFile((File)localObject1, "rw");
        bool2 = bool4;
        ((RandomAccessFile)localObject1).seek(200L);
        bool1 = bool3;
        bool2 = bool4;
        if (((RandomAccessFile)localObject1).readBoolean())
        {
          bool1 = bool3;
          bool2 = bool4;
          if (((RandomAccessFile)localObject1).readBoolean())
          {
            bool2 = bool4;
            int i = ((RandomAccessFile)localObject1).readInt();
            bool1 = bool3;
            if (i != 0)
            {
              bool2 = bool4;
              Object localObject2 = new byte[i];
              bool2 = bool4;
              ((RandomAccessFile)localObject1).read((byte[])localObject2, 0, i);
              bool2 = bool4;
              localObject2 = new String((byte[])localObject2);
              bool2 = bool4;
              paramFile = l.a(paramFile);
              bool1 = bool3;
              if (localObject2 != null)
              {
                bool1 = bool3;
                if (paramFile != null)
                {
                  bool1 = bool3;
                  bool2 = bool4;
                  if (paramFile.equals(localObject2)) {
                    bool1 = true;
                  }
                }
              }
            }
          }
        }
        bool2 = bool1;
        ((RandomAccessFile)localObject1).close();
      }
      return bool1;
    }
    catch (Exception paramFile) {}
    return bool2;
  }
  
  public static Context b()
  {
    return e;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.c.onBind(paramIntent);
  }
  
  public void onCreate()
  {
    e = getApplicationContext();
    System.currentTimeMillis();
    this.b = new a();
    try
    {
      File localFile1 = new File(l.g() + File.separator + d);
      File localFile2 = new File(l.g() + File.separator + "app.jar");
      if (localFile1.exists())
      {
        if (localFile2.exists()) {
          localFile2.delete();
        }
        localFile1.renameTo(localFile2);
      }
      if (localFile2.exists()) {
        this.a = ((g)new DexClassLoader(l.g() + File.separator + "app.jar", l.g(), null, getClassLoader()).loadClass("com.baidu.serverLoc.LocationService").newInstance());
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.a = null;
        continue;
        this.c = this.b;
        this.a = null;
      }
    }
    if ((this.a != null) && (this.a.a() >= this.b.a()) && (a(new File(l.g() + File.separator + "app.jar"))))
    {
      this.c = this.a;
      this.b = null;
      f = true;
      this.c.a(this);
      return;
    }
  }
  
  public void onDestroy()
  {
    f = false;
    this.c.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return this.c.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    return this.c.a(paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */