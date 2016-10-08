package com.android.dazhihui.ui.widget.b;

import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class b
{
  static final String[] a = { "&apos;", "'", "&lt;", "<", "&gt;", ">", "&amp;", "&", "&nbsp;", " ", "&quot;", "\"" };
  static Hashtable b;
  
  public b()
  {
    b = new Hashtable();
    int j = a.length;
    int i = 0;
    while (i < j)
    {
      b.put(a[i], a[(i + 1)]);
      i += 2;
    }
  }
  
  private String b(InputStreamReader paramInputStreamReader)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int j = -1;
    for (;;)
    {
      try
      {
        i = paramInputStreamReader.read();
        if (i != -1) {
          continue;
        }
        j = i;
      }
      catch (Exception paramInputStreamReader)
      {
        int i;
        char c;
        continue;
      }
      if (localStringBuffer.length() != 0) {
        break label90;
      }
      if (j != -1) {
        break;
      }
      return null;
      c = (char)i;
      j = i;
      if (c != '\n')
      {
        j = i;
        if (c != '\r')
        {
          j = i;
          localStringBuffer.append(c);
          j = i;
        }
      }
    }
    return "";
    label90:
    return localStringBuffer.toString();
  }
  
  public c a(Object paramObject)
  {
    c localc = new c((String)paramObject);
    paramObject = localc;
    if (localc.b() == 0) {
      paramObject = null;
    }
    return (c)paramObject;
  }
  
  public String a(String paramString)
  {
    for (;;)
    {
      i = paramString.indexOf("$$");
      if (i <= -1) {
        break;
      }
      paramString = paramString.substring(0, i) + paramString.substring(i + 1);
    }
    StringBuffer localStringBuffer = new StringBuffer("");
    Object localObject1 = new StringBuffer("");
    int k = paramString.length();
    int i = 0;
    int j = 0;
    if (j < k)
    {
      char c = paramString.charAt(j);
      Object localObject2;
      if (i != 0)
      {
        ((StringBuffer)localObject1).append(c);
        localObject2 = localObject1;
        if (c == ';')
        {
          localObject2 = b.get(((StringBuffer)localObject1).toString());
          if (localObject2 != null) {
            localStringBuffer.append((String)localObject2);
          }
          i = 0;
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        j += 1;
        localObject1 = localObject2;
        break;
        if (c == '&')
        {
          localObject2 = new StringBuffer();
          ((StringBuffer)localObject2).append(c);
          i = 1;
        }
        else
        {
          localStringBuffer.append(c);
          localObject2 = localObject1;
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public Vector a(InputStreamReader paramInputStreamReader)
  {
    Vector localVector = new Vector(32);
    Object localObject3 = "";
    for (;;)
    {
      Object localObject1 = b(paramInputStreamReader);
      if (localObject1 == null)
      {
        paramInputStreamReader = ((String)localObject3).trim();
        if (paramInputStreamReader.length() > 0) {
          localVector.addElement(paramInputStreamReader);
        }
        return localVector;
      }
      Object localObject4 = ((String)localObject1).trim();
      if (((String)localObject4).length() != 0)
      {
        Object localObject2 = localObject4;
        localObject1 = localObject3;
        if (((String)localObject3).length() > 0)
        {
          localObject1 = (String)localObject3 + " ";
          localObject2 = localObject4;
        }
        Object localObject6;
        Object localObject5;
        do
        {
          do
          {
            int i = ((String)localObject2).indexOf("<");
            localObject3 = localObject2;
            localObject4 = localObject1;
            if (i != -1)
            {
              localObject1 = ((String)localObject1 + ((String)localObject2).substring(0, i)).trim();
              if (((String)localObject1).length() > 0) {
                localVector.addElement(localObject1);
              }
              localObject4 = "<";
              localObject3 = ((String)localObject2).substring(i + 1);
            }
            i = ((String)localObject3).indexOf(">");
            localObject6 = localObject3;
            localObject5 = localObject4;
            if (i != -1)
            {
              localObject1 = ((String)localObject4 + ((String)localObject3).substring(0, i + 1)).trim();
              if (((String)localObject1).length() > 0) {
                localVector.addElement(localObject1);
              }
              localObject5 = "";
              localObject6 = ((String)localObject3).substring(i + 1);
            }
            localObject2 = localObject6;
            localObject1 = localObject5;
          } while (((String)localObject6).indexOf("<") != -1);
          localObject2 = localObject6;
          localObject1 = localObject5;
        } while (((String)localObject6).indexOf(">") != -1);
        localObject3 = (String)localObject5 + (String)localObject6;
      }
    }
  }
  
  public Vector a(Vector paramVector)
  {
    Hashtable localHashtable = new Hashtable();
    Vector localVector = new Vector();
    Enumeration localEnumeration = paramVector.elements();
    int j = 0;
    int i = -1;
    while (localEnumeration.hasMoreElements())
    {
      paramVector = localEnumeration.nextElement();
      if (paramVector == null) {}
      int k;
      for (paramVector = "";; paramVector = (String)paramVector)
      {
        k = j;
        if (paramVector.startsWith("<!--")) {
          k = 1;
        }
        if (k == 0) {
          break label101;
        }
        j = k;
        if (!paramVector.endsWith("-->")) {
          break;
        }
        j = 0;
        break;
      }
      label101:
      c localc = a(paramVector);
      if (localc != null)
      {
        if (localc.b() == 1)
        {
          i += 1;
          localHashtable.put(new Integer(i), localc);
          localVector.addElement(localc);
          j = k;
        }
        else if (localc.b() == 2)
        {
          if (localHashtable.get(new Integer(i)) == null) {
            throw new Exception(" attempted close of </" + localc.a() + "> at root level");
          }
          if (localc.a().equals(((c)localHashtable.get(new Integer(i))).a()))
          {
            localVector.addElement(localc);
            i -= 1;
            j = k;
          }
          else
          {
            throw new Exception(" attempted close of </" + localc.a() + "> in body of <" + ((c)localHashtable.get(new Integer(i))).a() + ">");
          }
        }
        else
        {
          j = k;
          if (localc.b() == 3)
          {
            localVector.addElement(localc);
            j = k;
          }
        }
      }
      else
      {
        localVector.addElement(new String(a(paramVector)));
        j = k;
      }
    }
    return localVector;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */