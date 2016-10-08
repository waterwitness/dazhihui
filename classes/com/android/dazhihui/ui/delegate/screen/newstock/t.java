package com.android.dazhihui.ui.delegate.screen.newstock;

import android.content.res.Resources;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.Hashtable;

class t
  implements mc
{
  t(p paramp) {}
  
  public void a(int paramInt) {}
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    String str1 = parammh.d;
    p.a(this.a, true);
    p.a(this.a, null);
    Object localObject1 = p.d(this.a);
    parammh = str1;
    if (str1 == null) {
      parammh = "";
    }
    ((EditText)localObject1).setText(parammh);
    Object localObject2 = this.a.b(paramInt);
    localObject1 = (String)((Hashtable)localObject2).get("2323");
    String str2 = (String)((Hashtable)localObject2).get("6138");
    p.b(this.a, (String)((Hashtable)localObject2).get("1021"));
    str1 = (String)((Hashtable)localObject2).get("1037");
    TextView localTextView = p.e(this.a);
    parammh = str1;
    if (str1 == null) {
      parammh = "";
    }
    localTextView.setText(parammh);
    str1 = (String)((Hashtable)localObject2).get("1116");
    localObject2 = p.f(this.a);
    parammh = str1;
    if (str1 == null) {
      parammh = "";
    }
    ((EditText)localObject2).setText(parammh);
    p.c(this.a, this.a.a((String)localObject1, str2));
    if (p.g(this.a) == null)
    {
      p.c(this.a, "-");
      p.h(this.a).setText("0");
    }
    for (;;)
    {
      p.i(this.a).setText(this.a.getResources().getString(2131165980, new Object[] { p.g(this.a) }));
      return;
      if (p.g(this.a).contains(".")) {
        p.c(this.a, p.g(this.a).split("\\.")[0]);
      }
      p.h(this.a).setText(p.g(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */