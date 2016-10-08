package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Editor;
import com.squareup.okhttp.internal.StrictLineReader;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.http.HttpsEngine;
import com.squareup.okhttp.internal.http.HttpsURLConnectionImpl;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class HttpResponseCache$Entry
{
  private final String cipherSuite;
  private final Certificate[] localCertificates;
  private final Certificate[] peerCertificates;
  private final String requestMethod;
  private final RawHeaders responseHeaders;
  private final String uri;
  private final RawHeaders varyHeaders;
  
  public HttpResponseCache$Entry(InputStream paramInputStream)
  {
    for (;;)
    {
      int i;
      try
      {
        StrictLineReader localStrictLineReader1 = new StrictLineReader(paramInputStream, Util.US_ASCII);
        this.uri = localStrictLineReader1.readLine();
        this.requestMethod = localStrictLineReader1.readLine();
        this.varyHeaders = new RawHeaders();
        int k = localStrictLineReader1.readInt();
        i = 0;
        if (i >= k)
        {
          this.responseHeaders = new RawHeaders();
          this.responseHeaders.setStatusLine(localStrictLineReader1.readLine());
          k = localStrictLineReader1.readInt();
          i = j;
          if (i < k) {
            break label176;
          }
          if (!isHttps()) {
            break label227;
          }
          String str = localStrictLineReader1.readLine();
          if (str.length() <= 0) {
            break;
          }
          throw new IOException("expected \"\" but was \"" + str + "\"");
        }
      }
      finally
      {
        paramInputStream.close();
      }
      this.varyHeaders.addLine(localStrictLineReader2.readLine());
      i += 1;
      continue;
      label176:
      this.responseHeaders.addLine(localStrictLineReader2.readLine());
      i += 1;
    }
    this.cipherSuite = localStrictLineReader2.readLine();
    this.peerCertificates = readCertArray(localStrictLineReader2);
    for (this.localCertificates = readCertArray(localStrictLineReader2);; this.localCertificates = null)
    {
      paramInputStream.close();
      return;
      label227:
      this.cipherSuite = null;
      this.peerCertificates = null;
    }
  }
  
  public HttpResponseCache$Entry(URI paramURI, RawHeaders paramRawHeaders, HttpURLConnection paramHttpURLConnection)
  {
    this.uri = paramURI.toString();
    this.varyHeaders = paramRawHeaders;
    this.requestMethod = paramHttpURLConnection.getRequestMethod();
    this.responseHeaders = RawHeaders.fromMultimap(paramHttpURLConnection.getHeaderFields(), true);
    paramRawHeaders = getSslSocket(paramHttpURLConnection);
    if (paramRawHeaders != null) {
      this.cipherSuite = paramRawHeaders.getSession().getCipherSuite();
    }
    try
    {
      paramURI = paramRawHeaders.getSession().getPeerCertificates();
      this.peerCertificates = paramURI;
      this.localCertificates = paramRawHeaders.getSession().getLocalCertificates();
      return;
      this.cipherSuite = null;
      this.peerCertificates = null;
      this.localCertificates = null;
      return;
    }
    catch (SSLPeerUnverifiedException paramURI)
    {
      for (;;)
      {
        paramURI = (URI)localObject;
      }
    }
  }
  
  private SSLSocket getSslSocket(HttpURLConnection paramHttpURLConnection)
  {
    if ((paramHttpURLConnection instanceof HttpsURLConnectionImpl)) {}
    for (paramHttpURLConnection = ((HttpsURLConnectionImpl)paramHttpURLConnection).getHttpEngine(); (paramHttpURLConnection instanceof HttpsEngine); paramHttpURLConnection = ((HttpURLConnectionImpl)paramHttpURLConnection).getHttpEngine()) {
      return ((HttpsEngine)paramHttpURLConnection).getSslSocket();
    }
    return null;
  }
  
  private boolean isHttps()
  {
    return this.uri.startsWith("https://");
  }
  
  /* Error */
  private Certificate[] readCertArray(StrictLineReader paramStrictLineReader)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 47	com/squareup/okhttp/internal/StrictLineReader:readInt	()I
    //   4: istore 5
    //   6: iload 5
    //   8: iconst_m1
    //   9: if_icmpne +7 -> 16
    //   12: aconst_null
    //   13: astore_2
    //   14: aload_2
    //   15: areturn
    //   16: ldc -83
    //   18: invokestatic 179	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   21: astore 4
    //   23: iload 5
    //   25: anewarray 181	java/security/cert/Certificate
    //   28: astore_3
    //   29: iconst_0
    //   30: istore 5
    //   32: aload_3
    //   33: astore_2
    //   34: iload 5
    //   36: aload_3
    //   37: arraylength
    //   38: if_icmpge -24 -> 14
    //   41: aload_3
    //   42: iload 5
    //   44: aload 4
    //   46: new 183	java/io/ByteArrayInputStream
    //   49: dup
    //   50: aload_1
    //   51: invokevirtual 34	com/squareup/okhttp/internal/StrictLineReader:readLine	()Ljava/lang/String;
    //   54: ldc -71
    //   56: invokevirtual 189	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   59: invokestatic 195	com/squareup/okhttp/internal/Base64:decode	([B)[B
    //   62: invokespecial 198	java/io/ByteArrayInputStream:<init>	([B)V
    //   65: invokevirtual 202	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   68: aastore
    //   69: iload 5
    //   71: iconst_1
    //   72: iadd
    //   73: istore 5
    //   75: goto -43 -> 32
    //   78: astore_1
    //   79: new 64	java/io/IOException
    //   82: dup
    //   83: aload_1
    //   84: invokevirtual 205	java/security/cert/CertificateException:getMessage	()Ljava/lang/String;
    //   87: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	Entry
    //   0	91	1	paramStrictLineReader	StrictLineReader
    //   13	21	2	localObject	Object
    //   28	14	3	arrayOfCertificate	Certificate[]
    //   21	24	4	localCertificateFactory	java.security.cert.CertificateFactory
    //   4	70	5	i	int
    // Exception table:
    //   from	to	target	type
    //   16	29	78	java/security/cert/CertificateException
    //   34	69	78	java/security/cert/CertificateException
  }
  
  /* Error */
  private void writeCertArray(Writer paramWriter, Certificate[] paramArrayOfCertificate)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +10 -> 11
    //   4: aload_1
    //   5: ldc -45
    //   7: invokevirtual 216	java/io/Writer:write	(Ljava/lang/String;)V
    //   10: return
    //   11: aload_1
    //   12: new 66	java/lang/StringBuilder
    //   15: dup
    //   16: aload_2
    //   17: arraylength
    //   18: invokestatic 221	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   21: invokestatic 225	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   27: bipush 10
    //   29: invokevirtual 228	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   32: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokevirtual 216	java/io/Writer:write	(Ljava/lang/String;)V
    //   38: aload_2
    //   39: arraylength
    //   40: istore 4
    //   42: iconst_0
    //   43: istore_3
    //   44: iload_3
    //   45: iload 4
    //   47: if_icmpge -37 -> 10
    //   50: aload_1
    //   51: new 66	java/lang/StringBuilder
    //   54: dup
    //   55: aload_2
    //   56: iload_3
    //   57: aaload
    //   58: invokevirtual 232	java/security/cert/Certificate:getEncoded	()[B
    //   61: invokestatic 236	com/squareup/okhttp/internal/Base64:encode	([B)Ljava/lang/String;
    //   64: invokestatic 225	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   67: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   70: bipush 10
    //   72: invokevirtual 228	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   75: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokevirtual 216	java/io/Writer:write	(Ljava/lang/String;)V
    //   81: iload_3
    //   82: iconst_1
    //   83: iadd
    //   84: istore_3
    //   85: goto -41 -> 44
    //   88: astore_1
    //   89: new 64	java/io/IOException
    //   92: dup
    //   93: aload_1
    //   94: invokevirtual 237	java/security/cert/CertificateEncodingException:getMessage	()Ljava/lang/String;
    //   97: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	Entry
    //   0	101	1	paramWriter	Writer
    //   0	101	2	paramArrayOfCertificate	Certificate[]
    //   43	42	3	i	int
    //   40	8	4	j	int
    // Exception table:
    //   from	to	target	type
    //   11	42	88	java/security/cert/CertificateEncodingException
    //   50	81	88	java/security/cert/CertificateEncodingException
  }
  
  public boolean matches(URI paramURI, String paramString, Map<String, List<String>> paramMap)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.uri.equals(paramURI.toString()))
    {
      bool1 = bool2;
      if (this.requestMethod.equals(paramString))
      {
        bool1 = bool2;
        if (new ResponseHeaders(paramURI, this.responseHeaders).varyMatches(this.varyHeaders.toMultimap(false), paramMap)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public void writeTo(DiskLruCache.Editor paramEditor)
  {
    int j = 0;
    paramEditor = new BufferedWriter(new OutputStreamWriter(paramEditor.newOutputStream(0), Util.UTF_8));
    paramEditor.write(this.uri + '\n');
    paramEditor.write(this.requestMethod + '\n');
    paramEditor.write(Integer.toString(this.varyHeaders.length()) + '\n');
    int i = 0;
    if (i >= this.varyHeaders.length())
    {
      paramEditor.write(this.responseHeaders.getStatusLine() + '\n');
      paramEditor.write(Integer.toString(this.responseHeaders.length()) + '\n');
      i = j;
    }
    for (;;)
    {
      if (i >= this.responseHeaders.length())
      {
        if (isHttps())
        {
          paramEditor.write(10);
          paramEditor.write(this.cipherSuite + '\n');
          writeCertArray(paramEditor, this.peerCertificates);
          writeCertArray(paramEditor, this.localCertificates);
        }
        paramEditor.close();
        return;
        paramEditor.write(this.varyHeaders.getFieldName(i) + ": " + this.varyHeaders.getValue(i) + '\n');
        i += 1;
        break;
      }
      paramEditor.write(this.responseHeaders.getFieldName(i) + ": " + this.responseHeaders.getValue(i) + '\n');
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\HttpResponseCache$Entry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */