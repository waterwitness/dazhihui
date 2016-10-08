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

public class SettingCci
  extends BaseActivity
  implements View.OnClickListener, SeekBar.OnSeekBarChangeListener
{
  d a = null;
  int[] b = null;
  private View c;
  private View d;
  private View e;
  private SeekBar f;
  private EditText g;
  
  private void a()
  {
    this.a = d.a();
    if (this.a == null) {}
    do
    {
      return;
      this.b = this.a.s();
    } while ((this.b == null) || (this.b.length != 1));
    this.g.setText("" + this.b[0]);
    this.f.setProgress(this.b[0] - 2);
  }
  
  private void b()
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    this.a.t();
    a();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (e.a[paramy.ordinal()])
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
    setContentView(2130903419);
    this.c = findViewById(2131558585);
    this.d = findViewById(2131558586);
    this.e = findViewById(2131560401);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f = ((SeekBar)findViewById(2131560404));
    this.g = ((EditText)findViewById(2131560402));
    this.g.addTextChangedListener(new f(this, this.g, 2, 100, 1));
    this.f.setOnSeekBarChangeListener(this);
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
    }
    this.b[0] = (paramInt + 2);
    this.g.setText(paramInt + 2 + "");
    this.g.setSelection(this.g.getText().length());
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    this.a.f(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\SettingCci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */