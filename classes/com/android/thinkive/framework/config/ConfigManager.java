package com.android.thinkive.framework.config;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.android.thinkive.framework.module.ModuleManager;
import com.android.thinkive.framework.network.socket.SocketType;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.RandomUtil;
import com.android.thinkive.framework.util.ResourceUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConfigManager
{
  private static ConfigManager sInstance;
  private QuotationConfigBean mAQuotationConfigBean = new QuotationConfigBean();
  private ArrayList<AddressConfigBean> mAddressConfigInfo = new ArrayList();
  private QuotationConfigBean mBFConfigBean = new QuotationConfigBean();
  private Context mContext;
  private QuotationConfigBean mHKQuotationConfigBean = new QuotationConfigBean();
  private ArrayList<ModuleConfigBean> mModuleConfigInfo = new ArrayList();
  private ModuleManager mModuleManager = ModuleManager.getInstance();
  private ArrayList<RequestQueueBean> mRequestQueueConfigInfo = new ArrayList();
  private ArrayList<SystemConfigBean> mSystemConfigInfo = new ArrayList();
  
  private void clear()
  {
    Log.e("clear !!!!!!!!!!!!!!");
    this.mModuleConfigInfo.clear();
    this.mAddressConfigInfo.clear();
    this.mSystemConfigInfo.clear();
    this.mRequestQueueConfigInfo.clear();
  }
  
  private ArrayList<String> getAddressList(String paramString)
  {
    paramString = paramString.split("\\|");
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i >= paramString.length) {
        return localArrayList;
      }
      localArrayList.add(paramString[i]);
      i += 1;
    }
  }
  
  public static ConfigManager getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new ConfigManager();
      }
      ConfigManager localConfigManager = sInstance;
      return localConfigManager;
    }
    finally {}
  }
  
  @Deprecated
  public static ConfigManager getInstance(Context paramContext)
  {
    try
    {
      if (sInstance == null) {
        sInstance = new ConfigManager();
      }
      paramContext = sInstance;
      return paramContext;
    }
    finally {}
  }
  
  private void parseConfigurationXmlFile()
  {
    localAddressConfigBean = null;
    int i = ResourceUtil.getResourceID(this.mContext, "xml", "configuration");
    if (i <= 0)
    {
      Log.d("xmlParser = null !!!,please check the configuration.xml file");
      return;
    }
    localXmlResourceParser = this.mContext.getResources().getXml(i);
    try
    {
      i = localXmlResourceParser.getEventType();
      localModuleConfigBean = null;
      localSystemConfigBean = null;
      Object localObject = null;
      if (i != 1) {
        break label74;
      }
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      for (;;)
      {
        localXmlPullParserException.printStackTrace();
        continue;
        localAddressConfigBean.setTimeout(Integer.parseInt(str));
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        ModuleConfigBean localModuleConfigBean;
        SystemConfigBean localSystemConfigBean;
        String str;
        localIOException.printStackTrace();
        continue;
        localAddressConfigBean.setRetry(Integer.parseInt(str));
        continue;
        localAddressConfigBean.setMethod(str);
        continue;
        if ("module".equals(str))
        {
          localModuleConfigBean = new ModuleConfigBean();
          localModuleConfigBean.setModuleName(localXmlResourceParser.getAttributeValue(null, "name"));
          localModuleConfigBean.setModuleClassName(localXmlResourceParser.getAttributeValue(null, "class"));
          localModuleConfigBean.setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        }
        else if ("requestQueue".equals(str))
        {
          RequestQueueBean localRequestQueueBean = new RequestQueueBean();
          localRequestQueueBean.setName(localXmlResourceParser.getAttributeValue(null, "name"));
          localRequestQueueBean.setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          str = localXmlResourceParser.getAttributeValue(null, "threadCount");
          if (!TextUtils.isEmpty(str)) {
            localRequestQueueBean.setThreadCount(Integer.parseInt(str));
          }
          localRequestQueueBean.setValue(getAddressList(localXmlResourceParser.getAttributeValue(null, "value")));
          continue;
          str = localXmlResourceParser.getName();
          if ("item".equals(str)) {
            this.mSystemConfigInfo.add(localSystemConfigBean);
          } else if ("address".equals(str)) {
            this.mAddressConfigInfo.add(localAddressConfigBean);
          } else if ("module".equals(str)) {
            this.mModuleConfigInfo.add(localModuleConfigBean);
          } else if ("requestQueue".equals(str)) {
            this.mRequestQueueConfigInfo.add(localRequestQueueBean);
          }
        }
      }
    }
    this.mModuleManager.setModuleConfigInfo(this.mModuleConfigInfo);
    return;
    switch (i)
    {
    case 1: 
    default: 
    case 2: 
      for (;;)
      {
        label74:
        i = localXmlResourceParser.next();
        break;
        str = localXmlResourceParser.getName();
        if (!"item".equals(str)) {
          break label192;
        }
        localSystemConfigBean = new SystemConfigBean();
        localSystemConfigBean.setName(localXmlResourceParser.getAttributeValue(null, "name"));
        localSystemConfigBean.setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        localSystemConfigBean.setValue(localXmlResourceParser.getAttributeValue(null, "value"));
      }
      label192:
      if ("address".equals(str))
      {
        localAddressConfigBean = new AddressConfigBean();
        localAddressConfigBean.setName(localXmlResourceParser.getAttributeValue(null, "name"));
        localAddressConfigBean.setRoute(Boolean.parseBoolean(localXmlResourceParser.getAttributeValue(null, "route")));
        localAddressConfigBean.setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        localAddressConfigBean.setValue(getAddressList(localXmlResourceParser.getAttributeValue(null, "value")));
        if (localAddressConfigBean.getValue().size() > 0)
        {
          i = RandomUtil.getRandom(localAddressConfigBean.getValue().size());
          localAddressConfigBean.setPriorityValue((String)localAddressConfigBean.getValue().get(i));
        }
        for (;;)
        {
          str = localXmlResourceParser.getAttributeValue(null, "timeout");
          if ((str != null) && (!TextUtils.isEmpty(str))) {
            break label459;
          }
          localAddressConfigBean.setTimeout(-1);
          str = localXmlResourceParser.getAttributeValue(null, "retry");
          if ((str != null) && (!TextUtils.isEmpty(str))) {
            break label479;
          }
          localAddressConfigBean.setRetry(-1);
          str = localXmlResourceParser.getAttributeValue(null, "method");
          if (!TextUtils.isEmpty(str)) {
            break label491;
          }
          localAddressConfigBean.setMethod("post");
          localAddressConfigBean.setSpeedPath(localXmlResourceParser.getAttributeValue(null, "speedPath"));
          localAddressConfigBean.setCertificatePath(localXmlResourceParser.getAttributeValue(null, "certificatePath"));
          localAddressConfigBean.setSocketType(localXmlResourceParser.getAttributeValue(null, "socketType"));
          break;
          localAddressConfigBean.setPriorityValue("");
        }
      }
      break;
    }
  }
  
  private void parseEnvXmlFile(String paramString)
  {
    String str = null;
    int i = ResourceUtil.getResourceID(this.mContext, "xml", paramString);
    if (i <= 0)
    {
      Log.d("xmlParser = null !!!,please check the " + paramString + " file");
      return;
    }
    XmlResourceParser localXmlResourceParser = this.mContext.getResources().getXml(i);
    for (;;)
    {
      try
      {
        i = localXmlResourceParser.getEventType();
      }
      catch (XmlPullParserException paramString)
      {
        paramString.printStackTrace();
        return;
        paramString.setTimeout(Integer.parseInt(str));
        continue;
      }
      catch (IOException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      i = localXmlResourceParser.next();
      str = paramString;
      break label402;
      paramString = str;
      if ("address".equals(localXmlResourceParser.getName()))
      {
        paramString = new AddressConfigBean();
        paramString.setName(localXmlResourceParser.getAttributeValue(null, "name"));
        paramString.setRoute(Boolean.parseBoolean(localXmlResourceParser.getAttributeValue(null, "route")));
        paramString.setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        paramString.setValue(getAddressList(localXmlResourceParser.getAttributeValue(null, "value")));
        if (paramString.getValue().size() > 0)
        {
          i = RandomUtil.getRandom(paramString.getValue().size());
          paramString.setPriorityValue((String)paramString.getValue().get(i));
          str = localXmlResourceParser.getAttributeValue(null, "timeout");
          if ((str == null) || (TextUtils.isEmpty(str)))
          {
            paramString.setTimeout(-1);
            str = localXmlResourceParser.getAttributeValue(null, "retry");
            if ((str != null) && (!TextUtils.isEmpty(str))) {
              break label353;
            }
            paramString.setRetry(-1);
            str = localXmlResourceParser.getAttributeValue(null, "method");
            if (!TextUtils.isEmpty(str)) {
              break label364;
            }
            paramString.setMethod("post");
            paramString.setSpeedPath(localXmlResourceParser.getAttributeValue(null, "speedPath"));
            paramString.setCertificatePath(localXmlResourceParser.getAttributeValue(null, "certificatePath"));
            paramString.setSocketType(localXmlResourceParser.getAttributeValue(null, "socketType"));
          }
        }
        else
        {
          paramString.setPriorityValue("");
          continue;
        }
        label353:
        paramString.setRetry(Integer.parseInt(str));
        continue;
        label364:
        paramString.setMethod(str);
        continue;
        paramString = str;
        if ("address".equals(localXmlResourceParser.getName()))
        {
          this.mAddressConfigInfo.add(str);
          paramString = str;
          continue;
          label402:
          if (i == 1) {
            break;
          }
          paramString = str;
          switch (i)
          {
          }
          paramString = str;
        }
      }
    }
  }
  
  private void parseFuturesFunctionXmlFile()
  {
    Object localObject1 = null;
    int i = ResourceUtil.getResourceID(this.mContext, "xml", "futuresfunction");
    if (i <= 0)
    {
      Log.d("can't find futuresfunction.xml file in xml dir!!!,return");
      return;
    }
    XmlResourceParser localXmlResourceParser = this.mContext.getResources().getXml(i);
    for (;;)
    {
      Object localObject9;
      try
      {
        i = localXmlResourceParser.getEventType();
        localObject3 = null;
        localObject4 = null;
        localObject5 = null;
        localObject6 = null;
        localObject8 = null;
        localObject7 = null;
        localObject2 = null;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localXmlPullParserException.printStackTrace();
        return;
        if (!str.equals("function")) {
          break label454;
        }
        localObject15 = new FunctionBean();
        ((FunctionBean)localObject15).setByteFuncNo(localXmlResourceParser.getAttributeValue(null, "byteFuncNo"));
        ((FunctionBean)localObject15).setJsonFuncNo(localXmlResourceParser.getAttributeValue(null, "jsonFuncNo"));
        localObject8 = localXmlResourceParser.getAttributeValue(null, "mode");
        if (!TextUtils.isEmpty((CharSequence)localObject8)) {
          break label407;
        }
        ((FunctionBean)localObject15).setMode(Integer.parseInt("0"));
        localObject8 = localXmlResourceParser.getAttributeValue(null, "isStockIndex");
        if (TextUtils.isEmpty((CharSequence)localObject8)) {
          break label420;
        }
        ((FunctionBean)localObject15).setIsStockIndex(Boolean.parseBoolean((String)localObject8));
        localObject9 = localXmlPullParserException;
        localObject10 = localObject2;
        localObject11 = localObject3;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject14 = localObject6;
        localObject16 = localObject7;
        continue;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        return;
      }
      i = localXmlResourceParser.next();
      localObject1 = localObject9;
      Object localObject10;
      Object localObject2 = localObject10;
      Object localObject11;
      Object localObject3 = localObject11;
      Object localObject12;
      Object localObject4 = localObject12;
      Object localObject13;
      Object localObject5 = localObject13;
      Object localObject14;
      Object localObject6 = localObject14;
      Object localObject15;
      Object localObject8 = localObject15;
      Object localObject16;
      Object localObject7 = localObject16;
      break label1403;
      String str = localXmlResourceParser.getName();
      if (str.equals("field"))
      {
        localObject16 = new FieldBean();
        ((FieldBean)localObject16).setName(localXmlResourceParser.getAttributeValue(null, "name"));
        ((FieldBean)localObject16).setType(localXmlResourceParser.getAttributeValue(null, "type"));
        ((FieldBean)localObject16).setSerno(localXmlResourceParser.getAttributeValue(null, "serno"));
        ((FieldBean)localObject16).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        ((FieldBean)localObject16).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
        localObject9 = localObject1;
        localObject10 = localObject2;
        localObject11 = localObject3;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject14 = localObject6;
        localObject15 = localObject8;
      }
      else
      {
        label407:
        ((FunctionBean)localObject15).setMode(Integer.parseInt((String)localObject8));
        continue;
        label420:
        ((FunctionBean)localObject15).setIsStockIndex(false);
        localObject9 = localIOException;
        localObject10 = localObject2;
        localObject11 = localObject3;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject14 = localObject6;
        localObject16 = localObject7;
        continue;
        label454:
        if (str.equals("inputs"))
        {
          localObject11 = new ArrayList();
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("input"))
        {
          localObject14 = new FunctionBean.InputBean();
          ((FunctionBean.InputBean)localObject14).setByteName(localXmlResourceParser.getAttributeValue(null, "byteName"));
          ((FunctionBean.InputBean)localObject14).setJsonName(localXmlResourceParser.getAttributeValue(null, "jsonName"));
          ((FunctionBean.InputBean)localObject14).setDefaultValue(localXmlResourceParser.getAttributeValue(null, "defaultValue"));
          ((FunctionBean.InputBean)localObject14).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
          ((FunctionBean.InputBean)localObject14).setType(localXmlResourceParser.getAttributeValue(null, "type"));
          ((FunctionBean.InputBean)localObject14).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("outsets"))
        {
          localObject10 = new ArrayList();
          localObject9 = localIOException;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("outset"))
        {
          localObject13 = new FunctionBean.OutSetBean();
          ((FunctionBean.OutSetBean)localObject13).setName(localXmlResourceParser.getAttributeValue(null, "name"));
          ((FunctionBean.OutSetBean)localObject13).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
          ((FunctionBean.OutSetBean)localObject13).setType(localXmlResourceParser.getAttributeValue(null, "type"));
          ((FunctionBean.OutSetBean)localObject13).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("outputs"))
        {
          localObject9 = new ArrayList();
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else
        {
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
          if (str.equals("output"))
          {
            localObject4 = new FunctionBean.OutPutBean();
            ((FunctionBean.OutPutBean)localObject4).setJsonName(localXmlResourceParser.getAttributeValue(null, "jsonName"));
            ((FunctionBean.OutPutBean)localObject4).setByteName(localXmlResourceParser.getAttributeValue(null, "byteName"));
            ((FunctionBean.OutPutBean)localObject4).setType(localXmlResourceParser.getAttributeValue(null, "type"));
            ((FunctionBean.OutPutBean)localObject4).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
            ((FunctionBean.OutPutBean)localObject4).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
            str = localXmlResourceParser.getAttributeValue(null, "unsign");
            localObject9 = localIOException;
            localObject10 = localObject2;
            localObject11 = localObject3;
            localObject12 = localObject4;
            localObject13 = localObject5;
            localObject14 = localObject6;
            localObject15 = localObject8;
            localObject16 = localObject7;
            if (!TextUtils.isEmpty(str))
            {
              ((FunctionBean.OutPutBean)localObject4).setUnsign(Boolean.parseBoolean(str));
              localObject9 = localIOException;
              localObject10 = localObject2;
              localObject11 = localObject3;
              localObject12 = localObject4;
              localObject13 = localObject5;
              localObject14 = localObject6;
              localObject15 = localObject8;
              localObject16 = localObject7;
              continue;
              str = localXmlResourceParser.getName();
              if ("field".equals(str))
              {
                this.mBFConfigBean.putFieldBean(((FieldBean)localObject7).getSerno(), (FieldBean)localObject7);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else if ("input".equals(str))
              {
                ((ArrayList)localObject3).add(localObject6);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else if ("outset".equals(str))
              {
                ((ArrayList)localObject2).add(localObject5);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else if ("output".equals(str))
              {
                localIOException.add(localObject4);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else
              {
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
                if ("function".equals(str))
                {
                  ((FunctionBean)localObject8).setInputs((ArrayList)localObject3);
                  ((FunctionBean)localObject8).setOutsets((ArrayList)localObject2);
                  ((FunctionBean)localObject8).setOutPuts(localIOException);
                  this.mBFConfigBean.putFunctionBean(((FunctionBean)localObject8).getJsonFuncNo(), (FunctionBean)localObject8);
                  localObject9 = localIOException;
                  localObject10 = localObject2;
                  localObject11 = localObject3;
                  localObject12 = localObject4;
                  localObject13 = localObject5;
                  localObject14 = localObject6;
                  localObject15 = localObject8;
                  localObject16 = localObject7;
                  continue;
                  label1403:
                  if (i == 1) {
                    break;
                  }
                  localObject9 = localIOException;
                  localObject10 = localObject2;
                  localObject11 = localObject3;
                  localObject12 = localObject4;
                  localObject13 = localObject5;
                  localObject14 = localObject6;
                  localObject15 = localObject8;
                  localObject16 = localObject7;
                  switch (i)
                  {
                  }
                  localObject9 = localIOException;
                  localObject10 = localObject2;
                  localObject11 = localObject3;
                  localObject12 = localObject4;
                  localObject13 = localObject5;
                  localObject14 = localObject6;
                  localObject15 = localObject8;
                  localObject16 = localObject7;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void parseHkQuoteFunctionXmlFile()
  {
    Object localObject1 = null;
    int i = ResourceUtil.getResourceID(this.mContext, "xml", "hkquotefunction");
    if (i <= 0)
    {
      Log.d("can't find hkquotefunction.xml file in xml dir!!!,return");
      return;
    }
    XmlResourceParser localXmlResourceParser = this.mContext.getResources().getXml(i);
    for (;;)
    {
      Object localObject9;
      try
      {
        i = localXmlResourceParser.getEventType();
        localObject3 = null;
        localObject4 = null;
        localObject5 = null;
        localObject6 = null;
        localObject8 = null;
        localObject7 = null;
        localObject2 = null;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localXmlPullParserException.printStackTrace();
        return;
        if (!str.equals("function")) {
          break label454;
        }
        localObject15 = new FunctionBean();
        ((FunctionBean)localObject15).setByteFuncNo(localXmlResourceParser.getAttributeValue(null, "byteFuncNo"));
        ((FunctionBean)localObject15).setJsonFuncNo(localXmlResourceParser.getAttributeValue(null, "jsonFuncNo"));
        localObject8 = localXmlResourceParser.getAttributeValue(null, "mode");
        if (!TextUtils.isEmpty((CharSequence)localObject8)) {
          break label407;
        }
        ((FunctionBean)localObject15).setMode(Integer.parseInt("0"));
        localObject8 = localXmlResourceParser.getAttributeValue(null, "isStockIndex");
        if (TextUtils.isEmpty((CharSequence)localObject8)) {
          break label420;
        }
        ((FunctionBean)localObject15).setIsStockIndex(Boolean.parseBoolean((String)localObject8));
        localObject9 = localXmlPullParserException;
        localObject10 = localObject2;
        localObject11 = localObject3;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject14 = localObject6;
        localObject16 = localObject7;
        continue;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        return;
      }
      i = localXmlResourceParser.next();
      localObject1 = localObject9;
      Object localObject10;
      Object localObject2 = localObject10;
      Object localObject11;
      Object localObject3 = localObject11;
      Object localObject12;
      Object localObject4 = localObject12;
      Object localObject13;
      Object localObject5 = localObject13;
      Object localObject14;
      Object localObject6 = localObject14;
      Object localObject15;
      Object localObject8 = localObject15;
      Object localObject16;
      Object localObject7 = localObject16;
      break label1403;
      String str = localXmlResourceParser.getName();
      if (str.equals("field"))
      {
        localObject16 = new FieldBean();
        ((FieldBean)localObject16).setName(localXmlResourceParser.getAttributeValue(null, "name"));
        ((FieldBean)localObject16).setType(localXmlResourceParser.getAttributeValue(null, "type"));
        ((FieldBean)localObject16).setSerno(localXmlResourceParser.getAttributeValue(null, "serno"));
        ((FieldBean)localObject16).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        ((FieldBean)localObject16).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
        localObject9 = localObject1;
        localObject10 = localObject2;
        localObject11 = localObject3;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject14 = localObject6;
        localObject15 = localObject8;
      }
      else
      {
        label407:
        ((FunctionBean)localObject15).setMode(Integer.parseInt((String)localObject8));
        continue;
        label420:
        ((FunctionBean)localObject15).setIsStockIndex(false);
        localObject9 = localIOException;
        localObject10 = localObject2;
        localObject11 = localObject3;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject14 = localObject6;
        localObject16 = localObject7;
        continue;
        label454:
        if (str.equals("inputs"))
        {
          localObject11 = new ArrayList();
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("input"))
        {
          localObject14 = new FunctionBean.InputBean();
          ((FunctionBean.InputBean)localObject14).setByteName(localXmlResourceParser.getAttributeValue(null, "byteName"));
          ((FunctionBean.InputBean)localObject14).setJsonName(localXmlResourceParser.getAttributeValue(null, "jsonName"));
          ((FunctionBean.InputBean)localObject14).setDefaultValue(localXmlResourceParser.getAttributeValue(null, "defaultValue"));
          ((FunctionBean.InputBean)localObject14).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
          ((FunctionBean.InputBean)localObject14).setType(localXmlResourceParser.getAttributeValue(null, "type"));
          ((FunctionBean.InputBean)localObject14).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("outsets"))
        {
          localObject10 = new ArrayList();
          localObject9 = localIOException;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("outset"))
        {
          localObject13 = new FunctionBean.OutSetBean();
          ((FunctionBean.OutSetBean)localObject13).setName(localXmlResourceParser.getAttributeValue(null, "name"));
          ((FunctionBean.OutSetBean)localObject13).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
          ((FunctionBean.OutSetBean)localObject13).setType(localXmlResourceParser.getAttributeValue(null, "type"));
          ((FunctionBean.OutSetBean)localObject13).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else if (str.equals("outputs"))
        {
          localObject9 = new ArrayList();
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
        }
        else
        {
          localObject9 = localIOException;
          localObject10 = localObject2;
          localObject11 = localObject3;
          localObject12 = localObject4;
          localObject13 = localObject5;
          localObject14 = localObject6;
          localObject15 = localObject8;
          localObject16 = localObject7;
          if (str.equals("output"))
          {
            localObject4 = new FunctionBean.OutPutBean();
            ((FunctionBean.OutPutBean)localObject4).setJsonName(localXmlResourceParser.getAttributeValue(null, "jsonName"));
            ((FunctionBean.OutPutBean)localObject4).setByteName(localXmlResourceParser.getAttributeValue(null, "byteName"));
            ((FunctionBean.OutPutBean)localObject4).setType(localXmlResourceParser.getAttributeValue(null, "type"));
            ((FunctionBean.OutPutBean)localObject4).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
            ((FunctionBean.OutPutBean)localObject4).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
            str = localXmlResourceParser.getAttributeValue(null, "unsign");
            localObject9 = localIOException;
            localObject10 = localObject2;
            localObject11 = localObject3;
            localObject12 = localObject4;
            localObject13 = localObject5;
            localObject14 = localObject6;
            localObject15 = localObject8;
            localObject16 = localObject7;
            if (!TextUtils.isEmpty(str))
            {
              ((FunctionBean.OutPutBean)localObject4).setUnsign(Boolean.parseBoolean(str));
              localObject9 = localIOException;
              localObject10 = localObject2;
              localObject11 = localObject3;
              localObject12 = localObject4;
              localObject13 = localObject5;
              localObject14 = localObject6;
              localObject15 = localObject8;
              localObject16 = localObject7;
              continue;
              str = localXmlResourceParser.getName();
              if ("field".equals(str))
              {
                this.mHKQuotationConfigBean.putFieldBean(((FieldBean)localObject7).getSerno(), (FieldBean)localObject7);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else if ("input".equals(str))
              {
                ((ArrayList)localObject3).add(localObject6);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else if ("outset".equals(str))
              {
                ((ArrayList)localObject2).add(localObject5);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else if ("output".equals(str))
              {
                localIOException.add(localObject4);
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
              }
              else
              {
                localObject9 = localIOException;
                localObject10 = localObject2;
                localObject11 = localObject3;
                localObject12 = localObject4;
                localObject13 = localObject5;
                localObject14 = localObject6;
                localObject15 = localObject8;
                localObject16 = localObject7;
                if ("function".equals(str))
                {
                  ((FunctionBean)localObject8).setInputs((ArrayList)localObject3);
                  ((FunctionBean)localObject8).setOutsets((ArrayList)localObject2);
                  ((FunctionBean)localObject8).setOutPuts(localIOException);
                  this.mHKQuotationConfigBean.putFunctionBean(((FunctionBean)localObject8).getJsonFuncNo(), (FunctionBean)localObject8);
                  localObject9 = localIOException;
                  localObject10 = localObject2;
                  localObject11 = localObject3;
                  localObject12 = localObject4;
                  localObject13 = localObject5;
                  localObject14 = localObject6;
                  localObject15 = localObject8;
                  localObject16 = localObject7;
                  continue;
                  label1403:
                  if (i == 1) {
                    break;
                  }
                  localObject9 = localIOException;
                  localObject10 = localObject2;
                  localObject11 = localObject3;
                  localObject12 = localObject4;
                  localObject13 = localObject5;
                  localObject14 = localObject6;
                  localObject15 = localObject8;
                  localObject16 = localObject7;
                  switch (i)
                  {
                  }
                  localObject9 = localIOException;
                  localObject10 = localObject2;
                  localObject11 = localObject3;
                  localObject12 = localObject4;
                  localObject13 = localObject5;
                  localObject14 = localObject6;
                  localObject15 = localObject8;
                  localObject16 = localObject7;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void parseQuoteFunctionXmlFile()
  {
    Object localObject1 = null;
    int i = ResourceUtil.getResourceID(this.mContext, "xml", "quotefunction");
    if (i <= 0)
    {
      Log.d("can't find quotefunction.xml file in xml dir!!!,return");
      return;
    }
    XmlResourceParser localXmlResourceParser = this.mContext.getResources().getXml(i);
    for (;;)
    {
      Object localObject10;
      try
      {
        i = localXmlResourceParser.getEventType();
        localObject3 = null;
        localObject4 = null;
        localObject5 = null;
        localObject6 = null;
        localObject8 = null;
        localObject7 = null;
        localObject9 = null;
        localObject2 = null;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localXmlPullParserException.printStackTrace();
        return;
        if (!str.equals("field")) {
          break label358;
        }
        localObject17 = new FieldBean();
        ((FieldBean)localObject17).setName(localXmlResourceParser.getAttributeValue(null, "name"));
        ((FieldBean)localObject17).setType(localXmlResourceParser.getAttributeValue(null, "type"));
        ((FieldBean)localObject17).setSerno(localXmlResourceParser.getAttributeValue(null, "serno"));
        ((FieldBean)localObject17).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        ((FieldBean)localObject17).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
        localObject10 = localXmlPullParserException;
        localObject11 = localObject2;
        localObject12 = localObject3;
        localObject13 = localObject4;
        localObject14 = localObject5;
        localObject15 = localObject6;
        localObject16 = localObject8;
        localObject18 = localObject9;
        continue;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        return;
      }
      i = localXmlResourceParser.next();
      localObject1 = localObject10;
      Object localObject11;
      Object localObject2 = localObject11;
      Object localObject12;
      Object localObject3 = localObject12;
      Object localObject13;
      Object localObject4 = localObject13;
      Object localObject14;
      Object localObject5 = localObject14;
      Object localObject15;
      Object localObject6 = localObject15;
      Object localObject16;
      Object localObject8 = localObject16;
      Object localObject17;
      Object localObject7 = localObject17;
      Object localObject18;
      Object localObject9 = localObject18;
      break label1617;
      String str = localXmlResourceParser.getName();
      if (str.equals("type"))
      {
        localObject18 = new TypeBean();
        ((TypeBean)localObject18).setSerno(localXmlResourceParser.getAttributeValue(null, "serno"));
        ((TypeBean)localObject18).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
        localObject10 = localObject1;
        localObject11 = localObject2;
        localObject12 = localObject3;
        localObject13 = localObject4;
        localObject14 = localObject5;
        localObject15 = localObject6;
        localObject16 = localObject8;
        localObject17 = localObject7;
      }
      else
      {
        label358:
        if (str.equals("function"))
        {
          localObject16 = new FunctionBean();
          ((FunctionBean)localObject16).setByteFuncNo(localXmlResourceParser.getAttributeValue(null, "byteFuncNo"));
          ((FunctionBean)localObject16).setJsonFuncNo(localXmlResourceParser.getAttributeValue(null, "jsonFuncNo"));
          localObject8 = localXmlResourceParser.getAttributeValue(null, "mode");
          if (TextUtils.isEmpty((CharSequence)localObject8)) {
            ((FunctionBean)localObject16).setMode(Integer.parseInt("0"));
          }
          for (;;)
          {
            localObject8 = localXmlResourceParser.getAttributeValue(null, "isStockIndex");
            if (TextUtils.isEmpty((CharSequence)localObject8)) {
              break label518;
            }
            ((FunctionBean)localObject16).setIsStockIndex(Boolean.parseBoolean((String)localObject8));
            localObject10 = localIOException;
            localObject11 = localObject2;
            localObject12 = localObject3;
            localObject13 = localObject4;
            localObject14 = localObject5;
            localObject15 = localObject6;
            localObject17 = localObject7;
            localObject18 = localObject9;
            break;
            ((FunctionBean)localObject16).setMode(Integer.parseInt((String)localObject8));
          }
          label518:
          ((FunctionBean)localObject16).setIsStockIndex(false);
          localObject10 = localIOException;
          localObject11 = localObject2;
          localObject12 = localObject3;
          localObject13 = localObject4;
          localObject14 = localObject5;
          localObject15 = localObject6;
          localObject17 = localObject7;
          localObject18 = localObject9;
        }
        else if (str.equals("inputs"))
        {
          localObject12 = new ArrayList();
          localObject10 = localIOException;
          localObject11 = localObject2;
          localObject13 = localObject4;
          localObject14 = localObject5;
          localObject15 = localObject6;
          localObject16 = localObject8;
          localObject17 = localObject7;
          localObject18 = localObject9;
        }
        else if (str.equals("input"))
        {
          localObject15 = new FunctionBean.InputBean();
          ((FunctionBean.InputBean)localObject15).setByteName(localXmlResourceParser.getAttributeValue(null, "byteName"));
          ((FunctionBean.InputBean)localObject15).setJsonName(localXmlResourceParser.getAttributeValue(null, "jsonName"));
          ((FunctionBean.InputBean)localObject15).setDefaultValue(localXmlResourceParser.getAttributeValue(null, "defaultValue"));
          ((FunctionBean.InputBean)localObject15).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
          ((FunctionBean.InputBean)localObject15).setType(localXmlResourceParser.getAttributeValue(null, "type"));
          ((FunctionBean.InputBean)localObject15).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          localObject10 = localIOException;
          localObject11 = localObject2;
          localObject12 = localObject3;
          localObject13 = localObject4;
          localObject14 = localObject5;
          localObject16 = localObject8;
          localObject17 = localObject7;
          localObject18 = localObject9;
        }
        else if (str.equals("outsets"))
        {
          localObject11 = new ArrayList();
          localObject10 = localIOException;
          localObject12 = localObject3;
          localObject13 = localObject4;
          localObject14 = localObject5;
          localObject15 = localObject6;
          localObject16 = localObject8;
          localObject17 = localObject7;
          localObject18 = localObject9;
        }
        else if (str.equals("outset"))
        {
          localObject14 = new FunctionBean.OutSetBean();
          ((FunctionBean.OutSetBean)localObject14).setName(localXmlResourceParser.getAttributeValue(null, "name"));
          ((FunctionBean.OutSetBean)localObject14).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
          ((FunctionBean.OutSetBean)localObject14).setType(localXmlResourceParser.getAttributeValue(null, "type"));
          ((FunctionBean.OutSetBean)localObject14).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
          localObject10 = localIOException;
          localObject11 = localObject2;
          localObject12 = localObject3;
          localObject13 = localObject4;
          localObject15 = localObject6;
          localObject16 = localObject8;
          localObject17 = localObject7;
          localObject18 = localObject9;
        }
        else if (str.equals("outputs"))
        {
          localObject10 = new ArrayList();
          localObject11 = localObject2;
          localObject12 = localObject3;
          localObject13 = localObject4;
          localObject14 = localObject5;
          localObject15 = localObject6;
          localObject16 = localObject8;
          localObject17 = localObject7;
          localObject18 = localObject9;
        }
        else
        {
          localObject10 = localIOException;
          localObject11 = localObject2;
          localObject12 = localObject3;
          localObject13 = localObject4;
          localObject14 = localObject5;
          localObject15 = localObject6;
          localObject16 = localObject8;
          localObject17 = localObject7;
          localObject18 = localObject9;
          if (str.equals("output"))
          {
            localObject4 = new FunctionBean.OutPutBean();
            ((FunctionBean.OutPutBean)localObject4).setJsonName(localXmlResourceParser.getAttributeValue(null, "jsonName"));
            ((FunctionBean.OutPutBean)localObject4).setByteName(localXmlResourceParser.getAttributeValue(null, "byteName"));
            ((FunctionBean.OutPutBean)localObject4).setType(localXmlResourceParser.getAttributeValue(null, "type"));
            ((FunctionBean.OutPutBean)localObject4).setLength(Integer.parseInt(localXmlResourceParser.getAttributeValue(null, "length")));
            ((FunctionBean.OutPutBean)localObject4).setDescription(localXmlResourceParser.getAttributeValue(null, "description"));
            str = localXmlResourceParser.getAttributeValue(null, "unsign");
            localObject10 = localIOException;
            localObject11 = localObject2;
            localObject12 = localObject3;
            localObject13 = localObject4;
            localObject14 = localObject5;
            localObject15 = localObject6;
            localObject16 = localObject8;
            localObject17 = localObject7;
            localObject18 = localObject9;
            if (!TextUtils.isEmpty(str))
            {
              ((FunctionBean.OutPutBean)localObject4).setUnsign(Boolean.parseBoolean(str));
              localObject10 = localIOException;
              localObject11 = localObject2;
              localObject12 = localObject3;
              localObject13 = localObject4;
              localObject14 = localObject5;
              localObject15 = localObject6;
              localObject16 = localObject8;
              localObject17 = localObject7;
              localObject18 = localObject9;
              continue;
              str = localXmlResourceParser.getName();
              if ("type".equals(str))
              {
                this.mAQuotationConfigBean.addTypeBean((TypeBean)localObject9);
                localObject10 = localIOException;
                localObject11 = localObject2;
                localObject12 = localObject3;
                localObject13 = localObject4;
                localObject14 = localObject5;
                localObject15 = localObject6;
                localObject16 = localObject8;
                localObject17 = localObject7;
                localObject18 = localObject9;
              }
              else if ("field".equals(str))
              {
                this.mAQuotationConfigBean.putFieldBean(((FieldBean)localObject7).getSerno(), (FieldBean)localObject7);
                localObject10 = localIOException;
                localObject11 = localObject2;
                localObject12 = localObject3;
                localObject13 = localObject4;
                localObject14 = localObject5;
                localObject15 = localObject6;
                localObject16 = localObject8;
                localObject17 = localObject7;
                localObject18 = localObject9;
              }
              else if ("input".equals(str))
              {
                ((ArrayList)localObject3).add(localObject6);
                localObject10 = localIOException;
                localObject11 = localObject2;
                localObject12 = localObject3;
                localObject13 = localObject4;
                localObject14 = localObject5;
                localObject15 = localObject6;
                localObject16 = localObject8;
                localObject17 = localObject7;
                localObject18 = localObject9;
              }
              else if ("outset".equals(str))
              {
                ((ArrayList)localObject2).add(localObject5);
                localObject10 = localIOException;
                localObject11 = localObject2;
                localObject12 = localObject3;
                localObject13 = localObject4;
                localObject14 = localObject5;
                localObject15 = localObject6;
                localObject16 = localObject8;
                localObject17 = localObject7;
                localObject18 = localObject9;
              }
              else if ("output".equals(str))
              {
                localIOException.add(localObject4);
                localObject10 = localIOException;
                localObject11 = localObject2;
                localObject12 = localObject3;
                localObject13 = localObject4;
                localObject14 = localObject5;
                localObject15 = localObject6;
                localObject16 = localObject8;
                localObject17 = localObject7;
                localObject18 = localObject9;
              }
              else
              {
                localObject10 = localIOException;
                localObject11 = localObject2;
                localObject12 = localObject3;
                localObject13 = localObject4;
                localObject14 = localObject5;
                localObject15 = localObject6;
                localObject16 = localObject8;
                localObject17 = localObject7;
                localObject18 = localObject9;
                if ("function".equals(str))
                {
                  ((FunctionBean)localObject8).setInputs((ArrayList)localObject3);
                  ((FunctionBean)localObject8).setOutsets((ArrayList)localObject2);
                  ((FunctionBean)localObject8).setOutPuts(localIOException);
                  this.mAQuotationConfigBean.putFunctionBean(((FunctionBean)localObject8).getJsonFuncNo(), (FunctionBean)localObject8);
                  localObject10 = localIOException;
                  localObject11 = localObject2;
                  localObject12 = localObject3;
                  localObject13 = localObject4;
                  localObject14 = localObject5;
                  localObject15 = localObject6;
                  localObject16 = localObject8;
                  localObject17 = localObject7;
                  localObject18 = localObject9;
                  continue;
                  label1617:
                  if (i == 1) {
                    break;
                  }
                  localObject10 = localIOException;
                  localObject11 = localObject2;
                  localObject12 = localObject3;
                  localObject13 = localObject4;
                  localObject14 = localObject5;
                  localObject15 = localObject6;
                  localObject16 = localObject8;
                  localObject17 = localObject7;
                  localObject18 = localObject9;
                  switch (i)
                  {
                  }
                  localObject10 = localIOException;
                  localObject11 = localObject2;
                  localObject12 = localObject3;
                  localObject13 = localObject4;
                  localObject14 = localObject5;
                  localObject15 = localObject6;
                  localObject16 = localObject8;
                  localObject17 = localObject7;
                  localObject18 = localObject9;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public ArrayList<AddressConfigBean> getAddressConfig()
  {
    return this.mAddressConfigInfo;
  }
  
  public AddressConfigBean getAddressConfigBean(String paramString)
  {
    Iterator localIterator = this.mAddressConfigInfo.iterator();
    AddressConfigBean localAddressConfigBean;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localAddressConfigBean = (AddressConfigBean)localIterator.next();
    } while (!localAddressConfigBean.getName().equals(paramString));
    return localAddressConfigBean;
  }
  
  public String getAddressConfigValue(String paramString)
  {
    Iterator localIterator = this.mAddressConfigInfo.iterator();
    AddressConfigBean localAddressConfigBean;
    do
    {
      if (!localIterator.hasNext()) {
        return "";
      }
      localAddressConfigBean = (AddressConfigBean)localIterator.next();
    } while (!localAddressConfigBean.getName().equals(paramString));
    return localAddressConfigBean.getPriorityValue();
  }
  
  public String getCertificatePath(String paramString)
  {
    Iterator localIterator = this.mAddressConfigInfo.iterator();
    AddressConfigBean localAddressConfigBean;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localAddressConfigBean = (AddressConfigBean)localIterator.next();
    } while (!localAddressConfigBean.getPriorityValue().contains(paramString));
    return localAddressConfigBean.getCertificatePath();
  }
  
  public FieldBean getFieldBean(String paramString, SocketType paramSocketType)
  {
    FieldBean localFieldBean = null;
    if (SocketType.A == paramSocketType) {
      localFieldBean = this.mAQuotationConfigBean.getFieldBean(paramString);
    }
    do
    {
      return localFieldBean;
      if (SocketType.HK == paramSocketType) {
        return this.mHKQuotationConfigBean.getFieldBean(paramString);
      }
    } while (SocketType.BF != paramSocketType);
    return this.mBFConfigBean.getFieldBean(paramString);
  }
  
  public FunctionBean getFunctionBean(String paramString, SocketType paramSocketType)
  {
    FunctionBean localFunctionBean = null;
    if (SocketType.A == paramSocketType) {
      localFunctionBean = this.mAQuotationConfigBean.getFunctionBean(paramString);
    }
    do
    {
      return localFunctionBean;
      if (SocketType.HK == paramSocketType) {
        return this.mHKQuotationConfigBean.getFunctionBean(paramString);
      }
    } while (SocketType.BF != paramSocketType);
    return this.mBFConfigBean.getFunctionBean(paramString);
  }
  
  public ArrayList<ModuleConfigBean> getModuleConfig()
  {
    return this.mModuleConfigInfo;
  }
  
  public ArrayList<RequestQueueBean> getRequestQueueConfig()
  {
    return this.mRequestQueueConfigInfo;
  }
  
  public ArrayList<SystemConfigBean> getSystemConfig()
  {
    return this.mSystemConfigInfo;
  }
  
  public SystemConfigBean getSystemConfigBean(String paramString)
  {
    Iterator localIterator = this.mSystemConfigInfo.iterator();
    SystemConfigBean localSystemConfigBean;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localSystemConfigBean = (SystemConfigBean)localIterator.next();
    } while (!localSystemConfigBean.getName().equals(paramString));
    return localSystemConfigBean;
  }
  
  public String getSystemConfigValue(String paramString)
  {
    Iterator localIterator = this.mSystemConfigInfo.iterator();
    SystemConfigBean localSystemConfigBean;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localSystemConfigBean = (SystemConfigBean)localIterator.next();
    } while (!localSystemConfigBean.getName().equals(paramString));
    return localSystemConfigBean.getValue();
  }
  
  public ArrayList<TypeBean> getTypeInfo(SocketType paramSocketType)
  {
    ArrayList localArrayList = null;
    if (SocketType.A == paramSocketType) {
      localArrayList = this.mAQuotationConfigBean.getTypeBeanList();
    }
    do
    {
      return localArrayList;
      if (SocketType.HK == paramSocketType) {
        return this.mHKQuotationConfigBean.getTypeBeanList();
      }
    } while (SocketType.BF != paramSocketType);
    return this.mBFConfigBean.getTypeBeanList();
  }
  
  public String getUrlName(String paramString)
  {
    Iterator localIterator = this.mAddressConfigInfo.iterator();
    AddressConfigBean localAddressConfigBean;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localAddressConfigBean = (AddressConfigBean)localIterator.next();
    } while (!localAddressConfigBean.getPriorityValue().contains(paramString));
    return localAddressConfigBean.getName();
  }
  
  public void parseConfigFile(Context paramContext)
  {
    this.mContext = paramContext;
    clear();
    parseConfigurationXmlFile();
    paramContext = getSystemConfigValue("env-xml");
    if ((!TextUtils.isEmpty(paramContext)) && (!paramContext.equals("configuration")))
    {
      this.mAddressConfigInfo.clear();
      parseEnvXmlFile(paramContext);
    }
    parseQuoteFunctionXmlFile();
    parseHkQuoteFunctionXmlFile();
    parseFuturesFunctionXmlFile();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\config\ConfigManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */