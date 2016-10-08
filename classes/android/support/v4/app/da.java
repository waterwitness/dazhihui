package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

public abstract class da
{
  private static int b = 1048576;
  private Matrix a;
  
  private static Bitmap a(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if ((i <= 0) || (j <= 0)) {
      return null;
    }
    float f = Math.min(1.0F, b / (i * j));
    if (((paramDrawable instanceof BitmapDrawable)) && (f == 1.0F)) {
      return ((BitmapDrawable)paramDrawable).getBitmap();
    }
    i = (int)(i * f);
    j = (int)(j * f);
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Rect localRect = paramDrawable.getBounds();
    int k = localRect.left;
    int m = localRect.top;
    int n = localRect.right;
    int i1 = localRect.bottom;
    paramDrawable.setBounds(0, 0, i, j);
    paramDrawable.draw(localCanvas);
    paramDrawable.setBounds(k, m, n, i1);
    return localBitmap;
  }
  
  public Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    ImageView localImageView;
    Object localObject1;
    if ((paramView instanceof ImageView))
    {
      localImageView = (ImageView)paramView;
      localObject1 = localImageView.getDrawable();
      Object localObject2 = localImageView.getBackground();
      if ((localObject1 != null) && (localObject2 == null))
      {
        localObject2 = a((Drawable)localObject1);
        if (localObject2 != null)
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject2);
          ((Bundle)localObject1).putString("sharedElement:snapshot:imageScaleType", localImageView.getScaleType().toString());
          if (localImageView.getScaleType() == ImageView.ScaleType.MATRIX)
          {
            paramView = localImageView.getImageMatrix();
            paramMatrix = new float[9];
            paramView.getValues(paramMatrix);
            ((Bundle)localObject1).putFloatArray("sharedElement:snapshot:imageMatrix", paramMatrix);
          }
        }
      }
    }
    do
    {
      do
      {
        return (Parcelable)localObject1;
        j = Math.round(paramRectF.width());
        i = Math.round(paramRectF.height());
        localImageView = null;
        localObject1 = localImageView;
      } while (j <= 0);
      localObject1 = localImageView;
    } while (i <= 0);
    float f = Math.min(1.0F, b / (j * i));
    int j = (int)(j * f);
    int i = (int)(i * f);
    if (this.a == null) {
      this.a = new Matrix();
    }
    this.a.set(paramMatrix);
    this.a.postTranslate(-paramRectF.left, -paramRectF.top);
    this.a.postScale(f, f);
    paramMatrix = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
    paramRectF = new Canvas(paramMatrix);
    paramRectF.concat(this.a);
    paramView.draw(paramRectF);
    return paramMatrix;
  }
  
  public View a(Context paramContext, Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      Object localObject = (Bitmap)paramParcelable.getParcelable("sharedElement:snapshot:bitmap");
      if (localObject == null) {
        return null;
      }
      paramContext = new ImageView(paramContext);
      paramContext.setImageBitmap((Bitmap)localObject);
      paramContext.setScaleType(ImageView.ScaleType.valueOf(paramParcelable.getString("sharedElement:snapshot:imageScaleType")));
      if (paramContext.getScaleType() == ImageView.ScaleType.MATRIX)
      {
        paramParcelable = paramParcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
        localObject = new Matrix();
        ((Matrix)localObject).setValues(paramParcelable);
        paramContext.setImageMatrix((Matrix)localObject);
      }
    }
    for (;;)
    {
      return paramContext;
      if ((paramParcelable instanceof Bitmap))
      {
        paramParcelable = (Bitmap)paramParcelable;
        paramContext = new ImageView(paramContext);
        paramContext.setImageBitmap(paramParcelable);
      }
      else
      {
        paramContext = null;
      }
    }
  }
  
  public void a(List<View> paramList) {}
  
  public void a(List<String> paramList, List<View> paramList1, List<View> paramList2) {}
  
  public void a(List<String> paramList, Map<String, View> paramMap) {}
  
  public void b(List<String> paramList, List<View> paramList1, List<View> paramList2) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */