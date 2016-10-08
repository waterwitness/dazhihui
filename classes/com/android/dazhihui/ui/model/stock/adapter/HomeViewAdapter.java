package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.q;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.stock.DecisionScreen;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.stock.RecentBrowseStockScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockEditScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockMoreListScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.BgTextView;
import com.android.dazhihui.ui.widget.HomeListView;
import com.android.dazhihui.ui.widget.SelfStockSortMenuLayout;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import java.util.ArrayList;
import java.util.Vector;

public class HomeViewAdapter
  extends BaseExpandableListAdapter
  implements View.OnClickListener
{
  public static final int BROWSE_SIZE = 5;
  public static final int CACHE_SIZE = 0;
  public static final int LastColumnCJL = 2;
  public static final int LastColumnZD = 1;
  public static final int LastColumnZF = 0;
  public static int mFirstLongClick = 1;
  public static int mFirstSelfNews;
  public static int mFirstSuggest = 1;
  public static SelfStock swap;
  private String mBrowseStockName;
  private Vector<SelfStock> mBrowseVector = new Vector();
  private ArrayList<Vector<SelfStock>> mChildSelfStockList = new ArrayList();
  private SelfStock mChooseItem;
  private Context mContext;
  private int mDieColor;
  private int mFilterColor;
  private ArrayList<String> mGroupNameList = new ArrayList();
  private a mHomeFrament;
  private HomeListView mHomeListView;
  private LayoutInflater mInflater;
  private int mLastColumnType = 0;
  private y mLookFace = y.a;
  private String mRongChar;
  private SelfSelectedStockManager mSelfMgr = SelfSelectedStockManager.getInstance();
  private int mSelfStockGroupBottomMargin = 0;
  private int mSelfStockGroupTopMargin = 0;
  private String mSelfStockName;
  private SelfStockSortMenuLayout mSelfStockSortMenuLayout;
  private Vector<SelfStock> mSelfVector = new Vector();
  private HomeViewAdapter.SortMode mSortMode = HomeViewAdapter.SortMode.SORT_MODE_NONE;
  private Toast mToast;
  private View mTryLongClick;
  private int mZeroColor;
  private int mZhangColor;
  
  static
  {
    mFirstSelfNews = 1;
  }
  
  public HomeViewAdapter(Context paramContext, a parama)
  {
    this.mContext = paramContext;
    this.mHomeFrament = parama;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.mSelfStockName = this.mContext.getResources().getString(2131165549);
    this.mBrowseStockName = this.mContext.getResources().getString(2131165547);
    this.mRongChar = "R";
    this.mSelfStockGroupTopMargin = this.mContext.getResources().getDimensionPixelSize(2131230777);
    this.mSelfStockGroupBottomMargin = this.mContext.getResources().getDimensionPixelSize(2131230841);
    this.mZeroColor = this.mContext.getResources().getColor(2131493560);
    this.mDieColor = this.mContext.getResources().getColor(2131493558);
    this.mZhangColor = this.mContext.getResources().getColor(2131493561);
    this.mFilterColor = -10066330;
    paramContext = d.a();
    mFirstSuggest = paramContext.b("first_go_to_suggest", 1);
    mFirstSelfNews = paramContext.b("first_go_to_self_news", 1);
    mFirstLongClick = paramContext.b("first_long_click", 1);
    paramContext.g();
    updateFromSelfStockManager();
    this.mToast = Toast.makeText(this.mContext, "", 0);
  }
  
  private void sortCJLAsc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      while ((j > 0) && (((SelfStock)this.mSelfVector.get(j)).getTradeNumbers() < ((SelfStock)this.mSelfVector.get(j - 1)).getTradeNumbers()))
      {
        swap = (SelfStock)this.mSelfVector.get(j);
        this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
        this.mSelfVector.set(j - 1, swap);
        j -= 1;
      }
      i += 1;
    }
  }
  
  private void sortCJLDesc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      while ((j > 0) && (((SelfStock)this.mSelfVector.get(j)).getTradeNumbers() > ((SelfStock)this.mSelfVector.get(j - 1)).getTradeNumbers()))
      {
        swap = (SelfStock)this.mSelfVector.get(j);
        this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
        this.mSelfVector.set(j - 1, swap);
        j -= 1;
      }
      i += 1;
    }
  }
  
  private void sortZDAsc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      while ((j > 0) && (((SelfStock)this.mSelfVector.get(j)).getZdDouble() < ((SelfStock)this.mSelfVector.get(j - 1)).getZdDouble()))
      {
        swap = (SelfStock)this.mSelfVector.get(j);
        this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
        this.mSelfVector.set(j - 1, swap);
        j -= 1;
      }
      i += 1;
    }
  }
  
  private void sortZDDesc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      while ((j > 0) && (((SelfStock)this.mSelfVector.get(j)).getZdDouble() > ((SelfStock)this.mSelfVector.get(j - 1)).getZdDouble()))
      {
        swap = (SelfStock)this.mSelfVector.get(j);
        this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
        this.mSelfVector.set(j - 1, swap);
        j -= 1;
      }
      i += 1;
    }
  }
  
  private void sortZFAsc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      while ((j > 0) && (((SelfStock)this.mSelfVector.get(j)).getZF() < ((SelfStock)this.mSelfVector.get(j - 1)).getZF()))
      {
        swap = (SelfStock)this.mSelfVector.get(j);
        this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
        this.mSelfVector.set(j - 1, swap);
        j -= 1;
      }
      i += 1;
    }
  }
  
  private void sortZFDesc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      while ((j > 0) && (((SelfStock)this.mSelfVector.get(j)).getZF() > ((SelfStock)this.mSelfVector.get(j - 1)).getZF()))
      {
        swap = (SelfStock)this.mSelfVector.get(j);
        this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
        this.mSelfVector.set(j - 1, swap);
        j -= 1;
      }
      i += 1;
    }
  }
  
  private void sortZXAsc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      if (j > 0)
      {
        double d4 = ((SelfStock)this.mSelfVector.get(j)).latestPrice;
        double d1 = ((SelfStock)this.mSelfVector.get(j)).decLen;
        double d3 = ((SelfStock)this.mSelfVector.get(j - 1)).latestPrice;
        double d2 = ((SelfStock)this.mSelfVector.get(j - 1)).decLen;
        if (d1 >= 0.0D)
        {
          label104:
          d4 /= Math.pow(10.0D, d1);
          if (d2 < 0.0D) {
            break label205;
          }
        }
        label205:
        for (d1 = d2;; d1 = 0.0D)
        {
          if (d4 < d3 / Math.pow(10.0D, d1))
          {
            swap = (SelfStock)this.mSelfVector.get(j);
            this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
            this.mSelfVector.set(j - 1, swap);
          }
          j -= 1;
          break;
          d1 = 0.0D;
          break label104;
        }
      }
      i += 1;
    }
  }
  
  private void sortZXDesc()
  {
    int i = 1;
    while (i < this.mSelfVector.size())
    {
      int j = i;
      if (j > 0)
      {
        double d4 = ((SelfStock)this.mSelfVector.get(j)).latestPrice;
        double d1 = ((SelfStock)this.mSelfVector.get(j)).decLen;
        double d3 = ((SelfStock)this.mSelfVector.get(j - 1)).latestPrice;
        double d2 = ((SelfStock)this.mSelfVector.get(j - 1)).decLen;
        if (d1 >= 0.0D)
        {
          label104:
          d4 /= Math.pow(10.0D, d1);
          if (d2 < 0.0D) {
            break label205;
          }
        }
        label205:
        for (d1 = d2;; d1 = 0.0D)
        {
          if (d4 > d3 / Math.pow(10.0D, d1))
          {
            swap = (SelfStock)this.mSelfVector.get(j);
            this.mSelfVector.set(j, this.mSelfVector.get(j - 1));
            this.mSelfVector.set(j - 1, swap);
          }
          j -= 1;
          break;
          d1 = 0.0D;
          break label104;
        }
      }
      i += 1;
    }
  }
  
  public void changeLookFace(y paramy)
  {
    this.mLookFace = paramy;
    if (this.mLookFace == y.b)
    {
      this.mZeroColor = this.mContext.getResources().getColor(2131493623);
      this.mDieColor = this.mContext.getResources().getColor(2131493621);
    }
    for (this.mZhangColor = this.mContext.getResources().getColor(2131493624);; this.mZhangColor = this.mContext.getResources().getColor(2131493561))
    {
      notifyDataSetChanged();
      return;
      this.mZeroColor = this.mContext.getResources().getColor(2131493560);
      this.mDieColor = this.mContext.getResources().getColor(2131493558);
    }
  }
  
  public void checkFirstLongClick(SelfStock paramSelfStock)
  {
    if ((mFirstLongClick == 1) && (paramSelfStock != null) && ("SH601519".equals(paramSelfStock.getCode())))
    {
      d.a().a("first_long_click", 0);
      mFirstLongClick = 0;
      d.a().g();
      if (this.mTryLongClick != null) {
        this.mTryLongClick.setVisibility(8);
      }
    }
  }
  
  public Object getChild(int paramInt1, int paramInt2)
  {
    return ((Vector)this.mChildSelfStockList.get(paramInt1)).get(paramInt2);
  }
  
  public long getChildId(int paramInt1, int paramInt2)
  {
    return paramInt2;
  }
  
  public View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    TextView localTextView1;
    TextView localTextView2;
    TextView localTextView3;
    View localView1;
    BgTextView localBgTextView;
    Object localObject;
    View localView2;
    TextView localTextView4;
    SelfStock localSelfStock;
    label200:
    label241:
    String str3;
    if (paramView == null)
    {
      paramViewGroup = this.mInflater.inflate(2130903167, null);
      paramViewGroup.setTag(2131559271, Boolean.TRUE);
      paramView = (TextView)paramViewGroup.findViewById(2131559141);
      localTextView1 = (TextView)paramViewGroup.findViewById(2131559276);
      localTextView2 = (TextView)paramViewGroup.findViewById(2131559279);
      localTextView3 = (TextView)paramViewGroup.findViewById(2131559159);
      localView1 = paramViewGroup.findViewById(2131559280);
      localBgTextView = (BgTextView)paramViewGroup.findViewById(2131559273);
      localObject = (TextView)paramViewGroup.findViewById(2131559277);
      localObject = (BgTextView)paramViewGroup.findViewById(2131559274);
      localView2 = paramViewGroup.findViewById(2131559281);
      localTextView4 = (TextView)paramViewGroup.findViewById(2131559278);
      localSelfStock = (SelfStock)((Vector)this.mChildSelfStockList.get(paramInt1)).get(paramInt2);
      if (((Vector)this.mChildSelfStockList.get(paramInt1)).size() - 1 != paramInt2) {
        break label721;
      }
      localView2.setVisibility(8);
      if ((!"SH601519".equals(localSelfStock.getCode())) || (mFirstLongClick != 1) || (localSelfStock.getSelfType() != 0)) {
        break label730;
      }
      localTextView4.setVisibility(0);
      this.mTryLongClick = localTextView4;
      paramViewGroup.setTag(localSelfStock);
      String str1 = localSelfStock.getName();
      boolean bool = false;
      String str2 = localSelfStock.getCode();
      paramBoolean = bool;
      if (str2 != null)
      {
        paramBoolean = bool;
        if (str2.length() > 2) {
          paramBoolean = str2.substring(0, 2).equals("HH");
        }
      }
      str3 = localSelfStock.getSelfGrowthRate();
      paramView.setText(str1);
      localTextView1.setText(n.e(str2));
      localTextView2.setText(localSelfStock.getSelfLatestPrice());
      if (!localSelfStock.isLoan()) {
        break label740;
      }
      paramInt1 = 0;
      label343:
      localBgTextView.setVisibility(paramInt1);
      if (!localSelfStock.getPingTop()) {
        break label756;
      }
      if (this.mLookFace != y.b) {
        break label745;
      }
      paramViewGroup.setBackgroundResource(2130838827);
      label375:
      if (this.mLookFace != y.b) {
        break label788;
      }
      localView2.setBackgroundColor(this.mContext.getResources().getColor(2131493606));
      localTextView2.setTextColor(this.mContext.getResources().getColor(2131493626));
      paramView.setTextColor(this.mContext.getResources().getColor(2131493626));
      localTextView1.setTextColor(this.mContext.getResources().getColor(2131493625));
      localBgTextView.setBorderColor(34816);
      localBgTextView.setDisplayTextColor(-1);
      ((BgTextView)localObject).setDisplayTextColor(34816);
      localTextView4.setTextColor(34816);
      localTextView2.getPaint().setFakeBoldText(true);
      localTextView3.getPaint().setFakeBoldText(true);
      label505:
      if (!paramBoolean) {
        break label905;
      }
      localBgTextView.setVisibility(0);
      localBgTextView.setDisplayText("H");
      label523:
      if (localSelfStock.getBulletin() != 1) {
        break label917;
      }
      paramInt1 = 0;
      label534:
      ((BgTextView)localObject).setVisibility(paramInt1);
      ((BgTextView)localObject).setDisplayText("*");
      if (this.mLastColumnType != 0) {
        break label923;
      }
      localTextView3.setText(str3);
      label562:
      if (this.mLastColumnType != 2) {
        break label978;
      }
      if (this.mLookFace != y.b) {
        break label957;
      }
      localTextView3.setBackgroundColor(this.mContext.getResources().getColor(2131493620));
    }
    for (;;)
    {
      localView1.setOnClickListener(this);
      if ((this.mChooseItem != null) && (!TextUtils.isEmpty(this.mChooseItem.getCode())) && (this.mChooseItem.getCode().equals(localSelfStock.getCode())))
      {
        if (this.mLookFace != y.b) {
          break label1058;
        }
        paramViewGroup.setBackgroundColor(this.mContext.getResources().getColor(2131493618));
      }
      return paramViewGroup;
      paramViewGroup = paramView;
      if (((Boolean)paramView.getTag(2131559271)).booleanValue()) {
        break;
      }
      paramViewGroup = this.mInflater.inflate(2130903167, null);
      paramViewGroup.setTag(2131559271, Boolean.TRUE);
      break;
      label721:
      localView2.setVisibility(0);
      break label200;
      label730:
      localTextView4.setVisibility(8);
      break label241;
      label740:
      paramInt1 = 4;
      break label343;
      label745:
      paramViewGroup.setBackgroundResource(2130838747);
      break label375;
      label756:
      if (this.mLookFace == y.b)
      {
        paramViewGroup.setBackgroundResource(2130838826);
        break label375;
      }
      paramViewGroup.setBackgroundResource(2130838746);
      break label375;
      label788:
      localView2.setBackgroundColor(this.mContext.getResources().getColor(2131493556));
      localTextView2.setTextColor(localSelfStock.getColor());
      paramView.setTextColor(this.mContext.getResources().getColor(2131493563));
      localTextView1.setTextColor(this.mContext.getResources().getColor(2131493562));
      localBgTextView.setBorderColor(-2849024);
      localBgTextView.setDisplayTextColor(-16777216);
      ((BgTextView)localObject).setDisplayTextColor(-2849024);
      localTextView4.setTextColor(-2849024);
      localTextView2.getPaint().setFakeBoldText(false);
      localTextView3.getPaint().setFakeBoldText(false);
      break label505;
      label905:
      localBgTextView.setDisplayText(this.mRongChar);
      break label523;
      label917:
      paramInt1 = 8;
      break label534;
      label923:
      if (this.mLastColumnType == 1)
      {
        localTextView3.setText(localSelfStock.getSelfUpDown());
        break label562;
      }
      localTextView3.setText(localSelfStock.getSelfAggregrateValue());
      break label562;
      label957:
      localTextView3.setBackgroundColor(this.mContext.getResources().getColor(2131493557));
      continue;
      label978:
      if ((str3.equals("0.00%")) || (str3.equals("-")) || (str3.equals("--"))) {
        localTextView3.setBackgroundColor(this.mZeroColor);
      } else if (str3.indexOf("-") >= 0) {
        localTextView3.setBackgroundColor(this.mDieColor);
      } else {
        localTextView3.setBackgroundColor(this.mZhangColor);
      }
    }
    label1058:
    paramViewGroup.setBackgroundColor(this.mContext.getResources().getColor(2131493555));
    return paramViewGroup;
  }
  
  public int getChildrenCount(int paramInt)
  {
    return ((Vector)this.mChildSelfStockList.get(paramInt)).size();
  }
  
  public Object getGroup(int paramInt)
  {
    return this.mGroupNameList.get(paramInt);
  }
  
  public int getGroupCount()
  {
    return this.mGroupNameList.size();
  }
  
  public long getGroupId(int paramInt)
  {
    return paramInt;
  }
  
  public View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = (String)this.mGroupNameList.get(paramInt);
    Object localObject2;
    Object localObject3;
    LinearLayout localLinearLayout1;
    TextView localTextView1;
    ImageView localImageView;
    LinearLayout localLinearLayout2;
    TextView localTextView2;
    ViewGroup localViewGroup1;
    TextView localTextView3;
    View localView;
    FrameLayout.LayoutParams localLayoutParams;
    TextView localTextView4;
    ViewGroup localViewGroup2;
    TextView localTextView5;
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130903562, null);
      paramViewGroup = (AdvertView)paramView.findViewById(2131560261);
      paramViewGroup.a(2131493528, 2131493591, 0);
      paramViewGroup.setAdvCode(139);
      this.mHomeFrament.addAdvert(paramViewGroup);
      localObject2 = paramView.findViewById(2131559233);
      localObject3 = (RelativeLayout)paramView.findViewById(2131560253);
      localLinearLayout1 = (LinearLayout)paramView.findViewById(2131560271);
      localTextView1 = (TextView)paramView.findViewById(2131560273);
      localImageView = (ImageView)paramView.findViewById(2131560272);
      localLinearLayout2 = (LinearLayout)paramView.findViewById(2131560268);
      localTextView2 = (TextView)paramView.findViewById(2131560270);
      localViewGroup1 = (ViewGroup)paramView.findViewById(2131560263);
      localTextView3 = (TextView)paramView.findViewById(2131560266);
      localView = paramView.findViewById(2131560254);
      localLayoutParams = (FrameLayout.LayoutParams)((RelativeLayout)localObject3).getLayoutParams();
      localLayoutParams.bottomMargin = this.mSelfStockGroupBottomMargin;
      localTextView4 = (TextView)paramView.findViewById(2131561237);
      localTextView4.setText((CharSequence)this.mGroupNameList.get(paramInt));
      localViewGroup2 = (ViewGroup)paramView.findViewById(2131560256);
      localTextView5 = (TextView)paramView.findViewById(2131560259);
      if (!((String)localObject1).equals(this.mSelfStockName)) {
        break label703;
      }
      ((RelativeLayout)localObject3).setVisibility(8);
      ((View)localObject2).setVisibility(0);
      localLayoutParams.topMargin = this.mSelfStockGroupTopMargin;
      localLinearLayout1.setVisibility(0);
      localTextView1.setText(2131165288);
      if (this.mLookFace != y.b) {
        break label685;
      }
      localImageView.setImageDrawable(q.a(this.mContext, 2130838578, this.mFilterColor));
    }
    for (;;)
    {
      localLinearLayout1.setOnClickListener(this);
      localLinearLayout1.setTag(Boolean.TRUE);
      localLinearLayout2.setVisibility(0);
      localLinearLayout2.setOnClickListener(this);
      localViewGroup1.setVisibility(0);
      localViewGroup1.setOnClickListener(this);
      localViewGroup2.setVisibility(0);
      localViewGroup2.setOnClickListener(this);
      localTextView4.setVisibility(8);
      if (mFirstSuggest == 0) {
        localViewGroup2.findViewById(2131560260).setVisibility(8);
      }
      if (mFirstSelfNews == 0) {
        localViewGroup1.findViewById(2131560267).setVisibility(8);
      }
      localObject1 = (ImageView)paramView.findViewById(2131560258);
      localObject2 = (ImageView)paramView.findViewById(2131560265);
      localObject3 = (ImageView)paramView.findViewById(2131560269);
      if (this.mLookFace != y.b) {
        break label828;
      }
      paramViewGroup.setBackgroundResource(2130838821);
      localTextView4.setBackgroundResource(2131493615);
      localTextView4.setTextColor(this.mFilterColor);
      localViewGroup1.setBackgroundResource(2130838821);
      localLinearLayout2.setBackgroundResource(2130838821);
      localLinearLayout1.setBackgroundResource(2130838821);
      localViewGroup2.setBackgroundResource(2130838821);
      localTextView5.setTextColor(this.mContext.getResources().getColor(2131493616));
      localView.setBackgroundColor(this.mContext.getResources().getColor(2131493608));
      localTextView1.setTextColor(this.mFilterColor);
      localTextView2.setTextColor(this.mContext.getResources().getColor(2131493616));
      localTextView3.setTextColor(this.mContext.getResources().getColor(2131493616));
      ((ImageView)localObject1).setImageDrawable(q.a(this.mContext, 2130838582, this.mFilterColor));
      ((ImageView)localObject2).setImageDrawable(q.a(this.mContext, 2130838581, this.mFilterColor));
      ((ImageView)localObject3).setImageDrawable(q.a(this.mContext, 2130838579, this.mFilterColor));
      return paramView;
      paramViewGroup = (AdvertView)paramView.findViewById(2131560261);
      break;
      label685:
      localImageView.setImageDrawable(q.a(this.mContext, 2130838578));
    }
    label703:
    ((RelativeLayout)localObject3).setVisibility(0);
    ((View)localObject2).setVisibility(8);
    localLayoutParams.topMargin = this.mSelfStockGroupBottomMargin;
    localViewGroup1.setVisibility(4);
    localLinearLayout2.setVisibility(4);
    localLinearLayout1.setVisibility(0);
    localTextView1.setText(2131166275);
    if (this.mLookFace == y.b) {
      localImageView.setImageDrawable(q.a(this.mContext, 2130838580, this.mFilterColor));
    }
    for (;;)
    {
      localLinearLayout1.setOnClickListener(this);
      localLinearLayout1.setTag(Boolean.FALSE);
      localViewGroup2.setVisibility(8);
      localTextView4.setVisibility(0);
      break;
      localImageView.setImageDrawable(q.a(this.mContext, 2130838580));
    }
    label828:
    paramViewGroup.setBackgroundResource(2130838740);
    localTextView4.setBackgroundResource(2131493552);
    localTextView4.setTextColor(this.mContext.getResources().getColor(2131493553));
    localViewGroup1.setBackgroundResource(2130838740);
    localLinearLayout2.setBackgroundResource(2130838740);
    localLinearLayout1.setBackgroundResource(2130838740);
    localViewGroup2.setBackgroundResource(2130838740);
    localTextView5.setTextColor(this.mContext.getResources().getColor(2131493553));
    localView.setBackgroundColor(this.mContext.getResources().getColor(2131493556));
    localTextView1.setTextColor(this.mContext.getResources().getColor(2131493553));
    localTextView2.setTextColor(this.mContext.getResources().getColor(2131493553));
    localTextView3.setTextColor(this.mContext.getResources().getColor(2131493553));
    ((ImageView)localObject1).setImageDrawable(q.a(this.mContext, 2130838582));
    ((ImageView)localObject2).setImageDrawable(q.a(this.mContext, 2130838581));
    ((ImageView)localObject3).setImageDrawable(q.a(this.mContext, 2130838579));
    return paramView;
  }
  
  public int getLastColumnType()
  {
    return this.mLastColumnType;
  }
  
  public Vector<String> getRefreshStock()
  {
    Vector localVector = new Vector();
    if ((this.mHomeListView == null) || (this.mSelfVector == null) || (this.mBrowseVector == null)) {
      return localVector;
    }
    int k = this.mHomeListView.getFirstVisibleItem();
    int m = this.mHomeListView.getVisibleItemCount();
    int i = Math.max(0, k - 2 + 0);
    while ((i < this.mSelfVector.size()) && (i < k + m - 2 + 0))
    {
      localVector.add(((SelfStock)this.mSelfVector.get(i)).getCode());
      i += 1;
    }
    int j = Math.max(0, k - this.mSelfVector.size() - 2 + 0);
    i = k + m - this.mSelfVector.size() - 2 + 0;
    if (this.mSelfVector.size() != 0) {
      i -= 1;
    }
    for (;;)
    {
      if ((j < this.mBrowseVector.size()) && (j < i))
      {
        localVector.add(((SelfStock)this.mBrowseVector.get(j)).getCode());
        j += 1;
      }
      else
      {
        return localVector;
      }
    }
  }
  
  public Vector<SelfStock> getSelfStockVector()
  {
    return this.mSelfVector;
  }
  
  public HomeViewAdapter.SortMode getSortMode()
  {
    return this.mSortMode;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public void notifyDataSetChanged()
  {
    int k = 0;
    super.notifyDataSetChanged();
    int i;
    int j;
    if (g.a().L())
    {
      if (this.mSelfVector == null) {
        break label134;
      }
      i = this.mSelfVector.size();
      if (this.mBrowseVector == null) {
        break label139;
      }
      j = this.mBrowseVector.size();
      label46:
      if ((this.mSelfVector == null) || (this.mSelfVector.size() <= 0)) {
        break label144;
      }
    }
    label134:
    label139:
    label144:
    for (SelfStock localSelfStock = (SelfStock)this.mSelfVector.get(0);; localSelfStock = null)
    {
      if (localSelfStock != null) {
        k = localSelfStock.getLatestPrice();
      }
      Log.i("s2978", "HomeViewAdapter notifyDataSetChanged 自选股数量=" + i + " 最新浏览数量" + j + " 第一个自选股最新价=" + k);
      return;
      i = 0;
      break;
      j = 0;
      break label46;
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559280: 
      int i;
      if (this.mLastColumnType == 0)
      {
        this.mLastColumnType = 1;
        i = 2131165342;
      }
      for (;;)
      {
        if (this.mSelfStockSortMenuLayout != null) {
          this.mSelfStockSortMenuLayout.a();
        }
        notifyDataSetChanged();
        paramView = this.mContext.getResources().getString(i);
        if ((this.mToast == null) || (TextUtils.isEmpty(paramView))) {
          break;
        }
        this.mToast.setText(paramView);
        this.mToast.show();
        return;
        if (this.mLastColumnType == 1)
        {
          this.mLastColumnType = 2;
          i = 2131165341;
        }
        else
        {
          this.mLastColumnType = 0;
          i = 2131165343;
        }
      }
    case 2131560268: 
      n.a("", 1186);
      this.mContext.startActivity(new Intent(this.mContext, SelfStockMoreListScreen.class));
      return;
    case 2131560271: 
      paramView = (Boolean)paramView.getTag();
      if ((paramView != null) && (paramView.booleanValue()))
      {
        n.a("", 1177);
        this.mContext.startActivity(new Intent(this.mContext, SelfStockEditScreen.class));
        return;
      }
      this.mContext.startActivity(new Intent(this.mContext, RecentBrowseStockScreen.class));
      return;
    case 2131560263: 
      if (mFirstSelfNews == 1)
      {
        d.a().a("first_go_to_self_news", 0);
        mFirstSelfNews = 0;
        d.a().g();
      }
      n.a("", 1148);
      paramView = new Intent(this.mContext, MoreNewsListScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("url", "1");
      localBundle.putInt("type", 2);
      localBundle.putString("name", this.mContext.getResources().getString(2131166276));
      paramView.putExtras(localBundle);
      this.mContext.startActivity(paramView);
      return;
    }
    if (mFirstSuggest == 1)
    {
      d.a().a("first_go_to_suggest", 0);
      mFirstSuggest = 0;
      d.a().g();
    }
    n.a("", 1237);
    this.mContext.startActivity(new Intent(this.mContext, DecisionScreen.class));
  }
  
  public void requestSort()
  {
    if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_NONE) {
      updateFromSelfStockManager();
    }
    for (;;)
    {
      return;
      if ((this.mSelfVector != null) && (this.mSelfVector.size() > 0))
      {
        if (g.a().L()) {
          Log.i("ssort", "排序开始 size=" + this.mSelfVector.size());
        }
        if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZX_ASC) {
          sortZXAsc();
        }
        while (g.a().L())
        {
          Log.i("ssort", "排序结束 size=" + this.mSelfVector.size());
          return;
          if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZX_DESC) {
            sortZXDesc();
          } else if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZF_DESC) {
            sortZFDesc();
          } else if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZF_ASC) {
            sortZFAsc();
          } else if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_CJL_ASC) {
            sortCJLAsc();
          } else if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_CJL_DESC) {
            sortCJLDesc();
          } else if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZD_DESC) {
            sortZDDesc();
          } else if (this.mSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZD_ASC) {
            sortZDAsc();
          }
        }
      }
    }
  }
  
  public void setGroupList(ArrayList<String> paramArrayList)
  {
    this.mGroupNameList = paramArrayList;
  }
  
  public void setHolder(HomeListView paramHomeListView)
  {
    this.mHomeListView = paramHomeListView;
    if (this.mHomeListView != null)
    {
      if ((this.mSelfVector == null) || (this.mSelfVector.size() <= 0)) {
        break label54;
      }
      this.mHomeListView.setAddSelfStockLayoutVisibility(8);
    }
    for (;;)
    {
      this.mHomeListView.setOnItemLongClickListener(new HomeViewAdapter.1(this));
      return;
      label54:
      this.mHomeListView.setAddSelfStockLayoutVisibility(0);
    }
  }
  
  public void setSelfStockSortMenuLayout(SelfStockSortMenuLayout paramSelfStockSortMenuLayout)
  {
    this.mSelfStockSortMenuLayout = paramSelfStockSortMenuLayout;
  }
  
  public void setSortMode(HomeViewAdapter.SortMode paramSortMode)
  {
    if (this.mSortMode != paramSortMode)
    {
      this.mSortMode = paramSortMode;
      requestSort();
      notifyDataSetChanged();
    }
  }
  
  public void updateFromSelfStockManager()
  {
    this.mGroupNameList.clear();
    this.mChildSelfStockList.clear();
    if (this.mSelfVector != null)
    {
      this.mSelfVector.clear();
      if (this.mBrowseVector == null) {
        break label238;
      }
      this.mBrowseVector.clear();
      label42:
      Vector localVector1 = SelfSelectedStockManager.getInstance().getSelfStockVector();
      Vector localVector2 = SelfSelectedStockManager.getInstance().getBrowseStockVector(0, 4);
      this.mSelfVector.addAll(localVector1);
      if (SelfSelectedStockManager.getBoolean("selfstock_show_latest", this.mContext, "selfstock_show_latest", true)) {
        this.mBrowseVector.addAll(localVector2);
      }
      if ((this.mSelfVector == null) || (this.mSelfVector.size() <= 0)) {
        break label252;
      }
      this.mGroupNameList.add(this.mSelfStockName);
      this.mChildSelfStockList.add(this.mSelfVector);
      if (this.mHomeListView != null) {
        this.mHomeListView.setAddSelfStockLayoutVisibility(8);
      }
    }
    for (;;)
    {
      if ((this.mBrowseVector != null) && (this.mBrowseVector.size() > 0))
      {
        this.mGroupNameList.add(this.mBrowseStockName);
        this.mChildSelfStockList.add(this.mBrowseVector);
      }
      if (this.mSortMode != HomeViewAdapter.SortMode.SORT_MODE_NONE) {
        requestSort();
      }
      if (this.mHomeListView != null) {
        this.mHomeListView.a();
      }
      notifyDataSetChanged();
      return;
      this.mSelfVector = new Vector();
      break;
      label238:
      this.mBrowseVector = new Vector();
      break label42;
      label252:
      if (this.mHomeListView != null) {
        this.mHomeListView.setAddSelfStockLayoutVisibility(0);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\HomeViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */