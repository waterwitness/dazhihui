package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Immutable
public class BasicStatusLine
  implements Serializable, Cloneable, StatusLine
{
  private static final long serialVersionUID = -2443303766890459269L;
  private final ProtocolVersion protoVersion;
  private final String reasonPhrase;
  private final int statusCode;
  
  public BasicStatusLine(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    this.protoVersion = ((ProtocolVersion)Args.notNull(paramProtocolVersion, "Version"));
    this.statusCode = Args.notNegative(paramInt, "Status code");
    this.reasonPhrase = paramString;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return this.protoVersion;
  }
  
  public String getReasonPhrase()
  {
    return this.reasonPhrase;
  }
  
  public int getStatusCode()
  {
    return this.statusCode;
  }
  
  public String toString()
  {
    return BasicLineFormatter.INSTANCE.formatStatusLine(null, this).toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicStatusLine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */