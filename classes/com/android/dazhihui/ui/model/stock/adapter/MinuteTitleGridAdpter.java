package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;

public class MinuteTitleGridAdpter
  extends BaseAdapter
{
  private int[] drawables;
  private int[] ids;
  private LayoutInflater mInflater;
  private y mLookFace = y.a;
  private String[] titles;
  
  public MinuteTitleGridAdpter(Context paramContext, int[] paramArrayOfInt1, int[] paramArrayOfInt2, String[] paramArrayOfString)
  {
    this.mInflater = LayoutInflater.from(paramContext);
    this.ids = paramArrayOfInt1;
    this.drawables = paramArrayOfInt2;
    if (paramArrayOfString == null)
    {
      this.titles = new String[0];
      return;
    }
    this.titles = paramArrayOfString;
  }
  
  public MinuteTitleGridAdpter(Context paramContext, int[] paramArrayOfInt1, int[] paramArrayOfInt2, String[] paramArrayOfString, y paramy)
  {
    this.mInflater = LayoutInflater.from(paramContext);
    this.ids = paramArrayOfInt1;
    this.drawables = paramArrayOfInt2;
    if (paramArrayOfString == null) {}
    for (this.titles = new String[0];; this.titles = paramArrayOfString)
    {
      this.mLookFace = paramy;
      return;
    }
  }
  
  public int getCount()
  {
    return this.titles.length;
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
    View localView;
    if (paramView == null)
    {
      localView = this.mInflater.inflate(2130903311, null);
      paramView = new MinuteTitleGridAdpter.Holder();
      paramView.icon = ((ImageView)localView.findViewById(2131560010));
      paramView.title = ((TextView)localView.findViewById(2131560011));
      paramView.title.setGravity(0);
      localView.setTag(paramView);
      paramViewGroup = paramView;
      paramViewGroup.icon.setImageResource(this.drawables[paramInt]);
      paramViewGroup.title.setText(this.titles[paramInt]);
      if (this.mLookFace != y.b) {
        break label148;
      }
      paramViewGroup.title.setTextColor(-14540254);
    }
    for (;;)
    {
      if (this.ids != null) {
        localView.setId(this.ids[paramInt]);
      }
      return localView;
      paramViewGroup = (MinuteTitleGridAdpter.Holder)paramView.getTag();
      localView = paramView;
      break;
      label148:
      paramViewGroup.title.setTextColor(-5395027);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\MinuteTitleGridAdpter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */