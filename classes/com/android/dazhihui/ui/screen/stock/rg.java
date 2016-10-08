package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.SearchPeopleVo.PeopleItem;
import com.android.dazhihui.ui.model.stock.SearchPeopleVo.SearchPeopleValue;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class rg
  extends BaseAdapter
{
  ri a;
  
  public rg(SearchPeopleFragment paramSearchPeopleFragment) {}
  
  public TextView a(SearchPeopleVo.PeopleItem paramPeopleItem, boolean paramBoolean)
  {
    TextView localTextView = new TextView(this.b.getContext());
    localTextView.setText(paramPeopleItem.item);
    if (SearchPeopleFragment.b(this.b) == y.a)
    {
      localTextView.setTextColor(-8024423);
      localTextView.setBackgroundResource(2130838570);
    }
    for (;;)
    {
      localTextView.setTextSize(2, 14.0F);
      localTextView.setGravity(17);
      int i = this.b.getResources().getDimensionPixelSize(2131230798);
      int j = this.b.getResources().getDimensionPixelSize(2131230829);
      localTextView.setPadding(j, i, j, i);
      paramPeopleItem = new LinearLayout.LayoutParams(-2, -2);
      if (!paramBoolean) {
        paramPeopleItem.setMargins(j, 0, 0, 0);
      }
      localTextView.setLayoutParams(paramPeopleItem);
      return localTextView;
      localTextView.setTextColor(34816);
      localTextView.setBackgroundResource(2130838571);
    }
  }
  
  public int getCount()
  {
    if (this.b.k != null) {
      return this.b.k.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b.k != null) {
      return this.b.k.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    SearchPeopleVo.SearchPeopleValue localSearchPeopleValue;
    label206:
    label267:
    label387:
    SearchPeopleVo.PeopleItem localPeopleItem;
    if (paramView == null)
    {
      this.a = new ri(this);
      paramView = LayoutInflater.from(this.b.getContext()).inflate(2130903402, paramViewGroup, false);
      this.a.a = ((CircleImageView)paramView.findViewById(2131560304));
      this.a.b = ((ImageView)paramView.findViewById(2131560305));
      this.a.c = ((TextView)paramView.findViewById(2131560306));
      this.a.e = ((ViewGroup)paramView.findViewById(2131560307));
      this.a.d = ((ViewGroup)paramView.findViewById(2131560308));
      paramView.setTag(this.a);
      localSearchPeopleValue = (SearchPeopleVo.SearchPeopleValue)this.b.k.get(paramInt);
      if (TextUtils.isEmpty(localSearchPeopleValue.dzhName)) {
        break label472;
      }
      if (TextUtils.isEmpty(localSearchPeopleValue.nickName)) {
        break label454;
      }
      this.a.c.setText(localSearchPeopleValue.dzhName + "(" + localSearchPeopleValue.nickName + ")");
      paramViewGroup = new SimpleDateFormat("yyyyMMdd");
      if (!localSearchPeopleValue.imageURL.contains("?")) {
        break label530;
      }
      paramViewGroup = localSearchPeopleValue.imageURL + "&time=" + paramViewGroup.format(new Date());
      this.a.a.setImageResource(2130838941);
      this.a.a.setTag(paramViewGroup);
      r.a(this.b.getContext()).a(paramViewGroup, new rh(this));
      if ((localSearchPeopleValue.bigvInfo == null) || (localSearchPeopleValue.bigvInfo.size() <= 0)) {
        break label748;
      }
      if (localSearchPeopleValue.bigvInfo.size() <= 3) {
        break label647;
      }
      this.a.e.setVisibility(0);
      this.a.d.setVisibility(0);
      this.a.e.removeAllViews();
      this.a.d.removeAllViews();
      paramInt = 0;
      if (paramInt >= 3) {
        break label578;
      }
      paramViewGroup = this.a.e;
      localPeopleItem = (SearchPeopleVo.PeopleItem)localSearchPeopleValue.bigvInfo.get(paramInt);
      if (paramInt != 0) {
        break label572;
      }
    }
    label454:
    label472:
    label530:
    label572:
    for (boolean bool = true;; bool = false)
    {
      paramViewGroup.addView(a(localPeopleItem, bool));
      paramInt += 1;
      break label387;
      this.a = ((ri)paramView.getTag());
      break;
      this.a.c.setText(localSearchPeopleValue.dzhName);
      break label206;
      if (!TextUtils.isEmpty(localSearchPeopleValue.nickName))
      {
        this.a.c.setText(localSearchPeopleValue.nickName);
        break label206;
      }
      if (TextUtils.isEmpty(localSearchPeopleValue.userName)) {
        break label206;
      }
      this.a.c.setText(localSearchPeopleValue.userName);
      break label206;
      paramViewGroup = localSearchPeopleValue.imageURL + "?time=" + paramViewGroup.format(new Date());
      break label267;
    }
    label578:
    paramInt = 3;
    if (paramInt < localSearchPeopleValue.bigvInfo.size())
    {
      paramViewGroup = this.a.d;
      localPeopleItem = (SearchPeopleVo.PeopleItem)localSearchPeopleValue.bigvInfo.get(paramInt);
      if (paramInt == 3) {}
      for (bool = true;; bool = false)
      {
        paramViewGroup.addView(a(localPeopleItem, bool));
        paramInt += 1;
        break;
      }
      label647:
      this.a.e.setVisibility(0);
      this.a.d.setVisibility(8);
      this.a.e.removeAllViews();
      paramInt = 0;
      if (paramInt < localSearchPeopleValue.bigvInfo.size())
      {
        paramViewGroup = this.a.e;
        localPeopleItem = (SearchPeopleVo.PeopleItem)localSearchPeopleValue.bigvInfo.get(paramInt);
        if (paramInt == 0) {}
        for (bool = true;; bool = false)
        {
          paramViewGroup.addView(a(localPeopleItem, bool));
          paramInt += 1;
          break;
        }
        label748:
        this.a.e.setVisibility(8);
        this.a.d.setVisibility(8);
      }
    }
    switch (rd.a[SearchPeopleFragment.a(this.b).ordinal()])
    {
    default: 
      return paramView;
    case 1: 
      this.a.c.setTextColor(Color.parseColor("#ffffff"));
      return paramView;
    }
    this.a.c.setTextColor(Color.parseColor("#222222"));
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */