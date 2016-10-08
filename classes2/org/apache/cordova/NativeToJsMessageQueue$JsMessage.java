package org.apache.cordova;

class NativeToJsMessageQueue$JsMessage
{
  final String jsPayloadOrCallbackId;
  final PluginResult pluginResult;
  
  NativeToJsMessageQueue$JsMessage(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.jsPayloadOrCallbackId = paramString;
    this.pluginResult = null;
  }
  
  NativeToJsMessageQueue$JsMessage(PluginResult paramPluginResult, String paramString)
  {
    if ((paramString == null) || (paramPluginResult == null)) {
      throw new NullPointerException();
    }
    this.jsPayloadOrCallbackId = paramString;
    this.pluginResult = paramPluginResult;
  }
  
  int calculateEncodedLength()
  {
    if (this.pluginResult == null) {
      return this.jsPayloadOrCallbackId.length() + 1;
    }
    int i = String.valueOf(this.pluginResult.getStatus()).length() + 2 + 1 + this.jsPayloadOrCallbackId.length() + 1;
    switch (this.pluginResult.getMessageType())
    {
    case 2: 
    default: 
      return i + this.pluginResult.getMessage().length();
    case 4: 
    case 5: 
      return i + 1;
    case 3: 
      return i + (this.pluginResult.getMessage().length() + 1);
    case 1: 
      return i + (this.pluginResult.getStrMessage().length() + 1);
    case 7: 
      return i + (this.pluginResult.getMessage().length() + 1);
    }
    return i + (this.pluginResult.getMessage().length() + 1);
  }
  
  void encodeAsJsMessage(StringBuilder paramStringBuilder)
  {
    if (this.pluginResult == null)
    {
      paramStringBuilder.append(this.jsPayloadOrCallbackId);
      return;
    }
    int i = this.pluginResult.getStatus();
    boolean bool;
    if ((i != PluginResult.Status.OK.ordinal()) && (i != PluginResult.Status.NO_RESULT.ordinal()))
    {
      bool = false;
      paramStringBuilder.append("cordova.callbackFromNative('").append(this.jsPayloadOrCallbackId).append("',").append(bool).append(",").append(i).append(",[");
      switch (this.pluginResult.getMessageType())
      {
      default: 
        paramStringBuilder.append(this.pluginResult.getMessage());
      }
    }
    for (;;)
    {
      paramStringBuilder.append("],").append(this.pluginResult.getKeepCallback()).append(");");
      return;
      bool = true;
      break;
      paramStringBuilder.append("atob('").append(this.pluginResult.getMessage()).append("')");
      continue;
      paramStringBuilder.append("cordova.require('cordova/base64').toArrayBuffer('").append(this.pluginResult.getMessage()).append("')");
    }
  }
  
  void encodeAsMessage(StringBuilder paramStringBuilder)
  {
    int j = 1;
    if (this.pluginResult == null)
    {
      paramStringBuilder.append('J').append(this.jsPayloadOrCallbackId);
      return;
    }
    int k = this.pluginResult.getStatus();
    int i;
    label48:
    label59:
    label81:
    StringBuilder localStringBuilder;
    if (k == PluginResult.Status.NO_RESULT.ordinal())
    {
      i = 1;
      if (k != PluginResult.Status.OK.ordinal()) {
        break label191;
      }
      boolean bool = this.pluginResult.getKeepCallback();
      if ((i == 0) && (j == 0)) {
        break label197;
      }
      c = 'S';
      localStringBuilder = paramStringBuilder.append(c);
      if (!bool) {
        break label203;
      }
    }
    label191:
    label197:
    label203:
    for (char c = '1';; c = '0')
    {
      localStringBuilder.append(c).append(k).append(' ').append(this.jsPayloadOrCallbackId).append(' ');
      switch (this.pluginResult.getMessageType())
      {
      case 2: 
      default: 
        paramStringBuilder.append(this.pluginResult.getMessage());
        return;
        i = 0;
        break label48;
        j = 0;
        break label59;
        c = 'F';
        break label81;
      }
    }
    paramStringBuilder.append(this.pluginResult.getMessage().charAt(0));
    return;
    paramStringBuilder.append('N');
    return;
    paramStringBuilder.append('n').append(this.pluginResult.getMessage());
    return;
    paramStringBuilder.append('s');
    paramStringBuilder.append(this.pluginResult.getStrMessage());
    return;
    paramStringBuilder.append('S');
    paramStringBuilder.append(this.pluginResult.getMessage());
    return;
    paramStringBuilder.append('A');
    paramStringBuilder.append(this.pluginResult.getMessage());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue$JsMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */