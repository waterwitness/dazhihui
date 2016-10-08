package com.android.dazhihui.ui.model.stock;

import android.os.SystemClock;
import android.util.Log;
import com.android.dazhihui.ui.screen.stock.oy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class AdvertUpPullVo
  implements Serializable
{
  private static final long GET_JSON_UP_PULL_INTERVALS = 900000L;
  public static long sUpdataTime = 0L;
  private static final long serialVersionUID = 6183416139066197511L;
  public AdvertUpPullVo.Data data;
  public AdvertUpPullVo.AdvHeader header;
  public int homeIndex = 0;
  public int minuteIndex = 0;
  
  public static boolean isNeedUpdate()
  {
    AdvertUpPullVo localAdvertUpPullVo = oy.a().b();
    boolean bool;
    if ((localAdvertUpPullVo == null) || (localAdvertUpPullVo.data == null) || (localAdvertUpPullVo.data.upPull == null)) {
      bool = true;
    }
    for (;;)
    {
      long l = SystemClock.elapsedRealtime();
      if (bool) {
        Log.i("GUH", "uppull json=" + l);
      }
      return bool;
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = localAdvertUpPullVo.data.upPull.iterator();
      while (localIterator.hasNext())
      {
        AdvertUpPullVo.AdvertUpPullData localAdvertUpPullData = (AdvertUpPullVo.AdvertUpPullData)localIterator.next();
        if ((localAdvertUpPullData != null) && ("1".equals(localAdvertUpPullData.type))) {
          localArrayList1.add(localAdvertUpPullData);
        } else if ((localAdvertUpPullData != null) && ("2".equals(localAdvertUpPullData.type))) {
          localArrayList2.add(localAdvertUpPullData);
        }
      }
      if ((localAdvertUpPullVo.homeIndex >= localArrayList1.size()) || (localAdvertUpPullVo.homeIndex < 0)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\AdvertUpPullVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */