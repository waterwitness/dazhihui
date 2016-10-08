package com.tencent;

import java.util.List;

final class ˊ
  implements Runnable
{
  ˊ(IMCoreFriendshipProxyCallback paramIMCoreFriendshipProxyCallback, List paramList) {}
  
  public final void run()
  {
    TIMManager.getInstanceById(this.b.identify).getFriendshipProxyListener().OnFriendProfileUpdate(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˊ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */