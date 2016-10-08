package com.unionpay.upomp.lthj.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.f.a.a.bp;
import com.f.a.a.z;

public class LineFrameView
  extends LinearLayout
{
  private static String a = "LineFrameView";
  private TextView b;
  private TextView c;
  private AttributeSet d;
  private ImageView e;
  private Context f;
  
  public LineFrameView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = paramContext;
    this.d = paramAttributeSet;
    b();
  }
  
  private void b()
  {
    Object localObject = (LinearLayout)LayoutInflater.from(this.f).inflate(bp.L(), this);
    this.c = ((TextView)((LinearLayout)localObject).findViewById(bp.aT()));
    this.b = ((TextView)((LinearLayout)localObject).findViewById(bp.aU()));
    this.e = ((ImageView)((LinearLayout)localObject).findViewById(bp.aN()));
    if (this.d == null) {
      return;
    }
    int i = this.d.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", 0);
    if (i == 0)
    {
      z.a(a, "src is null");
      label95:
      i = this.d.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "hint", 0);
      if (i != 0) {
        break label219;
      }
      z.a(a, "title-id is null");
      localObject = this.d.getAttributeValue("http://schemas.android.com/apk/res/android", "hint");
      if (localObject == null) {
        break label207;
      }
      this.b.setText((CharSequence)localObject);
    }
    for (;;)
    {
      i = this.d.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0);
      if (i != 0) {
        break label230;
      }
      z.a(a, "text-id is null");
      localObject = this.d.getAttributeValue("http://schemas.android.com/apk/res/android", "text");
      if (localObject == null) {
        break;
      }
      a((CharSequence)localObject);
      return;
      b(i);
      break label95;
      label207:
      this.b.setVisibility(8);
      continue;
      label219:
      this.b.setText(i);
    }
    label230:
    a(i);
  }
  
  public TextView a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c.setText(paramInt);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.c.setText(paramCharSequence);
  }
  
  public void b(int paramInt)
  {
    this.e.setImageResource(paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\widget\LineFrameView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */