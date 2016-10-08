package com.thinkive.mobile.account.activitys;

import an;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import bq;
import bu;
import bx;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.android.ui.OpenAcBaseActivity;
import com.thinkive.android.widget.OpenPhotoView;
import com.thinkive.android.widget.photoview.PhotoView;
import com.thinkive.mobile.account.entity.IntentTransformer;
import java.util.List;
import org.json.JSONObject;

public class IdentityPhotoActivity
  extends OpenAcBaseActivity
  implements bu
{
  protected static String b;
  private static String c;
  private OpenPhotoView d;
  private PhotoView e;
  private ImageView f;
  private ImageView g;
  private Button h;
  private Button i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private String n;
  private String o;
  private Bitmap p;
  private JSONObject q = new JSONObject();
  private String r = (String)bq.c().get(0) + ConfigManager.getInstance().getSystemConfigValue("VIDEO_SAVE_PATH");
  private String s;
  private bx t;
  private Handler u = new IdentityPhotoActivity.1(this);
  
  private void a(Bitmap paramBitmap)
  {
    this.u.post(new IdentityPhotoActivity.9(this, paramBitmap));
  }
  
  private void a(String paramString)
  {
    paramString = paramString.split(",");
    this.s = paramString[0];
    this.n = (this.a.getUserId() + "_" + this.s + ".jpg");
    if ((paramString.length <= 0) || (paramString.length > 2))
    {
      Toast.makeText(this, "数据异常", 0).show();
      finish();
      return;
    }
    switch (Integer.parseInt(this.s))
    {
    default: 
      Toast.makeText(this, "数据异常", 0).show();
      finish();
      return;
    case 4: 
      this.l.setText("拍摄身份证正面照片");
      this.m.setText("请将身份证正面置于框内,尽可能对齐边缘");
      this.f.setVisibility(0);
      this.g.setVisibility(8);
      return;
    }
    this.l.setText("拍摄身份证反面照片");
    this.m.setText("请将身份证反面置于框内,尽可能对齐边缘");
    this.f.setVisibility(8);
    this.g.setVisibility(0);
  }
  
  private void b(String paramString)
  {
    this.d.b();
    a(paramString);
    this.l.setVisibility(0);
    this.m.setVisibility(0);
    this.p = null;
    this.j.setVisibility(4);
    this.h.setText("拍照");
    this.h.setTag("0");
    this.k.setVisibility(0);
    this.i.setVisibility(0);
    this.u.postDelayed(new IdentityPhotoActivity.8(this), 500L);
    this.t.a();
  }
  
  private void d()
  {
    AppMessage localAppMessage = new AppMessage(this.a.getModuleName(), an.b, this.q);
    MessageManager.getInstance(this).sendMessage(localAppMessage);
    ThinkiveInitializer.getInstance().getHandler().postDelayed(new IdentityPhotoActivity.2(this), 1666L);
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    Log.e("asos", String.format("拍照原始图片大小为:%sKB", new Object[] { Integer.valueOf(paramArrayOfByte.length / 1024) }));
    paramArrayOfByte = bq.a(paramArrayOfByte, 500, 500);
    if (paramArrayOfByte != null)
    {
      int i1 = paramArrayOfByte.getWidth();
      int i2 = paramArrayOfByte.getHeight();
      a(Bitmap.createBitmap(paramArrayOfByte, (int)(i1 * 0.134D), (int)(i2 * 0.136D), (int)(i1 * 0.699D), (int)(i2 * 0.764D)));
    }
    System.gc();
  }
  
  protected void findViews()
  {
    this.d = ((OpenPhotoView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_surface")));
    this.h = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_btn_takephoto")));
    this.k = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_btn_selectphoto")));
    this.i = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_btn_back")));
    this.l = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_tv_notice1")));
    this.m = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_tv_notice2")));
    this.e = ((PhotoView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_iv_takePhoto_idCard")));
    this.j = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_btn_reload")));
    this.f = ((ImageView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_img_touxiang")));
    this.g = ((ImageView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_takephoto_img_guohui")));
  }
  
  public void finish()
  {
    this.d.a();
    super.finish();
  }
  
  protected void initData()
  {
    super.initData();
    if (this.a == null)
    {
      Toast.makeText(this, "数据异常", 0).show();
      finish();
    }
    b = this.a.getImgType();
    a(b);
  }
  
  protected void initViews()
  {
    this.d.setCamera_Orientation(0);
    this.d.setMyJpegCallback(this);
    this.h.setTag("0");
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if ((paramIntent == null) || (paramIntent.getData() == null))
      {
        this.u.sendEmptyMessage(1);
      }
      else
      {
        Object localObject2 = bq.a(this, paramIntent.getData());
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          this.u.sendEmptyMessage(1);
          return;
        }
        Object localObject1 = null;
        try
        {
          System.gc();
          localObject2 = bq.a((String)localObject2, 500, 500);
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localException.printStackTrace();
          }
        }
        a((Bitmap)localObject1);
        continue;
        Toast.makeText(this, "请选择照片或者拍照", 0).show();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_identity_photo"));
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.d.a();
    if (this.p != null) {
      this.p.recycle();
    }
    if (this.t != null) {
      this.t.a();
    }
    c = null;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      this.d.a();
      finish();
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    this.u.postDelayed(new IdentityPhotoActivity.10(this), 88L);
  }
  
  protected void onStop()
  {
    this.d.a();
    super.onStop();
  }
  
  protected void setListeners()
  {
    this.h.setOnClickListener(new IdentityPhotoActivity.3(this));
    this.k.setOnClickListener(new IdentityPhotoActivity.4(this));
    this.i.setOnClickListener(new IdentityPhotoActivity.5(this));
    this.j.setOnClickListener(new IdentityPhotoActivity.6(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\activitys\IdentityPhotoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */