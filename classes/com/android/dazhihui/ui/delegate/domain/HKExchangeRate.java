package com.android.dazhihui.ui.delegate.domain;

public class HKExchangeRate
{
  private String currency;
  private String exchangeRate;
  
  public HKExchangeRate() {}
  
  public HKExchangeRate(String paramString1, String paramString2)
  {
    this.currency = paramString1;
    this.exchangeRate = paramString2;
  }
  
  public String getCurrency()
  {
    return this.currency;
  }
  
  public String getExchangeRate()
  {
    return this.exchangeRate;
  }
  
  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }
  
  public void setExchangeRate(String paramString)
  {
    this.exchangeRate = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\domain\HKExchangeRate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */