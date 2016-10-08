package com.tencent.avsdk;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.a.r;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomUser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberListAdapter
  extends BaseAdapter
{
  private static final String TAG = "ilvb";
  private Typeface fontFace;
  private List<CustomRspMsgVo.RoomUser> mAllMemberInfo = new ArrayList();
  private Context mContext;
  LayoutInflater mInflater;
  private boolean showName = true;
  
  public MemberListAdapter(Context paramContext)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
    this.fontFace = Typeface.createFromAsset(paramContext.getAssets(), "fonts/eurostib.ttf");
  }
  
  public int getCount()
  {
    if (this.mAllMemberInfo == null) {
      return 0;
    }
    return this.mAllMemberInfo.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.mAllMemberInfo == null) {
      return null;
    }
    return this.mAllMemberInfo.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public List<CustomRspMsgVo.RoomUser> getMemberData()
  {
    return this.mAllMemberInfo;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    CustomRspMsgVo.RoomUser localRoomUser;
    if (paramView == null)
    {
      paramViewGroup = new MemberListAdapter.ViewHolder();
      localView = this.mInflater.inflate(2130903194, null);
      paramViewGroup.icon = ((CircularImageButton)localView.findViewById(2131559424));
      paramViewGroup.nameText = ((TextView)localView.findViewById(2131559427));
      paramViewGroup.levelLayout = localView.findViewById(2131559425);
      paramViewGroup.numText = ((TextView)localView.findViewById(2131559426));
      paramViewGroup.numText.setTypeface(this.fontFace);
      paramViewGroup.numText.getPaint().setFakeBoldText(true);
      paramViewGroup.highLevelImage = ((ImageView)localView.findViewById(2131559367));
      localView.setTag(paramViewGroup);
      localRoomUser = (CustomRspMsgVo.RoomUser)this.mAllMemberInfo.get(paramInt);
      if (!this.showName) {
        break label427;
      }
      Object localObject = localRoomUser.AccountName;
      paramView = (View)localObject;
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        paramView = localRoomUser.Account;
      }
      localObject = paramView;
      if (paramView.length() > 2) {
        localObject = paramView.substring(0, 2);
      }
      paramViewGroup.nameText.setText((CharSequence)localObject);
      paramViewGroup.nameText.setVisibility(0);
      if ((TextUtils.isEmpty(localRoomUser.AccountLevel)) || (localRoomUser.AccountLevel.equals("-1"))) {
        break label502;
      }
    }
    for (;;)
    {
      try
      {
        paramInt = Integer.parseInt(localRoomUser.AccountLevel);
        paramViewGroup.nameText.setTextColor(Util.getLevelTextColor(paramInt));
        if (paramInt > 0)
        {
          paramViewGroup.levelLayout.setVisibility(0);
          ((GradientDrawable)paramViewGroup.levelLayout.getBackground()).setColor(Util.getLevelBackgroundColor(paramInt));
          ((GradientDrawable)paramViewGroup.icon.getBackground()).setColor(Util.getLevelTextColor(paramInt));
          if (paramInt <= 99)
          {
            paramViewGroup.numText.setVisibility(0);
            paramViewGroup.highLevelImage.setVisibility(8);
            paramViewGroup.numText.setText(String.valueOf(paramInt));
            paramViewGroup.icon.setMask(2.0F);
            if (TextUtils.isEmpty(localRoomUser.AccountImg)) {
              break label514;
            }
            paramView = new SimpleDateFormat("yyyyMMdd");
            paramView = localRoomUser.AccountImg + "?time=" + paramView.format(new Date());
            r.a(this.mContext).a(paramView, paramViewGroup.icon, 2130838231);
            return localView;
            paramViewGroup = (MemberListAdapter.ViewHolder)paramView.getTag();
            localView = paramView;
            break;
            label427:
            paramViewGroup.nameText.setVisibility(8);
          }
        }
      }
      catch (Exception paramView)
      {
        paramView.printStackTrace();
        paramInt = 0;
        continue;
        paramViewGroup.numText.setVisibility(8);
        paramViewGroup.highLevelImage.setVisibility(0);
        paramViewGroup.highLevelImage.setImageResource(Util.getLevelImageResource(paramInt));
        paramViewGroup.icon.setMask(4.0F);
        continue;
        paramViewGroup.levelLayout.setVisibility(8);
        continue;
      }
      label502:
      paramViewGroup.levelLayout.setVisibility(8);
    }
    label514:
    paramViewGroup.icon.setImageResource(2130838231);
    return localView;
  }
  
  public void refreshUser(List<CustomRspMsgVo.RoomUser> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.mAllMemberInfo.clear();
      this.mAllMemberInfo.addAll(paramList);
      notifyDataSetChanged();
    }
  }
  
  public void setShowName(boolean paramBoolean)
  {
    this.showName = paramBoolean;
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\MemberListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */