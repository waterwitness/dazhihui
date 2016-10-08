package com.iflytek.cloud;

import com.iflytek.thirdparty.X;
import org.json.JSONObject;

public class VerifierResult
{
  public static final int MSS_ERROR_IVP_EXTRA_RGN_SOPPORT = 11601;
  public static final int MSS_ERROR_IVP_GENERAL = 11600;
  public static final int MSS_ERROR_IVP_MUCH_NOISE = 11603;
  public static final int MSS_ERROR_IVP_NO_ENOUGH_AUDIO = 11608;
  public static final int MSS_ERROR_IVP_TEXT_NOT_MATCH = 11607;
  public static final int MSS_ERROR_IVP_TOO_LOW = 11604;
  public static final int MSS_ERROR_IVP_TRUNCATED = 11602;
  public static final int MSS_ERROR_IVP_UTTER_TOO_SHORT = 11606;
  public static final int MSS_ERROR_IVP_ZERO_AUDIO = 11605;
  public static final String TAG = "VerifyResult";
  public String dcs = "";
  public int err = 0;
  public int ret = 0;
  public int rgn = 0;
  public Double score;
  public Double score_raw;
  public String source = "";
  public String sst;
  public int suc = 0;
  public String trs = "";
  public String vid = "";
  
  public VerifierResult(String paramString)
  {
    try
    {
      this.source = paramString;
      paramString = new JSONObject(this.source);
      X.a("VerifyResult = " + this.source);
      if (paramString.has("ret")) {
        this.ret = paramString.getInt("ret");
      }
      if (paramString.has("sst")) {
        this.sst = paramString.getString("sst");
      }
      if (paramString.has("dcs")) {
        this.dcs = paramString.getString("dcs");
      }
      if (paramString.has("suc")) {
        this.suc = paramString.getInt("suc");
      }
      if (paramString.has("vid")) {
        this.vid = paramString.getString("vid");
      }
      if (paramString.has("rgn")) {
        this.rgn = paramString.getInt("rgn");
      }
      if (paramString.has("trs")) {
        this.trs = paramString.getString("trs");
      }
      if (paramString.has("err")) {
        this.err = paramString.getInt("err");
      }
      if (paramString.has("score")) {
        this.score = Double.valueOf(paramString.getDouble("score"));
      }
      if (paramString.has("score_raw")) {
        this.score_raw = Double.valueOf(paramString.getDouble("score_raw"));
      }
      return;
    }
    catch (Exception paramString)
    {
      X.a(paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\VerifierResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */