package android.support.v4.app;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class y
  extends ac<FragmentActivity>
{
  public y(FragmentActivity paramFragmentActivity)
  {
    super(paramFragmentActivity);
  }
  
  public View a(int paramInt)
  {
    return this.a.findViewById(paramInt);
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.a.startActivityFromFragment(paramFragment, paramIntent, paramInt);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    FragmentActivity.access$000(this.a, paramFragment, paramArrayOfString, paramInt);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public boolean a()
  {
    Window localWindow = this.a.getWindow();
    return (localWindow != null) && (localWindow.peekDecorView() != null);
  }
  
  public boolean a(Fragment paramFragment)
  {
    return !this.a.isFinishing();
  }
  
  public boolean a(String paramString)
  {
    return a.a(this.a, paramString);
  }
  
  public LayoutInflater b()
  {
    return this.a.getLayoutInflater().cloneInContext(this.a);
  }
  
  public void b(Fragment paramFragment)
  {
    this.a.onAttachFragment(paramFragment);
  }
  
  public FragmentActivity c()
  {
    return this.a;
  }
  
  public void d()
  {
    this.a.supportInvalidateOptionsMenu();
  }
  
  public boolean e()
  {
    return this.a.getWindow() != null;
  }
  
  public int f()
  {
    Window localWindow = this.a.getWindow();
    if (localWindow == null) {
      return 0;
    }
    return localWindow.getAttributes().windowAnimations;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */