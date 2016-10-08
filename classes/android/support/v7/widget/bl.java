package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.g;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class bl
  extends a
{
  final RecyclerView b;
  final a c = new bm(this);
  
  public bl(RecyclerView paramRecyclerView)
  {
    this.b = paramRecyclerView;
  }
  
  private boolean c()
  {
    return this.b.p();
  }
  
  public void a(View paramView, g paramg)
  {
    super.a(paramView, paramg);
    paramg.b(RecyclerView.class.getName());
    if ((!c()) && (this.b.getLayoutManager() != null)) {
      this.b.getLayoutManager().a(paramg);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    if ((!c()) && (this.b.getLayoutManager() != null)) {
      return this.b.getLayoutManager().a(paramInt, paramBundle);
    }
    return false;
  }
  
  a b()
  {
    return this.c;
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!c()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.getLayoutManager() != null) {
        paramView.getLayoutManager().a(paramAccessibilityEvent);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */