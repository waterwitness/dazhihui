package com.cairh.app.sjkh.xml.config;

public class ConfigBean
{
  private String crh_app_name = "";
  private int crh_app_type = 0;
  private String crh_cookie_path = "";
  private String crh_server_domain = "";
  private String crh_server_url = "";
  private String crh_upload_url = "";
  private String crh_video_server_ip = "";
  private int crh_video_server_port;
  
  public String getCrh_app_name()
  {
    return this.crh_app_name;
  }
  
  public int getCrh_app_type()
  {
    return this.crh_app_type;
  }
  
  public String getCrh_cookie_path()
  {
    return this.crh_cookie_path;
  }
  
  public String getCrh_server_domain()
  {
    return this.crh_server_domain;
  }
  
  public String getCrh_server_url()
  {
    return this.crh_server_url;
  }
  
  public String getCrh_upload_url()
  {
    return this.crh_upload_url;
  }
  
  public String getCrh_video_server_ip()
  {
    return this.crh_video_server_ip;
  }
  
  public int getCrh_video_server_port()
  {
    return this.crh_video_server_port;
  }
  
  public void setCrh_app_name(String paramString)
  {
    this.crh_app_name = paramString;
  }
  
  public void setCrh_app_type(int paramInt)
  {
    this.crh_app_type = paramInt;
  }
  
  public void setCrh_cookie_path(String paramString)
  {
    this.crh_cookie_path = paramString;
  }
  
  public void setCrh_server_domain(String paramString)
  {
    this.crh_server_domain = paramString;
  }
  
  public void setCrh_server_url(String paramString)
  {
    this.crh_server_url = paramString;
  }
  
  public void setCrh_upload_url(String paramString)
  {
    this.crh_upload_url = paramString;
  }
  
  public void setCrh_video_server_ip(String paramString)
  {
    this.crh_video_server_ip = paramString;
  }
  
  public void setCrh_video_server_port(int paramInt)
  {
    this.crh_video_server_port = paramInt;
  }
  
  public String toString()
  {
    return "ConfigBean [crh_app_name=" + this.crh_app_name + ", crh_app_type=" + this.crh_app_type + ", crh_server_domain=" + this.crh_server_domain + ", crh_server_url=" + this.crh_server_url + ", crh_upload_url=" + this.crh_upload_url + ", crh_cookie_path=" + this.crh_cookie_path + ", crh_video_server_ip=" + this.crh_video_server_ip + ", crh_video_server_port=" + this.crh_video_server_port + "]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\xml\config\ConfigBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */