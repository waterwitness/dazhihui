package com.android.dazhihui.ui.screen;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask;

class ab
  implements View.OnClickListener
{
  ab(ShareActivity paramShareActivity) {}
  
  public void onClick(View paramView)
  {
    ShareActivity.b(this.a).abort();
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */