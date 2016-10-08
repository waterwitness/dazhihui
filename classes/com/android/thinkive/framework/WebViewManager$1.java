package com.android.thinkive.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;
import java.util.ArrayList;
import java.util.Random;

class WebViewManager$1
  extends BroadcastReceiver
{
  WebViewManager$1(WebViewManager paramWebViewManager) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = ConfigManager.getInstance().getSystemConfigValue("disableH5AutoReload");
    if ((!TextUtils.isEmpty(paramContext)) && (Boolean.parseBoolean(paramContext))) {
      return;
    }
    int i = 0;
    label27:
    String str1;
    String str2;
    if (i < WebViewManager.access$0(this.this$0).size())
    {
      paramIntent = (MyWebView)WebViewManager.access$0(this.this$0).get(i);
      paramContext = paramIntent.getLoadUrl();
      str1 = paramIntent.getUrlPrefix();
      str2 = paramIntent.getUrlSuffix();
      if (!TextUtils.isEmpty(paramContext)) {
        if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2))) {
          break label179;
        }
      }
    }
    label179:
    for (paramContext = str1 + "?random=" + new Random().nextInt(1000) + "#!/" + str2;; paramContext = paramContext + "?random=" + new Random().nextInt(1000))
    {
      WebViewManager.access$1(this.this$0, paramIntent, paramContext);
      Log.d("H5 upgrade reload url = " + paramContext);
      i += 1;
      break label27;
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\WebViewManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */