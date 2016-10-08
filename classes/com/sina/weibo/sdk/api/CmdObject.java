package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class CmdObject
  extends BaseMediaObject
{
  public static final Parcelable.Creator<CmdObject> CREATOR = new a();
  public String g;
  
  public CmdObject() {}
  
  public CmdObject(Parcel paramParcel)
  {
    this.g = paramParcel.readString();
  }
  
  public boolean a()
  {
    return (this.g != null) && (this.g.length() != 0) && (this.g.length() <= 1024);
  }
  
  protected String b()
  {
    return "";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\CmdObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */