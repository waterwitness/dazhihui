package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.KxNewsVo;
import com.android.dazhihui.ui.model.stock.KxNewsVo.Header;
import com.android.dazhihui.ui.model.stock.KxNewsVo.KxItem;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.ArrayList;
import java.util.List;

public class NewsAdapter$KxAdsAdapter
  extends BaseAdapter
{
  private List<KxNewsVo.KxItem> adsList = new ArrayList();
  List<KxNewsVo.KxItem> avdList113;
  private Context context;
  private KxNewsVo mDataVo;
  private ViewFlow mViewFlow;
  
  public NewsAdapter$KxAdsAdapter(Context paramContext, ViewFlow paramViewFlow, KxNewsVo paramKxNewsVo, List<KxNewsVo.KxItem> paramList)
  {
    this.context = paramContext;
    this.mViewFlow = paramViewFlow;
    this.mDataVo = paramKxNewsVo;
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
    if (paramView == null)
    {
      paramView = new NewsAdapter.KxAdsAdapter.HeaderNews(this);
      localObject = LayoutInflater.from(this.context).inflate(2130903343, paramViewGroup, false);
      paramView.imageView = ((ImageView)((View)localObject).findViewById(2131560103));
      paramView.textView = ((TextView)((View)localObject).findViewById(2131560104));
      ((View)localObject).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject;
    }
    while (paramInt < 0)
    {
      return paramView;
      paramViewGroup = (NewsAdapter.KxAdsAdapter.HeaderNews)paramView.getTag();
    }
    Object localObject = (KxNewsVo.KxItem)this.adsList.get(paramInt);
    r.a(this.context).a(((KxNewsVo.KxItem)localObject).img, paramViewGroup.imageView);
    paramViewGroup.textView.setText(((KxNewsVo.KxItem)localObject).title);
    return paramView;
  }
  
  public KxNewsVo getmDataVo()
  {
    return this.mDataVo;
  }
  
  public void refresh(AdvertVo.AdvertData paramAdvertData)
  {
    this.adsList.clear();
    ArrayList localArrayList = this.mDataVo.header.bigImgNews;
    if (localArrayList.size() > this.avdList113.size()) {}
    for (int i = localArrayList.size();; i = this.avdList113.size())
    {
      int j = 0;
      while (j < i)
      {
        if (localArrayList.size() > j) {
          this.adsList.add(localArrayList.get(j));
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$KxAdsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */