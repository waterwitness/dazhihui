package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.RelativeLayout;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.List;

class em
  implements AdapterView.OnItemClickListener
{
  em(IndexBottomWidget paramIndexBottomWidget) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    IndexBottomWidget.g(this.a).setVisibility(0);
    IndexBottomWidget.i(this.a).startAnimation(IndexBottomWidget.h(this.a));
    IndexBottomWidget.i(this.a).setVisibility(0);
    IndexBottomWidget.j(this.a).getSelectedItemPosition();
    if (IndexBottomWidget.k(this.a).size() != 0) {
      IndexBottomWidget.k(this.a).size();
    }
    IndexBottomWidget.l(this.a);
    IndexBottomWidget.m(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */