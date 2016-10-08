package com.tencent.avsdk.control;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.av.opengl.GraphicRendererMgr;
import com.tencent.av.opengl.glrenderer.GLCanvas;
import com.tencent.av.opengl.texture.BasicTexture;
import com.tencent.av.opengl.texture.StringTexture;
import com.tencent.av.opengl.texture.YUVTexture;
import com.tencent.av.opengl.ui.GLRootView;
import com.tencent.av.opengl.ui.GLView;
import com.tencent.av.opengl.utils.Utils;

public class GLVideoView
  extends GLView
{
  private static final int BOTTOM = 8;
  private static final int LEFT = 1;
  private static final long LOADING_ELAPSE = 80L;
  public static final float MAX_SCALE = 4.0F;
  public static final float MIN_SCALE = 0.75F;
  private static final int NONE = 0;
  private static final int RIGHT = 2;
  private static final String TAG = "ilvb";
  private static final int TOP = 4;
  private Runnable loadingRunnable = new GLVideoView.2(this);
  private Context mContext;
  private boolean mDragging = false;
  int mGlVersion = -1;
  private GraphicRendererMgr mGraphicRenderMgr = null;
  Handler mHandler = null;
  private int mHeight = 0;
  private String mIdentifier = null;
  public boolean mIsCreator = false;
  boolean mIsLand;
  private boolean mIsPC = false;
  private boolean mIsRenderStart = false;
  private long mLastLoadingTime = 0L;
  private boolean mLoading = false;
  private int mLoadingAngle = 0;
  private BasicTexture mLoadingTexture;
  private boolean mMirror = false;
  private boolean mNeedRenderVideo = true;
  private float mOffsetX = 0.0F;
  private float mOffsetY = 0.0F;
  private int mPivotX = 0;
  private int mPivotY = 0;
  private int mPosition = 0;
  private int mRotation = 0;
  private float mScale = 1.0F;
  private StringTexture mStringTexture;
  private int mTypeScreenTopOffset = 0;
  private int mVideoSrcType = 0;
  private int mWidth = 0;
  private int mX = 0;
  private int mY = 0;
  private YUVTexture mYuvTexture;
  
  public GLVideoView(Context paramContext, GraphicRendererMgr paramGraphicRendererMgr, Handler paramHandler)
  {
    this.mContext = paramContext;
    this.mHandler = paramHandler;
    this.mYuvTexture = new YUVTexture(this.mContext);
    this.mYuvTexture.setGLRenderListener(new GLVideoView.1(this));
    this.mGraphicRenderMgr = paramGraphicRendererMgr;
  }
  
  private boolean hasBlackBorder(int paramInt)
  {
    if (TextUtils.isEmpty(this.mIdentifier)) {}
    do
    {
      do
      {
        return false;
      } while ((this.mParent == null) || (getWidth() != this.mParent.getWidth()) || (getHeight() != this.mParent.getHeight()));
      if (this.mIsPC) {
        return true;
      }
      if (paramInt % 2 != 0) {
        break;
      }
    } while (this.mVideoSrcType == 1);
    return true;
    return true;
  }
  
  public void clearRender()
  {
    if (this.mIdentifier != null)
    {
      String str = this.mIdentifier + "_" + this.mVideoSrcType;
      this.mGraphicRenderMgr.setGlRender(str, null);
    }
    this.mIdentifier = null;
    this.mVideoSrcType = 0;
    this.mScale = 1.0F;
    this.mPivotX = 0;
    this.mPivotY = 0;
    this.mOffsetX = 0.0F;
    this.mOffsetY = 0.0F;
  }
  
  public void emptyIdentifier()
  {
    this.mIdentifier = null;
  }
  
  public void enableLoading(boolean paramBoolean)
  {
    GLRootView localGLRootView;
    if (this.mLoading != paramBoolean)
    {
      Log.d("ilvb", "GLVideoView enableLoading uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", loading: " + paramBoolean + ", mLoading: " + this.mLoading);
      this.mLoading = paramBoolean;
      if (!paramBoolean) {
        break label127;
      }
      if (this.mLoadingTexture == null) {}
      localGLRootView = getGLRootView();
      if (localGLRootView != null) {
        localGLRootView.post(this.loadingRunnable);
      }
    }
    for (;;)
    {
      if (getGLRootView() != null) {
        this.mTypeScreenTopOffset = getGLRootView().getResources().getDimensionPixelSize(2131230779);
      }
      return;
      label127:
      localGLRootView = getGLRootView();
      if (localGLRootView != null) {
        localGLRootView.removeCallbacks(this.loadingRunnable);
      }
    }
  }
  
  protected void finalize()
  {
    super.finalize();
    if (this.mStringTexture != null)
    {
      this.mStringTexture.recycle();
      this.mStringTexture = null;
    }
    if (this.mLoadingTexture != null)
    {
      this.mLoadingTexture.recycle();
      this.mLoadingTexture = null;
    }
    if (this.mYuvTexture != null)
    {
      this.mYuvTexture.recycle();
      this.mYuvTexture = null;
    }
    this.loadingRunnable = null;
  }
  
  public void flush()
  {
    if (this.mYuvTexture != null) {
      this.mYuvTexture.flush(false);
    }
    if (this.mIdentifier != null)
    {
      String str = this.mIdentifier + "_" + this.mVideoSrcType;
      this.mGraphicRenderMgr.flushGlRender(str);
    }
  }
  
  public String getIdentifier()
  {
    return this.mIdentifier;
  }
  
  public int getRotation()
  {
    return this.mRotation;
  }
  
  public float getScale()
  {
    return this.mScale;
  }
  
  public int getVideoSrcType()
  {
    return this.mVideoSrcType;
  }
  
  public boolean hasVideo()
  {
    if (this.mYuvTexture != null) {
      return this.mYuvTexture.canRender();
    }
    return false;
  }
  
  public boolean isLoading()
  {
    return this.mLoading;
  }
  
  public boolean isMirror()
  {
    return this.mMirror;
  }
  
  public boolean isPC()
  {
    return this.mIsPC;
  }
  
  public void onDestroy()
  {
    Log.d("ilvb", "GLVideoView onDestroy");
    this.mHandler = null;
  }
  
  protected void onDetachFromRoot()
  {
    GLRootView localGLRootView = getGLRootView();
    if (localGLRootView != null) {
      localGLRootView.removeCallbacks(this.loadingRunnable);
    }
    super.onDetachFromRoot();
  }
  
  protected void render(GLCanvas paramGLCanvas)
  {
    Rect localRect = getPaddings();
    renderBackground(paramGLCanvas);
    int j;
    int i;
    int m;
    float f2;
    float f5;
    float f6;
    int k;
    float f4;
    float f3;
    if ((this.mIdentifier != null) && (this.mYuvTexture != null) && (this.mYuvTexture.canRender()) && (this.mNeedRenderVideo))
    {
      enableLoading(false);
      j = getWidth();
      i = getHeight();
      j = j - localRect.left - localRect.right;
      i = i - localRect.top - localRect.bottom;
      m = (this.mYuvTexture.getImgAngle() + this.mRotation + 4) % 4;
      f2 = localRect.left;
      f1 = localRect.top;
      f5 = j;
      f6 = i;
      if (m % 2 == 0) {
        break label1516;
      }
      k = (int)j;
      j = i;
      i = k;
      f4 = f1;
      f3 = f6;
    }
    for (float f1 = f5;; f1 = f6)
    {
      float f7 = this.mYuvTexture.getImgWidth();
      float f8 = this.mYuvTexture.getImgHeight();
      float f9 = f7 / f8;
      f6 = f3 / f1;
      if ((!this.mIsCreator) && (hasBlackBorder(m))) {
        if (m % 2 == 0)
        {
          f5 = f3 / f9;
          if (f5 > f1)
          {
            f5 = f1 * f9;
            f4 += (f3 - f5) / 2.0F;
            f3 = f5;
            f6 = f3 / f1;
            f5 = f2;
            f2 = f1;
          }
        }
      }
      for (f1 = f6;; f1 = f6)
      {
        f4 = f4 * this.mScale + this.mPivotX * (1.0F - this.mScale);
        f5 = f5 * this.mScale + this.mPivotY * (1.0F - this.mScale);
        f3 *= this.mScale;
        f2 *= this.mScale;
        if ((!this.mDragging) && (this.mPosition != 0))
        {
          if ((this.mPosition & 0x3) == 3)
          {
            this.mOffsetX = (j / 2 - (f3 / 2.0F + f4));
            label371:
            if ((this.mPosition & 0xC) != 12) {
              break label1357;
            }
            this.mOffsetY = (i / 2 - (f2 / 2.0F + f5));
            label399:
            this.mPosition = 0;
            Log.d("ilvb", "GLVideoView render uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", width: " + j + ", height: " + i + ", mScale: " + this.mScale + ", mPivotX: " + this.mPivotX + ", mPivotY: " + this.mPivotY + ", x: " + f4 + ", y: " + f5 + ", w: " + f3 + ", h: " + f2 + ", mOffsetX: " + this.mOffsetX + ", mOffsetY: " + this.mOffsetY + ", mWidth: " + this.mWidth + ", mHeight: " + this.mHeight);
          }
        }
        else
        {
          if ((this.mVideoSrcType == 2) && (this.mTypeScreenTopOffset != 0) && (!this.mIsLand)) {
            this.mOffsetY = (this.mTypeScreenTopOffset - f5);
          }
          f6 = this.mOffsetX;
          float f10 = this.mOffsetY;
          this.mX = ((int)(f6 + f4));
          this.mY = ((int)(f5 + f10));
          this.mWidth = ((int)f3);
          this.mHeight = ((int)f2);
          if (f9 <= f1) {
            break label1404;
          }
          f2 = f1 * f8;
          f1 = f2;
          if (Utils.getGLVersion(this.mContext) == 1) {
            f1 = f2 * f7 / Utils.nextPowerOf2((int)f7);
          }
          f2 = (f7 - f1) / 2.0F;
          this.mYuvTexture.setSourceSize((int)f1, (int)f8);
          this.mYuvTexture.setSourceLeft((int)f2);
          this.mYuvTexture.setSourceTop(0);
          label754:
          if (Utils.getGLVersion(this.mContext) == 1)
          {
            this.mYuvTexture.setSourceSize((int)f7, (int)f8);
            this.mYuvTexture.setSourceLeft(0);
            this.mYuvTexture.setSourceTop((int)0.0F);
          }
          paramGLCanvas.save(2);
          i = getWidth() / 2;
          j = getHeight() / 2;
          paramGLCanvas.translate(i, j);
          if (this.mMirror)
          {
            if (this.mRotation % 2 != 0) {
              break label1474;
            }
            paramGLCanvas.scale(-1.0F, 1.0F, 1.0F);
          }
          label857:
          paramGLCanvas.rotate(m * 90, 0.0F, 0.0F, 1.0F);
          if (m % 2 == 0) {
            break label1488;
          }
          paramGLCanvas.translate(-j, -i);
        }
        for (;;)
        {
          this.mYuvTexture.draw(paramGLCanvas, this.mX, this.mY, this.mWidth, this.mHeight);
          paramGLCanvas.restore();
          int n;
          if ((this.mLoading) && (this.mLoadingTexture != null))
          {
            this.mLoadingAngle %= 360;
            k = getWidth();
            m = getHeight();
            j = this.mLoadingTexture.getSourceWidth();
            n = this.mLoadingTexture.getSourceHeight();
            i = j;
            if (j > k) {
              i = k;
            }
            j = n;
            if (n > m) {
              j = m;
            }
            paramGLCanvas.save(2);
            paramGLCanvas.translate(k / 2, m / 2);
            paramGLCanvas.rotate(this.mLoadingAngle, 0.0F, 0.0F, 1.0F);
            paramGLCanvas.translate(-i / 2, -j / 2);
            this.mLoadingTexture.draw(paramGLCanvas, 0, 0, i, j);
            paramGLCanvas.restore();
            long l = System.currentTimeMillis();
            if (l - this.mLastLoadingTime >= 80L)
            {
              this.mLastLoadingTime = l;
              this.mLoadingAngle += 8;
            }
          }
          if (this.mStringTexture != null)
          {
            k = getWidth();
            m = getHeight();
            j = this.mStringTexture.getSourceWidth();
            n = this.mStringTexture.getSourceHeight();
            i = j;
            if (j > k) {
              i = k;
            }
            j = n;
            if (n > m) {
              j = m;
            }
            paramGLCanvas.save(2);
            paramGLCanvas.translate(k / 2 - i / 2, m / 2 - j / 2);
            this.mStringTexture.draw(paramGLCanvas, 0, 0, i, j);
            paramGLCanvas.restore();
          }
          return;
          f2 += (f1 - f5) / 2.0F;
          f1 = f5;
          break;
          f5 = f1 * f9;
          if (f5 > f3)
          {
            f5 = f3 / f9;
            f2 += (f1 - f5) / 2.0F;
            f1 = f5;
            break;
          }
          f4 += (f3 - f5) / 2.0F;
          f3 = f5;
          break;
          if ((this.mPosition & 0x1) == 1)
          {
            this.mOffsetX = (-f4);
            break label371;
          }
          if ((this.mPosition & 0x2) != 2) {
            break label371;
          }
          this.mOffsetX = (j - f3 - f4);
          break label371;
          label1357:
          if ((this.mPosition & 0x4) == 4)
          {
            this.mOffsetY = (-f5);
            break label399;
          }
          if ((this.mPosition & 0x8) != 8) {
            break label399;
          }
          this.mOffsetY = (i - f2 - f5);
          break label399;
          label1404:
          f2 = f7 / f1;
          f1 = f2;
          if (Utils.getGLVersion(this.mContext) == 1) {
            f1 = f2 * f8 / Utils.nextPowerOf2((int)f8);
          }
          f2 = (f8 - f1) / 2.0F;
          this.mYuvTexture.setSourceSize((int)f7, (int)f1);
          this.mYuvTexture.setSourceLeft(0);
          this.mYuvTexture.setSourceTop((int)f2);
          break label754;
          label1474:
          paramGLCanvas.scale(1.0F, -1.0F, 1.0F);
          break label857;
          label1488:
          paramGLCanvas.translate(-i, -j);
        }
        f5 = f2;
        f2 = f1;
      }
      label1516:
      f3 = f5;
      f4 = f2;
      f2 = f1;
    }
  }
  
  protected void renderBackground(GLCanvas paramGLCanvas)
  {
    int i = getWidth();
    int j = getHeight();
    Rect localRect = getPaddings();
    int k = localRect.left;
    int m = localRect.top;
    int n = i - localRect.left - localRect.right;
    int i1 = j - localRect.top - localRect.bottom;
    if (this.mGlVersion == -1) {
      this.mGlVersion = Utils.getGLVersion(this.mContext);
    }
    if (this.mGlVersion == 1) {
      if (((this.mYuvTexture == null) || (!hasVideo()) || (!this.mNeedRenderVideo)) && (this.mBackground != null)) {
        this.mBackground.draw(paramGLCanvas, k, m, n, i1);
      }
    }
    do
    {
      return;
      paramGLCanvas.fillRect(0.0F, 0.0F, i, j, this.mBackgroundColor);
    } while (((this.mYuvTexture != null) && (hasVideo()) && (this.mNeedRenderVideo)) || (this.mBackground == null));
    this.mBackground.draw(paramGLCanvas, k, m, n, i1);
  }
  
  public void resetRenderFlag()
  {
    this.mIsRenderStart = false;
  }
  
  public void setIsLand(boolean paramBoolean)
  {
    if (this.mIsLand != paramBoolean)
    {
      this.mIsLand = paramBoolean;
      this.mScale = 1.0F;
      this.mPivotX = 0;
      this.mPivotY = 0;
      this.mOffsetX = 0.0F;
      this.mOffsetY = 0.0F;
      if (getVisibility() == 0) {
        invalidate();
      }
    }
  }
  
  public void setIsPC(boolean paramBoolean)
  {
    Log.d("ilvb", "GLVideoView setBlackBorder uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", mIsPC: " + this.mIsPC + ", isPC: " + paramBoolean);
    if (this.mIsPC != paramBoolean)
    {
      this.mIsPC = paramBoolean;
      this.mScale = 1.0F;
      this.mPivotX = 0;
      this.mPivotY = 0;
      this.mOffsetX = 0.0F;
      this.mOffsetY = 0.0F;
      invalidate();
    }
  }
  
  public void setMirror(boolean paramBoolean)
  {
    Log.d("ilvb", "GLVideoView setMirror uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", mMirror: " + this.mMirror + ", mirror: " + paramBoolean);
    if (this.mMirror != paramBoolean)
    {
      this.mMirror = paramBoolean;
      invalidate();
    }
  }
  
  public void setNeedRenderVideo(boolean paramBoolean)
  {
    Log.d("ilvb", "GLVideoView setNeedRenderVideo uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", bRender: " + paramBoolean + ", mNeedRenderVideo: " + this.mNeedRenderVideo);
    this.mNeedRenderVideo = paramBoolean;
    invalidate();
  }
  
  public void setOffset(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Log.d("ilvb", "GLVideoView setOffset uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", offsetX: " + paramInt1 + ", offsetY: " + paramInt2 + ", isEnd: " + paramBoolean);
    boolean bool;
    int i;
    int j;
    int k;
    if (!paramBoolean)
    {
      bool = true;
      this.mDragging = bool;
      if (paramBoolean)
      {
        Rect localRect = getPaddings();
        i = getWidth();
        j = getHeight();
        i = i - localRect.left - localRect.right;
        j = j - localRect.top - localRect.bottom;
        if ((this.mYuvTexture.getImgAngle() + this.mRotation + 4) % 4 % 2 == 0) {
          break label659;
        }
        k = j;
        j = i;
      }
    }
    for (;;)
    {
      this.mPosition = 0;
      if ((this.mX >= 0) && (this.mX + this.mWidth <= k))
      {
        if (this.mWidth <= k) {
          this.mPosition |= 0x3;
        }
        label212:
        if ((this.mY < 0) || (this.mY + this.mHeight > j)) {
          break label525;
        }
        if (this.mHeight <= j) {
          this.mPosition |= 0xC;
        }
        label253:
        Log.d("ilvb", "GLVideoView setOffset uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", mPosition: " + this.mPosition + ", width: " + k + ", height: " + j + ", mX: " + this.mX + ", mY: " + this.mY + ", mWidth: " + this.mWidth + ", mHeight: " + this.mHeight);
        if (this.mRotation % 2 == 0) {
          break label625;
        }
        if (this.mRotation != 1) {
          break label619;
        }
        paramInt1 = -paramInt1;
      }
      for (;;)
      {
        this.mOffsetX += paramInt2;
        this.mOffsetY += paramInt1;
        invalidate();
        return;
        bool = false;
        break;
        if (this.mX >= 0)
        {
          if (this.mWidth <= k)
          {
            this.mPosition |= 0x3;
            break label212;
          }
          this.mPosition |= 0x1;
          break label212;
        }
        if (this.mX + this.mWidth > k) {
          break label212;
        }
        if (this.mWidth <= k)
        {
          this.mPosition |= 0x3;
          break label212;
        }
        this.mPosition |= 0x2;
        break label212;
        label525:
        if (this.mY >= 0)
        {
          if (this.mHeight <= j)
          {
            this.mPosition |= 0xC;
            break label253;
          }
          this.mPosition |= 0x4;
          break label253;
        }
        if (this.mY + this.mHeight > j) {
          break label253;
        }
        if (this.mHeight <= j)
        {
          this.mPosition |= 0xC;
          break label253;
        }
        this.mPosition |= 0x8;
        break label253;
        label619:
        paramInt2 = -paramInt2;
        continue;
        label625:
        if (this.mRotation == 2)
        {
          paramInt1 = -paramInt1;
          i = -paramInt2;
          paramInt2 = paramInt1;
          paramInt1 = i;
        }
        else
        {
          i = paramInt1;
          paramInt1 = paramInt2;
          paramInt2 = i;
        }
      }
      label659:
      k = i;
    }
  }
  
  public void setRender(String paramString, int paramInt)
  {
    if (paramString == null)
    {
      this.mIdentifier = null;
      this.mVideoSrcType = 0;
      return;
    }
    this.mIdentifier = paramString;
    this.mVideoSrcType = paramInt;
    paramString = this.mIdentifier + "_" + this.mVideoSrcType;
    if (this.mYuvTexture == null) {
      Log.e("ilvb", "null == mYuvTexture");
    }
    this.mGraphicRenderMgr.setGlRender(paramString, this.mYuvTexture);
    this.mScale = 1.0F;
    this.mPivotX = 0;
    this.mPivotY = 0;
    this.mOffsetX = 0.0F;
    this.mOffsetY = 0.0F;
  }
  
  public void setRotation(int paramInt)
  {
    switch (paramInt % 360)
    {
    default: 
      paramInt = 0;
    }
    for (;;)
    {
      if (this.mRotation != paramInt)
      {
        this.mRotation = paramInt;
        this.mScale = 1.0F;
        this.mPivotX = 0;
        this.mPivotY = 0;
        this.mOffsetX = 0.0F;
        this.mOffsetY = 0.0F;
        if (getVisibility() == 0) {
          invalidate();
        }
      }
      return;
      paramInt = 1;
      continue;
      paramInt = 2;
      continue;
      paramInt = 3;
    }
  }
  
  public void setScale(float paramFloat, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Log.d("ilvb", "GLVideoView setScale uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", scale: " + paramFloat + ", x: " + paramInt1 + ", y: " + paramInt2 + ", isEnd: " + paramBoolean + ", mOffsetX: " + this.mOffsetX + ", mOffsetY: " + this.mOffsetY + ", mX: " + this.mX + ", mY: " + this.mY + ", mWidth: " + this.mWidth + ", mHeight: " + this.mHeight);
    float f1;
    int i;
    if (paramBoolean)
    {
      float f2 = paramFloat;
      if (paramFloat < 1.0F)
      {
        this.mPosition = 0;
        this.mPosition |= 0x3;
        this.mPosition |= 0xC;
        f2 = 1.0F;
      }
      f1 = f2;
      if (f2 > 4.0F)
      {
        this.mPosition = 0;
        this.mPosition |= 0x1;
        this.mPosition |= 0x4;
        f1 = 4.0F;
      }
      if (this.mRotation % 2 == 0) {
        break label311;
      }
      i = paramInt2;
      paramInt2 = paramInt1;
    }
    for (;;)
    {
      this.mScale = f1;
      this.mPivotX = i;
      this.mPivotY = paramInt2;
      invalidate();
      return;
      if (paramFloat < 0.75F)
      {
        f1 = 0.75F;
        break;
      }
      f1 = paramFloat;
      if (paramFloat <= 4.0F) {
        break;
      }
      f1 = 4.0F;
      break;
      label311:
      i = paramInt1;
    }
  }
  
  public void setText(String paramString, float paramFloat, int paramInt)
  {
    Log.d("ilvb", "GLVideoView setText uin: " + this.mIdentifier + ", mVideoSrcType: " + this.mVideoSrcType + ", text: " + paramString + ", textSize: " + paramFloat + ", color: " + paramInt);
    if (this.mStringTexture != null)
    {
      this.mStringTexture.recycle();
      this.mStringTexture = null;
    }
    if (paramString != null)
    {
      this.mStringTexture = StringTexture.newInstance(paramString, paramFloat, paramInt);
      invalidate();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\GLVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */