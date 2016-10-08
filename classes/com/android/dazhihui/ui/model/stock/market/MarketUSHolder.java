package com.android.dazhihui.ui.model.stock.market;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MarketUSHolder
  implements Serializable
{
  private static final long serialVersionUID = -1640699586244210105L;
  protected HashMap<Integer, ArrayList<MarketStockVo>> mList = new HashMap();
  
  public MarketUSHolder(HashMap<Integer, ArrayList<MarketStockVo>> paramHashMap)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\MarketUSHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */