package com.android.dazhihui.ui.delegate.b;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class h
{
  private String a;
  private Hashtable b = new Hashtable();
  private Hashtable[] c;
  private StringBuffer d;
  
  public h() {}
  
  public h(String paramString)
  {
    this.a = paramString;
  }
  
  public static h a(byte[] paramArrayOfByte)
  {
    try
    {
      h localh = c(new String(paramArrayOfByte, "GBK"));
      return localh;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return c(new String(paramArrayOfByte));
  }
  
  private static String a(Hashtable paramHashtable, String paramString)
  {
    return (String)paramHashtable.get(paramString);
  }
  
  private void a(StringBuffer paramStringBuffer, String[] paramArrayOfString, String paramString)
  {
    paramStringBuffer.append("+");
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      paramStringBuffer.append("-").append(paramArrayOfString[i]).append("-").append("+");
      i += 1;
    }
    paramStringBuffer.append(paramString);
  }
  
  private void a(StringBuffer paramStringBuffer, String[] paramArrayOfString1, String[] paramArrayOfString2, String paramString1, String paramString2)
  {
    if (paramArrayOfString1 == null) {
      return;
    }
    paramStringBuffer.append(paramString2);
    int i = 0;
    if (i < paramArrayOfString1.length)
    {
      if (paramArrayOfString1[i] == null) {}
      for (String str = "NULL";; str = paramArrayOfString1[i])
      {
        byte[] arrayOfByte = str.getBytes();
        paramStringBuffer.append(" ").append(str).append(paramArrayOfString2[i].substring(arrayOfByte.length)).append(" ").append(paramString2);
        i += 1;
        break;
      }
    }
    paramStringBuffer.append(paramString1);
  }
  
  private static void a(Hashtable paramHashtable, String paramString, int paramInt)
  {
    paramHashtable.put(paramString, String.valueOf(paramInt));
  }
  
  private static void a(Hashtable paramHashtable, String paramString, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    int m = 0;
    int j = paramInt1;
    paramInt1 = i;
    if (paramInt1 < paramInt2)
    {
      int n = paramString.charAt(paramInt1);
      int k;
      if ((n == 61) && (m == 0))
      {
        i = paramInt1;
        k = j;
      }
      for (;;)
      {
        paramInt1 += 1;
        m = i;
        j = k;
        break;
        i = m;
        k = j;
        if (n == 1)
        {
          i = m;
          k = j;
          if (j <= m)
          {
            i = m;
            k = j;
            if (m + 1 <= paramInt1)
            {
              paramHashtable.put(paramString.substring(j, m), paramString.substring(m + 1, paramInt1));
              k = paramInt1 + 1;
              i = 0;
            }
          }
        }
      }
    }
  }
  
  private static void a(Hashtable paramHashtable, String paramString1, String paramString2)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "";
    }
    paramHashtable.put(paramString1, str);
  }
  
  private void a(String[] paramArrayOfString)
  {
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      int j = i + 1;
      while (j < paramArrayOfString.length)
      {
        if ((paramArrayOfString[i].length() > paramArrayOfString[j].length()) || (paramArrayOfString[i].compareTo(paramArrayOfString[j]) > 0))
        {
          String str = paramArrayOfString[i];
          paramArrayOfString[i] = paramArrayOfString[j];
          paramArrayOfString[j] = str;
        }
        j += 1;
      }
      i += 1;
    }
  }
  
  private static String[] a(Hashtable paramHashtable)
  {
    String[] arrayOfString = new String[paramHashtable.size()];
    paramHashtable = paramHashtable.keys();
    int i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = ((String)paramHashtable.nextElement());
      i += 1;
    }
    return arrayOfString;
  }
  
  private static int b(Hashtable paramHashtable, String paramString)
  {
    paramHashtable = (String)paramHashtable.get(paramString);
    if (paramHashtable == null) {
      return -1;
    }
    return Integer.parseInt(paramHashtable);
  }
  
  public static h b(byte[] paramArrayOfByte)
  {
    if (o.a) {
      try
      {
        h localh = c(new String(paramArrayOfByte, "GBK"));
        return localh;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        return c(new String(paramArrayOfByte));
      }
    }
    return c(g.c(paramArrayOfByte));
  }
  
  public static h c(String paramString)
  {
    int m = 0;
    if ((paramString == null) || (paramString.length() == 0)) {}
    do
    {
      do
      {
        return null;
        paramString = paramString + "\001";
        i = paramString.indexOf("\00121004=");
      } while (i == -1);
      i += 7;
      j = paramString.indexOf("\001", i);
    } while (j == -1);
    h localh = new h();
    localh.a = paramString.substring(i, j).trim();
    int k = paramString.indexOf("\00121000=", j);
    Object localObject = localh.b;
    if (k == -1) {}
    for (int i = paramString.length();; i = k + 1)
    {
      a((Hashtable)localObject, paramString, j + 1, i);
      if (k != -1) {
        break;
      }
      return localh;
    }
    localObject = new Vector();
    for (int j = 1;; j = i)
    {
      int n = paramString.indexOf("\00121002=", k + 7);
      if (n == -1)
      {
        i = paramString.indexOf("\001", k + 7);
        j = paramString.indexOf("\00121001=", i);
        if (j > i) {
          a(localh.b, paramString, i + 1, j + 1);
        }
      }
      do
      {
        do
        {
          if (((Vector)localObject).size() != 0) {
            break;
          }
          return localh;
          i = j;
          if (j != 0)
          {
            i = paramString.indexOf("\001", k + 7);
            if (n > i) {
              a(localh.b, paramString, i + 1, n + 1);
            }
            i = 0;
          }
          j = paramString.indexOf("\001", n + 7);
        } while (j == -1);
        k = paramString.indexOf("\00121003=", j);
      } while (k == -1);
      Hashtable localHashtable = new Hashtable();
      a(localHashtable, paramString, j + 1, k + 1);
      ((Vector)localObject).addElement(localHashtable);
    }
    localh.c = new Hashtable[((Vector)localObject).size()];
    i = m;
    while (i < ((Vector)localObject).size())
    {
      localh.c[i] = ((Hashtable)((Vector)localObject).elementAt(i));
      i += 1;
    }
    return localh;
  }
  
  private String c(String paramString1, String paramString2)
  {
    int n = 0;
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("   +---------------+").append(paramString1);
    localStringBuffer.append("   | 21004 : ").append(this.a).append(paramString1);
    Object localObject1 = new String[this.b.size()];
    Object localObject2 = this.b.keys();
    int i = 0;
    while (i < localObject1.length)
    {
      localObject1[i] = ((String)((Enumeration)localObject2).nextElement());
      i += 1;
    }
    a((String[])localObject1);
    i = 0;
    Object localObject3;
    while (i < localObject1.length)
    {
      localObject2 = localObject1[i];
      localObject3 = (String)this.b.get(localObject2);
      localStringBuffer.append("   | ").append((String)localObject2).append("     ".substring(((String)localObject2).length())).append(" : ").append((String)localObject3).append(paramString1);
      i += 1;
    }
    int j;
    String[] arrayOfString1;
    String[] arrayOfString2;
    if (this.c != null)
    {
      localObject1 = new Vector();
      i = 0;
      while (i < this.c.length)
      {
        localObject2 = this.c[i].keys();
        while (((Enumeration)localObject2).hasMoreElements())
        {
          localObject3 = (String)((Enumeration)localObject2).nextElement();
          if (((Vector)localObject1).indexOf(localObject3) == -1) {
            ((Vector)localObject1).addElement(localObject3);
          }
        }
        i += 1;
      }
      localObject2 = new String[((Vector)localObject1).size()];
      i = 0;
      while (i < localObject2.length)
      {
        localObject2[i] = ((String)((Vector)localObject1).elementAt(i));
        i += 1;
      }
      a((String[])localObject2);
      localObject3 = (String[][])Array.newInstance(String.class, new int[] { this.c.length, localObject2.length });
      i = 0;
      while (i < localObject2.length)
      {
        j = 0;
        while (j < this.c.length)
        {
          localObject3[j][i] = ((String)this.c[j].get(localObject2[i]));
          j += 1;
        }
        i += 1;
      }
      arrayOfString1 = new String[localObject2.length];
      arrayOfString2 = new String[localObject2.length];
      j = 0;
      if (j < localObject2.length)
      {
        localObject1 = localObject2[j].getBytes();
        if (localObject1.length <= 0) {
          break label689;
        }
      }
    }
    label689:
    for (i = localObject1.length;; i = 0)
    {
      int k = 0;
      if (k < localObject3.length)
      {
        if (localObject3[k][j] == null) {}
        for (localObject1 = "NULL";; localObject1 = localObject3[k][j])
        {
          localObject1 = ((String)localObject1).getBytes();
          int m = i;
          if (localObject1.length > i) {
            m = localObject1.length;
          }
          k += 1;
          i = m;
          break;
        }
      }
      localObject1 = new char[i];
      char[] arrayOfChar = new char[i];
      k = 0;
      while (k < i)
      {
        localObject1[k] = 32;
        arrayOfChar[k] = '-';
        k += 1;
      }
      arrayOfString1[j] = new String((char[])localObject1);
      arrayOfString2[j] = new String(arrayOfChar);
      j += 1;
      break;
      a(localStringBuffer, arrayOfString2, paramString1);
      a(localStringBuffer, (String[])localObject2, arrayOfString1, paramString1, paramString2);
      a(localStringBuffer, arrayOfString2, paramString1);
      i = n;
      while (i < localObject3.length)
      {
        a(localStringBuffer, localObject3[i], arrayOfString1, paramString1, paramString2);
        i += 1;
      }
      a(localStringBuffer, arrayOfString2, paramString1);
      return localStringBuffer.toString();
    }
  }
  
  public h a(String paramString, int paramInt)
  {
    a(this.b, paramString, paramInt);
    return this;
  }
  
  public h a(String paramString1, String paramString2)
  {
    a(this.b, paramString1, paramString2);
    return this;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String a(int paramInt, String paramString)
  {
    if (this.c == null) {
      return null;
    }
    return a(this.c[paramInt], paramString);
  }
  
  public String a(String paramString)
  {
    return a(this.b, paramString);
  }
  
  public String[] a(int paramInt)
  {
    return a(this.c[paramInt]);
  }
  
  public int b(int paramInt, String paramString)
  {
    return b(this.c[paramInt], paramString);
  }
  
  public int b(String paramString)
  {
    return b(this.b, paramString);
  }
  
  public h b(String paramString1, String paramString2)
  {
    this.d.append(paramString1).append("=").append(paramString2).append("\001");
    return this;
  }
  
  public void b(int paramInt)
  {
    this.d = new StringBuffer();
    this.d.append("21000").append("=").append(paramInt).append("\001");
  }
  
  public boolean b()
  {
    return d() == null;
  }
  
  public String c()
  {
    return a("21008");
  }
  
  public void c(int paramInt)
  {
    this.d.append("21001").append("=").append(paramInt).append("\001");
  }
  
  public String d()
  {
    return a("21009");
  }
  
  public void d(int paramInt)
  {
    this.d.append("21002").append("=").append(paramInt).append("\001");
  }
  
  public void e(int paramInt)
  {
    this.d.append("21003").append("=").append(paramInt).append("\001");
  }
  
  public String[] e()
  {
    return a(this.b);
  }
  
  public Hashtable[] f()
  {
    return this.c;
  }
  
  public int g()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.length;
  }
  
  public byte[] h()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("8=DZH1.0\001");
    localStringBuffer.append("21004=").append(this.a).append("\001");
    Object localObject = this.b.keys();
    while (((Enumeration)localObject).hasMoreElements())
    {
      String str1 = (String)((Enumeration)localObject).nextElement();
      String str2 = (String)this.b.get(str1);
      localStringBuffer.append(str1).append("=").append(str2).append("\001");
    }
    if (this.a.equals("11100")) {
      localStringBuffer.append("1202").append("=").append(com.android.dazhihui.g.a.r()).append("\001");
    }
    localStringBuffer.append("1750").append("=").append("2").append("\001");
    if ((o.a) && (this.a.equals("10000"))) {
      try
      {
        localObject = localStringBuffer.toString().getBytes("GBK");
        return (byte[])localObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        return localStringBuffer.toString().getBytes();
      }
    }
    return g.b(localStringBuffer.toString());
  }
  
  public byte[] i()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("8=DZH1.0\001");
    localStringBuffer.append("21004=").append(this.a).append("\001");
    Object localObject = this.b.keys();
    while (((Enumeration)localObject).hasMoreElements())
    {
      String str1 = (String)((Enumeration)localObject).nextElement();
      String str2 = (String)this.b.get(str1);
      localStringBuffer.append(str1).append("=").append(str2).append("\001");
    }
    if (this.a.equals("11100")) {
      localStringBuffer.append("1202").append("=").append(com.android.dazhihui.g.a.r()).append("\001");
    }
    localStringBuffer.append("1750").append("=").append("2").append("\001");
    try
    {
      localObject = localStringBuffer.toString().getBytes("GBK");
      return (byte[])localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return localStringBuffer.toString().getBytes();
  }
  
  public byte[] j()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("8=DZH1.0\001");
    localStringBuffer.append("21004=").append(this.a).append("\001");
    Enumeration localEnumeration = this.b.keys();
    while (localEnumeration.hasMoreElements())
    {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = (String)this.b.get(str1);
      localStringBuffer.append(str1).append("=").append(str2).append("\001");
    }
    localStringBuffer.append(this.d);
    return g.b(localStringBuffer.toString());
  }
  
  public String toString()
  {
    return c("\r\n", "|");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */