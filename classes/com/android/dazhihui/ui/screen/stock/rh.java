package com.android.dazhihui.ui.screen.stock;

import android.graphics.BitmapFactory;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.aa;

class rh
  implements aa
{
  rh(rg paramrg) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    if ((paramString.equals(this.a.a.a.getTag())) && (paramArrayOfByte != null)) {
      this.a.a.a.setImageBitmap(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */