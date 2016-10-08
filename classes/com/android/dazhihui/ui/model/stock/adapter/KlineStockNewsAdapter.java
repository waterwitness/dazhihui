package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.model.stock.StockNewsVo;
import com.android.dazhihui.ui.screen.y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class KlineStockNewsAdapter
  extends BaseAdapter
{
  private String curTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
  private String fromatTime;
  private boolean isCache;
  private StockNewItem item;
  private String mColorStr = "<font color=\"#DAA520\">";
  private String mColorStr1 = "</font>";
  private String mColorStr2 = "<font color=\"white\">";
  private Context mContex;
  private boolean mIsKlineScreen;
  private ArrayList<StockNewItem> mStockNews;
  private StockNewsVo mStockNewsVo;
  private HashMap<Integer, String> mTypes;
  private String title;
  
  public KlineStockNewsAdapter(Context paramContext, ArrayList<StockNewItem> paramArrayList, StockNewsVo paramStockNewsVo, boolean paramBoolean)
  {
    this.mContex = paramContext;
    this.mStockNews = paramArrayList;
    this.mStockNewsVo = paramStockNewsVo;
    this.mIsKlineScreen = paramBoolean;
  }
  
  public void clear()
  {
    this.mStockNews = null;
    this.mStockNewsVo = null;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.mStockNews == null) {
      return 0;
    }
    if (this.isCache) {
      return Math.min(10, this.mStockNews.size());
    }
    if (this.mIsKlineScreen) {
      return Math.min(10, this.mStockNews.size());
    }
    return this.mStockNews.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.mStockNews == null) {
      return null;
    }
    return this.mStockNews.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramView = new KlineStockNewsAdapter.Holder(this);
      paramViewGroup = LayoutInflater.from(this.mContex).inflate(2130903576, null);
      paramView.mTitle = ((TextView)paramViewGroup.findViewById(2131561266));
      paramView.mTime = ((TextView)paramViewGroup.findViewById(2131561267));
      paramViewGroup.setTag(paramView);
    }
    KlineStockNewsAdapter.Holder localHolder = (KlineStockNewsAdapter.Holder)paramViewGroup.getTag();
    this.item = ((StockNewItem)this.mStockNews.get(paramInt));
    if (g.a().b() == y.b)
    {
      localHolder.mTitle.setTextColor(-14540254);
      localHolder.mTime.setTextColor(-7566196);
    }
    while ((this.item != null) && (this.mTypes != null))
    {
      String str = this.item.getTitle();
      paramView = str;
      if (str.contains("<"))
      {
        paramView = str;
        if (str.contains(">")) {
          paramView = str.substring(str.indexOf(">"));
        }
      }
      this.title = paramView;
      localHolder.mTitle.setText(this.title);
      this.fromatTime = this.item.getOtime();
      paramView = (String)this.mTypes.get(Integer.valueOf(this.item.getType()));
      paramView = paramView.substring(1, paramView.length() - 1);
      if (this.item.getType() == 2)
      {
        localHolder.mTime.setText(this.item.getSource() + paramView + "   " + this.fromatTime.subSequence(5, 10));
        return paramViewGroup;
        localHolder.mTitle.setTextColor(this.mContex.getResources().getColor(2131493361));
        localHolder.mTime.setTextColor(this.mContex.getResources().getColor(2131493361));
      }
      else
      {
        if (this.item.getType() == 1)
        {
          if (this.fromatTime.startsWith(this.curTime))
          {
            paramView = this.mColorStr + paramView + this.mColorStr1 + this.mColorStr2 + new StringBuilder().append("    ").append(this.fromatTime.subSequence(11, 16)).toString() + this.mColorStr1;
            localHolder.mTime.setText(Html.fromHtml(paramView));
            return paramViewGroup;
          }
          paramView = this.mColorStr + paramView + this.mColorStr1 + this.mColorStr2 + new StringBuilder().append("    ").append(this.fromatTime.subSequence(5, 16)).toString() + this.mColorStr1;
          localHolder.mTime.setText(Html.fromHtml(paramView));
          return paramViewGroup;
        }
        if (this.fromatTime.startsWith(this.curTime))
        {
          localHolder.mTime.setText(paramView + "   " + this.fromatTime.subSequence(11, 16));
          return paramViewGroup;
        }
        localHolder.mTime.setText(paramView + "   " + this.fromatTime.subSequence(5, 16));
        return paramViewGroup;
      }
    }
    localHolder.mTitle.setText("");
    localHolder.mTime.setText("");
    return paramViewGroup;
  }
  
  public void refresh()
  {
    if (this.mStockNews != null) {
      this.mTypes = this.mStockNewsVo.getTypes();
    }
    notifyDataSetChanged();
  }
  
  public void refresh(boolean paramBoolean)
  {
    if ((this.mStockNews != null) && (this.mStockNewsVo != null)) {
      this.mTypes = this.mStockNewsVo.getTypes();
    }
    this.isCache = paramBoolean;
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\KlineStockNewsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */