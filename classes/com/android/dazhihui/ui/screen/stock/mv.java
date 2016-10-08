package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.News;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.Stock;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BrowserActivity;
import java.util.List;

public class mv
  extends BaseAdapter
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  private Context a;
  private NewsPersonalizedVo b;
  private String c;
  
  public mv(Context paramContext, String paramString, NewsPersonalizedVo paramNewsPersonalizedVo)
  {
    this.a = paramContext;
    this.b = paramNewsPersonalizedVo;
    this.c = paramString;
  }
  
  public NewsPersonalizedVo a()
  {
    return this.b;
  }
  
  public int getCount()
  {
    if (this.b.news != null) {
      return this.b.news.size();
    }
    return 0;
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
    int i = 0;
    Object localObject1;
    if (paramView == null)
    {
      paramView = new mx();
      localObject1 = LayoutInflater.from(this.a).inflate(2130903346, paramViewGroup, false);
      paramView.a = ((ImageView)((View)localObject1).findViewById(2131559118));
      paramView.b = ((TextView)((View)localObject1).findViewById(2131558567));
      paramView.e = ((TextView)((View)localObject1).findViewById(2131560110));
      paramView.d = ((TextView)((View)localObject1).findViewById(2131560111));
      paramView.g = ((TextView)((View)localObject1).findViewById(2131560112));
      paramView.c = ((TextView)((View)localObject1).findViewById(2131560108));
      paramView.f = ((TextView)((View)localObject1).findViewById(2131559224));
      paramView.i = ((TextView)((View)localObject1).findViewById(2131560114));
      paramView.j = ((ImageView)((View)localObject1).findViewById(2131560113));
      paramView.h = ((LinearLayout)((View)localObject1).findViewById(2131560109));
      paramView.k = ((View)localObject1).findViewById(2131560107);
      ((View)localObject1).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject1;
    }
    for (;;)
    {
      localObject1 = (NewsPersonalizedVo.News)this.b.news.get(paramInt);
      label239:
      label259:
      label320:
      label341:
      int k;
      int j;
      label517:
      Object localObject2;
      if (TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getImg()))
      {
        paramViewGroup.a.setImageBitmap(null);
        paramViewGroup.a.setVisibility(8);
        if (!TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getResType())) {
          break label862;
        }
        paramViewGroup.d.setVisibility(8);
        if (TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getTitle())) {
          break label897;
        }
        paramViewGroup.b.setSingleLine();
        paramViewGroup.b.setText(((NewsPersonalizedVo.News)localObject1).getTitle());
        if (TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getSummary())) {
          break label885;
        }
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.c.setText(((NewsPersonalizedVo.News)localObject1).getSummary());
        if (!"1".equals(((NewsPersonalizedVo.News)localObject1).getIsTop())) {
          break label937;
        }
        paramViewGroup.j.setVisibility(0);
        paramInt = this.a.getResources().getDimensionPixelSize(2131230788);
        k = this.a.getResources().getDimensionPixelSize(2131230780);
        this.a.getResources().getDimensionPixelSize(2131230786);
        j = this.a.getResources().getDimensionPixelSize(2131230774);
        if (!TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getTopName())) {
          break label949;
        }
        paramViewGroup.i.setVisibility(8);
        paramViewGroup.k.setPadding(j, k, j, k);
        if (!lp.a(((NewsPersonalizedVo.News)localObject1).getId())) {
          break label1091;
        }
        paramViewGroup.b.setTextColor(this.a.getResources().getColor(2131493699));
        paramViewGroup.c.setTextColor(this.a.getResources().getColor(2131493699));
        paramViewGroup.f.setTextColor(this.a.getResources().getColor(2131493699));
        paramViewGroup.e.setTextColor(this.a.getResources().getColor(2131493699));
        localObject2 = n.p(((NewsPersonalizedVo.News)localObject1).getOtime());
        paramViewGroup.f.setText((CharSequence)localObject2);
      }
      try
      {
        paramInt = Integer.parseInt(((NewsPersonalizedVo.News)localObject1).getEComments());
        if (paramInt <= 0)
        {
          paramViewGroup.g.setVisibility(8);
          if (!TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getSource())) {
            break label1259;
          }
          paramViewGroup.e.setVisibility(8);
          if (((NewsPersonalizedVo.News)localObject1).getStockName() != null) {
            ((NewsPersonalizedVo.News)localObject1).getStockName().clear();
          }
          if ((((NewsPersonalizedVo.News)localObject1).getStockName() == null) || (((NewsPersonalizedVo.News)localObject1).getStockName().size() <= 0)) {
            break label1282;
          }
          paramViewGroup.h.removeAllViews();
          j = Math.min(4, ((NewsPersonalizedVo.News)localObject1).getStockName().size());
          paramInt = i;
          for (;;)
          {
            if (paramInt < j)
            {
              Object localObject3 = (NewsPersonalizedVo.Stock)((NewsPersonalizedVo.News)localObject1).getStockName().get(paramInt);
              localObject2 = new TextView(this.a);
              ((TextView)localObject2).setText(((NewsPersonalizedVo.Stock)localObject3).getStockname());
              ((TextView)localObject2).setTextColor(this.a.getResources().getColorStateList(2130838483));
              ((TextView)localObject2).setBackgroundResource(2130838482);
              ((TextView)localObject2).setTag(localObject3);
              i = this.a.getResources().getDimensionPixelSize(2131230771);
              int m = this.a.getResources().getDimensionPixelSize(2131230844);
              int n = this.a.getResources().getDimensionPixelSize(2131230854);
              ((TextView)localObject2).setPadding(n, i, n, i);
              ((TextView)localObject2).setTextSize(2, 13.0F);
              ((TextView)localObject2).setOnClickListener(this);
              localObject3 = new LinearLayout.LayoutParams(-2, -2);
              ((LinearLayout.LayoutParams)localObject3).rightMargin = m;
              ((LinearLayout.LayoutParams)localObject3).topMargin = k;
              paramViewGroup.h.addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
              paramInt += 1;
              continue;
              paramViewGroup = (mx)paramView.getTag();
              break;
              paramViewGroup.a.setVisibility(8);
              break label239;
              label862:
              paramViewGroup.d.setVisibility(0);
              paramViewGroup.d.setText(((NewsPersonalizedVo.News)localObject1).getResType());
              break label259;
              label885:
              paramViewGroup.c.setVisibility(8);
              break label320;
              label897:
              paramViewGroup.b.setSingleLine(false);
              paramViewGroup.b.setMaxLines(4);
              paramViewGroup.b.setText(((NewsPersonalizedVo.News)localObject1).getSummary());
              paramViewGroup.c.setVisibility(8);
              break label320;
              label937:
              paramViewGroup.j.setVisibility(8);
              break label341;
              label949:
              paramViewGroup.k.setPadding(j, paramInt, j, k);
              paramViewGroup.i.setVisibility(0);
              paramViewGroup.i.setText(((NewsPersonalizedVo.News)localObject1).getTopName());
              if (TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getTopColor())) {
                paramViewGroup.i.setBackgroundResource(2130838506);
              }
              for (;;)
              {
                paramViewGroup.i.setOnClickListener(new mw(this, (NewsPersonalizedVo.News)localObject1));
                break;
                if (((NewsPersonalizedVo.News)localObject1).getTopColor().equals("e56a5c")) {
                  paramViewGroup.i.setBackgroundResource(2130838546);
                } else if (((NewsPersonalizedVo.News)localObject1).getTopColor().equals("e88746")) {
                  paramViewGroup.i.setBackgroundResource(2130838506);
                } else {
                  paramViewGroup.i.setBackgroundResource(2130838506);
                }
              }
              label1091:
              if (!TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getFColor())) {
                paramInt = -16777216;
              }
            }
            try
            {
              j = Color.parseColor("#" + ((NewsPersonalizedVo.News)localObject1).getFColor());
              paramInt = j;
            }
            catch (Exception localException2)
            {
              for (;;) {}
            }
            if (TextUtils.isEmpty(((NewsPersonalizedVo.News)localObject1).getTitle()))
            {
              paramViewGroup.c.setTextColor(-8816263);
              paramViewGroup.b.setTextColor(paramInt);
              break label517;
            }
            paramViewGroup.b.setTextColor(paramInt);
            paramViewGroup.c.setTextColor(-8816263);
            break label517;
            paramViewGroup.b.setTextColor(-16777216);
            paramViewGroup.c.setTextColor(-8816263);
          }
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          paramInt = 0;
          continue;
          paramViewGroup.g.setVisibility(0);
          paramViewGroup.g.setText(paramInt + "条专家评论");
          continue;
          label1259:
          paramViewGroup.e.setVisibility(0);
          paramViewGroup.e.setText(((NewsPersonalizedVo.News)localObject1).getSource());
        }
        label1282:
        paramViewGroup.h.removeAllViews();
      }
    }
    return paramView;
  }
  
  public void onClick(View paramView)
  {
    if ((paramView.getTag() instanceof NewsPersonalizedVo.Stock))
    {
      paramView = (NewsPersonalizedVo.Stock)paramView.getTag();
      StockVo localStockVo = new StockVo(paramView.getStockname(), paramView.getStockcode(), 1, false);
      Bundle localBundle = new Bundle();
      localBundle.putString("code", paramView.getStockcode());
      r.a(this.a, localStockVo, localBundle);
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt;
    if (((ListView)paramAdapterView).getHeaderViewsCount() > 0) {
      i = paramInt - 1;
    }
    paramAdapterView = (NewsPersonalizedVo.News)this.b.news.get(i);
    if (!lp.a(paramAdapterView.getId()))
    {
      lp.b(paramAdapterView.getId());
      notifyDataSetChanged();
    }
    paramView = String.valueOf(paramAdapterView.getCountid());
    Object localObject = paramAdapterView.getId();
    if (((paramView != null) && (!paramView.isEmpty())) || ((localObject != null) && (!((String)localObject).isEmpty())))
    {
      i = 0;
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
      paramView = new Intent(this.a, NewsSpecialReportScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putString("url", paramAdapterView.getUrl());
      paramView.putExtras((Bundle)localObject);
      this.a.startActivity(paramView);
      return;
    }
    if ("0".equals(paramAdapterView.getType()))
    {
      NewsDetailInfo.a(this.a, paramAdapterView.getUrl(), (String)localObject, paramAdapterView.getTitle(), this.c, paramAdapterView.getSource(), paramAdapterView.getSummary(), "", paramAdapterView.getAdvTypeShare());
      return;
    }
    paramView = new Intent(this.a, BrowserActivity.class);
    localObject = new Bundle();
    ((Bundle)localObject).putString("nexturl", paramAdapterView.getUrl());
    ((Bundle)localObject).putString("names", this.c);
    paramView.putExtras((Bundle)localObject);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */