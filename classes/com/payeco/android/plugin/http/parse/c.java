package com.payeco.android.plugin.http.parse;

import android.util.Log;
import com.payeco.android.plugin.http.objects.RiskControl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class c
  extends DefaultHandler
{
  private String bW;
  private StringBuffer bY = new StringBuffer();
  private Class ca;
  private List cf;
  private RiskControl cg;
  
  public c(Class paramClass)
  {
    this.ca = paramClass;
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
    int j;
    int i;
    if ((paramString1 != null) && (!paramString1.equals("\n\t\t\t")))
    {
      paramString2 = this.ca.getDeclaredFields();
      j = paramString2.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {}
      for (;;)
      {
        if ("item".equals(paramString3))
        {
          this.cf.add(this.cg);
          this.cg = null;
        }
        this.bW = null;
        return;
        Object localObject = paramString2[i];
        ((Field)localObject).setAccessible(true);
        if (!((Field)localObject).getName().equals(this.bW)) {
          break;
        }
        try
        {
          ((Field)localObject).set(this.cg, paramString1);
          this.bW = null;
        }
        catch (Exception paramString1)
        {
          Log.i("SaxHandler", "xml analysis fail");
          paramString1.printStackTrace();
        }
      }
      i += 1;
    }
  }
  
  public final void startDocument()
  {
    super.startDocument();
  }
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.bY.delete(0, this.bY.length());
    try
    {
      if ("list".equals(paramString3)) {
        this.cf = new ArrayList();
      }
      for (;;)
      {
        this.bW = paramString3;
        return;
        if ("item".equals(paramString3))
        {
          this.cg = new RiskControl();
          this.cg.setItemId(paramAttributes.getValue("itemId"));
        }
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        Log.i("SaxHandler", "xml analysis fail");
        paramString1.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */