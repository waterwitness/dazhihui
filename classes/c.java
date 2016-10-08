import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.network.NetWorkState;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.AppUtil;
import com.android.thinkive.framework.util.DeviceUtil;
import com.android.thinkive.framework.util.NetWorkUtil;
import com.android.thinkive.framework.util.ScreenUtil;
import com.thinkive.mobile.account.base.PluginCallback;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements CallBack.SchedulerCallBack
{
  private Context a;
  private HashMap<String, String> b;
  private PluginCallback c;
  
  public c(Context paramContext, HashMap<String, String> paramHashMap, PluginCallback paramPluginCallback)
  {
    this.a = paramContext;
    this.b = paramHashMap;
    this.c = paramPluginCallback;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    String str1 = (String)this.b.get("url") + "/servlet/CheckSecChannel";
    Log.e("asos", "mUrl == " + str1);
    for (;;)
    {
      try
      {
        String str2 = DeviceUtil.getDeviceId(this.a);
        String str3 = DeviceUtil.getIpAddress(this.a);
        paramMessageAction = NetWorkUtil.getNetWorkStatus(this.a);
        if (paramMessageAction != NetWorkState.NET_WORK_2G) {
          continue;
        }
        paramMessageAction = "02";
        String str4 = DeviceUtil.getDeviceModel();
        String str5 = DeviceUtil.getRelease();
        String str6 = ScreenUtil.getScreenWidth(this.a) + "＊" + ScreenUtil.getScreenHeight(this.a);
        int i = AppUtil.getVersionCode(this.a);
        String str7 = AppUtil.getVersionName(this.a);
        String str8 = AppUtil.getAppName(this.a);
        String str9 = DeviceUtil.getBasebandVersion();
        String str10 = DeviceUtil.getLinuxCoreVersion();
        String str11 = DeviceUtil.getInnerVersion();
        String str12 = (String)this.b.get("ext");
        String str13 = new JSONObject(str12).optString("channel_ext");
        Log.e("asos", "ext ====== " + str12 + "channel_ext ===== " + str13);
        this.b.put("channel_seq", str13);
        this.b.put("channel_userid", (String)this.b.get("channel_userid"));
        this.b.put("user_ip", str3);
        this.b.put("net_type", paramMessageAction);
        this.b.put("device_id", str2);
        this.b.put("mobile_type", str4);
        this.b.put("mobile_brand", Build.BRAND);
        this.b.put("device_platform", str5);
        this.b.put("device_resoluation", str6);
        this.b.put("soft_version_sn", String.valueOf(i));
        this.b.put("soft_version", str7);
        this.b.put("soft_name", str8);
        this.b.put("device_base_platform", str9);
        this.b.put("device_inner_platform", str10);
        this.b.put("device_inner_version", str11);
        this.b.put("sys_version", str5);
        this.b.put("ext", str12);
      }
      catch (JSONException paramMessageAction)
      {
        paramMessageAction.printStackTrace();
        continue;
      }
      HttpService.getInstance().jsonRequest(str1, this.b, 15000, 0, new d(this));
      return;
      if (paramMessageAction == NetWorkState.NET_WORK_3G) {
        paramMessageAction = "03";
      } else if (paramMessageAction == NetWorkState.NET_WORK_4G) {
        paramMessageAction = "04";
      } else if (paramMessageAction == NetWorkState.NET_WORK_WIFI) {
        paramMessageAction = "01";
      } else {
        paramMessageAction = "00";
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */