package com.h.a.b.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

final class g
  implements b
{
  private static final Object f = new Object();
  private final File a;
  private final File b;
  private final int c;
  private Map d;
  private boolean e = false;
  private WeakHashMap<d, Object> g;
  
  g(File paramFile, int paramInt, Map paramMap)
  {
    this.a = paramFile;
    this.b = f.a(paramFile);
    this.c = paramInt;
    if (paramMap != null) {}
    for (;;)
    {
      this.d = paramMap;
      this.g = new WeakHashMap();
      return;
      paramMap = new HashMap();
    }
  }
  
  private FileOutputStream a(File paramFile)
  {
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
      return localFileOutputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      if (!paramFile.getParentFile().mkdir()) {
        return null;
      }
      try
      {
        paramFile = new FileOutputStream(paramFile);
        return paramFile;
      }
      catch (FileNotFoundException paramFile) {}
    }
    return null;
  }
  
  private boolean e()
  {
    if (this.a.exists()) {
      if (!this.b.exists()) {
        if (this.a.renameTo(this.b)) {
          break label44;
        }
      }
    }
    for (;;)
    {
      return false;
      this.a.delete();
      try
      {
        label44:
        FileOutputStream localFileOutputStream = a(this.a);
        if (localFileOutputStream == null) {
          continue;
        }
        i.a(this.d, localFileOutputStream);
        localFileOutputStream.close();
        this.b.delete();
        return true;
      }
      catch (IOException localIOException)
      {
        if (!this.a.exists()) {
          continue;
        }
        this.a.delete();
        return false;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        for (;;) {}
      }
    }
  }
  
  public long a(String paramString, long paramLong)
  {
    try
    {
      paramString = (Long)this.d.get(paramString);
      if (paramString != null) {
        paramLong = paramString.longValue();
      }
      return paramLong;
    }
    finally {}
  }
  
  public String a(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        paramString1 = (String)this.d.get(paramString1);
        if (paramString1 != null) {
          return paramString1;
        }
      }
      finally {}
      paramString1 = paramString2;
    }
  }
  
  public void a(Map paramMap)
  {
    if (paramMap != null) {
      try
      {
        this.d = paramMap;
        return;
      }
      finally {}
    }
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.e = paramBoolean;
      return;
    }
    finally {}
  }
  
  public boolean a()
  {
    return (this.a != null) && (new File(this.a.getAbsolutePath()).exists());
  }
  
  public Map<String, ?> b()
  {
    try
    {
      HashMap localHashMap = new HashMap(this.d);
      return localHashMap;
    }
    finally {}
  }
  
  public c c()
  {
    return new h(this);
  }
  
  public boolean d()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */