package com.tencent.avsdk.control;

import android.os.Handler;
import com.tencent.avsdk.ChatEntity.ChatGuestType;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import com.tencent.avsdk.widget.CarAnimation;
import com.tencent.avsdk.widget.FireworksAnimation;
import com.tencent.avsdk.widget.IlvbGifView;
import com.tencent.avsdk.widget.YachtAnimation;
import java.util.ArrayList;
import java.util.List;

public class AnimationControl
{
  CarAnimation carAnimation;
  FireworksAnimation fireworksAnimation;
  private List<GiftVo.GiftItem> giftList = new ArrayList();
  IlvbGifView ilvbGifView;
  private boolean isShowAnimation = false;
  Handler mHandler = new AnimationControl.1(this);
  Runnable mRunnable = new AnimationControl.2(this);
  MessageControl messageControl;
  private List<CustomSysMsgVo.Present> presentList = new ArrayList();
  YachtAnimation yachtAnimation;
  
  public AnimationControl(MessageControl paramMessageControl, IlvbGifView paramIlvbGifView, CarAnimation paramCarAnimation, YachtAnimation paramYachtAnimation, FireworksAnimation paramFireworksAnimation)
  {
    this.ilvbGifView = paramIlvbGifView;
    this.messageControl = paramMessageControl;
    this.carAnimation = paramCarAnimation;
    this.fireworksAnimation = paramFireworksAnimation;
    this.yachtAnimation = paramYachtAnimation;
  }
  
  public void show(GiftVo.GiftItem paramGiftItem, CustomSysMsgVo.Present paramPresent)
  {
    if (this.isShowAnimation)
    {
      this.giftList.add(paramGiftItem);
      this.presentList.add(paramPresent);
    }
    for (;;)
    {
      return;
      this.isShowAnimation = true;
      String str = paramPresent.AccountName + "送了一个" + paramGiftItem.pName;
      if (paramGiftItem.type == 2) {
        this.ilvbGifView.show(paramGiftItem.dUrl, this.mRunnable);
      }
      while (this.messageControl != null)
      {
        this.messageControl.sendRefreshChat(ChatEntity.ChatGuestType.CHAT_GIFT, paramPresent.AccountName, "送了一个" + paramGiftItem.pName, paramPresent.Account, paramPresent.AccountLevel);
        return;
        if (paramGiftItem.type == 3) {
          this.fireworksAnimation.start(str, this.mRunnable);
        } else if (paramGiftItem.type == 4) {
          this.carAnimation.start(str, this.mRunnable);
        } else if (paramGiftItem.type == 5) {
          this.yachtAnimation.start(str, this.mRunnable);
        } else {
          this.isShowAnimation = false;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AnimationControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */