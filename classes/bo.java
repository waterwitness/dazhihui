import android.content.Context;
import android.content.Intent;
import com.thinkive.mobile.account.activitys.IdentityPhotoActivity;
import com.thinkive.mobile.account.entity.IntentTransformer;

final class bo
  implements Runnable
{
  bo(bn parambn, Context paramContext, IntentTransformer paramIntentTransformer) {}
  
  public final void run()
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this.a, IdentityPhotoActivity.class);
    localIntent.putExtra(an.a, this.b);
    this.a.startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */