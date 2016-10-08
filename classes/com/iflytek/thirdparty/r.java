package com.iflytek.thirdparty;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.WakeuperListener;
import com.iflytek.cloud.record.PcmRecorder;
import com.iflytek.cloud.record.PcmRecorder.PcmRecordListener;
import com.iflytek.msc.MSC;
import java.util.ArrayList;

public class r
  extends v
  implements PcmRecorder.PcmRecordListener
{
  public String a;
  protected volatile WakeuperListener b = null;
  protected boolean c = false;
  protected int d = 1;
  protected q e = new q();
  protected PcmRecorder f = null;
  protected ArrayList<String> g = null;
  public boolean h = false;
  public boolean i = false;
  private int j = 0;
  
  public r(Context paramContext, aa paramaa, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramHandlerThread);
    a(paramaa);
    this.g = new ArrayList();
  }
  
  /* Error */
  private void a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iload_3
    //   4: iconst_1
    //   5: if_icmpne +199 -> 204
    //   8: aload_2
    //   9: ifnull +126 -> 135
    //   12: aload_2
    //   13: arraylength
    //   14: ifle +121 -> 135
    //   17: new 64	java/lang/String
    //   20: dup
    //   21: aload_2
    //   22: aload_0
    //   23: invokevirtual 68	com/iflytek/thirdparty/r:r	()Ljava/lang/String;
    //   26: invokespecial 71	java/lang/String:<init>	([BLjava/lang/String;)V
    //   29: astore_2
    //   30: aload_0
    //   31: getfield 46	com/iflytek/thirdparty/r:g	Ljava/util/ArrayList;
    //   34: aload_2
    //   35: invokevirtual 75	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   38: pop
    //   39: aload_0
    //   40: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   43: ifnull +58 -> 101
    //   46: aload_0
    //   47: invokevirtual 79	com/iflytek/thirdparty/r:t	()Z
    //   50: ifeq +51 -> 101
    //   53: new 81	android/os/Bundle
    //   56: dup
    //   57: invokespecial 82	android/os/Bundle:<init>	()V
    //   60: astore 4
    //   62: aload 4
    //   64: ldc 84
    //   66: new 86	com/iflytek/cloud/RecognizerResult
    //   69: dup
    //   70: aload_2
    //   71: invokespecial 89	com/iflytek/cloud/RecognizerResult:<init>	(Ljava/lang/String;)V
    //   74: invokevirtual 93	android/os/Bundle:putParcelable	(Ljava/lang/String;Landroid/os/Parcelable;)V
    //   77: aload_0
    //   78: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   81: astore_2
    //   82: iload_1
    //   83: ifeq +116 -> 199
    //   86: iconst_1
    //   87: istore_3
    //   88: aload_2
    //   89: sipush 22001
    //   92: iload_3
    //   93: iconst_0
    //   94: aload 4
    //   96: invokeinterface 99 5 0
    //   101: new 101	java/lang/StringBuilder
    //   104: dup
    //   105: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   108: ldc 104
    //   110: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokestatic 114	java/lang/System:currentTimeMillis	()J
    //   116: invokevirtual 117	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   119: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokestatic 124	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   125: iload_1
    //   126: ifeq +8 -> 134
    //   129: aload_0
    //   130: aconst_null
    //   131: invokevirtual 127	com/iflytek/thirdparty/r:b	(Lcom/iflytek/cloud/SpeechError;)V
    //   134: return
    //   135: aload_0
    //   136: getfield 46	com/iflytek/thirdparty/r:g	Ljava/util/ArrayList;
    //   139: invokevirtual 131	java/util/ArrayList:size	()I
    //   142: ifgt +51 -> 193
    //   145: aload_0
    //   146: invokevirtual 135	com/iflytek/thirdparty/r:v	()Lcom/iflytek/thirdparty/aa;
    //   149: ldc -119
    //   151: invokevirtual 142	com/iflytek/thirdparty/aa:e	(Ljava/lang/String;)Ljava/lang/String;
    //   154: astore_2
    //   155: aload_2
    //   156: invokestatic 148	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   159: ifne +23 -> 182
    //   162: ldc -106
    //   164: aload_2
    //   165: invokevirtual 153	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifne +14 -> 182
    //   171: new 155	com/iflytek/cloud/SpeechError
    //   174: dup
    //   175: sipush 20005
    //   178: invokespecial 158	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   181: athrow
    //   182: new 155	com/iflytek/cloud/SpeechError
    //   185: dup
    //   186: sipush 10118
    //   189: invokespecial 158	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   192: athrow
    //   193: ldc -96
    //   195: astore_2
    //   196: goto -166 -> 30
    //   199: iconst_0
    //   200: istore_3
    //   201: goto -113 -> 88
    //   204: iload_3
    //   205: ifne +76 -> 281
    //   208: aload_2
    //   209: ifnull +61 -> 270
    //   212: aload_2
    //   213: arraylength
    //   214: ifle +56 -> 270
    //   217: new 64	java/lang/String
    //   220: dup
    //   221: aload_2
    //   222: ldc -94
    //   224: invokespecial 71	java/lang/String:<init>	([BLjava/lang/String;)V
    //   227: astore_2
    //   228: aload_0
    //   229: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   232: ifnull -107 -> 125
    //   235: aload_0
    //   236: invokevirtual 79	com/iflytek/thirdparty/r:t	()Z
    //   239: ifeq -114 -> 125
    //   242: new 164	com/iflytek/cloud/WakeuperResult
    //   245: dup
    //   246: aload_2
    //   247: invokespecial 165	com/iflytek/cloud/WakeuperResult:<init>	(Ljava/lang/String;)V
    //   250: astore_2
    //   251: ldc -89
    //   253: aconst_null
    //   254: invokestatic 172	com/iflytek/thirdparty/Y:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   257: aload_0
    //   258: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   261: aload_2
    //   262: invokeinterface 176 2 0
    //   267: goto -142 -> 125
    //   270: new 155	com/iflytek/cloud/SpeechError
    //   273: dup
    //   274: sipush 10118
    //   277: invokespecial 158	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   280: athrow
    //   281: iload_3
    //   282: iconst_2
    //   283: if_icmpne -158 -> 125
    //   286: aload_2
    //   287: ifnull +142 -> 429
    //   290: aload_2
    //   291: arraylength
    //   292: ifle +137 -> 429
    //   295: new 64	java/lang/String
    //   298: dup
    //   299: aload_2
    //   300: ldc -94
    //   302: invokespecial 71	java/lang/String:<init>	([BLjava/lang/String;)V
    //   305: astore_2
    //   306: iload 5
    //   308: istore_3
    //   309: aload_0
    //   310: getfield 178	com/iflytek/thirdparty/r:a	Ljava/lang/String;
    //   313: ldc -76
    //   315: invokevirtual 153	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   318: ifeq +66 -> 384
    //   321: aload_0
    //   322: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   325: ifnull +24 -> 349
    //   328: new 164	com/iflytek/cloud/WakeuperResult
    //   331: dup
    //   332: aload_2
    //   333: invokespecial 165	com/iflytek/cloud/WakeuperResult:<init>	(Ljava/lang/String;)V
    //   336: astore 4
    //   338: aload_0
    //   339: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   342: aload 4
    //   344: invokeinterface 176 2 0
    //   349: new 182	org/json/JSONObject
    //   352: dup
    //   353: aload_2
    //   354: invokespecial 183	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   357: astore 4
    //   359: aload 4
    //   361: ldc -71
    //   363: invokevirtual 189	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   366: aload 4
    //   368: ldc -65
    //   370: invokevirtual 189	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   373: if_icmpeq +67 -> 440
    //   376: aload_0
    //   377: iconst_0
    //   378: invokevirtual 193	com/iflytek/thirdparty/r:a	(I)V
    //   381: iload 5
    //   383: istore_3
    //   384: aload_0
    //   385: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   388: ifnull -263 -> 125
    //   391: aload_0
    //   392: invokevirtual 79	com/iflytek/thirdparty/r:t	()Z
    //   395: ifeq -270 -> 125
    //   398: new 164	com/iflytek/cloud/WakeuperResult
    //   401: dup
    //   402: aload_2
    //   403: invokespecial 165	com/iflytek/cloud/WakeuperResult:<init>	(Ljava/lang/String;)V
    //   406: astore_2
    //   407: aload_0
    //   408: getfield 31	com/iflytek/thirdparty/r:b	Lcom/iflytek/cloud/WakeuperListener;
    //   411: aload_2
    //   412: invokeinterface 176 2 0
    //   417: iload_3
    //   418: ifeq -293 -> 125
    //   421: aload_0
    //   422: aconst_null
    //   423: invokevirtual 127	com/iflytek/thirdparty/r:b	(Lcom/iflytek/cloud/SpeechError;)V
    //   426: goto -301 -> 125
    //   429: new 155	com/iflytek/cloud/SpeechError
    //   432: dup
    //   433: sipush 10118
    //   436: invokespecial 158	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   439: athrow
    //   440: iconst_1
    //   441: istore_3
    //   442: goto -58 -> 384
    //   445: astore_2
    //   446: new 155	com/iflytek/cloud/SpeechError
    //   449: dup
    //   450: sipush 10118
    //   453: invokespecial 158	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   456: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	457	0	this	r
    //   0	457	1	paramBoolean	boolean
    //   0	457	2	paramArrayOfByte	byte[]
    //   0	457	3	paramInt	int
    //   60	307	4	localObject	Object
    //   1	381	5	k	int
    // Exception table:
    //   from	to	target	type
    //   349	381	445	java/lang/Exception
  }
  
  private void k()
  {
    X.a("recording stop");
    if (!this.a.equals("enroll")) {
      l();
    }
    this.e.a();
  }
  
  private void l()
  {
    if (this.f != null)
    {
      this.f.stopRecord(v().a("record_force_stop", false));
      this.f = null;
    }
  }
  
  int MsgProcCallBack(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      X.a("MscWakeuper", "msg:" + paramInt1 + "param1:" + paramInt2 + "param2:" + paramInt3 + "result:" + new String(paramArrayOfByte));
    }
    switch (paramInt1)
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      for (;;)
      {
        return 0;
        X.a("MscWakeuper", "msg:" + paramInt1 + "param1:" + paramInt2 + "param2:" + paramInt3 + "result:null");
        break;
        this.h = true;
        if ((this.i) || (this.a.equals("oneshot"))) {}
        for (paramArrayOfChar = obtainMessage(4, 0, 0, paramArrayOfByte); hasMessages(4); paramArrayOfChar = obtainMessage(4, 5, 0, paramArrayOfByte))
        {
          a(paramArrayOfChar, v.a.b, false, 0);
          return 0;
        }
        a(paramArrayOfChar, v.a.a, false, 0);
        return 0;
        onError(new SpeechError(paramInt2));
        return 0;
        paramArrayOfChar = obtainMessage(4, paramInt2, 1, paramArrayOfByte);
        if (hasMessages(4))
        {
          a(paramArrayOfChar, v.a.b, false, 0);
          return 0;
        }
        a(paramArrayOfChar, v.a.a, false, 0);
        return 0;
        if (paramInt2 == 3)
        {
          i();
          return 0;
          try
          {
            if (this.b != null)
            {
              this.b.onVolumeChanged(paramInt2);
              return 0;
            }
          }
          catch (Exception paramArrayOfChar)
          {
            return 0;
          }
        }
      }
    }
    a(obtainMessage(4, 0, 2, paramArrayOfByte), v.a.a, false, 0);
    return 0;
  }
  
  public int a()
  {
    return this.d;
  }
  
  protected void a(Message paramMessage)
  {
    super.a(paramMessage);
    switch (paramMessage.what)
    {
    case 5: 
    case 6: 
    case 7: 
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
      k();
      return;
    }
    c(paramMessage);
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    X.a("onSessionEnd");
    l();
    SpeechError localSpeechError = paramSpeechError;
    if (this.a.equals("oneshot"))
    {
      localSpeechError = paramSpeechError;
      if (this.h)
      {
        localSpeechError = paramSpeechError;
        if (this.g.size() <= 0)
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
      }
    }
    Y.a("SessionEndBegin", null);
    if (this.s)
    {
      this.e.a("user abort");
      Y.a("SessionEndEnd", null);
      super.a(localSpeechError);
      if (this.b != null)
      {
        if (!this.s) {
          break label190;
        }
        X.a("WakeuperListener#onCancel");
      }
    }
    for (;;)
    {
      this.b = null;
      return;
      if (localSpeechError != null)
      {
        this.e.a("error" + localSpeechError.getErrorCode());
        break;
      }
      this.e.a("success");
      break;
      label190:
      X.a("WakeuperListener#onEnd");
      if (localSpeechError != null) {
        this.b.onError(localSpeechError);
      }
    }
  }
  
  public void a(WakeuperListener paramWakeuperListener)
  {
    try
    {
      this.b = paramWakeuperListener;
      X.a("startListening called");
      a_();
      return;
    }
    finally
    {
      paramWakeuperListener = finally;
      throw paramWakeuperListener;
    }
  }
  
  protected void a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.e.a(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public boolean a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        X.a("stopListening, current status is :" + u() + " usercancel : " + paramBoolean);
        if (this.a.equals("enroll"))
        {
          this.c = paramBoolean;
          a(3);
          return true;
        }
        if ((this.a.equals("oneshot")) && (this.h))
        {
          l();
          this.c = paramBoolean;
          a(3);
        }
        else
        {
          b(false);
        }
      }
      finally {}
    }
  }
  
  protected void b()
  {
    X.a("start connecting");
    this.h = false;
    int k = v().a("record_read_rate", 40);
    if ((this.d != -1) && (t()))
    {
      X.a("start  record");
      if (this.f == null)
      {
        this.f = new PcmRecorder(s(), k, this.d);
        this.f.startRecording(this);
      }
    }
    if ((u() != v.b.e) && (this.b != null)) {
      this.b.onBeginOfSpeech();
    }
    a(1, v.a.a, false, 0);
  }
  
  protected void b(Message paramMessage)
  {
    paramMessage = (byte[])paramMessage.obj;
    if ((paramMessage == null) || (paramMessage.length == 0)) {
      return;
    }
    a(paramMessage, true);
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (t()) && (this.b != null)) {
      this.b.onError(new SpeechError(20017));
    }
    X.a("cancel");
    l();
    if (u() == v.b.c) {
      this.c = true;
    }
    super.b(paramBoolean);
  }
  
  protected void c()
  {
    this.a = v().b("sst", "wakeup");
    this.i = v().a("keep_alive", false);
    this.d = v().a("audio_source", 1);
    int k = H.a(this.r).b("ivw_netval", 20);
    v().a("ivw_netval", k + "");
    super.c();
  }
  
  void c(Message paramMessage)
  {
    int k = paramMessage.arg1;
    byte[] arrayOfByte = (byte[])paramMessage.obj;
    switch (k)
    {
    case 1: 
    case 3: 
    case 4: 
    default: 
      return;
    case 0: 
      a(false, arrayOfByte, paramMessage.arg2);
      return;
    case 2: 
      throw new SpeechError(20010);
    }
    a(true, arrayOfByte, paramMessage.arg2);
  }
  
  public String e()
  {
    return this.e.g();
  }
  
  public String f()
  {
    return null;
  }
  
  protected String g()
  {
    return "ivw";
  }
  
  protected void h()
  {
    int k;
    if (this.e.a == null)
    {
      Y.a("SDKSessionBegin", null);
      k = this.e.a(this.r, this.a, this);
      if ((k != 0) || (this.e.a == null)) {
        break label78;
      }
      if (t())
      {
        MSC.QIVWRegisterNotify(this.e.a, "MsgProcCallBack", this);
        a(v.b.c);
      }
    }
    label78:
    do
    {
      return;
      this.j += 1;
      if (this.j > 40) {
        throw new SpeechError(k);
      }
    } while (!t());
    Thread.sleep(15L);
    a(1, v.a.a, false, 0);
  }
  
  public void i()
  {
    if (v.b.c == u()) {
      a(false);
    }
  }
  
  public WakeuperListener j()
  {
    return this.b;
  }
  
  public boolean m()
  {
    return false;
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    b(paramSpeechError);
  }
  
  public void onRecordBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte.length < paramInt2) || (paramArrayOfByte == null) || (paramInt2 <= 0)) {}
    while ((paramInt2 <= 0) || (!t())) {
      return;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    d(obtainMessage(2, arrayOfByte));
  }
  
  public void onRecordReleased() {}
  
  public void onRecordStarted(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */