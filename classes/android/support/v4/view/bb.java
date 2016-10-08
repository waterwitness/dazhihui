package android.support.v4.view;

import android.database.DataSetObserver;

class bb
  extends DataSetObserver
  implements de, df
{
  private int b;
  
  private bb(PagerTitleStrip paramPagerTitleStrip) {}
  
  public void a(ax paramax1, ax paramax2)
  {
    this.a.a(paramax1, paramax2);
  }
  
  public void onChanged()
  {
    float f = 0.0F;
    this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
    if (PagerTitleStrip.a(this.a) >= 0.0F) {
      f = PagerTitleStrip.a(this.a);
    }
    this.a.a(this.a.a.getCurrentItem(), f, true);
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    paramInt2 = paramInt1;
    if (paramFloat > 0.5F) {
      paramInt2 = paramInt1 + 1;
    }
    this.a.a(paramInt2, paramFloat, false);
  }
  
  public void onPageSelected(int paramInt)
  {
    float f = 0.0F;
    if (this.b == 0)
    {
      this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
      if (PagerTitleStrip.a(this.a) >= 0.0F) {
        f = PagerTitleStrip.a(this.a);
      }
      this.a.a(this.a.a.getCurrentItem(), f, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */