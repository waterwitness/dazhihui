package com.android.dazhihui.ui.delegate.screen.hk;

import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.delegate.domain.HKStockCode;
import com.android.dazhihui.ui.delegate.screen.ad;
import java.util.ArrayList;

public class ch
{
  private ad a = null;
  private ArrayList<HKStockCode> b = null;
  private ci c = null;
  
  public ch(ad paramad)
  {
    this.a = paramad;
  }
  
  private void a(ArrayList<HKStockCode> paramArrayList, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramArrayList.size())
    {
      String str = ((HKStockCode)paramArrayList.get(i)).getCode();
      if (bk.g(str))
      {
        localArrayList.add("NS" + str);
        localArrayList.add("NY" + str);
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.add(bk.h(str) + str);
      }
    }
    b(localArrayList, paramBoolean);
  }
  
  private void b(ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    x[] arrayOfx = new x[paramArrayList.size()];
    int i = 0;
    while (i < paramArrayList.size())
    {
      arrayOfx[i] = new x(2939);
      arrayOfx[i].a((String)paramArrayList.get(i));
      i += 1;
    }
    paramArrayList = new m(arrayOfx);
    this.a.registRequestListener(paramArrayList);
    this.a.a(paramArrayList, paramBoolean);
  }
  
  public void a()
  {
    b();
    this.c.a();
  }
  
  /* Error */
  public void a(com.android.dazhihui.a.b.p paramp)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_1
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: getfield 110	com/android/dazhihui/a/b/p:a	I
    //   12: sipush 2939
    //   15: if_icmpne -8 -> 7
    //   18: aload_1
    //   19: getfield 113	com/android/dazhihui/a/b/p:b	[B
    //   22: astore_1
    //   23: aload_1
    //   24: ifnull -17 -> 7
    //   27: aload_1
    //   28: arraylength
    //   29: ifeq -22 -> 7
    //   32: new 115	com/android/dazhihui/a/b/q
    //   35: dup
    //   36: aload_1
    //   37: invokespecial 118	com/android/dazhihui/a/b/q:<init>	([B)V
    //   40: astore_2
    //   41: aload_2
    //   42: invokevirtual 121	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   45: astore_1
    //   46: aload_1
    //   47: invokestatic 127	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   50: ifne -43 -> 7
    //   53: aload_1
    //   54: invokevirtual 130	java/lang/String:length	()I
    //   57: iconst_2
    //   58: if_icmplt -51 -> 7
    //   61: aload_1
    //   62: iconst_2
    //   63: aload_1
    //   64: invokevirtual 130	java/lang/String:length	()I
    //   67: invokevirtual 134	java/lang/String:substring	(II)Ljava/lang/String;
    //   70: astore_1
    //   71: aload_1
    //   72: invokestatic 47	com/android/dazhihui/ui/delegate/screen/hk/bk:g	(Ljava/lang/String;)Z
    //   75: ifeq +55 -> 130
    //   78: aload_0
    //   79: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   82: astore_3
    //   83: aload_3
    //   84: monitorenter
    //   85: iconst_0
    //   86: istore 4
    //   88: iload 4
    //   90: aload_0
    //   91: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   94: invokevirtual 31	java/util/ArrayList:size	()I
    //   97: if_icmpge +170 -> 267
    //   100: aload_1
    //   101: aload_0
    //   102: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   105: iload 4
    //   107: invokevirtual 35	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   110: checkcast 37	com/android/dazhihui/ui/delegate/domain/HKStockCode
    //   113: invokevirtual 41	com/android/dazhihui/ui/delegate/domain/HKStockCode:getCode	()Ljava/lang/String;
    //   116: invokevirtual 137	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   119: ifeq +123 -> 242
    //   122: aload_3
    //   123: monitorexit
    //   124: iload 4
    //   126: iconst_m1
    //   127: if_icmpeq -120 -> 7
    //   130: aload_2
    //   131: invokevirtual 121	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   134: astore_3
    //   135: aload_0
    //   136: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   139: astore_2
    //   140: aload_2
    //   141: monitorenter
    //   142: iload 5
    //   144: istore 4
    //   146: iload 4
    //   148: aload_0
    //   149: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   152: invokevirtual 31	java/util/ArrayList:size	()I
    //   155: if_icmpge +101 -> 256
    //   158: aload_1
    //   159: aload_0
    //   160: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   163: iload 4
    //   165: invokevirtual 35	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   168: checkcast 37	com/android/dazhihui/ui/delegate/domain/HKStockCode
    //   171: invokevirtual 41	com/android/dazhihui/ui/delegate/domain/HKStockCode:getCode	()Ljava/lang/String;
    //   174: invokevirtual 137	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   177: ifeq +87 -> 264
    //   180: aload_0
    //   181: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   184: iload 4
    //   186: invokevirtual 35	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   189: checkcast 37	com/android/dazhihui/ui/delegate/domain/HKStockCode
    //   192: aload_3
    //   193: invokevirtual 140	com/android/dazhihui/ui/delegate/domain/HKStockCode:setName	(Ljava/lang/String;)V
    //   196: aload_0
    //   197: getfield 22	com/android/dazhihui/ui/delegate/screen/hk/ch:c	Lcom/android/dazhihui/ui/delegate/screen/hk/ci;
    //   200: aload_0
    //   201: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   204: iload 4
    //   206: invokevirtual 35	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   209: checkcast 37	com/android/dazhihui/ui/delegate/domain/HKStockCode
    //   212: invokeinterface 143 2 0
    //   217: aload_0
    //   218: getfield 20	com/android/dazhihui/ui/delegate/screen/hk/ch:b	Ljava/util/ArrayList;
    //   221: iload 4
    //   223: invokevirtual 146	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   226: pop
    //   227: iload 4
    //   229: iconst_1
    //   230: isub
    //   231: istore 4
    //   233: iload 4
    //   235: iconst_1
    //   236: iadd
    //   237: istore 4
    //   239: goto -93 -> 146
    //   242: iload 4
    //   244: iconst_1
    //   245: iadd
    //   246: istore 4
    //   248: goto -160 -> 88
    //   251: astore_1
    //   252: aload_3
    //   253: monitorexit
    //   254: aload_1
    //   255: athrow
    //   256: aload_2
    //   257: monitorexit
    //   258: return
    //   259: astore_1
    //   260: aload_2
    //   261: monitorexit
    //   262: aload_1
    //   263: athrow
    //   264: goto -31 -> 233
    //   267: iconst_m1
    //   268: istore 4
    //   270: goto -148 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	this	ch
    //   0	273	1	paramp	com.android.dazhihui.a.b.p
    //   40	221	2	localObject1	Object
    //   82	171	3	localObject2	Object
    //   86	183	4	i	int
    //   1	142	5	j	int
    // Exception table:
    //   from	to	target	type
    //   88	122	251	finally
    //   122	124	251	finally
    //   252	254	251	finally
    //   146	227	259	finally
    //   256	258	259	finally
    //   260	262	259	finally
  }
  
  public void a(ArrayList<HKStockCode> paramArrayList, ci arg2, boolean paramBoolean)
  {
    this.c = ???;
    if (this.b != null) {}
    for (;;)
    {
      synchronized (this.b)
      {
        this.b.addAll(paramArrayList);
        a(paramArrayList, paramBoolean);
        return;
      }
      this.b = paramArrayList;
    }
  }
  
  public void b()
  {
    if (this.b != null) {
      this.b.clear();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */