package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

class x
  extends Handler
{
  x(FragmentActivity paramFragmentActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
    case 1: 
      do
      {
        return;
      } while (!this.a.mStopped);
      this.a.doReallyStop(false);
      return;
    }
    this.a.onResumeFragments();
    this.a.mFragments.p();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */