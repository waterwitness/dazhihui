package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.ui.screen.e;

public class MinuteMenuVo
{
  public e fragment;
  public Class<? extends e> fragmentName;
  public boolean ifDeafaule = false;
  public StockMinuteMenuVo.MenuItem item;
  
  public e getFragment()
  {
    return this.fragment;
  }
  
  public Class<? extends e> getFragmentName()
  {
    return this.fragmentName;
  }
  
  public StockMinuteMenuVo.MenuItem getItem()
  {
    return this.item;
  }
  
  public boolean isIfDeafaule()
  {
    return this.ifDeafaule;
  }
  
  public void setFragment(e parame)
  {
    this.fragment = parame;
  }
  
  public void setFragmentName(Class<? extends e> paramClass)
  {
    this.fragmentName = paramClass;
  }
  
  public void setIfDeafaule(boolean paramBoolean)
  {
    this.ifDeafaule = paramBoolean;
  }
  
  public void setItem(StockMinuteMenuVo.MenuItem paramMenuItem)
  {
    this.item = paramMenuItem;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MinuteMenuVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */