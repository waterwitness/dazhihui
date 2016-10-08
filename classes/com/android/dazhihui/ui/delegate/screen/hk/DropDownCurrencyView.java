package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DropDownCurrencyView
  extends RelativeLayout
{
  private static final String[] g = { "账户总览", "港币账户", "美元账户", "人民币账户" };
  private static final int[] h = { -1, 2130837607, 2130837608, 2130837606 };
  f a;
  g b;
  private PopupWindow c = null;
  private ListView d;
  private d e;
  private Context f;
  private TextView i;
  private ImageView j;
  private ImageView k;
  private View l;
  private int m = -1;
  private String[] n = null;
  
  public DropDownCurrencyView(Context paramContext)
  {
    super(paramContext);
    this.f = paramContext;
    b();
  }
  
  public DropDownCurrencyView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = paramContext;
    b();
  }
  
  public DropDownCurrencyView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.f = paramContext;
    b();
  }
  
  private void b()
  {
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903472, this);
    this.i = ((TextView)findViewById(2131560661));
    this.j = ((ImageView)findViewById(2131560662));
    this.j.setImageResource(2130838894);
    this.k = ((ImageView)findViewById(2131560659));
    this.k.setVisibility(8);
    localView.setOnClickListener(new b(this));
    this.e = new d(this);
    this.l = LayoutInflater.from(getContext()).inflate(2130903098, null);
    this.d = ((ListView)this.l.findViewById(2131558827));
    a(g, 0);
    this.d.setAdapter(this.e);
    this.d.setOnItemClickListener(new c(this));
  }
  
  private void c()
  {
    if (this.c == null)
    {
      this.c = new PopupWindow(this.l, getWidth(), -2, true);
      this.c.setTouchable(true);
      this.c.setOutsideTouchable(true);
      this.c.setBackgroundDrawable(new ColorDrawable(0));
    }
    if (this.e.getCount() != 0) {
      this.c.showAsDropDown(this);
    }
  }
  
  public void a(String[] paramArrayOfString, int paramInt)
  {
    this.n = paramArrayOfString;
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 0))
    {
      this.m = paramInt;
      setText(paramArrayOfString[paramInt]);
      if (this.a != null) {
        this.a.a(paramArrayOfString[paramInt], paramInt);
      }
    }
    for (;;)
    {
      if ((this.c != null) && (this.c.isShowing())) {
        this.c.dismiss();
      }
      return;
      setText("");
      this.m = -1;
    }
  }
  
  public String getCurrentItem()
  {
    return this.i.getText().toString();
  }
  
  public int getSelectedItemPosition()
  {
    return this.m;
  }
  
  public void setOnItemChangeListener(f paramf)
  {
    this.a = paramf;
  }
  
  public void setOnListItemImageClickListener(g paramg)
  {
    this.b = paramg;
  }
  
  public void setText(String paramString)
  {
    this.i.setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\DropDownCurrencyView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */