package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class ds
  extends e
  implements cs
{
  protected String a;
  protected String b;
  private ScrollView c;
  private TextView d;
  private DzhHeader e;
  
  private void a()
  {
    Object localObject = new x(2315);
    ((x)localObject).a(this.a);
    localObject = new m((x)localObject);
    registRequestListener((h)localObject);
    sendRequest((h)localObject);
    if (this.e != null)
    {
      this.e.setMoreRefresh(true);
      this.e.a();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct) {}
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.e = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    do
    {
      try
      {
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      finally
      {
        if (this.e == null) {
          break;
        }
        this.e.b();
      }
      paramh = paramh.h();
      if (paramh != null)
      {
        paramh = new q(paramh.b);
        this.d.setText(n.a(paramh.l()));
      }
    } while (this.e == null);
    this.e.b();
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.e != null) {
      this.e.b();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.e != null) {
      this.e.b();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    this.a = paramBundle.getString("code");
    this.b = paramBundle.getString("name");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903138, null);
    this.c = ((ScrollView)paramLayoutInflater.findViewById(2131559083));
    this.d = ((TextView)paramLayoutInflater.findViewById(2131559084));
    return paramLayoutInflater;
  }
  
  public void onResume()
  {
    super.onResume();
    a();
  }
  
  public void refresh()
  {
    if (isVisible()) {
      a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */