package com.android.dazhihui.ui.widget.adv;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import java.util.ArrayList;

public class q
  extends BaseAdapter
{
  private Context b;
  
  public q(AdvertView paramAdvertView, Context paramContext)
  {
    this.b = paramContext;
  }
  
  public int getCount()
  {
    if (AdvertView.a(this.a) == null) {}
    while (((!AdvertView.a(this.a).viewtype.equals("1")) && (!AdvertView.a(this.a).viewtype.equals("2"))) || (AdvertView.a(this.a).advList == null)) {
      return 0;
    }
    return AdvertView.a(this.a).advList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    label80:
    AdvertVo.AdvItem localAdvItem;
    if (paramView == null)
    {
      localObject = new s();
      if (this.a.a == 105)
      {
        paramView = LayoutInflater.from(this.a.getContext()).inflate(2130903049, paramViewGroup, false);
        ((s)localObject).a((GifView)paramView.findViewById(2131558573));
        ((s)localObject).a((TextView)paramView.findViewById(2131558574));
        paramView.setTag(localObject);
        paramViewGroup = (ViewGroup)localObject;
        if ((AdvertView.a(this.a).advList != null) && (AdvertView.a(this.a).advList.size() > 0))
        {
          localAdvItem = (AdvertVo.AdvItem)AdvertView.a(this.a).advList.get(paramInt);
          if (this.a.a != 137) {
            break label345;
          }
          localObject = localAdvItem.getMatchImg1();
          label148:
          if (this.a.a != 105) {
            break label435;
          }
          if (localObject == null) {
            break label355;
          }
          paramViewGroup.a().setVisibility(0);
          paramViewGroup.a().setImage(localObject[0], Integer.parseInt(localObject[1]), Integer.parseInt(localObject[2]));
          label198:
          if ((this.a.a == 105) && (TextUtils.isEmpty(localAdvItem.text)) && (!localAdvItem.callurl.equals("0"))) {
            localAdvItem.text = "查看详情";
          }
          if ((localAdvItem.text != null) && (!localAdvItem.text.isEmpty())) {
            break label367;
          }
          paramViewGroup.b().setVisibility(8);
        }
      }
    }
    for (;;)
    {
      return paramView;
      if ((this.a.a == 114) || (this.a.a == 138)) {}
      for (paramView = new GifView(this.b, false);; paramView = new GifView(this.b, true))
      {
        ((s)localObject).a(paramView);
        break;
      }
      paramViewGroup = (s)paramView.getTag();
      break label80;
      label345:
      localObject = localAdvItem.getMatchImg();
      break label148;
      label355:
      paramViewGroup.a().setVisibility(8);
      break label198;
      label367:
      if (!TextUtils.isEmpty(localAdvItem.colour)) {}
      try
      {
        paramInt = Color.parseColor("#" + localAdvItem.colour);
        paramViewGroup.b().setTextColor(paramInt);
        paramViewGroup.b().setText(localAdvItem.text);
        paramViewGroup.b().setVisibility(0);
        return paramView;
        label435:
        if ((localObject != null) && (paramViewGroup != null) && (paramViewGroup.a() != null))
        {
          if (this.a.a == 147)
          {
            paramViewGroup.a().setImage(localObject[0], 2130839015);
            return paramView;
          }
          paramViewGroup.a().setImage(localObject[0], Integer.parseInt(localObject[1]), Integer.parseInt(localObject[2]));
          return paramView;
        }
        if ((paramViewGroup == null) || (paramViewGroup.a() == null)) {
          continue;
        }
        paramViewGroup.a().setVisibility(8);
        return paramView;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */