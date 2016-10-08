package com.iflytek.speech;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RecognizerResult
  implements Parcelable
{
  public static final Parcelable.Creator<RecognizerResult> CREATOR = new RecognizerResult.1();
  private String json = "";
  
  public RecognizerResult(Parcel paramParcel)
  {
    this.json = paramParcel.readString();
  }
  
  public RecognizerResult(String paramString)
  {
    if (paramString != null) {
      this.json = paramString;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getResultString()
  {
    return this.json;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.json);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\RecognizerResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */