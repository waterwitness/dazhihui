package com.android.dazhihui.ui.widget.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class t
  extends AsyncTask<Context, Void, Bitmap>
{
  t(String paramString, boolean paramBoolean, WeakReference paramWeakReference) {}
  
  protected Bitmap a(Context... paramVarArgs)
  {
    paramVarArgs = r.a(paramVarArgs[0], this.a, this.b);
    if (paramVarArgs != null) {
      return BitmapFactory.decodeByteArray(paramVarArgs, 0, paramVarArgs.length);
    }
    return null;
  }
  
  protected void a(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (this.c.get() != null)) {
      ((ImageView)this.c.get()).setImageBitmap(paramBitmap);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */