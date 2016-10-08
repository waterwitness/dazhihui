package com.bairuitech.anychat;

import android.media.AudioTrack;
import android.os.Process;
import android.util.Log;

class AnyChatAudioHelper$PlayAudioThread
  extends Thread
{
  AnyChatAudioHelper$PlayAudioThread(AnyChatAudioHelper paramAnyChatAudioHelper) {}
  
  public void run()
  {
    if (AnyChatAudioHelper.access$0(this.this$0) == null) {
      return;
    }
    try
    {
      Process.setThreadPriority(-19);
    }
    catch (Exception localException1)
    {
      try
      {
        for (;;)
        {
          AnyChatAudioHelper.access$0(this.this$0).play();
          Log.d("ANYCHAT", "audio play....");
          if (!AnyChatAudioHelper.access$1(this.this$0)) {
            break;
          }
          Log.d("ANYCHAT", "audio play stop....");
          return;
          localException1 = localException1;
          Log.d("ANYCHAT", "Set play thread priority failed: " + localException1.getMessage());
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
          continue;
          try
          {
            byte[] arrayOfByte = AnyChatCoreSDK.FetchAudioPlayBuffer(640);
            AnyChatAudioHelper.access$0(this.this$0).write(arrayOfByte, 0, arrayOfByte.length);
          }
          catch (Exception localException3) {}
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatAudioHelper$PlayAudioThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */