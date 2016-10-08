package com.android.dazhihui.ui.model.stock;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class StockVo$1
  implements Parcelable.Creator<StockVo>
{
  public StockVo createFromParcel(Parcel paramParcel)
  {
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    int i = paramParcel.readInt();
    String str3 = paramParcel.readString();
    String str4 = paramParcel.readString();
    String str5 = paramParcel.readString();
    boolean[] arrayOfBoolean = new boolean[1];
    paramParcel.readBooleanArray(arrayOfBoolean);
    return new StockVo(str1, str2, i, arrayOfBoolean[0], str3, str4, str5);
  }
  
  public StockVo[] newArray(int paramInt)
  {
    return new StockVo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockVo$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */