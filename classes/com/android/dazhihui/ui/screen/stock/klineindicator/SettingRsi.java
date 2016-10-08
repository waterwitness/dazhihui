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
import com.android.dazhihui.ui.screen.y;

public class SettingRsi
  extends BaseActivity
  implements View.OnClickListener, SeekBar.OnSeekBarChangeListener
{
  d a = null;
  int[] b = null;
  private View c;
  private View d;
  private View e;
  private SeekBar f;
  private SeekBar g;
  private SeekBar h;
  private EditText i;
  private EditText j;
  private EditText k;
  
  private void a()
  {
    this.a = d.a();
    if (this.a == null) {}
    do
    {
      return;
      this.b = this.a.o();
    } while ((this.b == null) || (this.b.length != 3));
    this.i.setText("" + this.b[0]);
    this.j.setText("" + this.b[1]);
    this.k.setText("" + this.b[2]);
    this.f.setProgress(this.b[0] - 2);
    this.g.setProgress(this.b[1] - 2);
    this.h.setProgress(this.b[2] - 2);
  }
  
  private void b()
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    this.a.p();
    a();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (v.a[paramy.ordinal()])
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
    setContentView(2130903428);
    this.c = findViewById(2131558585);
    this.d = findViewById(2131558586);
    this.e = findViewById(2131560401);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f = ((SeekBar)findViewById(2131560404));
    this.g = ((SeekBar)findViewById(2131560407));
    this.h = ((SeekBar)findViewById(2131560410));
    this.i = ((EditText)findViewById(2131560402));
    this.j = ((EditText)findViewById(2131560405));
    this.k = ((EditText)findViewById(2131560408));
    this.i.addTextChangedListener(new w(this, this.i, 2, 100, 1));
    this.j.addTextChangedListener(new w(this, this.j, 2, 100, 2));
    this.k.addTextChangedListener(new w(this, this.k, 2, 100, 3));
    this.f.setOnSeekBarChangeListener(this);
    this.g.setOnSeekBarChangeListener(this);
    this.h.setOnSeekBarChangeListener(this);
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
      this.b[0] = (paramInt + 2);
      this.i.setText(paramInt + 2 + "");
      this.i.setSelection(this.i.getText().length());
      return;
    case 2131560407: 
      this.b[1] = (paramInt + 2);
      this.j.setText(paramInt + 2 + "");
      this.j.setSelection(this.j.getText().length());
      return;
    }
    this.b[2] = (paramInt + 2);
    this.k.setText(paramInt + 2 + "");
    this.k.setSelection(this.k.getText().length());
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    this.a.d(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\SettingRsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */