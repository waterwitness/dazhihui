package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class StockMinuteMenuVo
  implements Serializable
{
  private static final long serialVersionUID = 8584392639069175039L;
  public StockMinuteMenuVo.Config config;
  public StockMinuteMenuVo.Header header;
  public long time;
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    return localSimpleDateFormat.format(Long.valueOf(this.time)).equals(localSimpleDateFormat.format(Long.valueOf(l)));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockMinuteMenuVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */