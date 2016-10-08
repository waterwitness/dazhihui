package com.android.dazhihui.ui.widget.adv;

import android.os.Handler;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import java.util.ArrayList;

public abstract class a
  implements ac
{
  public int d;
  public AdvertVo.AdvertData e;
  
  public a(int paramInt)
  {
    new Handler().postDelayed(new b(this, paramInt), 20L);
  }
  
  public void e()
  {
    Object localObject = com.android.dazhihui.ui.a.a.c().b();
    if (localObject == null) {}
    do
    {
      do
      {
        do
        {
          return;
          localObject = ((AdvertVo)localObject).getAdvert(this.d);
          if (localObject != null) {
            break;
          }
        } while (this.e == null);
        c();
        this.e = null;
        return;
        if (this.e != null) {
          break;
        }
      } while (((((AdvertVo.AdvertData)localObject).viewtype.equals("1")) || (((AdvertVo.AdvertData)localObject).viewtype.equals("2"))) && ((((AdvertVo.AdvertData)localObject).advList == null) || (((AdvertVo.AdvertData)localObject).advList.size() == 0)));
      this.e = ((AdvertVo.AdvertData)localObject);
      a(this.e);
      return;
    } while (this.e.vs.equals(((AdvertVo.AdvertData)localObject).vs));
    if (((((AdvertVo.AdvertData)localObject).viewtype.equals("1")) || (((AdvertVo.AdvertData)localObject).viewtype.equals("2"))) && ((((AdvertVo.AdvertData)localObject).advList == null) || (((AdvertVo.AdvertData)localObject).advList.size() == 0)))
    {
      c();
      this.e = null;
      return;
    }
    this.e = ((AdvertVo.AdvertData)localObject);
    b(this.e);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */