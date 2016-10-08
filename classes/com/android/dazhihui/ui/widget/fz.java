package com.android.dazhihui.ui.widget;

import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Data;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Infos;
import com.android.dazhihui.ui.screen.stock.qg;
import java.util.List;

class fz
  extends qg
{
  int d = 0;
  
  fz(fw paramfw, int paramInt)
  {
    super(paramInt);
  }
  
  public boolean a()
  {
    if (this.d >= IndexTopWidget.d(this.e.c).length)
    {
      this.d = 0;
      fw.a(this.e);
      return false;
    }
    IndexTopWidget.f(this.e.c).setText(IndexTopWidget.d(this.e.c)[this.d]);
    this.e.a.data.infos.tradings.remove(0);
    this.d += 1;
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */