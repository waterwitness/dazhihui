package com.android.dazhihui.ui.model.stock;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MarketVo$1
  implements Parcelable.Creator<MarketVo>
{
  public MarketVo createFromParcel(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    boolean[] arrayOfBoolean = new boolean[2];
    paramParcel.readBooleanArray(arrayOfBoolean);
    int i = paramParcel.readInt();
    int j = paramParcel.readInt();
    paramParcel = new MarketVo(str, arrayOfBoolean[0], arrayOfBoolean[1], i);
    paramParcel.setCurrentChild(j);
    return paramParcel;
  }
  
  public MarketVo[] newArray(int paramInt)
  {
    return new MarketVo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MarketVo$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */