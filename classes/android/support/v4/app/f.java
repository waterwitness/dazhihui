package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public abstract class f
{
  public abstract Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF);
  
  public abstract View a(Context paramContext, Parcelable paramParcelable);
  
  public abstract void a(List<View> paramList);
  
  public abstract void a(List<String> paramList, List<View> paramList1, List<View> paramList2);
  
  public abstract void a(List<String> paramList, Map<String, View> paramMap);
  
  public abstract void b(List<String> paramList, List<View> paramList1, List<View> paramList2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */