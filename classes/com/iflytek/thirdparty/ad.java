package com.iflytek.thirdparty;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.util.VerifierUtil;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import org.json.JSONException;
import org.json.JSONObject;

public class ad
{
  private boolean a;
  private MSCSessionInfo b;
  
  public ad(Context paramContext, String paramString)
  {
    try
    {
      if (SpeechUtility.getUtility() == null) {
        throw new SpeechError(10111);
      }
    }
    catch (SpeechError paramContext)
    {
      X.b(paramContext.getPlainDescription(true));
      return;
    }
    this.a = false;
    a(paramString);
  }
  
  private String a(byte[] paramArrayOfByte, MSCSessionInfo paramMSCSessionInfo)
  {
    JSONObject localJSONObject = new JSONObject();
    localObject1 = localJSONObject;
    localObject2 = localJSONObject;
    try
    {
      if (paramMSCSessionInfo.errorcode == 0)
      {
        localObject2 = localJSONObject;
        localObject1 = new JSONObject(new String(paramArrayOfByte));
      }
      localObject2 = localObject1;
      ((JSONObject)localObject1).put("ret", paramMSCSessionInfo.errorcode);
    }
    catch (JSONException paramArrayOfByte)
    {
      for (;;)
      {
        X.b("face result add errorinfo exception");
        localObject1 = localObject2;
      }
    }
    return ((JSONObject)localObject1).toString();
  }
  
  private void a(String paramString)
  {
    if (MSC.isLoaded())
    {
      X.a("MSC isLoaded：" + MSC.isLoaded());
      this.b = new MSCSessionInfo();
      Y.a("MSCSessionBegin", null);
      if (TextUtils.isEmpty(paramString)) {
        break label110;
      }
      MSC.QIFDInit(paramString.getBytes(), this.b);
    }
    for (;;)
    {
      Y.a("SessionBeginEnd", null);
      if (this.b.errorcode == 0) {
        break;
      }
      X.b("QIFDINIT INIT FAIL, ERRORCODE:" + this.b.errorcode);
      return;
      label110:
      MSC.QIFDInit(null, this.b);
    }
    X.a("QIFDINIT INIT SUCCESS");
  }
  
  public String a(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (Bitmap.Config.ARGB_8888.equals(paramBitmap.getConfig()))) {
      return b(VerifierUtil.ARGB2Gray(paramBitmap));
    }
    X.b("Method detectARGB:null parameter or not ARGB bitmap");
    return null;
  }
  
  public String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramArrayOfByte == null) || (paramInt1 <= 0) || (paramInt2 <= 0) || (paramInt4 < 0) || (paramInt4 > 3))
    {
      X.b("Method trackNV21:invalid parameters");
      return null;
    }
    this.b = new MSCSessionInfo();
    Y.a("LastDataFlag", null);
    paramArrayOfByte = MSC.QIFDMultitracker(paramArrayOfByte, paramArrayOfByte.length, paramInt1, paramInt2, paramInt3, paramInt4, this.b);
    Y.a("GetNotifyResult", null);
    return a(paramArrayOfByte, this.b);
  }
  
  public void a()
  {
    if (!this.a)
    {
      X.a("QIFDFINIT");
      Y.a("SessionEndBegin", null);
      int i = MSC.QIFDFini();
      X.a("MSC.QIFDFini result is " + i);
      Y.a("SessionEndEnd", null);
      this.a = true;
    }
  }
  
  public String b(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (!Bitmap.Config.ALPHA_8.equals(paramBitmap.getConfig())))
    {
      X.b("Method detectGray:null parameter or not gray bitmap");
      return null;
    }
    this.b = new MSCSessionInfo();
    Y.a("LastDataFlag", null);
    paramBitmap = MSC.QIFDFacedetect(paramBitmap, VerifierUtil.getBitmapsize(paramBitmap), this.b);
    Y.a("GetNotifyResult", null);
    return a(paramBitmap, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */