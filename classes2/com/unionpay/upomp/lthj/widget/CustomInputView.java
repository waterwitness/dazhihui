package com.unionpay.upomp.lthj.widget;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.f.a.a.bp;
import com.f.a.a.z;

public class CustomInputView
  extends LinearLayout
{
  private static String a = "CustomInputView";
  private TextView b;
  private EditText c;
  private AttributeSet d;
  private Context e;
  
  public CustomInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = paramContext;
    this.d = paramAttributeSet;
    c();
  }
  
  private void c()
  {
    Object localObject = (LinearLayout)LayoutInflater.from(this.e).inflate(bp.Q(), this);
    this.b = ((TextView)((LinearLayout)localObject).findViewById(bp.aV()));
    this.c = ((EditText)((LinearLayout)localObject).findViewById(bp.aW()));
    int i = this.d.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0);
    if (i == 0)
    {
      z.a(a, "text-id is null");
      localObject = this.d.getAttributeValue("http://schemas.android.com/apk/res/android", "text");
      if (localObject != null) {
        this.b.setText((CharSequence)localObject);
      }
      i = this.d.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "hint", 0);
      if (i != 0) {
        break label193;
      }
      z.a(a, "title-id is null");
      localObject = this.d.getAttributeValue("http://schemas.android.com/apk/res/android", "hint");
      if (localObject != null) {
        this.c.setHint((CharSequence)localObject);
      }
    }
    for (;;)
    {
      if ("phone".equals(this.d.getAttributeValue("http://schemas.android.com/apk/res/android", "inputType"))) {
        this.c.setInputType(3);
      }
      return;
      this.b.setText(i);
      break;
      label193:
      this.c.setHint(i);
    }
  }
  
  public Editable a()
  {
    return this.c.getText();
  }
  
  public void a(int paramInt)
  {
    this.c.setText(paramInt);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.c.setText(paramCharSequence);
  }
  
  public EditText b()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\widget\CustomInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */