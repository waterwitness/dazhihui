package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dazhihui.c.a.d;

class ir
  implements View.OnClickListener
{
  ir(MaxNineScreen paramMaxNineScreen, EditText paramEditText) {}
  
  public void onClick(View paramView)
  {
    paramView = this.a.getText().toString().trim();
    Object localObject = d.a();
    ((d)localObject).a("dispatch_address", paramView);
    ((d)localObject).g();
    localObject = this.b.getResources().getString(2131166244);
    com.android.dazhihui.g.a().a(paramView);
    com.android.dazhihui.g.a().e(null);
    com.android.dazhihui.g.a().g(-1);
    com.android.dazhihui.a.g.a().x();
    Toast.makeText(this.b, (CharSequence)localObject, 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */