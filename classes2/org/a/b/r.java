package org.a.b;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.a.a.b.h;
import org.a.a.bb;
import org.a.a.be;
import org.a.a.bl;
import org.a.a.t;

public class r
{
  private static final Set a = new HashSet();
  private final h b;
  private final b c;
  private final b d;
  private final org.a.d.a e;
  private final org.a.d.c f;
  private final org.a.d.b g;
  private byte[] h;
  
  static
  {
    a.add(org.a.a.h.c.i_);
    a.add(org.a.a.h.c.d);
    a.add(org.a.a.h.c.e);
    a.add(org.a.a.h.c.j_);
    a.add(org.a.a.h.c.p_);
    a.add(org.a.a.h.c.m_);
    a.add(org.a.a.h.c.n_);
    a.add(org.a.a.h.c.o_);
    a.add(org.a.a.g.a.c);
    a.add(org.a.a.g.a.a);
    a.add(org.a.a.g.a.b);
    a.add(org.a.a.g.a.k);
    a.add(org.a.a.i.a.g);
    a.add(org.a.a.i.a.f);
    a.add(org.a.a.i.a.h);
  }
  
  private Map a(be parambe, org.a.a.k.a parama, byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new HashMap();
    if (parambe != null) {
      localHashMap.put("contentType", parambe);
    }
    localHashMap.put("digestAlgID", parama);
    localHashMap.put("digest", paramArrayOfByte.clone());
    return localHashMap;
  }
  
  private org.a.a.k.a a(org.a.a.k.a parama)
  {
    org.a.a.k.a locala = parama;
    if (a.contains(parama.e())) {
      locala = new org.a.a.k.a(org.a.a.h.c.h_, bb.a);
    }
    return locala;
  }
  
  private t a(org.a.a.b.b paramb)
  {
    if (paramb != null) {
      return new bl(paramb.b());
    }
    return null;
  }
  
  public OutputStream a()
  {
    if (this.f != null)
    {
      if (this.c == null) {
        return new org.a.e.b.b(this.f.b(), this.e.b());
      }
      return this.f.b();
    }
    return this.e.b();
  }
  
  /* Error */
  public org.a.a.b.i a(org.a.a.m paramm)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: getfield 136	org/a/b/r:c	Lorg/a/b/b;
    //   7: ifnull +192 -> 199
    //   10: aload_0
    //   11: getfield 134	org/a/b/r:f	Lorg/a/d/c;
    //   14: invokeinterface 156 1 0
    //   19: astore_2
    //   20: aload_0
    //   21: aload_0
    //   22: getfield 134	org/a/b/r:f	Lorg/a/d/c;
    //   25: invokeinterface 159 1 0
    //   30: putfield 161	org/a/b/r:h	[B
    //   33: aload_0
    //   34: aload_1
    //   35: aload_0
    //   36: getfield 134	org/a/b/r:f	Lorg/a/d/c;
    //   39: invokeinterface 156 1 0
    //   44: aload_0
    //   45: getfield 161	org/a/b/r:h	[B
    //   48: invokespecial 163	org/a/b/r:a	(Lorg/a/a/be;Lorg/a/a/k/a;[B)Ljava/util/Map;
    //   51: astore_3
    //   52: aload_0
    //   53: aload_0
    //   54: getfield 136	org/a/b/r:c	Lorg/a/b/b;
    //   57: aload_3
    //   58: invokestatic 169	java/util/Collections:unmodifiableMap	(Ljava/util/Map;)Ljava/util/Map;
    //   61: invokeinterface 174 2 0
    //   66: invokespecial 176	org/a/b/r:a	(Lorg/a/a/b/b;)Lorg/a/a/t;
    //   69: astore_3
    //   70: aload_0
    //   71: getfield 144	org/a/b/r:e	Lorg/a/d/a;
    //   74: invokeinterface 147 1 0
    //   79: astore 5
    //   81: aload 5
    //   83: aload_3
    //   84: ldc -78
    //   86: invokevirtual 183	org/a/a/t:a	(Ljava/lang/String;)[B
    //   89: invokevirtual 189	java/io/OutputStream:write	([B)V
    //   92: aload 5
    //   94: invokevirtual 192	java/io/OutputStream:close	()V
    //   97: aload_0
    //   98: getfield 144	org/a/b/r:e	Lorg/a/d/a;
    //   101: invokeinterface 193 1 0
    //   106: astore 5
    //   108: aload_0
    //   109: getfield 195	org/a/b/r:d	Lorg/a/b/b;
    //   112: ifnull +47 -> 159
    //   115: aload_0
    //   116: aload_1
    //   117: aload_2
    //   118: aload_0
    //   119: getfield 161	org/a/b/r:h	[B
    //   122: invokespecial 163	org/a/b/r:a	(Lorg/a/a/be;Lorg/a/a/k/a;[B)Ljava/util/Map;
    //   125: astore_1
    //   126: aload_1
    //   127: ldc -59
    //   129: aload 5
    //   131: invokevirtual 100	[B:clone	()Ljava/lang/Object;
    //   134: invokeinterface 91 3 0
    //   139: pop
    //   140: aload_0
    //   141: aload_0
    //   142: getfield 195	org/a/b/r:d	Lorg/a/b/b;
    //   145: aload_1
    //   146: invokestatic 169	java/util/Collections:unmodifiableMap	(Ljava/util/Map;)Ljava/util/Map;
    //   149: invokeinterface 174 2 0
    //   154: invokespecial 176	org/a/b/r:a	(Lorg/a/a/b/b;)Lorg/a/a/t;
    //   157: astore 4
    //   159: aload_0
    //   160: aload_0
    //   161: getfield 144	org/a/b/r:e	Lorg/a/d/a;
    //   164: invokeinterface 198 1 0
    //   169: invokespecial 200	org/a/b/r:a	(Lorg/a/a/k/a;)Lorg/a/a/k/a;
    //   172: astore_1
    //   173: new 202	org/a/a/b/i
    //   176: dup
    //   177: aload_0
    //   178: getfield 204	org/a/b/r:b	Lorg/a/a/b/h;
    //   181: aload_2
    //   182: aload_3
    //   183: aload_1
    //   184: new 206	org/a/a/bf
    //   187: dup
    //   188: aload 5
    //   190: invokespecial 208	org/a/a/bf:<init>	([B)V
    //   193: aload 4
    //   195: invokespecial 211	org/a/a/b/i:<init>	(Lorg/a/a/b/h;Lorg/a/a/k/a;Lorg/a/a/t;Lorg/a/a/k/a;Lorg/a/a/n;Lorg/a/a/t;)V
    //   198: areturn
    //   199: aload_0
    //   200: getfield 134	org/a/b/r:f	Lorg/a/d/c;
    //   203: ifnull +31 -> 234
    //   206: aload_0
    //   207: getfield 134	org/a/b/r:f	Lorg/a/d/c;
    //   210: invokeinterface 156 1 0
    //   215: astore_2
    //   216: aload_0
    //   217: aload_0
    //   218: getfield 134	org/a/b/r:f	Lorg/a/d/c;
    //   221: invokeinterface 159 1 0
    //   226: putfield 161	org/a/b/r:h	[B
    //   229: aconst_null
    //   230: astore_3
    //   231: goto -134 -> 97
    //   234: aload_0
    //   235: getfield 213	org/a/b/r:g	Lorg/a/d/b;
    //   238: aload_0
    //   239: getfield 144	org/a/b/r:e	Lorg/a/d/a;
    //   242: invokeinterface 198 1 0
    //   247: invokeinterface 216 2 0
    //   252: astore_2
    //   253: aload_0
    //   254: aconst_null
    //   255: putfield 161	org/a/b/r:h	[B
    //   258: aconst_null
    //   259: astore_3
    //   260: goto -163 -> 97
    //   263: astore_1
    //   264: new 218	org/a/b/c
    //   267: dup
    //   268: ldc -36
    //   270: aload_1
    //   271: invokespecial 223	org/a/b/c:<init>	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   274: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	r
    //   0	275	1	paramm	org.a.a.m
    //   19	234	2	locala	org.a.a.k.a
    //   51	209	3	localObject1	Object
    //   1	193	4	localt	t
    //   79	110	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	97	263	java/io/IOException
    //   97	108	263	java/io/IOException
    //   108	159	263	java/io/IOException
    //   159	199	263	java/io/IOException
    //   199	229	263	java/io/IOException
    //   234	258	263	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */