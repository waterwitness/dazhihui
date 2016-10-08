package com.thinkive.mobile.video.activities;

import an;
import android.content.Intent;
import com.thinkive.android.widget.OpenPhotoView;
import com.thinkive.mobile.account.entity.IntentTransformer;

final class ApplyWitnessVideoActivity$5
  implements Runnable
{
  ApplyWitnessVideoActivity$5(ApplyWitnessVideoActivity paramApplyWitnessVideoActivity) {}
  
  public final void run()
  {
    Intent localIntent = new Intent(this.a, TwoWayVideoActivity.class);
    ApplyWitnessVideoActivity.b(this.a).setSeatId(ApplyWitnessVideoActivity.c(this.a));
    ApplyWitnessVideoActivity.b(this.a).setCustomId(ApplyWitnessVideoActivity.d(this.a));
    localIntent.putExtra(an.a, ApplyWitnessVideoActivity.b(this.a));
    this.a.startActivity(localIntent);
    ApplyWitnessVideoActivity.e(this.a).a();
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyWitnessVideoActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */