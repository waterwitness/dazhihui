package org.apache.cordova;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Whitelist$URLPattern
{
  public Pattern host;
  public Pattern path;
  public Integer port;
  public Pattern scheme;
  
  public Whitelist$URLPattern(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramString1 != null) {}
    for (;;)
    {
      try
      {
        if ("*".equals(paramString1))
        {
          this.scheme = null;
          if ("*".equals(paramString2))
          {
            this.host = null;
            if ((paramString3 != null) && (!"*".equals(paramString3))) {
              break label165;
            }
            this.port = null;
            if ((paramString4 != null) && (!"/*".equals(paramString4))) {
              break;
            }
            this.path = null;
          }
        }
        else
        {
          this.scheme = Pattern.compile(regexFromPattern(paramString1, false), 2);
          continue;
        }
        if (!paramString2.startsWith("*.")) {
          break label148;
        }
      }
      catch (NumberFormatException paramString1)
      {
        throw new MalformedURLException("Port must be a number");
      }
      this.host = Pattern.compile("([a-z0-9.-]*\\.)?" + regexFromPattern(paramString2.substring(2), false), 2);
      continue;
      label148:
      this.host = Pattern.compile(regexFromPattern(paramString2, false), 2);
      continue;
      label165:
      this.port = Integer.valueOf(Integer.parseInt(paramString3, 10));
    }
    this.path = Pattern.compile(regexFromPattern(paramString4, true));
  }
  
  private String regexFromPattern(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if (i >= paramString.length()) {
      return localStringBuilder.toString();
    }
    char c = paramString.charAt(i);
    if ((c == '*') && (paramBoolean)) {
      localStringBuilder.append(".");
    }
    for (;;)
    {
      localStringBuilder.append(c);
      i += 1;
      break;
      if ("\\.[]{}()^$?+|".indexOf(c) > -1) {
        localStringBuilder.append('\\');
      }
    }
  }
  
  public boolean matches(Uri paramUri)
  {
    boolean bool2 = false;
    try
    {
      boolean bool1;
      if (this.scheme != null)
      {
        bool1 = bool2;
        if (!this.scheme.matcher(paramUri.getScheme()).matches()) {}
      }
      else if (this.host != null)
      {
        bool1 = bool2;
        if (!this.host.matcher(paramUri.getHost()).matches()) {}
      }
      else if (this.port != null)
      {
        bool1 = bool2;
        if (!this.port.equals(Integer.valueOf(paramUri.getPort()))) {}
      }
      else if (this.path != null)
      {
        boolean bool3 = this.path.matcher(paramUri.getPath()).matches();
        bool1 = bool2;
        if (!bool3) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    catch (Exception paramUri)
    {
      LOG.d("Whitelist", paramUri.toString());
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\Whitelist$URLPattern.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */