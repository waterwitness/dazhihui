package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@NotThreadSafe
public class BasicHeaderElement
  implements Cloneable, HeaderElement
{
  private final String name;
  private final NameValuePair[] parameters;
  private final String value;
  
  public BasicHeaderElement(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }
  
  public BasicHeaderElement(String paramString1, String paramString2, NameValuePair[] paramArrayOfNameValuePair)
  {
    this.name = ((String)Args.notNull(paramString1, "Name"));
    this.value = paramString2;
    if (paramArrayOfNameValuePair != null)
    {
      this.parameters = paramArrayOfNameValuePair;
      return;
    }
    this.parameters = new NameValuePair[0];
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof HeaderElement)) {
        break;
      }
      paramObject = (BasicHeaderElement)paramObject;
    } while ((this.name.equals(((BasicHeaderElement)paramObject).name)) && (LangUtils.equals(this.value, ((BasicHeaderElement)paramObject).value)) && (LangUtils.equals(this.parameters, ((BasicHeaderElement)paramObject).parameters)));
    return false;
    return false;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public NameValuePair getParameter(int paramInt)
  {
    return this.parameters[paramInt];
  }
  
  public NameValuePair getParameterByName(String paramString)
  {
    Args.notNull(paramString, "Name");
    NameValuePair[] arrayOfNameValuePair = this.parameters;
    int j = arrayOfNameValuePair.length;
    int i = 0;
    while (i < j)
    {
      NameValuePair localNameValuePair = arrayOfNameValuePair[i];
      if (localNameValuePair.getName().equalsIgnoreCase(paramString)) {
        return localNameValuePair;
      }
      i += 1;
    }
    return null;
  }
  
  public int getParameterCount()
  {
    return this.parameters.length;
  }
  
  public NameValuePair[] getParameters()
  {
    return (NameValuePair[])this.parameters.clone();
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    int j = LangUtils.hashCode(LangUtils.hashCode(17, this.name), this.value);
    NameValuePair[] arrayOfNameValuePair = this.parameters;
    int k = arrayOfNameValuePair.length;
    int i = 0;
    while (i < k)
    {
      j = LangUtils.hashCode(j, arrayOfNameValuePair[i]);
      i += 1;
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.name);
    if (this.value != null)
    {
      localStringBuilder.append("=");
      localStringBuilder.append(this.value);
    }
    NameValuePair[] arrayOfNameValuePair = this.parameters;
    int j = arrayOfNameValuePair.length;
    int i = 0;
    while (i < j)
    {
      NameValuePair localNameValuePair = arrayOfNameValuePair[i];
      localStringBuilder.append("; ");
      localStringBuilder.append(localNameValuePair);
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicHeaderElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */