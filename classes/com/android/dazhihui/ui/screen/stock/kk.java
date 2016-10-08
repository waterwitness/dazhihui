package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.v;
import com.android.dazhihui.w;
import com.c.a.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

class kk
  implements v
{
  kk(ju paramju, String paramString1, String paramString2, String paramString3, k paramk) {}
  
  public void a(String paramString)
  {
    paramString = new LinkedHashMap();
    paramString.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), this.a, this.b, w.a().o(), this.c, ""));
    paramString.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    Object localObject = new ArrayList(1);
    ((ArrayList)localObject).add(paramString);
    new kl(this).getType();
    paramString = this.d.a(localObject);
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    ju.b(this.e, new m((x)localObject));
    ju.o(this.e).a(this.e);
    com.android.dazhihui.a.g.a().a(ju.o(this.e));
    this.e.e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */