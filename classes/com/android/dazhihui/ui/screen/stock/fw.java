package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.b.b;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.PublicWidomMessageVo;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.LeftMenuItem;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.w;
import com.tencent.avsdk.activity.MyFavoriteActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class fw
  implements AdapterView.OnItemClickListener
{
  fw(fu paramfu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((fu.c(this.a) != null) && (fu.c(this.a).size() > 0)) {
      if (((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId == 20256)
      {
        n.a("", 20256);
        r.a(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).callurl, this.a.getActivity(), String.valueOf(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId), null);
      }
    }
    do
    {
      return;
      if (((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId == 20229)
      {
        paramAdapterView = "";
        if (this.a.b != null) {
          paramAdapterView = this.a.b.getUrl_list();
        }
        paramView = paramAdapterView;
        if (TextUtils.isEmpty(paramAdapterView)) {
          paramView = "http://mnews.gw.com.cn/wap/style/msg/zhxx/html/index.html";
        }
        r.a(paramView, this.a.getContext(), "20229", null);
        fu.d(this.a).d().clear();
        fu.d(this.a).a((byte)100);
        return;
      }
      if (((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId == 20225)
      {
        paramAdapterView = d.a();
        if (paramAdapterView.b("new_reply_my_bbs", 0) == 1)
        {
          ah.a().a(16);
          paramAdapterView.a("new_reply_my_bbs", 0);
        }
        paramAdapterView.g();
        if (w.a().l())
        {
          r.a(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).callurl, this.a.getContext(), ((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId + "", null);
          return;
        }
        paramAdapterView = new Intent(this.a.getActivity(), LoginMainScreen.class);
        paramAdapterView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        paramAdapterView.putExtra("CAN_showSyncSettingDialog", true);
        this.a.startActivity(paramAdapterView);
        return;
      }
      RedPointVo localRedPointVo;
      if ("20".equals(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).callurl))
      {
        ((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).isShowRed = false;
        paramAdapterView = this.a.getActivity().getSharedPreferences(DzhPushService.h, 0);
        paramView = String.valueOf(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId);
        if (ah.e.containsKey(paramView))
        {
          localRedPointVo = (RedPointVo)ah.e.get(paramView);
          if (localRedPointVo != null) {
            paramAdapterView.edit().putString(paramView, localRedPointVo.getVs()).commit();
          }
          ah.e.remove(paramView);
        }
        b.a().a((byte)101);
        ah.a().b(10001);
        fu.e(this.a);
        return;
      }
      ((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).isShowRed = false;
      paramAdapterView = this.a.getActivity().getSharedPreferences(DzhPushService.h, 0);
      paramView = String.valueOf(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId);
      if (ah.e.containsKey(paramView))
      {
        localRedPointVo = (RedPointVo)ah.e.get(paramView);
        if (localRedPointVo != null) {
          paramAdapterView.edit().putString(paramView, localRedPointVo.getVs()).commit();
        }
        ah.e.remove(paramView);
      }
      b.a().a((byte)101);
      ah.a().b(10001);
      r.a(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).callurl, this.a.getActivity(), String.valueOf(((LeftMenuConfigVo.LeftMenuItem)fu.c(this.a).get(paramInt)).countId), null);
      this.a.d();
      return;
      if (((gf)fu.f(this.a).get(paramInt)).a.equals("消息"))
      {
        n.a("", 20256);
        paramAdapterView = new Bundle();
        paramAdapterView.putByte("type", (byte)5);
        ((MainScreen)this.a.getActivity()).startActivity(MessageCenterList.class, paramAdapterView);
        return;
      }
      if (((gf)fu.f(this.a).get(paramInt)).a.equals("新股"))
      {
        n.a("", 20262);
        r.a("http://mnews.gw.com.cn/wap/news/xgfx/ns/ns_sg.html?themeStyleVs=1&DZHSPECIAL=1", this.a.getActivity(), null, null);
        return;
      }
    } while (!((gf)fu.f(this.a).get(paramInt)).a.equals("收藏"));
    n.a("", 20255);
    if (w.a().l())
    {
      paramAdapterView = new Intent();
      paramAdapterView.setClass(this.a.getActivity(), MyFavoriteActivity.class);
      this.a.startActivity(paramAdapterView);
      return;
    }
    paramAdapterView = new Intent(this.a.getActivity(), LoginMainScreen.class);
    paramAdapterView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    this.a.startActivity(paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */