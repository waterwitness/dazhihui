package com.android.dazhihui.ui.screen.stock;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.b.g;
import java.util.List;

class iz
  extends BaseAdapter
{
  private iz(MessageCenterList paramMessageCenterList) {}
  
  public int getCount()
  {
    switch (MessageCenterList.a(this.a))
    {
    case 4: 
    default: 
      return 0;
    case 0: 
      return MessageCenterList.b(this.a).size();
    case 1: 
      return MessageCenterList.c(this.a).size();
    case 2: 
      return MessageCenterList.d(this.a).size();
    case 3: 
      return MessageCenterList.e(this.a).size();
    }
    return MessageCenterList.f(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    switch (MessageCenterList.a(this.a))
    {
    case 4: 
    default: 
      return null;
    case 0: 
      return MessageCenterList.b(this.a).get(paramInt);
    case 1: 
      return MessageCenterList.c(this.a).get(paramInt);
    case 2: 
      return MessageCenterList.d(this.a).get(paramInt);
    case 3: 
      return MessageCenterList.e(this.a).get(paramInt);
    }
    return MessageCenterList.f(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = MessageCenterList.g(this.a).inflate(2130903304, null);
    }
    MessageCenterList.a(this.a, (TextView)paramViewGroup.findViewById(2131559954));
    MessageCenterList.a(this.a, (ImageView)paramViewGroup.findViewById(2131558865));
    MessageCenterList.b(this.a, (TextView)paramViewGroup.findViewById(2131559958));
    MessageCenterList.a(this.a, (LinearLayout)paramViewGroup.findViewById(2131559959));
    MessageCenterList.c(this.a, (TextView)paramViewGroup.findViewById(2131559956));
    MessageCenterList.b(this.a, (LinearLayout)paramViewGroup.findViewById(2131559962));
    MessageCenterList.d(this.a, (TextView)paramViewGroup.findViewById(2131558868));
    MessageCenterList.c(this.a, (LinearLayout)paramViewGroup.findViewById(2131559963));
    MessageCenterList.d(this.a, (LinearLayout)paramViewGroup.findViewById(2131559964));
    MessageCenterList.e(this.a, (TextView)paramViewGroup.findViewById(2131559965));
    MessageCenterList.h(this.a).setOnClickListener(this.a);
    MessageCenterList.i(this.a).setOnClickListener(this.a);
    MessageCenterList.j(this.a).setOnClickListener(this.a);
    MessageCenterList.k(this.a).setOnClickListener(this.a);
    MessageCenterList.l(this.a).setVisibility(8);
    MessageCenterList.h(this.a).setVisibility(0);
    MessageCenterList.k(this.a).setVisibility(0);
    int i;
    byte b;
    if (MessageCenterList.a(this.a) == 5)
    {
      i = (byte)((g)MessageCenterList.f(this.a).get(paramInt)).b;
      if (i == 0) {
        b = 1;
      }
    }
    for (;;)
    {
      this.a.a(b, paramInt);
      return paramViewGroup;
      if (i == 1)
      {
        b = 0;
      }
      else if (i == 2)
      {
        b = 2;
      }
      else if (i == 3)
      {
        b = 3;
        continue;
        this.a.a(MessageCenterList.a(this.a), paramInt);
        return paramViewGroup;
      }
      else
      {
        b = 0;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */