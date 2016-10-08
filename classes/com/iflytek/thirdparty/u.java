package com.iflytek.thirdparty;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.IdentityListener;
import com.iflytek.cloud.IdentityResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.msc.MSC;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class u
  extends v
{
  public static int f = 0;
  public static int g = 0;
  private static final String k = u.class.getSimpleName();
  protected volatile IdentityListener a = null;
  protected boolean b = false;
  protected boolean c = false;
  protected boolean d = false;
  protected t e = new t();
  protected String h = null;
  protected x i = new x();
  long j = 0L;
  private boolean l = true;
  private I m = new I();
  private HashMap<String, aa> n = null;
  private HashMap<String, StringBuffer> o = null;
  private HashMap<String, Boolean> v = new HashMap();
  private int w = 0;
  
  public u(Context paramContext, aa paramaa, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramHandlerThread);
    a(paramaa);
  }
  
  private void a(boolean paramBoolean, byte[] paramArrayOfByte)
  {
    this.t = SystemClock.elapsedRealtime();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramArrayOfByte = new String(paramArrayOfByte, "utf-8").replace("\"return\"", "\"ret\"");
      this.h = paramArrayOfByte;
      if ((this.a != null) && (t()))
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("session_id", f());
        this.a.onEvent(20001, 0, 0, localBundle);
        paramArrayOfByte = new IdentityResult(paramArrayOfByte);
        Y.a("GetNotifyResult", null);
        this.a.onResult(paramArrayOfByte, paramBoolean);
      }
      X.a("msc result time:" + System.currentTimeMillis());
      if (paramBoolean) {
        b(null);
      }
      return;
    }
    throw new SpeechError(10118);
  }
  
  private void e(Message paramMessage)
  {
    X.a("recording stop");
    this.i.a("app_lau");
    String str = (String)paramMessage.obj;
    this.v.put(str, Boolean.valueOf(true));
    this.e.b((String)paramMessage.obj);
    o();
  }
  
  public I a()
  {
    return this.m;
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
      b();
      return;
    case 1: 
      h();
      return;
    case 9: 
      j();
      return;
    case 2: 
      b(paramMessage);
      return;
    case 3: 
      e(paramMessage);
      return;
    case 4: 
      c(paramMessage);
      return;
    }
    i();
  }
  
  public void a(IdentityListener paramIdentityListener)
  {
    try
    {
      this.a = paramIdentityListener;
      X.a("startWorking called");
      a_();
      return;
    }
    finally
    {
      paramIdentityListener = finally;
      throw paramIdentityListener;
    }
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    X.a("onSessionEnd");
    f = this.e.c("upflow");
    g = this.e.c("downflow");
    f();
    SpeechError localSpeechError = paramSpeechError;
    if (this.h == null)
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
      this.i.a("app_ret", localSpeechError.getErrorCode(), false);
      x localx = this.i;
      if (!this.d) {
        break label224;
      }
      paramSpeechError = "1";
      label111:
      localx.a("rec_ustop", paramSpeechError, false);
      this.e.a("sessinfo", this.i.a());
      Y.a("SessionEndBegin", null);
      if (!this.s) {
        break label231;
      }
      this.e.a("user abort");
      label162:
      Y.a("SessionEndEnd", null);
      super.a(localSpeechError);
      if (this.a != null) {
        if (!this.s) {
          break label281;
        }
      }
    }
    for (;;)
    {
      this.a.onEvent(10011, 0, 0, null);
      this.a = null;
      return;
      this.i.a("app_ret", 0L, false);
      break;
      label224:
      paramSpeechError = "0";
      break label111;
      label231:
      if (localSpeechError != null)
      {
        this.e.a("error" + localSpeechError.getErrorCode());
        break label162;
      }
      this.e.a("success");
      break label162;
      label281:
      if (localSpeechError != null) {
        this.a.onError(localSpeechError);
      }
    }
  }
  
  public void a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.n.containsKey(paramString1))
    {
      aa localaa = new aa();
      localaa.a(paramString2);
      localaa.a("sst", v().e("sst"), false);
      localaa.a("mver", "2.0", false);
      localaa.a("ssub", paramString1);
      this.l = localaa.a("vad_enable", true);
      this.n.put(paramString1, localaa);
      this.o.put(paramString1, new StringBuffer(localaa.toString()));
    }
    if (t())
    {
      if (!this.b)
      {
        this.b = true;
        this.i.a("rec_start");
      }
      paramString2 = new HashMap();
      paramString2.put("ssub", paramString1);
      paramString1 = null;
      if (paramArrayOfByte != null)
      {
        paramString1 = new byte[paramInt2];
        System.arraycopy(paramArrayOfByte, paramInt1, paramString1, 0, paramInt2);
      }
      paramString2.put("data", paramString1);
      d(obtainMessage(2, paramString2));
    }
  }
  
  protected void a(StringBuffer paramStringBuffer, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramArrayOfByte == null) {}
    for (int i1 = 0;; i1 = paramArrayOfByte.length)
    {
      this.e.a(paramStringBuffer, paramArrayOfByte, i1, paramBoolean1);
      if (paramBoolean2)
      {
        i1 = this.e.a();
        X.a("QISRAudioWrite volume:" + i1);
        a(paramArrayOfByte, i1);
      }
      return;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((this.a != null) && (t())) {
      this.a.onEvent(10012, paramInt, 0, null);
    }
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    try
    {
      X.a("stopRecognize, current status is :" + u() + " usercancel : " + paramBoolean);
      this.i.a("app_stop");
      this.d = paramBoolean;
      d(obtainMessage(3, paramString));
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  protected void a_()
  {
    this.i.a(v());
    super.a_();
  }
  
  protected void b()
  {
    X.a("start connecting");
    a(1, v.a.a, false, 0);
  }
  
  protected void b(Message paramMessage)
  {
    paramMessage = (HashMap)paramMessage.obj;
    byte[] arrayOfByte = (byte[])paramMessage.get("data");
    String str = (String)paramMessage.get("ssub");
    paramMessage = (aa)this.n.get(str);
    StringBuffer localStringBuffer = (StringBuffer)this.o.get(str);
    paramMessage = paramMessage.e("mfv_data_path");
    if ((!TextUtils.isEmpty(paramMessage)) && (arrayOfByte != null)) {
      this.m.a(paramMessage, arrayOfByte);
    }
    Boolean localBoolean = (Boolean)this.v.get(str);
    paramMessage = localBoolean;
    if (localBoolean == null) {
      paramMessage = Boolean.valueOf(true);
    }
    if (("ivp".equals(str)) && (this.l)) {
      a(localStringBuffer, arrayOfByte, paramMessage.booleanValue(), true);
    }
    for (;;)
    {
      if (paramMessage.booleanValue()) {
        this.v.put(str, Boolean.valueOf(false));
      }
      return;
      a(localStringBuffer, arrayOfByte, paramMessage.booleanValue(), false);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (t()) && (this.a != null))
    {
      X.a("cancel");
      this.a.onError(new SpeechError(20017));
    }
    if (u() == v.b.c) {
      this.d = true;
    }
    super.b(paramBoolean);
  }
  
  protected void c()
  {
    this.p = v().a("speech_timeout", this.p);
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
      if (!this.c)
      {
        this.c = true;
        this.i.a("app_frs");
      }
      a(false, paramMessage);
      return;
    }
    if (!this.c)
    {
      this.c = true;
      this.i.a("app_frs");
    }
    this.i.a("app_lrs");
    a(true, paramMessage);
  }
  
  public String e()
  {
    return this.e.g();
  }
  
  void errCb(char[] paramArrayOfChar, int paramInt, byte[] paramArrayOfByte)
  {
    X.a(k, "clientSessionID:" + new String(paramArrayOfChar) + "errorcode:" + paramInt);
    paramArrayOfChar = new Bundle();
    paramArrayOfChar.putString("session_id", f());
    this.a.onEvent(20001, 0, 0, paramArrayOfChar);
    b(new SpeechError(paramInt));
  }
  
  public String f()
  {
    return this.e.b();
  }
  
  protected String g()
  {
    return "mfv";
  }
  
  protected void h()
  {
    if (v().a("net_check", true)) {
      Q.b(this.r);
    }
    Y.a("SDKSessionBegin", null);
    this.i.a("app_ssb");
    int i1 = this.e.a(this.r, null, this);
    if ((i1 == 0) && (this.e.a != null)) {
      if (t())
      {
        MSC.QMFVRegisterNotify(this.e.a, "rsltCb", "stusCb", "errCb", this);
        a(v.b.c);
        if (v().a("asr_net_perf", false)) {
          a(7, v.a.a, false, 0);
        }
      }
    }
    do
    {
      return;
      this.w += 1;
      if (this.w > 40) {
        throw new SpeechError(i1);
      }
    } while (!t());
    Thread.sleep(15L);
    a(1, v.a.a, false, 0);
  }
  
  public void i()
  {
    if (t())
    {
      int i1 = this.e.c("netperf");
      if (this.a != null) {
        this.a.onEvent(10001, i1, 0, null);
      }
      a(7, v.a.b, false, 100);
    }
  }
  
  public void j()
  {
    if (v.b.c == u())
    {
      if (this.a != null) {
        this.a.onEvent(10013, 0, 0, null);
      }
      a("ivp", false);
    }
  }
  
  public x k()
  {
    return this.i;
  }
  
  void rsltCb(char[] paramArrayOfChar, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null) {
      X.a(k, "rsltCb:" + paramInt2 + "result:" + new String(paramArrayOfByte));
    }
    for (;;)
    {
      paramArrayOfChar = obtainMessage(4, paramInt2, 0, paramArrayOfByte);
      if (!hasMessages(4)) {
        break;
      }
      a(paramArrayOfChar, v.a.b, false, 0);
      return;
      X.a(k, "rsltCb:" + paramInt2 + "result:null");
    }
    a(paramArrayOfChar, v.a.a, false, 0);
  }
  
  void stusCb(char[] paramArrayOfChar, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3)
  {
    X.a(k, "stusCb:" + paramInt2 + ",type:" + paramInt1);
    if ((paramInt1 == 0) && (3 == paramInt2)) {
      j();
    }
    if (1 == paramInt1)
    {
      paramArrayOfChar = v().b("scenes", "").split("\\|");
      if ((paramArrayOfChar == null) || (paramArrayOfChar.length >= 2)) {
        break label85;
      }
    }
    for (;;)
    {
      return;
      try
      {
        label85:
        paramArrayOfChar = new String(paramArrayOfByte, "utf-8");
        paramArrayOfByte = new JSONObject();
        paramArrayOfByte.put("sub", paramArrayOfChar);
        paramArrayOfByte.put("sret", paramInt2);
        paramArrayOfByte.put("ret", paramInt2);
        paramArrayOfByte.put("sst", ((aa)this.n.get(paramArrayOfChar)).e("sst"));
        if (this.a != null)
        {
          paramArrayOfChar = new IdentityResult(paramArrayOfByte.toString());
          this.a.onResult(paramArrayOfChar, true);
          return;
        }
      }
      catch (UnsupportedEncodingException paramArrayOfChar)
      {
        X.a(paramArrayOfChar);
        return;
      }
      catch (JSONException paramArrayOfChar)
      {
        X.a(paramArrayOfChar);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */