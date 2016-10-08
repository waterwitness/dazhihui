package a.a.a;

import a.a.a.a.b;
import a.a.a.a.c;

class d
{
  private static String a(String paramString)
  {
    String str = paramString.toLowerCase();
    paramString = str;
    int m;
    int i;
    int k;
    int j;
    if (str.matches("[a-z]*[1-5]?"))
    {
      if (!str.matches("[a-z]*[1-5]")) {
        break label256;
      }
      m = Character.getNumericValue(str.charAt(str.length() - 1));
      i = str.indexOf('a');
      k = str.indexOf('e');
      j = str.indexOf("ou");
      if (-1 == i) {
        break label172;
      }
      j = 97;
    }
    for (;;)
    {
      paramString = str;
      if (36 != j)
      {
        paramString = str;
        if (-1 != i)
        {
          char c = "āáăàaēéĕèeīíĭìiōóŏòoūúŭùuǖǘǚǜü".charAt("aeiouv".indexOf(j) * 5 + (m - 1));
          paramString = new StringBuffer();
          paramString.append(str.substring(0, i).replaceAll("v", "ü"));
          paramString.append(c);
          paramString.append(str.substring(i + 1, str.length() - 1).replaceAll("v", "ü"));
          paramString = paramString.toString();
        }
      }
      return paramString;
      label172:
      if (-1 != k)
      {
        i = k;
        j = 101;
      }
      else if (-1 != j)
      {
        k = "ou".charAt(0);
        i = j;
        j = k;
      }
      else
      {
        i = str.length() - 1;
        for (;;)
        {
          if (i >= 0)
          {
            if (String.valueOf(str.charAt(i)).matches("[aeiouv]"))
            {
              j = str.charAt(i);
              break;
            }
            i -= 1;
            continue;
            label256:
            return str.replaceAll("v", "ü");
          }
        }
        i = -1;
        j = 36;
      }
    }
  }
  
  static String a(String paramString, b paramb)
  {
    if ((c.c == paramb.c()) && ((a.a.a.a.d.b == paramb.d()) || (a.a.a.a.d.a == paramb.d()))) {
      throw new a.a.a.a.a.a("tone marks cannot be added to v or u:");
    }
    String str;
    if (c.b == paramb.c())
    {
      str = paramString.replaceAll("[1-5]", "");
      if (a.a.a.a.d.b != paramb.d()) {
        break label124;
      }
      paramString = str.replaceAll("u:", "v");
    }
    for (;;)
    {
      str = paramString;
      if (a.a.a.a.a.a == paramb.b()) {
        str = paramString.toUpperCase();
      }
      return str;
      str = paramString;
      if (c.c != paramb.c()) {
        break;
      }
      str = a(paramString.replaceAll("u:", "v"));
      break;
      label124:
      paramString = str;
      if (a.a.a.a.d.c == paramb.d()) {
        paramString = str.replaceAll("u:", "ü");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\a\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */