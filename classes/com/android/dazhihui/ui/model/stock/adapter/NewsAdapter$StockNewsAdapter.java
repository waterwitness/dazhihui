package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.model.stock.StockNewsVo;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.AutoLineTextView;
import com.android.dazhihui.ui.widget.a.r;
import java.util.ArrayList;
import java.util.HashMap;

public class NewsAdapter$StockNewsAdapter
  extends BaseAdapter
{
  private Context context;
  private y mLookFace = y.a;
  private StockNewsVo mStockNewsVo;
  
  public NewsAdapter$StockNewsAdapter(Context paramContext, StockNewsVo paramStockNewsVo)
  {
    this.context = paramContext;
    this.mStockNewsVo = paramStockNewsVo;
  }
  
  public void changeLookFace(y paramy)
  {
    if (paramy != null)
    {
      this.mLookFace = paramy;
      notifyDataSetChanged();
    }
  }
  
  public int getCount()
  {
    if (this.mStockNewsVo == null) {
      return 0;
    }
    return this.mStockNewsVo.getNews().size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.mStockNewsVo.getNews().get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    label106:
    StockNewItem localStockNewItem;
    label208:
    label238:
    label284:
    String str2;
    if (paramView == null)
    {
      paramViewGroup = new NewsAdapter.StockNewsAdapter.Holder(this);
      paramView = LayoutInflater.from(this.context).inflate(2130903569, null);
      paramView.setBackgroundResource(2130838711);
      paramViewGroup.newsLeftImg = ((ImageView)paramView.findViewById(2131561254));
      paramViewGroup.newsTitle = ((TextView)paramView.findViewById(2131559212));
      paramViewGroup.news_summary = ((TextView)paramView.findViewById(2131561255));
      paramViewGroup.newsBottom = ((AutoLineTextView)paramView.findViewById(2131559125));
      paramView.setTag(paramViewGroup);
      if (this.mLookFace != y.b) {
        break label453;
      }
      paramView.setBackgroundResource(2130838794);
      localStockNewItem = (StockNewItem)this.mStockNewsVo.getNews().get(paramInt);
      str1 = localStockNewItem.getSummary();
      paramViewGroup.newsTitle.setVisibility(0);
      paramViewGroup.newsTitle.setText(localStockNewItem.getTitle());
      if (this.mLookFace != y.b) {
        break label503;
      }
      if (!lp.a(localStockNewItem.getId())) {
        break label462;
      }
      paramViewGroup.newsTitle.setTextColor(this.context.getResources().getColor(2131493699));
      paramViewGroup.news_summary.setTextColor(this.context.getResources().getColor(2131493699));
      if ((str1 == null) || (str1.isEmpty())) {
        break label555;
      }
      paramViewGroup.news_summary.setVisibility(0);
      paramViewGroup.news_summary.setText(str1);
      str1 = localStockNewItem.getImg();
      if ((str1 == null) || (str1.isEmpty())) {
        break label567;
      }
      paramViewGroup.newsLeftImg.setVisibility(0);
      r.a(this.context).a(str1, paramViewGroup.newsLeftImg, 2130838468);
      str1 = localStockNewItem.getOtime();
      paramViewGroup.newsBottom.a = 2;
      paramViewGroup.newsBottom.a(false);
      str2 = n.p(str1);
      str1 = (String)this.mStockNewsVo.getTypes().get(Integer.valueOf(localStockNewItem.getType()));
      if (str1 == null) {
        break label617;
      }
    }
    label453:
    label462:
    label503:
    label555:
    label567:
    label617:
    for (String str1 = str1.substring(1, str1.length() - 1);; str1 = "")
    {
      if (localStockNewItem.getType() == 2) {}
      for (str1 = localStockNewItem.getSource() + "      " + str1 + "     " + str2;; str1 = str1 + "     " + str2)
      {
        paramViewGroup.newsBottom.b(str1, this.context.getResources().getDimensionPixelSize(2131230873), this.context.getResources().getColor(2131493697));
        return paramView;
        paramViewGroup = (NewsAdapter.StockNewsAdapter.Holder)paramView.getTag();
        break;
        paramView.setBackgroundResource(2130838711);
        break label106;
        paramViewGroup.newsTitle.setTextColor(this.context.getResources().getColor(2131493698));
        paramViewGroup.news_summary.setTextColor(this.context.getResources().getColor(2131493696));
        break label208;
        if (lp.a(localStockNewItem.getId()))
        {
          paramViewGroup.newsTitle.setTextColor(-4932146);
          paramViewGroup.news_summary.setTextColor(-4932146);
          break label208;
        }
        paramViewGroup.newsTitle.setTextColor(-1);
        paramViewGroup.news_summary.setTextColor(-8355712);
        break label208;
        paramViewGroup.news_summary.setVisibility(8);
        break label238;
        paramViewGroup.newsLeftImg.setImageBitmap(null);
        paramViewGroup.newsLeftImg.setVisibility(8);
        break label284;
      }
    }
  }
  
  public StockNewsVo getmStockNewsVo()
  {
    return this.mStockNewsVo;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$StockNewsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */