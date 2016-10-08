package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.w;

public class go
  extends e
{
  private Button a;
  private FrameLayout b;
  private RelativeLayout c;
  private String d;
  private String e;
  
  public static go a(Bundle paramBundle)
  {
    go localgo = new go();
    localgo.setArguments(paramBundle);
    return localgo;
  }
  
  public void a()
  {
    if (w.a().l())
    {
      this.b.setVisibility(0);
      this.c.setVisibility(8);
      Object localObject = getFragmentManager();
      i locali = (i)((ad)localObject).a(i.class.getSimpleName() + this.e);
      at localat = ((ad)localObject).a();
      localObject = locali;
      if (locali == null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("nexturl", this.d);
        ((Bundle)localObject).putBoolean("ISSHOWTITLE", false);
        ((Bundle)localObject).putInt("BACK_GROUND_COLOR", 1);
        localObject = i.a((Bundle)localObject);
      }
      if (((i)localObject).isAdded())
      {
        if ((localObject instanceof i))
        {
          ((i)localObject).refresh();
          return;
        }
        ((i)localObject).show();
        return;
      }
      localat.a(2131559687, (Fragment)localObject, i.class.getSimpleName() + this.e).b();
      return;
    }
    this.b.setVisibility(8);
    this.c.setVisibility(0);
  }
  
  public void a(View paramView)
  {
    this.a = ((Button)paramView.findViewById(2131559686));
    this.c = ((RelativeLayout)paramView.findViewById(2131559684));
    this.b = ((FrameLayout)paramView.findViewById(2131559687));
    this.a.setOnClickListener(new gp(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
    {
      this.d = com.android.dazhihui.d.r.a(getArguments().getString("nexturl"), null)[1];
      this.e = getArguments().getString("ShowName");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903244, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onResume()
  {
    a();
    super.onResume();
  }
  
  public void show()
  {
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */