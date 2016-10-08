package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.util.AudioDetector;
import com.iflytek.cloud.util.AudioDetector.DetectorResult;
import com.iflytek.msc.MetaVAD;
import com.iflytek.msc.MetaVAD.Instance;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class at
  extends AudioDetector
{
  private static final Map<String, String> c = new HashMap();
  private static final Map<String, String> d = new HashMap();
  private aa e = new aa();
  private final AudioDetector.DetectorResult f = new AudioDetector.DetectorResult();
  private MetaVAD.Instance g = new MetaVAD.Instance();
  private byte[] h = new byte[32768];
  private String i = "gb2312";
  private boolean j = false;
  private boolean k = true;
  private int l = 0;
  private int m = 2;
  private long n = -1L;
  private long o = 0L;
  
  static
  {
    c.put("vad_bos", "vad_starttimeout");
    c.put("vad_eos", "vad_endtimeout");
    c.put("threshold", "vad_threshold");
    d.put("vad_bos", String.valueOf(1200));
    d.put("vad_eos", String.valueOf(20000));
    d.put("threshold", String.valueOf(0.6F));
  }
  
  public at(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
    X.a("Meta VAD AudioDetector constructor enter, context: " + paramContext + ", param: " + paramString);
    this.e.a(paramString);
    try
    {
      this.i = this.e.b("text_encoding", this.i);
      paramContext = this.e.e("extra");
      if (paramContext == null) {
        break label314;
      }
      paramContext = J.a(paramContext, this.i);
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        int i2;
        int i1;
        X.b("Meta VAD AudioDetector constructor exception:");
        X.a(paramContext);
        continue;
        paramContext = null;
        continue;
        paramContext = null;
      }
    }
    X.a("MetaVAD.VADInitialize begin.");
    i2 = MetaVAD.VADInitialize(paramContext);
    i1 = i2;
    if (i2 == 0)
    {
      this.g.rate = this.e.a("sample_rate", 16000);
      paramContext = this.e.e("vad_res_path");
      if (paramContext == null) {
        break label309;
      }
      paramContext = J.a(paramContext, this.i);
      X.a("MetaVAD.VADLoadResource begin.");
      i2 = MetaVAD.VADLoadResource(this.g.rate, paramContext);
      i1 = i2;
      if (i2 == 0)
      {
        X.a("MetaVAD.VADCreateSession begin.");
        i1 = MetaVAD.VADCreateSession(this.g);
      }
    }
    if (i1 != 0) {
      X.b("MetaVAD Native error " + i1);
    }
    X.a("Meta VAD AudioDetector constructor leave");
  }
  
  private void a()
  {
    this.f.buffer = null;
    this.f.end = 0;
    this.f.error = 0;
    this.f.length = 0;
    this.f.offset = 0;
    this.f.quality = 0;
    this.f.start = 0;
    this.f.status = 0;
    this.f.sub = 0;
    this.f.subs.clear();
    this.f.voice = false;
    this.f.volume = 0;
    if (this.g != null) {
      this.g.a();
    }
    this.l = 0;
  }
  
  private void a(int paramInt)
  {
    int i1 = 2;
    switch (paramInt)
    {
    default: 
      this.f.error = paramInt;
    }
    for (;;)
    {
      if ((!this.j) && (this.f.sub != 0))
      {
        this.j = true;
        if (this.f.status == 0) {
          this.f.status = 1;
        }
      }
      if ((this.f.status == 0) && (c())) {
        this.f.status = 4;
      }
      return;
      this.f.error = 0;
      this.g.seg = 0;
      continue;
      this.f.sub = 1;
      continue;
      this.f.sub = 2;
      continue;
      AudioDetector.DetectorResult localDetectorResult = this.f;
      if (this.j) {}
      for (paramInt = i1;; paramInt = 3)
      {
        localDetectorResult.status = paramInt;
        break;
      }
      this.f.sub = 3;
    }
  }
  
  private void b()
  {
    if (this.g.seg != 0)
    {
      Integer localInteger = (Integer)this.f.subs.put(Integer.valueOf(this.g.begin), Integer.valueOf(this.g.end));
      if (localInteger != null)
      {
        X.b("update result error: repeat sub begin: " + localInteger);
        int i1 = this.l + 1;
        this.l = i1;
        if (10 <= i1)
        {
          this.f.error = 10100;
          X.b("update result error: repeat sub reach max count.");
        }
      }
      this.f.sub = 3;
      if ((1 == this.g.seg) || ((this.k) && (3 == this.g.seg))) {
        this.f.start = this.g.begin;
      }
      if (3 == this.g.seg) {
        this.f.end = this.g.end;
      }
      this.k = false;
    }
    this.f.quality = 0;
    this.f.voice = false;
    this.f.volume = this.g.volume;
  }
  
  private boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (0L < this.n)
    {
      bool1 = bool2;
      if (this.n <= this.o) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public boolean destroy()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    X.a("destroy enter");
    for (;;)
    {
      int i2;
      synchronized (b)
      {
        try
        {
          if (this.g == null) {
            continue;
          }
          if (0L == this.g.handle) {
            break label246;
          }
          X.a("destroy MetaVAD.VADDestroySession begin");
          i1 = MetaVAD.VADDestroySession(this.g);
          X.a("destroy MetaVAD.VADDestroySession ret=" + i1);
          i2 = i1;
          if (i1 != 0) {
            break label251;
          }
          this.g.handle = 0L;
          X.a("destroy MetaVAD.VADDelResource begin");
          i1 = MetaVAD.VADDelResource(this.g.rate);
          X.a("destroy MetaVAD.VADDelResource ret=" + i1);
          X.a("destroy MetaVAD.VADUninitialize begin");
          i2 = MetaVAD.VADUninitialize();
          X.a("destroy MetaVAD.VADUninitialize ret=" + i2);
        }
        catch (Throwable localThrowable)
        {
          X.b("destroy exception:");
          X.a(localThrowable);
          bool1 = false;
          continue;
        }
        bool1 = bool2;
        if (bool2)
        {
          this.g = null;
          a = null;
          bool1 = bool2;
        }
        X.a("destroy leave: " + bool1);
        return bool1;
        bool2 = false;
      }
      label246:
      int i1 = 0;
      continue;
      label251:
      if (i2 != 0) {}
    }
  }
  
  /* Error */
  public AudioDetector.DetectorResult detect(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: new 110	java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   10: ldc_w 307
    //   13: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: aload_1
    //   17: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   20: ldc_w 309
    //   23: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: iload_2
    //   27: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   30: ldc_w 311
    //   33: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: iload_3
    //   37: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   40: ldc_w 313
    //   43: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: iload 4
    //   48: invokevirtual 299	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   51: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokestatic 132	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   57: getstatic 265	com/iflytek/thirdparty/at:b	Ljava/lang/Object;
    //   60: astore 5
    //   62: aload 5
    //   64: monitorenter
    //   65: aload_0
    //   66: invokespecial 314	com/iflytek/thirdparty/at:a	()V
    //   69: aload_0
    //   70: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   73: ifnull +15 -> 88
    //   76: lconst_0
    //   77: aload_0
    //   78: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   81: getfield 268	com/iflytek/msc/MetaVAD$Instance:handle	J
    //   84: lcmp
    //   85: ifne +280 -> 365
    //   88: ldc_w 316
    //   91: invokestatic 186	com/iflytek/thirdparty/X:b	(Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   98: sipush 21003
    //   101: putfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   104: aload_0
    //   105: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   108: getfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   111: ifne +246 -> 357
    //   114: iload 4
    //   116: ifeq +6 -> 122
    //   119: iconst_1
    //   120: istore 6
    //   122: aload_0
    //   123: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   126: aload_0
    //   127: getfield 90	com/iflytek/thirdparty/at:h	[B
    //   130: iload_3
    //   131: iload 6
    //   133: invokestatic 320	com/iflytek/msc/MetaVAD:VADAppendPCM	(Lcom/iflytek/msc/MetaVAD$Instance;[BII)I
    //   136: istore 6
    //   138: new 110	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   145: ldc_w 322
    //   148: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: iload 6
    //   153: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokestatic 132	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   162: aload_0
    //   163: getfield 96	com/iflytek/thirdparty/at:j	Z
    //   166: ifeq +14 -> 180
    //   169: aload_0
    //   170: aload_0
    //   171: getfield 108	com/iflytek/thirdparty/at:o	J
    //   174: iload_3
    //   175: i2l
    //   176: ladd
    //   177: putfield 108	com/iflytek/thirdparty/at:o	J
    //   180: aload_0
    //   181: iload 6
    //   183: invokespecial 324	com/iflytek/thirdparty/at:a	(I)V
    //   186: aload_0
    //   187: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   190: getfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   193: ifne +164 -> 357
    //   196: iconst_5
    //   197: istore 6
    //   199: iconst_5
    //   200: iload 6
    //   202: if_icmpne +155 -> 357
    //   205: aload_0
    //   206: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   209: invokestatic 327	com/iflytek/msc/MetaVAD:VADGetSeg	(Lcom/iflytek/msc/MetaVAD$Instance;)I
    //   212: istore 6
    //   214: new 110	java/lang/StringBuilder
    //   217: dup
    //   218: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   221: ldc_w 329
    //   224: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: iload 6
    //   229: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   232: ldc_w 331
    //   235: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload_0
    //   239: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   242: getfield 244	com/iflytek/msc/MetaVAD$Instance:seg	I
    //   245: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   248: ldc_w 333
    //   251: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: aload_0
    //   255: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   258: getfield 247	com/iflytek/msc/MetaVAD$Instance:begin	I
    //   261: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   264: ldc_w 335
    //   267: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload_0
    //   271: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   274: getfield 253	com/iflytek/msc/MetaVAD$Instance:end	I
    //   277: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   280: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: invokestatic 132	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   286: aload_0
    //   287: iload 6
    //   289: invokespecial 324	com/iflytek/thirdparty/at:a	(I)V
    //   292: aload_0
    //   293: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   296: getfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   299: ifne +31 -> 330
    //   302: aload_0
    //   303: invokespecial 337	com/iflytek/thirdparty/at:b	()V
    //   306: aload_0
    //   307: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   310: aload_1
    //   311: putfield 196	com/iflytek/cloud/util/AudioDetector$DetectorResult:buffer	[B
    //   314: aload_0
    //   315: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   318: iload_3
    //   319: putfield 205	com/iflytek/cloud/util/AudioDetector$DetectorResult:length	I
    //   322: aload_0
    //   323: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   326: iload_2
    //   327: putfield 208	com/iflytek/cloud/util/AudioDetector$DetectorResult:offset	I
    //   330: iconst_3
    //   331: aload_0
    //   332: getfield 87	com/iflytek/thirdparty/at:g	Lcom/iflytek/msc/MetaVAD$Instance;
    //   335: getfield 244	com/iflytek/msc/MetaVAD$Instance:seg	I
    //   338: if_icmpeq +13 -> 351
    //   341: aload_0
    //   342: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   345: getfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   348: ifeq -149 -> 199
    //   351: ldc_w 339
    //   354: invokestatic 132	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   357: aload 5
    //   359: monitorexit
    //   360: aload_0
    //   361: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   364: areturn
    //   365: aload_1
    //   366: ifnull +25 -> 391
    //   369: iload_3
    //   370: ifle +21 -> 391
    //   373: ldc 88
    //   375: iload_3
    //   376: if_icmplt +15 -> 391
    //   379: iload_2
    //   380: iflt +11 -> 391
    //   383: aload_1
    //   384: arraylength
    //   385: iload_2
    //   386: isub
    //   387: iload_3
    //   388: if_icmpge +55 -> 443
    //   391: iload 4
    //   393: ifne -289 -> 104
    //   396: aload_0
    //   397: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   400: sipush 20012
    //   403: putfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   406: goto -302 -> 104
    //   409: astore_1
    //   410: ldc_w 341
    //   413: invokestatic 186	com/iflytek/thirdparty/X:b	(Ljava/lang/String;)V
    //   416: aload_1
    //   417: invokestatic 193	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   420: aload_0
    //   421: invokespecial 314	com/iflytek/thirdparty/at:a	()V
    //   424: aload_0
    //   425: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   428: sipush 20021
    //   431: putfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   434: goto -77 -> 357
    //   437: astore_1
    //   438: aload 5
    //   440: monitorexit
    //   441: aload_1
    //   442: athrow
    //   443: aload_1
    //   444: iload_2
    //   445: aload_0
    //   446: getfield 90	com/iflytek/thirdparty/at:h	[B
    //   449: iconst_0
    //   450: iload_3
    //   451: invokestatic 347	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   454: new 110	java/lang/StringBuilder
    //   457: dup
    //   458: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   461: ldc_w 349
    //   464: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: iload_3
    //   468: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   471: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   474: invokestatic 132	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   477: goto -373 -> 104
    //   480: astore_1
    //   481: ldc_w 341
    //   484: invokestatic 186	com/iflytek/thirdparty/X:b	(Ljava/lang/String;)V
    //   487: aload_1
    //   488: invokestatic 193	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   491: aload_0
    //   492: invokespecial 314	com/iflytek/thirdparty/at:a	()V
    //   495: aload_0
    //   496: getfield 82	com/iflytek/thirdparty/at:f	Lcom/iflytek/cloud/util/AudioDetector$DetectorResult;
    //   499: sipush 20999
    //   502: putfield 202	com/iflytek/cloud/util/AudioDetector$DetectorResult:error	I
    //   505: goto -148 -> 357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	508	0	this	at
    //   0	508	1	paramArrayOfByte	byte[]
    //   0	508	2	paramInt1	int
    //   0	508	3	paramInt2	int
    //   0	508	4	paramBoolean	boolean
    //   1	287	6	i1	int
    // Exception table:
    //   from	to	target	type
    //   65	88	409	java/lang/UnsatisfiedLinkError
    //   88	104	409	java/lang/UnsatisfiedLinkError
    //   104	114	409	java/lang/UnsatisfiedLinkError
    //   122	180	409	java/lang/UnsatisfiedLinkError
    //   180	196	409	java/lang/UnsatisfiedLinkError
    //   205	330	409	java/lang/UnsatisfiedLinkError
    //   330	341	409	java/lang/UnsatisfiedLinkError
    //   341	351	409	java/lang/UnsatisfiedLinkError
    //   351	357	409	java/lang/UnsatisfiedLinkError
    //   383	391	409	java/lang/UnsatisfiedLinkError
    //   396	406	409	java/lang/UnsatisfiedLinkError
    //   443	477	409	java/lang/UnsatisfiedLinkError
    //   65	88	437	finally
    //   88	104	437	finally
    //   104	114	437	finally
    //   122	180	437	finally
    //   180	196	437	finally
    //   205	330	437	finally
    //   330	341	437	finally
    //   341	351	437	finally
    //   351	357	437	finally
    //   357	360	437	finally
    //   383	391	437	finally
    //   396	406	437	finally
    //   410	434	437	finally
    //   438	441	437	finally
    //   443	477	437	finally
    //   481	505	437	finally
    //   65	88	480	java/lang/Throwable
    //   88	104	480	java/lang/Throwable
    //   104	114	480	java/lang/Throwable
    //   122	180	480	java/lang/Throwable
    //   180	196	480	java/lang/Throwable
    //   205	330	480	java/lang/Throwable
    //   330	341	480	java/lang/Throwable
    //   341	351	480	java/lang/Throwable
    //   351	357	480	java/lang/Throwable
    //   383	391	480	java/lang/Throwable
    //   396	406	480	java/lang/Throwable
    //   443	477	480	java/lang/Throwable
  }
  
  public void reset()
  {
    X.a("reset enter");
    for (;;)
    {
      synchronized (b)
      {
        if (this.g != null)
        {
          long l1 = this.g.handle;
          if (0L != l1) {
            try
            {
              X.a("reset MetaVAD.VADResetSession begin");
              int i1 = MetaVAD.VADResetSession(this.g);
              X.a("reset MetaVAD.VADResetSession return " + i1);
              this.g.a();
              this.k = true;
              this.j = false;
              this.o = 0L;
              X.a("reset leave");
              return;
            }
            catch (Throwable localThrowable)
            {
              X.b("reset exception:");
              X.a(localThrowable);
              continue;
            }
          }
        }
      }
      X.b("setParameter error: vad instance is null, or invalid handle.");
    }
  }
  
  public void setParameter(String paramString1, String paramString2)
  {
    long l1 = -1L;
    X.a("setParameter enter, key: " + paramString1 + ", value: " + paramString2);
    for (;;)
    {
      long l2;
      int i1;
      synchronized (b)
      {
        if (this.g == null) {
          break label442;
        }
        l2 = this.g.handle;
        if (0L == l2) {
          break label442;
        }
        try
        {
          if ((TextUtils.isEmpty(paramString1)) || (!c.containsKey(paramString1))) {
            break label245;
          }
          if (TextUtils.isEmpty(paramString2)) {
            continue;
          }
          this.e.a(paramString1, paramString2);
          paramString2 = this.e.b(paramString1, (String)d.get(paramString1));
          paramString1 = (String)c.get(paramString1);
          i1 = MetaVAD.VADSetParam(this.g, J.a(paramString1, this.i), J.a(paramString2, this.i));
          X.a("VAD SetParameter key=" + paramString1 + ", value=" + paramString2 + ", ret: " + i1);
        }
        catch (Throwable paramString1)
        {
          X.b("setParameter exception");
          X.a(paramString1);
          continue;
        }
        X.a("setParameter leave.");
        return;
        this.e.d(paramString1);
      }
      label245:
      if (!TextUtils.isEmpty(paramString1))
      {
        boolean bool = "speech_timeout".equalsIgnoreCase(paramString1);
        if (!bool) {}
      }
      try
      {
        l2 = Long.parseLong(paramString2);
        l1 = l2;
      }
      catch (NumberFormatException paramString1)
      {
        for (;;) {}
      }
      X.a("SetParameter speech timeout value:" + l1);
      if (0L < l1)
      {
        this.n = (l1 * (this.g.rate * this.m) / 1000L);
        X.a("SetParameter BytesOfSpeechTimeout: " + this.n);
      }
      else
      {
        this.n = -1L;
        continue;
        i1 = MetaVAD.VADSetParam(this.g, J.a(paramString1, this.i), J.a(paramString2, this.i));
        X.a("VAD SetParameter name=" + paramString1 + ", value=" + paramString2 + ", ret: " + i1);
        continue;
        label442:
        X.b("setParameter error: vad instance is null, or invalid handle.");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */