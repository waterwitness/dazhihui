package com.cairh.app.sjkh.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Environment;
import com.cairh.app.sjkh.MainActivity;
import com.e.a.a.b;
import com.e.a.a.t;
import com.e.a.a.z;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;

public class BlockFileUploadUtil
{
  private static int blockIndex = 0;
  private static int blockNum;
  public static b client = new b();
  private static int uploadStatus = 0;
  private List<Boolean> blockStatus = new ArrayList();
  private BlockFileUploadUtil.BlockUploadListener blockUploadListener;
  private List<byte[]> blocks = new ArrayList();
  private int byteSize = 102400;
  private CookieStore cookies;
  private File file;
  private String fileName;
  private int lastBlockSize;
  private Context mContext;
  private String notifyUrl;
  ProgressDialog progressDialog;
  private String uploadBlockUrl;
  
  static
  {
    blockNum = 0;
  }
  
  public BlockFileUploadUtil(Context paramContext, File paramFile, String paramString1, String paramString2, CookieStore paramCookieStore, BlockFileUploadUtil.BlockUploadListener paramBlockUploadListener)
  {
    this.mContext = paramContext;
    this.uploadBlockUrl = paramString1;
    this.notifyUrl = paramString2;
    this.file = paramFile;
    this.cookies = paramCookieStore;
    this.blockUploadListener = paramBlockUploadListener;
  }
  
  public static SSLSocketFactory createSSLSocketFactory()
  {
    try
    {
      Object localObject = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject).load(null, null);
      localObject = new t((KeyStore)localObject);
      return (SSLSocketFactory)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static int getBlockIndex()
  {
    return blockIndex;
  }
  
  public static int getBlockNum()
  {
    return blockNum;
  }
  
  public static int getUploadStatus(String paramString)
  {
    String str = "";
    if (Environment.getExternalStorageState().equals("mounted")) {
      str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SJKH";
    }
    if (!new File(str + "/sjkh_sVideo_" + paramString + ".mp4").exists()) {
      uploadStatus = 4;
    }
    return uploadStatus;
  }
  
  private void initParams()
  {
    blockNum = (int)Math.ceil((float)this.file.length() / this.byteSize);
    blockIndex = 0;
    this.fileName = this.file.getName();
    this.lastBlockSize = ((int)(this.file.length() - this.byteSize * (blockNum - 1)));
    this.blocks.clear();
    this.blockStatus.clear();
    uploadStatus = 0;
  }
  
  private void setUploadStatus(int paramInt)
  {
    uploadStatus = paramInt;
    if (uploadStatus == 0) {
      this.blockUploadListener.onUploadFail();
    }
    MainActivity.getA().callJSFunc("pushUploadStutus(" + uploadStatus + "," + blockNum + "," + blockIndex + ")");
  }
  
  private void uploadBlock(byte[] paramArrayOfByte, int paramInt)
  {
    if ((this.uploadBlockUrl.startsWith("https")) || (this.uploadBlockUrl.startsWith("HTTPS")))
    {
      localObject = createSSLSocketFactory();
      if (localObject != null) {
        client.a((SSLSocketFactory)localObject);
      }
    }
    client.a().getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
    Object localObject = new z();
    ((z)localObject).a("myFiles", new ByteArrayInputStream(paramArrayOfByte), this.fileName + "_" + blockNum + "_" + blockIndex);
    client.a(this.cookies);
    client.a(60000);
    client.b(this.uploadBlockUrl, (z)localObject, new BlockFileUploadUtil.1(this, paramInt, paramArrayOfByte));
  }
  
  public void closeProgressDialog()
  {
    if (this.progressDialog != null) {
      this.progressDialog.dismiss();
    }
  }
  
  public void continueUploadBlock()
  {
    uploadBlock((byte[])this.blocks.get(blockIndex), 0);
  }
  
  public void notifyMergeBlocks(int paramInt)
  {
    if ((this.notifyUrl.startsWith("https")) || (this.notifyUrl.startsWith("HTTPS")))
    {
      localObject = createSSLSocketFactory();
      if (localObject != null) {
        client.a((SSLSocketFactory)localObject);
      }
    }
    client.a().getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
    Object localObject = new z();
    client.a(this.cookies);
    client.a(60000);
    client.b(this.notifyUrl, (z)localObject, new BlockFileUploadUtil.2(this, paramInt));
  }
  
  public void showProgressDialog()
  {
    if (this.progressDialog == null)
    {
      this.progressDialog = new ProgressDialog(this.mContext);
      this.progressDialog.setMessage("视频上传中，请稍候...");
      this.progressDialog.setCancelable(false);
      this.progressDialog.show();
      return;
    }
    this.progressDialog.show();
  }
  
  public void uploadBlockFile()
  {
    initParams();
    for (;;)
    {
      try
      {
        localFileInputStream = new FileInputStream(this.file);
        arrayOfByte = new byte[this.byteSize];
        i = 0;
        if (i < blockNum) {
          continue;
        }
        localFileInputStream.close();
      }
      catch (IOException localIOException)
      {
        FileInputStream localFileInputStream;
        byte[] arrayOfByte;
        int i;
        localIOException.printStackTrace();
        continue;
        continue;
      }
      uploadBlock((byte[])this.blocks.get(blockIndex), 0);
      setUploadStatus(1);
      return;
      if (i != blockNum - 1) {
        continue;
      }
      arrayOfByte = new byte[this.lastBlockSize];
      localFileInputStream.read(arrayOfByte);
      this.blocks.add((byte[])arrayOfByte.clone());
      this.blockStatus.add(Boolean.valueOf(false));
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\BlockFileUploadUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */