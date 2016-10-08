package com.tencent.av.camera;

import android.hardware.Camera.Size;
import java.util.Comparator;

public class CameraSizeComparator
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (Camera.Size)paramObject1;
    paramObject2 = (Camera.Size)paramObject2;
    if (((Camera.Size)paramObject1).width < ((Camera.Size)paramObject2).width) {}
    do
    {
      return -1;
      if (((Camera.Size)paramObject1).width > ((Camera.Size)paramObject2).width) {
        return 1;
      }
    } while (((Camera.Size)paramObject1).height < ((Camera.Size)paramObject2).height);
    if (((Camera.Size)paramObject1).height > ((Camera.Size)paramObject2).height) {
      return 1;
    }
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\CameraSizeComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */