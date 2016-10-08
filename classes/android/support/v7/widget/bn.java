package android.support.v7.widget;

import android.view.View;

class bn
{
  static int a(bh parambh, ad paramad, View paramView1, View paramView2, aw paramaw, boolean paramBoolean)
  {
    if ((paramaw.r() == 0) || (parambh.e() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return Math.abs(paramaw.d(paramView1) - paramaw.d(paramView2)) + 1;
    }
    int i = paramad.b(paramView2);
    int j = paramad.a(paramView1);
    return Math.min(paramad.f(), i - j);
  }
  
  static int a(bh parambh, ad paramad, View paramView1, View paramView2, aw paramaw, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (paramaw.r() != 0)
    {
      j = i;
      if (parambh.e() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null) {
            break label45;
          }
          j = i;
        }
      }
    }
    return j;
    label45:
    i = Math.min(paramaw.d(paramView1), paramaw.d(paramView2));
    j = Math.max(paramaw.d(paramView1), paramaw.d(paramView2));
    if (paramBoolean2) {}
    for (i = Math.max(0, parambh.e() - j - 1);; i = Math.max(0, i))
    {
      j = i;
      if (!paramBoolean1) {
        break;
      }
      j = Math.abs(paramad.b(paramView2) - paramad.a(paramView1));
      int k = Math.abs(paramaw.d(paramView1) - paramaw.d(paramView2));
      float f = j / (k + 1);
      return Math.round(i * f + (paramad.c() - paramad.a(paramView1)));
    }
  }
  
  static int b(bh parambh, ad paramad, View paramView1, View paramView2, aw paramaw, boolean paramBoolean)
  {
    if ((paramaw.r() == 0) || (parambh.e() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return parambh.e();
    }
    int i = paramad.b(paramView2);
    int j = paramad.a(paramView1);
    int k = Math.abs(paramaw.d(paramView1) - paramaw.d(paramView2));
    return (int)((i - j) / (k + 1) * parambh.e());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */