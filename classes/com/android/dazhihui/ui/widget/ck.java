package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.widget.adv.a;
import java.util.ArrayList;

public class ck
  extends a
{
  public ck(DzhBottomLayout paramDzhBottomLayout, int paramInt)
  {
    super(paramInt);
  }
  
  private void c(AdvertVo.AdvertData paramAdvertData)
  {
    if ((paramAdvertData.advList != null) && (paramAdvertData.advList.size() > 0))
    {
      String str = this.e.vs + this.e.pcode;
      if (!this.a.getContext().getSharedPreferences("AdvertClosed", 0).contains(str))
      {
        DzhBottomLayout.d(this.a).setVisibility(0);
        DzhBottomLayout.d(this.a).setText(((AdvertVo.AdvItem)paramAdvertData.advList.get(0)).text);
      }
      return;
    }
    DzhBottomLayout.d(this.a).setVisibility(8);
  }
  
  public void a() {}
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void b() {}
  
  public void b(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void c()
  {
    DzhBottomLayout.d(this.a).setVisibility(8);
  }
  
  public void d() {}
  
  public void d_()
  {
    if ((this.e != null) && (DzhBottomLayout.d(this.a) != null))
    {
      String str = this.e.vs + this.e.pcode;
      SharedPreferences localSharedPreferences = this.a.getContext().getSharedPreferences("AdvertClosed", 0);
      if (!localSharedPreferences.contains(str))
      {
        localSharedPreferences.edit().putLong(str, System.currentTimeMillis()).commit();
        if ((this.e.advList != null) && (this.e.advList.size() > 0))
        {
          str = ((AdvertVo.AdvItem)this.e.advList.get(0)).countid;
          if (!TextUtils.isEmpty(str)) {
            n.a("", Integer.parseInt(str));
          }
        }
      }
      DzhBottomLayout.d(this.a).setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */