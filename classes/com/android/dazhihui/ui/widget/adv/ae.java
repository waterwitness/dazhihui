package com.android.dazhihui.ui.widget.adv;

import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import com.android.dazhihui.ui.model.stock.RTBAdvertVo;
import com.android.dazhihui.ui.widget.a.a;
import com.c.a.k;

final class ae
  extends a<RTBAdvertVo, String, RTBAdvertResultVo>
{
  ae(ag paramag) {}
  
  protected RTBAdvertResultVo a(RTBAdvertVo... paramVarArgs)
  {
    try
    {
      k localk = new k();
      paramVarArgs = (RTBAdvertResultVo)localk.a(ad.a("http://dzhhy.gw.com.cn/dazhihui/bid", localk.a(paramVarArgs[0]).getBytes()), RTBAdvertResultVo.class);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      paramVarArgs.printStackTrace();
    }
    return null;
  }
  
  protected void a(RTBAdvertResultVo paramRTBAdvertResultVo)
  {
    if (this.a != null) {
      this.a.a(paramRTBAdvertResultVo);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */