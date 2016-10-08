package com.tencent.avsdk.control;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.g;
import com.android.dazhihui.c.b.a;
import com.tencent.avsdk.Model.GiftVo;
import java.util.List;

public class GiftManager
{
  public static GiftVo nnMenuConfigVo;
  
  public static void getConfig(GiftManager.GiftCallBack paramGiftCallBack)
  {
    GiftVo localGiftVo1;
    GiftVo localGiftVo2;
    if (nnMenuConfigVo != null)
    {
      localGiftVo1 = nnMenuConfigVo;
      if ((localGiftVo1 != null) && (localGiftVo1.data != null) && (localGiftVo1.data.size() != 0))
      {
        localGiftVo2 = localGiftVo1;
        if (localGiftVo1.header != null) {}
      }
      else
      {
        localGiftVo2 = null;
      }
      if ((localGiftVo2 != null) && (localGiftVo2.isSameDay())) {
        break label89;
      }
      nnMenuConfigVo = localGiftVo2;
      sendJsonRequest(paramGiftCallBack);
    }
    label89:
    do
    {
      return;
      localGiftVo1 = (GiftVo)DzhApplication.a().b().a("GiftVo", new GiftManager.1());
      break;
      nnMenuConfigVo = localGiftVo2;
    } while (paramGiftCallBack == null);
    paramGiftCallBack.callBack(localGiftVo2);
  }
  
  private static void sendJsonRequest(GiftManager.GiftCallBack paramGiftCallBack)
  {
    com.android.dazhihui.a.b.f localf = new com.android.dazhihui.a.b.f();
    localf.c(com.android.dazhihui.a.f.Y);
    localf.a(new GiftManager.2(paramGiftCallBack));
    g.a().a(localf);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\GiftManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */