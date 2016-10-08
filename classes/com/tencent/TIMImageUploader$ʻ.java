package com.tencent;

import com.tencent.imcore.IImageUploadCallback;
import com.tencent.imcore.ImageElem;

final class TIMImageUploader$ʻ
  extends IImageUploadCallback
{
  private TIMValueCallBack<TIMImageElem> a;
  
  TIMImageUploader$ʻ(TIMValueCallBack<TIMImageElem> paramTIMValueCallBack)
  {
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
    swigReleaseOwnership();
  }
  
  public final void done(ImageElem paramImageElem)
  {
    paramImageElem = TIMMessage.buildImageElem(paramImageElem);
    this.a.onSuccess(paramImageElem);
    swigTakeOwnership();
  }
  
  public final void fail(int paramInt, String paramString)
  {
    this.a.onError(paramInt, paramString);
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMImageUploader$ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */