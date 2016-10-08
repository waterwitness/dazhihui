package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.dazhihui.d.bh;
import com.android.dazhihui.g;

public class TipActivity
  extends Activity
{
  private int a;
  private String b;
  private String c;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private String i;
  private String j;
  private Dialog k;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903063);
    paramBundle = getIntent().getExtras();
    this.a = paramBundle.getInt("type");
    this.b = paramBundle.getString("information", "");
    this.c = paramBundle.getString("title");
    this.e = paramBundle.getBoolean("otc");
    this.f = paramBundle.getBoolean("XcPt");
    this.g = paramBundle.getBoolean("setPlan");
    this.h = paramBundle.getBoolean("directopen");
    this.i = paramBundle.getString("fundcompanycode");
    this.j = paramBundle.getString("fundcompanyname");
    this.d = paramBundle.getBoolean("gottradelogin", false);
    switch (this.a)
    {
    }
    for (;;)
    {
      showDialog(this.a);
      if (this.a == 6) {
        this.k.setOnCancelListener(new wo(this));
      }
      return;
      this.b = "连接超时，请重试!";
      continue;
      this.b = "您请求的文件不存在!";
      continue;
      this.b = "即将开放，敬请期待!";
      continue;
      this.b = "您请求的股票代码不存在!";
      continue;
      this.b = ("　　" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "提示您，如果您选择[确定]，将视同开通手机网上交易功能，" + "请认真阅读" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "网站相关风险提示，若不能认同其条款，您可选择[放弃]。");
      continue;
      this.b = "　　超时保护，已自动退出委托。";
      continue;
      this.b = ("　　风险提示协议：\n　　选“同意”，视同您同意签署本协议，选“取消”，放弃签署。\n　　凡使用您帐号和密码办理的开放式基金帐户业务均视为您本人办理有效行为，由此产生的后果由您本人承担。\n　　您必须如实填写相关资料。\n　　" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "是您申请代理开放式基金交易的机构，负责将您的数据传送至相关基金公司，但最终开户状态由基金公司及其登记机构负责。\n" + "　　对如下原因造成的后果，" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "不承担任何责任：1、您未完整、真实、准确地填妥各项申请内容，或未付上所需要的全部资料；2、因不符合证券投资基金契约和招募说明书规定的条件，而使各类申请无效；3、由于基金公司的过失，造成损害结果的发生；其他非" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "过失造成的后果，如突发性通讯、设备、自然灾害等不可抗力因素。\n" + "　　" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "慎重提示您：1、基金以往业绩不代表基金未来业绩，基金管理人不负责基金盈亏，也不保证最低收益，请您详细了解基金契约、招募说明书等法律文件，了解并自愿承担证券投资风险。2、" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "对您投资基金的业绩不承担任何担保和其他连带责任。\n" + "　　本协议为" + com.android.dazhihui.c.a.a.i[com.android.dazhihui.ui.a.e.a().j()][2] + "与您签署的证券交易开户文件的一部分，本协议未尽事宜受您签署的系列证券开户文件共同约束。");
      continue;
      if (TextUtils.isEmpty(this.b))
      {
        this.b = "登录已成功！感谢您使用大智慧手机炒股软件！";
        continue;
        this.b = "验证失败，您的手机号码错误，请确认重新注册，谢谢！";
        continue;
        this.b = "验证失败，您的验证码错误，请确认正确性，谢谢！";
        continue;
        this.b = "您的帐号在其他设备登录，请重新登录！";
        continue;
        this.b = "网络异常，请重新启动大智慧软件";
        continue;
        this.b = "尊敬的用户，本次登录失败\n请联系客服：021-20219995 询问具体原因。\n您可以继续进入使用，但是权限为普通用户权限。";
        continue;
        this.b = "用户名或者密码出错!\n请联系客服：021-20219995 询问具体原因。\n";
        continue;
        this.b = "亲爱的用户，已保存的账户信息将被清除，您确定要重新登录吗？";
        continue;
        this.b = "短信已发送，系统验证中，请稍候";
        continue;
        this.b = "设置成功，将不进行股票池短信预警提示";
        continue;
        this.b = "设置已成功";
        continue;
        this.b = "未设置成功，您还没有登录!";
        continue;
        this.b = "未设置成功，您还没有股票池权限!";
        continue;
        this.b = "未设置成功，未知错误!";
        continue;
        this.b = "您的帐户已经过期！";
        continue;
        this.b = "注册用户才可使用该功能，请立即注册。";
        continue;
        this.b = "自选股已成功同步至服务器！ ";
        continue;
        this.b = "无法同步自选股！请检查用户名密码是否正确 ";
        continue;
        this.b = "自选股已成功上传至服务器！ ";
        continue;
        this.b = "自选股已成功从服务器下载！ ";
        continue;
        this.b = "您保存的自选股已经达到最大值100,如果添加新的股票,请删除已保存的股票！";
        continue;
        this.b = "亲爱的用户，请登录之后使用此功能";
        continue;
        this.b = ("大智慧证券手机版 " + g.a().r() + "\n亲爱的用户，欢迎您使用大智慧软件，您可登录大智慧 WAP 网站 http://wapgw.cn 或 Web 网站 http://mo.gw.com.cn ，获得关于本软件的更多信息和服务。" + "\n客服热线： 021-20219995 " + "\n合作热线： 021-20219357" + "\n公司地址： 上海市浦东杨高南路428号1号楼" + "\n邮政编码： 200127 " + "\n版权所有：2007-2013 上海大智慧股份有限公司");
        continue;
        this.b = "亲爱的用户，您已绑定手机号，如需重新绑定，请点击 “ 确定 ” 按钮。";
        continue;
        this.b = "追踪说明：首次登录手机软件，可免费获得一个高手追踪！实时得到推送，跟踪一个高手的重仓情况！\n资费说明：全赛程 5 元跟踪 1 人。";
        continue;
        this.b = "帐户异常!\n请联系客服：021-20219995 询问具体原因。\n";
        continue;
        this.b = "其它原因的错误!\n请联系客服：021-20219995 询问具体原因。\n";
        continue;
        this.b = "验证失败，这个手机号验证重试次数太多了，谢谢！";
        continue;
        this.b = "验证失败，其它原因的错误，谢谢！";
        continue;
        this.b = "昵称已被占用，请重新填写！";
        continue;
        this.b = paramBundle.getString("information");
        continue;
        this.b = "尊敬的客户:\n    依照中国证监会《证券投资基金会销售适用性指导意见》等法规的规定，大智慧提示您，务必接受基金投资风险承受能力的测评，以便履行基金销售适用性的义务。";
        continue;
        this.b = "网络环境设置错误，请重新选择匹配网络!";
      }
    }
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      str1 = getString(2131165363);
      str2 = getString(2131165331);
      return bh.a(this, "提示信息", this.b, str1, str2, new wt(this, paramInt), new wu(this), new wv(this));
    case 36: 
    case 37: 
    case 38: 
    case 41: 
      str1 = getString(2131165363);
      return bh.a(this, getString(2131166360), this.b, str1, null, new ww(this), null);
    case 5: 
      return bh.a(this, "超时保护", this.b, null, "返回", null, new wx(this), new wy(this));
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 13: 
    case 15: 
    case 17: 
    case 18: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 103: 
    case 1000: 
      if ((this.a != 34) && (this.a != 103)) {
        this.c = getString(2131166406);
      }
      for (;;)
      {
        str1 = getString(2131165363);
        return bh.a(this, this.c, this.b, str1, null, new wz(this, paramInt), null, new xa(this));
        if (this.a != 103) {
          this.c = "关于";
        }
      }
    case 100: 
      str1 = getString(2131165363);
      return bh.a(this, "大智慧公告", this.b, str1, null, new xb(this), null);
    case 101: 
      str1 = getString(2131165363);
      return bh.a(this, this.c, this.b, str1, "返回", new xc(this), new xd(this));
    case 102: 
      str1 = getString(2131165363);
      return bh.a(this, this.c, this.b, str1, "退出", new wp(this), new wq(this));
    }
    String str1 = getString(2131165363);
    String str2 = getString(2131165331);
    this.k = bh.a(this, "确认信息", this.b, str1, str2, new wr(this), new ws(this));
    return this.k;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\TipActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */