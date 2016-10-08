package com.kwlopen.sdk.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.kwl.common.utils.ResourceUtil;
import com.kwlopen.sdk.camera.CameraHelper;
import com.kwlopen.sdk.camera.OnCaptureCallback;

public class CameraActivity
  extends Activity
  implements View.OnClickListener, OnCaptureCallback
{
  public static final String TAG = "CameraAty";
  private Button closeButton;
  private Button mCameraShutterButton;
  
  public void onCapture(boolean paramBoolean, String paramString)
  {
    Intent localIntent = new Intent(this, ImageShowActivity.class);
    localIntent.putExtra("image_path", paramString);
    startActivity(localIntent);
    finish();
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getId(this, "btn_shutter_camera")) {
      CameraHelper.getInstance().tackPicture(this, this);
    }
    while (paramView.getId() != ResourceUtil.getId(this, "close_btn")) {
      return;
    }
    finish();
  }
  
  @SuppressLint({"NewApi"})
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_camera"));
    this.mCameraShutterButton = ((Button)findViewById(ResourceUtil.getId(this, "btn_shutter_camera")));
    this.closeButton = ((Button)findViewById(ResourceUtil.getId(this, "close_btn")));
    this.mCameraShutterButton.setOnClickListener(this);
    this.closeButton.setOnClickListener(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\CameraActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */