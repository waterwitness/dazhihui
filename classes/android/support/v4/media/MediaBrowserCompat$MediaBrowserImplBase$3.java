package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

class MediaBrowserCompat$MediaBrowserImplBase$3
  extends ResultReceiver
{
  protected void a(int paramInt, Bundle paramBundle)
  {
    if ((paramInt != 0) || (paramBundle == null) || (!paramBundle.containsKey("media_item")))
    {
      this.a.a(this.b);
      return;
    }
    paramBundle = paramBundle.getParcelable("media_item");
    if (!(paramBundle instanceof MediaBrowserCompat.MediaItem))
    {
      this.a.a(this.b);
      return;
    }
    this.a.a((MediaBrowserCompat.MediaItem)paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$MediaBrowserImplBase$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */