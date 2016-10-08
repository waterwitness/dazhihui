package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.util.AudioDetector;
import com.iflytek.cloud.util.AudioDetector.DetectorResult;
import com.iflytek.msc.VAD;
import com.iflytek.msc.VAD.VadData;
import java.util.HashMap;
import java.util.Map;

public class as
  extends AudioDetector
{
  private static final Map<String, Integer> c = new HashMap();
  private static final Map<String, Integer> d = new HashMap();
  private aa e = new aa();
  private long f = 0L;
  private AudioDetector.DetectorResult g = new AudioDetector.DetectorResult();
  private VAD.VadData h = new VAD.VadData();
  private byte[] i = new byte[32768];
  private byte[] j = new byte[32784];
  private boolean k = true;
  private int l = 2;
  private long m = -1L;
  private long n = 0L;
  
  static
  {
    c.put("vad_bos", Integer.valueOf(0));
    c.put("vad_eos", Integer.valueOf(1));
    c.put("sub_timeout", Integer.valueOf(3));
    c.put("early_start", Integer.valueOf(4));
    d.put("vad_bos", Integer.valueOf(1200));
    d.put("vad_eos", Integer.valueOf(20000));
    d.put("sub_timeout", Integer.valueOf(20000));
    d.put("early_start", Integer.valueOf(1));
  }
  
  public as(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
    X.a("AudioDetector constructor enter, context: " + paramContext + ", param: " + paramString);
    this.e.a(paramString);
    try
    {
      this.f = VAD.Initialize(this.e.a("sample_rate", 16000));
      X.a("VAD Initialize ret: " + this.f);
      this.h.wavData = this.j;
      return;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        X.b("AudioDetector constructor exception");
        X.a(paramContext);
      }
    }
  }
  
  private void a()
  {
    this.g.buffer = null;
    this.g.end = 0;
    this.g.error = 0;
    this.g.length = 0;
    this.g.offset = 0;
    this.g.quality = 0;
    this.g.start = 0;
    this.g.status = 0;
    this.g.sub = 0;
    this.g.voice = false;
    this.g.volume = 0;
    this.h.audioQuality = 0;
    this.h.endByte = 0;
    this.h.endRemainFrameNum = 0;
    this.h.firstOutByte = 0;
    this.h.inSpeech = 0;
    this.h.startByte = 0;
    this.h.startRemainFrameNum = 0;
    this.h.status = 0;
    this.h.volumeLevel = 0;
    this.h.waitPauseOrEnd = 0;
    this.h.waitStart = 0;
    this.h.wavData = this.j;
    this.h.wavDataSize = 0;
  }
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    default: 
      this.g.error = paramInt;
    }
    for (;;)
    {
      if ((this.k) && (this.g.sub != 0))
      {
        this.k = false;
        if (this.g.status == 0) {
          this.g.status = 1;
        }
      }
      if ((this.g.status == 0) && (c())) {
        this.g.status = 4;
      }
      return;
      this.g.error = 0;
      continue;
      this.g.sub = 1;
      continue;
      this.g.sub = 2;
      continue;
      this.g.sub = 3;
      continue;
      this.g.status = 2;
      continue;
      this.g.sub = 3;
      this.g.status = 2;
      continue;
      this.g.status = 3;
    }
  }
  
  private void b()
  {
    boolean bool = true;
    this.g.buffer = this.h.wavData;
    this.g.end = this.h.endByte;
    this.g.length = this.h.wavDataSize;
    this.g.offset = 0;
    this.g.quality = this.h.audioQuality;
    this.g.start = this.h.startByte;
    AudioDetector.DetectorResult localDetectorResult = this.g;
    if (1 == this.h.inSpeech) {}
    for (;;)
    {
      localDetectorResult.voice = bool;
      this.g.volume = this.h.volumeLevel;
      return;
      bool = false;
    }
  }
  
  private boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (0L < this.m)
    {
      bool1 = bool2;
      if (this.m <= this.n) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public boolean destroy()
  {
    X.a("destroy enter");
    boolean bool2 = true;
    boolean bool1;
    synchronized (b)
    {
      long l1 = this.f;
      bool1 = bool2;
      if (0L != l1) {}
      try
      {
        VAD.Uninitialize(this.f);
        X.a("VAD Uninitialize");
        this.f = 0L;
        bool1 = bool2;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          X.b("destroy exception");
          X.a(localThrowable);
          bool1 = false;
        }
      }
      a = null;
      X.a("destroy leave");
      return bool1;
    }
  }
  
  public AudioDetector.DetectorResult detect(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (b)
    {
      X.a("detect enter, buffer: " + paramArrayOfByte + ", offset: " + paramInt1 + ", length: " + paramInt2 + ", isLast: " + paramBoolean);
    }
    try
    {
      a();
      if (0L == this.f)
      {
        X.b("detect error: handle is invalid!");
        this.g.error = 21003;
      }
      for (;;)
      {
        X.a("detect leave");
        return this.g;
        if ((paramArrayOfByte != null) && (paramInt2 > 0) && (32768 >= paramInt2) && (paramInt1 >= 0) && (paramArrayOfByte.length - paramInt1 >= paramInt2)) {
          break label317;
        }
        if (!paramBoolean) {
          break;
        }
        paramInt1 = VAD.EndAudioData(this.f);
        X.a("VAD EndAudioData ret: " + paramInt1);
        a(paramInt1);
        if (this.g.error == 0)
        {
          this.g.error = VAD.GetLastSpeechPos(this.f, this.h);
          X.a("VAD GetLastSpeechPos ret: " + this.g.error);
          if (this.g.error == 0) {
            b();
          }
        }
      }
    }
    catch (UnsatisfiedLinkError paramArrayOfByte)
    {
      for (;;)
      {
        X.b("detect exception");
        X.a(paramArrayOfByte);
        a();
        this.g.error = 20021;
        continue;
        paramArrayOfByte = finally;
        throw paramArrayOfByte;
        this.g.error = 20012;
      }
    }
    catch (Throwable paramArrayOfByte)
    {
      for (;;)
      {
        X.b("detect exception");
        X.a(paramArrayOfByte);
        a();
        this.g.error = 20999;
        continue;
        label317:
        System.arraycopy(paramArrayOfByte, paramInt1, this.i, 0, paramInt2);
        X.a("buffer length: " + paramInt2);
        paramInt1 = VAD.CalcVolumLevel(this.f, this.i, paramInt2, this.h);
        X.a("VAD CalcVolumLevel ret: " + paramInt1);
        this.g.error = paramInt1;
        if (this.g.error == 0)
        {
          paramInt1 = VAD.AppendData(this.f, this.i, paramInt2);
          X.a("VAD AppendData ret: " + paramInt1);
          if (!this.k) {
            this.n += paramInt2;
          }
          a(paramInt1);
          if (this.g.error == 0)
          {
            paramInt1 = VAD.FetchData(this.f, this.h);
            X.a("VAD FetchData ret: " + paramInt1);
            a(paramInt1);
            if (this.g.error == 0)
            {
              if ((2 == this.g.status) || (3 == this.g.status) || (paramBoolean))
              {
                paramInt1 = VAD.EndAudioData(this.f);
                X.a("VAD EndAudioData ret: " + paramInt1);
                a(paramInt1);
                if (this.g.error == 0)
                {
                  paramInt1 = VAD.GetLastSpeechPos(this.f, this.h);
                  X.a("VAD GetLastSpeechPos ret: " + paramInt1);
                  this.g.error = paramInt1;
                }
              }
              if (this.g.error == 0) {
                b();
              }
            }
          }
        }
      }
    }
  }
  
  public void reset()
  {
    X.a("reset enter");
    synchronized (b)
    {
      long l1 = this.f;
      if (0L != l1) {}
      try
      {
        VAD.Reset(this.f);
        X.a("VAD Reset");
        this.k = true;
        this.n = 0L;
        X.a("reset leave");
        return;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          X.b("reset exception");
          X.a(localThrowable);
        }
      }
    }
  }
  
  public void setParameter(String paramString1, String paramString2)
  {
    long l1 = -1L;
    X.a("setParameter enter, key: " + paramString1 + ", value: " + paramString2);
    for (;;)
    {
      int i1;
      int i2;
      int i3;
      synchronized (b)
      {
        try
        {
          if ((TextUtils.isEmpty(paramString1)) || (!c.containsKey(paramString1))) {
            break label220;
          }
          if (TextUtils.isEmpty(paramString2)) {
            continue;
          }
          this.e.a(paramString1, paramString2);
          i1 = this.e.a(paramString1, ((Integer)d.get(paramString1)).intValue());
          i2 = ((Integer)c.get(paramString1)).intValue();
          i3 = VAD.SetParam(this.f, i2, i1);
          X.a("VAD SetParameter key=" + i2 + ", value=" + i1 + ", ret: " + i3);
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
      label220:
      boolean bool = "speech_timeout".equalsIgnoreCase(paramString1);
      if (bool) {}
      try
      {
        long l2 = Long.parseLong(paramString2);
        l1 = l2;
      }
      catch (NumberFormatException paramString1)
      {
        for (;;) {}
      }
      X.a("SetParameter speech timeout value:" + l1);
      if (0L < l1)
      {
        this.m = (l1 * (this.e.a("sample_rate", 16000) * this.l) / 1000L);
        X.a("SetParameter BytesOfSpeechTimeout: " + this.m);
      }
      else
      {
        this.m = -1L;
        continue;
        i1 = Integer.parseInt(paramString1);
        i2 = Integer.parseInt(paramString2);
        i3 = VAD.SetParam(this.f, i1, i2);
        X.a("VAD SetParameter key=" + i1 + ", value=" + i2 + ", ret: " + i3);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */