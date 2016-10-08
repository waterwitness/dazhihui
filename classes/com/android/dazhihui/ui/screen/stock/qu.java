package com.android.dazhihui.ui.screen.stock;

import android.util.Log;
import com.iflytek.cloud.InitListener;

class qu
  implements InitListener
{
  qu(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void onInit(int paramInt)
  {
    Log.d("Speech", "SpeechRecognizer init() code = " + paramInt);
    if (paramInt != 0) {
      SearchHuiFragment.a(this.a, "初始化失败，错误码：" + paramInt);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */