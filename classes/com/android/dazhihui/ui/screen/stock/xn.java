package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.b.c;
import java.io.File;
import java.util.Date;

class xn
  implements View.OnClickListener
{
  xn(ZoomImageScreen paramZoomImageScreen) {}
  
  public void onClick(View paramView)
  {
    try
    {
      if (ZoomImageScreen.a(this.a) != null)
      {
        Object localObject = c.a(this.a, "saveImage");
        paramView = new File((File)localObject, new Date().getTime() + ".jpg");
        this.a.showShortToast("图片已保存至" + ((File)localObject).getAbsolutePath() + "文件夹");
        new xo(this, paramView).start();
        localObject = new ContentValues();
        ((ContentValues)localObject).put("datetaken", new Date().toString());
        ((ContentValues)localObject).put("mime_type", "image/jpg");
        ((ContentValues)localObject).put("_data", paramView.getAbsolutePath());
        this.a.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, (ContentValues)localObject);
        this.a.a.dismiss();
      }
      return;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */