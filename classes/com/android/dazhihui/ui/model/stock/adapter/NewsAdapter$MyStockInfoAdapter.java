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
import com.android.dazhihui.ui.model.stock.JpNewsVo;
import com.android.dazhihui.ui.model.stock.NewsVo;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.widget.AutoLineTextView;
import com.android.dazhihui.ui.widget.a.r;
import java.util.List;

public class NewsAdapter$MyStockInfoAdapter
  extends BaseAdapter
{
  Context context;
  JpNewsVo mDataVo;
  
  public NewsAdapter$MyStockInfoAdapter(Context paramContext, JpNewsVo paramJpNewsVo)
  {
    this.mDataVo = paramJpNewsVo;
    this.context = paramContext;
  }
  
  public int getCount()
  {
    return this.mDataVo.getDataList().size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    String str;
    if (paramView == null)
    {
      paramViewGroup = new NewsAdapter.MyStockInfoAdapter.Holder(this);
      paramView = LayoutInflater.from(this.context).inflate(2130903569, null);
      paramViewGroup.newsLeftImg = ((ImageView)paramView.findViewById(2131561254));
      paramViewGroup.newsTitle = ((TextView)paramView.findViewById(2131559212));
      paramViewGroup.news_summary = ((TextView)paramView.findViewById(2131561255));
      paramViewGroup.newsBottom = ((AutoLineTextView)paramView.findViewById(2131559125));
      paramView.setTag(paramViewGroup);
      localObject = (NewsVo)this.mDataVo.getDataList().get(paramInt);
      str = ((NewsVo)localObject).getContent();
      paramViewGroup.newsTitle.setVisibility(0);
      paramViewGroup.newsTitle.setText(((NewsVo)localObject).getTitle());
      if (!lp.a(((NewsVo)localObject).getId())) {
        break label366;
      }
      paramViewGroup.newsTitle.setTextColor(this.context.getResources().getColor(2131493699));
      label159:
      if ((str == null) || (str.isEmpty())) {
        break label388;
      }
      paramViewGroup.news_summary.setVisibility(0);
      paramViewGroup.news_summary.setText(str);
      label189:
      str = ((NewsVo)localObject).getImgUrl();
      if ((str == null) || (str.isEmpty())) {
        break label400;
      }
      paramViewGroup.newsLeftImg.setVisibility(0);
      r.a(this.context).a(str, paramViewGroup.newsLeftImg, 2130838468);
    }
    for (;;)
    {
      str = n.p(((NewsVo)localObject).getTime());
      if ((((NewsVo)localObject).getResType() != null) && (!((NewsVo)localObject).getResType().isEmpty())) {
        break label420;
      }
      paramViewGroup.newsBottom.a = 2;
      paramViewGroup.newsBottom.a(false);
      localObject = ((NewsVo)localObject).getOrigins() + "     " + str;
      paramViewGroup.newsBottom.setText("");
      paramViewGroup.newsBottom.b((String)localObject, this.context.getResources().getDimensionPixelSize(2131230873), this.context.getResources().getColor(2131493697));
      return paramView;
      paramViewGroup = (NewsAdapter.MyStockInfoAdapter.Holder)paramView.getTag();
      break;
      label366:
      paramViewGroup.newsTitle.setTextColor(this.context.getResources().getColor(2131493698));
      break label159;
      label388:
      paramViewGroup.news_summary.setVisibility(8);
      break label189;
      label400:
      paramViewGroup.newsLeftImg.setImageBitmap(null);
      paramViewGroup.newsLeftImg.setVisibility(8);
    }
    label420:
    paramViewGroup.newsBottom.a = 1;
    paramViewGroup.newsBottom.b(str, this.context.getResources().getDimensionPixelSize(2131230873), this.context.getResources().getColor(2131493697));
    paramViewGroup.newsBottom.a(true);
    paramViewGroup.newsBottom.a(((NewsVo)localObject).getResType(), this.context.getResources().getDimensionPixelSize(2131230873), this.context.getResources().getColor(2131493694));
    return paramView;
  }
  
  public JpNewsVo getmDataVo()
  {
    return this.mDataVo;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$MyStockInfoAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */