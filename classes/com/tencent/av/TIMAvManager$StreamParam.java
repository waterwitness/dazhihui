package com.tencent.av;

import java.util.ArrayList;
import java.util.List;

public class TIMAvManager$StreamParam
{
  String chnldescr = "";
  String chnlname = "";
  String chnlpasswd = "";
  TIMAvManager.StreamEncode encode;
  boolean isRecord = false;
  boolean isWatermark = false;
  List<TIMAvManager.RateType> rates = new ArrayList();
  TIMAvManager.SDKType sdktype = TIMAvManager.SDKType.Normal;
  TIMAvManager.ʻ stype = TIMAvManager.ʻ.a;
  long watermarkId = 0L;
  
  public TIMAvManager$StreamParam(TIMAvManager paramTIMAvManager) {}
  
  private void setSourceType(TIMAvManager.ʻ paramʻ)
  {
    this.stype = paramʻ;
  }
  
  public void addRateType(TIMAvManager.RateType paramRateType)
  {
    this.rates.add(paramRateType);
  }
  
  public void enableRecord(boolean paramBoolean)
  {
    this.isRecord = paramBoolean;
  }
  
  public void enableWatermark(boolean paramBoolean)
  {
    this.isWatermark = paramBoolean;
  }
  
  public void setChannelDescr(String paramString)
  {
    this.chnldescr = paramString;
  }
  
  public void setChannelName(String paramString)
  {
    this.chnlname = paramString;
  }
  
  public void setChannelPasswd(String paramString)
  {
    this.chnlpasswd = paramString;
  }
  
  public void setEncode(TIMAvManager.StreamEncode paramStreamEncode)
  {
    this.encode = paramStreamEncode;
  }
  
  public void setSdkType(TIMAvManager.SDKType paramSDKType)
  {
    this.sdktype = paramSDKType;
  }
  
  public void setWatermarkId(long paramLong)
  {
    this.watermarkId = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\TIMAvManager$StreamParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */