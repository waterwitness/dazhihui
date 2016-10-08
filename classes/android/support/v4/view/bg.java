package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class bg
  extends SingleLineTransformationMethod
{
  private Locale a;
  
  public bg(Context paramContext)
  {
    this.a = paramContext.getResources().getConfiguration().locale;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    paramCharSequence = super.getTransformation(paramCharSequence, paramView);
    if (paramCharSequence != null) {
      return paramCharSequence.toString().toUpperCase(this.a);
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */