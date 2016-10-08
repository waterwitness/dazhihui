package com.unionpay.upomp.lthj.plugin.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.TextView;
import com.f.a.a.aa;
import com.f.a.a.be;
import com.f.a.a.bp;
import com.f.a.a.br;
import com.f.a.a.cc;
import com.f.a.a.dx;
import com.f.a.a.e;
import com.f.a.a.eb;
import com.f.a.a.ec;
import com.f.a.a.es;
import com.f.a.a.f;
import com.f.a.a.g;
import com.f.a.a.h;
import com.f.a.a.j;
import com.f.a.a.l;
import com.f.a.a.m;
import com.f.a.a.u;
import com.f.a.a.y;
import com.unionpay.upomp.lthj.plugin.model.HeadData;
import com.unionpay.upomp.lthj.plugin.model.JNIInitBottomData;
import java.io.File;
import java.util.Calendar;
import java.util.Timer;

public class SplashActivity
  extends Activity
  implements UIResponseListener
{
  public static Activity instance;
  Handler a = new l(this);
  public Handler b = new f(this);
  public int c;
  public Handler d = new j(this);
  private String e;
  private m f;
  private SeekBar g;
  
  private void a()
  {
    try
    {
      if (u.a().a != null)
      {
        dx localdx = new dx(8198);
        localdx.a(HeadData.createHeadData("PluginInit.Req", this));
        localdx.b(u.a().a.a());
        localdx.a(u.a().i);
        br.a().a(localdx, this, this, false, true);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void a(es parames)
  {
    u.a().t = parames.s();
    u.a().u = parames.t();
    parames = parames.t() + "，错误码为" + parames.s();
    Message localMessage = new Message();
    localMessage.obj = parames;
    this.a.sendMessage(localMessage);
  }
  
  private void a(String paramString)
  {
    u.a().u = paramString;
    Message localMessage = new Message();
    localMessage.obj = paramString;
    this.a.sendMessage(localMessage);
  }
  
  private boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      a(getString(bp.dm()));
      return false;
    }
    try
    {
      u.a().a(paramArrayOfByte);
      if (TextUtils.isEmpty(u.a().i))
      {
        a(getString(bp.dm()));
        return false;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      a(getString(bp.dt()));
      return false;
    }
    if ((u.a().i.length() < 15) || (u.a().i.length() > 24))
    {
      a(getString(bp.dp()));
      return false;
    }
    if (TextUtils.isEmpty(u.a().l))
    {
      a(getString(bp.dq()));
      return false;
    }
    if (TextUtils.isEmpty(u.a().m))
    {
      a(getString(bp.dr()));
      return false;
    }
    if (TextUtils.isEmpty(ec.c(u.a().m)))
    {
      a(getString(bp.ds()));
      return false;
    }
    return true;
  }
  
  public void errorCallBack(String paramString)
  {
    if (isFinishing()) {
      return;
    }
    a(paramString);
  }
  
  public void initBottomData(byte[] paramArrayOfByte)
  {
    int i = 1;
    if (paramArrayOfByte != null) {}
    while (paramArrayOfByte == null)
    {
      try
      {
        errorCallBack(getString(bp.du()));
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        byte[] arrayOfByte3;
        paramArrayOfByte.printStackTrace();
        return;
      }
      paramArrayOfByte = new File(this.e);
      this.f = new m(this);
      if (!paramArrayOfByte.exists())
      {
        if (u.a().f) {}
        for (paramArrayOfByte = this.f.a(bp.eu());; paramArrayOfByte = this.f.a(bp.ev()))
        {
          paramArrayOfByte = JniMethod.getJniMethod().decryptConfig(paramArrayOfByte, paramArrayOfByte.length);
          break;
        }
      }
      paramArrayOfByte = this.f.a(this.e);
      paramArrayOfByte = JniMethod.getJniMethod().decryptConfig(paramArrayOfByte, paramArrayOfByte.length);
      i = 0;
    }
    u.a().a.a(paramArrayOfByte);
    byte[] arrayOfByte2 = u.a().a.d();
    Object localObject = u.a().a.e();
    byte[] arrayOfByte1 = new byte['Ą'];
    arrayOfByte1[0] = 0;
    arrayOfByte1[1] = 4;
    arrayOfByte1[2] = 0;
    arrayOfByte1[3] = 0;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 4, arrayOfByte2.length);
    System.arraycopy(localObject, 0, arrayOfByte1, 257, localObject.length);
    localObject = u.a().a.f();
    arrayOfByte3 = u.a().a.g();
    arrayOfByte2 = new byte['Ą'];
    arrayOfByte2[0] = 0;
    arrayOfByte2[1] = 4;
    arrayOfByte2[2] = 0;
    arrayOfByte2[3] = 0;
    System.arraycopy(localObject, 0, arrayOfByte2, 4, localObject.length);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 257, arrayOfByte3.length);
    localObject = new JNIInitBottomData();
    ((JNIInitBottomData)localObject).certVersion = u.a().a.b();
    ((JNIInitBottomData)localObject).phoneIMEI = ec.a(this);
    ((JNIInitBottomData)localObject).imsi = ec.b(this);
    if (u.a().f) {
      JniMethod.getJniMethod().initResource(1, (JNIInitBottomData)localObject, arrayOfByte1, arrayOfByte2);
    }
    while (i != 0)
    {
      paramArrayOfByte = JniMethod.getJniMethod().encryptConfig(paramArrayOfByte, paramArrayOfByte.length);
      this.f.a(this.e, paramArrayOfByte);
      return;
      JniMethod.getJniMethod().initResource(0, (JNIInitBottomData)localObject, arrayOfByte1, arrayOfByte2);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    u.b = getApplicationContext();
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(bp.J());
    instance = this;
    getWindow().setSoftInputMode(18);
    paramBundle = (TextView)findViewById(bp.aA());
    int i = Calendar.getInstance().get(1);
    paramBundle.setText("©2002-" + i);
    this.g = ((SeekBar)findViewById(bp.az()));
    this.g.setEnabled(false);
    this.c = 0;
    this.g.setProgress(this.c);
    new Timer().schedule(new h(this), 0L, 100L);
    com.f.a.a.v.a = "";
    u.a().h = ec.a(this, false);
    new Thread(new g(this)).start();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return 4 == paramInt;
  }
  
  public void responseCallBack(es parames)
  {
    if (isFinishing()) {}
    while (parames == null) {
      return;
    }
    int i = Integer.parseInt(parames.s());
    switch (parames.j())
    {
    default: 
      return;
    case 8198: 
      localObject1 = (dx)parames;
      if (i == 0)
      {
        if (!((dx)localObject1).d())
        {
          parames = ec.a(((dx)localObject1).b().getBytes());
          localObject2 = ec.b((new String(parames) + ec.a(this)).getBytes());
          localObject1 = ec.a(((dx)localObject1).c().getBytes());
          if ((localObject1 == null) || (localObject1.length != 16))
          {
            errorCallBack(getString(bp.dv()));
            return;
          }
          i = 0;
          while (i < 16)
          {
            if (localObject2[i] != localObject1[i])
            {
              errorCallBack(getString(bp.dw()));
              return;
            }
            i += 1;
          }
          localObject1 = new be(this);
          ((be)localObject1).a(parames);
          ((be)localObject1).start();
          return;
        }
        String str = ((dx)localObject1).q();
        localObject1 = "";
        Object localObject2 = new eb(this);
        cc localcc = ((eb)localObject2).a(1);
        parames = (es)localObject1;
        if (localcc != null)
        {
          parames = (es)localObject1;
          if (localcc.b() != null)
          {
            parames = localcc.b();
            localObject1 = parames.getBytes();
            localObject1 = JniMethod.getJniMethod().decryptConfig((byte[])localObject1, localObject1.length);
            if (localObject1 != null) {
              parames = new String((byte[])localObject1);
            }
          }
        }
        if (!str.equals(parames))
        {
          parames = str.getBytes();
          parames = new String(JniMethod.getJniMethod().encryptConfig(parames, parames.length));
          if (localcc != null) {
            break label424;
          }
          localObject1 = new cc();
          ((cc)localObject1).a(parames);
          ((eb)localObject2).a((cc)localObject1);
        }
        for (;;)
        {
          parames = new aa(8223);
          parames.a(HeadData.createHeadData("CheckOrder.Req", this));
          parames.a(u.a().i);
          parames.b(u.a().l);
          parames.c(u.a().m);
          parames.d(u.a().s);
          try
          {
            br.a().a(parames, this, this, false, true);
            return;
          }
          catch (Exception parames)
          {
            parames.printStackTrace();
            return;
          }
          label424:
          localcc.a(parames);
          ((eb)localObject2).b(localcc);
        }
      }
      a(parames);
      return;
    }
    Object localObject1 = (aa)parames;
    if (i == 0)
    {
      u.a().j = ((aa)localObject1).b();
      u.a().k = ((aa)localObject1).i();
      u.a().n = ((aa)localObject1).c();
      u.a().o = ((aa)localObject1).d();
      u.a().q = ((aa)localObject1).e();
      u.a().r = ((aa)localObject1).g();
      u.a().p = ((aa)localObject1).h();
      u.a().L = ((aa)localObject1).f();
      parames = new Intent();
      parames.setClass(this, IndexActivityGroup.class);
      startActivity(parames);
      finish();
      return;
    }
    a(parames);
  }
  
  public void showInitDialog(String paramString)
  {
    new AlertDialog.Builder(this).setTitle("提示").setCancelable(false).setMessage(paramString).setPositiveButton("确定", new e(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\SplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */