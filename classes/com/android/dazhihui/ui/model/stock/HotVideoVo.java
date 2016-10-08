package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;
import java.util.ArrayList;

public class HotVideoVo
  implements Serializable
{
  String Period;
  String ShowType;
  ArrayList<HotVideoPushStockVo> stocklist;
  
  public String getPeriod()
  {
    return this.Period;
  }
  
  public String getShowType()
  {
    return this.ShowType;
  }
  
  public ArrayList<HotVideoPushStockVo> getStocklist()
  {
    return this.stocklist;
  }
  
  public void setPeriod(String paramString)
  {
    this.Period = paramString;
  }
  
  public void setShowType(String paramString)
  {
    this.ShowType = paramString;
  }
  
  public void setStocklist(ArrayList<HotVideoPushStockVo> paramArrayList)
  {
    this.stocklist = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HotVideoVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */