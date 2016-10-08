package com.android.dazhihui.ui.model.stock;

import java.util.Vector;

public class LargeTradeInfo
{
  private int allNumber;
  private float[] buyAll = new float[3];
  private String mAveBuyHand;
  private String mAveSellHand;
  private int[] mBigBuy = new int[2];
  private int[] mBigSell = new int[2];
  private int mBuyNum;
  private float[] mBuyRatio = new float[4];
  private int mFoodNum;
  private String mInFlow;
  private int mSellNum;
  private float[] mSellRatio = new float[4];
  private int mSpitNum;
  private Vector<StockVo.Api2931Item> mTradeElems;
  private float[] sellAll = new float[3];
  
  public LargeTradeInfo() {}
  
  public LargeTradeInfo(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, int[] paramArrayOfInt1, float[] paramArrayOfFloat1, int[] paramArrayOfInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, int paramInt5, Vector<StockVo.Api2931Item> paramVector)
  {
    this.mInFlow = paramString1;
    this.mBuyNum = paramInt1;
    this.mSellNum = paramInt2;
    this.mAveBuyHand = paramString2;
    this.mAveSellHand = paramString3;
    this.mBigBuy = paramArrayOfInt1;
    this.mBuyRatio = paramArrayOfFloat1;
    this.mBigSell = paramArrayOfInt2;
    this.mSellRatio = paramArrayOfFloat2;
    this.mFoodNum = paramInt3;
    this.mSpitNum = paramInt4;
    this.mTradeElems = paramVector;
    this.allNumber = paramInt5;
  }
  
  public LargeTradeInfo(String paramString, int[] paramArrayOfInt1, float[] paramArrayOfFloat1, int[] paramArrayOfInt2, float[] paramArrayOfFloat2, int paramInt1, int paramInt2, int paramInt3, Vector<StockVo.Api2931Item> paramVector)
  {
    this.mInFlow = paramString;
    this.mBigBuy = paramArrayOfInt1;
    this.mBuyRatio = paramArrayOfFloat1;
    this.mBigSell = paramArrayOfInt2;
    this.mSellRatio = paramArrayOfFloat2;
    this.mFoodNum = paramInt1;
    this.mSpitNum = paramInt2;
    this.mTradeElems = paramVector;
    this.allNumber = paramInt3;
  }
  
  public int getAllNumber()
  {
    return this.allNumber;
  }
  
  public String getAveBuyHand()
  {
    return this.mAveBuyHand;
  }
  
  public String getAveSellHand()
  {
    return this.mAveSellHand;
  }
  
  public int[] getBigBuy()
  {
    return this.mBigBuy;
  }
  
  public int[] getBigSell()
  {
    return this.mBigSell;
  }
  
  public float[] getBuyAll()
  {
    return this.buyAll;
  }
  
  public int getBuyNum()
  {
    return this.mBuyNum;
  }
  
  public float[] getBuyRatio()
  {
    return this.mBuyRatio;
  }
  
  public int getFoodNum()
  {
    return this.mFoodNum;
  }
  
  public String getInFlow()
  {
    return this.mInFlow;
  }
  
  public float[] getSellAll()
  {
    return this.sellAll;
  }
  
  public int getSellNum()
  {
    return this.mSellNum;
  }
  
  public float[] getSellRatio()
  {
    return this.mSellRatio;
  }
  
  public int getSpitNum()
  {
    return this.mSpitNum;
  }
  
  public Vector<StockVo.Api2931Item> getTradeElems()
  {
    return this.mTradeElems;
  }
  
  public void setAllNumber(int paramInt)
  {
    this.allNumber = paramInt;
  }
  
  public void setAveBuyHand(String paramString)
  {
    this.mAveBuyHand = paramString;
  }
  
  public void setAveSellHand(String paramString)
  {
    this.mAveSellHand = paramString;
  }
  
  public void setBigBuy(int[] paramArrayOfInt)
  {
    this.mBigBuy = paramArrayOfInt;
  }
  
  public void setBigSell(int[] paramArrayOfInt)
  {
    this.mBigSell = paramArrayOfInt;
  }
  
  public void setBuyAll(float[] paramArrayOfFloat)
  {
    this.buyAll = paramArrayOfFloat;
  }
  
  public void setBuyNum(int paramInt)
  {
    this.mBuyNum = paramInt;
  }
  
  public void setBuyRatio(float[] paramArrayOfFloat)
  {
    this.mBuyRatio = paramArrayOfFloat;
  }
  
  public void setFoodNum(int paramInt)
  {
    this.mFoodNum = paramInt;
  }
  
  public void setInFlow(String paramString)
  {
    this.mInFlow = paramString;
  }
  
  public void setSellAll(float[] paramArrayOfFloat)
  {
    this.sellAll = paramArrayOfFloat;
  }
  
  public void setSellNum(int paramInt)
  {
    this.mSellNum = paramInt;
  }
  
  public void setSellRatio(float[] paramArrayOfFloat)
  {
    this.mSellRatio = paramArrayOfFloat;
  }
  
  public void setSpitNum(int paramInt)
  {
    this.mSpitNum = paramInt;
  }
  
  public void setTradeElems(Vector<StockVo.Api2931Item> paramVector)
  {
    this.mTradeElems = paramVector;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LargeTradeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */