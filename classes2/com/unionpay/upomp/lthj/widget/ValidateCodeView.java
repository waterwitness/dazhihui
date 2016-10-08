package com.unionpay.upomp.lthj.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.f.a.a.bp;
import com.f.a.a.ch;
import com.f.a.a.dl;
import com.f.a.a.ec;
import com.f.a.a.el;
import com.f.a.a.es;
import com.f.a.a.u;
import com.f.a.a.v;
import com.f.a.a.z;
import com.unionpay.upomp.lthj.plugin.ui.UIResponseListener;

public class ValidateCodeView
  extends RelativeLayout
  implements View.OnClickListener, UIResponseListener
{
  private Context a;
  private AttributeSet b;
  private ImageView c;
  private ProgressBar d;
  private EditText e;
  private Button f;
  private Handler g = new dl(this);
  
  public ValidateCodeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    this.b = paramAttributeSet;
    e();
  }
  
  private void e()
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)LayoutInflater.from(this.a).inflate(bp.M(), this);
    this.c = ((ImageView)localRelativeLayout.findViewById(bp.dd()));
    this.c.setOnClickListener(this);
    this.d = ((ProgressBar)localRelativeLayout.findViewById(bp.de()));
    this.f = ((Button)localRelativeLayout.findViewById(bp.ar()));
    this.f.setVisibility(8);
    this.f.setOnClickListener(this);
    this.e = ((EditText)localRelativeLayout.findViewById(bp.dc()));
    if (this.b == null) {}
  }
  
  public ImageView a()
  {
    return this.c;
  }
  
  public ProgressBar b()
  {
    return this.d;
  }
  
  public EditText c()
  {
    return this.e;
  }
  
  public String d()
  {
    return this.e.getText().toString();
  }
  
  public void errorCallBack(String paramString)
  {
    ec.a(this.a, paramString);
    this.c.setVisibility(8);
    this.d.setVisibility(8);
    this.f.setVisibility(0);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.c) {
      ec.a(this);
    }
    while (paramView != this.f) {
      return;
    }
    this.f.setVisibility(8);
    ec.a(this);
  }
  
  public void responseCallBack(es parames)
  {
    if ((parames == null) || (parames.s() == null)) {
      return;
    }
    int i = parames.j();
    int j = Integer.parseInt(parames.s());
    switch (i)
    {
    default: 
      return;
    }
    parames = (el)parames;
    z.a("VALIDATECODEVIEW", j + " img");
    if (j == 0)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      i = u.a().M.indexOf("/", 7);
      localStringBuffer.append(u.a().M.subSequence(0, i + 1));
      localStringBuffer.append(parames.b());
      localStringBuffer.append("?sessionId=");
      localStringBuffer.append(v.a);
      new ch(this, localStringBuffer.toString()).start();
      return;
    }
    ec.a(this.a, parames.t(), j);
    this.c.setVisibility(0);
    this.c.setBackgroundColor(-1);
    this.c.setImageBitmap(null);
    this.d.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\widget\ValidateCodeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */