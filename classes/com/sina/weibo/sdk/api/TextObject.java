package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sina.weibo.sdk.b.a;

public class TextObject
  extends BaseMediaObject
{
  public static final Parcelable.Creator<TextObject> CREATOR = new d();
  public String g;
  
  public TextObject() {}
  
  public TextObject(Parcel paramParcel)
  {
    this.g = paramParcel.readString();
  }
  
  public boolean a()
  {
    if ((this.g == null) || (this.g.length() == 0) || (this.g.length() > 1024))
    {
      a.b("Weibo.TextObject", "checkArgs fail, text is invalid");
      return false;
    }
    return true;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\TextObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */