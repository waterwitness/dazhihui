package com.payeco.android.plugin.util;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.payeco.android.plugin.http.objects.RiskControl;
import com.payeco.android.plugin.http.parse.XmlParseRiskControlService;
import com.payeco.android.plugin.http.parse.XmlParseService;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class NewRiskControlTool
{
  public static final String REQUIRED_N0 = "false";
  public static final String REQUIRED_YES = "true";
  protected static ArrayAdapter cityAdapter;
  protected static int provinceId;
  
  private static int a(Context paramContext, String paramString)
  {
    return paramContext.getResources().getIdentifier(paramString, "array", paramContext.getPackageName());
  }
  
  public static void initBankAddrSpinner(Context paramContext, Spinner paramSpinner1, Spinner paramSpinner2)
  {
    int i = a(paramContext, "guangdong_province_item");
    int j = a(paramContext, "beijin_province_item");
    int k = a(paramContext, "tianjin_province_item");
    int m = a(paramContext, "heibei_province_item");
    int n = a(paramContext, "shanxi1_province_item");
    int i1 = a(paramContext, "neimenggu_province_item");
    int i2 = a(paramContext, "liaoning_province_item");
    int i3 = a(paramContext, "jilin_province_item");
    int i4 = a(paramContext, "heilongjiang_province_item");
    int i5 = a(paramContext, "shanghai_province_item");
    int i6 = a(paramContext, "jiangsu_province_item");
    int i7 = a(paramContext, "zhejiang_province_item");
    int i8 = a(paramContext, "anhui_province_item");
    int i9 = a(paramContext, "fujian_province_item");
    int i10 = a(paramContext, "jiangxi_province_item");
    int i11 = a(paramContext, "shandong_province_item");
    int i12 = a(paramContext, "henan_province_item");
    int i13 = a(paramContext, "hubei_province_item");
    int i14 = a(paramContext, "hunan_province_item");
    int i15 = a(paramContext, "guangxi_province_item");
    int i16 = a(paramContext, "hainan_province_item");
    int i17 = a(paramContext, "chongqing_province_item");
    int i18 = a(paramContext, "sichuan_province_item");
    int i19 = a(paramContext, "guizhou_province_item");
    int i20 = a(paramContext, "yunnan_province_item");
    int i21 = a(paramContext, "xizang_province_item");
    int i22 = a(paramContext, "shanxi2_province_item");
    int i23 = a(paramContext, "gansu_province_item");
    int i24 = a(paramContext, "qinghai_province_item");
    int i25 = a(paramContext, "linxia_province_item");
    int i26 = a(paramContext, "xinjiang_province_item");
    int i27 = a(paramContext, "hongkong_province_item");
    int i28 = a(paramContext, "aomen_province_item");
    int i29 = a(paramContext, "taiwan_province_item");
    String[] arrayOfString = paramContext.getResources().getStringArray(a(paramContext, "province_item"));
    ArrayAdapter localArrayAdapter = ArrayAdapter.createFromResource(paramContext, a(paramContext, "province_item"), 17367048);
    localArrayAdapter.setDropDownViewResource(17367049);
    paramSpinner1.setAdapter(localArrayAdapter);
    paramSpinner1.setOnItemSelectedListener(new c(paramSpinner1, paramContext, paramSpinner2, new int[] { i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29 }, arrayOfString));
  }
  
  public static void initSpinner(Context paramContext, Spinner paramSpinner, RiskControl paramRiskControl)
  {
    String[] arrayOfString2 = paramRiskControl.getLabel().split("\\|");
    String[] arrayOfString1 = paramRiskControl.getValue().split("\\|");
    paramSpinner.setPrompt(paramRiskControl.getTips());
    paramContext = new ArrayAdapter(paramContext, 17367048, arrayOfString2);
    paramContext.setDropDownViewResource(17367049);
    paramSpinner.setAdapter(paramContext);
    paramSpinner.setOnItemSelectedListener(new d(arrayOfString1, paramSpinner));
  }
  
  public static String parseRiskControlToXml(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    StringWriter localStringWriter = new StringWriter();
    for (;;)
    {
      try
      {
        localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(localStringWriter);
        localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(false));
        localXmlSerializer.startTag("", "list");
        localXmlSerializer.attribute(null, "type", "dnaRiskControl");
        arrayOfField = RiskControl.class.getDeclaredFields();
        paramList = paramList.iterator();
        if (paramList.hasNext()) {
          continue;
        }
        localXmlSerializer.endTag("", "list");
        localXmlSerializer.endDocument();
      }
      catch (Exception paramList)
      {
        XmlSerializer localXmlSerializer;
        Field[] arrayOfField;
        RiskControl localRiskControl;
        int j;
        int i;
        paramList.printStackTrace();
        continue;
        Field localField = arrayOfField[i];
        localField.setAccessible(true);
        String str = localField.getName();
        if (str.equals("itemId")) {
          continue;
        }
        localXmlSerializer.startTag("", str);
        localXmlSerializer.text(String.valueOf(localField.get(localRiskControl)));
        localXmlSerializer.endTag("", localField.getName());
        i += 1;
        continue;
      }
      return localStringWriter.toString();
      localRiskControl = (RiskControl)paramList.next();
      localXmlSerializer.startTag("", "item");
      localXmlSerializer.attribute(null, "itemId", localRiskControl.getItemId());
      j = arrayOfField.length;
      i = 0;
      if (i < j) {
        continue;
      }
      localXmlSerializer.endTag("", "item");
    }
  }
  
  public static String parseRiskControlToXml(Map paramMap, boolean paramBoolean)
  {
    if ((paramMap == null) || (paramMap.isEmpty())) {
      return null;
    }
    StringWriter localStringWriter = new StringWriter();
    for (;;)
    {
      try
      {
        localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(localStringWriter);
        localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(false));
        localXmlSerializer.startTag("", "list");
        localXmlSerializer.attribute(null, "type", "dnaRiskControl");
        arrayOfField = RiskControl.class.getDeclaredFields();
        localIterator = paramMap.keySet().iterator();
        if (localIterator.hasNext()) {
          continue;
        }
        localXmlSerializer.endTag("", "list");
        localXmlSerializer.endDocument();
      }
      catch (Exception paramMap)
      {
        XmlSerializer localXmlSerializer;
        Field[] arrayOfField;
        Iterator localIterator;
        RiskControl localRiskControl;
        int j;
        int i;
        paramMap.printStackTrace();
        continue;
        Field localField = arrayOfField[i];
        localField.setAccessible(true);
        String str = localField.getName();
        if (str.equals("itemId")) {
          continue;
        }
        localXmlSerializer.startTag("", str);
        localXmlSerializer.text(String.valueOf(localField.get(localRiskControl)));
        localXmlSerializer.endTag("", localField.getName());
        i += 1;
        continue;
      }
      return localStringWriter.toString();
      localRiskControl = (RiskControl)paramMap.get((String)localIterator.next());
      localXmlSerializer.startTag("", "item");
      localXmlSerializer.attribute(null, "itemId", localRiskControl.getItemId());
      j = arrayOfField.length;
      i = 0;
      if (i < j) {
        continue;
      }
      localXmlSerializer.endTag("", "item");
    }
  }
  
  public static List parseXmlToRiskControl(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = new ByteArrayInputStream(paramString.getBytes());
    XmlParseRiskControlService localXmlParseRiskControlService = new XmlParseRiskControlService();
    try
    {
      paramString = (List)localXmlParseRiskControlService.getByParseXml(paramString, RiskControl.class);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = null;
      }
    }
  }
  
  public static Map parseXmlToRiskControl(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    paramString = new ByteArrayInputStream(paramString.getBytes());
    Object localObject = new XmlParseRiskControlService();
    try
    {
      localObject = (List)((XmlParseService)localObject).getByParseXml(paramString, RiskControl.class);
      if (localObject == null) {
        break label107;
      }
      paramString = new HashMap();
      try
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          RiskControl localRiskControl = (RiskControl)((Iterator)localObject).next();
          paramString.put(localRiskControl.getItemId(), localRiskControl);
        }
        localException1.printStackTrace();
      }
      catch (Exception localException1) {}
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        paramString = null;
      }
      label107:
      paramString = null;
    }
    return paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\NewRiskControlTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */