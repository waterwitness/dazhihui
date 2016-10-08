package com.android.dazhihui.ui.screen;

import android.os.Bundle;
import com.android.dazhihui.ui.widget.adv.ac;
import com.android.dazhihui.ui.widget.adv.c;

public class AdvertBaseActivity
  extends BaseActivity
{
  public c Z;
  
  public void a(ac paramac)
  {
    if (this.Z == null) {
      this.Z = new c();
    }
    this.Z.a(paramac);
  }
  
  public void b(ac paramac)
  {
    if (this.Z != null) {
      this.Z.b(paramac);
    }
  }
  
  protected void init(Bundle paramBundle) {}
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.Z != null) {
      this.Z.b();
    }
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.Z != null) {
      this.Z.c();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.Z != null) {
      this.Z.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\AdvertBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */