package com.h.a.b.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class f
{
  private static final Object c = new Object();
  private final Object a = new Object();
  private File b;
  private HashMap<File, g> d = new HashMap();
  
  public f(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.b = new File(paramString);
      return;
    }
    throw new RuntimeException("Directory can not be empty");
  }
  
  private File a(File paramFile, String paramString)
  {
    if (paramString.indexOf(File.separatorChar) < 0) {
      return new File(paramFile, paramString);
    }
    throw new IllegalArgumentException("File " + paramString + " contains a path separator");
  }
  
  private File a(String paramString)
  {
    return a(b(), paramString + ".xml");
  }
  
  private File b()
  {
    synchronized (this.a)
    {
      File localFile = this.b;
      return localFile;
    }
  }
  
  private static File b(File paramFile)
  {
    return new File(paramFile.getPath() + ".bak");
  }
  
  public b a(String arg1, int paramInt)
  {
    localFile = a(???);
    synchronized (c)
    {
      g localg = (g)this.d.get(localFile);
      if ((localg != null) && (!localg.d())) {
        return localg;
      }
      ??? = b(localFile);
      if (???.exists())
      {
        localFile.delete();
        ???.renameTo(localFile);
      }
      if (localFile.exists()) {
        localFile.canRead();
      }
      Object localObject7 = null;
      Object localObject8 = null;
      Object localObject9 = null;
      Object localObject10 = null;
      Object localObject1 = null;
      ??? = (String)localObject1;
      if (localFile.exists())
      {
        ??? = (String)localObject1;
        if (localFile.canRead())
        {
          localObject1 = localObject7;
          localObject4 = localObject8;
          localObject5 = localObject9;
          localObject6 = localObject10;
        }
      }
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        localObject1 = localObject7;
        localObject4 = localObject8;
        localObject5 = localObject9;
        localObject6 = localObject10;
        ??? = i.a(localFileInputStream);
        localObject1 = ???;
        localObject4 = ???;
        localObject5 = ???;
        localObject6 = ???;
        localFileInputStream.close();
      }
      catch (XmlPullParserException ???)
      {
        for (;;)
        {
          try
          {
            ??? = new FileInputStream(localFile);
            localObject4 = new byte[???.available()];
            ???.read((byte[])localObject4);
            new String((byte[])localObject4, 0, localObject4.length, "UTF-8");
            ??? = (String)localObject2;
          }
          catch (FileNotFoundException ???)
          {
            ???.printStackTrace();
            ??? = (String)localObject2;
          }
          catch (IOException ???)
          {
            ???.printStackTrace();
            ??? = (String)localObject2;
          }
        }
      }
      catch (FileNotFoundException ???)
      {
        for (;;)
        {
          ???.printStackTrace();
          ??? = (String)localObject4;
        }
      }
      catch (IOException ???)
      {
        for (;;)
        {
          ???.printStackTrace();
          ??? = (String)localObject5;
        }
      }
      catch (Exception ???)
      {
        for (;;)
        {
          ???.printStackTrace();
          ??? = (String)localObject6;
          continue;
          localObject4 = (g)this.d.get(localFile);
          Object localObject3 = localObject4;
          if (localObject4 == null)
          {
            localObject3 = new g(localFile, paramInt, ???);
            this.d.put(localFile, localObject3);
          }
        }
      }
      localObject5 = c;
      if (localg != null) {
        try
        {
          localg.a(???);
          localObject1 = localg;
          return (b)localObject1;
        }
        finally {}
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */