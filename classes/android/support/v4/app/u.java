package android.support.v4.app;

import android.view.View;

class u
  extends aa
{
  u(Fragment paramFragment) {}
  
  public View a(int paramInt)
  {
    if (this.a.mView == null) {
      throw new IllegalStateException("Fragment does not have a view");
    }
    return this.a.mView.findViewById(paramInt);
  }
  
  public boolean a()
  {
    return this.a.mView != null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */