package com.android.dazhihui.ui.delegate.screen;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.DropDownEditTextView2;
import com.android.dazhihui.ui.widget.by;
import java.util.ArrayList;
import java.util.Iterator;

class ea
  implements by
{
  ea(dy paramdy) {}
  
  public void a(String paramString, int paramInt)
  {
    dy.m(this.a);
    if (paramString == null)
    {
      return;
      break label11;
    }
    label11:
    while ((com.android.dazhihui.c.a.a.E == null) || (com.android.dazhihui.c.a.a.E.length <= 0)) {}
    Object localObject1 = "0";
    Object localObject2;
    Object localObject3;
    if (o.a(dy.k(this.a).getCurrentItem()))
    {
      if (dy.s(this.a).getCheckedRadioButtonId() == dy.h(this.a).getId()) {
        localObject1 = "0";
      }
    }
    else
    {
      localObject2 = "";
      localObject3 = "";
      paramInt = 0;
      label80:
      if (paramInt >= com.android.dazhihui.c.a.a.E.length) {
        break label225;
      }
      if (com.android.dazhihui.c.a.a.E[paramInt].length >= 7) {
        break label212;
      }
    }
    label212:
    for (String str = "0";; str = com.android.dazhihui.c.a.a.E[paramInt][6])
    {
      Object localObject5 = localObject3;
      Object localObject4 = localObject2;
      if (dy.k(this.a).getCurrentItem().equals(com.android.dazhihui.c.a.a.E[paramInt][0]))
      {
        localObject5 = localObject3;
        localObject4 = localObject2;
        if (paramString.equals(com.android.dazhihui.c.a.a.E[paramInt][2]))
        {
          localObject5 = localObject3;
          localObject4 = localObject2;
          if (str.equals(localObject1))
          {
            localObject4 = com.android.dazhihui.c.a.a.E[paramInt][1];
            localObject5 = com.android.dazhihui.c.a.a.E[paramInt][4];
          }
        }
      }
      paramInt += 1;
      localObject3 = localObject5;
      localObject2 = localObject4;
      break label80;
      localObject1 = "1";
      break;
    }
    label225:
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      dy.d(this.a, (String)localObject2);
      label243:
      if (TextUtils.isEmpty((CharSequence)localObject3)) {
        break label371;
      }
      dy.e(this.a, (String)localObject3);
    }
    for (;;)
    {
      dy.t(this.a);
      paramString = com.android.dazhihui.ui.delegate.a.a().b();
      if (paramString == null) {
        break;
      }
      paramString = paramString.iterator();
      if (!paramString.hasNext()) {
        break;
      }
      localObject1 = (c)paramString.next();
      if ((!((c)localObject1).c().equals(dy.k(this.a).getCurrentItem())) || (!((c)localObject1).d().equals(dy.l(this.a).getCurrentItem()))) {
        break;
      }
      dy.g(this.a).setText(((c)localObject1).e());
      return;
      dy.d(this.a, "");
      break label243;
      label371:
      dy.e(this.a, "");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */