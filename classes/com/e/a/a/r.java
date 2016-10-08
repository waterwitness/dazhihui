package com.e.a.a;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;
import org.json.JSONArray;
import org.json.JSONObject;

public class r
  implements HttpEntity
{
  private static final UnsupportedOperationException a = new UnsupportedOperationException("Unsupported operation in this implementation.");
  private static final StringBuilder c = new StringBuilder(128);
  private static final byte[] d = "true".getBytes();
  private static final byte[] e = "false".getBytes();
  private static final byte[] f = "null".getBytes();
  private static final byte[] g = a("name");
  private static final byte[] h = a("type");
  private static final byte[] i = a("contents");
  private static final byte[] j = a("_elapsed");
  private static final Header k = new BasicHeader("Content-Type", "application/json");
  private static final Header l = new BasicHeader("Content-Encoding", "gzip");
  private final byte[] b = new byte['က'];
  private final Map<String, Object> m = new HashMap();
  private final Header n;
  private final ac o;
  
  public r(ac paramac, boolean paramBoolean)
  {
    this.o = paramac;
    if (paramBoolean) {}
    for (paramac = l;; paramac = null)
    {
      this.n = paramac;
      return;
    }
  }
  
  private void a(OutputStream paramOutputStream)
  {
    paramOutputStream.write(34);
  }
  
  private void a(OutputStream paramOutputStream, aa paramaa)
  {
    a(paramOutputStream, paramaa.a.getName(), paramaa.b);
    int i2 = (int)paramaa.a.length();
    paramaa = new FileInputStream(paramaa.a);
    p localp = new p(paramOutputStream, 18);
    int i1 = 0;
    for (;;)
    {
      int i3 = paramaa.read(this.b);
      if (i3 == -1)
      {
        b.a(localp);
        a(paramOutputStream);
        b.a(paramaa);
        return;
      }
      localp.write(this.b, 0, i3);
      i1 += i3;
      this.o.sendProgressMessage(i1, i2);
    }
  }
  
  private void a(OutputStream paramOutputStream, ab paramab)
  {
    a(paramOutputStream, paramab.b, paramab.c);
    p localp = new p(paramOutputStream, 18);
    for (;;)
    {
      int i1 = paramab.a.read(this.b);
      if (i1 == -1)
      {
        b.a(localp);
        a(paramOutputStream);
        if (paramab.d) {
          b.a(paramab.a);
        }
        return;
      }
      localp.write(this.b, 0, i1);
    }
  }
  
  private void a(OutputStream paramOutputStream, String paramString1, String paramString2)
  {
    paramOutputStream.write(g);
    paramOutputStream.write(58);
    paramOutputStream.write(a(paramString1));
    paramOutputStream.write(44);
    paramOutputStream.write(h);
    paramOutputStream.write(58);
    paramOutputStream.write(a(paramString2));
    paramOutputStream.write(44);
    paramOutputStream.write(i);
    paramOutputStream.write(58);
    paramOutputStream.write(34);
  }
  
  static byte[] a(String paramString)
  {
    if (paramString == null) {
      return f;
    }
    c.append('"');
    int i3 = paramString.length();
    int i1 = -1;
    for (;;)
    {
      i1 += 1;
      if (i1 >= i3) {
        c.append('"');
      }
      try
      {
        paramString = c.toString().getBytes();
        return paramString;
      }
      finally
      {
        char c1;
        String str;
        int i4;
        int i2;
        c.setLength(0);
      }
      c1 = paramString.charAt(i1);
      switch (c1)
      {
      default: 
        if (((c1 >= 0) && (c1 <= '\037')) || ((c1 >= '') && (c1 <= '')) || ((c1 >= ' ') && (c1 <= '⃿')))
        {
          str = Integer.toHexString(c1);
          c.append("\\u");
          i4 = str.length();
          i2 = 0;
        }
        break;
      case '"': 
      case '\\': 
      case '\b': 
      case '\f': 
      case '\n': 
      case '\r': 
      case '\t': 
        for (;;)
        {
          if (i2 >= 4 - i4)
          {
            c.append(str.toUpperCase(Locale.US));
            break;
            c.append("\\\"");
            break;
            c.append("\\\\");
            break;
            c.append("\\b");
            break;
            c.append("\\f");
            break;
            c.append("\\n");
            break;
            c.append("\\r");
            break;
            c.append("\\t");
            break;
          }
          c.append('0');
          i2 += 1;
        }
      }
      c.append(c1);
    }
  }
  
  public void a(String paramString, Object paramObject)
  {
    this.m.put(paramString, paramObject);
  }
  
  public void consumeContent() {}
  
  public InputStream getContent()
  {
    throw a;
  }
  
  public Header getContentEncoding()
  {
    return this.n;
  }
  
  public long getContentLength()
  {
    return -1L;
  }
  
  public Header getContentType()
  {
    return k;
  }
  
  public boolean isChunked()
  {
    return false;
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null) {
      throw new IllegalStateException("Output stream cannot be null.");
    }
    long l1 = System.currentTimeMillis();
    Object localObject1 = paramOutputStream;
    if (this.n != null) {
      localObject1 = new GZIPOutputStream(paramOutputStream, 4096);
    }
    ((OutputStream)localObject1).write(123);
    Iterator localIterator = this.m.keySet().iterator();
    Object localObject2;
    do
    {
      if (!localIterator.hasNext())
      {
        ((OutputStream)localObject1).write(j);
        ((OutputStream)localObject1).write(58);
        l1 = System.currentTimeMillis() - l1;
        ((OutputStream)localObject1).write((l1 + "}").getBytes());
        Log.i("JsonStreamerEntity", "Uploaded JSON in " + Math.floor(l1 / 1000L) + " seconds");
        ((OutputStream)localObject1).flush();
        b.a((OutputStream)localObject1);
        return;
      }
      paramOutputStream = (String)localIterator.next();
      localObject2 = this.m.get(paramOutputStream);
    } while (localObject2 == null);
    ((OutputStream)localObject1).write(a(paramOutputStream));
    ((OutputStream)localObject1).write(58);
    boolean bool = localObject2 instanceof aa;
    if ((bool) || ((localObject2 instanceof ab)))
    {
      ((OutputStream)localObject1).write(123);
      if (bool)
      {
        a((OutputStream)localObject1, (aa)localObject2);
        label250:
        ((OutputStream)localObject1).write(125);
      }
    }
    for (;;)
    {
      ((OutputStream)localObject1).write(44);
      break;
      a((OutputStream)localObject1, (ab)localObject2);
      break label250;
      if ((localObject2 instanceof s))
      {
        ((OutputStream)localObject1).write(((s)localObject2).a());
      }
      else if ((localObject2 instanceof JSONObject))
      {
        ((OutputStream)localObject1).write(((JSONObject)localObject2).toString().getBytes());
      }
      else if ((localObject2 instanceof JSONArray))
      {
        ((OutputStream)localObject1).write(((JSONArray)localObject2).toString().getBytes());
      }
      else
      {
        if ((localObject2 instanceof Boolean))
        {
          if (((Boolean)localObject2).booleanValue()) {}
          for (paramOutputStream = d;; paramOutputStream = e)
          {
            ((OutputStream)localObject1).write(paramOutputStream);
            break;
          }
        }
        if ((localObject2 instanceof Long)) {
          ((OutputStream)localObject1).write(((Number)localObject2).longValue().getBytes());
        } else if ((localObject2 instanceof Double)) {
          ((OutputStream)localObject1).write(((Number)localObject2).doubleValue().getBytes());
        } else if ((localObject2 instanceof Float)) {
          ((OutputStream)localObject1).write(((Number)localObject2).floatValue().getBytes());
        } else if ((localObject2 instanceof Integer)) {
          ((OutputStream)localObject1).write(((Number)localObject2).intValue().getBytes());
        } else {
          ((OutputStream)localObject1).write(a(localObject2.toString()));
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */