package tencent.tls.tools;

import tencent.tls.request.req_global;

public class I18nMsg
{
  public static final int EN_US = 1033;
  public static final int ZH_CN = 2052;
  public static final int ZH_HK = 1028;
  static I18nMsg.BasicInfo[] basicInfos = { new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_0, "登录失败"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_0, "登錄失敗"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_0, "Unable to login"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_1, "请你稍后重试。"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_1, "請你稍後重試。"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_1, "Please try again later."), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_2, "手机存储异常，请删除帐号重试。"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_2, "手機存儲異常，請刪除帳號重試。"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_2, "Phone memory error, please delete the account and try again."), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_3, "请求失败，请你稍后重试。"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_3, "請求失敗，請你稍後重試。"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_3, "Request failed, please try again later."), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_4, "网络超时，请你稍后重试。"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_4, "網絡超時，請你稍後重試。"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_4, "Network timeout, please try again later."), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_5, "登录设备保护"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_5, "登錄設備保護"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_5, "Device Protection"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_6, "查询失败，请你稍后重试。"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_6, "查詢失敗，請你稍後重試。"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_6, "Query failed, please try again later."), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_7, "票据无效"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_7, "票據無效"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_7, "Invalid UserSig"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_8, "公钥不正确"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_8, "公鑰不正確"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_8, "Bad Public Key"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_9, "配置错误"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_9, "配置錯誤"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_9, "Bad Configuration"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_10, "access_token无效"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_10, "access_token無效"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_10, "Invalid access_token"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_11, "第三方账号已绑定"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_11, "第三方賬號已綁定"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_11, "OpenAccount has already binded"), new I18nMsg.BasicInfo(2052, I18nMsg.MSG_TYPE.MSG_12, "内部错误"), new I18nMsg.BasicInfo(1028, I18nMsg.MSG_TYPE.MSG_12, "內部錯誤"), new I18nMsg.BasicInfo(1033, I18nMsg.MSG_TYPE.MSG_12, "Inner Error") };
  
  public static String getMsg(I18nMsg.MSG_TYPE paramMSG_TYPE)
  {
    int i = 0;
    while (i < basicInfos.length)
    {
      if ((paramMSG_TYPE == basicInfos[i]._type) && (req_global._local_id == basicInfos[i]._localid)) {
        return basicInfos[i]._msg;
      }
      i += 1;
    }
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tools\I18nMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */