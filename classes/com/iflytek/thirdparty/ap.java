package com.iflytek.thirdparty;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;

public class ap
  extends Dialog
{
  protected aq a = null;
  private ap.a b = new ap.1(this);
  
  public ap(Context paramContext)
  {
    super(paramContext);
  }
  
  public boolean destroy()
  {
    if (isShowing()) {
      return false;
    }
    boolean bool = this.a.d();
    this.a = null;
    return bool;
  }
  
  public void dismiss()
  {
    this.a.c();
    super.dismiss();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(this.a);
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
  }
  
  public void show()
  {
    setCanceledOnTouchOutside(true);
    this.a.a(this.b);
    this.a.b();
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */