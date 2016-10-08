package com.cairh.app.sjkh.xml.config;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class XMLContentHandler
  extends DefaultHandler
{
  private List<ConfigBean> ConfigBeans = null;
  private ConfigBean currentConfigBean;
  private String tagName = null;
  
  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if ("crh_app_name".equals(this.tagName)) {
      this.currentConfigBean.setCrh_app_name(new String(paramArrayOfChar, paramInt1, paramInt2));
    }
    do
    {
      return;
      if ("crh_app_type".equals(this.tagName))
      {
        str = new String(paramArrayOfChar, paramInt1, paramInt2);
        if (str != null)
        {
          paramArrayOfChar = str;
          if (!"".equals(str)) {}
        }
        else
        {
          paramArrayOfChar = "0";
        }
        this.currentConfigBean.setCrh_app_type(Integer.valueOf(paramArrayOfChar).intValue());
        return;
      }
      if ("crh_server_domain".equals(this.tagName))
      {
        this.currentConfigBean.setCrh_server_domain(new String(paramArrayOfChar, paramInt1, paramInt2));
        return;
      }
      if ("crh_server_url".equals(this.tagName))
      {
        paramArrayOfChar = new String(paramArrayOfChar, paramInt1, paramInt2);
        this.currentConfigBean.setCrh_server_url(paramArrayOfChar);
        return;
      }
      if ("crh_upload_url".equals(this.tagName))
      {
        paramArrayOfChar = new String(paramArrayOfChar, paramInt1, paramInt2);
        this.currentConfigBean.setCrh_upload_url(paramArrayOfChar);
        return;
      }
      if ("crh_cookie_path".equals(this.tagName))
      {
        this.currentConfigBean.setCrh_cookie_path(new String(paramArrayOfChar, paramInt1, paramInt2));
        return;
      }
      if ("crh_video_server_ip".equals(this.tagName))
      {
        this.currentConfigBean.setCrh_video_server_ip(new String(paramArrayOfChar, paramInt1, paramInt2));
        return;
      }
    } while (!"crh_video_server_port".equals(this.tagName));
    String str = new String(paramArrayOfChar, paramInt1, paramInt2);
    if (str != null)
    {
      paramArrayOfChar = str;
      if (!"".equals(str)) {}
    }
    else
    {
      paramArrayOfChar = "8906";
    }
    this.currentConfigBean.setCrh_video_server_port(Integer.valueOf(paramArrayOfChar).intValue());
  }
  
  public void endElement(String paramString1, String paramString2, String paramString3)
  {
    if (paramString2.equals("server")) {
      this.ConfigBeans.add(this.currentConfigBean);
    }
    this.tagName = null;
  }
  
  public List<ConfigBean> getConfigBean()
  {
    return this.ConfigBeans;
  }
  
  public void startDocument()
  {
    this.ConfigBeans = new ArrayList();
  }
  
  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    if (paramString2.equals("server")) {
      this.currentConfigBean = new ConfigBean();
    }
    this.tagName = paramString2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\xml\config\XMLContentHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */