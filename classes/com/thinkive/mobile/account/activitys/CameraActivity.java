package com.thinkive.mobile.account.activitys;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.widget.Toast;
import bq;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.config.ConfigManager;
import com.thinkive.android.ui.OpenAcBaseActivity;
import com.thinkive.mobile.account.entity.IntentTransformer;
import java.io.File;
import java.util.List;
import org.apache.http.entity.mime.content.FileBody;

public class CameraActivity
  extends OpenAcBaseActivity
{
  public static IntentTransformer b;
  public static String c;
  private static String d;
  private int e;
  private String f;
  private FileBody g;
  private Parameter h;
  private byte[] i;
  private DialogFrame j;
  private String k;
  private String l;
  private String m;
  private Handler n = new CameraActivity.1(this);
  
  protected final String a()
  {
    return b.getUrl();
  }
  
  public final void a(String paramString)
  {
    Intent localIntent = new Intent(this, PhotographActivity.class);
    localIntent.putExtra("img_type", paramString);
    startActivityForResult(localIntent, 1);
  }
  
  public final FileBody d()
  {
    return this.g;
  }
  
  public final Parameter e()
  {
    return this.h;
  }
  
  protected void initData()
  {
    this.e = Integer.parseInt(ConfigManager.getInstance(this).getSystemConfigValue("IMG_SIZE"));
    Object localObject = (IntentTransformer)getIntent().getSerializableExtra("intent_trans_params");
    b = (IntentTransformer)localObject;
    if (localObject == null)
    {
      Toast.makeText(getApplicationContext(), "数据异常", 0).show();
      finish();
      return;
    }
    d = (String)bq.c().get(0) + ConfigManager.getInstance(this).getSystemConfigValue("VIDEO_SAVE_PATH");
    int i1 = getIntent().getIntExtra("CAMERA_TYPE", 8437760);
    b.setCurrentImageType(b.getImgType());
    this.h = b.createParameter();
    this.f = (this.h.getString("user_id") + "_" + b.getImgType() + ".jpg");
    switch (i1)
    {
    default: 
      return;
    case 8437760: 
      a(b.getImgType());
      return;
    }
    localObject = new Intent("android.intent.action.PICK", null);
    ((Intent)localObject).setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
    try
    {
      startActivityForResult((Intent)localObject, 2);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
      localIntent.setType("image/*");
      startActivityForResult(localIntent, 2);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
    {
      Object localObject1 = new DialogFrame(this);
      switch (paramInt1)
      {
      default: 
        localObject1 = this.f;
        this.g = new FileBody(new File(d, (String)localObject1));
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      try
      {
        startTask(new CameraActivity.4(this));
        System.gc();
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
        this.n.sendEmptyMessage(2);
      }
      break;
      if (paramIntent == null) {}
      try
      {
        this.n.sendEmptyMessage(1);
        startTask(new CameraActivity.5(this, paramIntent, localException1));
        System.gc();
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
        this.n.sendEmptyMessage(1);
      }
      break;
      if (paramInt2 == 0)
      {
        Object localObject2 = this.f;
        localObject2 = new File(d, (String)localObject2);
        if ((((File)localObject2).isFile()) && (((File)localObject2).exists())) {
          ((File)localObject2).delete();
        }
        finish();
      }
      else
      {
        finish();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initData();
  }
  
  protected void onDestroy()
  {
    if (this.j != null) {
      this.j.unWaitDialog();
    }
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\CameraActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */