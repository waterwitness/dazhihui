package android.support.v7.widget;

import android.support.v4.view.bn;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bb
{
  final ArrayList<bk> a = new ArrayList();
  final ArrayList<bk> b = new ArrayList();
  private ArrayList<bk> d = null;
  private final List<bk> e = Collections.unmodifiableList(this.a);
  private int f = 2;
  private ba g;
  private bi h;
  
  public bb(RecyclerView paramRecyclerView) {}
  
  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, true);
      }
      i -= 1;
    }
    if (!paramBoolean) {
      return;
    }
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
      return;
    }
    i = paramViewGroup.getVisibility();
    paramViewGroup.setVisibility(4);
    paramViewGroup.setVisibility(i);
  }
  
  private void d(View paramView)
  {
    if (this.c.i())
    {
      if (bn.e(paramView) == 0) {
        bn.c(paramView, 1);
      }
      if (!bn.b(paramView)) {
        bn.a(paramView, RecyclerView.r(this.c).b());
      }
    }
  }
  
  private void f(bk parambk)
  {
    if ((parambk.itemView instanceof ViewGroup)) {
      a((ViewGroup)parambk.itemView, false);
    }
  }
  
  bk a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = 0;
    int k = this.a.size();
    int i = 0;
    Object localObject;
    bk localbk;
    for (;;)
    {
      if (i < k)
      {
        localObject = (bk)this.a.get(i);
        if ((((bk)localObject).wasReturnedFromScrap()) || (((bk)localObject).getLayoutPosition() != paramInt1) || (((bk)localObject).isInvalid()) || ((!bh.e(this.c.f)) && (((bk)localObject).isRemoved()))) {
          break label251;
        }
        if ((paramInt2 != -1) && (((bk)localObject).getItemViewType() != paramInt2)) {
          Log.e("RecyclerView", "Scrap view for position " + paramInt1 + " isn't dirty but has" + " wrong view type! (found " + ((bk)localObject).getItemViewType() + " but expected " + paramInt2 + ")");
        }
      }
      else
      {
        if (paramBoolean) {
          break label288;
        }
        localObject = this.c.c.a(paramInt1, paramInt2);
        if (localObject == null) {
          break label288;
        }
        localbk = RecyclerView.b((View)localObject);
        this.c.c.e((View)localObject);
        paramInt1 = this.c.c.b((View)localObject);
        if (paramInt1 != -1) {
          break;
        }
        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localbk);
      }
      ((bk)localObject).addFlags(32);
      return (bk)localObject;
      label251:
      i += 1;
    }
    this.c.c.d(paramInt1);
    c((View)localObject);
    localbk.addFlags(8224);
    return localbk;
    label288:
    i = this.b.size();
    paramInt2 = j;
    for (;;)
    {
      if (paramInt2 >= i) {
        break label363;
      }
      localbk = (bk)this.b.get(paramInt2);
      if ((!localbk.isInvalid()) && (localbk.getLayoutPosition() == paramInt1))
      {
        localObject = localbk;
        if (paramBoolean) {
          break;
        }
        this.b.remove(paramInt2);
        return localbk;
      }
      paramInt2 += 1;
    }
    label363:
    return null;
  }
  
  bk a(long paramLong, int paramInt, boolean paramBoolean)
  {
    int i = this.a.size() - 1;
    bk localbk2;
    bk localbk1;
    while (i >= 0)
    {
      localbk2 = (bk)this.a.get(i);
      if ((localbk2.getItemId() == paramLong) && (!localbk2.wasReturnedFromScrap()))
      {
        if (paramInt == localbk2.getItemViewType())
        {
          localbk2.addFlags(32);
          localbk1 = localbk2;
          if (localbk2.isRemoved())
          {
            localbk1 = localbk2;
            if (!this.c.f.a())
            {
              localbk2.setFlags(2, 14);
              localbk1 = localbk2;
            }
          }
          return localbk1;
        }
        if (!paramBoolean)
        {
          this.a.remove(i);
          this.c.removeDetachedView(localbk2.itemView, false);
          b(localbk2.itemView);
        }
      }
      i -= 1;
    }
    i = this.b.size() - 1;
    for (;;)
    {
      if (i < 0) {
        break label245;
      }
      localbk2 = (bk)this.b.get(i);
      if (localbk2.getItemId() == paramLong)
      {
        if (paramInt == localbk2.getItemViewType())
        {
          localbk1 = localbk2;
          if (paramBoolean) {
            break;
          }
          this.b.remove(i);
          return localbk2;
        }
        if (!paramBoolean) {
          d(i);
        }
      }
      i -= 1;
    }
    label245:
    return null;
  }
  
  View a(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramInt < 0) || (paramInt >= this.c.f.e())) {
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.c.f.e());
    }
    Object localObject2;
    int i;
    if (this.c.f.a())
    {
      localObject2 = f(paramInt);
      if (localObject2 != null) {
        i = 1;
      }
    }
    for (;;)
    {
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = a(paramInt, -1, paramBoolean);
        localObject1 = localObject2;
        if (localObject2 != null) {
          if (!a((bk)localObject2)) {
            if (!paramBoolean)
            {
              ((bk)localObject2).addFlags(4);
              if (((bk)localObject2).isScrap())
              {
                this.c.removeDetachedView(((bk)localObject2).itemView, false);
                ((bk)localObject2).unScrap();
                label173:
                b((bk)localObject2);
              }
            }
            else
            {
              localObject1 = null;
            }
          }
        }
      }
      for (;;)
      {
        Object localObject3 = localObject1;
        int k = i;
        int j;
        if (localObject1 == null)
        {
          k = this.c.b.b(paramInt);
          if ((k < 0) || (k >= RecyclerView.g(this.c).getItemCount()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ")." + "state:" + this.c.f.e());
            i = 0;
            break;
            if (!((bk)localObject2).wasReturnedFromScrap()) {
              break label173;
            }
            ((bk)localObject2).clearReturnedFromScrapFlag();
            break label173;
            i = 1;
            localObject1 = localObject2;
            continue;
          }
          int m = RecyclerView.g(this.c).getItemViewType(k);
          localObject2 = localObject1;
          j = i;
          if (RecyclerView.g(this.c).hasStableIds())
          {
            localObject1 = a(RecyclerView.g(this.c).getItemId(k), m, paramBoolean);
            localObject2 = localObject1;
            j = i;
            if (localObject1 != null)
            {
              ((bk)localObject1).mPosition = k;
              j = 1;
              localObject2 = localObject1;
            }
          }
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (this.h != null)
            {
              localObject3 = this.h.a(this, paramInt, m);
              localObject1 = localObject2;
              if (localObject3 != null)
              {
                localObject2 = this.c.a((View)localObject3);
                if (localObject2 == null) {
                  throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                }
                localObject1 = localObject2;
                if (((bk)localObject2).shouldIgnore()) {
                  throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                }
              }
            }
          }
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject1 = f().a(m);
            localObject2 = localObject1;
            if (localObject1 != null)
            {
              ((bk)localObject1).resetInternal();
              localObject2 = localObject1;
              if (RecyclerView.r())
              {
                f((bk)localObject1);
                localObject2 = localObject1;
              }
            }
          }
          localObject3 = localObject2;
          k = j;
          if (localObject2 == null) {
            localObject2 = RecyclerView.g(this.c).createViewHolder(this.c, m);
          }
        }
        for (i = j;; i = k)
        {
          if ((i != 0) && (!this.c.f.a()) && (((bk)localObject2).hasAnyOfTheFlags(8192)))
          {
            ((bk)localObject2).setFlags(0, 8192);
            if (bh.b(this.c.f))
            {
              j = aq.d((bk)localObject2);
              localObject1 = this.c.e.a(this.c.f, (bk)localObject2, j | 0x1000, ((bk)localObject2).getUnmodifiedPayloads());
              RecyclerView.a(this.c, (bk)localObject2, (at)localObject1);
            }
          }
          if ((this.c.f.a()) && (((bk)localObject2).isBound()))
          {
            ((bk)localObject2).mPreLayoutPosition = paramInt;
            paramInt = 0;
          }
          for (;;)
          {
            localObject1 = ((bk)localObject2).itemView.getLayoutParams();
            if (localObject1 == null)
            {
              localObject1 = (RecyclerView.LayoutParams)this.c.generateDefaultLayoutParams();
              ((bk)localObject2).itemView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              label726:
              ((RecyclerView.LayoutParams)localObject1).a = ((bk)localObject2);
              if ((i == 0) || (paramInt == 0)) {
                break label891;
              }
            }
            label891:
            for (paramBoolean = bool;; paramBoolean = false)
            {
              ((RecyclerView.LayoutParams)localObject1).d = paramBoolean;
              return ((bk)localObject2).itemView;
              if ((((bk)localObject2).isBound()) && (!((bk)localObject2).needsUpdate()) && (!((bk)localObject2).isInvalid())) {
                break label896;
              }
              j = this.c.b.b(paramInt);
              ((bk)localObject2).mOwnerRecyclerView = this.c;
              RecyclerView.g(this.c).bindViewHolder((bk)localObject2, j);
              d(((bk)localObject2).itemView);
              if (this.c.f.a()) {
                ((bk)localObject2).mPreLayoutPosition = paramInt;
              }
              paramInt = 1;
              break;
              if (!this.c.checkLayoutParams((ViewGroup.LayoutParams)localObject1))
              {
                localObject1 = (RecyclerView.LayoutParams)this.c.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
                ((bk)localObject2).itemView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                break label726;
              }
              localObject1 = (RecyclerView.LayoutParams)localObject1;
              break label726;
            }
            label896:
            paramInt = 0;
          }
          localObject2 = localObject3;
        }
      }
      localObject2 = null;
      i = 0;
    }
  }
  
  public void a()
  {
    this.a.clear();
    c();
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
    int i = this.b.size() - 1;
    while ((i >= 0) && (this.b.size() > paramInt))
    {
      d(i);
      i -= 1;
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    label26:
    bk localbk;
    if (paramInt1 < paramInt2)
    {
      i = -1;
      j = paramInt2;
      k = paramInt1;
      int n = this.b.size();
      m = 0;
      if (m >= n) {
        return;
      }
      localbk = (bk)this.b.get(m);
      if ((localbk != null) && (localbk.mPosition >= k) && (localbk.mPosition <= j)) {
        break label89;
      }
    }
    for (;;)
    {
      m += 1;
      break label26;
      i = 1;
      j = paramInt1;
      k = paramInt2;
      break;
      label89:
      if (localbk.mPosition == paramInt1) {
        localbk.offsetPosition(paramInt2 - paramInt1, false);
      } else {
        localbk.offsetPosition(i, false);
      }
    }
  }
  
  void a(am paramam1, am paramam2, boolean paramBoolean)
  {
    a();
    f().a(paramam1, paramam2, paramBoolean);
  }
  
  void a(ba paramba)
  {
    if (this.g != null) {
      this.g.b();
    }
    this.g = paramba;
    if (paramba != null) {
      this.g.a(this.c.getAdapter());
    }
  }
  
  void a(bi parambi)
  {
    this.h = parambi;
  }
  
  public void a(View paramView)
  {
    bk localbk = RecyclerView.b(paramView);
    if (localbk.isTmpDetached()) {
      this.c.removeDetachedView(paramView, false);
    }
    if (localbk.isScrap()) {
      localbk.unScrap();
    }
    for (;;)
    {
      b(localbk);
      return;
      if (localbk.wasReturnedFromScrap()) {
        localbk.clearReturnedFromScrapFlag();
      }
    }
  }
  
  boolean a(bk parambk)
  {
    boolean bool2 = true;
    boolean bool1;
    if (parambk.isRemoved()) {
      bool1 = this.c.f.a();
    }
    do
    {
      do
      {
        return bool1;
        if ((parambk.mPosition < 0) || (parambk.mPosition >= RecyclerView.g(this.c).getItemCount())) {
          throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + parambk);
        }
        if ((!this.c.f.a()) && (RecyclerView.g(this.c).getItemViewType(parambk.mPosition) != parambk.getItemViewType())) {
          return false;
        }
        bool1 = bool2;
      } while (!RecyclerView.g(this.c).hasStableIds());
      bool1 = bool2;
    } while (parambk.getItemId() == RecyclerView.g(this.c).getItemId(parambk.mPosition));
    return false;
  }
  
  public int b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c.f.e())) {
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State " + "item count is " + this.c.f.e());
    }
    if (!this.c.f.a()) {
      return paramInt;
    }
    return this.c.b.b(paramInt);
  }
  
  public List<bk> b()
  {
    return this.e;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      bk localbk = (bk)this.b.get(i);
      if ((localbk != null) && (localbk.getLayoutPosition() >= paramInt1)) {
        localbk.offsetPosition(paramInt2, true);
      }
      i += 1;
    }
  }
  
  void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      bk localbk = (bk)this.b.get(i);
      if (localbk != null)
      {
        if (localbk.getLayoutPosition() < paramInt1 + paramInt2) {
          break label63;
        }
        localbk.offsetPosition(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i -= 1;
        break;
        label63:
        if (localbk.getLayoutPosition() >= paramInt1)
        {
          localbk.addFlags(8);
          d(i);
        }
      }
    }
  }
  
  void b(bk parambk)
  {
    boolean bool = true;
    int j = 0;
    if ((parambk.isScrap()) || (parambk.itemView.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(parambk.isScrap()).append(" isAttached:");
      if (parambk.itemView.getParent() != null) {}
      for (;;)
      {
        throw new IllegalArgumentException(bool);
        bool = false;
      }
    }
    if (parambk.isTmpDetached()) {
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + parambk);
    }
    if (parambk.shouldIgnore()) {
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    }
    bool = bk.access$4700(parambk);
    int i;
    if ((RecyclerView.g(this.c) != null) && (bool) && (RecyclerView.g(this.c).onFailedToRecycleView(parambk)))
    {
      i = 1;
      if ((i == 0) && (!parambk.isRecyclable())) {
        break label293;
      }
      if (parambk.hasAnyOfTheFlags(14)) {
        break label288;
      }
      i = this.b.size();
      if ((i == this.f) && (i > 0)) {
        d(0);
      }
      if (i >= this.f) {
        break label288;
      }
      this.b.add(parambk);
      i = 1;
      label237:
      if (i != 0) {
        break label285;
      }
      c(parambk);
      j = 1;
    }
    for (;;)
    {
      this.c.d.e(parambk);
      if ((i == 0) && (j == 0) && (bool)) {
        parambk.mOwnerRecyclerView = null;
      }
      return;
      i = 0;
      break;
      label285:
      continue;
      label288:
      i = 0;
      break label237;
      label293:
      i = 0;
    }
  }
  
  void b(View paramView)
  {
    paramView = RecyclerView.b(paramView);
    bk.access$4802(paramView, null);
    bk.access$4902(paramView, false);
    paramView.clearReturnedFromScrapFlag();
    b(paramView);
  }
  
  public View c(int paramInt)
  {
    return a(paramInt, false);
  }
  
  void c()
  {
    int i = this.b.size() - 1;
    while (i >= 0)
    {
      d(i);
      i -= 1;
    }
    this.b.clear();
  }
  
  void c(int paramInt1, int paramInt2)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      bk localbk = (bk)this.b.get(i);
      if (localbk == null) {}
      for (;;)
      {
        i -= 1;
        break;
        int j = localbk.getLayoutPosition();
        if ((j >= paramInt1) && (j < paramInt1 + paramInt2))
        {
          localbk.addFlags(2);
          d(i);
        }
      }
    }
  }
  
  void c(bk parambk)
  {
    bn.a(parambk.itemView, null);
    e(parambk);
    parambk.mOwnerRecyclerView = null;
    f().a(parambk);
  }
  
  void c(View paramView)
  {
    paramView = RecyclerView.b(paramView);
    if ((paramView.hasAnyOfTheFlags(12)) || (!paramView.isUpdated()) || (RecyclerView.a(this.c, paramView)))
    {
      if ((paramView.isInvalid()) && (!paramView.isRemoved()) && (!RecyclerView.g(this.c).hasStableIds())) {
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
      }
      paramView.setScrapContainer(this, false);
      this.a.add(paramView);
      return;
    }
    if (this.d == null) {
      this.d = new ArrayList();
    }
    paramView.setScrapContainer(this, true);
    this.d.add(paramView);
  }
  
  int d()
  {
    return this.a.size();
  }
  
  void d(int paramInt)
  {
    c((bk)this.b.get(paramInt));
    this.b.remove(paramInt);
  }
  
  void d(bk parambk)
  {
    if (bk.access$4900(parambk)) {
      this.d.remove(parambk);
    }
    for (;;)
    {
      bk.access$4802(parambk, null);
      bk.access$4902(parambk, false);
      parambk.clearReturnedFromScrapFlag();
      return;
      this.a.remove(parambk);
    }
  }
  
  View e(int paramInt)
  {
    return ((bk)this.a.get(paramInt)).itemView;
  }
  
  void e()
  {
    this.a.clear();
    if (this.d != null) {
      this.d.clear();
    }
  }
  
  void e(bk parambk)
  {
    if (RecyclerView.s(this.c) != null) {
      RecyclerView.s(this.c).a(parambk);
    }
    if (RecyclerView.g(this.c) != null) {
      RecyclerView.g(this.c).onViewRecycled(parambk);
    }
    if (this.c.f != null) {
      this.c.d.e(parambk);
    }
  }
  
  ba f()
  {
    if (this.g == null) {
      this.g = new ba();
    }
    return this.g;
  }
  
  bk f(int paramInt)
  {
    int j = 0;
    int k;
    if (this.d != null)
    {
      k = this.d.size();
      if (k != 0) {}
    }
    else
    {
      return null;
    }
    int i = 0;
    bk localbk;
    while (i < k)
    {
      localbk = (bk)this.d.get(i);
      if ((!localbk.wasReturnedFromScrap()) && (localbk.getLayoutPosition() == paramInt))
      {
        localbk.addFlags(32);
        return localbk;
      }
      i += 1;
    }
    if (RecyclerView.g(this.c).hasStableIds())
    {
      paramInt = this.c.b.b(paramInt);
      if ((paramInt > 0) && (paramInt < RecyclerView.g(this.c).getItemCount()))
      {
        long l = RecyclerView.g(this.c).getItemId(paramInt);
        paramInt = j;
        while (paramInt < k)
        {
          localbk = (bk)this.d.get(paramInt);
          if ((!localbk.wasReturnedFromScrap()) && (localbk.getItemId() == l))
          {
            localbk.addFlags(32);
            return localbk;
          }
          paramInt += 1;
        }
      }
    }
    return null;
  }
  
  void g()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      bk localbk = (bk)this.b.get(i);
      if (localbk != null) {
        localbk.addFlags(512);
      }
      i += 1;
    }
  }
  
  void h()
  {
    int j;
    int i;
    if ((RecyclerView.g(this.c) != null) && (RecyclerView.g(this.c).hasStableIds()))
    {
      j = this.b.size();
      i = 0;
    }
    while (i < j)
    {
      bk localbk = (bk)this.b.get(i);
      if (localbk != null)
      {
        localbk.addFlags(6);
        localbk.addChangePayload(null);
      }
      i += 1;
      continue;
      c();
    }
  }
  
  void i()
  {
    int j = 0;
    int k = this.b.size();
    int i = 0;
    while (i < k)
    {
      ((bk)this.b.get(i)).clearOldPosition();
      i += 1;
    }
    k = this.a.size();
    i = 0;
    while (i < k)
    {
      ((bk)this.a.get(i)).clearOldPosition();
      i += 1;
    }
    if (this.d != null)
    {
      k = this.d.size();
      i = j;
      while (i < k)
      {
        ((bk)this.d.get(i)).clearOldPosition();
        i += 1;
      }
    }
  }
  
  void j()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((bk)this.b.get(i)).itemView.getLayoutParams();
      if (localLayoutParams != null) {
        localLayoutParams.c = true;
      }
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */