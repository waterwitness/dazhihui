package com.android.dazhihui.ui.screen;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.ui.widget.ba;
import com.android.dazhihui.ui.widget.bc;

public abstract class ai
  extends a
{
  private Dialog a;
  
  public void a(Class<?> paramClass)
  {
    a(paramClass, null);
  }
  
  public void a(Class<?> paramClass, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(getActivity(), paramClass);
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    startActivity(localIntent);
  }
  
  public Dialog m()
  {
    if (this.a == null) {
      this.a = ba.a(getActivity(), bc.b);
    }
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */