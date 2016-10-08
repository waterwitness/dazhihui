package org.apache.cordova;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;

public class NativeToJsMessageQueue
{
  private static final int DEFAULT_BRIDGE_MODE = 2;
  static final boolean DISABLE_EXEC_CHAINING = false;
  static final boolean ENABLE_LOCATION_CHANGE_EXEC_MODE = false;
  private static final boolean FORCE_ENCODE_USING_EVAL = false;
  private static final String LOG_TAG = "JsMessageQueue";
  private static int MAX_PAYLOAD_SIZE = 524288000;
  private int activeListenerIndex;
  private final CordovaInterface cordova;
  private boolean paused;
  private final LinkedList<NativeToJsMessageQueue.JsMessage> queue = new LinkedList();
  private final NativeToJsMessageQueue.BridgeMode[] registeredListeners;
  private final CordovaWebView webView;
  
  public NativeToJsMessageQueue(CordovaWebView paramCordovaWebView, CordovaInterface paramCordovaInterface)
  {
    this.cordova = paramCordovaInterface;
    this.webView = paramCordovaWebView;
    this.registeredListeners = new NativeToJsMessageQueue.BridgeMode[4];
    this.registeredListeners[0] = new NativeToJsMessageQueue.PollingBridgeMode(this, null);
    this.registeredListeners[1] = new NativeToJsMessageQueue.LoadUrlBridgeMode(this, null);
    this.registeredListeners[2] = new NativeToJsMessageQueue.OnlineEventsBridgeMode(this, null);
    this.registeredListeners[3] = new NativeToJsMessageQueue.PrivateApiBridgeMode(this, null);
    reset();
  }
  
  private int calculatePackedMessageLength(NativeToJsMessageQueue.JsMessage paramJsMessage)
  {
    int i = paramJsMessage.calculateEncodedLength();
    return i + String.valueOf(i).length() + 1;
  }
  
  private void enqueueMessage(NativeToJsMessageQueue.JsMessage paramJsMessage)
  {
    try
    {
      this.queue.add(paramJsMessage);
      if (!this.paused) {
        this.registeredListeners[this.activeListenerIndex].onNativeToJsMessageAvailable();
      }
      return;
    }
    finally {}
  }
  
  private void packMessage(NativeToJsMessageQueue.JsMessage paramJsMessage, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(paramJsMessage.calculateEncodedLength()).append(' ');
    paramJsMessage.encodeAsMessage(paramStringBuilder);
  }
  
  private String popAndEncodeAsJs()
  {
    for (;;)
    {
      Object localObject;
      int j;
      try
      {
        if (this.queue.size() == 0) {
          return null;
        }
        localObject = this.queue.iterator();
        j = 0;
        i = 0;
        if (((Iterator)localObject).hasNext()) {
          break label116;
        }
        if (j != this.queue.size()) {
          break label249;
        }
        k = 1;
        if (k == 0) {
          break label255;
        }
        m = 0;
        localObject = new StringBuilder(m + i);
        i = 0;
        if (i < j) {
          break label157;
        }
        if (k != 0) {
          break label225;
        }
        ((StringBuilder)localObject).append("window.setTimeout(function(){cordova.require('cordova/plugin/android/polling').pollOnce();},0);");
      }
      finally {}
      if (i >= j)
      {
        localObject = ((StringBuilder)localObject).toString();
        return (String)localObject;
        label116:
        k = ((NativeToJsMessageQueue.JsMessage)localStringBuilder.next()).calculateEncodedLength() + 50;
        if ((j > 0) && (i + k > MAX_PAYLOAD_SIZE))
        {
          if (MAX_PAYLOAD_SIZE > 0) {
            continue;
          }
          break label235;
          label157:
          NativeToJsMessageQueue.JsMessage localJsMessage = (NativeToJsMessageQueue.JsMessage)this.queue.removeFirst();
          if ((k != 0) && (i + 1 == j))
          {
            localJsMessage.encodeAsJsMessage(localStringBuilder);
            break label262;
          }
          localStringBuilder.append("try{");
          localJsMessage.encodeAsJsMessage(localStringBuilder);
          localStringBuilder.append("}finally{");
          break label262;
        }
      }
      else
      {
        localStringBuilder.append('}');
        i += 1;
        continue;
        label225:
        if (k == 0) {
          break label269;
        }
        i = 1;
        continue;
      }
      label235:
      i += k;
      j += 1;
      continue;
      label249:
      int k = 0;
      continue;
      label255:
      int m = 100;
      continue;
      label262:
      i += 1;
      continue;
      label269:
      int i = 0;
    }
  }
  
  public void addJavaScript(String paramString)
  {
    enqueueMessage(new NativeToJsMessageQueue.JsMessage(paramString));
  }
  
  public void addPluginResult(PluginResult paramPluginResult, String paramString)
  {
    if (paramString == null)
    {
      Log.e("JsMessageQueue", "Got plugin result with no callbackId", new Throwable());
      return;
    }
    if (paramPluginResult.getStatus() == PluginResult.Status.NO_RESULT.ordinal()) {}
    for (int i = 1;; i = 0)
    {
      boolean bool = paramPluginResult.getKeepCallback();
      if ((i != 0) && (bool)) {
        break;
      }
      enqueueMessage(new NativeToJsMessageQueue.JsMessage(paramPluginResult, paramString));
      return;
    }
  }
  
  public boolean getPaused()
  {
    return this.paused;
  }
  
  public String popAndEncode(boolean paramBoolean)
  {
    int k = 0;
    for (;;)
    {
      int i;
      int j;
      try
      {
        this.registeredListeners[this.activeListenerIndex].notifyOfFlush(paramBoolean);
        if (this.queue.isEmpty()) {
          return null;
        }
        Object localObject = this.queue.iterator();
        i = 0;
        j = 0;
        if (!((Iterator)localObject).hasNext())
        {
          localObject = new StringBuilder(j);
          j = k;
          if (j < i) {
            break label144;
          }
          if (!this.queue.isEmpty()) {
            ((StringBuilder)localObject).append('*');
          }
          localObject = ((StringBuilder)localObject).toString();
          return (String)localObject;
        }
      }
      finally {}
      int m = calculatePackedMessageLength((NativeToJsMessageQueue.JsMessage)localStringBuilder.next());
      if ((i > 0) && (j + m > MAX_PAYLOAD_SIZE))
      {
        if (MAX_PAYLOAD_SIZE > 0) {
          continue;
        }
        break label168;
        label144:
        packMessage((NativeToJsMessageQueue.JsMessage)this.queue.removeFirst(), localStringBuilder);
        j += 1;
        continue;
      }
      label168:
      j += m;
      i += 1;
    }
  }
  
  public void reset()
  {
    try
    {
      this.queue.clear();
      setBridgeMode(2);
      this.registeredListeners[this.activeListenerIndex].reset();
      return;
    }
    finally {}
  }
  
  public void setBridgeMode(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.registeredListeners.length)) {
      Log.d("JsMessageQueue", "Invalid NativeToJsBridgeMode: " + paramInt);
    }
    while (paramInt == this.activeListenerIndex) {
      return;
    }
    Log.d("JsMessageQueue", "Set native->JS mode to " + paramInt);
    try
    {
      this.activeListenerIndex = paramInt;
      NativeToJsMessageQueue.BridgeMode localBridgeMode = this.registeredListeners[paramInt];
      localBridgeMode.reset();
      if ((!this.paused) && (!this.queue.isEmpty())) {
        localBridgeMode.onNativeToJsMessageAvailable();
      }
      return;
    }
    finally {}
  }
  
  public void setPaused(boolean paramBoolean)
  {
    if ((this.paused) && (paramBoolean)) {
      Log.e("JsMessageQueue", "nested call to setPaused detected.", new Throwable());
    }
    this.paused = paramBoolean;
    if (!paramBoolean) {
      try
      {
        if (!this.queue.isEmpty()) {
          this.registeredListeners[this.activeListenerIndex].onNativeToJsMessageAvailable();
        }
        return;
      }
      finally {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */