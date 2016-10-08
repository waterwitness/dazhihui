package com.payeco.android.plugin.http.parse;

import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XmlParseRiskControlService
  extends XmlParseService
{
  public Object getByParseXml(InputStream paramInputStream, Class paramClass)
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    paramClass = new c(paramClass);
    localSAXParser.parse(paramInputStream, paramClass);
    paramInputStream.close();
    return c.a(paramClass);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\XmlParseRiskControlService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */