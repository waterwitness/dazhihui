package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.ui.model.stock.ContributeItem;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.ContributeView;
import java.util.Vector;

public class at
  extends e
  implements i
{
  private StockChartScreen a;
  private String b;
  private String c;
  private ContributeView d;
  private View e;
  private ScrollView f;
  
  private void a()
  {
    new x();
    Object localObject = new x(2929);
    byte[] arrayOfByte = this.b.substring(0, 2).getBytes();
    ((x)localObject).b(arrayOfByte[0]);
    ((x)localObject).b(arrayOfByte[1]);
    ((x)localObject).b(0);
    ((x)localObject).c(0);
    ((x)localObject).c(20);
    localObject = new m((x)localObject);
    ((m)localObject).a(Integer.valueOf(0));
    ((m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((h)localObject);
    localObject = new x(2929);
    arrayOfByte = this.b.substring(0, 2).getBytes();
    ((x)localObject).b(arrayOfByte[0]);
    ((x)localObject).b(arrayOfByte[1]);
    ((x)localObject).b(1);
    ((x)localObject).c(0);
    ((x)localObject).c(20);
    localObject = new m((x)localObject);
    ((m)localObject).a(Integer.valueOf(1));
    ((m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((h)localObject);
  }
  
  public View getScroolView()
  {
    return this.f;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramj = ((o)paramj).h();
    Object localObject = paramj.b;
    if ((localObject != null) && (paramj.a == 2929))
    {
      paramj = new q((byte[])localObject);
      int j = paramj.e();
      localObject = new Vector();
      int i = 0;
      while (i < j)
      {
        String str1 = paramj.l();
        String str2 = paramj.l();
        String str3 = b.a(paramj.h(), 2);
        ((Vector)localObject).add(new ContributeItem(str1, str2, b.b(paramj.d() + 10000, 10000), str3));
        i += 1;
      }
      if (((Integer)paramh.j()).intValue() != 0) {
        this.d.setMaxContrs((Vector)localObject);
      }
    }
    else
    {
      return;
    }
    this.d.setMinContrs((Vector)localObject);
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getBundle();
    this.b = paramBundle.getString("code");
    this.c = paramBundle.getString("name");
    this.a = ((StockChartScreen)getActivity());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramLayoutInflater.inflate(2130903084, null);
    this.f = ((ScrollView)this.e.findViewById(2131558765));
    this.d = ((ContributeView)this.e.findViewById(2131558766));
    this.d.setOnClickListener(new au(this));
    return this.e;
  }
  
  public void onResume()
  {
    super.onResume();
    if (com.android.dazhihui.g.a().b() == y.b) {
      this.e.setBackgroundColor(getResources().getColor(2131493677));
    }
    for (;;)
    {
      this.d.a();
      a();
      return;
      this.e.setBackgroundColor(-15657703);
    }
  }
  
  public void refresh()
  {
    a();
  }
  
  public void show()
  {
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */