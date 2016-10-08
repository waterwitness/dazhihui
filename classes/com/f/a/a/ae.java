package com.f.a.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;
import com.unionpay.upomp.lthj.widget.CustomInputView;
import java.util.Random;

public class ae
  implements View.OnClickListener
{
  public ae(PayActivity paramPayActivity) {}
  
  public void onClick(View paramView)
  {
    int i = new Random().nextInt(cs.b.length);
    PayActivity.d(this.a).a(cs.b[i]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */