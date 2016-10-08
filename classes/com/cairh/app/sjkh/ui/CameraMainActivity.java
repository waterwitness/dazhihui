package com.cairh.app.sjkh.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.cairh.app.sjkh.common.MResource;
import java.io.IOException;

public class CameraMainActivity
  extends Activity
{
  private static String PARAM_NAME = "fileFullName";
  private static boolean rifImg = false;
  Camera.AutoFocusCallback autoFocusCallback = new CameraMainActivity.2(this);
  Camera.AutoFocusCallback autoFocusCallback1 = new CameraMainActivity.1(this);
  Camera camera;
  private String fileName;
  boolean isPreview = false;
  Camera.PictureCallback myJpegCallback = new CameraMainActivity.3(this);
  SurfaceView sView;
  int screenHeight;
  int screenWidth;
  SurfaceHolder surfaceHodler;
  
  @SuppressLint({"NewApi"})
  private void initCamera()
  {
    if (!this.isPreview)
    {
      this.camera = Camera.open();
      this.camera.setDisplayOrientation(0);
    }
    Camera.Parameters localParameters;
    if ((!this.isPreview) && (this.camera != null))
    {
      localParameters = this.camera.getParameters();
      localParameters.setPreviewSize(640, 480);
      localParameters.setPictureFormat(256);
      localParameters.set("jpeg-quality", 80);
      localParameters.setPictureSize(640, 480);
    }
    try
    {
      this.camera.setParameters(localParameters);
      this.camera.setPreviewDisplay(this.surfaceHodler);
      this.camera.startPreview();
      this.isPreview = true;
      this.camera.autoFocus(this.autoFocusCallback1);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public void cancel(View paramView)
  {
    if (this.camera != null) {
      this.camera.stopPreview();
    }
    this.isPreview = false;
    setResult(0);
    finish();
  }
  
  public void capture(View paramView)
  {
    if (this.camera != null)
    {
      this.isPreview = false;
      this.camera.autoFocus(this.autoFocusCallback);
    }
  }
  
  public void finish()
  {
    if (this.isPreview)
    {
      this.camera.stopPreview();
      this.isPreview = false;
      setResult(0);
    }
    super.finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fileName = getIntent().getExtras().getString(PARAM_NAME);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(MResource.getIdByName("layout", "camera_main"));
    paramBundle = getWindowManager().getDefaultDisplay();
    Object localObject = new DisplayMetrics();
    paramBundle.getMetrics((DisplayMetrics)localObject);
    this.screenWidth = ((DisplayMetrics)localObject).widthPixels;
    this.screenHeight = ((DisplayMetrics)localObject).heightPixels;
    paramBundle = (SurfaceView)findViewById(MResource.getIdByName("id", "sView"));
    localObject = (RelativeLayout.LayoutParams)paramBundle.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).width = (this.screenHeight * 4 / 3);
    ((RelativeLayout.LayoutParams)localObject).height = this.screenHeight;
    paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject);
    paramBundle = (Button)findViewById(MResource.getIdByName("id", "take"));
    localObject = (RelativeLayout.LayoutParams)paramBundle.getLayoutParams();
    if (this.screenWidth - this.screenHeight * 4 / 3 < 200)
    {
      ((RelativeLayout.LayoutParams)localObject).width = 200;
      ((RelativeLayout.LayoutParams)localObject).height = (this.screenHeight / 2);
      paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject);
      paramBundle = (Button)findViewById(MResource.getIdByName("id", "cancel"));
      localObject = (RelativeLayout.LayoutParams)paramBundle.getLayoutParams();
      if (this.screenWidth - this.screenHeight * 4 / 3 >= 200) {
        break label437;
      }
    }
    label437:
    for (((RelativeLayout.LayoutParams)localObject).width = 200;; ((RelativeLayout.LayoutParams)localObject).width = (this.screenWidth - this.screenHeight * 4 / 3))
    {
      ((RelativeLayout.LayoutParams)localObject).height = (this.screenHeight / 2);
      paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject);
      paramBundle = (TextView)findViewById(MResource.getIdByName("id", "cameraMsg"));
      localObject = (RelativeLayout.LayoutParams)paramBundle.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject).width = (this.screenHeight * 4 / 3);
      ((RelativeLayout.LayoutParams)localObject).height = (this.screenHeight / 6);
      paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.sView = ((SurfaceView)findViewById(MResource.getIdByName("id", "sView")));
      paramBundle = (RelativeLayout.LayoutParams)this.sView.getLayoutParams();
      paramBundle.width = (this.screenHeight * 4 / 3);
      paramBundle.height = this.screenHeight;
      this.sView.setLayoutParams(paramBundle);
      this.sView.getHolder().setType(3);
      this.surfaceHodler = this.sView.getHolder();
      this.surfaceHodler.addCallback(new CameraMainActivity.4(this));
      return;
      ((RelativeLayout.LayoutParams)localObject).width = (this.screenWidth - this.screenHeight * 4 / 3);
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\CameraMainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */