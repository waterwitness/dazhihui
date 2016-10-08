package com.tencent.avsdkhost.control;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.text.TextUtils;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.n;
import com.android.dazhihui.o;

public class RoomControl
{
  private static final String TAG = "ilvb";
  public static RoomControl roomControl;
  public String mGroupId;
  public int mRoomId;
  String mToken = null;
  
  public static RoomControl getInstance()
  {
    if (roomControl == null) {
      roomControl = new RoomControl();
    }
    return roomControl;
  }
  
  public void createRoom(Activity paramActivity, String paramString, Runnable paramRunnable)
  {
    if (TextUtils.isEmpty(this.mToken)) {
      this.mToken = o.a().c();
    }
    StringBuilder localStringBuilder = new StringBuilder(com.android.dazhihui.a.f.ar);
    localStringBuilder.append("/ilvb/createex?");
    localStringBuilder.append("usertoken=" + paramString + "&token=" + this.mToken + "&type=1");
    n.d("ilvb", "createRoom=" + localStringBuilder.toString());
    paramString = new com.android.dazhihui.a.b.f();
    paramString.c(localStringBuilder.toString());
    paramString.a(new RoomControl.1(this, paramRunnable, paramActivity));
    g.a().a(paramString);
  }
  
  public void modifyRoom(String paramString1, String paramString2, String paramString3, String paramString4, RoomControl.CallBack paramCallBack)
  {
    if (TextUtils.isEmpty(this.mToken)) {
      this.mToken = o.a().c();
    }
    StringBuilder localStringBuilder = new StringBuilder(com.android.dazhihui.a.f.ar);
    localStringBuilder.append("/ilvb/modify?");
    localStringBuilder.append("usertoken=" + paramString1 + "&token=" + this.mToken + "&owneraccount=" + paramString2 + "&roomid=" + paramString3 + "&webvediourl=" + paramString4);
    n.d("ilvb", "modifyRoom=" + localStringBuilder.toString());
    paramString1 = new com.android.dazhihui.a.b.f();
    paramString1.c(localStringBuilder.toString());
    paramString1.a(new RoomControl.3(this, paramCallBack));
    g.a().a(paramString1);
  }
  
  public void showError(Activity paramActivity, String paramString)
  {
    if (paramActivity.isFinishing()) {
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setMessage(paramString);
    localBuilder.setTitle("提示");
    localBuilder.setCancelable(false);
    localBuilder.setNegativeButton("退出", new RoomControl.4(this, paramActivity));
    localBuilder.show();
  }
  
  public void stopRoom(String paramString, int paramInt, RoomControl.CallBack paramCallBack)
  {
    if (TextUtils.isEmpty(this.mToken)) {
      this.mToken = o.a().c();
    }
    StringBuilder localStringBuilder = new StringBuilder(com.android.dazhihui.a.f.ar);
    localStringBuilder.append("/ilvb/stop?");
    localStringBuilder.append("usertoken=" + paramString + "&token=" + this.mToken + "&roomid=" + paramInt);
    n.d("ilvb", "stopRoom=" + localStringBuilder.toString());
    paramString = new com.android.dazhihui.a.b.f();
    paramString.c(localStringBuilder.toString());
    paramString.a(new RoomControl.2(this, paramCallBack));
    g.a().a(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\RoomControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */