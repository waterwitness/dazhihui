package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import java.util.Map;

class dl
  implements TextWatcher
{
  dl(EmojiInputView paramEmojiInputView) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if ((EmojiInputView.g(this.a) != null) && (!EmojiInputView.g(this.a).equals(""))) {
      EmojiInputView.b().put(EmojiInputView.g(this.a), paramEditable.toString());
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      EmojiInputView.f(this.a).setTextColor(this.a.getResources().getColor(2131493017));
      EmojiInputView.f(this.a).setBackgroundResource(2130837557);
      return;
    }
    EmojiInputView.f(this.a).setTextColor(this.a.getResources().getColor(2131493018));
    EmojiInputView.f(this.a).setBackgroundResource(2130837560);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */