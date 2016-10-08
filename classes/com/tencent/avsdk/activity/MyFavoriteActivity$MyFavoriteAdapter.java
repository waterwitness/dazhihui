package com.tencent.avsdk.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.MyFavoriteVo.FavoriteItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class MyFavoriteActivity$MyFavoriteAdapter
  extends BaseAdapter
{
  private String curTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
  private String fromatTime;
  private MyFavoriteVo.FavoriteItem item;
  private Context mContex;
  private List<MyFavoriteVo.FavoriteItem> mFavoriteNews;
  
  public MyFavoriteActivity$MyFavoriteAdapter(Context paramContext, ArrayList<MyFavoriteVo.FavoriteItem> paramArrayList)
  {
    this.mContex = paramArrayList;
    List localList;
    this.mFavoriteNews = localList;
  }
  
  public void clear()
  {
    if (this.mFavoriteNews != null) {
      this.mFavoriteNews.clear();
    }
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.mFavoriteNews == null) {
      return 0;
    }
    return this.mFavoriteNews.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.mFavoriteNews == null) {
      return null;
    }
    return this.mFavoriteNews.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramView = new MyFavoriteActivity.MyFavoriteAdapter.Holder(this);
      paramViewGroup = LayoutInflater.from(this.mContex).inflate(2130903334, null);
      paramView.mTitle = ((TextView)paramViewGroup.findViewById(2131560090));
      paramView.mTime = ((TextView)paramViewGroup.findViewById(2131560091));
      paramViewGroup.setTag(paramView);
    }
    paramViewGroup.setBackgroundResource(2130838826);
    paramView = (MyFavoriteActivity.MyFavoriteAdapter.Holder)paramViewGroup.getTag();
    this.item = ((MyFavoriteVo.FavoriteItem)this.mFavoriteNews.get(paramInt));
    if (this.item != null)
    {
      paramView.mTitle.setText(this.item.getTitle());
      this.fromatTime = this.item.getStoretime();
      if (this.fromatTime.startsWith(this.curTime))
      {
        paramView.mTime.setText(this.fromatTime.subSequence(11, 16));
        return paramViewGroup;
      }
      paramView.mTime.setText(this.fromatTime.subSequence(5, 16));
      return paramViewGroup;
    }
    paramView.mTitle.setText("");
    paramView.mTime.setText("");
    return paramViewGroup;
  }
  
  public void refreshData(List<MyFavoriteVo.FavoriteItem> paramList)
  {
    this.mFavoriteNews = paramList;
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\MyFavoriteActivity$MyFavoriteAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */