package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.KxNewsVo.KxItem;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.KxAdsAdapter;
import com.android.dazhihui.ui.widget.adv.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class md
  extends a
{
  public md(lp paramlp, int paramInt)
  {
    super(paramInt);
  }
  
  private void c(AdvertVo.AdvertData paramAdvertData)
  {
    this.a.e.clear();
    Iterator localIterator;
    Object localObject;
    if ((paramAdvertData != null) && (paramAdvertData.advList != null))
    {
      localIterator = paramAdvertData.advList.iterator();
      if (localIterator.hasNext())
      {
        localObject = (AdvertVo.AdvItem)localIterator.next();
        KxNewsVo.KxItem localKxItem = new KxNewsVo.KxItem();
        localKxItem.img = localObject.getMatchImg()[0];
        localKxItem.title = ((AdvertVo.AdvItem)localObject).text;
        localKxItem.isAdvert = true;
        localKxItem.url = ((AdvertVo.AdvItem)localObject).callurl;
        if (TextUtils.isEmpty(((AdvertVo.AdvItem)localObject).countid)) {}
        for (int i = 0;; i = Integer.parseInt(((AdvertVo.AdvItem)localObject).countid))
        {
          localKxItem.countid = i;
          this.a.e.add(localKxItem);
          break;
        }
      }
    }
    if ((this.a.e != null) && (this.a.e.size() > 0))
    {
      localIterator = this.a.e.iterator();
      while (localIterator.hasNext())
      {
        localObject = (KxNewsVo.KxItem)localIterator.next();
        n.a(String.valueOf(this.d), ((KxNewsVo.KxItem)localObject).countid);
      }
    }
    lp.a(this.a).refresh(paramAdvertData);
  }
  
  public void a()
  {
    lp.a(this.a).stopCarousel();
  }
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    c(paramAdvertData);
  }
  
  public void b()
  {
    lp.a(this.a).carouselAdvert(this.e);
    if ((this.a.e != null) && (this.a.e.size() > 0))
    {
      Iterator localIterator = this.a.e.iterator();
      while (localIterator.hasNext())
      {
        KxNewsVo.KxItem localKxItem = (KxNewsVo.KxItem)localIterator.next();
        n.a(String.valueOf(this.d), localKxItem.countid);
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
    lp.a(this.a).stopCarousel();
  }
  
  public void d()
  {
    lp.a(this.a).stopCarousel();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */