package com.android.dazhihui.ui.widget.stockchart;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.screen.stock.uv;
import java.text.DecimalFormat;

class a
  extends Handler
{
  a(FastDealsView paramFastDealsView) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    String str = (String)paramMessage.obj;
    for (;;)
    {
      try
      {
        if (paramMessage.what == FastDealsView.a)
        {
          if (!TextUtils.isEmpty(str))
          {
            if (TextUtils.isEmpty(FastDealsView.a(this.a).getText().toString()))
            {
              continue;
              Object localObject;
              paramMessage = FastDealsView.b(this.a).format(localObject);
              if (localObject == 0.0D) {
                paramMessage = "0.00";
              }
              FastDealsView.c(this.a).setText("¥ " + paramMessage);
              if (!TextUtils.isEmpty(str))
              {
                if (!(FastDealsView.d(this.a) instanceof uv)) {
                  continue;
                }
                if (FastDealsView.e(this.a) == f.a) {
                  ((uv)FastDealsView.d(this.a)).a(str, 0);
                }
              }
              else
              {
                if (FastDealsView.e(this.a) != f.a) {
                  continue;
                }
                FastDealsView.f(this.a).setBackgroundColor(this.a.getResources().getColor(2131493412));
              }
            }
            else
            {
              paramMessage = FastDealsView.a(this.a).getText().toString().trim();
              d = Float.parseFloat(str) * Double.parseDouble(paramMessage);
              continue;
            }
            ((uv)FastDealsView.d(this.a)).a(str, 1);
            continue;
            if (!(FastDealsView.d(this.a) instanceof eu)) {
              continue;
            }
            if (FastDealsView.e(this.a) == f.a)
            {
              ((eu)FastDealsView.d(this.a)).a(str, 0);
              continue;
            }
            ((eu)FastDealsView.d(this.a)).a(str, 1);
            continue;
            FastDealsView.f(this.a).setBackgroundColor(this.a.getResources().getColor(2131493078));
          }
        }
        else
        {
          if (paramMessage.what != FastDealsView.b) {
            continue;
          }
          paramMessage = FastDealsView.g(this.a).getText().toString().trim();
          if (TextUtils.isEmpty(FastDealsView.g(this.a).getText().toString())) {
            break label527;
          }
          if (TextUtils.isEmpty(str))
          {
            break label527;
            str = FastDealsView.b(this.a).format(d);
            paramMessage = str;
            if (str.equals(".00")) {
              paramMessage = "0.00";
            }
            FastDealsView.c(this.a).setText("¥ " + paramMessage);
            if (FastDealsView.e(this.a) == f.a) {
              FastDealsView.f(this.a).setBackgroundColor(this.a.getResources().getColor(2131493412));
            }
          }
          else
          {
            d = Float.parseFloat(paramMessage);
            d = Double.parseDouble(str) * d;
            continue;
          }
          FastDealsView.f(this.a).setBackgroundColor(this.a.getResources().getColor(2131493078));
          return;
        }
        d = 0.0D;
        continue;
        return;
      }
      catch (NumberFormatException paramMessage)
      {
        return;
      }
      label527:
      double d = 0.0D;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */