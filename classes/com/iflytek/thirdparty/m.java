package com.iflytek.thirdparty;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.record.PcmRecorder;
import com.iflytek.cloud.record.a;
import com.iflytek.cloud.util.AudioDetector;
import com.iflytek.cloud.util.AudioDetector.DetectorResult;

public class m
  extends l
{
  private AudioDetector v = null;
  private byte[] w = null;
  
  public m(Context paramContext, aa paramaa, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramaa, paramHandlerThread);
    if (paramaa != null) {
      i = paramaa.a("sample_rate", 16000);
    }
    int j = i * 300 * 2 / 1000;
    X.a("MscRecognizerMeta last buffer len: " + j);
    this.w = new byte[j];
    this.v = AudioDetector.getDetector();
    if (this.v == null)
    {
      paramHandlerThread = new StringBuffer();
      paramHandlerThread.append("sample_rate").append("=").append(i);
      String str = paramaa.b("vad_engine", "meta");
      paramHandlerThread.append(",").append("vad_engine").append("=").append(str);
      if (paramaa == null) {
        break label205;
      }
    }
    label205:
    for (paramaa = paramaa.e("vad_res_path");; paramaa = null)
    {
      if (!TextUtils.isEmpty(paramaa)) {
        paramHandlerThread.append(",").append("vad_res_path").append("=").append(paramaa);
      }
      this.v = AudioDetector.createDetector(paramContext, paramHandlerThread.toString());
      return;
    }
  }
  
  private void y()
  {
    this.o.a("app_ssb");
    a(1, v.a.a, false, 0);
    X.a("begin session");
  }
  
  byte[] a(byte[] paramArrayOfByte)
  {
    int m;
    int i;
    Object localObject;
    if (this.v != null)
    {
      int j = Math.min(32768, paramArrayOfByte.length);
      m = 0;
      i = 0;
      localObject = null;
      if (j <= 0) {
        break label299;
      }
      localObject = this.v.detect(paramArrayOfByte, i, j, false);
      if (((AudioDetector.DetectorResult)localObject).error != 0) {
        throw new SpeechError(((AudioDetector.DetectorResult)localObject).error);
      }
      int k;
      int n;
      if (3 == ((AudioDetector.DetectorResult)localObject).status)
      {
        j = Math.max(m, i - this.w.length);
        this.v.reset();
        k = j;
        n = 0;
      }
      do
      {
        i = j + n;
        j = Math.min(32768, paramArrayOfByte.length - i);
        m = k;
        break;
        n = j;
        k = m;
        j = i;
      } while (((AudioDetector.DetectorResult)localObject).status == 0);
    }
    label299:
    for (;;)
    {
      if ((localObject != null) && (3 != ((AudioDetector.DetectorResult)localObject).status) && (((AudioDetector.DetectorResult)localObject).status != 0))
      {
        i = m + i;
        localObject = new byte[paramArrayOfByte.length - i + this.w.length];
        if (this.w.length <= i)
        {
          System.arraycopy(paramArrayOfByte, i - this.w.length, localObject, 0, localObject.length);
          return (byte[])localObject;
        }
        System.arraycopy(this.w, i, localObject, 0, this.w.length - i);
        System.arraycopy(paramArrayOfByte, 0, localObject, this.w.length - i, paramArrayOfByte.length);
        return (byte[])localObject;
      }
      i = Math.min(this.w.length, paramArrayOfByte.length);
      System.arraycopy(this.w, i, this.w, 0, this.w.length - i);
      System.arraycopy(paramArrayOfByte, paramArrayOfByte.length - i, this.w, this.w.length - i, i);
      return null;
      throw new SpeechError(22001);
    }
  }
  
  protected void b(Message paramMessage)
  {
    byte[] arrayOfByte = (byte[])paramMessage.obj;
    if ((arrayOfByte != null) && (arrayOfByte.length > 0))
    {
      if (this.v == null) {
        break label74;
      }
      paramMessage = a(arrayOfByte);
      if (paramMessage != null)
      {
        this.v.reset();
        this.v = null;
        a(obtainMessage(2, paramMessage), v.a.a, false, 0);
        X.a("detectAudioData find start and begin session");
        y();
      }
    }
    return;
    label74:
    super.b(paramMessage);
  }
  
  protected void h()
  {
    X.a("start connecting");
    String str = v().e("engine_type");
    int i;
    if (v().a("net_check", true))
    {
      if ("cloud".equals(str)) {
        Q.b(this.r);
      }
    }
    else
    {
      i = v().a("record_read_rate", 40);
      if ((this.f != -1) && (t()))
      {
        X.a("start  record");
        if (this.f != -2) {
          break label234;
        }
        str = v().e("asr_source_path");
        this.i = new a(s(), i, this.f, str);
      }
    }
    label234:
    do
    {
      this.o.a("rec_open");
      this.i.startRecording(this);
      a(9, v.a.b, false, this.p);
      if ((this.a != null) && (this.f > -1)) {
        this.a.onBeginOfSpeech();
      }
      if (this.v != null) {
        break label273;
      }
      throw new SpeechError(21003);
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
      this.i = new PcmRecorder(s(), i, this.f);
    } while (!hasMessages(3));
    throw new SpeechError(10118);
    label273:
    this.v.reset();
  }
  
  protected void j()
  {
    if (this.v != null)
    {
      this.v = null;
      y();
      a(3);
      return;
    }
    super.j();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */