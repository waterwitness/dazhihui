package com.f.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.unionpay.upomp.lthj.plugin.model.PanBank;
import com.unionpay.upomp.lthj.plugin.ui.SupportCardActivity;
import java.util.Vector;

public class dy
  extends BaseAdapter
{
  public dy(SupportCardActivity paramSupportCardActivity) {}
  
  public int getCount()
  {
    if (SupportCardActivity.a(this.a) == null) {
      return 0;
    }
    return SupportCardActivity.a(this.a).size();
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
    paramView = LayoutInflater.from(this.a).inflate(bp.am(), null);
    paramViewGroup = (TextView)paramView.findViewById(bp.bO());
    CheckBox localCheckBox1 = (CheckBox)paramView.findViewById(bp.bM());
    CheckBox localCheckBox2 = (CheckBox)paramView.findViewById(bp.bN());
    localCheckBox1.setChecked(true);
    localCheckBox2.setVisibility(8);
    paramViewGroup.setText(((PanBank)SupportCardActivity.a(this.a).get(paramInt)).getPanBank());
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */