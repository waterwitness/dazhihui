package com.kwlopen.sdk.activity;

import android.os.Handler;
import android.os.Message;
import com.kwl.common.utils.Handler_Ui;
import com.kwlopen.sdk.camera.ImageEvent;
import de.greenrobot.event.EventBus;

class SelectPicActivity$1
  extends Handler
{
  SelectPicActivity$1(SelectPicActivity paramSelectPicActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      Handler_Ui.dismissProgressDialog();
      paramMessage = (String)paramMessage.obj;
      ImageEvent localImageEvent = new ImageEvent();
      localImageEvent.setImagePath(paramMessage);
      EventBus.getDefault().post(localImageEvent);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\SelectPicActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */