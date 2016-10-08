package com.tencent;

import android.os.Handler;
import com.tencent.imcore.ICreateGroupCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

public abstract class TIMGroupManager$CreateGroupCallBack
  extends ICreateGroupCallback
{
  public TIMValueCallBack<String> cb;
  
  public TIMGroupManager$CreateGroupCallBack(TIMValueCallBack<String> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.cb = localTIMValueCallBack;
  }
  
  public void done(String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿˏ(this, paramString));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿˑ(this, paramInt, paramString));
    swigTakeOwnership();
  }
  
  public abstract void onDone(String paramString);
  
  public abstract void onFail(int paramInt, String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$CreateGroupCallBack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */