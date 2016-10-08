package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.TIMValueCallBack;
import java.util.Iterator;
import java.util.List;

class AVRoomControl$7
  implements TIMValueCallBack<List<String>>
{
  AVRoomControl$7(AVRoomControl paramAVRoomControl) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.e("ilvb", "AVRoomControl stop record error " + paramInt + " : " + paramString);
  }
  
  public void onSuccess(List<String> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AVRoomControl stop record success \n");
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        localStringBuilder.append(str + "\n");
      }
      Log.i("ilvb", localStringBuilder.toString());
      return;
    }
    Log.e("ilvb", "AVRoomControl stop record Null file");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */