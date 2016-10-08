package com.tencent.avsdk.control;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.o;
import com.tencent.TIMValueCallBack;
import com.tencent.av.TIMAvManager.LiveUrl;
import com.tencent.av.TIMAvManager.StreamRes;
import com.tencent.avsdkhost.control.RoomControl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

class AVRoomControl$4
  implements TIMValueCallBack<TIMAvManager.StreamRes>
{
  AVRoomControl$4(AVRoomControl paramAVRoomControl, String paramString, int paramInt) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.e("ilvb", "AVRoomControl push start error " + paramInt + " : " + paramString);
    if (AVRoomControl.access$200(this.this$0) < 5)
    {
      AVRoomControl.access$208(this.this$0);
      if ((40000415 == paramInt) || (20101 == paramInt) || (20318 == paramInt) || (20406 == paramInt) || (1002 == paramInt)) {}
      do
      {
        do
        {
          return;
        } while ((6012 != paramInt) || (!this.this$0.isContextOk()));
        paramString = (Handler)AVRoomControl.access$100(this.this$0).get();
      } while (paramString == null);
      paramString.sendEmptyMessageDelayed(313, 30000L);
      return;
    }
    Log.e("ilvb", "AVRoomControl push start error 到达最大尝试次数");
  }
  
  public void onSuccess(TIMAvManager.StreamRes paramStreamRes)
  {
    Object localObject = paramStreamRes.getUrls();
    AVRoomControl.access$302(this.this$0, paramStreamRes.getChnlId());
    paramStreamRes = "";
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AVRoomControl push start success \n");
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        TIMAvManager.LiveUrl localLiveUrl = (TIMAvManager.LiveUrl)((Iterator)localObject).next();
        localStringBuilder.append(localLiveUrl.getUrl() + "\n");
        if (TextUtils.isEmpty(paramStreamRes)) {
          paramStreamRes = localLiveUrl.getUrl();
        }
      }
      Log.i("ilvb", localStringBuilder.toString());
      if (!TextUtils.isEmpty(paramStreamRes)) {
        RoomControl.getInstance().modifyRoom(o.a().b(), this.val$mHostIdentifier, String.valueOf(this.val$mRoomID), paramStreamRes, new AVRoomControl.4.1(this));
      }
    }
    Log.i("ilvb", "AVRoomControl push start OK");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */