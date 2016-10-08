package com.tencent.mm.sdk.modelpay;

import android.os.Bundle;

public class PayReq$Options
{
  public static final int INVALID_FLAGS = -1;
  public String callbackClassName;
  public int callbackFlags = -1;
  
  public void fromBundle(Bundle paramBundle)
  {
    this.callbackClassName = paramBundle.getString("_wxapi_payoptions_callback_classname");
    this.callbackFlags = paramBundle.getInt("_wxapi_payoptions_callback_flags", -1);
  }
  
  public void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("_wxapi_payoptions_callback_classname", this.callbackClassName);
    paramBundle.putInt("_wxapi_payoptions_callback_flags", this.callbackFlags);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelpay\PayReq$Options.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */