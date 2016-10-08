package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class bf
  extends FrameLayout
{
  public bf(Context paramContext)
  {
    super(paramContext);
  }
  
  static ViewGroup a(View paramView)
  {
    bf localbf = new bf(paramView.getContext());
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null) {
      localbf.setLayoutParams(localLayoutParams);
    }
    paramView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localbf.addView(paramView);
    return localbf;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */