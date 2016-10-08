package a.a.a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class a
{
  private Properties a = null;
  
  private a()
  {
    c();
  }
  
  a(b paramb)
  {
    this();
  }
  
  static a a()
  {
    return c.a;
  }
  
  private void a(Properties paramProperties)
  {
    this.a = paramProperties;
  }
  
  private boolean a(String paramString)
  {
    return (paramString != null) && (!paramString.equals("(none0)")) && (paramString.startsWith("(")) && (paramString.endsWith(")"));
  }
  
  private String b(char paramChar)
  {
    String str = Integer.toHexString(paramChar).toUpperCase();
    str = b().getProperty(str);
    if (a(str)) {
      return str;
    }
    return null;
  }
  
  private Properties b()
  {
    return this.a;
  }
  
  private void c()
  {
    try
    {
      a(new Properties());
      b().load(f.a("/pinyindb/unicode_to_hanyu_pinyin.txt"));
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      localFileNotFoundException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  String[] a(char paramChar)
  {
    String str = b(paramChar);
    if (str != null)
    {
      int i = str.indexOf("(");
      int j = str.lastIndexOf(")");
      return str.substring(i + "(".length(), j).split(",");
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */