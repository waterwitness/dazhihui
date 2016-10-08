package com.f.a.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;

public class ch
  extends Thread
{
  public String a;
  
  public ch(ValidateCodeView paramValidateCodeView, String paramString)
  {
    this.a = paramString;
  }
  
  public void run()
  {
    Bitmap localBitmap = ec.e(this.a);
    Message localMessage = Message.obtain();
    localMessage.obj = localBitmap;
    ValidateCodeView.a(this.b).sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */