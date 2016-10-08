package com.payeco.android.plugin.http.parse;

import android.text.TextUtils;
import com.payeco.android.plugin.http.objects.MerchantObject;
import com.payeco.android.plugin.http.objects.PluginObject;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class XmlTool
{
  public static String objectToXml(MerchantObject paramMerchantObject)
  {
    int i = 0;
    StringWriter localStringWriter = new StringWriter();
    for (;;)
    {
      try
      {
        localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(localStringWriter);
        localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(false));
        localObject1 = paramMerchantObject.getClass();
        arrayOfField = ((Class)localObject1).getDeclaredFields();
        localXmlSerializer.startTag("", "pomp");
        localObject1 = ((Class)localObject1).getDeclaredField("application");
        ((Field)localObject1).setAccessible(true);
        localXmlSerializer.attribute(null, "application", String.valueOf(((Field)localObject1).get(paramMerchantObject)));
        int j = arrayOfField.length;
        if (i < j) {
          continue;
        }
        localXmlSerializer.endTag("", "pomp");
        localXmlSerializer.endDocument();
      }
      catch (Exception paramMerchantObject)
      {
        XmlSerializer localXmlSerializer;
        Object localObject1;
        Field[] arrayOfField;
        Object localObject2;
        paramMerchantObject.printStackTrace();
        continue;
      }
      return localStringWriter.toString();
      localObject2 = arrayOfField[i];
      ((Field)localObject2).setAccessible(true);
      localObject1 = ((Field)localObject2).getName();
      if (!((String)localObject1).equals("application"))
      {
        localObject2 = ((Field)localObject2).get(paramMerchantObject);
        if (localObject2 != null)
        {
          localObject2 = String.valueOf(localObject2);
          localXmlSerializer.startTag("", (String)localObject1);
          localXmlSerializer.text((String)localObject2);
          localXmlSerializer.endTag("", (String)localObject1);
        }
      }
      i += 1;
    }
  }
  
  public static String objectToXml(PluginObject paramPluginObject)
  {
    int i = 0;
    StringWriter localStringWriter = new StringWriter();
    for (;;)
    {
      try
      {
        localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(localStringWriter);
        localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(false));
        arrayOfField = paramPluginObject.getClass().getDeclaredFields();
        localXmlSerializer.startTag("", "pomp");
        if (!TextUtils.isEmpty(paramPluginObject.getApplication())) {
          localXmlSerializer.attribute(null, "application", paramPluginObject.getApplication());
        }
        if (!TextUtils.isEmpty(paramPluginObject.getVersion())) {
          localXmlSerializer.attribute(null, "version", paramPluginObject.getVersion());
        }
        if (!TextUtils.isEmpty(paramPluginObject.getTerminalModel())) {
          localXmlSerializer.attribute(null, "terminalModel", paramPluginObject.getTerminalModel());
        }
        if (!TextUtils.isEmpty(paramPluginObject.getTerminalOs())) {
          localXmlSerializer.attribute(null, "terminalOs", paramPluginObject.getTerminalOs());
        }
        if (!TextUtils.isEmpty(paramPluginObject.getPluginVersion())) {
          localXmlSerializer.attribute(null, "pluginVersion", paramPluginObject.getPluginVersion());
        }
        if (!TextUtils.isEmpty(paramPluginObject.getPluginSerialNo())) {
          localXmlSerializer.attribute(null, "pluginSerialNo", paramPluginObject.getPluginSerialNo());
        }
        if (!TextUtils.isEmpty(paramPluginObject.getTerminalPhysicalNo())) {
          localXmlSerializer.attribute(null, "terminalPhysicalNo", paramPluginObject.getTerminalPhysicalNo());
        }
        int j = arrayOfField.length;
        if (i < j) {
          continue;
        }
        localXmlSerializer.endTag("", "pomp");
        localXmlSerializer.endDocument();
      }
      catch (Exception paramPluginObject)
      {
        XmlSerializer localXmlSerializer;
        Field[] arrayOfField;
        Object localObject;
        String str;
        paramPluginObject.printStackTrace();
        continue;
      }
      return localStringWriter.toString();
      localObject = arrayOfField[i];
      ((Field)localObject).setAccessible(true);
      str = ((Field)localObject).getName();
      localObject = ((Field)localObject).get(paramPluginObject);
      if (localObject != null)
      {
        localXmlSerializer.startTag("", str);
        localXmlSerializer.cdsect(String.valueOf(localObject));
        localXmlSerializer.endTag("", str);
      }
      i += 1;
    }
  }
  
  public static Object xmlToObject(String paramString, Class paramClass, int paramInt)
  {
    Object localObject = null;
    if (paramString != null) {}
    try
    {
      paramString = new ByteArrayInputStream(paramString.getBytes());
      localObject = new PluginXmlParseService().getByParseXml(paramString, paramClass, paramInt);
      return localObject;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\XmlTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */