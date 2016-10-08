package com.android.thinkive.framework.message;

import com.android.thinkive.framework.view.MyWebView;
import org.json.JSONObject;

public class AppMessage
{
  private ICallBack callBack;
  private JSONObject content;
  private long flowNo;
  private int msgId;
  private String sourceModule;
  private String targetModule;
  private MyWebView webView;
  
  public AppMessage(int paramInt, JSONObject paramJSONObject)
  {
    this.msgId = paramInt;
    this.content = paramJSONObject;
    this.flowNo = System.currentTimeMillis();
  }
  
  public AppMessage(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    this(paramInt, paramJSONObject);
    this.targetModule = paramString;
  }
  
  public AppMessage(String paramString1, String paramString2, int paramInt, JSONObject paramJSONObject)
  {
    this(paramString2, paramInt, paramJSONObject);
    this.sourceModule = paramString1;
  }
  
  public ICallBack getCallBack()
  {
    return this.callBack;
  }
  
  public JSONObject getContent()
  {
    return this.content;
  }
  
  public long getFlowNo()
  {
    return this.flowNo;
  }
  
  public int getMsgId()
  {
    return this.msgId;
  }
  
  public String getSourceModule()
  {
    return this.sourceModule;
  }
  
  public String getTargetModule()
  {
    return this.targetModule;
  }
  
  public MyWebView getWebView()
  {
    return this.webView;
  }
  
  public void setCallBack(ICallBack paramICallBack)
  {
    this.callBack = paramICallBack;
  }
  
  public void setContent(JSONObject paramJSONObject)
  {
    this.content = paramJSONObject;
  }
  
  public void setFlowNo(long paramLong)
  {
    this.flowNo = paramLong;
  }
  
  public void setMsgId(int paramInt)
  {
    this.msgId = paramInt;
  }
  
  public void setSourceModule(String paramString)
  {
    this.sourceModule = paramString;
  }
  
  public void setTargetModule(String paramString)
  {
    this.targetModule = paramString;
  }
  
  public void setWebView(MyWebView paramMyWebView)
  {
    this.webView = paramMyWebView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\AppMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */