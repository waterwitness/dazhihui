package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.ExtraObject;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DragListView;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.Iterator;
import java.util.Vector;

public class SelfStockEditScreen
  extends BaseActivity
  implements View.OnClickListener, cp, cs
{
  private Vector<SelfStock> a = new Vector();
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private View f;
  private View g;
  private CheckBox h;
  private DragListView i;
  private sh j;
  private int k;
  private SelfSelectedStockManager l;
  private sg m = sg.a;
  private String n = "";
  private View o;
  private DzhHeader p;
  private BroadcastReceiver q = new rz(this);
  
  private void d()
  {
    if (this.m == sg.a) {
      c();
    }
    while (this.m != sg.b) {
      return;
    }
    this.l.setBrowseStockVector(this.a);
  }
  
  private void e()
  {
    if (this.m == sg.a)
    {
      this.b.setSelected(true);
      this.c.setSelected(false);
    }
    for (;;)
    {
      b();
      return;
      if (this.m == sg.b)
      {
        this.b.setSelected(false);
        this.c.setSelected(true);
      }
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      a();
      continue;
      startActivity(new Intent(this, SearchStockScreen.class));
    }
  }
  
  public void a()
  {
    if (this.j.getCount() > 0)
    {
      showDialog(5000);
      return;
    }
    showDialog(5001);
  }
  
  public void b()
  {
    if (this.m == sg.a)
    {
      this.g.setVisibility(8);
      this.a = this.l.getSelfStockVectorByShallowCopy();
    }
    for (;;)
    {
      this.j.notifyDataSetChanged();
      return;
      if (this.m == sg.b)
      {
        this.g.setVisibility(0);
        this.a = this.l.getBrowserStockVectorByShallowCopy();
      }
    }
  }
  
  public void c()
  {
    int i3 = 0;
    Vector localVector = this.l.getSelfStockVector();
    int i1;
    Object localObject;
    if (localVector.size() != this.a.size())
    {
      i1 = 1;
      if (i1 != 0)
      {
        localVector = new Vector();
        localObject = this.a.iterator();
        while (((Iterator)localObject).hasNext()) {
          localVector.add(((SelfStock)((Iterator)localObject).next()).getCode());
        }
      }
    }
    else
    {
      int i2 = 0;
      for (;;)
      {
        i1 = i3;
        if (i2 >= this.a.size()) {
          break;
        }
        if (!((SelfStock)this.a.get(i2)).getCode().equals(((SelfStock)localVector.get(i2)).getCode()))
        {
          i1 = 1;
          break;
        }
        i2 += 1;
      }
      localObject = this.l.requestSyncSelfStockToServerByType(2, localVector);
      SelfSelectedStockManager.ExtraObject localExtraObject = new SelfSelectedStockManager.ExtraObject();
      localExtraObject.subprotocol = 105;
      localExtraObject.action = 2;
      localExtraObject.obj = localVector;
      ((com.android.dazhihui.a.b.m)localObject).a(localExtraObject);
      this.l.setLocalSelfStockVector(this.a);
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (sf.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.o != null)
        {
          this.i.setDivider(new ColorDrawable(getResources().getColor(2131493545)));
          this.i.setDividerHeight(1);
          this.o.setBackgroundColor(getResources().getColor(2131493542));
          this.b.setBackgroundResource(2130838744);
          this.b.setTextColor(getResources().getColorStateList(2130838741));
          this.c.setBackgroundResource(2130838745);
          this.c.setTextColor(getResources().getColorStateList(2130838741));
          this.d.setTextColor(getResources().getColor(2131493509));
          this.e.setTextColor(getResources().getColor(2131493511));
          this.f.setBackgroundResource(2130838743);
        }
        if (this.p != null) {
          this.p.a(paramy);
        }
      } while (this.j == null);
      this.j.a(paramy);
      return;
      if (this.o != null)
      {
        this.i.setDivider(new ColorDrawable(getResources().getColor(2131493608)));
        this.i.setDividerHeight(1);
        this.o.setBackgroundColor(getResources().getColor(2131493605));
        this.b.setBackgroundResource(2130838824);
        this.b.setTextColor(getResources().getColorStateList(2130838822));
        this.c.setBackgroundResource(2130838825);
        this.c.setTextColor(getResources().getColorStateList(2130838822));
        this.d.setTextColor(getResources().getColor(2131493572));
        this.e.setTextColor(getResources().getColor(2131493574));
        this.f.setBackgroundResource(2130838823);
      }
      if (this.p != null) {
        this.p.a(paramy);
      }
    } while (this.j == null);
    this.j.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 10280;
    paramct.d = paramContext.getString(2131165439);
    paramct.f = paramContext.getResources().getDrawable(2130838129);
    paramct.k = paramContext.getResources().getDrawable(2130838095);
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903409);
    if (SelfSelectedStockManager.getInstance().getSelfStockVectorSize() <= 0) {
      SelfSelectedStockManager.getInstance().loadDataFromLocal();
    }
    this.o = findViewById(2131560184);
    this.l = com.android.dazhihui.ui.a.m.a().b();
    this.p = ((DzhHeader)findViewById(2131558567));
    this.p.a(this, this);
    this.p.setOnHeaderButtonClickListener(this);
    this.b = ((TextView)findViewById(2131560356));
    this.c = ((TextView)findViewById(2131560357));
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.i = ((DragListView)findViewById(2131560165));
    this.j = new sh(this, this);
    this.i.setAdapter(this.j);
    this.g = findViewById(2131560358);
    this.f = this.g.findViewById(2131560359);
    this.d = ((TextView)this.g.findViewById(2131560360));
    this.e = ((TextView)this.g.findViewById(2131560362));
    this.h = ((CheckBox)this.g.findViewById(2131560361));
    this.h.setOnClickListener(this);
    boolean bool = SelfSelectedStockManager.getBoolean("selfstock_show_latest", DzhApplication.a().getApplicationContext(), "selfstock_show_latest", true);
    this.h.setChecked(bool);
    e();
    registerReceiver(this.q, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    changeLookFace(this.mLookFace);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.b) {
      if (this.m != sg.a)
      {
        d();
        this.m = sg.a;
        e();
      }
    }
    do
    {
      do
      {
        return;
        if (paramView != this.c) {
          break;
        }
      } while (this.m == sg.b);
      d();
      this.m = sg.b;
      e();
      return;
    } while (paramView != this.h);
    if (this.h.isChecked())
    {
      SelfSelectedStockManager.setBoolean("selfstock_show_latest", DzhApplication.a().getApplicationContext(), "selfstock_show_latest", true);
      return;
    }
    SelfSelectedStockManager.setBoolean("selfstock_show_latest", DzhApplication.a().getApplicationContext(), "selfstock_show_latest", false);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    if (paramInt == 5000)
    {
      if (this.m == sg.a) {
        this.n = getString(2131165403);
      }
      for (;;)
      {
        return new AlertDialog.Builder(this).setIcon(2130837525).setMessage(this.n).setPositiveButton(2131165363, new sb(this)).setNegativeButton(2131165331, new sa(this)).create();
        if (this.m == sg.b) {
          this.n = getString(2131165402);
        }
      }
    }
    if (paramInt == 5001)
    {
      if (this.m == sg.a) {
        this.n = getString(2131165532);
      }
      for (;;)
      {
        return new AlertDialog.Builder(this).setIcon(2130837525).setMessage(this.n).setPositiveButton(2131165363, new sc(this)).create();
        if (this.m == sg.b) {
          this.n = getString(2131165531);
        }
      }
    }
    if (this.m == sg.a) {
      this.n = getString(2131165407);
    }
    for (;;)
    {
      return new AlertDialog.Builder(this).setIcon(2130837525).setMessage(this.n).setPositiveButton(2131165363, new se(this)).setNegativeButton(2131165331, new sd(this)).create();
      if (this.m == sg.b) {
        this.n = getString(2131165406);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(this.q);
  }
  
  public void onPause()
  {
    d();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    b();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SelfStockEditScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */