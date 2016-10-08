package com.payeco.android.plugin.http.parse;

import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class a
  extends DefaultHandler
{
  private Map bV;
  private String bW;
  private String bX;
  private StringBuffer bY = new StringBuffer();
  
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
    if ((paramString1 != null) && (!paramString1.equals("\n\t\t\t")))
    {
      if (!"frontPubKey".equals(this.bX)) {
        break label140;
      }
      if ("oneline".equals(this.bW)) {
        this.bV.put("frontPubKeyBase64", paramString1);
      }
      if ("n".equals(this.bW)) {
        this.bV.put("frontModulus", paramString1);
      }
      if ("e".equals(this.bW)) {
        this.bV.put("frontPublicExponent", paramString1);
      }
    }
    for (;;)
    {
      if (("frontPubKey".equals(paramString2)) || ("upopPubKey".equals(paramString2))) {
        this.bX = null;
      }
      this.bW = null;
      return;
      label140:
      if ("upopPubKey".equals(this.bX))
      {
        if ("oneline".equals(this.bW)) {
          this.bV.put("upopPubKeyBase64", paramString1);
        }
        if ("n".equals(this.bW)) {
          this.bV.put("upopModulus", paramString1);
        }
        if ("e".equals(this.bW)) {
          this.bV.put("upopPublicExponent", paramString1);
        }
      }
    }
  }
  
  public final Map k()
  {
    return this.bV;
  }
  
  public final void startDocument()
  {
    super.startDocument();
    this.bV = new HashMap();
  }
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.bY.delete(0, this.bY.length());
    if ("config".equals(paramString3)) {
      this.bV.put("configVersion", paramAttributes.getValue("version"));
    }
    for (;;)
    {
      this.bW = paramString2;
      return;
      if ("frontPubKey".equals(paramString3))
      {
        this.bX = "frontPubKey";
        this.bV.put("frontPubKeyversion", paramAttributes.getValue("version"));
      }
      else if ("upopPubKey".equals(paramString3))
      {
        this.bX = "upopPubKey";
        this.bV.put("upopPubKeyversion", paramAttributes.getValue("version"));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */