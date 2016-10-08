package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.model.stock.StockNewsVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class t
  extends LinearLayout
  implements i
{
  private static String b = "http://mnews.gw.com.cn/wap/data/ipad/stock/";
  private static String c = "list/1.json";
  private f a;
  private StockVo d;
  private y e;
  private StockNewsVo f;
  
  public t(Context paramContext)
  {
    super(paramContext);
    setOrientation(1);
    this.e = com.android.dazhihui.g.a().b();
  }
  
  private void a()
  {
    removeAllViews();
    Object localObject1;
    if ((this.f != null) && (this.f.getError() == 0))
    {
      localObject1 = this.f.getNews();
      HashMap localHashMap = this.f.getTypes();
      int j = Math.min(10, ((ArrayList)localObject1).size());
      int i = 0;
      while (i < j)
      {
        if (i != 0)
        {
          localObject2 = new View(getContext());
          ((View)localObject2).setBackgroundResource(2131493692);
          addView((View)localObject2, -1, 1);
        }
        Object localObject2 = (StockNewItem)((ArrayList)localObject1).get(i);
        View localView = a((StockNewItem)localObject2, localHashMap);
        localView.setOnClickListener(new u(this, (StockNewItem)localObject2));
        addView(localView, -1, -2);
        i += 1;
      }
      if (j > 0)
      {
        localObject1 = new TextView(getContext());
        if (this.e != y.b) {
          break label214;
        }
        ((TextView)localObject1).setTextColor(-10066330);
      }
    }
    for (;;)
    {
      ((TextView)localObject1).setText("更多资讯");
      ((TextView)localObject1).setPadding(0, 20, 0, 30);
      ((TextView)localObject1).setGravity(17);
      ((TextView)localObject1).setOnClickListener(new v(this));
      addView((View)localObject1, -1, -2);
      return;
      label214:
      ((TextView)localObject1).setTextColor(getRootView().getContext().getResources().getColor(2131493361));
    }
  }
  
  private void a(String paramString)
  {
    this.a = new f();
    this.a.c(paramString);
    this.a.a(this);
    com.android.dazhihui.a.g.a().a(this.a);
  }
  
  private void a(String paramString1, String paramString2)
  {
    this.f = new StockNewsVo();
    this.f.setCurPage(paramString1);
    if (paramString2 != null)
    {
      this.f.decode(paramString2);
      a();
    }
  }
  
  private void b(StockVo paramStockVo)
  {
    if (paramStockVo == null) {
      removeAllViews();
    }
    int i;
    do
    {
      return;
      paramStockVo = paramStockVo.getCode();
      i = n.o(paramStockVo);
    } while (((n.k(paramStockVo)) || (i != 1)) && (i != 0));
    a(b + paramStockVo.substring(0, 2) + "/" + paramStockVo.substring(paramStockVo.length() - 2) + "/" + paramStockVo.substring(2) + "/" + c);
  }
  
  public View a(StockNewItem paramStockNewItem, HashMap<Integer, String> paramHashMap)
  {
    String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    View localView = LayoutInflater.from(getContext()).inflate(2130903576, null);
    Object localObject = (TextView)localView.findViewById(2131561266);
    TextView localTextView = (TextView)localView.findViewById(2131561267);
    if (this.e == y.b)
    {
      ((TextView)localObject).setTextColor(-14540254);
      localTextView.setTextColor(-7566196);
    }
    while ((paramStockNewItem != null) && (paramHashMap != null))
    {
      ((TextView)localObject).setText(paramStockNewItem.getTitle());
      localObject = paramStockNewItem.getOtime();
      paramHashMap = (String)paramHashMap.get(Integer.valueOf(paramStockNewItem.getType()));
      paramHashMap = paramHashMap.substring(1, paramHashMap.length() - 1);
      if (paramStockNewItem.getType() == 2)
      {
        localTextView.setText(paramStockNewItem.getSource() + paramHashMap + "   " + ((String)localObject).subSequence(5, 10));
        return localView;
        ((TextView)localObject).setTextColor(getRootView().getContext().getResources().getColor(2131493361));
        localTextView.setTextColor(getRootView().getContext().getResources().getColor(2131493361));
      }
      else
      {
        if (paramStockNewItem.getType() == 1)
        {
          if (((String)localObject).startsWith(str))
          {
            localTextView.setText(Html.fromHtml("<font color=\"#DAA520\">" + paramHashMap + "</font>" + "<font color=\"white\">" + new StringBuilder().append("    ").append(((String)localObject).subSequence(11, 16)).toString() + "</font>"));
            return localView;
          }
          localTextView.setText(Html.fromHtml("<font color=\"#DAA520\">" + paramHashMap + "</font>" + "<font color=\"white\">" + new StringBuilder().append("    ").append(((String)localObject).subSequence(5, 16)).toString() + "</font>"));
          return localView;
        }
        if (((String)localObject).startsWith(str))
        {
          localTextView.setText(paramHashMap + "   " + ((String)localObject).subSequence(11, 16));
          return localView;
        }
        localTextView.setText(paramHashMap + "   " + ((String)localObject).subSequence(5, 16));
        return localView;
      }
    }
    ((TextView)localObject).setText("");
    localTextView.setText("");
    return localView;
  }
  
  public void a(StockVo paramStockVo)
  {
    this.d = paramStockVo;
    b(paramStockVo);
  }
  
  public void a(y paramy)
  {
    this.e = paramy;
    a();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramh == this.a) && ((paramj instanceof com.android.dazhihui.a.b.g)))
    {
      paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
      a(this.a.o(), paramh);
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.a) {
      removeAllViews();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.a) {
      removeAllViews();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */