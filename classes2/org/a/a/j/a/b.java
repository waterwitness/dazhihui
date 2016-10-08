package org.a.a.j.a;

import java.io.IOException;
import java.util.Hashtable;
import org.a.a.bd;
import org.a.a.bs;
import org.a.a.j.a;
import org.a.a.l;
import org.a.a.m;
import org.a.a.w;

public class b
{
  public static String a(String paramString)
  {
    paramString = org.a.e.b.c(paramString.trim());
    if ((paramString.length() > 0) && (paramString.charAt(0) == '#'))
    {
      l locall = c(paramString);
      if ((locall instanceof w)) {
        paramString = org.a.e.b.c(((w)locall).i_().trim());
      }
    }
    for (;;)
    {
      return b(paramString);
    }
  }
  
  public static String a(org.a.a.d paramd)
  {
    int k = 2;
    StringBuffer localStringBuffer = new StringBuffer();
    int i;
    int j;
    if (((paramd instanceof w)) && (!(paramd instanceof bs)))
    {
      paramd = ((w)paramd).i_();
      if ((paramd.length() > 0) && (paramd.charAt(0) == '#'))
      {
        localStringBuffer.append("\\" + paramd);
        i = localStringBuffer.length();
        if ((localStringBuffer.length() < 2) || (localStringBuffer.charAt(0) != '\\') || (localStringBuffer.charAt(1) != '#')) {
          break label287;
        }
        j = i;
        i = k;
      }
    }
    for (;;)
    {
      if (i != j)
      {
        int m;
        if ((localStringBuffer.charAt(i) != ',') && (localStringBuffer.charAt(i) != '"') && (localStringBuffer.charAt(i) != '\\') && (localStringBuffer.charAt(i) != '+') && (localStringBuffer.charAt(i) != '=') && (localStringBuffer.charAt(i) != '<') && (localStringBuffer.charAt(i) != '>'))
        {
          m = i;
          k = j;
          if (localStringBuffer.charAt(i) != ';') {}
        }
        else
        {
          localStringBuffer.insert(i, "\\");
          m = i + 1;
          k = j + 1;
        }
        i = m + 1;
        j = k;
        continue;
        localStringBuffer.append(paramd);
        break;
        localStringBuffer.append("#" + a(org.a.e.a.d.a(paramd.c().b())));
        break;
      }
      return localStringBuffer.toString();
      label287:
      k = 0;
      j = i;
      i = k;
    }
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length];
    int i = 0;
    while (i != arrayOfChar.length)
    {
      arrayOfChar[i] = ((char)(paramArrayOfByte[i] & 0xFF));
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static void a(StringBuffer paramStringBuffer, a parama, Hashtable paramHashtable)
  {
    paramHashtable = (String)paramHashtable.get(parama.e());
    if (paramHashtable != null) {
      paramStringBuffer.append(paramHashtable);
    }
    for (;;)
    {
      paramStringBuffer.append('=');
      paramStringBuffer.append(a(parama.f()));
      return;
      paramStringBuffer.append(parama.e().e());
    }
  }
  
  public static String b(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString.length() != 0)
    {
      char c1 = paramString.charAt(0);
      localStringBuffer.append(c1);
      int i = 1;
      for (char c2 = c1; i < paramString.length(); c2 = c1)
      {
        c1 = paramString.charAt(i);
        if ((c2 != ' ') || (c1 != ' ')) {
          localStringBuffer.append(c1);
        }
        i += 1;
      }
    }
    return localStringBuffer.toString();
  }
  
  private static l c(String paramString)
  {
    try
    {
      paramString = l.a(org.a.e.a.d.a(paramString.substring(1)));
      return paramString;
    }
    catch (IOException paramString)
    {
      throw new IllegalStateException("unknown encoding in name: " + paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\j\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */