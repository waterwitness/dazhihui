package com.d.a.c.d;

import android.net.Uri;
import android.text.TextUtils;
import com.d.a.a.c;
import com.d.a.af;
import com.d.a.b.j;
import com.d.a.c.ac;
import com.d.a.c.av;
import com.d.a.c.bj;
import com.d.a.c.bn;
import com.d.a.c.n;
import com.d.a.c.q;
import com.d.a.c.s;
import com.d.a.c.u;
import com.d.a.d.e;
import com.d.a.g;
import com.d.a.o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

public class ai
  extends ac
{
  private static final aq z = new aq(null);
  boolean n;
  Field o;
  Field p;
  Field q;
  Field r;
  Field s;
  Field t;
  Field u;
  Method v;
  Method w;
  Hashtable<String, ar> x = new Hashtable();
  boolean y;
  
  public ai(com.d.a.c.a parama)
  {
    super(parama);
    a(new aj(this));
  }
  
  private void a(com.d.a.c.l paraml, a parama, c paramc)
  {
    u localu = paraml.j;
    paraml.c = parama.g.toString();
    paraml = paraml.j.g();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new k(k.b, localu.c()));
    localArrayList.add(new k(k.c, b(localu.d())));
    Object localObject = localu.e().a("Host");
    Iterator localIterator1;
    if (bn.c == parama.g)
    {
      localArrayList.add(new k(k.g, "HTTP/1.1"));
      localArrayList.add(new k(k.f, (String)localObject));
      localArrayList.add(new k(k.d, localu.d().getScheme()));
      localObject = localu.e().a();
      localIterator1 = ((bj)localObject).keySet().iterator();
      label183:
      if (localIterator1.hasNext()) {
        break label278;
      }
      localu.b("\n" + localu);
      if (paraml == null) {
        break label364;
      }
    }
    label278:
    label364:
    for (boolean bool = true;; bool = false)
    {
      paramc.a(null, parama.a(localArrayList, bool, true));
      return;
      if (bn.d == parama.g)
      {
        localArrayList.add(new k(k.e, (String)localObject));
        break;
      }
      throw new AssertionError();
      String str1 = (String)localIterator1.next();
      if (as.a(parama.g, str1)) {
        break label183;
      }
      Iterator localIterator2 = ((List)((bj)localObject).get(str1)).iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localArrayList.add(new k(str1.toLowerCase(), str2));
      }
      break label183;
    }
  }
  
  private void a(String paramString)
  {
    paramString = (ar)this.x.remove(paramString);
    if (paramString != null) {
      paramString.a(z);
    }
  }
  
  private void a(String paramString, c paramc, Exception paramException, g paramg)
  {
    paramString = (ar)this.x.get(paramString);
    if ((paramString == null) || (paramString.c.e())) {
      paramc.a(paramException, paramg);
    }
  }
  
  private void a(SSLEngine paramSSLEngine, com.d.a.c.l paraml, String paramString, int paramInt)
  {
    if ((!this.n) && (this.y)) {
      this.n = true;
    }
    try
    {
      this.o = paramSSLEngine.getClass().getSuperclass().getDeclaredField("peerHost");
      this.p = paramSSLEngine.getClass().getSuperclass().getDeclaredField("peerPort");
      this.q = paramSSLEngine.getClass().getDeclaredField("sslParameters");
      this.r = this.q.getType().getDeclaredField("npnProtocols");
      this.s = this.q.getType().getDeclaredField("alpnProtocols");
      this.u = this.q.getType().getDeclaredField("useSni");
      this.t = paramSSLEngine.getClass().getDeclaredField("sslNativePointer");
      String str = this.q.getType().getPackage().getName() + ".NativeCrypto";
      this.v = Class.forName(str, true, this.q.getType().getClassLoader()).getDeclaredMethod("SSL_get_npn_negotiated_protocol", new Class[] { Long.TYPE });
      this.w = Class.forName(str, true, this.q.getType().getClassLoader()).getDeclaredMethod("SSL_get0_alpn_selected", new Class[] { Long.TYPE });
      this.o.setAccessible(true);
      this.p.setAccessible(true);
      this.q.setAccessible(true);
      this.r.setAccessible(true);
      this.s.setAccessible(true);
      this.u.setAccessible(true);
      this.t.setAccessible(true);
      this.v.setAccessible(true);
      this.w.setAccessible(true);
      if (!b(paraml)) {
        return;
      }
    }
    catch (Exception localException)
    {
      do
      {
        for (;;)
        {
          this.q = null;
          this.r = null;
          this.s = null;
          this.u = null;
          this.t = null;
          this.v = null;
          this.w = null;
        }
      } while (this.q == null);
      try
      {
        paraml = a(new bn[] { bn.c });
        this.o.set(paramSSLEngine, paramString);
        this.p.set(paramSSLEngine, Integer.valueOf(paramInt));
        paramSSLEngine = this.q.get(paramSSLEngine);
        this.s.set(paramSSLEngine, paraml);
        this.u.set(paramSSLEngine, Boolean.valueOf(true));
        return;
      }
      catch (Exception paramSSLEngine)
      {
        paramSSLEngine.printStackTrace();
      }
    }
  }
  
  static byte[] a(bn... paramVarArgs)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8192);
    int j = paramVarArgs.length;
    int i = 0;
    if (i >= j)
    {
      localByteBuffer.flip();
      return new com.d.a.ai(new ByteBuffer[] { localByteBuffer }).a();
    }
    bn localbn = paramVarArgs[i];
    if (localbn == bn.a) {}
    for (;;)
    {
      i += 1;
      break;
      localByteBuffer.put((byte)localbn.toString().length());
      localByteBuffer.put(localbn.toString().getBytes(com.d.a.d.b.b));
    }
  }
  
  private static String b(Uri paramUri)
  {
    Object localObject2 = paramUri.getEncodedPath();
    Object localObject1;
    if (localObject2 == null) {
      localObject1 = "/";
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (!TextUtils.isEmpty(paramUri.getEncodedQuery())) {
        localObject2 = localObject1 + "?" + paramUri.getEncodedQuery();
      }
      return (String)localObject2;
      localObject1 = localObject2;
      if (!((String)localObject2).startsWith("/")) {
        localObject1 = "/" + (String)localObject2;
      }
    }
  }
  
  private boolean b(com.d.a.c.l paraml)
  {
    return paraml.j.g() == null;
  }
  
  protected c a(com.d.a.c.l paraml, Uri paramUri, int paramInt, boolean paramBoolean, c paramc)
  {
    paramUri = super.a(paraml, paramUri, paramInt, paramBoolean, paramc);
    paraml = (String)paraml.i.a("spdykey");
    if (paraml == null) {
      return paramUri;
    }
    return new am(this, paraml, paramUri);
  }
  
  public com.d.a.b.a a(com.d.a.c.l paraml)
  {
    Object localObject1 = paraml.j.d();
    int i = a(paraml.j.d());
    if (i == -1)
    {
      paraml = null;
      return paraml;
    }
    if (!this.y) {
      return super.a(paraml);
    }
    if (!b(paraml)) {
      return super.a(paraml);
    }
    Object localObject2 = ((Uri)localObject1).getHost() + i;
    localObject1 = (ar)this.x.get(localObject2);
    if (localObject1 != null)
    {
      if ((((ar)localObject1).h() instanceof aq)) {
        return super.a(paraml);
      }
      if ((((ar)localObject1).i() != null) && (!((a)((ar)localObject1).i()).a.i()))
      {
        this.x.remove(localObject2);
        localObject1 = null;
      }
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        paraml.i.a("spdykey", localObject2);
        localObject1 = super.a(paraml);
        paraml = (com.d.a.c.l)localObject1;
        if (((com.d.a.b.a)localObject1).isDone()) {
          break;
        }
        paraml = (com.d.a.c.l)localObject1;
        if (((com.d.a.b.a)localObject1).isCancelled()) {
          break;
        }
        paraml = new ar(null);
        this.x.put(localObject2, paraml);
        return paraml.c;
      }
      paraml.j.b("waiting for potential spdy connection for host: " + paraml.j.d().getHost());
      localObject2 = new j();
      ((ar)localObject1).c(new an(this, paraml, (j)localObject2));
      return (com.d.a.b.a)localObject2;
    }
  }
  
  protected o a(com.d.a.c.l paraml, c paramc)
  {
    String str = (String)paraml.i.a("spdykey");
    if (str == null) {
      return super.a(paraml, paramc);
    }
    return new ak(this, paraml, str, paramc);
  }
  
  public void a(q paramq)
  {
    if (!(paramq.e instanceof b)) {}
    while (paramq.j.g() == null) {
      return;
    }
    paramq.f.h_().a();
  }
  
  public boolean a(n paramn)
  {
    if (!(paramn.e instanceof b)) {
      return super.a(paramn);
    }
    if (paramn.j.g() != null) {
      paramn.f.a(paramn.e);
    }
    paramn.g.a(null);
    b localb = (b)paramn.e;
    ((ao)localb.c().b(new ao(this, paramn))).d(new ap(this, paramn, localb));
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */