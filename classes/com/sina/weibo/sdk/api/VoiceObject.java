package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.sina.weibo.sdk.b.a;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceObject
  extends BaseMediaObject
{
  public static final Parcelable.Creator<VoiceObject> CREATOR = new f();
  public String g;
  public String h;
  public String i;
  public String j;
  public int k;
  
  public VoiceObject() {}
  
  public VoiceObject(Parcel paramParcel)
  {
    super(paramParcel);
    this.h = paramParcel.readString();
    this.i = paramParcel.readString();
    this.j = paramParcel.readString();
    this.k = paramParcel.readInt();
  }
  
  public boolean a()
  {
    if (!super.a()) {
      return false;
    }
    if ((this.i != null) && (this.i.length() > 512))
    {
      a.b("Weibo.VoiceObject", "checkArgs fail, dataUrl is invalid");
      return false;
    }
    if ((this.j != null) && (this.j.length() > 512))
    {
      a.b("Weibo.VoiceObject", "checkArgs fail, dataHdUrl is invalid");
      return false;
    }
    if (this.k <= 0)
    {
      a.b("Weibo.VoiceObject", "checkArgs fail, duration is invalid");
      return false;
    }
    return true;
  }
  
  protected String b()
  {
    try
    {
      Object localObject = new JSONObject();
      if (!TextUtils.isEmpty(this.g)) {
        ((JSONObject)localObject).put("extra_key_defaulttext", this.g);
      }
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException) {}
    return "";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
    paramParcel.writeInt(this.k);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\VoiceObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */