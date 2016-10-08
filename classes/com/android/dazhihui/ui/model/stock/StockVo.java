package com.android.dazhihui.ui.model.stock;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.mh;
import com.android.dazhihui.ui.widget.stockchart.az;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockVo
  implements Parcelable
{
  public static final Parcelable.Creator<StockVo> CREATOR = new StockVo.1();
  public static final int KLINE_MAX_SIZE = 150;
  private static int sExRights = 2;
  private String[] a2997Data;
  private int[] currentData;
  private int[] m2940DealsData;
  private StockVo.Api2206 mApi2206Data = new StockVo.Api2206(this);
  private StockVo.Api2917 mApi2917Data = new StockVo.Api2917(this);
  private StockVo.Api2930 mApi2930Data = new StockVo.Api2930(this);
  private StockVo.Api2955_4416 mApi2955_4416Data = new StockVo.Api2955_4416(this);
  private StockVo.Api2931 mApi2976Data = new StockVo.Api2931(this);
  private int mApi2987ExecRightDay;
  private int mApi2987ExecRightDelen;
  private int mApi2987ExecRightPrice;
  private StockVo.Api2994 mApi2994Data = new StockVo.Api2994(this);
  public ArrayList<StockVo.Api3010> mApi3010_KChart;
  public ArrayList<StockVo.Api3010> mApi3010_MinChart;
  public ArrayList<StockVo.Api3010_Table> mApi3010_Table_KChart;
  public ArrayList<StockVo.Api3010_Table> mApi3010_Table_MinChart;
  public StockVo.ApiDoubleVol mApiDoubleVol = new StockVo.ApiDoubleVol(this);
  public int[] mAveragePrice;
  private int[][] mBs;
  private int[][] mBsTag;
  private int mCCTag;
  private int mCc;
  private int mCjl2978;
  String mCode = "";
  private int mCp;
  private int[] mCurrentData;
  String mCurrentValue;
  private int[] mData2939;
  private int mDecimalLen = 2;
  private String[] mDetailData;
  private int[] mDetailDataColor;
  private String mDownLimit = "--";
  private int mDp;
  String mDtTradeValue;
  private int[] mExRightsAdd;
  private int[] mExRightsId;
  private int[] mExRightsMulti;
  private int[] mExRightsTime;
  private int mFirstTpPosition;
  private List<mh> mHsIndex2955Data = new ArrayList();
  private int[] mHsZdNum;
  private int mJj;
  private int mJs;
  private int mKChartMaxShowPrice;
  private int mKChartMinShowPrice;
  private int[][] mKDDX;
  private int mKDDXIndexDay = 0;
  private int[][] mKDDY;
  private int mKDDYIndexDay = 0;
  private int[][] mKDDZ;
  private int mKDDZIndexDay = 0;
  private int[][] mKData;
  private int mKIndexDay = 0;
  private int mKLineOffset = 0;
  private int mKNowDay;
  private int mKSuplIndexDay = 0;
  private long[] mKVolData;
  private int mLb;
  boolean mLoanable;
  private int mMarketType;
  public int mMaxVol;
  private int[][] mMinBSVol;
  private int mMinChartMaxShowPrice;
  private int mMinChartMinShowPrice;
  private int[] mMinDDX;
  private int[][] mMinData;
  private int[] mMinDealChaLiang;
  private List<int[]> mMinDealData = new ArrayList();
  private int[][] mMinFiveRange;
  private int mMinIndex = 0;
  private int mMinLength;
  private int[][] mMinLevel2Range;
  private int mMinOffset = 0;
  private int mMinRealLen = 0;
  private int[] mMinTime;
  private int mMinTotalPoint = 241;
  private int[] mMinTradeVolum;
  private int mNP2978;
  String mName;
  private boolean mNeedExRight = true;
  private int mNpVol;
  private int mOp;
  private List<int[]> mOptionMinDealData = new ArrayList();
  private List<mh> mPlate2955Data = new ArrayList();
  private int[][] mPrototypeKData;
  private long[] mPrototypeKVolData;
  private int[][] mQK;
  private String mRiseLimit = "--";
  private int mSecondTpPositiom;
  private int mStockClassify = 0;
  private int mStockStauts;
  private int[][] mSupl;
  private int[] mSuplH;
  private int mTotalAmount;
  private int[] mTradeVolum;
  int mType = 1;
  private int mUp;
  private int mVol;
  private int mXsVol;
  private int mZc;
  String mZf;
  String mZfValue;
  String mZtTradeValue;
  private int mZxj;
  private int[] tradeVolum;
  
  static
  {
    sExRights = d.a().b("exrights_type", 2);
  }
  
  public StockVo(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    this.mName = paramString1;
    this.mCode = paramString2;
    this.mType = paramInt;
    this.mLoanable = paramBoolean;
    this.mMarketType = n.o(paramString2);
  }
  
  public StockVo(String paramString1, String paramString2, int paramInt, boolean paramBoolean, String paramString3, String paramString4, String paramString5)
  {
    this.mName = paramString1;
    this.mCode = paramString2;
    this.mType = paramInt;
    this.mLoanable = paramBoolean;
    this.mCurrentValue = paramString3;
    this.mZf = paramString4;
    this.mZfValue = paramString5;
    this.mMarketType = n.o(paramString2);
  }
  
  private String StringToBill(String paramString)
  {
    int i = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    if (i - 4 < 0) {
      return "--";
    }
    localStringBuffer.delete(i - 4, i);
    i = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i, i + 2));
    return localStringBuffer.toString();
  }
  
  private void doQK()
  {
    if ((this.mKData != null) && (this.mKData.length > 1))
    {
      int i = this.mKData.length;
      int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i, 3 });
      int k = this.mKData[(this.mKData.length - 1)][2];
      int j = this.mKData[(this.mKData.length - 1)][3];
      i = this.mKData.length;
      i -= 2;
      int m = k;
      while (i >= 0)
      {
        if (this.mKData[i][3] > m)
        {
          arrayOfInt[(i + 1)][0] = 1;
          arrayOfInt[(i + 1)][1] = m;
          arrayOfInt[(i + 1)][2] = (this.mKData[i][3] - m);
        }
        k = m;
        if (this.mKData[i][2] > m) {
          k = this.mKData[i][2];
        }
        if (this.mKData[i][2] < j)
        {
          arrayOfInt[(i + 1)][0] = 2;
          arrayOfInt[(i + 1)][1] = this.mKData[i][2];
          arrayOfInt[(i + 1)][2] = (j - this.mKData[i][2]);
        }
        int n = j;
        if (this.mKData[i][3] < j) {
          n = this.mKData[i][3];
        }
        i -= 1;
        m = k;
        j = n;
      }
      this.mQK = arrayOfInt;
      return;
    }
    this.mQK = ((int[][])null);
  }
  
  public static int getExRights()
  {
    return sExRights;
  }
  
  public static void setExRights(int paramInt)
  {
    sExRights = paramInt;
    d.a().a("exrights_type", sExRights);
  }
  
  public static void setTempExRights(int paramInt)
  {
    sExRights = paramInt;
  }
  
  public void changeKLinePeriod()
  {
    this.mKLineOffset = 0;
    this.mKIndexDay = 0;
    this.mKDDXIndexDay = 0;
    this.mKDDYIndexDay = 0;
    this.mKDDZIndexDay = 0;
    this.mKSuplIndexDay = 0;
    this.mKNowDay = 0;
    this.mExRightsMulti = null;
    this.mExRightsAdd = null;
    this.mExRightsTime = null;
    this.mExRightsId = null;
    this.mNeedExRight = true;
    this.mKData = ((int[][])null);
    this.mQK = ((int[][])null);
    this.mPrototypeKData = ((int[][])null);
    this.mKVolData = null;
    this.mPrototypeKVolData = null;
    this.mKDDX = ((int[][])null);
    this.mKDDY = ((int[][])null);
    this.mKDDZ = ((int[][])null);
    this.mSupl = ((int[][])null);
    this.mSuplH = null;
    this.mBs = ((int[][])null);
    this.mBsTag = ((int[][])null);
  }
  
  public void cleanData()
  {
    this.mData2939 = null;
    this.mDetailData = null;
    this.mDetailDataColor = null;
    this.mDecimalLen = 2;
    this.mCp = 0;
    this.mCCTag = 0;
    this.mZxj = 0;
    this.mOp = 0;
    this.mUp = 0;
    this.mDp = 0;
    this.mVol = 0;
    this.mTotalAmount = 0;
    this.mNpVol = 0;
    this.mXsVol = 0;
    this.mJj = 0;
    this.mCc = 0;
    this.mZc = 0;
    this.mLb = 0;
    this.mZf = "--";
    this.mCurrentValue = "--";
    this.mZfValue = "--";
    this.mStockClassify = 0;
    this.mStockStauts = 0;
    this.mFirstTpPosition = 0;
    this.mSecondTpPositiom = 0;
    this.mMaxVol = 0;
    cleanMinData();
    cleanKlineData();
  }
  
  public void cleanKlineData()
  {
    this.mKIndexDay = 0;
    this.mKNowDay = 0;
    this.mExRightsMulti = null;
    this.mExRightsAdd = null;
    this.mExRightsTime = null;
    this.mExRightsId = null;
    this.mNeedExRight = true;
    this.mKData = ((int[][])null);
    this.mQK = ((int[][])null);
    this.mPrototypeKData = ((int[][])null);
    this.mKVolData = null;
    this.mPrototypeKVolData = null;
    this.mKLineOffset = 0;
    this.mBs = ((int[][])null);
    this.mBsTag = ((int[][])null);
    this.mKDDXIndexDay = 0;
    this.mKDDYIndexDay = 0;
    this.mKDDZIndexDay = 0;
    this.mKSuplIndexDay = 0;
    this.mKDDX = ((int[][])null);
    this.mKDDY = ((int[][])null);
    this.mKDDZ = ((int[][])null);
    this.mSupl = ((int[][])null);
    this.mSuplH = null;
    this.mApi3010_KChart = null;
    this.mKChartMaxShowPrice = 0;
    this.mKChartMinShowPrice = 0;
    this.mApi3010_KChart = null;
    this.mApi3010_Table_KChart = null;
  }
  
  public void cleanMinData()
  {
    this.mRiseLimit = "--";
    this.mDownLimit = "--";
    this.mHsZdNum = null;
    this.mMinIndex = 0;
    this.mMinRealLen = 0;
    this.mMinData = ((int[][])null);
    this.mMinLength = 0;
    this.mMinTradeVolum = null;
    this.mMinOffset = 0;
    this.mMinDDX = null;
    this.mMinDealChaLiang = null;
    this.mMinBSVol = ((int[][])null);
    this.mMinFiveRange = ((int[][])null);
    this.mMinLevel2Range = ((int[][])null);
    this.mMinDealData.clear();
    this.mNP2978 = 0;
    this.mCjl2978 = 0;
    this.mStockStauts = 0;
    this.mApi2976Data.clear();
    this.mApi2930Data.clear();
    this.mPlate2955Data.clear();
    this.mHsIndex2955Data.clear();
    this.mApi2917Data.clear();
    this.mApi2206Data.clear();
    this.mApi2994Data.clear();
    this.mApi2955_4416Data.clear();
    this.mPlate2955Data.clear();
    StockVo.ApiDoubleVol.access$000(this.mApiDoubleVol);
    this.m2940DealsData = null;
    this.mJs = 0;
    this.mTradeVolum = null;
    this.mApi2987ExecRightDay = 0;
    this.mSecondTpPositiom = 0;
    this.mFirstTpPosition = 0;
    this.mMinChartMinShowPrice = 0;
    this.mMinChartMaxShowPrice = 0;
    this.mCurrentData = null;
    this.mAveragePrice = null;
    this.mApi3010_MinChart = null;
    this.mApi3010_Table_MinChart = null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int[] get2940DealsData()
  {
    return this.m2940DealsData;
  }
  
  public String[] get2997Data()
  {
    return this.a2997Data;
  }
  
  public StockVo.Api2206 getApi2206Data()
  {
    return this.mApi2206Data;
  }
  
  public StockVo.Api2917 getApi2917Data()
  {
    return this.mApi2917Data;
  }
  
  public StockVo.Api2930 getApi2930()
  {
    return this.mApi2930Data;
  }
  
  public StockVo.Api2955_4416 getApi2955_4416Data()
  {
    return this.mApi2955_4416Data;
  }
  
  public StockVo.Api2931 getApi2976()
  {
    return this.mApi2976Data;
  }
  
  public int getApi2987ExecRightDay()
  {
    return this.mApi2987ExecRightDay;
  }
  
  public int getApi2987ExecRightDelen()
  {
    return this.mApi2987ExecRightDelen;
  }
  
  public int getApi2987ExecRightPrice()
  {
    return this.mApi2987ExecRightPrice;
  }
  
  public StockVo.Api2994 getApi2994Data()
  {
    return this.mApi2994Data;
  }
  
  public ArrayList<StockVo.Api3010_Table> getApi3010_Table_KChart()
  {
    return this.mApi3010_Table_KChart;
  }
  
  public ArrayList<StockVo.Api3010_Table> getApi3010_Table_MinChart()
  {
    return this.mApi3010_Table_MinChart;
  }
  
  public int[][] getBs()
  {
    return this.mBs;
  }
  
  public int[][] getBsTag()
  {
    return this.mBsTag;
  }
  
  public int getCCTag()
  {
    return this.mCCTag;
  }
  
  public String getChangeHand()
  {
    long l = az.a(this.mData2939[6]);
    String str2 = az.a(this.mVol + l, l);
    String str1 = str2;
    if (str2.startsWith("+")) {
      str1 = str2.substring(1);
    }
    return str1;
  }
  
  public String getCirculationValue()
  {
    if ((this.mZxj != 0) && (this.mData2939 != null) && (this.mData2939.length > 0))
    {
      int j = (int)Math.pow(10.0D, this.mDecimalLen);
      int i = j;
      if (j <= 0) {
        i = 1;
      }
      float f = (float)az.a(this.mData2939[6]) * 1.0F / 100.0F;
      String str = Long.toString((this.mZxj * 1.0F / i * f));
      if (str.length() >= 5) {
        return StringToBill(str) + "亿";
      }
      if (!str.equals("0")) {
        return StringToBill(str) + "万";
      }
    }
    return "--";
  }
  
  public int getCjl2978()
  {
    return this.mCjl2978;
  }
  
  public String getCode()
  {
    return this.mCode;
  }
  
  public int getCp()
  {
    return this.mCp;
  }
  
  public int[] getCurrentData()
  {
    return this.mCurrentData;
  }
  
  public String getCurrentValue()
  {
    if (this.mZxj != 0) {
      this.mCurrentValue = az.a(this.mZxj, this.mDecimalLen);
    }
    return this.mCurrentValue;
  }
  
  public String[] getDetailData()
  {
    resetDetailData(this.mType);
    return this.mDetailData;
  }
  
  public int[] getDetailDataColor()
  {
    return this.mDetailDataColor;
  }
  
  public String getDownLimit()
  {
    return this.mDownLimit;
  }
  
  public String getDtValue()
  {
    if (this.mData2939 != null) {
      return az.a(this.mData2939[5], this.mDecimalLen);
    }
    return "--";
  }
  
  public int[] getExRightsAdd()
  {
    return this.mExRightsAdd;
  }
  
  public int[] getExRightsId()
  {
    return this.mExRightsId;
  }
  
  public int[] getExRightsMulti()
  {
    return this.mExRightsMulti;
  }
  
  public int[] getExRightsTime()
  {
    return this.mExRightsTime;
  }
  
  public int getFirstTpPosition()
  {
    return this.mFirstTpPosition;
  }
  
  public String[] getHkDetailData()
  {
    if (this.mDetailData == null)
    {
      this.mDetailData = new String[20];
      this.mDetailDataColor = new int[20];
      Arrays.fill(this.mDetailData, "--");
    }
    this.mDetailData[0] = az.a(this.mOp, this.mDecimalLen);
    this.mDetailDataColor[0] = az.e(this.mOp, this.mCp);
    this.mDetailData[1] = az.a(this.mCp, this.mDecimalLen);
    this.mDetailDataColor[1] = az.e(this.mCp, this.mCp);
    this.mDetailData[2] = az.a(this.mJj, this.mDecimalLen);
    this.mDetailDataColor[2] = az.e(this.mJj, this.mCp);
    this.mDetailData[3] = az.f(this.mUp - this.mDp, this.mCp);
    this.mDetailDataColor[3] = -2628628;
    long l = 0L;
    if (this.mData2939 != null) {
      l = az.a(this.mData2939[6]);
    }
    this.mDetailData[4] = az.a(this.mVol + l, l);
    this.mDetailDataColor[4] = -2699741;
    this.mDetailData[5] = b.j(this.mXsVol);
    this.mDetailDataColor[5] = -2628628;
    String str2 = az.c(this.mVol);
    String str1 = str2;
    if (str2.length() >= 5) {
      str1 = StringToBill(str2) + "万";
    }
    this.mDetailData[6] = str1;
    this.mDetailDataColor[6] = -11337729;
    str1 = az.a(az.a(this.mTotalAmount));
    if (str1.length() >= 5) {}
    for (str1 = StringToBill(str1) + "亿";; str1 = str1 + "万")
    {
      this.mDetailData[7] = str1;
      this.mDetailDataColor[7] = -2699741;
      this.mDetailData[8] = az.a(this.mLb, 2);
      this.mDetailDataColor[8] = -2628628;
      this.mDetailData[9] = az.c(this.mNpVol);
      this.mDetailDataColor[9] = -65536;
      this.mDetailData[10] = az.c(this.mVol - this.mNpVol);
      this.mDetailDataColor[10] = -65536;
      if (g.a().b() == y.b)
      {
        this.mDetailDataColor[3] = -14540254;
        this.mDetailDataColor[4] = -14540254;
        this.mDetailDataColor[5] = -14540254;
        this.mDetailDataColor[6] = -14540254;
        this.mDetailDataColor[7] = -14540254;
        this.mDetailDataColor[8] = -14540254;
        this.mDetailDataColor[9] = -14540254;
        this.mDetailDataColor[10] = -14540254;
      }
      return this.mDetailData;
    }
  }
  
  public List<mh> getHsIndex2955Data()
  {
    return this.mHsIndex2955Data;
  }
  
  public int[] getHsZdNum()
  {
    if (this.mHsZdNum == null) {
      if (this.mMinTotalPoint == 0) {
        this.mHsZdNum = new int['ñ'];
      }
    }
    for (;;)
    {
      return this.mHsZdNum;
      this.mHsZdNum = new int[this.mMinTotalPoint];
      continue;
      if (this.mMinTotalPoint > this.mHsZdNum.length)
      {
        int[] arrayOfInt = new int[this.mMinTotalPoint];
        System.arraycopy(this.mHsZdNum, 0, arrayOfInt, 0, this.mHsZdNum.length);
        this.mHsZdNum = arrayOfInt;
      }
    }
  }
  
  public int getKChartMaxShowPrice()
  {
    return this.mKChartMaxShowPrice;
  }
  
  public int getKChartMinShowPrice()
  {
    return this.mKChartMinShowPrice;
  }
  
  public int[][] getKDDX()
  {
    return this.mKDDX;
  }
  
  public int getKDDXIndexDay()
  {
    return this.mKDDXIndexDay;
  }
  
  public int[][] getKDDY()
  {
    return this.mKDDY;
  }
  
  public int getKDDYIndexDay()
  {
    return this.mKDDYIndexDay;
  }
  
  public int[][] getKDDZ()
  {
    return this.mKDDZ;
  }
  
  public int getKDDZIndexDay()
  {
    return this.mKDDZIndexDay;
  }
  
  public int[][] getKData()
  {
    return this.mKData;
  }
  
  public int getKIndexDay()
  {
    return this.mKIndexDay;
  }
  
  public int getKLineOffset()
  {
    return this.mKLineOffset;
  }
  
  public int getKNowDay()
  {
    return this.mKNowDay;
  }
  
  public int[][] getKSupl()
  {
    return this.mSupl;
  }
  
  public int[] getKSuplH()
  {
    return this.mSuplH;
  }
  
  public int getKSuplIndexDay()
  {
    return this.mKSuplIndexDay;
  }
  
  public long[] getKVolData()
  {
    return this.mKVolData;
  }
  
  public boolean getLoanable()
  {
    return this.mLoanable;
  }
  
  public int getMarketType()
  {
    return this.mMarketType;
  }
  
  public int[][] getMinBSVol()
  {
    if (this.mMinBSVol == null) {
      if (this.mMinTotalPoint != 0) {
        break label45;
      }
    }
    label45:
    int i;
    for (this.mMinBSVol = ((int[][])Array.newInstance(Integer.TYPE, new int[] { 241, 2 }));; this.mMinBSVol = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i, 2 })))
    {
      return this.mMinBSVol;
      i = this.mMinTotalPoint;
    }
  }
  
  public int getMinChartMaxShowPrice()
  {
    return this.mMinChartMaxShowPrice;
  }
  
  public int getMinChartMinShowPrice()
  {
    return this.mMinChartMinShowPrice;
  }
  
  public int[] getMinDDX()
  {
    if (this.mMinDDX == null) {
      if (this.mMinTotalPoint != 0) {
        break label28;
      }
    }
    label28:
    for (this.mMinDDX = new int['ñ'];; this.mMinDDX = new int[this.mMinTotalPoint]) {
      return this.mMinDDX;
    }
  }
  
  public int[][] getMinData()
  {
    return this.mMinData;
  }
  
  public int[] getMinDealChaLiang()
  {
    if (this.mMinDealChaLiang == null) {
      if (this.mMinTotalPoint != 0) {
        break label28;
      }
    }
    label28:
    for (this.mMinDealChaLiang = new int['ñ'];; this.mMinDealChaLiang = new int[this.mMinTotalPoint]) {
      return this.mMinDealChaLiang;
    }
  }
  
  public List<int[]> getMinDealData()
  {
    return this.mMinDealData;
  }
  
  public int[][] getMinFiveRange()
  {
    return this.mMinFiveRange;
  }
  
  public int getMinIndex()
  {
    return this.mMinIndex;
  }
  
  public int getMinLength()
  {
    return this.mMinLength;
  }
  
  public int[][] getMinLevel2Range()
  {
    return this.mMinLevel2Range;
  }
  
  public int getMinOffset()
  {
    return this.mMinOffset;
  }
  
  public int getMinRealLen()
  {
    return this.mMinRealLen;
  }
  
  public int[] getMinTime()
  {
    return this.mMinTime;
  }
  
  public int getMinTotalPoint()
  {
    return this.mMinTotalPoint;
  }
  
  public int[] getMinTradeVolum()
  {
    return this.mMinTradeVolum;
  }
  
  public int getNP2978()
  {
    return this.mNP2978;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public List<int[]> getOptionMinDealData()
  {
    return this.mOptionMinDealData;
  }
  
  public List<mh> getPlate2955Data()
  {
    return this.mPlate2955Data;
  }
  
  public int[][] getPrototypeKData()
  {
    return this.mPrototypeKData;
  }
  
  public long[] getPrototypeKVolData()
  {
    return this.mPrototypeKVolData;
  }
  
  public int[][] getQK()
  {
    return this.mQK;
  }
  
  public String getRiseLimit()
  {
    return this.mRiseLimit;
  }
  
  public int getSecondTpPositiom()
  {
    return this.mSecondTpPositiom;
  }
  
  public int getStockExtendRank()
  {
    return this.mStockClassify;
  }
  
  public String getTotalMarketValue()
  {
    if ((this.mZxj != 0) && (this.mData2939 != null) && (this.mData2939.length > 0))
    {
      int j = (int)Math.pow(10.0D, this.mDecimalLen);
      int i = j;
      if (j <= 0) {
        i = 1;
      }
      float f = (float)Long.valueOf(az.a(this.mData2939[7])).longValue() * 1.0F / 100.0F;
      String str = Long.toString((this.mZxj * 1.0F / i * f));
      if (str.length() >= 5) {
        return StringToBill(str) + "亿";
      }
      if (!str.equals("0")) {
        return StringToBill(str) + "万";
      }
    }
    return "--";
  }
  
  public int[] getTradeVolum()
  {
    return this.mTradeVolum;
  }
  
  public int getType()
  {
    return this.mType;
  }
  
  public String getZf()
  {
    String str2;
    String str1;
    if (this.mZxj != 0)
    {
      str2 = az.c(this.mZxj, this.mCp);
      if (!str2.equals("--")) {
        break label40;
      }
      str1 = str2;
    }
    for (;;)
    {
      this.mZf = str1;
      return this.mZf;
      label40:
      if ((str2.contains("-")) || (str2.equals("0.00")))
      {
        str1 = str2 + "%";
      }
      else
      {
        str1 = str2;
        if (!str2.equals("-")) {
          str1 = "+" + str2 + "%";
        }
      }
    }
  }
  
  public String getZfValue()
  {
    if (this.mZxj != 0) {
      if (this.mZxj != this.mCp) {
        break label30;
      }
    }
    label30:
    for (this.mZfValue = "0.00";; this.mZfValue = az.a(this.mZxj, this.mCp, this.mDecimalLen)) {
      return this.mZfValue;
    }
  }
  
  public String getZtValue()
  {
    if (this.mData2939 != null) {
      return az.a(this.mData2939[4], this.mDecimalLen);
    }
    return "--";
  }
  
  public int getZxj()
  {
    return this.mZxj;
  }
  
  public ArrayList<StockVo.Api3010> getmApi3010_KChart()
  {
    return this.mApi3010_KChart;
  }
  
  public ArrayList<StockVo.Api3010> getmApi3010_MinChart()
  {
    return this.mApi3010_MinChart;
  }
  
  public int[] getmAveragePrice()
  {
    return this.mAveragePrice;
  }
  
  public int getmCc()
  {
    return this.mCc;
  }
  
  public int[] getmData2939()
  {
    return this.mData2939;
  }
  
  public int getmDecimalLen()
  {
    return this.mDecimalLen;
  }
  
  public int getmDp()
  {
    return this.mDp;
  }
  
  public int getmJj()
  {
    return this.mJj;
  }
  
  public int getmJs()
  {
    return this.mJs;
  }
  
  public int getmLb()
  {
    return this.mLb;
  }
  
  public int getmMaxVol()
  {
    return this.mMaxVol;
  }
  
  public int getmNpVol()
  {
    return this.mNpVol;
  }
  
  public int getmOp()
  {
    return this.mOp;
  }
  
  public int getmStockStatus()
  {
    return this.mStockStauts;
  }
  
  public int getmTotalAmount()
  {
    return this.mTotalAmount;
  }
  
  public int getmUp()
  {
    return this.mUp;
  }
  
  public int getmVol()
  {
    return this.mVol;
  }
  
  public int getmXsVol()
  {
    return this.mXsVol;
  }
  
  public int getmZc()
  {
    return this.mZc;
  }
  
  public boolean isExistStockTp(int paramInt)
  {
    boolean bool2 = false;
    this.mApiDoubleVol.currentPositon = paramInt;
    boolean bool1;
    if ((!this.mApiDoubleVol.isUpPricVol) || (this.mApiDoubleVol.currentPositon <= 45))
    {
      bool1 = bool2;
      if (this.mApiDoubleVol.pbRange > 0)
      {
        bool1 = bool2;
        if (this.mApiDoubleVol.pbRange < this.mApiDoubleVol.range / 2)
        {
          bool1 = bool2;
          if (this.mApiDoubleVol.isUpVol)
          {
            bool1 = bool2;
            if (this.mApiDoubleVol.isHasUpPriceIndex != 0)
            {
              bool1 = bool2;
              if (this.mApiDoubleVol.pb > 10)
              {
                bool1 = bool2;
                if (this.mApiDoubleVol.currentPositon > 2)
                {
                  bool1 = bool2;
                  if (this.mCurrentData[(this.mApiDoubleVol.currentPositon - 1)] > this.mCurrentData[(this.mApiDoubleVol.currentPositon - 2)])
                  {
                    bool1 = bool2;
                    if (this.mCurrentData[this.mApiDoubleVol.currentPositon] > this.mCurrentData[(this.mApiDoubleVol.currentPositon - 1)])
                    {
                      bool1 = bool2;
                      if (this.mCurrentData[this.mApiDoubleVol.currentPositon] >= this.mApiDoubleVol.cp * 1.06D) {}
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public boolean needExRight()
  {
    return this.mNeedExRight;
  }
  
  public void resetDetailData(int paramInt)
  {
    y localy = g.a().b();
    if (this.mDetailData == null)
    {
      this.mDetailData = new String[20];
      this.mDetailDataColor = new int[20];
      Arrays.fill(this.mDetailData, "--");
    }
    Object localObject;
    if ((this.mData2939 != null) && (this.mData2939.length > 0))
    {
      if (paramInt == 0) {
        break label1503;
      }
      long l = az.a(this.mData2939[6]);
      this.mDetailData[0] = az.a(this.mData2939[4], this.mDecimalLen);
      this.mDetailDataColor[0] = az.e(this.mData2939[4], this.mCp);
      this.mDetailData[10] = az.a(this.mData2939[5], this.mDecimalLen);
      this.mDetailDataColor[10] = az.e(this.mData2939[5], this.mCp);
      this.mDetailData[1] = az.a(this.mLb, 2);
      this.mDetailDataColor[1] = -2628628;
      this.mDetailData[11] = az.a(this.mJj, this.mDecimalLen);
      this.mDetailDataColor[11] = -2628628;
      this.mDetailData[2] = az.a(this.mVol + l, l);
      this.mDetailDataColor[2] = -2699741;
      this.mDetailData[12] = az.a(this.mOp, this.mDecimalLen);
      this.mDetailDataColor[12] = az.e(this.mOp, this.mCp);
      this.mDetailData[3] = az.f(this.mUp - this.mDp, this.mCp);
      this.mDetailDataColor[3] = -2628628;
      this.mDetailData[13] = az.a(this.mUp, this.mDecimalLen);
      this.mDetailDataColor[13] = az.e(this.mUp, this.mCp);
      this.mDetailData[4] = b.a(this.mApi2955_4416Data.wb, 2);
      this.mDetailDataColor[4] = b.h(this.mApi2955_4416Data.wb);
      this.mDetailData[14] = az.a(this.mDp, this.mDecimalLen);
      this.mDetailDataColor[14] = az.e(this.mDp, this.mCp);
      str = az.c(this.mVol);
      localObject = str;
      if (str.length() >= 5) {
        localObject = StringToBill(str) + "万";
      }
      this.mDetailData[5] = localObject;
      this.mDetailDataColor[5] = -11337729;
      this.mDetailData[15] = az.c(this.mVol - this.mNpVol);
      this.mDetailDataColor[15] = -65536;
      localObject = az.a(az.a(this.mTotalAmount));
      if (((String)localObject).length() < 5) {
        break label968;
      }
      localObject = StringToBill((String)localObject) + "亿";
      this.mDetailData[6] = localObject;
      this.mDetailDataColor[6] = -2699741;
      this.mDetailData[16] = b.j(this.mNpVol);
      this.mDetailDataColor[16] = -11753174;
      if (!n.g(paramInt)) {
        break label1013;
      }
      this.mDetailData[7] = (this.mApi2994Data.premiumPrice + "%");
      localObject = this.mDetailDataColor;
      if (!this.mApi2994Data.premiumPrice.contains("-")) {
        break label992;
      }
      paramInt = -11753174;
      label640:
      localObject[7] = paramInt;
      this.mDetailData[8] = this.mApi2994Data.priceLeverage;
      this.mDetailDataColor[8] = -2892312;
      this.mDetailData[9] = this.mApi2994Data.hideProfit;
      this.mDetailDataColor[9] = -2892312;
      this.mDetailData[17] = this.mApi2994Data.montherFundRealTimeValue;
      this.mDetailDataColor[17] = -2892312;
      this.mDetailData[18] = (this.mApi2994Data.upMontherFundRise + "%");
      localObject = this.mDetailDataColor;
      if (!this.mApi2994Data.upMontherFundRise.contains("-")) {
        break label999;
      }
      paramInt = -11753174;
      label775:
      localObject[18] = paramInt;
      this.mDetailData[19] = (this.mApi2994Data.downMontherFundDown + "%");
      localObject = this.mDetailDataColor;
      if (!this.mApi2994Data.downMontherFundDown.contains("-")) {
        break label1006;
      }
    }
    label967:
    label968:
    label992:
    label999:
    label1006:
    for (paramInt = -11753174;; paramInt = -1099463)
    {
      localObject[19] = paramInt;
      if (localy == y.b)
      {
        this.mDetailDataColor[1] = -14540254;
        this.mDetailDataColor[2] = -14540254;
        this.mDetailDataColor[3] = -14540254;
        this.mDetailDataColor[5] = -14540254;
        this.mDetailDataColor[6] = -14540254;
        this.mDetailDataColor[7] = -14540254;
        this.mDetailDataColor[8] = -14540254;
        this.mDetailDataColor[9] = -14540254;
        this.mDetailDataColor[17] = -14540254;
        this.mDetailDataColor[18] = -14540254;
        this.mDetailDataColor[19] = -14540254;
        this.mDetailDataColor[11] = -14540254;
      }
      return;
      localObject = (String)localObject + "万";
      break;
      paramInt = -1099463;
      break label640;
      paramInt = -1099463;
      break label775;
    }
    label1013:
    String str = b.j(this.mData2939[6] * 100);
    if (str.length() >= 9)
    {
      localObject = b.j(this.mData2939[6] / 100);
      localObject = StringToBill((String)localObject) + "亿";
      label1075:
      this.mDetailData[7] = localObject;
      this.mDetailDataColor[7] = -2699741;
      str = az.c(this.mData2939[7] * 100);
      if (str.length() < 9) {
        break label1437;
      }
      localObject = b.j(this.mData2939[7] / 100);
      localObject = StringToBill((String)localObject) + "亿";
    }
    for (;;)
    {
      label1155:
      this.mDetailData[8] = localObject;
      this.mDetailDataColor[8] = -2699741;
      if (this.mApi2955_4416Data.syl == 0)
      {
        localObject = b.a(this.mApi2955_4416Data.syl, 2);
        label1195:
        this.mDetailData[9] = localObject;
        this.mDetailDataColor[9] = -2628628;
        this.mDetailData[17] = getCirculationValue();
        this.mDetailDataColor[17] = -2699741;
        this.mDetailData[18] = getTotalMarketValue();
        this.mDetailDataColor[18] = -2699741;
        if (this.mApi2955_4416Data.sjl != 0) {
          break label1488;
        }
      }
      label1437:
      label1488:
      for (localObject = b.a(this.mApi2955_4416Data.sjl, 2);; localObject = b.a(this.mApi2955_4416Data.sjl, 2))
      {
        this.mDetailData[19] = localObject;
        this.mDetailDataColor[19] = -2628628;
        if ((!n.f(paramInt)) && (!n.b(paramInt, this.mMarketType)) && (!n.e(paramInt))) {
          break;
        }
        this.mDetailData[17] = "--";
        this.mDetailDataColor[17] = -2699741;
        this.mDetailData[18] = "--";
        this.mDetailDataColor[18] = -2699741;
        this.mDetailData[7] = "--";
        this.mDetailDataColor[7] = -2699741;
        this.mDetailData[8] = "--";
        this.mDetailDataColor[8] = -2699741;
        break;
        localObject = str;
        if (str.length() < 5) {
          break label1075;
        }
        localObject = StringToBill(str) + "万";
        break label1075;
        if (((String)localObject).length() < 5) {
          break label2283;
        }
        localObject = StringToBill(str) + "万";
        break label1155;
        localObject = b.a(this.mApi2955_4416Data.syl, 2);
        break label1195;
      }
      label1503:
      this.mDetailData[0] = b.a(this.mZxj, this.mDecimalLen);
      this.mDetailDataColor[0] = b.i(this.mZxj, this.mCp);
      this.mDetailData[1] = b.a(this.mZxj - this.mCp, this.mDecimalLen);
      this.mDetailDataColor[1] = b.i(this.mZxj, this.mCp);
      this.mDetailData[2] = b.a(this.mOp, this.mDecimalLen);
      this.mDetailDataColor[2] = this.mDetailDataColor[1];
      str = az.c(this.mVol);
      localObject = str;
      if (str.length() >= 5) {
        localObject = StringToBill(str) + "万";
      }
      this.mDetailData[3] = localObject;
      this.mDetailDataColor[3] = -2628628;
      this.mDetailData[4] = b.a(this.mVol + b.b(this.mData2939[6]), b.b(this.mData2939[6]));
      this.mDetailDataColor[4] = -2628628;
      this.mDetailData[5] = n.v(b.e(b.b(this.mTotalAmount) * 10000L));
      this.mDetailDataColor[5] = -2699741;
      this.mDetailData[6] = (n.v(b.j(this.mApi2206Data.sumValue)) + "亿");
      this.mDetailDataColor[6] = -2699741;
      this.mDetailData[7] = az.a(this.mUp, this.mDecimalLen);
      this.mDetailDataColor[7] = b.i(this.mUp, this.mCp);
      this.mDetailData[8] = az.a(this.mData2939[4], this.mDecimalLen);
      this.mDetailDataColor[8] = b.i(this.mData2939[4], this.mCp);
      this.mDetailData[9] = az.a(this.mApi2206Data.avgPrice, this.mDecimalLen);
      this.mDetailDataColor[9] = b.i(this.mData2939[4], this.mCp);
      this.mDetailData[10] = b.m(this.mZxj, this.mCp);
      this.mDetailDataColor[10] = b.i(this.mZxj, this.mCp);
      this.mDetailData[11] = b.a(this.mCp, this.mDecimalLen);
      this.mDetailDataColor[11] = -6776680;
      this.mDetailData[12] = b.j(this.mXsVol);
      this.mDetailDataColor[12] = -2628628;
      this.mDetailData[13] = az.f(this.mUp - this.mDp, this.mCp);
      this.mDetailDataColor[13] = -2628628;
      this.mDetailData[14] = b.a(this.mLb, 2);
      this.mDetailDataColor[14] = -2628628;
      if (this.mApi2206Data.sumCirculationValue != 0) {
        this.mDetailData[15] = (n.v(b.j(this.mApi2206Data.sumCirculationValue)) + "亿");
      }
      this.mDetailDataColor[15] = -2699741;
      this.mDetailData[16] = az.a(this.mDp, this.mDecimalLen);
      this.mDetailDataColor[16] = b.i(this.mDp, this.mCp);
      this.mDetailData[17] = az.a(this.mData2939[5], this.mDecimalLen);
      this.mDetailDataColor[17] = b.i(this.mData2939[5], this.mCp);
      if (localy != y.b) {
        break label967;
      }
      this.mDetailDataColor[3] = -14540254;
      this.mDetailDataColor[4] = -14540254;
      this.mDetailDataColor[5] = -14540254;
      this.mDetailDataColor[6] = -14540254;
      this.mDetailDataColor[11] = -14540254;
      this.mDetailDataColor[12] = -14540254;
      this.mDetailDataColor[13] = -14540254;
      this.mDetailDataColor[14] = -14540254;
      this.mDetailDataColor[15] = -14540254;
      return;
      label2283:
      localObject = str;
    }
  }
  
  public void set2940DealsData(int[] paramArrayOfInt)
  {
    this.m2940DealsData = paramArrayOfInt;
  }
  
  public void set2997Data(String[] paramArrayOfString)
  {
    this.a2997Data = paramArrayOfString;
  }
  
  public void setApi2206Data(StockVo.Api2206 paramApi2206)
  {
    this.mApi2206Data = paramApi2206;
  }
  
  public void setApi2917Data(StockVo.Api2917 paramApi2917)
  {
    this.mApi2917Data = paramApi2917;
  }
  
  public void setApi2930(StockVo.Api2930 paramApi2930)
  {
    this.mApi2930Data = paramApi2930;
  }
  
  public void setApi2955_4416Data(StockVo.Api2955_4416 paramApi2955_4416)
  {
    this.mApi2955_4416Data = paramApi2955_4416;
  }
  
  public void setApi2976(StockVo.Api2931 paramApi2931)
  {
    this.mApi2976Data = paramApi2931;
  }
  
  public void setApi2987ExecDelen(int paramInt)
  {
    this.mApi2987ExecRightDelen = paramInt;
  }
  
  public void setApi2987ExecPrice(int paramInt)
  {
    this.mApi2987ExecRightPrice = paramInt;
  }
  
  public void setApi2987ExecRightDay(int paramInt)
  {
    this.mApi2987ExecRightDay = paramInt;
  }
  
  public void setApi2994Data(StockVo.Api2994 paramApi2994)
  {
    this.mApi2994Data = paramApi2994;
  }
  
  public void setApi3010_KChart(ArrayList<StockVo.Api3010> paramArrayList)
  {
    this.mApi3010_KChart = paramArrayList;
  }
  
  public void setApi3010_MinChart(ArrayList<StockVo.Api3010> paramArrayList)
  {
    this.mApi3010_MinChart = paramArrayList;
  }
  
  public void setApi3010_Table_KChart(ArrayList<StockVo.Api3010_Table> paramArrayList)
  {
    this.mApi3010_Table_KChart = paramArrayList;
  }
  
  public void setApi3010_Table_MinChart(ArrayList<StockVo.Api3010_Table> paramArrayList)
  {
    this.mApi3010_Table_MinChart = paramArrayList;
  }
  
  public void setBs(int[][] paramArrayOfInt)
  {
    this.mBs = paramArrayOfInt;
  }
  
  public void setBsTag(int[][] paramArrayOfInt)
  {
    this.mBsTag = paramArrayOfInt;
  }
  
  public void setCCTag(int paramInt)
  {
    this.mCCTag = paramInt;
  }
  
  public void setCjl2978(int paramInt)
  {
    this.mCjl2978 = paramInt;
  }
  
  public void setCp(int paramInt)
  {
    this.mCp = paramInt;
  }
  
  public void setCurrentData(int[] paramArrayOfInt)
  {
    this.mCurrentData = paramArrayOfInt;
  }
  
  public void setCurrentValue(String paramString)
  {
    this.mCurrentValue = paramString;
  }
  
  public void setDownLimit(String paramString)
  {
    this.mDownLimit = paramString;
  }
  
  public void setExRightsAdd(int[] paramArrayOfInt)
  {
    this.mExRightsAdd = paramArrayOfInt;
  }
  
  public void setExRightsId(int[] paramArrayOfInt)
  {
    this.mExRightsId = paramArrayOfInt;
  }
  
  public void setExRightsMulti(int[] paramArrayOfInt)
  {
    this.mExRightsMulti = paramArrayOfInt;
  }
  
  public void setExRightsTime(int[] paramArrayOfInt)
  {
    this.mExRightsTime = paramArrayOfInt;
  }
  
  public void setFirstTpPosition(int paramInt)
  {
    this.mFirstTpPosition = paramInt;
  }
  
  public void setHsIndex2955Data(List<mh> paramList)
  {
    this.mHsIndex2955Data = paramList;
  }
  
  public void setHsZdNum(int[] paramArrayOfInt)
  {
    this.mHsZdNum = paramArrayOfInt;
  }
  
  public void setKChartStockDrawMaxMin(int paramInt1, int paramInt2)
  {
    this.mKChartMaxShowPrice = paramInt1;
    this.mKChartMinShowPrice = paramInt2;
  }
  
  public void setKDDX(int[][] paramArrayOfInt)
  {
    this.mKDDX = paramArrayOfInt;
  }
  
  public void setKDDXIndexDay(int paramInt)
  {
    this.mKDDXIndexDay = paramInt;
  }
  
  public void setKDDY(int[][] paramArrayOfInt)
  {
    this.mKDDY = paramArrayOfInt;
  }
  
  public void setKDDYIndexDay(int paramInt)
  {
    this.mKDDYIndexDay = paramInt;
  }
  
  public void setKDDZ(int[][] paramArrayOfInt)
  {
    this.mKDDZ = paramArrayOfInt;
  }
  
  public void setKDDZIndexDay(int paramInt)
  {
    this.mKDDZIndexDay = paramInt;
  }
  
  public void setKData(int[][] paramArrayOfInt)
  {
    this.mKData = paramArrayOfInt;
    doQK();
  }
  
  public void setKIndexDay(int paramInt)
  {
    this.mKIndexDay = paramInt;
  }
  
  public void setKLineOffset(int paramInt)
  {
    this.mKLineOffset = paramInt;
  }
  
  public void setKNowDay(int paramInt)
  {
    this.mKNowDay = paramInt;
  }
  
  public void setKSupl(int[][] paramArrayOfInt)
  {
    this.mSupl = paramArrayOfInt;
    if (this.mSupl.length == 1)
    {
      this.mSuplH = new int[1];
      return;
    }
    this.mSuplH = new int[this.mSupl.length - 1];
  }
  
  public void setKSuplIndexDay(int paramInt)
  {
    this.mKSuplIndexDay = paramInt;
  }
  
  public void setKVolData(long[] paramArrayOfLong)
  {
    this.mKVolData = paramArrayOfLong;
  }
  
  public void setLoanable(boolean paramBoolean)
  {
    this.mLoanable = paramBoolean;
  }
  
  public void setMinBSVol(int[][] paramArrayOfInt)
  {
    this.mMinBSVol = paramArrayOfInt;
  }
  
  public void setMinDDX(int[] paramArrayOfInt)
  {
    this.mMinDDX = paramArrayOfInt;
  }
  
  public void setMinData(int[][] paramArrayOfInt)
  {
    this.mMinData = paramArrayOfInt;
  }
  
  public void setMinDealChaLiang(int[] paramArrayOfInt)
  {
    this.mMinDealChaLiang = paramArrayOfInt;
  }
  
  public void setMinDealData(List<int[]> paramList)
  {
    this.mMinDealData = paramList;
  }
  
  public void setMinFiveRange(int[][] paramArrayOfInt)
  {
    this.mMinFiveRange = paramArrayOfInt;
  }
  
  public void setMinIndex(int paramInt)
  {
    this.mMinIndex = paramInt;
  }
  
  public void setMinLength(int paramInt)
  {
    this.mMinLength = paramInt;
  }
  
  public void setMinLevel2Range(int[][] paramArrayOfInt)
  {
    this.mMinLevel2Range = paramArrayOfInt;
  }
  
  public void setMinOffset(int paramInt)
  {
    this.mMinOffset = paramInt;
  }
  
  public void setMinRealLen(int paramInt)
  {
    this.mMinRealLen = paramInt;
  }
  
  public void setMinTime(int[] paramArrayOfInt)
  {
    this.mMinTime = paramArrayOfInt;
  }
  
  public void setMinTotalPoint(int paramInt)
  {
    this.mMinTotalPoint = paramInt;
  }
  
  public void setMinTradeVolum(int[] paramArrayOfInt)
  {
    this.mMinTradeVolum = paramArrayOfInt;
  }
  
  public void setNP2978(int paramInt)
  {
    this.mNP2978 = paramInt;
  }
  
  public void setName(String paramString)
  {
    this.mName = paramString;
  }
  
  public void setNeedExRight(boolean paramBoolean)
  {
    this.mNeedExRight = paramBoolean;
  }
  
  public void setOptionMinDealData(List<int[]> paramList)
  {
    this.mOptionMinDealData = paramList;
  }
  
  public void setPlate2955Data(List<mh> paramList)
  {
    this.mPlate2955Data = paramList;
  }
  
  public void setPrototypeKData(int[][] paramArrayOfInt)
  {
    this.mPrototypeKData = paramArrayOfInt;
  }
  
  public void setPrototypeKVolData(long[] paramArrayOfLong)
  {
    this.mPrototypeKVolData = paramArrayOfLong;
  }
  
  public void setQK(int[][] paramArrayOfInt)
  {
    this.mQK = paramArrayOfInt;
  }
  
  public void setRiseLimit(String paramString)
  {
    this.mRiseLimit = paramString;
  }
  
  public void setSecondTpPositiom(int paramInt)
  {
    this.mSecondTpPositiom = paramInt;
  }
  
  public void setStockDrawMaxMin(int paramInt1, int paramInt2)
  {
    this.mMinChartMaxShowPrice = paramInt1;
    this.mMinChartMinShowPrice = paramInt2;
  }
  
  public void setStockExtendRank(int paramInt)
  {
    this.mStockClassify = paramInt;
  }
  
  public void setTradeVolum(int[] paramArrayOfInt)
  {
    this.mTradeVolum = paramArrayOfInt;
  }
  
  public void setType(int paramInt)
  {
    this.mType = paramInt;
  }
  
  public void setZf(String paramString)
  {
    this.mZf = paramString;
  }
  
  public void setZfValue(String paramString)
  {
    this.mZfValue = paramString;
  }
  
  public void setZxj(int paramInt)
  {
    this.mZxj = paramInt;
  }
  
  public void setmAveragePrice(int[] paramArrayOfInt)
  {
    this.mAveragePrice = paramArrayOfInt;
  }
  
  public void setmCc(int paramInt)
  {
    this.mCc = paramInt;
  }
  
  public void setmData2939(int[] paramArrayOfInt)
  {
    this.mData2939 = paramArrayOfInt;
  }
  
  public void setmDecimalLen(int paramInt)
  {
    this.mDecimalLen = paramInt;
  }
  
  public void setmDp(int paramInt)
  {
    this.mDp = paramInt;
  }
  
  public void setmJj(int paramInt)
  {
    this.mJj = paramInt;
  }
  
  public void setmJs(int paramInt)
  {
    this.mJs = paramInt;
  }
  
  public void setmLb(int paramInt)
  {
    this.mLb = paramInt;
  }
  
  public void setmMaxVol(int paramInt)
  {
    this.mMaxVol = paramInt;
  }
  
  public void setmNpVol(int paramInt)
  {
    this.mNpVol = paramInt;
  }
  
  public void setmOp(int paramInt)
  {
    this.mOp = paramInt;
  }
  
  public void setmStockStatus(int paramInt)
  {
    this.mStockStauts = paramInt;
  }
  
  public void setmTotalAmount(int paramInt)
  {
    this.mTotalAmount = paramInt;
  }
  
  public void setmUp(int paramInt)
  {
    this.mUp = paramInt;
  }
  
  public void setmVol(int paramInt)
  {
    this.mVol = paramInt;
  }
  
  public void setmXsVol(int paramInt)
  {
    this.mXsVol = paramInt;
  }
  
  public void setmZc(int paramInt)
  {
    this.mZc = paramInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mName);
    paramParcel.writeString(this.mCode);
    paramParcel.writeInt(this.mType);
    paramParcel.writeString(this.mCurrentValue);
    paramParcel.writeString(this.mZf);
    paramParcel.writeString(this.mZfValue);
    paramParcel.writeBooleanArray(new boolean[] { this.mLoanable });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */