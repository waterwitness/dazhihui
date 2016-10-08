package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class bq
  implements View.OnClickListener
{
  bq(bp parambp, int paramInt) {}
  
  public void onClick(View paramView)
  {
    paramView = "确定要删除\n" + (String)bp.a(this.b).get(this.a) + "?";
    new AlertDialog.Builder(this.b.a).setTitle(paramView).setNegativeButton(2131165331, new bt(this)).setPositiveButton(2131165363, new bs(this)).setOnCancelListener(new br(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */