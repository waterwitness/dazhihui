package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.News;
import com.android.dazhihui.ui.screen.BrowserActivity;

class mw
  implements View.OnClickListener
{
  mw(mv parammv, NewsPersonalizedVo.News paramNews) {}
  
  public void onClick(View paramView)
  {
    if ("0".equals(this.a.getTopType())) {
      NewsDetailInfo.a(mv.a(this.b), this.a.getTopUrl(), this.a.getId(), this.a.getTopName(), mv.b(this.b), "", "", "", this.a.getAdvTypeShare());
    }
    do
    {
      return;
      if ("1".equals(this.a.getTopType()))
      {
        paramView = new Intent(mv.a(this.b), BrowserActivity.class);
        Bundle localBundle = new Bundle();
        localBundle.putString("nexturl", this.a.getTopUrl());
        localBundle.putString("names", mv.b(this.b));
        paramView.putExtras(localBundle);
        mv.a(this.b).startActivity(paramView);
        return;
      }
    } while (!"2".equals(this.a.getTopType()));
    r.a(this.a.getTopUrl(), mv.a(this.b), "0", null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */