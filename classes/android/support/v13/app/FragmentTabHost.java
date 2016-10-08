package android.support.v13.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private final ArrayList<c> a = new ArrayList();
  private Context b;
  private FragmentManager c;
  private int d;
  private TabHost.OnTabChangeListener e;
  private c f;
  private boolean g;
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  private FragmentTransaction a(String paramString, FragmentTransaction paramFragmentTransaction)
  {
    Object localObject = null;
    int i = 0;
    if (i < this.a.size())
    {
      c localc = (c)this.a.get(i);
      if (!c.b(localc).equals(paramString)) {
        break label209;
      }
      localObject = localc;
    }
    label197:
    label209:
    for (;;)
    {
      i += 1;
      break;
      if (localObject == null) {
        throw new IllegalStateException("No tab known for tag " + paramString);
      }
      paramString = paramFragmentTransaction;
      if (this.f != localObject)
      {
        paramString = paramFragmentTransaction;
        if (paramFragmentTransaction == null) {
          paramString = this.c.beginTransaction();
        }
        if ((this.f != null) && (c.a(this.f) != null)) {
          paramString.detach(c.a(this.f));
        }
        if (localObject != null)
        {
          if (c.a((c)localObject) != null) {
            break label197;
          }
          c.a((c)localObject, Fragment.instantiate(this.b, c.c((c)localObject).getName(), c.d((c)localObject)));
          paramString.add(this.d, c.a((c)localObject), c.b((c)localObject));
        }
      }
      for (;;)
      {
        this.f = ((c)localObject);
        return paramString;
        paramString.attach(c.a((c)localObject));
      }
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.d = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    super.setOnTabChangedListener(this);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    Object localObject1 = null;
    int i = 0;
    if (i < this.a.size())
    {
      c localc = (c)this.a.get(i);
      c.a(localc, this.c.findFragmentByTag(c.b(localc)));
      Object localObject2 = localObject1;
      if (c.a(localc) != null)
      {
        localObject2 = localObject1;
        if (!c.a(localc).isDetached())
        {
          if (!c.b(localc).equals(str)) {
            break label112;
          }
          this.f = localc;
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        i += 1;
        localObject1 = localObject2;
        break;
        label112:
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this.c.beginTransaction();
        }
        ((FragmentTransaction)localObject2).detach(c.a(localc));
      }
    }
    this.g = true;
    localObject1 = a(str, (FragmentTransaction)localObject1);
    if (localObject1 != null)
    {
      ((FragmentTransaction)localObject1).commit();
      this.c.executePendingTransactions();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.g = false;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setCurrentTabByTag(paramParcelable.a);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.a = getCurrentTabTag();
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    if (this.g)
    {
      FragmentTransaction localFragmentTransaction = a(paramString, null);
      if (localFragmentTransaction != null) {
        localFragmentTransaction.commit();
      }
    }
    if (this.e != null) {
      this.e.onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.e = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v13\app\FragmentTabHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */