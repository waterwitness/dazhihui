package com.f.a.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;

public class dl
  extends Handler
{
  public dl(ValidateCodeView paramValidateCodeView) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (Bitmap)paramMessage.obj;
    if (paramMessage != null)
    {
      ValidateCodeView.b(this.a).setVisibility(0);
      ValidateCodeView.b(this.a).setImageBitmap(paramMessage);
      ValidateCodeView.c(this.a).setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */