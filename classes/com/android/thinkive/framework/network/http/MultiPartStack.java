package com.android.thinkive.framework.network.http;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.util.Log;
import com.android.volley.Request;
import com.android.volley.toolbox.HttpClientStack.HttpPatch;
import com.android.volley.toolbox.HurlStack;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class MultiPartStack
  extends HurlStack
{
  private static final String HEADER_CONTENT_TYPE = "Content-Type";
  private static final String TAG = MultiPartStack.class.getSimpleName();
  
  private static void addBodyIfExists(HttpURLConnection paramHttpURLConnection, Request<?> paramRequest)
  {
    byte[] arrayOfByte = paramRequest.getBody();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paramRequest.getBodyContentType());
      paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      paramHttpURLConnection.write(arrayOfByte);
      paramHttpURLConnection.close();
    }
  }
  
  private static void addHeaders(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }
  
  private javax.net.ssl.SSLSocketFactory createSocketFactory(URL paramURL)
  {
    Object localObject1 = CertificateFactory.getInstance("X.509");
    paramURL = ConfigManager.getInstance().getCertificatePath(paramURL.toString());
    if (TextUtils.isEmpty(paramURL)) {
      return null;
    }
    Log.d("https certificatePath = " + paramURL);
    paramURL = new BufferedInputStream(ThinkiveInitializer.getInstance().getContext().getAssets().open(paramURL));
    try
    {
      localObject1 = ((CertificateFactory)localObject1).generateCertificate(paramURL);
      Log.d("ca=" + ((X509Certificate)localObject1).getSubjectDN());
      paramURL.close();
      paramURL = KeyStore.getInstance(KeyStore.getDefaultType());
      paramURL.load(null, null);
      paramURL.setCertificateEntry("ca", (Certificate)localObject1);
      localObject1 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      ((TrustManagerFactory)localObject1).init(paramURL);
      paramURL = SSLContext.getInstance("TLS");
      paramURL.init(null, ((TrustManagerFactory)localObject1).getTrustManagers(), null);
      return paramURL.getSocketFactory();
    }
    finally
    {
      paramURL.close();
    }
  }
  
  private HttpEntity entityFromConnection(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream1 = paramHttpURLConnection.getInputStream();
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        InputStream localInputStream2 = paramHttpURLConnection.getErrorStream();
      }
    }
  }
  
  public static HttpClient initHttpClient(HttpParams paramHttpParams)
  {
    try
    {
      Object localObject = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject).load(null, null);
      localObject = new MultiPartStack.SSLSocketFactoryImp((KeyStore)localObject);
      ((org.apache.http.conn.ssl.SSLSocketFactory)localObject).setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      HttpProtocolParams.setVersion(paramHttpParams, HttpVersion.HTTP_1_1);
      HttpProtocolParams.setContentCharset(paramHttpParams, "UTF-8");
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      localSchemeRegistry.register(new Scheme("https", (SocketFactory)localObject, 443));
      localObject = new DefaultHttpClient(new ThreadSafeClientConnManager(paramHttpParams, localSchemeRegistry), paramHttpParams);
      paramHttpParams = (HttpParams)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        paramHttpParams = new DefaultHttpClient(paramHttpParams);
      }
    }
    finally {}
    return paramHttpParams;
  }
  
  private HttpURLConnection openConnection(URL paramURL, Request<?> paramRequest)
  {
    HttpURLConnection localHttpURLConnection = createConnection(paramURL);
    int i = paramRequest.getTimeoutMs();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    try
    {
      if ("https".equals(paramURL.getProtocol().toLowerCase()))
      {
        paramRequest = createSocketFactory(paramURL);
        if (("https".equals(paramURL.getProtocol())) && (paramRequest != null)) {
          ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(paramRequest);
        }
        return localHttpURLConnection;
      }
    }
    catch (CertificateException paramRequest)
    {
      for (;;)
      {
        paramRequest.printStackTrace();
        paramRequest = null;
      }
    }
    catch (KeyStoreException paramRequest)
    {
      for (;;)
      {
        paramRequest.printStackTrace();
        paramRequest = null;
      }
    }
    catch (NoSuchAlgorithmException paramRequest)
    {
      for (;;)
      {
        paramRequest.printStackTrace();
        paramRequest = null;
      }
    }
    catch (KeyManagementException paramRequest)
    {
      for (;;)
      {
        paramRequest.printStackTrace();
        paramRequest = null;
      }
    }
  }
  
  private HttpResponse performCustomRequest(Request<?> paramRequest, Map<String, String> paramMap)
  {
    Object localObject2 = paramRequest.getUrl();
    Object localObject1 = new HashMap();
    ((HashMap)localObject1).putAll(paramRequest.getHeaders());
    ((HashMap)localObject1).putAll(paramMap);
    localObject2 = openConnection(new URL((String)localObject2), paramRequest);
    paramMap = ((HashMap)localObject1).keySet().iterator();
    Object localObject3;
    for (;;)
    {
      if (!paramMap.hasNext())
      {
        setConnectionParametersForRequest((HttpURLConnection)localObject2, paramRequest);
        paramRequest = new ProtocolVersion("HTTP", 1, 1);
        if (((HttpURLConnection)localObject2).getResponseCode() != -1) {
          break;
        }
        throw new IOException("Could not retrieve response code from HttpUrlConnection.");
      }
      localObject3 = (String)paramMap.next();
      ((HttpURLConnection)localObject2).addRequestProperty((String)localObject3, (String)((HashMap)localObject1).get(localObject3));
    }
    paramMap = new BasicHttpResponse(new BasicStatusLine(paramRequest, ((HttpURLConnection)localObject2).getResponseCode(), ((HttpURLConnection)localObject2).getResponseMessage()));
    paramMap.setEntity(entityFromConnection((HttpURLConnection)localObject2));
    localObject1 = ((HttpURLConnection)localObject2).getHeaderFields().entrySet().iterator();
    do
    {
      if (!((Iterator)localObject1).hasNext()) {
        return paramMap;
      }
      paramRequest = (Map.Entry)((Iterator)localObject1).next();
    } while (paramRequest.getKey() == null);
    if (((List)paramRequest.getValue()).size() > 1)
    {
      localObject2 = new StringBuilder();
      localObject3 = ((List)paramRequest.getValue()).iterator();
      label257:
      if (!((Iterator)localObject3).hasNext()) {
        localObject2 = ((StringBuilder)localObject2).substring(0, ((StringBuilder)localObject2).length() - 1);
      }
    }
    for (paramRequest = new BasicHeader((String)paramRequest.getKey(), (String)localObject2);; paramRequest = new BasicHeader((String)paramRequest.getKey(), (String)((List)paramRequest.getValue()).get(0)))
    {
      paramMap.addHeader(paramRequest);
      break;
      ((StringBuilder)localObject2).append((String)((Iterator)localObject3).next());
      ((StringBuilder)localObject2).append(";");
      break label257;
    }
  }
  
  private void setConnectionParametersForRequest(HttpURLConnection paramHttpURLConnection, Request<?> paramRequest)
  {
    switch (paramRequest.getMethod())
    {
    default: 
      throw new IllegalStateException("Unknown method type.");
    case -1: 
      byte[] arrayOfByte = paramRequest.getPostBody();
      if (arrayOfByte != null)
      {
        paramHttpURLConnection.setDoOutput(true);
        paramHttpURLConnection.setRequestMethod("POST");
        paramHttpURLConnection.addRequestProperty("Content-Type", paramRequest.getPostBodyContentType());
        paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
        paramHttpURLConnection.write(arrayOfByte);
        paramHttpURLConnection.close();
      }
      return;
    case 0: 
      paramHttpURLConnection.setRequestMethod("GET");
      return;
    case 3: 
      paramHttpURLConnection.setRequestMethod("DELETE");
      return;
    case 1: 
      paramHttpURLConnection.setRequestMethod("POST");
      addBodyIfExists(paramHttpURLConnection, paramRequest);
      return;
    case 2: 
      paramHttpURLConnection.setRequestMethod("PUT");
      addBodyIfExists(paramHttpURLConnection, paramRequest);
      return;
    case 4: 
      paramHttpURLConnection.setRequestMethod("HEAD");
      return;
    case 5: 
      paramHttpURLConnection.setRequestMethod("OPTIONS");
      return;
    case 6: 
      paramHttpURLConnection.setRequestMethod("TRACE");
      return;
    }
    paramHttpURLConnection.setRequestMethod("PATCH");
    addBodyIfExists(paramHttpURLConnection, paramRequest);
  }
  
  private void setMultiPartBody(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, Request<?> paramRequest)
  {
    if (!(paramRequest instanceof MultiPartRequest)) {
      return;
    }
    MultipartEntityBuilder localMultipartEntityBuilder = MultipartEntityBuilder.create();
    localMultipartEntityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
    Object localObject1 = ((MultiPartRequest)paramRequest).getFileUploads().entrySet().iterator();
    Object localObject2;
    if (!((Iterator)localObject1).hasNext())
    {
      localObject1 = ContentType.create("text/plain", "UTF-8");
      localObject2 = ((MultiPartRequest)paramRequest).getStringUploads().entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext())
      {
        paramHttpEntityEnclosingRequestBase.setEntity(new ProgressEntity(localMultipartEntityBuilder.build(), ((MultiPartRequest)paramRequest).getProgressListener()));
        return;
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localMultipartEntityBuilder.addPart((String)((Map.Entry)localObject2).getKey(), (FileBody)((Map.Entry)localObject2).getValue());
        break;
      }
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
      try
      {
        localMultipartEntityBuilder.addPart((String)localEntry.getKey(), new StringBody((String)localEntry.getValue(), (ContentType)localObject1));
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  HttpUriRequest createMultiPartRequest(Request<?> paramRequest, Map<String, String> paramMap)
  {
    Object localObject;
    switch (paramRequest.getMethod())
    {
    case 4: 
    case 5: 
    case 6: 
    default: 
      throw new IllegalStateException("Unknown request method.");
    case -1: 
      localObject = paramRequest.getBody();
      if (localObject != null)
      {
        paramMap = new HttpPost(paramRequest.getUrl());
        if (paramRequest.getBodyContentType() != null) {
          paramMap.addHeader("Content-Type", paramRequest.getBodyContentType());
        }
        paramMap.setEntity(new ByteArrayEntity((byte[])localObject));
      }
      break;
    }
    do
    {
      return paramMap;
      return new HttpGet(paramRequest.getUrl());
      return new HttpGet(paramRequest.getUrl());
      return new HttpDelete(paramRequest.getUrl());
      paramMap = new HttpPost(paramRequest.getUrl());
      if (paramRequest.getBodyContentType() != null) {
        paramMap.addHeader("Content-Type", paramRequest.getBodyContentType());
      }
      setMultiPartBody(paramMap, paramRequest);
      return paramMap;
      paramMap = new HttpPut(paramRequest.getUrl());
      if (paramRequest.getBodyContentType() != null) {
        paramMap.addHeader("Content-Type", paramRequest.getBodyContentType());
      }
      setMultiPartBody(paramMap, paramRequest);
      return paramMap;
      localObject = new HttpClientStack.HttpPatch(paramRequest.getUrl());
      paramMap = (Map<String, String>)localObject;
    } while (paramRequest.getBodyContentType() == null);
    ((HttpClientStack.HttpPatch)localObject).addHeader("Content-Type", paramRequest.getBodyContentType());
    return (HttpUriRequest)localObject;
  }
  
  public HttpResponse performMultiPartRequest(Request<?> paramRequest, Map<String, String> paramMap)
  {
    HttpUriRequest localHttpUriRequest = createMultiPartRequest(paramRequest, paramMap);
    addHeaders(localHttpUriRequest, paramMap);
    addHeaders(localHttpUriRequest, paramRequest.getHeaders());
    paramMap = localHttpUriRequest.getParams();
    int i = paramRequest.getTimeoutMs();
    if (i != -1) {
      HttpConnectionParams.setSoTimeout(paramMap, i);
    }
    return initHttpClient(paramMap).execute(localHttpUriRequest);
  }
  
  public HttpResponse performRequest(Request<?> paramRequest, Map<String, String> paramMap)
  {
    if (!(paramRequest instanceof MultiPartRequest)) {
      return performCustomRequest(paramRequest, paramMap);
    }
    return performMultiPartRequest(paramRequest, paramMap);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\MultiPartStack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */