package com.squareup.okhttp.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class OkHostnameVerifier
  implements HostnameVerifier
{
  private static final int ALT_DNS_NAME = 2;
  private static final int ALT_IPA_NAME = 7;
  public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();
  private static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  
  private List<String> getSubjectAltNames(X509Certificate paramX509Certificate, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      paramX509Certificate = paramX509Certificate.getSubjectAlternativeNames();
      if (paramX509Certificate == null) {
        return Collections.emptyList();
      }
      paramX509Certificate = paramX509Certificate.iterator();
      for (;;)
      {
        if (!paramX509Certificate.hasNext()) {
          return localArrayList;
        }
        Object localObject = (List)paramX509Certificate.next();
        if ((localObject != null) && (((List)localObject).size() >= 2))
        {
          Integer localInteger = (Integer)((List)localObject).get(0);
          if ((localInteger != null) && (localInteger.intValue() == paramInt))
          {
            localObject = (String)((List)localObject).get(1);
            if (localObject != null) {
              localArrayList.add(localObject);
            }
          }
        }
      }
      return Collections.emptyList();
    }
    catch (CertificateParsingException paramX509Certificate) {}
  }
  
  static boolean verifyAsIpAddress(String paramString)
  {
    return VERIFY_AS_IP_ADDRESS.matcher(paramString).matches();
  }
  
  private boolean verifyHostName(String paramString, X509Certificate paramX509Certificate)
  {
    boolean bool2 = true;
    paramString = paramString.toLowerCase(Locale.US);
    Iterator localIterator = getSubjectAltNames(paramX509Certificate, 2).iterator();
    for (int i = 0;; i = 1)
    {
      boolean bool1;
      if (!localIterator.hasNext())
      {
        if (i != 0) {
          break;
        }
        paramX509Certificate = new DistinguishedNameParser(paramX509Certificate.getSubjectX500Principal()).findMostSpecific("cn");
        if (paramX509Certificate == null) {
          break;
        }
        bool1 = verifyHostName(paramString, paramX509Certificate);
      }
      do
      {
        return bool1;
        bool1 = bool2;
      } while (verifyHostName(paramString, (String)localIterator.next()));
    }
    return false;
  }
  
  private boolean verifyIpAddress(String paramString, X509Certificate paramX509Certificate)
  {
    paramX509Certificate = getSubjectAltNames(paramX509Certificate, 7).iterator();
    do
    {
      if (!paramX509Certificate.hasNext()) {
        return false;
      }
    } while (!paramString.equalsIgnoreCase((String)paramX509Certificate.next()));
    return true;
  }
  
  public boolean verify(String paramString, X509Certificate paramX509Certificate)
  {
    if (verifyAsIpAddress(paramString)) {
      return verifyIpAddress(paramString, paramX509Certificate);
    }
    return verifyHostName(paramString, paramX509Certificate);
  }
  
  public boolean verify(String paramString, SSLSession paramSSLSession)
  {
    try
    {
      boolean bool = verify(paramString, (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
      return bool;
    }
    catch (SSLException paramString) {}
    return false;
  }
  
  public boolean verifyHostName(String paramString1, String paramString2)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0)) {
      bool1 = false;
    }
    int i;
    int j;
    int k;
    do
    {
      do
      {
        return bool1;
        paramString2 = paramString2.toLowerCase(Locale.US);
        if (!paramString2.contains("*")) {
          return paramString1.equals(paramString2);
        }
        if (!paramString2.startsWith("*.")) {
          break;
        }
        bool1 = bool2;
      } while (paramString1.regionMatches(0, paramString2, 2, paramString2.length() - 2));
      i = paramString2.indexOf('*');
      if (i > paramString2.indexOf('.')) {
        return false;
      }
      if (!paramString1.regionMatches(0, paramString2, 0, i)) {
        return false;
      }
      j = paramString2.length() - (i + 1);
      k = paramString1.length() - j;
      if ((paramString1.indexOf('.', i) < k) && (!paramString1.endsWith(".clients.google.com"))) {
        return false;
      }
      bool1 = bool2;
    } while (paramString1.regionMatches(k, paramString2, i + 1, j));
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\tls\OkHostnameVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */