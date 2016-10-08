package com.cairh.app.sjkh.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.cairh.app.sjkh.util.BlockFileUploadUtil;
import com.cairh.app.sjkh.util.FileUploadUtil;
import com.e.a.a.b;
import java.io.File;

public class BlockUploadService
  extends Service
{
  private BlockFileUploadUtil blockFileUploadUtil;
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
  }
  
  public void onDestroy()
  {
    BlockFileUploadUtil.client.a(this, true);
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    this.blockFileUploadUtil = new BlockFileUploadUtil(this, new File(paramIntent.getStringExtra("filePath")), paramIntent.getStringExtra("uploadBlockUrl"), paramIntent.getStringExtra("notifyUrl"), FileUploadUtil.parseCookie(this, paramIntent.getStringExtra("cookieDomain"), "/", paramIntent.getStringExtra("cookiestr")), new BlockUploadService.1(this));
    this.blockFileUploadUtil.uploadBlockFile();
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\service\BlockUploadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */