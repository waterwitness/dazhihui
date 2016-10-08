package com.android.dazhihui.ui.screen.stock;

import org.json.JSONObject;

class gy
  extends ha
{
  gy(gx paramgx) {}
  
  protected void a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return;
    }
    gx.a(this.a, paramJSONObject.optString("openid"));
    paramJSONObject = paramJSONObject.optString("access_token");
    gx.a(this.a, gx.a(this.a), paramJSONObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */