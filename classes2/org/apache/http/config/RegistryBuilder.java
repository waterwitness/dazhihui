package org.apache.http.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public final class RegistryBuilder<I>
{
  private final Map<String, I> items = new HashMap();
  
  public static <I> RegistryBuilder<I> create()
  {
    return new RegistryBuilder();
  }
  
  public Registry<I> build()
  {
    return new Registry(this.items);
  }
  
  public RegistryBuilder<I> register(String paramString, I paramI)
  {
    Args.notEmpty(paramString, "ID");
    Args.notNull(paramI, "Item");
    this.items.put(paramString.toLowerCase(Locale.US), paramI);
    return this;
  }
  
  public String toString()
  {
    return this.items.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\config\RegistryBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */