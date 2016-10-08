package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;

public class LeftMenuVo$LeftMenuItem
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String apppackage;
  private int calltype;
  private String callurl;
  private int countid;
  private String imagepath;
  private boolean isShowRed;
  private int menuflag;
  private String menuname;
  
  public String getApppackage()
  {
    return this.apppackage;
  }
  
  public int getCalltype()
  {
    return this.calltype;
  }
  
  public String getCallurl()
  {
    return this.callurl;
  }
  
  public int getCountId()
  {
    return this.countid;
  }
  
  public String getImagepath()
  {
    return this.imagepath;
  }
  
  public int getMenuflag()
  {
    return this.menuflag;
  }
  
  public String getMenuname()
  {
    return this.menuname;
  }
  
  public boolean isShowRed()
  {
    return this.isShowRed;
  }
  
  public void setIsShowRed(boolean paramBoolean)
  {
    this.isShowRed = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LeftMenuVo$LeftMenuItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */