package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.WarningItem;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.w;
import java.util.ArrayList;
import java.util.List;

public class MessageWarnScreen
  extends BaseActivity
{
  private ListView a;
  private jl b;
  private ji c;
  private String[] d = null;
  private jm e;
  private int[] f = null;
  private View g;
  private TextView h;
  private View i;
  private com.android.dazhihui.ui.a.m j;
  private com.android.dazhihui.a.b.m k = null;
  private com.android.dazhihui.a.b.m l = null;
  
  public void a()
  {
    x localx1 = new x(3001);
    localx1.b(2);
    x localx2 = new x(307);
    localx2.a("");
    localx2.a("");
    if ((w.a().k() == null) || (w.a().k().length() < 11)) {
      localx2.a("");
    }
    for (;;)
    {
      localx2.a(w.a().n());
      localx2.a(g.a().v());
      localx2.b(g.a().ac());
      localx2.a(g.a().r());
      localx1.a(localx2, this.j.h());
      this.k = new com.android.dazhihui.a.b.m(localx1);
      registRequestListener(this.k);
      sendRequest(this.k);
      return;
      localx2.a(w.a().k());
    }
  }
  
  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    x localx1 = new x(3001);
    localx1.b(2);
    x localx2 = new x(301);
    localx2.a(w.a().f());
    localx2.a("");
    if ((w.a().k() == null) || (w.a().k().length() < 11)) {
      localx2.a("");
    }
    for (;;)
    {
      localx2.a(w.a().n());
      localx2.a(g.a().v());
      localx2.b(3);
      localx2.a(g.a().r());
      localx2.b(paramArrayOfInt);
      localx1.a(localx2, com.android.dazhihui.ui.a.m.a().h());
      this.l = new com.android.dazhihui.a.b.m(localx1);
      registRequestListener(this.l);
      sendRequest(this.l);
      return;
      localx2.a(w.a().k());
    }
  }
  
  public void b()
  {
    if (ji.a(this.c))
    {
      ji.a(this.c, false);
      this.h.setText("编辑");
    }
    for (;;)
    {
      this.c.notifyDataSetChanged();
      this.c.notifyDataSetInvalidated();
      return;
      ji.a(this.c, true);
      this.h.setText("保存");
    }
  }
  
  public void c()
  {
    try
    {
      if (this.a.getAdapter() == this.c)
      {
        a();
        n.c("=======current");
        this.c.notifyDataSetChanged();
        this.c.notifyDataSetInvalidated();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (jh.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.i == null);
      this.i.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.i == null);
    this.i.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void d()
  {
    this.c.notifyDataSetChanged();
    this.c.notifyDataSetInvalidated();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramj instanceof o))
    {
      paramh = ((o)paramj).h();
      if ((paramh != null) && (paramh.b != null) && (paramh.a == 3001))
      {
        paramh = new q(paramh.b);
        m = paramh.b();
        n.c("=======COMM_WARNING  flag=window" + m);
        if (m != 0) {
          break label83;
        }
      }
    }
    label82:
    label83:
    while ((m == 1) || (m != 2)) {
      return;
    }
    int m = 0;
    label98:
    int n = paramh.e();
    paramh.e();
    paramh.e();
    this.j.c(paramh.h());
    switch (n)
    {
    default: 
      m = 1;
    }
    for (;;)
    {
      if (m != 0) {
        break label82;
      }
      break label98;
      n = paramh.b();
      if (n == 0)
      {
        a();
      }
      else if (n == 1)
      {
        showShortToast(paramh.l());
        continue;
        n = paramh.b();
        if (n == 0)
        {
          int i1 = paramh.e();
          if (i1 < 0) {
            break;
          }
          label255:
          Object localObject;
          if (this.j.e() == null)
          {
            this.j.a(new ArrayList());
            paramj = new ArrayList();
            n = 0;
            if (n >= i1) {
              break label436;
            }
            localObject = new WarningItem();
            ((WarningItem)localObject).setmWarningId(paramh.h());
            ((WarningItem)localObject).setmWarningCode(paramh.l());
            ((WarningItem)localObject).setmWarningName(paramh.l());
            ((WarningItem)localObject).setmOverPrice(paramh.i());
            ((WarningItem)localObject).setmBelowPrice(paramh.i());
            ((WarningItem)localObject).setmDayIncrease(paramh.i());
            ((WarningItem)localObject).setmDayIncreaseNum(paramh.b());
            ((WarningItem)localObject).setmDayFall(paramh.i());
            ((WarningItem)localObject).setmDayFallNum(paramh.b());
            ((WarningItem)localObject).setmDayHandOver(paramh.i());
            ((WarningItem)localObject).setmDayHandOverNum(paramh.b());
            ((WarningItem)localObject).setmDayLandMine(paramh.b());
            ((WarningItem)localObject).setmDecimalNum(paramh.b());
            if (!((WarningItem)localObject).isWarningValid()) {
              break label419;
            }
            this.j.e().add(localObject);
          }
          for (;;)
          {
            n += 1;
            break label255;
            this.j.e().clear();
            break;
            label419:
            paramj.add(Integer.valueOf(((WarningItem)localObject).getmWarningId()));
          }
          label436:
          if (paramj.size() > 0)
          {
            localObject = new int[paramj.size()];
            n = 0;
            while (n < paramj.size())
            {
              localObject[n] = ((Integer)paramj.get(n)).intValue();
              n += 1;
            }
            a((int[])localObject);
          }
          d();
          continue;
        }
        if (n == 1) {
          showShortToast(paramh.l());
        }
      }
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903307);
    this.j = com.android.dazhihui.ui.a.m.a();
    this.i = findViewById(2131560185);
    paramBundle = findViewById(2131560627);
    this.h = ((TextView)findViewById(2131560628));
    this.h.setText(getResources().getString(2131165288));
    this.h.setVisibility(0);
    ((TextView)findViewById(2131558634)).setText(getString(2131165508));
    paramBundle.setOnClickListener(new jb(this));
    this.h.setOnClickListener(new jc(this));
    this.d = getResources().getStringArray(2131361851);
    if (com.android.dazhihui.ui.a.m.a().e() == null) {
      com.android.dazhihui.ui.a.m.a().a(new ArrayList());
    }
    this.a = ((ListView)findViewById(2131559984));
    this.b = new jl(this);
    this.g = findViewById(2131559979);
    this.g.setOnClickListener(this.b);
    this.c = new ji(this);
    a();
    this.a.setAdapter(this.c);
    this.g.setVisibility(0);
    this.e = new jm(this);
    this.a.setOnItemClickListener(this.e);
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  protected Dialog onCreateDialog(int paramInt)
  {
    if (paramInt == 101) {
      return new AlertDialog.Builder(this).setIcon(2130837525).setTitle(2131165404).setPositiveButton(2131165363, new je(this)).setNegativeButton(2131165331, new jd(this)).create();
    }
    if (paramInt == 102) {
      return new AlertDialog.Builder(this).setIcon(2130837525).setTitle(2131165408).setPositiveButton(2131165363, new jg(this)).setNegativeButton(2131165331, new jf(this)).create();
    }
    return super.onCreateDialog(paramInt);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    c();
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MessageWarnScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */