package org.apache.cordova;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

public class Config
{
  public static final String TAG = "Config";
  private static Config self = null;
  private String startUrl;
  private Whitelist whitelist = new Whitelist();
  
  private Config() {}
  
  private Config(Activity paramActivity)
  {
    if (paramActivity == null) {
      LOG.i("CordovaLog", "There is no activity. Is this on the lock screen?");
    }
    for (;;)
    {
      return;
      int j = paramActivity.getResources().getIdentifier("config", "xml", paramActivity.getClass().getPackage().getName());
      int i = j;
      if (j == 0)
      {
        j = paramActivity.getResources().getIdentifier("config", "xml", paramActivity.getPackageName());
        i = j;
        if (j == 0)
        {
          LOG.i("CordovaLog", "config.xml missing. Ignoring...");
          return;
        }
      }
      this.whitelist.addWhiteListEntry("file:///*", false);
      this.whitelist.addWhiteListEntry("content:///*", false);
      this.whitelist.addWhiteListEntry("data:*", false);
      XmlResourceParser localXmlResourceParser = paramActivity.getResources().getXml(i);
      i = -1;
      while (i != 1)
      {
        Object localObject1;
        String str;
        Object localObject2;
        boolean bool;
        if (i == 2)
        {
          localObject1 = localXmlResourceParser.getName();
          if (!((String)localObject1).equals("access")) {
            break label244;
          }
          localObject1 = localXmlResourceParser.getAttributeValue(null, "origin");
          str = localXmlResourceParser.getAttributeValue(null, "subdomains");
          if (localObject1 != null)
          {
            localObject2 = this.whitelist;
            if ((str == null) || (str.compareToIgnoreCase("true") != 0)) {
              break label238;
            }
            bool = true;
            label214:
            ((Whitelist)localObject2).addWhiteListEntry((String)localObject1, bool);
          }
        }
        try
        {
          for (;;)
          {
            j = localXmlResourceParser.next();
            i = j;
            break;
            label238:
            bool = false;
            break label214;
            label244:
            if (((String)localObject1).equals("log"))
            {
              localObject1 = localXmlResourceParser.getAttributeValue(null, "level");
              Log.d("Config", "The <log> tag is deprecated. Use <preference name=\"loglevel\" value=\"" + (String)localObject1 + "\"/> instead.");
              if (localObject1 != null) {
                LOG.setLogLevel((String)localObject1);
              }
            }
            else if (((String)localObject1).equals("preference"))
            {
              localObject2 = localXmlResourceParser.getAttributeValue(null, "name").toLowerCase(Locale.getDefault());
              if (((String)localObject2).equalsIgnoreCase("LogLevel"))
              {
                LOG.setLogLevel(localXmlResourceParser.getAttributeValue(null, "value"));
              }
              else if (((String)localObject2).equalsIgnoreCase("SplashScreen"))
              {
                str = localXmlResourceParser.getAttributeValue(null, "value");
                localObject1 = str;
                if (str == null) {
                  localObject1 = "splash";
                }
                j = paramActivity.getResources().getIdentifier((String)localObject1, "drawable", paramActivity.getClass().getPackage().getName());
                paramActivity.getIntent().putExtra((String)localObject2, j);
              }
              else if (((String)localObject2).equalsIgnoreCase("BackgroundColor"))
              {
                j = localXmlResourceParser.getAttributeIntValue(null, "value", -16777216);
                paramActivity.getIntent().putExtra((String)localObject2, j);
              }
              else if (((String)localObject2).equalsIgnoreCase("LoadUrlTimeoutValue"))
              {
                j = localXmlResourceParser.getAttributeIntValue(null, "value", 20000);
                paramActivity.getIntent().putExtra((String)localObject2, j);
              }
              else if (((String)localObject2).equalsIgnoreCase("SplashScreenDelay"))
              {
                j = localXmlResourceParser.getAttributeIntValue(null, "value", 3000);
                paramActivity.getIntent().putExtra((String)localObject2, j);
              }
              else if (((String)localObject2).equalsIgnoreCase("KeepRunning"))
              {
                bool = localXmlResourceParser.getAttributeValue(null, "value").equals("true");
                paramActivity.getIntent().putExtra((String)localObject2, bool);
              }
              else if (((String)localObject2).equalsIgnoreCase("InAppBrowserStorageEnabled"))
              {
                bool = localXmlResourceParser.getAttributeValue(null, "value").equals("true");
                paramActivity.getIntent().putExtra((String)localObject2, bool);
              }
              else if (((String)localObject2).equalsIgnoreCase("DisallowOverscroll"))
              {
                bool = localXmlResourceParser.getAttributeValue(null, "value").equals("true");
                paramActivity.getIntent().putExtra((String)localObject2, bool);
              }
              else
              {
                localObject1 = localXmlResourceParser.getAttributeValue(null, "value");
                paramActivity.getIntent().putExtra((String)localObject2, (String)localObject1);
              }
            }
            else if (((String)localObject1).equals("content"))
            {
              str = localXmlResourceParser.getAttributeValue(null, "src");
              LOG.i("CordovaLog", "Found start page location: %s", new Object[] { str });
              if (str != null) {
                if (Pattern.compile("^[a-z-]+://").matcher(str).find())
                {
                  this.startUrl = str;
                }
                else
                {
                  localObject1 = str;
                  if (str.charAt(0) == '/') {
                    localObject1 = str.substring(1);
                  }
                  this.startUrl = ("file:///android_asset/www/" + (String)localObject1);
                }
              }
            }
          }
        }
        catch (XmlPullParserException localXmlPullParserException)
        {
          localXmlPullParserException.printStackTrace();
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
        }
      }
    }
  }
  
  public static void addWhiteListEntry(String paramString, boolean paramBoolean)
  {
    if (self == null)
    {
      Log.e("Config", "Config was not initialised. Did you forget to Config.init(this)?");
      return;
    }
    self.whitelist.addWhiteListEntry(paramString, paramBoolean);
  }
  
  public static String getStartUrl()
  {
    if ((self == null) || (self.startUrl == null)) {
      return "file:///android_asset/www/index.html";
    }
    return self.startUrl;
  }
  
  public static void init()
  {
    if (self == null) {
      self = new Config();
    }
  }
  
  public static void init(Activity paramActivity)
  {
    self = new Config(paramActivity);
  }
  
  public static boolean isUrlWhiteListed(String paramString)
  {
    if (self == null)
    {
      Log.e("Config", "Config was not initialised. Did you forget to Config.init(this)?");
      return false;
    }
    return self.whitelist.isUrlWhiteListed(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\Config.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */