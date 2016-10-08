package com.sina.weibo.sdk.api.a;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.api.h;

public class g
  extends d
{
  public h b;
  
  public int a()
  {
    return 1;
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.putAll(this.b.a(paramBundle));
  }
  
  final boolean a(Context paramContext, i parami)
  {
    if (this.b == null) {}
    while ((parami != null) && (!parami.a(paramContext, this.b))) {
      return false;
    }
    return this.b.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */