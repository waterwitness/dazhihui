package com.bairuitech.anychat;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.util.Log;

public class AnyChatAudioHelper
{
  public static final int PLAY_MODE_AUTO = 0;
  public static final int PLAY_MODE_RECEIVER = 1;
  public static final int PLAY_MODE_SPEAKER = 2;
  private static final String TAG = "ANYCHAT";
  private boolean mAudioPlayReleased = false;
  private AudioRecord mAudioRecord = null;
  private boolean mAudioRecordReleased = false;
  private AudioTrack mAudioTrack = null;
  private Context mContext = null;
  private int mMinPlayBufSize = 0;
  private int mMinRecordBufSize = 0;
  private AnyChatAudioHelper.PlayAudioThread mPlayAudioThread = null;
  private int mPlayMode = 2;
  private boolean mPlayThreadExitFlag = false;
  private int mProfile = 0;
  private AnyChatAudioHelper.RecordAudioThread mRecordAudioThread = null;
  private boolean mRecordThreadExitFlag = false;
  
  public int InitAudioPlayer(int paramInt)
  {
    int j = 3;
    if (this.mAudioTrack != null) {
      return 0;
    }
    this.mProfile = paramInt;
    Log.d("ANYCHAT", "InitAudioPlayer, profile: " + paramInt);
    int i;
    if (paramInt == 1)
    {
      paramInt = 16000;
      i = 2;
    }
    try
    {
      this.mAudioPlayReleased = false;
      this.mMinPlayBufSize = AudioTrack.getMinBufferSize(paramInt, i, 2);
      if (this.mPlayMode == 2) {}
      for (;;)
      {
        this.mAudioTrack = new AudioTrack(j, paramInt, i, 2, this.mMinPlayBufSize, 1);
        if (this.mPlayAudioThread == null)
        {
          this.mPlayThreadExitFlag = false;
          this.mPlayAudioThread = new AnyChatAudioHelper.PlayAudioThread(this);
          this.mPlayAudioThread.start();
        }
        Log.d("ANYCHAT", "mMinPlayBufSize = " + this.mMinPlayBufSize);
        return 0;
        if (paramInt == 2)
        {
          paramInt = 44100;
          i = 3;
          break;
        }
        return -1;
        j = 0;
      }
      return -1;
    }
    catch (Exception localException) {}
  }
  
  public int InitAudioRecorder(int paramInt)
  {
    if (this.mAudioRecord != null) {
      return 0;
    }
    Log.d("ANYCHAT", "InitAudioRecorder, profile: " + paramInt);
    int i;
    if (paramInt == 1)
    {
      paramInt = 16000;
      i = 2;
    }
    for (;;)
    {
      try
      {
        this.mAudioRecordReleased = false;
        this.mMinRecordBufSize = AudioRecord.getMinBufferSize(paramInt, i, 2);
        this.mAudioRecord = new AudioRecord(1, paramInt, i, 2, this.mMinRecordBufSize);
        AnyChatCoreSDK.SetInputAudioFormat(this.mAudioRecord.getChannelCount(), this.mAudioRecord.getSampleRate(), 16, 0);
        if (this.mRecordAudioThread == null)
        {
          this.mRecordThreadExitFlag = false;
          this.mRecordAudioThread = new AnyChatAudioHelper.RecordAudioThread(this);
          this.mRecordAudioThread.start();
        }
        Log.d("ANYCHAT", "mMinRecordBufSize = " + this.mMinRecordBufSize);
        return 0;
      }
      catch (Exception localException) {}
      if (paramInt == 2)
      {
        paramInt = 44100;
        i = 3;
      }
      else
      {
        return -1;
      }
    }
    return -1;
  }
  
  public Boolean IsSpeakerMode()
  {
    if (this.mPlayMode == 2) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public void ReleaseAudioPlayer()
  {
    if (this.mAudioPlayReleased) {}
    do
    {
      return;
      this.mAudioPlayReleased = true;
      Log.d("ANYCHAT", "ReleaseAudioPlayer");
      if (this.mPlayAudioThread != null)
      {
        this.mPlayThreadExitFlag = true;
        this.mPlayAudioThread = null;
      }
    } while (this.mAudioTrack == null);
    try
    {
      this.mAudioTrack.stop();
      this.mAudioTrack.release();
      this.mAudioTrack = null;
      return;
    }
    catch (Exception localException) {}
  }
  
  public void ReleaseAudioRecorder()
  {
    if (this.mAudioRecordReleased) {}
    do
    {
      return;
      this.mAudioRecordReleased = true;
      Log.d("ANYCHAT", "ReleaseAudioRecorder");
      if (this.mRecordAudioThread != null)
      {
        this.mRecordThreadExitFlag = true;
        this.mRecordAudioThread = null;
      }
    } while (this.mAudioRecord == null);
    try
    {
      this.mAudioRecord.stop();
      this.mAudioRecord.release();
      this.mAudioRecord = null;
      return;
    }
    catch (Exception localException) {}
  }
  
  public void SetContext(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public void SwitchPlayMode(int paramInt)
  {
    try
    {
      AudioManager localAudioManager = (AudioManager)this.mContext.getSystemService("audio");
      if (paramInt == 0) {
        if (IsSpeakerMode().booleanValue())
        {
          localAudioManager.setMode(2);
          this.mPlayMode = 1;
        }
      }
      for (;;)
      {
        ReleaseAudioPlayer();
        InitAudioPlayer(this.mProfile);
        return;
        localAudioManager.setMode(0);
        this.mPlayMode = 2;
        continue;
        if (paramInt == 1)
        {
          localAudioManager.setMode(2);
          this.mPlayMode = 1;
        }
        else if (paramInt == 2)
        {
          localAudioManager.setMode(0);
          this.mPlayMode = 2;
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatAudioHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */