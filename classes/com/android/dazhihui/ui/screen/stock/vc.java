package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.klineindicator.SettingKlineIndicator;
import com.android.dazhihui.ui.screen.y;

class vc
  implements AdapterView.OnItemClickListener
{
  vc(uv paramuv) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (!n.i(uv.e(this.a).getType(), uv.e(this.a).getMarketType())) {
      if (paramInt == 0)
      {
        uv.c(this.a).dismiss();
        this.a.i();
      }
    }
    do
    {
      do
      {
        return;
        if (paramInt == 1)
        {
          uv.c(this.a).dismiss();
          this.a.g();
          return;
        }
        if (paramInt == 2)
        {
          uv.a(this.a, uv.e(this.a).getName(), uv.e(this.a));
          n.a(uv.e(this.a).getCode(), 1385);
          uv.c(this.a).dismiss();
          return;
        }
        if (paramInt == 3)
        {
          paramAdapterView = d.a();
          if (uv.n(this.a) == y.a)
          {
            g.a().a(y.b);
            paramAdapterView.a("dzh_look_face", 1);
            paramAdapterView.g();
            uv.c(this.a, y.b);
          }
          for (;;)
          {
            this.a.changeLookFace(uv.o(this.a));
            uv.c(this.a).dismiss();
            n.a(uv.e(this.a).getCode(), 20116);
            return;
            g.a().a(y.a);
            paramAdapterView.a("dzh_look_face", 0);
            paramAdapterView.g();
            uv.d(this.a, y.a);
          }
        }
      } while (paramInt != 4);
      uv.c(this.a).dismiss();
      paramAdapterView = new Intent();
      paramAdapterView.setClass(this.a.getActivity(), SettingKlineIndicator.class);
      this.a.getActivity().startActivity(paramAdapterView);
      return;
      if (paramInt == 0)
      {
        uv.c(this.a).dismiss();
        this.a.i();
        return;
      }
      if (paramInt == 1)
      {
        uv.c(this.a).dismiss();
        this.a.g();
        return;
      }
      if (paramInt == 2)
      {
        r.a(f.ad + uv.e(this.a).getCode(), this.a.getActivity(), "20253", null);
        uv.c(this.a).dismiss();
        n.a(uv.e(this.a).getCode(), 20253);
        return;
      }
      if (paramInt == 3)
      {
        uv.a(this.a, uv.e(this.a).getName(), uv.e(this.a));
        n.a(uv.e(this.a).getCode(), 1385);
        uv.c(this.a).dismiss();
        return;
      }
      if (paramInt == 4)
      {
        paramAdapterView = d.a();
        if (uv.p(this.a) == y.a)
        {
          g.a().a(y.b);
          paramAdapterView.a("dzh_look_face", 1);
          paramAdapterView.g();
          uv.e(this.a, y.b);
        }
        for (;;)
        {
          this.a.changeLookFace(uv.q(this.a));
          uv.c(this.a).dismiss();
          n.a(uv.e(this.a).getCode(), 20116);
          return;
          g.a().a(y.a);
          paramAdapterView.a("dzh_look_face", 0);
          paramAdapterView.g();
          uv.f(this.a, y.a);
        }
      }
    } while (paramInt != 5);
    uv.c(this.a).dismiss();
    paramAdapterView = new Intent();
    paramAdapterView.setClass(this.a.getActivity(), SettingKlineIndicator.class);
    this.a.getActivity().startActivity(paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */