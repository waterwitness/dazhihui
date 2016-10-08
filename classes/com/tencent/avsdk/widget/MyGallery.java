package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.e;
import com.tencent.avsdk.activity.HotVideoListFragment;

public class MyGallery
  extends HorizontalScrollView
{
  public static int selectedId = 0;
  private int deltaX;
  private boolean isShowMaxNumUsable = false;
  LinearLayout linearLayout;
  private BaseAdapter mAdapter;
  private Context mContext;
  MyGallery.AdapterDataSetObserver mDataSetObserver;
  private int mItemCount;
  private int mItemSpace = 20;
  private Runnable mTabSelector;
  private e myfragment;
  private AdapterView.OnItemSelectedListener onItemSelectedListener;
  private int showMaxNum = 5;
  
  public MyGallery(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    initView();
  }
  
  public MyGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    initView();
  }
  
  private void initView()
  {
    this.linearLayout = new LinearLayout(this.mContext);
    this.linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.linearLayout.setOrientation(0);
    addView(this.linearLayout);
  }
  
  private void resetChildViews()
  {
    int k = 0;
    int j;
    boolean bool1;
    int i;
    if ((this.mAdapter != null) && (this.mAdapter.getCount() > 0))
    {
      j = g.a().m();
      if ((this.myfragment == null) || (!(this.myfragment instanceof HotVideoListFragment))) {
        break label364;
      }
      boolean bool2 = ((HotVideoListFragment)this.myfragment).getMyHongBaoShow();
      bool1 = bool2;
      i = j;
      if (bool2)
      {
        i = j - getResources().getDimensionPixelOffset(2131230838) / 4 * 5;
        this.showMaxNum = 4;
        bool1 = bool2;
      }
    }
    for (;;)
    {
      this.deltaX = (i / 4);
      int m = this.mAdapter.getCount();
      View localView;
      if ((this.isShowMaxNumUsable == true) && (m > 0))
      {
        localView = this.mAdapter.getView(0, null, null);
        localView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        j = localView.getMeasuredWidth();
      }
      for (;;)
      {
        if (k < m)
        {
          localView = this.mAdapter.getView(k, null, null);
          localView.setOnClickListener(new MyGallery.1(this, k, this.mAdapter.getItemId(k)));
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
          if (k != 0) {
            localLayoutParams.leftMargin = this.mItemSpace;
          }
          if (this.isShowMaxNumUsable)
          {
            if (this.mAdapter.getCount() > this.showMaxNum) {
              break label305;
            }
            this.mItemSpace = ((i - j * m) / (m * 2));
            label261:
            if (k != 0) {
              break label346;
            }
            if (!bool1) {
              break label335;
            }
            localLayoutParams.leftMargin = this.mItemSpace;
          }
          for (;;)
          {
            localLayoutParams.rightMargin = this.mItemSpace;
            this.linearLayout.addView(localView, localLayoutParams);
            k += 1;
            break;
            label305:
            this.mItemSpace = ((i - j / 2 - this.showMaxNum * j) / (this.showMaxNum * 2 + 1));
            break label261;
            label335:
            localLayoutParams.leftMargin = this.mItemSpace;
            continue;
            label346:
            localLayoutParams.leftMargin = this.mItemSpace;
          }
        }
        return;
        j = 0;
      }
      label364:
      bool1 = false;
      i = j;
    }
  }
  
  public void animateToTab(int paramInt)
  {
    if (this.linearLayout == null) {}
    while (paramInt >= this.linearLayout.getChildCount()) {
      return;
    }
    View localView = this.linearLayout.getChildAt(paramInt);
    if (this.mTabSelector != null) {
      removeCallbacks(this.mTabSelector);
    }
    this.mTabSelector = new MyGallery.2(this, localView);
    post(this.mTabSelector);
  }
  
  public long getItemIdAtPosition(int paramInt)
  {
    if ((this.mAdapter == null) || (paramInt < 0)) {}
    for (Long localLong = null;; localLong = Long.valueOf(this.mAdapter.getItemId(paramInt))) {
      return localLong.longValue();
    }
  }
  
  public int getSelectedItemPosition()
  {
    return selectedId;
  }
  
  void resetList()
  {
    this.linearLayout.removeAllViewsInLayout();
    this.linearLayout.requestLayout();
    this.linearLayout.invalidate();
  }
  
  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    if ((this.mAdapter != null) && (this.mDataSetObserver != null)) {
      this.mAdapter.unregisterDataSetObserver(this.mDataSetObserver);
    }
    resetList();
    this.mAdapter = paramBaseAdapter;
    if (this.mAdapter != null)
    {
      this.mDataSetObserver = new MyGallery.AdapterDataSetObserver(this);
      this.mAdapter.registerDataSetObserver(this.mDataSetObserver);
      resetChildViews();
    }
  }
  
  public void setHold(e parame)
  {
    this.myfragment = parame;
  }
  
  public void setItemSelected(int paramInt)
  {
    selectedId = paramInt;
    View localView = this.mAdapter.getView(paramInt, null, null);
    this.onItemSelectedListener.onItemSelected(null, localView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.onItemSelectedListener = paramOnItemSelectedListener;
  }
  
  public void setShowMaxNum(int paramInt, boolean paramBoolean)
  {
    this.showMaxNum = paramInt;
    this.isShowMaxNumUsable = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\MyGallery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */