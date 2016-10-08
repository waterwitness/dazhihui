package com.thinkive.mobile.video.activities;

import android.widget.Toast;
import com.android.thinkive.framework.network.ResponseListener;
import org.json.JSONObject;

final class ApplyWitnessVideoActivity$4
  implements ResponseListener<JSONObject>
{
  ApplyWitnessVideoActivity$4(ApplyWitnessVideoActivity paramApplyWitnessVideoActivity) {}
  
  public final void onErrorResponse(Exception paramException)
  {
    Toast.makeText(this.a, "网络异常了，请检查网络后重试！", 0).show();
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyWitnessVideoActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */