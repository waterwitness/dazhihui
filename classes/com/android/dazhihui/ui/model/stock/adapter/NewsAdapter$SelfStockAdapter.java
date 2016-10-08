package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.JsonNewsItem;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.widget.AutoLineTextView;
import java.util.ArrayList;

public class NewsAdapter$SelfStockAdapter
  extends BaseAdapter
{
  Context context;
  private ArrayList<JsonNewsItem> mineStockNewsList;
  
  public NewsAdapter$SelfStockAdapter(Context paramContext, ArrayList<JsonNewsItem> paramArrayList)
  {
    this.mineStockNewsList = paramArrayList;
    this.context = paramContext;
  }
  
  public int getCount()
  {
    if (this.mineStockNewsList != null) {
      return this.mineStockNewsList.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if ((this.mineStockNewsList != null) && (this.mineStockNewsList.size() > paramInt)) {
      return this.mineStockNewsList.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public ArrayList<JsonNewsItem> getMineStockNewsList()
  {
    return this.mineStockNewsList;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new NewsAdapter.SelfStockAdapter.Holder(this);
      paramView = LayoutInflater.from(this.context).inflate(2130903569, null);
      paramViewGroup.news_title = ((TextView)paramView.findViewById(2131559212));
      paramViewGroup.mTitle = ((AutoLineTextView)paramView.findViewById(2131559125));
      paramView.setTag(paramViewGroup);
    }
    while (this.mineStockNewsList.size() <= paramInt)
    {
      return paramView;
      paramViewGroup = (NewsAdapter.SelfStockAdapter.Holder)paramView.getTag();
    }
    JsonNewsItem localJsonNewsItem = (JsonNewsItem)this.mineStockNewsList.get(paramInt);
    String str3 = localJsonNewsItem.getStockname();
    paramViewGroup.news_title.setVisibility(0);
    paramViewGroup.news_title.setSingleLine(false);
    paramViewGroup.news_title.setMaxLines(2);
    paramViewGroup.news_title.setText(localJsonNewsItem.getTitle());
    if (lp.a(localJsonNewsItem.getId())) {
      paramViewGroup.news_title.setTextColor(this.context.getResources().getColor(2131493699));
    }
    for (;;)
    {
      paramViewGroup.mTitle.a = 2;
      String str2 = NewsAdapter.access$000(Integer.parseInt(localJsonNewsItem.getType()));
      String str1 = str2;
      if (str2 != null) {
        str1 = "[" + str2 + "]";
      }
      str2 = n.p(localJsonNewsItem.getOtime());
      str1 = str3 + "   " + str1 + "   " + str2;
      paramViewGroup.mTitle.b(str1, this.context.getResources().getDimensionPixelSize(2131230873), this.context.getResources().getColor(2131493697));
      return paramView;
      paramViewGroup.news_title.setTextColor(this.context.getResources().getColor(2131493698));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$SelfStockAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */