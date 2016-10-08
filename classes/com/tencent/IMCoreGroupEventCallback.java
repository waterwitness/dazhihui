package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupTipsElem;
import com.tencent.imcore.IGroupTipsEventCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.QLog;

public class IMCoreGroupEventCallback
  extends IGroupTipsEventCallback
{
  static String TAG = "IMCoreGroupEventCallback";
  private String identifier;
  
  public IMCoreGroupEventCallback(String paramString)
  {
    this.identifier = paramString;
    swigReleaseOwnership();
  }
  
  public void onGroupTipsEvent(GroupTipsElem paramGroupTipsElem)
  {
    TIMGroupEventListener localTIMGroupEventListener = TIMManager.getInstanceById(this.identifier).getGroupEventListener();
    if (localTIMGroupEventListener == null)
    {
      QLog.d(TAG, 1, "no group event listener registered/" + this.identifier);
      return;
    }
    paramGroupTipsElem = new TIMGroupTipsElem(paramGroupTipsElem);
    IMMsfCoreProxy.mainHandler.post(new ᐧ(this, localTIMGroupEventListener, paramGroupTipsElem));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreGroupEventCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */