package com.kwlopen.sdk.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.kwl.common.utils.LogUtil;
import com.kwl.common.utils.ResourceUtil;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

@SuppressLint({"NewApi"})
public class VideoPlayActivity
  extends Activity
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, View.OnClickListener
{
  private ImageView backBtn;
  private int currentPlayPosition;
  private Handler handler = new VideoPlayActivity.1(this);
  private MediaPlayer mediaPlayer;
  private String pathString = "";
  private ProgressBar progressBar;
  private LinearLayout repeatLayout;
  private Button startButton;
  private SurfaceHolder surfaceHolder;
  private SurfaceView surfaceView;
  private Timer timer;
  public TextView timerTextView;
  private LinearLayout uploadLayout;
  private long videoTimeLong;
  
  private void showDialog()
  {
    new AlertDialog.Builder(this).setTitle("退出").setMessage("确定退出视频录制吗？").setPositiveButton("确定", new VideoPlayActivity.3(this)).setNegativeButton("取消", new VideoPlayActivity.4(this)).show();
  }
  
  public String format(int paramInt)
  {
    String str2 = paramInt;
    String str1 = str2;
    if (str2.length() == 1) {
      str1 = "0" + str2;
    }
    return str1;
  }
  
  @SuppressLint({"SimpleDateFormat"})
  public String getShowTime(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    if (paramLong / 60000L > 60L) {}
    for (SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("hh:mm:ss");; localSimpleDateFormat = new SimpleDateFormat("mm:ss")) {
      return localSimpleDateFormat.format(localCalendar.getTime());
    }
  }
  
  public void initViews()
  {
    this.timerTextView = ((TextView)findViewById(ResourceUtil.getId(this, "arc_hf_video_timer_tv")));
    this.startButton = ((Button)findViewById(ResourceUtil.getId(this, "start_play_btn")));
    this.surfaceView = ((SurfaceView)findViewById(ResourceUtil.getId(this, "surfaceView")));
    this.progressBar = ((ProgressBar)findViewById(ResourceUtil.getId(this, "progressBar")));
    this.repeatLayout = ((LinearLayout)findViewById(ResourceUtil.getId(this, "repeat_record_layout")));
    this.uploadLayout = ((LinearLayout)findViewById(ResourceUtil.getId(this, "upload_record_layout")));
    this.backBtn = ((ImageView)findViewById(ResourceUtil.getId(this, "back_btn")));
    this.surfaceHolder = this.surfaceView.getHolder();
    this.surfaceHolder.setType(3);
    this.surfaceHolder.addCallback(new VideoPlayActivity.SurfaceCallback(this, null));
    this.startButton.setOnClickListener(this);
    this.repeatLayout.setOnClickListener(this);
    this.uploadLayout.setOnClickListener(this);
    this.backBtn.setOnClickListener(this);
    startTimer();
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    Log.e("text", "onBufferingUpdate-->" + paramInt);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getId(this, "upload_record_layout"))
    {
      paramView = new Intent();
      paramView.putExtra("type", "1");
      setResult(-1, paramView);
      finish();
    }
    label150:
    do
    {
      do
      {
        return;
        if (paramView.getId() == ResourceUtil.getId(this, "repeat_record_layout"))
        {
          paramView = new Intent();
          paramView.putExtra("type", "2");
          setResult(-1, paramView);
          finish();
          return;
        }
        if (paramView.getId() != ResourceUtil.getId(this, "start_play_btn")) {
          break label150;
        }
        startTimer();
        this.startButton.setVisibility(8);
        if (this.mediaPlayer == null) {
          break;
        }
        this.mediaPlayer.seekTo(0);
      } while (this.mediaPlayer.isPlaying());
      this.mediaPlayer.start();
      return;
      playVideo();
      return;
    } while (paramView.getId() != ResourceUtil.getId(this, "back_btn"));
    showDialog();
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    LogUtil.d("播放完毕---->" + paramMediaPlayer.isPlaying());
    this.startButton.setVisibility(0);
    stopTimer();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_surface_view"));
    this.pathString = getIntent().getStringExtra("videoPath");
    initViews();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    try
    {
      if (this.mediaPlayer != null)
      {
        if (this.mediaPlayer.isPlaying()) {
          this.mediaPlayer.stop();
        }
        this.currentPlayPosition = -1;
        this.mediaPlayer.release();
        this.mediaPlayer = null;
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    }
    for (;;)
    {
      switch (paramInt2)
      {
      default: 
        return false;
        Toast.makeText(this, "MEDIA_ERROR_UNKNOWN", 0).show();
        continue;
        Toast.makeText(this, "MEDIA_ERROR_SERVER_DIED", 0).show();
      }
    }
    Toast.makeText(this, "MEDIA_ERROR_IO", 0).show();
    return false;
    Toast.makeText(this, "MEDIA_ERROR_MALFORMED", 0).show();
    return false;
    Toast.makeText(this, "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK", 0).show();
    return false;
    Toast.makeText(this, "MEDIA_ERROR_TIMED_OUT", 0).show();
    return false;
    Toast.makeText(this, "MEDIA_ERROR_UNSUPPORTED", 0).show();
    return false;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      showDialog();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    try
    {
      if ((this.mediaPlayer != null) && (this.mediaPlayer.isPlaying()))
      {
        this.currentPlayPosition = this.mediaPlayer.getCurrentPosition();
        this.mediaPlayer.pause();
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    LogUtil.d("准备完毕--");
    this.progressBar.setVisibility(8);
    if (this.currentPlayPosition >= 0)
    {
      this.mediaPlayer.seekTo(this.currentPlayPosition);
      this.currentPlayPosition = -1;
    }
    this.videoTimeLong = this.mediaPlayer.getDuration();
    this.timerTextView.setText("00:00");
    this.mediaPlayer.start();
    this.mediaPlayer.setDisplay(this.surfaceHolder);
    this.mediaPlayer.setScreenOnWhilePlaying(true);
    this.surfaceHolder.setKeepScreenOn(true);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.currentPlayPosition >= 0)
    {
      if (this.mediaPlayer != null)
      {
        this.mediaPlayer.seekTo(this.currentPlayPosition);
        this.mediaPlayer.start();
      }
    }
    else {
      return;
    }
    playVideo();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.mediaPlayer != null) {
      this.currentPlayPosition = this.mediaPlayer.getCurrentPosition();
    }
  }
  
  public void playVideo()
  {
    this.mediaPlayer = new MediaPlayer();
    this.mediaPlayer.reset();
    this.mediaPlayer.setAudioStreamType(3);
    this.mediaPlayer.setOnCompletionListener(this);
    this.mediaPlayer.setOnPreparedListener(this);
    this.mediaPlayer.setOnErrorListener(this);
    this.mediaPlayer.setOnBufferingUpdateListener(this);
    try
    {
      this.mediaPlayer.setDataSource(this.pathString);
      this.mediaPlayer.prepareAsync();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      Toast.makeText(this, "加载视频错误！", 1).show();
    }
  }
  
  public void startTimer()
  {
    this.timer = new Timer();
    this.timer.purge();
    VideoPlayActivity.2 local2 = new VideoPlayActivity.2(this);
    this.timer.schedule(local2, 0L, 1000L);
  }
  
  public void stopTimer()
  {
    try
    {
      if (this.timer != null)
      {
        this.timer.cancel();
        this.timer = null;
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoPlayActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */