package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class ConnectionConfig
  implements Cloneable
{
  public static final ConnectionConfig DEFAULT = new ConnectionConfig.Builder().build();
  private final int bufferSize;
  private final Charset charset;
  private final int fragmentSizeHint;
  private final CodingErrorAction malformedInputAction;
  private final MessageConstraints messageConstraints;
  private final CodingErrorAction unmappableInputAction;
  
  ConnectionConfig(int paramInt1, int paramInt2, Charset paramCharset, CodingErrorAction paramCodingErrorAction1, CodingErrorAction paramCodingErrorAction2, MessageConstraints paramMessageConstraints)
  {
    this.bufferSize = paramInt1;
    this.fragmentSizeHint = paramInt2;
    this.charset = paramCharset;
    this.malformedInputAction = paramCodingErrorAction1;
    this.unmappableInputAction = paramCodingErrorAction2;
    this.messageConstraints = paramMessageConstraints;
  }
  
  public static ConnectionConfig.Builder copy(ConnectionConfig paramConnectionConfig)
  {
    Args.notNull(paramConnectionConfig, "Connection config");
    return new ConnectionConfig.Builder().setCharset(paramConnectionConfig.getCharset()).setMalformedInputAction(paramConnectionConfig.getMalformedInputAction()).setUnmappableInputAction(paramConnectionConfig.getUnmappableInputAction()).setMessageConstraints(paramConnectionConfig.getMessageConstraints());
  }
  
  public static ConnectionConfig.Builder custom()
  {
    return new ConnectionConfig.Builder();
  }
  
  protected ConnectionConfig clone()
  {
    return (ConnectionConfig)super.clone();
  }
  
  public int getBufferSize()
  {
    return this.bufferSize;
  }
  
  public Charset getCharset()
  {
    return this.charset;
  }
  
  public int getFragmentSizeHint()
  {
    return this.fragmentSizeHint;
  }
  
  public CodingErrorAction getMalformedInputAction()
  {
    return this.malformedInputAction;
  }
  
  public MessageConstraints getMessageConstraints()
  {
    return this.messageConstraints;
  }
  
  public CodingErrorAction getUnmappableInputAction()
  {
    return this.unmappableInputAction;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[bufferSize=").append(this.bufferSize).append(", fragmentSizeHint=").append(this.fragmentSizeHint).append(", charset=").append(this.charset).append(", malformedInputAction=").append(this.malformedInputAction).append(", unmappableInputAction=").append(this.unmappableInputAction).append(", messageConstraints=").append(this.messageConstraints).append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\config\ConnectionConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */