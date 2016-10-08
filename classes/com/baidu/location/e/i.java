package com.baidu.location.e;

import com.baidu.location.b.b;
import com.baidu.location.b.e;
import com.baidu.location.b.l;
import com.baidu.location.b.p;
import com.baidu.location.f;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class i
{
  private static i i = null;
  private static final String k = e.a + "/conlts.dat";
  private static int l = -1;
  private static int m = -1;
  private static int n = 0;
  public boolean a = true;
  public boolean b = true;
  public boolean c = false;
  public boolean d = true;
  public boolean e = true;
  public boolean f = true;
  public boolean g = true;
  public boolean h = false;
  private j j = null;
  
  public static i a()
  {
    if (i == null) {
      i = new i();
    }
    return i;
  }
  
  private void a(int paramInt)
  {
    boolean bool2 = true;
    if ((paramInt & 0x1) == 1)
    {
      bool1 = true;
      this.a = bool1;
      if ((paramInt & 0x2) != 2) {
        break label112;
      }
      bool1 = true;
      label25:
      this.b = bool1;
      if ((paramInt & 0x4) != 4) {
        break label117;
      }
      bool1 = true;
      label39:
      this.c = bool1;
      if ((paramInt & 0x8) != 8) {
        break label122;
      }
      bool1 = true;
      label55:
      this.d = bool1;
      if ((paramInt & 0x10000) != 65536) {
        break label127;
      }
      bool1 = true;
      label71:
      this.f = bool1;
      if ((paramInt & 0x20000) != 131072) {
        break label132;
      }
    }
    label112:
    label117:
    label122:
    label127:
    label132:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.g = bool1;
      if ((paramInt & 0x10) == 16) {
        this.e = false;
      }
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label25;
      bool1 = false;
      break label39;
      bool1 = false;
      break label55;
      bool1 = false;
      break label71;
    }
  }
  
  private void a(HttpEntity paramHttpEntity)
  {
    int i2 = 0;
    int i1 = 0;
    for (;;)
    {
      try
      {
        paramHttpEntity = EntityUtils.toByteArray(paramHttpEntity);
        if (paramHttpEntity == null)
        {
          if (i1 == 0) {
            break;
          }
          f();
          return;
        }
        if (paramHttpEntity.length < 640)
        {
          l.u = false;
          l.r = l.p + 0.025D;
          l.q = l.o - 0.025D;
          i1 = 1;
        }
        else
        {
          l.u = true;
          l.q = Double.longBitsToDouble((paramHttpEntity[7] & 0xFF) << 56 | (paramHttpEntity[6] & 0xFF) << 48 | (paramHttpEntity[5] & 0xFF) << 40 | (paramHttpEntity[4] & 0xFF) << 32 | (paramHttpEntity[3] & 0xFF) << 24 | (paramHttpEntity[2] & 0xFF) << 16 | (paramHttpEntity[1] & 0xFF) << 8 | paramHttpEntity[0] & 0xFF);
          l.r = Double.longBitsToDouble((paramHttpEntity[15] & 0xFF) << 56 | (paramHttpEntity[14] & 0xFF) << 48 | (paramHttpEntity[13] & 0xFF) << 40 | (paramHttpEntity[12] & 0xFF) << 32 | (paramHttpEntity[11] & 0xFF) << 24 | (paramHttpEntity[10] & 0xFF) << 16 | (paramHttpEntity[9] & 0xFF) << 8 | paramHttpEntity[8] & 0xFF);
          l.t = new byte['ɱ'];
          i1 = i2;
          if (i1 < 625)
          {
            l.t[i1] = paramHttpEntity[(i1 + 16)];
            i1 += 1;
          }
          else
          {
            i1 = 1;
          }
        }
      }
      catch (Exception paramHttpEntity)
      {
        return;
      }
    }
  }
  
  private void b(int paramInt)
  {
    Object localObject = new File(k);
    if (!((File)localObject).exists()) {
      h();
    }
    try
    {
      localObject = new RandomAccessFile((File)localObject, "rw");
      ((RandomAccessFile)localObject).seek(4L);
      int i1 = ((RandomAccessFile)localObject).readInt();
      int i2 = ((RandomAccessFile)localObject).readInt();
      ((RandomAccessFile)localObject).seek(i1 * n + 128);
      byte[] arrayOfByte = (b.c + '\000').getBytes();
      ((RandomAccessFile)localObject).writeInt(arrayOfByte.length);
      ((RandomAccessFile)localObject).write(arrayOfByte, 0, arrayOfByte.length);
      ((RandomAccessFile)localObject).writeInt(paramInt);
      if (i2 == n)
      {
        ((RandomAccessFile)localObject).seek(8L);
        ((RandomAccessFile)localObject).writeInt(i2 + 1);
      }
      ((RandomAccessFile)localObject).close();
      return;
    }
    catch (Exception localException) {}
  }
  
  private void b(HttpEntity paramHttpEntity)
  {
    localHttpEntity1 = null;
    m = -1;
    if (paramHttpEntity != null) {}
    for (;;)
    {
      try
      {
        paramHttpEntity = EntityUtils.toString(paramHttpEntity, "utf-8");
        localHttpEntity2 = paramHttpEntity;
        localHttpEntity1 = paramHttpEntity;
        if (b(paramHttpEntity))
        {
          localHttpEntity1 = paramHttpEntity;
          e();
          localHttpEntity2 = paramHttpEntity;
        }
      }
      catch (Exception paramHttpEntity)
      {
        HttpEntity localHttpEntity2 = localHttpEntity1;
        continue;
        int i1 = -1;
        continue;
      }
      try
      {
        paramHttpEntity = new JSONObject(localHttpEntity2);
        if (paramHttpEntity.has("ctr")) {
          m = Integer.parseInt(paramHttpEntity.getString("ctr"));
        }
        try
        {
          i();
          if (m != -1)
          {
            i1 = m;
            b(m);
            if (i1 != -1) {
              a(i1);
            }
            bool = f.f;
            if (!bool) {}
          }
        }
        catch (Exception paramHttpEntity)
        {
          boolean bool;
          return;
        }
        try
        {
          if (this.c)
          {
            bool = l.m;
            if (!bool) {}
          }
          return;
        }
        catch (Exception paramHttpEntity)
        {
          return;
        }
        if (l != -1)
        {
          i1 = l;
          continue;
        }
      }
      catch (Exception paramHttpEntity) {}
    }
  }
  
  private boolean b(String paramString)
  {
    boolean bool2 = true;
    if (paramString != null) {}
    try
    {
      paramString = new JSONObject(paramString);
      int i1 = Integer.parseInt(paramString.getString("ver"));
      if (i1 > l.v)
      {
        l.v = i1;
        String[] arrayOfString;
        if (paramString.has("gps"))
        {
          arrayOfString = paramString.getString("gps").split("\\|");
          if (arrayOfString.length > 10)
          {
            if ((arrayOfString[0] != null) && (!arrayOfString[0].equals(""))) {
              l.w = Float.parseFloat(arrayOfString[0]);
            }
            if ((arrayOfString[1] != null) && (!arrayOfString[1].equals(""))) {
              l.x = Float.parseFloat(arrayOfString[1]);
            }
            if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
              l.y = Float.parseFloat(arrayOfString[2]);
            }
            if ((arrayOfString[3] != null) && (!arrayOfString[3].equals(""))) {
              l.z = Float.parseFloat(arrayOfString[3]);
            }
            if ((arrayOfString[4] != null) && (!arrayOfString[4].equals(""))) {
              l.A = Integer.parseInt(arrayOfString[4]);
            }
            if ((arrayOfString[5] != null) && (!arrayOfString[5].equals(""))) {
              l.B = Integer.parseInt(arrayOfString[5]);
            }
            if ((arrayOfString[6] != null) && (!arrayOfString[6].equals(""))) {
              l.C = Integer.parseInt(arrayOfString[6]);
            }
            if ((arrayOfString[7] != null) && (!arrayOfString[7].equals(""))) {
              l.D = Integer.parseInt(arrayOfString[7]);
            }
            if ((arrayOfString[8] != null) && (!arrayOfString[8].equals(""))) {
              l.E = Integer.parseInt(arrayOfString[8]);
            }
            if ((arrayOfString[9] != null) && (!arrayOfString[9].equals(""))) {
              l.F = Integer.parseInt(arrayOfString[9]);
            }
            if ((arrayOfString[10] != null) && (!arrayOfString[10].equals(""))) {
              l.G = Integer.parseInt(arrayOfString[10]);
            }
          }
        }
        if (paramString.has("up"))
        {
          arrayOfString = paramString.getString("up").split("\\|");
          if (arrayOfString.length > 3)
          {
            if ((arrayOfString[0] != null) && (!arrayOfString[0].equals(""))) {
              l.H = Float.parseFloat(arrayOfString[0]);
            }
            if ((arrayOfString[1] != null) && (!arrayOfString[1].equals(""))) {
              l.I = Float.parseFloat(arrayOfString[1]);
            }
            if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
              l.J = Float.parseFloat(arrayOfString[2]);
            }
            if ((arrayOfString[3] != null) && (!arrayOfString[3].equals(""))) {
              l.K = Float.parseFloat(arrayOfString[3]);
            }
          }
        }
        if (paramString.has("wf"))
        {
          arrayOfString = paramString.getString("wf").split("\\|");
          if (arrayOfString.length > 3)
          {
            if ((arrayOfString[0] != null) && (!arrayOfString[0].equals(""))) {
              l.L = Integer.parseInt(arrayOfString[0]);
            }
            if ((arrayOfString[1] != null) && (!arrayOfString[1].equals(""))) {
              l.M = Float.parseFloat(arrayOfString[1]);
            }
            if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
              l.N = Integer.parseInt(arrayOfString[2]);
            }
            if ((arrayOfString[3] != null) && (!arrayOfString[3].equals(""))) {
              l.O = Float.parseFloat(arrayOfString[3]);
            }
          }
        }
        if (paramString.has("ab"))
        {
          arrayOfString = paramString.getString("ab").split("\\|");
          if (arrayOfString.length > 3)
          {
            if ((arrayOfString[0] != null) && (!arrayOfString[0].equals(""))) {
              l.P = Float.parseFloat(arrayOfString[0]);
            }
            if ((arrayOfString[1] != null) && (!arrayOfString[1].equals(""))) {
              l.Q = Float.parseFloat(arrayOfString[1]);
            }
            if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
              l.R = Integer.parseInt(arrayOfString[2]);
            }
            if ((arrayOfString[3] != null) && (!arrayOfString[3].equals(""))) {
              l.S = Integer.parseInt(arrayOfString[3]);
            }
          }
        }
        if (paramString.has("zxd"))
        {
          arrayOfString = paramString.getString("zxd").split("\\|");
          if (arrayOfString.length > 4)
          {
            if ((arrayOfString[0] != null) && (!arrayOfString[0].equals(""))) {
              l.ak = Float.parseFloat(arrayOfString[0]);
            }
            if ((arrayOfString[1] != null) && (!arrayOfString[1].equals(""))) {
              l.al = Float.parseFloat(arrayOfString[1]);
            }
            if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
              l.am = Integer.parseInt(arrayOfString[2]);
            }
            if ((arrayOfString[3] != null) && (!arrayOfString[3].equals(""))) {
              l.an = Integer.parseInt(arrayOfString[3]);
            }
            if ((arrayOfString[4] != null) && (!arrayOfString[4].equals(""))) {
              l.ao = Integer.parseInt(arrayOfString[4]);
            }
          }
        }
        if (paramString.has("gpc"))
        {
          arrayOfString = paramString.getString("gpc").split("\\|");
          if (arrayOfString.length > 5)
          {
            if ((arrayOfString[0] != null) && (!arrayOfString[0].equals("")))
            {
              if (Integer.parseInt(arrayOfString[0]) <= 0) {
                break label1284;
              }
              l.U = true;
            }
            if ((arrayOfString[1] != null) && (!arrayOfString[1].equals("")))
            {
              if (Integer.parseInt(arrayOfString[1]) <= 0) {
                break label1291;
              }
              l.V = true;
            }
            label1013:
            if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
              l.W = Integer.parseInt(arrayOfString[2]);
            }
            if ((arrayOfString[3] != null) && (!arrayOfString[3].equals(""))) {
              l.Y = Integer.parseInt(arrayOfString[3]);
            }
            if ((arrayOfString[4] != null) && (!arrayOfString[4].equals("")))
            {
              i1 = Integer.parseInt(arrayOfString[4]);
              if (i1 <= 0) {
                break label1298;
              }
              l.ad = i1;
              l.Z = l.ad * 1000L * 60L;
              l.ae = l.Z >> 2;
            }
          }
        }
        for (;;)
        {
          if ((arrayOfString[5] != null) && (!arrayOfString[5].equals(""))) {
            l.ag = Integer.parseInt(arrayOfString[5]);
          }
          if (paramString.has("shak"))
          {
            arrayOfString = paramString.getString("shak").split("\\|");
            if (arrayOfString.length > 2)
            {
              if ((arrayOfString[0] != null) && (!arrayOfString[0].equals(""))) {
                l.ah = Integer.parseInt(arrayOfString[0]);
              }
              if ((arrayOfString[1] != null) && (!arrayOfString[1].equals(""))) {
                l.ai = Integer.parseInt(arrayOfString[1]);
              }
              if ((arrayOfString[2] != null) && (!arrayOfString[2].equals(""))) {
                l.aj = Float.parseFloat(arrayOfString[2]);
              }
            }
          }
          bool1 = bool2;
          if (!paramString.has("dmx")) {
            break label1308;
          }
          l.af = paramString.getInt("dmx");
          bool1 = bool2;
          break label1308;
          label1284:
          l.U = false;
          break;
          label1291:
          l.V = false;
          break label1013;
          label1298:
          l.m = false;
        }
      }
      boolean bool1 = false;
      label1308:
      return bool1;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private void d()
  {
    String str = "&ver=" + l.v + "&usr=" + b.a().b() + "&app=" + b.c + "&prod=" + b.d;
    if (this.j == null) {
      this.j = new j(this);
    }
    this.j.a(str, false);
  }
  
  private void e()
  {
    Object localObject1 = e.a + "/config.dat";
    if (l.U) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (l.V) {}
      for (int i2 = 1;; i2 = 0)
      {
        byte[] arrayOfByte = String.format(Locale.CHINA, "{\"ver\":\"%d\",\"gps\":\"%.1f|%.1f|%.1f|%.1f|%d|%d|%d|%d|%d|%d|%d\",\"up\":\"%.1f|%.1f|%.1f|%.1f\",\"wf\":\"%d|%.1f|%d|%.1f\",\"ab\":\"%.2f|%.2f|%d|%d\",\"gpc\":\"%d|%d|%d|%d|%d|%d\",\"zxd\":\"%.1f|%.1f|%d|%d|%d\",\"shak\":\"%d|%d|%.1f\",\"dmx\":%d}", new Object[] { Integer.valueOf(l.v), Float.valueOf(l.w), Float.valueOf(l.x), Float.valueOf(l.y), Float.valueOf(l.z), Integer.valueOf(l.A), Integer.valueOf(l.B), Integer.valueOf(l.C), Integer.valueOf(l.D), Integer.valueOf(l.E), Integer.valueOf(l.F), Integer.valueOf(l.G), Float.valueOf(l.H), Float.valueOf(l.I), Float.valueOf(l.J), Float.valueOf(l.K), Integer.valueOf(l.L), Float.valueOf(l.M), Integer.valueOf(l.N), Float.valueOf(l.O), Float.valueOf(l.P), Float.valueOf(l.Q), Integer.valueOf(l.R), Integer.valueOf(l.S), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(l.W), Integer.valueOf(l.Y), Long.valueOf(l.ad), Integer.valueOf(l.ag), Float.valueOf(l.ak), Float.valueOf(l.al), Integer.valueOf(l.am), Integer.valueOf(l.an), Integer.valueOf(l.ao), Integer.valueOf(l.ah), Integer.valueOf(l.ai), Float.valueOf(l.aj), Integer.valueOf(l.af) }).getBytes();
        try
        {
          localObject1 = new File((String)localObject1);
          if (!((File)localObject1).exists())
          {
            Object localObject2 = new File(e.a);
            if (!((File)localObject2).exists()) {
              ((File)localObject2).mkdirs();
            }
            if (((File)localObject1).createNewFile())
            {
              localObject2 = new RandomAccessFile((File)localObject1, "rw");
              ((RandomAccessFile)localObject2).seek(0L);
              ((RandomAccessFile)localObject2).writeBoolean(false);
              ((RandomAccessFile)localObject2).writeBoolean(false);
              ((RandomAccessFile)localObject2).close();
            }
          }
          else
          {
            localObject1 = new RandomAccessFile((File)localObject1, "rw");
            ((RandomAccessFile)localObject1).seek(0L);
            ((RandomAccessFile)localObject1).writeBoolean(true);
            ((RandomAccessFile)localObject1).seek(2L);
            ((RandomAccessFile)localObject1).writeInt(arrayOfByte.length);
            ((RandomAccessFile)localObject1).write(arrayOfByte);
            ((RandomAccessFile)localObject1).close();
          }
          return;
        }
        catch (Exception localException)
        {
          return;
        }
      }
    }
  }
  
  private void f()
  {
    Object localObject1 = e.a + "/config.dat";
    try
    {
      localObject1 = new File((String)localObject1);
      if (!((File)localObject1).exists())
      {
        Object localObject2 = new File(e.a);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        if (((File)localObject1).createNewFile())
        {
          localObject2 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject2).seek(0L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).close();
        }
      }
      else
      {
        localObject1 = new RandomAccessFile((File)localObject1, "rw");
        ((RandomAccessFile)localObject1).seek(1L);
        ((RandomAccessFile)localObject1).writeBoolean(true);
        ((RandomAccessFile)localObject1).seek(1024L);
        ((RandomAccessFile)localObject1).writeDouble(l.q);
        ((RandomAccessFile)localObject1).writeDouble(l.r);
        ((RandomAccessFile)localObject1).writeBoolean(l.u);
        if ((l.u) && (l.t != null)) {
          ((RandomAccessFile)localObject1).write(l.t);
        }
        ((RandomAccessFile)localObject1).close();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void g()
  {
    Object localObject = e.a + "/config.dat";
    try
    {
      localObject = new File((String)localObject);
      if (((File)localObject).exists())
      {
        localObject = new RandomAccessFile((File)localObject, "rw");
        if (((RandomAccessFile)localObject).readBoolean())
        {
          ((RandomAccessFile)localObject).seek(2L);
          int i1 = ((RandomAccessFile)localObject).readInt();
          byte[] arrayOfByte = new byte[i1];
          ((RandomAccessFile)localObject).read(arrayOfByte, 0, i1);
          b(new String(arrayOfByte));
        }
        ((RandomAccessFile)localObject).seek(1L);
        if (((RandomAccessFile)localObject).readBoolean())
        {
          ((RandomAccessFile)localObject).seek(1024L);
          l.q = ((RandomAccessFile)localObject).readDouble();
          l.r = ((RandomAccessFile)localObject).readDouble();
          l.u = ((RandomAccessFile)localObject).readBoolean();
          if (l.u)
          {
            l.t = new byte['ɱ'];
            ((RandomAccessFile)localObject).read(l.t, 0, 625);
          }
        }
        ((RandomAccessFile)localObject).close();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    b(null);
  }
  
  private void h()
  {
    try
    {
      File localFile = new File(k);
      if (!localFile.exists())
      {
        Object localObject = new File(e.a);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        localObject = localFile;
        if (!localFile.createNewFile()) {
          localObject = null;
        }
        localObject = new RandomAccessFile((File)localObject, "rw");
        ((RandomAccessFile)localObject).seek(0L);
        ((RandomAccessFile)localObject).writeInt(0);
        ((RandomAccessFile)localObject).writeInt(128);
        ((RandomAccessFile)localObject).writeInt(0);
        ((RandomAccessFile)localObject).close();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void i()
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        Object localObject = new File(k);
        if (!((File)localObject).exists()) {
          break;
        }
        localObject = new RandomAccessFile((File)localObject, "rw");
        ((RandomAccessFile)localObject).seek(4L);
        int i2 = ((RandomAccessFile)localObject).readInt();
        if (i2 > 3000)
        {
          ((RandomAccessFile)localObject).close();
          n = 0;
          h();
          return;
        }
        int i3 = ((RandomAccessFile)localObject).readInt();
        ((RandomAccessFile)localObject).seek(128L);
        byte[] arrayOfByte = new byte[i2];
        if (i1 < i3)
        {
          ((RandomAccessFile)localObject).seek(i2 * i1 + 128);
          int i4 = ((RandomAccessFile)localObject).readInt();
          if ((i4 > 0) && (i4 < i2))
          {
            ((RandomAccessFile)localObject).read(arrayOfByte, 0, i4);
            if (arrayOfByte[(i4 - 1)] == 0)
            {
              String str = new String(arrayOfByte, 0, i4 - 1);
              b.a();
              if (str.equals(b.c))
              {
                l = ((RandomAccessFile)localObject).readInt();
                n = i1;
              }
            }
          }
        }
        else
        {
          if (i1 == i3) {
            n = i3;
          }
          ((RandomAccessFile)localObject).close();
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      i1 += 1;
    }
  }
  
  public void a(String paramString)
  {
    if (this.j == null) {
      this.j = new j(this);
    }
    this.j.a(paramString, true);
  }
  
  public void b() {}
  
  public void c()
  {
    if (System.currentTimeMillis() - p.a().c() > 86400000L)
    {
      p.a().b(System.currentTimeMillis());
      d();
    }
    g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */