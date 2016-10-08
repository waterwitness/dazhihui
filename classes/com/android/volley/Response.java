package com.android.volley;

public class Response<T>
{
  public final Cache.Entry cacheEntry;
  public final VolleyError error;
  public boolean intermediate = false;
  public final T result;
  
  private Response(VolleyError paramVolleyError)
  {
    this.result = null;
    this.cacheEntry = null;
    this.error = paramVolleyError;
  }
  
  private Response(T paramT, Cache.Entry paramEntry)
  {
    this.result = paramT;
    this.cacheEntry = paramEntry;
    this.error = null;
  }
  
  public static <T> Response<T> error(VolleyError paramVolleyError)
  {
    return new Response(paramVolleyError);
  }
  
  public static <T> Response<T> success(T paramT, Cache.Entry paramEntry)
  {
    return new Response(paramT, paramEntry);
  }
  
  public boolean isSuccess()
  {
    return this.error == null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */