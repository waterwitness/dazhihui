package com.cairh.app.sjkh.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.cairh.app.sjkh.common.MResource;
import java.io.IOException;

public class FaceCameraActivity
  extends Activity
{
  private static String PARAM_NAME = "fileFullName";
  Camera.AutoFocusCallback autoFocusCallback = new FaceCameraActivity.2(this);
  Camera.AutoFocusCallback autoFocusCallback1 = new FaceCameraActivity.1(this);
  Camera camera;
  View cancelBtn;
  private String fileName;
  boolean isPreview = false;
  Camera.PictureCallback myJpegCallback = new FaceCameraActivity.3(this);
  SurfaceView sView;
  SurfaceHolder surfaceHodler;
  View takeBtn;
  
  @SuppressLint({"NewApi"})
  private void initCamera()
  {
    Object localObject;
    int j;
    int i;
    if (!this.isPreview)
    {
      localObject = new Camera.CameraInfo();
      j = Camera.getNumberOfCameras();
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        this.camera.setDisplayOrientation(90);
        if ((!this.isPreview) && (this.camera != null))
        {
          localObject = this.camera.getParameters();
          ((Camera.Parameters)localObject).setPreviewSize(640, 480);
          ((Camera.Parameters)localObject).setPictureFormat(256);
          ((Camera.Parameters)localObject).set("jpeg-quality", 80);
          ((Camera.Parameters)localObject).setPictureSize(640, 480);
        }
      }
      try
      {
        this.camera.setParameters((Camera.Parameters)localObject);
        this.camera.setPreviewDisplay(this.surfaceHodler);
        this.camera.startPreview();
        this.isPreview = true;
        this.camera.autoFocus(this.autoFocusCallback1);
        return;
        Camera.getCameraInfo(i, (Camera.CameraInfo)localObject);
        if (((Camera.CameraInfo)localObject).facing == 1) {}
        try
        {
          this.camera = Camera.open(i);
          i += 1;
        }
        catch (RuntimeException localRuntimeException)
        {
          for (;;)
          {
            Log.e("face camera", "Camera failed to open: " + localRuntimeException.getLocalizedMessage());
          }
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localIOException.printStackTrace();
        }
      }
    }
  }
  
  private void initViews()
  {
    this.sView = ((SurfaceView)findViewById(MResource.getIdByName("id", "sView")));
    this.takeBtn = findViewById(MResource.getIdByName("id", "take"));
    this.cancelBtn = findViewById(MResource.getIdByName("id", "cancel"));
    this.sView.getHolder().setType(3);
    this.surfaceHodler = this.sView.getHolder();
    this.surfaceHodler.addCallback(new FaceCameraActivity.4(this));
  }
  
  public void cancel(View paramView)
  {
    this.camera.stopPreview();
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
    setContentView(MResource.getIdByName("layout", "face_camera"));
    this.fileName = getIntent().getExtras().getString(PARAM_NAME);
    initViews();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\FaceCameraActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */