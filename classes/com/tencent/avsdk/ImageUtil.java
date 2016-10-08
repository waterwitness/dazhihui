package com.tencent.avsdk;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ImageUtil
{
  private final String TAG = "ImageUtil";
  
  public String Send(HttpEntity paramHttpEntity, String paramString)
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    localDefaultHttpClient.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
    paramString = new HttpPost(paramString);
    paramString.setEntity(paramHttpEntity);
    System.out.println("executing request: " + paramString.getRequestLine());
    paramHttpEntity = null;
    try
    {
      paramString = localDefaultHttpClient.execute(paramString);
      paramHttpEntity = paramString;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
      paramString = paramHttpEntity.getEntity();
      int i = paramHttpEntity.getStatusLine().getStatusCode();
      localDefaultHttpClient.getConnectionManager().shutdown();
      if (i != 200) {
        break label147;
      }
      try
      {
        paramHttpEntity = EntityUtils.toString(paramString, "utf-8");
        return paramHttpEntity;
      }
      catch (IOException paramHttpEntity)
      {
        paramHttpEntity.printStackTrace();
      }
    }
    if (paramHttpEntity == null) {
      return "";
    }
    label147:
    return "";
  }
  
  public Bitmap getImageFromServer(String paramString)
  {
    return null;
  }
  
  public String requestRecordList(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    MultipartEntity localMultipartEntity = new MultipartEntity();
    localMultipartEntity.addPart(paramString2, new StringBody(paramJSONObject.toString(), Charset.forName("UTF-8")));
    Log.d("ImageUtil", "requestRecordList url " + paramString1);
    Log.d("ImageUtil", "requestRecordList object " + paramJSONObject);
    Log.d("ImageUtil", "requestRecordList entity " + localMultipartEntity);
    paramString1 = new HttpPost(paramString1);
    new ArrayList();
    paramString1.setEntity(localMultipartEntity);
    paramJSONObject = null;
    try
    {
      paramString1 = new DefaultHttpClient().execute(paramString1);
      paramJSONObject = paramString1;
    }
    catch (IOException paramString1)
    {
      for (;;)
      {
        try
        {
          paramJSONObject = EntityUtils.toString(paramJSONObject.getEntity());
          Log.d("ImageUtil", "requestRecordList strResult " + paramJSONObject);
          return paramJSONObject;
        }
        catch (IOException paramJSONObject)
        {
          paramJSONObject.printStackTrace();
        }
        paramString1 = paramString1;
        paramString1.printStackTrace();
      }
    }
    if (paramJSONObject.getStatusLine().getStatusCode() == 200) {}
    return "";
  }
  
  public void saveImage(Bitmap paramBitmap, String paramString)
  {
    paramString = new File(paramString);
    if (paramString.exists()) {
      paramString.delete();
    }
    try
    {
      paramString.createNewFile();
    }
    catch (IOException paramString)
    {
      try
      {
        paramString = new FileOutputStream(paramString);
        if (paramString != null) {
          paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, paramString);
        }
      }
      catch (FileNotFoundException paramString)
      {
        try
        {
          for (;;)
          {
            paramString.flush();
            try
            {
              paramString.close();
              return;
            }
            catch (IOException paramBitmap)
            {
              Log.w("ImageUtil", "222" + paramBitmap.toString());
              paramBitmap.printStackTrace();
            }
            localIOException = localIOException;
            Log.w("ImageUtil", "00" + localIOException.toString());
            localIOException.printStackTrace();
          }
          paramString = paramString;
          Log.w("ImageUtil", "22" + paramString.toString());
          paramString.printStackTrace();
          paramString = null;
        }
        catch (IOException paramBitmap)
        {
          for (;;)
          {
            Log.w("ImageUtil", "111" + paramBitmap.toString());
            paramBitmap.printStackTrace();
          }
        }
      }
    }
  }
  
  public int sendCoverToServer(String paramString1, JSONObject paramJSONObject, String paramString2, String paramString3)
  {
    paramString1 = new File(paramString1);
    if (!paramString1.exists()) {}
    try
    {
      paramString1.createNewFile();
      MultipartEntity localMultipartEntity = new MultipartEntity();
      paramJSONObject = new StringBody(paramJSONObject.toString(), Charset.forName("UTF-8"));
      localMultipartEntity.addPart("image", new FileBody(paramString1, "image/jpg"));
      localMultipartEntity.addPart(paramString3, paramJSONObject);
      paramString1 = Send(localMultipartEntity, paramString2);
      if (!paramString1.endsWith("}"))
      {
        Log.e("ImageUtil", "sendCoverToServer response is not json style" + paramString1);
        return -1;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
      int i = ((JSONObject)new JSONTokener(paramString1).nextValue()).getInt("code");
      Log.w("ImageUtil", "ret = " + i);
      Log.d("ImageUtil", "sendCoverToServer " + paramString1);
      return i;
    }
  }
  
  public int sendHeadToServer(String paramString, UserInfo paramUserInfo)
  {
    return -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\ImageUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */