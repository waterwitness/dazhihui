package com.tencent.beacon.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.a.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private static int d;
  private static String i = "rqd_up_qua";
  private static int k = 10;
  public boolean a = false;
  private final Context b;
  private final ConcurrentHashMap<Integer, b> c = new ConcurrentHashMap();
  private com.tencent.beacon.e.a<Long> e = new com.tencent.beacon.e.a();
  private com.tencent.beacon.e.a<Long> f = new com.tencent.beacon.e.a();
  private com.tencent.beacon.e.a<Byte> g = new com.tencent.beacon.e.a();
  private com.tencent.beacon.e.a<SharedPreferences> h = new com.tencent.beacon.e.a();
  private int j = 5;
  private Runnable l = new a.1(this);
  private Runnable m = new a.2(this);
  
  public a(Context paramContext)
  {
    this.b = paramContext;
    this.g.a(Byte.valueOf((byte)0));
    e.a().a(this.m);
  }
  
  private String c()
  {
    if ((this.c != null) && (this.c.size() > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        b localb = (b)localEntry.getValue();
        localStringBuilder.append(localEntry.getKey()).append(",").append(localb.a()).append(",").append(localb.b()).append(";");
      }
      return localStringBuilder.toString();
    }
    return "";
  }
  
  private String d()
  {
    if ((this.c != null) && (this.c.size() > 0))
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      Iterator localIterator1 = this.c.entrySet().iterator();
      if (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((b)((Map.Entry)localIterator1.next()).getValue()).c().iterator();
        label74:
        c localc;
        StringBuilder localStringBuilder2;
        if (localIterator2.hasNext())
        {
          localc = (c)localIterator2.next();
          localStringBuilder2 = localStringBuilder1.append(localc.a).append(",").append(localc.b).append(",");
          if (!localc.c) {
            break label242;
          }
        }
        label242:
        for (String str = "Y";; str = "N")
        {
          localStringBuilder2.append(str).append(",").append(localc.d).append(",").append(localc.e).append(",").append(localc.f).append(",").append(localc.g).append(",").append(localc.h).append(",").append(localc.i).append(",").append(localc.j).append(";");
          break label74;
          break;
        }
      }
      return localStringBuilder1.toString();
    }
    return "";
  }
  
  /* Error */
  private void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	com/tencent/beacon/d/a:a	Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 52	com/tencent/beacon/d/a:g	Lcom/tencent/beacon/e/a;
    //   12: astore_3
    //   13: aload_3
    //   14: monitorenter
    //   15: aload_0
    //   16: getfield 52	com/tencent/beacon/d/a:g	Lcom/tencent/beacon/e/a;
    //   19: invokevirtual 195	com/tencent/beacon/e/a:a	()Ljava/lang/Object;
    //   22: checkcast 77	java/lang/Byte
    //   25: invokevirtual 199	java/lang/Byte:byteValue	()B
    //   28: iconst_1
    //   29: iadd
    //   30: i2b
    //   31: istore_2
    //   32: iload_2
    //   33: istore_1
    //   34: iload_2
    //   35: getstatic 36	com/tencent/beacon/d/a:k	I
    //   38: if_icmpne +15 -> 53
    //   41: invokestatic 89	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   44: aload_0
    //   45: getfield 63	com/tencent/beacon/d/a:l	Ljava/lang/Runnable;
    //   48: invokevirtual 92	com/tencent/beacon/a/e:a	(Ljava/lang/Runnable;)V
    //   51: iconst_0
    //   52: istore_1
    //   53: aload_0
    //   54: getfield 52	com/tencent/beacon/d/a:g	Lcom/tencent/beacon/e/a;
    //   57: iload_1
    //   58: invokestatic 81	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   61: invokevirtual 84	com/tencent/beacon/e/a:a	(Ljava/lang/Object;)V
    //   64: aload_3
    //   65: monitorexit
    //   66: return
    //   67: astore 4
    //   69: aload_3
    //   70: monitorexit
    //   71: aload 4
    //   73: athrow
    //   74: astore 4
    //   76: aload 4
    //   78: invokevirtual 202	java/lang/Exception:printStackTrace	()V
    //   81: goto -17 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	a
    //   33	25	1	n	int
    //   31	8	2	i1	int
    //   67	5	4	localObject	Object
    //   74	3	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   15	32	67	finally
    //   34	51	67	finally
    //   53	64	67	finally
    //   64	66	67	finally
    //   76	81	67	finally
    //   15	32	74	java/lang/Exception
    //   34	51	74	java/lang/Exception
    //   53	64	74	java/lang/Exception
  }
  
  public final void a()
  {
    if (!this.a) {
      return;
    }
    try
    {
      long l1 = ((Long)this.e.a()).longValue();
      this.e.a(Long.valueOf(l1 + 1L));
      e();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  /* Error */
  public final void a(int paramInt1, boolean paramBoolean, long paramLong1, long paramLong2, int paramInt2, int paramInt3, String paramString1, String paramString2, int paramInt4, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 43	com/tencent/beacon/d/a:a	Z
    //   6: istore 15
    //   8: iload 15
    //   10: ifne +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: iload_1
    //   17: ifeq -4 -> 13
    //   20: aload_0
    //   21: getfield 73	com/tencent/beacon/d/a:c	Ljava/util/concurrent/ConcurrentHashMap;
    //   24: iload_1
    //   25: invokestatic 221	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: invokevirtual 225	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 128	com/tencent/beacon/d/b
    //   34: astore 13
    //   36: aload 13
    //   38: ifnull +324 -> 362
    //   41: new 163	com/tencent/beacon/d/c
    //   44: dup
    //   45: invokespecial 226	com/tencent/beacon/d/c:<init>	()V
    //   48: astore 14
    //   50: iload_2
    //   51: ifeq +296 -> 347
    //   54: aload 13
    //   56: aload 13
    //   58: invokevirtual 142	com/tencent/beacon/d/b:a	()I
    //   61: iconst_1
    //   62: iadd
    //   63: invokevirtual 229	com/tencent/beacon/d/b:b	(I)V
    //   66: aload 14
    //   68: iload_1
    //   69: putfield 171	com/tencent/beacon/d/c:b	I
    //   72: aload 14
    //   74: lload_3
    //   75: putfield 166	com/tencent/beacon/d/c:a	J
    //   78: lload 5
    //   80: lconst_0
    //   81: lcmp
    //   82: ifle +19 -> 101
    //   85: iload 11
    //   87: ifle +14 -> 101
    //   90: aload 14
    //   92: lload 5
    //   94: l2i
    //   95: iload 11
    //   97: idiv
    //   98: putfield 177	com/tencent/beacon/d/c:d	I
    //   101: aload 14
    //   103: iload 7
    //   105: putfield 179	com/tencent/beacon/d/c:e	I
    //   108: aload 14
    //   110: iload 8
    //   112: putfield 181	com/tencent/beacon/d/c:f	I
    //   115: aload 14
    //   117: aload 9
    //   119: putfield 183	com/tencent/beacon/d/c:g	Ljava/lang/String;
    //   122: aload 14
    //   124: aload 10
    //   126: putfield 185	com/tencent/beacon/d/c:h	Ljava/lang/String;
    //   129: aload 14
    //   131: iload_2
    //   132: putfield 173	com/tencent/beacon/d/c:c	Z
    //   135: aload 14
    //   137: iload 11
    //   139: putfield 187	com/tencent/beacon/d/c:i	I
    //   142: aload 14
    //   144: aload 12
    //   146: putfield 189	com/tencent/beacon/d/c:j	Ljava/lang/String;
    //   149: aload 13
    //   151: invokevirtual 158	com/tencent/beacon/d/b:c	()Ljava/util/List;
    //   154: aload 14
    //   156: invokeinterface 233 2 0
    //   161: pop
    //   162: getstatic 234	com/tencent/beacon/d/a:d	I
    //   165: iconst_1
    //   166: iadd
    //   167: istore_1
    //   168: iload_1
    //   169: putstatic 234	com/tencent/beacon/d/a:d	I
    //   172: iload_1
    //   173: aload_0
    //   174: getfield 56	com/tencent/beacon/d/a:j	I
    //   177: if_icmplt -164 -> 13
    //   180: new 236	java/util/HashMap
    //   183: dup
    //   184: invokespecial 237	java/util/HashMap:<init>	()V
    //   187: astore 9
    //   189: aload 9
    //   191: ldc -17
    //   193: new 100	java/lang/StringBuilder
    //   196: dup
    //   197: invokespecial 101	java/lang/StringBuilder:<init>	()V
    //   200: getstatic 234	com/tencent/beacon/d/a:d	I
    //   203: invokevirtual 145	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   206: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokeinterface 245 3 0
    //   214: pop
    //   215: aload 9
    //   217: ldc -9
    //   219: aload_0
    //   220: invokespecial 249	com/tencent/beacon/d/a:c	()Ljava/lang/String;
    //   223: invokeinterface 245 3 0
    //   228: pop
    //   229: aload 9
    //   231: ldc -5
    //   233: aload_0
    //   234: invokespecial 253	com/tencent/beacon/d/a:d	()Ljava/lang/String;
    //   237: invokeinterface 245 3 0
    //   242: pop
    //   243: aload 9
    //   245: ldc -1
    //   247: aload_0
    //   248: getfield 48	com/tencent/beacon/d/a:e	Lcom/tencent/beacon/e/a;
    //   251: invokevirtual 195	com/tencent/beacon/e/a:a	()Ljava/lang/Object;
    //   254: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   257: invokeinterface 245 3 0
    //   262: pop
    //   263: aload 9
    //   265: ldc_w 262
    //   268: aload_0
    //   269: getfield 50	com/tencent/beacon/d/a:f	Lcom/tencent/beacon/e/a;
    //   272: invokevirtual 195	com/tencent/beacon/e/a:a	()Ljava/lang/Object;
    //   275: invokestatic 260	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   278: invokeinterface 245 3 0
    //   283: pop
    //   284: aload 9
    //   286: ldc_w 264
    //   289: aload_0
    //   290: getfield 75	com/tencent/beacon/d/a:b	Landroid/content/Context;
    //   293: invokestatic 270	com/tencent/beacon/a/h:s	(Landroid/content/Context;)I
    //   296: invokestatic 273	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   299: invokeinterface 245 3 0
    //   304: pop
    //   305: getstatic 34	com/tencent/beacon/d/a:i	Ljava/lang/String;
    //   308: iconst_1
    //   309: lconst_0
    //   310: lconst_0
    //   311: aload 9
    //   313: iconst_1
    //   314: invokestatic 279	com/tencent/beacon/event/UserAction:onUserAction	(Ljava/lang/String;ZJJLjava/util/Map;Z)Z
    //   317: ifeq -304 -> 13
    //   320: aload_0
    //   321: getfield 73	com/tencent/beacon/d/a:c	Ljava/util/concurrent/ConcurrentHashMap;
    //   324: invokevirtual 282	java/util/concurrent/ConcurrentHashMap:clear	()V
    //   327: iconst_0
    //   328: putstatic 234	com/tencent/beacon/d/a:d	I
    //   331: aload_0
    //   332: bipush 10
    //   334: putfield 56	com/tencent/beacon/d/a:j	I
    //   337: goto -324 -> 13
    //   340: astore 9
    //   342: aload_0
    //   343: monitorexit
    //   344: aload 9
    //   346: athrow
    //   347: aload 13
    //   349: aload 13
    //   351: invokevirtual 147	com/tencent/beacon/d/b:b	()I
    //   354: iconst_1
    //   355: iadd
    //   356: invokevirtual 284	com/tencent/beacon/d/b:c	(I)V
    //   359: goto -293 -> 66
    //   362: new 128	com/tencent/beacon/d/b
    //   365: dup
    //   366: invokespecial 285	com/tencent/beacon/d/b:<init>	()V
    //   369: astore 13
    //   371: aload 13
    //   373: iload_1
    //   374: invokevirtual 287	com/tencent/beacon/d/b:a	(I)V
    //   377: iload_2
    //   378: ifeq +131 -> 509
    //   381: aload 13
    //   383: iconst_1
    //   384: invokevirtual 229	com/tencent/beacon/d/b:b	(I)V
    //   387: new 163	com/tencent/beacon/d/c
    //   390: dup
    //   391: invokespecial 226	com/tencent/beacon/d/c:<init>	()V
    //   394: astore 14
    //   396: aload 14
    //   398: iload_1
    //   399: putfield 171	com/tencent/beacon/d/c:b	I
    //   402: aload 14
    //   404: lload_3
    //   405: putfield 166	com/tencent/beacon/d/c:a	J
    //   408: lload 5
    //   410: lconst_0
    //   411: lcmp
    //   412: ifle +19 -> 431
    //   415: iload 11
    //   417: ifle +14 -> 431
    //   420: aload 14
    //   422: lload 5
    //   424: l2i
    //   425: iload 11
    //   427: idiv
    //   428: putfield 177	com/tencent/beacon/d/c:d	I
    //   431: aload 14
    //   433: iload 7
    //   435: putfield 179	com/tencent/beacon/d/c:e	I
    //   438: aload 14
    //   440: iload 8
    //   442: putfield 181	com/tencent/beacon/d/c:f	I
    //   445: aload 14
    //   447: aload 9
    //   449: putfield 183	com/tencent/beacon/d/c:g	Ljava/lang/String;
    //   452: aload 14
    //   454: aload 10
    //   456: putfield 185	com/tencent/beacon/d/c:h	Ljava/lang/String;
    //   459: aload 14
    //   461: iload_2
    //   462: putfield 173	com/tencent/beacon/d/c:c	Z
    //   465: aload 14
    //   467: iload 11
    //   469: putfield 187	com/tencent/beacon/d/c:i	I
    //   472: aload 14
    //   474: aload 12
    //   476: putfield 189	com/tencent/beacon/d/c:j	Ljava/lang/String;
    //   479: aload 13
    //   481: invokevirtual 158	com/tencent/beacon/d/b:c	()Ljava/util/List;
    //   484: aload 14
    //   486: invokeinterface 233 2 0
    //   491: pop
    //   492: aload_0
    //   493: getfield 73	com/tencent/beacon/d/a:c	Ljava/util/concurrent/ConcurrentHashMap;
    //   496: iload_1
    //   497: invokestatic 221	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   500: aload 13
    //   502: invokevirtual 288	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   505: pop
    //   506: goto -344 -> 162
    //   509: aload 13
    //   511: iconst_1
    //   512: invokevirtual 284	com/tencent/beacon/d/b:c	(I)V
    //   515: goto -128 -> 387
    //   518: astore 10
    //   520: aload 10
    //   522: invokevirtual 289	java/lang/InterruptedException:printStackTrace	()V
    //   525: goto -220 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	528	0	this	a
    //   0	528	1	paramInt1	int
    //   0	528	2	paramBoolean	boolean
    //   0	528	3	paramLong1	long
    //   0	528	5	paramLong2	long
    //   0	528	7	paramInt2	int
    //   0	528	8	paramInt3	int
    //   0	528	9	paramString1	String
    //   0	528	10	paramString2	String
    //   0	528	11	paramInt4	int
    //   0	528	12	paramString3	String
    //   34	476	13	localb	b
    //   48	437	14	localc	c
    //   6	3	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	340	finally
    //   20	36	340	finally
    //   41	50	340	finally
    //   54	66	340	finally
    //   66	78	340	finally
    //   90	101	340	finally
    //   101	162	340	finally
    //   162	243	340	finally
    //   243	305	340	finally
    //   305	337	340	finally
    //   347	359	340	finally
    //   362	377	340	finally
    //   381	387	340	finally
    //   387	408	340	finally
    //   420	431	340	finally
    //   431	506	340	finally
    //   509	515	340	finally
    //   520	525	340	finally
    //   243	305	518	java/lang/InterruptedException
  }
  
  public final void b()
  {
    if (!this.a) {
      return;
    }
    try
    {
      long l1 = ((Long)this.f.a()).longValue();
      this.f.a(Long.valueOf(l1 + 1L));
      e();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */