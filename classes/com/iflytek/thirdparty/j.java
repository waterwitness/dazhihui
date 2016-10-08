package com.iflytek.thirdparty;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.EvaluatorListener;
import com.iflytek.cloud.EvaluatorResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.record.PcmRecorder;
import com.iflytek.cloud.record.PcmRecorder.PcmRecordListener;
import com.iflytek.cloud.record.a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;

public class j
  extends v
  implements PcmRecorder.PcmRecordListener
{
  public static int a = 0;
  public static int b = 0;
  private static Boolean m = Boolean.valueOf(false);
  long c = 0L;
  long d = 0L;
  protected int e = 1;
  protected i f = new i();
  protected PcmRecorder g = null;
  protected x h = new x();
  protected String i = null;
  protected byte[] j = null;
  protected String k = null;
  protected String l = null;
  private volatile EvaluatorListener n = null;
  private ConcurrentLinkedQueue<byte[]> o = null;
  private ConcurrentLinkedQueue<byte[]> v = null;
  private ArrayList<String> w = null;
  private boolean x = false;
  private w.a y = w.a.c;
  
  public j(Context paramContext, aa paramaa, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramHandlerThread);
    a(paramaa);
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((this.n != null) && (t())) {
      this.n.onVolumeChanged(paramInt, paramArrayOfByte);
    }
  }
  
  private void a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.f.a(paramArrayOfByte, paramArrayOfByte.length);
    if (paramBoolean)
    {
      if (this.f.b() == 3) {
        j();
      }
    }
    else {
      return;
    }
    a(paramArrayOfByte, this.f.c());
  }
  
  private void d(boolean paramBoolean)
  {
    this.t = SystemClock.elapsedRealtime();
    if ((this.f.d() != null) && (this.f.d().length > 0)) {
      this.w.add(new String(this.f.d(), "utf-8"));
    }
    c(paramBoolean);
  }
  
  private void h()
  {
    X.a("--->onStoped: in");
    if (!t()) {
      k();
    }
    this.f.a();
    o();
    X.a("--->onStoped: out");
  }
  
  private void i()
  {
    w.a locala = this.f.e();
    this.y = locala;
    switch (j.1.a[locala.ordinal()])
    {
    case 1: 
    default: 
      return;
    case 2: 
      d(false);
      return;
    }
    d(true);
  }
  
  private void j()
  {
    if (v.b.c == u())
    {
      a(false);
      if (this.n != null) {
        this.n.onEndOfSpeech();
      }
    }
  }
  
  private void k()
  {
    if (this.g != null)
    {
      this.g.stopRecord(v().a("record_force_stop", false));
      this.g = null;
    }
  }
  
  protected void a()
  {
    X.a("--->onStart: in");
    if (v().a("net_check", true)) {
      Q.b(this.r);
    }
    int i1 = v().a("record_read_rate", 40);
    this.e = v().a("audio_source", 1);
    String str;
    if ((this.e != -1) && (t()))
    {
      X.a("start  record");
      if (this.e != -2) {
        break label190;
      }
      str = v().e("ise_source_path");
    }
    label190:
    for (this.g = new a(s(), i1, this.e, str);; this.g = new PcmRecorder(s(), i1, this.e))
    {
      this.g.startRecording(this);
      if ((u() != v.b.e) && (this.n != null)) {
        this.n.onBeginOfSpeech();
      }
      removeMessages(9);
      if (-1 != this.p) {
        a(9, v.a.b, false, this.p);
      }
      a(1, v.a.a, false, 0);
      X.a("--->onStart: out");
      return;
    }
  }
  
  protected void a(Message paramMessage)
  {
    super.a(paramMessage);
    switch (paramMessage.what)
    {
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      return;
    case 0: 
      a();
      return;
    case 1: 
      b();
      return;
    case 2: 
      b(paramMessage);
      return;
    case 3: 
      h();
      return;
    case 4: 
      c(paramMessage);
      return;
    }
    X.a("--->on timeout vad");
    j();
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    X.a("--->onEnd: in");
    k();
    f();
    Y.a("SessionEndBegin", null);
    if (this.s)
    {
      this.f.a("user abort");
      Y.a("SessionEndEnd", null);
      super.a(paramSpeechError);
      if ((this.n != null) && (!this.s)) {
        break label127;
      }
    }
    for (;;)
    {
      this.n = null;
      X.a("--->onEnd: out");
      return;
      if (paramSpeechError != null)
      {
        this.f.a("error" + paramSpeechError.getErrorCode());
        break;
      }
      this.f.a("success");
      break;
      label127:
      X.a("VerifyListener#onEnd");
      if (paramSpeechError != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("session_id", f());
        this.n.onEvent(20001, 0, 0, localBundle);
        this.n.onError(paramSpeechError);
      }
    }
  }
  
  public void a(String paramString1, String paramString2, EvaluatorListener paramEvaluatorListener)
  {
    try
    {
      m = Boolean.valueOf(false);
      this.k = paramString1;
      this.i = paramString2;
      this.l = v().e("user_model_id");
      this.n = paramEvaluatorListener;
      X.a("startListening called");
      a_();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void a(byte[] paramArrayOfByte, String paramString, EvaluatorListener paramEvaluatorListener)
  {
    try
    {
      m = Boolean.valueOf(true);
      this.j = paramArrayOfByte;
      this.i = paramString;
      this.l = v().e("user_model_id");
      this.n = paramEvaluatorListener;
      X.a("startListening called");
      a_();
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  /* Error */
  public boolean a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokevirtual 196	com/iflytek/thirdparty/j:u	()Lcom/iflytek/thirdparty/v$b;
    //   8: getstatic 192	com/iflytek/thirdparty/v$b:c	Lcom/iflytek/thirdparty/v$b;
    //   11: if_acmpeq +35 -> 46
    //   14: new 328	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 329	java/lang/StringBuilder:<init>	()V
    //   21: ldc_w 376
    //   24: invokevirtual 335	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: invokevirtual 196	com/iflytek/thirdparty/j:u	()Lcom/iflytek/thirdparty/v$b;
    //   31: invokevirtual 379	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 346	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 166	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   40: iload_3
    //   41: istore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: iload_1
    //   45: ireturn
    //   46: aload_0
    //   47: getfield 76	com/iflytek/thirdparty/j:g	Lcom/iflytek/cloud/record/PcmRecorder;
    //   50: ifnull +20 -> 70
    //   53: aload_0
    //   54: getfield 76	com/iflytek/thirdparty/j:g	Lcom/iflytek/cloud/record/PcmRecorder;
    //   57: aload_0
    //   58: invokevirtual 205	com/iflytek/thirdparty/j:v	()Lcom/iflytek/thirdparty/aa;
    //   61: ldc -49
    //   63: iconst_0
    //   64: invokevirtual 212	com/iflytek/thirdparty/aa:a	(Ljava/lang/String;Z)Z
    //   67: invokevirtual 217	com/iflytek/cloud/record/PcmRecorder:stopRecord	(Z)V
    //   70: aload_0
    //   71: iload_1
    //   72: putfield 97	com/iflytek/thirdparty/j:x	Z
    //   75: aload_0
    //   76: iconst_3
    //   77: invokevirtual 381	com/iflytek/thirdparty/j:a	(I)V
    //   80: iconst_1
    //   81: istore_1
    //   82: goto -40 -> 42
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	j
    //   0	90	1	paramBoolean	boolean
    //   85	4	2	localObject	Object
    //   1	40	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	40	85	finally
    //   46	70	85	finally
    //   70	80	85	finally
  }
  
  protected void b()
  {
    byte[] arrayOfByte2 = null;
    if (this.f.a == null)
    {
      Y.a("SDKSessionBegin", null);
      this.f.a(this.r, this.l, this);
    }
    byte[] arrayOfByte1;
    i locali;
    if (m.booleanValue()) {
      if ("1".equals(v().e("text_bom")))
      {
        arrayOfByte1 = J.a(this.j);
        locali = this.f;
        if (!TextUtils.isEmpty(this.i)) {
          break label164;
        }
      }
    }
    for (;;)
    {
      locali.a(arrayOfByte1, arrayOfByte2);
      a(v.b.c);
      a(4, v.a.b, false, 20);
      return;
      arrayOfByte1 = this.j;
      break;
      if ("1".equals(v().e("text_bom")))
      {
        arrayOfByte1 = J.a(this.k);
        break;
      }
      arrayOfByte1 = this.k.getBytes("gb2312");
      break;
      label164:
      arrayOfByte2 = this.i.getBytes("gb2312");
    }
  }
  
  protected void b(Message paramMessage)
  {
    paramMessage = (byte[])paramMessage.obj;
    if ((paramMessage == null) || (paramMessage.length == 0)) {
      return;
    }
    if (!TextUtils.isEmpty(v().e("ise_audio_path"))) {
      this.o.add(paramMessage);
    }
    a(paramMessage, true);
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (t()) && (this.n != null)) {
      this.n.onError(new SpeechError(20017));
    }
    k();
    super.b(paramBoolean);
  }
  
  protected void c()
  {
    this.p = v().a("speech_timeout", -1);
    X.a("mSpeechTimeOut=" + this.p);
    if (("utf-8".equals(v().e("text_encoding"))) && (Locale.CHINA.toString().equalsIgnoreCase(v().e("language")))) {
      v().a("text_bom", "1", false);
    }
    for (;;)
    {
      super.c();
      return;
      v().a("text_bom", "0", false);
    }
  }
  
  void c(Message paramMessage)
  {
    i();
    if (w.a.c == this.y) {
      a(4, v.a.b, false, 20);
    }
    while (w.a.a != this.y) {
      return;
    }
    a(4);
  }
  
  public void c(boolean paramBoolean)
  {
    X.a("msc result time:" + System.currentTimeMillis());
    Object localObject = v().b("rse", "gb2312");
    localObject = new EvaluatorResult(new String(this.f.d(), (String)localObject));
    if (this.n != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", f());
      this.n.onEvent(20001, 0, 0, localBundle);
      Y.a("GetNotifyResult", null);
      this.n.onResult((EvaluatorResult)localObject, paramBoolean);
    }
    if (paramBoolean) {
      b(null);
    }
  }
  
  public ConcurrentLinkedQueue<byte[]> d()
  {
    for (;;)
    {
      byte[] arrayOfByte = (byte[])this.v.poll();
      if (arrayOfByte == null) {
        break;
      }
      this.o.add(arrayOfByte);
    }
    return this.o;
  }
  
  public String e()
  {
    return this.f.g();
  }
  
  public String f()
  {
    return this.f.f();
  }
  
  protected String g()
  {
    return "ise";
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    b(paramSpeechError);
  }
  
  public void onRecordBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (v.b.c != u()) {}
    while (paramInt2 <= 0) {
      return;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    d(obtainMessage(2, arrayOfByte));
  }
  
  public void onRecordReleased()
  {
    if ((this.g != null) && ((this.g instanceof a))) {
      a(true);
    }
  }
  
  public void onRecordStarted(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */