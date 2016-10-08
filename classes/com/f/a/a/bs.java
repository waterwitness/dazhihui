package com.f.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import com.unionpay.upomp.lthj.plugin.model.HeadData;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;
import com.unionpay.upomp.lthj.plugin.ui.UIResponseListener;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class bs
{
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext)
  {
    ba localba = new ba(8207);
    localba.a(HeadData.createHeadData("GetPanBankBindList.Req", paramContext));
    localba.a(u.a().A.toString());
    try
    {
      br.a().a(localba, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext, String paramString)
  {
    n localn = new n(8204);
    localn.a(HeadData.createHeadData("DefaultPanSet.Req", paramContext));
    localn.a(u.a().A.toString());
    localn.b(u.a().B.toString());
    localn.c(paramString);
    try
    {
      br.a().a(localn, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, ax paramax, String paramString2)
  {
    bf localbf = new bf(8229);
    localbf.a(HeadData.createHeadData("PanBankBindExpress.Req", paramContext));
    localbf.a(paramString1);
    localbf.b(u.a().i);
    localbf.c(u.a().l);
    localbf.d(u.a().m);
    localbf.e(u.a().w.toString());
    localbf.f(u.a().z.toString());
    u.a().z.setLength(0);
    if (!TextUtils.isEmpty(paramString2)) {
      localbf.h(paramString2);
    }
    if ((paramax != null) && (paramax.b() != null) && (paramax.a() != null))
    {
      paramString1 = new StringBuffer();
      paramString1.append(new String(JniMethod.getJniMethod().decryptConfig(paramax.b(), paramax.b().length)));
      paramString1.append(new String(JniMethod.getJniMethod().decryptConfig(paramax.a(), paramax.a().length)));
      localbf.g(paramString1.toString());
      paramString1.delete(0, paramString1.length());
    }
    try
    {
      br.a().a(localbf, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2)
  {
    eg localeg = new eg(8195);
    localeg.a(HeadData.createHeadData("UserResetPwd.Req", paramContext));
    localeg.a(paramString1);
    localeg.c(paramString2);
    localeg.b(u.a().e.d.toString());
    u.a().e.e.setLength(0);
    try
    {
      br.a().a(localeg, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2, String paramString3, ax paramax, String paramString4, boolean paramBoolean)
  {
    em localem = new em(8203);
    localem.a(HeadData.createHeadData("PanBankBind.Req", paramContext));
    localem.a(u.a().A.toString());
    localem.d(paramString3);
    localem.e(u.a().z.toString());
    u.a().z.setLength(0);
    localem.b(paramString1);
    localem.c(paramString2);
    if (paramString4 != null) {
      localem.g(paramString4);
    }
    if ((paramax != null) && (paramax.b() != null) && (paramax.a() != null))
    {
      paramString1 = new StringBuffer();
      paramString1.append(new String(JniMethod.getJniMethod().decryptConfig(paramax.b(), paramax.b().length)));
      paramString1.append(new String(JniMethod.getJniMethod().decryptConfig(paramax.a(), paramax.a().length)));
      localem.f(paramString1.toString());
      paramString1.delete(0, paramString1.length());
    }
    if (paramBoolean) {
      localem.h("1");
    }
    for (;;)
    {
      try
      {
        br.a().a(localem, paramUIResponseListener, paramContext, true, true);
        return;
      }
      catch (Exception paramUIResponseListener)
      {
        paramUIResponseListener.printStackTrace();
      }
      localem.h("0");
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ah localah = new ah(8221);
    localah.a(HeadData.createHeadData("GetSecureQuestion.Req", paramContext));
    localah.a(paramString1);
    localah.c(paramString2);
    localah.b(paramString3);
    localah.d(paramString4);
    try
    {
      br.a().a(localah, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    cm localcm = new cm(8224);
    localcm.a(HeadData.createHeadData("GetBankInfo.Req", paramContext));
    if (paramBoolean) {
      localcm.c(u.a().k);
    }
    localcm.a(paramString1);
    localcm.b(paramString2);
    try
    {
      br.a().a(localcm, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(UIResponseListener paramUIResponseListener, ProgressBar paramProgressBar)
  {
    if (paramProgressBar == null) {
      return;
    }
    paramProgressBar.setVisibility(0);
    el localel = new el(8201);
    localel.a(HeadData.createHeadData("GetVerifyCode.Req", paramProgressBar.getContext()));
    try
    {
      br.a().a(localel, paramUIResponseListener, paramProgressBar.getContext(), false, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void a(String paramString, UIResponseListener paramUIResponseListener, Context paramContext)
  {
    ej localej = new ej(8202);
    localej.a(HeadData.createHeadData("GetBankList.Req", paramContext));
    localej.a(paramString);
    try
    {
      br.a().a(localej, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, UIResponseListener paramUIResponseListener, Context paramContext, Button paramButton)
  {
    if (!cd.a(paramContext, paramString1)) {
      return;
    }
    paramButton.setText(bp.dl());
    paramButton.setEnabled(false);
    paramButton = new ei(8200);
    paramButton.b(paramString2);
    paramButton.a(HeadData.createHeadData("GetMobileMac.Req", paramContext));
    paramButton.a(paramString1);
    paramButton.w(paramInt + "");
    try
    {
      br.a().a(paramButton, paramUIResponseListener, paramContext, false, true);
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public static void b(UIResponseListener paramUIResponseListener, Context paramContext, String paramString)
  {
    ek localek = new ek(8196);
    localek.a(HeadData.createHeadData("UserUpdatePwd.Req", paramContext));
    localek.a(u.a().A.toString());
    localek.d(u.a().B.toString());
    localek.e(paramString);
    localek.b(u.a().e.c.toString());
    localek.c(u.a().e.d.toString());
    u.a().e.e.setLength(0);
    try
    {
      br.a().a(localek, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void b(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2)
  {
    dv localdv = new dv(8206);
    localdv.a(HeadData.createHeadData("PanDelete.Req", paramContext));
    localdv.a(u.a().A.toString());
    localdv.b(u.a().B.toString());
    localdv.d(paramString1);
    localdv.c(paramString2);
    try
    {
      br.a().a(localdv, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void b(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    bx localbx = new bx(8225);
    localbx.a(HeadData.createHeadData("UserRegisterExpress.Req", paramContext));
    localbx.a(paramString1);
    localbx.e(paramString2);
    localbx.b(u.a().e.d.toString());
    localbx.f(paramString3);
    localbx.g(paramString4);
    localbx.c(u.a().i);
    localbx.d(u.a().l);
    localbx.h(u.a().m);
    try
    {
      br.a().a(localbx, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void c(UIResponseListener paramUIResponseListener, Context paramContext, String paramString)
  {
    t localt = new t(8228);
    localt.a(HeadData.createHeadData("GetBanksService.Req", paramContext));
    localt.a(paramString);
    localt = null;
    try
    {
      paramContext = by.a(paramContext, paramString);
      paramString = new t(8228);
      paramString.a(paramContext);
      paramUIResponseListener.responseCallBack(paramString);
      return;
    }
    catch (XmlPullParserException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramContext = localt;
      }
    }
    catch (IOException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramContext = localt;
      }
    }
  }
  
  public static void c(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2)
  {
    w localw = new w(8197);
    localw.a(HeadData.createHeadData("UpdateMobileNumber.Req", paramContext));
    localw.a(u.a().A.toString());
    localw.b(u.a().B.toString());
    localw.c(paramString1);
    localw.d(paramString2);
    localw.e(u.a().C.toString());
    try
    {
      br.a().a(localw, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
  
  public static void d(UIResponseListener paramUIResponseListener, Context paramContext, String paramString1, String paramString2)
  {
    bt localbt = new bt(8194);
    localbt.a(HeadData.createHeadData("UserLogin.Req", paramContext));
    localbt.a(paramString1);
    localbt.b(u.a().C.toString());
    localbt.c(paramString2);
    try
    {
      br.a().a(localbt, paramUIResponseListener, paramContext, true, true);
      return;
    }
    catch (Exception paramUIResponseListener)
    {
      paramUIResponseListener.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */