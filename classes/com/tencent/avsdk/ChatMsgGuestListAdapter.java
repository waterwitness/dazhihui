package com.tencent.avsdk;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ChatMsgGuestListAdapter
  extends BaseAdapter
{
  private static String TAG = "ilvb";
  private Typeface fontFace;
  private ChatMsgGuestListAdapter.ViewHolder holder;
  private Handler mActivityHandler;
  private int mAdvColor = -41344;
  private List<ChatEntity> mChatDataList = null;
  private Context mContext;
  private int mHostColor = -3100329;
  private LayoutInflater mInflater;
  private int mKickOffColor = -6501632;
  private View.OnClickListener mOnClickListener = new ChatMsgGuestListAdapter.1(this);
  private int mSystemColor = -5467664;
  
  public ChatMsgGuestListAdapter(Context paramContext, List<ChatEntity> paramList)
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
    ChatEntity localChatEntity = (ChatEntity)this.mChatDataList.get(paramInt);
    if (paramView == null)
    {
      paramViewGroup = this.mInflater.inflate(2130903179, null);
      this.holder = new ChatMsgGuestListAdapter.ViewHolder();
      this.holder.content = ((TextView)paramViewGroup.findViewById(2131559363));
      this.holder.levelLayout = paramViewGroup.findViewById(2131559364);
      this.holder.levelImage = ((ImageView)paramViewGroup.findViewById(2131559365));
      this.holder.levelText = ((TextView)paramViewGroup.findViewById(2131559366));
      this.holder.levelText.setTypeface(this.fontFace);
      this.holder.levelText.getPaint().setFakeBoldText(true);
      this.holder.highLevelImage = ((ImageView)paramViewGroup.findViewById(2131559367));
      this.holder.hongbaoImage = ((ImageView)paramViewGroup.findViewById(2131559368));
      paramViewGroup.setTag(this.holder);
      this.holder.content.setTag(this.holder);
      paramView = localChatEntity.user;
      if (TextUtils.isEmpty(localChatEntity.AccountLevel)) {
        break label607;
      }
    }
    for (;;)
    {
      try
      {
        i = Integer.parseInt(localChatEntity.AccountLevel);
        if (i > 0)
        {
          this.holder.levelLayout.setVisibility(0);
          ((GradientDrawable)this.holder.levelLayout.getBackground()).setColor(Util.getLevelBackgroundColor(i));
          if (i <= 99)
          {
            this.holder.highLevelImage.setVisibility(8);
            this.holder.levelImage.setVisibility(0);
            this.holder.levelText.setVisibility(0);
            this.holder.levelImage.setImageResource(Util.getLevelImageResource(i));
            this.holder.levelText.setText(String.valueOf(i));
            paramView = "        " + paramView;
            this.holder.userAccount = localChatEntity.userAccount;
            if (localChatEntity.messageType != ChatEntity.ChatGuestType.CHAT_TEXT) {
              break label622;
            }
            String str = paramView + ": ";
            paramView = new SpannableString(str + localChatEntity.event);
            paramView.setSpan(new ChatMsgGuestListAdapter.Clickable(this, this.mOnClickListener, this.mHostColor), 0, str.length(), 33);
            this.holder.content.setMovementMethod(LinkMovementMethod.getInstance());
            if (localChatEntity.messageType != ChatEntity.ChatGuestType.CHAT_HONGBAO) {
              break label1207;
            }
            this.holder.hongbaoImage.setVisibility(0);
            this.holder.hongbaoImage.setOnClickListener(new ChatMsgGuestListAdapter.2(this, paramInt));
            this.holder.content.setText(paramView);
            return paramViewGroup;
            this.holder = ((ChatMsgGuestListAdapter.ViewHolder)paramView.getTag());
            paramViewGroup = paramView;
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        int i = 0;
        continue;
        this.holder.highLevelImage.setVisibility(0);
        this.holder.levelImage.setVisibility(8);
        this.holder.levelText.setVisibility(8);
        this.holder.highLevelImage.setImageResource(Util.getLevelImageResource(i));
        continue;
        this.holder.levelLayout.setVisibility(8);
      }
      for (;;)
      {
        break;
        label607:
        this.holder.levelLayout.setVisibility(8);
      }
      label622:
      Object localObject;
      if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_GIFT)
      {
        localObject = new SpannableString(paramView + localChatEntity.event);
        ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-41854), paramView.length(), ((SpannableString)localObject).length(), 33);
        ((SpannableString)localObject).setSpan(new ChatMsgGuestListAdapter.Clickable(this, this.mOnClickListener, -3100329), 0, paramView.length(), 33);
        this.holder.content.setMovementMethod(LinkMovementMethod.getInstance());
        paramView = (View)localObject;
      }
      else if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_SYSTEM)
      {
        localObject = paramView + ": ";
        paramView = new SpannableString((String)localObject + localChatEntity.event);
        paramView.setSpan(new ForegroundColorSpan(-3100329), 0, ((String)localObject).length(), 33);
        paramView.setSpan(new ForegroundColorSpan(-6501632), ((String)localObject).length(), paramView.length(), 33);
      }
      else if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_ERROR)
      {
        paramView = new SpannableString(localChatEntity.event);
      }
      else if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_MEMBER)
      {
        paramView = new SpannableString(paramView + localChatEntity.event);
        paramView.setSpan(new ForegroundColorSpan(-5467664), 0, paramView.length(), 33);
      }
      else if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_FORCE_QUIT)
      {
        paramView = new SpannableString(paramView + localChatEntity.event);
      }
      else if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_C2C_TEXT)
      {
        localObject = paramView + ": ";
        paramView = new SpannableString((String)localObject + localChatEntity.event);
        paramView.setSpan(new ForegroundColorSpan(-3100329), 0, ((String)localObject).length(), 33);
        paramView.setSpan(new ForegroundColorSpan(-5467664), ((String)localObject).length(), paramView.length(), 33);
      }
      else if (localChatEntity.messageType == ChatEntity.ChatGuestType.CHAT_HONGBAO)
      {
        localObject = paramView + ": ";
        paramView = new SpannableString((String)localObject + localChatEntity.event);
        paramView.setSpan(new ForegroundColorSpan(-3100329), 0, ((String)localObject).length(), 33);
        paramView.setSpan(new ForegroundColorSpan(-41854), ((String)localObject).length(), paramView.length(), 33);
        continue;
        label1207:
        if (this.holder.hongbaoImage.getVisibility() != 8) {
          this.holder.hongbaoImage.setVisibility(8);
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\ChatMsgGuestListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */