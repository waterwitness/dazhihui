package com.tencent.avsdkhost.activity;

import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.GiftVo;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import com.tencent.avsdk.control.GiftManager.GiftCallBack;
import com.tencent.avsdk.widget.FlowerView.FlowerVo;
import com.tencent.avsdk.widget.TwoFlowerView;
import com.tencent.avsdkhost.ChatEntityHost.ChatHostType;
import com.tencent.avsdkhost.control.AnimationControlHost;
import com.tencent.avsdkhost.control.MessageControlHost;
import com.tencent.avsdkhost.widget.AboveVideoBottomViewHost;
import java.util.Iterator;
import java.util.List;

class AvHostActivity$1$9
  implements GiftManager.GiftCallBack
{
  AvHostActivity$1$9(AvHostActivity.1 param1, CustomSysMsgVo.Present paramPresent) {}
  
  public void callBack(GiftVo paramGiftVo)
  {
    Object localObject;
    if ((paramGiftVo != null) && (paramGiftVo.data != null))
    {
      localObject = paramGiftVo.data.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        paramGiftVo = (GiftVo.GiftItem)((Iterator)localObject).next();
      } while (!paramGiftVo.id.equals(this.val$present.PresentId));
    }
    for (;;)
    {
      if (paramGiftVo != null)
      {
        if (paramGiftVo.type != 1) {
          break label262;
        }
        localObject = new FlowerView.FlowerVo();
        ((FlowerView.FlowerVo)localObject).giftName = paramGiftVo.pName;
        ((FlowerView.FlowerVo)localObject).giftId = paramGiftVo.id;
        ((FlowerView.FlowerVo)localObject).giftUrl = paramGiftVo.pUrl;
        ((FlowerView.FlowerVo)localObject).userId = this.val$present.Account;
        ((FlowerView.FlowerVo)localObject).userName = this.val$present.AccountName;
        ((FlowerView.FlowerVo)localObject).userUrl = this.val$present.AccountImg;
        ((FlowerView.FlowerVo)localObject).linkCount = this.val$present.LinkCount;
        if (!this.val$present.IsLink.equals("1")) {
          break label257;
        }
      }
      label257:
      for (boolean bool = true;; bool = false)
      {
        ((FlowerView.FlowerVo)localObject).isLink = bool;
        AvHostActivity.access$1800(this.this$1.this$0).flowerView.show((FlowerView.FlowerVo)localObject);
        if (AvHostActivity.access$1300(this.this$1.this$0) != null) {
          AvHostActivity.access$1300(this.this$1.this$0).sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_GIFT, this.val$present.AccountName, "送了一个" + paramGiftVo.pName, this.val$present.Account, this.val$present.AccountLevel);
        }
        return;
      }
      label262:
      if (AvHostActivity.access$2300(this.this$1.this$0) == null) {
        AvHostActivity.access$2302(this.this$1.this$0, new AnimationControlHost(AvHostActivity.access$1300(this.this$1.this$0), AvHostActivity.access$1800(this.this$1.this$0).gifView, AvHostActivity.access$1800(this.this$1.this$0).carAnimation, AvHostActivity.access$1800(this.this$1.this$0).yachtAnimation, AvHostActivity.access$1800(this.this$1.this$0).fireworksAnimation));
      }
      AvHostActivity.access$2300(this.this$1.this$0).show(paramGiftVo, this.val$present);
      return;
      paramGiftVo = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$1$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */