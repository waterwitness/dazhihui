package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class WebpageObject
  extends BaseMediaObject
{
  public static final Parcelable.Creator<WebpageObject> CREATOR = new g();
  public String g;
  
  public WebpageObject() {}
  
  public WebpageObject(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public boolean a()
  {
    return super.a();
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
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\WebpageObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */