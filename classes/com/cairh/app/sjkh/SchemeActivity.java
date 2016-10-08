package com.cairh.app.sjkh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SchemeActivity
  extends Activity
{
  private String uri;
  
  private String getParameter(String paramString)
  {
    int i = this.uri.indexOf(paramString);
    if (i == -1) {
      return null;
    }
    paramString = this.uri.substring(i + paramString.length() + 1, this.uri.length());
    Log.v("newStr", paramString);
    int j = paramString.indexOf("&");
    i = j;
    if (j == -1) {
      i = paramString.length();
    }
    paramString = paramString.substring(0, i);
    Log.v("value", paramString);
    return paramString;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, MainActivity.class);
    this.uri = getIntent().getDataString();
    int i = -1;
    try
    {
      int j = Integer.parseInt(getParameter("type"));
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        String str2;
        String str3;
        String str4;
        String str5;
        localException.printStackTrace();
      }
    }
    str1 = getParameter("mobileNo");
    str2 = getParameter("channel");
    str3 = getParameter("username");
    str4 = getParameter("password");
    str5 = getParameter("prodCode");
    paramBundle.putExtra("type", i);
    paramBundle.putExtra("mobileNo", str1);
    paramBundle.putExtra("channel", str2);
    paramBundle.putExtra("username", str3);
    paramBundle.putExtra("password", str4);
    paramBundle.putExtra("prodCode", str5);
    startActivity(paramBundle);
    finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\SchemeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */