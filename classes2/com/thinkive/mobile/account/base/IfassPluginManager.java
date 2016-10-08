package com.thinkive.mobile.account.base;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import c;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.compatible.TaskScheduler;
import java.util.HashMap;

public class IfassPluginManager
{
  public static void call(HashMap<String, String> paramHashMap, Context paramContext, PluginCallback paramPluginCallback)
  {
    if (TextUtils.isEmpty((CharSequence)paramHashMap.get("channel_key")))
    {
      Toast.makeText(paramContext, "渠道key不能为空！", 1).show();
      return;
    }
    if (TextUtils.isEmpty((CharSequence)paramHashMap.get("sec_name_en")))
    {
      Toast.makeText(paramContext, "券商参数不能为空！", 1).show();
      return;
    }
    ThinkiveInitializer.getInstance().getScheduler().start(new c(paramContext, paramHashMap, paramPluginCallback));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\base\IfassPluginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */