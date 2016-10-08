package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.modelbase.BaseResp;

public class LaunchFromWX$Resp
  extends BaseResp
{
  public LaunchFromWX$Resp() {}
  
  public LaunchFromWX$Resp(Bundle paramBundle)
  {
    fromBundle(paramBundle);
  }
  
  public boolean checkArgs()
  {
    return true;
  }
  
  public int getType()
  {
    return 6;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\LaunchFromWX$Resp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */