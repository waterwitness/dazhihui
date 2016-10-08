package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import java.util.List;

class iw
  implements AdapterView.OnItemClickListener
{
  iw(MessageCenterList paramMessageCenterList) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (MessageCenterList.m(this.a)[paramInt].equals("全部消息"))
    {
      MessageCenterList.a(this.a, (byte)5);
      MessageCenterList.n(this.a).sendEmptyMessage(2);
      if ((MessageCenterList.f(this.a) != null) && (MessageCenterList.f(this.a).size() <= 0)) {
        MessageCenterList.o(this.a).setVisibility(0);
      }
    }
    for (;;)
    {
      this.a.b();
      MessageCenterList.n(this.a).sendEmptyMessage(1);
      return;
      MessageCenterList.o(this.a).setVisibility(8);
      continue;
      if (MessageCenterList.m(this.a)[paramInt].equals("公共消息"))
      {
        MessageCenterList.a(this.a, (byte)2);
        MessageCenterList.n(this.a).sendEmptyMessage(3);
        if ((MessageCenterList.d(this.a) != null) && (MessageCenterList.d(this.a).size() <= 0)) {
          MessageCenterList.o(this.a).setVisibility(0);
        } else {
          MessageCenterList.o(this.a).setVisibility(8);
        }
      }
      else if (MessageCenterList.m(this.a)[paramInt].equals("自选股消息"))
      {
        MessageCenterList.a(this.a, (byte)0);
        MessageCenterList.n(this.a).sendEmptyMessage(3);
        if ((MessageCenterList.b(this.a) != null) && (MessageCenterList.b(this.a).size() <= 0)) {
          MessageCenterList.o(this.a).setVisibility(0);
        } else {
          MessageCenterList.o(this.a).setVisibility(8);
        }
      }
      else if (MessageCenterList.m(this.a)[paramInt].equals("彩票消息"))
      {
        MessageCenterList.a(this.a, (byte)3);
        MessageCenterList.n(this.a).sendEmptyMessage(3);
        if ((MessageCenterList.e(this.a) != null) && (MessageCenterList.e(this.a).size() <= 0)) {
          MessageCenterList.o(this.a).setVisibility(0);
        } else {
          MessageCenterList.o(this.a).setVisibility(8);
        }
      }
      else if (MessageCenterList.m(this.a)[paramInt].equals("股价预警"))
      {
        MessageCenterList.a(this.a, (byte)1);
        MessageCenterList.n(this.a).sendEmptyMessage(3);
        if ((MessageCenterList.c(this.a) != null) && (MessageCenterList.c(this.a).size() <= 0)) {
          MessageCenterList.o(this.a).setVisibility(0);
        } else {
          MessageCenterList.o(this.a).setVisibility(8);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */