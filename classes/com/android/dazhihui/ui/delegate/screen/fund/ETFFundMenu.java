package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class ETFFundMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private String[] a;
  private DzhHeader b;
  
  private String[] a()
  {
    if (this.a == null) {
      this.a = getResources().getStringArray(2131361792);
    }
    return this.a;
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.b.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.d = getResources().getString(2131165225);
    paramct.a = 40;
    paramct.p = this;
  }
  
  public void d(String paramString)
  {
    Bundle localBundle = new Bundle();
    Resources localResources = getResources();
    localBundle.putString("name_Mark", paramString);
    if (paramString.equals(localResources.getString(2131165198)))
    {
      localBundle.putInt("id_Mark", 0);
      startActivity(ETFFundEntrust.class, localBundle);
    }
    do
    {
      return;
      if (paramString.equals(localResources.getString(2131165200)))
      {
        localBundle.putInt("id_Mark", 1);
        startActivity(ETFFundEntrust.class, localBundle);
        return;
      }
      if (paramString.equals(localResources.getString(2131165199)))
      {
        startActivity(ETFFundCancel.class, localBundle);
        return;
      }
      if (paramString.equals(localResources.getString(2131165196)))
      {
        localBundle.putInt("id_Mark", 2);
        startActivity(ETFFundEntrust.class, localBundle);
        return;
      }
      if (paramString.equals(localResources.getString(2131165197)))
      {
        localBundle.putInt("id_Mark", 3);
        startActivity(ETFFundEntrust.class, localBundle);
        return;
      }
      if (paramString.equals(localResources.getString(2131165194)))
      {
        localBundle.putInt("id_Mark", 4);
        startActivity(ETFFundEntrust.class, localBundle);
        return;
      }
    } while (!paramString.equals(localResources.getString(2131165195)));
    localBundle.putInt("id_Mark", 5);
    startActivity(ETFFundEntrust.class, localBundle);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903483);
    this.b = ((DzhHeader)findViewById(2131558513));
    this.b.a(this, this);
    paramBundle = (ListView)findViewById(2131560746);
    paramBundle.setAdapter(new a(this, a()));
    paramBundle.setOnItemClickListener(new s(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ETFFundMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */