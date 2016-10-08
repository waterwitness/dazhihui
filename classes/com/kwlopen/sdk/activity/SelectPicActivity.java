package com.kwlopen.sdk.activity;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.kwl.common.utils.BitmapUtils;
import com.kwl.common.utils.LogUtil;
import com.kwl.common.utils.ResourceUtil;
import com.kwl.common.utils.URIUtils;
import com.kwl.common.utils.Utils;
import com.kwlopen.sdk.camera.ImageEvent;
import de.greenrobot.event.EventBus;

public class SelectPicActivity
  extends Activity
  implements View.OnClickListener
{
  public static String IMAGE_PATH;
  public static final String KEY_PHOTO_PATH = "photo_path";
  public static final int SELECT_PIC_BY_CLIP_PHOTO = 3;
  public static final int SELECT_PIC_BY_PICK_PHOTO = 2;
  public static final int SELECT_PIC_BY_TACK_PHOTO = 1;
  private static final String TAG = "SelectPicActivity";
  private Button cancelBtn;
  private LinearLayout dialogLayout;
  private Handler handler = new SelectPicActivity.1(this);
  private Intent lastIntent;
  private Uri photoUri;
  private String picPath;
  private Button pickPhotoBtn;
  private Button takePhotoBtn;
  
  private void doPhoto(int paramInt, Intent paramIntent)
  {
    if (paramInt == 2)
    {
      if (paramIntent == null)
      {
        Toast.makeText(this, "选择图片文件出错", 1).show();
        return;
      }
      this.photoUri = paramIntent.getData();
      if (this.photoUri == null)
      {
        Toast.makeText(this, "选择图片文件出错", 1).show();
        return;
      }
    }
    this.picPath = URIUtils.getImageAbsolutePath(this, this.photoUri);
    LogUtil.d("imagePath = " + this.picPath);
    this.lastIntent.putExtra("photo_path", this.picPath);
    setResult(-1, this.lastIntent);
    finish();
  }
  
  private void initView()
  {
    this.dialogLayout = ((LinearLayout)findViewById(ResourceUtil.getId(this, "pop_layout")));
    this.dialogLayout.setOnClickListener(this);
    this.takePhotoBtn = ((Button)findViewById(ResourceUtil.getId(this, "btn_take_photo")));
    this.takePhotoBtn.setOnClickListener(this);
    this.pickPhotoBtn = ((Button)findViewById(ResourceUtil.getId(this, "btn_pick_photo")));
    this.pickPhotoBtn.setOnClickListener(this);
    this.cancelBtn = ((Button)findViewById(ResourceUtil.getId(this, "btn_cancel")));
    this.cancelBtn.setOnClickListener(this);
    this.lastIntent = getIntent();
  }
  
  private void pickPhoto()
  {
    startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 2);
  }
  
  private void takePhoto()
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
      ContentValues localContentValues = new ContentValues();
      this.photoUri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, localContentValues);
      localIntent.putExtra("output", this.photoUri);
      startActivityForResult(localIntent, 1);
      return;
    }
    Toast.makeText(this, "内存卡不存在", 1).show();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
    {
      if (paramInt1 != 3) {
        break label28;
      }
      setResult(-1, paramIntent);
      finish();
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label28:
      doPhoto(paramInt1, paramIntent);
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getId(this, "pop_layout"))
    {
      finish();
      return;
    }
    if (paramView.getId() == ResourceUtil.getId(this, "btn_take_photo")) {}
    try
    {
      BitmapUtils.deleteAllPhoto(IMAGE_PATH);
      startActivity(new Intent(this, CameraActivity.class));
      return;
      if (paramView.getId() == ResourceUtil.getId(this, "btn_pick_photo")) {}
      try
      {
        BitmapUtils.deleteAllPhoto(IMAGE_PATH);
        pickPhoto();
        return;
        finish();
        return;
      }
      catch (Exception paramView)
      {
        for (;;) {}
      }
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_select_pic_dialog"));
    IMAGE_PATH = Utils.getSDPath(this) + "/openAccount/";
    initView();
    EventBus.getDefault().register(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    EventBus.getDefault().unregister(this);
  }
  
  public void onEventMainThread(ImageEvent paramImageEvent)
  {
    paramImageEvent = paramImageEvent.getImagePath();
    LogUtil.d("最终选择的图片路径---》" + paramImageEvent);
    this.lastIntent.putExtra("photo_path", paramImageEvent);
    setResult(-1, this.lastIntent);
    finish();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    finish();
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\SelectPicActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */