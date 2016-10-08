package com.android.dazhihui.ui.widget.dzhrefresh;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.ui.model.stock.WordsVo;
import com.android.dazhihui.ui.model.stock.WordsVo.Data;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.c.a.k;

public class q
  implements i
{
  private static q c;
  private WordsVo a;
  private com.android.dazhihui.a.b.f b;
  
  public static q a()
  {
    if (c == null) {}
    try
    {
      if (c == null) {
        c = new q();
      }
      return c;
    }
    finally {}
  }
  
  private void b(BaseActivity paramBaseActivity)
  {
    this.b = new com.android.dazhihui.a.b.f();
    this.b.c(com.android.dazhihui.a.f.X);
    this.b.a(this);
    paramBaseActivity.sendRequest(this.b);
  }
  
  public void a(BaseActivity paramBaseActivity)
  {
    WordsVo localWordsVo = (WordsVo)DzhApplication.a().b().a("WordsVo", new r(this));
    if ((localWordsVo == null) || (localWordsVo.data == null) || (localWordsVo.data.upPull == null) || (localWordsVo.header == null)) {}
    for (this.a = null;; this.a = localWordsVo)
    {
      if ((this.a == null) || (!this.a.isSameDay())) {
        b(paramBaseActivity);
      }
      return;
    }
  }
  
  public String b()
  {
    if ((this.a == null) || (this.a.data == null) || (this.a.data.upPull == null) || (this.a.data.upPull.length == 0)) {
      return "松手加载数据";
    }
    int i = this.a.data.upPull.length;
    double d = Math.random();
    i = (int)((i - 1 + 0 + 1) * d + 0.0D);
    return this.a.data.upPull[i];
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.b) {}
    try
    {
      paramh = new String(((g)paramj).a());
      this.a = ((WordsVo)new k().a(paramh, WordsVo.class));
      if (this.a != null)
      {
        this.a.time = System.currentTimeMillis();
        DzhApplication.a().b().a("WordsVo", this.a);
      }
      return;
    }
    catch (Exception paramh) {}
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */