package com.g.a.a.b;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class a
  implements b
{
  private final Map<String, Reference<Bitmap>> a = Collections.synchronizedMap(new HashMap());
  
  public Bitmap a(String paramString)
  {
    paramString = (Reference)this.a.get(paramString);
    if (paramString != null) {
      return (Bitmap)paramString.get();
    }
    return null;
  }
  
  protected abstract Reference<Bitmap> a(Bitmap paramBitmap);
  
  public Collection<String> a()
  {
    synchronized (this.a)
    {
      HashSet localHashSet = new HashSet(this.a.keySet());
      return localHashSet;
    }
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    this.a.put(paramString, a(paramBitmap));
    return true;
  }
  
  public Bitmap b(String paramString)
  {
    paramString = (Reference)this.a.remove(paramString);
    if (paramString == null) {
      return null;
    }
    return (Bitmap)paramString.get();
  }
  
  public void b()
  {
    this.a.clear();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */