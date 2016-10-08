package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.WakeuperListener;
import com.iflytek.cloud.util.FileDownloadListener;
import com.iflytek.cloud.util.ResourceUtil;
import com.iflytek.cloud.util.ResourceUtil.RESOURCE_TYPE;
import org.json.JSONObject;

public class am
  extends z
{
  private static String l = "respath";
  private boolean f = false;
  private String g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  private boolean k = false;
  private s m = null;
  private H n = null;
  
  public am(Context paramContext)
  {
    super(paramContext);
  }
  
  private void a(boolean paramBoolean)
  {
    X.a("restart wake ,isError:" + paramBoolean);
    localObject1 = this.c;
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        this.i = null;
        this.n.a("ivw_config_path");
        this.n.a("cfg_threshold");
        b(((r)this.d).j());
        return;
      }
      finally {}
      if (this.d.t())
      {
        this.i = ResourceUtil.generateResourcePath(this.a, ResourceUtil.RESOURCE_TYPE.path, this.n.b("ivw_config_path", null));
        this.j = this.n.b("cfg_threshold", null);
        b(((r)this.d).j());
      }
    }
  }
  
  private int b(WakeuperListener paramWakeuperListener)
  {
    synchronized (this.c)
    {
      try
      {
        if (TextUtils.isEmpty(this.i)) {
          break label156;
        }
        this.b.a("ivw_res_path", this.i);
        this.b.a("ivw_threshold", this.j);
        b(false);
        this.f = this.b.a("request_audio_focus", false);
        if ((this.d != null) && (this.d.t())) {
          ((r)this.d).b(false);
        }
        this.d = new r(this.a, this.b, a("wakeuper"));
        N.a(this.a, Boolean.valueOf(this.f), null);
        ((r)this.d).a(new am.b(this, paramWakeuperListener));
        i1 = 0;
      }
      catch (SpeechError paramWakeuperListener)
      {
        for (;;)
        {
          i1 = paramWakeuperListener.getErrorCode();
          X.a(paramWakeuperListener);
        }
      }
      catch (Throwable paramWakeuperListener)
      {
        for (;;)
        {
          label156:
          X.a(paramWakeuperListener);
          int i1 = 20999;
        }
      }
      return i1;
      this.b.a("ivw_res_path", this.g);
      this.b.a("ivw_threshold", this.h);
      b(true);
    }
  }
  
  private void b(boolean paramBoolean)
  {
    try
    {
      this.k = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean g()
  {
    try
    {
      boolean bool = this.k;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int a(WakeuperListener paramWakeuperListener)
  {
    synchronized (this.c)
    {
      this.g = this.b.d("ivw_res_path");
      this.h = this.b.d("ivw_threshold");
      if (TextUtils.isEmpty(this.g)) {
        return 25107;
      }
      int i1 = this.b.a("ivw_net_mode", 0);
      if ((2 == i1) || ((4 == i1) && (Q.a(this.a)))) {
        a(this.g, false, null);
      }
      i1 = b(paramWakeuperListener);
      return i1;
    }
  }
  
  public int a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, FileDownloadListener paramFileDownloadListener)
  {
    synchronized (this.c)
    {
      if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3))) {
        return 20012;
      }
      Y.a("CreateDownload", null);
      if (this.m != null)
      {
        this.m.a();
        this.m = null;
      }
      this.m = new s(this.a);
      int i1 = this.m.a(paramString1, paramString2, paramString3, new am.a(this, paramBoolean, paramFileDownloadListener));
      return i1;
    }
  }
  
  public int a(String paramString, boolean paramBoolean, RequestListener paramRequestListener)
  {
    Object localObject1 = null;
    synchronized (this.c)
    {
      if (TextUtils.isEmpty(paramString)) {
        return 25107;
      }
      if (!paramBoolean) {
        localObject1 = ResourceUtil.generateResourcePath(this.a, ResourceUtil.RESOURCE_TYPE.path, this.n.b("ivw_config_path", null));
      }
      if (this.m != null)
      {
        this.m.a();
        this.m = null;
      }
      this.m = new s(this.a);
      localObject1 = this.m.a(paramString, (String)localObject1);
      if (localObject1 == null)
      {
        X.b("ivw invalid resource");
        return 25107;
      }
    }
    String str = (String)((JSONObject)localObject1).remove(l);
    if ((!TextUtils.isEmpty(str)) && (!str.equals(paramString)))
    {
      this.i = str;
      this.j = this.n.b("cfg_threshold", null);
    }
    for (;;)
    {
      Y.a("SendRequest", null);
      int i1 = this.m.a((JSONObject)localObject1, new am.c(this, paramBoolean, paramRequestListener));
      return i1;
      this.i = null;
      this.n.a("ivw_config_path");
      this.n.a("cfg_threshold");
    }
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    synchronized (this.c)
    {
      if (this.d == null)
      {
        X.a("writeAudio error, no active session.");
        return 21004;
      }
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        X.a("writeAudio error,buffer is null.");
        return 10109;
      }
    }
    if (paramArrayOfByte.length < paramInt2 + paramInt1)
    {
      X.a("writeAudio error,buffer length < length.");
      return 10109;
    }
    if (((r)this.d).a() != -1) {
      return 10106;
    }
    ((r)this.d).onRecordBuffer(paramArrayOfByte, paramInt1, paramInt2);
    return 0;
  }
  
  public void cancel(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.m != null)
      {
        this.m.a();
        this.m = null;
      }
      N.b(this.a, Boolean.valueOf(this.f), null);
      super.cancel(paramBoolean);
      return;
    }
  }
  
  public boolean destroy()
  {
    synchronized (this.c)
    {
      if (this.m != null)
      {
        this.m.a();
        this.m = null;
      }
      boolean bool = super.destroy();
      return bool;
    }
  }
  
  public void e()
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((r)this.d).a(true);
      }
      return;
    }
  }
  
  public boolean f()
  {
    synchronized (this.c)
    {
      boolean bool = d();
      return bool;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */