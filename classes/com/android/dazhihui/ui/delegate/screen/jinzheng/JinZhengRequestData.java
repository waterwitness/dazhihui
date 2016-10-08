package com.android.dazhihui.ui.delegate.screen.jinzheng;

import android.util.Log;
import com.android.dazhihui.d.a.a;
import com.android.dazhihui.ui.delegate.b.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JinZhengRequestData
{
  private String Trd_pwd;
  private String acc_pwd;
  private String begin_date;
  private String character_ter;
  private String company_id;
  private String cptl_amt;
  private String currency;
  private String end_date;
  private String ext_acc_pwd;
  private String ext_inst;
  private String ext_serial_no;
  private String key_str;
  private String login_code;
  private String login_type;
  private String market;
  private String order_id;
  private String order_price;
  private String order_qty;
  private String rec_count;
  private String secu_code;
  private String service_id;
  private String session;
  private String sign;
  private String time_stamp;
  private String trd_id;
  private String type;
  private String user_id;
  private String user_id_cls;
  private String user_pwd;
  
  private String getDateTime()
  {
    Date localDate = new Date();
    return new SimpleDateFormat("yyyyMMddHHmmss").format(localDate);
  }
  
  public String JinzhengSign()
  {
    Object localObject1 = new String[8];
    localObject1[0] = "COMPANY_ID";
    localObject1[1] = "USER_ID";
    localObject1[2] = "USER_ID_CLS";
    localObject1[3] = "SESSION";
    localObject1[4] = "MARKET";
    localObject1[5] = "TRD_ID";
    localObject1[6] = "CHARACTER_TER";
    localObject1[7] = "ORDER_ID";
    Object localObject2 = new String[6];
    localObject2[0] = "COMPANY_ID";
    localObject2[1] = "USER_ID";
    localObject2[2] = "USER_ID_CLS";
    localObject2[3] = "SESSION";
    localObject2[4] = "KEY_STR";
    localObject2[5] = "REC_COUNT";
    Object localObject3 = new String[6];
    localObject3[0] = "COMPANY_ID";
    localObject3[1] = "USER_ID";
    localObject3[2] = "USER_ID_CLS";
    localObject3[3] = "SESSION";
    localObject3[4] = "KEY_STR";
    localObject3[5] = "REC_COUNT";
    Object localObject4 = new String[8];
    localObject4[0] = "COMPANY_ID";
    localObject4[1] = "USER_ID";
    localObject4[2] = "USER_ID_CLS";
    localObject4[3] = "SESSION";
    localObject4[4] = "KEY_STR";
    localObject4[5] = "REC_COUNT";
    localObject4[6] = "BEGIN_DATE";
    localObject4[7] = "END_DATE";
    String[] arrayOfString1 = new String[8];
    arrayOfString1[0] = "COMPANY_ID";
    arrayOfString1[1] = "USER_ID";
    arrayOfString1[2] = "USER_ID_CLS";
    arrayOfString1[3] = "SESSION";
    arrayOfString1[4] = "KEY_STR";
    arrayOfString1[5] = "REC_COUNT";
    arrayOfString1[6] = "BEGIN_DATE";
    arrayOfString1[7] = "END_DATE";
    String[] arrayOfString2 = new String[6];
    arrayOfString2[0] = "COMPANY_ID";
    arrayOfString2[1] = "USER_ID";
    arrayOfString2[2] = "USER_ID_CLS";
    arrayOfString2[3] = "SESSION";
    arrayOfString2[4] = "BEGIN_DATE";
    arrayOfString2[5] = "END_DATE";
    String[] arrayOfString3 = new String[6];
    arrayOfString3[0] = "COMPANY_ID";
    arrayOfString3[1] = "USER_ID";
    arrayOfString3[2] = "USER_ID_CLS";
    arrayOfString3[3] = "SESSION";
    arrayOfString3[4] = "BEGIN_DATE";
    arrayOfString3[5] = "END_DATE";
    String[] arrayOfString4 = new String[6];
    arrayOfString4[0] = "COMPANY_ID";
    arrayOfString4[1] = "USER_ID";
    arrayOfString4[2] = "USER_ID_CLS";
    arrayOfString4[3] = "SESSION";
    arrayOfString4[4] = "CURRENCY";
    arrayOfString4[5] = "EXT_INST";
    String[] arrayOfString5 = new String[5];
    arrayOfString5[0] = "COMPANY_ID";
    arrayOfString5[1] = "USER_ID";
    arrayOfString5[2] = "USER_ID_CLS";
    arrayOfString5[3] = "SESSION";
    arrayOfString5[4] = "CURRENCY";
    String[] arrayOfString6 = new String[9];
    arrayOfString6[0] = "COMPANY_ID";
    arrayOfString6[1] = "USER_ID";
    arrayOfString6[2] = "USER_ID_CLS";
    arrayOfString6[3] = "SESSION";
    arrayOfString6[4] = "CURRENCY";
    arrayOfString6[5] = "EXT_INST";
    arrayOfString6[6] = "EXT_SERIAL_NO";
    arrayOfString6[7] = "KEY_STR";
    arrayOfString6[8] = "REC_COUNT";
    String[] arrayOfString7 = new String[6];
    arrayOfString7[0] = "COMPANY_ID";
    arrayOfString7[1] = "USER_ID";
    arrayOfString7[2] = "USER_ID_CLS";
    arrayOfString7[3] = "SESSION";
    arrayOfString7[4] = "CURRENCY";
    arrayOfString7[5] = "EXT_INST";
    String[] arrayOfString8 = new String[10];
    arrayOfString8[0] = "COMPANY_ID";
    arrayOfString8[1] = "USER_ID";
    arrayOfString8[2] = "USER_ID_CLS";
    arrayOfString8[3] = "SESSION";
    arrayOfString8[4] = "CURRENCY";
    arrayOfString8[5] = "EXT_INST";
    arrayOfString8[6] = "CPTL_AMT";
    arrayOfString8[7] = "EXT_ACC_PWD";
    arrayOfString8[8] = "CHARACTER_TER";
    arrayOfString8[9] = "EXT_SERIAL_NO";
    String[] arrayOfString9 = new String[10];
    arrayOfString9[0] = "COMPANY_ID";
    arrayOfString9[1] = "USER_ID";
    arrayOfString9[2] = "USER_ID_CLS";
    arrayOfString9[3] = "SESSION";
    arrayOfString9[4] = "CURRENCY";
    arrayOfString9[5] = "EXT_INST";
    arrayOfString9[6] = "CPTL_AMT";
    arrayOfString9[7] = "ACC_PWD";
    arrayOfString9[8] = "CHARACTER_TER";
    arrayOfString9[9] = "EXT_SERIAL_NO";
    String[] arrayOfString10 = new String[5];
    arrayOfString10[0] = "COMPANY_ID";
    arrayOfString10[1] = "USER_ID";
    arrayOfString10[2] = "USER_ID_CLS";
    arrayOfString10[3] = "SESSION";
    arrayOfString10[4] = "CURRENCY";
    String[] arrayOfString11;
    if (this.type.equals("Jinzheng_600010"))
    {
      arrayOfString11 = new String[new String[] { "COMPANY_ID", "LOGIN_TYPE", "USER_ID", "USER_ID_CLS", "USER_PWD" }.length];
      if (!this.type.equals("JinzhengCancel_600150")) {
        break label1118;
      }
      localObject2 = new String[localObject1.length];
      label749:
      i = 0;
    }
    for (;;)
    {
      if (i >= localObject1.length - 1) {
        break label1452;
      }
      int j = 0;
      for (;;)
      {
        if (j < localObject1.length - 1 - i)
        {
          if (localObject1[j].compareTo(localObject1[(j + 1)]) > 0)
          {
            localObject3 = localObject1[j];
            localObject1[j] = localObject1[(j + 1)];
            localObject1[(j + 1)] = localObject3;
          }
          j += 1;
          continue;
          if (this.type.equals("JinzhengCapital_600200"))
          {
            arrayOfString11 = new String[new String[] { "COMPANY_ID", "USER_ID", "USER_ID_CLS", "SESSION" }.length];
            break;
          }
          if (this.type.equals("JinzhengSign_600001"))
          {
            arrayOfString11 = new String[new String[] { "COMPANY_ID", "USER_ID", "USER_ID_CLS", "LOGIN_TYPE", "LOGIN_CODE", "TRD_PWD" }.length];
            break;
          }
          if (this.type.equals("JinzhengAccountSignInfo_600003"))
          {
            arrayOfString11 = new String[new String[] { "COMPANY_ID", "USER_ID", "USER_ID_CLS" }.length];
            break;
          }
          if (this.type.equals("JinzhengAmount_600130"))
          {
            arrayOfString11 = new String[new String[] { "COMPANY_ID", "USER_ID", "USER_ID_CLS", "SESSION", "MARKET", "TRD_ID", "SECU_CODE", "ORDER_PRICE" }.length];
            break;
          }
          if (!this.type.equals("JinzhengEntrust_600140")) {
            break;
          }
          arrayOfString11 = new String[new String[] { "COMPANY_ID", "USER_ID", "USER_ID_CLS", "SESSION", "MARKET", "TRD_ID", "SECU_CODE", "ORDER_PRICE", "ORDER_QTY", "CHARACTER_TER", "EXT_SERIAL_NO" }.length];
          break;
          label1118:
          if (this.type.equals("JinzhengDRCJ_600180"))
          {
            localObject3 = new String[localObject2.length];
            localObject1 = localObject2;
            localObject2 = localObject3;
            break label749;
          }
          if (this.type.equals("JinzhengDRWT_600160"))
          {
            localObject2 = new String[localObject3.length];
            localObject1 = localObject3;
            break label749;
          }
          if (this.type.equals("JinzhengLSCJ_600190"))
          {
            localObject2 = new String[localObject4.length];
            localObject1 = localObject4;
            break label749;
          }
          if (this.type.equals("JinzhengLSWT_600170"))
          {
            localObject2 = new String[arrayOfString1.length];
            localObject1 = arrayOfString1;
            break label749;
          }
          if (this.type.equals("JinzhengXGPH_600330"))
          {
            localObject2 = new String[arrayOfString2.length];
            localObject1 = arrayOfString2;
            break label749;
          }
          if (this.type.equals("JinzhengXGZQ_600340"))
          {
            localObject2 = new String[arrayOfString3.length];
            localObject1 = arrayOfString3;
            break label749;
          }
          if (this.type.equals("JinzhengYECX_600310"))
          {
            localObject2 = new String[arrayOfString4.length];
            localObject1 = arrayOfString4;
            break label749;
          }
          if (this.type.equals("JinzhengCapital_600120"))
          {
            localObject2 = new String[arrayOfString5.length];
            localObject1 = arrayOfString5;
            break label749;
          }
          if (this.type.equals("JinzhengZZCX_600230"))
          {
            localObject2 = new String[arrayOfString6.length];
            localObject1 = arrayOfString6;
            break label749;
          }
          if (this.type.equals("JinzhengYHXX_600360"))
          {
            localObject2 = new String[arrayOfString7.length];
            localObject1 = arrayOfString7;
            break label749;
          }
          if (this.type.equals("JinzhengYHZZQ_600210"))
          {
            localObject2 = new String[arrayOfString8.length];
            localObject1 = arrayOfString8;
            break label749;
          }
          if (this.type.equals("JinzhengZQZYH_600220"))
          {
            localObject2 = new String[arrayOfString9.length];
            localObject1 = arrayOfString9;
            break label749;
          }
          if (this.type.equals("JinzhengKQZJ_600402"))
          {
            localObject2 = new String[arrayOfString10.length];
            localObject1 = arrayOfString10;
            break label749;
          }
          return null;
        }
      }
      i += 1;
    }
    label1452:
    int i = 0;
    if (i < localObject1.length)
    {
      if (localObject1[i].equals("COMPANY_ID")) {
        localObject2[i] = getCompany_id();
      }
      for (;;)
      {
        i += 1;
        break;
        if (localObject1[i].equals("LOGIN_TYPE")) {
          localObject2[i] = getLogin_type();
        } else if (localObject1[i].equals("USER_ID")) {
          localObject2[i] = getUser_id();
        } else if (localObject1[i].equals("USER_ID_CLS")) {
          localObject2[i] = getUser_id_cls();
        } else if (localObject1[i].equals("USER_PWD")) {
          localObject2[i] = getUser_pwd();
        } else if (localObject1[i].equals("SESSION")) {
          localObject2[i] = getSession();
        } else if (localObject1[i].equals("LOGIN_TYPE")) {
          localObject2[i] = getLogin_type();
        } else if (localObject1[i].equals("LOGIN_CODE")) {
          localObject2[i] = getLogin_code();
        } else if (localObject1[i].equals("TRD_PWD")) {
          localObject2[i] = getTrd_pwd();
        } else if (localObject1[i].equals("KEY_STR")) {
          localObject2[i] = getKey_str();
        } else if (localObject1[i].equals("REC_COUNT")) {
          localObject2[i] = getRec_count();
        } else if (localObject1[i].equals("BEGIN_DATE")) {
          localObject2[i] = getBegin_date();
        } else if (localObject1[i].equals("END_DATE")) {
          localObject2[i] = getEnd_date();
        } else if (localObject1[i].equals("CURRENCY")) {
          localObject2[i] = getCurrency();
        } else if (localObject1[i].equals("EXT_INST")) {
          localObject2[i] = getExt_inst();
        } else if (localObject1[i].equals("EXT_SERIAL_NO")) {
          localObject2[i] = getExt_serial_no();
        } else if (localObject1[i].equals("CPTL_AMT")) {
          localObject2[i] = getCptl_amt();
        } else if (localObject1[i].equals("EXT_ACC_PWD")) {
          localObject2[i] = getExt_acc_pwd();
        } else if (localObject1[i].equals("CHARACTER_TER")) {
          localObject2[i] = getCharacter_ter();
        } else if (localObject1[i].equals("ACC_PWD")) {
          localObject2[i] = getAcc_pwd();
        } else if (localObject1[i].equals("MARKET")) {
          localObject2[i] = getMarket();
        } else if (localObject1[i].equals("TRD_ID")) {
          localObject2[i] = getTrd_id();
        } else if (localObject1[i].equals("SECU_CODE")) {
          localObject2[i] = getSecu_code();
        } else if (localObject1[i].equals("ORDER_PRICE")) {
          localObject2[i] = getOrder_price();
        } else if (localObject1[i].equals("ORDER_QTY")) {
          localObject2[i] = getOrder_qty();
        } else if (localObject1[i].equals("ORDER_ID")) {
          localObject2[i] = getOrder_qty();
        }
      }
    }
    localObject3 = new StringBuffer();
    i = 0;
    if (i < localObject2.length)
    {
      if ((localObject2[i] != null) && (!localObject2[i].equals("")))
      {
        if (i != 0) {
          break label2151;
        }
        ((StringBuffer)localObject3).append(localObject1[i] + "=" + localObject2[i]);
      }
      for (;;)
      {
        i += 1;
        break;
        label2151:
        ((StringBuffer)localObject3).append("&" + localObject1[i] + "=" + localObject2[i]);
      }
    }
    localObject1 = ((StringBuffer)localObject3).toString();
    ((StringBuffer)localObject3).append("&key=");
    ((StringBuffer)localObject3).append("7632c857d08393f1d6ebf5c0c5d02fad");
    localObject2 = ((StringBuffer)localObject3).toString();
    localObject3 = a.a((String)localObject2);
    localObject4 = ((String)localObject3).toUpperCase();
    Log.i("排序后的字符串", "string1---" + (String)localObject1 + "---" + "parternerkey" + "---" + "7632c857d08393f1d6ebf5c0c5d02fad" + "---" + "stringSignTemp" + "---" + (String)localObject2 + "---" + "stringSignTempMD5" + "---" + (String)localObject3 + "---" + "sign" + "---" + (String)localObject4 + "---");
    return (String)localObject4;
  }
  
  public String getAcc_pwd()
  {
    return this.acc_pwd;
  }
  
  public String getBegin_date()
  {
    return this.begin_date;
  }
  
  public String getCharacter_ter()
  {
    return this.character_ter;
  }
  
  public String getCompany_id()
  {
    return this.company_id;
  }
  
  public String getCptl_amt()
  {
    return this.cptl_amt;
  }
  
  public String getCurrency()
  {
    return this.currency;
  }
  
  public String getEnd_date()
  {
    return this.end_date;
  }
  
  public String getExt_acc_pwd()
  {
    return this.ext_acc_pwd;
  }
  
  public String getExt_inst()
  {
    return this.ext_inst;
  }
  
  public String getExt_serial_no()
  {
    return this.ext_serial_no;
  }
  
  public String getKey_str()
  {
    return this.key_str;
  }
  
  public String getLogin_code()
  {
    return this.login_code;
  }
  
  public String getLogin_type()
  {
    return this.login_type;
  }
  
  public String getMarket()
  {
    return this.market;
  }
  
  public String getOrder_id()
  {
    return this.order_id;
  }
  
  public String getOrder_price()
  {
    return this.order_price;
  }
  
  public String getOrder_qty()
  {
    return this.order_qty;
  }
  
  public String getRec_count()
  {
    return this.rec_count;
  }
  
  public String getSecu_code()
  {
    return this.secu_code;
  }
  
  public String getService_id()
  {
    return this.service_id;
  }
  
  public String getSession()
  {
    return this.session;
  }
  
  public String getSign()
  {
    return this.sign;
  }
  
  public String getTime_stamp()
  {
    return this.time_stamp;
  }
  
  public String getTrd_id()
  {
    return this.trd_id;
  }
  
  public String getTrd_pwd()
  {
    return this.Trd_pwd;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getUser_id()
  {
    return this.user_id;
  }
  
  public String getUser_id_cls()
  {
    return this.user_id_cls;
  }
  
  public String getUser_pwd()
  {
    return this.user_pwd;
  }
  
  public String jinzhengJson()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    JSONObject localJSONObject3 = new JSONObject();
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject4 = new JSONObject();
    for (;;)
    {
      try
      {
        setTime_stamp(getDateTime());
        setSign(JinzhengSign());
        localJSONObject1.put("SERVICE_ID", getService_id());
        localJSONObject1.put("TIME_STAMP", getTime_stamp());
        localJSONObject1.put("SIGN", getSign());
        localJSONObject3.put("REQ_MSG_HDR", localJSONObject1);
        if (this.type.equals("Jinzheng_600010"))
        {
          localJSONObject2.put("COMPANY_ID", getCompany_id());
          localJSONObject2.put("LOGIN_TYPE", getLogin_type());
          localJSONObject2.put("USER_ID", getUser_id());
          localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
          localJSONObject2.put("USER_PWD", getUser_pwd());
          localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
          localJSONArray.put(localJSONObject3);
          localJSONObject4.put("REQUESTS", localJSONArray);
          return localJSONObject4.toString();
        }
        if (this.type.equals("JinzhengAmount_600130"))
        {
          localJSONObject2.put("SESSION", getSession());
          localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
          localJSONObject2.put("USER_ID", getUser_id());
          localJSONObject2.put("COMPANY_ID", getCompany_id());
          localJSONObject2.put("MARKET", getMarket());
          localJSONObject2.put("TRD_ID", getTrd_id());
          localJSONObject2.put("SECU_CODE", getSecu_code());
          localJSONObject2.put("ORDER_PRICE", getOrder_price());
          localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
          continue;
        }
        if (!this.type.equals("JinzhengEntrust_600140")) {
          break label466;
        }
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
        return null;
      }
      localJSONObject2.put("SESSION", getSession());
      localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
      localJSONObject2.put("USER_ID", getUser_id());
      localJSONObject2.put("COMPANY_ID", getCompany_id());
      localJSONObject2.put("MARKET", getMarket());
      localJSONObject2.put("TRD_ID", getTrd_id());
      localJSONObject2.put("SECU_CODE", getSecu_code());
      localJSONObject2.put("ORDER_PRICE", getOrder_price());
      localJSONObject2.put("ORDER_QTY", getOrder_qty());
      localJSONObject2.put("CHARACTER_TER", o.h);
      localJSONObject2.put("EXT_SERIAL_NO", getExt_serial_no());
      localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      continue;
      label466:
      if (this.type.equals("JinzhengCapital_600200"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengCapital_600120"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengCancel_600150"))
      {
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("MARKET", getMarket());
        localJSONObject2.put("TRD_ID", getTrd_id());
        localJSONObject2.put("CHARACTER_TER", getCharacter_ter());
        localJSONObject2.put("ORDER_ID", getOrder_id());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengSign_600001"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("LOGIN_TYPE", getLogin_type());
        localJSONObject2.put("LOGIN_CODE", getLogin_code());
        localJSONObject2.put("TRD_PWD", getTrd_pwd());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengAccountSignInfo_600003"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengDRCJ_600180"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("KEY_STR", getKey_str());
        localJSONObject2.put("REC_COUNT", getRec_count());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengDRWT_600160"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("KEY_STR", getKey_str());
        localJSONObject2.put("REC_COUNT", getRec_count());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengLSCJ_600190"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("KEY_STR", getKey_str());
        localJSONObject2.put("REC_COUNT", getRec_count());
        localJSONObject2.put("BEGIN_DATE", getBegin_date());
        localJSONObject2.put("END_DATE", getEnd_date());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengLSWT_600170"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("KEY_STR", getKey_str());
        localJSONObject2.put("REC_COUNT", getRec_count());
        localJSONObject2.put("BEGIN_DATE", getBegin_date());
        localJSONObject2.put("END_DATE", getEnd_date());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengXGPH_600330"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("BEGIN_DATE", getBegin_date());
        localJSONObject2.put("END_DATE", getEnd_date());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengXGZQ_600340"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("BEGIN_DATE", getBegin_date());
        localJSONObject2.put("END_DATE", getEnd_date());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengYECX_600310"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject2.put("EXT_INST", getExt_inst());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengZZCX_600230"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject2.put("EXT_INST", getExt_inst());
        localJSONObject2.put("EXT_SERIAL_NO", getExt_serial_no());
        localJSONObject2.put("KEY_STR", getKey_str());
        localJSONObject2.put("REC_COUNT", getRec_count());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengYHXX_600360"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject2.put("EXT_INST", getExt_inst());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengYHZZQ_600210"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject2.put("EXT_INST", getExt_inst());
        localJSONObject2.put("CPTL_AMT", getCptl_amt());
        localJSONObject2.put("EXT_ACC_PWD", getExt_acc_pwd());
        localJSONObject2.put("CHARACTER_TER", getCharacter_ter());
        localJSONObject2.put("EXT_SERIAL_NO", getExt_serial_no());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengZQZYH_600220"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject2.put("EXT_INST", getExt_inst());
        localJSONObject2.put("CPTL_AMT", getCptl_amt());
        localJSONObject2.put("ACC_PWD", getAcc_pwd());
        localJSONObject2.put("CHARACTER_TER", getCharacter_ter());
        localJSONObject2.put("EXT_SERIAL_NO", getExt_serial_no());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
      else if (this.type.equals("JinzhengKQZJ_600402"))
      {
        localJSONObject2.put("COMPANY_ID", getCompany_id());
        localJSONObject2.put("USER_ID", getUser_id());
        localJSONObject2.put("USER_ID_CLS", getUser_id_cls());
        localJSONObject2.put("SESSION", getSession());
        localJSONObject2.put("CURRENCY", getCurrency());
        localJSONObject3.put("REQ_COMM_DATA", localJSONObject2);
      }
    }
  }
  
  public void setAcc_pwd(String paramString)
  {
    this.acc_pwd = paramString;
  }
  
  public void setBegin_date(String paramString)
  {
    this.begin_date = paramString;
  }
  
  public void setCharacter_ter(String paramString)
  {
    this.character_ter = paramString;
  }
  
  public void setCompany_id(String paramString)
  {
    this.company_id = paramString;
  }
  
  public void setCptl_amt(String paramString)
  {
    this.cptl_amt = paramString;
  }
  
  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }
  
  public void setEnd_date(String paramString)
  {
    this.end_date = paramString;
  }
  
  public void setExt_acc_pwd(String paramString)
  {
    this.ext_acc_pwd = paramString;
  }
  
  public void setExt_inst(String paramString)
  {
    this.ext_inst = paramString;
  }
  
  public void setExt_serial_no(String paramString)
  {
    this.ext_serial_no = paramString;
  }
  
  public void setKey_str(String paramString)
  {
    this.key_str = paramString;
  }
  
  public void setLogin_code(String paramString)
  {
    this.login_code = paramString;
  }
  
  public void setLogin_type(String paramString)
  {
    this.login_type = paramString;
  }
  
  public void setMarket(String paramString)
  {
    this.market = paramString;
  }
  
  public void setOrder_id(String paramString)
  {
    this.order_id = paramString;
  }
  
  public void setOrder_price(String paramString)
  {
    this.order_price = paramString;
  }
  
  public void setOrder_qty(String paramString)
  {
    this.order_qty = paramString;
  }
  
  public void setRec_count(String paramString)
  {
    this.rec_count = paramString;
  }
  
  public void setSecu_code(String paramString)
  {
    this.secu_code = paramString;
  }
  
  public void setService_id(String paramString)
  {
    this.service_id = paramString;
  }
  
  public void setSession(String paramString)
  {
    this.session = paramString;
  }
  
  public void setSign(String paramString)
  {
    this.sign = paramString;
  }
  
  public void setTime_stamp(String paramString)
  {
    this.time_stamp = paramString;
  }
  
  public void setTrd_id(String paramString)
  {
    this.trd_id = paramString;
  }
  
  public void setTrd_pwd(String paramString)
  {
    this.Trd_pwd = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  public void setUser_id(String paramString)
  {
    this.user_id = paramString;
  }
  
  public void setUser_id_cls(String paramString)
  {
    this.user_id_cls = paramString;
  }
  
  public void setUser_pwd(String paramString)
  {
    this.user_pwd = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\jinzheng\JinZhengRequestData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */