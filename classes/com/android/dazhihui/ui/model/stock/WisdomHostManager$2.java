package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.b.a;
import com.c.a.k;

final class WisdomHostManager$2
  implements i
{
  WisdomHostManager$2(WisdomHostManager.WisdomCallBack paramWisdomCallBack) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      paramh = new String(((g)paramj).a());
      paramh = (WisdomHostVo)new k().a(paramh, WisdomHostVo.class);
      if (paramh != null)
      {
        paramh.time = System.currentTimeMillis();
        DzhApplication.a().b().a("WisdomHostVo", paramh);
        WisdomHostManager.nnMenuConfigVo = paramh;
      }
      if (this.val$callBack != null) {
        this.val$callBack.callBack(WisdomHostManager.nnMenuConfigVo);
      }
      return;
    }
    catch (Exception paramh)
    {
      while (this.val$callBack == null) {}
      this.val$callBack.callBack(WisdomHostManager.nnMenuConfigVo);
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (this.val$callBack != null) {
      this.val$callBack.callBack(WisdomHostManager.nnMenuConfigVo);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (this.val$callBack != null) {
      this.val$callBack.callBack(WisdomHostManager.nnMenuConfigVo);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\WisdomHostManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */