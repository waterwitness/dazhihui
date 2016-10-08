package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver
  extends BroadcastReceiver
{
  private static final SparseArray<PowerManager.WakeLock> a = new SparseArray();
  private static int b = 1;
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\content\WakefulBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */