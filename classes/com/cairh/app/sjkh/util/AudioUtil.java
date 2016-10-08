package com.cairh.app.sjkh.util;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.util.Log;

public class AudioUtil
{
  public static final short AUDIO_TYPE_QUESTION = 3;
  public static final short AUDIO_TYPE_TIP_1 = 1;
  public static final short AUDIO_TYPE_TIP_2 = 2;
  private short audioTpye;
  Context mContext;
  private MediaPlayer voicePlayer;
  
  public AudioUtil(Context paramContext)
  {
    this.mContext = paramContext;
    this.voicePlayer = new MediaPlayer();
  }
  
  public short getAudioTpye()
  {
    return this.audioTpye;
  }
  
  public void playLocalVoice(String paramString)
  {
    try
    {
      if (this.voicePlayer == null) {
        this.voicePlayer = new MediaPlayer();
      }
      for (;;)
      {
        paramString = Uri.parse("android.resource://com.cairh.app.sjkh/raw/open_mouth.mp3");
        this.voicePlayer.setDataSource(this.mContext, paramString);
        this.voicePlayer.prepare();
        this.voicePlayer.start();
        return;
        this.voicePlayer.reset();
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void playVoice(String paramString)
  {
    Log.i("AudioUtil", paramString);
    if (this.voicePlayer == null) {
      this.voicePlayer = new MediaPlayer();
    }
    for (;;)
    {
      paramString = Uri.parse(paramString);
      this.voicePlayer.setDataSource(this.mContext, paramString);
      this.voicePlayer.prepare();
      this.voicePlayer.start();
      return;
      this.voicePlayer.reset();
    }
  }
  
  public void setAudioTpye(short paramShort)
  {
    this.audioTpye = paramShort;
  }
  
  public void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    if (this.voicePlayer == null) {
      this.voicePlayer = new MediaPlayer();
    }
    this.voicePlayer.setOnCompletionListener(paramOnCompletionListener);
  }
  
  public void stopVoice()
  {
    if (this.voicePlayer != null) {
      this.voicePlayer.stop();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\AudioUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */