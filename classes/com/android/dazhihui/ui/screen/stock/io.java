package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.stock.a.ao;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.MyRadioButton;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.dd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class io
  extends e
  implements dd
{
  private DzhMainHeader a;
  private int b;
  private int c = -1;
  private List<MenuConfigVo.FirstMenuItem> d;
  
  private String a(int paramInt)
  {
    return "dzh:Tab2:" + paramInt;
  }
  
  private Fragment b(int paramInt)
  {
    if ((this.d != null) && (paramInt < this.d.size()) && (paramInt >= 0)) {
      return MarketManager.get().createFragmentByMarketType(paramInt);
    }
    return ao.a(null);
  }
  
  public void a()
  {
    if ((this.a != null) && (this.d != null))
    {
      int i = 0;
      if (i < this.d.size())
      {
        String str = ((MenuConfigVo.FirstMenuItem)this.d.get(i)).fname;
        if (str.equals("股票")) {
          if (ah.f.isEmpty()) {
            ((MyRadioButton)this.a.getMRadioGroup().getChildAt(i)).setRedHot(0);
          }
        }
        for (;;)
        {
          i += 1;
          break;
          ((MyRadioButton)this.a.getMRadioGroup().getChildAt(i)).setRedHot(1);
          continue;
          if (str.equals("理财"))
          {
            if (ah.g.isEmpty()) {
              ((MyRadioButton)this.a.getMRadioGroup().getChildAt(i)).setRedHot(0);
            } else {
              ((MyRadioButton)this.a.getMRadioGroup().getChildAt(i)).setRedHot(1);
            }
          }
          else if (str.equals("新三板")) {
            if (ah.h.isEmpty()) {
              ((MyRadioButton)this.a.getMRadioGroup().getChildAt(i)).setRedHot(0);
            } else {
              ((MyRadioButton)this.a.getMRadioGroup().getChildAt(i)).setRedHot(1);
            }
          }
        }
      }
      ah.a().b(10002);
    }
  }
  
  public void a(CompoundButton paramCompoundButton, int paramInt, boolean paramBoolean)
  {
    paramCompoundButton = getChildFragmentManager();
    Fragment localFragment = paramCompoundButton.a(a(paramInt));
    if ((paramBoolean) && (this.d != null) && (this.d.size() != 0)) {
      n.a("", ((MenuConfigVo.FirstMenuItem)this.d.get(paramInt)).countid);
    }
    if (localFragment != null) {
      if (paramBoolean)
      {
        paramCompoundButton.a().c(localFragment).b();
        if ((localFragment instanceof e))
        {
          ((e)localFragment).show();
          if ((this.b == paramInt) && (this.c != -1))
          {
            ((e)localFragment).setSubFragmentIndex(this.c, 0);
            this.c = -1;
          }
        }
        this.b = paramInt;
      }
    }
    while (!paramBoolean)
    {
      do
      {
        return;
        paramCompoundButton.a().b(localFragment).b();
      } while (!(localFragment instanceof e));
      ((e)localFragment).beforeHidden();
      return;
    }
    localFragment = b(paramInt);
    paramCompoundButton.a().a(2131560330, localFragment, a(paramInt)).b();
    if ((this.b == paramInt) && (this.c != -1))
    {
      ((e)localFragment).setSubFragmentIndex(this.c, 0);
      this.c = -1;
    }
    this.b = paramInt;
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (this.a != null)
    {
      int i = this.a.getCurrentPostion();
      Fragment localFragment = getChildFragmentManager().a(a(i));
      if (localFragment != null) {
        ((e)localFragment).beforeHidden();
      }
      this.a.f();
    }
  }
  
  public void changeLookFace(y paramy)
  {
    if (this.a != null)
    {
      this.a.a();
      Fragment localFragment = getChildFragmentManager().a(a(this.b));
      if ((localFragment != null) && ((localFragment instanceof e))) {
        ((e)localFragment).changeLookFace(paramy);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int i = 0;
    if (getBundle() != null)
    {
      this.b = getBundle().getInt("fragment_index", -1);
      this.c = getBundle().getInt("fragment_sub_index", -1);
    }
    this.d = MarketManager.get().getFirstMenuItemList();
    paramLayoutInflater = paramLayoutInflater.inflate(2130903406, paramViewGroup, false);
    this.a = ((DzhMainHeader)paramLayoutInflater.findViewById(2131559251));
    this.a.setOnCheckedChangeListener(this);
    this.a.e();
    paramViewGroup = new ArrayList();
    while (i < this.d.size())
    {
      paramBundle = (MenuConfigVo.FirstMenuItem)this.d.get(i);
      if (paramBundle != null) {
        paramViewGroup.add(paramBundle.fname);
      }
      i += 1;
    }
    this.a.a(getActivity(), 2, paramViewGroup);
    this.a.a(this.b, this.c);
    a();
    return paramLayoutInflater;
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == -1) || (paramInt2 == -1)) {}
    do
    {
      return;
      this.b = paramInt1;
      this.c = paramInt2;
    } while (this.a == null);
    this.a.a(paramInt1, paramInt2);
  }
  
  public void show()
  {
    super.show();
    if (this.a != null)
    {
      this.a.a();
      int i = this.a.getCurrentPostion();
      Fragment localFragment = getChildFragmentManager().a(a(i));
      if (localFragment != null) {
        ((e)localFragment).show();
      }
      if ((this.d != null) && (this.d.size() != 0)) {
        n.a("", ((MenuConfigVo.FirstMenuItem)this.d.get(i)).countid);
      }
      this.a.e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\io.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */