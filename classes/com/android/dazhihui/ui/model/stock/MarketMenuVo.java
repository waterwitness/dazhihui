package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class MarketMenuVo
  implements Serializable
{
  private static final long serialVersionUID = -4176208671548414188L;
  public MarketMenuVo.Config data;
  public MarketMenuVo.Header header;
  public long time;
  
  public boolean isSameDay()
  {
    if (this.time <= 0L) {}
    long l;
    do
    {
      return false;
      l = System.currentTimeMillis();
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
      localSimpleDateFormat.format(Long.valueOf(this.time));
      localSimpleDateFormat.format(Long.valueOf(l));
    } while (Math.abs(this.time - l) > 21600000L);
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("time=" + this.time);
    if (this.header != null) {
      localStringBuilder.append(";header=" + this.header.error);
    }
    for (;;)
    {
      if (this.data != null)
      {
        Iterator localIterator;
        MarketMenuVo.MenuItem localMenuItem;
        if (this.data.indexdb != null)
        {
          localIterator = this.data.indexdb.iterator();
          while (localIterator.hasNext())
          {
            localMenuItem = (MarketMenuVo.MenuItem)localIterator.next();
            localStringBuilder.append(";indexdb=" + localMenuItem.toString());
          }
          localStringBuilder.append(";header==NULL");
        }
        else
        {
          localStringBuilder.append(";indexdb==NULL");
          if (this.data.jxtj != null)
          {
            localStringBuilder.append(";data.jxtj=" + this.data.jxtj.rname);
            if (this.data.jxtj.subnames != null)
            {
              localIterator = this.data.jxtj.subnames.iterator();
              while (localIterator.hasNext())
              {
                localMenuItem = (MarketMenuVo.MenuItem)localIterator.next();
                localStringBuilder.append(";subnames=" + localMenuItem.toString());
              }
            }
            localStringBuilder.append(";subnames==NULL");
          }
        }
      }
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append(";jxtj==NULL");
      continue;
      localStringBuilder.append(";data==NULL");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MarketMenuVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */