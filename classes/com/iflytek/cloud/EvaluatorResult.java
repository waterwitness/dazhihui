package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class EvaluatorResult
  implements Parcelable
{
  public static final Parcelable.Creator<EvaluatorResult> CREATOR = new EvaluatorResult.1();
  private String a = "";
  
  private EvaluatorResult(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }
  
  public EvaluatorResult(String paramString)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\EvaluatorResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */