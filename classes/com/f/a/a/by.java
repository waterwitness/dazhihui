package com.f.a.a;

import android.content.Context;
import android.util.Xml;
import com.unionpay.upomp.lthj.plugin.model.GetBankService;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;
import java.io.ByteArrayInputStream;
import org.xmlpull.v1.XmlPullParser;

public class by
{
  public static GetBankService a(Context paramContext, String paramString)
  {
    int i;
    StringBuffer localStringBuffer1;
    StringBuffer localStringBuffer2;
    StringBuffer localStringBuffer3;
    GetBankService localGetBankService;
    if ("2".equals(paramString))
    {
      i = bp.ex();
      paramContext = new m(paramContext).a(i);
      paramString = new ByteArrayInputStream(JniMethod.getJniMethod().decryptConfig(paramContext, paramContext.length));
      paramContext = Xml.newPullParser();
      paramContext.setInput(paramString, "UTF-8");
      i = paramContext.getEventType();
      paramString = new StringBuffer();
      localStringBuffer1 = new StringBuffer();
      localStringBuffer2 = new StringBuffer();
      localStringBuffer3 = new StringBuffer();
      localGetBankService = new GetBankService();
      label108:
      if (i == 1) {
        break label311;
      }
      switch (i)
      {
      }
    }
    for (;;)
    {
      i = paramContext.next();
      break label108;
      i = bp.ew();
      break;
      String str = paramContext.getName();
      if (!"panItem".equalsIgnoreCase(str)) {
        if ("panBank".equalsIgnoreCase(str))
        {
          paramString.append("|");
          paramString.append(paramContext.nextText());
        }
        else if ("panBankId".equalsIgnoreCase(str))
        {
          localStringBuffer1.append("|");
          localStringBuffer1.append(paramContext.nextText());
        }
        else if ("creditCard".equalsIgnoreCase(str))
        {
          localStringBuffer2.append("|");
          localStringBuffer2.append(paramContext.nextText());
        }
        else if ("debitCard".equalsIgnoreCase(str))
        {
          localStringBuffer3.append("|");
          localStringBuffer3.append(paramContext.nextText());
        }
      }
    }
    label311:
    paramString.deleteCharAt(0);
    localStringBuffer1.deleteCharAt(0);
    localStringBuffer2.deleteCharAt(0);
    localStringBuffer3.deleteCharAt(0);
    localGetBankService.panBank = paramString.toString();
    localGetBankService.panBankId = paramString.toString();
    localGetBankService.creditCard = localStringBuffer2.toString();
    localGetBankService.debitCard = localStringBuffer3.toString();
    localGetBankService.respCode = "0000";
    return localGetBankService;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */