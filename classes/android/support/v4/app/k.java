package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.c.a;
import android.support.v4.c.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class k
  extends at
  implements Runnable
{
  static final boolean a;
  final af b;
  o c;
  o d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  boolean l;
  boolean m = true;
  String n;
  boolean o;
  int p = -1;
  int q;
  CharSequence r;
  int s;
  CharSequence t;
  ArrayList<String> u;
  ArrayList<String> v;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public k(af paramaf)
  {
    this.b = paramaf;
  }
  
  private p a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, boolean paramBoolean)
  {
    int i5 = 0;
    p localp = new p(this);
    localp.d = new View(this.b.o.i());
    int i2 = 0;
    int i1 = 0;
    int i3 = i5;
    int i4 = i1;
    if (i2 < paramSparseArray1.size())
    {
      if (!a(paramSparseArray1.keyAt(i2), localp, paramBoolean, paramSparseArray1, paramSparseArray2)) {
        break label164;
      }
      i1 = 1;
    }
    label164:
    for (;;)
    {
      i2 += 1;
      break;
      while (i3 < paramSparseArray2.size())
      {
        i2 = paramSparseArray2.keyAt(i3);
        i1 = i4;
        if (paramSparseArray1.get(i2) == null)
        {
          i1 = i4;
          if (a(i2, localp, paramBoolean, paramSparseArray1, paramSparseArray2)) {
            i1 = 1;
          }
        }
        i3 += 1;
        i4 = i1;
      }
      paramSparseArray1 = localp;
      if (i4 == 0) {
        paramSparseArray1 = null;
      }
      return paramSparseArray1;
    }
  }
  
  private a<String, View> a(p paramp, Fragment paramFragment, boolean paramBoolean)
  {
    a locala2 = new a();
    a locala1 = locala2;
    if (this.u != null)
    {
      au.a(locala2, paramFragment.getView());
      if (!paramBoolean) {
        break label82;
      }
      locala2.a(this.v);
    }
    label82:
    for (locala1 = locala2; paramBoolean; locala1 = a(this.u, this.v, locala2))
    {
      if (paramFragment.mEnterTransitionCallback != null) {
        paramFragment.mEnterTransitionCallback.a(this.v, locala1);
      }
      a(paramp, locala1, false);
      return locala1;
    }
    if (paramFragment.mExitTransitionCallback != null) {
      paramFragment.mExitTransitionCallback.a(this.v, locala1);
    }
    b(paramp, locala1, false);
    return locala1;
  }
  
  private a<String, View> a(p paramp, boolean paramBoolean, Fragment paramFragment)
  {
    a locala = b(paramp, paramFragment, paramBoolean);
    if (paramBoolean)
    {
      if (paramFragment.mExitTransitionCallback != null) {
        paramFragment.mExitTransitionCallback.a(this.v, locala);
      }
      a(paramp, locala, true);
      return locala;
    }
    if (paramFragment.mEnterTransitionCallback != null) {
      paramFragment.mEnterTransitionCallback.a(this.v, locala);
    }
    b(paramp, locala, true);
    return locala;
  }
  
  private static a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, a<String, View> parama)
  {
    if (parama.isEmpty()) {
      return parama;
    }
    a locala = new a();
    int i2 = paramArrayList1.size();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = (View)parama.get(paramArrayList1.get(i1));
      if (localView != null) {
        locala.put(paramArrayList2.get(i1), localView);
      }
      i1 += 1;
    }
    return locala;
  }
  
  private static Object a(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 == null) || (paramFragment2 == null)) {
      return null;
    }
    if (paramBoolean) {}
    for (paramFragment1 = paramFragment2.getSharedElementReturnTransition();; paramFragment1 = paramFragment1.getSharedElementEnterTransition()) {
      return au.b(paramFragment1);
    }
  }
  
  private static Object a(Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {}
    for (paramFragment = paramFragment.getReenterTransition();; paramFragment = paramFragment.getEnterTransition()) {
      return au.a(paramFragment);
    }
  }
  
  private static Object a(Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, a<String, View> parama, View paramView)
  {
    Object localObject = paramObject;
    if (paramObject != null) {
      localObject = au.a(paramObject, paramFragment.getView(), paramArrayList, parama, paramView);
    }
    return localObject;
  }
  
  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    paramFragment.mFragmentManager = this.b;
    if (paramString != null)
    {
      if ((paramFragment.mTag != null) && (!paramString.equals(paramFragment.mTag))) {
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.mTag + " now " + paramString);
      }
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramFragment.mFragmentId != 0) && (paramFragment.mFragmentId != paramInt1)) {
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.mFragmentId + " now " + paramInt1);
      }
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    paramString = new o();
    paramString.c = paramInt2;
    paramString.d = paramFragment;
    a(paramString);
  }
  
  private void a(p paramp, int paramInt, Object paramObject)
  {
    if (this.b.g != null)
    {
      int i1 = 0;
      if (i1 < this.b.g.size())
      {
        Fragment localFragment = (Fragment)this.b.g.get(i1);
        if ((localFragment.mView != null) && (localFragment.mContainer != null) && (localFragment.mContainerId == paramInt))
        {
          if (!localFragment.mHidden) {
            break label125;
          }
          if (!paramp.b.contains(localFragment.mView))
          {
            au.a(paramObject, localFragment.mView, true);
            paramp.b.add(localFragment.mView);
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          label125:
          au.a(paramObject, localFragment.mView, false);
          paramp.b.remove(localFragment.mView);
        }
      }
    }
  }
  
  private void a(p paramp, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, a<String, View> parama)
  {
    if (paramBoolean) {}
    for (paramp = paramFragment2.mEnterTransitionCallback;; paramp = paramFragment1.mEnterTransitionCallback)
    {
      if (paramp != null) {
        paramp.b(new ArrayList(parama.keySet()), new ArrayList(parama.values()), null);
      }
      return;
    }
  }
  
  private void a(p paramp, a<String, View> parama, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13:
    String str;
    Object localObject;
    if (this.v == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      str = (String)this.u.get(i2);
      localObject = (View)parama.get((String)this.v.get(i2));
      if (localObject != null)
      {
        localObject = au.a((View)localObject);
        if (!paramBoolean) {
          break label103;
        }
        a(paramp.a, str, (String)localObject);
      }
    }
    for (;;)
    {
      i2 += 1;
      break label13;
      i1 = this.v.size();
      break;
      label103:
      a(paramp.a, (String)localObject, str);
    }
  }
  
  private void a(p paramp, View paramView, Object paramObject, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList<View> paramArrayList)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new m(this, paramView, paramObject, paramArrayList, paramp, paramBoolean, paramFragment1, paramFragment2));
  }
  
  private static void a(p paramp, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if (paramArrayList1 != null)
    {
      int i1 = 0;
      while (i1 < paramArrayList1.size())
      {
        String str1 = (String)paramArrayList1.get(i1);
        String str2 = (String)paramArrayList2.get(i1);
        a(paramp.a, str1, str2);
        i1 += 1;
      }
    }
  }
  
  private void a(a<String, View> parama, p paramp)
  {
    if ((this.v != null) && (!parama.isEmpty()))
    {
      parama = (View)parama.get(this.v.get(0));
      if (parama != null) {
        paramp.c.a = parama;
      }
    }
  }
  
  private static void a(a<String, String> parama, String paramString1, String paramString2)
  {
    int i1;
    if ((paramString1 != null) && (paramString2 != null)) {
      i1 = 0;
    }
    while (i1 < parama.size())
    {
      if (paramString1.equals(parama.c(i1)))
      {
        parama.a(i1, paramString2);
        return;
      }
      i1 += 1;
    }
    parama.put(paramString1, paramString2);
  }
  
  private static void a(SparseArray<Fragment> paramSparseArray, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.mContainerId;
      if ((i1 != 0) && (!paramFragment.isHidden()) && (paramFragment.isAdded()) && (paramFragment.getView() != null) && (paramSparseArray.get(i1) == null)) {
        paramSparseArray.put(i1, paramFragment);
      }
    }
  }
  
  private void a(View paramView, p paramp, int paramInt, Object paramObject)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new n(this, paramView, paramp, paramInt, paramObject));
  }
  
  private boolean a(int paramInt, p paramp, boolean paramBoolean, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.b.p.a(paramInt);
    if (localViewGroup == null) {
      return false;
    }
    Object localObject2 = (Fragment)paramSparseArray2.get(paramInt);
    Object localObject4 = (Fragment)paramSparseArray1.get(paramInt);
    Object localObject3 = a((Fragment)localObject2, paramBoolean);
    paramSparseArray2 = a((Fragment)localObject2, (Fragment)localObject4, paramBoolean);
    Object localObject5 = b((Fragment)localObject4, paramBoolean);
    paramSparseArray1 = null;
    ArrayList localArrayList1 = new ArrayList();
    if (paramSparseArray2 != null)
    {
      localObject1 = a(paramp, (Fragment)localObject4, paramBoolean);
      if (((a)localObject1).isEmpty())
      {
        paramSparseArray1 = null;
        paramSparseArray2 = null;
        if ((localObject3 != null) || (paramSparseArray2 != null) || (localObject5 != null)) {
          break label208;
        }
        return false;
      }
      if (!paramBoolean) {
        break label198;
      }
    }
    label198:
    for (paramSparseArray1 = ((Fragment)localObject4).mEnterTransitionCallback;; paramSparseArray1 = ((Fragment)localObject2).mEnterTransitionCallback)
    {
      if (paramSparseArray1 != null) {
        paramSparseArray1.a(new ArrayList(((a)localObject1).keySet()), new ArrayList(((a)localObject1).values()), null);
      }
      a(paramp, localViewGroup, paramSparseArray2, (Fragment)localObject2, (Fragment)localObject4, paramBoolean, localArrayList1);
      paramSparseArray1 = (SparseArray<Fragment>)localObject1;
      break;
    }
    label208:
    Object localObject1 = new ArrayList();
    localObject4 = a(localObject5, (Fragment)localObject4, (ArrayList)localObject1, paramSparseArray1, paramp.d);
    if ((this.v != null) && (paramSparseArray1 != null))
    {
      localObject5 = (View)paramSparseArray1.get(this.v.get(0));
      if (localObject5 != null)
      {
        if (localObject4 != null) {
          au.a(localObject4, (View)localObject5);
        }
        if (paramSparseArray2 != null) {
          au.a(paramSparseArray2, (View)localObject5);
        }
      }
    }
    localObject5 = new l(this, (Fragment)localObject2);
    ArrayList localArrayList2 = new ArrayList();
    a locala = new a();
    boolean bool = true;
    if (localObject2 != null) {
      if (!paramBoolean) {
        break label462;
      }
    }
    label462:
    for (bool = ((Fragment)localObject2).getAllowReturnTransitionOverlap();; bool = ((Fragment)localObject2).getAllowEnterTransitionOverlap())
    {
      localObject2 = au.a(localObject3, localObject4, paramSparseArray2, bool);
      if (localObject2 != null)
      {
        au.a(localObject3, paramSparseArray2, localViewGroup, (ba)localObject5, paramp.d, paramp.c, paramp.a, localArrayList2, paramSparseArray1, locala, localArrayList1);
        a(localViewGroup, paramp, paramInt, localObject2);
        au.a(localObject2, paramp.d, true);
        a(paramp, paramInt, localObject2);
        au.a(localViewGroup, localObject2);
        au.a(localViewGroup, paramp.d, localObject3, localArrayList2, localObject4, (ArrayList)localObject1, paramSparseArray2, localArrayList1, localObject2, paramp.b, locala);
      }
      if (localObject2 == null) {
        break;
      }
      return true;
    }
    return false;
  }
  
  private a<String, View> b(p paramp, Fragment paramFragment, boolean paramBoolean)
  {
    a locala = new a();
    paramFragment = paramFragment.getView();
    paramp = locala;
    if (paramFragment != null)
    {
      paramp = locala;
      if (this.u != null)
      {
        au.a(locala, paramFragment);
        if (!paramBoolean) {
          break label57;
        }
        paramp = a(this.u, this.v, locala);
      }
    }
    return paramp;
    label57:
    locala.a(this.v);
    return locala;
  }
  
  private static Object b(Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {}
    for (paramFragment = paramFragment.getReturnTransition();; paramFragment = paramFragment.getExitTransition()) {
      return au.a(paramFragment);
    }
  }
  
  private void b(p paramp, a<String, View> parama, boolean paramBoolean)
  {
    int i2 = parama.size();
    int i1 = 0;
    if (i1 < i2)
    {
      String str1 = (String)parama.b(i1);
      String str2 = au.a((View)parama.c(i1));
      if (paramBoolean) {
        a(paramp.a, str1, str2);
      }
      for (;;)
      {
        i1 += 1;
        break;
        a(paramp.a, str2, str1);
      }
    }
  }
  
  private void b(SparseArray<Fragment> paramSparseArray, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.mContainerId;
      if (i1 != 0) {
        paramSparseArray.put(i1, paramFragment);
      }
    }
  }
  
  private void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.b.p.a()) {}
    o localo;
    do
    {
      return;
      localo = this.c;
    } while (localo == null);
    switch (localo.c)
    {
    }
    for (;;)
    {
      localo = localo.a;
      break;
      b(paramSparseArray2, localo.d);
      continue;
      Object localObject1 = localo.d;
      Object localObject2;
      if (this.b.g != null)
      {
        int i1 = 0;
        localObject2 = localObject1;
        if (i1 < this.b.g.size())
        {
          Fragment localFragment = (Fragment)this.b.g.get(i1);
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (localFragment.mContainerId != ((Fragment)localObject1).mContainerId) {}
          }
          else
          {
            if (localFragment != localObject1) {
              break label189;
            }
          }
          for (localObject2 = null;; localObject2 = localObject1)
          {
            i1 += 1;
            localObject1 = localObject2;
            break;
            label189:
            a(paramSparseArray1, localFragment);
          }
        }
      }
      else
      {
        localObject2 = localObject1;
      }
      b(paramSparseArray2, (Fragment)localObject2);
      continue;
      a(paramSparseArray1, localo.d);
      continue;
      a(paramSparseArray1, localo.d);
      continue;
      b(paramSparseArray2, localo.d);
      continue;
      a(paramSparseArray1, localo.d);
      continue;
      b(paramSparseArray2, localo.d);
    }
  }
  
  public int a()
  {
    return a(false);
  }
  
  int a(boolean paramBoolean)
  {
    if (this.o) {
      throw new IllegalStateException("commit already called");
    }
    if (af.a)
    {
      Log.v("FragmentManager", "Commit: " + this);
      a("  ", null, new PrintWriter(new e("FragmentManager")), null);
    }
    this.o = true;
    if (this.l) {}
    for (this.p = this.b.a(this);; this.p = -1)
    {
      this.b.a(this, paramBoolean);
      return this.p;
    }
  }
  
  public at a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, 0, 0);
  }
  
  public at a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramInt4;
    return this;
  }
  
  public at a(int paramInt, Fragment paramFragment)
  {
    a(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public at a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  public at a(Fragment paramFragment)
  {
    o localo = new o();
    localo.c = 3;
    localo.d = paramFragment;
    a(localo);
    return this;
  }
  
  public at a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }
  
  public p a(boolean paramBoolean, p paramp, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (af.a)
    {
      Log.v("FragmentManager", "popFromBackStack: " + this);
      a("  ", null, new PrintWriter(new e("FragmentManager")), null);
    }
    p localp = paramp;
    if (a)
    {
      if (paramp != null) {
        break label223;
      }
      if (paramSparseArray1.size() == 0)
      {
        localp = paramp;
        if (paramSparseArray2.size() == 0) {}
      }
      else
      {
        localp = a(paramSparseArray1, paramSparseArray2, true);
      }
    }
    label100:
    a(-1);
    int i1;
    label113:
    int i2;
    label121:
    int i3;
    if (localp != null)
    {
      i1 = 0;
      if (localp == null) {
        break label257;
      }
      i2 = 0;
      paramp = this.d;
      if (paramp == null) {
        break label546;
      }
      if (localp == null) {
        break label266;
      }
      i3 = 0;
      label138:
      if (localp == null) {
        break label275;
      }
    }
    label223:
    label257:
    label266:
    label275:
    for (int i4 = 0;; i4 = paramp.h) {
      switch (paramp.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + paramp.c);
        localp = paramp;
        if (paramBoolean) {
          break label100;
        }
        a(paramp, this.v, this.u);
        localp = paramp;
        break label100;
        i1 = this.k;
        break label113;
        i2 = this.j;
        break label121;
        i3 = paramp.g;
        break label138;
      }
    }
    paramSparseArray1 = paramp.d;
    paramSparseArray1.mNextAnim = i4;
    this.b.a(paramSparseArray1, af.c(i2), i1);
    for (;;)
    {
      paramp = paramp.b;
      break;
      paramSparseArray1 = paramp.d;
      if (paramSparseArray1 != null)
      {
        paramSparseArray1.mNextAnim = i4;
        this.b.a(paramSparseArray1, af.c(i2), i1);
      }
      if (paramp.i != null)
      {
        i4 = 0;
        while (i4 < paramp.i.size())
        {
          paramSparseArray1 = (Fragment)paramp.i.get(i4);
          paramSparseArray1.mNextAnim = i3;
          this.b.a(paramSparseArray1, false);
          i4 += 1;
        }
        paramSparseArray1 = paramp.d;
        paramSparseArray1.mNextAnim = i3;
        this.b.a(paramSparseArray1, false);
        continue;
        paramSparseArray1 = paramp.d;
        paramSparseArray1.mNextAnim = i3;
        this.b.c(paramSparseArray1, af.c(i2), i1);
        continue;
        paramSparseArray1 = paramp.d;
        paramSparseArray1.mNextAnim = i4;
        this.b.b(paramSparseArray1, af.c(i2), i1);
        continue;
        paramSparseArray1 = paramp.d;
        paramSparseArray1.mNextAnim = i3;
        this.b.e(paramSparseArray1, af.c(i2), i1);
        continue;
        paramSparseArray1 = paramp.d;
        paramSparseArray1.mNextAnim = i3;
        this.b.d(paramSparseArray1, af.c(i2), i1);
      }
    }
    label546:
    if (paramBoolean)
    {
      this.b.a(this.b.n, af.c(i2), i1, true);
      localp = null;
    }
    if (this.p >= 0)
    {
      this.b.b(this.p);
      this.p = -1;
    }
    return localp;
  }
  
  void a(int paramInt)
  {
    if (!this.l) {}
    for (;;)
    {
      return;
      if (af.a) {
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + paramInt);
      }
      for (o localo = this.c; localo != null; localo = localo.a)
      {
        Fragment localFragment;
        if (localo.d != null)
        {
          localFragment = localo.d;
          localFragment.mBackStackNesting += paramInt;
          if (af.a) {
            Log.v("FragmentManager", "Bump nesting of " + localo.d + " to " + localo.d.mBackStackNesting);
          }
        }
        if (localo.i != null)
        {
          int i1 = localo.i.size() - 1;
          while (i1 >= 0)
          {
            localFragment = (Fragment)localo.i.get(i1);
            localFragment.mBackStackNesting += paramInt;
            if (af.a) {
              Log.v("FragmentManager", "Bump nesting of " + localFragment + " to " + localFragment.mBackStackNesting);
            }
            i1 -= 1;
          }
        }
      }
    }
  }
  
  void a(o paramo)
  {
    if (this.c == null)
    {
      this.d = paramo;
      this.c = paramo;
    }
    for (;;)
    {
      paramo.e = this.f;
      paramo.f = this.g;
      paramo.g = this.h;
      paramo.h = this.i;
      this.e += 1;
      return;
      paramo.b = this.d;
      this.d.a = paramo;
      this.d = paramo;
    }
  }
  
  public void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.b.p.a()) {}
    o localo;
    do
    {
      return;
      localo = this.c;
    } while (localo == null);
    switch (localo.c)
    {
    }
    for (;;)
    {
      localo = localo.a;
      break;
      a(paramSparseArray1, localo.d);
      continue;
      if (localo.i != null)
      {
        int i1 = localo.i.size() - 1;
        while (i1 >= 0)
        {
          b(paramSparseArray2, (Fragment)localo.i.get(i1));
          i1 -= 1;
        }
      }
      a(paramSparseArray1, localo.d);
      continue;
      b(paramSparseArray2, localo.d);
      continue;
      b(paramSparseArray2, localo.d);
      continue;
      a(paramSparseArray1, localo.d);
      continue;
      b(paramSparseArray2, localo.d);
      continue;
      a(paramSparseArray1, localo.d);
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.o);
      if (this.j != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.k));
      }
      if ((this.f != 0) || (this.g != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      }
      if ((this.h != 0) || (this.i != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.h));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.i));
      }
      if ((this.q != 0) || (this.r != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.q));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.r);
      }
      if ((this.s != 0) || (this.t != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.s));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.t);
      }
    }
    if (this.c != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str2 = paramString + "    ";
      o localo = this.c;
      int i1 = 0;
      while (localo != null)
      {
        String str1;
        int i2;
        switch (localo.c)
        {
        default: 
          str1 = "cmd=" + localo.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str1);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localo.d);
          if (paramBoolean)
          {
            if ((localo.e != 0) || (localo.f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localo.e));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localo.f));
            }
            if ((localo.g != 0) || (localo.h != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localo.g));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localo.h));
            }
          }
          if ((localo.i == null) || (localo.i.size() <= 0)) {
            break label807;
          }
          i2 = 0;
          label641:
          if (i2 >= localo.i.size()) {
            break label807;
          }
          paramPrintWriter.print(str2);
          if (localo.i.size() == 1) {
            paramPrintWriter.print("Removed: ");
          }
          break;
        }
        for (;;)
        {
          paramPrintWriter.println(localo.i.get(i2));
          i2 += 1;
          break label641;
          str1 = "NULL";
          break;
          str1 = "ADD";
          break;
          str1 = "REPLACE";
          break;
          str1 = "REMOVE";
          break;
          str1 = "HIDE";
          break;
          str1 = "SHOW";
          break;
          str1 = "DETACH";
          break;
          str1 = "ATTACH";
          break;
          if (i2 == 0) {
            paramPrintWriter.println("Removed:");
          }
          paramPrintWriter.print(str2);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label807:
        localo = localo.a;
        i1 += 1;
      }
    }
  }
  
  public int b()
  {
    return a(true);
  }
  
  public at b(int paramInt, Fragment paramFragment)
  {
    return b(paramInt, paramFragment, null);
  }
  
  public at b(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    a(paramInt, paramFragment, paramString, 2);
    return this;
  }
  
  public at b(Fragment paramFragment)
  {
    o localo = new o();
    localo.c = 4;
    localo.d = paramFragment;
    a(localo);
    return this;
  }
  
  public at c(Fragment paramFragment)
  {
    o localo = new o();
    localo.c = 5;
    localo.d = paramFragment;
    a(localo);
    return this;
  }
  
  public String c()
  {
    return this.n;
  }
  
  public at d(Fragment paramFragment)
  {
    o localo = new o();
    localo.c = 6;
    localo.d = paramFragment;
    a(localo);
    return this;
  }
  
  public at e(Fragment paramFragment)
  {
    o localo = new o();
    localo.c = 7;
    localo.d = paramFragment;
    a(localo);
    return this;
  }
  
  public void run()
  {
    if (af.a) {
      Log.v("FragmentManager", "Run: " + this);
    }
    if ((this.l) && (this.p < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    a(1);
    Object localObject1;
    if (a)
    {
      localObject1 = new SparseArray();
      localObject2 = new SparseArray();
      b((SparseArray)localObject1, (SparseArray)localObject2);
    }
    for (Object localObject2 = a((SparseArray)localObject1, (SparseArray)localObject2, false);; localObject2 = null)
    {
      int i1;
      label106:
      int i2;
      label113:
      o localo;
      int i3;
      if (localObject2 != null)
      {
        i1 = 0;
        if (localObject2 == null) {
          break label224;
        }
        i2 = 0;
        localo = this.c;
        if (localo == null) {
          break label700;
        }
        if (localObject2 == null) {
          break label233;
        }
        i3 = 0;
        label129:
        if (localObject2 == null) {
          break label242;
        }
      }
      label224:
      label233:
      label242:
      for (int i4 = 0;; i4 = localo.f) {
        switch (localo.c)
        {
        default: 
          throw new IllegalArgumentException("Unknown cmd: " + localo.c);
          i1 = this.k;
          break label106;
          i2 = this.j;
          break label113;
          i3 = localo.e;
          break label129;
        }
      }
      localObject1 = localo.d;
      ((Fragment)localObject1).mNextAnim = i3;
      this.b.a((Fragment)localObject1, false);
      for (;;)
      {
        localo = localo.a;
        break;
        localObject1 = localo.d;
        int i6 = ((Fragment)localObject1).mContainerId;
        Object localObject3;
        if (this.b.g != null)
        {
          int i5 = 0;
          localObject3 = localObject1;
          if (i5 < this.b.g.size())
          {
            Fragment localFragment = (Fragment)this.b.g.get(i5);
            if (af.a) {
              Log.v("FragmentManager", "OP_REPLACE: adding=" + localObject1 + " old=" + localFragment);
            }
            localObject3 = localObject1;
            if (localFragment.mContainerId == i6)
            {
              if (localFragment != localObject1) {
                break label421;
              }
              localObject3 = null;
              localo.d = null;
            }
            for (;;)
            {
              i5 += 1;
              localObject1 = localObject3;
              break;
              label421:
              if (localo.i == null) {
                localo.i = new ArrayList();
              }
              localo.i.add(localFragment);
              localFragment.mNextAnim = i4;
              if (this.l)
              {
                localFragment.mBackStackNesting += 1;
                if (af.a) {
                  Log.v("FragmentManager", "Bump nesting of " + localFragment + " to " + localFragment.mBackStackNesting);
                }
              }
              this.b.a(localFragment, i2, i1);
              localObject3 = localObject1;
            }
          }
        }
        else
        {
          localObject3 = localObject1;
        }
        if (localObject3 != null)
        {
          ((Fragment)localObject3).mNextAnim = i3;
          this.b.a((Fragment)localObject3, false);
          continue;
          localObject1 = localo.d;
          ((Fragment)localObject1).mNextAnim = i4;
          this.b.a((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localo.d;
          ((Fragment)localObject1).mNextAnim = i4;
          this.b.b((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localo.d;
          ((Fragment)localObject1).mNextAnim = i3;
          this.b.c((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localo.d;
          ((Fragment)localObject1).mNextAnim = i4;
          this.b.d((Fragment)localObject1, i2, i1);
          continue;
          localObject1 = localo.d;
          ((Fragment)localObject1).mNextAnim = i3;
          this.b.e((Fragment)localObject1, i2, i1);
        }
      }
      label700:
      this.b.a(this.b.n, i2, i1, true);
      if (this.l) {
        this.b.b(this);
      }
      return;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.p >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.p);
    }
    if (this.n != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.n);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */