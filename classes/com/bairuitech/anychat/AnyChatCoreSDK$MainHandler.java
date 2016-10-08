package com.bairuitech.anychat;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class AnyChatCoreSDK$MainHandler
  extends Handler
{
  WeakReference<AnyChatCoreSDK> mAnyChat;
  
  public AnyChatCoreSDK$MainHandler(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public AnyChatCoreSDK$MainHandler(AnyChatCoreSDK paramAnyChatCoreSDK)
  {
    this.mAnyChat = new WeakReference(paramAnyChatCoreSDK);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = (AnyChatCoreSDK)this.mAnyChat.get();
    if (localObject1 == null) {}
    int i;
    int j;
    int k;
    Object localObject2;
    int m;
    do
    {
      do
      {
        int n;
        do
        {
          do
          {
            do
            {
              do
              {
                String str;
                do
                {
                  do
                  {
                    return;
                    super.handleMessage(paramMessage);
                    paramMessage = paramMessage.getData();
                    i = paramMessage.getInt("HANDLETYPE");
                    if (i == AnyChatCoreSDK.access$0())
                    {
                      ((AnyChatCoreSDK)localObject1).OnNotifyMsg(paramMessage.getInt("MSG"), paramMessage.getInt("WPARAM"), paramMessage.getInt("LPARAM"));
                      return;
                    }
                    if (i != AnyChatCoreSDK.access$1()) {
                      break;
                    }
                    i = paramMessage.getInt("FROMUSERID");
                    j = paramMessage.getInt("TOUSERID");
                    k = paramMessage.getInt("SECRET");
                    paramMessage = paramMessage.getString("MESSAGE");
                  } while (((AnyChatCoreSDK)localObject1).textMsgEvent == null);
                  localObject1 = ((AnyChatCoreSDK)localObject1).textMsgEvent;
                  if (k != 0) {}
                  for (boolean bool = true;; bool = false)
                  {
                    ((AnyChatTextMsgEvent)localObject1).OnAnyChatTextMessage(i, j, bool, paramMessage);
                    return;
                  }
                  if (i != AnyChatCoreSDK.access$2()) {
                    break;
                  }
                  i = paramMessage.getInt("USERID");
                  localObject2 = paramMessage.getString("FILENAME");
                  str = paramMessage.getString("TEMPFILE");
                  j = paramMessage.getInt("LENGTH");
                  k = paramMessage.getInt("WPARAM");
                  m = paramMessage.getInt("LPARAM");
                  n = paramMessage.getInt("TASKID");
                } while (((AnyChatCoreSDK)localObject1).transDataEvent == null);
                ((AnyChatCoreSDK)localObject1).transDataEvent.OnAnyChatTransFile(i, (String)localObject2, str, j, k, m, n);
                return;
                if (i != AnyChatCoreSDK.access$3()) {
                  break;
                }
                i = paramMessage.getInt("USERID");
                j = paramMessage.getInt("LENGTH");
                paramMessage = paramMessage.getByteArray("BUF");
              } while (((AnyChatCoreSDK)localObject1).transDataEvent == null);
              ((AnyChatCoreSDK)localObject1).transDataEvent.OnAnyChatTransBuffer(i, paramMessage, j);
              return;
              if (i != AnyChatCoreSDK.access$4()) {
                break;
              }
              i = paramMessage.getInt("USERID");
              j = paramMessage.getInt("LENGTH");
              localObject2 = paramMessage.getByteArray("BUF");
              k = paramMessage.getInt("WPARAM");
              m = paramMessage.getInt("LPARAM");
              n = paramMessage.getInt("TASKID");
            } while (((AnyChatCoreSDK)localObject1).transDataEvent == null);
            ((AnyChatCoreSDK)localObject1).transDataEvent.OnAnyChatTransBufferEx(i, (byte[])localObject2, j, k, m, n);
            return;
            if (i != AnyChatCoreSDK.access$5()) {
              break;
            }
            i = paramMessage.getInt("LENGTH");
            paramMessage = paramMessage.getByteArray("BUF");
          } while (((AnyChatCoreSDK)localObject1).transDataEvent == null);
          ((AnyChatCoreSDK)localObject1).transDataEvent.OnAnyChatSDKFilterData(paramMessage, i);
          return;
          if (i != AnyChatCoreSDK.access$6()) {
            break;
          }
          i = paramMessage.getInt("EVENTTYPE");
          j = paramMessage.getInt("USERID");
          k = paramMessage.getInt("ERRORCODE");
          m = paramMessage.getInt("FLAGS");
          n = paramMessage.getInt("PARAM");
          paramMessage = paramMessage.getString("USERSTR");
        } while (((AnyChatCoreSDK)localObject1).videoCallEvent == null);
        ((AnyChatCoreSDK)localObject1).videoCallEvent.OnAnyChatVideoCallEvent(i, j, k, m, n, paramMessage);
        return;
      } while (i != AnyChatCoreSDK.access$7());
      i = paramMessage.getInt("USERID");
      localObject2 = paramMessage.getString("FILENAME");
      j = paramMessage.getInt("ELAPSE");
      k = paramMessage.getInt("FLAGS");
      m = paramMessage.getInt("PARAM");
      paramMessage = paramMessage.getString("USERSTR");
    } while (((AnyChatCoreSDK)localObject1).recordEvent == null);
    if ((k & 0x400) == 0)
    {
      ((AnyChatCoreSDK)localObject1).recordEvent.OnAnyChatRecordEvent(i, (String)localObject2, j, k, m, paramMessage);
      return;
    }
    ((AnyChatCoreSDK)localObject1).recordEvent.OnAnyChatSnapShotEvent(i, (String)localObject2, k, m, paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatCoreSDK$MainHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */