package com.baidu.location.b;

import java.io.File;
import java.io.RandomAccessFile;
import org.json.JSONObject;

public class c
{
  private static c a = null;
  private long b = 0L;
  private long c = 0L;
  private long d = 0L;
  private String e = null;
  private String f = null;
  private String g = "loc.map.baidu.com";
  private String h = "dns.map.baidu.com";
  private int i = 0;
  private d j = new d(this);
  
  private c()
  {
    e();
  }
  
  public static c a()
  {
    if (a == null) {
      a = new c();
    }
    return a;
  }
  
  private void a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      if (paramString.has("dnsServer")) {
        this.e = paramString.getString("dnsServer");
      }
      if (paramString.has("locServer")) {
        this.f = paramString.getString("locServer");
      }
      if (paramString.has("address")) {
        this.g = paramString.getString("address");
      }
      if (paramString.has("locServer")) {
        this.h = paramString.getString("dnsServerIp");
      }
      if (paramString.has("DnsProxyTime")) {
        this.b = paramString.getLong("DnsProxyTime");
      }
      if (paramString.has("DnsExtraTime")) {
        this.c = paramString.getLong("DnsExtraTime");
      }
      if (paramString.has("DnsExtraUpdateTime")) {
        this.d = paramString.getLong("DnsExtraUpdateTime");
      }
      if (paramString.has("enable")) {
        this.i = paramString.getInt("enable");
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private String c()
  {
    try
    {
      Object localObject = new JSONObject();
      if (this.e != null) {
        ((JSONObject)localObject).put("dnsServer", this.e);
      }
      if (this.f != null) {
        ((JSONObject)localObject).put("locServer", this.f);
      }
      if (this.g != null) {
        ((JSONObject)localObject).put("address", this.g);
      }
      if (this.h != null) {
        ((JSONObject)localObject).put("dnsServerIp", this.h);
      }
      ((JSONObject)localObject).put("DnsProxyTime", this.b);
      ((JSONObject)localObject).put("DnsExtraTime", this.c);
      ((JSONObject)localObject).put("DnsExtraUpdateTime", this.d);
      ((JSONObject)localObject).put("enable", this.i);
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private void d()
  {
    Object localObject1 = e.a + "/grtcf.dat";
    try
    {
      localObject1 = new File((String)localObject1);
      Object localObject2;
      if (!((File)localObject1).exists())
      {
        localObject2 = new File(e.a);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        if (((File)localObject1).createNewFile())
        {
          localObject2 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject2).seek(2L);
          ((RandomAccessFile)localObject2).writeInt(0);
          ((RandomAccessFile)localObject2).seek(8L);
          byte[] arrayOfByte = "1980_01_01:0".getBytes();
          ((RandomAccessFile)localObject2).writeInt(arrayOfByte.length);
          ((RandomAccessFile)localObject2).write(arrayOfByte);
          ((RandomAccessFile)localObject2).seek(200L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).seek(800L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).close();
        }
      }
      else
      {
        localObject1 = new RandomAccessFile((File)localObject1, "rw");
        ((RandomAccessFile)localObject1).seek(800L);
        localObject2 = c();
        if (localObject2 != null)
        {
          ((RandomAccessFile)localObject1).writeBoolean(true);
          localObject2 = ((String)localObject2).getBytes();
          ((RandomAccessFile)localObject1).writeInt(localObject2.length);
          ((RandomAccessFile)localObject1).write((byte[])localObject2);
        }
        for (;;)
        {
          ((RandomAccessFile)localObject1).close();
          return;
          ((RandomAccessFile)localObject1).writeBoolean(false);
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void e()
  {
    Object localObject = e.a + "/grtcf.dat";
    try
    {
      localObject = new File((String)localObject);
      if (((File)localObject).exists())
      {
        localObject = new RandomAccessFile((File)localObject, "rw");
        ((RandomAccessFile)localObject).seek(800L);
        if (((RandomAccessFile)localObject).readBoolean())
        {
          int k = ((RandomAccessFile)localObject).readInt();
          byte[] arrayOfByte = new byte[k];
          ((RandomAccessFile)localObject).read(arrayOfByte, 0, k);
          a(new String(arrayOfByte));
        }
        ((RandomAccessFile)localObject).close();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public String b()
  {
    String str2 = "loc.map.baidu.com";
    String str1 = str2;
    if (this.i == 1)
    {
      str1 = str2;
      if (System.currentTimeMillis() - this.b < 360000L) {
        str1 = this.g;
      }
    }
    if (System.currentTimeMillis() - this.b > 300000L) {
      this.j.b();
    }
    return str1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */