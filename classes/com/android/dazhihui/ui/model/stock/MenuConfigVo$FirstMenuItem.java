package com.android.dazhihui.ui.model.stock;

import java.util.List;

public class MenuConfigVo$FirstMenuItem
{
  public int countid;
  public String fname;
  public int id;
  public int menuflag;
  public List<MenuConfigVo.SecondMenuItem> subnames;
  public int type;
  public String urlPath;
  
  public MenuConfigVo$FirstMenuItem() {}
  
  public MenuConfigVo$FirstMenuItem(int paramInt, String paramString, List<MenuConfigVo.SecondMenuItem> paramList)
  {
    this.id = paramInt;
    this.fname = paramString;
    this.subnames = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MenuConfigVo$FirstMenuItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */