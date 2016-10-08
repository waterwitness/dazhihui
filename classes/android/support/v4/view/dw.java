package android.support.v4.view;

import android.view.View;

class dw
  implements eg
{
  dr a;
  
  dw(dr paramdr)
  {
    this.a = paramdr;
  }
  
  public void a(View paramView)
  {
    if (dr.c(this.a) >= 0) {
      bn.a(paramView, 2, null);
    }
    if (dr.a(this.a) != null) {
      dr.a(this.a).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof eg)) {}
    for (localObject = (eg)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((eg)localObject).a(paramView);
      }
      return;
    }
  }
  
  public void b(View paramView)
  {
    if (dr.c(this.a) >= 0)
    {
      bn.a(paramView, dr.c(this.a), null);
      dr.a(this.a, -1);
    }
    if (dr.b(this.a) != null) {
      dr.b(this.a).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof eg)) {}
    for (localObject = (eg)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((eg)localObject).b(paramView);
      }
      return;
    }
  }
  
  public void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof eg)) {}
    for (localObject = (eg)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((eg)localObject).c(paramView);
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */