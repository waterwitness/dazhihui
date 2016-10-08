package com.android.dazhihui.ui.delegate.domain;

public class HKMarketInfo
{
  private String marketId = null;
  private String marketName = null;
  private String offerName = null;
  private String offerType = null;
  
  public HKMarketInfo() {}
  
  public HKMarketInfo(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.marketId = paramString1;
    this.marketName = paramString2;
    this.offerType = paramString3;
    this.offerName = paramString4;
  }
  
  public String getMarketId()
  {
    return this.marketId;
  }
  
  public String getMarketName()
  {
    return this.marketName;
  }
  
  public String getOfferName()
  {
    return this.offerName;
  }
  
  public String getOfferType()
  {
    return this.offerType;
  }
  
  public void setMarketId(String paramString)
  {
    this.marketId = paramString;
  }
  
  public void setMarketName(String paramString)
  {
    this.marketName = paramString;
  }
  
  public void setOfferName(String paramString)
  {
    this.offerName = paramString;
  }
  
  public void setOfferType(String paramString)
  {
    this.offerType = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\domain\HKMarketInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */