package com.cairh.app.sjkh.service;

import com.cairh.app.sjkh.util.BlockFileUploadUtil.BlockUploadListener;

class BlockUploadService$1
  implements BlockFileUploadUtil.BlockUploadListener
{
  BlockUploadService$1(BlockUploadService paramBlockUploadService) {}
  
  public void onMegreFailed()
  {
    this.this$0.stopSelf();
  }
  
  public void onMegreSuccess(String paramString)
  {
    this.this$0.stopSelf();
  }
  
  public void onUploadFail()
  {
    this.this$0.stopSelf();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\service\BlockUploadService$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */