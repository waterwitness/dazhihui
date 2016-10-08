package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.c.q;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FragmentActivity
  extends s
  implements c, i
{
  static final String FRAGMENTS_TAG = "android:support:fragments";
  private static final int HONEYCOMB = 11;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  private static final String TAG = "FragmentActivity";
  boolean mCreated;
  final ab mFragments = ab.a(new y(this));
  final Handler mHandler = new x(this);
  android.support.v4.media.session.a mMediaController;
  boolean mOptionsMenuInvalidated;
  boolean mReallyStopped;
  boolean mRequestedPermissionsFromFragment;
  boolean mResumed;
  boolean mRetaining;
  boolean mStopped;
  
  private void dumpViewHierarchy(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(viewToString(paramView));
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        if (j > 0)
        {
          paramString = paramString + "  ";
          int i = 0;
          while (i < j)
          {
            dumpViewHierarchy(paramString, paramPrintWriter, paramView.getChildAt(i));
            i += 1;
          }
        }
      }
    }
  }
  
  private void requestPermissionsFromFragment(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    if (paramInt == -1)
    {
      a.a(this, paramArrayOfString, paramInt);
      return;
    }
    if ((paramInt & 0xFF00) != 0) {
      throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
    }
    this.mRequestedPermissionsFromFragment = true;
    a.a(this, paramArrayOfString, (paramFragment.mIndex + 1 << 8) + (paramInt & 0xFF));
  }
  
  private static String viewToString(View paramView)
  {
    char c3 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c1;
    label118:
    label135:
    label152:
    label169:
    label186:
    label203:
    label220:
    label244:
    label261:
    int i;
    Object localObject;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append('.');
      if (paramView.isFocusable())
      {
        c1 = 'F';
        localStringBuilder.append(c1);
        if (!paramView.isEnabled()) {
          break label562;
        }
        c1 = 'E';
        localStringBuilder.append(c1);
        if (!paramView.willNotDraw()) {
          break label568;
        }
        c1 = '.';
        localStringBuilder.append(c1);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label574;
        }
        c1 = 'H';
        localStringBuilder.append(c1);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label580;
        }
        c1 = 'V';
        localStringBuilder.append(c1);
        if (!paramView.isClickable()) {
          break label586;
        }
        c1 = 'C';
        localStringBuilder.append(c1);
        if (!paramView.isLongClickable()) {
          break label592;
        }
        c1 = 'L';
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label598;
        }
        c1 = c3;
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label604;
        }
        c1 = 'S';
        localStringBuilder.append(c1);
        c1 = c2;
        if (paramView.isPressed()) {
          c1 = 'P';
        }
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localObject = paramView.getResources();
          if ((i != 0) && (localObject != null)) {
            switch (0xFF000000 & i)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(i);
        String str = ((Resources)localObject).getResourceTypeName(i);
        localObject = ((Resources)localObject).getResourceEntryName(i);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Resources.NotFoundException paramView)
      {
        label562:
        label568:
        label574:
        label580:
        label586:
        label592:
        label598:
        label604:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c1 = '.';
      break label118;
      c1 = '.';
      break label135;
      c1 = 'D';
      break label152;
      c1 = '.';
      break label169;
      c1 = '.';
      break label186;
      c1 = '.';
      break label203;
      c1 = '.';
      break label220;
      c1 = '.';
      break label244;
      c1 = '.';
      break label261;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  final View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.mFragments.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  void doReallyStop(boolean paramBoolean)
  {
    if (!this.mReallyStopped)
    {
      this.mReallyStopped = true;
      this.mRetaining = paramBoolean;
      this.mHandler.removeMessages(1);
      onReallyStop();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.mCreated);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.mStopped);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.mReallyStopped);
    this.mFragments.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    this.mFragments.a().a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    dumpViewHierarchy(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  public Object getLastCustomNonConfigurationInstance()
  {
    z localz = (z)getLastNonConfigurationInstance();
    if (localz != null) {
      return localz.a;
    }
    return null;
  }
  
  public ad getSupportFragmentManager()
  {
    return this.mFragments.a();
  }
  
  public bb getSupportLoaderManager()
  {
    return this.mFragments.b();
  }
  
  public final android.support.v4.media.session.a getSupportMediaController()
  {
    return this.mMediaController;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mFragments.d();
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      i -= 1;
      int j = this.mFragments.c();
      if ((j == 0) || (i < 0) || (i >= j))
      {
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      Fragment localFragment = (Fragment)this.mFragments.a(new ArrayList(j)).get(i);
      if (localFragment == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      localFragment.onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onBackPressed()
  {
    if (!this.mFragments.a().c()) {
      supportFinishAfterTransition();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.mFragments.a(null);
    super.onCreate(paramBundle);
    z localz = (z)getLastNonConfigurationInstance();
    if (localz != null) {
      this.mFragments.a(localz.c);
    }
    Parcelable localParcelable;
    ab localab;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localab = this.mFragments;
      if (localz == null) {
        break label80;
      }
    }
    label80:
    for (paramBundle = localz.b;; paramBundle = null)
    {
      localab.a(localParcelable, paramBundle);
      this.mFragments.g();
      return;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      boolean bool2 = this.mFragments.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11) {
        return bool1 | bool2;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    doReallyStop(false);
    this.mFragments.n();
    this.mFragments.r();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.o();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return this.mFragments.a(paramMenuItem);
    }
    return this.mFragments.b(paramMenuItem);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.mFragments.d();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.mFragments.b(paramMenu);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.mResumed = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      onResumeFragments();
    }
    this.mFragments.k();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    onResumeFragments();
    this.mFragments.p();
  }
  
  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.mOptionsMenuInvalidated)
      {
        this.mOptionsMenuInvalidated = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return onPrepareOptionsPanel(paramView, paramMenu) | this.mFragments.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  void onReallyStop()
  {
    this.mFragments.a(this.mRetaining);
    this.mFragments.m();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = paramInt >> 8 & 0xFF;
    int j;
    if (i != 0)
    {
      i -= 1;
      j = this.mFragments.c();
      if ((j == 0) || (i < 0) || (i >= j)) {
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt));
      }
    }
    else
    {
      return;
    }
    Fragment localFragment = (Fragment)this.mFragments.a(new ArrayList(j)).get(i);
    if (localFragment == null)
    {
      Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt));
      return;
    }
    localFragment.onRequestPermissionsResult(paramInt & 0xFF, paramArrayOfString, paramArrayOfInt);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.p();
  }
  
  protected void onResumeFragments()
  {
    this.mFragments.j();
  }
  
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    if (this.mStopped) {
      doReallyStop(true);
    }
    Object localObject = onRetainCustomNonConfigurationInstance();
    List localList = this.mFragments.f();
    q localq = this.mFragments.t();
    if ((localList == null) && (localq == null) && (localObject == null)) {
      return null;
    }
    z localz = new z();
    localz.a = localObject;
    localz.b = localList;
    localz.c = localq;
    return localz;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.mFragments.e();
    if (localParcelable != null) {
      paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    this.mHandler.removeMessages(1);
    if (!this.mCreated)
    {
      this.mCreated = true;
      this.mFragments.h();
    }
    this.mFragments.d();
    this.mFragments.p();
    this.mFragments.q();
    this.mFragments.i();
    this.mFragments.s();
  }
  
  public void onStateNotSaved()
  {
    this.mFragments.d();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.mStopped = true;
    this.mHandler.sendEmptyMessage(1);
    this.mFragments.l();
  }
  
  public void setEnterSharedElementCallback(da paramda)
  {
    a.a(this, paramda);
  }
  
  public void setExitSharedElementCallback(da paramda)
  {
    a.b(this, paramda);
  }
  
  public final void setSupportMediaController(android.support.v4.media.session.a parama)
  {
    this.mMediaController = parama;
    if (Build.VERSION.SDK_INT >= 21) {
      e.a(this, parama.a());
    }
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, (paramFragment.mIndex + 1 << 16) + (0xFFFF & paramInt));
  }
  
  public void supportFinishAfterTransition()
  {
    a.a(this);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      j.a(this);
      return;
    }
    this.mOptionsMenuInvalidated = true;
  }
  
  public void supportPostponeEnterTransition()
  {
    a.b(this);
  }
  
  public void supportStartPostponedEnterTransition()
  {
    a.c(this);
  }
  
  public final void validateRequestPermissionsRequestCode(int paramInt)
  {
    if (this.mRequestedPermissionsFromFragment) {
      this.mRequestedPermissionsFromFragment = false;
    }
    while ((paramInt & 0xFF00) == 0) {
      return;
    }
    throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\FragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */