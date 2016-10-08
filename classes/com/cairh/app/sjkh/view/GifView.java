package com.cairh.app.sjkh.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.cairh.app.sjkh.common.MResource;

public class GifView
  extends View
{
  private static final int DEFAULT_MOVIE_DURATION = 1000;
  private int mCurrentAnimationTime = 0;
  private float mLeft;
  private int mMeasuredMovieHeight;
  private int mMeasuredMovieWidth;
  private Movie mMovie;
  private int mMovieResourceId;
  private long mMovieStart;
  private volatile boolean mPaused = false;
  private float mScale;
  private float mTop;
  private boolean mVisible = true;
  
  public GifView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public GifView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, MResource.getIdByName("attr", "gifViewStyle"));
  }
  
  public GifView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setViewAttributes(paramContext, paramAttributeSet, paramInt);
  }
  
  private void drawMovieFrame(Canvas paramCanvas)
  {
    this.mMovie.setTime(this.mCurrentAnimationTime);
    paramCanvas.save(1);
    paramCanvas.scale(this.mScale, this.mScale);
    this.mMovie.draw(paramCanvas, this.mLeft / this.mScale, this.mTop / this.mScale);
    paramCanvas.restore();
  }
  
  @SuppressLint({"NewApi"})
  private void invalidateView()
  {
    if (this.mVisible) {
      invalidate();
    }
  }
  
  @SuppressLint({"NewApi"})
  private void setViewAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      setLayerType(1, null);
    }
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = MResource.getIdByName("attr", "gif");
    arrayOfInt[1] = MResource.getIdByName("attr", "paused");
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, MResource.getIdByName("style", "AppTheme"));
    this.mMovieResourceId = arrayOfInt[0];
    this.mPaused = paramContext.getBoolean(arrayOfInt[1], false);
    paramContext.recycle();
    if (this.mMovieResourceId != -1) {
      this.mMovie = Movie.decodeStream(getResources().openRawResource(this.mMovieResourceId));
    }
  }
  
  private void updateAnimationTime()
  {
    long l = SystemClock.uptimeMillis();
    if (this.mMovieStart == 0L) {
      this.mMovieStart = l;
    }
    int j = this.mMovie.duration();
    int i = j;
    if (j == 0) {
      i = 1000;
    }
    this.mCurrentAnimationTime = ((int)((l - this.mMovieStart) % i));
  }
  
  public Movie getMovie()
  {
    return this.mMovie;
  }
  
  public boolean isPaused()
  {
    return this.mPaused;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.mMovie != null)
    {
      if (!this.mPaused)
      {
        updateAnimationTime();
        drawMovieFrame(paramCanvas);
        invalidateView();
      }
    }
    else {
      return;
    }
    drawMovieFrame(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mLeft = ((getWidth() - this.mMeasuredMovieWidth) / 2.0F);
    this.mTop = ((getHeight() - this.mMeasuredMovieHeight) / 2.0F);
    if (getVisibility() == 0) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.mVisible = paramBoolean;
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.mMovie != null)
    {
      paramInt2 = this.mMovie.width();
      int i = this.mMovie.height();
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      this.mScale = (1.0F / (paramInt2 / paramInt1));
      this.mMeasuredMovieWidth = paramInt1;
      this.mMeasuredMovieHeight = ((int)(i * this.mScale));
      setMeasuredDimension(this.mMeasuredMovieWidth, this.mMeasuredMovieHeight);
      return;
    }
    setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
  }
  
  @SuppressLint({"NewApi"})
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.mVisible = bool;
      invalidateView();
      return;
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.mVisible = bool;
      invalidateView();
      return;
    }
  }
  
  public void setMovie(Movie paramMovie)
  {
    this.mMovie = paramMovie;
    requestLayout();
  }
  
  public void setMovieResource(int paramInt)
  {
    this.mMovieResourceId = paramInt;
    this.mMovie = Movie.decodeStream(getResources().openRawResource(this.mMovieResourceId));
    requestLayout();
  }
  
  public void setMovieTime(int paramInt)
  {
    this.mCurrentAnimationTime = paramInt;
    invalidate();
  }
  
  public void setPaused(boolean paramBoolean)
  {
    this.mPaused = paramBoolean;
    if (!paramBoolean) {
      this.mMovieStart = (SystemClock.uptimeMillis() - this.mCurrentAnimationTime);
    }
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\view\GifView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */