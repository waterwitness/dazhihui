package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.JpNewsVo;
import com.android.dazhihui.ui.model.stock.NewsVo;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.ArrayList;
import java.util.List;

public class NewsAdapter$AdsAdapter
  extends BaseAdapter
{
  private List<NewsVo> adsList = new ArrayList();
  List<NewsVo> avdList113;
  private Context context;
  private JpNewsVo mDataVo;
  private ViewFlow mViewFlow;
  
  public NewsAdapter$AdsAdapter(Context paramContext, ViewFlow paramViewFlow, JpNewsVo paramJpNewsVo, List<NewsVo> paramList)
  {
    this.context = paramContext;
    this.mViewFlow = paramViewFlow;
    this.mDataVo = paramJpNewsVo;
    this.avdList113 = paramList;
  }
  
  public void carouselAdvert(AdvertVo.AdvertData paramAdvertData)
  {
    if ((paramAdvertData != null) && (paramAdvertData.playstyle.equals("1")))
    {
      int i = Integer.parseInt(paramAdvertData.intervals);
      this.mViewFlow.a(i * 1000);
    }
  }
  
  public int getCount()
  {
    return this.adsList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.adsList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView == null)
    {
      localObject = new NewsAdapter.AdsAdapter.HeaderNews(this);
      paramView = LayoutInflater.from(this.context).inflate(2130903342, paramViewGroup, false);
      ((NewsAdapter.AdsAdapter.HeaderNews)localObject).imageView = ((ImageView)paramView.findViewById(2131560103));
      ((NewsAdapter.AdsAdapter.HeaderNews)localObject).textView = ((TextView)paramView.findViewById(2131560104));
      paramView.setTag(localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (NewsAdapter.AdsAdapter.HeaderNews)paramView.getTag())
    {
      localObject = (NewsVo)this.adsList.get(paramInt);
      r.a(this.context).a(((NewsVo)localObject).getImgUrl(), paramViewGroup.imageView);
      paramViewGroup.textView.setText(((NewsVo)localObject).getTitle());
      return paramView;
    }
  }
  
  public JpNewsVo getmDataVo()
  {
    return this.mDataVo;
  }
  
  public void refresh(AdvertVo.AdvertData paramAdvertData)
  {
    this.adsList.clear();
    List localList = this.mDataVo.getHeadList();
    if (localList.size() > this.avdList113.size()) {}
    for (int i = localList.size();; i = this.avdList113.size())
    {
      int j = 0;
      while (j < i)
      {
        if (localList.size() > j) {
          this.adsList.add(localList.get(j));
        }
        if (this.avdList113.size() > j) {
          this.adsList.add(this.avdList113.get(j));
        }
        j += 1;
      }
    }
    if (this.adsList.size() > 0) {
      this.mViewFlow.setSelection(0);
    }
    notifyDataSetChanged();
    if (paramAdvertData != null) {
      carouselAdvert(paramAdvertData);
    }
  }
  
  public void stopCarousel()
  {
    this.mViewFlow.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$AdsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */