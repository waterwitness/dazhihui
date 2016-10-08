package com.sina.weibo.sdk.api.a;

import android.os.Bundle;

public abstract class d
  extends c
{
  public void a(Bundle paramBundle)
  {
    paramBundle.putInt("_weibo_command_type", a());
    paramBundle.putString("_weibo_transaction", this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */