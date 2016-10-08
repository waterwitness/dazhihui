package com.android.dazhihui.ui.screen.stock;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.g;

class st
  implements View.OnClickListener
{
  st(sk paramsk) {}
  
  public void onClick(View paramView)
  {
    paramView = g.a().A();
    Object localObject = g.a().B();
    if (paramView != null)
    {
      if (localObject != null) {}
      try
      {
        Intent localIntent = new Intent();
        localIntent.setComponent(new ComponentName(paramView, (String)localObject));
        this.a.startActivity(localIntent);
        return;
      }
      catch (Exception paramView)
      {
        paramView.printStackTrace();
      }
      localObject = this.a.getActivity().getPackageManager();
      new Intent();
      paramView = ((PackageManager)localObject).getLaunchIntentForPackage(paramView);
      if (paramView != null)
      {
        this.a.startActivity(paramView);
        return;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\st.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */