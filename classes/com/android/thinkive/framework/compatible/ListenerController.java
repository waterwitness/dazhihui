package com.android.thinkive.framework.compatible;

import android.content.Context;
import android.view.View;

public abstract interface ListenerController
{
  public static final int NONE = 0;
  public static final int ON_CHECK = 7974914;
  @Deprecated
  public static final int ON_CHILDCLICK = 7974918;
  public static final int ON_CHILD_CLICK = 7974918;
  public static final int ON_CLICK = 7974913;
  public static final int ON_ITEM_CLICK = 7974916;
  @Deprecated
  public static final int ON_LONGCLICK = 7974919;
  public static final int ON_LONG_CLICK = 7974919;
  @Deprecated
  public static final int ON_MENUITEM_CLICK = 7974921;
  public static final int ON_MENU_ITEM_CLICK = 7974921;
  @Deprecated
  public static final int ON_SCROLLCHANGE = 7974920;
  public static final int ON_SCROLL_CHANGE = 7974920;
  public static final int ON_SELECT = 7974915;
  public static final int ON_TOUCH = 7974917;
  
  public abstract Context getContext();
  
  public abstract TaskScheduler getTaskScheduler();
  
  public abstract void register(int paramInt, View paramView);
  
  public abstract void setContext(Context paramContext);
  
  public abstract void setTaskScheduler(TaskScheduler paramTaskScheduler);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\ListenerController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */