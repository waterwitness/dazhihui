package com.tencent.av;

public class TIMAvManager$LiveUrl
{
  int encodeType;
  int rate = 0;
  String url;
  
  public TIMAvManager$LiveUrl(TIMAvManager paramTIMAvManager) {}
  
  public int getEncode()
  {
    return this.encodeType;
  }
  
  public TIMAvManager.RateType getRateType()
  {
    TIMAvManager.RateType[] arrayOfRateType = TIMAvManager.RateType.values();
    int j = arrayOfRateType.length;
    int i = 0;
    while (i < j)
    {
      TIMAvManager.RateType localRateType = arrayOfRateType[i];
      if (localRateType.getValue() == this.rate) {
        return localRateType;
      }
      i += 1;
    }
    return TIMAvManager.RateType.RATE_TYPE_ORIGINAL;
  }
  
  public String getUrl()
  {
    if (this.url == null) {
      return "";
    }
    return this.url;
  }
  
  void setEncode(int paramInt)
  {
    this.encodeType = paramInt;
  }
  
  void setRateType(int paramInt)
  {
    this.rate = paramInt;
  }
  
  void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\TIMAvManager$LiveUrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */