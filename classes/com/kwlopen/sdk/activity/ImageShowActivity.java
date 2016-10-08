package com.kwlopen.sdk.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwl.common.utils.BitmapUtils;
import com.kwl.common.utils.Handler_Ui;
import com.kwl.common.utils.ResourceUtil;
import com.kwlopen.sdk.camera.ImageEvent;
import de.greenrobot.event.EventBus;

public class ImageShowActivity
  extends Activity
  implements View.OnClickListener
{
  private Bitmap bmp;
  private TextView cameraTextView;
  private Handler handler = new ImageShowActivity.1(this);
  private ImageView imageView;
  private String image_path;
  ProgressDialog progressDialog;
  private TextView uploadTextView;
  
  private void decodeImage()
  {
    progressDialog();
    new Thread(new ImageShowActivity.2(this)).start();
  }
  
  private void dismissDialog()
  {
    if ((this.progressDialog != null) && (this.progressDialog.isShowing())) {
      this.progressDialog.dismiss();
    }
    this.progressDialog = null;
  }
  
  private void progressDialog()
  {
    if (this.progressDialog == null)
    {
      this.progressDialog = new ProgressDialog(this);
      this.progressDialog.setMessage("请稍后...");
      this.progressDialog.setCancelable(false);
    }
    this.progressDialog.show();
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getId(this, "camera_text_view"))
    {
      paramView = new Intent();
      paramView.setClass(this, CameraActivity.class);
      startActivity(paramView);
      finish();
    }
    while (paramView.getId() != ResourceUtil.getId(this, "upload_text_view")) {
      return;
    }
    paramView = new ImageEvent();
    paramView.setImagePath(this.image_path);
    EventBus.getDefault().post(paramView);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_show_image_layout"));
    this.image_path = getIntent().getStringExtra("image_path");
    this.imageView = ((ImageView)findViewById(ResourceUtil.getId(this, "show_imageview")));
    this.cameraTextView = ((TextView)findViewById(ResourceUtil.getId(this, "camera_text_view")));
    this.uploadTextView = ((TextView)findViewById(ResourceUtil.getId(this, "upload_text_view")));
    if ((this.image_path == null) && (this.image_path.equals("")))
    {
      Handler_Ui.toastDialog(this, "选择的照片不存在，请选择其他照片");
      finish();
      return;
    }
    this.cameraTextView.setOnClickListener(this);
    this.uploadTextView.setOnClickListener(this);
    decodeImage();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    BitmapUtils.releaseBitmap(new Bitmap[] { this.bmp });
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.setClass(this, CameraActivity.class);
      startActivity(paramKeyEvent);
      finish();
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\ImageShowActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */