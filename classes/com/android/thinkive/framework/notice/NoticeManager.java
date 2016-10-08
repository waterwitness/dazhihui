package com.android.thinkive.framework.notice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.storage.DatabaseStorage;
import com.android.thinkive.framework.util.CommonUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.NetWorkUtil;
import java.util.HashMap;
import org.json.JSONObject;

public class NoticeManager
{
  public static final String NOTICE_DISMISS_ACTION = "com.thinkive.notice.dismiss.action";
  private static NoticeManager sInstance;
  private Context mContext;
  private NoticeDialog mNoticeDialog;
  private ResponseListener<JSONObject> mNoticeExposeListener;
  private ResponseListener<JSONObject> mNoticeInfoListener = new NoticeManager.1(this);
  private DatabaseStorage mStorage;
  
  private NoticeManager(Context paramContext)
  {
    this.mContext = paramContext;
    this.mStorage = new DatabaseStorage(this.mContext);
  }
  
  public static NoticeManager getInstance(Context paramContext)
  {
    if (sInstance == null) {
      sInstance = new NoticeManager(paramContext);
    }
    return sInstance;
  }
  
  private void sendBroadCast()
  {
    Intent localIntent = new Intent("com.thinkive.notice.dismiss.action");
    this.mContext.sendBroadcast(localIntent);
  }
  
  private void showNoticeInfoDialog(NoticeInfoBean.NoticeBean paramNoticeBean)
  {
    if ((this.mNoticeDialog != null) && (this.mNoticeDialog.isShowing())) {
      this.mNoticeDialog.dismiss();
    }
    Object localObject = CommonUtil.getTopActivity(this.mContext);
    localObject = ThinkiveInitializer.getInstance().getActivity((String)localObject);
    if (localObject != null) {
      this.mNoticeDialog = new NoticeDialog((Context)localObject, paramNoticeBean);
    }
    for (;;)
    {
      this.mNoticeDialog.setContent(paramNoticeBean.getContent());
      this.mNoticeDialog.setTitle(paramNoticeBean.getTitle());
      this.mNoticeDialog.show();
      return;
      if ((this.mContext instanceof Activity))
      {
        this.mNoticeDialog = new NoticeDialog(this.mContext, paramNoticeBean);
      }
      else
      {
        this.mNoticeDialog = new NoticeDialog(this.mContext, paramNoticeBean);
        this.mNoticeDialog.getWindow().setType(2003);
      }
    }
  }
  
  public void checkNoticeInfo(String paramString)
  {
    if (NetWorkUtil.isNetworkConnected(this.mContext))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("funcNo", "901911");
      localHashMap.put("notice_type", "system");
      HttpService.getInstance().jsonRequest(paramString, localHashMap, this.mNoticeInfoListener);
      return;
    }
    Log.d("net work  unavailable!!!,stop check Notice info!!!");
  }
  
  public void setNoticeExposeListener(ResponseListener<JSONObject> paramResponseListener)
  {
    this.mNoticeExposeListener = paramResponseListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */