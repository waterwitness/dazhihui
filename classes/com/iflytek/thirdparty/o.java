package com.iflytek.thirdparty;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.VerifierListener;
import com.iflytek.cloud.VerifierResult;
import com.iflytek.cloud.record.PcmRecorder;
import com.iflytek.cloud.record.PcmRecorder.PcmRecordListener;
import com.iflytek.cloud.record.a;
import java.util.concurrent.ConcurrentLinkedQueue;

public class o
  extends v
  implements PcmRecorder.PcmRecordListener
{
  protected volatile VerifierListener a = null;
  protected long b = 0L;
  protected boolean c = true;
  protected p d = new p();
  protected PcmRecorder e = null;
  protected String f = "train";
  protected String g = "";
  protected VerifierResult h = null;
  protected ConcurrentLinkedQueue<byte[]> i = null;
  protected int j = 1;
  private long k = 0L;
  private int l = 0;
  
  public o(Context paramContext, aa paramaa, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramHandlerThread);
    a(paramaa);
  }
  
  private void A()
  {
    if (this.e != null)
    {
      this.e.stopRecord(v().a("record_force_stop", false));
      this.e = null;
    }
  }
  
  private boolean l()
  {
    return "train".equalsIgnoreCase(v().e("sst"));
  }
  
  private void n()
  {
    X.a("--->onStoped: in");
    if (!l()) {
      A();
    }
    this.d.a();
    a(4);
    X.a("--->onStoped: out");
  }
  
  private void y()
  {
    X.a("--->requestResult: in");
    w.a locala = this.d.e();
    switch (o.1.a[locala.ordinal()])
    {
    }
    for (;;)
    {
      X.a("--->requestResult: out");
      return;
      z();
    }
  }
  
  private void z()
  {
    this.t = SystemClock.elapsedRealtime();
    this.h = new VerifierResult(new String(this.d.d(), "utf-8"));
    if (this.a != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", f());
      this.a.onEvent(20001, 0, 0, localBundle);
    }
    if ((this.f.equals("train")) && (this.h.ret == 0) && (this.h.suc < this.h.rgn))
    {
      if (this.a != null)
      {
        Y.a("GetNotifyResult", null);
        this.a.onResult(this.h);
      }
      a(0);
      return;
    }
    if (this.a != null)
    {
      Y.a("GetNotifyResult", null);
      this.a.onResult(this.h);
    }
    b(null);
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
      b();
      return;
    case 1: 
      h();
      return;
    case 2: 
      b(paramMessage);
      return;
    case 3: 
      n();
      return;
    case 4: 
      c(paramMessage);
      return;
    }
    X.a("--->on timeout vad");
    i();
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    X.a("--->onEnd: in");
    A();
    f();
    Y.a("SessionEndBegin", null);
    if (this.s)
    {
      this.d.a("user abort");
      Y.a("SessionEndEnd", null);
      super.a(paramSpeechError);
      if ((this.a != null) && (!this.s)) {
        break label121;
      }
    }
    for (;;)
    {
      this.a = null;
      X.a("--->onEnd: out");
      return;
      if (paramSpeechError != null)
      {
        this.d.a("error" + paramSpeechError.getErrorCode());
        break;
      }
      this.d.a("success");
      break;
      label121:
      X.a("VerifyListener#onEnd");
      if (paramSpeechError != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("session_id", f());
        this.a.onEvent(20001, 0, 0, localBundle);
        this.a.onError(paramSpeechError);
      }
    }
  }
  
  public void a(VerifierListener paramVerifierListener)
  {
    try
    {
      X.a("--->startVerify: in");
      this.a = paramVerifierListener;
      a_();
      X.a("--->startVerify: out");
      return;
    }
    finally
    {
      paramVerifierListener = finally;
      throw paramVerifierListener;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    if (t()) {
      this.a.onVolumeChanged(paramInt, paramArrayOfByte);
    }
  }
  
  protected void a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.d.a(paramArrayOfByte, paramArrayOfByte.length);
    if (paramBoolean)
    {
      if (this.d.b())
      {
        X.a("---> VadCheck Time: Vad End Point");
        i();
      }
    }
    else {
      return;
    }
    a(paramArrayOfByte, this.d.c());
  }
  
  /* Error */
  public boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 301
    //   5: invokestatic 111	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokevirtual 305	com/iflytek/thirdparty/o:u	()Lcom/iflytek/thirdparty/v$b;
    //   12: getstatic 310	com/iflytek/thirdparty/v$b:c	Lcom/iflytek/thirdparty/v$b;
    //   15: if_acmpeq +35 -> 50
    //   18: new 249	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 250	java/lang/StringBuilder:<init>	()V
    //   25: ldc_w 312
    //   28: invokevirtual 256	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: invokevirtual 305	com/iflytek/thirdparty/o:u	()Lcom/iflytek/thirdparty/v$b;
    //   35: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 267	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 111	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   44: iconst_0
    //   45: istore_2
    //   46: aload_0
    //   47: monitorexit
    //   48: iload_2
    //   49: ireturn
    //   50: aload_0
    //   51: invokespecial 113	com/iflytek/thirdparty/o:l	()Z
    //   54: ifne +7 -> 61
    //   57: aload_0
    //   58: invokespecial 115	com/iflytek/thirdparty/o:A	()V
    //   61: aload_0
    //   62: iconst_3
    //   63: invokevirtual 120	com/iflytek/thirdparty/o:a	(I)V
    //   66: ldc_w 317
    //   69: invokestatic 111	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   72: iconst_1
    //   73: istore_2
    //   74: goto -28 -> 46
    //   77: astore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_1
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	o
    //   77	4	1	localObject	Object
    //   45	29	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	44	77	finally
    //   50	61	77	finally
    //   61	72	77	finally
  }
  
  protected void b()
  {
    X.a("--->onStart: in");
    String str = v().e("engine_type");
    boolean bool = v().a("net_check", true);
    if (("cloud".equals(str)) && (bool)) {
      Q.b(this.r);
    }
    int m = v().a("record_read_rate", 40);
    if ((this.j != -1) && (t()))
    {
      X.a("start  record");
      if (this.e == null)
      {
        this.e = new PcmRecorder(s(), m, this.j);
        this.e.startRecording(this);
      }
    }
    if ((u() != v.b.e) && (this.a != null)) {
      this.a.onBeginOfSpeech();
    }
    this.b = SystemClock.elapsedRealtime();
    removeMessages(9);
    a(9, v.a.b, false, this.p);
    a(1, v.a.a, false, 0);
    X.a("--->onStart: out");
  }
  
  protected void b(Message paramMessage)
  {
    paramMessage = (byte[])paramMessage.obj;
    if ((paramMessage == null) || (paramMessage.length == 0)) {
      return;
    }
    this.i.add(paramMessage);
    a(paramMessage, true);
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (t()) && (this.a != null)) {
      this.a.onError(new SpeechError(20017));
    }
    A();
    super.b(paramBoolean);
  }
  
  protected void c()
  {
    this.p = v().a("speech_timeout", this.p);
    this.g = v().e("vid");
    this.j = v().a("audio_source", 1);
    this.l = (v().a("filter_audio_time", 0) * (v().a("sample_rate", this.q) / 1000 * 16 / 8));
    X.a("mSpeechTimeOut=" + this.p);
    super.c();
  }
  
  void c(Message paramMessage)
  {
    if (!l()) {
      A();
    }
    y();
    if (u() == v.b.d) {
      a(4, v.a.b, false, 20);
    }
  }
  
  public String e()
  {
    return this.d.g();
  }
  
  public String f()
  {
    return this.d.f();
  }
  
  protected String g()
  {
    return "ivp";
  }
  
  protected void h()
  {
    if (this.d.a == null)
    {
      Y.a("SDKSessionBegin", null);
      this.d.a(this.r, this.g, this);
    }
    a(v.b.c);
  }
  
  public void i()
  {
    if (v.b.c == u())
    {
      X.a("--->vadEndCall: out");
      a();
      if (this.a != null) {
        this.a.onEndOfSpeech();
      }
    }
  }
  
  public ConcurrentLinkedQueue<byte[]> j()
  {
    return this.i;
  }
  
  public int k()
  {
    return this.j;
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
    if (this.l > 0)
    {
      if (this.l >= paramInt2)
      {
        this.l -= paramInt2;
        return;
      }
      arrayOfByte = new byte[paramInt2 - this.l];
      System.arraycopy(paramArrayOfByte, this.l + paramInt1, arrayOfByte, 0, paramInt2 - this.l);
      d(obtainMessage(2, arrayOfByte));
      this.l = 0;
      return;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    d(obtainMessage(2, arrayOfByte));
  }
  
  public void onRecordReleased()
  {
    if ((this.e != null) && ((this.e instanceof a))) {
      a();
    }
  }
  
  public void onRecordStarted(boolean paramBoolean)
  {
    X.a("time cost: onRecordStarted:" + (SystemClock.elapsedRealtime() - this.k));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */