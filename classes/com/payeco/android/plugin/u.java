package com.payeco.android.plugin;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

final class u
  implements View.OnClickListener
{
  u(PayecoRiskControlActivity paramPayecoRiskControlActivity) {}
  
  public final void onClick(View paramView)
  {
    ((TextView)paramView).setTextColor(-16776961);
    paramView = new Dialog(PayecoRiskControlActivity.e(this.bc), PayecoRiskControlActivity.f(this.bc).getIdentifier("payeco_fullScreendialog", "style", PayecoRiskControlActivity.g(this.bc)));
    paramView.setContentView(PayecoRiskControlActivity.f(this.bc).getIdentifier("payeco_plugin_creditinfo", "layout", PayecoRiskControlActivity.g(this.bc)));
    WindowManager.LayoutParams localLayoutParams = paramView.getWindow().getAttributes();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.bc.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    Rect localRect = new Rect();
    this.bc.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    localLayoutParams.height = (localDisplayMetrics.heightPixels - localRect.top);
    localLayoutParams.width = localDisplayMetrics.widthPixels;
    ((TextView)paramView.findViewById(PayecoRiskControlActivity.f(this.bc).getIdentifier("payeco_close_creditInfo", "id", PayecoRiskControlActivity.g(this.bc)))).setOnClickListener(new v(this, paramView));
    paramView.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */