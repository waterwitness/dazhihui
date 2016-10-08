package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;

class j
  extends b
{
  j(ResultReceiver paramResultReceiver) {}
  
  public void a(int paramInt, Bundle paramBundle)
  {
    if (this.a.d != null)
    {
      this.a.d.post(new k(this.a, paramInt, paramBundle));
      return;
    }
    this.a.a(paramInt, paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */