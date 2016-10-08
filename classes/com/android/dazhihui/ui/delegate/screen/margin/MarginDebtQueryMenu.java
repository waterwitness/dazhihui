package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.d;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class MarginDebtQueryMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private static String a = "未偿还融资负债";
  private static String b = "未偿还融券负债";
  private static String c = "已偿还融资负债";
  private static String d = "已偿还融券负债";
  private String[] e = { a, b, c, d };
  private DzhHeader f;
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    setContentView(2130903509);
    this.f = ((DzhHeader)findViewById(2131558513));
    this.f.a(this, this);
    ListView localListView = (ListView)findViewById(2131558780);
    localListView.setAdapter(new d(this, this.e));
    localListView.setOnItemClickListener(new aw(this));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "合约查询";
    paramct.p = this;
  }
  
  public void d(String paramString)
  {
    Bundle localBundle = new Bundle();
    if (paramString.equals(a))
    {
      localBundle.putInt("category", 12126);
      startActivity(MarginQuery.class, localBundle);
    }
    do
    {
      return;
      if (paramString.equals(b))
      {
        localBundle.putInt("category", 12028);
        startActivity(MarginQuery.class, localBundle);
        return;
      }
      if (paramString.equals(c))
      {
        localBundle.putInt("category", 12322);
        startActivity(MarginQuery.class, localBundle);
        return;
      }
    } while (!paramString.equals(d));
    localBundle.putInt("category", 12324);
    startActivity(MarginQuery.class, localBundle);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.f = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarginDebtQueryMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */