package com.iflytek.cloud.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.iflytek.thirdparty.X;

public class a$a
  extends ClickableSpan
{
  private String b;
  
  public a$a(a parama, String paramString)
  {
    this.b = paramString;
  }
  
  public void onClick(View paramView)
  {
    try
    {
      paramView = paramView.getContext();
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(this.b));
      localIntent.addFlags(268435456);
      localIntent.putExtra("com.android.browser.application_id", paramView.getPackageName());
      paramView.startActivity(localIntent);
      return;
    }
    catch (Exception paramView)
    {
      paramView = paramView;
      X.a(paramView);
      return;
    }
    finally {}
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\ui\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */