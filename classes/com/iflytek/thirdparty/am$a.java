package com.iflytek.thirdparty;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.util.FileDownloadListener;

final class am$a
  implements FileDownloadListener
{
  private FileDownloadListener b = null;
  private final int c = 0;
  private final int d = 1;
  private final int e = 2;
  private final int f = 3;
  private boolean g = false;
  private Handler h = new am.a.1(this, Looper.getMainLooper());
  
  public am$a(am paramam, boolean paramBoolean, FileDownloadListener paramFileDownloadListener)
  {
    this.g = paramBoolean;
    this.b = paramFileDownloadListener;
  }
  
  public void onCompleted(String paramString, SpeechError paramSpeechError)
  {
    Y.a("DownloadonFinish", null);
    if (paramSpeechError == null)
    {
      X.a("onCompleted:filePath:" + paramString);
      if (!this.g)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          am.d(this.a).a("ivw_config_path", paramString);
          am.d(this.a).a("cfg_threshold", am.d(this.a).b("cfg_threstemp", null));
        }
        am.a(this.a, false);
      }
      paramString = this.h.obtainMessage(2, paramString);
      this.h.sendMessage(paramString);
      return;
    }
    X.a("onCompleted:errorcode:" + paramSpeechError.getErrorCode());
    paramString = this.h.obtainMessage(3, paramSpeechError);
    this.h.sendMessage(paramString);
  }
  
  public void onProgress(int paramInt)
  {
    Message localMessage = this.h.obtainMessage(1, paramInt, 0, null);
    this.h.sendMessage(localMessage);
  }
  
  public void onStart()
  {
    Y.a("DownloadonStart", null);
    X.a("onStart");
    Message localMessage = this.h.obtainMessage(0, null);
    this.h.sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */