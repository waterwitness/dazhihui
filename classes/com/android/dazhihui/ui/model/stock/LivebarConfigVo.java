package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class LivebarConfigVo
  implements Serializable
{
  private LivebarConfigVo.data data;
  private LivebarConfigVo.header header;
  private long time;
  
  public LivebarConfigVo.data getData()
  {
    return this.data;
  }
  
  public LivebarConfigVo.header getHeader()
  {
    return this.header;
  }
  
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
  
  public void setData(LivebarConfigVo.data paramdata)
  {
    this.data = paramdata;
  }
  
  public void setHeader(LivebarConfigVo.header paramheader)
  {
    this.header = paramheader;
  }
  
  public void setTime(long paramLong)
  {
    this.time = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LivebarConfigVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */