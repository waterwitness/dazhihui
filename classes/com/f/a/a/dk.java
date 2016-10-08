package com.f.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.unionpay.upomp.lthj.plugin.model.GetBankService;
import com.unionpay.upomp.lthj.plugin.ui.SupportCardActivity;
import java.util.Vector;

public class dk
  extends BaseAdapter
{
  public dk(SupportCardActivity paramSupportCardActivity) {}
  
  public int getCount()
  {
    if (SupportCardActivity.b(this.a) == null) {
      return 0;
    }
    if (SupportCardActivity.c(this.a) > SupportCardActivity.b(this.a).size()) {
      return SupportCardActivity.b(this.a).size();
    }
    return SupportCardActivity.c(this.a);
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
    localCheckBox1.setClickable(false);
    localCheckBox2.setClickable(false);
    GetBankService localGetBankService;
    if (SupportCardActivity.b(this.a) != null)
    {
      localGetBankService = (GetBankService)SupportCardActivity.b(this.a).get(paramInt);
      paramViewGroup.setText(localGetBankService.panBank);
      if (!localGetBankService.creditCard.equals("1")) {
        break label137;
      }
      localCheckBox2.setChecked(true);
    }
    while (localGetBankService.debitCard.equals("1"))
    {
      localCheckBox1.setChecked(true);
      return paramView;
      label137:
      localCheckBox2.setChecked(false);
    }
    localCheckBox1.setChecked(false);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */