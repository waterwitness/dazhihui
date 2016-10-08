package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.Iterator;

public class AdvertVo
{
  public ArrayList<AdvertVo.AdvertData> data;
  public AdvertVo.AdvHeader header;
  public String jsonUrl;
  public String updataTime;
  
  public AdvertVo.AdvertData getAdvert(int paramInt)
  {
    Iterator localIterator = this.data.iterator();
    while (localIterator.hasNext())
    {
      AdvertVo.AdvertData localAdvertData = (AdvertVo.AdvertData)localIterator.next();
      if (Integer.parseInt(localAdvertData.pcode) == paramInt) {
        return localAdvertData;
      }
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\AdvertVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */