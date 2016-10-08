package com.tencent.avsdkhost;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;

class ChatMsgGuestListAdapterHost$Clickable
  extends ClickableSpan
{
  private final int mColor;
  private final View.OnClickListener mListener;
  
  public ChatMsgGuestListAdapterHost$Clickable(ChatMsgGuestListAdapterHost paramChatMsgGuestListAdapterHost, View.OnClickListener paramOnClickListener, int paramInt)
  {
    this.mListener = paramOnClickListener;
    this.mColor = paramInt;
  }
  
  public void onClick(View paramView)
  {
    if (this.mListener != null) {
      this.mListener.onClick(paramView);
    }
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.mColor);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatMsgGuestListAdapterHost$Clickable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */