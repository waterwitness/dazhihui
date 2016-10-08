package com.iflytek.cloud.ui;

import android.content.Context;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.resource.Resource;
import com.iflytek.thirdparty.ap;
import java.util.Locale;

public class RecognizerDialog
  extends ap
{
  public RecognizerDialog(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext);
    this.a = new a(paramContext, paramInitListener);
  }
  
  public void dismiss()
  {
    super.dismiss();
  }
  
  public void setListener(RecognizerDialogListener paramRecognizerDialogListener)
  {
    ((a)this.a).a(paramRecognizerDialogListener);
  }
  
  public void setParameter(String paramString1, String paramString2)
  {
    ((a)this.a).a(paramString1, paramString2);
  }
  
  public void setUILanguage(Locale paramLocale)
  {
    Resource.setUILanguage(paramLocale);
  }
  
  public void show()
  {
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\ui\RecognizerDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */