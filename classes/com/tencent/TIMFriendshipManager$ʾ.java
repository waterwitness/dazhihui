package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendGroupVec;
import com.tencent.imcore.IFriendGroupCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMFriendshipManager$ʾ
  extends IFriendGroupCallback
{
  public TIMValueCallBack<List<TIMFriendGroup>> a;
  
  public TIMFriendshipManager$ʾ(TIMValueCallBack<List<TIMFriendGroup>> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMFriendGroup> paramList);
  
  public void done(FriendGroupVec paramFriendGroupVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramFriendGroupVec.size())
    {
      localArrayList.add(new TIMFriendGroup(paramFriendGroupVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʽˎ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽˏ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */