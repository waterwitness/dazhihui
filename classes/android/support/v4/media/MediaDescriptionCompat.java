package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new e();
  private final String a;
  private final CharSequence b;
  private final CharSequence c;
  private final CharSequence d;
  private final Bitmap e;
  private final Uri f;
  private final Bundle g;
  private final Uri h;
  private Object i;
  
  private MediaDescriptionCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.d = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.e = ((Bitmap)paramParcel.readParcelable(null));
    this.f = ((Uri)paramParcel.readParcelable(null));
    this.g = paramParcel.readBundle();
    this.h = ((Uri)paramParcel.readParcelable(null));
  }
  
  private MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.a = paramString;
    this.b = paramCharSequence1;
    this.c = paramCharSequence2;
    this.d = paramCharSequence3;
    this.e = paramBitmap;
    this.f = paramUri1;
    this.g = paramBundle;
    this.h = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    Object localObject = new f();
    ((f)localObject).a(g.a(paramObject));
    ((f)localObject).a(g.b(paramObject));
    ((f)localObject).b(g.c(paramObject));
    ((f)localObject).c(g.d(paramObject));
    ((f)localObject).a(g.e(paramObject));
    ((f)localObject).a(g.f(paramObject));
    ((f)localObject).a(g.g(paramObject));
    if (Build.VERSION.SDK_INT >= 23) {
      ((f)localObject).b(i.h(paramObject));
    }
    localObject = ((f)localObject).a();
    ((MediaDescriptionCompat)localObject).i = paramObject;
    return (MediaDescriptionCompat)localObject;
  }
  
  public Object a()
  {
    if ((this.i != null) || (Build.VERSION.SDK_INT < 21)) {
      return this.i;
    }
    Object localObject = h.a();
    h.a(localObject, this.a);
    h.a(localObject, this.b);
    h.b(localObject, this.c);
    h.c(localObject, this.d);
    h.a(localObject, this.e);
    h.a(localObject, this.f);
    h.a(localObject, this.g);
    if (Build.VERSION.SDK_INT >= 23) {
      j.b(localObject, this.h);
    }
    this.i = h.a(localObject);
    return this.i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return this.b + ", " + this.c + ", " + this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.a);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.c, paramParcel, paramInt);
      TextUtils.writeToParcel(this.d, paramParcel, paramInt);
      paramParcel.writeParcelable(this.e, paramInt);
      paramParcel.writeParcelable(this.f, paramInt);
      paramParcel.writeBundle(this.g);
      return;
    }
    g.a(a(), paramParcel, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */