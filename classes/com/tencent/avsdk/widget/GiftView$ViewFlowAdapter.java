package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.widget.a.r;
import com.tencent.avsdk.Model.GiftVo;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.activity.IlvbRedEnvelope;
import com.tencent.avsdk.control.MessageControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GiftView$ViewFlowAdapter
  extends BaseAdapter
  implements View.OnClickListener
{
  private int clickNum = 0;
  private boolean isBegin = false;
  
  public GiftView$ViewFlowAdapter(GiftView paramGiftView) {}
  
  private View setView(View paramView)
  {
    GiftView.ViewFlowAdapter.ItemHolder localItemHolder = new GiftView.ViewFlowAdapter.ItemHolder(this);
    localItemHolder.hua = ((ImageView)paramView.findViewById(2131559169));
    localItemHolder.continueIco = ((ImageView)paramView.findViewById(2131559170));
    localItemHolder.checkedIco = ((ImageView)paramView.findViewById(2131559171));
    localItemHolder.name = ((TextView)paramView.findViewById(2131558624));
    localItemHolder.money = ((TextView)paramView.findViewById(2131559172));
    paramView.setTag(localItemHolder);
    return paramView;
  }
  
  public int getCount()
  {
    int j = 0;
    int i = j;
    if (GiftView.access$200(this.this$0) != null)
    {
      if (GiftView.access$200(this.this$0).data != null) {
        break label31;
      }
      i = j;
    }
    label31:
    List localList;
    do
    {
      do
      {
        do
        {
          return i;
          localList = GiftView.access$200(this.this$0).data;
          i = j;
        } while (localList == null);
        i = j;
      } while (localList.size() == 0);
      j = localList.size() / 8;
      i = j;
    } while (localList.size() % 8 == 0);
    return j + 1;
  }
  
  public Object getItem(int paramInt)
  {
    return GiftView.access$200(this.this$0).data.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new ArrayList();
      if (GiftView.access$100(this.this$0).getResources().getConfiguration().orientation == 2)
      {
        paramView = LayoutInflater.from(GiftView.access$100(this.this$0)).inflate(2130903152, null);
        paramViewGroup.add(setView(paramView.findViewById(2131559180)));
        paramViewGroup.add(setView(paramView.findViewById(2131559181)));
        paramViewGroup.add(setView(paramView.findViewById(2131559182)));
        paramViewGroup.add(setView(paramView.findViewById(2131559183)));
        paramViewGroup.add(setView(paramView.findViewById(2131559184)));
        paramViewGroup.add(setView(paramView.findViewById(2131559185)));
        paramViewGroup.add(setView(paramView.findViewById(2131559186)));
        paramViewGroup.add(setView(paramView.findViewById(2131559187)));
        paramView.setTag(paramViewGroup);
      }
    }
    for (;;)
    {
      localObject = paramViewGroup.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((View)((Iterator)localObject).next()).setVisibility(4);
      }
      paramView = LayoutInflater.from(GiftView.access$100(this.this$0)).inflate(2130903151, null);
      break;
      paramViewGroup = (List)paramView.getTag();
    }
    Object localObject = GiftView.access$200(this.this$0).data;
    int i = paramInt * 8;
    int j = Math.min(i + 8, ((List)localObject).size());
    paramInt = 0;
    if (i < j)
    {
      GiftVo.GiftItem localGiftItem = (GiftVo.GiftItem)((List)localObject).get(i);
      ((View)paramViewGroup.get(paramInt)).setVisibility(0);
      ((View)paramViewGroup.get(paramInt)).setOnClickListener(this);
      GiftView.ViewFlowAdapter.ItemHolder localItemHolder = (GiftView.ViewFlowAdapter.ItemHolder)((View)paramViewGroup.get(paramInt)).getTag();
      localItemHolder.giftItem = localGiftItem;
      localItemHolder.name.setText(localGiftItem.pName);
      localItemHolder.money.setText(String.valueOf(localGiftItem.pCoin) + " 慧币");
      if (localGiftItem.isLink.equals("1"))
      {
        localItemHolder.continueIco.setVisibility(0);
        label436:
        if ((GiftView.access$300(this.this$0) == null) || (GiftView.access$300(this.this$0).id != localGiftItem.id)) {
          break label522;
        }
        localItemHolder.checkedIco.setVisibility(0);
      }
      for (;;)
      {
        r.a(GiftView.access$100(this.this$0)).a(localGiftItem.pUrl, localItemHolder.hua);
        i += 1;
        paramInt += 1;
        break;
        localItemHolder.continueIco.setVisibility(8);
        break label436;
        label522:
        localItemHolder.checkedIco.setVisibility(8);
      }
    }
    return paramView;
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.this$0.commitBtn) {
      if (!UserilvbManager.getInstance().isFromDZHAccount()) {
        UserilvbManager.getInstance().showLoginDialog(GiftView.access$100(this.this$0));
      }
    }
    do
    {
      for (;;)
      {
        return;
        if (GiftView.access$300(this.this$0) == null) {
          break;
        }
        if (GiftView.access$300(this.this$0).isLink.equals("1"))
        {
          setClickNum(true);
          this.this$0.commitBtn.setVisibility(4);
          GiftView.access$002(this.this$0, 30);
          this.this$0.continuousBtn.setText("连发\n" + GiftView.access$000(this.this$0));
          this.this$0.continuousBtn.setOnClickListener(this);
          ((ViewGroup)this.this$0.continuousBtn.getParent()).setVisibility(0);
          this.this$0.continuousBtn.postDelayed(new GiftView.ViewFlowAdapter.1(this), 300L);
          if (!this.isBegin)
          {
            this.isBegin = true;
            new Thread(new GiftView.ViewFlowAdapter.2(this)).start();
          }
        }
        while (GiftView.access$300(this.this$0).countid != 0)
        {
          n.a("", GiftView.access$300(this.this$0).countid);
          return;
          sendGift(false, 1);
          this.this$0.dismiss();
        }
      }
      this.this$0.noSelectTip.setVisibility(0);
      return;
      if (paramView != this.this$0.continuousBtn) {
        break;
      }
      setClickNum(true);
    } while ((GiftView.access$300(this.this$0) == null) || (GiftView.access$300(this.this$0).countid == 0));
    n.a("", GiftView.access$300(this.this$0).countid);
    return;
    paramView = (GiftView.ViewFlowAdapter.ItemHolder)paramView.getTag();
    if ((GiftView.access$300(this.this$0) != null) && (paramView.giftItem.id == GiftView.access$300(this.this$0).id))
    {
      GiftView.access$302(this.this$0, null);
      this.this$0.commitBtn.setBackgroundColor(-4671304);
      this.this$0.adapter.notifyDataSetChanged();
      return;
    }
    this.this$0.noSelectTip.setVisibility(8);
    if (paramView.giftItem.type == 6)
    {
      IlvbRedEnvelope.onStart(GiftView.access$100(this.this$0), MessageControl.getInstance().onLineNumber);
      this.this$0.dismiss();
      return;
    }
    GiftView.access$302(this.this$0, paramView.giftItem);
    paramView.checkedIco.setVisibility(0);
    this.this$0.commitBtn.setBackgroundColor(-10976293);
    this.this$0.adapter.notifyDataSetChanged();
  }
  
  public void sendGift(boolean paramBoolean, int paramInt)
  {
    Message localMessage;
    if (GiftView.access$300(this.this$0) != null)
    {
      localMessage = this.this$0.mActivityHandler.obtainMessage(268);
      localMessage.obj = String.valueOf(GiftView.access$300(this.this$0).id);
      localMessage.arg1 = paramInt;
      if (!paramBoolean) {
        break label70;
      }
    }
    label70:
    for (paramInt = 1;; paramInt = 0)
    {
      localMessage.arg2 = paramInt;
      this.this$0.mActivityHandler.sendMessage(localMessage);
      return;
    }
  }
  
  public int setClickNum(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        this.clickNum += 1;
        i = this.clickNum;
        return i;
      }
      finally {}
      int i = this.clickNum;
      this.clickNum = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GiftView$ViewFlowAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */