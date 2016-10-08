package com.iflytek.speech;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VerifierResult
  implements Parcelable
{
  public static final Parcelable.Creator<VerifierResult> CREATOR = new VerifierResult.1();
  public String dcs = "";
  private String json = "";
  public boolean ret = false;
  public int rgn = 0;
  public String source = "";
  public String sst;
  public int suc = 0;
  public String trs = "";
  public String vid = "";
  
  public VerifierResult(Parcel paramParcel)
  {
    this.json = paramParcel.readString();
  }
  
  public VerifierResult(String paramString)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\VerifierResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */