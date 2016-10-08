package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.NewsXgfxVo;
import java.util.List;

public class NewsAdapter$NewStockAdapter
  extends BaseAdapter
{
  Context context;
  private List<NewsXgfxVo> xgfaList;
  
  public NewsAdapter$NewStockAdapter(Context paramContext, List<NewsXgfxVo> paramList)
  {
    this.context = paramContext;
    this.xgfaList = paramList;
  }
  
  public int getCount()
  {
    if (this.xgfaList == null) {
      return 0;
    }
    return this.xgfaList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new NewsAdapter.NewStockAdapter.Holder(this);
      paramView = LayoutInflater.from(this.context).inflate(2130903337, null);
      NewsAdapter.NewStockAdapter.Holder.access$102(paramViewGroup, (TextView)paramView.findViewById(2131560097));
      NewsAdapter.NewStockAdapter.Holder.access$202(paramViewGroup, (TextView)paramView.findViewById(2131560098));
      NewsAdapter.NewStockAdapter.Holder.access$302(paramViewGroup, (TextView)paramView.findViewById(2131560099));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      NewsXgfxVo localNewsXgfxVo = (NewsXgfxVo)this.xgfaList.get(paramInt);
      NewsAdapter.NewStockAdapter.Holder.access$100(paramViewGroup).setText(localNewsXgfxVo.getGpmc());
      NewsAdapter.NewStockAdapter.Holder.access$200(paramViewGroup).setText(localNewsXgfxVo.getOipsdate());
      NewsAdapter.NewStockAdapter.Holder.access$300(paramViewGroup).setText(localNewsXgfxVo.getLdate());
      return paramView;
      paramViewGroup = (NewsAdapter.NewStockAdapter.Holder)paramView.getTag();
    }
  }
  
  public List<NewsXgfxVo> getXgfaList()
  {
    return this.xgfaList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$NewStockAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */