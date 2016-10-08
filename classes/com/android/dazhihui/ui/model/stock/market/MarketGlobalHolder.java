package com.android.dazhihui.ui.model.stock.market;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MarketGlobalHolder
  implements Serializable
{
  private static final long serialVersionUID = -3248265285417984073L;
  private HashMap<Integer, ArrayList<MarketStockVo>> mList = new HashMap();
  
  public MarketGlobalHolder(HashMap<Integer, ArrayList<MarketStockVo>> paramHashMap)
  {
    if (paramHashMap != null) {
      this.mList = paramHashMap;
    }
  }
  
  public HashMap<Integer, ArrayList<MarketStockVo>> getStkInfoList()
  {
    return this.mList;
  }
  
  public void setList(HashMap<Integer, ArrayList<MarketStockVo>> paramHashMap)
  {
    this.mList = paramHashMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\MarketGlobalHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */