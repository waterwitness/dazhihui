package com.d.a.c.d;

import com.d.a.c.bn;
import java.util.List;

final class as
{
  private static final List<String> a = at.a(new String[] { "connection", "host", "keep-alive", "proxy-connection", "transfer-encoding" });
  private static final List<String> b = at.a(new String[] { "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade" });
  
  static boolean a(bn parambn, String paramString)
  {
    if (parambn == bn.c) {
      return a.contains(paramString.toLowerCase());
    }
    if (parambn == bn.d) {
      return b.contains(paramString.toLowerCase());
    }
    throw new AssertionError(parambn);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */