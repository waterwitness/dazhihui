package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;

@Deprecated
public class RemoveAccount
  extends BaseActivity
  implements cs
{
  protected int a = 0;
  protected int b = 0;
  String[] c = { "名称" };
  String[] d = { "1006" };
  private int e;
  private a f;
  private ListView g;
  private dq h;
  private DzhHeader i;
  
  private void a()
  {
    int i2 = 0;
    this.f = new a(this);
    this.f.close();
    Object localObject = (String[][])Array.newInstance(String.class, new int[] { a.E.length - 1, 3 });
    String str = a.E[this.e][0];
    int k = 0;
    int m = 0;
    int n = 0;
    int j;
    if (k < a.E.length)
    {
      if (a.E[this.e][0].equals(a.E[k][0]))
      {
        i1 = m;
        j = n;
        if (!a.E[this.e][2].equals(a.E[k][2]))
        {
          localObject[n] = a.E[k];
          j = n + 1;
        }
      }
      for (int i1 = m + 1;; i1 = m)
      {
        k += 1;
        m = i1;
        n = j;
        break;
        localObject[n] = a.E[k];
        j = n + 1;
      }
    }
    if (localObject != null)
    {
      a.E = (String[][])localObject;
      this.f.a(39);
      b();
    }
    if (m == 0)
    {
      if (a.i != null) {
        j = 0;
      }
      for (;;)
      {
        if (j < a.i.length)
        {
          if (a.i[j][2].equals(str))
          {
            a.i[j][0] = "";
            a.i[j][1] = "";
          }
        }
        else
        {
          this.f.a(19);
          localObject = null;
          if (a.A.length > 1) {
            localObject = new String[a.A.length - 1];
          }
          if ((localObject == null) || (localObject.length <= 0)) {
            break label379;
          }
          k = 0;
          j = i2;
          while (j < a.A.length)
          {
            m = k;
            if (!a.A[j].equals(str))
            {
              localObject[k] = a.A[j];
              m = k + 1;
            }
            j += 1;
            k = m;
          }
        }
        j += 1;
      }
    }
    for (;;)
    {
      a.A = (String[])localObject;
      this.f.a(35);
      return;
      label379:
      localObject = new String[1];
      localObject[0] = "无";
    }
  }
  
  private void b()
  {
    this.f = new a(this);
    this.f.close();
    if (a.E != null)
    {
      String[] arrayOfString1 = new String[a.E.length];
      String[] arrayOfString2 = new String[a.E.length];
      int j = 0;
      while (j < a.E.length)
      {
        arrayOfString1[j] = a.E[j][0];
        arrayOfString2[j] = a.E[j][2];
        j += 1;
      }
      this.h = new dq(this, arrayOfString1, arrayOfString2);
      this.g.setAdapter(this.h);
      if (a.E.length == 0) {
        Toast.makeText(this, "没有可删除的账号~~", 0).show();
      }
      return;
    }
    Toast.makeText(this, "没有可删除的账号~~", 0).show();
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 33;
    paramct.d = "删除账号";
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.i = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903392);
    this.g = ((ListView)findViewById(2131560275));
    this.i = ((DzhHeader)findViewById(2131558643));
    this.i.a(this, this);
    b();
    this.g.setOnItemClickListener(new dn(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\RemoveAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */