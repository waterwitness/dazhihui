package com.bairuitech.anychat;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;

class AnyChatAudioHelper$RecordAudioThread
  extends Thread
{
  AnyChatAudioHelper$RecordAudioThread(AnyChatAudioHelper paramAnyChatAudioHelper) {}
  
  public void run()
  {
    if (AnyChatAudioHelper.access$2(this.this$0) == null) {
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
          AnyChatAudioHelper.access$2(this.this$0).startRecording();
          Log.d("ANYCHAT", "audio record....");
          byte[] arrayOfByte = new byte['ʀ'];
          if (!AnyChatAudioHelper.access$3(this.this$0)) {
            break;
          }
          Log.d("ANYCHAT", "audio record stop....");
          return;
          localException1 = localException1;
          Log.d("ANYCHAT", "Set record thread priority failed: " + localException1.getMessage());
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
            int i = AnyChatAudioHelper.access$2(this.this$0).read(localException2, 0, localException2.length);
            if ((i != -3) && (i != -2)) {
              AnyChatCoreSDK.InputAudioData(localException2, i, 0);
            }
          }
          catch (Exception localException3) {}
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatAudioHelper$RecordAudioThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */