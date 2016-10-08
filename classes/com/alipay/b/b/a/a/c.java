package com.alipay.b.b.a.a;

public class c
  extends RuntimeException
{
  private String a;
  private int b;
  private String c;
  
  public c(Integer paramInteger, String paramString)
  {
    super(a(paramInteger, paramString));
    this.b = paramInteger.intValue();
    this.c = paramString;
  }
  
  public c(Integer paramInteger, String paramString, Throwable paramThrowable)
  {
    super(a(paramInteger, paramString), paramThrowable);
    this.b = paramInteger.intValue();
    this.c = paramString;
  }
  
  private static String a(Integer paramInteger, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RPCException: ");
    if (paramInteger != null) {
      localStringBuilder.append("[").append(paramInteger).append("]");
    }
    localStringBuilder.append(" : ");
    if (paramString != null) {
      localStringBuilder.append(paramString);
    }
    return localStringBuilder.toString();
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */