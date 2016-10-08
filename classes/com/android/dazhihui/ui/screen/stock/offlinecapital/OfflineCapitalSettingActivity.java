package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.OfflineCapitalDragListView;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class OfflineCapitalSettingActivity
  extends BaseActivity
  implements View.OnClickListener
{
  public static String i = null;
  public static String j = null;
  public static int k;
  EditText a;
  String b;
  View c;
  View d;
  View e;
  View f;
  OfflineCapitalDragListView g;
  ab h;
  private View l;
  private RelativeLayout m;
  private ArrayList<ag> n;
  private d o;
  
  private void a()
  {
    if ((this.n == null) || (this.n.size() <= 0))
    {
      this.d.setVisibility(0);
      this.e.setVisibility(4);
      this.f.setVisibility(0);
      return;
    }
    this.d.setVisibility(4);
    this.e.setVisibility(0);
    this.f.setVisibility(8);
  }
  
  private Boolean b()
  {
    this.b = this.a.getText().toString().trim();
    if ((this.b == null) || (this.b.equals("")))
    {
      Toast.makeText(this, "请输入剩余资金", 0).show();
      return Boolean.valueOf(false);
    }
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext())
    {
      ag localag = (ag)localIterator.next();
      if (localag.m() < 100)
      {
        Toast.makeText(this, "持仓不能小于100", 0).show();
        return Boolean.valueOf(false);
      }
      if ((localag.n() == null) || (localag.n().equals("")))
      {
        Toast.makeText(this, "请输入成本价", 0).show();
        return Boolean.valueOf(false);
      }
      if (Float.valueOf(localag.n()).floatValue() <= 1.0E-6D)
      {
        Toast.makeText(this, "成本价大于0", 0).show();
        return Boolean.valueOf(false);
      }
    }
    return Boolean.valueOf(true);
  }
  
  Boolean a(ArrayList<ag> paramArrayList, String paramString)
  {
    Object localObject = paramArrayList;
    if (paramArrayList == null) {
      localObject = new ArrayList();
    }
    paramArrayList = ((ArrayList)localObject).iterator();
    while (paramArrayList.hasNext()) {
      if (paramString.equals(((ag)paramArrayList.next()).a())) {
        return Boolean.valueOf(true);
      }
    }
    return Boolean.valueOf(false);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (z.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.m.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.m.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903361);
    this.o = d.a();
    this.n = this.o.k();
    this.b = this.o.b("offline_capital_shengyuzijin");
    this.o.g();
    this.m = ((RelativeLayout)findViewById(2131558585));
    this.l = findViewById(2131558586);
    this.g = ((OfflineCapitalDragListView)findViewById(2131560165));
    this.d = findViewById(2131560160);
    this.e = findViewById(2131560161);
    this.f = findViewById(2131560166);
    this.c = findViewById(2131560167);
    this.a = ((EditText)findViewById(2131560159));
    if (this.b != null) {
      this.a.setText(this.b);
    }
    this.l.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.h = new ab(this, this);
    this.g.setAdapter(this.h);
    a();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131558586: 
      do
      {
        return;
      } while (!b().booleanValue());
      paramView = new Date(System.currentTimeMillis());
      paramView = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(paramView);
      this.b = this.a.getText().toString().trim();
      this.o.a("offline_capital_shengyuzijin", this.b);
      this.o.a("offline_capital_update_time", paramView);
      this.o.a("offline_capital_state", 1);
      this.o.j();
      int i1 = this.n.size() - 1;
      while (i1 >= 0)
      {
        this.o.a((ag)this.n.get(i1));
        i1 -= 1;
      }
      this.o.g();
      startActivity(new Intent(this, OfflineCapitalDetailActivity.class));
      finish();
      return;
    }
    paramView = new Bundle();
    paramView.putInt("index_type", 3);
    startActivity(SearchStockScreen.class, paramView);
  }
  
  protected void onResume()
  {
    if ((i != null) && (j != null))
    {
      System.out.println("selectOfflineStockCode = " + i);
      System.out.println("selectOfflineStockName = " + j);
      System.out.println("selectOfflineStockType = " + k);
      if (!a(this.n, i).booleanValue())
      {
        ag localag = new ag();
        localag.a(i);
        localag.b(j);
        localag.a(k);
        localag.d(1);
        this.n.add(localag);
        this.h.notifyDataSetChanged();
      }
      i = null;
      j = null;
    }
    a();
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\OfflineCapitalSettingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */