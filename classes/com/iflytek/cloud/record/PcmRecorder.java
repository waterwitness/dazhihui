package com.iflytek.cloud.record;

import android.media.AudioRecord;
import com.iflytek.cloud.SpeechError;
import com.iflytek.thirdparty.X;

public class PcmRecorder
  extends Thread
{
  public static final int RATE16K = 16000;
  public static final int READ_INTERVAL40MS = 40;
  private final short a = 16;
  private byte[] b = null;
  private AudioRecord c = null;
  private PcmRecorder.PcmRecordListener d = null;
  private PcmRecorder.PcmRecordListener e = null;
  private volatile boolean f = false;
  private double g = 0.0D;
  private double h = 0.0D;
  private int i = 16000;
  private int j = 40;
  private int k = 40;
  private int l;
  
  public PcmRecorder(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, 1);
  }
  
  public PcmRecorder(int paramInt1, int paramInt2, int paramInt3)
  {
    this.l = paramInt3;
    this.i = paramInt1;
    this.j = paramInt2;
    if ((this.j < 40) || (this.j > 100)) {
      this.j = 40;
    }
    this.k = 10;
  }
  
  private double a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt <= 0)) {
      return 0.0D;
    }
    int m = paramArrayOfByte.length;
    paramInt = 0;
    double d1 = 0.0D;
    while (paramInt < m)
    {
      d1 += paramArrayOfByte[paramInt];
      paramInt += 1;
    }
    double d2 = d1 / paramArrayOfByte.length;
    m = paramArrayOfByte.length;
    d1 = 0.0D;
    paramInt = 0;
    while (paramInt < m)
    {
      d1 += Math.pow(paramArrayOfByte[paramInt] - d2, 2.0D);
      paramInt += 1;
    }
    return Math.sqrt(d1 / (paramArrayOfByte.length - 1));
  }
  
  private int a()
  {
    int m;
    if ((this.c == null) || (this.d == null)) {
      m = 0;
    }
    int n;
    do
    {
      do
      {
        return m;
        n = this.c.read(this.b, 0, this.b.length);
        m = n;
      } while (n <= 0);
      m = n;
    } while (this.d == null);
    this.d.onRecordBuffer(this.b, 0, n);
    return n;
  }
  
  private void b()
  {
    try
    {
      if (this.c != null)
      {
        X.a("release record begin");
        this.c.release();
        this.c = null;
        if (this.e != null)
        {
          this.e.onRecordReleased();
          this.e = null;
        }
        X.a("release record over");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        X.b(localException.toString());
      }
    }
    finally {}
  }
  
  protected void a(short paramShort, int paramInt1, int paramInt2)
  {
    if (this.c != null) {
      b();
    }
    short s = paramInt1 * paramInt2 / 1000;
    int n = s * 4 * 16 * paramShort / 8;
    if (paramShort == 1) {}
    for (paramInt2 = 2;; paramInt2 = 3)
    {
      int i1 = AudioRecord.getMinBufferSize(paramInt1, paramInt2, 2);
      int m = n;
      if (n < i1) {
        m = i1;
      }
      this.c = new AudioRecord(this.l, paramInt1, paramInt2, 2, m);
      this.b = new byte[s * paramShort * 16 / 8];
      X.a("\nSampleRate:" + paramInt1 + "\nChannel:" + paramInt2 + "\nFormat:" + 2 + "\nFramePeriod:" + s + "\nBufferSize:" + m + "\nMinBufferSize:" + i1 + "\nActualBufferSize:" + this.b.length + "\n");
      if (this.c.getState() == 1) {
        break;
      }
      X.a("create AudioRecord error");
      throw new SpeechError(20006);
    }
  }
  
  protected void finalize()
  {
    b();
    super.finalize();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 4
    //   6: aload_0
    //   7: getfield 48	com/iflytek/cloud/record/PcmRecorder:f	Z
    //   10: istore 9
    //   12: iload 9
    //   14: ifne +16 -> 30
    //   17: aload_0
    //   18: iconst_1
    //   19: aload_0
    //   20: getfield 54	com/iflytek/cloud/record/PcmRecorder:i	I
    //   23: aload_0
    //   24: getfield 56	com/iflytek/cloud/record/PcmRecorder:j	I
    //   27: invokevirtual 164	com/iflytek/cloud/record/PcmRecorder:a	(SII)V
    //   30: iconst_0
    //   31: istore 4
    //   33: aload_0
    //   34: getfield 48	com/iflytek/cloud/record/PcmRecorder:f	Z
    //   37: istore 9
    //   39: iload 9
    //   41: ifne +136 -> 177
    //   44: aload_0
    //   45: getfield 42	com/iflytek/cloud/record/PcmRecorder:c	Landroid/media/AudioRecord;
    //   48: invokevirtual 167	android/media/AudioRecord:startRecording	()V
    //   51: aload_0
    //   52: getfield 42	com/iflytek/cloud/record/PcmRecorder:c	Landroid/media/AudioRecord;
    //   55: invokevirtual 170	android/media/AudioRecord:getRecordingState	()I
    //   58: iconst_3
    //   59: if_icmpeq +118 -> 177
    //   62: new 153	com/iflytek/cloud/SpeechError
    //   65: dup
    //   66: sipush 20006
    //   69: invokespecial 156	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   72: athrow
    //   73: astore_3
    //   74: iload 4
    //   76: iconst_1
    //   77: iadd
    //   78: istore 4
    //   80: iload 4
    //   82: bipush 10
    //   84: if_icmpge +82 -> 166
    //   87: ldc2_w 171
    //   90: invokestatic 176	com/iflytek/cloud/record/PcmRecorder:sleep	(J)V
    //   93: goto -60 -> 33
    //   96: astore_3
    //   97: aload_3
    //   98: invokestatic 179	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   101: aload_0
    //   102: getfield 44	com/iflytek/cloud/record/PcmRecorder:d	Lcom/iflytek/cloud/record/PcmRecorder$PcmRecordListener;
    //   105: ifnull +22 -> 127
    //   108: aload_0
    //   109: getfield 44	com/iflytek/cloud/record/PcmRecorder:d	Lcom/iflytek/cloud/record/PcmRecorder$PcmRecordListener;
    //   112: new 153	com/iflytek/cloud/SpeechError
    //   115: dup
    //   116: sipush 20006
    //   119: invokespecial 156	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   122: invokeinterface 183 2 0
    //   127: aload_0
    //   128: invokespecial 112	com/iflytek/cloud/record/PcmRecorder:b	()V
    //   131: return
    //   132: astore_3
    //   133: iload 4
    //   135: iconst_1
    //   136: iadd
    //   137: istore 4
    //   139: iload 4
    //   141: bipush 10
    //   143: if_icmpge +12 -> 155
    //   146: ldc2_w 171
    //   149: invokestatic 176	com/iflytek/cloud/record/PcmRecorder:sleep	(J)V
    //   152: goto -146 -> 6
    //   155: new 153	com/iflytek/cloud/SpeechError
    //   158: dup
    //   159: sipush 20006
    //   162: invokespecial 156	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   165: athrow
    //   166: new 153	com/iflytek/cloud/SpeechError
    //   169: dup
    //   170: sipush 20006
    //   173: invokespecial 156	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   176: athrow
    //   177: aload_0
    //   178: getfield 44	com/iflytek/cloud/record/PcmRecorder:d	Lcom/iflytek/cloud/record/PcmRecorder$PcmRecordListener;
    //   181: ifnull +144 -> 325
    //   184: aload_0
    //   185: getfield 44	com/iflytek/cloud/record/PcmRecorder:d	Lcom/iflytek/cloud/record/PcmRecorder$PcmRecordListener;
    //   188: iconst_1
    //   189: invokeinterface 187 2 0
    //   194: goto +131 -> 325
    //   197: aload_0
    //   198: getfield 48	com/iflytek/cloud/record/PcmRecorder:f	Z
    //   201: ifne -74 -> 127
    //   204: aload_0
    //   205: invokespecial 189	com/iflytek/cloud/record/PcmRecorder:a	()I
    //   208: istore 6
    //   210: lload 7
    //   212: ldc2_w 171
    //   215: ladd
    //   216: lstore 7
    //   218: iload 4
    //   220: istore 5
    //   222: iload 4
    //   224: ifeq +86 -> 310
    //   227: aload_0
    //   228: getfield 50	com/iflytek/cloud/record/PcmRecorder:g	D
    //   231: dstore_1
    //   232: aload_0
    //   233: iload 6
    //   235: i2d
    //   236: dload_1
    //   237: dadd
    //   238: putfield 50	com/iflytek/cloud/record/PcmRecorder:g	D
    //   241: aload_0
    //   242: aload_0
    //   243: getfield 52	com/iflytek/cloud/record/PcmRecorder:h	D
    //   246: aload_0
    //   247: aload_0
    //   248: getfield 40	com/iflytek/cloud/record/PcmRecorder:b	[B
    //   251: aload_0
    //   252: getfield 40	com/iflytek/cloud/record/PcmRecorder:b	[B
    //   255: arraylength
    //   256: invokespecial 191	com/iflytek/cloud/record/PcmRecorder:a	([BI)D
    //   259: dadd
    //   260: putfield 52	com/iflytek/cloud/record/PcmRecorder:h	D
    //   263: iload 4
    //   265: istore 5
    //   267: lload 7
    //   269: ldc2_w 192
    //   272: lcmp
    //   273: iflt +37 -> 310
    //   276: aload_0
    //   277: getfield 50	com/iflytek/cloud/record/PcmRecorder:g	D
    //   280: dconst_0
    //   281: dcmpl
    //   282: ifeq +12 -> 294
    //   285: aload_0
    //   286: getfield 52	com/iflytek/cloud/record/PcmRecorder:h	D
    //   289: dconst_0
    //   290: dcmpl
    //   291: ifne +44 -> 335
    //   294: ldc -61
    //   296: invokestatic 109	com/iflytek/thirdparty/X:b	(Ljava/lang/String;)V
    //   299: new 153	com/iflytek/cloud/SpeechError
    //   302: dup
    //   303: sipush 20006
    //   306: invokespecial 156	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   309: athrow
    //   310: aload_0
    //   311: getfield 58	com/iflytek/cloud/record/PcmRecorder:k	I
    //   314: i2l
    //   315: invokestatic 176	com/iflytek/cloud/record/PcmRecorder:sleep	(J)V
    //   318: iload 5
    //   320: istore 4
    //   322: goto -125 -> 197
    //   325: lconst_0
    //   326: lstore 7
    //   328: iload 5
    //   330: istore 4
    //   332: goto -135 -> 197
    //   335: iconst_0
    //   336: istore 5
    //   338: goto -28 -> 310
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	this	PcmRecorder
    //   231	6	1	d1	double
    //   73	1	3	localException1	Exception
    //   96	2	3	localException2	Exception
    //   132	1	3	localException3	Exception
    //   4	327	4	m	int
    //   1	336	5	n	int
    //   208	26	6	i1	int
    //   210	1	7	localObject	Object
    //   216	111	7	l1	long
    //   10	30	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   44	73	73	java/lang/Exception
    //   6	12	96	java/lang/Exception
    //   33	39	96	java/lang/Exception
    //   87	93	96	java/lang/Exception
    //   146	152	96	java/lang/Exception
    //   155	166	96	java/lang/Exception
    //   166	177	96	java/lang/Exception
    //   177	194	96	java/lang/Exception
    //   197	210	96	java/lang/Exception
    //   227	263	96	java/lang/Exception
    //   276	294	96	java/lang/Exception
    //   294	310	96	java/lang/Exception
    //   310	318	96	java/lang/Exception
    //   17	30	132	java/lang/Exception
  }
  
  public void startRecording(PcmRecorder.PcmRecordListener paramPcmRecordListener)
  {
    this.d = paramPcmRecordListener;
    setPriority(10);
    start();
  }
  
  public void stopRecord(boolean paramBoolean)
  {
    this.f = true;
    if (this.e == null) {
      this.e = this.d;
    }
    this.d = null;
    if (paramBoolean) {}
    try
    {
      X.a("stopRecord...release");
      if (this.c != null)
      {
        if ((3 == this.c.getRecordingState()) && (1 == this.c.getState()))
        {
          X.a("stopRecord releaseRecording ing...");
          this.c.release();
          X.a("stopRecord releaseRecording end...");
          this.c = null;
        }
        if (this.e != null)
        {
          this.e.onRecordReleased();
          this.e = null;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        X.b(localException.toString());
      }
    }
    finally {}
    X.a("stop record");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\PcmRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */