package com.f.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;
import com.unionpay.upomp.lthj.widget.LineFrameView;
import java.util.Vector;

public class bh
  extends BaseExpandableListAdapter
{
  public bh(BankCardInfoActivity paramBankCardInfoActivity) {}
  
  public GetBundleBankCardList a(int paramInt)
  {
    return (GetBundleBankCardList)u.a().D.get(paramInt);
  }
  
  public Object getChild(int paramInt1, int paramInt2)
  {
    return null;
  }
  
  public long getChildId(int paramInt1, int paramInt2)
  {
    return paramInt2;
  }
  
  public View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    paramView = LayoutInflater.from(this.a).inflate(bp.ak(), null);
    paramViewGroup = (TextView)paramView.findViewById(bp.dh());
    ImageView localImageView = (ImageView)paramView.findViewById(bp.dg());
    switch (paramInt2)
    {
    default: 
      return paramView;
    case 0: 
      paramViewGroup.setText(bp.eB());
      localImageView.setImageResource(bp.x());
      return paramView;
    case 1: 
      if ("1".equals(((GetBundleBankCardList)u.a().D.get(paramInt1)).isDefault))
      {
        paramViewGroup.setText(bp.eD());
        localImageView.setImageResource(bp.B());
        return paramView;
      }
      paramViewGroup.setText(bp.eC());
      localImageView.setImageResource(bp.A());
      return paramView;
    }
    paramViewGroup.setText(bp.eD());
    localImageView.setImageResource(bp.B());
    return paramView;
  }
  
  public int getChildrenCount(int paramInt)
  {
    if (((GetBundleBankCardList)u.a().D.get(paramInt)).isDefault.equals("1")) {
      return 2;
    }
    return 3;
  }
  
  public int getGroupCount()
  {
    return u.a().D.size();
  }
  
  public long getGroupId(int paramInt)
  {
    return paramInt;
  }
  
  public View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    paramView = LayoutInflater.from(this.a).inflate(bp.ag(), null);
    Object localObject = (LineFrameView)paramView.findViewById(bp.bq());
    paramViewGroup = (GetBundleBankCardList)u.a().D.get(paramInt);
    ((LineFrameView)localObject).a(paramViewGroup.panBank + ec.b(paramViewGroup.panType) + paramViewGroup.pan.subSequence(paramViewGroup.pan.length() - 4, paramViewGroup.pan.length()));
    localObject = (ImageView)paramView.findViewById(bp.ax());
    if ("1".equals(paramViewGroup.isDefault))
    {
      paramView.findViewById(bp.ay()).setVisibility(0);
      ((ImageView)localObject).setBackgroundResource(bp.C());
      return paramView;
    }
    paramView.findViewById(bp.ay()).setVisibility(4);
    ((ImageView)localObject).setBackgroundResource(bp.D());
    return paramView;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public void onGroupCollapsed(int paramInt)
  {
    super.onGroupCollapsed(paramInt);
  }
  
  public void onGroupExpanded(int paramInt)
  {
    super.onGroupExpanded(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */