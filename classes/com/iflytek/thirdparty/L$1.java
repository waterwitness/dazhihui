package com.iflytek.thirdparty;

import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.util.FileDownloadListener;
import java.util.HashMap;

class L$1
  implements V
{
  L$1(L paramL) {}
  
  public void a(int paramInt, U paramU)
  {
    X.b("httpdownload onError:errorCode:" + paramInt);
    if (L.a(this.a) == null) {
      paramU.a();
    }
    do
    {
      return;
      if (L.b(this.a).size() > 0) {
        L.b(this.a).remove(Long.valueOf(paramU.b()));
      }
      if (L.a(this.a).size() > 0) {
        L.a(this.a).remove(Long.valueOf(paramU.b()));
      }
    } while ((L.d(this.a).size() <= 0) || (L.d(this.a).get(Long.valueOf(paramU.b())) == null));
    ((FileDownloadListener)L.d(this.a).get(Long.valueOf(paramU.b()))).onCompleted(null, new SpeechError(paramInt));
    L.d(this.a).remove(Long.valueOf(paramU.b()));
  }
  
  public void a(long paramLong, int paramInt, U paramU)
  {
    X.a("httpdownload onProgress:currentBytes:" + paramLong + " percent:" + paramInt);
    if (L.a(this.a) == null) {
      paramU.a();
    }
    while ((L.d(this.a).size() <= 0) || (L.d(this.a).get(Long.valueOf(paramU.b())) == null)) {
      return;
    }
    ((FileDownloadListener)L.d(this.a).get(Long.valueOf(paramU.b()))).onProgress(paramInt);
  }
  
  public void a(long paramLong, String paramString1, String paramString2, String paramString3, U paramU)
  {
    X.a("httpdownload onStart:length:" + paramLong + " mimeType:" + paramString1 + " newPath:" + paramString2);
    if (L.a(this.a) == null) {
      paramU.a();
    }
    do
    {
      return;
      L.b(this.a).put(Long.valueOf(paramU.b()), paramString2);
      paramString1 = (aa)L.a(this.a).get(Long.valueOf(paramU.b()));
      L.c(this.a).a(paramString1.e("download_uri"), paramString2);
    } while ((L.d(this.a).size() <= 0) || (L.d(this.a).get(Long.valueOf(paramU.b())) == null));
    ((FileDownloadListener)L.d(this.a).get(Long.valueOf(paramU.b()))).onStart();
  }
  
  public void a(String paramString, U paramU)
  {
    X.a("httpdownload onFinish:fileName:" + paramString);
    if (L.a(this.a) == null) {
      paramU.a();
    }
    String str;
    do
    {
      return;
      if (L.b(this.a).size() > 0) {
        L.b(this.a).remove(Long.valueOf(paramU.b()));
      }
      str = ((aa)L.a(this.a).get(Long.valueOf(paramU.b()))).e("file_md5");
      if (L.a(this.a).size() > 0)
      {
        L.c(this.a).a(((aa)L.a(this.a).get(Long.valueOf(paramU.b()))).e("download_uri"));
        L.a(this.a).remove(Long.valueOf(paramU.b()));
      }
      X.a("path=" + paramString);
    } while ((L.d(this.a).size() <= 0) || (L.d(this.a).get(Long.valueOf(paramU.b())) == null));
    FileDownloadListener localFileDownloadListener = (FileDownloadListener)L.d(this.a).get(Long.valueOf(paramU.b()));
    if (M.a(str, paramString))
    {
      X.a("this file calculate md5 success！");
      localFileDownloadListener.onCompleted(paramString, null);
    }
    for (;;)
    {
      L.d(this.a).remove(Long.valueOf(paramU.b()));
      return;
      localFileDownloadListener.onCompleted(null, new SpeechError(20014));
      X.b("this file calculate md5 error!");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\L$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */