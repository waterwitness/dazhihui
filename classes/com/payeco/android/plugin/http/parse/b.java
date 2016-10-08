package com.payeco.android.plugin.http.parse;

import android.util.Log;
import com.payeco.android.plugin.http.objects.MerchantObject;
import com.payeco.android.plugin.http.objects.PluginObject;
import java.lang.reflect.Field;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class b
  extends DefaultHandler
{
  private String bW;
  private StringBuffer bY = new StringBuffer();
  private int bZ;
  private Class ca;
  private PluginObject cb;
  private PluginObject cc;
  private MerchantObject cd;
  private MerchantObject ce;
  
  public b(Class paramClass, int paramInt)
  {
    this.ca = paramClass;
    this.bZ = paramInt;
  }
  
  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.bW != null)
    {
      paramArrayOfChar = new String(paramArrayOfChar, paramInt1, paramInt2);
      this.bY.append(paramArrayOfChar);
    }
  }
  
  public final void endDocument()
  {
    super.endDocument();
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = this.bY.toString().trim();
    int i;
    if ((paramString1 != null) && (!paramString1.equals("\n\t\t\t")))
    {
      paramString2 = this.ca.getDeclaredFields();
      int j = paramString2.length;
      i = 0;
      if (i < j) {}
    }
    else if ("pomp".equals(paramString3))
    {
      if (this.bZ != 0) {
        break label179;
      }
      this.cb = this.cc;
      this.cc = null;
    }
    for (;;)
    {
      this.bW = null;
      return;
      Object localObject = paramString2[i];
      ((Field)localObject).setAccessible(true);
      if (((Field)localObject).getName().equals(this.bW)) {
        for (;;)
        {
          try
          {
            if (this.bZ != 0) {
              break label149;
            }
            ((Field)localObject).set(this.cc, paramString1);
            this.bW = null;
          }
          catch (Exception paramString1)
          {
            Log.e("PandaPaySaxHandler", "xml analysis fail");
            paramString1.printStackTrace();
          }
          break;
          label149:
          if (this.bZ == 1) {
            ((Field)localObject).set(this.ce, paramString1);
          }
        }
      }
      i += 1;
      break;
      label179:
      if (this.bZ == 1)
      {
        this.cd = this.ce;
        this.ce = null;
      }
    }
  }
  
  public final void startDocument() {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.bY.delete(0, this.bY.length());
    if ("pomp".equals(paramString3)) {}
    try
    {
      if (this.bZ == 0) {
        this.cc = ((PluginObject)this.ca.newInstance());
      }
      for (;;)
      {
        this.bW = paramString3;
        return;
        if (this.bZ == 1) {
          this.ce = ((MerchantObject)this.ca.newInstance());
        }
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        Log.e("PandaPaySaxHandler", "xml analysis fail");
        paramString1.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */