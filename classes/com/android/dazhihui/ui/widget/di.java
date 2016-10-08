package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.d.n;

class di
  implements View.OnClickListener
{
  di(EmojiInputView paramEmojiInputView) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131558617: 
      do
      {
        return;
      } while (EmojiInputView.c(this.a) == null);
      EmojiInputView.c(this.a).b(EmojiInputView.d(this.a).getText().toString());
      return;
    case 2131558594: 
      this.a.setBbsMenuGroupStatus(2);
      return;
    case 2131558595: 
      this.a.setBbsMenuGroupStatus(3);
      return;
    case 2131558592: 
      n.a(this.a.a, 20089);
      this.a.setBbsMenuGroupStatus(4);
      return;
    }
    n.a(this.a.a, 20077);
    this.a.a(EmojiInputView.d(this.a), paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */