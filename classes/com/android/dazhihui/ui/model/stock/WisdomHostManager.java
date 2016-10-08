package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.g;
import com.android.dazhihui.c.b.a;
import java.util.List;

public class WisdomHostManager
{
  public static WisdomHostVo nnMenuConfigVo;
  
  public static void getConfig(WisdomHostManager.WisdomCallBack paramWisdomCallBack)
  {
    WisdomHostVo localWisdomHostVo1;
    WisdomHostVo localWisdomHostVo2;
    if (nnMenuConfigVo != null)
    {
      localWisdomHostVo1 = nnMenuConfigVo;
      if ((localWisdomHostVo1 != null) && (localWisdomHostVo1.data != null) && (localWisdomHostVo1.data.getHotMsgs().size() != 0))
      {
        localWisdomHostVo2 = localWisdomHostVo1;
        if (localWisdomHostVo1.header != null) {}
      }
      else
      {
        localWisdomHostVo2 = null;
      }
      if ((localWisdomHostVo2 != null) && (localWisdomHostVo2.isSameDay())) {
        break label92;
      }
      nnMenuConfigVo = localWisdomHostVo2;
      sendJsonRequest(paramWisdomCallBack);
    }
    label92:
    do
    {
      return;
      localWisdomHostVo1 = (WisdomHostVo)DzhApplication.a().b().a("WisdomHostVo", new WisdomHostManager.1());
      break;
      nnMenuConfigVo = localWisdomHostVo2;
    } while (paramWisdomCallBack == null);
    paramWisdomCallBack.callBack(localWisdomHostVo2);
  }
  
  private static void sendJsonRequest(WisdomHostManager.WisdomCallBack paramWisdomCallBack)
  {
    com.android.dazhihui.a.b.f localf = new com.android.dazhihui.a.b.f();
    localf.c(com.android.dazhihui.a.f.ac);
    localf.a(new WisdomHostManager.2(paramWisdomCallBack));
    g.a().a(localf);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\WisdomHostManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */