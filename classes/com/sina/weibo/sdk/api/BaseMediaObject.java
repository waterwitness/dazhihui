package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.b.a;

public abstract class BaseMediaObject
  implements Parcelable
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public byte[] f;
  
  public BaseMediaObject() {}
  
  public BaseMediaObject(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.createByteArray();
  }
  
  protected boolean a()
  {
    if ((this.a == null) || (this.a.length() > 512))
    {
      a.b("Weibo.BaseMediaObject", "checkArgs fail, actionUrl is invalid");
      return false;
    }
    if ((this.c == null) || (this.c.length() > 512))
    {
      a.b("Weibo.BaseMediaObject", "checkArgs fail, identify is invalid");
      return false;
    }
    if ((this.f == null) || (this.f.length > 32768))
    {
      a.b("Weibo.BaseMediaObject", "checkArgs fail, thumbData is invalid,size is " + this.f.length + "! more then 32768.");
      return false;
    }
    if ((this.d == null) || (this.d.length() > 512))
    {
      a.b("Weibo.BaseMediaObject", "checkArgs fail, title is invalid");
      return false;
    }
    if ((this.e == null) || (this.e.length() > 1024))
    {
      a.b("Weibo.BaseMediaObject", "checkArgs fail, description is invalid");
      return false;
    }
    return true;
  }
  
  protected abstract String b();
  
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
    paramParcel.writeByteArray(this.f);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\BaseMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */