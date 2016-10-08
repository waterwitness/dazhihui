package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SynthesizerListener;

public class aj
  extends z
  implements E.a
{
  private Context f = null;
  private E g = null;
  private E h = null;
  
  public aj(Context paramContext)
  {
    super(paramContext);
    this.f = paramContext.getApplicationContext();
  }
  
  private int a(String paramString1, SynthesizerListener paramSynthesizerListener, String paramString2)
  {
    X.a("new Session Start");
    this.g = new E(this.f);
    this.g.a(this);
    int i = this.g.a(paramString1, this.b, paramSynthesizerListener, true);
    if (!TextUtils.isEmpty(paramString2))
    {
      this.h = new E(this.f);
      this.h.a(this);
      this.h.a(paramString2, this.b);
    }
    return i;
  }
  
  /* Error */
  public int a(String paramString, SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: ldc 62
    //   5: invokestatic 37	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 47	com/iflytek/thirdparty/aj:b	Lcom/iflytek/thirdparty/aa;
    //   14: ldc 64
    //   16: invokevirtual 70	com/iflytek/thirdparty/aa:d	(Ljava/lang/String;)Ljava/lang/String;
    //   19: astore_3
    //   20: aload_0
    //   21: getfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   24: ifnull +30 -> 54
    //   27: aload_0
    //   28: getfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   31: invokevirtual 73	com/iflytek/thirdparty/E:h	()Z
    //   34: ifeq +20 -> 54
    //   37: aload_0
    //   38: getfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   41: aload_0
    //   42: getfield 47	com/iflytek/thirdparty/aj:b	Lcom/iflytek/thirdparty/aa;
    //   45: ldc 75
    //   47: iconst_0
    //   48: invokevirtual 78	com/iflytek/thirdparty/aa:a	(Ljava/lang/String;Z)Z
    //   51: invokevirtual 82	com/iflytek/thirdparty/E:cancel	(Z)V
    //   54: aload_0
    //   55: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   58: ifnonnull +22 -> 80
    //   61: aload_0
    //   62: aload_1
    //   63: aload_2
    //   64: aload_3
    //   65: invokespecial 84	com/iflytek/thirdparty/aj:a	(Ljava/lang/String;Lcom/iflytek/cloud/SynthesizerListener;Ljava/lang/String;)I
    //   68: istore 4
    //   70: aload_0
    //   71: monitorexit
    //   72: ldc 86
    //   74: invokestatic 37	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   77: iload 4
    //   79: ireturn
    //   80: aload_1
    //   81: aload_0
    //   82: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   85: getfield 89	com/iflytek/thirdparty/E:h	Ljava/lang/String;
    //   88: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   91: ifne +28 -> 119
    //   94: aload_0
    //   95: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   98: iconst_0
    //   99: invokevirtual 82	com/iflytek/thirdparty/E:cancel	(Z)V
    //   102: aload_0
    //   103: aconst_null
    //   104: putfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   107: aload_0
    //   108: aload_1
    //   109: aload_2
    //   110: aload_3
    //   111: invokespecial 84	com/iflytek/thirdparty/aj:a	(Ljava/lang/String;Lcom/iflytek/cloud/SynthesizerListener;Ljava/lang/String;)I
    //   114: istore 4
    //   116: goto -46 -> 70
    //   119: aload_0
    //   120: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   123: getfield 99	com/iflytek/thirdparty/E:i	Lcom/iflytek/cloud/SpeechError;
    //   126: ifnonnull +13 -> 139
    //   129: aload_0
    //   130: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   133: getfield 102	com/iflytek/thirdparty/E:f	Z
    //   136: ifne +28 -> 164
    //   139: aload_0
    //   140: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   143: iconst_0
    //   144: invokevirtual 82	com/iflytek/thirdparty/E:cancel	(Z)V
    //   147: aload_0
    //   148: aconst_null
    //   149: putfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   152: aload_0
    //   153: aload_1
    //   154: aload_2
    //   155: aload_3
    //   156: invokespecial 84	com/iflytek/thirdparty/aj:a	(Ljava/lang/String;Lcom/iflytek/cloud/SynthesizerListener;Ljava/lang/String;)I
    //   159: istore 4
    //   161: goto -91 -> 70
    //   164: aload_0
    //   165: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   168: astore_1
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   174: aload_3
    //   175: invokestatic 56	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   178: ifne +38 -> 216
    //   181: aload_0
    //   182: new 39	com/iflytek/thirdparty/E
    //   185: dup
    //   186: aload_0
    //   187: getfield 17	com/iflytek/thirdparty/aj:f	Landroid/content/Context;
    //   190: invokespecial 40	com/iflytek/thirdparty/E:<init>	(Landroid/content/Context;)V
    //   193: putfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   196: aload_0
    //   197: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   200: aload_0
    //   201: invokevirtual 43	com/iflytek/thirdparty/E:a	(Lcom/iflytek/thirdparty/E$a;)V
    //   204: aload_0
    //   205: getfield 21	com/iflytek/thirdparty/aj:h	Lcom/iflytek/thirdparty/E;
    //   208: aload_3
    //   209: aload_0
    //   210: getfield 47	com/iflytek/thirdparty/aj:b	Lcom/iflytek/thirdparty/aa;
    //   213: invokevirtual 59	com/iflytek/thirdparty/E:a	(Ljava/lang/String;Lcom/iflytek/thirdparty/aa;)V
    //   216: aload_0
    //   217: aload_1
    //   218: putfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   221: aload_0
    //   222: getfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   225: aload_2
    //   226: invokevirtual 105	com/iflytek/thirdparty/E:a	(Lcom/iflytek/cloud/SynthesizerListener;)V
    //   229: aload_0
    //   230: getfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   233: invokevirtual 108	com/iflytek/thirdparty/E:i	()V
    //   236: iload 5
    //   238: istore 4
    //   240: aload_0
    //   241: getfield 19	com/iflytek/thirdparty/aj:g	Lcom/iflytek/thirdparty/E;
    //   244: getfield 110	com/iflytek/thirdparty/E:g	Z
    //   247: ifeq -177 -> 70
    //   250: aload_0
    //   251: invokevirtual 112	com/iflytek/thirdparty/aj:a	()V
    //   254: ldc 114
    //   256: invokestatic 37	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   259: iload 5
    //   261: istore 4
    //   263: goto -193 -> 70
    //   266: astore_1
    //   267: aload_0
    //   268: monitorexit
    //   269: aload_1
    //   270: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	this	aj
    //   0	271	1	paramString	String
    //   0	271	2	paramSynthesizerListener	SynthesizerListener
    //   19	190	3	str	String
    //   68	194	4	i	int
    //   1	259	5	j	int
    // Exception table:
    //   from	to	target	type
    //   10	54	266	finally
    //   54	70	266	finally
    //   70	72	266	finally
    //   80	116	266	finally
    //   119	139	266	finally
    //   139	161	266	finally
    //   164	216	266	finally
    //   216	236	266	finally
    //   240	259	266	finally
    //   267	269	266	finally
  }
  
  public int a(String paramString1, String paramString2, SynthesizerListener paramSynthesizerListener)
  {
    X.a("synthesizeToUri enter");
    try
    {
      if ((this.g != null) && (this.g.h())) {
        this.g.cancel(this.b.a("tts_interrupt_error", false));
      }
      this.g = new E(this.f);
      int i = this.g.a(paramString1, paramString2, this.b, paramSynthesizerListener);
      X.a("synthesizeToUri leave");
      return i;
    }
    finally {}
  }
  
  public void a()
  {
    try
    {
      if (this.h != null) {
        this.h.e();
      }
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    X.a("stopSpeaking enter:" + paramBoolean);
    try
    {
      if (this.g != null)
      {
        X.a("-->stopSpeaking cur");
        this.g.cancel(paramBoolean);
        this.g = null;
      }
      if (this.h != null)
      {
        X.a("-->stopSpeaking cur next");
        this.h.cancel(false);
        this.h = null;
      }
      X.a("stopSpeaking leave");
      return;
    }
    finally {}
  }
  
  public boolean destroy()
  {
    a(false);
    super.destroy();
    return true;
  }
  
  public void e()
  {
    X.a("pauseSpeaking enter");
    try
    {
      if (this.g != null) {
        this.g.g();
      }
      X.a("pauseSpeaking leave");
      return;
    }
    finally {}
  }
  
  public void f()
  {
    X.a("resumeSpeaking enter");
    try
    {
      if (this.g != null) {
        this.g.i();
      }
      X.a("resumeSpeaking leave");
      return;
    }
    finally {}
  }
  
  public boolean g()
  {
    boolean bool = false;
    X.a("isSpeaking enter");
    try
    {
      if (this.g != null) {
        bool = this.g.h();
      }
      X.a("isSpeaking leave");
      return bool;
    }
    finally {}
  }
  
  public int h()
  {
    int i = 4;
    X.a("getState enter");
    try
    {
      if (this.g != null) {
        i = this.g.f();
      }
      X.a("getState leave");
      return i;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */