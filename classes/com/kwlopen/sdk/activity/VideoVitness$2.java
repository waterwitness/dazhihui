package com.kwlopen.sdk.activity;

import android.os.Handler.Callback;
import android.os.Message;
import android.widget.TextView;
import com.bairuitech.util.BaseMethod;

class VideoVitness$2
  implements Handler.Callback
{
  VideoVitness$2(VideoVitness paramVideoVitness) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return false;
      VideoVitness.access$1(this.this$0);
      VideoVitness.access$2(this.this$0);
      continue;
      paramMessage = VideoVitness.access$3(this.this$0);
      VideoVitness localVideoVitness = this.this$0;
      int i = localVideoVitness.videocallSeconds;
      localVideoVitness.videocallSeconds = (i + 1);
      paramMessage.setText(BaseMethod.getTimeShowString(i));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoVitness$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */