package com.android.dazhihui.ui.widget.a;

import android.graphics.BitmapFactory;
import java.util.HashMap;
import java.util.List;

class s
  implements aa
{
  s(r paramr, HashMap paramHashMap, List paramList, String[] paramArrayOfString, ab paramab) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    if (paramArrayOfByte != null)
    {
      this.a.put(paramString, BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length));
      if ((this.a.size() == this.c.length) && (this.d != null))
      {
        paramString = this.d;
        if (this.b.size() <= 0) {
          break label100;
        }
      }
    }
    for (;;)
    {
      paramString.a(bool, this.a);
      return;
      this.b.add(Boolean.valueOf(true));
      this.a.put(paramString, null);
      break;
      label100:
      bool = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */