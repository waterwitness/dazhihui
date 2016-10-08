package com.android.dazhihui.ui.widget.b;

public class d
{
  public static int a = -1;
  public static int b = 16;
  public static int[] c = new int[b];
  public static int d = -1;
  public static int e = 16;
  public static String[] f = new String[e];
  public static int g = -1;
  
  public static String a(String paramString)
  {
    if (paramString == null)
    {
      localObject1 = "";
      return (String)localObject1;
    }
    if ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://"))) {}
    for (Object localObject1 = "http://" + paramString;; localObject1 = paramString)
    {
      int i = ((String)localObject1).indexOf("?");
      Object localObject2 = localObject1;
      if (i > 0) {
        localObject2 = ((String)localObject1).substring(0, i);
      }
      i = ((String)localObject2).length() - 1;
      while ((i >= 0) && (((String)localObject2).charAt(i) != '/') && (((String)localObject2).charAt(i) != '\\')) {
        i -= 1;
      }
      localObject2 = ((String)localObject2).substring(0, i + 1);
      localObject1 = localObject2;
      if (!((String)localObject2).equals("http://")) {
        break;
      }
      return paramString + "/";
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */