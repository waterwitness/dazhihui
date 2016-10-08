package com.squareup.okhttp.internal.spdy;

import java.util.Arrays;
import java.util.List;

final class Hpack
{
  static final List<Hpack.HeaderEntry> INITIAL_CLIENT_TO_SERVER_HEADER_TABLE = Arrays.asList(new Hpack.HeaderEntry[] { new Hpack.HeaderEntry(":scheme", "http"), new Hpack.HeaderEntry(":scheme", "https"), new Hpack.HeaderEntry(":host", ""), new Hpack.HeaderEntry(":path", "/"), new Hpack.HeaderEntry(":method", "GET"), new Hpack.HeaderEntry("accept", ""), new Hpack.HeaderEntry("accept-charset", ""), new Hpack.HeaderEntry("accept-encoding", ""), new Hpack.HeaderEntry("accept-language", ""), new Hpack.HeaderEntry("cookie", ""), new Hpack.HeaderEntry("if-modified-since", ""), new Hpack.HeaderEntry("user-agent", ""), new Hpack.HeaderEntry("referer", ""), new Hpack.HeaderEntry("authorization", ""), new Hpack.HeaderEntry("allow", ""), new Hpack.HeaderEntry("cache-control", ""), new Hpack.HeaderEntry("connection", ""), new Hpack.HeaderEntry("content-length", ""), new Hpack.HeaderEntry("content-type", ""), new Hpack.HeaderEntry("date", ""), new Hpack.HeaderEntry("expect", ""), new Hpack.HeaderEntry("from", ""), new Hpack.HeaderEntry("if-match", ""), new Hpack.HeaderEntry("if-none-match", ""), new Hpack.HeaderEntry("if-range", ""), new Hpack.HeaderEntry("if-unmodified-since", ""), new Hpack.HeaderEntry("max-forwards", ""), new Hpack.HeaderEntry("proxy-authorization", ""), new Hpack.HeaderEntry("range", ""), new Hpack.HeaderEntry("via", "") });
  static final int INITIAL_CLIENT_TO_SERVER_HEADER_TABLE_LENGTH = 1262;
  static final List<Hpack.HeaderEntry> INITIAL_SERVER_TO_CLIENT_HEADER_TABLE = Arrays.asList(new Hpack.HeaderEntry[] { new Hpack.HeaderEntry(":status", "200"), new Hpack.HeaderEntry("age", ""), new Hpack.HeaderEntry("cache-control", ""), new Hpack.HeaderEntry("content-length", ""), new Hpack.HeaderEntry("content-type", ""), new Hpack.HeaderEntry("date", ""), new Hpack.HeaderEntry("etag", ""), new Hpack.HeaderEntry("expires", ""), new Hpack.HeaderEntry("last-modified", ""), new Hpack.HeaderEntry("server", ""), new Hpack.HeaderEntry("set-cookie", ""), new Hpack.HeaderEntry("vary", ""), new Hpack.HeaderEntry("via", ""), new Hpack.HeaderEntry("access-control-allow-origin", ""), new Hpack.HeaderEntry("accept-ranges", ""), new Hpack.HeaderEntry("allow", ""), new Hpack.HeaderEntry("connection", ""), new Hpack.HeaderEntry("content-disposition", ""), new Hpack.HeaderEntry("content-encoding", ""), new Hpack.HeaderEntry("content-language", ""), new Hpack.HeaderEntry("content-location", ""), new Hpack.HeaderEntry("content-range", ""), new Hpack.HeaderEntry("link", ""), new Hpack.HeaderEntry("location", ""), new Hpack.HeaderEntry("proxy-authenticate", ""), new Hpack.HeaderEntry("refresh", ""), new Hpack.HeaderEntry("retry-after", ""), new Hpack.HeaderEntry("strict-transport-security", ""), new Hpack.HeaderEntry("transfer-encoding", ""), new Hpack.HeaderEntry("www-authenticate", "") });
  static final int INITIAL_SERVER_TO_CLIENT_HEADER_TABLE_LENGTH = 1304;
  static final int PREFIX_5_BITS = 31;
  static final int PREFIX_6_BITS = 63;
  static final int PREFIX_7_BITS = 127;
  static final int PREFIX_8_BITS = 255;
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Hpack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */