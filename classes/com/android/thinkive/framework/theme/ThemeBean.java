package com.android.thinkive.framework.theme;

import java.util.HashMap;

public class ThemeBean
{
  private HashMap<String, String> mapColor;
  private String styleColor;
  private String themeName;
  
  public ThemeBean() {}
  
  public ThemeBean(String paramString1, String paramString2, HashMap<String, String> paramHashMap)
  {
    this.themeName = paramString1;
    this.styleColor = paramString2;
    this.mapColor = paramHashMap;
  }
  
  public HashMap<String, String> getMapColor()
  {
    return this.mapColor;
  }
  
  public String getStyleColor()
  {
    return this.styleColor;
  }
  
  public String getThemeName()
  {
    return this.themeName;
  }
  
  public void setMapColor(HashMap<String, String> paramHashMap)
  {
    this.mapColor = paramHashMap;
  }
  
  public void setStyleColor(String paramString)
  {
    this.styleColor = paramString;
  }
  
  public void setThemeName(String paramString)
  {
    this.themeName = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\theme\ThemeBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */