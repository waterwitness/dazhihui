package com.tencent.avsdkhost;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.tencent.avsdk.Util;
import java.util.List;

public class ChatMsgGuestListAdapterHost
  extends BaseAdapter
{
  private static String TAG = "ilvb";
  private Typeface fontFace;
  private ChatMsgGuestListAdapterHost.ViewHolder holder;
  private Handler mActivityHandler;
  private int mAdvColor = -41344;
  private List<ChatEntityHost> mChatDataList = null;
  private Context mContext;
  private int mHostColor = -3100329;
  private LayoutInflater mInflater;
  private int mKickOffColor = -6501632;
  private View.OnClickListener mOnClickListener = new ChatMsgGuestListAdapterHost.1(this);
  private PopupWindow mShutUpPopupWindow = null;
  private int mSystemColor = -5467664;
  
  public ChatMsgGuestListAdapterHost(Context paramContext, List<ChatEntityHost> paramList)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
    this.mChatDataList = paramList;
    this.fontFace = Typeface.createFromAsset(paramContext.getAssets(), "fonts/eurostib.ttf");
  }
  
  public int getCount()
  {
    return this.mChatDataList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.mChatDataList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    return super.getItemViewType(paramInt);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ChatEntityHost localChatEntityHost = (ChatEntityHost)this.mChatDataList.get(paramInt);
    if (paramView == null)
    {
      paramViewGroup = this.mInflater.inflate(2130903179, null);
      this.holder = new ChatMsgGuestListAdapterHost.ViewHolder();
      this.holder.content = ((TextView)paramViewGroup.findViewById(2131559363));
      this.holder.levelLayout = paramViewGroup.findViewById(2131559364);
      this.holder.levelImage = ((ImageView)paramViewGroup.findViewById(2131559365));
      this.holder.levelText = ((TextView)paramViewGroup.findViewById(2131559366));
      this.holder.levelText.setTypeface(this.fontFace);
      this.holder.levelText.getPaint().setFakeBoldText(true);
      this.holder.hongbaoImage = ((ImageView)paramViewGroup.findViewById(2131559368));
      paramViewGroup.setTag(this.holder);
      this.holder.content.setTag(this.holder);
      paramView = localChatEntityHost.user;
      if (TextUtils.isEmpty(localChatEntityHost.AccountLevel)) {
        break label508;
      }
    }
    label508:
    label523:
    label1220:
    label1266:
    for (;;)
    {
      try
      {
        i = Integer.parseInt(localChatEntityHost.AccountLevel);
        if (i > 0)
        {
          if (i <= 99) {
            break label1266;
          }
          i = 99;
          this.holder.levelLayout.setVisibility(0);
          ((GradientDrawable)this.holder.levelLayout.getBackground()).setColor(Util.getLevelBackgroundColor(i));
          this.holder.levelImage.setImageResource(Util.getLevelImageResource(i));
          this.holder.levelText.setText(String.valueOf(i));
          paramView = "        " + paramView;
          this.holder.userAccount = localChatEntityHost.userAccount;
          if (localChatEntityHost.messageType != ChatEntityHost.ChatHostType.CHAT_TEXT) {
            break label523;
          }
          String str = paramView + ": ";
          paramView = new SpannableString(str + localChatEntityHost.event);
          paramView.setSpan(new ChatMsgGuestListAdapterHost.Clickable(this, this.mOnClickListener, this.mHostColor), 0, str.length(), 33);
          this.holder.content.setMovementMethod(LinkMovementMethod.getInstance());
          if (localChatEntityHost.messageType != ChatEntityHost.ChatHostType.CHAT_HONGBAO) {
            break label1220;
          }
          this.holder.hongbaoImage.setVisibility(0);
          this.holder.hongbaoImage.setOnClickListener(new ChatMsgGuestListAdapterHost.2(this, paramInt));
          this.holder.content.setText(paramView);
          return paramViewGroup;
          this.holder = ((ChatMsgGuestListAdapterHost.ViewHolder)paramView.getTag());
          paramViewGroup = paramView;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        int i = 0;
        continue;
        this.holder.levelLayout.setVisibility(8);
      }
      for (;;)
      {
        break;
        this.holder.levelLayout.setVisibility(8);
      }
      Object localObject;
      if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_GIFT)
      {
        localObject = new SpannableString(paramView + localChatEntityHost.event);
        ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-41854), paramView.length(), ((SpannableString)localObject).length(), 33);
        ((SpannableString)localObject).setSpan(new ChatMsgGuestListAdapterHost.Clickable(this, this.mOnClickListener, -3100329), 0, paramView.length(), 33);
        this.holder.content.setMovementMethod(LinkMovementMethod.getInstance());
        paramView = (View)localObject;
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_SYSTEM)
      {
        localObject = paramView + ": ";
        paramView = new SpannableString((String)localObject + localChatEntityHost.event);
        paramView.setSpan(new ForegroundColorSpan(-3100329), 0, ((String)localObject).length(), 33);
        paramView.setSpan(new ForegroundColorSpan(-6501632), ((String)localObject).length(), paramView.length(), 33);
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_ERROR)
      {
        paramView = new SpannableString(localChatEntityHost.event);
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_MEMBER)
      {
        paramView = new SpannableString(paramView + localChatEntityHost.event);
        paramView.setSpan(new ForegroundColorSpan(-5467664), 0, paramView.length(), 33);
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_FORCE_QUIT)
      {
        paramView = new SpannableString(paramView + localChatEntityHost.event);
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_C2C_TEXT)
      {
        localObject = paramView + ": ";
        paramView = new SpannableString((String)localObject + localChatEntityHost.event);
        paramView.setSpan(new ForegroundColorSpan(-3100329), 0, ((String)localObject).length(), 33);
        paramView.setSpan(new ForegroundColorSpan(-5467664), ((String)localObject).length(), paramView.length(), 33);
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_FOLLOW_PUSH)
      {
        localObject = new SpannableString(paramView + localChatEntityHost.event);
        ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-3100329), paramView.length(), ((SpannableString)localObject).length(), 33);
        ((SpannableString)localObject).setSpan(new ChatMsgGuestListAdapterHost.Clickable(this, this.mOnClickListener, -3100329), 0, paramView.length(), 33);
        this.holder.content.setMovementMethod(LinkMovementMethod.getInstance());
        paramView = (View)localObject;
      }
      else if (localChatEntityHost.messageType == ChatEntityHost.ChatHostType.CHAT_HONGBAO)
      {
        localObject = paramView + ": ";
        paramView = new SpannableString((String)localObject + localChatEntityHost.event);
        paramView.setSpan(new ForegroundColorSpan(-3100329), 0, ((String)localObject).length(), 33);
        paramView.setSpan(new ForegroundColorSpan(-41854), ((String)localObject).length(), paramView.length(), 33);
        continue;
        if (this.holder.hongbaoImage.getVisibility() != 8)
        {
          this.holder.hongbaoImage.setVisibility(8);
          this.holder.hongbaoImage.setOnClickListener(null);
        }
      }
      else
      {
        paramView = null;
      }
    }
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    Log.d(TAG, "refreshChat notifyDataSetChanged");
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void showShutUp(String paramString)
  {
    if (!(this.mContext instanceof Activity)) {}
    Activity localActivity;
    do
    {
      return;
      localActivity = (Activity)this.mContext;
    } while ((localActivity == null) || (localActivity.isFinishing()) || (localActivity.getWindow() == null) || (localActivity.getWindow().getDecorView() == null));
    if (this.mShutUpPopupWindow != null) {
      this.mShutUpPopupWindow.dismiss();
    }
    for (;;)
    {
      this.mShutUpPopupWindow.getContentView().findViewById(2131559414).setOnClickListener(new ChatMsgGuestListAdapterHost.3(this, paramString));
      this.mShutUpPopupWindow.getContentView().findViewById(2131559417).setOnClickListener(new ChatMsgGuestListAdapterHost.4(this, paramString));
      this.mShutUpPopupWindow.setOutsideTouchable(true);
      this.mShutUpPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
      this.mShutUpPopupWindow.setWindowLayoutMode(-2, -2);
      this.mShutUpPopupWindow.showAtLocation(localActivity.getWindow().getDecorView(), 1, 0, 0);
      return;
      this.mShutUpPopupWindow = new PopupWindow((ViewGroup)this.mInflater.inflate(2130903190, null), -2, -2, true);
    }
  }
  
  public void showZhuYe(String paramString)
  {
    String str = f.ap + paramString;
    Bundle localBundle = new Bundle();
    Intent localIntent = new Intent(this.mContext, BrowserActivity.class);
    localBundle.putString("nexturl", str);
    localIntent.putExtras(localBundle);
    if (!TextUtils.isEmpty(paramString)) {
      this.mContext.startActivity(localIntent);
    }
    if (g.a().L()) {
      Log.d(TAG, "用户的主页=" + str);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatMsgGuestListAdapterHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */