package com.android.thinkive.framework.network.socket;

import android.text.TextUtils;
import com.android.thinkive.framework.util.RSAUtil;
import java.util.Random;

public class TradeSocketManager
{
  private static TradeSocketManager sInstance;
  private String exponent;
  private String mAESKey;
  private byte[] mAESKeyBytes;
  private String mTradeServerAddr;
  private String modulus;
  
  private String get32UUID()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Random localRandom = new Random();
    int i = 0;
    for (;;)
    {
      if (i >= 30) {
        return "TD" + localStringBuffer.toString();
      }
      localStringBuffer.append(localRandom.nextInt(10));
      i += 1;
    }
  }
  
  public static TradeSocketManager getInstance()
  {
    if (sInstance == null) {
      sInstance = new TradeSocketManager();
    }
    return sInstance;
  }
  
  public void buildAESKey(String paramString1, String paramString2)
  {
    this.mAESKey = get32UUID();
    this.modulus = paramString1;
    this.exponent = paramString2;
    try
    {
      this.mAESKeyBytes = RSAUtil.encryptByPublicKey(this.modulus, this.exponent, this.mAESKey, "RSA/ECB/PKCS1Padding");
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public String getAESKey()
  {
    return this.mAESKey;
  }
  
  public String getExponent()
  {
    return this.exponent;
  }
  
  public String getModulus()
  {
    return this.modulus;
  }
  
  public byte[] getRSAEncryAESKEY()
  {
    return this.mAESKeyBytes;
  }
  
  public String getTradeServerAddr()
  {
    return this.mTradeServerAddr;
  }
  
  boolean isTradeServerAddress(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (!TextUtils.isEmpty(this.mTradeServerAddr))
    {
      bool1 = bool2;
      if (this.mTradeServerAddr.equals(paramString)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void setTradeServerAddr(String paramString)
  {
    this.mTradeServerAddr = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\TradeSocketManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */