package com.tencent.avsdk.control;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.tencent.av.TIMAvManager;
import com.tencent.av.TIMAvManager.RecordParam;
import com.tencent.av.TIMAvManager.RoomInfo;
import com.tencent.av.TIMAvManager.StreamEncode;
import com.tencent.av.TIMAvManager.StreamParam;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVEndpoint.CancelAllViewCompleteCallback;
import com.tencent.av.sdk.AVEndpoint.RequestViewListCompleteCallback;
import com.tencent.av.sdk.AVRoom.EnterRoomParam;
import com.tencent.av.sdk.AVRoomMulti;
import com.tencent.av.sdk.AVRoomMulti.Delegate;
import com.tencent.av.sdk.AVRoomMulti.EnterRoomParam;
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdk.UserilvbManager;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AVRoomControl
{
  public static final SimpleDateFormat DATE_FORMAT_DATE = new SimpleDateFormat("yyyyMMdd_HHmmss");
  private static final String TAG = "ilvb";
  public static final int TYPE_MEMBER_CHANGE_HAS_AUDIO = 5;
  public static final int TYPE_MEMBER_CHANGE_HAS_CAMERA_VIDEO = 3;
  public static final int TYPE_MEMBER_CHANGE_HAS_SCREEN_VIDEO = 7;
  public static final int TYPE_MEMBER_CHANGE_IN = 1;
  public static final int TYPE_MEMBER_CHANGE_NO_AUDIO = 6;
  public static final int TYPE_MEMBER_CHANGE_NO_CAMERA_VIDEO = 4;
  public static final int TYPE_MEMBER_CHANGE_NO_SCREEN_VIDEO = 8;
  public static final int TYPE_MEMBER_CHANGE_OUT = 2;
  public static final AVEndpoint.CancelAllViewCompleteCallback mCancelAllViewCompleteCallback = new AVRoomControl.2();
  public static final AVEndpoint.RequestViewListCompleteCallback mRequestViewListCompleteCallback = new AVRoomControl.1();
  private static AVRoomControl sAVRoomControl = null;
  private int audioCat = 2;
  private volatile AVRoomControl.AudioState mAudioState = AVRoomControl.AudioState.AUDIO_NORMAL;
  private TIMAvManager.RecordParam mRecordParam;
  private WeakReference<Handler> mRefHandler = null;
  private AVRoomMulti.Delegate mRoomDelegate = new AVRoomControl.3(this);
  private TIMAvManager.RoomInfo mRoomInfo;
  private volatile AVRoomControl.RoomState mRoomState = AVRoomControl.RoomState.ROOM_EXIT_OK;
  private long mStreamChannelID;
  private int mTryPushCount = 0;
  private int mTryRecordCount = 0;
  
  public static AVRoomControl getInstance()
  {
    if (sAVRoomControl == null) {}
    try
    {
      if (sAVRoomControl == null) {
        sAVRoomControl = new AVRoomControl();
      }
      return sAVRoomControl;
    }
    finally {}
  }
  
  public static void initAudioService()
  {
    if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().startTRAEService();
    }
  }
  
  public static void uninitAudioService()
  {
    if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().stopTRAEService();
    }
  }
  
  public void destroy()
  {
    if (this.mRefHandler != null) {
      this.mRefHandler.clear();
    }
    this.mRefHandler = null;
  }
  
  public void enterRoom(int paramInt)
  {
    Log.d("ilvb", "AVRoomControl enterRoom START roomId = " + paramInt);
    if (!isContextOk()) {
      return;
    }
    AVContext localAVContext = QavsdkControl.getInstance().getAVContext();
    long l2 = -1L;
    Object localObject = UserInfo.getInstance();
    LeftMenuVo localLeftMenuVo = m.a().J();
    long l1 = l2;
    if (localLeftMenuVo != null)
    {
      l1 = l2;
      if ("0".equals(localLeftMenuVo.getIsComplete()))
      {
        l1 = l2;
        if (localObject != null)
        {
          l1 = l2;
          if (!((UserInfo)localObject).isCreater().booleanValue()) {
            l1 = 170L;
          }
        }
      }
    }
    if ((localObject != null) && (((UserInfo)localObject).isCreater().booleanValue())) {}
    for (boolean bool = true;; bool = false)
    {
      n.d("ilvb", "AVRoomControl authBits=" + l1 + " auto_create_room=" + bool);
      localObject = new AVRoomMulti.EnterRoomParam();
      ((AVRoomMulti.EnterRoomParam)localObject).appRoomId = paramInt;
      ((AVRoomMulti.EnterRoomParam)localObject).authBits = l1;
      ((AVRoomMulti.EnterRoomParam)localObject).authBuffer = null;
      ((AVRoomMulti.EnterRoomParam)localObject).avControlRole = "";
      ((AVRoomMulti.EnterRoomParam)localObject).audioCategory = this.audioCat;
      ((AVRoomMulti.EnterRoomParam)localObject).autoCreateRoom = bool;
      ((AVRoomMulti.EnterRoomParam)localObject).videoRecvMode = 0;
      if (localAVContext == null)
      {
        Log.e("ilvb", "AVRoomControl enterRoom avContext is null");
        return;
      }
      paramInt = localAVContext.enterRoom(2, this.mRoomDelegate, (AVRoom.EnterRoomParam)localObject);
      if (paramInt == 0) {
        this.mRoomState = AVRoomControl.RoomState.ROOM_ENTER_START;
      }
      Log.d("ilvb", "AVRoomControl enterRoom END return=" + paramInt + "  请等待mRoomDelegate返回结果......");
      return;
    }
  }
  
  public int exitRoom()
  {
    AVContext localAVContext = QavsdkControl.getInstance().getAVContext();
    if (localAVContext != null)
    {
      int i = localAVContext.exitRoom();
      if (i == 0) {
        this.mRoomState = AVRoomControl.RoomState.ROOM_EXIT_START;
      }
      for (;;)
      {
        Log.d("ilvb", "AVRoomControl exitRoom result=" + i);
        return i;
        if (i == 1003)
        {
          uninitAudioService();
          this.mRoomState = AVRoomControl.RoomState.ROOM_EXIT_OK;
        }
        else if (i == 1002)
        {
          Log.e("ilvb", "AVRoomControl exitRoom与enterRoom 互斥操作 error");
          UserilvbManager.getInstance().mAvPrepareNormal = false;
        }
        else if (i == 1001)
        {
          Log.e("ilvb", "AVRoomControl exitRoom操作重复 error");
        }
      }
    }
    Log.d("ilvb", "AVRoomControl exitRoom AVContext==NULL");
    return 0;
  }
  
  public AVRoomControl.AudioState getAudioState()
  {
    return this.mAudioState;
  }
  
  public AVRoomControl.RoomState getmRoomState()
  {
    Log.d("ilvb", "AVRoomControl mRoomState=" + this.mRoomState);
    return this.mRoomState;
  }
  
  public AVRoomControl init(Context paramContext, Handler paramHandler)
  {
    this.mRefHandler = new WeakReference(paramHandler);
    return this;
  }
  
  public boolean isContextOk()
  {
    if ((this.mRefHandler == null) || (this.mRefHandler.get() == null))
    {
      Log.e("ilvb", "AVRoomControl isContextOk mContext is null");
      return false;
    }
    return true;
  }
  
  public void setAudioCat(int paramInt)
  {
    this.audioCat = paramInt;
  }
  
  public void setAudioNormal()
  {
    if ((!isContextOk()) || ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)))
    {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().enableSpeaker(true);
      this.mAudioState = AVRoomControl.AudioState.AUDIO_NORMAL;
    }
  }
  
  public void setAudioSilent()
  {
    if ((!isContextOk()) || ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)))
    {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().enableSpeaker(false);
      this.mAudioState = AVRoomControl.AudioState.AUDIO_SILENT;
    }
  }
  
  public void setNetType(int paramInt)
  {
    Object localObject = QavsdkControl.getInstance().getAVContext();
    if (localObject != null)
    {
      localObject = (AVRoomMulti)((AVContext)localObject).getRoom();
      if (localObject != null) {
        ((AVRoomMulti)localObject).setNetType(paramInt);
      }
    }
  }
  
  public void startPush(int paramInt, String paramString)
  {
    Object localObject = TIMAvManager.getInstance();
    localObject.getClass();
    localObject = new TIMAvManager.StreamParam((TIMAvManager)localObject);
    ((TIMAvManager.StreamParam)localObject).setChannelName("roomid_" + paramInt);
    ((TIMAvManager.StreamParam)localObject).setEncode(TIMAvManager.StreamEncode.HLS);
    TIMAvManager localTIMAvManager = TIMAvManager.getInstance();
    localTIMAvManager.getClass();
    this.mRoomInfo = new TIMAvManager.RoomInfo(localTIMAvManager);
    this.mRoomInfo.setRelationId(paramInt);
    this.mRoomInfo.setRoomId(paramInt);
    if (TIMAvManager.getInstance() != null) {
      TIMAvManager.getInstance().requestMultiVideoStreamerStart(this.mRoomInfo, (TIMAvManager.StreamParam)localObject, new AVRoomControl.4(this, paramString, paramInt));
    }
  }
  
  public void startRecord(int paramInt, String paramString)
  {
    Object localObject = TIMAvManager.getInstance();
    localObject.getClass();
    this.mRecordParam = new TIMAvManager.RecordParam((TIMAvManager)localObject);
    localObject = DATE_FORMAT_DATE.format(new Date());
    this.mRecordParam.setFilename(paramString + "_roomid_" + paramInt + "_" + "android" + "_" + (String)localObject);
    n.d("ilvb", "AVRoomControl Record file=" + paramString + "_roomid_" + paramInt + "_" + (String)localObject);
    this.mRecordParam.setClassId(0);
    this.mRecordParam.setTransCode(false);
    this.mRecordParam.setSreenShot(false);
    this.mRecordParam.setWaterMark(false);
    paramString = TIMAvManager.getInstance();
    paramString.getClass();
    paramString = new TIMAvManager.RoomInfo(paramString);
    paramString.setRelationId(paramInt);
    paramString.setRoomId(paramInt);
    TIMAvManager.getInstance().requestMultiVideoRecorderStart(paramString, this.mRecordParam, new AVRoomControl.6(this));
  }
  
  public void stopPush()
  {
    Log.d("ilvb", "AVRoomControl Push stop Id " + this.mStreamChannelID);
    if (this.mRoomInfo == null)
    {
      Log.e("ilvb", "AVRoomControl Push stop Error NULL");
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Long.valueOf(this.mStreamChannelID));
    TIMAvManager.getInstance().requestMultiVideoStreamerStop(this.mRoomInfo, localArrayList, new AVRoomControl.5(this));
  }
  
  public void stopRecord(int paramInt)
  {
    Object localObject = TIMAvManager.getInstance();
    localObject.getClass();
    localObject = new TIMAvManager.RoomInfo((TIMAvManager)localObject);
    ((TIMAvManager.RoomInfo)localObject).setRelationId(paramInt);
    ((TIMAvManager.RoomInfo)localObject).setRoomId(paramInt);
    TIMAvManager.getInstance().requestMultiVideoRecorderStop((TIMAvManager.RoomInfo)localObject, new AVRoomControl.7(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */