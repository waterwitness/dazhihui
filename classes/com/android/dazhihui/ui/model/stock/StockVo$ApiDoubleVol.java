package com.android.dazhihui.ui.model.stock;

public class StockVo$ApiDoubleVol
{
  public long captialVol;
  public int cp;
  public int currentPositon;
  public int dayHight;
  public int dayLow;
  public int isHasUpPriceIndex;
  public boolean isTp;
  public boolean isUpPricVol = false;
  public boolean isUpVol = false;
  public int pb;
  public int pbRange;
  public int perPrice;
  public long perVol;
  public int period;
  public int range;
  public int standerVol;
  public long sumVol;
  
  public StockVo$ApiDoubleVol(StockVo paramStockVo) {}
  
  private void clear()
  {
    this.period = 0;
    this.sumVol = 0L;
    this.captialVol = 0L;
    this.cp = 0;
    this.currentPositon = 0;
    this.perVol = 0L;
    this.standerVol = 0;
    this.dayHight = 0;
    this.dayLow = 0;
    this.perPrice = 0;
    this.isUpVol = false;
    this.isUpPricVol = false;
    this.pb = 0;
    this.pbRange = 0;
    this.range = 0;
    this.isHasUpPriceIndex = 0;
    this.isTp = false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockVo$ApiDoubleVol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */