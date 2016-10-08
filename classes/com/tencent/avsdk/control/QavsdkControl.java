package com.tencent.avsdk.control;

import android.content.Context;
import android.util.Log;
import com.android.dazhihui.DzhApplication;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVRoom;

public class QavsdkControl
{
  private static final String TAG = "ilvb";
  private static QavsdkControl sQavsdkControl = null;
  private AVContextControl mAVContextControl = null;
  
  public QavsdkControl(Context paramContext)
  {
    this.mAVContextControl = new AVContextControl(paramContext);
    Log.d("ilvb", "QavsdkControl constructor");
  }
  
  public static QavsdkControl getInstance()
  {
    if (sQavsdkControl == null) {}
    try
    {
      if (sQavsdkControl == null) {
        sQavsdkControl = new QavsdkControl(DzhApplication.a().getApplicationContext());
      }
      return sQavsdkControl;
    }
    finally {}
  }
  
  public AVContext getAVContext()
  {
    if (this.mAVContextControl == null) {
      return null;
    }
    return this.mAVContextControl.getAVContext();
  }
  
  public String getAVContextUser()
  {
    if (this.mAVContextControl == null) {
      return null;
    }
    return this.mAVContextControl.getAVContextUser();
  }
  
  public String getAVContextUserSig()
  {
    if (this.mAVContextControl == null) {
      return null;
    }
    return this.mAVContextControl.getAVContextUserSig();
  }
  
  public AVRoom getRoom()
  {
    AVContext localAVContext = getAVContext();
    if (localAVContext != null) {
      return localAVContext.getRoom();
    }
    return null;
  }
  
  public boolean hasAVContext()
  {
    if (this.mAVContextControl == null) {
      return false;
    }
    return this.mAVContextControl.hasAVContext();
  }
  
  public int startContext(String paramString1, String paramString2)
  {
    if (this.mAVContextControl == null) {
      return -99999998;
    }
    return this.mAVContextControl.startContext(paramString1, paramString2);
  }
  
  public void stopContext()
  {
    if (this.mAVContextControl != null) {
      this.mAVContextControl.stopContext();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\QavsdkControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */