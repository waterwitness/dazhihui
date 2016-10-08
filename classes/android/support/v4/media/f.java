package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public final class f
{
  private String a;
  private CharSequence b;
  private CharSequence c;
  private CharSequence d;
  private Bitmap e;
  private Uri f;
  private Bundle g;
  private Uri h;
  
  public MediaDescriptionCompat a()
  {
    return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
  }
  
  public f a(Bitmap paramBitmap)
  {
    this.e = paramBitmap;
    return this;
  }
  
  public f a(Uri paramUri)
  {
    this.f = paramUri;
    return this;
  }
  
  public f a(Bundle paramBundle)
  {
    this.g = paramBundle;
    return this;
  }
  
  public f a(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    return this;
  }
  
  public f a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public f b(Uri paramUri)
  {
    this.h = paramUri;
    return this;
  }
  
  public f b(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    return this;
  }
  
  public f c(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */