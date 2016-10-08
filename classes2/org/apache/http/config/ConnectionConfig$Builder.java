package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;

public class ConnectionConfig$Builder
{
  private int bufferSize;
  private Charset charset;
  private int fragmentSizeHint = -1;
  private CodingErrorAction malformedInputAction;
  private MessageConstraints messageConstraints;
  private CodingErrorAction unmappableInputAction;
  
  public ConnectionConfig build()
  {
    Charset localCharset2 = this.charset;
    Charset localCharset1 = localCharset2;
    if (localCharset2 == null) {
      if (this.malformedInputAction == null)
      {
        localCharset1 = localCharset2;
        if (this.unmappableInputAction == null) {}
      }
      else
      {
        localCharset1 = Consts.ASCII;
      }
    }
    int i;
    if (this.bufferSize > 0)
    {
      i = this.bufferSize;
      if (this.fragmentSizeHint < 0) {
        break label87;
      }
    }
    label87:
    for (int j = this.fragmentSizeHint;; j = i)
    {
      return new ConnectionConfig(i, j, localCharset1, this.malformedInputAction, this.unmappableInputAction, this.messageConstraints);
      i = 8192;
      break;
    }
  }
  
  public Builder setBufferSize(int paramInt)
  {
    this.bufferSize = paramInt;
    return this;
  }
  
  public Builder setCharset(Charset paramCharset)
  {
    this.charset = paramCharset;
    return this;
  }
  
  public Builder setFragmentSizeHint(int paramInt)
  {
    this.fragmentSizeHint = paramInt;
    return this;
  }
  
  public Builder setMalformedInputAction(CodingErrorAction paramCodingErrorAction)
  {
    this.malformedInputAction = paramCodingErrorAction;
    if ((paramCodingErrorAction != null) && (this.charset == null)) {
      this.charset = Consts.ASCII;
    }
    return this;
  }
  
  public Builder setMessageConstraints(MessageConstraints paramMessageConstraints)
  {
    this.messageConstraints = paramMessageConstraints;
    return this;
  }
  
  public Builder setUnmappableInputAction(CodingErrorAction paramCodingErrorAction)
  {
    this.unmappableInputAction = paramCodingErrorAction;
    if ((paramCodingErrorAction != null) && (this.charset == null)) {
      this.charset = Consts.ASCII;
    }
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\config\ConnectionConfig$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */