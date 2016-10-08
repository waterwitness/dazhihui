package com.android.thinkive.framework.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.android.thinkive.framework.js.BaseJsInterface;
import java.util.ArrayList;

public class MyWebView
  extends WebView
{
  private boolean isLoadComplete;
  private boolean isPersistence;
  private BaseJsInterface jsInterface;
  private String loadUrl;
  private ArrayList<MyWebView.UrlLoadListener> mListenerList = new ArrayList();
  public int minH;
  public int minW;
  public int oldH;
  public int oldW;
  private String urlPrefix;
  private String urlSuffix;
  private String webViewName;
  
  public MyWebView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MyWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MyWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void addUrlLoadListener(MyWebView.UrlLoadListener paramUrlLoadListener)
  {
    if (!this.mListenerList.contains(paramUrlLoadListener)) {
      this.mListenerList.add(paramUrlLoadListener);
    }
  }
  
  public BaseJsInterface getJsInterface()
  {
    return this.jsInterface;
  }
  
  public String getLoadUrl()
  {
    return this.loadUrl;
  }
  
  public String getUrlPrefix()
  {
    return this.urlPrefix;
  }
  
  public String getUrlSuffix()
  {
    return this.urlSuffix;
  }
  
  public String getWebViewName()
  {
    return this.webViewName;
  }
  
  public boolean isLoadComplete()
  {
    return this.isLoadComplete;
  }
  
  public boolean isPersistence()
  {
    return this.isPersistence;
  }
  
  public void loadUrl(String paramString)
  {
    super.loadUrl(paramString);
  }
  
  public void notifyAllListener()
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.mListenerList.size()) {
        return;
      }
      ((MyWebView.UrlLoadListener)this.mListenerList.get(i)).onComplete();
      i += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt3 == 0) && (paramInt4 == 0))
    {
      this.minW = paramInt1;
      this.minH = paramInt2;
    }
    this.oldW = paramInt1;
    this.oldH = paramInt2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void refreshSize()
  {
    onSizeChanged(this.minW, this.minH, this.oldW, this.oldH);
  }
  
  public void refreshSize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void removeUrlLoadListener(MyWebView.UrlLoadListener paramUrlLoadListener)
  {
    this.mListenerList.remove(paramUrlLoadListener);
  }
  
  public void setIsLoadComplete(boolean paramBoolean)
  {
    this.isLoadComplete = paramBoolean;
  }
  
  public void setIsPersistence(boolean paramBoolean)
  {
    this.isPersistence = paramBoolean;
  }
  
  public void setJsInterface(BaseJsInterface paramBaseJsInterface)
  {
    this.jsInterface = paramBaseJsInterface;
  }
  
  public void setLoadUrl(String paramString)
  {
    this.loadUrl = paramString;
  }
  
  public void setUrlPrefix(String paramString)
  {
    this.urlPrefix = paramString;
  }
  
  public void setUrlSuffix(String paramString)
  {
    this.urlSuffix = paramString;
  }
  
  public void setWebViewName(String paramString)
  {
    this.webViewName = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\view\MyWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */