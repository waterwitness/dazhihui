package org.apache.http.config;

public class MessageConstraints$Builder
{
  private int maxHeaderCount = -1;
  private int maxLineLength = -1;
  
  public MessageConstraints build()
  {
    return new MessageConstraints(this.maxLineLength, this.maxHeaderCount);
  }
  
  public Builder setMaxHeaderCount(int paramInt)
  {
    this.maxHeaderCount = paramInt;
    return this;
  }
  
  public Builder setMaxLineLength(int paramInt)
  {
    this.maxLineLength = paramInt;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\config\MessageConstraints$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */