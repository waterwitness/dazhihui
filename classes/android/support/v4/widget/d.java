package android.support.v4.widget;

class d
  implements Runnable
{
  d(ContentLoadingProgressBar paramContentLoadingProgressBar) {}
  
  public void run()
  {
    ContentLoadingProgressBar.b(this.a, false);
    if (!ContentLoadingProgressBar.a(this.a))
    {
      ContentLoadingProgressBar.a(this.a, System.currentTimeMillis());
      this.a.setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */