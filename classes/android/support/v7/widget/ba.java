package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public class ba
{
  private SparseArray<ArrayList<bk>> a = new SparseArray();
  private SparseIntArray b = new SparseIntArray();
  private int c = 0;
  
  private ArrayList<bk> b(int paramInt)
  {
    ArrayList localArrayList2 = (ArrayList)this.a.get(paramInt);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList2 = new ArrayList();
      this.a.put(paramInt, localArrayList2);
      localArrayList1 = localArrayList2;
      if (this.b.indexOfKey(paramInt) < 0)
      {
        this.b.put(paramInt, 5);
        localArrayList1 = localArrayList2;
      }
    }
    return localArrayList1;
  }
  
  public bk a(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      paramInt = localArrayList.size() - 1;
      bk localbk = (bk)localArrayList.get(paramInt);
      localArrayList.remove(paramInt);
      return localbk;
    }
    return null;
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  void a(am paramam)
  {
    this.c += 1;
  }
  
  void a(am paramam1, am paramam2, boolean paramBoolean)
  {
    if (paramam1 != null) {
      b();
    }
    if ((!paramBoolean) && (this.c == 0)) {
      a();
    }
    if (paramam2 != null) {
      a(paramam2);
    }
  }
  
  public void a(bk parambk)
  {
    int i = parambk.getItemViewType();
    ArrayList localArrayList = b(i);
    if (this.b.get(i) <= localArrayList.size()) {
      return;
    }
    parambk.resetInternal();
    localArrayList.add(parambk);
  }
  
  void b()
  {
    this.c -= 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */