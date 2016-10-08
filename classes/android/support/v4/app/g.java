package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

class g
  extends SharedElementCallback
{
  private f a;
  
  public g(f paramf)
  {
    this.a = paramf;
  }
  
  public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.a.a(paramView, paramMatrix, paramRectF);
  }
  
  public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    return this.a.a(paramContext, paramParcelable);
  }
  
  public void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
    this.a.a(paramList, paramMap);
  }
  
  public void onRejectSharedElements(List<View> paramList)
  {
    this.a.a(paramList);
  }
  
  public void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    this.a.b(paramList, paramList1, paramList2);
  }
  
  public void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    this.a.a(paramList, paramList1, paramList2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */