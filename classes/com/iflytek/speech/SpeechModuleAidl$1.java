package com.iflytek.speech;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

class SpeechModuleAidl$1
  implements ServiceConnection
{
  SpeechModuleAidl$1(SpeechModuleAidl paramSpeechModuleAidl) {}
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    synchronized (this.this$0.mSynLock)
    {
      Log.d(this.this$0.getTag(), "init success");
      this.this$0.mService = SpeechModuleAidl.access$000(this.this$0, paramIBinder);
      Log.d(this.this$0.getTag(), "mService :" + this.this$0.mService);
      if (SpeechModuleAidl.access$100(this.this$0) != null) {
        Message.obtain(SpeechModuleAidl.access$200(this.this$0), 0, 0, 0, null).sendToTarget();
      }
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.d(this.this$0.getTag(), "onServiceDisconnected");
    this.this$0.mService = null;
    if (!SpeechModuleAidl.access$300(this.this$0)) {}
    try
    {
      SpeechModuleAidl.access$400(this.this$0);
      return;
    }
    catch (Exception paramComponentName)
    {
      Log.e(this.this$0.getTag(), "rebindService error = " + paramComponentName.toString());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeechModuleAidl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */