package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.OkAuthenticator;
import com.squareup.okhttp.OkAuthenticator.Challenge;
import com.squareup.okhttp.OkAuthenticator.Credential;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class HttpAuthenticator
{
  public static final OkAuthenticator SYSTEM_DEFAULT = new HttpAuthenticator.1();
  
  private static List<OkAuthenticator.Challenge> parseChallenges(RawHeaders paramRawHeaders, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i >= paramRawHeaders.length()) {
      return localArrayList;
    }
    if (!paramString.equalsIgnoreCase(paramRawHeaders.getFieldName(i))) {}
    label179:
    for (;;)
    {
      i += 1;
      break;
      String str1 = paramRawHeaders.getValue(i);
      int j = 0;
      for (;;)
      {
        if (j >= str1.length()) {
          break label179;
        }
        int k = HeaderParser.skipUntil(str1, j, " ");
        String str2 = str1.substring(j, k).trim();
        j = HeaderParser.skipWhitespace(str1, k);
        if (!str1.regionMatches(true, j, "realm=\"", 0, "realm=\"".length())) {
          break;
        }
        j = "realm=\"".length() + j;
        k = HeaderParser.skipUntil(str1, j, "\"");
        String str3 = str1.substring(j, k);
        j = HeaderParser.skipWhitespace(str1, HeaderParser.skipUntil(str1, k + 1, ",") + 1);
        localArrayList.add(new OkAuthenticator.Challenge(str2, str3));
      }
    }
  }
  
  public static boolean processAuthHeader(OkAuthenticator paramOkAuthenticator, int paramInt, RawHeaders paramRawHeaders1, RawHeaders paramRawHeaders2, Proxy paramProxy, URL paramURL)
  {
    Object localObject;
    if (paramInt == 401) {
      localObject = "WWW-Authenticate";
    }
    for (String str = "Authorization";; str = "Proxy-Authorization")
    {
      localObject = parseChallenges(paramRawHeaders1, (String)localObject);
      if (!((List)localObject).isEmpty()) {
        break label61;
      }
      return false;
      if (paramInt != 407) {
        break;
      }
      localObject = "Proxy-Authenticate";
    }
    throw new IllegalArgumentException();
    label61:
    if (paramRawHeaders1.getResponseCode() == 407) {}
    for (paramOkAuthenticator = paramOkAuthenticator.authenticateProxy(paramProxy, paramURL, (List)localObject); paramOkAuthenticator == null; paramOkAuthenticator = paramOkAuthenticator.authenticate(paramProxy, paramURL, (List)localObject)) {
      return false;
    }
    paramRawHeaders2.set(str, paramOkAuthenticator.getHeaderValue());
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpAuthenticator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */