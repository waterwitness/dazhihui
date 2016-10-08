package com.android.dazhihui.ui.widget.stockchart;

import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

class e
  implements Runnable
{
  e(FastDealsView paramFastDealsView, RelativeLayout.LayoutParams paramLayoutParams) {}
  
  public void run()
  {
    FastDealsView.c(this.b).setVisibility(0);
    int i = FastDealsView.a(this.b).getLeft();
    this.a.leftMargin = i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */