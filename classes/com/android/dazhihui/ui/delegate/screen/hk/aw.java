package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import java.util.Vector;

class aw
  implements AdapterView.OnItemClickListener
{
  aw(HKEntrust paramHKEntrust) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((HKEntrust.x(this.a) != null) && (HKEntrust.x(this.a).size() > 0))
    {
      HKEntrust.d(this.a);
      HKEntrust.e(this.a);
      HKEntrust.a(this.a, true);
      HKEntrust.b(this.a).setText(((String[])HKEntrust.x(this.a).get(paramInt))[8]);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */