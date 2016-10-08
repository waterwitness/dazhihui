package com.e.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

public class v
  implements CookieStore
{
  private boolean a = false;
  private final ConcurrentHashMap<String, Cookie> b;
  private final SharedPreferences c;
  
  public v(Context paramContext)
  {
    this.c = paramContext.getSharedPreferences("CookiePrefsFile", 0);
    this.b = new ConcurrentHashMap();
    paramContext = this.c.getString("names", null);
    int j;
    if (paramContext != null)
    {
      paramContext = TextUtils.split(paramContext, ",");
      j = paramContext.length;
    }
    for (;;)
    {
      if (i >= j)
      {
        clearExpired(new Date());
        return;
      }
      String str = paramContext[i];
      Object localObject = this.c.getString("cookie_" + str, null);
      if (localObject != null)
      {
        localObject = a((String)localObject);
        if (localObject != null) {
          this.b.put(str, localObject);
        }
      }
      i += 1;
    }
  }
  
  protected String a(ae paramae)
  {
    if (paramae == null) {
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramae);
      return a(localByteArrayOutputStream.toByteArray());
    }
    catch (IOException paramae)
    {
      Log.d("PersistentCookieStore", "IOException in encodeCookie", paramae);
    }
    return null;
  }
  
  protected String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int j = paramArrayOfByte.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return localStringBuilder.toString().toUpperCase(Locale.US);
      }
      int k = paramArrayOfByte[i] & 0xFF;
      if (k < 16) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(Integer.toHexString(k));
      i += 1;
    }
  }
  
  protected Cookie a(String paramString)
  {
    paramString = new ByteArrayInputStream(b(paramString));
    try
    {
      paramString = ((ae)new ObjectInputStream(paramString).readObject()).a();
      return paramString;
    }
    catch (IOException paramString)
    {
      Log.d("PersistentCookieStore", "IOException in decodeCookie", paramString);
      return null;
    }
    catch (ClassNotFoundException paramString)
    {
      Log.d("PersistentCookieStore", "ClassNotFoundException in decodeCookie", paramString);
    }
    return null;
  }
  
  public void addCookie(Cookie paramCookie)
  {
    if ((this.a) && (!paramCookie.isPersistent())) {
      return;
    }
    String str = paramCookie.getName() + paramCookie.getDomain();
    if (!paramCookie.isExpired(new Date())) {
      this.b.put(str, paramCookie);
    }
    for (;;)
    {
      SharedPreferences.Editor localEditor = this.c.edit();
      localEditor.putString("names", TextUtils.join(",", this.b.keySet()));
      localEditor.putString("cookie_" + str, a(new ae(paramCookie)));
      localEditor.commit();
      return;
      this.b.remove(str);
    }
  }
  
  protected byte[] b(String paramString)
  {
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return arrayOfByte;
      }
      arrayOfByte[(i / 2)] = ((byte)((Character.digit(paramString.charAt(i), 16) << 4) + Character.digit(paramString.charAt(i + 1), 16)));
      i += 2;
    }
  }
  
  public void clear()
  {
    SharedPreferences.Editor localEditor = this.c.edit();
    Iterator localIterator = this.b.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        localEditor.remove("names");
        localEditor.commit();
        this.b.clear();
        return;
      }
      String str = (String)localIterator.next();
      localEditor.remove("cookie_" + str);
    }
  }
  
  public boolean clearExpired(Date paramDate)
  {
    SharedPreferences.Editor localEditor = this.c.edit();
    Iterator localIterator = this.b.entrySet().iterator();
    boolean bool = false;
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        if (bool) {
          localEditor.putString("names", TextUtils.join(",", this.b.keySet()));
        }
        localEditor.commit();
        return bool;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      if (((Cookie)localEntry.getValue()).isExpired(paramDate))
      {
        this.b.remove(str);
        localEditor.remove("cookie_" + str);
        bool = true;
      }
    }
  }
  
  public List<Cookie> getCookies()
  {
    return new ArrayList(this.b.values());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */