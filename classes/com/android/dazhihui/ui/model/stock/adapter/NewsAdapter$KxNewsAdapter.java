package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.KxNewsVo;
import com.android.dazhihui.ui.model.stock.KxNewsVo.KxItem;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.NewsDetailInfo;
import com.android.dazhihui.ui.screen.stock.NewsSpecialReportScreen;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.widget.a.r;
import java.util.ArrayList;

public class NewsAdapter$KxNewsAdapter
  extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  private Context context;
  private KxNewsVo kxNewsVo;
  private String titleName;
  
  public NewsAdapter$KxNewsAdapter(Context paramContext, String paramString, KxNewsVo paramKxNewsVo)
  {
    this.context = paramContext;
    this.kxNewsVo = paramKxNewsVo;
    this.titleName = paramString;
  }
  
  public int getCount()
  {
    if (this.kxNewsVo.data != null) {
      return this.kxNewsVo.data.size();
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
  
  public KxNewsVo getKxNewsVo()
  {
    return this.kxNewsVo;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView == null)
    {
      localObject = new NewsAdapter.KxNewsAdapter.Holder();
      paramView = LayoutInflater.from(this.context).inflate(2130903570, paramViewGroup, false);
      ((NewsAdapter.KxNewsAdapter.Holder)localObject).image = ((ImageView)paramView.findViewById(2131561254));
      ((NewsAdapter.KxNewsAdapter.Holder)localObject).news_title = ((TextView)paramView.findViewById(2131559212));
      ((NewsAdapter.KxNewsAdapter.Holder)localObject).news_time = ((TextView)paramView.findViewById(2131559207));
      ((NewsAdapter.KxNewsAdapter.Holder)localObject).news_yuedu = ((TextView)paramView.findViewById(2131561257));
      ((NewsAdapter.KxNewsAdapter.Holder)localObject).news_biaozhi = ((TextView)paramView.findViewById(2131561256));
      ((NewsAdapter.KxNewsAdapter.Holder)localObject).news_summary = ((TextView)paramView.findViewById(2131561255));
      paramView.setTag(localObject);
      paramViewGroup = (ViewGroup)localObject;
      localObject = (KxNewsVo.KxItem)this.kxNewsVo.data.get(paramInt);
      paramViewGroup.news_summary.setVisibility(8);
      paramViewGroup.news_title.setMaxLines(2);
      if (!TextUtils.isEmpty(((KxNewsVo.KxItem)localObject).img)) {
        break label410;
      }
      paramViewGroup.image.setImageBitmap(null);
      paramViewGroup.image.setVisibility(8);
      if (!TextUtils.isEmpty(((KxNewsVo.KxItem)localObject).summary))
      {
        paramViewGroup.news_summary.setVisibility(0);
        paramViewGroup.news_summary.setText(((KxNewsVo.KxItem)localObject).summary);
        paramViewGroup.news_title.setMaxLines(1);
      }
      label221:
      paramViewGroup.news_title.setText(((KxNewsVo.KxItem)localObject).title);
      if (!lp.a(((KxNewsVo.KxItem)localObject).id)) {
        break label442;
      }
      paramViewGroup.news_title.setTextColor(this.context.getResources().getColor(2131493699));
      paramViewGroup.news_summary.setTextColor(this.context.getResources().getColor(2131493699));
      label282:
      String str = n.p(((KxNewsVo.KxItem)localObject).otime);
      paramViewGroup.news_time.setText(str);
      if (TextUtils.isEmpty(((KxNewsVo.KxItem)localObject).resType)) {
        break label495;
      }
      paramViewGroup.news_biaozhi.setVisibility(0);
      paramViewGroup.news_biaozhi.setText(((KxNewsVo.KxItem)localObject).resType);
      if (!((KxNewsVo.KxItem)localObject).resType.equals("专题")) {
        break label483;
      }
      paramViewGroup.news_biaozhi.setTextColor(this.context.getResources().getColor(2131493412));
    }
    for (;;)
    {
      if ((!TextUtils.isEmpty(((KxNewsVo.KxItem)localObject).views)) && (!((KxNewsVo.KxItem)localObject).views.equals("0"))) {
        break label507;
      }
      paramViewGroup.news_yuedu.setVisibility(8);
      return paramView;
      paramViewGroup = (NewsAdapter.KxNewsAdapter.Holder)paramView.getTag();
      break;
      label410:
      paramViewGroup.image.setVisibility(0);
      r.a(this.context).a(((KxNewsVo.KxItem)localObject).img, paramViewGroup.image, 2130838467);
      break label221;
      label442:
      paramViewGroup.news_title.setTextColor(this.context.getResources().getColor(2131493698));
      paramViewGroup.news_summary.setTextColor(this.context.getResources().getColor(2131493696));
      break label282;
      label483:
      paramViewGroup.news_biaozhi.setTextColor(-12614705);
      continue;
      label495:
      paramViewGroup.news_biaozhi.setVisibility(8);
    }
    label507:
    paramViewGroup.news_yuedu.setVisibility(0);
    paramViewGroup.news_yuedu.setText(((KxNewsVo.KxItem)localObject).views + "阅读");
    return paramView;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt;
    if (((ListView)paramAdapterView).getHeaderViewsCount() > 0) {
      i = paramInt - ((ListView)paramAdapterView).getHeaderViewsCount();
    }
    paramAdapterView = (KxNewsVo.KxItem)this.kxNewsVo.data.get(i);
    if (!lp.a(paramAdapterView.id))
    {
      lp.b(paramAdapterView.id);
      notifyDataSetChanged();
    }
    paramView = String.valueOf(paramAdapterView.countid);
    Object localObject = paramAdapterView.id;
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
    if ("2".equals(paramAdapterView.type))
    {
      paramView = new Intent(this.context, NewsSpecialReportScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putString("url", paramAdapterView.url);
      paramView.putExtras((Bundle)localObject);
      this.context.startActivity(paramView);
      return;
    }
    if (paramAdapterView.url.endsWith(".json"))
    {
      NewsDetailInfo.a(this.context, paramAdapterView.url, (String)localObject, paramAdapterView.title, this.titleName, paramAdapterView.source, paramAdapterView.summary, "", paramAdapterView.advTypeShare);
      return;
    }
    paramView = new Intent(this.context, BrowserActivity.class);
    localObject = new Bundle();
    ((Bundle)localObject).putString("nexturl", paramAdapterView.url);
    ((Bundle)localObject).putString("names", this.titleName);
    paramView.putExtras((Bundle)localObject);
    this.context.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter$KxNewsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */