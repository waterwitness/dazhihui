package org.apache.cordova;

import android.util.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

public class PluginResult
{
  public static final int MESSAGE_TYPE_ARRAYBUFFER = 6;
  public static final int MESSAGE_TYPE_BINARYSTRING = 7;
  public static final int MESSAGE_TYPE_BOOLEAN = 4;
  public static final int MESSAGE_TYPE_JSON = 2;
  public static final int MESSAGE_TYPE_NULL = 5;
  public static final int MESSAGE_TYPE_NUMBER = 3;
  public static final int MESSAGE_TYPE_STRING = 1;
  public static String[] StatusMessages = { "No result", "OK", "Class not found", "Illegal access", "Instantiation error", "Malformed url", "IO error", "Invalid action", "JSON error", "Error" };
  private String encodedMessage;
  private boolean keepCallback = false;
  private final int messageType;
  private final int status;
  private String strMessage;
  
  public PluginResult(PluginResult.Status paramStatus)
  {
    this(paramStatus, StatusMessages[paramStatus.ordinal()]);
  }
  
  public PluginResult(PluginResult.Status paramStatus, float paramFloat)
  {
    this.status = paramStatus.ordinal();
    this.messageType = 3;
    this.encodedMessage = paramFloat;
  }
  
  public PluginResult(PluginResult.Status paramStatus, int paramInt)
  {
    this.status = paramStatus.ordinal();
    this.messageType = 3;
    this.encodedMessage = paramInt;
  }
  
  public PluginResult(PluginResult.Status paramStatus, String paramString)
  {
    this.status = paramStatus.ordinal();
    if (paramString == null) {}
    for (int i = 5;; i = 1)
    {
      this.messageType = i;
      this.strMessage = paramString;
      return;
    }
  }
  
  public PluginResult(PluginResult.Status paramStatus, JSONArray paramJSONArray)
  {
    this.status = paramStatus.ordinal();
    this.messageType = 2;
    this.encodedMessage = paramJSONArray.toString();
  }
  
  public PluginResult(PluginResult.Status paramStatus, JSONObject paramJSONObject)
  {
    this.status = paramStatus.ordinal();
    this.messageType = 2;
    this.encodedMessage = paramJSONObject.toString();
  }
  
  public PluginResult(PluginResult.Status paramStatus, boolean paramBoolean)
  {
    this.status = paramStatus.ordinal();
    this.messageType = 4;
    this.encodedMessage = Boolean.toString(paramBoolean);
  }
  
  public PluginResult(PluginResult.Status paramStatus, byte[] paramArrayOfByte)
  {
    this(paramStatus, paramArrayOfByte, false);
  }
  
  public PluginResult(PluginResult.Status paramStatus, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.status = paramStatus.ordinal();
    if (paramBoolean) {}
    for (int i = 7;; i = 6)
    {
      this.messageType = i;
      this.encodedMessage = Base64.encodeToString(paramArrayOfByte, 2);
      return;
    }
  }
  
  @Deprecated
  public String getJSONString()
  {
    return "{\"status\":" + this.status + ",\"message\":" + getMessage() + ",\"keepCallback\":" + this.keepCallback + "}";
  }
  
  public boolean getKeepCallback()
  {
    return this.keepCallback;
  }
  
  public String getMessage()
  {
    if (this.encodedMessage == null) {
      this.encodedMessage = JSONObject.quote(this.strMessage);
    }
    return this.encodedMessage;
  }
  
  public int getMessageType()
  {
    return this.messageType;
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public String getStrMessage()
  {
    return this.strMessage;
  }
  
  public void setKeepCallback(boolean paramBoolean)
  {
    this.keepCallback = paramBoolean;
  }
  
  @Deprecated
  public String toCallbackString(String paramString)
  {
    if ((this.status == PluginResult.Status.NO_RESULT.ordinal()) && (this.keepCallback)) {
      return null;
    }
    if ((this.status == PluginResult.Status.OK.ordinal()) || (this.status == PluginResult.Status.NO_RESULT.ordinal())) {
      return toSuccessCallbackString(paramString);
    }
    return toErrorCallbackString(paramString);
  }
  
  @Deprecated
  public String toErrorCallbackString(String paramString)
  {
    return "cordova.callbackError('" + paramString + "', " + getJSONString() + ");";
  }
  
  @Deprecated
  public String toSuccessCallbackString(String paramString)
  {
    return "cordova.callbackSuccess('" + paramString + "'," + getJSONString() + ");";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\PluginResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */