package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.android.dazhihui.d;
import com.android.dazhihui.ui.screen.BaseActivity;

public class SettingVol
  extends BaseActivity
  implements View.OnClickListener, SeekBar.OnSeekBarChangeListener
{
  private boolean A = false;
  d a = null;
  int[] b = null;
  private View c;
  private View d;
  private View e;
  private SeekBar f;
  private SeekBar g;
  private SeekBar h;
  private SeekBar i;
  private SeekBar j;
  private SeekBar k;
  private EditText l;
  private EditText m;
  private EditText n;
  private EditText o;
  private EditText p;
  private EditText q;
  private View r;
  private View s;
  private View t;
  private View u;
  private View v;
  private View w;
  private View x;
  private View y;
  private View z;
  
  private void a()
  {
    this.a = d.a();
    if (this.a == null) {}
    do
    {
      return;
      this.b = this.a.i();
      if ((this.b != null) && (this.b.length >= 2))
      {
        this.l.setText("" + this.b[0]);
        this.m.setText("" + this.b[1]);
        this.f.setProgress(this.b[0] - 1);
        this.g.setProgress(this.b[1] - 1);
        this.z.setVisibility(0);
        this.v.setVisibility(8);
        this.w.setVisibility(8);
        this.x.setVisibility(8);
        this.y.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.u.setVisibility(8);
      }
      if ((this.b != null) && (this.b.length == 6))
      {
        this.z.setVisibility(8);
        this.v.setVisibility(0);
        this.w.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setVisibility(0);
        this.r.setVisibility(0);
        this.s.setVisibility(0);
        this.t.setVisibility(0);
        this.u.setVisibility(0);
        this.n.setText("" + this.b[2]);
        this.o.setText("" + this.b[3]);
        this.p.setText("" + this.b[4]);
        this.h.setProgress(this.b[2] - 1);
        this.i.setProgress(this.b[3] - 1);
        this.j.setProgress(this.b[4] - 1);
        this.k.setProgress(this.b[5] - 1);
        if (this.A == true)
        {
          this.A = false;
          this.q.setText("");
        }
        for (;;)
        {
          this.q.requestFocus();
          return;
          this.q.setText("" + this.b[5]);
        }
      }
      if ((this.b != null) && (this.b.length == 5))
      {
        this.z.setVisibility(0);
        this.v.setVisibility(0);
        this.w.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setVisibility(8);
        this.r.setVisibility(0);
        this.s.setVisibility(0);
        this.t.setVisibility(0);
        this.u.setVisibility(8);
        this.n.setText("" + this.b[2]);
        this.o.setText("" + this.b[3]);
        this.h.setProgress(this.b[2] - 1);
        this.i.setProgress(this.b[3] - 1);
        this.j.setProgress(this.b[4] - 1);
        if (this.A == true)
        {
          this.A = false;
          this.p.setText("");
        }
        for (;;)
        {
          this.p.requestFocus();
          return;
          this.p.setText("" + this.b[4]);
        }
      }
      if ((this.b != null) && (this.b.length == 4))
      {
        this.z.setVisibility(0);
        this.v.setVisibility(0);
        this.w.setVisibility(0);
        this.x.setVisibility(8);
        this.y.setVisibility(8);
        this.r.setVisibility(0);
        this.s.setVisibility(0);
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        this.n.setText("" + this.b[2]);
        this.h.setProgress(this.b[2] - 1);
        this.i.setProgress(this.b[3] - 1);
        if (this.A == true)
        {
          this.A = false;
          this.o.setText("");
        }
        for (;;)
        {
          this.o.requestFocus();
          return;
          this.o.setText("" + this.b[3]);
        }
      }
    } while ((this.b == null) || (this.b.length != 3));
    this.z.setVisibility(0);
    this.v.setVisibility(0);
    this.w.setVisibility(8);
    this.x.setVisibility(8);
    this.y.setVisibility(8);
    this.r.setVisibility(0);
    this.s.setVisibility(8);
    this.t.setVisibility(8);
    this.u.setVisibility(8);
    this.h.setProgress(this.b[2] - 1);
    if (this.A == true)
    {
      this.A = false;
      this.n.setText("");
    }
    for (;;)
    {
      this.n.requestFocus();
      return;
      this.n.setText("" + this.b[2]);
    }
  }
  
  private void b()
  {
    this.A = true;
    if ((this.b == null) || (this.b.length == 6)) {}
    do
    {
      return;
      int[] arrayOfInt = new int[this.b.length + 1];
      int i1 = 0;
      while (i1 < this.b.length)
      {
        arrayOfInt[i1] = this.b[i1];
        i1 += 1;
      }
      arrayOfInt[i1] = 1;
      this.b = arrayOfInt;
      this.a = d.a();
    } while (this.a == null);
    this.a.a(this.b);
    a();
  }
  
  private void c()
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    this.a.j();
    a();
  }
  
  protected void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (x.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.c == null);
      this.c.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.c == null);
    this.c.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903430);
    this.c = findViewById(2131558585);
    this.d = findViewById(2131558586);
    this.e = findViewById(2131560401);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f = ((SeekBar)findViewById(2131560404));
    this.g = ((SeekBar)findViewById(2131560407));
    this.h = ((SeekBar)findViewById(2131560410));
    this.i = ((SeekBar)findViewById(2131560434));
    this.j = ((SeekBar)findViewById(2131560439));
    this.k = ((SeekBar)findViewById(2131560444));
    this.l = ((EditText)findViewById(2131560402));
    this.m = ((EditText)findViewById(2131560405));
    this.n = ((EditText)findViewById(2131560408));
    this.o = ((EditText)findViewById(2131560432));
    this.p = ((EditText)findViewById(2131560437));
    this.q = ((EditText)findViewById(2131560442));
    this.z = findViewById(2131560472);
    this.v = findViewById(2131560465);
    this.w = findViewById(2131560467);
    this.x = findViewById(2131560469);
    this.y = findViewById(2131560471);
    this.r = findViewById(2131560464);
    this.s = findViewById(2131560466);
    this.t = findViewById(2131560468);
    this.u = findViewById(2131560470);
    this.l.addTextChangedListener(new y(this, this.l, 1, 250, 1));
    this.m.addTextChangedListener(new y(this, this.m, 1, 250, 2));
    this.n.addTextChangedListener(new y(this, this.n, 1, 250, 3));
    this.o.addTextChangedListener(new y(this, this.o, 1, 250, 4));
    this.p.addTextChangedListener(new y(this, this.p, 1, 250, 5));
    this.q.addTextChangedListener(new y(this, this.q, 1, 250, 6));
    this.f.setOnSeekBarChangeListener(this);
    this.g.setOnSeekBarChangeListener(this);
    this.h.setOnSeekBarChangeListener(this);
    this.i.setOnSeekBarChangeListener(this);
    this.j.setOnSeekBarChangeListener(this);
    this.k.setOnSeekBarChangeListener(this);
    this.z.setOnClickListener(this);
    a();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558586: 
      finish();
      return;
    case 2131560401: 
      c();
      return;
    }
    b();
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    switch (paramSeekBar.getId())
    {
    default: 
      return;
    case 2131560404: 
      this.b[0] = (paramInt + 1);
      this.l.setText(paramInt + 1 + "");
      this.l.setSelection(this.l.getText().length());
      return;
    case 2131560407: 
      this.b[1] = (paramInt + 1);
      this.m.setText(paramInt + 1 + "");
      this.m.setSelection(this.m.getText().length());
      return;
    case 2131560410: 
      this.b[2] = (paramInt + 1);
      this.n.setText(paramInt + 1 + "");
      this.n.setSelection(this.n.getText().length());
      return;
    case 2131560434: 
      this.b[3] = (paramInt + 1);
      this.o.setText(paramInt + 1 + "");
      this.o.setSelection(this.o.getText().length());
      return;
    case 2131560439: 
      this.b[4] = (paramInt + 1);
      this.p.setText(paramInt + 1 + "");
      this.p.setSelection(this.p.getText().length());
      return;
    }
    this.b[5] = (paramInt + 1);
    this.q.setText(paramInt + 1 + "");
    this.q.setSelection(this.q.getText().length());
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    this.a.a(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\SettingVol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */