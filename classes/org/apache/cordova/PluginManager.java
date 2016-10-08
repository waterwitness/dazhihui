package org.apache.cordova;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Debug;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;

public class PluginManager
{
  private static final int SLOW_EXEC_WARNING_THRESHOLD;
  private static String TAG = "PluginManager";
  private final CordovaWebView app;
  private final CordovaInterface ctx;
  private final HashMap<String, PluginEntry> entries = new HashMap();
  private boolean firstRun;
  private AtomicInteger numPendingUiExecs;
  protected HashMap<String, List<String>> urlMap = new HashMap();
  
  static
  {
    if (Debug.isDebuggerConnected()) {}
    for (int i = 60;; i = 16)
    {
      SLOW_EXEC_WARNING_THRESHOLD = i;
      return;
    }
  }
  
  public PluginManager(CordovaWebView paramCordovaWebView, CordovaInterface paramCordovaInterface)
  {
    this.ctx = paramCordovaInterface;
    this.app = paramCordovaWebView;
    this.firstRun = true;
    this.numPendingUiExecs = new AtomicInteger(0);
  }
  
  private void execHelper(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    CordovaPlugin localCordovaPlugin = getPlugin(paramString1);
    if (localCordovaPlugin == null)
    {
      Log.d(TAG, "exec() call to unknown plugin: " + paramString1);
      paramString1 = new PluginResult(PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION);
      this.app.sendPluginResult(paramString1, paramString3);
    }
    for (;;)
    {
      return;
      paramString3 = new CallbackContext(paramString3, this.app);
      try
      {
        long l = System.currentTimeMillis();
        boolean bool = localCordovaPlugin.execute(paramString2, paramString4, paramString3);
        l = System.currentTimeMillis() - l;
        if (l > SLOW_EXEC_WARNING_THRESHOLD) {
          Log.w(TAG, "THREAD WARNING: exec() call to " + paramString1 + "." + paramString2 + " blocked the main thread for " + l + "ms. Plugin should use CordovaInterface.getThreadPool().");
        }
        if (!bool)
        {
          paramString3.sendPluginResult(new PluginResult(PluginResult.Status.INVALID_ACTION));
          return;
        }
      }
      catch (JSONException paramString1)
      {
        paramString3.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
        return;
      }
      catch (Exception paramString1)
      {
        Log.e(TAG, "Uncaught exception from plugin", paramString1);
        paramString3.error(paramString1.getMessage());
      }
    }
  }
  
  private void pluginConfigurationMissing()
  {
    LOG.e(TAG, "=====================================================================================");
    LOG.e(TAG, "ERROR: config.xml is missing.  Add res/xml/config.xml to your project.");
    LOG.e(TAG, "https://git-wip-us.apache.org/repos/asf?p=cordova-android.git;a=blob;f=framework/res/xml/config.xml");
    LOG.e(TAG, "=====================================================================================");
  }
  
  public void addService(String paramString1, String paramString2)
  {
    addService(new PluginEntry(paramString1, paramString2, false));
  }
  
  public void addService(PluginEntry paramPluginEntry)
  {
    this.entries.put(paramPluginEntry.service, paramPluginEntry);
  }
  
  public void clearPluginObjects()
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((PluginEntry)localIterator.next()).plugin = null;
    }
  }
  
  public void exec(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (this.numPendingUiExecs.get() > 0)
    {
      this.numPendingUiExecs.getAndIncrement();
      this.ctx.getActivity().runOnUiThread(new PluginManager.1(this, paramString1, paramString2, paramString3, paramString4));
      return;
    }
    execHelper(paramString1, paramString2, paramString3, paramString4);
  }
  
  @Deprecated
  public void exec(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    exec(paramString1, paramString2, paramString3, paramString4);
  }
  
  public CordovaPlugin getPlugin(String paramString)
  {
    paramString = (PluginEntry)this.entries.get(paramString);
    if (paramString == null) {
      return null;
    }
    CordovaPlugin localCordovaPlugin = paramString.plugin;
    if (localCordovaPlugin == null) {
      return paramString.createPlugin(this.app, this.ctx);
    }
    return localCordovaPlugin;
  }
  
  public void init()
  {
    LOG.d(TAG, "init()");
    if (this.firstRun)
    {
      loadPlugins();
      this.firstRun = false;
    }
    for (;;)
    {
      addService(new PluginEntry("PluginManager", new PluginManager.PluginManagerService(this, null)));
      startupPlugins();
      return;
      onPause(false);
      onDestroy();
      clearPluginObjects();
    }
  }
  
  public void loadPlugins()
  {
    int j = this.ctx.getActivity().getResources().getIdentifier("config", "xml", this.ctx.getActivity().getClass().getPackage().getName());
    int i = j;
    if (j == 0)
    {
      j = this.ctx.getActivity().getResources().getIdentifier("config", "xml", this.ctx.getActivity().getPackageName());
      i = j;
      if (j == 0)
      {
        pluginConfigurationMissing();
        return;
      }
    }
    XmlResourceParser localXmlResourceParser = this.ctx.getActivity().getResources().getXml(i);
    String str1 = "";
    String str2 = "";
    j = -1;
    boolean bool = false;
    i = 0;
    label134:
    String str3;
    if (j != 1) {
      if (j == 2)
      {
        str3 = localXmlResourceParser.getName();
        if (str3.equals("url-filter"))
        {
          Log.w(TAG, "Plugin " + str2 + " is using deprecated tag <url-filter>");
          if (this.urlMap.get(str2) == null) {
            this.urlMap.put(str2, new ArrayList(2));
          }
          ((List)this.urlMap.get(str2)).add(localXmlResourceParser.getAttributeValue(null, "value"));
        }
      }
    }
    label499:
    for (;;)
    {
      try
      {
        int k = localXmlResourceParser.next();
        j = k;
        break label134;
        if (str3.equals("feature"))
        {
          str2 = localXmlResourceParser.getAttributeValue(null, "name");
          i = 1;
          continue;
        }
        if ((i == 0) || (!str3.equals("param"))) {
          break label499;
        }
        str3 = localXmlResourceParser.getAttributeValue(null, "name");
        if (str3.equals("service"))
        {
          str2 = localXmlResourceParser.getAttributeValue(null, "value");
          continue;
        }
        if ((str3.equals("package")) || (str3.equals("android-package")))
        {
          str1 = localXmlResourceParser.getAttributeValue(null, "value");
          continue;
        }
        if (!str3.equals("onload")) {
          break label499;
        }
        bool = "true".equals(localXmlResourceParser.getAttributeValue(null, "value"));
        continue;
        if (j != 3) {
          break label499;
        }
        str3 = localXmlResourceParser.getName();
        if ((!str3.equals("feature")) && (!str3.equals("plugin"))) {
          break label499;
        }
        addService(new PluginEntry(str2, str1, bool));
        i = 0;
        str1 = "";
        str2 = "";
        continue;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localXmlPullParserException.printStackTrace();
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
      break label134;
      break;
    }
  }
  
  public void onDestroy()
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      PluginEntry localPluginEntry = (PluginEntry)localIterator.next();
      if (localPluginEntry.plugin != null) {
        localPluginEntry.plugin.onDestroy();
      }
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      PluginEntry localPluginEntry = (PluginEntry)localIterator.next();
      if (localPluginEntry.plugin != null) {
        localPluginEntry.plugin.onNewIntent(paramIntent);
      }
    }
  }
  
  public boolean onOverrideUrlLoading(String paramString)
  {
    Iterator localIterator = this.entries.values().iterator();
    PluginEntry localPluginEntry;
    do
    {
      Object localObject;
      do
      {
        if (!localIterator.hasNext()) {
          return false;
        }
        localPluginEntry = (PluginEntry)localIterator.next();
        localObject = (List)this.urlMap.get(localPluginEntry.service);
        if (localObject == null) {
          break;
        }
        localObject = ((List)localObject).iterator();
      } while (!((Iterator)localObject).hasNext());
      if (!paramString.startsWith((String)((Iterator)localObject).next())) {
        break;
      }
      return getPlugin(localPluginEntry.service).onOverrideUrlLoading(paramString);
    } while ((localPluginEntry.plugin == null) || (!localPluginEntry.plugin.onOverrideUrlLoading(paramString)));
    return true;
  }
  
  public void onPause(boolean paramBoolean)
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      PluginEntry localPluginEntry = (PluginEntry)localIterator.next();
      if (localPluginEntry.plugin != null) {
        localPluginEntry.plugin.onPause(paramBoolean);
      }
    }
  }
  
  public void onReset()
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      CordovaPlugin localCordovaPlugin = ((PluginEntry)localIterator.next()).plugin;
      if (localCordovaPlugin != null) {
        localCordovaPlugin.onReset();
      }
    }
  }
  
  public void onResume(boolean paramBoolean)
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      PluginEntry localPluginEntry = (PluginEntry)localIterator.next();
      if (localPluginEntry.plugin != null) {
        localPluginEntry.plugin.onResume(paramBoolean);
      }
    }
  }
  
  public Object postMessage(String paramString, Object paramObject)
  {
    Object localObject1 = this.ctx.onMessage(paramString, paramObject);
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = this.entries.values().iterator();
    Object localObject2;
    do
    {
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          return null;
        }
        localObject2 = (PluginEntry)((Iterator)localObject1).next();
      } while (((PluginEntry)localObject2).plugin == null);
      localObject2 = ((PluginEntry)localObject2).plugin.onMessage(paramString, paramObject);
    } while (localObject2 == null);
    return localObject2;
  }
  
  Uri remapUri(Uri paramUri)
  {
    Iterator localIterator = this.entries.values().iterator();
    Object localObject;
    do
    {
      do
      {
        if (!localIterator.hasNext()) {
          return null;
        }
        localObject = (PluginEntry)localIterator.next();
      } while (((PluginEntry)localObject).plugin == null);
      localObject = ((PluginEntry)localObject).plugin.remapUri(paramUri);
    } while (localObject == null);
    return (Uri)localObject;
  }
  
  public void startupPlugins()
  {
    Iterator localIterator = this.entries.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      PluginEntry localPluginEntry = (PluginEntry)localIterator.next();
      if (localPluginEntry.onload) {
        localPluginEntry.createPlugin(this.app, this.ctx);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\PluginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */