package com.android.dazhihui.ui.screen.stock;

import android.widget.EditText;
import com.android.dazhihui.ui.model.stock.PinyinGen;
import com.android.dazhihui.ui.widget.hl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class rk
  implements hl
{
  rk(SearchStockScreen paramSearchStockScreen) {}
  
  public void a(int paramInt, String paramString)
  {
    if (paramString == null) {
      return;
    }
    String str = Pattern.compile("\\s+").matcher(paramString).replaceAll("");
    paramString = str;
    if (Pattern.matches("[\\u4E00-\\u9FA5]+", str))
    {
      String[] arrayOfString = PinyinGen.getPinyins(str);
      paramString = str;
      if (arrayOfString != null)
      {
        paramString = str;
        if (arrayOfString.length > 0) {
          paramString = arrayOfString[0];
        }
      }
    }
    SearchStockScreen.d(this.a).setText(paramString);
    SearchStockScreen.d(this.a).setSelection(paramString.length());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */