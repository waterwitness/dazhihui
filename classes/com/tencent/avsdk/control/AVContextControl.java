package com.tencent.avsdk.control;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.dazhihui.d.n;
import com.tencent.TIMManager;
import com.tencent.TIMUser;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVContext.Config;
import com.tencent.av.sdk.AVContext.StartCallback;
import com.tencent.av.sdk.AVContext.StopCallback;
import com.tencent.avsdk.DemoConstants;

class AVContextControl
{
  private static final String TAG = "ilvb";
  private AVContext mAVContext = null;
  private AVContext.Config mConfig = null;
  private Context mContext;
  private String mPeerIdentifier = "";
  private String mSelfIdentifier = "";
  private AVContext.StartCallback mStartContextCompleteCallback = new AVContextControl.1(this);
  private AVContext.StopCallback mStopContextCompleteCallback = new AVContextControl.2(this);
  private String mUserSig = "";
  
  AVContextControl(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void login()
  {
    TIMManager.getInstance().setEnv(0);
    TIMManager.getInstance().disableCrashReport();
    TIMManager.getInstance().init(this.mContext);
    TIMUser localTIMUser = new TIMUser();
    localTIMUser.setAccountType(DemoConstants.ACCOUNTTYPE);
    localTIMUser.setAppIdAt3rd(this.mConfig.appIdAt3rd);
    localTIMUser.setIdentifier(this.mConfig.identifier);
    TIMManager.getInstance().login(this.mConfig.sdkAppId, localTIMUser, this.mUserSig, new AVContextControl.3(this));
  }
  
  private void logout()
  {
    TIMManager.getInstance().logout();
    onLogout(true);
  }
  
  private void onLogin(boolean paramBoolean, long paramLong, int paramInt)
  {
    if (paramBoolean)
    {
      this.mAVContext = AVContext.createInstance(this.mContext, this.mConfig);
      this.mSelfIdentifier = this.mConfig.identifier;
      paramInt = this.mAVContext.start(this.mStartContextCompleteCallback);
      StringBuilder localStringBuilder = new StringBuilder().append("AVContextControl onLogin createContext =");
      if (this.mAVContext != null) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        Log.d("ilvb", paramBoolean + " startContext=" + paramInt);
        return;
      }
    }
    this.mStartContextCompleteCallback.OnComplete(paramInt);
  }
  
  private void onLogout(boolean paramBoolean)
  {
    this.mAVContext.destroy();
    this.mAVContext = null;
    this.mContext.sendBroadcast(new Intent("com.dazhihui.avsdk.ACTION_CLOSE_CONTEXT_COMPLETE"));
  }
  
  AVContext getAVContext()
  {
    return this.mAVContext;
  }
  
  String getAVContextUser()
  {
    if (this.mAVContext == null) {
      return null;
    }
    return this.mSelfIdentifier;
  }
  
  String getAVContextUserSig()
  {
    if (this.mAVContext == null) {
      return null;
    }
    return this.mUserSig;
  }
  
  String getPeerIdentifier()
  {
    return this.mPeerIdentifier;
  }
  
  boolean hasAVContext()
  {
    return this.mAVContext != null;
  }
  
  void setPeerIdentifier(String paramString)
  {
    this.mPeerIdentifier = paramString;
  }
  
  int startContext(String paramString1, String paramString2)
  {
    if (!hasAVContext())
    {
      n.d("ilvb", "AVContextControl startContext identifier = " + paramString1 + " usersig = " + paramString2);
      this.mConfig = new AVContext.Config();
      this.mConfig.sdkAppId = DemoConstants.APPID;
      this.mConfig.accountType = DemoConstants.ACCOUNTTYPE;
      this.mConfig.appIdAt3rd = Integer.toString(DemoConstants.APPID);
      this.mConfig.identifier = paramString1;
      this.mUserSig = paramString2;
      login();
    }
    return 0;
  }
  
  void stopContext()
  {
    if (hasAVContext())
    {
      Log.d("ilvb", "AVContextControl stopContext");
      this.mAVContext.stop(this.mStopContextCompleteCallback);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVContextControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */