package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.a;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundMutualAIPMenu
  extends BaseActivity
  implements cp, cs
{
  public String a;
  private int b;
  private int c;
  private String[] d = { "基金定投开户", "基金定投销户" };
  private DzhHeader e;
  
  private void a(String paramString)
  {
    if (paramString.equals("基金定投开户")) {
      FundMutualAIPOpen.a(this, this.b, paramString);
    }
    while (!paramString.equals("基金定投销户")) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt("mark_id", this.c);
    localBundle.putInt("mark_trade", 12084);
    localBundle.putString("mark_name", paramString);
    startActivity(FundMutualAIPQuirys.class, localBundle);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.a;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.e = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.b = paramBundle.getInt("MutualAIPOpen_flag");
      this.a = paramBundle.getString("mark_name");
      if (this.b == 11916) {
        this.c = 12086;
      }
    }
    for (;;)
    {
      setContentView(2130903510);
      paramBundle = (ListView)findViewById(2131560919);
      this.e = ((DzhHeader)findViewById(2131558513));
      this.e.a(this, this);
      paramBundle.setAdapter(new a(this, this.d));
      paramBundle.setOnItemClickListener(new ba(this));
      return;
      if (this.b == 12484)
      {
        this.c = 11118;
        continue;
        this.b = 11916;
        this.c = 12086;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundMutualAIPMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */