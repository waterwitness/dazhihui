package com.iflytek.thirdparty;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.record.PcmRecorder;
import com.iflytek.cloud.record.PcmRecorder.PcmRecordListener;
import com.iflytek.cloud.record.a;
import com.iflytek.msc.MSC;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class l
  extends v
  implements PcmRecorder.PcmRecordListener
{
  public static int j = 0;
  public static int k = 0;
  protected volatile RecognizerListener a = null;
  protected boolean b = false;
  protected boolean c = false;
  protected boolean d = false;
  protected boolean e = false;
  protected int f = 1;
  protected boolean g = true;
  protected k h = new k();
  protected PcmRecorder i = null;
  protected String l = null;
  protected ConcurrentLinkedQueue<byte[]> m = null;
  protected ArrayList<String> n = null;
  protected x o = new x();
  private int v = 0;
  private boolean w = false;
  private int x = 0;
  
  public l(Context paramContext, aa paramaa, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramHandlerThread);
    a(paramaa);
  }
  
  private void a(boolean paramBoolean, byte[] paramArrayOfByte)
  {
    this.t = SystemClock.elapsedRealtime();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {
      paramArrayOfByte = new String(paramArrayOfByte, "utf-8");
    }
    for (;;)
    {
      this.n.add(paramArrayOfByte);
      if ((this.a != null) && (t()))
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("session_id", f());
        this.a.onEvent(20001, 0, 0, localBundle);
        if ((paramBoolean) && (v().a("request_audio_url", false)))
        {
          localBundle = new Bundle();
          localBundle.putString("audio_url", this.h.d());
          this.a.onEvent(23001, 0, 0, localBundle);
        }
        paramArrayOfByte = new RecognizerResult(paramArrayOfByte);
        Y.a("GetNotifyResult", null);
        this.a.onResult(paramArrayOfByte, paramBoolean);
      }
      X.a("msc result time:" + System.currentTimeMillis());
      if (paramBoolean) {
        b(null);
      }
      return;
      if (this.n.size() <= 0)
      {
        paramArrayOfByte = v().e("local_grammar");
        if ((!TextUtils.isEmpty(paramArrayOfByte)) && (!"sms.irf".equals(paramArrayOfByte))) {
          throw new SpeechError(20005);
        }
        if (v().a("asr_nomatch_error", true)) {
          throw new SpeechError(10118);
        }
        paramArrayOfByte = "";
      }
      else
      {
        paramArrayOfByte = "";
      }
    }
  }
  
  private void y()
  {
    if (this.i != null)
    {
      this.i.stopRecord(v().a("record_force_stop", false));
      this.i = null;
      this.o.a("rec_close");
      if (this.a != null) {
        this.a.onEvent(22003, 0, 0, null);
      }
    }
  }
  
  public int a()
  {
    return this.f;
  }
  
  protected void a(Message paramMessage)
  {
    super.a(paramMessage);
    switch (paramMessage.what)
    {
    case 5: 
    case 6: 
    case 8: 
    default: 
      return;
    case 0: 
      h();
      return;
    case 1: 
      i();
      return;
    case 9: 
      l();
      return;
    case 2: 
      b(paramMessage);
      return;
    case 3: 
      j();
      return;
    case 4: 
      c(paramMessage);
      return;
    }
    k();
  }
  
  public void a(RecognizerListener paramRecognizerListener)
  {
    try
    {
      this.a = paramRecognizerListener;
      X.a("startListening called");
      a_();
      return;
    }
    finally
    {
      paramRecognizerListener = finally;
      throw paramRecognizerListener;
    }
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    X.a("onSessionEnd");
    y();
    j = this.h.b("upflow");
    k = this.h.b("downflow");
    f();
    SpeechError localSpeechError = paramSpeechError;
    if (this.n.size() <= 0)
    {
      localSpeechError = paramSpeechError;
      if (paramSpeechError == null)
      {
        localSpeechError = paramSpeechError;
        if (v().a("asr_nomatch_error", true)) {
          localSpeechError = new SpeechError(10118);
        }
      }
    }
    if (localSpeechError != null)
    {
      this.o.a("app_ret", localSpeechError.getErrorCode(), false);
      x localx = this.o;
      if (!this.e) {
        break label225;
      }
      paramSpeechError = "1";
      label121:
      localx.a("rec_ustop", paramSpeechError, false);
      this.h.a("sessinfo", this.o.a());
      Y.a("SessionEndBegin", null);
      if (!this.s) {
        break label232;
      }
      this.h.a("user abort");
      label172:
      Y.a("SessionEndEnd", null);
      super.a(localSpeechError);
      if (this.a != null)
      {
        if (!this.s) {
          break label282;
        }
        X.a("RecognizerListener#onCancel");
      }
    }
    for (;;)
    {
      this.a = null;
      return;
      this.o.a("app_ret", 0L, false);
      break;
      label225:
      paramSpeechError = "0";
      break label121;
      label232:
      if (localSpeechError != null)
      {
        this.h.a("error" + localSpeechError.getErrorCode());
        break label172;
      }
      this.h.a("success");
      break label172;
      label282:
      X.a("RecognizerListener#onEnd");
      if (localSpeechError != null)
      {
        paramSpeechError = new Bundle();
        paramSpeechError.putString("session_id", f());
        this.a.onEvent(20001, 0, 0, paramSpeechError);
        this.a.onError(localSpeechError);
      }
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((this.a != null) && (t()))
    {
      this.a.onVolumeChanged(paramInt, paramArrayOfByte);
      if (this.w)
      {
        Bundle localBundle = new Bundle();
        localBundle.putByteArray("data", paramArrayOfByte);
        this.a.onEvent(21003, paramInt, 0, localBundle);
      }
    }
  }
  
  protected void a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (!this.c)
    {
      this.c = true;
      this.o.a("app_fau");
      if (this.a != null) {
        this.a.onEvent(22002, 0, 0, null);
      }
    }
    this.h.a(paramArrayOfByte, paramArrayOfByte.length);
    if (paramBoolean)
    {
      int i1 = this.h.b();
      X.a("QISRAudioWrite volume:" + i1);
      a(paramArrayOfByte, i1);
    }
  }
  
  public boolean a(boolean paramBoolean)
  {
    try
    {
      X.a("stopRecognize, current status is :" + u() + " usercancel : " + paramBoolean);
      this.o.a("app_stop");
      y();
      this.e = paramBoolean;
      a(3);
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void a_()
  {
    this.o.a(v());
    super.a_();
  }
  
  public ConcurrentLinkedQueue<byte[]> b()
  {
    return this.m;
  }
  
  protected void b(Message paramMessage)
  {
    paramMessage = (byte[])paramMessage.obj;
    if ((paramMessage == null) || (paramMessage.length == 0)) {
      return;
    }
    this.m.add(paramMessage);
    a(paramMessage, true);
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (t()) && (this.a != null)) {
      this.a.onError(new SpeechError(20017));
    }
    y();
    if (u() == v.b.c) {
      this.e = true;
    }
    super.b(paramBoolean);
  }
  
  protected void c()
  {
    this.l = v().e("cloud_grammar");
    this.f = v().a("audio_source", 1);
    this.g = ac.a(v().e("domain"));
    this.v = (v().a("filter_audio_time", 0) * (v().a("sample_rate", this.q) / 1000 * 16 / 8));
    this.p = v().a("speech_timeout", this.p);
    this.w = v().a("notify_record_data", false);
    X.a("mSpeechTimeOut=" + this.p);
    super.c();
  }
  
  void c(Message paramMessage)
  {
    int i1 = paramMessage.arg1;
    paramMessage = (byte[])paramMessage.obj;
    switch (i1)
    {
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    default: 
      return;
    case 0: 
      if (!this.d)
      {
        this.d = true;
        this.o.a("app_frs");
      }
      a(false, paramMessage);
      return;
    }
    if (!this.d)
    {
      this.d = true;
      this.o.a("app_frs");
    }
    this.o.a("app_lrs");
    a(true, paramMessage);
  }
  
  public String e()
  {
    return this.h.g();
  }
  
  void errCb(char[] paramArrayOfChar, int paramInt, byte[] paramArrayOfByte)
  {
    onError(new SpeechError(paramInt));
  }
  
  public String f()
  {
    return this.h.c();
  }
  
  protected String g()
  {
    String str1;
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty(this.l)) {
          str1 = "iat";
        }
      }
      catch (Exception localException1)
      {
        aa localaa;
        String str2;
        str1 = null;
      }
      try
      {
        localaa = v();
        str2 = str1;
        if (localaa != null) {
          if (!localaa.a("sch", false))
          {
            str2 = str1;
            if (!localaa.a("asr_sch", false)) {}
          }
          else
          {
            str2 = "iat_sch";
          }
        }
        return str2;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      str1 = "asr";
    }
    X.b("DC get sub type exception:");
    X.a(localException1);
    return str1;
  }
  
  protected void h()
  {
    X.a("start connecting");
    String str = v().e("engine_type");
    int i1;
    if (v().a("net_check", true))
    {
      if ("cloud".equals(str)) {
        Q.b(this.r);
      }
    }
    else
    {
      i1 = v().a("record_read_rate", 40);
      if ((this.f != -1) && (t()))
      {
        X.a("start  record");
        if (this.f != -2) {
          break label247;
        }
        str = v().e("asr_source_path");
        this.i = new a(s(), i1, this.f, str);
      }
    }
    label247:
    do
    {
      this.o.a("rec_open");
      this.i.startRecording(this);
      a(9, v.a.b, false, this.p);
      if ((this.a != null) && (this.f > -1)) {
        this.a.onBeginOfSpeech();
      }
      this.o.a("app_ssb");
      a(1, v.a.a, false, 0);
      return;
      if ((!"mix".equals(str)) && (!"mixed".equals(str))) {
        break;
      }
      try
      {
        Q.b(this.r);
      }
      catch (Exception localException)
      {
        v().a("engine_type", "local");
      }
      break;
      this.i = new PcmRecorder(s(), i1, this.f);
    } while (!hasMessages(3));
    throw new SpeechError(10118);
  }
  
  protected void i()
  {
    Y.a("SDKSessionBegin", null);
    int i1 = this.h.a(this.r, this.l, this);
    if ((i1 == 0) && (this.h.a != null)) {
      if (t())
      {
        MSC.QISRRegisterNotify(this.h.a, "rsltCb", "stusCb", "errCb", this);
        a(v.b.c);
        if (v().a("asr_net_perf", false)) {
          a(7, v.a.a, false, 0);
        }
      }
    }
    do
    {
      return;
      this.x += 1;
      if (this.x > 40) {
        throw new SpeechError(i1);
      }
    } while (!t());
    Thread.sleep(15L);
    a(1, v.a.a, false, 0);
  }
  
  protected void j()
  {
    X.a("recording stop");
    y();
    this.o.a("app_lau");
    this.h.a();
    o();
  }
  
  public void k()
  {
    if (t())
    {
      int i1 = this.h.b("netperf");
      if (this.a != null) {
        this.a.onEvent(10001, i1, 0, null);
      }
      a(7, v.a.b, false, 100);
    }
  }
  
  public void l()
  {
    if (v.b.c == u())
    {
      if (this.a != null) {
        this.a.onEndOfSpeech();
      }
      a(false);
    }
  }
  
  public boolean m()
  {
    return this.g;
  }
  
  public x n()
  {
    return this.o;
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    b(paramSpeechError);
  }
  
  public void onRecordBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 <= 0) || (paramArrayOfByte.length < paramInt2)) {}
    while ((paramInt2 <= 0) || (!t())) {
      return;
    }
    if (!this.b)
    {
      this.b = true;
      this.o.a("rec_start");
    }
    if (this.v > 0)
    {
      if (this.v >= paramInt2)
      {
        this.v -= paramInt2;
        return;
      }
      arrayOfByte = new byte[paramInt2 - this.v];
      System.arraycopy(paramArrayOfByte, this.v + paramInt1, arrayOfByte, 0, paramInt2 - this.v);
      d(obtainMessage(2, arrayOfByte));
      this.v = 0;
      return;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    d(obtainMessage(2, arrayOfByte));
  }
  
  public void onRecordReleased()
  {
    if ((this.i != null) && ((this.i instanceof a))) {
      a(true);
    }
  }
  
  public void onRecordStarted(boolean paramBoolean)
  {
    this.o.a("rec_ready");
  }
  
  void rsltCb(char[] paramArrayOfChar, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null) {
      X.a("MscRecognizer", "rsltCb:" + paramInt2 + "result:" + new String(paramArrayOfByte));
    }
    for (;;)
    {
      paramArrayOfChar = obtainMessage(4, paramInt2, 0, paramArrayOfByte);
      if (!hasMessages(4)) {
        break;
      }
      a(paramArrayOfChar, v.a.b, false, 0);
      return;
      X.a("MscRecognizer", "rsltCb:" + paramInt2 + "result:null");
    }
    a(paramArrayOfChar, v.a.a, false, 0);
  }
  
  void stusCb(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    if ((paramInt1 == 0) && (paramInt2 == 3))
    {
      X.a("MscRecognizer", "stusCb:" + paramInt2 + ",type:" + paramInt1);
      l();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */