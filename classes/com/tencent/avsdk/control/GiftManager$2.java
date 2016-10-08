package com.tencent.avsdk.control;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.b.a;
import com.c.a.k;
import com.tencent.avsdk.Model.GiftVo;

final class GiftManager$2
  implements i
{
  GiftManager$2(GiftManager.GiftCallBack paramGiftCallBack) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      paramh = new String(((g)paramj).a());
      paramh = (GiftVo)new k().a(paramh, GiftVo.class);
      if (paramh != null)
      {
        paramh.time = System.currentTimeMillis();
        DzhApplication.a().b().a("GiftVo", paramh);
        GiftManager.nnMenuConfigVo = paramh;
      }
      if (this.val$callBack != null) {
        this.val$callBack.callBack(GiftManager.nnMenuConfigVo);
      }
      return;
    }
    catch (Exception paramh)
    {
      while (this.val$callBack == null) {}
      this.val$callBack.callBack(GiftManager.nnMenuConfigVo);
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (this.val$callBack != null) {
      this.val$callBack.callBack(GiftManager.nnMenuConfigVo);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (this.val$callBack != null) {
      this.val$callBack.callBack(GiftManager.nnMenuConfigVo);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\GiftManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */