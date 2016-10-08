package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.FundLineView;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class dt
  extends e
  implements cs
{
  private FundLineView a;
  private String b;
  private String c;
  private boolean d;
  private Activity e;
  private int f = -1;
  private DzhHeader g;
  
  private void a()
  {
    Object localObject = new x[2];
    localObject[0] = new x(2310);
    localObject[0].a(this.b);
    if (this.d) {
      localObject[1] = new x(2316);
    }
    for (;;)
    {
      localObject[1].a(this.b);
      localObject = new m((x[])localObject);
      registRequestListener((h)localObject);
      sendRequest((h)localObject);
      if (this.g != null)
      {
        this.g.setMoreRefresh(true);
        this.g.a();
      }
      return;
      localObject[1] = new x(2311);
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct) {}
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    label100:
    label163:
    label221:
    try
    {
      paramh = (o)paramj;
      if (paramh == null) {
        return;
      }
    }
    catch (Exception paramh)
    {
      for (;;)
      {
        paramh.printStackTrace();
        return;
        if (paramh.a == 2316)
        {
          paramh = paramh.b;
          if ((paramh != null) && (this.f > -1)) {
            this.a.a(paramh, (byte)this.f);
          }
        }
      }
    }
    finally
    {
      if (this.g == null) {
        break label221;
      }
      this.g.b();
    }
    paramh = paramh.h();
    if (paramh != null)
    {
      if (paramh.a != 2310) {
        break label100;
      }
      paramh = new q(paramh.b);
      paramh.l();
      paramh.l();
      paramh.b();
      this.f = paramh.b();
    }
    for (;;)
    {
      this.a.postInvalidate();
      if (this.g == null) {
        break;
      }
      this.g.b();
      return;
      if (paramh.a != 2311) {
        break label163;
      }
      paramh = paramh.b;
      if ((paramh != null) && (this.f > -1)) {
        this.a.a(paramh, (byte)this.f);
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.g != null) {
      this.g.b();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.g != null) {
      this.g.b();
    }
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.e = paramActivity;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    this.b = paramBundle.getString("code");
    this.c = paramBundle.getString("name");
    this.d = paramBundle.getBoolean("is_currency");
    Log.d("FundTrend", "code=" + this.b + " name=" + this.c);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903139, null);
    this.a = ((FundLineView)paramLayoutInflater.findViewById(2131559085));
    this.a.setOnChangeListener(new du(this));
    this.a.setIsCurrency(this.d);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */