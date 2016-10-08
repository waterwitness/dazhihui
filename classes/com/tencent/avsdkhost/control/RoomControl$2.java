package com.tencent.avsdkhost.control;

import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.n;
import org.json.JSONObject;

class RoomControl$2
  implements i
{
  RoomControl$2(RoomControl paramRoomControl, RoomControl.CallBack paramCallBack) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      paramh = new String(((g)paramj).a());
      n.d("ilvb", "stopRoom=" + paramh);
      paramh = new JSONObject(paramh).optString("Err", "");
      if (paramh.equals("0"))
      {
        if (this.val$runnable != null) {
          this.val$runnable.onCallBack(true, "");
        }
      }
      else if (this.val$runnable != null)
      {
        this.val$runnable.onCallBack(false, paramh);
        return;
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      if (this.val$runnable != null) {
        this.val$runnable.onCallBack(false, paramh.getMessage());
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (this.val$runnable != null) {
      this.val$runnable.onCallBack(false, "超时");
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (this.val$runnable != null) {
      this.val$runnable.onCallBack(false, paramException.getMessage());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\RoomControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */