package com.tencent.av.opengl.texture;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.av.opengl.GlStringParser;

class YUVTexture$EventHandler
  extends Handler
{
  public YUVTexture$EventHandler(YUVTexture paramYUVTexture, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (YUVTexture.access$000(this.this$0) == null);
          YUVTexture.access$000(this.this$0).onRenderFrame();
          return;
        } while (YUVTexture.access$000(this.this$0) == null);
        YUVTexture.access$000(this.this$0).onRenderReset();
        return;
      } while (YUVTexture.access$000(this.this$0) == null);
      YUVTexture.access$000(this.this$0).onRenderFlush();
      return;
    } while (YUVTexture.access$000(this.this$0) == null);
    if (YUVTexture.access$100(this.this$0) == null) {
      YUVTexture.access$102(this.this$0, new GlStringParser('=', ';'));
    }
    paramMessage = (String)paramMessage.obj;
    YUVTexture.access$100(this.this$0).unflatten(paramMessage);
    int i = YUVTexture.access$100(this.this$0).getInt("width");
    int j = YUVTexture.access$100(this.this$0).getInt("height");
    int k = YUVTexture.access$100(this.this$0).getInt("angle");
    YUVTexture.access$000(this.this$0).onRenderInfoNotify(i, j, k);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\texture\YUVTexture$EventHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */