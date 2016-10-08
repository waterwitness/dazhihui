package com.tencent.connect.common;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils.HttpStatusException;
import com.tencent.open.utils.HttpUtils.NetworkUnavailableException;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseApi$TempRequestListener
  implements IRequestListener
{
  private final Handler mHandler;
  private final IUiListener mListener;
  
  public BaseApi$TempRequestListener(BaseApi paramBaseApi, IUiListener paramIUiListener)
  {
    this.mListener = paramIUiListener;
    this.mHandler = new BaseApi.TempRequestListener.1(this, Global.getContext().getMainLooper(), paramBaseApi);
  }
  
  public void onComplete(JSONObject paramJSONObject)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramJSONObject;
    localMessage.what = 0;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onConnectTimeoutException(ConnectTimeoutException paramConnectTimeoutException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramConnectTimeoutException.getMessage();
    localMessage.what = -7;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onHttpStatusException(HttpUtils.HttpStatusException paramHttpStatusException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramHttpStatusException.getMessage();
    localMessage.what = -9;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onIOException(IOException paramIOException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramIOException.getMessage();
    localMessage.what = -2;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onJSONException(JSONException paramJSONException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramJSONException.getMessage();
    localMessage.what = -4;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onMalformedURLException(MalformedURLException paramMalformedURLException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramMalformedURLException.getMessage();
    localMessage.what = -3;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onNetworkUnavailableException(HttpUtils.NetworkUnavailableException paramNetworkUnavailableException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramNetworkUnavailableException.getMessage();
    localMessage.what = -10;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onSocketTimeoutException(SocketTimeoutException paramSocketTimeoutException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramSocketTimeoutException.getMessage();
    localMessage.what = -8;
    this.mHandler.sendMessage(localMessage);
  }
  
  public void onUnknowException(Exception paramException)
  {
    Message localMessage = this.mHandler.obtainMessage();
    localMessage.obj = paramException.getMessage();
    localMessage.what = -6;
    this.mHandler.sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\common\BaseApi$TempRequestListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */