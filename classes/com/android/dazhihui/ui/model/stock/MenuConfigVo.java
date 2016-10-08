package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;

public class MenuConfigVo
  implements Serializable
{
  private static final long serialVersionUID = 8584392639069175077L;
  public MenuConfigVo.Data data;
  public MenuConfigVo.Header header;
  public long time;
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    return Math.abs(this.time - l) <= 21600000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MenuConfigVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */