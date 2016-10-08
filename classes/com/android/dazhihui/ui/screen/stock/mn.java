package com.android.dazhihui.ui.screen.stock;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.service.t;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.BigImgNews;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.ArrayList;
import java.util.List;

public class mn
  extends com.android.dazhihui.ui.screen.a
{
  public List<NewsPersonalizedVo.BigImgNews> a = new ArrayList();
  t b = new mr(this);
  private com.android.dazhihui.c.b.a c;
  private String d;
  private boolean e;
  private LayoutInflater f;
  private ListView g;
  private PageLoadTip h;
  private mv i;
  private my j;
  private boolean k = false;
  private boolean l = false;
  private int m = 1;
  private View n;
  private int o;
  private LoadAndRefreshView p;
  
  public static mn a(String paramString, boolean paramBoolean, int paramInt)
  {
    mn localmn = new mn();
    Bundle localBundle = new Bundle();
    localBundle.putString("titleName", paramString);
    localBundle.putBoolean("isNeedCache", paramBoolean);
    localBundle.putInt("mode", paramInt);
    localmn.setArguments(localBundle);
    return localmn;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    this.k = true;
    DzhPushService.a(this.b);
    if (this.o == DzhPushService.P)
    {
      DzhPushService.a(paramInt);
      return;
    }
    DzhPushService.b(paramInt);
  }
  
  public void a(NewsPersonalizedVo paramNewsPersonalizedVo)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)this.f.inflate(2130903160, null, false);
    ViewFlow localViewFlow = (ViewFlow)localRelativeLayout.findViewById(2131559235);
    this.n = localRelativeLayout.findViewById(2131559234);
    this.n.setVisibility(8);
    this.j = new my(this, getActivity(), localViewFlow, paramNewsPersonalizedVo, this.a);
    localViewFlow.setAdapter(this.j);
    localViewFlow.setFlowIndicator((CircleFlowIndicator)localRelativeLayout.findViewById(2131559236));
    localViewFlow.setOnItemClickListener(this.j);
    localViewFlow.setFlogTouch(true);
    this.g.addHeaderView(localRelativeLayout);
    addAdvert(new mu(this, 0));
    this.g.setAdapter(this.i);
    this.j.b(null);
  }
  
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void loadMoreData()
  {
    this.m += 1;
    a(this.m, false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = DzhApplication.a().b();
    if (getArguments() != null)
    {
      this.d = getArguments().getString("titleName");
      this.e = getArguments().getBoolean("isNeedCache");
      this.o = getArguments().getInt("mode", DzhPushService.P);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.f = paramLayoutInflater;
    paramBundle = paramLayoutInflater.inflate(2130903344, paramViewGroup, false);
    this.h = ((PageLoadTip)paramBundle.findViewById(2131558569));
    this.p = ((LoadAndRefreshView)paramBundle.findViewById(2131560105));
    this.p.setOnFooterLoadListener(new mo(this));
    this.p.setOnHeaderRefreshListener(new mp(this));
    this.p.a(true, true);
    this.g = ((ListView)paramBundle.findViewById(2131558568));
    paramLayoutInflater = null;
    if (this.e)
    {
      paramViewGroup = (NewsPersonalizedVo)this.c.a(this.d, new mq(this));
      paramLayoutInflater = paramViewGroup;
      if (paramViewGroup == null)
      {
        this.h.b();
        paramLayoutInflater = paramViewGroup;
      }
    }
    for (;;)
    {
      paramViewGroup = paramLayoutInflater;
      if (paramLayoutInflater == null) {
        paramViewGroup = new NewsPersonalizedVo();
      }
      this.i = new mv(getActivity(), this.d, paramViewGroup);
      this.g.setOnItemClickListener(this.i);
      this.g.setDivider(new ColorDrawable(-1513240));
      this.g.setDividerHeight(1);
      a(paramViewGroup);
      return paramBundle;
      this.h.b();
    }
  }
  
  public void onDestroy()
  {
    DzhPushService.b(this.b);
    super.onDestroy();
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (this.k) {
        break label31;
      }
      this.l = false;
      this.m = 1;
      a(this.m, true);
    }
    label31:
    while (!this.l) {
      return;
    }
    this.l = false;
    refresh();
  }
  
  public void refresh()
  {
    this.m = 1;
    a(this.m, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */