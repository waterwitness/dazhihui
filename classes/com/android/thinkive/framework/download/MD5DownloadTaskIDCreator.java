package com.android.thinkive.framework.download;

import com.android.thinkive.framework.util.EncryptUtil;

public class MD5DownloadTaskIDCreator
  implements DownloadTaskIDCreator
{
  public String createId(DownloadItemBean paramDownloadItemBean)
  {
    return EncryptUtil.encryptToMD5(paramDownloadItemBean.getUrl());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\MD5DownloadTaskIDCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */