package com.android.dazhihui.ui.model.stock.adapter;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.ExtraObject;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.widget.stockchart.f;
import java.util.Iterator;
import java.util.Vector;

class HomeViewAdapter$1$1
  implements View.OnClickListener
{
  HomeViewAdapter$1$1(HomeViewAdapter.1 param1, SelfStock paramSelfStock, int paramInt, PopupWindow paramPopupWindow) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 2131560089)
    {
      paramView = new AlertDialog.Builder(HomeViewAdapter.access$200(this.this$1.this$0)).create();
      paramView.setTitle("确认提示");
      if (this.val$chooseItem.getSelfType() == 1)
      {
        paramView.setMessage(HomeViewAdapter.access$200(this.this$1.this$0).getString(2131165406));
        paramView.setCancelable(true);
        paramView.setCanceledOnTouchOutside(true);
        paramView.setButton(-1, HomeViewAdapter.access$200(this.this$1.this$0).getString(17039370), new HomeViewAdapter.1.1.1(this));
        paramView.setButton(-2, HomeViewAdapter.access$200(this.this$1.this$0).getString(17039360), new HomeViewAdapter.1.1.2(this));
        paramView.show();
        n.a(this.val$chooseItem.getCode(), 1406);
      }
    }
    for (;;)
    {
      this.val$popupWindow.dismiss();
      return;
      paramView.setMessage(HomeViewAdapter.access$200(this.this$1.this$0).getString(2131165407));
      break;
      if (paramView.getId() == 2131560370)
      {
        if (this.val$chooseItem.getSelfType() == 0)
        {
          paramView = HomeViewAdapter.access$100(this.this$1.this$0).getSelfStockVectorByShallowCopy();
          Object localObject1 = (SelfStock)paramView.remove(this.val$index);
          int j;
          if (this.val$chooseItem.getPingTop())
          {
            ((SelfStock)localObject1).setPingTop(false);
            i = 0;
            for (;;)
            {
              j = i;
              if (i < paramView.size())
              {
                localObject2 = (SelfStock)paramView.get(i);
                j = i;
                if (localObject2 != null)
                {
                  if (((SelfStock)localObject2).getPingTop()) {
                    break label348;
                  }
                  j = i;
                }
              }
              paramView.insertElementAt(localObject1, j);
              HomeViewAdapter.access$100(this.this$1.this$0).setLocalSelfStockVector(paramView);
              localObject1 = new Vector();
              paramView = paramView.iterator();
              while (paramView.hasNext()) {
                ((Vector)localObject1).add(((SelfStock)paramView.next()).getCode());
              }
              label348:
              i += 1;
            }
          }
          ((SelfStock)localObject1).setPingTop(true);
          int i = 0;
          for (;;)
          {
            j = i;
            if (i >= paramView.size()) {
              break;
            }
            localObject2 = (SelfStock)paramView.get(i);
            j = i;
            if (localObject2 == null) {
              break;
            }
            j = i;
            if (!((SelfStock)localObject2).getPingTop()) {
              break;
            }
            i += 1;
          }
          paramView = HomeViewAdapter.access$100(this.this$1.this$0).requestSyncSelfStockToServerByType(2, (Vector)localObject1);
          Object localObject2 = new SelfSelectedStockManager.ExtraObject();
          ((SelfSelectedStockManager.ExtraObject)localObject2).subprotocol = 105;
          ((SelfSelectedStockManager.ExtraObject)localObject2).action = 2;
          ((SelfSelectedStockManager.ExtraObject)localObject2).obj = localObject1;
          ((SelfSelectedStockManager.ExtraObject)localObject2).sync = false;
          paramView.a(localObject2);
          n.a(this.val$chooseItem.getCode(), 1407);
        }
        else
        {
          HomeViewAdapter.access$100(this.this$1.this$0).addSelfStock(this.val$chooseItem.getCode(), this.val$chooseItem.getName());
          n.a(this.val$chooseItem.getCode(), 1408);
        }
      }
      else if (paramView.getId() == 2131560365)
      {
        if ((o.r()) && (o.y == o.v))
        {
          ((eu)HomeViewAdapter.access$000(this.this$1.this$0)).a(this.val$chooseItem);
          ((eu)HomeViewAdapter.access$000(this.this$1.this$0)).b(f.a);
        }
        else
        {
          o.a(HomeViewAdapter.access$200(this.this$1.this$0), this.val$chooseItem.getType(), this.val$chooseItem.getCode(), null, 0);
          n.a(this.val$chooseItem.getCode(), 1404);
        }
      }
      else if (paramView.getId() == 2131560367) {
        if ((o.r()) && (o.y == o.v))
        {
          ((eu)HomeViewAdapter.access$000(this.this$1.this$0)).a(this.val$chooseItem);
          ((eu)HomeViewAdapter.access$000(this.this$1.this$0)).b(f.b);
        }
        else
        {
          o.a(HomeViewAdapter.access$200(this.this$1.this$0), this.val$chooseItem.getType(), this.val$chooseItem.getCode(), null, 1);
          n.a(this.val$chooseItem.getCode(), 1405);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\HomeViewAdapter$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */