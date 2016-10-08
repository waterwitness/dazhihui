package com.android.dazhihui.ui.model.stock.market;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.BgTextView;
import java.util.List;

public class MarketHSListAdapter
  extends MarketListAdapter
{
  public static final int TYPE_CJE = 6;
  public static final int TYPE_CJL = 5;
  public static final int TYPE_DDX = 4;
  public static final int TYPE_FIVEZDF = 1;
  public static final int TYPE_FUND_FLOW = 2;
  public static final int TYPE_HAND_OVER = 3;
  public static final int TYPE_NORMAL = 0;
  private int mDieColor;
  private y mLookFace = y.a;
  private int mZeroColor;
  private int mZhangColor;
  private int marketType;
  
  public MarketHSListAdapter() {}
  
  public MarketHSListAdapter(List<MarketStockVo> paramList, int paramInt1, Context paramContext, MarketAdapterItmeOnClickListener paramMarketAdapterItmeOnClickListener, int paramInt2)
  {
    this.dataList = paramList;
    this.mType = paramInt1;
    this.mContext = paramContext;
    this.clickListener = paramMarketAdapterItmeOnClickListener;
    this.marketType = paramInt2;
    this.mZeroColor = this.mContext.getResources().getColor(2131493560);
    this.mDieColor = this.mContext.getResources().getColor(2131493558);
    this.mZhangColor = this.mContext.getResources().getColor(2131493561);
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
  
  public int getCount()
  {
    if ((this.dataList != null) && (this.dataList.size() > 0)) {
      return this.dataList.size();
    }
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    label234:
    label378:
    Object localObject;
    if (paramView == null)
    {
      paramViewGroup = new MarketHSListAdapter.Holder(this);
      paramView = LayoutInflater.from(this.mContext).inflate(2130903272, null);
      paramViewGroup.name = ((TextView)paramView.findViewById(2131559821));
      paramViewGroup.zx = ((TextView)paramView.findViewById(2131559822));
      paramViewGroup.zf = ((TextView)paramView.findViewById(2131559823));
      paramViewGroup.plate_item_right_layout = ((RelativeLayout)paramView.findViewById(2131559824));
      paramViewGroup.plate_item_right_stockname = ((TextView)paramView.findViewById(2131559825));
      paramViewGroup.plate_item_right_stock_zx = ((TextView)paramView.findViewById(2131559826));
      paramViewGroup.plate_item_right_stock_zf = ((TextView)paramView.findViewById(2131559827));
      paramViewGroup.rongView = ((BgTextView)paramView.findViewById(2131559273));
      paramViewGroup.starMark = ((TextView)paramView.findViewById(2131559274));
      paramView.setTag(paramViewGroup);
      if (this.mLookFace != y.b) {
        break label640;
      }
      paramView.setBackgroundResource(2130838814);
      paramViewGroup.name.setTextColor(this.mContext.getResources().getColor(2131493609));
      paramViewGroup.rongView.setBorderColor(34816);
      paramViewGroup.rongView.setDisplayTextColor(-1);
      paramViewGroup.starMark.setTextColor(34816);
      paramViewGroup.zx.getPaint().setFakeBoldText(true);
      paramViewGroup.zf.getPaint().setFakeBoldText(true);
      if (this.marketType != 1) {
        break label773;
      }
      paramViewGroup.zf.setVisibility(8);
      paramViewGroup.plate_item_right_layout.setVisibility(0);
      paramViewGroup.rongView.setVisibility(4);
      paramViewGroup.starMark.setVisibility(8);
      if ((this.dataList != null) && (this.dataList.size() > 0))
      {
        if ((!((MarketStockVo)this.dataList.get(paramInt)).getCfgZf().equals("0.00%")) && (!((MarketStockVo)this.dataList.get(paramInt)).getCfgZf().equals("-")) && (!((MarketStockVo)this.dataList.get(paramInt)).getCfgZf().equals("--"))) {
          break label721;
        }
        paramViewGroup.plate_item_right_layout.setBackgroundColor(this.mZeroColor);
        String str = ((MarketStockVo)this.dataList.get(paramInt)).getBkZf();
        localObject = str;
        if ("-".equals(str)) {
          localObject = "  0.00%";
        }
        paramViewGroup.zx.setText((CharSequence)localObject);
        paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getBkColor());
        paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getZf());
        paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
      }
    }
    for (;;)
    {
      if ((this.dataList != null) && (this.dataList.size() > 0))
      {
        paramViewGroup.name.setText(((MarketStockVo)this.dataList.get(paramInt)).getStockName());
        paramViewGroup.plate_item_right_stockname.setText(((MarketStockVo)this.dataList.get(paramInt)).getCfgName());
        paramViewGroup.plate_item_right_stock_zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getCfgZx());
        paramViewGroup.plate_item_right_stock_zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getCfgZf());
        paramViewGroup.plate_item_right_stockname.setTextColor(-1);
        paramViewGroup.plate_item_right_stock_zx.setTextColor(-1);
        paramViewGroup.plate_item_right_stock_zf.setTextColor(-1);
      }
      return paramView;
      paramViewGroup = (MarketHSListAdapter.Holder)paramView.getTag();
      break;
      label640:
      paramView.setBackgroundResource(2130838732);
      paramViewGroup.name.setTextColor(this.mContext.getResources().getColor(2131493546));
      paramViewGroup.rongView.setBorderColor(-2849024);
      paramViewGroup.rongView.setDisplayTextColor(-16777216);
      paramViewGroup.starMark.setTextColor(-2849024);
      paramViewGroup.zx.getPaint().setFakeBoldText(false);
      paramViewGroup.zf.getPaint().setFakeBoldText(false);
      break label234;
      label721:
      if (((MarketStockVo)this.dataList.get(paramInt)).getCfgZf().indexOf("-") >= 0)
      {
        paramViewGroup.plate_item_right_layout.setBackgroundColor(this.mDieColor);
        break label378;
      }
      paramViewGroup.plate_item_right_layout.setBackgroundColor(this.mZhangColor);
      break label378;
      label773:
      paramViewGroup.zf.setVisibility(0);
      paramViewGroup.plate_item_right_layout.setVisibility(8);
      if ((this.dataList != null) && (this.dataList.size() > 0))
      {
        localObject = paramViewGroup.starMark;
        int i;
        if (((MarketStockVo)this.dataList.get(paramInt)).ggss > 0)
        {
          i = 0;
          label837:
          ((TextView)localObject).setVisibility(i);
          if (!((MarketStockVo)this.dataList.get(paramInt)).isLoanable()) {
            break label991;
          }
          paramViewGroup.rongView.setDisplayText("R");
          paramViewGroup.rongView.setVisibility(0);
        }
        for (;;)
        {
          if (this.mType != 1) {
            break label1002;
          }
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getFiveZf());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getFiveColor());
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZx());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
          break;
          i = 8;
          break label837;
          label991:
          paramViewGroup.rongView.setVisibility(4);
        }
        label1002:
        if (this.mType == 2)
        {
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZf());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getJe());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getJeColor());
        }
        else if (this.mType == 3)
        {
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getHsl());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getHslColor());
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZx());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
        }
        else if (this.mType == 4)
        {
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZf());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getDDX());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getDDXColor(this.mLookFace));
        }
        else if (this.mType == 5)
        {
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getCjl());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getCjlColor(this.mLookFace));
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZx());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
        }
        else if (this.mType == 6)
        {
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getCje());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getCjeColor(this.mLookFace));
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZx());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
        }
        else
        {
          paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getZf());
          paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
          paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZx());
          paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
        }
      }
    }
  }
  
  public void setData(List<MarketStockVo> paramList, MarketListAdapter paramMarketListAdapter)
  {
    this.dataList = paramList;
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\MarketHSListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */