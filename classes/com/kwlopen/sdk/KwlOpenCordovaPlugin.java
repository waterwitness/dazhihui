package com.kwlopen.sdk;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.kwl.common.utils.LogUtil;
import com.kwlopen.sdk.activity.CaptureVideo;
import com.kwlopen.sdk.activity.SelectPicActivity;
import com.kwlopen.sdk.activity.VideoVitness;
import com.squareup.okhttp.internal.Base64;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class KwlOpenCordovaPlugin
  extends CordovaPlugin
{
  private static final int ANYCHAT_VIDEO = 5;
  protected static final int CPATURE_VIDEO = 2;
  public static final int MEDIA_TYPE_IMAGE = 1;
  public static final int MEDIA_TYPE_VIDEO = 2;
  private static final int UPLOAD_IMAGE = 1;
  public static final int VIDEO_FAILUE = 1;
  public static final int VIDEO_SUCCESS = 0;
  private static KwlOpenCordovaPlugin kwlOpenCordovaPlugin;
  private String base64Code;
  private CallbackContext callbackContext;
  private CordovaInterface cordovaInterface;
  private CordovaPlugin cordovaPlugin;
  private long firstTime;
  private String vercode = "";
  
  private void capture(CallbackContext paramCallbackContext)
  {
    paramCallbackContext = new Intent(this.cordovaInterface.getActivity(), CaptureVideo.class);
    paramCallbackContext.putExtra("vercode", this.vercode);
    this.cordovaInterface.startActivityForResult(this.cordovaPlugin, paramCallbackContext, 2);
  }
  
  private void dopost(String paramString, JSONObject paramJSONObject)
  {
    paramString = new HttpPost(paramString);
    try
    {
      paramString.setEntity(new StringEntity(paramJSONObject.toString()));
      paramString = new JSONObject(EntityUtils.toString(new DefaultHttpClient().execute(paramString).getEntity()));
      System.out.println(paramString);
      this.callbackContext.success(paramString);
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
      return;
    }
    catch (ClientProtocolException paramString)
    {
      paramString.printStackTrace();
      return;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static KwlOpenCordovaPlugin getInstance()
  {
    if (kwlOpenCordovaPlugin == null) {
      kwlOpenCordovaPlugin = new KwlOpenCordovaPlugin();
    }
    return kwlOpenCordovaPlugin;
  }
  
  /* Error */
  private byte[] readFile(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: new 156	java/io/FileInputStream
    //   8: dup
    //   9: new 158	java/io/File
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 159	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: invokespecial 162	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   20: astore_2
    //   21: aload 4
    //   23: astore_1
    //   24: aload_2
    //   25: invokevirtual 166	java/io/FileInputStream:available	()I
    //   28: newarray <illegal type>
    //   30: astore_3
    //   31: aload_3
    //   32: astore_1
    //   33: aload_2
    //   34: aload_3
    //   35: invokevirtual 170	java/io/FileInputStream:read	([B)I
    //   38: pop
    //   39: aload_2
    //   40: invokevirtual 173	java/io/FileInputStream:close	()V
    //   43: aload_3
    //   44: areturn
    //   45: astore_1
    //   46: aconst_null
    //   47: astore_2
    //   48: aload_3
    //   49: astore_1
    //   50: aload_2
    //   51: invokevirtual 173	java/io/FileInputStream:close	()V
    //   54: aload_1
    //   55: areturn
    //   56: astore_1
    //   57: aconst_null
    //   58: astore_2
    //   59: aload_2
    //   60: invokevirtual 173	java/io/FileInputStream:close	()V
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: goto -7 -> 59
    //   69: astore_3
    //   70: goto -20 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	KwlOpenCordovaPlugin
    //   0	73	1	paramString	String
    //   20	40	2	localFileInputStream	java.io.FileInputStream
    //   4	45	3	arrayOfByte	byte[]
    //   69	1	3	localException	Exception
    //   1	21	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	21	45	java/lang/Exception
    //   5	21	56	finally
    //   24	31	65	finally
    //   33	39	65	finally
    //   24	31	69	java/lang/Exception
    //   33	39	69	java/lang/Exception
  }
  
  private void showToast()
  {
    long l = System.currentTimeMillis();
    if (l - this.firstTime > 2000L)
    {
      Toast.makeText(this.cordovaInterface.getActivity(), "请再按一次", 0).show();
      this.firstTime = l;
      return;
    }
    this.cordovaInterface.getActivity().finish();
  }
  
  private void upLoadVideo(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return;
    }
    try
    {
      this.base64Code = Base64.encode(readFile(paramString));
      this.cordovaInterface.getThreadPool().execute(new KwlOpenCordovaPlugin.6(this));
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  private void uploadImage(CallbackContext paramCallbackContext)
  {
    this.cordovaInterface.startActivityForResult(this.cordovaPlugin, new Intent(this.cordovaInterface.getActivity(), SelectPicActivity.class), 1);
  }
  
  public boolean execute(String paramString, JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    return execute(this.cordova, this, paramString, paramJSONArray, paramCallbackContext);
  }
  
  public boolean execute(CordovaInterface paramCordovaInterface, CordovaPlugin paramCordovaPlugin, String paramString, JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    this.cordovaInterface = paramCordovaInterface;
    this.cordovaPlugin = paramCordovaPlugin;
    this.callbackContext = paramCallbackContext;
    if (paramString.equals("capture")) {
      try
      {
        this.vercode = ((String)paramJSONArray.getJSONObject(0).get("vercode"));
        capture(paramCallbackContext);
        return true;
      }
      catch (JSONException paramCordovaInterface)
      {
        for (;;)
        {
          paramCordovaInterface.printStackTrace();
        }
      }
    }
    if (paramString.equals("uploadImage"))
    {
      uploadImage(paramCallbackContext);
      return true;
    }
    if (paramString.equals("showToast"))
    {
      showToast();
      return true;
    }
    if (paramString.equals("refresh")) {
      return true;
    }
    if (paramString.equals("DIYCamera")) {
      return true;
    }
    if (paramString.equals("post")) {
      try
      {
        dopost("http://192.168.14.47:8088/kow/qwopenacct.do", (JSONObject)paramJSONArray.getJSONObject(0).get("param"));
        return true;
      }
      catch (JSONException paramCordovaInterface)
      {
        for (;;)
        {
          paramCordovaInterface.printStackTrace();
        }
      }
    }
    if (paramString.equals("openAccountFinish")) {}
    while ((paramString.equals("openAccountSafeExit")) || (!paramString.equals("captureAnychatVideo"))) {
      try
      {
        paramCordovaInterface = (String)paramJSONArray.getJSONObject(0).get("company");
        return false;
      }
      catch (JSONException paramCordovaInterface)
      {
        for (;;)
        {
          paramCordovaInterface.printStackTrace();
        }
      }
    }
    try
    {
      paramCordovaInterface = paramJSONArray.getJSONObject(0).getString("anychatServerAddr");
      int i = paramJSONArray.getJSONObject(0).getInt("anychatServerPort");
      int j = paramJSONArray.getJSONObject(0).getInt("anychatRemoteUserId");
      paramString = paramJSONArray.getJSONObject(0).getString("mobileTel");
      paramJSONArray = new Intent();
      paramJSONArray.putExtra("anychatServerAddr", paramCordovaInterface);
      paramJSONArray.putExtra("anychatServerPort", i);
      paramJSONArray.putExtra("anychatRemoteUserId", j);
      paramJSONArray.putExtra("mobileTel", paramString);
      paramJSONArray.setClass(this.cordovaInterface.getActivity(), VideoVitness.class);
      this.cordovaInterface.startActivityForResult(paramCordovaPlugin, paramJSONArray, 5);
      return true;
    }
    catch (JSONException paramCordovaInterface)
    {
      for (;;)
      {
        paramCordovaInterface.printStackTrace();
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    LogUtil.writeLog("onActivityResult cordovaOlugin");
    String str = null;
    if (paramInt2 == -1)
    {
      if (paramInt1 != 5) {
        break label256;
      }
      paramInt1 = paramIntent.getIntExtra("errcode", 0);
      str = paramIntent.getStringExtra("errmsg");
      if ((str != null) && (!str.equals(""))) {
        Toast.makeText(this.cordovaInterface.getActivity(), str, 1).show();
      }
      if (paramInt1 != 0) {
        break label232;
      }
      paramInt1 = paramIntent.getIntExtra("flag", 1);
      LogUtil.d("onActivityResult ---videoFragment=" + paramInt1);
      if (paramInt1 == 0) {
        break label208;
      }
      if (paramInt1 != 1) {
        break label189;
      }
      paramIntent.getStringExtra("errmsg");
      if (!str.contains("视频见证")) {
        break label154;
      }
      this.cordovaInterface.getThreadPool().execute(new KwlOpenCordovaPlugin.1(this));
    }
    label154:
    label189:
    label208:
    label232:
    label256:
    do
    {
      do
      {
        return;
      } while (!str.contains("影像上传"));
      this.cordovaInterface.getThreadPool().execute(new KwlOpenCordovaPlugin.2(this, paramInt1));
      return;
      Toast.makeText(this.cordovaInterface.getActivity(), "视频认证不通过，请继续认证", 1).show();
      this.cordovaInterface.getThreadPool().execute(new KwlOpenCordovaPlugin.3(this, paramInt1));
      return;
      this.cordovaInterface.getThreadPool().execute(new KwlOpenCordovaPlugin.4(this, paramInt1));
      return;
      if (paramInt1 == 1) {
        str = paramIntent.getStringExtra("photo_path");
      }
      if (paramInt1 == 2)
      {
        upLoadVideo(paramIntent.getStringExtra("videoPath"));
        return;
      }
    } while (str == null);
    try
    {
      this.base64Code = Base64.encode(readFile(str));
      this.cordovaInterface.getThreadPool().execute(new KwlOpenCordovaPlugin.5(this));
      return;
    }
    catch (Exception paramIntent)
    {
      paramIntent.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\KwlOpenCordovaPlugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */