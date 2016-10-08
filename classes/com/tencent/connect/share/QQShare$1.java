package com.tencent.connect.share;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.a.f;
import com.tencent.open.b.d;
import com.tencent.open.utils.AsynLoadImgBack;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.ArrayList;

class QQShare$1
  implements AsynLoadImgBack
{
  QQShare$1(QQShare paramQQShare, Bundle paramBundle, String paramString1, String paramString2, IUiListener paramIUiListener, Activity paramActivity) {}
  
  public void batchSaved(int paramInt, ArrayList<String> paramArrayList) {}
  
  public void saved(int paramInt, String paramString)
  {
    if (paramInt == 0) {
      this.a.putString("imageLocalUrl", paramString);
    }
    while ((!TextUtils.isEmpty(this.b)) || (!TextUtils.isEmpty(this.c)))
    {
      QQShare.a(this.f, this.e, this.a, this.d);
      return;
    }
    if (this.d != null)
    {
      this.d.onError(new UiError(-6, "获取分享图片失败!", null));
      f.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
    }
    d.a().a(1, "SHARE_CHECK_SDK", "1000", QQShare.a(this.f).getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "获取分享图片失败!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\QQShare$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */