package com.android.thinkive.framework.notice;

import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import java.net.URL;

class NoticeDialog$4$1
  implements Html.ImageGetter
{
  NoticeDialog$4$1(NoticeDialog.4 param4) {}
  
  public Drawable getDrawable(String paramString)
  {
    try
    {
      paramString = Drawable.createFromStream(new URL(paramString).openStream(), "");
      paramString.setBounds(0, 0, paramString.getIntrinsicWidth(), paramString.getIntrinsicHeight());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeDialog$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */