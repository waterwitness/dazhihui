package com.iflytek.speech;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UnderstanderResult
  implements Parcelable
{
  public static final Parcelable.Creator<UnderstanderResult> CREATOR = new UnderstanderResult.1();
  private String mXml = "";
  
  public UnderstanderResult(Parcel paramParcel)
  {
    this.mXml = paramParcel.readString();
  }
  
  public UnderstanderResult(String paramString)
  {
    if (paramString != null) {
      this.mXml = paramString;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getResultString()
  {
    return this.mXml;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mXml);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\UnderstanderResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */