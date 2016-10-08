package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class y
{
  private static final z a = new ae();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new ac();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new aa();
      return;
    }
  }
  
  public y()
  {
    this.b = a.a(this);
  }
  
  public y(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public g a(int paramInt)
  {
    return null;
  }
  
  public Object a()
  {
    return this.b;
  }
  
  public List<g> a(String paramString, int paramInt)
  {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  public g b(int paramInt)
  {
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */