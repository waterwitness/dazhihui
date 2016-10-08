package com.tencent.openqq;

import android.content.Context;
import com.tencent.imsdk.IMMsfCoreProxy;

class ʻ
{
  protected static IMMsfCoreProxy msfCoreProxy = IMMsfCoreProxy.get();
  static ʻ sdkbase = new ʻ();
  private static final String tag = "openqq.IMSdkBase";
  
  static ʻ get()
  {
    return sdkbase;
  }
  
  public void init(Context paramContext)
  {
    msfCoreProxy.init(paramContext);
  }
  
  public void setEnv(int paramInt)
  {
    msfCoreProxy.setEnv(paramInt);
  }
  
  public void setSdkType(String paramString)
  {
    msfCoreProxy.setSdkType(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */