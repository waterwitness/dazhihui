package com.kwlopen.sdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class PlayVideoView
  extends SurfaceView
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, SurfaceHolder.Callback
{
  public Button btnStartPlay;
  private CaptureVideo context;
  private Handler handler = new PlayVideoView.1(this);
  public MediaPlayer mediaPlayer;
  private int minute = 0;
  private String pathString;
  private int second = 0;
  private SurfaceHolder surfaceHolder;
  private Timer timerCount;
  public TextView timerTextView;
  private long videoTimeLong;
  private String videoTimeString;
  
  public PlayVideoView(Context paramContext, String paramString)
  {
    super(paramContext);
    this.context = ((CaptureVideo)paramContext);
    this.pathString = paramString;
    this.timerTextView = this.context.timerTextView;
    this.btnStartPlay = this.context.btnStartPlay;
    initViews();
  }
  
  private void cancelTimer()
  {
    if (this.timerCount != null)
    {
      this.timerCount.cancel();
      this.timerCount = null;
    }
  }
  
  private void startTimer()
  {
    cancelTimer();
    this.second = 0;
    this.timerCount = new Timer();
    this.timerCount.schedule(new PlayVideoView.2(this), 1000L, 1000L);
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
    for (SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("mm:ss");; localSimpleDateFormat = new SimpleDateFormat("mm:ss")) {
      return localSimpleDateFormat.format(localCalendar.getTime());
    }
  }
  
  public void initViews()
  {
    this.surfaceHolder = getHolder();
    this.surfaceHolder.setType(3);
    this.surfaceHolder.addCallback(this);
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    Log.e("text", "onBufferingUpdate-->" + paramInt);
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    cancelTimer();
    this.context.btnStartPlay.setVisibility(0);
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
        Toast.makeText(this.context, "MEDIA_ERROR_UNKNOWN", 0).show();
        continue;
        Toast.makeText(this.context, "MEDIA_ERROR_SERVER_DIED", 0).show();
      }
    }
    Toast.makeText(this.context, "MEDIA_ERROR_IO", 0).show();
    return false;
    Toast.makeText(this.context, "MEDIA_ERROR_MALFORMED", 0).show();
    return false;
    Toast.makeText(this.context, "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK", 0).show();
    return false;
    Toast.makeText(this.context, "MEDIA_ERROR_TIMED_OUT", 0).show();
    return false;
    Toast.makeText(this.context, "MEDIA_ERROR_UNSUPPORTED", 0).show();
    return false;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this.videoTimeLong = this.mediaPlayer.getDuration();
    this.videoTimeString = getShowTime(this.videoTimeLong);
    this.timerTextView.setText("00:00");
    this.mediaPlayer.start();
    startTimer();
    this.mediaPlayer.setDisplay(this.surfaceHolder);
    this.mediaPlayer.setScreenOnWhilePlaying(true);
    this.surfaceHolder.setKeepScreenOn(true);
  }
  
  public void onRelease()
  {
    try
    {
      surfaceDestroyed(this.surfaceHolder);
      if (this.mediaPlayer != null)
      {
        if (this.mediaPlayer.isPlaying())
        {
          this.mediaPlayer.stop();
          cancelTimer();
        }
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
  
  public String paserTime(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i;
    if (paramInt / 3600 < 10)
    {
      new StringBuilder("0").append(paramInt / 3600).toString();
      i = paramInt % 3600 / 60;
      if (i >= 10) {
        break label151;
      }
      str = "0" + i + ":";
      label80:
      localStringBuffer.append(str);
      paramInt = paramInt % 3600 % 60;
      if (paramInt >= 10) {
        break label176;
      }
    }
    label151:
    label176:
    for (String str = "0" + paramInt;; str = paramInt)
    {
      localStringBuffer.append(str);
      return localStringBuffer.toString();
      new StringBuilder().append(paramInt / 3600).toString();
      break;
      str = i + ":";
      break label80;
    }
  }
  
  public void playVideo()
  {
    this.btnStartPlay.setVisibility(8);
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
      Toast.makeText(this.context, "加载视频错误！", 1).show();
    }
  }
  
  public void startPlay()
  {
    if ((this.mediaPlayer != null) && (!this.mediaPlayer.isPlaying()))
    {
      this.minute = 0;
      this.second = 0;
      this.timerTextView.setText("00:00");
      this.mediaPlayer.start();
      startTimer();
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    playVideo();
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (this.mediaPlayer != null)
    {
      this.mediaPlayer.release();
      this.mediaPlayer = null;
      cancelTimer();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\PlayVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */