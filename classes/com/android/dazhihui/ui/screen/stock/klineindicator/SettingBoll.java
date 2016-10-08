package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;

public class SettingBoll
  extends BaseActivity
  implements View.OnClickListener, SeekBar.OnSeekBarChangeListener
{
  com.android.dazhihui.d a = null;
  int[] b = null;
  private View c;
  private View d;
  private View e;
  private SeekBar f;
  private SeekBar g;
  private EditText h;
  private EditText i;
  
  private void a()
  {
    this.a = com.android.dazhihui.d.a();
    if (this.a == null) {}
    do
    {
      return;
      this.b = this.a.w();
    } while ((this.b == null) || (this.b.length != 2));
    this.h.setText("" + this.b[0]);
    this.i.setText("" + this.b[1]);
    this.f.setProgress(this.b[0] - 5);
    this.g.setProgress(this.b[1] - 1);
  }
  
  private void b()
  {
    this.a = com.android.dazhihui.d.a();
    if (this.a == null) {
      return;
    }
    this.a.x();
    a();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (c.a[paramy.ordinal()])
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
    setContentView(2130903418);
    this.c = findViewById(2131558585);
    this.d = findViewById(2131558586);
    this.e = findViewById(2131560401);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f = ((SeekBar)findViewById(2131560404));
    this.g = ((SeekBar)findViewById(2131560407));
    this.h = ((EditText)findViewById(2131560402));
    this.i = ((EditText)findViewById(2131560405));
    this.h.addTextChangedListener(new d(this, this.h, 5, 300, 1));
    this.i.addTextChangedListener(new d(this, this.i, 1, 10, 2));
    this.f.setOnSeekBarChangeListener(this);
    this.g.setOnSeekBarChangeListener(this);
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
    case 2131560405: 
    case 2131560406: 
    default: 
      return;
    case 2131560404: 
      this.b[0] = (paramInt + 5);
      this.h.setText(paramInt + 5 + "");
      this.h.setSelection(this.h.getText().length());
      return;
    }
    this.b[1] = (paramInt + 1);
    this.i.setText(paramInt + 1 + "");
    this.i.setSelection(this.i.getText().length());
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.a = com.android.dazhihui.d.a();
    if (this.a == null) {
      return;
    }
    this.a.h(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\SettingBoll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */