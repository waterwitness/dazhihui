package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WakeuperResult
  implements Parcelable
{
  public static final Parcelable.Creator<WakeuperResult> CREATOR = new WakeuperResult.1();
  private String a = "";
  
  public WakeuperResult(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }
  
  public WakeuperResult(String paramString)
  {
    if (paramString != null) {
      this.a = paramString;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getResultString()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\WakeuperResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */