package com.tencent;

final class ˆ
  implements Runnable
{
  ˆ(IMCoreFriendshipProxyCallback paramIMCoreFriendshipProxyCallback, TIMFriendshipProxyStatus paramTIMFriendshipProxyStatus) {}
  
  public final void run()
  {
    TIMManager.getInstanceById(this.b.identify).getFriendshipProxyListener().OnProxyStatusChange(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */