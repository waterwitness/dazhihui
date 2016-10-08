package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.g;
import android.view.View;

class bm
  extends a
{
  bm(bl parambl) {}
  
  public void a(View paramView, g paramg)
  {
    super.a(paramView, paramg);
    if ((!bl.a(this.b)) && (this.b.b.getLayoutManager() != null)) {
      this.b.b.getLayoutManager().a(paramView, paramg);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    if ((!bl.a(this.b)) && (this.b.b.getLayoutManager() != null)) {
      return this.b.b.getLayoutManager().a(paramView, paramInt, paramBundle);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */