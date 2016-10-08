package com.iflytek.thirdparty;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.iflytek.cloud.util.ContactManager;
import com.iflytek.cloud.util.ContactManager.ContactListener;
import java.io.File;

public class av
  extends ContactManager
{
  private static av a = null;
  private static Context b = null;
  private static int c = 4;
  private static aB d = null;
  private static au e = null;
  private static av.a f;
  private static ContactManager.ContactListener h = null;
  private HandlerThread g = null;
  private Handler i;
  private long j = 0L;
  
  private av()
  {
    if (Build.VERSION.SDK_INT > c) {}
    for (d = new aA(b);; d = new az(b))
    {
      e = new au(b, d);
      this.g = new HandlerThread("ContactManager_worker");
      this.g.start();
      this.i = new Handler(this.g.getLooper());
      this.g.setPriority(1);
      f = new av.a(this, this.i);
      return;
    }
  }
  
  public static av a()
  {
    return a;
  }
  
  public static av a(Context paramContext, ContactManager.ContactListener paramContactListener)
  {
    h = paramContactListener;
    b = paramContext;
    if (a == null)
    {
      a = new av();
      b.getContentResolver().registerContentObserver(d.a(), true, f);
    }
    return a;
  }
  
  public static void c()
  {
    if (a != null)
    {
      a.b();
      a = null;
    }
  }
  
  private void d()
  {
    try
    {
      if ((h != null) && (e != null))
      {
        String str1 = ax.a(e.a(), '\n');
        String str2 = b.getFilesDir().getParent() + '/' + "name.txt";
        String str3 = aw.a(str2);
        if ((str1 != null) && (str3 != null) && (str1.equals(str3)))
        {
          X.a("iFly_ContactManager", "contact name is not change.");
          h.onContactQueryFinish(str1, false);
          return;
        }
        aw.a(str2, str1, true);
        h.onContactQueryFinish(str1, true);
        return;
      }
    }
    catch (Exception localException)
    {
      X.a(localException);
    }
  }
  
  public void asyncQueryAllContactsName()
  {
    this.i.post(new av.1(this));
  }
  
  public void b()
  {
    if (f != null)
    {
      b.getContentResolver().unregisterContentObserver(f);
      if (this.g != null) {
        this.g.quit();
      }
    }
  }
  
  public String queryAllContactsName()
  {
    if (e != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      String[] arrayOfString = e.a();
      int m = arrayOfString.length;
      int k = 0;
      while (k < m)
      {
        String str = arrayOfString[k];
        localStringBuilder.append(str + '\n');
        k += 1;
      }
      return localStringBuilder.toString();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */