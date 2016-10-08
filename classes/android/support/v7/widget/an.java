package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

class an
  extends Observable<ao>
{
  public void a(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, null);
  }
  
  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ao)this.mObservers.get(i)).a(paramInt1, paramInt2, paramObject);
      i -= 1;
    }
  }
  
  public boolean a()
  {
    return !this.mObservers.isEmpty();
  }
  
  public void b()
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ao)this.mObservers.get(i)).a();
      i -= 1;
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ao)this.mObservers.get(i)).b(paramInt1, paramInt2);
      i -= 1;
    }
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ao)this.mObservers.get(i)).c(paramInt1, paramInt2);
      i -= 1;
    }
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ao)this.mObservers.get(i)).a(paramInt1, paramInt2, 1);
      i -= 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */