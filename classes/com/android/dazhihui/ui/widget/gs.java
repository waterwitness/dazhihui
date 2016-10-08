package com.android.dazhihui.ui.widget;

import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class gs
  implements View.OnClickListener
{
  gs(gr paramgr) {}
  
  public void onClick(View paramView)
  {
    if ((paramView.getId() != 2131559524) && (gr.a(this.a) < 100) && (gr.b(this.a) == null)) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            switch (paramView.getId())
            {
            case 2131559525: 
            case 2131559526: 
            default: 
              return;
            case 2131559524: 
              this.a.c();
              return;
            case 2131559527: 
              i = gr.a(this.a) / 100;
              gr.c(this.a).setText("" + i * 100);
              Selection.setSelection(gr.c(this.a).getText(), gr.c(this.a).getText().length());
            }
          } while (gr.b(this.a) == null);
          gr.b(this.a).d();
          return;
          i = gr.a(this.a) / 200;
          gr.c(this.a).setText("" + i * 100);
          Selection.setSelection(gr.c(this.a).getText(), gr.c(this.a).getText().length());
        } while (gr.b(this.a) == null);
        gr.b(this.a).c();
        return;
        i = gr.a(this.a) / 300;
        gr.c(this.a).setText("" + i * 100);
        Selection.setSelection(gr.c(this.a).getText(), gr.c(this.a).getText().length());
      } while (gr.b(this.a) == null);
      gr.b(this.a).b();
      return;
      int i = gr.a(this.a) / 400;
      gr.c(this.a).setText("" + i * 100);
      Selection.setSelection(gr.c(this.a).getText(), gr.c(this.a).getText().length());
    } while (gr.b(this.a) == null);
    gr.b(this.a).a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */