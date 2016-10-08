package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.w;
import com.c.a.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

class ac
  implements com.android.dazhihui.v
{
  ac(v paramv, String paramString1, String paramString2, String paramString3, k paramk) {}
  
  public void a(String paramString)
  {
    paramString = new LinkedHashMap();
    paramString.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), this.a, this.b, w.a().o(), this.c));
    paramString.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    Object localObject = new ArrayList(1);
    ((ArrayList)localObject).add(paramString);
    new ad(this).getType();
    paramString = this.d.a(localObject);
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    v.a(this.e, new m((x)localObject));
    v.h(this.e).a(this.e);
    com.android.dazhihui.a.g.a().a(v.h(this.e));
    this.e.d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */