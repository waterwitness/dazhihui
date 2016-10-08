package com.d.a;

import com.d.a.a.e;
import com.d.a.d.a;

class j
  implements e
{
  final a a = new a().b(8192);
  final ai b = new ai();
  
  j(h paramh) {}
  
  /* Error */
  public void a(al paramal, ai paramai)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   4: getfield 42	com/d/a/h:d	Z
    //   7: ifeq +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   15: iconst_1
    //   16: putfield 42	com/d/a/h:d	Z
    //   19: aload_2
    //   20: aload_0
    //   21: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   24: invokevirtual 45	com/d/a/ai:a	(Lcom/d/a/ai;)V
    //   27: aload_0
    //   28: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   31: invokevirtual 49	com/d/a/ai:e	()Z
    //   34: ifeq +20 -> 54
    //   37: aload_0
    //   38: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   41: invokevirtual 53	com/d/a/ai:k	()Ljava/nio/ByteBuffer;
    //   44: astore_1
    //   45: aload_0
    //   46: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   49: aload_1
    //   50: invokevirtual 56	com/d/a/ai:a	(Ljava/nio/ByteBuffer;)Lcom/d/a/ai;
    //   53: pop
    //   54: getstatic 60	com/d/a/ai:g	Ljava/nio/ByteBuffer;
    //   57: astore_3
    //   58: aload_3
    //   59: astore_1
    //   60: aload_3
    //   61: invokevirtual 66	java/nio/ByteBuffer:remaining	()I
    //   64: ifne +23 -> 87
    //   67: aload_3
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   73: invokevirtual 69	com/d/a/ai:o	()I
    //   76: ifle +11 -> 87
    //   79: aload_0
    //   80: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   83: invokevirtual 72	com/d/a/ai:n	()Ljava/nio/ByteBuffer;
    //   86: astore_1
    //   87: aload_1
    //   88: invokevirtual 66	java/nio/ByteBuffer:remaining	()I
    //   91: istore 4
    //   93: aload_0
    //   94: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   97: getfield 75	com/d/a/h:p	Lcom/d/a/ai;
    //   100: invokevirtual 77	com/d/a/ai:d	()I
    //   103: istore 5
    //   105: aload_0
    //   106: getfield 27	com/d/a/j:a	Lcom/d/a/d/a;
    //   109: invokevirtual 79	com/d/a/d/a:a	()Ljava/nio/ByteBuffer;
    //   112: astore_2
    //   113: aload_0
    //   114: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   117: getfield 82	com/d/a/h:e	Ljavax/net/ssl/SSLEngine;
    //   120: aload_1
    //   121: aload_2
    //   122: invokevirtual 88	javax/net/ssl/SSLEngine:unwrap	(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;
    //   125: astore_3
    //   126: aload_0
    //   127: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   130: aload_0
    //   131: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   134: getfield 75	com/d/a/h:p	Lcom/d/a/ai;
    //   137: aload_2
    //   138: invokevirtual 91	com/d/a/h:a	(Lcom/d/a/ai;Ljava/nio/ByteBuffer;)V
    //   141: aload_0
    //   142: getfield 27	com/d/a/j:a	Lcom/d/a/d/a;
    //   145: aload_0
    //   146: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   149: getfield 75	com/d/a/h:p	Lcom/d/a/ai;
    //   152: invokevirtual 77	com/d/a/ai:d	()I
    //   155: iload 5
    //   157: isub
    //   158: i2l
    //   159: invokevirtual 94	com/d/a/d/a:a	(J)V
    //   162: aload_3
    //   163: invokevirtual 100	javax/net/ssl/SSLEngineResult:getStatus	()Ljavax/net/ssl/SSLEngineResult$Status;
    //   166: getstatic 106	javax/net/ssl/SSLEngineResult$Status:BUFFER_OVERFLOW	Ljavax/net/ssl/SSLEngineResult$Status;
    //   169: if_acmpne +88 -> 257
    //   172: aload_0
    //   173: getfield 27	com/d/a/j:a	Lcom/d/a/d/a;
    //   176: aload_0
    //   177: getfield 27	com/d/a/j:a	Lcom/d/a/d/a;
    //   180: invokevirtual 108	com/d/a/d/a:b	()I
    //   183: iconst_2
    //   184: imul
    //   185: invokevirtual 25	com/d/a/d/a:b	(I)Lcom/d/a/d/a;
    //   188: pop
    //   189: iconst_m1
    //   190: istore 4
    //   192: aload_1
    //   193: astore_2
    //   194: aload_0
    //   195: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   198: aload_3
    //   199: invokevirtual 112	javax/net/ssl/SSLEngineResult:getHandshakeStatus	()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   202: invokestatic 115	com/d/a/h:a	(Lcom/d/a/h;Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;)V
    //   205: aload_2
    //   206: astore_3
    //   207: aload_2
    //   208: invokevirtual 66	java/nio/ByteBuffer:remaining	()I
    //   211: iload 4
    //   213: if_icmpne -155 -> 58
    //   216: aload_2
    //   217: astore_3
    //   218: iload 5
    //   220: aload_0
    //   221: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   224: getfield 75	com/d/a/h:p	Lcom/d/a/ai;
    //   227: invokevirtual 77	com/d/a/ai:d	()I
    //   230: if_icmpne -172 -> 58
    //   233: aload_0
    //   234: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   237: aload_2
    //   238: invokevirtual 118	com/d/a/ai:b	(Ljava/nio/ByteBuffer;)V
    //   241: aload_0
    //   242: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   245: invokevirtual 120	com/d/a/h:e	()V
    //   248: aload_0
    //   249: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   252: iconst_0
    //   253: putfield 42	com/d/a/h:d	Z
    //   256: return
    //   257: aload_1
    //   258: astore_2
    //   259: aload_3
    //   260: invokevirtual 100	javax/net/ssl/SSLEngineResult:getStatus	()Ljavax/net/ssl/SSLEngineResult$Status;
    //   263: getstatic 123	javax/net/ssl/SSLEngineResult$Status:BUFFER_UNDERFLOW	Ljavax/net/ssl/SSLEngineResult$Status;
    //   266: if_acmpne -72 -> 194
    //   269: aload_0
    //   270: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   273: aload_1
    //   274: invokevirtual 118	com/d/a/ai:b	(Ljava/nio/ByteBuffer;)V
    //   277: aload_0
    //   278: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   281: invokevirtual 69	com/d/a/ai:o	()I
    //   284: iconst_1
    //   285: if_icmple -44 -> 241
    //   288: aload_0
    //   289: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   292: invokevirtual 53	com/d/a/ai:k	()Ljava/nio/ByteBuffer;
    //   295: astore_1
    //   296: aload_0
    //   297: getfield 32	com/d/a/j:b	Lcom/d/a/ai;
    //   300: aload_1
    //   301: invokevirtual 118	com/d/a/ai:b	(Ljava/nio/ByteBuffer;)V
    //   304: getstatic 60	com/d/a/ai:g	Ljava/nio/ByteBuffer;
    //   307: astore_2
    //   308: iconst_m1
    //   309: istore 4
    //   311: goto -117 -> 194
    //   314: astore_1
    //   315: aload_1
    //   316: invokevirtual 126	javax/net/ssl/SSLException:printStackTrace	()V
    //   319: aload_0
    //   320: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   323: aload_1
    //   324: invokestatic 129	com/d/a/h:a	(Lcom/d/a/h;Ljava/lang/Exception;)V
    //   327: aload_0
    //   328: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   331: iconst_0
    //   332: putfield 42	com/d/a/h:d	Z
    //   335: return
    //   336: astore_1
    //   337: aload_0
    //   338: getfield 16	com/d/a/j:c	Lcom/d/a/h;
    //   341: iconst_0
    //   342: putfield 42	com/d/a/h:d	Z
    //   345: aload_1
    //   346: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	347	0	this	j
    //   0	347	1	paramal	al
    //   0	347	2	paramai	ai
    //   57	203	3	localObject	Object
    //   91	219	4	i	int
    //   103	128	5	j	int
    // Exception table:
    //   from	to	target	type
    //   11	54	314	javax/net/ssl/SSLException
    //   54	58	314	javax/net/ssl/SSLException
    //   60	67	314	javax/net/ssl/SSLException
    //   69	87	314	javax/net/ssl/SSLException
    //   87	189	314	javax/net/ssl/SSLException
    //   194	205	314	javax/net/ssl/SSLException
    //   207	216	314	javax/net/ssl/SSLException
    //   218	241	314	javax/net/ssl/SSLException
    //   241	248	314	javax/net/ssl/SSLException
    //   259	308	314	javax/net/ssl/SSLException
    //   11	54	336	finally
    //   54	58	336	finally
    //   60	67	336	finally
    //   69	87	336	finally
    //   87	189	336	finally
    //   194	205	336	finally
    //   207	216	336	finally
    //   218	241	336	finally
    //   241	248	336	finally
    //   259	308	336	finally
    //   315	327	336	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */