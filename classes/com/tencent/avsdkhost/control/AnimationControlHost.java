package com.tencent.avsdkhost.control;

import android.os.Handler;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import com.tencent.avsdk.widget.CarAnimation;
import com.tencent.avsdk.widget.FireworksAnimation;
import com.tencent.avsdk.widget.IlvbGifView;
import com.tencent.avsdk.widget.YachtAnimation;
import com.tencent.avsdkhost.ChatEntityHost.ChatHostType;
import java.util.ArrayList;
import java.util.List;

public class AnimationControlHost
{
  CarAnimation carAnimation;
  FireworksAnimation fireworksAnimation;
  private List<GiftVo.GiftItem> giftList = new ArrayList();
  IlvbGifView ilvbGifView;
  private boolean isShowAnimation = false;
  Handler mHandler = new AnimationControlHost.1(this);
  Runnable mRunnable = new AnimationControlHost.2(this);
  MessageControlHost messageControl;
  private List<CustomSysMsgVo.Present> presentList = new ArrayList();
  YachtAnimation yachtAnimation;
  
  public AnimationControlHost(MessageControlHost paramMessageControlHost, IlvbGifView paramIlvbGifView, CarAnimation paramCarAnimation, YachtAnimation paramYachtAnimation, FireworksAnimation paramFireworksAnimation)
  {
    this.ilvbGifView = paramIlvbGifView;
    this.messageControl = paramMessageControlHost;
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
        this.messageControl.sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_GIFT, paramPresent.AccountName, "送了一个" + paramGiftItem.pName, paramPresent.Account, paramPresent.AccountLevel);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\AnimationControlHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */