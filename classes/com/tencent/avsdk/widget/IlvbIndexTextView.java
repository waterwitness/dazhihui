package com.tencent.avsdk.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.Vector;

public class IlvbIndexTextView
  extends TextView
  implements View.OnClickListener, i, IRequestAdapterListener
{
  private static final String mStockCode = "SH000001";
  private Handler mAutoFlipHandler = new Handler();
  private Runnable mAutoFlipRunnable = new IlvbIndexTextView.1(this);
  private int mAutoRefreshTime = 3000;
  private Context mContext;
  private SpannableStringBuilder mIndexInfo = new SpannableStringBuilder();
  private m mManualRequest;
  protected RequestAdapter mRequestAdapter = new IlvbIndexTextView.2(this);
  private Toast mToast;
  private String mTopicText = "";
  private boolean showTopic;
  
  public IlvbIndexTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public IlvbIndexTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IlvbIndexTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    setOnClickListener(this);
  }
  
  private m getRequest()
  {
    Vector localVector = new Vector();
    localVector.add("SH000001");
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2955);
    arrayOfx[0].c(107);
    arrayOfx[0].c(0);
    arrayOfx[0].a(localVector);
    arrayOfx[0].c("互动直播-上证指数");
    return new m(arrayOfx);
  }
  
  private void gotoMinute()
  {
    Vector localVector = new Vector();
    localVector.add(new StockVo("上证指数", "SH000001", 0, false));
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("stock_vo", (Parcelable)localVector.get(0));
    r.a(this.mContext, localVector, 0, localBundle);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i = -1;
    for (;;)
    {
      int m;
      int n;
      try
      {
        if (paramh != this.mManualRequest) {
          break;
        }
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        paramh = paramh.h();
        if ((paramh == null) || (paramh.a != 2955)) {
          break;
        }
        paramh = new q(paramh.b);
        int j = paramh.e();
        int k = paramh.e();
        paramh.e();
        paramh.e();
        if ((j != 107) || (k != 0)) {
          break;
        }
        paramj = new SelfStock();
        paramj.selfType = 3;
        String str1 = paramh.l();
        String str2 = paramh.l();
        paramj.setStockCode(str1);
        paramj.setStockName(str2);
        paramj.setDecl(paramh.b());
        paramj.setType(paramh.b());
        paramj.setZs(paramh.h());
        paramh.h();
        paramj.setZxData(paramh.h());
        paramh.h();
        paramh.h();
        paramj.setCje(paramh.h());
        paramj.setLoanable(false);
        this.mIndexInfo = new SpannableStringBuilder();
        j = this.mIndexInfo.length();
        this.mIndexInfo.append(paramj.getStockName());
        k = this.mIndexInfo.length();
        this.mIndexInfo.setSpan(new ForegroundColorSpan(-1), j, k, 33);
        j = this.mIndexInfo.length();
        this.mIndexInfo.append(" " + paramj.getZx() + " " + paramj.getZf());
        k = this.mIndexInfo.length();
        m = paramj.latestPrice;
        n = paramj.closePrice;
        if ((m == 0) && (n == 0))
        {
          this.mIndexInfo.setSpan(new ForegroundColorSpan(i), j, k, 33);
          if ((this.showTopic) || (TextUtils.isEmpty(this.mIndexInfo))) {
            break;
          }
          setText(this.mIndexInfo);
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      if (m > n) {
        i = -238510;
      } else if (m < n) {
        i = -11883738;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (g.a().L()) {
      showShortToast(2131166193);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    showShortToast(2131166192);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    start();
  }
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (getContext() != null) && (!this.showTopic)) {
      gotoMinute();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    stop();
  }
  
  public void registRequestListener(h paramh)
  {
    this.mRequestAdapter.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.mRequestAdapter.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.mRequestAdapter.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.mRequestAdapter.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.mRequestAdapter.setAutoRequestPeriod(paramLong);
  }
  
  public void setTopicText(String paramString)
  {
    this.mTopicText = paramString;
    if ((this.showTopic) && (!TextUtils.isEmpty(this.mTopicText))) {
      setText(this.mTopicText);
    }
  }
  
  public void showShortToast(int paramInt)
  {
    if ((this.mContext == null) || (((this.mContext instanceof Activity)) && (((Activity)this.mContext).isFinishing()))) {}
    String str;
    do
    {
      return;
      str = this.mContext.getResources().getString(paramInt);
    } while ((this.mToast == null) || (TextUtils.isEmpty(str)));
    this.mToast.setText(str);
    this.mToast.show();
  }
  
  public void start()
  {
    if (this.mManualRequest == null)
    {
      this.mManualRequest = getRequest();
      this.mManualRequest.a(n.d);
      this.mManualRequest.e(true);
      registRequestListener(this.mManualRequest);
    }
    this.mAutoFlipHandler.removeCallbacks(this.mAutoFlipRunnable);
    this.mAutoFlipHandler.post(this.mAutoFlipRunnable);
  }
  
  public void stop()
  {
    this.mAutoFlipHandler.removeCallbacks(this.mAutoFlipRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbIndexTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */