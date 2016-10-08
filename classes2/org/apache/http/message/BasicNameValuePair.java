package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Immutable
public class BasicNameValuePair
  implements Serializable, Cloneable, NameValuePair
{
  private static final long serialVersionUID = -6437800749411518984L;
  private final String name;
  private final String value;
  
  public BasicNameValuePair(String paramString1, String paramString2)
  {
    this.name = ((String)Args.notNull(paramString1, "Name"));
    this.value = paramString2;
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
      if (!(paramObject instanceof NameValuePair)) {
        break;
      }
      paramObject = (BasicNameValuePair)paramObject;
    } while ((this.name.equals(((BasicNameValuePair)paramObject).name)) && (LangUtils.equals(this.value, ((BasicNameValuePair)paramObject).value)));
    return false;
    return false;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    return LangUtils.hashCode(LangUtils.hashCode(17, this.name), this.value);
  }
  
  public String toString()
  {
    if (this.value == null) {
      return this.name;
    }
    StringBuilder localStringBuilder = new StringBuilder(this.name.length() + 1 + this.value.length());
    localStringBuilder.append(this.name);
    localStringBuilder.append("=");
    localStringBuilder.append(this.value);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicNameValuePair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */