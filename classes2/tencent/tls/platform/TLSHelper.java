package tencent.tls.platform;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyAgreement;
import tencent.tls.account.TLSOpenAccountInfo;
import tencent.tls.account.TLSOpenAccountInfo.OpenAccountStatus;
import tencent.tls.account.acc_ask_code;
import tencent.tls.account.acc_commit;
import tencent.tls.account.acc_guest;
import tencent.tls.account.acc_reask_code;
import tencent.tls.account.acc_request;
import tencent.tls.account.acc_status;
import tencent.tls.account.acc_verify_code;
import tencent.tls.oidb.Oidb0x483_request;
import tencent.tls.oidb.Oidb0x483_response;
import tencent.tls.oidb.Oidb0x601_request;
import tencent.tls.oidb.Oidb0x601_response;
import tencent.tls.oidb.Oidb0x602_request;
import tencent.tls.oidb.Oidb0x602_response;
import tencent.tls.oidb.Oidb0xa0b_request;
import tencent.tls.oidb.Oidb0xa0b_response;
import tencent.tls.report.QLog;
import tencent.tls.request.SigInfo;
import tencent.tls.request.Ticket;
import tencent.tls.request.TinyInfo;
import tencent.tls.request.TinyInfo.UserType;
import tencent.tls.request.TransReqContext;
import tencent.tls.request.WorkThread;
import tencent.tls.request.oicq_request;
import tencent.tls.request.req_global;
import tencent.tls.tlvs.tlv_t;
import tencent.tls.tools.EcdhCrypt;
import tencent.tls.tools.I18nMsg;
import tencent.tls.tools.I18nMsg.MSG_TYPE;
import tencent.tls.tools.MD5;
import tencent.tls.tools.util;

public class TLSHelper
{
  private static TLSHelper __helper = null;
  private static String guest = null;
  private static String ssoGuest = null;
  private int DummyGetSig = -1;
  private int mAccType = 0;
  private String mAppVer = "";
  private long mAsyncSeq = 0L;
  private Context mContext;
  private int mCountry = 86;
  private req_global mG = new req_global(null);
  private int mMainSigMap = 262208;
  private int mMiscBitmap = 16252;
  private acc_status mRegStatus = new acc_status();
  private long mSdkAppid;
  private long mSubAppid = 1L;
  private int mSubSigMap = 66560;
  private TLSOpenAccountInfo openAccountInfo;
  
  private byte[] GetA1ByAccount(String paramString, long paramLong)
  {
    long l = this.mG.getTinyId(paramString);
    Object localObject;
    if (l == 0L) {
      localObject = null;
    }
    while ((localObject == null) || (((SigInfo)localObject)._en_A1 == null) || (((SigInfo)localObject)._en_A1.length <= 0))
    {
      QLog.i("userAccount:" + paramString + " dwAppid:" + paramLong + " GetA1ByAccount return: null");
      return null;
      SigInfo localSigInfo = this.mG.get_siginfo(l, paramLong);
      localObject = localSigInfo;
      if (localSigInfo == null) {
        localObject = localSigInfo;
      }
    }
    QLog.i("userAccount:" + paramString + " dwAppid:" + paramLong + " GetA1ByAccount return: not null");
    return (byte[])((SigInfo)localObject)._en_A1.clone();
  }
  
  private TLSOpenAccountInfo GetLocalOpenAccountInfo(String paramString, long paramLong)
  {
    long l = this.mG.getTinyId(paramString);
    SigInfo localSigInfo;
    if (l == 0L) {
      localSigInfo = null;
    }
    while ((localSigInfo == null) || (localSigInfo._access_token == null) || (localSigInfo._access_token.length <= 0))
    {
      QLog.i("userAccount:" + paramString + " dwAppid:" + paramLong + " GetLocalOpenAccountInfo return: null");
      return null;
      localSigInfo = this.mG.get_siginfo(l, paramLong);
      if (localSigInfo != null) {}
    }
    QLog.i("userAccount:" + paramString + " dwAppid:" + paramLong + " GetLocalOpenAccountInfo return: not null");
    return new TLSOpenAccountInfo(localSigInfo.accountType, new String(localSigInfo.appidAt3rd), new String((byte[])localSigInfo.openid.clone()), new String((byte[])localSigInfo._access_token.clone()));
  }
  
  private TLSUserInfo GetLocalSig(String paramString, long paramLong)
  {
    QLog.i("GetLocalSig name:" + paramString);
    Object localObject = this.mG.getTinyInfo(paramString);
    if (localObject == null) {}
    do
    {
      return null;
      this.mG._uin = ((TinyInfo)localObject)._tinyid;
      paramString = this.mG.get_siginfo(((TinyInfo)localObject)._tinyid, paramLong);
    } while (paramString == null);
    long l = paramString._A1_create_time;
    paramLong = l;
    if (l <= 0L) {
      paramLong = paramString._TLS_create_time;
    }
    localObject = new TLSUserInfo(((TinyInfo)localObject)._acc_type, ((TinyInfo)localObject)._userid, ((TinyInfo)localObject)._tinyid, paramLong, ((TinyInfo)localObject).userType);
    ((TLSUserInfo)localObject).get_clone(paramString);
    return (TLSUserInfo)localObject;
  }
  
  private byte[] GetNoPicSigByAccount(String paramString, long paramLong)
  {
    long l = this.mG.getTinyId(paramString);
    Object localObject;
    if (l == 0L) {
      localObject = null;
    }
    while ((localObject == null) || (((SigInfo)localObject)._noPicSig == null) || (((SigInfo)localObject)._noPicSig.length <= 0))
    {
      QLog.i("userAccount:" + paramString + " dwAppid:" + paramLong + " GetNoPicSigByAccount return: null");
      return null;
      SigInfo localSigInfo = this.mG.get_siginfo(l, paramLong);
      localObject = localSigInfo;
      if (localSigInfo == null) {
        localObject = localSigInfo;
      }
    }
    QLog.i("userAccount:" + paramString + " dwAppid:" + paramLong + " GetNoPicSigByAccount return: not null");
    return (byte[])((SigInfo)localObject)._noPicSig.clone();
  }
  
  private int GetStWithPasswd(String paramString, byte[] paramArrayOfByte, boolean paramBoolean, Object paramObject)
  {
    if (paramString == null) {
      return 64519;
    }
    req_global localreq_global = this.mG.getClone(this.mAsyncSeq);
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    new WorkThread(Looper.myLooper(), new TLSHelper.4(this, paramArrayOfByte, localreq_global, paramString, localTLSUserInfo, paramBoolean), new TLSHelper.5(this, localreq_global, paramObject, localTLSUserInfo)).start();
    return 64535;
  }
  
  private int GetStWithoutPasswd(String paramString, long paramLong, Object paramObject)
  {
    if (paramString == null) {
      return 64519;
    }
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    req_global localreq_global = this.mG.getClone(0L);
    new WorkThread(Looper.myLooper(), new TLSHelper.2(this, localreq_global, paramString, paramLong, localTLSUserInfo), new TLSHelper.3(this, localreq_global, paramObject, localTLSUserInfo)).start();
    return 64535;
  }
  
  private void OnTLSExchangeTicket(TransReqContext paramTransReqContext, req_global paramreq_global, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    TLSExchangeTicketListener localTLSExchangeTicketListener = (TLSExchangeTicketListener)paramTransReqContext.listener;
    Object localObject2 = new TLSErrInfo(paramInt2, "", I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_3));
    if (paramInt2 != 0)
    {
      whenError((TLSErrInfo)localObject2, localTLSExchangeTicketListener);
      return;
    }
    Object localObject1 = new Oidb0xa0b_response(paramTransReqContext.get_body());
    if (((Oidb0xa0b_response)localObject1).getResult() == 0)
    {
      if (((Oidb0xa0b_response)localObject1).getHeadResult() == 0)
      {
        long l1 = ((Oidb0xa0b_response)localObject1).getTinyID();
        localObject2 = ((Oidb0xa0b_response)localObject1).getA2();
        byte[] arrayOfByte1 = ((Oidb0xa0b_response)localObject1).getD2();
        byte[] arrayOfByte2 = ((Oidb0xa0b_response)localObject1).getD2Key();
        paramInt2 = ((Oidb0xa0b_response)localObject1).getAdminFlag();
        paramTransReqContext = ((Oidb0xa0b_response)localObject1).getIdentifier();
        if (paramInt1 <= 0) {
          paramTransReqContext = paramreq_global._userid;
        }
        String str1 = ((Oidb0xa0b_response)localObject1).getUserSig();
        String str2 = paramreq_global._userid;
        localObject1 = paramTransReqContext;
        if (util.checkInvalid(paramTransReqContext)) {
          localObject1 = paramreq_global._userid;
        }
        paramreq_global._uin = l1;
        paramreq_global._admin = paramInt2;
        paramreq_global.put_open_account(paramreq_global._userid, (String)localObject1, paramreq_global._uin);
        paramreq_global._userid = ((String)localObject1);
        l1 = req_global.get_cur_time();
        paramTransReqContext = new ArrayList();
        paramTransReqContext.add(new Ticket(64, (byte[])localObject2, new tlv_t(269).get_data(), l1, 2160000L + l1));
        paramTransReqContext.add(new Ticket(262144, arrayOfByte1, arrayOfByte2, l1, l1 + 1728000L));
        paramTransReqContext.add(new Ticket(268435456, str1.getBytes(), null, l1, l1 + 2160000L));
        if (paramInt1 > 0) {
          paramTransReqContext.add(new Ticket(305419896, paramInt1, paramString1, paramString2.getBytes(), str2.getBytes(), l1, 0L));
        }
        long l2 = paramreq_global._uin;
        long l3 = this.mSdkAppid;
        long l4 = this.mSdkAppid;
        paramreq_global.put_siginfo(l2, l3, new byte[0], new byte[0], l4, 4294967295L, l1, paramTransReqContext, 0);
        localTLSExchangeTicketListener.OnExchangeTicketSuccess(new TLSUserInfo(paramInt1, paramreq_global._userid, paramreq_global._uin, l1, TinyInfo.UserType.USER_TYPE_NORMAL));
        return;
      }
      QLog.i("rsp.getHeadResult() = " + ((Oidb0xa0b_response)localObject1).getHeadResult());
      ((TLSErrInfo)localObject2).ErrCode = ((Oidb0xa0b_response)localObject1).getHeadResult();
      ((TLSErrInfo)localObject2).Msg = ((Oidb0xa0b_response)localObject1).getErrMsg();
      if (((TLSErrInfo)localObject2).Msg.length() == 0) {
        ((TLSErrInfo)localObject2).Msg = "内部错误，请访问 http://bbs.qcloud.com/thread-8309-1-1.html 或者联系 QQ 3268519604";
      }
      whenError((TLSErrInfo)localObject2, localTLSExchangeTicketListener);
      return;
    }
    ((TLSErrInfo)localObject2).ErrCode = ((Oidb0xa0b_response)localObject1).getResult();
    ((TLSErrInfo)localObject2).Msg = "解析包出错";
    whenError((TLSErrInfo)localObject2, localTLSExchangeTicketListener);
  }
  
  private void OnTLSOpenAccessToken(TransReqContext paramTransReqContext, int paramInt)
  {
    TLSOpenAccessTokenListener localTLSOpenAccessTokenListener = (TLSOpenAccessTokenListener)paramTransReqContext.listener;
    Object localObject = new TLSErrInfo(paramInt, "", I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_3));
    if (paramInt != 0)
    {
      whenError((TLSErrInfo)localObject, localTLSOpenAccessTokenListener);
      return;
    }
    paramTransReqContext = new Oidb0x483_response(paramTransReqContext.get_body());
    if (paramTransReqContext.getResult() == 0)
    {
      if (paramTransReqContext.getHeadResult() == 0)
      {
        localObject = new TLSAccessTokenInfo();
        ((TLSAccessTokenInfo)localObject).access_token = paramTransReqContext.getAccessToken();
        ((TLSAccessTokenInfo)localObject).expireTime = paramTransReqContext.getExpireTime();
        ((TLSAccessTokenInfo)localObject).refresh_token = paramTransReqContext.getRefreshToken();
        ((TLSAccessTokenInfo)localObject).openid = paramTransReqContext.getOpenid();
        ((TLSAccessTokenInfo)localObject).scope = paramTransReqContext.getScope();
        ((TLSAccessTokenInfo)localObject).unionid = paramTransReqContext.getUnionid();
        localTLSOpenAccessTokenListener.OnOpenAccessTokenSuccess((TLSAccessTokenInfo)localObject);
        return;
      }
      QLog.i("rsp.getHeadResult() = " + paramTransReqContext.getHeadResult());
      ((TLSErrInfo)localObject).ErrCode = paramTransReqContext.getHeadResult();
      ((TLSErrInfo)localObject).Msg = paramTransReqContext.getErrHint();
      localTLSOpenAccessTokenListener.OnOpenAccessTokenFail((TLSErrInfo)localObject);
      return;
    }
    ((TLSErrInfo)localObject).ErrCode = paramTransReqContext.getResult();
    ((TLSErrInfo)localObject).Msg = "解析包出错";
    whenError((TLSErrInfo)localObject, localTLSOpenAccessTokenListener);
  }
  
  private void OnTLSOpenAccountBind(TransReqContext paramTransReqContext, int paramInt)
  {
    TLSOpenAccountBindListener localTLSOpenAccountBindListener = (TLSOpenAccountBindListener)paramTransReqContext.listener;
    TLSErrInfo localTLSErrInfo = new TLSErrInfo(paramInt, "", I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_3));
    if (paramInt != 0)
    {
      whenError(localTLSErrInfo, localTLSOpenAccountBindListener);
      return;
    }
    paramTransReqContext = new Oidb0x601_response(paramTransReqContext.get_body());
    if (paramTransReqContext.getResult() == 0)
    {
      if (paramTransReqContext.getHeadResult() == 0)
      {
        localTLSOpenAccountBindListener.onBindSuccess(this.openAccountInfo);
        return;
      }
      QLog.i("rsp.getHeadResult() = " + paramTransReqContext.getHeadResult());
      localTLSOpenAccountBindListener.onBindFailure(this.openAccountInfo);
      return;
    }
    localTLSErrInfo.ErrCode = paramTransReqContext.getResult();
    localTLSErrInfo.Msg = "解析包出错";
    whenError(localTLSErrInfo, localTLSOpenAccountBindListener);
  }
  
  private void OnTLSOpenAccountQuery(TransReqContext paramTransReqContext, int paramInt)
  {
    TLSOpenAccountQueryListener localTLSOpenAccountQueryListener = (TLSOpenAccountQueryListener)paramTransReqContext.listener;
    TLSErrInfo localTLSErrInfo = new TLSErrInfo(paramInt, "", I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_3));
    if (paramInt != 0)
    {
      whenError(localTLSErrInfo, localTLSOpenAccountQueryListener);
      return;
    }
    paramTransReqContext = new Oidb0x602_response(paramTransReqContext.get_body());
    if (paramTransReqContext.getResult() == 0)
    {
      if (paramTransReqContext.getHeadResult() == 0)
      {
        paramTransReqContext = paramTransReqContext.getOpenAccountStatus();
        switch (TLSHelper.20.$SwitchMap$tencent$tls$account$TLSOpenAccountInfo$OpenAccountStatus[paramTransReqContext.ordinal()])
        {
        default: 
          QLog.i("后台返回异常");
          return;
        case 1: 
          this.openAccountInfo.status = TLSOpenAccountInfo.OpenAccountStatus.UNUSED;
          localTLSOpenAccountQueryListener.onUnlogined(this.openAccountInfo);
          return;
        case 2: 
          this.openAccountInfo.status = TLSOpenAccountInfo.OpenAccountStatus.USED_UNBINDED;
          localTLSOpenAccountQueryListener.onLoginedButUnbinded(this.openAccountInfo);
          return;
        }
        this.openAccountInfo.status = TLSOpenAccountInfo.OpenAccountStatus.USED_BINDED;
        localTLSOpenAccountQueryListener.onLoginedAndBinded(this.openAccountInfo);
        return;
      }
      QLog.i("rsp.getHeadResult() = " + paramTransReqContext.getHeadResult());
      localTLSErrInfo.ErrCode = paramTransReqContext.getHeadResult();
      localTLSErrInfo.Msg = "出错啦";
      whenError(localTLSErrInfo, localTLSOpenAccountQueryListener);
      return;
    }
    localTLSErrInfo.ErrCode = paramTransReqContext.getResult();
    localTLSErrInfo.Msg = "解析包出错";
    whenError(localTLSErrInfo, localTLSOpenAccountQueryListener);
  }
  
  private void OnTLSRequestRegister(TransReqContext paramTransReqContext, TLSUserInfo paramTLSUserInfo, int paramInt)
  {
    int i = paramTransReqContext.get_subcmd();
    Object localObject = paramTransReqContext.listener;
    TLSErrInfo localTLSErrInfo = new TLSErrInfo(paramInt, "", I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_3));
    if (paramInt != 0) {
      whenError(localTLSErrInfo, localObject);
    }
    do
    {
      return;
      paramInt = acc_request.parse_checkvalid_rsp(i, paramTransReqContext.get_body(), this.mRegStatus);
      if (paramInt != 0)
      {
        localTLSErrInfo.ErrCode = paramInt;
        whenError(localTLSErrInfo, localObject);
        return;
      }
      QLog.i("reg cmd:" + i + " ret:" + this.mRegStatus.sec_ctrl_code);
      localTLSErrInfo.ErrCode = this.mRegStatus.sec_ctrl_code;
      localTLSErrInfo.Msg = new String(this.mRegStatus.promptinfo);
      if (localTLSErrInfo.ErrCode != 0)
      {
        whenError(localTLSErrInfo, localObject);
        return;
      }
      QLog.i("Reg Success " + localTLSErrInfo.ErrCode + ", msg: " + localTLSErrInfo.Msg);
      switch (i)
      {
      default: 
        QLog.w("OnTLSRequestRegister unhandle cmd:" + i);
        return;
      case 49: 
        QLog.i("OnPwdRegAskCodeSuccess ");
        ((TLSPwdRegListener)localObject).OnPwdRegAskCodeSuccess(this.mRegStatus.next_resend_time, this.mRegStatus.total_time_over);
        return;
      case 33: 
        QLog.i("OnSmsRegAskCodeSuccess ");
        ((TLSSmsRegListener)localObject).OnSmsRegAskCodeSuccess(this.mRegStatus.next_resend_time, this.mRegStatus.total_time_over);
        return;
      case 64: 
        QLog.i("OnPwdResetAskCodeSuccess ");
        ((TLSPwdResetListener)localObject).OnPwdResetAskCodeSuccess(this.mRegStatus.next_resend_time, this.mRegStatus.total_time_over);
        return;
      case 52: 
        QLog.i("OnPwdRegReaskCodeSuccess ");
        ((TLSPwdRegListener)localObject).OnPwdRegReaskCodeSuccess(this.mRegStatus.next_resend_time, this.mRegStatus.total_time_over);
        return;
      case 36: 
        QLog.i("OnSmsRegReaskCodeSuccess ");
        ((TLSSmsRegListener)localObject).OnSmsRegReaskCodeSuccess(this.mRegStatus.next_resend_time, this.mRegStatus.total_time_over);
        return;
      case 65: 
        QLog.i("OnPwdResetReaskCodeSuccess ");
        ((TLSPwdResetListener)localObject).OnPwdResetReaskCodeSuccess(this.mRegStatus.next_resend_time, this.mRegStatus.total_time_over);
        return;
      case 53: 
        QLog.i("OnPwdRegVerifyCodeSuccess ");
        ((TLSPwdRegListener)localObject).OnPwdRegVerifyCodeSuccess();
        return;
      case 37: 
        QLog.i("OnSmsRegVerifyCodeSuccess ");
        ((TLSSmsRegListener)localObject).OnSmsRegVerifyCodeSuccess();
        return;
      case 66: 
        QLog.i("OnPwdResetVerifyCodeSuccess ");
        ((TLSPwdResetListener)localObject).OnPwdResetVerifyCodeSuccess();
        return;
      case 54: 
        QLog.i("OnPwdRegCommitSuccess ");
        ((TLSPwdRegListener)localObject).OnPwdRegCommitSuccess(paramTLSUserInfo);
        return;
      case 38: 
        QLog.i("OnSmsRegCommitSuccess ");
        ((TLSSmsRegListener)localObject).OnSmsRegCommitSuccess(paramTLSUserInfo);
        return;
      case 67: 
        QLog.i("OnPwdResetCommitSuccess ");
        ((TLSPwdResetListener)localObject).OnPwdResetCommitSuccess(paramTLSUserInfo);
        return;
      case 97: 
        QLog.i("OnStrAccRegQuerySuccess ");
        TLSStrAccRegCommit((TLSStrAccRegListener)localObject);
        return;
      case 102: 
        QLog.i("OnStrAccRegCommitSuccess ");
        ((TLSStrAccRegListener)localObject).OnStrAccRegSuccess(paramTLSUserInfo);
        return;
      }
      QLog.i("OnGuestRegSuccess ");
      paramTLSUserInfo.identifier = this.mRegStatus.userID;
      if ((localObject instanceof TLSGuestRegListener))
      {
        ((TLSGuestRegListener)localObject).OnGuestRegSuccess(paramTLSUserInfo);
        return;
      }
    } while (!(localObject instanceof TLSSSORegListener));
    ((TLSSSORegListener)localObject).OnGuestRegSuccess(paramTLSUserInfo);
  }
  
  private int RequestTransport(String paramString1, int paramInt, String paramString2, String paramString3, long paramLong, TransReqContext paramTransReqContext)
  {
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    localTLSUserInfo.identifier = paramString2;
    req_global localreq_global = this.mG.getClone(0L);
    new WorkThread(Looper.myLooper(), new TLSHelper.18(this, paramString2, paramLong, localreq_global, paramTransReqContext, localTLSUserInfo), new TLSHelper.19(this, paramTransReqContext, localTLSUserInfo, localreq_global, paramString1, paramInt, paramString3)).start();
    return 64535;
  }
  
  private int ShareKeyInitBC()
  {
    try
    {
      Object localObject1 = KeyPairGenerator.getInstance("EC", "BC");
      ((KeyPairGenerator)localObject1).initialize(new ECGenParameterSpec("secp192k1"));
      localObject1 = ((KeyPairGenerator)localObject1).genKeyPair();
      Object localObject2 = ((KeyPair)localObject1).getPrivate();
      localObject1 = ((KeyPair)localObject1).getPublic().getEncoded();
      Object localObject3 = KeyFactory.getInstance("EC", "BC").generatePublic(new X509EncodedKeySpec(util.string_to_buf("3046301006072A8648CE3D020106052B8104001F03320004928D8850673088B343264E0C6BACB8496D697799F37211DEB25BB73906CB089FEA9639B4E0260498B51A992D50813DA8")));
      KeyAgreement localKeyAgreement = KeyAgreement.getInstance("ECDH", "BC");
      localKeyAgreement.init((Key)localObject2);
      localKeyAgreement.doPhase((Key)localObject3, true);
      localObject3 = localKeyAgreement.generateSecret();
      localObject2 = new byte[49];
      System.arraycopy(localObject1, 23, localObject2, 0, 49);
      localObject1 = MD5.toMD5Byte((byte[])localObject3);
      this.mG._pub_key = ((byte[])localObject2);
      this.mG._share_key = ((byte[])localObject1);
      QLog.i("create key pair and shared key with bouncycastle OK");
      return 0;
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      QLog.w("create key pair and shared key failed, " + localInvalidAlgorithmParameterException.getMessage());
      return -1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      QLog.w("create key pair and shared key failed, " + localNoSuchAlgorithmException.getMessage());
      return -2;
    }
    catch (NoSuchProviderException localNoSuchProviderException)
    {
      QLog.w("create key pair and shared key failed, " + localNoSuchProviderException.getMessage());
      return -3;
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      QLog.w("create key pair and shared key failed, " + localInvalidKeySpecException.getMessage());
      return -4;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      QLog.w("create key pair and shared key failed, " + localInvalidKeyException.getMessage());
    }
    return -5;
  }
  
  private int ShareKeyInitDefault()
  {
    this.mG._pub_key = util.string_to_buf("020b03cf3d99541f29ffec281bebbd4ea211292ac1f53d7128");
    this.mG._share_key = util.string_to_buf("4da0f614fc9f29c2054c77048a6566d7");
    StringBuilder localStringBuilder = new StringBuilder().append("android sdk ");
    req_global localreq_global = this.mG;
    QLog.w(req_global._android_sdk + " using DEFAULT key");
    return 0;
  }
  
  private int ShareKeyInitOpenSSL()
  {
    if (Build.VERSION.SDK_INT >= 23) {}
    do
    {
      return -1;
      localObject = new EcdhCrypt(this.mContext);
    } while (((EcdhCrypt)localObject).GenereateKey() != 0);
    byte[] arrayOfByte = ((EcdhCrypt)localObject).get_c_pub_key();
    Object localObject = ((EcdhCrypt)localObject).get_g_share_key();
    if ((arrayOfByte != null) && (arrayOfByte.length > 0) && (localObject != null) && (localObject.length > 0))
    {
      this.mG._pub_key = ((byte[])arrayOfByte.clone());
      this.mG._share_key = ((byte[])((byte[])localObject).clone());
      QLog.i("create key pair and shared key with OpenSSL OK");
      return 0;
    }
    QLog.w("get client public key or shared key FAILED");
    return -2;
  }
  
  private int TLSGuestReg(TLSGuestRegListener paramTLSGuestRegListener)
  {
    acc_guest localacc_guest = new acc_guest();
    paramTLSGuestRegListener = new TransReqContext(paramTLSGuestRegListener);
    paramTLSGuestRegListener.set_register_req();
    paramTLSGuestRegListener.set_subcmd(localacc_guest.get_cmd());
    paramTLSGuestRegListener._body = localacc_guest.get_request(this.mAccType, req_global._apk_id, this.mAppVer, this.mCountry, this.mSdkAppid, req_global._IMEI);
    return RequestTransport(null, 0, null, null, this.mRegStatus.role, paramTLSGuestRegListener);
  }
  
  private int TLSSSOGuestReg(TLSSSORegListener paramTLSSSORegListener)
  {
    acc_guest localacc_guest = new acc_guest();
    paramTLSSSORegListener = new TransReqContext(paramTLSSSORegListener);
    paramTLSSSORegListener.set_register_req();
    paramTLSSSORegListener.set_subcmd(localacc_guest.get_cmd());
    paramTLSSSORegListener._body = localacc_guest.get_request(this.mAccType, req_global._apk_id, this.mAppVer, this.mCountry, this.mSdkAppid, req_global._IMEI);
    return RequestTransport(null, 0, null, null, this.mRegStatus.role, paramTLSSSORegListener);
  }
  
  private int TLSStrAccRegCommit(TLSStrAccRegListener paramTLSStrAccRegListener)
  {
    acc_commit localacc_commit = new acc_commit(102);
    paramTLSStrAccRegListener = new TransReqContext(paramTLSStrAccRegListener);
    paramTLSStrAccRegListener.set_register_req();
    paramTLSStrAccRegListener.set_subcmd(localacc_commit.get_cmd());
    paramTLSStrAccRegListener._body = localacc_commit.get_request(this.mRegStatus.token, this.mRegStatus.password, null);
    return RequestTransport(null, 0, this.mRegStatus.userID, null, this.mRegStatus.role, paramTLSStrAccRegListener);
  }
  
  private int askCode(String paramString, int paramInt, boolean paramBoolean, Object paramObject)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 64519;
    }
    if ((paramBoolean) && ((this.openAccountInfo.checkInvalid()) || (this.openAccountInfo.status == TLSOpenAccountInfo.OpenAccountStatus.UNKNOWN) || (this.openAccountInfo.status == TLSOpenAccountInfo.OpenAccountStatus.USED_BINDED)))
    {
      QLog.i("openAccountInfo invalid or status == UNKNOW or status == LOGINED_BINDED");
      return 64519;
    }
    this.mRegStatus.userID = paramString;
    acc_ask_code localacc_ask_code = new acc_ask_code(paramInt);
    paramObject = new TransReqContext(paramObject);
    this.mRegStatus.sdkAppid = this.mSdkAppid;
    ((TransReqContext)paramObject).set_register_req();
    ((TransReqContext)paramObject).set_subcmd(localacc_ask_code.get_cmd());
    if (paramBoolean) {}
    for (((TransReqContext)paramObject)._body = localacc_ask_code.get_request(this.mAccType, paramString, req_global._apk_id, this.mAppVer, this.mCountry, this.mSdkAppid, req_global._IMEI, this.openAccountInfo);; ((TransReqContext)paramObject)._body = localacc_ask_code.get_request(this.mAccType, paramString, req_global._apk_id, this.mAppVer, this.mCountry, this.mSdkAppid, req_global._IMEI)) {
      return RequestTransport(null, 0, paramString, null, this.mRegStatus.role, (TransReqContext)paramObject);
    }
  }
  
  private int commit(String paramString, int paramInt, Object paramObject)
  {
    acc_commit localacc_commit = new acc_commit(paramInt);
    paramObject = new TransReqContext(paramObject);
    ((TransReqContext)paramObject).set_register_req();
    ((TransReqContext)paramObject).set_subcmd(localacc_commit.get_cmd());
    ((TransReqContext)paramObject)._body = localacc_commit.get_request(this.mRegStatus.token, paramString, this.mRegStatus.msgcode);
    return RequestTransport(null, 0, this.mRegStatus.userID, null, this.mRegStatus.role, (TransReqContext)paramObject);
  }
  
  public static TLSHelper getInstance()
  {
    try
    {
      if (__helper == null) {
        __helper = new TLSHelper();
      }
      TLSHelper localTLSHelper = __helper;
      return localTLSHelper;
    }
    finally {}
  }
  
  private Ticket getLocalTicket(String paramString, int paramInt)
  {
    return getUserTicket(GetLocalSig(paramString, this.mSdkAppid), paramInt);
  }
  
  private static Ticket getUserTicket(TLSUserInfo paramTLSUserInfo, int paramInt)
  {
    if ((paramTLSUserInfo != null) && (paramTLSUserInfo._tickets != null))
    {
      int i = 0;
      while (i < paramTLSUserInfo._tickets.size())
      {
        Ticket localTicket = (Ticket)paramTLSUserInfo._tickets.get(i);
        if (localTicket.Type == paramInt)
        {
          QLog.i(" type:" + Integer.toHexString(paramInt) + " sig:" + util.buf_len(localTicket.Sig) + " key:" + util.buf_len(localTicket.SigKey) + " create time:" + localTicket.CreateTime + " expire time:" + localTicket.ExpireTime);
          return localTicket;
        }
        i += 1;
      }
    }
    return null;
  }
  
  private int reaskCode(int paramInt, Object paramObject)
  {
    acc_reask_code localacc_reask_code = new acc_reask_code(paramInt);
    paramObject = new TransReqContext(paramObject);
    ((TransReqContext)paramObject).set_register_req();
    ((TransReqContext)paramObject).set_subcmd(localacc_reask_code.get_cmd());
    ((TransReqContext)paramObject)._body = localacc_reask_code.get_request(this.mRegStatus.token);
    return RequestTransport(null, 0, this.mRegStatus.userID, null, this.mRegStatus.role, (TransReqContext)paramObject);
  }
  
  private int requestInit()
  {
    try
    {
      int i = util.get_saved_network_type(this.mContext);
      String str2 = Build.VERSION.RELEASE;
      String str1 = str2;
      if (str2 == null) {
        str1 = "";
      }
      req_global.init();
      QLog.i("android version:" + str1 + " saved_network_type:" + i + " network_type:" + req_global._network_type + " release time:" + util.get_release_time() + " svn ver:" + 1532L);
      return 0;
    }
    finally {}
  }
  
  public static void setLogcat(boolean paramBoolean)
  {
    util.LOGCAT_OUT = paramBoolean;
  }
  
  private int shareKeyInit()
  {
    QLog.i("Generate Shared Key Begin ...");
    if (ShareKeyInitOpenSSL() == 0) {}
    while (ShareKeyInitBC() == 0) {
      return 0;
    }
    return ShareKeyInitDefault();
  }
  
  private int verifyCode(String paramString, int paramInt, Object paramObject)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 64519;
    }
    acc_verify_code localacc_verify_code = new acc_verify_code(paramInt);
    paramObject = new TransReqContext(paramObject);
    this.mRegStatus.msgcode = paramString.getBytes();
    ((TransReqContext)paramObject).set_register_req();
    ((TransReqContext)paramObject).set_subcmd(localacc_verify_code.get_cmd());
    ((TransReqContext)paramObject)._body = localacc_verify_code.get_request(this.mRegStatus.token, paramString.getBytes());
    return RequestTransport(null, 0, this.mRegStatus.userID, null, this.mRegStatus.role, (TransReqContext)paramObject);
  }
  
  private void whenError(TLSErrInfo paramTLSErrInfo, Object paramObject)
  {
    if (paramTLSErrInfo.ErrCode == 64536) {
      if ((paramObject instanceof TLSPwdRegListener)) {
        ((TLSPwdRegListener)paramObject).OnPwdRegTimeout(paramTLSErrInfo);
      }
    }
    for (;;)
    {
      QLog.i("whenError " + paramTLSErrInfo.ErrCode + ", msg: " + paramTLSErrInfo.Msg);
      return;
      if ((paramObject instanceof TLSPwdResetListener))
      {
        ((TLSPwdResetListener)paramObject).OnPwdResetTimeout(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSSmsRegListener))
      {
        ((TLSSmsRegListener)paramObject).OnSmsRegTimeout(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSStrAccRegListener))
      {
        ((TLSStrAccRegListener)paramObject).OnStrAccRegTimeout(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSGuestRegListener))
      {
        ((TLSGuestRegListener)paramObject).OnGuestRegTimeout(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSOpenAccountQueryListener))
      {
        ((TLSOpenAccountQueryListener)paramObject).onTimeOut(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSOpenAccountBindListener))
      {
        ((TLSOpenAccountBindListener)paramObject).onTimeOut(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSExchangeTicketListener))
      {
        ((TLSExchangeTicketListener)paramObject).OnExchangeTicketTimeout(paramTLSErrInfo);
      }
      else if ((paramObject instanceof TLSOpenAccessTokenListener))
      {
        ((TLSOpenAccessTokenListener)paramObject).OnOpenAccessTokenTimeout(paramTLSErrInfo);
        continue;
        if ((paramObject instanceof TLSPwdRegListener)) {
          ((TLSPwdRegListener)paramObject).OnPwdRegFail(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSPwdResetListener)) {
          ((TLSPwdResetListener)paramObject).OnPwdResetFail(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSSmsRegListener)) {
          ((TLSSmsRegListener)paramObject).OnSmsRegFail(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSStrAccRegListener)) {
          ((TLSStrAccRegListener)paramObject).OnStrAccRegFail(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSGuestRegListener)) {
          ((TLSGuestRegListener)paramObject).OnGuestRegFail(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSOpenAccountQueryListener)) {
          ((TLSOpenAccountQueryListener)paramObject).onFailure(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSOpenAccountBindListener)) {
          ((TLSOpenAccountBindListener)paramObject).onFailure(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSExchangeTicketListener)) {
          ((TLSExchangeTicketListener)paramObject).OnExchangeTicketFail(paramTLSErrInfo);
        } else if ((paramObject instanceof TLSOpenAccessTokenListener)) {
          ((TLSOpenAccessTokenListener)paramObject).OnOpenAccessTokenFail(paramTLSErrInfo);
        }
      }
    }
  }
  
  public int TLSExchangeTicket(long paramLong, String paramString1, String paramString2, TLSExchangeTicketListener paramTLSExchangeTicketListener)
  {
    if ((util.checkInvalid(paramString1)) || (util.checkInvalid(paramString2))) {
      return 64519;
    }
    this.mSdkAppid = paramLong;
    Oidb0xa0b_request localOidb0xa0b_request = new Oidb0xa0b_request(2);
    paramTLSExchangeTicketListener = new TransReqContext(paramTLSExchangeTicketListener);
    paramTLSExchangeTicketListener.set_subcmd(localOidb0xa0b_request.getCmd());
    paramTLSExchangeTicketListener._body = localOidb0xa0b_request.get_request(this.mSdkAppid, 0, paramString1, null, paramString2);
    return RequestTransport(null, 0, paramString1, paramString2, 6269L, paramTLSExchangeTicketListener);
  }
  
  public int TLSExchangeTicket(String paramString1, String paramString2, TLSExchangeTicketListener paramTLSExchangeTicketListener)
  {
    return TLSExchangeTicket(this.mSdkAppid, paramString1, paramString2, paramTLSExchangeTicketListener);
  }
  
  public long TLSGetLastRefreshTime(String paramString)
  {
    if (util.checkInvalid(paramString)) {}
    do
    {
      do
      {
        return 0L;
        QLog.i("TLSGetLastRefreshTime identifier:" + paramString);
        paramString = this.mG.getTinyInfo(paramString);
      } while (paramString == null);
      paramString = this.mG.get_siginfo(paramString._tinyid, this.mSdkAppid);
    } while (paramString == null);
    return paramString._A2_create_time;
  }
  
  public int TLSGuestLogin(TLSGuestLoginListener paramTLSGuestLoginListener)
  {
    TLSGuestReg(new TLSHelper.6(this, paramTLSGuestLoginListener));
    return 64535;
  }
  
  public int TLSOpenAccessToken(int paramInt, String paramString, TLSOpenAccessTokenListener paramTLSOpenAccessTokenListener)
  {
    if ((paramInt <= 0) || (util.checkInvalid(paramString))) {
      return 64519;
    }
    Oidb0x483_request localOidb0x483_request = new Oidb0x483_request();
    paramTLSOpenAccessTokenListener = new TransReqContext(paramTLSOpenAccessTokenListener);
    paramTLSOpenAccessTokenListener.set_subcmd(localOidb0x483_request.getCmd());
    paramTLSOpenAccessTokenListener._body = localOidb0x483_request.get_request(this.mSdkAppid, paramInt, paramString);
    return RequestTransport(null, paramInt, null, null, 5970L, paramTLSOpenAccessTokenListener);
  }
  
  public int TLSOpenAccountBind(String paramString1, String paramString2, TLSOpenAccountBindListener paramTLSOpenAccountBindListener)
  {
    int i = this.openAccountInfo.openAccountType;
    String str1 = this.openAccountInfo.openid;
    String str2 = this.openAccountInfo.access_token;
    String str3 = this.openAccountInfo.openappid;
    this.openAccountInfo.identifer = paramString1;
    this.openAccountInfo.usersig = paramString2;
    if ((i <= 0) || (util.checkInvalid(paramString1)) || (util.checkInvalid(paramString2)) || (util.checkInvalid(str1)) || (util.checkInvalid(str2))) {
      return 64519;
    }
    Oidb0x601_request localOidb0x601_request = new Oidb0x601_request();
    paramTLSOpenAccountBindListener = new TransReqContext(paramTLSOpenAccountBindListener);
    paramTLSOpenAccountBindListener.set_subcmd(localOidb0x601_request.getCmd());
    paramTLSOpenAccountBindListener._body = localOidb0x601_request.get_request((int)this.openAccountInfo.sdkAppid, this.openAccountInfo.userAccountType, paramString1, paramString2, i, this.openAccountInfo.openappid, str1, str2);
    return RequestTransport(str3, i, str1, str2, 6161L, paramTLSOpenAccountBindListener);
  }
  
  public int TLSOpenAccountLogin(TLSExchangeTicketListener paramTLSExchangeTicketListener)
  {
    if (this.openAccountInfo.checkInvalid()) {
      return 64519;
    }
    int i = this.openAccountInfo.openAccountType;
    String str1 = this.openAccountInfo.openid;
    String str2 = this.openAccountInfo.openappid;
    String str3 = this.openAccountInfo.access_token;
    Oidb0xa0b_request localOidb0xa0b_request = new Oidb0xa0b_request(1);
    paramTLSExchangeTicketListener = new TransReqContext(paramTLSExchangeTicketListener);
    paramTLSExchangeTicketListener.set_subcmd(localOidb0xa0b_request.getCmd());
    paramTLSExchangeTicketListener._body = localOidb0xa0b_request.get_request(this.mSdkAppid, i, str1, str2, str3);
    return RequestTransport(str2, i, str1, str3, 6269L, paramTLSExchangeTicketListener);
  }
  
  public int TLSOpenAccountQuery(TLSOpenAccountQueryListener paramTLSOpenAccountQueryListener)
  {
    int i = this.openAccountInfo.openAccountType;
    String str1 = this.openAccountInfo.openid;
    String str2 = this.openAccountInfo.access_token;
    String str3 = this.openAccountInfo.openappid;
    if ((i <= 0) || (util.checkInvalid(str1)) || (util.checkInvalid(str2))) {
      return 64519;
    }
    Oidb0x602_request localOidb0x602_request = new Oidb0x602_request();
    paramTLSOpenAccountQueryListener = new TransReqContext(paramTLSOpenAccountQueryListener);
    paramTLSOpenAccountQueryListener.set_subcmd(localOidb0x602_request.getCmd());
    paramTLSOpenAccountQueryListener._body = localOidb0x602_request.get_request((int)this.mSdkAppid, i, str3, str1, str2);
    return RequestTransport(str3, i, str1, str2, 6161L, paramTLSOpenAccountQueryListener);
  }
  
  public int TLSPwdLogin(String paramString, byte[] paramArrayOfByte, TLSPwdLoginListener paramTLSPwdLoginListener)
  {
    QLog.i("user:" + paramString + " TLSPwdLogin ..." + this.mSdkAppid);
    this.mAsyncSeq = 0L;
    return GetStWithPasswd(paramString, paramArrayOfByte, false, paramTLSPwdLoginListener);
  }
  
  public int TLSPwdLoginReaskImgcode(TLSPwdLoginListener paramTLSPwdLoginListener)
  {
    new TLSUserInfo();
    req_global localreq_global = this.mG.getClone(this.mAsyncSeq);
    new WorkThread(Looper.myLooper(), new TLSHelper.12(this, localreq_global), new TLSHelper.13(this, localreq_global, paramTLSPwdLoginListener)).start();
    return 64535;
  }
  
  public int TLSPwdLoginVerifyImgcode(String paramString, TLSPwdLoginListener paramTLSPwdLoginListener)
  {
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    req_global localreq_global = this.mG.getClone(this.mAsyncSeq);
    new WorkThread(Looper.myLooper(), new TLSHelper.16(this, localreq_global, localTLSUserInfo, paramString), new TLSHelper.17(this, localreq_global, paramTLSPwdLoginListener, localTLSUserInfo)).start();
    return 64535;
  }
  
  public int TLSPwdRegAskCode(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    QLog.i("TLSPwdRegAskCode ..." + paramString);
    return askCode(paramString, 49, false, paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegAskCodeWithOA(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    QLog.i("TLSPwdRegAskCodeWithOA ..." + paramString);
    return askCode(paramString, 49, true, paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegCommit(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    QLog.i("TLSPwdRegCommit ...");
    return commit(paramString, 54, paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegReaskCode(TLSPwdRegListener paramTLSPwdRegListener)
  {
    QLog.i("TLSPwdRegReaskCode ...");
    return reaskCode(52, paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegVerifyCode(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    QLog.i("TLSPwdRegVerifyCode ...");
    return verifyCode(paramString, 53, paramTLSPwdRegListener);
  }
  
  public int TLSPwdResetAskCode(String paramString, TLSPwdResetListener paramTLSPwdResetListener)
  {
    QLog.i("TLSPwdResetAskCode ..." + paramString);
    return askCode(paramString, 64, false, paramTLSPwdResetListener);
  }
  
  public int TLSPwdResetCommit(String paramString, TLSPwdResetListener paramTLSPwdResetListener)
  {
    QLog.i("TLSPwdResetCommit ...");
    return commit(paramString, 67, paramTLSPwdResetListener);
  }
  
  public int TLSPwdResetReaskCode(TLSPwdResetListener paramTLSPwdResetListener)
  {
    QLog.i("TLSPwdResetReaskCode ...");
    return reaskCode(65, paramTLSPwdResetListener);
  }
  
  public int TLSPwdResetVerifyCode(String paramString, TLSPwdResetListener paramTLSPwdResetListener)
  {
    QLog.i("TLSPwdResetVerifyCode ...");
    return verifyCode(paramString, 66, paramTLSPwdResetListener);
  }
  
  public int TLSRefreshUserSig(String paramString, TLSRefreshUserSigListener paramTLSRefreshUserSigListener)
  {
    TLSOpenAccountInfo localTLSOpenAccountInfo = GetLocalOpenAccountInfo(paramString, this.mSdkAppid);
    if ((localTLSOpenAccountInfo == null) || (!localTLSOpenAccountInfo.openid.equals(paramString)))
    {
      QLog.i("Account RefreshUserSig");
      return GetStWithoutPasswd(paramString, this.mSdkAppid, paramTLSRefreshUserSigListener);
    }
    QLog.i("OpenAccount RefreshUserSig");
    paramString = this.openAccountInfo;
    this.openAccountInfo = localTLSOpenAccountInfo;
    TLSOpenAccountLogin(new TLSHelper.1(this, paramTLSRefreshUserSigListener, paramString));
    return 64535;
  }
  
  public int TLSSSOGuestLogin(TLSSSOGuestLoginListener paramTLSSSOGuestLoginListener)
  {
    TLSSSOGuestReg(new TLSHelper.7(this, paramTLSSSOGuestLoginListener));
    return 64535;
  }
  
  public int TLSSmsLogin(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    QLog.i("user:" + paramString + " TLSSmsLogin ..." + this.mSubAppid);
    String str = acc_status.mpasswd;
    if (str.length() > 0) {
      this.mAsyncSeq = 0L;
    }
    QLog.i("has mpasswd? " + str.length());
    return GetStWithPasswd(paramString, str.getBytes(), true, paramTLSSmsLoginListener);
  }
  
  public int TLSSmsLoginAskCode(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    acc_status.msalt = 0L;
    acc_status.mpasswd = "";
    if (paramString == null) {
      return 64519;
    }
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    req_global localreq_global = this.mG.getClone(0L);
    this.mAsyncSeq = localreq_global._seq;
    new WorkThread(Looper.myLooper(), new TLSHelper.8(this, localreq_global, paramString, localTLSUserInfo), new TLSHelper.9(this, localreq_global, paramTLSSmsLoginListener)).start();
    return 64535;
  }
  
  public int TLSSmsLoginReaskCode(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 64519;
    }
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    req_global localreq_global = this.mG.getClone(this.mAsyncSeq);
    new WorkThread(Looper.myLooper(), new TLSHelper.10(this, localreq_global, paramString, localTLSUserInfo), new TLSHelper.11(this, localreq_global, paramTLSSmsLoginListener)).start();
    return 64535;
  }
  
  public int TLSSmsLoginVerifyCode(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 64519;
    }
    TLSUserInfo localTLSUserInfo = new TLSUserInfo();
    req_global localreq_global = this.mG.getClone(this.mAsyncSeq);
    new WorkThread(Looper.myLooper(), new TLSHelper.14(this, localreq_global, paramString, localTLSUserInfo), new TLSHelper.15(this, localreq_global, paramTLSSmsLoginListener)).start();
    return 64535;
  }
  
  public int TLSSmsRegAskCode(String paramString, TLSSmsRegListener paramTLSSmsRegListener)
  {
    QLog.i("TLSSmsRegAskCode ..." + paramString);
    return askCode(paramString, 33, false, paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegAskCodeWithOA(String paramString, TLSSmsRegListener paramTLSSmsRegListener)
  {
    QLog.i("TLSSmsRegAskCodeWithOA ..." + paramString);
    return askCode(paramString, 33, true, paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegCommit(TLSSmsRegListener paramTLSSmsRegListener)
  {
    QLog.i("TLSSmsRegCommit No Password...");
    acc_status.mpasswd = util.get_mpasswd();
    return commit(acc_status.mpasswd, 38, paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegReaskCode(TLSSmsRegListener paramTLSSmsRegListener)
  {
    QLog.i("TLSSmsRegReaskCode ...");
    return reaskCode(36, paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegVerifyCode(String paramString, TLSSmsRegListener paramTLSSmsRegListener)
  {
    QLog.i("TLSSmsRegVerifyCode ...");
    return verifyCode(paramString, 37, paramTLSSmsRegListener);
  }
  
  public int TLSStrAccReg(String paramString1, String paramString2, TLSStrAccRegListener paramTLSStrAccRegListener)
  {
    if ((paramString1.length() == 0) || (paramString1.getBytes().length > 24)) {
      return 64519;
    }
    if ((paramString2.length() == 0) || (paramString2.getBytes().length > 16) || (paramString2.getBytes().length < 8)) {
      return 64519;
    }
    int j = 1;
    int i = 0;
    while (i < paramString1.length())
    {
      char c = paramString1.charAt(i);
      if ((c != '.') && (c != '_') && (!Character.isLetterOrDigit(c))) {
        return 64519;
      }
      if (!Character.isDigit(c)) {
        j = 0;
      }
      i += 1;
    }
    if (j != 0) {
      return 64519;
    }
    acc_ask_code localacc_ask_code = new acc_ask_code(97);
    paramTLSStrAccRegListener = new TransReqContext(paramTLSStrAccRegListener);
    this.mRegStatus.userID = paramString1;
    this.mRegStatus.password = paramString2;
    paramTLSStrAccRegListener.set_register_req();
    paramTLSStrAccRegListener.set_subcmd(localacc_ask_code.get_cmd());
    paramTLSStrAccRegListener._body = localacc_ask_code.get_request(this.mAccType, paramString1, req_global._apk_id, this.mAppVer, this.mCountry, this.mSdkAppid, req_global._IMEI);
    return RequestTransport(null, 0, paramString1, null, this.mRegStatus.role, paramTLSStrAccRegListener);
  }
  
  public int TLSStrAccRegWithOA(String paramString1, String paramString2, TLSStrAccRegListener paramTLSStrAccRegListener)
  {
    if ((paramString1.length() == 0) || (paramString1.getBytes().length > 24)) {
      return 64519;
    }
    if ((paramString2.length() == 0) || (paramString2.getBytes().length > 16) || (paramString2.getBytes().length < 8)) {
      return 64519;
    }
    if (this.openAccountInfo.checkInvalid()) {
      return 64519;
    }
    int j = 1;
    int i = 0;
    while (i < paramString1.length())
    {
      char c = paramString1.charAt(i);
      if ((c != '.') && (c != '_') && (!Character.isLetterOrDigit(c))) {
        return 64519;
      }
      if (!Character.isDigit(c)) {
        j = 0;
      }
      i += 1;
    }
    if (j != 0) {
      return 64519;
    }
    acc_ask_code localacc_ask_code = new acc_ask_code(97);
    paramTLSStrAccRegListener = new TransReqContext(paramTLSStrAccRegListener);
    this.mRegStatus.userID = paramString1;
    this.mRegStatus.password = paramString2;
    paramTLSStrAccRegListener.set_register_req();
    paramTLSStrAccRegListener.set_subcmd(localacc_ask_code.get_cmd());
    paramTLSStrAccRegListener._body = localacc_ask_code.get_request(this.mAccType, paramString1, req_global._apk_id, this.mAppVer, this.mCountry, this.mSdkAppid, req_global._IMEI, this.openAccountInfo);
    return RequestTransport(null, 0, paramString1, null, this.mRegStatus.role, paramTLSStrAccRegListener);
  }
  
  public void clearUserInfo(String paramString)
  {
    QLog.i("user:" + paramString + " sdkAppid:" + this.mSdkAppid + " clearUserInfo");
    if ((paramString == null) || (paramString.length() <= 0)) {
      return;
    }
    if (paramString.equals(guest)) {
      guest = null;
    }
    long l = this.mG.getTinyId(paramString);
    if (l != 0L) {
      this.mG.clear_sig(l, this.mSdkAppid);
    }
    this.mG.remove_account(paramString);
  }
  
  public List<TLSUserInfo> getAllUserInfo()
  {
    return this.mG.get_all_logined_account();
  }
  
  public byte[] getGUID()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (req_global._IMEI != null)
    {
      localObject1 = localObject2;
      if (req_global._IMEI.length > 0)
      {
        localObject1 = new byte[req_global._IMEI.length];
        System.arraycopy(req_global._IMEI, 0, localObject1, 0, req_global._IMEI.length);
      }
    }
    return (byte[])localObject1;
  }
  
  public String getGuestIdentifier()
  {
    if (guest != null) {
      return guest;
    }
    Object localObject = this.mG.get_all_logined_account();
    if (localObject == null) {
      return null;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      TLSUserInfo localTLSUserInfo = (TLSUserInfo)((Iterator)localObject).next();
      if (localTLSUserInfo.userType == TinyInfo.UserType.USER_TYPE_GUEST)
      {
        localObject = localTLSUserInfo.identifier;
        guest = (String)localObject;
        return (String)localObject;
      }
    }
    return null;
  }
  
  public TLSUserInfo getLastUserInfo()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = this.mG.get_all_logined_account();
    if (localObject3 == null) {}
    Iterator localIterator;
    do
    {
      return (TLSUserInfo)localObject2;
      localIterator = ((List)localObject3).iterator();
      localObject2 = localObject1;
    } while (!localIterator.hasNext());
    localObject3 = (TLSUserInfo)localIterator.next();
    localObject2 = localObject3;
    if (localObject1 != null) {
      if (((TLSUserInfo)localObject3).createTime <= ((TLSUserInfo)localObject1).createTime) {
        break label74;
      }
    }
    label74:
    for (localObject2 = localObject3;; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
    }
  }
  
  public TLSOpenAccountInfo getOpenAccountInfo()
  {
    return this.openAccountInfo;
  }
  
  public String getSDKVersion()
  {
    return "1.1.1532";
  }
  
  public String getSSOGuestIdentifier()
  {
    if (ssoGuest != null) {
      return ssoGuest;
    }
    Object localObject = this.mG.get_all_logined_account();
    if (localObject == null) {
      return null;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      TLSUserInfo localTLSUserInfo = (TLSUserInfo)((Iterator)localObject).next();
      if (localTLSUserInfo.userType == TinyInfo.UserType.USER_TYPE_SSO_GUEST)
      {
        localObject = localTLSUserInfo.identifier;
        ssoGuest = (String)localObject;
        return (String)localObject;
      }
    }
    return null;
  }
  
  public Map<String, Object> getSSOTicket(String paramString)
  {
    HashMap localHashMap = new HashMap();
    TLSUserInfo localTLSUserInfo = GetLocalSig(paramString, this.mSdkAppid);
    Ticket localTicket = getUserTicket(localTLSUserInfo, 64);
    if (localTicket == null)
    {
      localHashMap.put("A2", new byte[0]);
      localHashMap.put("A2Key", new byte[0]);
      localTicket = getUserTicket(localTLSUserInfo, 262144);
      if (localTicket != null) {
        break label176;
      }
      localHashMap.put("D2", new byte[0]);
      localHashMap.put("D2Key", new byte[0]);
    }
    for (;;)
    {
      long l = 0L;
      if (localTLSUserInfo != null)
      {
        l = localTLSUserInfo.tinyid;
        paramString = localTLSUserInfo.identifier;
      }
      localHashMap.put("tinyID", Long.valueOf(l));
      localHashMap.put("identifier", paramString);
      return localHashMap;
      localHashMap.put("A2", localTicket.Sig);
      localHashMap.put("A2Key", localTicket.SigKey);
      break;
      label176:
      localHashMap.put("D2", localTicket.Sig);
      localHashMap.put("D2Key", localTicket.SigKey);
    }
  }
  
  public String getUserSig(String paramString)
  {
    Ticket localTicket = getLocalTicket(paramString, 268435456);
    String str = "";
    paramString = str;
    if (localTicket != null)
    {
      paramString = str;
      if (localTicket.Sig != null)
      {
        paramString = str;
        if (localTicket.Sig.length > 0)
        {
          paramString = new String(localTicket.Sig);
          QLog.i("ticket not null " + paramString.length());
        }
      }
    }
    return paramString;
  }
  
  public TLSHelper init(Context paramContext, long paramLong)
  {
    QLog.initQAL();
    this.mContext = paramContext;
    this.mSdkAppid = paramLong;
    this.mAccType = 0;
    this.mAppVer = "";
    req_global._acc_type = 0;
    req_global.sdkappid = paramLong;
    acc_status.apk_id = util.get_apk_id(this.mContext);
    acc_status.apk_sig = util.getPkgSigFromApkName(this.mContext, this.mContext.getPackageName());
    this.mG.set_context(this.mContext);
    shareKeyInit();
    requestInit();
    return this;
  }
  
  public boolean needLogin(String paramString)
  {
    if (paramString == null) {
      return true;
    }
    long l = this.mG.getTinyId(paramString);
    Object localObject;
    if (l == 0L) {
      localObject = null;
    }
    while ((localObject == null) || (((SigInfo)localObject)._en_A1 == null) || (((SigInfo)localObject)._en_A1.length <= 0))
    {
      QLog.i("userAccount:" + paramString + " dwAppid:" + this.mSdkAppid + " IsUserHaveA1 false");
      return true;
      SigInfo localSigInfo = this.mG.get_siginfo(l, this.mSdkAppid);
      localObject = localSigInfo;
      if (localSigInfo == null) {
        localObject = localSigInfo;
      }
    }
    QLog.i("userAccount:" + paramString + " dwAppid:" + this.mSdkAppid + " IsUserHaveA1 true");
    return false;
  }
  
  public boolean needSmsVerify(String paramString)
  {
    return acc_status.mpasswd.length() == 0;
  }
  
  public void setCountry(int paramInt)
  {
    this.mCountry = paramInt;
  }
  
  public void setLocalId(int paramInt)
  {
    acc_status.lang = paramInt;
    req_global._local_id = paramInt;
  }
  
  public void setOpenAccountInfo(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.openAccountInfo = new TLSOpenAccountInfo(paramInt, paramString1, paramString2, paramString3);
    this.openAccountInfo.sdkAppid = this.mSdkAppid;
    this.openAccountInfo.userAccountType = this.mAccType;
  }
  
  public void setOpenAccountInfo(TLSOpenAccountInfo paramTLSOpenAccountInfo)
  {
    this.openAccountInfo = paramTLSOpenAccountInfo;
    this.openAccountInfo.sdkAppid = this.mSdkAppid;
    this.openAccountInfo.userAccountType = this.mAccType;
  }
  
  public void setTestHost(String paramString, boolean paramBoolean)
  {
    oicq_request.set_test(1, paramString);
    this.mG._use_sso_channel = paramBoolean;
  }
  
  public void setTimeOut(int paramInt)
  {
    this.mG._time_out = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */