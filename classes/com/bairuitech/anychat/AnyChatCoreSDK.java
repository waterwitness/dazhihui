package com.bairuitech.anychat;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;

public class AnyChatCoreSDK
{
  private static int HANDLE_TYPE_NOTIFYMSG;
  private static int HANDLE_TYPE_RECORD;
  private static int HANDLE_TYPE_SDKFILTER;
  private static int HANDLE_TYPE_TEXTMSG;
  private static int HANDLE_TYPE_TRANSBUF;
  private static int HANDLE_TYPE_TRANSBUFEX;
  private static int HANDLE_TYPE_TRANSFILE;
  private static int HANDLE_TYPE_VIDEOCALL;
  private static AnyChatCoreSDK mAnyChat = null;
  public static AnyChatAudioHelper mAudioHelper;
  public static AnyChatCameraHelper mCameraHelper;
  static AnyChatCoreSDK.MainHandler mHandler = null;
  AnyChatBaseEvent baseEvent;
  AnyChatDataEncDecEvent encdecEvent;
  public AnyChatSensorHelper mSensorHelper = new AnyChatSensorHelper();
  public AnyChatVideoHelper mVideoHelper = new AnyChatVideoHelper();
  AnyChatPrivateChatEvent privateChatEvent;
  AnyChatRecordEvent recordEvent;
  AnyChatStateChgEvent stateChgEvent;
  AnyChatTextMsgEvent textMsgEvent;
  AnyChatTransDataEvent transDataEvent;
  AnyChatUserInfoEvent userInfoEvent;
  AnyChatVideoCallEvent videoCallEvent;
  
  static
  {
    mAudioHelper = new AnyChatAudioHelper();
    mCameraHelper = new AnyChatCameraHelper();
    HANDLE_TYPE_NOTIFYMSG = 1;
    HANDLE_TYPE_TEXTMSG = 2;
    HANDLE_TYPE_TRANSFILE = 3;
    HANDLE_TYPE_TRANSBUF = 4;
    HANDLE_TYPE_TRANSBUFEX = 5;
    HANDLE_TYPE_SDKFILTER = 6;
    HANDLE_TYPE_VIDEOCALL = 7;
    HANDLE_TYPE_RECORD = 8;
    System.loadLibrary("audio_preprocessing");
    System.loadLibrary("mediacore");
    System.loadLibrary("anychatcore");
  }
  
  public static native byte[] FetchAudioPlayBuffer(int paramInt);
  
  public static native int GetSDKOptionInt(int paramInt);
  
  public static native int InputAudioData(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public static native int InputVideoData(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  private void OnAnyChatNotifyMsg(int paramInt1, int paramInt2, int paramInt3)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_NOTIFYMSG);
    localBundle.putInt("MSG", paramInt1);
    localBundle.putInt("WPARAM", paramInt2);
    localBundle.putInt("LPARAM", paramInt3);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private int OnDataEncDecCallBack(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, AnyChatOutParam paramAnyChatOutParam)
  {
    if (this.encdecEvent != null) {
      return this.encdecEvent.OnAnyChatDataEncDec(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramAnyChatOutParam);
    }
    return -1;
  }
  
  private void OnRecordSnapShotExCallBack(int paramInt1, String paramString1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_RECORD);
    localBundle.putInt("USERID", paramInt1);
    localBundle.putString("FILENAME", paramString1);
    localBundle.putInt("ELAPSE", paramInt2);
    localBundle.putInt("FLAGS", paramInt3);
    localBundle.putInt("PARAM", paramInt4);
    localBundle.putString("USERSTR", paramString2);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnSDKFilterDataCallBack(byte[] paramArrayOfByte, int paramInt)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_SDKFILTER);
    localBundle.putByteArray("BUF", paramArrayOfByte);
    localBundle.putInt("LENGTH", paramInt);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnTextMessageCallBack(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_TEXTMSG);
    localBundle.putInt("FROMUSERID", paramInt1);
    localBundle.putInt("TOUSERID", paramInt2);
    localBundle.putInt("SECRET", paramInt3);
    localBundle.putString("MESSAGE", paramString);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnTransBufferCallBack(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_TRANSBUF);
    localBundle.putInt("USERID", paramInt1);
    localBundle.putByteArray("BUF", paramArrayOfByte);
    localBundle.putInt("LENGTH", paramInt2);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnTransBufferExCallBack(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_TRANSBUFEX);
    localBundle.putInt("USERID", paramInt1);
    localBundle.putByteArray("BUF", paramArrayOfByte);
    localBundle.putInt("LENGTH", paramInt2);
    localBundle.putInt("WPARAM", paramInt3);
    localBundle.putInt("LPARAM", paramInt4);
    localBundle.putInt("TASKID", paramInt5);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnTransFileCallBack(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_TRANSFILE);
    localBundle.putInt("USERID", paramInt1);
    localBundle.putString("FILENAME", paramString1);
    localBundle.putString("TEMPFILE", paramString2);
    localBundle.putInt("LENGTH", paramInt2);
    localBundle.putInt("WPARAM", paramInt3);
    localBundle.putInt("LPARAM", paramInt4);
    localBundle.putInt("TASKID", paramInt5);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnVideoCallEventCallBack(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    if (mHandler == null) {
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("HANDLETYPE", HANDLE_TYPE_VIDEOCALL);
    localBundle.putInt("EVENTTYPE", paramInt1);
    localBundle.putInt("USERID", paramInt2);
    localBundle.putInt("ERRORCODE", paramInt3);
    localBundle.putInt("FLAGS", paramInt4);
    localBundle.putInt("PARAM", paramInt5);
    localBundle.putString("USERSTR", paramString);
    localMessage.setData(localBundle);
    mHandler.sendMessage(localMessage);
  }
  
  private void OnVideoDataCallBack(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mVideoHelper.SetVideoFmt(paramInt1, paramInt3, paramInt4);
    paramInt2 = QueryUserStateInt(paramInt1, 18);
    paramInt3 = QueryUserStateInt(paramInt1, 19);
    this.mVideoHelper.ShowVideo(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public static native int SetInputAudioFormat(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native int SetInputVideoFormat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public static native int SetSDKOptionInt(int paramInt1, int paramInt2);
  
  public static AnyChatCoreSDK getInstance(Context paramContext)
  {
    try
    {
      if (mAnyChat == null) {
        mAnyChat = new AnyChatCoreSDK();
      }
      paramContext = mAnyChat;
      return paramContext;
    }
    finally {}
  }
  
  public native int AudioGetVolume(int paramInt);
  
  public native int AudioSetVolume(int paramInt1, int paramInt2);
  
  public void CameraAutoFocus()
  {
    SetSDKOptionInt(90, 1);
  }
  
  public native int CancelTransTask(int paramInt1, int paramInt2);
  
  public native int ChangeChatMode(int paramInt);
  
  public native int Connect(String paramString, int paramInt);
  
  public native int EnterRoom(int paramInt, String paramString);
  
  public native int EnterRoomEx(String paramString1, String paramString2);
  
  public native String[] EnumAudioCapture();
  
  public native String[] EnumAudioPlayback();
  
  public native String[] EnumVideoCapture();
  
  public native int GetCameraState(int paramInt);
  
  public native String GetCurAudioCapture();
  
  public native String GetCurAudioPlayback();
  
  public native String GetCurVideoCapture();
  
  public native int GetFriendStatus(int paramInt);
  
  public native int[] GetGroupFriends(int paramInt);
  
  public native String GetGroupName(int paramInt);
  
  public native int[] GetOnlineUser();
  
  public String GetSDKBuildTime()
  {
    return GetSDKOptionString(24);
  }
  
  public int GetSDKMainVersion()
  {
    return GetSDKOptionInt(22);
  }
  
  public native String GetSDKOptionString(int paramInt);
  
  public int GetSDKSubVersion()
  {
    return GetSDKOptionInt(23);
  }
  
  public native int GetSpeakState(int paramInt);
  
  public native int GetUserChatMode(int paramInt);
  
  public native int[] GetUserFriends();
  
  public native int[] GetUserGroups();
  
  public String GetUserIPAddr(int paramInt)
  {
    return QueryUserStateString(paramInt, 8);
  }
  
  public native String GetUserInfo(int paramInt1, int paramInt2);
  
  public String GetUserName(int paramInt)
  {
    return QueryUserStateString(paramInt, 6);
  }
  
  public native int GetUserSpeakVolume(int paramInt);
  
  public native int GetUserVideoHeight(int paramInt);
  
  public native int GetUserVideoWidth(int paramInt);
  
  public native int InitSDK(int paramInt1, int paramInt2);
  
  public native int LeaveRoom(int paramInt);
  
  public native int Login(String paramString1, String paramString2);
  
  public native int Logout();
  
  public native int MultiCastControl(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3);
  
  public void OnNotifyMsg(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool2 = true;
    switch (paramInt1)
    {
    case 1239: 
    default: 
    case 1225: 
    case 1226: 
    case 1227: 
    case 1229: 
    case 1230: 
    case 1231: 
    case 1228: 
    case 1235: 
    case 1236: 
    case 1237: 
    case 1238: 
    case 1245: 
    case 1246: 
    case 1247: 
    case 1240: 
    case 1241: 
    case 1324: 
    case 1325: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          return;
                                        } while (this.baseEvent == null);
                                        localObject = this.baseEvent;
                                        if (paramInt2 >= 1) {}
                                        for (bool1 = bool2;; bool1 = false)
                                        {
                                          ((AnyChatBaseEvent)localObject).OnAnyChatConnectMessage(bool1);
                                          return;
                                        }
                                      } while (this.baseEvent == null);
                                      this.baseEvent.OnAnyChatLoginMessage(paramInt2, paramInt3);
                                      return;
                                    } while (this.baseEvent == null);
                                    this.baseEvent.OnAnyChatEnterRoomMessage(paramInt2, paramInt3);
                                    return;
                                  } while (this.baseEvent == null);
                                  localObject = this.baseEvent;
                                  if (paramInt3 >= 1) {}
                                  for (bool1 = bool4;; bool1 = false)
                                  {
                                    ((AnyChatBaseEvent)localObject).OnAnyChatUserAtRoomMessage(paramInt2, bool1);
                                    return;
                                  }
                                } while (this.baseEvent == null);
                                this.baseEvent.OnAnyChatLinkCloseMessage(paramInt3);
                                return;
                              } while (this.baseEvent == null);
                              this.baseEvent.OnAnyChatOnlineUserMessage(paramInt2, paramInt3);
                              return;
                            } while (this.stateChgEvent == null);
                            localObject = this.stateChgEvent;
                            if (paramInt3 == 0) {}
                            for (;;)
                            {
                              ((AnyChatStateChgEvent)localObject).OnAnyChatMicStateChgMessage(paramInt2, bool1);
                              return;
                              bool1 = true;
                            }
                          } while (this.stateChgEvent == null);
                          this.stateChgEvent.OnAnyChatCameraStateChgMessage(paramInt2, paramInt3);
                          return;
                        } while (this.stateChgEvent == null);
                        localObject = this.stateChgEvent;
                        if (paramInt3 == 0) {}
                        for (bool1 = bool5;; bool1 = false)
                        {
                          ((AnyChatStateChgEvent)localObject).OnAnyChatChatModeChgMessage(paramInt2, bool1);
                          return;
                        }
                      } while (this.stateChgEvent == null);
                      this.stateChgEvent.OnAnyChatActiveStateChgMessage(paramInt2, paramInt3);
                      return;
                    } while (this.stateChgEvent == null);
                    this.stateChgEvent.OnAnyChatP2PConnectStateMessage(paramInt2, paramInt3);
                    return;
                  } while (this.privateChatEvent == null);
                  this.privateChatEvent.OnAnyChatPrivateRequestMessage(paramInt2, paramInt3);
                  return;
                } while (this.privateChatEvent == null);
                this.privateChatEvent.OnAnyChatPrivateEchoMessage(paramInt2, paramInt3);
                return;
              } while (this.privateChatEvent == null);
              this.privateChatEvent.OnAnyChatPrivateExitMessage(paramInt2, paramInt3);
              return;
            } while (this.userInfoEvent == null);
            this.userInfoEvent.OnAnyChatUserInfoUpdate(paramInt2, paramInt3);
            return;
          } while (this.userInfoEvent == null);
          this.userInfoEvent.OnAnyChatFriendStatus(paramInt2, paramInt3);
          return;
        } while (mAudioHelper == null);
        if (paramInt2 == 1)
        {
          mAudioHelper.InitAudioPlayer(paramInt3);
          return;
        }
        mAudioHelper.ReleaseAudioPlayer();
        return;
      } while (mAudioHelper == null);
      if (paramInt2 == 1)
      {
        mAudioHelper.InitAudioRecorder(paramInt3);
        return;
      }
      mAudioHelper.ReleaseAudioRecorder();
      return;
    }
    Object localObject = mCameraHelper;
    if (paramInt2 == 0) {}
    for (bool1 = bool3;; bool1 = true)
    {
      ((AnyChatCameraHelper)localObject).CaptureControl(bool1);
      return;
    }
  }
  
  public native int PrivateChatEcho(int paramInt1, int paramInt2, int paramInt3);
  
  public native int PrivateChatEchoEx(int paramInt1, int paramInt2, int paramInt3);
  
  public native int PrivateChatExit(int paramInt);
  
  public native int PrivateChatRequest(int paramInt);
  
  public native int QueryRoomStateInt(int paramInt1, int paramInt2);
  
  public native String QueryRoomStateString(int paramInt1, int paramInt2);
  
  public native int QueryTransTaskInfo(int paramInt1, int paramInt2, int paramInt3, AnyChatOutParam paramAnyChatOutParam);
  
  public native int QueryUserStateInt(int paramInt1, int paramInt2);
  
  public native String QueryUserStateString(int paramInt1, int paramInt2);
  
  public native int RegisterNotify();
  
  public native int Release();
  
  public native int SelectAudioCapture(String paramString);
  
  public native int SelectAudioPlayback(String paramString);
  
  public native int SelectVideoCapture(String paramString);
  
  public native int SendSDKFilterData(byte[] paramArrayOfByte, int paramInt);
  
  public native int SendTextMessage(int paramInt1, int paramInt2, String paramString);
  
  public void SetBaseEvent(AnyChatBaseEvent paramAnyChatBaseEvent)
  {
    mHandler = new AnyChatCoreSDK.MainHandler(this);
    RegisterNotify();
    this.baseEvent = paramAnyChatBaseEvent;
  }
  
  public void SetDataEncDecEvent(AnyChatDataEncDecEvent paramAnyChatDataEncDecEvent)
  {
    RegisterNotify();
    this.encdecEvent = paramAnyChatDataEncDecEvent;
  }
  
  public void SetPrivateChatEvent(AnyChatPrivateChatEvent paramAnyChatPrivateChatEvent)
  {
    RegisterNotify();
    this.privateChatEvent = paramAnyChatPrivateChatEvent;
  }
  
  public void SetRecordSnapShotEvent(AnyChatRecordEvent paramAnyChatRecordEvent)
  {
    RegisterNotify();
    this.recordEvent = paramAnyChatRecordEvent;
  }
  
  public native int SetSDKOptionString(int paramInt, String paramString);
  
  public native int SetServerAuthPass(String paramString);
  
  public void SetStateChgEvent(AnyChatStateChgEvent paramAnyChatStateChgEvent)
  {
    RegisterNotify();
    this.stateChgEvent = paramAnyChatStateChgEvent;
  }
  
  public void SetTextMessageEvent(AnyChatTextMsgEvent paramAnyChatTextMsgEvent)
  {
    RegisterNotify();
    this.textMsgEvent = paramAnyChatTextMsgEvent;
  }
  
  public void SetTransDataEvent(AnyChatTransDataEvent paramAnyChatTransDataEvent)
  {
    RegisterNotify();
    this.transDataEvent = paramAnyChatTransDataEvent;
  }
  
  public void SetUserInfoEvent(AnyChatUserInfoEvent paramAnyChatUserInfoEvent)
  {
    RegisterNotify();
    this.userInfoEvent = paramAnyChatUserInfoEvent;
  }
  
  public void SetVideoCallEvent(AnyChatVideoCallEvent paramAnyChatVideoCallEvent)
  {
    RegisterNotify();
    this.videoCallEvent = paramAnyChatVideoCallEvent;
  }
  
  public native int SetVideoPos(int paramInt1, Surface paramSurface, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int SnapShot(int paramInt1, int paramInt2, int paramInt3);
  
  public native int StreamRecordCtrl(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public native int StreamRecordCtrlEx(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString);
  
  public native int TransBuffer(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public native int TransBufferEx(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, AnyChatOutParam paramAnyChatOutParam);
  
  public native int TransFile(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, AnyChatOutParam paramAnyChatOutParam);
  
  public native int UserCameraControl(int paramInt1, int paramInt2);
  
  public native int UserInfoControl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString);
  
  public native int UserSpeakControl(int paramInt1, int paramInt2);
  
  public native int VideoCallControl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatCoreSDK.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */