package android.support.v4.widget;

class c
  implements Runnable
{
  c(ContentLoadingProgressBar paramContentLoadingProgressBar) {}
  
  public void run()
  {
    ContentLoadingProgressBar.a(this.a, false);
    ContentLoadingProgressBar.a(this.a, -1L);
    this.a.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */