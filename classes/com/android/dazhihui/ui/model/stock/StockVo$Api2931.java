package com.android.dazhihui.ui.model.stock;

import java.util.Vector;

public class StockVo$Api2931
{
  public int OrgBuyNum;
  public int OrgSellNum;
  public int buyBBigRate;
  public int buyBigRate;
  public int buyMiddleRate;
  public int buyNum4Large;
  public int buyNum4Middle;
  public int buyNum4Small;
  public Vector<StockVo.Api2931Item> items = new Vector();
  public int position;
  public int sellBBigRate;
  public int sellBigRate;
  public int sellMiddleRate;
  public int sellNum4Large;
  public int sellNum4Middle;
  public int sellNum4Small;
  
  public StockVo$Api2931(StockVo paramStockVo) {}
  
  public void clear()
  {
    this.buyMiddleRate = 0;
    this.buyBigRate = 0;
    this.buyBBigRate = 0;
    this.sellMiddleRate = 0;
    this.sellBigRate = 0;
    this.sellBBigRate = 0;
    this.OrgBuyNum = 0;
    this.OrgSellNum = 0;
    this.buyNum4Large = 0;
    this.buyNum4Middle = 0;
    this.sellNum4Middle = 0;
    this.buyNum4Small = 0;
    this.sellNum4Small = 0;
    this.position = 0;
    this.items.clear();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockVo$Api2931.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */