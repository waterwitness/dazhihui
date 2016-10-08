package com.d.a;

import java.security.cert.X509Certificate;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

class i
  implements X509TrustManager
{
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    int j = paramArrayOfX509Certificate.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramString = paramArrayOfX509Certificate[i];
      if ((paramString != null) && (paramString.getCriticalExtensionOIDs() != null)) {
        paramString.getCriticalExtensionOIDs().remove("2.5.29.15");
      }
      i += 1;
    }
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return new X509Certificate[0];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */