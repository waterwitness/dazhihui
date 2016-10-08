package com.tencent;

import java.util.List;

final class ˉ
  implements Runnable
{
  ˉ(IMCoreFriendshipProxyCallback paramIMCoreFriendshipProxyCallback, List paramList) {}
  
  public final void run()
  {
    TIMManager.getInstanceById(this.b.identify).getFriendshipProxyListener().OnDelFriends(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˉ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */