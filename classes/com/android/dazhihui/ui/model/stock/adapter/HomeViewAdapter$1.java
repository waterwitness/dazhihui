package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.screen.y;
import java.util.Vector;

class HomeViewAdapter$1
  implements AdapterView.OnItemLongClickListener
{
  HomeViewAdapter$1(HomeViewAdapter paramHomeViewAdapter) {}
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = paramView.getTag();
    ((eu)HomeViewAdapter.access$000(this.this$0)).f();
    if ((paramAdapterView != null) && ((paramAdapterView instanceof SelfStock)))
    {
      SelfStock localSelfStock = (SelfStock)paramAdapterView;
      LinearLayout localLinearLayout;
      TextView localTextView1;
      TextView localTextView2;
      View localView1;
      View localView2;
      Object localObject;
      TextView localTextView3;
      TextView localTextView4;
      label261:
      label291:
      int i;
      int k;
      if (localSelfStock.getSelfType() == 0)
      {
        paramAdapterView = HomeViewAdapter.access$100(this.this$0).getSelfStockVector();
        if (paramAdapterView == null) {
          break label795;
        }
        paramInt = paramAdapterView.indexOf(localSelfStock);
        if (paramInt < 0) {
          break label795;
        }
        paramAdapterView = new PopupWindow(HomeViewAdapter.access$200(this.this$0));
        localLinearLayout = (LinearLayout)LayoutInflater.from(HomeViewAdapter.access$200(this.this$0)).inflate(2130903411, null);
        localTextView1 = (TextView)localLinearLayout.findViewById(2131560365);
        localTextView2 = (TextView)localLinearLayout.findViewById(2131560367);
        localView1 = localLinearLayout.findViewById(2131560366);
        localView2 = localLinearLayout.findViewById(2131560368);
        localObject = localLinearLayout.findViewById(2131560369);
        localTextView3 = (TextView)localLinearLayout.findViewById(2131560089);
        localTextView4 = (TextView)localLinearLayout.findViewById(2131560370);
        if (HomeViewAdapter.access$300(this.this$0) != y.b) {
          break label557;
        }
        localLinearLayout.setBackgroundResource(2130838270);
        localTextView3.setTextColor(HomeViewAdapter.access$200(this.this$0).getResources().getColor(2131493626));
        localTextView4.setTextColor(HomeViewAdapter.access$200(this.this$0).getResources().getColor(2131493626));
        localView1.setBackgroundColor(-3618616);
        localView2.setBackgroundColor(-3618616);
        ((View)localObject).setBackgroundColor(-3618616);
        localTextView1.setText("快买");
        localTextView2.setText("快卖");
        if (localSelfStock.getSelfType() != 1) {
          break label600;
        }
        localTextView4.setText("加自选");
        localObject = new HomeViewAdapter.1.1(this, localSelfStock, paramInt, paramAdapterView);
        i = HomeViewAdapter.access$200(this.this$0).getResources().getDimensionPixelSize(2131230789);
        int j = HomeViewAdapter.access$200(this.this$0).getResources().getDimensionPixelSize(2131230830);
        paramInt = 1;
        k = n.o(localSelfStock.getCode());
        if (localSelfStock.getType() != 0) {
          break label636;
        }
        paramInt = 0;
        label361:
        if (paramInt != 0) {
          break label723;
        }
        localTextView1.setVisibility(8);
        localTextView2.setVisibility(8);
        localView1.setVisibility(8);
        localView2.setVisibility(8);
        paramInt = j;
        label396:
        localTextView3.setOnClickListener((View.OnClickListener)localObject);
        localTextView4.setOnClickListener((View.OnClickListener)localObject);
        paramAdapterView.setBackgroundDrawable(new BitmapDrawable());
        paramAdapterView.setWidth(i);
        paramAdapterView.setHeight(paramInt);
        paramAdapterView.setOutsideTouchable(true);
        paramAdapterView.setFocusable(true);
        paramAdapterView.setContentView(localLinearLayout);
        paramView.getLocationOnScreen(new int[2]);
        paramAdapterView.setOnDismissListener(new HomeViewAdapter.1.2(this));
        HomeViewAdapter.access$402(this.this$0, localSelfStock);
        paramAdapterView.showAsDropDown(paramView, (paramView.getWidth() - i) / 2, -paramView.getHeight() - paramInt / 2);
        this.this$0.checkFirstLongClick(localSelfStock);
        if (HomeViewAdapter.access$300(this.this$0) != y.b) {
          break label773;
        }
        paramView.setBackgroundColor(HomeViewAdapter.access$200(this.this$0).getResources().getColor(2131493618));
      }
      for (;;)
      {
        return true;
        paramAdapterView = HomeViewAdapter.access$100(this.this$0).getBrowseStockVector();
        break;
        label557:
        localLinearLayout.setBackgroundResource(2130838269);
        localTextView3.setTextColor(-1);
        localTextView4.setTextColor(-1);
        localView1.setBackgroundColor(-11776948);
        localView2.setBackgroundColor(-11776948);
        ((View)localObject).setBackgroundColor(-11776948);
        break label261;
        label600:
        if (localSelfStock.getPingTop())
        {
          localTextView4.setText("取消置顶");
          break label291;
        }
        if (localSelfStock.getPingTop()) {
          break label291;
        }
        localTextView4.setText("置顶");
        break label291;
        label636:
        if ((localSelfStock.getType() == 1) && (localSelfStock.getCode().startsWith("HK")))
        {
          paramInt = 0;
          break label361;
        }
        if ((localSelfStock.getType() == 16) && ((localSelfStock.getCode().startsWith("HK")) || (k == 15) || (k == 10)))
        {
          paramInt = 0;
          break label361;
        }
        if (!localSelfStock.getCode().startsWith("SFIF")) {
          break label361;
        }
        paramInt = 0;
        break label361;
        label723:
        localTextView1.setOnClickListener((View.OnClickListener)localObject);
        localTextView2.setOnClickListener((View.OnClickListener)localObject);
        i = HomeViewAdapter.access$200(this.this$0).getResources().getDimensionPixelSize(2131230807);
        paramInt = HomeViewAdapter.access$200(this.this$0).getResources().getDimensionPixelSize(2131230830);
        break label396;
        label773:
        paramView.setBackgroundColor(HomeViewAdapter.access$200(this.this$0).getResources().getColor(2131493555));
      }
    }
    label795:
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\HomeViewAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */