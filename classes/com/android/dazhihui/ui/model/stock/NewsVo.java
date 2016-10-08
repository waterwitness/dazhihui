package com.android.dazhihui.ui.model.stock;

import android.text.Html;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsVo
{
  private String advTypeShare;
  private String content;
  private String countId;
  private String id;
  private String imgUrl;
  private boolean isAdvert;
  private boolean isShow = false;
  private int mGroupIndex;
  private String origins;
  private String resType;
  private String time;
  private String title;
  private int type = 0;
  private String url;
  
  public String getAdvTypeShare()
  {
    return this.advTypeShare;
  }
  
  public String getContent()
  {
    String str = Html.fromHtml(this.content).toString();
    return Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
  }
  
  public String getCountId()
  {
    return this.countId;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getImgUrl()
  {
    return this.imgUrl;
  }
  
  public String getOrigins()
  {
    return this.origins;
  }
  
  public String getResType()
  {
    return this.resType;
  }
  
  public String getTime()
  {
    return this.time;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public String getUrl()
  {
    this.isShow = true;
    return this.url;
  }
  
  public int getmGroupIndex()
  {
    return this.mGroupIndex;
  }
  
  public boolean isAdvert()
  {
    return this.isAdvert;
  }
  
  public void setAdvTypeShare(String paramString)
  {
    this.advTypeShare = paramString;
  }
  
  public void setAdvert(boolean paramBoolean)
  {
    this.isAdvert = paramBoolean;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  public void setCountId(String paramString)
  {
    this.countId = paramString;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setImgUrl(String paramString)
  {
    this.imgUrl = paramString;
  }
  
  public void setOrigins(String paramString)
  {
    this.origins = paramString;
  }
  
  public void setResType(String paramString)
  {
    this.resType = paramString;
  }
  
  public void setTime(String paramString)
  {
    this.time = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  public void setmGroupIndex(int paramInt)
  {
    this.mGroupIndex = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\NewsVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */