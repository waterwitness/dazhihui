package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class ProtectorForm
  extends DelegateBaseActivity
  implements cp, cs
{
  String[] a = null;
  int b = 0;
  private int c;
  private Spinner d;
  private Button e;
  private a f;
  private DzhHeader g;
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 16424;
    paramct.d = "超时保护";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    this.f = new a(this);
    this.f.close();
    setContentView(2130903379);
    this.g = ((DzhHeader)findViewById(2131558643));
    this.g.a(this, this);
    this.d = ((Spinner)findViewById(2131560223));
    this.e = ((Button)findViewById(2131560224));
    this.a = new String[] { "不保护", "1 分钟", "2 分钟", "3 分钟", "4 分钟", "5 分钟", "6 分钟", "8 分钟", "10 分钟", "15 分钟", "20 分钟", "25 分钟", "30 分钟" };
    int i;
    if (a.l > 0)
    {
      paramBundle = String.valueOf(a.l) + " ";
      i = 0;
    }
    for (;;)
    {
      if (i < this.a.length)
      {
        if (this.a[i].indexOf(paramBundle) >= 0) {
          this.b = i;
        }
      }
      else
      {
        this.d.setPrompt("请选择超时保护时间");
        paramBundle = new ArrayAdapter(this, 17367048, this.a);
        paramBundle.setDropDownViewResource(17367049);
        this.d.setAdapter(paramBundle);
        this.d.setSelection(this.b);
        this.d.setVisibility(1);
        this.d.setOnItemSelectedListener(new db(this));
        this.e.setOnClickListener(new dc(this));
        return;
      }
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ProtectorForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */