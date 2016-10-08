package com.tencent;

import android.os.Handler;
import com.tencent.imcore.IApplyDownloadFileCallback;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class ʼʼ<T>
  extends IApplyDownloadFileCallback
{
  public T a;
  
  public ʼʼ(T paramT)
  {
    swigReleaseOwnership();
    this.a = paramT;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<String> paramList);
  
  public void done(StrVec paramStrVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramStrVec.size())
    {
      localArrayList.add(paramStrVec.get(i));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʿʿ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʾʾ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʼʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */