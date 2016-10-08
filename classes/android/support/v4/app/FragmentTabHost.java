package android.support.v4.app;

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
  private final ArrayList<as> a = new ArrayList();
  private Context b;
  private ad c;
  private int d;
  private TabHost.OnTabChangeListener e;
  private as f;
  private boolean g;
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  private at a(String paramString, at paramat)
  {
    Object localObject = null;
    int i = 0;
    if (i < this.a.size())
    {
      as localas = (as)this.a.get(i);
      if (!as.b(localas).equals(paramString)) {
        break label209;
      }
      localObject = localas;
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
      paramString = paramat;
      if (this.f != localObject)
      {
        paramString = paramat;
        if (paramat == null) {
          paramString = this.c.a();
        }
        if ((this.f != null) && (as.a(this.f) != null)) {
          paramString.d(as.a(this.f));
        }
        if (localObject != null)
        {
          if (as.a((as)localObject) != null) {
            break label197;
          }
          as.a((as)localObject, Fragment.instantiate(this.b, as.c((as)localObject).getName(), as.d((as)localObject)));
          paramString.a(this.d, as.a((as)localObject), as.b((as)localObject));
        }
      }
      for (;;)
      {
        this.f = ((as)localObject);
        return paramString;
        paramString.e(as.a((as)localObject));
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
      as localas = (as)this.a.get(i);
      as.a(localas, this.c.a(as.b(localas)));
      Object localObject2 = localObject1;
      if (as.a(localas) != null)
      {
        localObject2 = localObject1;
        if (!as.a(localas).isDetached())
        {
          if (!as.b(localas).equals(str)) {
            break label112;
          }
          this.f = localas;
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
          localObject2 = this.c.a();
        }
        ((at)localObject2).d(as.a(localas));
      }
    }
    this.g = true;
    localObject1 = a(str, (at)localObject1);
    if (localObject1 != null)
    {
      ((at)localObject1).a();
      this.c.b();
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
      at localat = a(paramString, null);
      if (localat != null) {
        localat.a();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\FragmentTabHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */