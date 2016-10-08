package com.android.dazhihui.ui.model.stock;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class HotVideoPushVo
  implements Parcelable
{
  public static final Parcelable.Creator<HotVideoPushVo> CREATOR = new HotVideoPushVo.1();
  String ClickUrl;
  String OwnerAccountImg;
  String OwnerName;
  
  public HotVideoPushVo() {}
  
  protected HotVideoPushVo(Parcel paramParcel)
  {
    this.OwnerName = paramParcel.readString();
    this.OwnerAccountImg = paramParcel.readString();
    this.ClickUrl = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getClickUrl()
  {
    return this.ClickUrl;
  }
  
  public String getOwnerAccountImg()
  {
    return this.OwnerAccountImg;
  }
  
  public String getOwnerName()
  {
    return this.OwnerName;
  }
  
  public void setClickUrl(String paramString)
  {
    this.ClickUrl = paramString;
  }
  
  public void setOwnerAccountImg(String paramString)
  {
    this.OwnerAccountImg = paramString;
  }
  
  public void setOwnerName(String paramString)
  {
    this.OwnerName = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.OwnerName);
    paramParcel.writeString(this.OwnerAccountImg);
    paramParcel.writeString(this.ClickUrl);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HotVideoPushVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */