package org.apache.cordova;

import android.view.View;

public class ScrollEvent
{
  public int l;
  public int nl;
  public int nt;
  public int t;
  private View targetView;
  
  ScrollEvent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    this.l = paramInt3;
    paramInt3 = this.t;
    this.nl = paramInt1;
    this.nt = paramInt2;
    this.targetView = paramView;
  }
  
  public int dl()
  {
    return this.nl - this.l;
  }
  
  public int dt()
  {
    return this.nt - this.t;
  }
  
  public View getTargetView()
  {
    return this.targetView;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\ScrollEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */