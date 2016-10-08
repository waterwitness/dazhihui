package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;

public class TableView
  extends LinearLayout
{
  private InnerScrollView a;
  private TableHeaderView b;
  private TableContentView c;
  private String[] d;
  private String[][] e;
  private int[] f;
  private int g;
  private int h;
  
  public TableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a()
  {
    if (this.g == 0) {
      this.g = (g.a().m() / 4 - this.h);
    }
    int i;
    int j;
    if ((this.d != null) && (this.d.length > 0))
    {
      this.f = new int[this.d.length];
      i = 0;
      while (i < this.d.length)
      {
        j = Math.max(a.b(this.d[i], this.b.getTextSize()) + this.h, this.g);
        this.f[i] = j;
        i += 1;
      }
    }
    if ((this.e != null) && (this.e.length > 0) && (this.f != null) && (this.f.length > 0))
    {
      i = 0;
      while (i < this.e.length)
      {
        j = 0;
        while (j < this.e[i].length - 1)
        {
          int k = a.b(this.e[i][j], this.c.getTextSize());
          int m = this.h;
          this.f[j] = Math.max(k + m, this.f[j]);
          j += 1;
        }
        i += 1;
      }
    }
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(2130903067, this);
    this.a = ((InnerScrollView)findViewById(2131558647));
    this.b = ((TableHeaderView)findViewById(2131558646));
    this.c = ((TableContentView)findViewById(2131558648));
    this.h = getResources().getDimensionPixelOffset(2131230829);
  }
  
  public void setData(String[][] paramArrayOfString)
  {
    this.e = paramArrayOfString;
    a();
    this.b.setWidths(this.f);
    this.c.setData(paramArrayOfString);
    this.c.setWidths(this.f);
  }
  
  public void setHeaders(String[] paramArrayOfString)
  {
    this.d = paramArrayOfString;
    a();
    this.b.setHeaders(this.d);
    this.b.setWidths(this.f);
  }
  
  public void setParentScrollView(ScrollView paramScrollView)
  {
    this.a.setParentScrollView(paramScrollView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\TableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */