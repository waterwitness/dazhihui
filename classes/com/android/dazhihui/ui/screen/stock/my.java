package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.BigImgNews;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.Header;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.ArrayList;
import java.util.List;

public class my
  extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  List<NewsPersonalizedVo.BigImgNews> a;
  private NewsPersonalizedVo c;
  private Context d;
  private List<NewsPersonalizedVo.BigImgNews> e = new ArrayList();
  private ViewFlow f;
  
  public my(Context paramContext, ViewFlow paramViewFlow, NewsPersonalizedVo paramNewsPersonalizedVo, List<NewsPersonalizedVo.BigImgNews> paramList)
  {
    this.d = paramViewFlow;
    this.f = paramNewsPersonalizedVo;
    this.c = paramList;
    List localList;
    this.a = localList;
  }
  
  public void a()
  {
    this.f.a();
  }
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    if ((paramAdvertData != null) && (paramAdvertData.playstyle.equals("1")))
    {
      int i = Integer.parseInt(paramAdvertData.intervals);
      this.f.a(i * 1000);
    }
  }
  
  public void b(AdvertVo.AdvertData paramAdvertData)
  {
    this.e.clear();
    if ((this.c.header != null) && (this.c.header.getBigImgNews() != null))
    {
      List localList = this.c.header.getBigImgNews();
      if (localList.size() > this.a.size()) {}
      for (int i = localList.size();; i = this.a.size())
      {
        int j = 0;
        while (j < i)
        {
          if (localList.size() > j) {
            this.e.add(localList.get(j));
          }
          if (this.a.size() > j) {
            this.e.add(this.a.get(j));
          }
          j += 1;
        }
      }
    }
    if (this.e.size() > 0)
    {
      this.f.setSelection(0);
      mn.a(this.b).setVisibility(0);
    }
    for (;;)
    {
      notifyDataSetChanged();
      if (paramAdvertData != null) {
        a(paramAdvertData);
      }
      return;
      mn.a(this.b).setVisibility(8);
    }
  }
  
  public int getCount()
  {
    return this.e.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.e.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = new mz(this);
      localObject = LayoutInflater.from(this.d).inflate(2130903343, paramViewGroup, false);
      paramView.a = ((ImageView)((View)localObject).findViewById(2131560103));
      paramView.b = ((TextView)((View)localObject).findViewById(2131560104));
      ((View)localObject).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject;
    }
    while (paramInt < 0)
    {
      return paramView;
      paramViewGroup = (mz)paramView.getTag();
    }
    Object localObject = (NewsPersonalizedVo.BigImgNews)this.e.get(paramInt);
    r.a(this.d).a(((NewsPersonalizedVo.BigImgNews)localObject).getImg(), paramViewGroup.a);
    paramViewGroup.b.setText(((NewsPersonalizedVo.BigImgNews)localObject).getTitle());
    return paramView;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (NewsPersonalizedVo.BigImgNews)this.e.get(paramInt);
    paramView = String.valueOf(paramAdapterView.getCountid());
    Object localObject = paramAdapterView.getId();
    if (((paramView != null) && (!paramView.isEmpty())) || ((localObject != null) && (!((String)localObject).isEmpty())))
    {
      int i = 0;
      paramInt = i;
      if (paramView != null)
      {
        paramInt = i;
        if (!paramView.isEmpty()) {
          paramInt = Integer.parseInt(paramView);
        }
      }
      n.a((String)localObject, paramInt);
    }
    if ("2".equals(paramAdapterView.getType()))
    {
      paramView = new Intent(this.d, NewsSpecialReportScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putString("url", paramAdapterView.getUrl());
      paramView.putExtras((Bundle)localObject);
      this.d.startActivity(paramView);
      return;
    }
    if ("0".equals(paramAdapterView.getType()))
    {
      NewsDetailInfo.a(this.d, paramAdapterView.getUrl(), (String)localObject, paramAdapterView.getTitle(), mn.b(this.b), paramAdapterView.getSource(), paramAdapterView.getSummary(), "", paramAdapterView.getAdvTypeShare());
      return;
    }
    paramView = new Intent(this.d, BrowserActivity.class);
    localObject = new Bundle();
    ((Bundle)localObject).putString("nexturl", paramAdapterView.getUrl());
    ((Bundle)localObject).putString("names", mn.b(this.b));
    paramView.putExtras((Bundle)localObject);
    this.d.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */