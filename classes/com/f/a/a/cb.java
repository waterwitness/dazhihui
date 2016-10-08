package com.f.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.plugin.ui.UIResponseListener;
import java.util.Queue;

class cb
  extends Handler
{
  cb(br parambr) {}
  
  private void a(es parames)
  {
    if ("0000".equals(parames.s()))
    {
      switch (parames.j())
      {
      case 8198: 
      case 8199: 
      case 8202: 
      case 8205: 
      default: 
        ef.a().b();
      }
      return;
    }
    switch (parames.j())
    {
    default: 
      return;
    }
    ef.a().b();
  }
  
  private void b(es parames)
  {
    switch (parames.j())
    {
    default: 
      return;
    }
    u.a().c.f(true);
  }
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (es)paramMessage.obj;
    if ("3022".equals(br.c(this.a).s())) {
      if (this.a.a != null)
      {
        paramMessage = this.a.a.getString(bp.ey());
        ef.a().a(this.a.a, paramMessage, new x(this));
      }
    }
    do
    {
      do
      {
        return;
        a(paramMessage);
        br.a(this.a, paramMessage);
        br.b(this.a, paramMessage);
        if (paramMessage.j() == 8200)
        {
          int i = Integer.parseInt(paramMessage.k());
          u.a().d.a(i, true);
        }
        if (!"0000".equals(paramMessage.s())) {
          b(paramMessage);
        }
        br.b(this.a).responseCallBack(paramMessage);
      } while (br.a(this.a) == null);
      paramMessage = (bg)br.a(this.a).poll();
    } while (paramMessage == null);
    this.a.a(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */