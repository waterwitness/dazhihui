package com.cairh.app.sjkh.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.cairh.app.sjkh.base.BaseFileUploadCallbackActivity;
import com.e.a.a.b;
import com.e.a.a.t;
import com.e.a.a.v;
import com.e.a.a.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.util.Calendar;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.params.HttpParams;

public class FileUploadUtilOld
{
  private static String Tag = "FileUploadUtil";
  private static final short UPLOAD_TYPE_IMAGE = 1;
  private static final short UPLOAD_TYPE_TXT = 2;
  private static b client = new b();
  private static final String uploadLogUrl = "https://sjkh.cairenhui.com/uploadlog/";
  public static String uploadPicUrl;
  public static String uploadVideoUrl;
  private Context mContext;
  private short uploadType = 0;
  private ViewUtil vu;
  
  public FileUploadUtilOld(Context paramContext)
  {
    this.mContext = paramContext;
    this.vu = new ViewUtil((Activity)this.mContext);
  }
  
  public static SSLSocketFactory createSSLSocketFactory()
  {
    try
    {
      Object localObject = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject).load(null, null);
      localObject = new t((KeyStore)localObject);
      return (SSLSocketFactory)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static CookieStore parseCookie(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramContext = new v(paramContext);
    int i;
    if (paramString3 != null)
    {
      paramString3 = paramString3.split(";");
      if (paramString3 != null)
      {
        int j = paramString3.length;
        i = 0;
        if (i < j) {
          break label40;
        }
      }
    }
    return paramContext;
    label40:
    Object localObject = paramString3[i];
    if (localObject == null) {}
    for (;;)
    {
      i += 1;
      break;
      localObject = ((String)localObject).split("=");
      if ((localObject != null) && (localObject.length > 1))
      {
        localObject = new BasicClientCookie(localObject[0], localObject[1]);
        ((BasicClientCookie)localObject).setDomain(paramString1);
        ((BasicClientCookie)localObject).setPath(paramString2);
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.add(12, 5);
        ((BasicClientCookie)localObject).setExpiryDate(localCalendar.getTime());
        ((BasicClientCookie)localObject).setVersion(0);
        paramContext.addCookie((Cookie)localObject);
      }
    }
  }
  
  public void uploadFile(String paramString, z paramz, CookieStore paramCookieStore)
  {
    if (paramString == null) {
      Log.e(Tag, "url is nothing...");
    }
    Log.i(Tag, paramString);
    Log.i(Tag, "uploading...");
    if ((paramString.startsWith("https")) || (paramString.startsWith("HTTPS")))
    {
      SSLSocketFactory localSSLSocketFactory = createSSLSocketFactory();
      if (localSSLSocketFactory != null) {
        client.a(localSSLSocketFactory);
      }
    }
    client.a().getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
    client.a(paramCookieStore);
    client.a(120000);
    client.b(paramString, paramz, new FileUploadUtilOld.1(this, paramString));
  }
  
  public void uploadFileStrengthen(BaseFileUploadCallbackActivity paramBaseFileUploadCallbackActivity, String paramString, z paramz, CookieStore paramCookieStore)
  {
    Log.i(Tag, "uploading...");
    if ((paramString.startsWith("https")) || (paramString.startsWith("HTTPS")))
    {
      SSLSocketFactory localSSLSocketFactory = createSSLSocketFactory();
      if (localSSLSocketFactory != null) {
        client.a(localSSLSocketFactory);
      }
    }
    client.a().getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
    client.a(paramCookieStore);
    client.a(180000);
    client.b(paramString, paramz, new FileUploadUtilOld.2(this, paramBaseFileUploadCallbackActivity));
  }
  
  public void uploadLog(File paramFile, String paramString)
  {
    this.uploadType = 2;
    z localz = new z();
    try
    {
      localz.a("myFiles", paramFile);
      localz.a("mobile", paramString);
      uploadFile("https://sjkh.cairenhui.com/uploadlog/", localz, null);
      return;
    }
    catch (FileNotFoundException paramFile)
    {
      for (;;)
      {
        Toast.makeText(this.mContext, "文件不存在", 1).show();
        paramFile.printStackTrace();
      }
    }
  }
  
  public void uploadPhotos(String paramString1, File paramFile, String paramString2, CookieStore paramCookieStore)
  {
    this.uploadType = 1;
    z localz = new z();
    try
    {
      localz.a("myFiles", paramFile);
      localz.a("picType", paramString2);
      this.vu.showProgressDialog("正在上传和识别，请稍等...");
      uploadFile(paramString1, localz, paramCookieStore);
      return;
    }
    catch (FileNotFoundException paramFile)
    {
      for (;;)
      {
        Toast.makeText(this.mContext, "文件不存在", 1).show();
        paramFile.printStackTrace();
      }
    }
  }
  
  public void uploadPhotos(String paramString1, File paramFile, String paramString2, CookieStore paramCookieStore, String paramString3)
  {
    this.uploadType = 1;
    z localz = new z();
    try
    {
      localz.a("myFiles", paramFile);
      if ((!"".equals(paramString3)) && (paramString3 != null)) {
        localz.a("bizStr", paramString3);
      }
      localz.a("picType", paramString2);
      this.vu.showProgressDialog("正在上传和识别，请稍等...");
      uploadFile(paramString1, localz, paramCookieStore);
      return;
    }
    catch (FileNotFoundException paramFile)
    {
      for (;;)
      {
        Toast.makeText(this.mContext, "文件不存在", 1).show();
        paramFile.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtilOld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */