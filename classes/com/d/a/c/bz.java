package com.d.a.c;

import android.text.TextUtils;
import android.util.Base64;
import com.d.a.a.a;
import com.d.a.a.e;
import com.d.a.a.h;
import com.d.a.af;
import com.d.a.ag;
import com.d.a.ai;
import com.d.a.bo;
import com.d.a.q;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.security.MessageDigest;
import java.util.LinkedList;
import java.util.UUID;

public class bz
  implements bu
{
  ag a;
  bc b;
  a c;
  private LinkedList<ai> d;
  private af e;
  private bx f;
  private e g;
  private bv h;
  private bw i;
  
  public bz(af paramaf)
  {
    this.e = paramaf;
    this.a = new ag(this.e);
  }
  
  public static bu a(av paramav, w paramw)
  {
    if (paramw == null) {}
    String str1;
    String str2;
    do
    {
      do
      {
        do
        {
          return null;
        } while ((paramw.m() != 101) || (!"websocket".equalsIgnoreCase(paramw.f_().a("Upgrade"))));
        str1 = paramw.f_().a("Sec-WebSocket-Accept");
      } while (str1 == null);
      str2 = paramav.a("Sec-WebSocket-Key");
    } while ((str2 == null) || (!str1.equalsIgnoreCase(c(str2 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").trim())));
    paramav = paramav.a("Sec-WebSocket-Extensions");
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramav != null)
    {
      bool1 = bool2;
      if (paramav.equals("x-webkit-deflate-frame")) {
        bool1 = true;
      }
    }
    paramav = new bz(paramw.c());
    paramav.a(true, bool1);
    return paramav;
  }
  
  public static void a(u paramu, String paramString)
  {
    av localav = paramu.e();
    String str = Base64.encodeToString(a(UUID.randomUUID()), 2);
    localav.a("Sec-WebSocket-Version", "13");
    localav.a("Sec-WebSocket-Key", str);
    localav.a("Sec-WebSocket-Extensions", "x-webkit-deflate-frame");
    localav.a("Connection", "Upgrade");
    localav.a("Upgrade", "websocket");
    if (paramString != null) {
      localav.a("Sec-WebSocket-Protocol", paramString);
    }
    localav.a("Pragma", "no-cache");
    localav.a("Cache-Control", "no-cache");
    if (TextUtils.isEmpty(paramu.e().a("User-Agent"))) {
      paramu.e().a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.15 Safari/537.36");
    }
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = new ca(this, this.e);
    this.b.a(paramBoolean1);
    this.b.b(paramBoolean2);
    if (this.e.k()) {
      this.e.j();
    }
  }
  
  private static byte[] a(UUID paramUUID)
  {
    byte[] arrayOfByte = new byte[16];
    ByteBuffer.wrap(arrayOfByte).asLongBuffer().put(new long[] { paramUUID.getMostSignificantBits(), paramUUID.getLeastSignificantBits() });
    return arrayOfByte;
  }
  
  private void b(ai paramai)
  {
    if (this.d == null)
    {
      bo.a(this, paramai);
      if (paramai.d() > 0)
      {
        this.d = new LinkedList();
        this.d.add(paramai);
      }
    }
    do
    {
      return;
      do
      {
        paramai = (ai)this.d.remove();
        bo.a(this, paramai);
        if (paramai.d() > 0) {
          this.d.add(0, paramai);
        }
      } while (!k());
    } while (this.d.size() != 0);
    this.d = null;
  }
  
  private static String c(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramString.getBytes("iso-8859-1"), 0, paramString.length());
      paramString = Base64.encodeToString(localMessageDigest.digest(), 2);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public void a()
  {
    this.e.a();
  }
  
  public void a(a parama)
  {
    this.e.a(parama);
  }
  
  public void a(e parame)
  {
    this.g = parame;
  }
  
  public void a(h paramh)
  {
    this.a.a(paramh);
  }
  
  public void a(ai paramai)
  {
    a(paramai.a());
  }
  
  public void a(bw parambw)
  {
    this.i = parambw;
  }
  
  public void a(String paramString)
  {
    this.a.a(new ai(this.b.a(paramString)));
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.a.a(new ai(this.b.a(paramArrayOfByte)));
  }
  
  public void b(a parama)
  {
    this.c = parama;
  }
  
  public void b(String paramString)
  {
    this.a.a(new ai(new ByteBuffer[] { ByteBuffer.wrap(this.b.b(paramString)) }));
  }
  
  public void d()
  {
    this.e.d();
  }
  
  public e f()
  {
    return this.g;
  }
  
  public h g()
  {
    return this.a.g();
  }
  
  public a h()
  {
    return this.c;
  }
  
  public boolean i()
  {
    return this.e.i();
  }
  
  public void j()
  {
    this.e.j();
  }
  
  public boolean k()
  {
    return this.e.k();
  }
  
  public q l()
  {
    return this.e.l();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */