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

public class VideoCallActivity
  extends Activity
{
  public Context context;
  public MainActivity mainActivity;
  public RelativeLayout relativeLayout;
  public VideoCallManager videoHandle;
  public VideoCallActivity viewActivity;
  
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
    String str2 = paramBundle.getStringExtra("targetUserId");
    Object localObject = paramBundle.getStringExtra("videoServer");
    String str1 = paramBundle.getStringExtra("videoPort");
    paramBundle = (Bundle)localObject;
    if ("".equals(localObject)) {
      paramBundle = getString(MResource.getIdByName("string", "crh_call_video_server_ip"));
    }
    if (!"".equals(str1))
    {
      localObject = str1;
      if (str1 != null) {}
    }
    else
    {
      localObject = this.context.getString(MResource.getIdByName("string", "crh_call_video_server_port"));
    }
    if (!"".equals(str2))
    {
      str1 = str2;
      if (str2 != null) {}
    }
    else
    {
      str1 = getString(MResource.getIdByName("string", "crh_call_video_center_id"));
    }
    this.videoHandle = new VideoCallManager(this, this);
    this.videoHandle.start(Integer.parseInt(str1), paramBundle, Integer.parseInt((String)localObject));
    this.relativeLayout.setSystemUiVisibility(0);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\VideoCallActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */