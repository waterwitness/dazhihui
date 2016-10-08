package com.android.dazhihui.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.android.dazhihui.ui.widget.a.r;

class bc
  extends AsyncTask<String, Void, Bitmap>
{
  bc(bb parambb, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean) {}
  
  protected Bitmap a(String... paramVarArgs)
  {
    paramVarArgs = r.a(bb.a(), this.a, false);
    if (paramVarArgs != null) {
      return BitmapFactory.decodeByteArray(paramVarArgs, 0, paramVarArgs.length);
    }
    return null;
  }
  
  protected void a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    bb.a(bb.a()).a(this.b, paramBitmap, this.c, this.d, this.e);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */