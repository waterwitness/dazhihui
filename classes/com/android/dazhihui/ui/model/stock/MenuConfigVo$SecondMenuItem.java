package com.android.dazhihui.ui.model.stock;

public class MenuConfigVo$SecondMenuItem
{
  public int countid;
  public int id;
  public int menuflag;
  public String name;
  public int type;
  public String urlPath;
  
  public MenuConfigVo$SecondMenuItem() {}
  
  public MenuConfigVo$SecondMenuItem(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.id = paramInt1;
    this.name = paramString1;
    this.type = paramInt2;
    this.urlPath = paramString2;
  }
  
  public String getVs()
  {
    return MenuManager.getInstance().getVs() + this.name + this.countid;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MenuConfigVo$SecondMenuItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */