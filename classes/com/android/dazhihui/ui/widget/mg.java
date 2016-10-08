package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.view.ViewGroup;

class mg
  extends ViewGroup
{
  public mg(TableLayoutGroup paramTableLayoutGroup, Context paramContext)
  {
    super(paramContext);
    addView(TableLayoutGroup.b(paramTableLayoutGroup));
  }
  
  public void a()
  {
    int i;
    if (TableLayoutGroup.P(this.a) != null)
    {
      i = TableLayoutGroup.P(this.a).b();
      TableLayoutGroup.P(this.a).layout(0, 0, getWidth(), i);
    }
    for (;;)
    {
      TableLayoutGroup.b(this.a).layout(0, i, getWidth(), getHeight());
      return;
      i = 0;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */