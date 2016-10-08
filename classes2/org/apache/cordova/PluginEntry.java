package org.apache.cordova;

import java.io.PrintStream;

public class PluginEntry
{
  public boolean onload = false;
  public CordovaPlugin plugin = null;
  public String pluginClass = "";
  public String service = "";
  
  public PluginEntry(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.service = paramString1;
    this.pluginClass = paramString2;
    this.onload = paramBoolean;
  }
  
  public PluginEntry(String paramString, CordovaPlugin paramCordovaPlugin)
  {
    this.service = paramString;
    this.plugin = paramCordovaPlugin;
    this.pluginClass = paramCordovaPlugin.getClass().getName();
    this.onload = false;
  }
  
  private Class getClassByName(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null)
    {
      localObject1 = localObject2;
      if (!"".equals(paramString)) {
        localObject1 = Class.forName(paramString);
      }
    }
    return (Class)localObject1;
  }
  
  private boolean isCordovaPlugin(Class paramClass)
  {
    if (paramClass != null) {
      return CordovaPlugin.class.isAssignableFrom(paramClass);
    }
    return false;
  }
  
  public CordovaPlugin createPlugin(CordovaWebView paramCordovaWebView, CordovaInterface paramCordovaInterface)
  {
    if (this.plugin != null) {
      return this.plugin;
    }
    try
    {
      Class localClass = getClassByName(this.pluginClass);
      if (isCordovaPlugin(localClass))
      {
        this.plugin = ((CordovaPlugin)localClass.newInstance());
        this.plugin.initialize(paramCordovaInterface, paramCordovaWebView);
        paramCordovaWebView = this.plugin;
        return paramCordovaWebView;
      }
    }
    catch (Exception paramCordovaWebView)
    {
      paramCordovaWebView.printStackTrace();
      System.out.println("Error adding plugin " + this.pluginClass + ".");
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\PluginEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */