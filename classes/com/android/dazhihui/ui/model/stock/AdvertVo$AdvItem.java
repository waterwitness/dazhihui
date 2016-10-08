package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.g;
import java.util.ArrayList;

public class AdvertVo$AdvItem
{
  public String apppackage;
  public String calltype;
  public String callurl;
  public String colour;
  public String countid;
  public ArrayList<String> img;
  public ArrayList<String> imgpx;
  public String text;
  
  public String[] getMatchImg()
  {
    int j = g.a().m();
    if ((this.imgpx != null) && (this.imgpx.size() > 0))
    {
      Object localObject = new int[this.imgpx.size()];
      int i = 0;
      while (i < this.imgpx.size())
      {
        localObject[i] = Math.abs(j - Integer.parseInt(((String)this.imgpx.get(i)).split("\\*")[0]));
        i += 1;
      }
      int m = 0;
      j = Integer.MAX_VALUE;
      i = 0;
      while (i < localObject.length)
      {
        int k = j;
        if (localObject[i] < j)
        {
          k = localObject[i];
          m = i;
        }
        i += 1;
        j = k;
      }
      localObject = (String)this.img.get(m);
      String[] arrayOfString = ((String)this.imgpx.get(m)).split("\\*");
      return new String[] { localObject, arrayOfString[0], arrayOfString[1] };
    }
    return null;
  }
  
  public String[] getMatchImg1()
  {
    int i = g.a().m();
    if ((this.imgpx != null) && (this.imgpx.size() > 0))
    {
      if (i <= 720) {
        i = 0;
      }
      for (;;)
      {
        String str = (String)this.img.get(i);
        String[] arrayOfString = ((String)this.imgpx.get(i)).split("\\*");
        return new String[] { str, arrayOfString[0], arrayOfString[1] };
        if ((i > 720) && (i < 1080))
        {
          if (this.imgpx.size() == 3) {
            i = 1;
          } else if (this.imgpx.size() == 2) {
            i = 1;
          } else {
            i = 0;
          }
        }
        else if (this.imgpx.size() == 3) {
          i = 2;
        } else if (this.imgpx.size() == 2) {
          i = 1;
        } else {
          i = 0;
        }
      }
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\AdvertVo$AdvItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */