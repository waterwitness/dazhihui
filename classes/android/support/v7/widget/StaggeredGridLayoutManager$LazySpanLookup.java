package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StaggeredGridLayoutManager$LazySpanLookup
{
  int[] a;
  List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> b;
  
  private void c(int paramInt1, int paramInt2)
  {
    if (this.b == null) {
      return;
    }
    int i = this.b.size() - 1;
    label21:
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (i >= 0)
    {
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i);
      if (localFullSpanItem.a >= paramInt1) {
        break label58;
      }
    }
    for (;;)
    {
      i -= 1;
      break label21;
      break;
      label58:
      if (localFullSpanItem.a < paramInt1 + paramInt2) {
        this.b.remove(i);
      } else {
        localFullSpanItem.a -= paramInt2;
      }
    }
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    if (this.b == null) {
      return;
    }
    int i = this.b.size() - 1;
    label21:
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (i >= 0)
    {
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i);
      if (localFullSpanItem.a >= paramInt1) {
        break label58;
      }
    }
    for (;;)
    {
      i -= 1;
      break label21;
      break;
      label58:
      localFullSpanItem.a += paramInt2;
    }
  }
  
  private int g(int paramInt)
  {
    if (this.b == null) {
      return -1;
    }
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = f(paramInt);
    if (localFullSpanItem != null) {
      this.b.remove(localFullSpanItem);
    }
    int j = this.b.size();
    int i = 0;
    if (i < j) {
      if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i)).a < paramInt) {}
    }
    for (;;)
    {
      if (i != -1)
      {
        localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i);
        this.b.remove(i);
        return localFullSpanItem.a;
        i += 1;
        break;
      }
      return -1;
      i = -1;
    }
  }
  
  int a(int paramInt)
  {
    if (this.b != null)
    {
      int i = this.b.size() - 1;
      while (i >= 0)
      {
        if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i)).a >= paramInt) {
          this.b.remove(i);
        }
        i -= 1;
      }
    }
    return b(paramInt);
  }
  
  public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      return (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject;
    }
    int j = this.b.size();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label117;
      }
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i);
      if (localFullSpanItem.a >= paramInt2) {
        return null;
      }
      if (localFullSpanItem.a >= paramInt1)
      {
        localObject = localFullSpanItem;
        if (paramInt3 == 0) {
          break;
        }
        localObject = localFullSpanItem;
        if (localFullSpanItem.b == paramInt3) {
          break;
        }
        if (paramBoolean)
        {
          localObject = localFullSpanItem;
          if (localFullSpanItem.d) {
            break;
          }
        }
      }
      i += 1;
    }
    label117:
    return null;
  }
  
  void a()
  {
    if (this.a != null) {
      Arrays.fill(this.a, -1);
    }
    this.b = null;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length)) {
      return;
    }
    e(paramInt1 + paramInt2);
    System.arraycopy(this.a, paramInt1 + paramInt2, this.a, paramInt1, this.a.length - paramInt1 - paramInt2);
    Arrays.fill(this.a, this.a.length - paramInt2, this.a.length, -1);
    c(paramInt1, paramInt2);
  }
  
  void a(int paramInt, bt parambt)
  {
    e(paramInt);
    this.a[paramInt] = parambt.d;
  }
  
  public void a(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem paramFullSpanItem)
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i);
      if (localFullSpanItem.a == paramFullSpanItem.a) {
        this.b.remove(i);
      }
      if (localFullSpanItem.a >= paramFullSpanItem.a)
      {
        this.b.add(i, paramFullSpanItem);
        return;
      }
      i += 1;
    }
    this.b.add(paramFullSpanItem);
  }
  
  int b(int paramInt)
  {
    if (this.a == null) {}
    while (paramInt >= this.a.length) {
      return -1;
    }
    int i = g(paramInt);
    if (i == -1)
    {
      Arrays.fill(this.a, paramInt, this.a.length, -1);
      return this.a.length;
    }
    Arrays.fill(this.a, paramInt, i + 1, -1);
    return i + 1;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length)) {
      return;
    }
    e(paramInt1 + paramInt2);
    System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt2, this.a.length - paramInt1 - paramInt2);
    Arrays.fill(this.a, paramInt1, paramInt1 + paramInt2, -1);
    d(paramInt1, paramInt2);
  }
  
  int c(int paramInt)
  {
    if ((this.a == null) || (paramInt >= this.a.length)) {
      return -1;
    }
    return this.a[paramInt];
  }
  
  int d(int paramInt)
  {
    int i = this.a.length;
    while (i <= paramInt) {
      i *= 2;
    }
    return i;
  }
  
  void e(int paramInt)
  {
    if (this.a == null)
    {
      this.a = new int[Math.max(paramInt, 10) + 1];
      Arrays.fill(this.a, -1);
    }
    while (paramInt < this.a.length) {
      return;
    }
    int[] arrayOfInt = this.a;
    this.a = new int[d(paramInt)];
    System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
    Arrays.fill(this.a, arrayOfInt.length, this.a.length, -1);
  }
  
  public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem f(int paramInt)
  {
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      return (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject;
    }
    int i = this.b.size() - 1;
    for (;;)
    {
      if (i < 0) {
        break label63;
      }
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(i);
      localObject = localFullSpanItem;
      if (localFullSpanItem.a == paramInt) {
        break;
      }
      i -= 1;
    }
    label63:
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\StaggeredGridLayoutManager$LazySpanLookup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */