package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class at
  implements AdapterView.OnItemClickListener
{
  at(StructuredFundSplitOrMerge paramStructuredFundSplitOrMerge) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    StructuredFundSplitOrMerge.f(this.a).setVisibility(0);
    StructuredFundSplitOrMerge.a(this.a).setVisibility(4);
    StructuredFundSplitOrMerge.e(this.a).setBackgroundResource(2130837971);
    StructuredFundSplitOrMerge.b(this.a, false);
    if (StructuredFundSplitOrMerge.g(this.a).equals("hebing")) {
      StructuredFundSplitOrMerge.b(this.a).setText(((String[])StructuredFundSplitOrMerge.h(this.a).get(paramInt))[0]);
    }
    for (;;)
    {
      StructuredFundSplitOrMerge.i(this.a).dismiss();
      return;
      if (StructuredFundSplitOrMerge.g(this.a).equals("chaifen")) {
        StructuredFundSplitOrMerge.b(this.a).setText(((String[])StructuredFundSplitOrMerge.c(this.a).get(paramInt))[StructuredFundSplitOrMerge.d(this.a)]);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */