package com.android.dazhihui.ui.model.stock;

public class WarningItem
{
  private float mBelowPrice;
  private float mDayFall;
  private int mDayFallNum;
  private float mDayHandOver;
  private int mDayHandOverNum;
  private float mDayIncrease;
  private int mDayIncreaseNum;
  private int mDayLandMine;
  private int mDecimalNum;
  private float mOverPrice;
  private String mWarningCode;
  private int mWarningId;
  private String mWarningName;
  
  public int getWarningSetNum()
  {
    int j = 0;
    if (this.mOverPrice >= 0.0F) {
      j = 1;
    }
    int i = j;
    if (this.mBelowPrice >= 0.0F) {
      i = j + 1;
    }
    j = i;
    if (this.mDayIncrease >= 0.0F) {
      j = i + 1;
    }
    i = j;
    if (this.mDayFall >= 0.0F) {
      i = j + 1;
    }
    j = i;
    if (this.mDayHandOver >= 0.0F) {
      j = i + 1;
    }
    return j;
  }
  
  public float getmBelowPrice()
  {
    return this.mBelowPrice;
  }
  
  public float getmDayFall()
  {
    return this.mDayFall;
  }
  
  public int getmDayFallNum()
  {
    return this.mDayFallNum;
  }
  
  public float getmDayHandOver()
  {
    return this.mDayHandOver;
  }
  
  public int getmDayHandOverNum()
  {
    return this.mDayHandOverNum;
  }
  
  public float getmDayIncrease()
  {
    return this.mDayIncrease;
  }
  
  public int getmDayIncreaseNum()
  {
    return this.mDayIncreaseNum;
  }
  
  public int getmDayLandMine()
  {
    return this.mDayLandMine;
  }
  
  public int getmDecimalNum()
  {
    return this.mDecimalNum;
  }
  
  public float getmOverPrice()
  {
    return this.mOverPrice;
  }
  
  public String getmWarningCode()
  {
    return this.mWarningCode;
  }
  
  public int getmWarningId()
  {
    return this.mWarningId;
  }
  
  public String getmWarningName()
  {
    return this.mWarningName;
  }
  
  public boolean isWarningValid()
  {
    return (getWarningSetNum() > 0) || (this.mDayLandMine != 0);
  }
  
  public void setmBelowPrice(float paramFloat)
  {
    this.mBelowPrice = paramFloat;
  }
  
  public void setmDayFall(float paramFloat)
  {
    this.mDayFall = paramFloat;
  }
  
  public void setmDayFallNum(int paramInt)
  {
    this.mDayFallNum = paramInt;
  }
  
  public void setmDayHandOver(float paramFloat)
  {
    this.mDayHandOver = paramFloat;
  }
  
  public void setmDayHandOverNum(int paramInt)
  {
    this.mDayHandOverNum = paramInt;
  }
  
  public void setmDayIncrease(float paramFloat)
  {
    this.mDayIncrease = paramFloat;
  }
  
  public void setmDayIncreaseNum(int paramInt)
  {
    this.mDayIncreaseNum = paramInt;
  }
  
  public void setmDayLandMine(int paramInt)
  {
    this.mDayLandMine = paramInt;
  }
  
  public void setmDecimalNum(int paramInt)
  {
    this.mDecimalNum = paramInt;
  }
  
  public void setmOverPrice(float paramFloat)
  {
    this.mOverPrice = paramFloat;
  }
  
  public void setmWarningCode(String paramString)
  {
    this.mWarningCode = paramString;
  }
  
  public void setmWarningId(int paramInt)
  {
    this.mWarningId = paramInt;
  }
  
  public void setmWarningName(String paramString)
  {
    this.mWarningName = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\WarningItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */