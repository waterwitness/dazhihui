package org.apache.http;

import java.io.Serializable;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class ProtocolVersion
  implements Serializable, Cloneable
{
  private static final long serialVersionUID = 8950662842175091068L;
  protected final int major;
  protected final int minor;
  protected final String protocol;
  
  public ProtocolVersion(String paramString, int paramInt1, int paramInt2)
  {
    this.protocol = ((String)Args.notNull(paramString, "Protocol name"));
    this.major = Args.notNegative(paramInt1, "Protocol minor version");
    this.minor = Args.notNegative(paramInt2, "Protocol minor version");
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public int compareToVersion(ProtocolVersion paramProtocolVersion)
  {
    Args.notNull(paramProtocolVersion, "Protocol version");
    Args.check(this.protocol.equals(paramProtocolVersion.protocol), "Versions for different protocols cannot be compared: %s %s", new Object[] { this, paramProtocolVersion });
    int j = getMajor() - paramProtocolVersion.getMajor();
    int i = j;
    if (j == 0) {
      i = getMinor() - paramProtocolVersion.getMinor();
    }
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof ProtocolVersion)) {
        return false;
      }
      paramObject = (ProtocolVersion)paramObject;
    } while ((this.protocol.equals(((ProtocolVersion)paramObject).protocol)) && (this.major == ((ProtocolVersion)paramObject).major) && (this.minor == ((ProtocolVersion)paramObject).minor));
    return false;
  }
  
  public ProtocolVersion forVersion(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.major) && (paramInt2 == this.minor)) {
      return this;
    }
    return new ProtocolVersion(this.protocol, paramInt1, paramInt2);
  }
  
  public final int getMajor()
  {
    return this.major;
  }
  
  public final int getMinor()
  {
    return this.minor;
  }
  
  public final String getProtocol()
  {
    return this.protocol;
  }
  
  public final boolean greaterEquals(ProtocolVersion paramProtocolVersion)
  {
    return (isComparable(paramProtocolVersion)) && (compareToVersion(paramProtocolVersion) >= 0);
  }
  
  public final int hashCode()
  {
    return this.protocol.hashCode() ^ this.major * 100000 ^ this.minor;
  }
  
  public boolean isComparable(ProtocolVersion paramProtocolVersion)
  {
    return (paramProtocolVersion != null) && (this.protocol.equals(paramProtocolVersion.protocol));
  }
  
  public final boolean lessEquals(ProtocolVersion paramProtocolVersion)
  {
    return (isComparable(paramProtocolVersion)) && (compareToVersion(paramProtocolVersion) <= 0);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.protocol);
    localStringBuilder.append('/');
    localStringBuilder.append(Integer.toString(this.major));
    localStringBuilder.append('.');
    localStringBuilder.append(Integer.toString(this.minor));
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\ProtocolVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */