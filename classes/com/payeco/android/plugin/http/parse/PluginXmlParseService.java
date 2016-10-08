package com.payeco.android.plugin.http.parse;

import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class PluginXmlParseService
  extends XmlParseService
{
  public static final int MERCHANT_OBJECT = 1;
  public static final int PLUGIN_OBJECT = 0;
  
  public Object getByParseXml(InputStream paramInputStream, Class paramClass, int paramInt)
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    paramClass = new b(paramClass, paramInt);
    localSAXParser.parse(paramInputStream, paramClass);
    paramInputStream.close();
    return b.a(paramClass);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\PluginXmlParseService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */