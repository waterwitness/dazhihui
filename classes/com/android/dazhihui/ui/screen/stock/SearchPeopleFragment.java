package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.g;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.model.stock.SearchPeopleVo.SearchPeopleValue;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.y;
import java.io.PrintStream;
import java.util.ArrayList;

public class SearchPeopleFragment
  extends a
  implements AdapterView.OnItemClickListener
{
  View a;
  View b;
  ListView c;
  EditText d;
  View e;
  View f;
  rg g;
  final int h = 20;
  TextView i;
  View j;
  ArrayList<SearchPeopleVo.SearchPeopleValue> k;
  String l = null;
  ArrayList<HotVideoPushStockVo> m = new ArrayList();
  ListView n;
  re o;
  View p;
  View q;
  TextView r;
  private final Handler s = new Handler();
  
  private void b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Intent localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", paramString);
      localBundle.putString("names", "主页");
      localIntent.putExtras(localBundle);
      localIntent.setClass(getActivity(), BrowserActivity.class);
      getActivity().startActivity(localIntent);
    }
  }
  
  public void a()
  {
    this.m.clear();
    Object localObject = RightTopManager.getInstance().getData();
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = ((HotVideoVo)localObject).getStocklist();
      if ((localObject != null) && (((ArrayList)localObject).size() >= 0))
      {
        int i1 = 0;
        while ((i1 < ((ArrayList)localObject).size()) && (!((HotVideoPushStockVo)((ArrayList)localObject).get(i1)).getOwnerName().equals("更多")))
        {
          this.m.add(((ArrayList)localObject).get(i1));
          i1 += 1;
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString.trim())) {
      return;
    }
    if (TextUtils.isEmpty(this.l)) {
      this.l = o.a().c();
    }
    paramString = f.ao + "input=" + paramString + "&maxcount=" + 20 + "&token=" + this.l;
    System.out.println("search url" + paramString);
    new rc(this).execute(new String[] { paramString });
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    switch (rd.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.a.setBackgroundColor(getResources().getColor(2131493542));
      this.b.setBackgroundResource(2130838739);
      this.e.setBackgroundColor(getResources().getColor(2131493660));
      this.q.setBackgroundColor(getResources().getColor(2131493547));
      this.r.setTextColor(getResources().getColor(2131493549));
      this.d.setTextColor(-1);
      this.c.setDivider(new ColorDrawable(-14143937));
      this.c.setDividerHeight(1);
      this.g.notifyDataSetChanged();
      this.n.setDivider(new ColorDrawable(-14143937));
      this.n.setDividerHeight(1);
      this.o.notifyDataSetChanged();
      return;
    }
    this.a.setBackgroundColor(getResources().getColor(2131493605));
    this.b.setBackgroundResource(2130838820);
    this.e.setBackgroundColor(-789513);
    this.q.setBackgroundResource(2130838813);
    this.r.setTextColor(-10066330);
    this.d.setTextColor(-14540254);
    this.c.setDivider(new ColorDrawable(-3684404));
    this.c.setDividerHeight(1);
    this.g.notifyDataSetChanged();
    this.n.setDivider(new ColorDrawable(-3684404));
    this.n.setDividerHeight(1);
    this.o.notifyDataSetChanged();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903403, paramViewGroup, true);
    this.c = ((ListView)this.a.findViewById(2131558568));
    this.b = this.a.findViewById(2131560289);
    this.d = ((EditText)this.a.findViewById(2131560290));
    this.e = this.a.findViewById(2131558861);
    this.f = this.a.findViewById(2131560291);
    this.j = this.a.findViewById(2131560295);
    this.i = ((TextView)this.a.findViewById(2131560296));
    this.f.setOnClickListener(new qz(this));
    this.n = ((ListView)this.a.findViewById(2131560309));
    this.p = paramLayoutInflater.inflate(2130903396, null);
    paramLayoutInflater = new AbsListView.LayoutParams(-1, -2);
    this.p.setLayoutParams(paramLayoutInflater);
    this.n.addHeaderView(this.p);
    a();
    this.o = new re(this);
    this.n.setAdapter(this.o);
    this.n.setOnItemClickListener(new ra(this));
    this.q = this.p.findViewById(2131560284);
    this.r = ((TextView)this.p.findViewById(2131560285));
    if ((this.m == null) || (this.m.size() <= 0)) {
      this.n.setVisibility(8);
    }
    for (;;)
    {
      this.g = new rg(this);
      this.c.setAdapter(this.g);
      this.c.setOnItemClickListener(this);
      changeLookFace(g.a().b());
      this.d.addTextChangedListener(new rb(this));
      return this.a;
      this.n.setVisibility(0);
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    b(((SearchPeopleVo.SearchPeopleValue)this.k.get(paramInt)).homePageURL);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SearchPeopleFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */