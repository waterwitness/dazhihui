package com.tencent.Util;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.hardware.SensorManager;
import android.os.Handler;
import android.provider.Settings.System;

class SenserHelper$RotationObserver
  extends ContentObserver
{
  public SenserHelper$RotationObserver(SenserHelper paramSenserHelper, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    if (this.this$0.getRotationStatus(SenserHelper.access$100(this.this$0)) == 1)
    {
      SenserHelper.access$400(this.this$0).registerListener(SenserHelper.access$200(this.this$0), SenserHelper.access$300(this.this$0), 2);
      return;
    }
    SenserHelper.access$400(this.this$0).unregisterListener(SenserHelper.access$200(this.this$0));
  }
  
  public void startObserver()
  {
    SenserHelper.access$500(this.this$0).registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this);
  }
  
  public void stopObserver()
  {
    SenserHelper.access$500(this.this$0).unregisterContentObserver(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\SenserHelper$RotationObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */