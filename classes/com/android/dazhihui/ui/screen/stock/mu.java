package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.NewsPersonalizedVo.BigImgNews;
import com.android.dazhihui.ui.widget.adv.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mu
  extends a
{
  public mu(mn parammn, int paramInt)
  {
    super(paramInt);
  }
  
  private void c(AdvertVo.AdvertData paramAdvertData)
  {
    this.a.a.clear();
    Iterator localIterator;
    Object localObject;
    if ((paramAdvertData != null) && (paramAdvertData.advList != null))
    {
      localIterator = paramAdvertData.advList.iterator();
      if (localIterator.hasNext())
      {
        localObject = (AdvertVo.AdvItem)localIterator.next();
        NewsPersonalizedVo.BigImgNews localBigImgNews = new NewsPersonalizedVo.BigImgNews();
        localBigImgNews.setImg(localObject.getMatchImg()[0]);
        localBigImgNews.setTitle(((AdvertVo.AdvItem)localObject).text);
        localBigImgNews.isAdvert = true;
        localBigImgNews.setUrl(((AdvertVo.AdvItem)localObject).callurl);
        if (TextUtils.isEmpty(((AdvertVo.AdvItem)localObject).countid)) {}
        for (int i = 0;; i = Integer.parseInt(((AdvertVo.AdvItem)localObject).countid))
        {
          localBigImgNews.setCountid(i);
          this.a.a.add(localBigImgNews);
          break;
        }
      }
    }
    if ((this.a.a != null) && (this.a.a.size() > 0))
    {
      localIterator = this.a.a.iterator();
      while (localIterator.hasNext())
      {
        localObject = (NewsPersonalizedVo.BigImgNews)localIterator.next();
        n.a(String.valueOf(this.d), ((NewsPersonalizedVo.BigImgNews)localObject).getCountid());
      }
    }
    mn.c(this.a).b(paramAdvertData);
  }
  
  public void a()
  {
    mn.c(this.a).a();
  }
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void b()
  {
    mn.c(this.a).a(this.e);
    if ((this.a.a != null) && (this.a.a.size() > 0))
    {
      Iterator localIterator = this.a.a.iterator();
      while (localIterator.hasNext())
      {
        NewsPersonalizedVo.BigImgNews localBigImgNews = (NewsPersonalizedVo.BigImgNews)localIterator.next();
        n.a(String.valueOf(this.d), localBigImgNews.getCountid());
      }
    }
  }
  
  public void b(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void c()
  {
    c(null);
    mn.c(this.a).a();
  }
  
  public void d()
  {
    mn.c(this.a).a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */