package com.baidu.location.h;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

class f
  extends PhoneStateListener
{
  public f(e parame) {}
  
  public void onCellLocationChanged(CellLocation paramCellLocation)
  {
    if (paramCellLocation == null) {
      return;
    }
    try
    {
      e.a(this.a);
      return;
    }
    catch (Exception paramCellLocation) {}
  }
  
  public void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    if (e.b(this.a) != null)
    {
      if (e.b(this.a).i != 'g') {
        break label40;
      }
      e.b(this.a).h = paramSignalStrength.getGsmSignalStrength();
    }
    label40:
    while (e.b(this.a).i != 'c') {
      return;
    }
    e.b(this.a).h = paramSignalStrength.getCdmaDbm();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */