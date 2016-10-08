package com.android.dazhihui.ui.widget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

@TargetApi(11)
public class k
  extends DialogFragment
{
  private String a;
  private String b;
  private String c;
  private String d;
  private TextView e;
  private TextView f;
  private Button g;
  private Button h;
  private View i;
  private m j;
  private m k;
  private m l;
  private boolean m;
  private boolean n;
  private boolean o;
  
  private void a()
  {
    this.e.setText(this.a);
    this.g.setText(this.c);
    this.h.setText(this.b);
    this.f.setText(this.d);
  }
  
  private void a(View paramView)
  {
    this.e = ((TextView)paramView.findViewById(2131558567));
    this.f = ((TextView)paramView.findViewById(2131558579));
    this.g = ((Button)paramView.findViewById(2131558583));
    this.h = ((Button)paramView.findViewById(2131558581));
    this.i = paramView.findViewById(2131558582);
    if (this.o) {
      this.e.setVisibility(0);
    }
    if ((this.m) && (this.n))
    {
      this.g.setVisibility(0);
      this.h.setVisibility(0);
      this.i.setVisibility(0);
    }
    do
    {
      return;
      if (this.m)
      {
        this.h.setVisibility(0);
        return;
      }
    } while (!this.n);
    this.g.setVisibility(0);
  }
  
  private void b()
  {
    this.g.setOnClickListener(new n(this, null));
    this.h.setOnClickListener(new n(this, null));
  }
  
  public void a(Activity paramActivity)
  {
    super.show(paramActivity.getFragmentManager(), "");
  }
  
  public void a(m paramm)
  {
    this.l = paramm;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
    this.o = true;
  }
  
  public void a(String paramString, m paramm)
  {
    this.b = paramString;
    this.m = true;
    this.j = paramm;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public void b(String paramString, m paramm)
  {
    this.c = paramString;
    this.n = true;
    this.k = paramm;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.l != null) {
      this.l.a();
    }
    super.onCancel(paramDialogInterface);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    getDialog().requestWindowFeature(1);
    paramLayoutInflater = paramLayoutInflater.inflate(2130903051, null);
    a(paramLayoutInflater);
    b();
    a();
    return paramLayoutInflater;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */