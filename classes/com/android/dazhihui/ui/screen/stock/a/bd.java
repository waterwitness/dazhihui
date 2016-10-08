package com.android.dazhihui.ui.screen.stock.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class bd
  extends l
  implements View.OnClickListener
{
  private l a;
  private l b;
  private l c;
  private View d;
  private ViewGroup e;
  
  public bd()
  {
    this.k = 9;
  }
  
  public void a(l paraml1, l paraml2)
  {
    if ((paraml1 == null) || (paraml2 == null)) {}
    do
    {
      do
      {
        return;
        paraml1 = this.c;
      } while (this.c == paraml2);
      this.c = paraml2;
      if (this.c == this.b)
      {
        ((y)this.b).c(true);
        ((bb)this.a).c(false);
        localat = getChildFragmentManager().a().a(2130968606, 2130968607);
        if (paraml1 != null)
        {
          paraml1.beforeHidden();
          localat.b(paraml1);
        }
        if (!paraml2.isAdded()) {
          localat.a(2131559839, paraml2);
        }
        for (;;)
        {
          localat.b();
          return;
          localat.c(paraml2);
          paraml2.show();
        }
      }
    } while (this.c != this.a);
    ((y)this.b).c(false);
    ((bb)this.a).c(true);
    at localat = getChildFragmentManager().a().a(2130968608, 2130968609);
    if (paraml1 != null)
    {
      paraml1.beforeHidden();
      localat.b(paraml1);
    }
    if (!paraml2.isAdded()) {
      localat.a(2131559839, paraml2);
    }
    for (;;)
    {
      localat.b();
      return;
      localat.c(paraml2);
      paraml2.show();
    }
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (this.c != null) {
      this.c.beforeHidden();
    }
  }
  
  public void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if ((this.c != null) && (paramy != null) && (getActivity() != null))
    {
      this.c.changeLookFace(paramy);
      switch (be.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.d != null)
        {
          this.d.setBackgroundColor(getActivity().getResources().getColor(2131493540));
          paramy = (TextView)this.d.findViewById(2131559842);
          if (paramy != null) {
            paramy.setTextColor(getActivity().getResources().getColor(2131493563));
          }
        }
      } while (this.e == null);
      this.e.setBackgroundColor(getResources().getColor(2131493551));
      return;
      if (this.d != null)
      {
        this.d.setBackgroundColor(getActivity().getResources().getColor(2131493603));
        paramy = (TextView)this.d.findViewById(2131559842);
        if (paramy != null) {
          paramy.setTextColor(getActivity().getResources().getColor(2131493626));
        }
      }
    } while (this.e == null);
    this.e.setBackgroundColor(getResources().getColor(2131493614));
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559846: 
      a(this.b, this.a);
      return;
    case 2131559840: 
      if (this.c == this.b)
      {
        a(this.b, this.a);
        return;
      }
      a(this.a, this.b);
      return;
    }
    a(this.a, this.b);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d = paramLayoutInflater.cloneInContext(getActivity()).inflate(2130903278, paramViewGroup, false);
    if (this.a == null)
    {
      this.a = new bb();
      this.a.b(true);
      this.a.f(this.M);
      ((bb)this.a).a(this);
    }
    if (this.b == null)
    {
      this.b = new y();
      this.b.b(true);
      this.b.f(this.M);
      ((y)this.b).a(this);
    }
    a(this.a, this.b);
    changeLookFace(this.mLookFace);
    return this.d;
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.c != null) {
      this.c.refresh();
    }
  }
  
  public void show()
  {
    super.show();
    if (this.c != null) {
      this.c.show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */