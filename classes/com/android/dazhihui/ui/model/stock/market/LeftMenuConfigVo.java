package com.android.dazhihui.ui.model.stock.market;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LeftMenuConfigVo
  implements Serializable
{
  public LeftMenuConfigVo.Data data;
  public LeftMenuConfigVo.Header header;
  public String time;
  
  public boolean isSameDay()
  {
    return new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis())).equals(this.time);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\LeftMenuConfigVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */