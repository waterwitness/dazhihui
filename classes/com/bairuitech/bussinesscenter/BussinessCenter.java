package com.bairuitech.bussinesscenter;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import com.bairuitech.anychat.AnyChatCoreSDK;
import com.bairuitech.util.BaseMethod;
import com.bairuitech.util.ScreenInfo;
import com.kwl.common.utils.ResourceUtil;
import java.util.ArrayList;

public class BussinessCenter
{
  public static AnyChatCoreSDK anychat;
  public static boolean bBack = false;
  private static BussinessCenter mBussinessCenter;
  public static Activity mContext;
  public static ArrayList<Integer> mOnlineFriendIds;
  public static ArrayList<UserItem> mOnlineFriendItems;
  public static ScreenInfo mScreenInfo;
  public static int selfUserId;
  public static String selfUserName;
  public static SessionItem sessionItem;
  private MediaPlayer mMediaPlaer;
  
  private BussinessCenter()
  {
    initParams();
  }
  
  public static void VideoCallControl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    anychat.VideoCallControl(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
  }
  
  public static BussinessCenter getBussinessCenter()
  {
    if (mBussinessCenter == null) {
      mBussinessCenter = new BussinessCenter();
    }
    return mBussinessCenter;
  }
  
  private void initParams()
  {
    anychat = new AnyChatCoreSDK();
    mOnlineFriendItems = new ArrayList();
    mOnlineFriendIds = new ArrayList();
  }
  
  private void playCallReceivedMusic(Context paramContext)
  {
    this.mMediaPlaer = MediaPlayer.create(paramContext, ResourceUtil.getRawIdByName(paramContext, "call"));
    this.mMediaPlaer.setOnCompletionListener(new BussinessCenter.1(this));
    this.mMediaPlaer.start();
  }
  
  public void getOnlineFriendDatas()
  {
    mOnlineFriendItems.clear();
    mOnlineFriendIds.clear();
    Object localObject = anychat.QueryUserStateString(-1, 7);
    UserItem localUserItem = new UserItem(selfUserId, selfUserName, (String)localObject);
    localObject = anychat.GetUserFriends();
    mOnlineFriendItems.add(localUserItem);
    mOnlineFriendIds.add(Integer.valueOf(selfUserId));
    if (localObject == null) {
      return;
    }
    int i = 0;
    label73:
    int j;
    if (i < localObject.length)
    {
      j = localObject[i];
      if (anychat.GetFriendStatus(j) != 0) {
        break label106;
      }
    }
    for (;;)
    {
      i += 1;
      break label73;
      break;
      label106:
      localUserItem = new UserItem();
      localUserItem.setUserId(j);
      String str = anychat.GetUserInfo(j, 1);
      if (str != null) {
        localUserItem.setUserName(str);
      }
      str = anychat.GetUserInfo(j, 2);
      if (str != null) {
        localUserItem.setIp(str);
      }
      mOnlineFriendItems.add(localUserItem);
      mOnlineFriendIds.add(Integer.valueOf(j));
    }
  }
  
  public UserItem getUserItemByIndex(int paramInt)
  {
    try
    {
      UserItem localUserItem = (UserItem)mOnlineFriendItems.get(paramInt);
      return localUserItem;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public UserItem getUserItemByUserId(int paramInt)
  {
    int j = mOnlineFriendItems.size();
    int i = 0;
    for (;;)
    {
      Object localObject;
      if (i >= j) {
        localObject = null;
      }
      UserItem localUserItem;
      do
      {
        return (UserItem)localObject;
        localUserItem = (UserItem)mOnlineFriendItems.get(i);
        if (localUserItem == null) {
          break;
        }
        localObject = localUserItem;
      } while (localUserItem.getUserId() == paramInt);
      i += 1;
    }
  }
  
  public void onUserOnlineStatusNotify(int paramInt1, int paramInt2)
  {
    Object localObject = getUserItemByUserId(paramInt1);
    if (localObject == null) {}
    for (;;)
    {
      return;
      if (paramInt2 == 0) {
        if (mOnlineFriendIds.indexOf(Integer.valueOf(paramInt1)) >= 0)
        {
          mOnlineFriendItems.remove(localObject);
          mOnlineFriendIds.remove(Integer.valueOf(paramInt1));
        }
      }
      for (localObject = ((UserItem)localObject).getUserName() + "下线"; mContext != null; localObject = ((UserItem)localObject).getUserName() + "上线")
      {
        BaseMethod.showToast((String)localObject, mContext);
        return;
      }
    }
  }
  
  public void onVideoCallEnd(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    sessionItem = null;
  }
  
  public String onVideoCallReply(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    switch (paramInt2)
    {
    default: 
      paramString = null;
    }
    for (;;)
    {
      if (paramString != null)
      {
        BaseMethod.showToast(paramString, mContext);
        if (bBack)
        {
          new Bundle().putInt("USERID", paramInt1);
          BaseMethod.sendBroadCast(mContext, "com.bairuitech.callcenter.backcancelsession", null);
        }
        stopSessionMusic();
      }
      return paramString;
      paramString = mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_str_returncode_bussiness"));
      continue;
      paramString = mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_str_returncode_requestrefuse"));
      continue;
      paramString = mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_str_returncode_offline"));
      continue;
      paramString = mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_str_returncode_requestcancel"));
      continue;
      paramString = mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_str_returncode_timeout"));
      continue;
      paramString = mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_str_returncode_disconnect"));
      continue;
      paramString = null;
    }
  }
  
  public void onVideoCallRequest(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    playCallReceivedMusic(mContext);
    Bundle localBundle;
    if (bBack)
    {
      paramString = getUserItemByUserId(paramInt1);
      localBundle = new Bundle();
      if (paramString == null) {
        break label96;
      }
      localBundle.putString("USERNAME", paramString.getUserName() + mContext.getString(ResourceUtil.getStringIdByName(mContext, "kwlopen_sessioning_reqite")));
    }
    for (;;)
    {
      localBundle.putInt("USERID", paramInt1);
      BaseMethod.sendBroadCast(mContext, "com.bairuitech.callcenter.backrequestsession", localBundle);
      return;
      label96:
      localBundle.putString("USERNAME", "some one call you");
    }
  }
  
  public void onVideoCallStart(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    stopSessionMusic();
    sessionItem = new SessionItem(paramInt2, selfUserId, paramInt1);
    sessionItem.setRoomId(paramInt3);
  }
  
  public void realse()
  {
    anychat = null;
    mOnlineFriendItems = null;
    this.mMediaPlaer = null;
    mScreenInfo = null;
    mContext = null;
    mBussinessCenter = null;
  }
  
  public void realseData()
  {
    mOnlineFriendItems.clear();
    mOnlineFriendIds.clear();
  }
  
  public void stopSessionMusic()
  {
    if (this.mMediaPlaer == null) {
      return;
    }
    try
    {
      this.mMediaPlaer.pause();
      this.mMediaPlaer.stop();
      this.mMediaPlaer.release();
      this.mMediaPlaer = null;
      return;
    }
    catch (Exception localException)
    {
      Log.i("media-stop", "er");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\bussinesscenter\BussinessCenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */