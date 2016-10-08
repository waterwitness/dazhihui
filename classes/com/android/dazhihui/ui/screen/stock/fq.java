package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.model.stock.KLineCjhbVo;
import com.android.dazhihui.ui.model.stock.KLineGdzjcVo;
import com.android.dazhihui.ui.model.stock.KLineGdzjcVo.GdzjcItem;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.KlineDataTableView;
import com.android.dazhihui.ui.widget.stockchart.w;
import com.android.dazhihui.ui.widget.stockchart.x;
import com.android.dazhihui.ui.widget.stockchart.y;
import com.android.dazhihui.ui.widget.stockchart.z;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

public class fq
  extends e
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private f h;
  private KlineDataTableView i;
  
  private void a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() < 5)) {
      return;
    }
    this.h = new f();
    this.h.c(paramString1);
    this.h.a(paramString2);
    registRequestListener(this.h);
    sendRequest(this.h);
  }
  
  public void a()
  {
    Bundle localBundle = getBundle();
    this.a = localBundle.getString("title");
    this.b = localBundle.getString("newsDate");
    this.c = localBundle.getString("type");
    this.d = localBundle.getString("newsid");
    this.e = localBundle.getString("url");
    this.f = localBundle.getString("name");
    this.g = localBundle.getString("code");
    refresh();
  }
  
  public void b()
  {
    this.i.a();
  }
  
  public void c()
  {
    Bundle localBundle = getBundle();
    this.a = localBundle.getString("title");
    this.b = localBundle.getString("newsDate");
    this.c = localBundle.getString("type");
    this.d = localBundle.getString("newsid");
    this.e = localBundle.getString("url");
    this.f = localBundle.getString("name");
    this.g = localBundle.getString("code");
    a(this.e, this.c);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.h)
    {
      paramj = (g)paramj;
      if (paramj != null) {}
    }
    else
    {
      return;
    }
    paramh = (String)paramh.j();
    if (paramh.equals("2"))
    {
      paramh = paramj.a();
      paramj = new y();
    }
    for (;;)
    {
      try
      {
        paramj.a(new String(paramh, "UTF-8"));
        paramj = paramj.a().iterator();
        if (!paramj.hasNext()) {
          break label423;
        }
        paramh = (z)paramj.next();
        if (!paramh.b.equals(this.d)) {
          continue;
        }
        this.i.a(this.c, this.a, this.b, paramh);
        return;
      }
      catch (UnsupportedEncodingException paramh)
      {
        paramh.printStackTrace();
        return;
      }
      if (paramh.equals("1"))
      {
        paramh = paramj.a();
        paramj = new KLineCjhbVo();
        try
        {
          paramj.decode(new String(paramh, "UTF-8"));
          this.i.a(this.c, this.a, this.b, paramj, this.d);
          return;
        }
        catch (UnsupportedEncodingException paramh)
        {
          paramh.printStackTrace();
          return;
        }
      }
      if (paramh.equals("3"))
      {
        paramh = paramj.a();
        paramj = new w();
      }
      for (;;)
      {
        try
        {
          paramj.a(new String(paramh, "UTF-8"));
          paramj = paramj.a().iterator();
          if (!paramj.hasNext()) {
            break label418;
          }
          paramh = (x)paramj.next();
          if (!paramh.h.equals(this.d)) {
            continue;
          }
          this.i.a(this.c, this.a, this.b, paramh);
          return;
        }
        catch (UnsupportedEncodingException paramh)
        {
          paramh.printStackTrace();
          return;
        }
        if (!paramh.equals("4")) {
          break;
        }
        paramh = paramj.a();
        paramj = new KLineGdzjcVo();
        for (;;)
        {
          try
          {
            paramj.decode(new String(paramh, "UTF-8"));
            paramj = paramj.getItems().iterator();
            if (paramj.hasNext())
            {
              paramh = (KLineGdzjcVo.GdzjcItem)paramj.next();
              if (!paramh.newsid.equals(this.d)) {
                continue;
              }
              this.i.a(this.c, this.a, this.b, paramh);
              return;
            }
          }
          catch (UnsupportedEncodingException paramh)
          {
            paramh.printStackTrace();
            return;
          }
          paramh = null;
        }
        label418:
        paramh = null;
      }
      label423:
      paramh = null;
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903223, paramViewGroup, false);
    this.i = ((KlineDataTableView)paramLayoutInflater.findViewById(2131559556));
    return paramLayoutInflater;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean)
    {
      if (getBundle().getString("code") != this.g) {
        b();
      }
      c();
    }
  }
  
  public void refresh()
  {
    if (getBundle().getString("code") != this.g) {
      b();
    }
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */