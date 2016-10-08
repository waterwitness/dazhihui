package com.iflytek.cloud.util;

import android.content.Context;
import com.iflytek.thirdparty.av;

public abstract class ContactManager
{
  public static ContactManager createManager(Context paramContext, ContactManager.ContactListener paramContactListener)
  {
    return av.a(paramContext, paramContactListener);
  }
  
  public static void destroy() {}
  
  public static ContactManager getManager()
  {
    return av.a();
  }
  
  public abstract void asyncQueryAllContactsName();
  
  public abstract String queryAllContactsName();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\ContactManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */