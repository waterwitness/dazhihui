package com.tencent.qalsdk.core;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

class m$a
  extends PhoneStateListener
{
  private m$a(m paramm) {}
  
  public void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    super.onSignalStrengthsChanged(paramSignalStrength);
    int i = paramSignalStrength.getCdmaDbm();
    this.a.i = i;
    int j = paramSignalStrength.getGsmSignalStrength();
    i = j;
    if (j == 99) {
      i = -3;
    }
    this.a.h = i;
    this.a.j = paramSignalStrength.isGsm();
    this.a.q();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\m$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */