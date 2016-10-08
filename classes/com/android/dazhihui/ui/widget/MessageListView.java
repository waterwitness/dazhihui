package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

public class MessageListView
  extends ListView
  implements AbsListView.OnScrollListener, ks
{
  private int a;
  private int b;
  private int c;
  
  public MessageListView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public MessageListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public MessageListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    setOnScrollListener(this);
  }
  
  public boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.a > 0)
    {
      bool1 = bool2;
      if (this.b + this.c == this.a)
      {
        bool1 = bool2;
        if (getChildAt(this.c - 1).getBottom() == getMeasuredHeight()) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public boolean d()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.a > 0)
    {
      bool1 = bool2;
      if (this.b == 0)
      {
        bool1 = bool2;
        if (getChildAt(0).getTop() == 0) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.a = paramInt3;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MessageListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */