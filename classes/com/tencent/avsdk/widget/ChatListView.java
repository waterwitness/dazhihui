package com.tencent.avsdk.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.avsdk.ChatMsgGuestListAdapter;
import com.tencent.avsdk.control.MessageControl;

public class ChatListView
  extends ListView
{
  private String TAG = "ilvb";
  private Handler mActivityHandler;
  private boolean mAllowAutoScrollBottom = true;
  private ChatMsgGuestListAdapter mChatMsgListAdapter;
  private boolean mClickUnread = false;
  private Context mContext;
  private TextView mUnreadChatText;
  private View mUnreadChatView;
  private int mUnreadCount = 0;
  
  public ChatListView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public ChatListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public ChatListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.mContext = paramContext;
    setVerticalScrollBarEnabled(false);
    setOverScrollMode(2);
    setVerticalFadingEdgeEnabled(false);
  }
  
  public void hideUnreadView()
  {
    this.mUnreadCount = 0;
    if ((this.mUnreadChatView != null) && (this.mUnreadChatView.getVisibility() != 8)) {
      this.mUnreadChatView.setVisibility(8);
    }
  }
  
  public void init(MessageControl paramMessageControl)
  {
    this.mChatMsgListAdapter = new ChatMsgGuestListAdapter(this.mContext, paramMessageControl.getListChatEntity());
    if ((this.mActivityHandler != null) && (this.mChatMsgListAdapter != null)) {
      this.mChatMsgListAdapter.setActivityHandler(this.mActivityHandler);
    }
    setAdapter(this.mChatMsgListAdapter);
    if (getCount() > 1) {
      setSelection(getCount() - 1);
    }
    setOnScrollListener(new ChatListView.1(this));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Log.d(this.TAG, getClass().getName() + " onSizeChanged w=" + paramInt1 + " h=" + paramInt2 + " oldw=" + paramInt3 + " oldh=" + paramInt4);
    if (this.mClickUnread)
    {
      this.mClickUnread = false;
      refreshChat();
    }
  }
  
  public void refreshChat()
  {
    this.mChatMsgListAdapter.notifyDataSetChanged();
    if ((getCount() > 1) && (this.mAllowAutoScrollBottom))
    {
      setSelection(getCount() - 1);
      hideUnreadView();
    }
    while ((getCount() <= 1) || (this.mAllowAutoScrollBottom)) {
      return;
    }
    showUnreadView();
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
    if (this.mChatMsgListAdapter != null) {
      this.mChatMsgListAdapter.setActivityHandler(paramHandler);
    }
  }
  
  public void setUnreadView(View paramView)
  {
    if (paramView != null)
    {
      this.mUnreadChatView = paramView;
      this.mUnreadChatText = ((TextView)paramView.findViewById(2131559344));
      this.mUnreadChatView.setOnClickListener(new ChatListView.2(this));
    }
  }
  
  public void showUnreadView()
  {
    this.mUnreadCount += 1;
    if (this.mUnreadCount <= 0) {
      this.mUnreadCount = 1;
    }
    if (this.mUnreadChatView != null)
    {
      this.mUnreadChatText.setText(this.mUnreadCount + "条新弹幕");
      this.mUnreadChatView.setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */