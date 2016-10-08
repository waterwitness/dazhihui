package com.android.dazhihui.ui.screen.stock;

import android.support.v4.view.df;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.SecondMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.screen.stock.a.aa;
import com.android.dazhihui.ui.screen.stock.a.ab;
import com.android.dazhihui.ui.screen.stock.a.af;
import com.android.dazhihui.ui.screen.stock.a.au;
import com.android.dazhihui.ui.screen.stock.a.az;
import com.android.dazhihui.ui.screen.stock.a.bb;
import com.android.dazhihui.ui.screen.stock.a.x;
import com.android.dazhihui.ui.screen.stock.a.y;
import com.android.dazhihui.ui.widget.MyViewPager;
import com.android.dazhihui.ui.widget.TabPageIndicator;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.List;

class xg
  implements df
{
  xg(xe paramxe) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    if ((xe.a(this.a) != null) && (paramInt < xe.a(this.a).size()) && (paramInt >= 0) && (xe.a(this.a).get(paramInt) != null))
    {
      localObject = MenuManager.getInstance().getVs();
      localObject = (String)localObject + ((MenuConfigVo.SecondMenuItem)xe.a(this.a).get(paramInt)).countid + ((MenuConfigVo.SecondMenuItem)xe.a(this.a).get(paramInt)).name;
      if ("3".equals(Integer.valueOf(((MenuConfigVo.SecondMenuItem)xe.a(this.a).get(paramInt)).menuflag)))
      {
        ah.d(15, (String)localObject);
        xe.b(this.a).a(paramInt);
      }
    }
    int i;
    if ((xe.c(this.a)[paramInt] instanceof aa))
    {
      n.a("", 1246);
      i = paramInt;
    }
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            xe.a(this.a, i);
            return;
            if ((xe.c(this.a)[paramInt] instanceof az))
            {
              n.a("", 1384);
              i = paramInt;
            }
            else if ((xe.c(this.a)[paramInt] instanceof au))
            {
              n.a("", 1250);
              i = paramInt;
            }
            else if ((xe.c(this.a)[paramInt] instanceof x))
            {
              n.a("", 1249);
              i = paramInt;
            }
            else if ((xe.c(this.a)[paramInt] instanceof af))
            {
              n.a("", 20000);
              i = paramInt;
            }
            else if ((xe.c(this.a)[paramInt] instanceof bb))
            {
              n.a("", 1248);
              i = paramInt;
            }
            else if ((xe.c(this.a)[paramInt] instanceof y))
            {
              n.a("", 1247);
              i = paramInt;
            }
            else
            {
              if (!(xe.c(this.a)[paramInt] instanceof ab)) {
                break;
              }
              n.a("", 1246);
              i = paramInt;
            }
          }
          i = paramInt;
        } while (xe.a(this.a) == null);
        i = paramInt;
      } while (paramInt >= xe.a(this.a).size());
      i = paramInt;
    } while (xe.a(this.a).get(paramInt) == null);
    Object localObject = (MenuConfigVo.SecondMenuItem)xe.a(this.a).get(paramInt);
    if (3 == ((MenuConfigVo.SecondMenuItem)localObject).type)
    {
      r.a(this.a.getActivity(), null, ((MenuConfigVo.SecondMenuItem)localObject).urlPath, null);
      i = xe.d(this.a);
      xe.e(this.a).postDelayed(new xh(this), 500L);
    }
    for (;;)
    {
      n.a("", ((MenuConfigVo.SecondMenuItem)localObject).countid);
      break;
      i = paramInt;
      if (4 == ((MenuConfigVo.SecondMenuItem)localObject).type)
      {
        String[] arrayOfString = r.a(((MenuConfigVo.SecondMenuItem)localObject).urlPath, "");
        i = paramInt;
        if (arrayOfString != null)
        {
          i = paramInt;
          if (arrayOfString.length > 0)
          {
            i = paramInt;
            if ("0".equals(arrayOfString[0]))
            {
              r.a(this.a.getActivity(), null, ((MenuConfigVo.SecondMenuItem)localObject).urlPath, null);
              i = xe.d(this.a);
              xe.e(this.a).postDelayed(new xi(this), 500L);
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */