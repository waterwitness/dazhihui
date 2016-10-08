package com.android.dazhihui.ui.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.ui.model.stock.WisdomHostManager;
import com.android.dazhihui.ui.model.stock.WisdomHostVo.HotMsgs;
import com.android.dazhihui.ui.widget.adv.GifView;
import com.android.dazhihui.ui.widget.flip.ViewUpFlow;
import java.util.ArrayList;
import java.util.List;

public class WisdomHot
  extends FrameLayout
{
  List<WisdomHostVo.HotMsgs> a = new ArrayList();
  BaseAdapter b = new nn(this);
  
  public WisdomHot(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public WisdomHot(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a()
  {
    setVisibility(8);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(0);
    GifView localGifView = new GifView(getContext());
    Object localObject = new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(2131230799));
    ((LinearLayout.LayoutParams)localObject).gravity = 16;
    ((LinearLayout.LayoutParams)localObject).leftMargin = getResources().getDimensionPixelSize(2131230788);
    ((LinearLayout.LayoutParams)localObject).rightMargin = getResources().getDimensionPixelSize(2131230829);
    localLinearLayout.addView(localGifView, (ViewGroup.LayoutParams)localObject);
    localObject = new ViewUpFlow(getContext());
    ((ViewUpFlow)localObject).setAdapter(this.b);
    ((ViewUpFlow)localObject).a(4000);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    localLayoutParams.weight = 1.0F;
    localLayoutParams.gravity = 16;
    localLayoutParams.rightMargin = getResources().getDimensionPixelSize(2131230783);
    localLinearLayout.addView((View)localObject, localLayoutParams);
    addView(localLinearLayout, -1, -1);
    WisdomHostManager.getConfig(new nl(this, localGifView));
  }
  
  public void a(String paramString)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext());
    localBuilder.setTitle("智慧热点");
    localBuilder.setMessage(paramString);
    localBuilder.setPositiveButton("确定", new np(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\WisdomHot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */