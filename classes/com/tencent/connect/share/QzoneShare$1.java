package com.tencent.connect.share;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.open.utils.AsynLoadImgBack;
import com.tencent.tauth.IUiListener;
import java.util.ArrayList;

class QzoneShare$1
  implements AsynLoadImgBack
{
  QzoneShare$1(QzoneShare paramQzoneShare, Bundle paramBundle, Activity paramActivity, IUiListener paramIUiListener) {}
  
  public void batchSaved(int paramInt, ArrayList<String> paramArrayList)
  {
    if (paramInt == 0) {
      this.a.putStringArrayList("imageUrl", paramArrayList);
    }
    QzoneShare.a(this.d, this.b, this.a, this.c);
  }
  
  public void saved(int paramInt, String paramString) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\QzoneShare$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */