package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.v;
import com.android.dazhihui.w;

final class to
  implements v
{
  to(Context paramContext) {}
  
  public void a(String paramString)
  {
    w.a();
    paramString = f.b + paramString + "&source=5&DZHSPECIAL=796";
    m.a().a(paramString.substring(paramString.indexOf("/UserCenter")));
    Intent localIntent = new Intent(this.a, BrowserActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramString);
    localBundle.putString("names", this.a.getResources().getString(2131166397));
    localBundle.putInt("api_type", 3);
    localIntent.putExtras(localBundle);
    this.a.startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */