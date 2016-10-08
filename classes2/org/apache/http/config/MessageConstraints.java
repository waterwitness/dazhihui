package org.apache.http.config;

import org.apache.http.util.Args;

public class MessageConstraints
  implements Cloneable
{
  public static final MessageConstraints DEFAULT = new MessageConstraints.Builder().build();
  private final int maxHeaderCount;
  private final int maxLineLength;
  
  MessageConstraints(int paramInt1, int paramInt2)
  {
    this.maxLineLength = paramInt1;
    this.maxHeaderCount = paramInt2;
  }
  
  public static MessageConstraints.Builder copy(MessageConstraints paramMessageConstraints)
  {
    Args.notNull(paramMessageConstraints, "Message constraints");
    return new MessageConstraints.Builder().setMaxHeaderCount(paramMessageConstraints.getMaxHeaderCount()).setMaxLineLength(paramMessageConstraints.getMaxLineLength());
  }
  
  public static MessageConstraints.Builder custom()
  {
    return new MessageConstraints.Builder();
  }
  
  public static MessageConstraints lineLen(int paramInt)
  {
    return new MessageConstraints(Args.notNegative(paramInt, "Max line length"), -1);
  }
  
  protected MessageConstraints clone()
  {
    return (MessageConstraints)super.clone();
  }
  
  public int getMaxHeaderCount()
  {
    return this.maxHeaderCount;
  }
  
  public int getMaxLineLength()
  {
    return this.maxLineLength;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[maxLineLength=").append(this.maxLineLength).append(", maxHeaderCount=").append(this.maxHeaderCount).append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\config\MessageConstraints.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */