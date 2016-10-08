package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.w;

class ci
  implements View.OnClickListener
{
  ci(bs parambs) {}
  
  public void onClick(View paramView)
  {
    if (this.a.getActivity() == null) {
      return;
    }
    n.a(this.a.a, 20070);
    if (!w.a().l())
    {
      paramView = new Intent(this.a.getActivity(), LoginMainScreen.class);
      paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
      this.a.startActivity(paramView);
      return;
    }
    paramView = new Bundle();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(f.E).append("&stockname=").append(this.a.b).append("&stockcode=").append(this.a.a).append(f.F);
    paramView.putString("nexturl", ((StringBuilder)localObject).toString());
    localObject = new Intent();
    ((Intent)localObject).setClass(this.a.getActivity(), BrowserActivity.class);
    ((Intent)localObject).putExtras(paramView);
    this.a.startActivity((Intent)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */