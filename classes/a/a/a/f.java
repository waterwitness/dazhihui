package a.a.a;

import java.io.BufferedInputStream;

class f
{
  static Class a;
  
  static BufferedInputStream a(String paramString)
  {
    Class localClass;
    if (a == null)
    {
      localClass = b("a.a.a.f");
      a = localClass;
    }
    for (;;)
    {
      return new BufferedInputStream(localClass.getResourceAsStream(paramString));
      localClass = a;
    }
  }
  
  static Class b(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new NoClassDefFoundError(paramString.getMessage());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\a\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */