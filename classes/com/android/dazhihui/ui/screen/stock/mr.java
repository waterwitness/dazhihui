package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.c.b.a;
import com.android.dazhihui.service.t;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.Header;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.c.a.k;
import java.util.List;

class mr
  implements t
{
  mr(mn parammn) {}
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    if (mn.d(this.a) != paramInt2) {}
    do
    {
      do
      {
        return;
        mn.e(this.a).a();
        if (mn.f(this.a) != 1) {
          break;
        }
        mn.g(this.a).a(true);
        List localList = mn.h(this.a).a().news;
        if (paramInt1 == 1)
        {
          if ((localList == null) || (localList.size() == 0))
          {
            mn.e(this.a).a("数据加载失败,点击重新加载", new ms(this));
            return;
          }
          this.a.showShortToast("数据加载异常");
          return;
        }
        paramString = (NewsPersonalizedVo)new k().a(paramString, NewsPersonalizedVo.class);
        if ((paramString == null) || (paramString.news == null))
        {
          if ((localList == null) || (localList.size() == 0))
          {
            mn.e(this.a).a("数据加载失败,点击重新加载", new mt(this));
            return;
          }
          this.a.showShortToast("数据加载异常");
          return;
        }
        mn.h(this.a).a().news = paramString.news;
        mn.h(this.a).a().header = paramString.header;
        mn.h(this.a).notifyDataSetChanged();
        mn.c(this.a).b(null);
      } while (!mn.i(this.a));
      mn.j(this.a).a(mn.b(this.a), paramString);
      return;
      mn.g(this.a).b();
      if (paramInt1 == 1)
      {
        mn.a(this.a, mn.f(this.a) - 1);
        this.a.showShortToast("数据加载异常!");
        return;
      }
      paramString = (NewsPersonalizedVo)new k().a(paramString, NewsPersonalizedVo.class);
      if ((paramString == null) || (paramString.news == null))
      {
        mn.a(this.a, mn.f(this.a) - 1);
        this.a.showShortToast("数据加载异常!");
        return;
      }
      mn.h(this.a).a().news.addAll(paramString.news);
      mn.h(this.a).notifyDataSetChanged();
    } while (!String.valueOf(mn.f(this.a)).equals(paramString.header.getTotalpage()));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */