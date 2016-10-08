package com.android.dazhihui.ui.model.stock.market;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MarkePlateHolder
  implements Serializable
{
  private static final long serialVersionUID = -7633030213189060253L;
  protected HashMap<Integer, ArrayList<MarketStockVo>> mList = new HashMap();
  
  public MarkePlateHolder(HashMap<Integer, ArrayList<MarketStockVo>> paramHashMap)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\MarkePlateHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */