package com.android.dazhihui.ui.model.stock;

import android.util.Log;
import com.android.dazhihui.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RightTopManager
{
  private static RightTopManager s_Instance;
  private HotVideoVo data;
  private RightTopManager.RecevierHotVideoDataListener mRecevierHotVideoDataLiatener;
  private List<RightTopManager.RecevierHotVideoDataListener> mRecevierHotVideoDataListenerList = new ArrayList();
  
  private RightTopManager()
  {
    Log.i("ilvb", "右上主播数据manager constructor");
  }
  
  public static RightTopManager getInstance()
  {
    if (s_Instance == null) {}
    try
    {
      if (s_Instance == null) {
        s_Instance = new RightTopManager();
      }
      return s_Instance;
    }
    finally {}
  }
  
  public void addRecevierHotVideoDataListenerList(RightTopManager.RecevierHotVideoDataListener paramRecevierHotVideoDataListener)
  {
    if (!this.mRecevierHotVideoDataListenerList.contains(paramRecevierHotVideoDataListener)) {
      this.mRecevierHotVideoDataListenerList.add(paramRecevierHotVideoDataListener);
    }
  }
  
  public void clearData()
  {
    this.data = null;
  }
  
  public HotVideoVo getData()
  {
    return this.data;
  }
  
  public void registerRecevierHotVideoDataListener(RightTopManager.RecevierHotVideoDataListener paramRecevierHotVideoDataListener)
  {
    this.mRecevierHotVideoDataLiatener = paramRecevierHotVideoDataListener;
  }
  
  public void removeRecevierHotVideoDataListenerList(RightTopManager.RecevierHotVideoDataListener paramRecevierHotVideoDataListener)
  {
    if (this.mRecevierHotVideoDataListenerList.contains(paramRecevierHotVideoDataListener)) {
      this.mRecevierHotVideoDataListenerList.remove(paramRecevierHotVideoDataListener);
    }
  }
  
  public void setData(HotVideoVo paramHotVideoVo)
  {
    if (paramHotVideoVo != null)
    {
      this.data = paramHotVideoVo;
      Object localObject;
      if (this.mRecevierHotVideoDataListenerList.size() > 0)
      {
        localObject = this.mRecevierHotVideoDataListenerList.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((RightTopManager.RecevierHotVideoDataListener)((Iterator)localObject).next()).recevierData();
        }
      }
      Log.i("ilvb", "右上主播列表 获得数据");
      if (g.a().L())
      {
        paramHotVideoVo = paramHotVideoVo.getStocklist();
        if ((paramHotVideoVo != null) && (paramHotVideoVo.size() > 0)) {
          paramHotVideoVo = paramHotVideoVo.iterator();
        }
        while (paramHotVideoVo.hasNext())
        {
          localObject = (HotVideoPushStockVo)paramHotVideoVo.next();
          if (localObject != null)
          {
            Log.i("ilvb", "右上主播数据 " + ((HotVideoPushStockVo)localObject).toString());
            continue;
            Log.i("ilvb", "右上主播列表 获得数据->下架了");
          }
        }
      }
      return;
    }
    Log.e("ilvb", "右上主播列表没有数据");
  }
  
  public void unregisterRecevierHotVideoDataListener()
  {
    this.mRecevierHotVideoDataLiatener = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\RightTopManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */