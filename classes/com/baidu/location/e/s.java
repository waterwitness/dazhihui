package com.baidu.location.e;

import android.location.Location;
import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.b.e;
import com.baidu.location.b.l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

public class s
{
  private static s a = null;
  private static String b = "Temp_in.dat";
  private static File c = new File(e.a, b);
  private static StringBuffer d = null;
  private static boolean e = true;
  private static int f = 0;
  private static int g = 0;
  private static long h = 0L;
  private static long i = 0L;
  private static long j = 0L;
  private static double k = 0.0D;
  private static double l = 0.0D;
  private static int m = 0;
  private static int n = 0;
  private static int o = 0;
  private String p = null;
  private boolean q = true;
  
  private s(String paramString)
  {
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() <= 100) {}
    }
    for (String str = paramString.substring(0, 100);; str = "")
    {
      this.p = str;
      return;
    }
  }
  
  public static s a()
  {
    if (a == null) {
      a = new s(b.a().c());
    }
    return a;
  }
  
  private String a(int paramInt)
  {
    if (!c.exists()) {
      return null;
    }
    for (;;)
    {
      try
      {
        localObject = new RandomAccessFile(c, "rw");
        ((RandomAccessFile)localObject).seek(0L);
        i1 = ((RandomAccessFile)localObject).readInt();
        if (a(i1, ((RandomAccessFile)localObject).readInt(), ((RandomAccessFile)localObject).readInt())) {
          break label150;
        }
        ((RandomAccessFile)localObject).close();
        d();
        return null;
      }
      catch (IOException localIOException)
      {
        Object localObject;
        long l1;
        byte[] arrayOfByte;
        return null;
      }
      ((RandomAccessFile)localObject).close();
      return null;
      l1 = 12L + 0L + (paramInt - 1) * 1024;
      ((RandomAccessFile)localObject).seek(l1);
      int i1 = ((RandomAccessFile)localObject).readInt();
      arrayOfByte = new byte[i1];
      ((RandomAccessFile)localObject).seek(l1 + 4L);
      paramInt = 0;
      if (paramInt < i1)
      {
        arrayOfByte[paramInt] = ((RandomAccessFile)localObject).readByte();
        paramInt += 1;
      }
      else
      {
        ((RandomAccessFile)localObject).close();
        localObject = new String(arrayOfByte);
        return (String)localObject;
        label150:
        if (paramInt != 0) {
          if (paramInt != i1 + 1) {}
        }
      }
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    if ((paramInt1 < 0) || (paramInt1 > l.Y)) {
      bool = false;
    }
    do
    {
      return bool;
      if ((paramInt2 < 0) || (paramInt2 > paramInt1 + 1)) {
        return false;
      }
    } while ((paramInt3 >= 1) && (paramInt3 <= paramInt1 + 1) && (paramInt3 <= l.Y));
    return false;
  }
  
  private boolean a(Location paramLocation, int paramInt1, int paramInt2)
  {
    if ((paramLocation == null) || (!l.U) || (!this.q) || (!i.a().b)) {
      return false;
    }
    if (l.W < 5)
    {
      l.W = 5;
      if (l.X >= 5) {
        break label226;
      }
      l.X = 5;
    }
    double d1;
    double d2;
    long l1;
    for (;;)
    {
      d1 = paramLocation.getLongitude();
      d2 = paramLocation.getLatitude();
      l1 = paramLocation.getTime() / 1000L;
      if (!e) {
        break label244;
      }
      f = 1;
      d = new StringBuffer("");
      d.append(String.format(Locale.CHINA, "&nr=%s&traj=%d,%.5f,%.5f|", new Object[] { this.p, Long.valueOf(l1), Double.valueOf(d1), Double.valueOf(d2) }));
      g = d.length();
      h = l1;
      k = d1;
      l = d2;
      i = Math.floor(d1 * 100000.0D + 0.5D);
      j = Math.floor(d2 * 100000.0D + 0.5D);
      e = false;
      return true;
      if (l.W <= 1000) {
        break;
      }
      l.W = 1000;
      break;
      label226:
      if (l.X > 3600) {
        l.X = 3600;
      }
    }
    label244:
    paramLocation = new float[1];
    Location.distanceBetween(d2, d1, l, k, paramLocation);
    long l2 = h;
    if ((paramLocation[0] >= l.W) || (l1 - l2 >= l.X))
    {
      if (d == null)
      {
        f += 1;
        g = 0;
        d = new StringBuffer("");
        d.append(String.format(Locale.CHINA, "&nr=%s&traj=%d,%.5f,%.5f|", new Object[] { this.p, Long.valueOf(l1), Double.valueOf(d1), Double.valueOf(d2) }));
        g = d.length();
        h = l1;
        k = d1;
        l = d2;
        i = Math.floor(d1 * 100000.0D + 0.5D);
      }
      long l3;
      for (j = Math.floor(d2 * 100000.0D + 0.5D);; j = l3)
      {
        if (g + 15 > 750)
        {
          a(d.toString());
          d = null;
        }
        if (f >= l.Y) {
          this.q = false;
        }
        return true;
        k = d1;
        l = d2;
        l2 = Math.floor(d1 * 100000.0D + 0.5D);
        l3 = Math.floor(d2 * 100000.0D + 0.5D);
        m = (int)(l1 - h);
        n = (int)(l2 - i);
        o = (int)(l3 - j);
        d.append(String.format(Locale.CHINA, "%d,%d,%d|", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(o) }));
        g = d.length();
        h = l1;
        i = l2;
      }
    }
    return false;
  }
  
  private boolean a(String paramString)
  {
    if ((paramString == null) || (!paramString.startsWith("&nr"))) {}
    while ((!c.exists()) && (!d())) {
      return false;
    }
    for (;;)
    {
      int i4;
      try
      {
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(c, "rw");
        localRandomAccessFile.seek(0L);
        int i3 = localRandomAccessFile.readInt();
        i2 = localRandomAccessFile.readInt();
        i4 = localRandomAccessFile.readInt();
        if (!a(i3, i2, i4))
        {
          localRandomAccessFile.close();
          d();
          return false;
        }
        if (l.V) {
          if (i3 != l.Y)
          {
            if ((i4 > 1) && (paramString.equals(a(i4 - 1))))
            {
              localRandomAccessFile.close();
              return false;
            }
          }
          else
          {
            if (i4 != 1) {
              break label470;
            }
            i1 = l.Y;
            if (paramString.equals(a(i1)))
            {
              localRandomAccessFile.close();
              return false;
            }
          }
        }
        localRandomAccessFile.seek((i4 - 1) * 1024 + 12 + 0L);
        if (paramString.length() > 750)
        {
          localRandomAccessFile.close();
          return false;
        }
        paramString = Jni.a(paramString);
        i1 = paramString.length();
        if (i1 > 1020)
        {
          localRandomAccessFile.close();
          return false;
        }
        localRandomAccessFile.writeInt(i1);
        localRandomAccessFile.writeBytes(paramString);
        if (i3 == 0)
        {
          localRandomAccessFile.seek(0L);
          localRandomAccessFile.writeInt(1);
          localRandomAccessFile.writeInt(1);
          localRandomAccessFile.writeInt(2);
          localRandomAccessFile.close();
          return true;
        }
        if (i3 < l.Y - 1)
        {
          localRandomAccessFile.seek(0L);
          localRandomAccessFile.writeInt(i3 + 1);
          localRandomAccessFile.seek(8L);
          localRandomAccessFile.writeInt(i3 + 2);
          continue;
        }
        if (i3 == l.Y - 1)
        {
          localRandomAccessFile.seek(0L);
          localRandomAccessFile.writeInt(l.Y);
          if ((i2 == 0) || (i2 == 1)) {
            localRandomAccessFile.writeInt(2);
          }
          localRandomAccessFile.seek(8L);
          localRandomAccessFile.writeInt(1);
          continue;
        }
        if (i4 == i2)
        {
          if (i4 != l.Y) {
            break label478;
          }
          i1 = 1;
          if (i1 != l.Y) {
            break label486;
          }
          i2 = 1;
          localRandomAccessFile.seek(4L);
          localRandomAccessFile.writeInt(i2);
          localRandomAccessFile.writeInt(i1);
          continue;
        }
        if (i4 == l.Y)
        {
          i1 = 1;
          if (i1 == i2)
          {
            if (i1 == l.Y)
            {
              i2 = 1;
              localRandomAccessFile.seek(4L);
              localRandomAccessFile.writeInt(i2);
            }
          }
          else
          {
            localRandomAccessFile.seek(8L);
            localRandomAccessFile.writeInt(i1);
          }
        }
        else
        {
          i1 = i4 + 1;
          continue;
        }
        i2 = i1 + 1;
        continue;
        i1 = i4 - 1;
      }
      catch (IOException paramString)
      {
        return false;
      }
      label470:
      continue;
      label478:
      int i1 = i4 + 1;
      continue;
      label486:
      int i2 = i1 + 1;
    }
  }
  
  public static String b()
  {
    if (c == null) {
      return null;
    }
    if (!c.exists()) {
      return null;
    }
    for (;;)
    {
      int i2;
      try
      {
        localRandomAccessFile = new RandomAccessFile(c, "rw");
        localRandomAccessFile.seek(0L);
        i3 = localRandomAccessFile.readInt();
        i2 = localRandomAccessFile.readInt();
        i1 = localRandomAccessFile.readInt();
        if (a(i3, i2, i1)) {
          break label206;
        }
        localRandomAccessFile.close();
        d();
        return null;
      }
      catch (IOException localIOException)
      {
        RandomAccessFile localRandomAccessFile;
        int i3;
        long l1;
        int i4;
        Object localObject;
        return null;
      }
      localRandomAccessFile.close();
      return null;
      l1 = 0L + ((i2 - 1) * 1024 + 12);
      localRandomAccessFile.seek(l1);
      i4 = localRandomAccessFile.readInt();
      localObject = new byte[i4];
      localRandomAccessFile.seek(l1 + 4L);
      int i1 = 0;
      if (i1 < i4)
      {
        localObject[i1] = localRandomAccessFile.readByte();
        i1 += 1;
      }
      else
      {
        localObject = new String((byte[])localObject);
        if (i3 < l.Y)
        {
          i1 = i2 + 1;
          localRandomAccessFile.seek(4L);
          localRandomAccessFile.writeInt(i1);
          localRandomAccessFile.close();
          return (String)localObject;
        }
        i1 = l.Y;
        if (i2 == i1)
        {
          i1 = 1;
        }
        else
        {
          i1 = i2 + 1;
          continue;
          label206:
          if (i2 != 0) {
            if (i2 != i1) {}
          }
        }
      }
    }
  }
  
  private static void c()
  {
    e = true;
    d = null;
    f = 0;
    g = 0;
    h = 0L;
    i = 0L;
    j = 0L;
    k = 0.0D;
    l = 0.0D;
    m = 0;
    n = 0;
    o = 0;
  }
  
  private static boolean d()
  {
    if (c.exists()) {
      c.delete();
    }
    if (!c.getParentFile().exists()) {
      c.getParentFile().mkdirs();
    }
    try
    {
      c.createNewFile();
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(c, "rw");
      localRandomAccessFile.seek(0L);
      localRandomAccessFile.writeInt(0);
      localRandomAccessFile.writeInt(0);
      localRandomAccessFile.writeInt(1);
      localRandomAccessFile.close();
      c();
      return c.exists();
    }
    catch (IOException localIOException) {}
    return false;
  }
  
  public boolean a(Location paramLocation)
  {
    return a(paramLocation, l.W, l.X);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */