package com.android.dazhihui.ui.delegate.screen;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.widget.bo;

class fs
  implements bo
{
  fs(fi paramfi) {}
  
  public void a(String paramString, int paramInt)
  {
    if (paramString == null) {
      return;
    }
    if (o.t(paramString))
    {
      fi.c(this.a).setVisibility(8);
      fi.d(this.a).setVisibility(0);
      fi.e(this.a).setText("        即日起，您可以点击下方按钮直接打开“" + paramString + "”进行委托交易，给您带来的不便敬请谅解。\n" + "        您也可以选择其他券商享受更好的股票交易服务。");
      fi.f(this.a).setText("打开券商");
      return;
    }
    fi.c(this.a).setVisibility(0);
    fi.d(this.a).setVisibility(8);
    fi.f(this.a).setText("登录");
    a.a().a("");
    a.a().b("");
    if ((o.s != null) && (!o.s.equals(paramString))) {
      o.r = false;
    }
    fi.a(this.a, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */