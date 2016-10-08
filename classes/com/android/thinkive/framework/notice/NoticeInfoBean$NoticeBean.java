package com.android.thinkive.framework.notice;

import org.codehaus.jackson.annotate.JsonProperty;

public class NoticeInfoBean$NoticeBean
{
  private String content;
  @JsonProperty("endtime")
  private String endTime;
  private String id;
  @JsonProperty("notice_type")
  private String noticeType;
  @JsonProperty("publishtime")
  private String publishTime;
  @JsonProperty("show_type")
  private String showType;
  private String title;
  
  public String getContent()
  {
    return this.content;
  }
  
  public String getEndTime()
  {
    return this.endTime;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getNoticeType()
  {
    return this.noticeType;
  }
  
  public String getPublishTime()
  {
    return this.publishTime;
  }
  
  public String getShowType()
  {
    return this.showType;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  public void setEndTime(String paramString)
  {
    this.endTime = paramString;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setNoticeType(String paramString)
  {
    this.noticeType = paramString;
  }
  
  public void setPublishTime(String paramString)
  {
    this.publishTime = paramString;
  }
  
  public void setShowType(String paramString)
  {
    this.showType = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeInfoBean$NoticeBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */