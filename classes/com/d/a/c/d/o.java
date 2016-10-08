package com.d.a.c.d;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

final class o
{
  private static final k[] a = { new k(k.e, ""), new k(k.b, "GET"), new k(k.b, "POST"), new k(k.c, "/"), new k(k.c, "/index.html"), new k(k.d, "http"), new k(k.d, "https"), new k(k.a, "200"), new k(k.a, "204"), new k(k.a, "206"), new k(k.a, "304"), new k(k.a, "400"), new k(k.a, "404"), new k(k.a, "500"), new k("accept-charset", ""), new k("accept-encoding", "gzip, deflate"), new k("accept-language", ""), new k("accept-ranges", ""), new k("accept", ""), new k("access-control-allow-origin", ""), new k("age", ""), new k("allow", ""), new k("authorization", ""), new k("cache-control", ""), new k("content-disposition", ""), new k("content-encoding", ""), new k("content-language", ""), new k("content-length", ""), new k("content-location", ""), new k("content-range", ""), new k("content-type", ""), new k("cookie", ""), new k("date", ""), new k("etag", ""), new k("expect", ""), new k("expires", ""), new k("from", ""), new k("host", ""), new k("if-match", ""), new k("if-modified-since", ""), new k("if-none-match", ""), new k("if-range", ""), new k("if-unmodified-since", ""), new k("last-modified", ""), new k("link", ""), new k("location", ""), new k("max-forwards", ""), new k("proxy-authenticate", ""), new k("proxy-authorization", ""), new k("range", ""), new k("referer", ""), new k("refresh", ""), new k("retry-after", ""), new k("server", ""), new k("set-cookie", ""), new k("strict-transport-security", ""), new k("transfer-encoding", ""), new k("user-agent", ""), new k("vary", ""), new k("via", ""), new k("www-authenticate", "") };
  private static final Map<f, Integer> b = c();
  
  private static f b(f paramf)
  {
    int i = 0;
    int j = paramf.d();
    for (;;)
    {
      if (i >= j) {
        return paramf;
      }
      int k = paramf.a(i);
      if ((k >= 65) && (k <= 90)) {
        throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + paramf.a());
      }
      i += 1;
    }
  }
  
  private static Map<f, Integer> c()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(a.length);
    int i = 0;
    for (;;)
    {
      if (i >= a.length) {
        return Collections.unmodifiableMap(localLinkedHashMap);
      }
      if (!localLinkedHashMap.containsKey(a[i].h)) {
        localLinkedHashMap.put(a[i].h, Integer.valueOf(i));
      }
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */