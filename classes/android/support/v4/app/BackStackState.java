package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new q();
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList<String> j;
  final ArrayList<String> k;
  
  public BackStackState(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }
  
  public BackStackState(k paramk)
  {
    o localo = paramk.c;
    int n;
    for (int m = 0; localo != null; m = n)
    {
      n = m;
      if (localo.i != null) {
        n = m + localo.i.size();
      }
      localo = localo.a;
    }
    this.a = new int[m + paramk.e * 7];
    if (!paramk.l) {
      throw new IllegalStateException("Not on back stack");
    }
    localo = paramk.c;
    m = 0;
    if (localo != null)
    {
      int[] arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = localo.c;
      arrayOfInt = this.a;
      int i1 = n + 1;
      if (localo.d != null) {}
      for (m = localo.d.mIndex;; m = -1)
      {
        arrayOfInt[n] = m;
        arrayOfInt = this.a;
        m = i1 + 1;
        arrayOfInt[i1] = localo.e;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localo.f;
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = localo.g;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localo.h;
        if (localo.i == null) {
          break label318;
        }
        i1 = localo.i.size();
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = i1;
        n = 0;
        while (n < i1)
        {
          this.a[m] = ((Fragment)localo.i.get(n)).mIndex;
          n += 1;
          m += 1;
        }
      }
      for (;;)
      {
        localo = localo.a;
        break;
        label318:
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = 0;
      }
    }
    this.b = paramk.j;
    this.c = paramk.k;
    this.d = paramk.n;
    this.e = paramk.p;
    this.f = paramk.q;
    this.g = paramk.r;
    this.h = paramk.s;
    this.i = paramk.t;
    this.j = paramk.u;
    this.k = paramk.v;
  }
  
  public k a(af paramaf)
  {
    k localk = new k(paramaf);
    int i1 = 0;
    int m = 0;
    while (m < this.a.length)
    {
      o localo = new o();
      Object localObject = this.a;
      int n = m + 1;
      localo.c = localObject[m];
      if (af.a) {
        Log.v("FragmentManager", "Instantiate " + localk + " op #" + i1 + " base fragment #" + this.a[n]);
      }
      localObject = this.a;
      m = n + 1;
      n = localObject[n];
      if (n >= 0) {}
      for (localo.d = ((Fragment)paramaf.f.get(n));; localo.d = null)
      {
        localObject = this.a;
        n = m + 1;
        localo.e = localObject[m];
        localObject = this.a;
        m = n + 1;
        localo.f = localObject[n];
        localObject = this.a;
        n = m + 1;
        localo.g = localObject[m];
        localObject = this.a;
        m = n + 1;
        localo.h = localObject[n];
        localObject = this.a;
        n = m + 1;
        int i3 = localObject[m];
        m = n;
        if (i3 <= 0) {
          break;
        }
        localo.i = new ArrayList(i3);
        int i2 = 0;
        for (;;)
        {
          m = n;
          if (i2 >= i3) {
            break;
          }
          if (af.a) {
            Log.v("FragmentManager", "Instantiate " + localk + " set remove fragment #" + this.a[n]);
          }
          localObject = (Fragment)paramaf.f.get(this.a[n]);
          localo.i.add(localObject);
          i2 += 1;
          n += 1;
        }
      }
      localk.a(localo);
      i1 += 1;
    }
    localk.j = this.b;
    localk.k = this.c;
    localk.n = this.d;
    localk.p = this.e;
    localk.l = true;
    localk.q = this.f;
    localk.r = this.g;
    localk.s = this.h;
    localk.t = this.i;
    localk.u = this.j;
    localk.v = this.k;
    localk.a(1);
    return localk;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\BackStackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */