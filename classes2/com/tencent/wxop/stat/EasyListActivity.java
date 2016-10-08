package com.tencent.wxop.stat;

import android.app.ListActivity;

public class EasyListActivity
  extends ListActivity
{
  protected void onPause()
  {
    super.onPause();
    e.m(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    e.l(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\EasyListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */