package com.tencent.qalsdk.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qalsdk.QALCallBack;
import com.tencent.qalsdk.QALConnListener;
import com.tencent.qalsdk.QALInitHelper;
import com.tencent.qalsdk.QALPushListener;
import com.tencent.qalsdk.QALSDKManager;
import com.tencent.qalsdk.QALUserStatusListener;
import com.tencent.qalsdk.QALValueCallBack;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseActionListener;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.im_open.common.CmdErrorCode;
import com.tencent.qalsdk.im_open.stat_reg.RspBody;
import com.tencent.qalsdk.util.GuestHelper;
import com.tencent.qalsdk.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import qalsdk.w;
import qalsdk.x;
import tencent.tls.platform.TLSLoginHelper;

public class e
{
  private static String A = null;
  private static String B = null;
  private static String C = null;
  private static int D = 0;
  private static e G = new e();
  private static Handler H = new Handler(Looper.getMainLooper());
  static final String b = "appTimeoutReq";
  static ac e = ;
  public static final String f = "com.tencent.qalsdk.service.QalService";
  private static final String l = "CoreWrapper";
  private ConcurrentHashMap<String, QALPushListener> E = new ConcurrentHashMap();
  private long F = 15000L;
  private com.tencent.qalsdk.core.a I;
  private boolean J = false;
  AtomicInteger a = new AtomicInteger();
  public volatile boolean c = false;
  volatile boolean d = false;
  y g;
  public Random h = new Random();
  public AtomicInteger i = new AtomicInteger(1000);
  com.tencent.qalsdk.core.l j;
  w k = new n(this);
  private String m;
  private ConcurrentHashMap<String, String> n = new ConcurrentHashMap();
  private ConcurrentHashMap<String, String> o = new ConcurrentHashMap();
  private ConcurrentHashMap<String, Integer> p = new ConcurrentHashMap();
  private String q = null;
  private String r = null;
  private String s = null;
  private String t = "openim";
  private volatile boolean u = false;
  private volatile boolean v = false;
  private String w = null;
  private String x = null;
  private Context y = null;
  private int z = 1;
  
  private void a(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return;
    }
    paramToServiceMsg.setAppId(537046243);
    paramToServiceMsg.setTimeout(this.F);
    paramToServiceMsg.setServiceName("com.tencent.qalsdk.service.QalService");
    MsfSdkUtils.addToMsgProcessName(this.m, paramToServiceMsg);
  }
  
  private void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg, QALCallBack paramQALCallBack)
  {
    Object localObject = null;
    if (paramToServiceMsg != null) {
      localObject = (String)paramToServiceMsg.getAttribute("regPushReason");
    }
    QLog.d("CoreWrapper", 4, "pushReason:" + (String)localObject + "cmd:" + paramFromServiceMsg.getMsfCommand() + ":" + paramFromServiceMsg.getServiceCmd());
    if ((localObject != null) && (((String)localObject).equals(qalsdk.o.b.toString())) && (paramQALCallBack != null) && (!paramFromServiceMsg.isSuccess())) {
      if ((paramFromServiceMsg.getResultCode() == 1002) && (this.p.containsKey(paramFromServiceMsg.getUin())))
      {
        int i1 = ((Integer)this.p.get(paramFromServiceMsg.getUin())).intValue() + 1;
        if (i1 <= 2)
        {
          paramToServiceMsg = (String)this.o.get(paramFromServiceMsg.getUin());
          QLog.i("CoreWrapper", " retry register:" + paramToServiceMsg + ":" + i1);
          paramToServiceMsg = f(paramToServiceMsg);
          if ((paramToServiceMsg != null) && (!paramToServiceMsg.b.equals("0")))
          {
            this.p.put(paramFromServiceMsg.getUin(), Integer.valueOf(i1));
            a(paramQALCallBack, paramToServiceMsg);
          }
        }
      }
    }
    label454:
    label806:
    do
    {
      do
      {
        do
        {
          byte[] arrayOfByte;
          do
          {
            for (;;)
            {
              return;
              paramToServiceMsg = paramFromServiceMsg.getBusinessFailMsg();
              QLog.e("CoreWrapper", paramFromServiceMsg.getServiceCmd() + " failed:" + 1001 + ":" + paramToServiceMsg + ":" + paramFromServiceMsg.getRequestSsoSeq());
              paramQALCallBack.onError(1001, paramToServiceMsg);
              return;
              if (!paramFromServiceMsg.isSuccess())
              {
                QLog.e("CoreWrapper", "regsiter error:" + paramFromServiceMsg.isSuccess());
                return;
              }
              arrayOfByte = a(paramFromServiceMsg);
              localObject = new stat_reg.RspBody();
              if (arrayOfByte != null) {
                break label454;
              }
              try
              {
                QLog.i("CoreWrapper", "regsiter rspbody null,is already online. app cb ret ok ");
                if (paramQALCallBack != null)
                {
                  paramQALCallBack.onSuccess();
                  return;
                }
              }
              catch (InvalidProtocolBufferMicroException paramToServiceMsg)
              {
                paramToServiceMsg.printStackTrace();
              }
            }
          } while (paramQALCallBack == null);
          QLog.e("CoreWrapper", paramFromServiceMsg.getServiceCmd() + " failed:" + 6001 + ": parse rspbody failed");
          paramQALCallBack.onError(6001, "reg push: parse rspbody failed");
          return;
          ((stat_reg.RspBody)localObject).mergeFrom(arrayOfByte);
          if (paramFromServiceMsg.getMsfCommand().equals(MsfCommand.registerPush))
          {
            QLog.d("CoreWrapper", 4, "setRegisterStatus:" + e.a.c);
            a((String)paramFromServiceMsg.getAttribute("to_conn_apn"), (String)paramFromServiceMsg.getAttribute("to_conn_gateIP"), (String)paramFromServiceMsg.getAttribute("to_conn_serverIP"), ((Integer)paramFromServiceMsg.getAttribute("to_conn_radioType")).intValue());
          }
          for (;;)
          {
            if (((stat_reg.RspBody)localObject).enum_cmd_error_code.uint32_code.get() == 0) {
              break label806;
            }
            if ((paramFromServiceMsg.getMsfCommand().equals(MsfCommand.registerPush)) && (((stat_reg.RspBody)localObject).enum_cmd_error_code.uint32_code.get() == 1002)) {
              b().a(paramFromServiceMsg.getUin(), new m(this));
            }
            if (paramQALCallBack == null) {
              break;
            }
            QLog.e("CoreWrapper", paramFromServiceMsg.getServiceCmd() + " failed. result:" + ((stat_reg.RspBody)localObject).enum_cmd_error_code.uint32_code.get());
            paramQALCallBack.onError(((stat_reg.RspBody)localObject).enum_cmd_error_code.uint32_code.get(), ((stat_reg.RspBody)localObject).enum_cmd_error_code.bytes_err_msg.get().toStringUtf8());
            return;
            if (paramFromServiceMsg.getMsfCommand() != MsfCommand.unRegisterPush) {}
          }
        } while (paramToServiceMsg != null);
        paramToServiceMsg = QALSDKManager.getInstance().getUserStatusListener();
        if (paramToServiceMsg != null) {
          paramToServiceMsg.onRegisterFail((String)this.o.get(paramFromServiceMsg.getUin()), ((stat_reg.RspBody)localObject).enum_cmd_error_code.uint32_code.get(), ((stat_reg.RspBody)localObject).enum_cmd_error_code.bytes_err_msg.get().toStringUtf8());
        }
        QLog.e("CoreWrapper", paramFromServiceMsg.getServiceCmd() + "failed. getUserStatusListener. result:" + ((stat_reg.RspBody)localObject).enum_cmd_error_code.uint32_code.get());
        return;
        if (paramQALCallBack != null)
        {
          QLog.i("CoreWrapper", paramFromServiceMsg.getServiceCmd() + " succ,app cb return. " + paramFromServiceMsg.getMsfCommand());
          paramQALCallBack.onSuccess();
          return;
        }
        paramToServiceMsg = QALSDKManager.getInstance().getUserStatusListener();
      } while (paramToServiceMsg == null);
      paramFromServiceMsg = (String)this.o.get(paramFromServiceMsg.getUin());
    } while (paramFromServiceMsg == null);
    QLog.i("CoreWrapper", 4, "getUserStatusListener.onRegisterSucc: " + paramFromServiceMsg);
    paramToServiceMsg.onRegisterSucc(paramFromServiceMsg);
  }
  
  private boolean a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    boolean bool;
    for (;;)
    {
      try
      {
        if (QLog.isColorLevel()) {
          QLog.d("CoreWrapper", 2, "[CoreWrapper handleRespMsg] recv resp msg:" + paramFromServiceMsg);
        }
        int i1 = paramFromServiceMsg.getBusinessFailCode();
        Object localObject;
        if ((i1 == 55535) || (i1 == 55533) || (i1 == 55532))
        {
          localObject = (String)this.o.get(paramToServiceMsg.getUin());
          if ((localObject != null) && (this.q != null) && (((String)localObject).equals(this.q)))
          {
            if (i1 == 55535)
            {
              QLog.i("CoreWrapper", "handleRespMsg CODE_D2Expired:" + (String)localObject);
              this.r = null;
              GuestHelper.getInstance().tlsRefreshID((String)localObject, true);
              return true;
            }
            QLog.i("CoreWrapper", "handleRespMsg CODE_D2 invalid:" + (String)localObject);
            this.r = null;
            GuestHelper.getInstance().generateAndLoginGuest();
            return true;
          }
        }
        if (paramFromServiceMsg.getMsfCommand() == MsfCommand.registerPush)
        {
          QLog.d("CoreWrapper", 2, "handle server msg [register push] ");
          bool = false;
          if (bool) {
            break;
          }
          if (paramToServiceMsg.getActionListener() != null)
          {
            H.post(new f(this, paramToServiceMsg, paramFromServiceMsg));
            return true;
          }
        }
        else
        {
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.unRegisterPush)
          {
            QLog.d("CoreWrapper", 2, "handle server msg [unregister push] ");
            bool = false;
            continue;
          }
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.registerCmdCallback)
          {
            bool = true;
            continue;
          }
          localObject = paramFromServiceMsg.getMsfCommand();
          MsfCommand localMsfCommand = MsfCommand.resetCmdCallback;
          if (localObject != localMsfCommand) {
            break label333;
          }
          bool = true;
          continue;
        }
        return false;
      }
      catch (Exception paramToServiceMsg)
      {
        QLog.d("CoreWrapper", 1, "handle resp msg error " + paramToServiceMsg, paramToServiceMsg);
        return true;
      }
      label333:
      bool = false;
    }
    return bool;
  }
  
  public static byte[] a(FromServiceMsg paramFromServiceMsg)
  {
    byte[] arrayOfByte = paramFromServiceMsg.getWupBuffer();
    paramFromServiceMsg = null;
    if (arrayOfByte.length - 4 >= 0)
    {
      paramFromServiceMsg = new byte[arrayOfByte.length - 4];
      System.arraycopy(arrayOfByte, 4, paramFromServiceMsg, 0, arrayOfByte.length - 4);
    }
    return paramFromServiceMsg;
  }
  
  public static e b()
  {
    return G;
  }
  
  private boolean b(FromServiceMsg paramFromServiceMsg)
  {
    Object localObject;
    try
    {
      localObject = paramFromServiceMsg.getServiceCmd();
      QLog.d("CoreWrapper", 1, "[CoreWrapper handlePushMsg] recv push cmd: " + (String)localObject + ":msf cmd:" + paramFromServiceMsg.getMsfCommand());
      if (paramFromServiceMsg.getMsfCommand() == MsfCommand.onNetNeedSignon)
      {
        QLog.i("CoreWrapper", com.tencent.qalsdk.core.m.h() + " wifi need wath");
        paramFromServiceMsg = (String)paramFromServiceMsg.getAttribute("signonurl");
        QALSDKManager.getInstance().getConnectionListener().onWifiNeedAuth(paramFromServiceMsg);
        return true;
      }
      if (((String)localObject).equals("cmd_connOpened"))
      {
        if (QALSDKManager.getInstance().getConnectionListener() == null) {
          break label434;
        }
        QALSDKManager.getInstance().getConnectionListener().onConnected();
        return true;
      }
    }
    catch (Exception paramFromServiceMsg)
    {
      QLog.d("CoreWrapper", 1, "handle push msg error " + paramFromServiceMsg, paramFromServiceMsg);
      return true;
    }
    if (((String)localObject).equals("cmd_connClosed"))
    {
      if (QALSDKManager.getInstance().getConnectionListener() != null)
      {
        QALSDKManager.getInstance().getConnectionListener().onDisconnected(0, "");
        return true;
      }
    }
    else
    {
      if (((String)localObject).equals("cmd_connInfo"))
      {
        a((String)paramFromServiceMsg.getAttribute("to_conn_apn"), (String)paramFromServiceMsg.getAttribute("to_conn_gateIP"), (String)paramFromServiceMsg.getAttribute("to_conn_serverIP"), ((Integer)paramFromServiceMsg.getAttribute("to_conn_radioType")).intValue());
        return true;
      }
      if (((String)localObject).equals("im_open_status.stat_forceoffline"))
      {
        localObject = QALSDKManager.getInstance().getUserStatusListener();
        if (localObject != null)
        {
          QLog.i("CoreWrapper", paramFromServiceMsg.getUin() + " forceoffline, getUserStatusListener cb");
          ((QALUserStatusListener)localObject).onForceOffline((String)this.o.get(paramFromServiceMsg.getUin()));
          return true;
        }
      }
      else
      {
        if (paramFromServiceMsg.getMsfCommand() == MsfCommand.registerPush)
        {
          a(null, paramFromServiceMsg, null);
          return true;
        }
        if (this.E.containsKey(localObject))
        {
          localObject = (QALPushListener)this.E.get(localObject);
          if (!a(paramFromServiceMsg, (QALPushListener)localObject))
          {
            ((QALPushListener)localObject).onSuccess(d(paramFromServiceMsg.getUin()), a(paramFromServiceMsg));
            return true;
          }
        }
        else
        {
          QLog.d("CoreWrapper", 2, "push come,no callback:" + paramFromServiceMsg.getServiceCmd());
        }
      }
    }
    label434:
    return true;
  }
  
  private String d(String paramString)
  {
    return (String)this.o.get(paramString);
  }
  
  private void e(String paramString)
  {
    c localc = new c();
    localc.a = paramString;
    paramString = new ArrayList();
    Iterator localIterator = this.E.keySet().iterator();
    while (localIterator.hasNext()) {
      paramString.add((String)localIterator.next());
    }
    paramString.add("im_open_status.stat_forceoffline");
    localc.b = paramString;
    paramString = ac.a().a(localc);
    ac.a().b(paramString);
  }
  
  private a f(String paramString)
  {
    Object localObject1 = "0";
    Object localObject4 = null;
    Object localObject3 = null;
    Object localObject2 = null;
    QLog.d("CoreWrapper", 4, "getTicket:" + paramString);
    if (TLSLoginHelper.getInstance() == null)
    {
      QLog.e("CoreWrapper", 1, "tls sdk not init");
      return null;
    }
    Map localMap = TLSLoginHelper.getInstance().getSSOTicket(paramString);
    Iterator localIterator = localMap.keySet().iterator();
    String str;
    Object localObject5;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (("tinyID".equals(str)) || ("identifier".equals(str)))
      {
        if (!"tinyID".equals(str)) {
          break label461;
        }
        localObject5 = localMap.get(str).toString();
        QLog.i("CoreWrapper", 4, "user:" + paramString + String.format(" bind id:%s: %s", new Object[] { str, localMap.get(str) }));
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
        localObject4 = localObject5;
      }
    }
    for (;;)
    {
      localObject5 = localObject4;
      localObject4 = localObject3;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject5;
      break;
      if ("A2".equals(str))
      {
        localObject5 = (byte[])localMap.get(str);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject5;
      }
      else if ("D2".equals(str))
      {
        localObject5 = (byte[])localMap.get(str);
        localObject3 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject5;
      }
      else if ("D2Key".equals(str))
      {
        localObject5 = (byte[])localMap.get(str);
        localObject2 = localObject3;
        localObject3 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        if (paramString.equals(this.q)) {
          this.r = ((String)localObject1);
        }
        this.o.put(localObject1, paramString);
        this.n.put(paramString, localObject1);
        b(paramString);
        localObject5 = new a();
        ((a)localObject5).a(paramString);
        ((a)localObject5).b((String)localObject1);
        ((a)localObject5).a((byte[])localObject4);
        ((a)localObject5).b((byte[])localObject3);
        ((a)localObject5).c((byte[])localObject2);
        ((a)localObject5).a(QALSDKManager.getInstance().getSdkAppId());
        return (a)localObject5;
      }
      else
      {
        label461:
        localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
        localObject4 = localObject5;
      }
    }
  }
  
  private void s()
  {
    if ((this.w != null) && (this.x != null))
    {
      ToServiceMsg localToServiceMsg = new ToServiceMsg("", "0", "qal.setAppEnv");
      localToServiceMsg.setMsfCommand(MsfCommand.qal_setAppEnv);
      localToServiceMsg.setNeedCallback(false);
      localToServiceMsg.addAttribute("appVersion", this.w);
      localToServiceMsg.addAttribute("appChannel", this.x);
      a(localToServiceMsg);
      localToServiceMsg.setAppSeq(MsfSdkUtils.getNextAppSeq());
      ac.a().b(localToServiceMsg);
    }
  }
  
  private void t()
  {
    QLog.d("CoreWrapper", "set service loglevel:" + QLog.getOutputLogLevel());
    ToServiceMsg localToServiceMsg = new ToServiceMsg("", "0", "qal.setLogLevel");
    localToServiceMsg.setMsfCommand(MsfCommand.qal_setLogLevel);
    localToServiceMsg.setNeedCallback(false);
    localToServiceMsg.addAttribute("logLevel", Integer.valueOf(QLog.getOutputLogLevel()));
    a(localToServiceMsg);
    localToServiceMsg.setAppSeq(MsfSdkUtils.getNextAppSeq());
    ac.a().b(localToServiceMsg);
  }
  
  public Context a()
  {
    return this.y;
  }
  
  public void a(int paramInt)
  {
    QLog.setOutputLogLevel(paramInt);
    if (e.b)
    {
      t();
      return;
    }
    this.u = true;
  }
  
  public void a(long paramLong)
  {
    try
    {
      this.F = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokestatic 727	com/tencent/qalsdk/sdk/MsfSdkUtils:getProcessName	(Landroid/content/Context;)Ljava/lang/String;
    //   7: putfield 182	com/tencent/qalsdk/sdk/e:m	Ljava/lang/String;
    //   10: aload_0
    //   11: invokevirtual 729	com/tencent/qalsdk/sdk/e:m	()V
    //   14: aload_0
    //   15: invokevirtual 731	com/tencent/qalsdk/sdk/e:p	()V
    //   18: aload_0
    //   19: getfield 130	com/tencent/qalsdk/sdk/e:u	Z
    //   22: ifeq +12 -> 34
    //   25: aload_0
    //   26: invokespecial 722	com/tencent/qalsdk/sdk/e:t	()V
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield 130	com/tencent/qalsdk/sdk/e:u	Z
    //   34: aload_0
    //   35: getfield 132	com/tencent/qalsdk/sdk/e:v	Z
    //   38: ifeq +12 -> 50
    //   41: aload_0
    //   42: invokespecial 733	com/tencent/qalsdk/sdk/e:s	()V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 132	com/tencent/qalsdk/sdk/e:v	Z
    //   50: aload_0
    //   51: new 735	com/tencent/qalsdk/core/l
    //   54: dup
    //   55: invokespecial 736	com/tencent/qalsdk/core/l:<init>	()V
    //   58: putfield 738	com/tencent/qalsdk/sdk/e:j	Lcom/tencent/qalsdk/core/l;
    //   61: aload_0
    //   62: getfield 738	com/tencent/qalsdk/sdk/e:j	Lcom/tencent/qalsdk/core/l;
    //   65: aload_1
    //   66: invokevirtual 741	com/tencent/qalsdk/core/l:a	(Landroid/content/Context;)Z
    //   69: ifne +152 -> 221
    //   72: ldc 26
    //   74: iconst_1
    //   75: ldc_w 743
    //   78: invokestatic 620	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   81: aload_0
    //   82: new 745	com/tencent/qalsdk/core/a
    //   85: dup
    //   86: invokespecial 746	com/tencent/qalsdk/core/a:<init>	()V
    //   89: putfield 748	com/tencent/qalsdk/sdk/e:I	Lcom/tencent/qalsdk/core/a;
    //   92: aload_0
    //   93: getfield 158	com/tencent/qalsdk/sdk/e:J	Z
    //   96: ifeq +163 -> 259
    //   99: aload_0
    //   100: getfield 748	com/tencent/qalsdk/sdk/e:I	Lcom/tencent/qalsdk/core/a;
    //   103: invokevirtual 750	com/tencent/qalsdk/core/a:a	()V
    //   106: aload_0
    //   107: getfield 748	com/tencent/qalsdk/sdk/e:I	Lcom/tencent/qalsdk/core/a;
    //   110: invokevirtual 753	com/tencent/qalsdk/core/a:d	()Ljava/util/concurrent/ConcurrentHashMap;
    //   113: invokevirtual 582	java/util/concurrent/ConcurrentHashMap:keySet	()Ljava/util/Set;
    //   116: invokeinterface 588 1 0
    //   121: astore_1
    //   122: aload_1
    //   123: invokeinterface 593 1 0
    //   128: ifeq +131 -> 259
    //   131: aload_1
    //   132: invokeinterface 597 1 0
    //   137: checkcast 199	java/lang/String
    //   140: astore_2
    //   141: aload_0
    //   142: getfield 748	com/tencent/qalsdk/sdk/e:I	Lcom/tencent/qalsdk/core/a;
    //   145: invokevirtual 753	com/tencent/qalsdk/core/a:d	()Ljava/util/concurrent/ConcurrentHashMap;
    //   148: aload_2
    //   149: invokevirtual 261	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   152: checkcast 279	com/tencent/qalsdk/sdk/a
    //   155: getfield 754	com/tencent/qalsdk/sdk/a:a	Ljava/lang/String;
    //   158: astore_3
    //   159: ldc 26
    //   161: new 201	java/lang/StringBuilder
    //   164: dup
    //   165: invokespecial 202	java/lang/StringBuilder:<init>	()V
    //   168: ldc_w 756
    //   171: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload_2
    //   175: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc -35
    //   180: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_3
    //   184: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: invokestatic 274	com/tencent/qalsdk/util/QLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aload_0
    //   194: getfield 114	com/tencent/qalsdk/sdk/e:o	Ljava/util/concurrent/ConcurrentHashMap;
    //   197: aload_2
    //   198: aload_3
    //   199: invokevirtual 291	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: aload_0
    //   204: getfield 112	com/tencent/qalsdk/sdk/e:n	Ljava/util/concurrent/ConcurrentHashMap;
    //   207: aload_3
    //   208: aload_2
    //   209: invokevirtual 291	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   212: pop
    //   213: goto -91 -> 122
    //   216: astore_1
    //   217: aload_0
    //   218: monitorexit
    //   219: aload_1
    //   220: athrow
    //   221: aload_0
    //   222: iconst_1
    //   223: putfield 158	com/tencent/qalsdk/sdk/e:J	Z
    //   226: goto -145 -> 81
    //   229: astore_1
    //   230: ldc 26
    //   232: iconst_1
    //   233: new 201	java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial 202	java/lang/StringBuilder:<init>	()V
    //   240: ldc_w 758
    //   243: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: aload_1
    //   247: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   250: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: invokestatic 620	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   256: goto -175 -> 81
    //   259: aload_0
    //   260: monitorexit
    //   261: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	e
    //   0	262	1	paramContext	Context
    //   140	69	2	str1	String
    //   158	50	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   2	34	216	finally
    //   34	50	216	finally
    //   50	81	216	finally
    //   81	122	216	finally
    //   122	213	216	finally
    //   221	226	216	finally
    //   230	256	216	finally
    //   50	81	229	java/lang/Exception
    //   221	226	229	java/lang/Exception
  }
  
  public void a(QALCallBack paramQALCallBack, a parama)
  {
    ah localah = new ah();
    localah.d = 0;
    localah.e = 0;
    localah.c = 11;
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(Long.valueOf(1L));
    localah.b = ((ArrayList)localObject);
    localah.f = (System.currentTimeMillis() / 1000L);
    localah.a = parama.b;
    localObject = new ToServiceMsg("", localah.a, "im_open_status.stat_reg");
    ((ToServiceMsg)localObject).setMsfCommand(MsfCommand.registerPush);
    if (paramQALCallBack != null) {
      ((ToServiceMsg)localObject).setActionListener(new k(this, parama, paramQALCallBack));
    }
    for (;;)
    {
      ai.a((ToServiceMsg)localObject, localah);
      ai.a((ToServiceMsg)localObject, parama);
      a((ToServiceMsg)localObject);
      ((ToServiceMsg)localObject).setAppSeq(MsfSdkUtils.getNextAppSeq());
      QLog.i("CoreWrapper", "regPushNew |" + parama.a + ":" + ((ToServiceMsg)localObject).getAppSeq());
      ac.a().b((ToServiceMsg)localObject);
      if (parama.a.equals(this.q)) {
        QALInitHelper.instance().sendMsg();
      }
      return;
      ((ToServiceMsg)localObject).setNeedCallback(false);
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      this.q = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void a(String paramString, QALCallBack paramQALCallBack)
  {
    Object localObject = (String)this.n.get(paramString);
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      if (paramQALCallBack != null) {
        paramQALCallBack.onError(6014, "invalid account");
      }
      return;
    }
    ah localah = new ah();
    localah.d = 0;
    localah.e = 0;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Long.valueOf(1L));
    localah.b = localArrayList;
    localah.f = 0L;
    localah.a = ((String)localObject);
    localObject = new ToServiceMsg("", localah.a, "im_open_status.stat_reg");
    ((ToServiceMsg)localObject).setMsfCommand(MsfCommand.unRegisterPush);
    if (paramQALCallBack != null) {
      ((ToServiceMsg)localObject).setActionListener(new l(this, paramString, paramQALCallBack));
    }
    for (;;)
    {
      ai.a((ToServiceMsg)localObject, localah);
      a((ToServiceMsg)localObject);
      ((ToServiceMsg)localObject).setAppSeq(MsfSdkUtils.getNextAppSeq());
      ac.a().b((ToServiceMsg)localObject);
      return;
      ((ToServiceMsg)localObject).setNeedCallback(false);
    }
  }
  
  public void a(String paramString, QALPushListener paramQALPushListener)
  {
    try
    {
      Log.d("CoreWrapper", "add push" + paramString);
      this.E.put(paramString, paramQALPushListener);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield 134	com/tencent/qalsdk/sdk/e:w	Ljava/lang/String;
    //   7: aload_0
    //   8: aload_2
    //   9: putfield 136	com/tencent/qalsdk/sdk/e:x	Ljava/lang/String;
    //   12: getstatic 72	com/tencent/qalsdk/sdk/e:e	Lcom/tencent/qalsdk/sdk/ac;
    //   15: getfield 720	com/tencent/qalsdk/sdk/ac:b	Z
    //   18: ifeq +10 -> 28
    //   21: aload_0
    //   22: invokespecial 733	com/tencent/qalsdk/sdk/e:s	()V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield 132	com/tencent/qalsdk/sdk/e:v	Z
    //   33: goto -8 -> 25
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	e
    //   0	41	1	paramString1	String
    //   0	41	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   2	25	36	finally
    //   28	33	36	finally
  }
  
  public void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    try
    {
      A = paramString1;
      C = paramString2;
      B = paramString3;
      D = paramInt;
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void a(String paramString1, String paramString2, byte[] paramArrayOfByte, QALValueCallBack paramQALValueCallBack, long paramLong)
  {
    if (paramString1 == null) {
      if (paramQALValueCallBack != null) {
        paramQALValueCallBack.onError(55428, "account null");
      }
    }
    String str;
    do
    {
      do
      {
        return;
        str = "0";
        if (paramString1.equals("0")) {
          break;
        }
        str = (String)this.n.get(paramString1);
        if ((str != null) && (str.length() != 0)) {
          break;
        }
      } while (paramQALValueCallBack == null);
      paramQALValueCallBack.onError(55428, "invalid account:" + paramString1);
      return;
      if ((!str.equals("0")) || (paramString2.startsWith("wtlogin")) || (paramString2.equals("imopen_passthrough.callback_emp"))) {
        break;
      }
    } while (paramQALValueCallBack == null);
    paramQALValueCallBack.onError(55427, "id 0,but cmd:" + paramString2);
    return;
    if (paramQALValueCallBack != null)
    {
      a(str, paramString2, paramArrayOfByte, new i(this, paramQALValueCallBack), paramLong, false);
      return;
    }
    a(str, paramString2, paramArrayOfByte, null, paramLong, false);
  }
  
  public void a(String paramString1, String paramString2, byte[] paramArrayOfByte, IBaseActionListener paramIBaseActionListener, long paramLong, boolean paramBoolean)
  {
    paramString1 = new ToServiceMsg("", paramString1, paramString2);
    paramString1.putWupBuffer(com.tencent.qalsdk.core.o.b(paramArrayOfByte));
    paramString1.setUinType(20);
    if (paramIBaseActionListener != null) {
      paramString1.setActionListener(paramIBaseActionListener);
    }
    for (;;)
    {
      if (paramBoolean) {
        paramString1.setIsHttpReq();
      }
      paramString1.setAppId(537046243);
      paramString1.setTimeout(paramLong);
      paramString1.setServiceName("com.tencent.qalsdk.service.QalService");
      paramString1.setAppSeq(MsfSdkUtils.getNextAppSeq());
      MsfSdkUtils.addToMsgProcessName(this.m, paramString1);
      ac.a().b(paramString1);
      return;
      paramString1.setNeedCallback(false);
    }
  }
  
  public boolean a(FromServiceMsg paramFromServiceMsg, QALCallBack paramQALCallBack)
  {
    if (!paramFromServiceMsg.isSuccess())
    {
      paramQALCallBack.onError(1001, paramFromServiceMsg.getBusinessFailMsg());
      return true;
    }
    return false;
  }
  
  public boolean a(FromServiceMsg paramFromServiceMsg, QALPushListener paramQALPushListener)
  {
    if (!paramFromServiceMsg.isSuccess())
    {
      String str = paramFromServiceMsg.getBusinessFailMsg();
      paramQALPushListener.onError(d(paramFromServiceMsg.getUin()), 1001, str);
      return true;
    }
    return false;
  }
  
  public boolean a(FromServiceMsg paramFromServiceMsg, QALValueCallBack paramQALValueCallBack)
  {
    if (!paramFromServiceMsg.isSuccess())
    {
      String str = paramFromServiceMsg.getBusinessFailMsg();
      if (paramQALValueCallBack != null)
      {
        paramQALValueCallBack.onError(paramFromServiceMsg.getResultCode(), str);
        return true;
      }
      QLog.e("CoreWrapper", 1, "checkError cb null:" + paramFromServiceMsg.getServiceCmd() + ":" + paramFromServiceMsg.getResultCode());
      return true;
    }
    return false;
  }
  
  public long b(int paramInt)
  {
    long l1 = 15000L;
    if (paramInt > 13600) {
      l1 = (15000L + paramInt / 13600 * 1.5D);
    }
    return l1;
  }
  
  public void b(String paramString)
  {
    try
    {
      this.s = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void b(String paramString, QALCallBack paramQALCallBack)
  {
    paramString = f(paramString);
    if ((paramString != null) && (!paramString.b.equals("0")))
    {
      this.p.put(paramString.b, Integer.valueOf(0));
      a(paramQALCallBack, paramString);
      return;
    }
    QLog.e("CoreWrapper", "tls sdk not init");
    paramQALCallBack.onError(-1, "tls sdk not init");
  }
  
  public long c()
  {
    try
    {
      long l1 = this.F;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void c(String paramString)
  {
    try
    {
      this.t = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public String d()
  {
    try
    {
      String str = this.q;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String e()
  {
    try
    {
      String str = this.r;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String f()
  {
    try
    {
      String str = this.s;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public ConcurrentHashMap<String, String> g()
  {
    try
    {
      ConcurrentHashMap localConcurrentHashMap = this.n;
      return localConcurrentHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String h()
  {
    try
    {
      String str = A;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String i()
  {
    try
    {
      String str = C;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String j()
  {
    try
    {
      String str = B;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int k()
  {
    try
    {
      int i1 = D;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String l()
  {
    try
    {
      String str = this.t;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void m()
  {
    g localg = new g(this);
    localg.setName("handlerRespMsgThread");
    localg.start();
  }
  
  public void n()
  {
    Iterator localIterator = this.n.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        localObject2 = (String)this.n.get(localObject1);
        if ((localObject2 != null) && (((String)localObject2).length() != 0)) {}
      }
      else
      {
        return;
      }
      Object localObject1 = new ah();
      ((ah)localObject1).d = 0;
      ((ah)localObject1).e = 0;
      ((ah)localObject1).c = 95;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(Long.valueOf(1L));
      ((ah)localObject1).b = localArrayList;
      ((ah)localObject1).f = (System.currentTimeMillis() / 1000L);
      ((ah)localObject1).a = ((String)localObject2);
      Object localObject2 = new ToServiceMsg("", ((ah)localObject1).a, "im_open_status.stat_reg");
      ((ToServiceMsg)localObject2).setMsfCommand(MsfCommand.qal_setAppStatus);
      ((ToServiceMsg)localObject2).setNeedCallback(false);
      ai.a((ToServiceMsg)localObject2, (ah)localObject1);
      a((ToServiceMsg)localObject2);
      ((ToServiceMsg)localObject2).setAppSeq(MsfSdkUtils.getNextAppSeq());
      ac.a().b((ToServiceMsg)localObject2);
    }
  }
  
  public void o()
  {
    ToServiceMsg localToServiceMsg = new ToServiceMsg("", "0", "CliLogSvc.QalUpload");
    localToServiceMsg.setMsfCommand(MsfCommand.qal_reportEvent);
    localToServiceMsg.setNeedCallback(false);
    a(localToServiceMsg);
    localToServiceMsg.setAppSeq(MsfSdkUtils.getNextAppSeq());
    ac.a().b(localToServiceMsg);
  }
  
  public void p()
  {
    e.a(this.y, 537046243, "com.tencent.qalsdk.broadcast.qal", "com.tencent.qalsdk.service.QalService", this.k, this.m);
    this.g = new y(new x[] { null, null, null, null, null, null, null });
    e.c();
  }
  
  public String q()
  {
    try
    {
      String str = this.m;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */