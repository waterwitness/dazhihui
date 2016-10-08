package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class SearchHuiShowConfigVo
  implements Serializable
{
  public String SearchBoxPlaceholder;
  public String VoiceButtonText;
  public Boolean isVisible;
  public Boolean isVoiceGo = Boolean.valueOf(false);
  private long time = System.currentTimeMillis();
  
  public long getTime()
  {
    return this.time;
  }
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    return localSimpleDateFormat.format(Long.valueOf(this.time)).equals(localSimpleDateFormat.format(Long.valueOf(l)));
  }
  
  public void setTime(long paramLong)
  {
    this.time = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SearchHuiShowConfigVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */