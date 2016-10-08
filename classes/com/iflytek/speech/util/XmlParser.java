package com.iflytek.speech.util;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParser
{
  public static String parseNluResult(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      Element localElement1 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(paramString.getBytes())).getDocumentElement();
      Element localElement2 = (Element)localElement1.getElementsByTagName("rawtext").item(0);
      localStringBuffer.append("【识别结果】" + localElement2.getFirstChild().getNodeValue());
      localStringBuffer.append("\n");
      localElement1 = (Element)localElement1.getElementsByTagName("result").item(0);
      localElement2 = (Element)localElement1.getElementsByTagName("focus").item(0);
      localStringBuffer.append("【FOCUS】" + localElement2.getFirstChild().getNodeValue());
      localStringBuffer.append("\n");
      localElement1 = (Element)((Element)localElement1.getElementsByTagName("action").item(0)).getElementsByTagName("operation").item(0);
      localStringBuffer.append("【ACTION】" + localElement1.getFirstChild().getNodeValue());
      localStringBuffer.append("\n");
      localStringBuffer.append("【ALL】" + paramString);
      return localStringBuffer.toString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\util\XmlParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */