package org.apache.cordova;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Whitelist
{
  public static final String TAG = "Whitelist";
  private ArrayList<Whitelist.URLPattern> whiteList = new ArrayList();
  
  public void addWhiteListEntry(String paramString, boolean paramBoolean)
  {
    if (this.whiteList != null) {}
    for (;;)
    {
      Object localObject;
      String str4;
      String str3;
      try
      {
        if (paramString.compareTo("*") == 0)
        {
          LOG.d("Whitelist", "Unlimited access to network resources");
          this.whiteList = null;
          return;
        }
        localObject = Pattern.compile("^((\\*|[A-Za-z-]+)://)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?").matcher(paramString);
        if (!((Matcher)localObject).matches()) {
          break label197;
        }
        str4 = ((Matcher)localObject).group(2);
        str3 = ((Matcher)localObject).group(3);
        if ("file".equals(str4)) {
          break label198;
        }
        String str1 = str3;
        if ("content".equals(str4)) {
          break label198;
        }
        str3 = ((Matcher)localObject).group(7);
        localObject = ((Matcher)localObject).group(8);
        if (str4 == null)
        {
          this.whiteList.add(new Whitelist.URLPattern("http", str1, str3, (String)localObject));
          this.whiteList.add(new Whitelist.URLPattern("https", str1, str3, (String)localObject));
          return;
        }
      }
      catch (Exception localException)
      {
        LOG.d("Whitelist", "Failed to add origin %s", new Object[] { paramString });
        return;
      }
      this.whiteList.add(new Whitelist.URLPattern(str4, localException, str3, (String)localObject));
      label197:
      return;
      label198:
      String str2 = str3;
      if (str3 == null) {
        str2 = "*";
      }
    }
  }
  
  public boolean isUrlWhiteListed(String paramString)
  {
    if (this.whiteList == null) {
      return true;
    }
    paramString = Uri.parse(paramString);
    Iterator localIterator = this.whiteList.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        return false;
      }
    } while (!((Whitelist.URLPattern)localIterator.next()).matches(paramString));
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\Whitelist.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */