package com.example.cairh_sjkh_it;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent();
    paramBundle.setClass(this, com.cairh.app.sjkh.MainActivity.class);
    startActivity(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\example\cairh_sjkh_it\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */