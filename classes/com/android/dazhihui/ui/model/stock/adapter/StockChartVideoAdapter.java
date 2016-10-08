package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StockChartVideoAdapter
  extends BaseAdapter
{
  public static final int TYPE_HOME = 1;
  public static final int TYPE_HOME_BOTTOM = 2;
  public static final int TYPE_STOCK = 0;
  private Context context;
  private ArrayList<HotVideoPushStockVo> mAllHotVideoPushVo;
  private int mCloseStatus = 0;
  private ArrayList<HotVideoPushStockVo> mHotVideoPushVo;
  private LayoutInflater mLayoutInflater;
  private int mType = 0;
  
  public StockChartVideoAdapter(Context paramContext)
  {
    this.mLayoutInflater = LayoutInflater.from(paramContext);
    this.context = paramContext;
  }
  
  public int getCount()
  {
    if (this.mHotVideoPushVo == null) {
      return 0;
    }
    return this.mHotVideoPushVo.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.mHotVideoPushVo == null) {
      return null;
    }
    return this.mHotVideoPushVo.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    StockChartVideoAdapter.ViewHolder localViewHolder;
    View localView;
    if (paramView == null)
    {
      localViewHolder = new StockChartVideoAdapter.ViewHolder(this);
      if (this.mType == 1)
      {
        paramView = LayoutInflater.from(this.context).inflate(2130903168, null);
        localViewHolder.upImage = ((CircleImageView)paramView.findViewById(2131559284));
        localViewHolder.zhuboName = ((TextView)paramView.findViewById(2131559285));
        localViewHolder.bottomImge = ((CircleImageView)paramView.findViewById(2131559283));
        paramView.setTag(localViewHolder);
        localView = paramView;
        label87:
        localViewHolder.upImage.setIsHasCirlCle(true);
        if (g.a().b() != y.a) {
          break label917;
        }
        localViewHolder.zhuboName.setTextColor(-3158048);
        if (this.mType == 2)
        {
          if (this.mCloseStatus != 0) {
            break label893;
          }
          localViewHolder.rightImg.setImageDrawable(this.context.getResources().getDrawable(2130838085));
          label153:
          localViewHolder.zhuboNumber.setTextColor(-7566196);
          localViewHolder.zhuboName.setTextColor(-1);
          localViewHolder.zhuboTitle.setTextColor(-6183246);
          localViewHolder.zhuboNameOld.setTextColor(-1);
        }
        label191:
        if (this.mType == 2)
        {
          localViewHolder.zhuboNameOld.setText(((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getOwnerName());
          localViewHolder.zhuboTitle.setText(((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getRoomTopic());
          if (paramInt != 0) {
            break label1035;
          }
          localViewHolder.rightImg.setVisibility(8);
          label257:
          if (!TextUtils.isEmpty(((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getRoomOnlineNumber())) {
            break label1048;
          }
          localViewHolder.zhuboName.setVisibility(8);
          localViewHolder.zhuboNumber.setVisibility(8);
          localViewHolder.zhuboNameOld.setVisibility(0);
        }
        label306:
        paramViewGroup = ((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getColor();
        if (TextUtils.isEmpty(paramViewGroup)) {
          break label1126;
        }
        paramView = paramViewGroup;
      }
    }
    int i;
    try
    {
      if (paramViewGroup.contains("#")) {
        paramView = paramViewGroup.replace("#", "");
      }
      i = Color.parseColor("#" + paramView);
      localViewHolder.upImage.setCirlCleColor(i);
    }
    catch (NumberFormatException paramView)
    {
      for (;;)
      {
        label382:
        label484:
        label616:
        label713:
        label893:
        label917:
        label1035:
        label1048:
        localViewHolder.upImage.setCirlCleColor(this.context.getResources().getColor(2131493412));
      }
    }
    String str3 = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
    paramView = ((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getOwnerAccountImg();
    if ((!TextUtils.isEmpty(paramView)) && (paramView.length() > 1)) {
      if (paramView.substring(paramView.length() - 1, paramView.length()).equals("?")) {
        paramView = paramView + "time=" + str3;
      }
    }
    for (;;)
    {
      String str1;
      int j;
      if (paramInt == 0) {
        if (this.mType == 2)
        {
          if ((this.mHotVideoPushVo.size() == 1) && (this.mAllHotVideoPushVo != null) && (this.mAllHotVideoPushVo.size() > 1))
          {
            str1 = ((HotVideoPushStockVo)this.mAllHotVideoPushVo.get(1)).getOwnerAccountImg();
            paramViewGroup = str1;
            if (!TextUtils.isEmpty(str1))
            {
              paramViewGroup = str1;
              if (str1.length() > 1)
              {
                if (!str1.substring(str1.length() - 1, str1.length()).equals("?")) {
                  break label1179;
                }
                paramViewGroup = str1 + "time=" + str3;
              }
            }
            r.a(this.context).a(paramViewGroup, localViewHolder.bottomImge, 2130838081);
            localViewHolder.bottomImge.setIsHasCirlCle(true);
            if (TextUtils.isEmpty(((HotVideoPushStockVo)this.mAllHotVideoPushVo.get(1)).getColor())) {
              break label1272;
            }
            i = this.context.getResources().getColor(2131493412);
            paramViewGroup = ((HotVideoPushStockVo)this.mAllHotVideoPushVo.get(1)).getColor();
          }
          try
          {
            if (!paramViewGroup.startsWith("#")) {
              break label1209;
            }
            j = Color.parseColor(paramViewGroup);
            i = j;
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              Log.e("ilvb", "Error color=" + paramViewGroup);
            }
          }
          localViewHolder.bottomImge.setCirlCleColor(i);
        }
      }
      for (;;)
      {
        r.a(this.context).a(paramView, localViewHolder.upImage, 2130838081);
        localViewHolder.zhuboName.setText(((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getOwnerName());
        return localView;
        if (this.mType == 0)
        {
          paramView = LayoutInflater.from(this.context).inflate(2130903445, null);
          break;
        }
        if (this.mType != 2) {
          break;
        }
        paramView = LayoutInflater.from(this.context).inflate(2130903446, null);
        localViewHolder.zhuboTitle = ((TextView)paramView.findViewById(2131560561));
        localViewHolder.zhuboNumber = ((TextView)paramView.findViewById(2131560559));
        localViewHolder.rightImg = ((ImageView)paramView.findViewById(2131560560));
        localViewHolder.zhuboNameOld = ((TextView)paramView.findViewById(2131560558));
        break;
        localViewHolder = (StockChartVideoAdapter.ViewHolder)paramView.getTag();
        localView = paramView;
        break label87;
        localViewHolder.rightImg.setImageDrawable(this.context.getResources().getDrawable(2130838082));
        break label153;
        localViewHolder.zhuboName.setTextColor(-12698029);
        if (this.mType != 2) {
          break label191;
        }
        if (this.mCloseStatus == 0) {
          localViewHolder.rightImg.setImageDrawable(this.context.getResources().getDrawable(2130838086));
        }
        for (;;)
        {
          localViewHolder.zhuboNumber.setTextColor(-10066330);
          localViewHolder.zhuboName.setTextColor(-12686651);
          localViewHolder.zhuboTitle.setTextColor(-14540254);
          localViewHolder.zhuboNameOld.setTextColor(-12686651);
          break;
          localViewHolder.rightImg.setImageDrawable(this.context.getResources().getDrawable(2130838083));
        }
        localViewHolder.rightImg.setVisibility(8);
        break label257;
        localViewHolder.zhuboName.setVisibility(0);
        localViewHolder.zhuboNumber.setVisibility(0);
        localViewHolder.zhuboNameOld.setVisibility(8);
        localViewHolder.zhuboNumber.setText(((HotVideoPushStockVo)this.mHotVideoPushVo.get(paramInt)).getRoomOnlineNumber());
        break label306;
        label1126:
        localViewHolder.upImage.setCirlCleColor(this.context.getResources().getColor(2131493412));
        break label382;
        paramView = paramView + "?time=" + str3;
        break label484;
        label1179:
        paramViewGroup = str1 + "?time=" + str3;
        break label616;
        label1209:
        j = Color.parseColor("#" + paramViewGroup);
        i = j;
        break label713;
        label1272:
        localViewHolder.bottomImge.setCirlCleColor(this.context.getResources().getColor(2131493412));
        continue;
        if (this.mHotVideoPushVo.size() > 1)
        {
          String str2 = ((HotVideoPushStockVo)this.mHotVideoPushVo.get(1)).getOwnerAccountImg();
          paramViewGroup = str2;
          if (!TextUtils.isEmpty(str2))
          {
            paramViewGroup = str2;
            if (str2.length() > 1)
            {
              if (!str2.substring(str2.length() - 1, str2.length()).equals("?")) {
                break label1508;
              }
              paramViewGroup = str2 + "time=" + str3;
            }
          }
          label1398:
          r.a(this.context).a(paramViewGroup, localViewHolder.bottomImge, 2130838081);
          localViewHolder.bottomImge.setIsHasCirlCle(true);
          if (!TextUtils.isEmpty(((HotVideoPushStockVo)this.mHotVideoPushVo.get(1)).getColor()))
          {
            i = this.context.getResources().getColor(2131493412);
            paramViewGroup = ((HotVideoPushStockVo)this.mHotVideoPushVo.get(1)).getColor();
            for (;;)
            {
              try
              {
                if (!paramViewGroup.startsWith("#")) {
                  continue;
                }
                j = Color.parseColor(paramViewGroup);
                i = j;
              }
              catch (Exception localException2)
              {
                label1508:
                Log.e("ilvb", "Error color=" + paramViewGroup);
                continue;
              }
              localViewHolder.bottomImge.setCirlCleColor(i);
              break;
              paramViewGroup = str2 + "?time=" + str3;
              break label1398;
              j = Color.parseColor("#" + paramViewGroup);
              i = j;
            }
          }
          localViewHolder.bottomImge.setCirlCleColor(this.context.getResources().getColor(2131493412));
          continue;
          localViewHolder.bottomImge.setVisibility(8);
        }
      }
    }
  }
  
  public void setAllHotData(ArrayList<HotVideoPushStockVo> paramArrayList)
  {
    this.mAllHotVideoPushVo = paramArrayList;
  }
  
  public void setCloseStatus(int paramInt)
  {
    this.mCloseStatus = paramInt;
  }
  
  public void setHotData(ArrayList<HotVideoPushStockVo> paramArrayList)
  {
    this.mHotVideoPushVo = paramArrayList;
    notifyDataSetChanged();
  }
  
  public void setType(int paramInt)
  {
    this.mType = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\StockChartVideoAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */