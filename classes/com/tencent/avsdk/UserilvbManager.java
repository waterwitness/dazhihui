package com.tencent.avsdk;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.u;
import com.android.dazhihui.d.a.a;
import com.android.dazhihui.w;
import com.tencent.avsdk.control.AVRoomControl;
import com.tencent.avsdk.control.AVRoomControl.RoomState;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

public class UserilvbManager
  implements i
{
  public static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  private static final long MIN_NIOREQUEST_TIME = 500L;
  private static final long MIN_TOKEN_TIME = 3600000L;
  private static final String TAG = "ilvb";
  private static UserilvbManager s_Instance = null;
  com.android.dazhihui.b iLoginListener = new UserilvbManager.1(this);
  public boolean isNoSpeak = false;
  public volatile boolean mAccountChangeInSoundMode = false;
  public volatile boolean mAvPrepareNormal = true;
  private String mFormatTokenTime = "";
  private boolean mFromDZHAccount = false;
  private IlvbDataBase mIlvbDataBase = IlvbDataBase.getInstance();
  u mMarketDispatchListener = new UserilvbManager.2(this);
  private m mNioRequest;
  private long mNioRequestTime = 0L;
  private List<UserilvbManager.OnAccountChangeListener> mOnAccountChangeListeners;
  private List<UserilvbManager.OnIlvbSoundModeListener> mOnIlvbSoundModeListeners;
  private UserilvbManager.RoomInfo mRoomInfo;
  private String mToken = "";
  private long mTokenTime;
  private String mUserName = "";
  private String mUserNickName = "";
  private WindowManager.LayoutParams mWindowParams = new WindowManager.LayoutParams();
  public int noSpeakSurplus;
  public long noSpeakTime;
  
  private UserilvbManager()
  {
    requestToken();
    w.a().a(this.iLoginListener);
    com.android.dazhihui.a.g.a().a(this.mMarketDispatchListener);
  }
  
  public static UserilvbManager getInstance()
  {
    if (s_Instance == null) {}
    try
    {
      if (s_Instance == null) {
        s_Instance = new UserilvbManager();
      }
      return s_Instance;
    }
    finally {}
  }
  
  public void addIlvbSoundModeListener(UserilvbManager.OnIlvbSoundModeListener paramOnIlvbSoundModeListener)
  {
    if (this.mOnIlvbSoundModeListeners == null) {
      this.mOnIlvbSoundModeListeners = new ArrayList();
    }
    this.mOnIlvbSoundModeListeners.add(paramOnIlvbSoundModeListener);
  }
  
  public void addOnAccountChangeListener(UserilvbManager.OnAccountChangeListener paramOnAccountChangeListener)
  {
    if (this.mOnAccountChangeListeners == null) {
      this.mOnAccountChangeListeners = new ArrayList();
    }
    this.mOnAccountChangeListeners.add(paramOnAccountChangeListener);
  }
  
  public void clearIlvbAccount()
  {
    this.mFromDZHAccount = false;
    this.mUserName = "";
    this.mUserNickName = "";
    this.mToken = "";
    this.mTokenTime = 0L;
    this.mFormatTokenTime = "";
    this.mIlvbDataBase.putString("ilvb_user_name", "");
    this.mIlvbDataBase.putString("ilvb_user_token", "");
    this.mIlvbDataBase.putLong("ilvb_token_expire", 0L);
    Log.d("ilvb", "UserilvbManager clearIlvbAccount");
  }
  
  public void clearIlvbOnlySound()
  {
    if (this.mRoomInfo != null) {
      this.mRoomInfo = null;
    }
    if (this.mOnIlvbSoundModeListeners != null)
    {
      int j = this.mOnIlvbSoundModeListeners.size();
      int i = 0;
      while (i < j)
      {
        UserilvbManager.OnIlvbSoundModeListener localOnIlvbSoundModeListener = (UserilvbManager.OnIlvbSoundModeListener)this.mOnIlvbSoundModeListeners.get(i);
        if (localOnIlvbSoundModeListener != null) {
          localOnIlvbSoundModeListener.onIlvbSoundModeChange();
        }
        i += 1;
      }
    }
    this.mAccountChangeInSoundMode = false;
  }
  
  public long getExpire()
  {
    return this.mTokenTime;
  }
  
  public String getNickName()
  {
    return this.mUserNickName;
  }
  
  public UserilvbManager.RoomInfo getSavedRoomInfo()
  {
    return this.mRoomInfo;
  }
  
  public String getToken()
  {
    if (TextUtils.isEmpty(this.mToken)) {
      requestToken();
    }
    return this.mToken;
  }
  
  public String getUserName()
  {
    if (TextUtils.isEmpty(this.mUserName)) {
      requestToken();
    }
    return this.mUserName;
  }
  
  public WindowManager.LayoutParams getWindowManagerLayoutParams()
  {
    return this.mWindowParams;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramh != null) && (paramh == this.mNioRequest) && (paramj != null) && ((paramj instanceof o))) {}
    for (;;)
    {
      int i;
      try
      {
        Log.d("ilvb", "UserilvbManager requestToken handleResponse START");
        paramh = ((o)paramj).h();
        if (paramh == null) {
          break;
        }
        Log.d("ilvb", "UserilvbManager requestToken handleResponse data.protocolType=" + paramh.a);
        if (paramh.a != 2972) {
          break;
        }
        paramh = new q(paramh.b);
        i = paramh.b();
        int j = paramh.e();
        paramh.e();
        paramh.e();
        Log.d("ilvb", "UserilvbManager requestToken handleResponse sign=" + i + " sub type=" + j);
        if (j != 168) {
          break;
        }
        paramh = paramh.l();
        if (com.android.dazhihui.g.a().L()) {
          Log.d("ilvb", "UserilvbManager PROTOCOL_2972_168 res=" + paramh);
        }
        Object localObject = new JSONObject(paramh);
        i = ((JSONObject)localObject).optInt("result", 3);
        if (i == 0)
        {
          paramh = ((JSONObject)localObject).optString("sig", "");
          long l = ((JSONObject)localObject).optLong("expire", 0L);
          paramj = ((JSONObject)localObject).optString("identifier", "");
          String str = ((JSONObject)localObject).optString("appid", "0");
          i = ((JSONObject)localObject).optInt("acc_type", 0);
          if (com.android.dazhihui.g.a().L()) {
            Log.d("ilvb", "UserilvbManager PROTOCOL_2972_168 identifier=" + paramj + " expire=" + l + " token=" + paramh + " appid=" + str + " acc_type=" + i);
          }
          j = Integer.valueOf(str).intValue();
          localObject = this.mUserName;
          setIlvbAccount(paramj, paramh, 1000L * l, j, String.valueOf(i));
          if ((this.mOnAccountChangeListeners == null) || (TextUtils.isEmpty(paramj)) || (paramj.equals(localObject))) {
            break;
          }
          j = this.mOnAccountChangeListeners.size();
          i = 0;
          if (i >= j) {
            break;
          }
          paramh = (UserilvbManager.OnAccountChangeListener)this.mOnAccountChangeListeners.get(i);
          if (paramh == null) {
            break label588;
          }
          paramh.onAccountChange();
          break label588;
        }
        if (i == 1)
        {
          Log.d("ilvb", "UserilvbManager PROTOCOL_2972_168 用户名或密码错误");
          return;
        }
        paramh = ((JSONObject)localObject).optString("msg", "");
        Log.d("ilvb", "UserilvbManager PROTOCOL_2972_168 其他错误:" + paramh);
        return;
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        Log.e("ilvb", "UserilvbManager JSONException " + paramh.toString());
        return;
      }
      Log.d("ilvb", "UserilvbManager requestToken handleResponse Error request=" + paramh + " mNioRequest=" + this.mNioRequest);
      return;
      label588:
      i += 1;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    Log.e("ilvb", "UserilvbManager requestToken handleTimeout");
  }
  
  public boolean isFromDZHAccount()
  {
    return this.mFromDZHAccount;
  }
  
  public void netException(h paramh, Exception paramException)
  {
    Log.e("ilvb", "UserilvbManager requestToken netException");
  }
  
  public void onExitApp()
  {
    this.mRoomInfo = null;
    this.mAccountChangeInSoundMode = false;
    if (this.mOnIlvbSoundModeListeners != null) {
      this.mOnIlvbSoundModeListeners.clear();
    }
    if (this.mOnAccountChangeListeners != null) {
      this.mOnAccountChangeListeners.clear();
    }
    if (AVRoomControl.getInstance().getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK) {
      AVRoomControl.getInstance().exitRoom();
    }
    AVRoomControl.getInstance().destroy();
    Log.d("ilvb", "UserilvbManager onExitApp");
  }
  
  public void removeIlvbSoundModeListener(UserilvbManager.OnIlvbSoundModeListener paramOnIlvbSoundModeListener)
  {
    if (this.mOnIlvbSoundModeListeners != null) {
      this.mOnIlvbSoundModeListeners.remove(paramOnIlvbSoundModeListener);
    }
  }
  
  public void removeOnAccountChangeListener(UserilvbManager.OnAccountChangeListener paramOnAccountChangeListener)
  {
    if (this.mOnAccountChangeListeners != null) {
      this.mOnAccountChangeListeners.remove(paramOnAccountChangeListener);
    }
  }
  
  public void requestToken()
  {
    if ((this.mNioRequest != null) && (this.mNioRequestTime + 500L > System.currentTimeMillis()))
    {
      Log.d("ilvb", "UserilvbManager requestToken  NioRequest cancel 避免重复发送太频繁");
      return;
    }
    String str3 = this.mIlvbDataBase.getString("ilvb_user_name", "");
    Object localObject2 = this.mIlvbDataBase.getString("ilvb_user_token", "");
    long l1 = this.mIlvbDataBase.getLong("ilvb_token_expire", 0L);
    boolean bool = this.mIlvbDataBase.getBoolean("ilvb_user_is_visitor", false);
    int i = this.mIlvbDataBase.getInt("ilvb_account_appid", 0);
    Object localObject3 = this.mIlvbDataBase.getString("ilvb_account_type", "");
    String str2 = w.a().f();
    String str1 = Base64.encodeToString(w.a().j(), 0);
    Object localObject1 = com.android.dazhihui.g.a().u();
    if (com.android.dazhihui.g.a().L())
    {
      Log.d("ilvb", "UserilvbManager requestToken START name=" + str2 + " password=" + str1 + " qudao_id=" + (String)localObject1);
      Log.d("ilvb", "UserilvbManager requestToken DATABASE  mTokenTime=" + l1 + "=" + FORMAT.format(new Date(l1)) + " appid=" + i + " accType=" + (String)localObject3 + " name=" + str3 + " mToken=" + (String)localObject2);
    }
    long l2;
    if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!TextUtils.isEmpty(str3)) && (!TextUtils.isEmpty((CharSequence)localObject3)) && (i != 0))
    {
      l2 = System.currentTimeMillis();
      if (l1 < 3600000L + l2) {
        break label723;
      }
      if (!str3.equals(str2)) {
        break label625;
      }
      if (!TextUtils.isEmpty(str1))
      {
        if (w.a().l())
        {
          Log.d("ilvb", "UserilvbManager requestToken 大智慧账号token有效期还够 直接使用");
          this.mFromDZHAccount = true;
          setIlvbAccount(str3, (String)localObject2, l1, i, (String)localObject3);
          return;
        }
        Log.e("ilvb", "UserilvbManager requestToken 大智慧账号和密码都存在,但是外面没有登录,这时候获取一个游客token进入热播");
      }
    }
    else
    {
      clearIlvbAccount();
      localObject2 = new x(2972);
      ((x)localObject2).c("互动直播 PROTOCOL_2972_168");
      ((x)localObject2).b(2);
      localObject3 = new x(168);
      ((x)localObject3).c("互动直播 PROTOCOL_2972_168");
      if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str1)) || (!w.a().l())) {
        break label790;
      }
      localObject1 = "";
    }
    for (this.mFromDZHAccount = true;; this.mFromDZHAccount = false)
    {
      localObject1 = "{\"uname\":\"" + str2 + "\",\"password\":\"" + str1 + "\",\"qudao_id\":\"" + (String)localObject1 + "\"}";
      ((x)localObject3).a((String)localObject1);
      ((x)localObject2).a((x)localObject3);
      this.mNioRequest = new m((x)localObject2, n.a);
      this.mNioRequest.a("互动直播 发送PROTOCOL_2972");
      this.mNioRequest.a(this);
      com.android.dazhihui.a.g.a().a(this.mNioRequest);
      this.mNioRequestTime = System.currentTimeMillis();
      Log.d("ilvb", "UserilvbManager requestToken para=" + (String)localObject1);
      return;
      Log.d("ilvb", "UserilvbManager requestToken 清除账号时候，会只清除密码,这时候重新获取一个游客token");
      break;
      label625:
      if (bool) {
        break;
      }
      if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str1)))
      {
        Log.d("ilvb", "UserilvbManager requestToken 游客账号token有效期还够 直接使用");
        this.mFromDZHAccount = false;
        setIlvbAccount(str3, (String)localObject2, l1, i, (String)localObject3);
        return;
      }
      if (w.a().l())
      {
        Log.e("ilvb", "UserilvbManager requestToken 从游客切换到大智慧账号 重新取");
        break;
      }
      Log.e("ilvb", "UserilvbManager requestToken 大智慧账号和密码都存在,但是外面没有登录,使用原来的游客");
      this.mFromDZHAccount = false;
      setIlvbAccount(str3, (String)localObject2, l1, i, (String)localObject3);
      return;
      label723:
      Log.d("ilvb", "UserilvbManager requestToken token有效期不够了 mTokenTime=" + FORMAT.format(new Date(l1)) + " currentTime" + FORMAT.format(new Date(l2)));
      break;
      label790:
      str2 = "";
      str1 = "";
      str3 = a.a((String)localObject1);
      localObject1 = str3;
      if (!TextUtils.isEmpty(str3))
      {
        localObject1 = com.android.dazhihui.g.a().k().a(str3.getBytes());
        if (localObject1 == null) {
          break label882;
        }
      }
      label882:
      for (localObject1 = Base64.encodeToString((byte[])localObject1, 0); TextUtils.isEmpty((CharSequence)localObject1); localObject1 = "")
      {
        Log.e("ilvb", "UserilvbManager requestToken cancel by qudao_id加密后为空");
        localObject1 = w.a().s();
        ((m)localObject1).a(new UserilvbManager.3(this, this));
        com.android.dazhihui.a.g.a().a((h)localObject1);
        return;
      }
    }
  }
  
  public void setIlvbAccount(String paramString1, String paramString2, long paramLong, int paramInt, String paramString3)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)) && (paramLong > 0L))
    {
      if ((this.mRoomInfo != null) && (!paramString1.equals(this.mUserName))) {
        this.mAccountChangeInSoundMode = true;
      }
      this.mUserName = paramString1;
      if (this.mFromDZHAccount) {
        this.mUserNickName = w.a().g();
      }
      if (TextUtils.isEmpty(this.mUserNickName)) {
        this.mUserNickName = this.mUserName;
      }
      DemoConstants.APPID = paramInt;
      DemoConstants.ACCOUNTTYPE = paramString3;
      this.mToken = paramString2;
      this.mTokenTime = paramLong;
      this.mFormatTokenTime = FORMAT.format(new Date(this.mTokenTime));
      this.mIlvbDataBase.putString("ilvb_user_name", paramString1);
      this.mIlvbDataBase.putString("ilvb_user_token", paramString2);
      this.mIlvbDataBase.putLong("ilvb_token_expire", paramLong);
      this.mIlvbDataBase.putBoolean("ilvb_user_is_visitor", this.mFromDZHAccount);
      this.mIlvbDataBase.putInt("ilvb_account_appid", paramInt);
      this.mIlvbDataBase.putString("ilvb_account_type", paramString3);
      if (com.android.dazhihui.g.a().L()) {
        Log.d("ilvb", "UserilvbManager setIlvbAccount Success  Expire=" + paramLong + "=" + this.mFormatTokenTime + " userName=" + paramString1 + " mUserNickName=" + this.mUserNickName + " mFromDZHAccount=" + this.mFromDZHAccount + " token=" + paramString2);
      }
      return;
    }
    Log.d("ilvb", "UserilvbManager setIlvbAccount Error  Expire=" + paramLong + "=" + this.mFormatTokenTime + " userName=" + paramString1 + " mUserNickName=" + this.mUserNickName + " Expire=" + paramLong + "=" + this.mFormatTokenTime + " mFromDZHAccount=" + this.mFromDZHAccount + " token=" + paramString2);
  }
  
  public void setIlvbSoundMode(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    if (this.mRoomInfo == null) {
      this.mRoomInfo = new UserilvbManager.RoomInfo();
    }
    if (com.android.dazhihui.g.a().L()) {
      Log.d("ilvb", "UserilvbManager setIlvbSoundMode mRoomID=" + paramInt1 + " mHostIdentifier=" + paramString1 + " mRoomImage=" + paramString2 + " mGroupId=" + paramString3 + " mRoomShareUrl=" + paramString4 + " mRoomPV=" + paramInt2);
    }
    this.mRoomInfo.mRoomID = paramInt1;
    this.mRoomInfo.mHostIdentifier = paramString1;
    this.mRoomInfo.mRoomImage = paramString2;
    this.mRoomInfo.mGroupId = paramString3;
    this.mRoomInfo.mRoomShareUrl = paramString4;
    this.mRoomInfo.mRoomPV = paramInt2;
    if (this.mOnIlvbSoundModeListeners != null)
    {
      paramInt2 = this.mOnIlvbSoundModeListeners.size();
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        paramString1 = (UserilvbManager.OnIlvbSoundModeListener)this.mOnIlvbSoundModeListeners.get(paramInt1);
        if (paramString1 != null) {
          paramString1.onIlvbSoundModeChange();
        }
        paramInt1 += 1;
      }
    }
  }
  
  public void showLoginDialog(Context paramContext)
  {
    Dialog localDialog = new Dialog(paramContext, 2131296301);
    localDialog.setContentView(2130903110);
    TextView localTextView = (TextView)localDialog.findViewById(2131558894);
    Button localButton1 = (Button)localDialog.findViewById(2131558895);
    Button localButton2 = (Button)localDialog.findViewById(2131558898);
    localTextView.setText("你还未登录,请先登录");
    localButton1.setText(17039370);
    localButton2.setText(17039360);
    localButton1.setOnClickListener(new UserilvbManager.4(this, paramContext, localDialog));
    localButton2.setOnClickListener(new UserilvbManager.5(this, localDialog));
    localDialog.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\UserilvbManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */