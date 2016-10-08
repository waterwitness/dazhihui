package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

class ak
  implements f
{
  ak(RecyclerView paramRecyclerView) {}
  
  public int a()
  {
    return this.a.getChildCount();
  }
  
  public int a(View paramView)
  {
    return this.a.indexOfChild(paramView);
  }
  
  public void a(int paramInt)
  {
    View localView = this.a.getChildAt(paramInt);
    if (localView != null) {
      RecyclerView.b(this.a, localView);
    }
    this.a.removeViewAt(paramInt);
  }
  
  public void a(View paramView, int paramInt)
  {
    this.a.addView(paramView, paramInt);
    RecyclerView.a(this.a, paramView);
  }
  
  public void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    bk localbk = RecyclerView.b(paramView);
    if (localbk != null)
    {
      if ((!localbk.isTmpDetached()) && (!localbk.shouldIgnore())) {
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + localbk);
      }
      localbk.clearTmpDetachFlag();
    }
    RecyclerView.a(this.a, paramView, paramInt, paramLayoutParams);
  }
  
  public bk b(View paramView)
  {
    return RecyclerView.b(paramView);
  }
  
  public View b(int paramInt)
  {
    return this.a.getChildAt(paramInt);
  }
  
  public void b()
  {
    int j = a();
    int i = 0;
    while (i < j)
    {
      RecyclerView.b(this.a, b(i));
      i += 1;
    }
    this.a.removeAllViews();
  }
  
  public void c(int paramInt)
  {
    Object localObject = b(paramInt);
    if (localObject != null)
    {
      localObject = RecyclerView.b((View)localObject);
      if (localObject != null)
      {
        if ((((bk)localObject).isTmpDetached()) && (!((bk)localObject).shouldIgnore())) {
          throw new IllegalArgumentException("called detach on an already detached child " + localObject);
        }
        ((bk)localObject).addFlags(256);
      }
    }
    RecyclerView.a(this.a, paramInt);
  }
  
  public void c(View paramView)
  {
    paramView = RecyclerView.b(paramView);
    if (paramView != null) {
      bk.access$1600(paramView);
    }
  }
  
  public void d(View paramView)
  {
    paramView = RecyclerView.b(paramView);
    if (paramView != null) {
      bk.access$1700(paramView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */