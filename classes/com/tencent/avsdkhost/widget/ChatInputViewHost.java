package com.tencent.avsdkhost.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.widget.SwitchView;

public class ChatInputViewHost
  extends RelativeLayout
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener
{
  private Handler mActivityHandler;
  private Context mContext;
  private LayoutInflater mInflater;
  public EditText mInputEdit;
  private View mInputSend;
  private Scroller mScroller;
  private ChatInputViewHost.SizeChange mSizeChange;
  private SwitchView mSwitchView;
  private int maxHeight;
  
  public ChatInputViewHost(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ChatInputViewHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ChatInputViewHost(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903178, this);
    this.mSwitchView = ((SwitchView)findViewById(2131559359));
    this.mInputEdit = ((EditText)findViewById(2131559361));
    this.mInputSend = findViewById(2131559362);
    this.mInputSend.setOnClickListener(this);
    this.mSwitchView.setOnCheckedChangeListener(this);
  }
  
  public void cancel() {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131559359: 
    case 2131559360: 
    case 2131559361: 
    default: 
      return;
    }
    if (!UserilvbManager.getInstance().isFromDZHAccount())
    {
      UserilvbManager.getInstance().showLoginDialog(this.mContext);
      return;
    }
    if ((!UserilvbManager.getInstance().isNoSpeak) || ((UserilvbManager.getInstance().noSpeakSurplus > -1) && (System.currentTimeMillis() - UserilvbManager.getInstance().noSpeakTime > UserilvbManager.getInstance().noSpeakSurplus * 1000)))
    {
      paramView = this.mInputEdit.getText().toString();
      this.mActivityHandler.obtainMessage(259, paramView).sendToTarget();
      this.mInputEdit.setText("");
      return;
    }
    Log.e("ilvb", "Error 不应该在这里，手机主播端怎么会被自己禁言!");
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((getResources().getConfiguration().orientation == 1) && (this.mSizeChange != null))
    {
      if (paramInt4 == 0) {
        break label78;
      }
      paramInt1 = paramInt2 - paramInt4;
      if (Math.abs(paramInt1) > 100)
      {
        if (paramInt1 <= 0) {
          break label65;
        }
        this.mSizeChange.onSizeChange(false, paramInt1);
      }
    }
    label65:
    label78:
    do
    {
      do
      {
        return;
        this.mSizeChange.onSizeChange(true, -paramInt1);
        return;
      } while ((this.maxHeight == 0) || (paramInt2 == 0) || (paramInt2 >= this.maxHeight));
      paramInt1 = paramInt2 - this.maxHeight;
    } while (Math.abs(paramInt1) <= 100);
    if (paramInt1 > 0)
    {
      this.mSizeChange.onSizeChange(false, paramInt1);
      return;
    }
    this.mSizeChange.onSizeChange(true, -paramInt1);
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.maxHeight = paramInt;
  }
  
  public void setOnSizeChange(ChatInputViewHost.SizeChange paramSizeChange)
  {
    this.mSizeChange = paramSizeChange;
  }
  
  public void start() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\ChatInputViewHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */