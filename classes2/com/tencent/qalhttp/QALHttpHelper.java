package com.tencent.qalhttp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBInt64Field;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qalsdk.QALInitHelper;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.im_open.QalMonitor.Request;
import com.tencent.qalsdk.im_open.QalMonitor.Request.Http;
import com.tencent.qalsdk.im_open.http.Pair;
import com.tencent.qalsdk.im_open.http.PairBytes;
import com.tencent.qalsdk.im_open.http.Request;
import com.tencent.qalsdk.im_open.http.Response;
import com.tencent.qalsdk.im_open.http.ResponsePrivate;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.ac;
import com.tencent.qalsdk.sdk.e;
import com.tencent.qalsdk.util.QLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class QALHttpHelper
{
  static a cacheHelper = new a();
  private static Handler mainHandler = new Handler(Looper.getMainLooper());
  private static final String tag = "QALHttpHelper";
  private String accept = null;
  private String acceptCharset = null;
  private String acceptLanguage = null;
  private long beginTime = 0L;
  private byte[] body = null;
  private List<String> cache_control = null;
  private String contentType = null;
  private String cookie = null;
  private Map<String, String> formData;
  private String formDataCharSet;
  LinkedList<QALHttpResponse> frags = new LinkedList();
  QALHttpResponse head = new QALHttpResponse();
  private String if_match = null;
  private String if_modified_since = null;
  private String if_none_match = null;
  private String if_unmodified_since = null;
  int local_total_length = 0;
  private int method = -1;
  private String origin = null;
  private Map<String, String> otherHeaders;
  private String pragma;
  private String referer = null;
  int total_length = -1;
  private String uri = null;
  private String user_agent = null;
  private String x_requested_with = null;
  
  public QALHttpHelper(String paramString)
  {
    this.uri = paramString;
    this.otherHeaders = new HashMap();
  }
  
  private QALHttpResponse DecodeResponse(http.Response paramResponse)
  {
    QALHttpResponse localQALHttpResponse = new QALHttpResponse();
    localQALHttpResponse.setStatus(paramResponse.status_code.get());
    localQALHttpResponse.setContentType(paramResponse.content_type.get());
    localQALHttpResponse.setLocation(paramResponse.location.get());
    localQALHttpResponse.setDate(paramResponse.date.get());
    localQALHttpResponse.setServer(paramResponse.server.get());
    localQALHttpResponse.setVia(paramResponse.via.get());
    localQALHttpResponse.setXCache(paramResponse.x_cache.get());
    localQALHttpResponse.setXCacheLookup(paramResponse.x_cache_lookup.get());
    localQALHttpResponse.setAge(paramResponse.age.get());
    localQALHttpResponse.setLastModified(paramResponse.last_modified.get());
    localQALHttpResponse.setEtag(paramResponse.etag.get());
    localQALHttpResponse.setCacheControl(paramResponse.cache_control.get());
    localQALHttpResponse.setExpires(paramResponse.expires.get());
    localQALHttpResponse.setPragma(paramResponse.pragma.get());
    localQALHttpResponse.setSetCookie(paramResponse.set_cookie.get());
    localQALHttpResponse.responsePrivate = ((http.ResponsePrivate)paramResponse.private_response.get());
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramResponse.other_headers.size())
    {
      localHashMap.put(((http.Pair)paramResponse.other_headers.get(i)).key.get(), ((http.Pair)paramResponse.other_headers.get(i)).value.get());
      i += 1;
    }
    localQALHttpResponse.setOtherHeaders(localHashMap);
    localQALHttpResponse.setBody(paramResponse.body.get().toByteArray());
    return localQALHttpResponse;
  }
  
  private byte[] EncodeRequest()
  {
    http.Request localRequest = new http.Request();
    if (this.uri == null)
    {
      QLog.e("QALHttpHelper", 1, "param error: uri null");
      return null;
    }
    localRequest.uri.set(this.uri);
    if ((this.method < 1) || (this.method > 8))
    {
      QLog.e("QALHttpHelper", 1, "param error: method wrong");
      return null;
    }
    localRequest.method.set(this.method);
    if (this.contentType != null) {
      localRequest.content_type.set(this.contentType);
    }
    if (this.accept != null) {
      localRequest.accept.set(this.accept);
    }
    if (this.acceptLanguage != null) {
      localRequest.accept_language.set(this.acceptLanguage);
    }
    if (this.acceptCharset != null) {
      localRequest.accept_charset.set(this.acceptCharset);
    }
    if (this.user_agent != null) {
      localRequest.user_agent.set(this.user_agent);
    }
    if (this.cookie != null) {
      localRequest.cookie.set(this.cookie);
    }
    if (this.referer != null) {
      localRequest.referer.set(this.referer);
    }
    if (this.origin != null) {
      localRequest.origin.set(this.origin);
    }
    if (this.x_requested_with != null) {
      localRequest.x_requested_with.set(this.x_requested_with);
    }
    if (this.if_modified_since != null) {
      localRequest.if_modified_since.set(this.if_modified_since);
    }
    if (this.if_unmodified_since != null) {
      localRequest.if_unmodified_since.set(this.if_unmodified_since);
    }
    if (this.if_none_match != null) {
      localRequest.if_none_match.set(this.if_none_match);
    }
    if (this.if_match != null) {
      localRequest.if_match.set(this.if_match);
    }
    if (this.cache_control != null) {
      localRequest.cache_control.set(this.cache_control);
    }
    if (this.pragma != null) {
      localRequest.pragma.set(this.pragma);
    }
    Iterator localIterator = this.otherHeaders.keySet().iterator();
    String str;
    Object localObject;
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if ((!str.equals("Accept-Encoding")) && (!str.equals("Connection")) && (!str.equals("Content-Length")))
      {
        localObject = new http.Pair();
        ((http.Pair)localObject).key.set(str);
        ((http.Pair)localObject).value.set((String)this.otherHeaders.get(str));
        localRequest.other_headers.add((MessageMicro)localObject);
      }
    }
    if (this.formData != null)
    {
      localIterator = this.formData.keySet().iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localObject = new http.PairBytes();
        ((http.PairBytes)localObject).key.set(ByteStringMicro.copyFrom(str.getBytes()));
        ((http.PairBytes)localObject).value.set(ByteStringMicro.copyFrom(((String)this.formData.get(str)).getBytes()));
        localRequest.x_www_form.add((MessageMicro)localObject);
      }
    }
    if (this.body != null)
    {
      localRequest.body.set(ByteStringMicro.copyFrom(this.body));
      QLog.d("QALHttpHelper", 4, "http reqeust body len:" + this.body.length);
    }
    return localRequest.toByteArray();
  }
  
  private void mainCallFail(QALHttpValueCallBack paramQALHttpValueCallBack, int paramInt, String paramString)
  {
    mainHandler.post(new c(this, paramQALHttpValueCallBack, paramInt, paramString));
  }
  
  private void mainCallSucc(QALHttpValueCallBack paramQALHttpValueCallBack, QALHttpResponse paramQALHttpResponse)
  {
    mainHandler.post(new d(this, paramQALHttpValueCallBack, paramQALHttpResponse));
  }
  
  private void removeSendMsg(ToServiceMsg paramToServiceMsg)
  {
    ac.a().a(paramToServiceMsg);
    paramToServiceMsg.setMsfCommand(MsfCommand.httpreq_remove);
    paramToServiceMsg.setNeedCallback(false);
    ac.a().b(paramToServiceMsg);
  }
  
  private void reportHttp(long paramLong1, long paramLong2, int paramInt, String paramString, boolean paramBoolean)
  {
    if (Math.random() > 0.1D) {
      return;
    }
    QalMonitor.Request.Http localHttp;
    try
    {
      localObject = new QalMonitor.Request();
      localHttp = new QalMonitor.Request.Http();
      long l = System.currentTimeMillis() / 1000L;
      localHttp.timestamp.set((int)l);
      localHttp.uri.set(this.uri);
      localHttp.cache_cost.set((int)paramLong1);
      localHttp.total_cost.set((int)paramLong2);
      localHttp.code.set(paramInt);
      localHttp.hit_cache.set(paramBoolean);
      if (e.b().h() != null) {
        localHttp.apn.set(e.b().h());
      }
      if (e.b().i() != null) {
        localHttp.gateway_ip.set(e.b().i());
      }
      if (e.b().j() != null) {
        localHttp.server_ip.set(e.b().j());
      }
      localHttp.radio_access.set(e.b().k());
      localHttp.errmsg.set(paramString);
      ((QalMonitor.Request)localObject).http.add(localHttp);
      paramString = ((QalMonitor.Request)localObject).toByteArray();
      if (paramString == null)
      {
        QLog.e("QALHttpHelper", "http report pb error");
        return;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      return;
    }
    Object localObject = new ToServiceMsg("", e.b().e(), "CliLogSvc.QalUpload");
    ((ToServiceMsg)localObject).setRequestSsoSeq(j.f());
    ((ToServiceMsg)localObject).putWupBuffer(paramString);
    ((ToServiceMsg)localObject).setUinType(20);
    ((ToServiceMsg)localObject).setNeedCallback(false);
    ((ToServiceMsg)localObject).setAppId(537046243);
    ((ToServiceMsg)localObject).setTimeout(15000L);
    ac.a().b((ToServiceMsg)localObject);
    paramString = new StringBuilder();
    QLog.d("QALHttpHelper", "report http:" + paramString.append(localHttp.timestamp.get()).append("|").append(localHttp.uri.get()).append("|").append(localHttp.cache_cost.get()).append("|").append(localHttp.total_cost.get()).append("|").append(localHttp.code.get()).append("|").append(localHttp.hit_cache.get()).append("|").append(localHttp.apn.get()).append("|").append(localHttp.radio_access.get()).append("|").append(localHttp.server_ip.get()).append("|").append(localHttp.gateway_ip.get()).toString());
  }
  
  boolean is_complete()
  {
    if (this.head == null) {}
    for (long l = -1L; (this.total_length >= 0) && (l == this.total_length); l = this.head.getBody().length) {
      return true;
    }
    return false;
  }
  
  boolean is_full()
  {
    return (this.total_length >= 0) && (this.local_total_length == this.total_length);
  }
  
  void merge_frag()
  {
    if ((this.frags.isEmpty()) || (((QALHttpResponse)this.frags.get(0)).responsePrivate.chunk_start.get() != 0L)) {}
    for (;;)
    {
      return;
      this.head = ((QALHttpResponse)this.frags.get(0));
      this.frags.remove(0);
      int i = 0;
      while (i < this.frags.size())
      {
        QALHttpResponse localQALHttpResponse = (QALHttpResponse)this.frags.get(i);
        if (this.head.getBody().length != localQALHttpResponse.responsePrivate.chunk_start.get())
        {
          QLog.e("QALHttpHelper", "respfrag order wrong!");
          return;
        }
        byte[] arrayOfByte = new byte[this.head.getBody().length + localQALHttpResponse.getBody().length];
        System.arraycopy(this.head.getBody(), 0, arrayOfByte, 0, this.head.getBody().length);
        System.arraycopy(localQALHttpResponse.getBody(), 0, arrayOfByte, this.head.getBody().length, localQALHttpResponse.getBody().length);
        this.head.setBody(arrayOfByte);
        if (!localQALHttpResponse.getSetCookie().isEmpty()) {
          this.head.setSetCookie(localQALHttpResponse.getSetCookie());
        }
        if (localQALHttpResponse.responsePrivate.cache_max_age.get() >= 0L) {
          this.head.responsePrivate.cache_max_age.set(localQALHttpResponse.responsePrivate.cache_max_age.get());
        }
        if (localQALHttpResponse.responsePrivate.cache_max_stale_age.get() >= 0L) {
          this.head.responsePrivate.cache_max_stale_age.set(localQALHttpResponse.responsePrivate.cache_max_stale_age.get());
        }
        i += 1;
      }
    }
  }
  
  public void onHttpResp(byte[] paramArrayOfByte, ToServiceMsg paramToServiceMsg, QALHttpValueCallBack paramQALHttpValueCallBack)
  {
    http.Response localResponse = new http.Response();
    long l1;
    long l2;
    try
    {
      localResponse.mergeFrom(paramArrayOfByte);
      put_frag(DecodeResponse(localResponse));
      if (!is_full()) {
        return;
      }
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      do
      {
        paramArrayOfByte.printStackTrace();
      } while (paramQALHttpValueCallBack == null);
      l1 = SystemClock.elapsedRealtime();
      l2 = this.beginTime;
      mainCallFail(paramQALHttpValueCallBack, 44514, "http parse rspbody failed");
      reportHttp(cacheHelper.d, l1 - l2, 6001, "http parse rspbody failed", false);
      QLog.e("QALHttpHelper", 1, this.uri + "|http resp error:http parse rspbody failed");
      return;
    }
    merge_frag();
    removeSendMsg(paramToServiceMsg);
    if (!is_complete())
    {
      l1 = SystemClock.elapsedRealtime();
      l2 = this.beginTime;
      mainCallFail(paramQALHttpValueCallBack, 44519, "收包错误,不完整");
      QLog.e("QALHttpHelper", this.uri + " http res error:" + 44519);
      reportHttp(cacheHelper.d, l1 - l2, 44519, "收包错误,不完整", false);
      return;
    }
    if ((this.head.responsePrivate.body_encoding.get() == 2) && (this.head.getBody().length != 0))
    {
      paramArrayOfByte = unzipBody(this.head.getBody());
      if (paramArrayOfByte != null) {
        this.head.setBody(paramArrayOfByte);
      }
    }
    else
    {
      l1 = SystemClock.elapsedRealtime() - this.beginTime;
      if (cacheHelper.a) {
        break label569;
      }
      if (this.head.getStatus() != 304) {
        break label391;
      }
      QLog.i("QALHttpHelper", 1, this.uri + " 304,return from cache");
      mainCallSucc(paramQALHttpValueCallBack, cacheHelper.a(this.uri));
      reportHttp(cacheHelper.d, l1, 304, "", false);
    }
    for (;;)
    {
      cacheHelper.a(this.method, this.uri, this.head);
      return;
      this.head.setStatus(44520);
      break;
      label391:
      if (this.head.getStatus() == 44520)
      {
        QLog.e("QALHttpHelper", 1, "http resp error:" + "body unzip error");
        mainCallFail(paramQALHttpValueCallBack, 44520, "body unzip error");
        reportHttp(cacheHelper.d, l1, 44520, "body unzip error", false);
      }
      else
      {
        QLog.i("QALHttpHelper", 1, this.uri + "|" + "http resp :" + this.head.getStatus() + "|" + this.head.getBody().length);
        mainCallSucc(paramQALHttpValueCallBack, this.head);
        reportHttp(cacheHelper.d, l1 - cacheHelper.d, this.head.getStatus(), "", false);
        continue;
        label569:
        QLog.d("QALHttpHelper", 4, "cache already return ,server response need no return");
      }
    }
  }
  
  void put_frag(QALHttpResponse paramQALHttpResponse)
  {
    int i;
    if (this.frags.size() > 0)
    {
      i = this.frags.size() - 1;
      if ((i < 0) || (((QALHttpResponse)this.frags.get(i)).responsePrivate.chunk_start.get() < paramQALHttpResponse.responsePrivate.chunk_start.get()))
      {
        if (i != this.frags.size() - 1) {
          break label193;
        }
        this.frags.add(paramQALHttpResponse);
      }
    }
    for (;;)
    {
      this.local_total_length += paramQALHttpResponse.getBody().length;
      QLog.d("QALHttpHelper", "recv frag|" + paramQALHttpResponse.responsePrivate.chunk_start.get() + "|" + paramQALHttpResponse.getBody().length + "|local_len:" + this.local_total_length);
      if (paramQALHttpResponse.responsePrivate.total_length.get() >= 0L) {
        this.total_length = ((int)paramQALHttpResponse.responsePrivate.total_length.get());
      }
      return;
      i -= 1;
      break;
      label193:
      this.frags.add(i + 1, paramQALHttpResponse);
      continue;
      this.frags.add(paramQALHttpResponse);
    }
  }
  
  public void request(QALHttpValueCallBack paramQALHttpValueCallBack)
  {
    QLog.i("QALHttpHelper", 1, "http request:" + this.method + ":" + this.uri);
    this.beginTime = SystemClock.elapsedRealtime();
    Object localObject = cacheHelper.a(this.method, this.uri);
    if (localObject != null)
    {
      QLog.d("QALHttpHelper", 1, "cache hit|qal http sdk resp ok:" + ((QALHttpResponse)localObject).getStatus() + "|" + ((QALHttpResponse)localObject).getBody().length + "|sdk costTime|" + cacheHelper.d);
      mainCallSucc(paramQALHttpValueCallBack, (QALHttpResponse)localObject);
      reportHttp(cacheHelper.d, 0L, ((QALHttpResponse)localObject).getStatus(), "", true);
      if (!cacheHelper.a) {
        return;
      }
      QLog.d("QALHttpHelper", 4, " cache hit| but need fresh");
    }
    if (cacheHelper.c != null) {
      this.if_modified_since = cacheHelper.c;
    }
    if (cacheHelper.b != null) {
      this.if_none_match = cacheHelper.b;
    }
    localObject = EncodeRequest();
    if (localObject == null)
    {
      QLog.e("QALHttpHelper", this.uri + " http encode err");
      return;
    }
    paramQALHttpValueCallBack = new b(this, paramQALHttpValueCallBack);
    if (e.b().e() == null)
    {
      QALInitHelper.instance().addToQueue("qal.http", (byte[])localObject, paramQALHttpValueCallBack);
      return;
    }
    e.b().a(e.b().e(), "qal.http", (byte[])localObject, paramQALHttpValueCallBack, e.b().b(localObject.length), true);
  }
  
  public void setAccept(String paramString)
  {
    this.accept = paramString;
  }
  
  public void setAcceptCharset(String paramString)
  {
    this.acceptCharset = paramString;
  }
  
  public void setAcceptLanguage(String paramString)
  {
    this.acceptLanguage = paramString;
  }
  
  public void setBody(byte[] paramArrayOfByte)
  {
    this.body = paramArrayOfByte;
  }
  
  public void setCacheControl(List<String> paramList)
  {
    this.cache_control = paramList;
  }
  
  public void setContentType(String paramString)
  {
    this.contentType = paramString;
  }
  
  public void setCookie(String paramString)
  {
    this.cookie = paramString;
  }
  
  public void setFormData(String paramString, Map<String, String> paramMap)
  {
    this.formData = paramMap;
    this.contentType = ("application/x-www-form-urlencoded;" + paramString);
  }
  
  public void setIfMatch(String paramString)
  {
    this.if_match = paramString;
  }
  
  public void setIfModifiedSince(String paramString)
  {
    this.if_modified_since = paramString;
  }
  
  public void setIfNoneMatch(String paramString)
  {
    this.if_none_match = paramString;
  }
  
  public void setIfUnmodifiedSince(String paramString)
  {
    this.if_unmodified_since = paramString;
  }
  
  public void setOrigin(String paramString)
  {
    this.origin = paramString;
  }
  
  public void setPragma(String paramString)
  {
    this.pragma = paramString;
  }
  
  public void setReferer(String paramString)
  {
    this.referer = paramString;
  }
  
  public boolean setRequestMethod(int paramInt)
  {
    this.method = paramInt;
    return true;
  }
  
  public void setRequestOtherHeader(String paramString1, String paramString2)
  {
    this.otherHeaders.put(paramString1, paramString2);
  }
  
  public void setUserAgent(String paramString)
  {
    this.user_agent = paramString;
  }
  
  public void setXRequestedWith(String paramString)
  {
    this.x_requested_with = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content-Type:");
    localStringBuilder.append(this.contentType);
    localStringBuilder.append("\n");
    localStringBuilder.append("Accept:");
    localStringBuilder.append(this.accept);
    localStringBuilder.append("\n");
    localStringBuilder.append("Accept-Language:");
    localStringBuilder.append(this.acceptLanguage);
    localStringBuilder.append("\n");
    localStringBuilder.append("Accept-Charset:");
    localStringBuilder.append(this.acceptCharset);
    localStringBuilder.append("\n");
    localStringBuilder.append("User-Agent:");
    localStringBuilder.append(this.user_agent);
    localStringBuilder.append("\n");
    localStringBuilder.append("Cookie:");
    localStringBuilder.append(this.cookie);
    localStringBuilder.append("\n");
    localStringBuilder.append("Referer:");
    localStringBuilder.append(this.referer);
    localStringBuilder.append("\n");
    localStringBuilder.append("Origin:");
    localStringBuilder.append(this.origin);
    localStringBuilder.append("\n");
    localStringBuilder.append("X-Requested-With:");
    localStringBuilder.append(this.x_requested_with);
    localStringBuilder.append("\n");
    localStringBuilder.append("If-Modified-Since:");
    localStringBuilder.append(this.if_modified_since);
    localStringBuilder.append("\n");
    localStringBuilder.append("If-Unmodified-Since:");
    localStringBuilder.append(this.if_unmodified_since);
    localStringBuilder.append("\n");
    localStringBuilder.append("If-None-Match:");
    localStringBuilder.append(this.if_none_match);
    localStringBuilder.append("\n");
    localStringBuilder.append("If-Match:");
    localStringBuilder.append(this.if_match);
    localStringBuilder.append("\n");
    localStringBuilder.append("Pragma:");
    localStringBuilder.append(this.pragma);
    return localStringBuilder.toString();
  }
  
  public byte[] unzipBody(byte[] paramArrayOfByte)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramArrayOfByte = new GZIPInputStream(new ByteArrayInputStream(paramArrayOfByte));
      byte[] arrayOfByte = new byte['က'];
      for (;;)
      {
        int i = paramArrayOfByte.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    return paramArrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\QALHttpHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */