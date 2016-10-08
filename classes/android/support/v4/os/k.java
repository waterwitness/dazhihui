package android.support.v4.os;

import android.os.Bundle;

class k
  implements Runnable
{
  final int a;
  final Bundle b;
  
  k(ResultReceiver paramResultReceiver, int paramInt, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = paramBundle;
  }
  
  public void run()
  {
    this.c.a(this.a, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */