package com.android.dazhihui.ui.model.stock;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MarketVo
  implements Parcelable
{
  public static final Parcelable.Creator<MarketVo> CREATOR = new MarketVo.1();
  int countid = -1;
  String handleType = "1";
  boolean hasStockList;
  boolean isMenu;
  int mCurrentChild = 0;
  int marketId = -1;
  String menuflag = "1";
  String name;
  int requestId;
  int type;
  String urlPath = "";
  
  public MarketVo(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this.name = paramString;
    this.isMenu = paramBoolean1;
    this.hasStockList = paramBoolean2;
    this.requestId = paramInt;
  }
  
  public MarketVo(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    this.name = paramString;
    this.isMenu = paramBoolean1;
    this.hasStockList = paramBoolean2;
    this.requestId = paramInt1;
    this.marketId = paramInt2;
  }
  
  public MarketVo(String paramString1, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, String paramString2, String paramString3, int paramInt3, String paramString4)
  {
    this.name = paramString1;
    this.isMenu = paramBoolean1;
    this.hasStockList = paramBoolean2;
    this.requestId = paramInt1;
    this.marketId = paramInt2;
    this.handleType = paramString2;
    this.menuflag = paramString3;
    this.countid = paramInt3;
    this.urlPath = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getCountid()
  {
    return this.countid;
  }
  
  public int getCurrentChild()
  {
    return this.mCurrentChild;
  }
  
  public String getHandleType()
  {
    return this.handleType;
  }
  
  public int getId()
  {
    return this.requestId;
  }
  
  public int getMarketId()
  {
    return this.marketId;
  }
  
  public String getMenuflag()
  {
    return this.menuflag;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public String getUrlPath()
  {
    return this.urlPath;
  }
  
  public boolean hasStockList()
  {
    return this.hasStockList;
  }
  
  public boolean isMenu()
  {
    return this.isMenu;
  }
  
  public void setCurrentChild(int paramInt)
  {
    this.mCurrentChild = paramInt;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.name);
    paramParcel.writeBooleanArray(new boolean[] { this.isMenu, this.hasStockList });
    paramParcel.writeInt(this.requestId);
    paramParcel.writeInt(this.mCurrentChild);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MarketVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */