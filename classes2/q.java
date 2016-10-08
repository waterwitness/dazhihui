import android.hardware.Camera.Size;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class q
{
  private static q b = null;
  private r a = new r(this);
  
  public static q a()
  {
    if (b == null)
    {
      q localq = new q();
      b = localq;
      return localq;
    }
    return b;
  }
  
  public final Camera.Size a(List<Camera.Size> paramList, int paramInt1, int paramInt2)
  {
    Collections.sort(paramList, this.a);
    Iterator localIterator = paramList.iterator();
    paramInt1 = 0;
    label28:
    Camera.Size localSize;
    do
    {
      do
      {
        if (!localIterator.hasNext()) {
          return (Camera.Size)paramList.get(paramInt1 - 1);
        }
        localSize = (Camera.Size)localIterator.next();
        paramInt2 = paramInt1 + 1;
        paramInt1 = paramInt2;
      } while (localSize.width <= 1024);
      paramInt1 = paramInt2;
    } while (localSize.height <= 768);
    if (Math.abs(localSize.width / localSize.height - 1.33F) <= 0.03D) {}
    for (int i = 1;; i = 0)
    {
      paramInt1 = paramInt2;
      if (i == 0) {
        break;
      }
      Log.i("CameraUtil", "最终设置图片尺寸:w = " + localSize.width + "h = " + localSize.height);
      paramInt1 = paramInt2;
      break label28;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */