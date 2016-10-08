package com.tencent.avsdk.control;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.ui.widget.ToastMaker;
import com.android.dazhihui.w;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public class MyFavoriteManager
  implements i
{
  private static MyFavoriteManager s_Instance = null;
  private Activity mActivity;
  private com.android.dazhihui.a.b.f mAddToFavoriteRequest;
  
  private String encodeUrlParameter(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return paramString;
  }
  
  public static MyFavoriteManager getInstance()
  {
    if (s_Instance == null)
    {
      s_Instance = new MyFavoriteManager();
      o.a();
    }
    return s_Instance;
  }
  
  public void addToMyFavorite(Activity paramActivity, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.mActivity = paramActivity;
    if (w.a().l())
    {
      paramString1 = paramString1.trim();
      paramActivity = paramString2;
      if (paramBoolean) {
        paramActivity = com.android.dazhihui.a.f.al + paramString2;
      }
      if (!TextUtils.isEmpty(paramString1))
      {
        paramActivity = com.android.dazhihui.a.f.aj + "userid=" + encodeUrlParameter(w.a().f()) + "&title=" + encodeUrlParameter(paramString1) + "&clickurl=" + encodeUrlParameter(paramActivity) + "&token=" + o.a().c();
        this.mAddToFavoriteRequest = new com.android.dazhihui.a.b.f();
        this.mAddToFavoriteRequest.c(paramActivity);
        this.mAddToFavoriteRequest.a(this);
        com.android.dazhihui.a.g.a().a(this.mAddToFavoriteRequest);
        return;
      }
      ToastMaker.a(this.mActivity, "收藏失败");
      return;
    }
    paramString1 = new Intent(paramActivity, LoginMainScreen.class);
    paramString1.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    paramActivity.startActivity(paramString1);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.mAddToFavoriteRequest)
    {
      paramh = (com.android.dazhihui.a.b.g)paramj;
      try
      {
        paramh = new JSONObject(new String(paramh.a()));
        paramh.optString("Qid");
        int i = paramh.optInt("Err");
        paramh.optInt("Counter");
        if (i == 0)
        {
          if ((this.mActivity == null) || (this.mActivity.isFinishing())) {
            return;
          }
          ToastMaker.a(this.mActivity, "收藏成功");
          return;
        }
        paramh = paramh.optJSONObject("Data");
        if (paramh != null)
        {
          paramh.optInt("code");
          paramh = paramh.optString("desc");
          if ((this.mActivity == null) || (this.mActivity.isFinishing())) {
            return;
          }
          ToastMaker.a(this.mActivity, paramh);
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      if ((this.mActivity != null) && (!this.mActivity.isFinishing())) {
        ToastMaker.a(this.mActivity, "收藏失败");
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.mAddToFavoriteRequest) {}
    try
    {
      if ((this.mActivity != null) && (!this.mActivity.isFinishing())) {
        ToastMaker.a(this.mActivity, "收藏失败");
      }
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.mAddToFavoriteRequest) {}
    try
    {
      if ((this.mActivity != null) && (!this.mActivity.isFinishing())) {
        ToastMaker.a(this.mActivity, "收藏失败");
      }
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MyFavoriteManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */