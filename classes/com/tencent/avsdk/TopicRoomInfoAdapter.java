package com.tencent.avsdk;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.widget.NoEllipsisTextView;
import com.android.dazhihui.ui.widget.roundedratioimageview.RoundedRatioImageView;
import com.g.a.b.a.e;
import com.g.a.b.a.h;
import com.g.a.b.d;
import com.g.a.b.f;
import com.g.a.b.g;
import com.g.a.b.j;
import java.util.List;

public class TopicRoomInfoAdapter
  extends ArrayAdapter<LiveVideoInfo>
{
  private ClipboardManager clip;
  private Context context;
  private Typeface fontFace;
  private LiveVideoInfo liveVideoInfo;
  private boolean mShowTypeName;
  private d options;
  
  public TopicRoomInfoAdapter(Context paramContext, int paramInt, List<LiveVideoInfo> paramList, boolean paramBoolean)
  {
    super(paramContext, paramInt, paramList);
    this.mShowTypeName = paramBoolean;
    this.context = paramContext;
    this.options = new f().a(2130838216).b(2130838216).c(2130838216).a(e.d).a(true).c(true).a(Bitmap.Config.RGB_565).a();
    paramList = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new com.g.a.a.a.b.c()).a(h.b).a(new com.g.a.a.b.a.c()).b(10).b();
    g.a().a(paramList);
    this.fontFace = Typeface.createFromAsset(paramContext.getAssets(), "fonts/eurostib.ttf");
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(getContext()).inflate(2130903213, null);
      paramViewGroup = new TopicRoomInfoAdapter.ViewHolder(this);
      paramViewGroup.imageViewCoverImage = ((RoundedRatioImageView)paramView.findViewById(2131559428));
      paramViewGroup.textViewUserName = ((NoEllipsisTextView)paramView.findViewById(2131559435));
      paramViewGroup.textViewLiveType = ((TextView)paramView.findViewById(2131559429));
      paramViewGroup.textViewLiveTitle = ((TextView)paramView.findViewById(2131559441));
      paramViewGroup.textViewLiveViewer = ((TextView)paramView.findViewById(2131559433));
      paramViewGroup.textViewLiveTag1 = ((TextView)paramView.findViewById(2131559430));
      paramViewGroup.textViewLiveTag2 = ((TextView)paramView.findViewById(2131559431));
      paramViewGroup.textViewMoney = ((TextView)paramView.findViewById(2131559437));
      paramViewGroup.viewMoney = paramView.findViewById(2131559436);
      paramViewGroup.mRoomLocation = ((NoEllipsisTextView)paramView.findViewById(2131559434));
      paramView.setTag(paramViewGroup);
      this.liveVideoInfo = ((LiveVideoInfo)getItem(paramInt));
      g.a().a(this.liveVideoInfo.getVbImgUrl(), paramViewGroup.imageViewCoverImage, this.options);
      if (TextUtils.isEmpty(this.liveVideoInfo.getTagStatusTxt())) {
        break label487;
      }
      paramViewGroup.textViewLiveType.setVisibility(0);
      paramViewGroup.textViewLiveType.setText(this.liveVideoInfo.getTagStatusTxt());
      label227:
      if ((!this.mShowTypeName) || (this.liveVideoInfo.getTagTxt() == null) || (this.liveVideoInfo.getTagTxt().length <= 0)) {
        break label498;
      }
      paramViewGroup.textViewLiveTag1.setVisibility(0);
      paramViewGroup.textViewLiveTag1.setText(this.liveVideoInfo.getTagTxt()[0]);
      label279:
      if ((!this.mShowTypeName) || (this.liveVideoInfo.getTagTxt() == null) || (this.liveVideoInfo.getTagTxt().length <= 1)) {
        break label510;
      }
      paramViewGroup.textViewLiveTag2.setVisibility(0);
      paramViewGroup.textViewLiveTag2.setText(this.liveVideoInfo.getTagTxt()[1]);
      label332:
      if (this.liveVideoInfo.getmMoneyUnit() <= 0) {
        break label522;
      }
      paramViewGroup.viewMoney.setVisibility(0);
      paramViewGroup.textViewMoney.setText(this.liveVideoInfo.getmMoneyUnit() + "币/人");
    }
    for (;;)
    {
      paramViewGroup.textViewUserName.setText(this.liveVideoInfo.getOwnerName());
      paramViewGroup.textViewLiveTitle.setText(this.liveVideoInfo.getRoomTopic());
      paramViewGroup.textViewLiveViewer.setText(String.valueOf(this.liveVideoInfo.getPV()) + "人");
      if (!TextUtils.isEmpty(this.liveVideoInfo.getCity())) {
        paramViewGroup.mRoomLocation.setText(this.liveVideoInfo.getCity());
      }
      return paramView;
      paramViewGroup = (TopicRoomInfoAdapter.ViewHolder)paramView.getTag();
      break;
      label487:
      paramViewGroup.textViewLiveType.setVisibility(4);
      break label227;
      label498:
      paramViewGroup.textViewLiveTag1.setVisibility(8);
      break label279;
      label510:
      paramViewGroup.textViewLiveTag2.setVisibility(8);
      break label332;
      label522:
      paramViewGroup.viewMoney.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\TopicRoomInfoAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */