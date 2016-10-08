package com.android.dazhihui.ui.model.stock;

public class WisdomHostVo
{
  public WisdomHostVo.Data data;
  public WisdomHostVo.Header header;
  public long time;
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    return Math.abs(this.time - l) <= 21600000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\WisdomHostVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */