package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.fund.FundMenu;
import com.android.dazhihui.ui.delegate.screen.fund.IFundMenu;
import com.android.dazhihui.ui.delegate.screen.ggt.GgtTradeMenu;
import com.android.dazhihui.ui.delegate.screen.trade.AccountPass;

class dx
  implements AdapterView.OnItemClickListener
{
  dx(TradeChecklistMenu paramTradeChecklistMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if ("lscx".equals(this.a.a))
            {
              this.a.startActivity(EntrustTable_history.class);
              return;
            }
            if ("more".equals(this.a.a))
            {
              if ((a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.m()))
              {
                this.a.startActivity(TransferMenuNew.class);
                n.a("", 1353);
                return;
              }
              this.a.startActivity(TransferMenu.class);
              return;
            }
            if ("xcmore".equals(this.a.a))
            {
              if ((a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.m()) || (o.i()))
              {
                this.a.startActivity(TransferMenuNew.class);
                n.a("", 1353);
                return;
              }
              this.a.startActivity(TransferMenu.class);
              return;
            }
            if ("jjjy".equals(this.a.a))
            {
              this.a.startActivity(FundMenu.class);
              return;
            }
            if ("set".equals(this.a.a))
            {
              this.a.startActivity(AccountPass.class);
              return;
            }
          } while (!"ggt".equals(this.a.a));
          paramAdapterView = new Bundle();
          paramView = new Intent();
          paramAdapterView.putInt("type", 0);
          paramView.putExtras(paramAdapterView);
          paramView.setClass(this.a, GgtTradeMenu.class);
          this.a.startActivity(paramView);
          n.a("", 1391);
          return;
          if ("lscx".equals(this.a.a))
          {
            this.a.startActivity(BargainTable_history.class);
            return;
          }
          if ("more".equals(this.a.a))
          {
            this.a.startActivity(AccountPass.class);
            return;
          }
          if ("xcmore".equals(this.a.a))
          {
            if ((o.k()) || (o.l()))
            {
              this.a.startActivity(AccountPass.class);
              n.a("", 20048);
              return;
            }
            if (o.m())
            {
              this.a.b();
              return;
            }
            if (o.i())
            {
              this.a.startActivity(AccountPass.class);
              n.a("", 20048);
              return;
            }
            o.a(this.a, true);
            n.a("", 1346);
            return;
          }
          if ("jjjy".equals(this.a.a))
          {
            this.a.startActivity(IFundMenu.class);
            return;
          }
          if ("set".equals(this.a.a))
          {
            this.a.b();
            return;
          }
        } while (!"ggt".equals(this.a.a));
        paramAdapterView = new Bundle();
        paramView = new Intent();
        paramAdapterView.putInt("type", 1);
        paramView.putExtras(paramAdapterView);
        paramView.setClass(this.a, GgtTradeMenu.class);
        this.a.startActivity(paramView);
        n.a("", 1392);
        return;
        if ("more".equals(this.a.a))
        {
          this.a.b();
          return;
        }
        if ("xcmore".equals(this.a.a))
        {
          if ((o.k()) || (o.l()) || (o.i()))
          {
            this.a.b();
            n.a("", 20049);
            return;
          }
          n.a("", 20048);
          this.a.startActivity(AccountPass.class);
          return;
        }
      } while (!"set".equals(this.a.a));
      return;
    } while (("lscx".equals(this.a.a)) || (!"xcmore".equals(this.a.a)));
    this.a.b();
    n.a("", 20049);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */