package com.android.dazhihui.ui.model.stock.market;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import java.util.List;

public class MarketListAdapter
  extends BaseAdapter
{
  protected MarketAdapterItmeOnClickListener clickListener;
  protected List<MarketStockVo> dataList;
  protected Context mContext;
  private y mLookFace = y.a;
  protected int mType = 0;
  
  public MarketListAdapter() {}
  
  public MarketListAdapter(List<MarketStockVo> paramList, int paramInt, Context paramContext, MarketAdapterItmeOnClickListener paramMarketAdapterItmeOnClickListener)
  {
    this.dataList = paramList;
    this.mType = paramInt;
    this.mContext = paramContext;
    this.clickListener = paramMarketAdapterItmeOnClickListener;
  }
  
  public void changeLookFace(y paramy)
  {
    this.mLookFace = paramy;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if ((this.dataList != null) && (this.dataList.size() > 0)) {
      return this.dataList.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public int getType()
  {
    return this.mType;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new MarketListAdapter.Holder(this);
      paramView = LayoutInflater.from(this.mContext).inflate(2130903273, null);
      paramViewGroup.name = ((TextView)paramView.findViewById(2131559828));
      paramViewGroup.zx = ((TextView)paramView.findViewById(2131559829));
      paramViewGroup.zf = ((TextView)paramView.findViewById(2131559830));
      paramView.setTag(paramViewGroup);
      if (this.mLookFace != y.b) {
        break label253;
      }
      paramView.setBackgroundResource(2130838814);
      paramViewGroup.name.setTextColor(this.mContext.getResources().getColor(2131493609));
    }
    for (;;)
    {
      if ((this.dataList != null) && (this.dataList.size() > 0))
      {
        paramViewGroup.name.setText(((MarketStockVo)this.dataList.get(paramInt)).getStockName());
        paramViewGroup.zx.setText(((MarketStockVo)this.dataList.get(paramInt)).getZx());
        paramViewGroup.zf.setText(((MarketStockVo)this.dataList.get(paramInt)).getZf());
        paramViewGroup.zx.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
        paramViewGroup.zf.setTextColor(((MarketStockVo)this.dataList.get(paramInt)).getColor());
      }
      return paramView;
      paramViewGroup = (MarketListAdapter.Holder)paramView.getTag();
      break;
      label253:
      paramView.setBackgroundResource(2130838732);
      paramViewGroup.name.setTextColor(this.mContext.getResources().getColor(2131493546));
    }
  }
  
  public void setData(List<MarketStockVo> paramList, MarketListAdapter paramMarketListAdapter)
  {
    this.dataList = paramList;
    paramMarketListAdapter.notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\MarketListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */