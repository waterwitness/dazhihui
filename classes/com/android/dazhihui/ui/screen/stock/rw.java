package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import java.util.Vector;

class rw
  implements View.OnClickListener
{
  rw(rv paramrv, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if (!SearchStockScreen.k(this.b.a)) {}
    do
    {
      do
      {
        return;
      } while ((SearchStockScreen.h(this.b.a) == null) || (SearchStockScreen.i(this.b.a) == null) || (this.a >= SearchStockScreen.h(this.b.a).length) || (this.a >= SearchStockScreen.i(this.b.a).length));
      if (m.a().b().addSelfStock(SearchStockScreen.h(this.b.a)[this.a], SearchStockScreen.i(this.b.a)[this.a]))
      {
        new Vector().add(SearchStockScreen.h(this.b.a)[this.a]);
        rv.a(this.b)[this.a] = 1;
        this.b.notifyDataSetChanged();
        SearchStockScreen.d(this.b.a, true);
        SearchStockScreen.a(this.b.a, "");
        SearchStockScreen.d(this.b.a).setText(SearchStockScreen.c(this.b.a));
        return;
      }
    } while (SearchStockScreen.z(this.b.a).getSelfStockVectorSize() < 100);
    paramView = new Bundle();
    paramView.putInt("type", 32);
    Intent localIntent = new Intent();
    localIntent.putExtras(paramView);
    localIntent.setClass(this.b.a, TipActivity.class);
    this.b.a.startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */