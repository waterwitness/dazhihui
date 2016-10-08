package com.android.dazhihui.ui.delegate.screen.setplan;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

class s
  implements AdapterView.OnItemSelectedListener
{
  s(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = paramAdapterView.getItemAtPosition(paramInt).toString();
    paramView = (TextView)paramView;
    if (paramAdapterView.equals("份额分红"))
    {
      SetPlanEntrust.b(this.a, 0);
      paramView.setText("份额分红");
    }
    while (!paramAdapterView.equals("现金分红")) {
      return;
    }
    SetPlanEntrust.b(this.a, 1);
    paramView.setText("现金分红");
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */