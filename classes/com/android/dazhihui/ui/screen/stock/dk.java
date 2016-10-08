package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
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
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class dk
  extends e
  implements cs
{
  protected String a;
  protected String b;
  private TableLayoutGroup c;
  private String[] d = null;
  private DzhHeader e;
  
  private void a()
  {
    Object localObject = new x(2313);
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
    int i = 0;
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
        int j;
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
      if ((paramh != null) && (paramh.a == 2313))
      {
        paramh = new q(paramh.b);
        j = paramh.e();
        paramj = new ArrayList();
        while (i < j)
        {
          String[] arrayOfString = new String[this.d.length];
          int[] arrayOfInt = new int[this.d.length];
          mh localmh = new mh();
          int k = paramh.h();
          int m = paramh.h();
          int n = paramh.h();
          int i1 = paramh.h();
          arrayOfString[0] = String.valueOf(k);
          arrayOfInt[0] = -1;
          arrayOfString[1] = String.valueOf(m);
          arrayOfInt[1] = -1;
          arrayOfString[2] = String.valueOf(n);
          arrayOfInt[2] = -1;
          arrayOfString[3] = String.valueOf(i1);
          arrayOfInt[3] = -1;
          arrayOfString[4] = String.valueOf(m + n - i1);
          arrayOfInt[4] = -1;
          arrayOfString[5] = String.valueOf(n - i1);
          arrayOfInt[5] = -1;
          localmh.a = arrayOfString;
          localmh.b = arrayOfInt;
          paramj.add(localmh);
          i += 1;
        }
        this.c.a();
        this.c.a(paramj, 0);
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
    paramLayoutInflater = paramLayoutInflater.inflate(2130903136, null);
    this.c = ((TableLayoutGroup)paramLayoutInflater.findViewById(2131559068));
    this.c.setLayerType(1, null);
    this.d = getResources().getStringArray(2131361817);
    this.c.setContinuousLoading(false);
    this.c.setPullDownLoading(true);
    this.c.setHeaderColumn(this.d);
    this.c.setOnLoadingListener(new dl(this));
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */