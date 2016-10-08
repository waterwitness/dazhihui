package com.tencent.avsdk;

import android.support.v7.widget.bk;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.NoEllipsisTextView;
import com.android.dazhihui.ui.widget.roundedratioimageview.RoundedRatioImageView;

public class LiveVideoRecycleViewAdapter$ItemViewHolderAttention
  extends bk
  implements View.OnClickListener
{
  private RoundedRatioImageView ilvb_live_room_image;
  private TextView ilvb_live_room_je;
  private NoEllipsisTextView ilvb_live_room_location;
  private NoEllipsisTextView ilvb_live_room_name;
  private TextView ilvb_live_room_num;
  private TextView ilvb_live_room_rank;
  private TextView ilvb_live_room_title;
  private TextView ilvb_live_tag1;
  private TextView ilvb_live_tag2;
  private TextView ilvb_live_type;
  private int position;
  private View room_hongbao_info;
  private TextView room_hongbao_number;
  
  public LiveVideoRecycleViewAdapter$ItemViewHolderAttention(LiveVideoRecycleViewAdapter paramLiveVideoRecycleViewAdapter, View paramView)
  {
    super(paramView);
    this.ilvb_live_room_image = ((RoundedRatioImageView)paramView.findViewById(2131559428));
    this.ilvb_live_room_name = ((NoEllipsisTextView)paramView.findViewById(2131559435));
    this.ilvb_live_type = ((TextView)paramView.findViewById(2131559429));
    this.ilvb_live_room_title = ((TextView)paramView.findViewById(2131559441));
    this.ilvb_live_room_num = ((TextView)paramView.findViewById(2131559433));
    this.ilvb_live_tag1 = ((TextView)paramView.findViewById(2131559430));
    this.ilvb_live_tag2 = ((TextView)paramView.findViewById(2131559431));
    this.room_hongbao_number = ((TextView)paramView.findViewById(2131559437));
    this.room_hongbao_info = paramView.findViewById(2131559436);
    this.ilvb_live_room_location = ((NoEllipsisTextView)paramView.findViewById(2131559434));
    this.ilvb_live_room_rank = ((TextView)paramView.findViewById(2131559439));
    this.ilvb_live_room_je = ((TextView)paramView.findViewById(2131559440));
    paramView.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (this.this$0.onRecyclerViewListener != null) {
      this.this$0.onRecyclerViewListener.onItemClick(paramView, this.position);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\LiveVideoRecycleViewAdapter$ItemViewHolderAttention.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */