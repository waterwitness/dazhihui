package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class bt
  extends br
{
  static Field b;
  static boolean c = false;
  
  public void a(View paramView, a parama)
  {
    if (parama == null) {}
    for (parama = null;; parama = parama.a())
    {
      cf.a(paramView, parama);
      return;
    }
  }
  
  public boolean a(View paramView, int paramInt)
  {
    return cf.a(paramView, paramInt);
  }
  
  /* Error */
  public boolean b(View paramView)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: getstatic 12	android/support/v4/view/bt:c	Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: getstatic 36	android/support/v4/view/bt:b	Ljava/lang/reflect/Field;
    //   13: ifnonnull +20 -> 33
    //   16: ldc 38
    //   18: ldc 40
    //   20: invokevirtual 46	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   23: putstatic 36	android/support/v4/view/bt:b	Ljava/lang/reflect/Field;
    //   26: getstatic 36	android/support/v4/view/bt:b	Ljava/lang/reflect/Field;
    //   29: iconst_1
    //   30: invokevirtual 52	java/lang/reflect/Field:setAccessible	(Z)V
    //   33: getstatic 36	android/support/v4/view/bt:b	Ljava/lang/reflect/Field;
    //   36: aload_1
    //   37: invokevirtual 56	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   40: astore_1
    //   41: aload_1
    //   42: ifnull +12 -> 54
    //   45: iload_2
    //   46: ireturn
    //   47: astore_1
    //   48: iconst_1
    //   49: putstatic 12	android/support/v4/view/bt:c	Z
    //   52: iconst_0
    //   53: ireturn
    //   54: iconst_0
    //   55: istore_2
    //   56: goto -11 -> 45
    //   59: astore_1
    //   60: iconst_1
    //   61: putstatic 12	android/support/v4/view/bt:c	Z
    //   64: iconst_0
    //   65: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	bt
    //   0	66	1	paramView	View
    //   1	55	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	33	47	java/lang/Throwable
    //   33	41	59	java/lang/Throwable
  }
  
  public boolean b(View paramView, int paramInt)
  {
    return cf.b(paramView, paramInt);
  }
  
  public dr r(View paramView)
  {
    if (this.a == null) {
      this.a = new WeakHashMap();
    }
    dr localdr2 = (dr)this.a.get(paramView);
    dr localdr1 = localdr2;
    if (localdr2 == null)
    {
      localdr1 = new dr(paramView);
      this.a.put(paramView, localdr1);
    }
    return localdr1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */