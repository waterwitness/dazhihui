package com.android.dazhihui.ui.delegate.screen.jinzheng;

import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.f;
import com.c.a.k;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

public class JinzhengAccountSign
  implements i
{
  private static JinzhengAccountSign s_Instance;
  private String company_id;
  private String login_code;
  private String login_type;
  private JinzhengAccountSign.dataHaveBackListener mDataHaveBackListener;
  private String mes_code;
  private String mes_text;
  private t requestJinzhengSign_600001;
  private String trd_pwd;
  private String user_id;
  
  public static JinzhengAccountSign getInstance()
  {
    if (s_Instance == null) {
      s_Instance = new JinzhengAccountSign();
    }
    return s_Instance;
  }
  
  public String getCompany_id()
  {
    return this.company_id;
  }
  
  public String getLogin_code()
  {
    return this.login_code;
  }
  
  public String getLogin_type()
  {
    return this.login_type;
  }
  
  public String getMes_code()
  {
    return this.mes_code;
  }
  
  public String getMes_text()
  {
    return this.mes_text;
  }
  
  public String getTrd_pwd()
  {
    return this.trd_pwd;
  }
  
  public String getUser_id()
  {
    return this.user_id;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramj instanceof com.android.dazhihui.a.b.g))
    {
      paramj = (com.android.dazhihui.a.b.g)paramj;
      if (paramh == this.requestJinzhengSign_600001)
      {
        paramh = new String(paramj.a());
        System.out.println("签约返回数据" + paramh);
        paramh = (JinzhengResponse)new k().a(paramh, JinzhengResponse.class);
        this.mes_code = ((JinzhengResponse.Answer)paramh.ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
        this.mes_text = ((JinzhengResponse.Answer)paramh.ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
        Toast.makeText(DzhApplication.a(), "客户签约" + this.mes_text, 1).show();
        setMes_code(this.mes_code);
        setMes_text(this.mes_text);
        if (paramh != null) {
          this.mDataHaveBackListener.getmessage();
        }
      }
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void registerDataHaveBackListener(JinzhengAccountSign.dataHaveBackListener paramdataHaveBackListener)
  {
    this.mDataHaveBackListener = paramdataHaveBackListener;
  }
  
  public void sendRequestJinzhengSign_600001()
  {
    Object localObject = new JinZhengRequestData();
    ((JinZhengRequestData)localObject).setService_id("600001");
    ((JinZhengRequestData)localObject).setType("JinzhengSign_600001");
    ((JinZhengRequestData)localObject).setUser_id_cls("2");
    ((JinZhengRequestData)localObject).setUser_id(this.user_id);
    ((JinZhengRequestData)localObject).setCompany_id(this.company_id);
    ((JinZhengRequestData)localObject).setLogin_type(this.login_type);
    ((JinZhengRequestData)localObject).setLogin_code(this.login_code);
    ((JinZhengRequestData)localObject).setTrd_pwd(this.trd_pwd);
    localObject = ((JinZhengRequestData)localObject).jinzhengJson();
    System.out.println("客户签约请求数据" + (String)localObject);
    this.requestJinzhengSign_600001 = new t();
    this.requestJinzhengSign_600001.c(f.Q);
    this.requestJinzhengSign_600001.c("Content-Type", "application/json");
    try
    {
      localObject = new StringEntity((String)localObject, "UTF-8");
      this.requestJinzhengSign_600001.a((HttpEntity)localObject);
      this.requestJinzhengSign_600001.a(this);
      com.android.dazhihui.a.g.a().a(this.requestJinzhengSign_600001);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
  }
  
  public void setCompany_id(String paramString)
  {
    this.company_id = paramString;
  }
  
  public void setLogin_code(String paramString)
  {
    this.login_code = paramString;
  }
  
  public void setLogin_type(String paramString)
  {
    this.login_type = paramString;
  }
  
  public void setMes_code(String paramString)
  {
    this.mes_code = paramString;
  }
  
  public void setMes_text(String paramString)
  {
    this.mes_text = paramString;
  }
  
  public void setTrd_pwd(String paramString)
  {
    this.trd_pwd = paramString;
  }
  
  public void setUser_id(String paramString)
  {
    this.user_id = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\jinzheng\JinzhengAccountSign.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */