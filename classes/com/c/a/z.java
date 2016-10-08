package com.c.a;

import java.util.Map.Entry;
import java.util.Set;

public final class z
  extends w
{
  private final com.c.a.b.w<String, w> a = new com.c.a.b.w();
  
  public void a(String paramString, w paramw)
  {
    Object localObject = paramw;
    if (paramw == null) {
      localObject = y.a;
    }
    this.a.put(paramString, localObject);
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof z)) && (((z)paramObject).a.equals(this.a)));
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public Set<Map.Entry<String, w>> o()
  {
    return this.a.entrySet();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */