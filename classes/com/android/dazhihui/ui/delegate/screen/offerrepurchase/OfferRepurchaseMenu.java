package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.a.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.electronsign.CashBaoElectronSign;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.Hashtable;

public class OfferRepurchaseMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  com.android.dazhihui.a.b.u a;
  private String[] b;
  private DzhHeader c;
  
  private String[] a()
  {
    if (this.b == null) {
      this.b = getResources().getStringArray(2131361793);
    }
    return this.b;
  }
  
  private void b()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12376");
    localh.a("1026", "1");
    this.a = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.a);
    a(this.a, true);
  }
  
  private void d(String paramString)
  {
    if (paramString.equals(getString(2131165201))) {
      b();
    }
    do
    {
      return;
      if (paramString.equals(getString(2131165202)))
      {
        a(this, 12190, paramString);
        return;
      }
      if (paramString.equals(getString(2131165206)))
      {
        a(this, 12190, paramString);
        return;
      }
      if (paramString.equals(getString(2131165210)))
      {
        a(this, 12198, paramString);
        return;
      }
      if (paramString.equals(getString(2131165217)))
      {
        a(this, 12202, paramString, false);
        return;
      }
      if (paramString.equals(getString(2131165203)))
      {
        b(this, 12194, paramString);
        return;
      }
      if (paramString.equals(getString(2131165214)))
      {
        a(this, 12248, paramString);
        return;
      }
      if (paramString.equals(getString(2131165211)))
      {
        a(this, 12410, paramString);
        return;
      }
      if (paramString.equals(getString(2131165220)))
      {
        a(this, 12194, paramString);
        return;
      }
      if (paramString.equals(getString(2131165218)))
      {
        a(this, 12418, paramString);
        return;
      }
      if (paramString.equals(getString(2131165204)))
      {
        a(this, 12284, paramString);
        return;
      }
      if (paramString.equals(getString(2131165208)))
      {
        a(this, 12340, paramString);
        return;
      }
      if (paramString.equals(getString(2131165207)))
      {
        a(this, 12290, paramString);
        return;
      }
      if (paramString.equals(getString(2131165209)))
      {
        a(this, 12198, paramString);
        return;
      }
      if (paramString.equals(getString(2131165215)))
      {
        a(this, 12202, paramString);
        return;
      }
      if (paramString.equals(getString(2131165213)))
      {
        a(this, 12402, paramString);
        return;
      }
      if (paramString.equals(getString(2131165212)))
      {
        a(this, 12286, paramString);
        return;
      }
      if (paramString.equals(getString(2131165216)))
      {
        a(this, 12406, paramString);
        return;
      }
      if (paramString.equals(getString(2131165221)))
      {
        a(this, 12210, paramString);
        return;
      }
      if (paramString.equals(getString(2131165205)))
      {
        a(this, 12978, paramString);
        return;
      }
    } while (!paramString.equals(getString(2131165219)));
    a(this, 12402, paramString);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a(DelegateBaseActivity paramDelegateBaseActivity, int paramInt, String paramString)
  {
    paramDelegateBaseActivity = new Bundle();
    paramDelegateBaseActivity.putInt("id_Mark", paramInt);
    paramDelegateBaseActivity.putString("name_Mark", paramString);
    startActivity(OfferRepurchaseQuirys.class, paramDelegateBaseActivity);
  }
  
  public void a(DelegateBaseActivity paramDelegateBaseActivity, int paramInt, String paramString, boolean paramBoolean)
  {
    paramDelegateBaseActivity = new Bundle();
    paramDelegateBaseActivity.putInt("id_Mark", paramInt);
    paramDelegateBaseActivity.putString("name_Mark", paramString);
    paramDelegateBaseActivity.putBoolean("History_Mark", paramBoolean);
    startActivity(OfferRepurchaseQuirys.class, paramDelegateBaseActivity);
  }
  
  public void b(DelegateBaseActivity paramDelegateBaseActivity, int paramInt, String paramString)
  {
    paramDelegateBaseActivity = new Bundle();
    paramDelegateBaseActivity.putInt("id_Mark", paramInt);
    paramDelegateBaseActivity.putString("name_Mark", paramString);
    paramDelegateBaseActivity.putBoolean("Trade_Mark", true);
    startActivity(OfferRepurchaseQuirys.class, paramDelegateBaseActivity);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.c.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.d = getResources().getString(2131165226);
    paramct.a = 40;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.c = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if ((com.android.dazhihui.ui.delegate.b.u.a(paramj, this)) && (paramh == this.a))
    {
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (paramh.b()) {
        break label54;
      }
      c(paramh.d());
    }
    label54:
    do
    {
      do
      {
        return;
      } while (paramh.g() <= 0);
      paramh = paramh.f();
    } while ((paramh == null) || (paramh.length != 1));
    String str8 = paramh[0];
    if (n.t((String)str8.get("1863")).equals("1"))
    {
      c("\t\t已签署");
      return;
    }
    if (n.t((String)str8.get("1871")).equals("0"))
    {
      c("不允许签约");
      return;
    }
    paramh = n.t((String)str8.get("1021"));
    n.t((String)str8.get("1862"));
    n.t((String)str8.get("1043"));
    paramj = n.t((String)str8.get("1819"));
    String str1 = n.t((String)str8.get("1090"));
    String str2 = n.t((String)str8.get("1115"));
    String str3 = n.t((String)str8.get("1864"));
    String str4 = n.t((String)str8.get("1865"));
    n.t((String)str8.get("1866"));
    String str5 = n.t((String)str8.get("1867"));
    String str6 = n.t((String)str8.get("1800"));
    String str7 = n.t((String)str8.get("6007"));
    str8 = n.t((String)str8.get("6008"));
    Bundle localBundle = new Bundle();
    localBundle.putInt("id_Mark", 12376);
    localBundle.putString("id_fundcode", str1);
    localBundle.putString("id_fundcompany", str2);
    localBundle.putString("id_document", str5);
    localBundle.putString("id_callARG", str6);
    localBundle.putString("id_protocol", str3);
    localBundle.putString("id_prompttext", str4);
    localBundle.putString("id_signtype", paramj);
    localBundle.putString("id_accounttype", paramh);
    localBundle.putString("id_limits", str7);
    localBundle.putString("id_captial", str8);
    startActivity(CashBaoElectronSign.class, localBundle);
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903483);
    this.c = ((DzhHeader)findViewById(2131558513));
    this.c.a(this, this);
    paramBundle = (ListView)findViewById(2131560746);
    a();
    paramBundle.setAdapter(new a(this, this.b));
    paramBundle.setOnItemClickListener(new h(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\OfferRepurchaseMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */