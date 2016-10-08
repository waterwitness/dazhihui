package com.tencent.avsdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public class Util
{
  public static final String ACTION_CLOSE_CONTEXT_COMPLETE = "com.dazhihui.avsdk.ACTION_CLOSE_CONTEXT_COMPLETE";
  public static final String ACTION_CLOSE_MEMBER_VIDEOCHAT = "com.dazhihui.avsdk.ACTION_CLOSE_MEMBER_VIDEOCHAT";
  public static final String ACTION_CLOSE_ROOM_COMPLETE = "com.dazhihui.avsdk.ACTION_CLOSE_ROOM_COMPLETE";
  public static final String ACTION_CREATE_GROUP_ID_COMPLETE = "com.dazhihui.avsdk.ACTION_CREATE_GROUP_ID_COMPLETE";
  public static final String ACTION_CREATE_ROOM_NUM_COMPLETE = "com.dazhihui.avsdk.ACTION_CREATE_ROOM_NUM_COMPLETE";
  public static final String ACTION_ENABLE_CAMERA_COMPLETE = "com.dazhihui.avsdk.ACTION_ENABLE_CAMERA_COMPLETE";
  public static final String ACTION_ENABLE_EXTERNAL_CAPTURE_COMPLETE = "com.dazhihui.avsdk.ACTION_ENABLE_EXTERNAL_CAPTURE_COMPLETE";
  public static final String ACTION_ENDPOINTS_UPDATE_INFO = "com.dazhihui.avsdk.ACTION_ENDPOINTS_UPDATE_INFO";
  public static final String ACTION_INSERT_ROOM_TO_SERVER_COMPLETE = "com.dazhihui.avsdk.ACTION_INSERT_ROOM_TO_SERVER_COMPLETE";
  public static final String ACTION_INVITE_MEMBER_VIDEOCHAT = "com.dazhihui.avsdk.ACTION_INVITE_MEMBER_VIDEOCHAT";
  public static final String ACTION_MEMBER_CHANGE = "com.dazhihui.avsdk.ACTION_MEMBER_CHANGE";
  public static final String ACTION_MEMBER_VIDEO_SHOW = "com.dazhihui.avsdk.ACTION_MEMBER_VIDEO_SHOW";
  public static final String ACTION_OUTPUT_MODE_CHANGE = "com.dazhihui.avsdk.ACTION_OUTPUT_MODE_CHANGE";
  public static final String ACTION_REQUEST_MEMBER_VIEW = "com.dazhihui.avsdk.ACTION_REQUEST_MEMBER_VIEW";
  public static final String ACTION_ROOM_CREATE_COMPLETE = "com.dazhihui.avsdk.ACTION_ROOM_CREATE_COMPLETE";
  public static final String ACTION_SHOW_GIFT_VIEW = "com.dazhihui.avsdk.ACTION_SHOW_GIFT_VIEW";
  public static final String ACTION_SHOW_VIDEO_MEMBER_INFO = "com.dazhihui.avsdk.ACTION_SHOW_VIDEO_MEMBER_INFO";
  public static final String ACTION_START_CONTEXT_COMPLETE = "com.dazhihui.avsdk.ACTION_START_CONTEXT_COMPLETE";
  public static final String ACTION_SURFACE_CREATED = "com.dazhihui.avsdk.ACTION_SURFACE_CREATED";
  public static final String ACTION_SWITCH_CAMERA_COMPLETE = "com.dazhihui.avsdk.ACTION_SWITCH_CAMERA_COMPLETE";
  public static final String ACTION_VIDEO_CLOSE = "com.dazhihui.avsdk.ACTION_VIDEO_CLOSE";
  public static final String ACTION_VIDEO_SHOW = "com.dazhihui.avsdk.ACTION_VIDEO_SHOW";
  public static final int AUDIO_MEDIA_PLAYBACK = 2;
  public static final int AUDIO_MEDIA_PLAY_RECORD = 1;
  public static final int AUDIO_VOICE_CHAT_MODE = 0;
  public static final int EDIT_RESULT_CODE = 20000;
  public static final int ENV_FORMAL = 0;
  public static final int ENV_TEST = 1;
  public static final String EXTRA_ACCOUNT_CHANGE = "account_change";
  public static final String EXTRA_ADDRESS = "address";
  public static final String EXTRA_AV_ERROR_RESULT = "av_error_result";
  public static final String EXTRA_CONSTELLATION = "constellation";
  public static final String EXTRA_FROM_SOUND_MODE = "from_only_sound";
  public static final String EXTRA_GROUP_ID = "groupid";
  public static final String EXTRA_HEAD_IMAGE_PATH = "headimagepath";
  public static final String EXTRA_IDENTIFIER = "identifier";
  public static final String EXTRA_IDENTIFIER_LIST_INDEX = "QQIdentifier";
  public static final String EXTRA_IS_ASKFOR_MEMVIDEO = "askfor_memvideo";
  public static final String EXTRA_IS_ENABLE = "isEnable";
  public static final String EXTRA_IS_FRONT = "isFront";
  public static final String EXTRA_IS_VIDEO = "isVideo";
  public static final String EXTRA_LEAVE_MODE = "leave_mode";
  public static final String EXTRA_LIVEPHONE = "livephone";
  public static final String EXTRA_LIVE_TITLE = "livetitle";
  public static final String EXTRA_LIVE_VIDEO_INFO = "LiveVideoInfo";
  public static final String EXTRA_PASSWORD = "password";
  public static final String EXTRA_PRAISE_NUM = "praisenum";
  public static final String EXTRA_PROGRAM_ID = "programid";
  public static final String EXTRA_RECORDTIME = "duration";
  public static final String EXTRA_RELATION_ID = "relationId";
  public static final String EXTRA_REPLAYID = "replayid";
  public static final String EXTRA_ROOM_ID = "roomId";
  public static final String EXTRA_ROOM_IMAGE = "roomimage";
  public static final String EXTRA_ROOM_NUM = "roomnum";
  public static final String EXTRA_ROOM_PV = "roompv";
  public static final String EXTRA_ROOM_SHARE_URL = "roomshareurl";
  public static final String EXTRA_ROOM_STATUS = "room_status";
  public static final String EXTRA_SELF_IDENTIFIER = "selfIdentifier";
  public static final String EXTRA_SEX = "sex";
  public static final String EXTRA_SIGNATURE = "signature";
  public static final String EXTRA_SUBJECT = "subject";
  public static final String EXTRA_USER_NAME = "username";
  public static final String EXTRA_USER_PHONE = "userphone";
  public static final String EXTRA_USER_SIG = "usersig";
  public static final String EXTRA_VIDEO_SRC_TYPE = "videoSrcType";
  public static final String EXTRA_VIEWER_NUM = "viewernum";
  public static final String ILVB_CLOSE_ACTION = "com.android.dazhihui.ilvbclose";
  public static final int INTEGERATE = 2;
  public static final String JSON_KEY_CODE = "code";
  public static final String JSON_KEY_DATA = "data";
  public static final String JSON_KEY_FORCE = "force";
  public static final String JSON_KEY_LOGIN_DATA = "logindata";
  public static final String JSON_KEY_USER_INFO = "userinfo";
  public static final String JSON_KEY_VERSION = "version";
  private static final String PACKAGE = "com.dazhihui.avsdk";
  public static final String REQUEST_SRC = "requestSrc";
  public static final int SHOW_RESULT_CODE = 10000;
  private static final String TAG = "Util";
  public static final int TRUSTEESHIP = 1;
  public static final int VIEW_RESULT_CODE = 30000;
  
  public static void closeILVBVideoScreen(Context paramContext)
  {
    paramContext.sendBroadcast(new Intent("com.android.dazhihui.ilvbclose"));
  }
  
  public static int getLevelBackgroundColor(int paramInt)
  {
    if (paramInt <= 99) {}
    do
    {
      return -432818954;
      if (paramInt == 100) {
        return -9208321;
      }
      if (paramInt == 101) {
        return -164804;
      }
    } while (paramInt < 102);
    return -283598;
  }
  
  public static int getLevelImageResource(int paramInt)
  {
    if (paramInt <= 99) {}
    do
    {
      return 2130838205;
      if (paramInt == 100) {
        return 2130838206;
      }
      if (paramInt == 101) {
        return 2130838204;
      }
    } while (paramInt < 102);
    return 2130838203;
  }
  
  public static int getLevelTextColor(int paramInt)
  {
    if (paramInt <= 99) {}
    do
    {
      return -1837570;
      if (paramInt == 100) {
        return -8945676;
      }
      if (paramInt == 101) {
        return -814238;
      }
    } while (paramInt < 102);
    return 52013;
  }
  
  public static int getNetWorkType(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    Object localObject = paramContext.getActiveNetworkInfo();
    if ((localObject != null) && (((NetworkInfo)localObject).isConnected()))
    {
      localObject = ((NetworkInfo)localObject).getTypeName();
      if (((String)localObject).equalsIgnoreCase("WIFI")) {
        return 2;
      }
      if (((String)localObject).equalsIgnoreCase("MOBILE"))
      {
        paramContext = paramContext.getNetworkInfo(0);
        if (paramContext == null) {}
      }
    }
    switch (paramContext.getType())
    {
    default: 
      return 0;
    }
    switch (paramContext.getSubtype())
    {
    default: 
      return 0;
    case 3: 
    case 5: 
    case 6: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 14: 
    case 15: 
      return 3;
    case 1: 
    case 2: 
    case 4: 
    case 7: 
    case 11: 
      return 4;
    }
    return 5;
  }
  
  public static boolean isNetworkAvailable(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext != null)
    {
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnected()) && (paramContext.getState() == NetworkInfo.State.CONNECTED)) {
        return true;
      }
    }
    return false;
  }
  
  public static AlertDialog newErrorDialog(Context paramContext, int paramInt)
  {
    return new AlertDialog.Builder(paramContext).setTitle(paramInt).setMessage(2131165451).setPositiveButton(17039370, new Util.1()).create();
  }
  
  public static ProgressDialog newProgressDialog(Context paramContext, int paramInt)
  {
    paramContext = new ProgressDialog(paramContext);
    paramContext.setTitle(paramInt);
    paramContext.setIndeterminate(true);
    paramContext.setCancelable(false);
    return paramContext;
  }
  
  public static void switchWaitingDialog(Context paramContext, ProgressDialog paramProgressDialog, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      if (((paramProgressDialog == null) || (!paramProgressDialog.isShowing())) && ((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing() != true)) {}
    }
    while ((paramProgressDialog == null) || (!paramProgressDialog.isShowing()))
    {
      return;
      ((Activity)paramContext).showDialog(paramInt);
      return;
    }
    paramProgressDialog.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */