package com.cairh.app.sjkh.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.Window;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import com.cairh.app.sjkh.MainActivity;
import com.cairh.app.sjkh.base.BaseFileUploadCallbackActivity;
import com.cairh.app.sjkh.common.MResource;
import com.cairh.app.sjkh.util.FileUploadUtilOld;
import java.io.IOException;

public class VideoPreviewActivity
  extends BaseFileUploadCallbackActivity
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, SurfaceHolder.Callback
{
  private ImageView backButton;
  private Context context;
  private FileUploadUtilOld fileUploadUtil;
  DialogInterface.OnClickListener listener = new VideoPreviewActivity.1(this);
  private MediaPlayer mediaPlayer;
  public ProgressDialog progressDialog;
  private SurfaceHolder surfaceHolder;
  private ImageView usedButton;
  private String videoFilePath;
  private VideoView videoView;
  private VideoPreviewActivity vp = null;
  
  private void bindEvent()
  {
    this.backButton = ((ImageView)findViewById(MResource.getIdByName("id", "imageView_back")));
    this.usedButton = ((ImageView)findViewById(MResource.getIdByName("id", "imageView_use")));
    this.backButton.setOnClickListener(new VideoPreviewActivity.2(this));
    this.usedButton.setOnClickListener(new VideoPreviewActivity.3(this));
  }
  
  private void uploadFileDo()
  {
    this.vp.showProgressDialog(this.context, "正在上传视频，由于视频文件较大，请耐心等待");
  }
  
  public void failDo(int paramInt, String paramString)
  {
    this.vp.dismissProgressDialog();
    MainActivity.getA().callJSFunc("finishSVideo(" + paramInt + ",'" + paramString + "','" + this.videoFilePath + "','" + "')");
    finish();
  }
  
  public void failDo(String paramString)
  {
    this.vp.dismissProgressDialog();
    MainActivity.getA().callJSFunc("finishSVideo('" + paramString + "','" + this.videoFilePath + "','" + "')");
    finish();
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt) {}
  
  public void onCompletion(MediaPlayer paramMediaPlayer) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fileUploadUtil = new FileUploadUtilOld(this);
    this.context = this;
    if (this.vp == null) {
      this.vp = new VideoPreviewActivity();
    }
    requestWindowFeature(1);
    getWindow().setFlags(128, 128);
    setContentView(MResource.getIdByName("layout", "activity_video_preview"));
    bindEvent();
    this.videoFilePath = getIntent().getStringExtra("videoFilePath");
    this.videoView = ((VideoView)findViewById(MResource.getIdByName("id", "videoView_preview")));
    this.videoView.setVideoPath(this.videoFilePath);
    paramBundle = new MediaController(this);
    paramBundle.setVisibility(8);
    this.videoView.setMediaController(paramBundle);
    this.videoView.requestFocus();
    this.videoView.start();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    return true;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    int i = this.mediaPlayer.getVideoWidth();
    int j = this.mediaPlayer.getVideoHeight();
    if ((i != 0) && (j != 0))
    {
      this.surfaceHolder.setFixedSize(i, j);
      this.mediaPlayer.start();
    }
    this.surfaceHolder.setFixedSize(300, 400);
    this.mediaPlayer.start();
  }
  
  public void playVideo()
  {
    try
    {
      this.mediaPlayer = new MediaPlayer();
      this.mediaPlayer.setDataSource(this.videoFilePath);
      this.mediaPlayer.setDisplay(this.surfaceHolder);
      this.mediaPlayer.prepareAsync();
      this.mediaPlayer.setOnBufferingUpdateListener(this);
      this.mediaPlayer.setOnCompletionListener(this);
      this.mediaPlayer.setOnPreparedListener(this);
      this.mediaPlayer.setAudioStreamType(3);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        localIllegalStateException.printStackTrace();
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
  
  public void successDo(int paramInt, String paramString)
  {
    this.vp.dismissProgressDialog();
    MainActivity.getA().callJSFunc("finishSVideo(" + paramInt + ",'" + paramString + "','" + this.videoFilePath + "','" + "')");
    finish();
  }
  
  public void successDo(String paramString)
  {
    this.vp.dismissProgressDialog();
    MainActivity.getA().callJSFunc("finishSVideo('" + paramString + "','" + this.videoFilePath + "','" + "')");
    finish();
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    this.surfaceHolder = paramSurfaceHolder;
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.surfaceHolder = paramSurfaceHolder;
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
  
  public void uploadFile()
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
    localAlertDialog.setTitle("温馨提示");
    localAlertDialog.setMessage("上传后将不能再重新录制，你确定已经录制好并开始上传吗？");
    localAlertDialog.setButton("确定", this.listener);
    localAlertDialog.setButton2("取消", this.listener);
    localAlertDialog.setCanceledOnTouchOutside(false);
    localAlertDialog.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\VideoPreviewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */