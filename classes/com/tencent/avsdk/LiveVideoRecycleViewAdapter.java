package com.tencent.avsdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.v7.widget.am;
import android.support.v7.widget.bk;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.widget.NoEllipsisTextView;
import com.g.a.b.a.e;
import com.g.a.b.d;
import com.g.a.b.f;
import com.g.a.b.g;
import com.g.a.b.j;
import java.util.ArrayList;
import java.util.List;

public class LiveVideoRecycleViewAdapter
  extends am<bk>
{
  private List<LiveVideoInfo> liveVideoInfos = new ArrayList();
  private Bitmap loadingBitmap;
  private boolean mAttentionListNull = false;
  private Context mContext;
  private LayoutInflater mInflater;
  private int mListType;
  private LiveVideoInfo mLiveVideoInfo;
  private LiveVideoRecycleViewAdapter.PersonState mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_OFF_LINE;
  private boolean mShowTypeName;
  protected LiveVideoRecycleViewAdapter.OnRecyclerViewListener onRecyclerViewListener;
  private d options;
  
  public LiveVideoRecycleViewAdapter(Context paramContext, boolean paramBoolean, int paramInt)
  {
    this.mListType = paramInt;
    this.mShowTypeName = paramBoolean;
    this.mContext = paramContext;
    this.options = new f().a(2130838216).b(2130838216).c(2130838216).a(e.d).a(true).c(true).a(Bitmap.Config.RGB_565).a();
    if (!g.a().b())
    {
      com.g.a.b.h localh = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new com.g.a.a.a.b.c()).a(com.g.a.b.a.h.b).a(new com.g.a.a.b.a.c()).b(10).b();
      g.a().a(localh);
    }
    this.loadingBitmap = readBitMap(this.mContext, 2130838216);
    this.mInflater = LayoutInflater.from(paramContext);
  }
  
  private Bitmap getLoadingBitmap()
  {
    if ((this.loadingBitmap == null) || (this.loadingBitmap.isRecycled())) {
      this.loadingBitmap = readBitMap(this.mContext, 2130838216);
    }
    return this.loadingBitmap;
  }
  
  private Bitmap readBitMap(Context paramContext, int paramInt)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    localOptions.inPurgeable = true;
    localOptions.inInputShareable = true;
    return BitmapFactory.decodeStream(paramContext.getResources().openRawResource(paramInt), null, localOptions);
  }
  
  public void addItems(List<LiveVideoInfo> paramList)
  {
    this.liveVideoInfos.addAll(paramList);
    notifyDataSetChanged();
  }
  
  public void doRecycle()
  {
    if ((this.loadingBitmap != null) && (!this.loadingBitmap.isRecycled()))
    {
      this.loadingBitmap.recycle();
      this.loadingBitmap = null;
    }
  }
  
  public LiveVideoInfo getItem(int paramInt)
  {
    if (this.liveVideoInfos == null) {
      return null;
    }
    return (LiveVideoInfo)this.liveVideoInfos.get(paramInt);
  }
  
  public int getItemCount()
  {
    if (this.liveVideoInfos != null) {
      return this.liveVideoInfos.size();
    }
    return 0;
  }
  
  public void onBindViewHolder(bk parambk, int paramInt)
  {
    int i = 1;
    this.mLiveVideoInfo = ((LiveVideoInfo)this.liveVideoInfos.get(paramInt));
    label110:
    label168:
    label227:
    label284:
    label383:
    String str2;
    if ((parambk instanceof LiveVideoRecycleViewAdapter.ItemViewHolderGeneral))
    {
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$002((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk, paramInt);
      if ((!"1".equals(this.mLiveVideoInfo.getRoomStatus())) && (this.mLiveVideoInfo.get_LookStatus() == 1))
      {
        this.mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_LOOKING;
        if (TextUtils.isEmpty(this.mLiveVideoInfo.getTagStatusTxt())) {
          break label666;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$100((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$100((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getTagStatusTxt());
        if ((!this.mShowTypeName) || (this.mLiveVideoInfo.getTagTxt() == null) || (this.mLiveVideoInfo.getTagTxt().length <= 0)) {
          break label680;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$200((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$200((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getTagTxt()[0]);
        if ((!this.mShowTypeName) || (this.mLiveVideoInfo.getTagTxt() == null) || (this.mLiveVideoInfo.getTagTxt().length <= 1)) {
          break label695;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$300((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$300((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getTagTxt()[1]);
        if (this.mLiveVideoInfo.getmMoneyUnit() <= 0) {
          break label710;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$400((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$500((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getmMoneyUnit() + "币/人");
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$600((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getOwnerName());
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$700((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getRoomTopic());
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$800((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(String.valueOf(this.mLiveVideoInfo.getPV()) + "人");
        paramInt = i;
        if (this.mLiveVideoInfo.getRank() == 0)
        {
          if (this.mPersonState != LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO) {
            break label725;
          }
          paramInt = i;
        }
        if (paramInt == 0) {
          break label730;
        }
        if ((this.mLiveVideoInfo.getRank() <= 0) || (this.mLiveVideoInfo.getJe() <= 0)) {
          break label1945;
        }
        paramInt = this.mLiveVideoInfo.getRank();
        i = this.mLiveVideoInfo.getJe();
        str2 = String.valueOf(paramInt);
      }
    }
    for (String str1 = String.valueOf(i);; str1 = "--")
    {
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$900((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText("第" + str2 + "名");
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$900((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setTextColor(-10066330);
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1000((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(str1 + "元");
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1000((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(0);
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1000((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setTextColor(-10066330);
      label540:
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$700((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(8);
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$900((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(8);
      LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1000((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(8);
      if (!TextUtils.isEmpty(this.mLiveVideoInfo.getCity())) {
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1100((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText(this.mLiveVideoInfo.getCity());
      }
      g.a().a(this.mLiveVideoInfo.getVbImgUrl(), LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1200((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk), this.options);
      label666:
      label680:
      label695:
      label710:
      label725:
      label730:
      label877:
      label963:
      do
      {
        return;
        if ("1".equals(this.mLiveVideoInfo.getRoomStatus()))
        {
          this.mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO;
          break;
        }
        this.mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_OFF_LINE;
        break;
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$100((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(4);
        break label110;
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$200((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(8);
        break label168;
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$300((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(8);
        break label227;
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$400((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(8);
        break label284;
        paramInt = 0;
        break label383;
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$900((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setText("今日未开播");
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$900((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setTextColor(-10066330);
        LiveVideoRecycleViewAdapter.ItemViewHolderGeneral.access$1000((LiveVideoRecycleViewAdapter.ItemViewHolderGeneral)parambk).setVisibility(4);
        break label540;
        if ((parambk instanceof LiveVideoRecycleViewAdapter.ItemViewHolderNew))
        {
          g.a().a(((LiveVideoInfo)this.liveVideoInfos.get(paramInt)).getVbImgUrl(), LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1300((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk), this.options);
          LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1402((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk, paramInt);
          if ((this.mShowTypeName) && (this.mLiveVideoInfo.getTagTxt() != null) && (this.mLiveVideoInfo.getTagTxt().length > 0))
          {
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1500((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setVisibility(0);
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1500((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setText(this.mLiveVideoInfo.getTagTxt()[0]);
            if (this.mLiveVideoInfo.getmMoneyUnit() <= 0) {
              break label963;
            }
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1600((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setVisibility(0);
          }
          for (;;)
          {
            str1 = this.mLiveVideoInfo.getOwnerName();
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1700((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setText(str1);
            if (TextUtils.isEmpty(this.mLiveVideoInfo.getCity())) {
              break;
            }
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1800((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setText(this.mLiveVideoInfo.getCity());
            return;
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1500((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setVisibility(8);
            break label877;
            LiveVideoRecycleViewAdapter.ItemViewHolderNew.access$1600((LiveVideoRecycleViewAdapter.ItemViewHolderNew)parambk).setVisibility(8);
          }
        }
      } while (!(parambk instanceof LiveVideoRecycleViewAdapter.ItemViewHolderAttention));
      LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$1902((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk, paramInt);
      label1101:
      label1169:
      label1238:
      label1295:
      label1389:
      label1411:
      int j;
      if ((!"1".equals(this.mLiveVideoInfo.getRoomStatus())) && (this.mLiveVideoInfo.get_LookStatus() == 1))
      {
        this.mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_LOOKING;
        if ((TextUtils.isEmpty(this.mLiveVideoInfo.getTagStatusTxt())) || (this.mPersonState == LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO)) {
          break label1746;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getTagStatusTxt());
        if (this.mPersonState != LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_LOOKING) {
          break label1704;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setBackgroundResource(2130838198);
        if ((this.mPersonState != LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO) || (!this.mShowTypeName) || (this.mLiveVideoInfo.getTagTxt() == null) || (this.mLiveVideoInfo.getTagTxt().length <= 0)) {
          break label1760;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2100((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2100((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getTagTxt()[0]);
        if ((this.mPersonState != LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO) || (!this.mShowTypeName) || (this.mLiveVideoInfo.getTagTxt() == null) || (this.mLiveVideoInfo.getTagTxt().length <= 1)) {
          break label1775;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2200((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2200((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getTagTxt()[1]);
        if (this.mLiveVideoInfo.getmMoneyUnit() <= 0) {
          break label1790;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2300((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2400((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getmMoneyUnit() + "币/人");
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2500((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getOwnerName());
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2600((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getRoomTopic());
        if (this.mPersonState != LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO) {
          break label1805;
        }
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2700((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(String.valueOf(this.mLiveVideoInfo.getPV()) + "人");
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2700((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
        if ((this.mLiveVideoInfo.getRank() == 0) && (this.mPersonState != LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO)) {
          break label1820;
        }
        paramInt = 1;
        if (paramInt == 0) {
          break label1825;
        }
        if ((this.mLiveVideoInfo.getRank() <= 0) || (this.mLiveVideoInfo.getJe() <= 0)) {
          break label1933;
        }
        i = this.mLiveVideoInfo.getRank();
        j = this.mLiveVideoInfo.getJe();
        str2 = String.valueOf(i);
      }
      for (str1 = String.valueOf(j);; str1 = "--")
      {
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2800((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText("第" + str2 + "名");
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2800((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setTextColor(-10066330);
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(str1 + "元");
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
        LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setTextColor(-10066330);
        label1570:
        if (this.mAttentionListNull)
        {
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2600((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(4);
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2800((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
          if (paramInt != 0) {
            LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
          }
        }
        for (;;)
        {
          if (!TextUtils.isEmpty(this.mLiveVideoInfo.getCity())) {
            LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$3000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText(this.mLiveVideoInfo.getCity());
          }
          g.a().a(this.mLiveVideoInfo.getVbImgUrl(), LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$3100((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk), this.options);
          return;
          if ("1".equals(this.mLiveVideoInfo.getRoomStatus()))
          {
            this.mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO;
            break;
          }
          this.mPersonState = LiveVideoRecycleViewAdapter.PersonState.PERSON_OFF_LINE;
          break;
          label1704:
          if (this.mPersonState == LiveVideoRecycleViewAdapter.PersonState.PERSON_ON_LINE_KAI_BO)
          {
            LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setBackgroundResource(2130838196);
            break label1101;
          }
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setBackgroundResource(2130838194);
          break label1101;
          label1746:
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2000((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(4);
          break label1101;
          label1760:
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2100((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(8);
          break label1169;
          label1775:
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2200((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(8);
          break label1238;
          label1790:
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2300((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(8);
          break label1295;
          label1805:
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2700((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(8);
          break label1389;
          label1820:
          paramInt = 0;
          break label1411;
          label1825:
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2800((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setText("今日未开播");
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2800((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setTextColor(-10066330);
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(4);
          break label1570;
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(4);
          continue;
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2600((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(4);
          LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2800((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
          if (paramInt != 0) {
            LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(0);
          } else {
            LiveVideoRecycleViewAdapter.ItemViewHolderAttention.access$2900((LiveVideoRecycleViewAdapter.ItemViewHolderAttention)parambk).setVisibility(4);
          }
        }
        label1933:
        str2 = "--";
      }
      label1945:
      str2 = "--";
    }
  }
  
  public bk onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.mListType == 7) {
      return new LiveVideoRecycleViewAdapter.ItemViewHolderNew(this, this.mInflater.inflate(2130903197, paramViewGroup, false));
    }
    return new LiveVideoRecycleViewAdapter.ItemViewHolderGeneral(this, this.mInflater.inflate(2130903195, paramViewGroup, false));
  }
  
  public void refreshItems(List<LiveVideoInfo> paramList)
  {
    if (paramList == null) {
      return;
    }
    this.liveVideoInfos.clear();
    int i = 0;
    while (i < paramList.size())
    {
      this.liveVideoInfos.add(i, paramList.get(i));
      i += 1;
    }
    notifyDataSetChanged();
  }
  
  public void removeItem(int paramInt)
  {
    this.liveVideoInfos.get(paramInt);
    notifyItemRemoved(paramInt);
  }
  
  public void setAttentionListNull(boolean paramBoolean)
  {
    this.mAttentionListNull = paramBoolean;
  }
  
  public void setOnRecyclerViewListener(LiveVideoRecycleViewAdapter.OnRecyclerViewListener paramOnRecyclerViewListener)
  {
    this.onRecyclerViewListener = paramOnRecyclerViewListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\LiveVideoRecycleViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */