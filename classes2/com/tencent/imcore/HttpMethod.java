package com.tencent.imcore;

public final class HttpMethod
{
  public static final HttpMethod kDelete;
  public static final HttpMethod kGet;
  public static final HttpMethod kPost = new HttpMethod("kPost", internalJNI.kPost_get());
  public static final HttpMethod kPut;
  private static int swigNext = 0;
  private static HttpMethod[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kGet = new HttpMethod("kGet");
    kPut = new HttpMethod("kPut");
    kDelete = new HttpMethod("kDelete");
    swigValues = new HttpMethod[] { kPost, kGet, kPut, kDelete };
  }
  
  private HttpMethod(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private HttpMethod(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private HttpMethod(String paramString, HttpMethod paramHttpMethod)
  {
    this.swigName = paramString;
    this.swigValue = paramHttpMethod.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static HttpMethod swigToEnum(int paramInt)
  {
    if ((paramInt < swigValues.length) && (paramInt >= 0) && (swigValues[paramInt].swigValue == paramInt)) {
      return swigValues[paramInt];
    }
    int i = 0;
    while (i < swigValues.length)
    {
      if (swigValues[i].swigValue == paramInt) {
        return swigValues[i];
      }
      i += 1;
    }
    throw new IllegalArgumentException("No enum " + HttpMethod.class + " with value " + paramInt);
  }
  
  public final int swigValue()
  {
    return this.swigValue;
  }
  
  public final String toString()
  {
    return this.swigName;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\HttpMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */