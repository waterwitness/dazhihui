package com.cairh.app.sjkh.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import com.cairh.app.sjkh.MainActivity;
import com.cairh.app.sjkh.common.MResource;

public class VideoActivity
  extends Activity
{
  public Context context;
  public MainActivity mainActivity;
  public RelativeLayout relativeLayout;
  public VideoManager videoHandle;
  public VideoActivity viewActivity;
  
  @SuppressLint({"NewApi"})
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    requestWindowFeature(1);
    this.relativeLayout = new RelativeLayout(this);
    this.relativeLayout.setBackgroundColor(-1);
    setContentView(this.relativeLayout);
    this.context = this;
    this.viewActivity = this;
    paramBundle = getIntent();
    int k = paramBundle.getIntExtra("userId", 0);
    int n = paramBundle.getIntExtra("empId", 0);
    String str = paramBundle.getStringExtra("videoServer");
    int j = paramBundle.getIntExtra("videoPort", 0);
    int m = paramBundle.getIntExtra("roomId", 0);
    paramBundle = str;
    if ("".equals(str)) {
      paramBundle = getString(MResource.getIdByName("string", "crh_video_server_ip"));
    }
    int i = j;
    if (j == 0)
    {
      str = getString(MResource.getIdByName("string", "crh_video_server_port"));
      if ((str != null) && (!str.trim().equals(""))) {
        break label220;
      }
    }
    label220:
    for (i = 8906;; i = Integer.valueOf(str).intValue())
    {
      j = m;
      if (m == 0) {
        j = k;
      }
      this.videoHandle = new VideoManager(this, this);
      this.videoHandle.start(k, n, paramBundle, i, j);
      this.relativeLayout.setSystemUiVisibility(0);
      return;
    }
  }
  
  public void onDestroy()
  {
    this.videoHandle.onDestroy();
    super.onDestroy();
  }
  
  public void onPause()
  {
    this.videoHandle.onPause();
    super.onPause();
  }
  
  public void onRestart()
  {
    this.videoHandle.onRestart();
    super.onRestart();
  }
  
  public void onResume()
  {
    this.videoHandle.onResume();
    super.onResume();
  }
  
  public void setMainActivity(MainActivity paramMainActivity)
  {
    this.mainActivity = paramMainActivity;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\VideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */