package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.NewsVo;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.AdsAdapter;
import com.android.dazhihui.ui.widget.adv.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class me
  extends a
{
  public me(lp paramlp, int paramInt)
  {
    super(paramInt);
  }
  
  private void c(AdvertVo.AdvertData paramAdvertData)
  {
    lp.b(this.a).clear();
    if ((paramAdvertData != null) && (paramAdvertData.advList != null))
    {
      Iterator localIterator = paramAdvertData.advList.iterator();
      while (localIterator.hasNext())
      {
        AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)localIterator.next();
        NewsVo localNewsVo = new NewsVo();
        localNewsVo.setImgUrl(localAdvItem.getMatchImg()[0]);
        localNewsVo.setTitle(localAdvItem.text);
        localNewsVo.setAdvert(true);
        localNewsVo.setUrl(localAdvItem.callurl);
        localNewsVo.setCountId(localAdvItem.countid);
        lp.b(this.a).add(localNewsVo);
      }
    }
    lp.c(this.a).refresh(paramAdvertData);
  }
  
  public void a()
  {
    lp.c(this.a).stopCarousel();
  }
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void b()
  {
    lp.c(this.a).carouselAdvert(this.e);
  }
  
  public void b(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void c()
  {
    c(null);
    lp.c(this.a).stopCarousel();
  }
  
  public void d()
  {
    lp.c(this.a).stopCarousel();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */