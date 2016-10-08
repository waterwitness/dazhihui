package com.tencent;

import android.os.Handler;
import com.tencent.imcore.INotify;
import com.tencent.imcore.Msg;
import com.tencent.imcore.MsgVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;

final class ⁱ
  extends INotify
{
  private String a;
  
  public ⁱ(String paramString)
  {
    this.a = paramString;
    swigReleaseOwnership();
  }
  
  public final void onMsgEvent(MsgVec paramMsgVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramMsgVec.size())
    {
      localArrayList.add(new TIMMessage(paramMsgVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ﹳ(this, localArrayList));
  }
  
  public final void onMsgUpdate(MsgVec paramMsgVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramMsgVec.size())
    {
      localArrayList.add(new TIMMessage(paramMsgVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ﹶ(this, localArrayList));
  }
  
  public final void onRefresh()
  {
    TIMRefreshListener localTIMRefreshListener = TIMManager.getInstanceById(this.a).getRefreshListener();
    if (localTIMRefreshListener == null) {
      return;
    }
    IMMsfCoreProxy.mainHandler.post(new ᐧᐧ(this, localTIMRefreshListener));
  }
  
  public final void onUploadProgress(Msg paramMsg, int paramInt1, int paramInt2, int paramInt3)
  {
    TIMUploadProgressListener localTIMUploadProgressListener = TIMManager.getInstanceById(this.a).getUploadProgressListener();
    if (localTIMUploadProgressListener == null) {
      return;
    }
    if (paramMsg == null)
    {
      ʻ.a().a(new ﾞ(this, localTIMUploadProgressListener, paramInt2, paramInt3));
      return;
    }
    paramMsg = new TIMMessage(paramMsg);
    ʻ.a().a(new ﾞﾞ(this, localTIMUploadProgressListener, paramMsg, paramInt1, paramInt2, paramInt3));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ⁱ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */