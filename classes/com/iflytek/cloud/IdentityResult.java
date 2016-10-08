package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IdentityResult
  implements Parcelable
{
  public static final Parcelable.Creator<IdentityResult> CREATOR = new IdentityResult.1();
  private String a = "";
  
  private IdentityResult(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }
  
  public IdentityResult(String paramString)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\IdentityResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */