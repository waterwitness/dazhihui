package com.iflytek.thirdparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ay
  implements Parcelable
{
  public static final Parcelable.Creator<ay> CREATOR = new ay.1();
  private String a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  
  public ay() {}
  
  public ay(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.g = paramString6;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */