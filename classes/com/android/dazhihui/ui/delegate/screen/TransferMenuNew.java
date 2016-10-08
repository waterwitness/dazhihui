package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.h;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.hs.SecretToolkit;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.bo;
import com.android.dazhihui.ui.widget.bq;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import com.kingdom.mt.jni.kdencode.KDEnCode;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

public class TransferMenuNew
  extends DelegateBaseActivity
  implements View.OnClickListener, cp, cs
{
  public static String a;
  private TextView A;
  private TextView B;
  private TextView C;
  private ViewPager D;
  private View E;
  private View F;
  private View G;
  private Button H;
  private Button I;
  private Button J;
  private TextView K;
  private DropDownEditTextView L;
  private DropDownEditTextView M;
  private DropDownEditTextView N;
  private ArrayList<View> O = new ArrayList();
  private String[] P = { "人民币", "美元", "港币" };
  private int[] Q = null;
  private DzhHeader R;
  private int S = 0;
  private int T = 0;
  private ho U;
  private ArrayList<String> V;
  private h W;
  private com.android.dazhihui.a.b.u X;
  private h Y;
  private int aA;
  private com.android.dazhihui.a.b.u aB;
  private com.android.dazhihui.a.b.u aC;
  private int aD;
  private TextView aE;
  private TextView aF;
  private TextView aG;
  private TextView aH;
  private LinearLayout aI;
  private RelativeLayout aJ;
  private LinearLayout aK;
  private LinearLayout aL;
  private TextView aM;
  private TextView aN;
  private Button aO;
  private int aP;
  private int aQ;
  private int aR;
  private String aS;
  private int aT;
  private int aU;
  private int aV;
  private String aW;
  private String aX;
  private String aY;
  private String aZ;
  private int aa;
  private com.android.dazhihui.a.b.u ab;
  private com.android.dazhihui.a.b.u ac;
  private String ad = "";
  private int ae = 0;
  private EditText af;
  private EditText ag;
  private EditText ah;
  private EditText ai;
  private EditText aj;
  private EditText ak;
  private EditText al;
  private EditText am;
  private TableLayoutGroup an;
  private int ao = 0;
  private int ap = 0;
  private int aq = 0;
  private String[] ar;
  private String[] as;
  private String[] at;
  private String[] au;
  private String[] av;
  private int aw;
  private String ax;
  private mh ay;
  private int az;
  protected boolean b;
  private String ba;
  private String[] bb;
  private DatePickerDialog.OnDateSetListener bc;
  private DatePickerDialog.OnDateSetListener bd;
  protected int c;
  protected int d;
  protected int e;
  private e f;
  private e g;
  private e h;
  private e i;
  private e j;
  private boolean m = false;
  private String n = "";
  private t o;
  private t p;
  private t q;
  private t r;
  private t s;
  private t t;
  private boolean u = false;
  private String[] v = { "转入", "转出", "查询余额" };
  private String[] w = { "已报", "成功", "失败", "超时", "已冲正" };
  private String[] x = { "1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008", "1009", "1010", "1012", "1013", "1014", "1015", "1016", "1017", "1018", "1019", "1020", "1021", "1022", "1023", "1024", "1025", "1100" };
  private String[] y = { "工商银行", "农业银行", "中国银行", "建设银行", "交通银行", "招商银行", "兴业银行", "民生银行", "平安银行", "上海浦东发展银行", "光大银行", "华夏银行", "中国邮政储蓄", "广东发展银行", "宁波银行", "中信银行", "渤海银行", "浙商银行", "北京银行", "上海银行", "长沙银行", "东莞银行", "南京银行", "广州银行", "天津银行" };
  private String[] z = { "银行转证券", "证券转银行", "转账查询", "银行余额查询" };
  
  public TransferMenuNew()
  {
    String[] arrayOfString;
    if (a.q == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "流水号";
      arrayOfString[1] = "银行名称";
      arrayOfString[2] = "转帐方向";
      arrayOfString[3] = "转帐金额";
      arrayOfString[4] = "转帐日期";
      arrayOfString[5] = "转帐时间";
      this.ar = arrayOfString;
      if (a.r != null) {
        break label789;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "1191";
      arrayOfString[1] = "1187";
      arrayOfString[2] = "1083";
      arrayOfString[3] = "1192";
      arrayOfString[4] = "1195";
      arrayOfString[5] = "1196";
    }
    for (;;)
    {
      this.as = arrayOfString;
      this.at = new String[] { "类型", "转账金额", "状态" };
      this.au = new String[] { "1083", "1192", "1043" };
      this.av = new String[] { "trans_name", "occur_balance", "entrust_status" };
      this.b = true;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.aw = 3;
      this.ax = "";
      this.az = m.a().H();
      this.aA = 0;
      this.aD = 0;
      this.aX = null;
      this.aY = null;
      this.aZ = null;
      this.ba = null;
      this.bc = new hg(this);
      this.bd = new hh(this);
      return;
      arrayOfString = a.q;
      break;
      label789:
      arrayOfString = a.r;
    }
  }
  
  private void e(int paramInt)
  {
    if ((o.l()) || (o.m()))
    {
      if (this.ae != 0) {
        break label199;
      }
      this.ah.setTransformationMethod(new PasswordTransformationMethod());
      this.ah.setText("");
      this.ah.setHint("");
      this.ah.setEnabled(true);
      this.ai.setTransformationMethod(new HideReturnsTransformationMethod());
      this.ai.setText("");
      this.ai.setHint("无需填写");
      this.ai.setEnabled(false);
      this.aj.setTransformationMethod(new PasswordTransformationMethod());
      this.aj.setText("");
      this.aj.setHint("");
      this.aj.setEnabled(true);
      this.ak.setTransformationMethod(new HideReturnsTransformationMethod());
      this.ak.setText("");
      this.ak.setHint("无需填写");
      this.ak.setEnabled(false);
    }
    label198:
    label199:
    do
    {
      do
      {
        do
        {
          break label198;
          while ((this.W == null) || (this.W.g() == 0))
          {
            return;
            if (this.ae == 1)
            {
              this.am.setTransformationMethod(new HideReturnsTransformationMethod());
              this.am.setText("");
              this.am.setHint("无需填写");
              this.am.setEnabled(false);
              this.al.setTransformationMethod(new PasswordTransformationMethod());
              this.al.setText("");
              this.al.setHint("");
              this.al.setEnabled(true);
            }
          }
          this.aX = this.W.a(paramInt, "1303");
          this.aY = this.W.a(paramInt, "1339");
          this.aZ = this.W.a(paramInt, "1340");
          if ((this.aX == null) || (this.aX.equals(""))) {
            this.aX = "1";
          }
          if ((this.aY == null) || (this.aY.equals(""))) {
            this.aY = "2";
          }
          if ((this.aZ == null) || (this.aZ.equals(""))) {
            this.aZ = "1";
          }
          if (this.ae != 0) {
            break;
          }
          if (this.aX.equals("0"))
          {
            this.ah.setTransformationMethod(new HideReturnsTransformationMethod());
            this.ah.setText("");
            this.ah.setHint("无需填写");
            this.ah.setEnabled(false);
            this.ai.setTransformationMethod(new HideReturnsTransformationMethod());
            this.ai.setText("");
            this.ai.setHint("无需填写");
            this.ai.setEnabled(false);
          }
          while (this.aZ.equals("0"))
          {
            this.aj.setTransformationMethod(new HideReturnsTransformationMethod());
            this.aj.setText("");
            this.aj.setHint("无需填写");
            this.aj.setEnabled(false);
            this.ak.setTransformationMethod(new HideReturnsTransformationMethod());
            this.ak.setText("");
            this.ak.setHint("无需填写");
            this.ak.setEnabled(false);
            return;
            if (this.aX.equals("1"))
            {
              this.ah.setTransformationMethod(new PasswordTransformationMethod());
              this.ah.setText("");
              this.ah.setHint("");
              this.ah.setEnabled(true);
              this.ai.setTransformationMethod(new HideReturnsTransformationMethod());
              this.ai.setText("");
              this.ai.setHint("无需填写");
              this.ai.setEnabled(false);
            }
            else if (this.aX.equals("2"))
            {
              this.ah.setTransformationMethod(new HideReturnsTransformationMethod());
              this.ah.setText("");
              this.ah.setHint("无需填写");
              this.ah.setEnabled(false);
              this.ai.setTransformationMethod(new PasswordTransformationMethod());
              this.ai.setText("");
              this.ai.setHint("");
              this.ai.setEnabled(true);
            }
            else if (this.aX.equals("3"))
            {
              this.ah.setTransformationMethod(new PasswordTransformationMethod());
              this.ah.setText("");
              this.ah.setHint("");
              this.ah.setEnabled(true);
              this.ai.setTransformationMethod(new PasswordTransformationMethod());
              this.ai.setText("");
              this.ai.setHint("");
              this.ai.setEnabled(true);
            }
          }
          if (this.aZ.equals("1"))
          {
            this.aj.setTransformationMethod(new PasswordTransformationMethod());
            this.aj.setText("");
            this.aj.setHint("");
            this.aj.setEnabled(true);
            this.ak.setTransformationMethod(new HideReturnsTransformationMethod());
            this.ak.setText("");
            this.ak.setHint("无需填写");
            this.ak.setEnabled(false);
            return;
          }
          if (this.aZ.equals("2"))
          {
            this.aj.setTransformationMethod(new HideReturnsTransformationMethod());
            this.aj.setText("");
            this.aj.setHint("无需填写");
            this.aj.setEnabled(false);
            this.ak.setTransformationMethod(new PasswordTransformationMethod());
            this.ak.setText("");
            this.ak.setHint("");
            this.ak.setEnabled(true);
            return;
          }
        } while (!this.aZ.equals("3"));
        this.aj.setTransformationMethod(new PasswordTransformationMethod());
        this.aj.setText("");
        this.aj.setHint("");
        this.aj.setEnabled(true);
        this.ak.setTransformationMethod(new PasswordTransformationMethod());
        this.ak.setText("");
        this.ak.setHint("");
        this.ak.setEnabled(true);
        return;
      } while (this.ae != 1);
      if (this.aY.equals("0"))
      {
        this.am.setTransformationMethod(new HideReturnsTransformationMethod());
        this.am.setText("");
        this.am.setHint("无需填写");
        this.am.setEnabled(false);
        this.al.setTransformationMethod(new HideReturnsTransformationMethod());
        this.al.setText("");
        this.al.setHint("无需填写");
        this.al.setEnabled(false);
        return;
      }
      if (this.aY.equals("1"))
      {
        this.am.setTransformationMethod(new PasswordTransformationMethod());
        this.am.setText("");
        this.am.setHint("");
        this.am.setEnabled(true);
        this.al.setTransformationMethod(new HideReturnsTransformationMethod());
        this.al.setText("");
        this.al.setHint("无需填写");
        this.al.setEnabled(false);
        return;
      }
      if (this.aY.equals("2"))
      {
        this.am.setTransformationMethod(new HideReturnsTransformationMethod());
        this.am.setText("");
        this.am.setHint("无需填写");
        this.am.setEnabled(false);
        this.al.setTransformationMethod(new PasswordTransformationMethod());
        this.al.setText("");
        this.al.setHint("");
        this.al.setEnabled(true);
        return;
      }
    } while (!this.aY.equals("3"));
    this.am.setTransformationMethod(new PasswordTransformationMethod());
    this.am.setText("");
    this.am.setHint("");
    this.am.setEnabled(true);
    this.al.setTransformationMethod(new PasswordTransformationMethod());
    this.al.setText("");
    this.al.setHint("");
    this.al.setEnabled(true);
  }
  
  private void q()
  {
    this.aS = o.y();
    this.aP = Integer.parseInt(this.aS.substring(0, 4));
    this.aQ = Integer.parseInt(this.aS.substring(4, 6));
    this.aR = Integer.parseInt(this.aS.substring(6, 8));
    this.aM.setText(this.aP + "-" + this.aQ + "-" + this.aR);
    this.aW = o.y();
    this.aT = Integer.parseInt(this.aW.substring(0, 4));
    this.aU = Integer.parseInt(this.aW.substring(4, 6));
    this.aV = Integer.parseInt(this.aW.substring(6, 8));
    this.aN.setText(this.aT + "-" + this.aU + "-" + this.aV);
    this.an.a();
  }
  
  private void r()
  {
    this.af.setText("");
    this.ah.setText("");
    this.aj.setText("");
    this.al.setText("");
    this.ag.setText("");
    this.aF.setText("");
    this.aE.setText("");
    this.aG.setText("");
  }
  
  private boolean s()
  {
    boolean bool = true;
    if (this.V == null) {
      bool = false;
    }
    return bool;
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    setContentView(2130903547);
    this.R = ((DzhHeader)findViewById(2131558643));
    this.R.a(this, this);
    this.D = ((ViewPager)findViewById(2131561141));
    this.E = getLayoutInflater().inflate(2130903543, null);
    this.F = getLayoutInflater().inflate(2130903545, null);
    this.G = getLayoutInflater().inflate(2130903544, null);
    this.O.add(this.E);
    this.O.add(this.F);
    this.O.add(this.G);
    this.L = ((DropDownEditTextView)this.E.findViewById(2131561098));
    this.L.setEditable(false);
    this.L.a();
    this.af = ((EditText)this.E.findViewById(2131561100));
    this.ah = ((EditText)this.E.findViewById(2131561103));
    this.ai = ((EditText)this.E.findViewById(2131561106));
    this.aj = ((EditText)this.E.findViewById(2131561111));
    this.ak = ((EditText)this.E.findViewById(2131561114));
    this.aE = ((TextView)this.E.findViewById(2131561107));
    this.aF = ((TextView)this.E.findViewById(2131561116));
    this.aH = ((TextView)this.E.findViewById(2131561115));
    this.M = ((DropDownEditTextView)this.F.findViewById(2131561123));
    this.M.setEditable(false);
    this.M.a();
    this.K = ((TextView)this.F.findViewById(2131561127));
    this.ag = ((EditText)this.F.findViewById(2131561125));
    this.al = ((EditText)this.F.findViewById(2131561132));
    this.am = ((EditText)this.F.findViewById(2131561129));
    this.K = ((TextView)this.F.findViewById(2131561127));
    this.aG = ((TextView)this.F.findViewById(2131561133));
    this.aI = ((LinearLayout)this.G.findViewById(2131558774));
    this.aJ = ((RelativeLayout)this.G.findViewById(2131561120));
    this.aK = ((LinearLayout)this.G.findViewById(2131558775));
    this.aL = ((LinearLayout)this.G.findViewById(2131558776));
    this.aM = ((TextView)this.G.findViewById(2131558687));
    this.aN = ((TextView)this.G.findViewById(2131558688));
    this.aO = ((Button)this.G.findViewById(2131558777));
    this.N = ((DropDownEditTextView)this.G.findViewById(2131561119));
    this.N.setEditable(false);
    this.N.a();
    if (a.equals("1"))
    {
      this.aJ.setVisibility(0);
      Object localObject = new hm(this);
      this.L.setOnItemChangeListener((bo)localObject);
      this.M.setOnItemChangeListener((bo)localObject);
      this.N.setOnItemChangeListener((bo)localObject);
      localObject = new hn(this);
      this.L.setOnPopShowListener((bq)localObject);
      this.M.setOnPopShowListener((bq)localObject);
      this.an = ((TableLayoutGroup)this.G.findViewById(2131561121));
      if (o.m()) {
        this.aI.setVisibility(8);
      }
      if (o.i())
      {
        this.at = this.ar;
        this.au = this.as;
      }
      this.an.setHeaderColumn(this.at);
      this.an.setPullDownLoading(false);
      this.an.setColumnClickable(null);
      this.an.setContinuousLoading(false);
      this.an.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.an.setHeaderFontSize(getResources().getDimension(2131230901));
      this.an.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.an.setDrawHeaderSeparateLine(false);
      this.an.setHeaderTextColor(getResources().getColor(2131493099));
      this.an.setHeaderFontSize(getResources().getDimension(2131230899));
      this.an.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.an.setLeftPadding(25);
      this.an.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.an.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.an.setStockNameColor(getResources().getColor(2131493235));
      this.an.setOnLoadingListener(new hc(this));
      this.an.setOnTableLayoutClickListener(new he(this));
      this.H = ((Button)this.E.findViewById(2131561108));
      this.I = ((Button)this.F.findViewById(2131561134));
      this.J = ((Button)this.E.findViewById(2131561117));
      this.H.setOnClickListener(this);
      this.I.setOnClickListener(this);
      this.J.setOnClickListener(this);
      this.A = ((TextView)findViewById(2131561137));
      this.B = ((TextView)findViewById(2131561138));
      this.C = ((TextView)findViewById(2131561139));
      this.A.setOnClickListener(this);
      this.B.setOnClickListener(this);
      this.C.setOnClickListener(this);
      this.aO.setOnClickListener(this);
      this.aK.setOnClickListener(this);
      this.aL.setOnClickListener(this);
      q();
      this.U = new ho(this);
      this.D.setOnPageChangeListener(new hf(this));
      a(0);
      if (!o.l()) {
        break label1188;
      }
      d();
    }
    for (;;)
    {
      this.D.setAdapter(this.U);
      super.setTitle("银证转账");
      return;
      this.aJ.setVisibility(8);
      break;
      label1188:
      if (o.m()) {
        f();
      } else {
        c();
      }
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      this.A.setSelected(true);
      this.B.setSelected(false);
      this.C.setSelected(false);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        this.B.setSelected(true);
        this.A.setSelected(false);
        this.C.setSelected(false);
        return;
      }
    } while (paramInt != 2);
    this.C.setSelected(true);
    this.B.setSelected(false);
    this.A.setSelected(false);
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.V == null) {
      c();
    }
    while (!o.r()) {
      return;
    }
    int k;
    Object localObject;
    if (this.ae == 0)
    {
      k = this.Q[this.L.getSelectedItemPosition()];
      localObject = this.bb[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      localObject = o.g("11124").a("1186", (String)localObject).a("1206", this.aA).a("1277", this.az).a("1028", k);
      if (a.equals("1")) {
        ((h)localObject).a("1022", this.aS).a("1023", this.aW);
      }
      for (;;)
      {
        this.aB = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((h)localObject).h()) });
        registRequestListener(this.aB);
        a(this.aB, paramBoolean);
        return;
        if (this.ae == 1)
        {
          k = this.Q[this.M.getSelectedItemPosition()];
          localObject = this.bb[this.M.getSelectedItemPosition()];
          break;
        }
        if (this.ae != 2) {
          break label266;
        }
        k = this.Q[this.N.getSelectedItemPosition()];
        localObject = this.bb[this.N.getSelectedItemPosition()];
        break;
        ((h)localObject).a("1022", o.y()).a("1023", o.y());
      }
      label266:
      localObject = "";
      k = 0;
    }
  }
  
  public void b()
  {
    if (this.c == 0) {
      return;
    }
    String[] arrayOfString = this.ay.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.at[k]).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.V == null) {
      d();
    }
    while (!o.r()) {
      return;
    }
    this.aw = this.Q[0];
    this.ax = this.bb[0];
    this.g = new e();
    this.g.c("https://uatopen.hs.net/secu/v1/banktransfer_qry");
    this.g.b("UTF-8");
    this.g.a("Bearer " + o.d);
    this.g.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.g.a("sendercomp_id", "90013");
    this.g.a("bank_no", "");
    this.g.a("position_str", this.n);
    this.g.a("request_num", String.valueOf(this.az));
    registRequestListener(this.g);
    a(this.g, paramBoolean);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.X = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11130").h()) });
    registRequestListener(this.X);
    a(this.X, true);
  }
  
  public void c(boolean paramBoolean)
  {
    if (this.V == null) {
      f();
    }
    while (!o.r()) {
      return;
    }
    Object localObject = "";
    if (this.ae == 0) {
      localObject = this.bb[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
      localJinZhengRequestData.setType("JinzhengZZCX_600230");
      localJinZhengRequestData.setService_id("600230");
      localJinZhengRequestData.setCompany_id(o.q);
      localJinZhengRequestData.setUser_id(o.p);
      localJinZhengRequestData.setUser_id_cls("2");
      localJinZhengRequestData.setSession(o.g);
      localJinZhengRequestData.setCurrency("0");
      localJinZhengRequestData.setExt_inst((String)localObject);
      localJinZhengRequestData.setExt_serial_no("");
      localObject = localJinZhengRequestData.jinzhengJson();
      System.out.println("requestData = " + (String)localObject);
      this.r = new t();
      this.r.c(f.Q);
      this.r.c("Content-Type", "application/json");
      try
      {
        localObject = new StringEntity((String)localObject, "UTF-8");
        this.r.a((HttpEntity)localObject);
        registRequestListener(this.r);
        a(this.r, paramBoolean);
        return;
        if (this.ae == 1)
        {
          localObject = this.bb[this.M.getSelectedItemPosition()];
          continue;
        }
        if (this.ae != 2) {
          continue;
        }
        localObject = this.bb[this.N.getSelectedItemPosition()];
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (hd.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.R == null);
      this.R.a(paramy);
      return;
    } while (this.R == null);
    this.R.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131166384);
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void d()
  {
    if (!o.r()) {
      return;
    }
    this.j = new e();
    this.j.c("https://uatopen.hs.net/secu/v1/bankaccout_qry");
    this.j.b("UTF-8");
    this.j.a("Bearer " + o.d);
    this.j.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.j.a("sendercomp_id", "90013");
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  public void d(int paramInt)
  {
    Dialog localDialog = new Dialog(this);
    View localView = LayoutInflater.from(this).inflate(2130903541, null);
    localDialog.requestWindowFeature(1);
    localDialog.getWindow().setContentView(localView);
    localDialog.setTitle("提示信息");
    TextView localTextView1 = (TextView)localView.findViewById(2131561079);
    TextView localTextView2 = (TextView)localView.findViewById(2131561080);
    Object localObject3 = (TextView)localView.findViewById(2131561081);
    String str1;
    Object localObject2;
    Object localObject1;
    if (paramInt == 0)
    {
      str1 = this.ah.getText().toString();
      localObject2 = this.ai.getText().toString();
      localObject3 = "转账金额：" + this.af.getText().toString();
      localObject1 = this.L.getCurrentItem().toString();
    }
    for (;;)
    {
      if ((paramInt == 0) && (this.af.getText().toString().length() == 0))
      {
        d("   请输入转账金额");
        return;
        if (paramInt == 1)
        {
          str1 = this.am.getText().toString();
          localObject2 = this.al.getText().toString();
          localObject3 = "转账金额：" + this.ag.getText().toString();
          localObject1 = this.M.getCurrentItem().toString();
          continue;
        }
        if (paramInt == 2)
        {
          localObject2 = this.L.getCurrentItem().toString();
          str1 = this.aj.getText().toString();
          String str2 = this.ak.getText().toString();
          if (this.Q != null) {}
          for (localObject1 = "币种类型：" + this.P[this.Q[this.L.getSelectedItemPosition()]];; localObject1 = "币种类型：--")
          {
            ((TextView)localObject3).setText("是否确认查询？");
            localObject3 = localObject1;
            localObject1 = localObject2;
            localObject2 = str2;
            break;
          }
        }
      }
      else
      {
        if ((paramInt == 1) && (this.ag.getText().toString().length() == 0))
        {
          d("   请输入转账金额");
          return;
        }
        if ((paramInt == 0) && (((this.ah.isEnabled()) && (str1.equals(""))) || ((this.ai.isEnabled()) && (((String)localObject2).equals("")))))
        {
          b(10);
          return;
        }
        if ((paramInt == 1) && (((this.al.isEnabled()) && (((String)localObject2).equals(""))) || ((this.am.isEnabled()) && (str1.equals("")))))
        {
          b(10);
          return;
        }
        if ((paramInt == 2) && (((this.aj.isEnabled()) && (str1.equals(""))) || ((this.ak.isEnabled()) && (((String)localObject2).equals("")))))
        {
          b(10);
          return;
        }
        localTextView2.setText((CharSequence)localObject3);
        localTextView1.setText("银行名称：" + (String)localObject1);
        localObject1 = (Button)localView.findViewById(2131561082);
        localObject2 = (Button)localView.findViewById(2131561083);
        ((Button)localObject1).setOnClickListener(new hi(this, localDialog));
        ((Button)localObject2).setOnClickListener(new hj(this, paramInt, localDialog));
        localDialog.show();
        return;
      }
      localObject1 = "";
      localObject2 = "";
      str1 = "";
      localObject3 = "";
    }
  }
  
  public void d(String paramString)
  {
    paramString = Toast.makeText(this, paramString, 0);
    paramString.setGravity(17, 0, 0);
    paramString.show();
  }
  
  public void f()
  {
    if (!o.r()) {
      return;
    }
    Object localObject = new JinZhengRequestData();
    ((JinZhengRequestData)localObject).setType("JinzhengYHXX_600360");
    ((JinZhengRequestData)localObject).setService_id("600360");
    ((JinZhengRequestData)localObject).setCompany_id(o.q);
    ((JinZhengRequestData)localObject).setUser_id(o.p);
    ((JinZhengRequestData)localObject).setUser_id_cls("2");
    ((JinZhengRequestData)localObject).setSession(o.g);
    localObject = ((JinZhengRequestData)localObject).jinzhengJson();
    System.out.println("requestData = " + (String)localObject);
    this.o = new t();
    this.o.c(f.Q);
    this.o.c("Content-Type", "application/json");
    try
    {
      localObject = new StringEntity((String)localObject, "UTF-8");
      this.o.a((HttpEntity)localObject);
      registRequestListener(this.o);
      a(this.o, true);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void g()
  {
    if (!o.r()) {
      return;
    }
    this.aC = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "" + this.aD).a("1234", "1").h()) });
    registRequestListener(this.aC);
    a(this.aC, true);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.R = paramDzhHeader;
  }
  
  public void h()
  {
    if (!o.r()) {
      return;
    }
    this.f = new e();
    this.f.c("https://uatopen.hs.net/secu/v1/balancefast_qry");
    this.f.b("UTF-8");
    this.f.a("Bearer " + o.d);
    this.f.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.f.a("sendercomp_id", "90013");
    this.f.a("money_type", "");
    registRequestListener(this.f);
    a(this.f, true);
  }
  
  /* Error */
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial 1224	com/android/dazhihui/ui/delegate/screen/DelegateBaseActivity:handleResponse	(Lcom/android/dazhihui/a/b/h;Lcom/android/dazhihui/a/b/j;)V
    //   6: invokestatic 447	com/android/dazhihui/ui/delegate/b/o:l	()Z
    //   9: ifeq +1498 -> 1507
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 1106	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:j	Lcom/android/dazhihui/a/b/e;
    //   17: if_acmpne +346 -> 363
    //   20: new 153	java/lang/String
    //   23: dup
    //   24: aload_2
    //   25: checkcast 1226	com/android/dazhihui/a/b/g
    //   28: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   31: invokespecial 1229	java/lang/String:<init>	([B)V
    //   34: astore_3
    //   35: new 1231	org/json/JSONObject
    //   38: dup
    //   39: aload_3
    //   40: invokespecial 1233	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   43: ldc_w 1235
    //   46: invokevirtual 1239	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   49: astore 4
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield 145	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:m	Z
    //   56: aload_0
    //   57: aload 4
    //   59: invokevirtual 1242	org/json/JSONArray:length	()I
    //   62: putfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   65: aload_0
    //   66: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   69: ifle +373 -> 442
    //   72: aload_0
    //   73: new 289	java/util/ArrayList
    //   76: dup
    //   77: invokespecial 290	java/util/ArrayList:<init>	()V
    //   80: putfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   83: aload_0
    //   84: aload_0
    //   85: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   88: newarray <illegal type>
    //   90: putfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   98: anewarray 153	java/lang/String
    //   101: putfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   104: iconst_0
    //   105: istore 11
    //   107: iload 11
    //   109: aload 4
    //   111: invokevirtual 1242	org/json/JSONArray:length	()I
    //   114: if_icmpge +210 -> 324
    //   117: aload 4
    //   119: iload 11
    //   121: invokevirtual 1248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   124: checkcast 1231	org/json/JSONObject
    //   127: astore 5
    //   129: aload 5
    //   131: ldc_w 1250
    //   134: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   137: astore 6
    //   139: aload_0
    //   140: getfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   143: iload 11
    //   145: aload 5
    //   147: ldc_w 976
    //   150: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   153: aastore
    //   154: aload_0
    //   155: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   158: iload 11
    //   160: aload 5
    //   162: ldc_w 1216
    //   165: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   168: invokestatic 550	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   171: iastore
    //   172: aload_0
    //   173: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   176: iload 11
    //   178: iaload
    //   179: iflt +18 -> 197
    //   182: aload_0
    //   183: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   186: iload 11
    //   188: iaload
    //   189: aload_0
    //   190: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   193: arraylength
    //   194: if_icmplt +20 -> 214
    //   197: aload_0
    //   198: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   201: iload 11
    //   203: iconst_0
    //   204: iastore
    //   205: ldc_w 1255
    //   208: ldc_w 1257
    //   211: invokestatic 1261	com/android/dazhihui/d/n:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: aload_0
    //   215: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   218: new 552	java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   225: aload 6
    //   227: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: ldc_w 1263
    //   233: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: aload_0
    //   237: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   240: aload_0
    //   241: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   244: iload 11
    //   246: iaload
    //   247: aaload
    //   248: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: ldc_w 1265
    //   254: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: invokevirtual 641	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   263: pop
    //   264: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   267: new 552	java/lang/StringBuilder
    //   270: dup
    //   271: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   274: ldc_w 1267
    //   277: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: iload 11
    //   282: invokevirtual 557	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   285: ldc_w 1269
    //   288: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload_0
    //   292: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   295: iload 11
    //   297: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   300: checkcast 153	java/lang/String
    //   303: invokevirtual 1150	java/lang/String:toString	()Ljava/lang/String;
    //   306: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   312: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   315: iload 11
    //   317: iconst_1
    //   318: iadd
    //   319: istore 11
    //   321: goto -214 -> 107
    //   324: aload_0
    //   325: getfield 518	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:L	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   328: aload_0
    //   329: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   332: iconst_0
    //   333: iconst_1
    //   334: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   337: aload_0
    //   338: getfield 522	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:M	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   341: aload_0
    //   342: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   345: iconst_0
    //   346: iconst_1
    //   347: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   350: aload_0
    //   351: getfield 526	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:N	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   354: aload_0
    //   355: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   358: iconst_0
    //   359: iconst_1
    //   360: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   363: aload_1
    //   364: aload_0
    //   365: getfield 939	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:g	Lcom/android/dazhihui/a/b/e;
    //   368: if_acmpne +441 -> 809
    //   371: new 153	java/lang/String
    //   374: dup
    //   375: aload_2
    //   376: checkcast 1226	com/android/dazhihui/a/b/g
    //   379: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   382: invokespecial 1229	java/lang/String:<init>	([B)V
    //   385: astore_3
    //   386: new 1231	org/json/JSONObject
    //   389: dup
    //   390: aload_3
    //   391: invokespecial 1233	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   394: ldc_w 1235
    //   397: invokevirtual 1239	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   400: astore_3
    //   401: aload_0
    //   402: aload_3
    //   403: invokevirtual 1242	org/json/JSONArray:length	()I
    //   406: putfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   409: aload_0
    //   410: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   413: ifne +139 -> 552
    //   416: aload_0
    //   417: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   420: invokevirtual 1277	com/android/dazhihui/ui/widget/TableLayoutGroup:getDataModel	()Ljava/util/List;
    //   423: invokeinterface 1282 1 0
    //   428: ifne +124 -> 552
    //   431: aload_0
    //   432: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   435: ldc_w 1283
    //   438: invokevirtual 1286	com/android/dazhihui/ui/widget/TableLayoutGroup:setBackgroundResource	(I)V
    //   441: return
    //   442: aload_0
    //   443: getfield 518	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:L	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   446: ldc -109
    //   448: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   451: aload_0
    //   452: getfield 522	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:M	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   455: ldc -109
    //   457: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   460: aload_0
    //   461: getfield 526	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:N	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   464: ldc -109
    //   466: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   469: goto -106 -> 363
    //   472: astore 4
    //   474: aload_0
    //   475: new 1290	org/json/JSONTokener
    //   478: dup
    //   479: aload_3
    //   480: invokespecial 1291	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   483: invokevirtual 1294	org/json/JSONTokener:nextValue	()Ljava/lang/Object;
    //   486: checkcast 1231	org/json/JSONObject
    //   489: ldc_w 1296
    //   492: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   495: invokevirtual 1297	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:a	(Ljava/lang/String;)V
    //   498: aload 4
    //   500: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   503: goto -140 -> 363
    //   506: astore_3
    //   507: new 1300	android/app/AlertDialog$Builder
    //   510: dup
    //   511: aload_0
    //   512: invokespecial 1301	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   515: ldc_w 1302
    //   518: invokevirtual 1306	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   521: ldc_w 1308
    //   524: invokevirtual 1311	android/app/AlertDialog$Builder:setTitle	(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //   527: ldc_w 1312
    //   530: new 1314	com/android/dazhihui/ui/delegate/screen/hk
    //   533: dup
    //   534: aload_0
    //   535: invokespecial 1315	com/android/dazhihui/ui/delegate/screen/hk:<init>	(Lcom/android/dazhihui/ui/delegate/screen/TransferMenuNew;)V
    //   538: invokevirtual 1319	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   541: invokevirtual 1322	android/app/AlertDialog$Builder:show	()Landroid/app/AlertDialog;
    //   544: pop
    //   545: aload_3
    //   546: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   549: goto -51 -> 498
    //   552: aload_0
    //   553: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   556: aload_0
    //   557: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   560: ldc_w 733
    //   563: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   566: invokevirtual 1325	com/android/dazhihui/ui/widget/TableLayoutGroup:setBackgroundColor	(I)V
    //   569: aload_0
    //   570: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   573: ifle +236 -> 809
    //   576: new 289	java/util/ArrayList
    //   579: dup
    //   580: invokespecial 290	java/util/ArrayList:<init>	()V
    //   583: astore 4
    //   585: iconst_0
    //   586: istore 11
    //   588: iload 11
    //   590: aload_0
    //   591: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   594: if_icmpge +408 -> 1002
    //   597: aload_3
    //   598: iload 11
    //   600: invokevirtual 1248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   603: checkcast 1231	org/json/JSONObject
    //   606: astore 5
    //   608: new 906	com/android/dazhihui/ui/widget/mh
    //   611: dup
    //   612: invokespecial 1326	com/android/dazhihui/ui/widget/mh:<init>	()V
    //   615: astore 6
    //   617: aload_0
    //   618: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   621: arraylength
    //   622: anewarray 153	java/lang/String
    //   625: astore 7
    //   627: aload_0
    //   628: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   631: arraylength
    //   632: newarray <illegal type>
    //   634: astore 8
    //   636: iconst_0
    //   637: istore 12
    //   639: aload_0
    //   640: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   643: arraylength
    //   644: istore 13
    //   646: iload 12
    //   648: iload 13
    //   650: if_icmpge +307 -> 957
    //   653: aload 7
    //   655: iload 12
    //   657: aload 5
    //   659: aload_0
    //   660: getfield 370	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:av	[Ljava/lang/String;
    //   663: iload 12
    //   665: aaload
    //   666: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   669: invokevirtual 1329	java/lang/String:trim	()Ljava/lang/String;
    //   672: aastore
    //   673: aload 7
    //   675: iload 12
    //   677: aaload
    //   678: ifnull +16 -> 694
    //   681: aload 7
    //   683: iload 12
    //   685: aaload
    //   686: ldc -109
    //   688: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   691: ifeq +11 -> 702
    //   694: aload 7
    //   696: iload 12
    //   698: ldc_w 1331
    //   701: aastore
    //   702: aload 7
    //   704: iload 12
    //   706: aaload
    //   707: ldc_w 1331
    //   710: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   713: ifne +54 -> 767
    //   716: aload_0
    //   717: getfield 370	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:av	[Ljava/lang/String;
    //   720: iload 12
    //   722: aaload
    //   723: ldc_w 368
    //   726: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   729: ifeq +38 -> 767
    //   732: aload 7
    //   734: iload 12
    //   736: aload 5
    //   738: ldc_w 368
    //   741: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   744: invokevirtual 1329	java/lang/String:trim	()Ljava/lang/String;
    //   747: invokestatic 1335	com/android/dazhihui/ui/delegate/screen/xc/trade/TradeQuery:d	(Ljava/lang/String;)Ljava/lang/String;
    //   750: aastore
    //   751: aload 7
    //   753: iload 12
    //   755: aaload
    //   756: ifnonnull +11 -> 767
    //   759: aload 7
    //   761: iload 12
    //   763: ldc_w 1331
    //   766: aastore
    //   767: aload 8
    //   769: iload 12
    //   771: aload_0
    //   772: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   775: ldc_w 783
    //   778: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   781: iastore
    //   782: iload 12
    //   784: iconst_1
    //   785: iadd
    //   786: istore 12
    //   788: goto -149 -> 639
    //   791: astore 9
    //   793: aload 7
    //   795: iload 12
    //   797: ldc_w 1331
    //   800: aastore
    //   801: goto -99 -> 702
    //   804: astore_3
    //   805: aload_3
    //   806: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   809: aload_1
    //   810: aload_0
    //   811: getfield 1337	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:i	Lcom/android/dazhihui/a/b/e;
    //   814: if_acmpne +305 -> 1119
    //   817: new 153	java/lang/String
    //   820: dup
    //   821: aload_2
    //   822: checkcast 1226	com/android/dazhihui/a/b/g
    //   825: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   828: invokespecial 1229	java/lang/String:<init>	([B)V
    //   831: astore_3
    //   832: new 1231	org/json/JSONObject
    //   835: dup
    //   836: aload_3
    //   837: invokespecial 1233	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   840: ldc_w 1235
    //   843: invokevirtual 1239	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   846: astore 4
    //   848: iconst_0
    //   849: istore 11
    //   851: iload 11
    //   853: aload 4
    //   855: invokevirtual 1242	org/json/JSONArray:length	()I
    //   858: if_icmpge +261 -> 1119
    //   861: aload 4
    //   863: iload 11
    //   865: invokevirtual 1248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   868: checkcast 1231	org/json/JSONObject
    //   871: ldc_w 366
    //   874: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   877: astore 5
    //   879: aload 5
    //   881: ifnull +58 -> 939
    //   884: aload 5
    //   886: ldc -109
    //   888: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   891: ifne +48 -> 939
    //   894: aload_0
    //   895: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   898: iconst_0
    //   899: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   902: aload_0
    //   903: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   906: new 552	java/lang/StringBuilder
    //   909: dup
    //   910: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   913: ldc_w 1340
    //   916: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   919: aload 5
    //   921: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   927: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   930: aload_0
    //   931: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   934: bipush 8
    //   936: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   939: aload_0
    //   940: getfield 480	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aj	Landroid/widget/EditText;
    //   943: ldc -109
    //   945: invokevirtual 464	android/widget/EditText:setText	(Ljava/lang/CharSequence;)V
    //   948: iload 11
    //   950: iconst_1
    //   951: iadd
    //   952: istore 11
    //   954: goto -103 -> 851
    //   957: aload 6
    //   959: aload 7
    //   961: putfield 908	com/android/dazhihui/ui/widget/mh:a	[Ljava/lang/String;
    //   964: aload 6
    //   966: aload 8
    //   968: putfield 1342	com/android/dazhihui/ui/widget/mh:b	[I
    //   971: aload 4
    //   973: aload 6
    //   975: invokeinterface 1343 2 0
    //   980: pop
    //   981: aload_0
    //   982: aload 5
    //   984: ldc_w 978
    //   987: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   990: putfield 149	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:n	Ljava/lang/String;
    //   993: iload 11
    //   995: iconst_1
    //   996: iadd
    //   997: istore 11
    //   999: goto -411 -> 588
    //   1002: aload_0
    //   1003: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   1006: aload 4
    //   1008: aload_0
    //   1009: getfield 394	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aA	I
    //   1012: invokevirtual 1346	com/android/dazhihui/ui/widget/TableLayoutGroup:a	(Ljava/util/List;I)V
    //   1015: aload_0
    //   1016: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   1019: aload_0
    //   1020: getfield 392	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:az	I
    //   1023: if_icmpge +22 -> 1045
    //   1026: aload_0
    //   1027: aload_0
    //   1028: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   1031: invokevirtual 1277	com/android/dazhihui/ui/widget/TableLayoutGroup:getDataModel	()Ljava/util/List;
    //   1034: invokeinterface 1282 1 0
    //   1039: putfield 378	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:e	I
    //   1042: goto -233 -> 809
    //   1045: aload_0
    //   1046: aload_0
    //   1047: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   1050: invokevirtual 1277	com/android/dazhihui/ui/widget/TableLayoutGroup:getDataModel	()Ljava/util/List;
    //   1053: invokeinterface 1282 1 0
    //   1058: iconst_1
    //   1059: iadd
    //   1060: putfield 378	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:e	I
    //   1063: goto -254 -> 809
    //   1066: astore 4
    //   1068: new 1290	org/json/JSONTokener
    //   1071: dup
    //   1072: aload_3
    //   1073: invokespecial 1291	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   1076: invokevirtual 1294	org/json/JSONTokener:nextValue	()Ljava/lang/Object;
    //   1079: checkcast 1231	org/json/JSONObject
    //   1082: ldc_w 1296
    //   1085: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1088: astore_3
    //   1089: aload_0
    //   1090: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   1093: aload_3
    //   1094: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1097: aload_0
    //   1098: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   1101: iconst_0
    //   1102: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1105: aload_0
    //   1106: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   1109: bipush 8
    //   1111: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1114: aload 4
    //   1116: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   1119: aload_1
    //   1120: aload_0
    //   1121: getfield 1212	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:f	Lcom/android/dazhihui/a/b/e;
    //   1124: if_acmpne +151 -> 1275
    //   1127: new 153	java/lang/String
    //   1130: dup
    //   1131: aload_2
    //   1132: checkcast 1226	com/android/dazhihui/a/b/g
    //   1135: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   1138: invokespecial 1229	java/lang/String:<init>	([B)V
    //   1141: astore_3
    //   1142: new 1231	org/json/JSONObject
    //   1145: dup
    //   1146: aload_3
    //   1147: invokespecial 1233	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   1150: ldc_w 1235
    //   1153: invokevirtual 1239	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   1156: astore_3
    //   1157: aload_0
    //   1158: aload_3
    //   1159: invokevirtual 1242	org/json/JSONArray:length	()I
    //   1162: putfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   1165: aload_0
    //   1166: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   1169: ifle +96 -> 1265
    //   1172: iconst_0
    //   1173: istore 11
    //   1175: iload 11
    //   1177: aload_3
    //   1178: invokevirtual 1242	org/json/JSONArray:length	()I
    //   1181: if_icmpge +94 -> 1275
    //   1184: aload_3
    //   1185: iload 11
    //   1187: invokevirtual 1248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   1190: checkcast 1231	org/json/JSONObject
    //   1193: ldc_w 1348
    //   1196: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1199: astore 4
    //   1201: aload_0
    //   1202: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   1205: aload 4
    //   1207: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1210: iload 11
    //   1212: iconst_1
    //   1213: iadd
    //   1214: istore 11
    //   1216: goto -41 -> 1175
    //   1219: astore_3
    //   1220: new 1300	android/app/AlertDialog$Builder
    //   1223: dup
    //   1224: aload_0
    //   1225: invokespecial 1301	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   1228: ldc_w 1302
    //   1231: invokevirtual 1306	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   1234: ldc_w 1308
    //   1237: invokevirtual 1311	android/app/AlertDialog$Builder:setTitle	(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //   1240: ldc_w 1312
    //   1243: new 1350	com/android/dazhihui/ui/delegate/screen/hl
    //   1246: dup
    //   1247: aload_0
    //   1248: invokespecial 1351	com/android/dazhihui/ui/delegate/screen/hl:<init>	(Lcom/android/dazhihui/ui/delegate/screen/TransferMenuNew;)V
    //   1251: invokevirtual 1319	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   1254: invokevirtual 1322	android/app/AlertDialog$Builder:show	()Landroid/app/AlertDialog;
    //   1257: pop
    //   1258: aload_3
    //   1259: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   1262: goto -148 -> 1114
    //   1265: aload_0
    //   1266: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   1269: ldc_w 1331
    //   1272: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1275: aload_1
    //   1276: aload_0
    //   1277: getfield 1353	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:h	Lcom/android/dazhihui/a/b/e;
    //   1280: if_acmpne -839 -> 441
    //   1283: new 153	java/lang/String
    //   1286: dup
    //   1287: aload_2
    //   1288: checkcast 1226	com/android/dazhihui/a/b/g
    //   1291: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   1294: invokespecial 1229	java/lang/String:<init>	([B)V
    //   1297: astore_1
    //   1298: new 1231	org/json/JSONObject
    //   1301: dup
    //   1302: aload_1
    //   1303: invokespecial 1233	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   1306: ldc_w 1235
    //   1309: invokevirtual 1239	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   1312: astore_2
    //   1313: iconst_0
    //   1314: istore 11
    //   1316: iload 11
    //   1318: aload_2
    //   1319: invokevirtual 1242	org/json/JSONArray:length	()I
    //   1322: if_icmpge -881 -> 441
    //   1325: aload_2
    //   1326: iload 11
    //   1328: invokevirtual 1248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   1331: checkcast 1231	org/json/JSONObject
    //   1334: astore_3
    //   1335: aload_0
    //   1336: new 552	java/lang/StringBuilder
    //   1339: dup
    //   1340: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   1343: ldc_w 1355
    //   1346: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1349: aload_3
    //   1350: ldc_w 1357
    //   1353: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1356: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1359: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1362: invokevirtual 1358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:b	(Ljava/lang/String;)V
    //   1365: aload_0
    //   1366: invokespecial 431	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:r	()V
    //   1369: aload_0
    //   1370: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   1373: iconst_1
    //   1374: if_icmpne +29 -> 1403
    //   1377: aload_0
    //   1378: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   1381: bipush 8
    //   1383: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1386: iload 11
    //   1388: iconst_1
    //   1389: iadd
    //   1390: istore 11
    //   1392: goto -76 -> 1316
    //   1395: astore_3
    //   1396: aload_3
    //   1397: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   1400: goto -125 -> 1275
    //   1403: aload_0
    //   1404: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   1407: ifne -21 -> 1386
    //   1410: aload_0
    //   1411: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   1414: bipush 8
    //   1416: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1419: goto -33 -> 1386
    //   1422: astore_2
    //   1423: new 1290	org/json/JSONTokener
    //   1426: dup
    //   1427: aload_1
    //   1428: invokespecial 1291	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   1431: invokevirtual 1294	org/json/JSONTokener:nextValue	()Ljava/lang/Object;
    //   1434: checkcast 1231	org/json/JSONObject
    //   1437: ldc_w 1296
    //   1440: invokevirtual 1253	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1443: astore_1
    //   1444: aload_0
    //   1445: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   1448: ifne +24 -> 1472
    //   1451: aload_0
    //   1452: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   1455: aload_1
    //   1456: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1459: aload_0
    //   1460: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   1463: iconst_0
    //   1464: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1467: aload_2
    //   1468: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   1471: return
    //   1472: aload_0
    //   1473: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   1476: iconst_1
    //   1477: if_icmpne -10 -> 1467
    //   1480: aload_0
    //   1481: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   1484: aload_1
    //   1485: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1488: aload_0
    //   1489: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   1492: iconst_0
    //   1493: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1496: goto -29 -> 1467
    //   1499: astore_1
    //   1500: aload_1
    //   1501: invokevirtual 1298	org/json/JSONException:printStackTrace	()V
    //   1504: goto -37 -> 1467
    //   1507: invokestatic 449	com/android/dazhihui/ui/delegate/b/o:m	()Z
    //   1510: ifeq +2044 -> 3554
    //   1513: aload_1
    //   1514: aload_0
    //   1515: getfield 1360	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:p	Lcom/android/dazhihui/a/b/t;
    //   1518: if_acmpne +189 -> 1707
    //   1521: new 153	java/lang/String
    //   1524: dup
    //   1525: aload_2
    //   1526: checkcast 1226	com/android/dazhihui/a/b/g
    //   1529: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   1532: invokespecial 1229	java/lang/String:<init>	([B)V
    //   1535: astore_3
    //   1536: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   1539: new 552	java/lang/StringBuilder
    //   1542: dup
    //   1543: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   1546: ldc_w 1362
    //   1549: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1552: aload_3
    //   1553: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1556: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1559: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   1562: new 1364	com/c/a/k
    //   1565: dup
    //   1566: invokespecial 1365	com/c/a/k:<init>	()V
    //   1569: aload_3
    //   1570: ldc_w 1367
    //   1573: invokevirtual 1370	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   1576: checkcast 1367	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse
    //   1579: astore_3
    //   1580: aload_3
    //   1581: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1584: iconst_0
    //   1585: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1588: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1591: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   1594: getfield 1384	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_CODE	Ljava/lang/String;
    //   1597: astore 4
    //   1599: aload_3
    //   1600: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1603: iconst_0
    //   1604: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1607: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1610: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   1613: getfield 1387	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_TEXT	Ljava/lang/String;
    //   1616: astore 5
    //   1618: aload 4
    //   1620: ldc_w 511
    //   1623: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1626: ifeq +228 -> 1854
    //   1629: aload_3
    //   1630: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1633: iconst_0
    //   1634: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1637: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1640: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   1643: iconst_0
    //   1644: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1647: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   1650: getfield 1395	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:BALANCE	Ljava/lang/String;
    //   1653: astore_3
    //   1654: aload_0
    //   1655: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   1658: iconst_0
    //   1659: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1662: aload_0
    //   1663: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   1666: new 552	java/lang/StringBuilder
    //   1669: dup
    //   1670: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   1673: ldc_w 1340
    //   1676: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1679: aload_3
    //   1680: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1683: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1686: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1689: aload_0
    //   1690: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   1693: bipush 8
    //   1695: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1698: aload_0
    //   1699: getfield 480	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aj	Landroid/widget/EditText;
    //   1702: ldc -109
    //   1704: invokevirtual 464	android/widget/EditText:setText	(Ljava/lang/CharSequence;)V
    //   1707: aload_1
    //   1708: aload_0
    //   1709: getfield 1051	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:r	Lcom/android/dazhihui/a/b/t;
    //   1712: if_acmpne +725 -> 2437
    //   1715: new 153	java/lang/String
    //   1718: dup
    //   1719: aload_2
    //   1720: checkcast 1226	com/android/dazhihui/a/b/g
    //   1723: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   1726: invokespecial 1229	java/lang/String:<init>	([B)V
    //   1729: astore 4
    //   1731: new 1364	com/c/a/k
    //   1734: dup
    //   1735: invokespecial 1365	com/c/a/k:<init>	()V
    //   1738: aload 4
    //   1740: ldc_w 1367
    //   1743: invokevirtual 1370	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   1746: checkcast 1367	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse
    //   1749: astore_3
    //   1750: aload_3
    //   1751: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1754: iconst_0
    //   1755: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1758: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1761: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   1764: getfield 1384	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_CODE	Ljava/lang/String;
    //   1767: astore 5
    //   1769: aload_3
    //   1770: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1773: iconst_0
    //   1774: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1777: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1780: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   1783: getfield 1387	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_TEXT	Ljava/lang/String;
    //   1786: astore 6
    //   1788: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   1791: new 552	java/lang/StringBuilder
    //   1794: dup
    //   1795: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   1798: ldc_w 1397
    //   1801: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1804: aload 4
    //   1806: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1809: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1812: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   1815: aload 5
    //   1817: ldc_w 511
    //   1820: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1823: ifne +60 -> 1883
    //   1826: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   1829: new 552	java/lang/StringBuilder
    //   1832: dup
    //   1833: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   1836: ldc_w 1399
    //   1839: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1842: aload 6
    //   1844: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1847: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1850: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   1853: return
    //   1854: aload_0
    //   1855: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   1858: aload 5
    //   1860: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1863: aload_0
    //   1864: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   1867: iconst_0
    //   1868: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1871: aload_0
    //   1872: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   1875: bipush 8
    //   1877: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   1880: goto -173 -> 1707
    //   1883: aload_3
    //   1884: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1887: iconst_0
    //   1888: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1891: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1894: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   1897: ifnonnull +41 -> 1938
    //   1900: aload_0
    //   1901: iconst_0
    //   1902: putfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   1905: aload_0
    //   1906: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   1909: ifne +53 -> 1962
    //   1912: aload_0
    //   1913: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   1916: invokevirtual 1277	com/android/dazhihui/ui/widget/TableLayoutGroup:getDataModel	()Ljava/util/List;
    //   1919: invokeinterface 1282 1 0
    //   1924: ifne +38 -> 1962
    //   1927: aload_0
    //   1928: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   1931: ldc_w 1283
    //   1934: invokevirtual 1286	com/android/dazhihui/ui/widget/TableLayoutGroup:setBackgroundResource	(I)V
    //   1937: return
    //   1938: aload_0
    //   1939: aload_3
    //   1940: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   1943: iconst_0
    //   1944: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1947: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   1950: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   1953: invokevirtual 1400	java/util/ArrayList:size	()I
    //   1956: putfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   1959: goto -54 -> 1905
    //   1962: aload_0
    //   1963: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   1966: aload_0
    //   1967: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   1970: ldc_w 733
    //   1973: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   1976: invokevirtual 1325	com/android/dazhihui/ui/widget/TableLayoutGroup:setBackgroundColor	(I)V
    //   1979: aload_0
    //   1980: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   1983: ifle +454 -> 2437
    //   1986: new 289	java/util/ArrayList
    //   1989: dup
    //   1990: invokespecial 290	java/util/ArrayList:<init>	()V
    //   1993: astore 4
    //   1995: iconst_0
    //   1996: istore 11
    //   1998: iload 11
    //   2000: aload_0
    //   2001: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   2004: if_icmpge +420 -> 2424
    //   2007: new 906	com/android/dazhihui/ui/widget/mh
    //   2010: dup
    //   2011: invokespecial 1326	com/android/dazhihui/ui/widget/mh:<init>	()V
    //   2014: astore 5
    //   2016: aload_0
    //   2017: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   2020: arraylength
    //   2021: anewarray 153	java/lang/String
    //   2024: astore 6
    //   2026: aload_0
    //   2027: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   2030: arraylength
    //   2031: newarray <illegal type>
    //   2033: astore 7
    //   2035: aload_0
    //   2036: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   2039: arraylength
    //   2040: iconst_3
    //   2041: if_icmpne +146 -> 2187
    //   2044: aload_3
    //   2045: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2048: iconst_0
    //   2049: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2052: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2055: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   2058: iload 11
    //   2060: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2063: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   2066: getfield 1403	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:BIZ_CODE	Ljava/lang/String;
    //   2069: astore 8
    //   2071: aload_3
    //   2072: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2075: iconst_0
    //   2076: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2079: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2082: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   2085: iload 11
    //   2087: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2090: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   2093: getfield 1406	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:CPTL_AMT	Ljava/lang/String;
    //   2096: astore 9
    //   2098: aload_3
    //   2099: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2102: iconst_0
    //   2103: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2106: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2109: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   2112: iload 11
    //   2114: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2117: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   2120: getfield 1409	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:STATUS	Ljava/lang/String;
    //   2123: astore 10
    //   2125: aload 8
    //   2127: ldc_w 1411
    //   2130: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2133: ifeq +129 -> 2262
    //   2136: aload 6
    //   2138: iconst_0
    //   2139: aload_0
    //   2140: getfield 161	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:v	[Ljava/lang/String;
    //   2143: iconst_0
    //   2144: aaload
    //   2145: aastore
    //   2146: aload 6
    //   2148: iconst_1
    //   2149: aload 9
    //   2151: aastore
    //   2152: aload 6
    //   2154: iconst_1
    //   2155: aaload
    //   2156: ifnonnull +10 -> 2166
    //   2159: aload 6
    //   2161: iconst_1
    //   2162: ldc_w 1331
    //   2165: aastore
    //   2166: aload 10
    //   2168: ldc_w 507
    //   2171: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2174: ifeq +144 -> 2318
    //   2177: aload 6
    //   2179: iconst_2
    //   2180: aload_0
    //   2181: getfield 173	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:w	[Ljava/lang/String;
    //   2184: iconst_0
    //   2185: aaload
    //   2186: aastore
    //   2187: aload 7
    //   2189: iconst_0
    //   2190: aload_0
    //   2191: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   2194: ldc_w 783
    //   2197: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   2200: iastore
    //   2201: aload 7
    //   2203: iconst_1
    //   2204: aload_0
    //   2205: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   2208: ldc_w 783
    //   2211: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   2214: iastore
    //   2215: aload 7
    //   2217: iconst_2
    //   2218: aload_0
    //   2219: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   2222: ldc_w 783
    //   2225: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   2228: iastore
    //   2229: aload 5
    //   2231: aload 6
    //   2233: putfield 908	com/android/dazhihui/ui/widget/mh:a	[Ljava/lang/String;
    //   2236: aload 5
    //   2238: aload 7
    //   2240: putfield 1342	com/android/dazhihui/ui/widget/mh:b	[I
    //   2243: aload 4
    //   2245: aload 5
    //   2247: invokeinterface 1343 2 0
    //   2252: pop
    //   2253: iload 11
    //   2255: iconst_1
    //   2256: iadd
    //   2257: istore 11
    //   2259: goto -261 -> 1998
    //   2262: aload 8
    //   2264: ldc -81
    //   2266: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2269: ifeq +16 -> 2285
    //   2272: aload 6
    //   2274: iconst_0
    //   2275: aload_0
    //   2276: getfield 161	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:v	[Ljava/lang/String;
    //   2279: iconst_1
    //   2280: aaload
    //   2281: aastore
    //   2282: goto -136 -> 2146
    //   2285: aload 8
    //   2287: ldc -77
    //   2289: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2292: ifeq +16 -> 2308
    //   2295: aload 6
    //   2297: iconst_0
    //   2298: aload_0
    //   2299: getfield 161	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:v	[Ljava/lang/String;
    //   2302: iconst_2
    //   2303: aaload
    //   2304: aastore
    //   2305: goto -159 -> 2146
    //   2308: aload 6
    //   2310: iconst_0
    //   2311: ldc_w 1331
    //   2314: aastore
    //   2315: goto -169 -> 2146
    //   2318: aload 10
    //   2320: ldc_w 509
    //   2323: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2326: ifeq +16 -> 2342
    //   2329: aload 6
    //   2331: iconst_2
    //   2332: aload_0
    //   2333: getfield 173	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:w	[Ljava/lang/String;
    //   2336: iconst_1
    //   2337: aaload
    //   2338: aastore
    //   2339: goto -152 -> 2187
    //   2342: aload 10
    //   2344: ldc_w 513
    //   2347: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2350: ifeq +16 -> 2366
    //   2353: aload 6
    //   2355: iconst_2
    //   2356: aload_0
    //   2357: getfield 173	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:w	[Ljava/lang/String;
    //   2360: iconst_2
    //   2361: aaload
    //   2362: aastore
    //   2363: goto -176 -> 2187
    //   2366: aload 10
    //   2368: ldc_w 1413
    //   2371: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2374: ifeq +16 -> 2390
    //   2377: aload 6
    //   2379: iconst_2
    //   2380: aload_0
    //   2381: getfield 173	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:w	[Ljava/lang/String;
    //   2384: iconst_3
    //   2385: aaload
    //   2386: aastore
    //   2387: goto -200 -> 2187
    //   2390: aload 10
    //   2392: ldc_w 1415
    //   2395: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2398: ifeq +16 -> 2414
    //   2401: aload 6
    //   2403: iconst_2
    //   2404: aload_0
    //   2405: getfield 173	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:w	[Ljava/lang/String;
    //   2408: iconst_4
    //   2409: aaload
    //   2410: aastore
    //   2411: goto -224 -> 2187
    //   2414: aload 6
    //   2416: iconst_2
    //   2417: ldc_w 1331
    //   2420: aastore
    //   2421: goto -234 -> 2187
    //   2424: aload_0
    //   2425: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   2428: aload 4
    //   2430: aload_0
    //   2431: getfield 394	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aA	I
    //   2434: invokevirtual 1346	com/android/dazhihui/ui/widget/TableLayoutGroup:a	(Ljava/util/List;I)V
    //   2437: aload_1
    //   2438: aload_0
    //   2439: getfield 1202	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:o	Lcom/android/dazhihui/a/b/t;
    //   2442: if_acmpne +655 -> 3097
    //   2445: new 153	java/lang/String
    //   2448: dup
    //   2449: aload_2
    //   2450: checkcast 1226	com/android/dazhihui/a/b/g
    //   2453: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   2456: invokespecial 1229	java/lang/String:<init>	([B)V
    //   2459: astore_3
    //   2460: new 1364	com/c/a/k
    //   2463: dup
    //   2464: invokespecial 1365	com/c/a/k:<init>	()V
    //   2467: aload_3
    //   2468: ldc_w 1367
    //   2471: invokevirtual 1370	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   2474: checkcast 1367	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse
    //   2477: astore 5
    //   2479: aload 5
    //   2481: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2484: iconst_0
    //   2485: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2488: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2491: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   2494: getfield 1384	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_CODE	Ljava/lang/String;
    //   2497: astore 4
    //   2499: aload 5
    //   2501: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2504: iconst_0
    //   2505: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2508: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2511: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   2514: getfield 1387	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_TEXT	Ljava/lang/String;
    //   2517: astore 6
    //   2519: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   2522: new 552	java/lang/StringBuilder
    //   2525: dup
    //   2526: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   2529: ldc_w 1397
    //   2532: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2535: aload_3
    //   2536: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2539: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2542: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   2545: aload 4
    //   2547: ldc_w 511
    //   2550: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2553: ifne +36 -> 2589
    //   2556: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   2559: new 552	java/lang/StringBuilder
    //   2562: dup
    //   2563: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   2566: ldc_w 1399
    //   2569: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2572: aload 6
    //   2574: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2577: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2580: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   2583: aload_0
    //   2584: iconst_0
    //   2585: putfield 151	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:u	Z
    //   2588: return
    //   2589: aload_0
    //   2590: iconst_1
    //   2591: putfield 151	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:u	Z
    //   2594: aload_0
    //   2595: aload 5
    //   2597: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2600: iconst_0
    //   2601: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2604: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2607: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   2610: invokevirtual 1400	java/util/ArrayList:size	()I
    //   2613: putfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   2616: aload_0
    //   2617: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   2620: ifle +818 -> 3438
    //   2623: aload_0
    //   2624: new 289	java/util/ArrayList
    //   2627: dup
    //   2628: invokespecial 290	java/util/ArrayList:<init>	()V
    //   2631: putfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   2634: aload_0
    //   2635: aload_0
    //   2636: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   2639: newarray <illegal type>
    //   2641: putfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2644: aload_0
    //   2645: aload_0
    //   2646: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   2649: anewarray 153	java/lang/String
    //   2652: putfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   2655: ldc -109
    //   2657: astore_3
    //   2658: iconst_0
    //   2659: istore 11
    //   2661: iload 11
    //   2663: aload_0
    //   2664: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   2667: if_icmpge +391 -> 3058
    //   2670: aload_0
    //   2671: getfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   2674: iload 11
    //   2676: aload 5
    //   2678: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2681: iconst_0
    //   2682: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2685: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2688: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   2691: iload 11
    //   2693: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2696: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   2699: getfield 1418	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:EXT_INST	Ljava/lang/String;
    //   2702: aastore
    //   2703: aload_0
    //   2704: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2707: iload 11
    //   2709: aload 5
    //   2711: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   2714: iconst_0
    //   2715: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2718: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   2721: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   2724: iload 11
    //   2726: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2729: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   2732: getfield 1421	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:CURRENCY	Ljava/lang/String;
    //   2735: invokestatic 550	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   2738: iastore
    //   2739: iconst_0
    //   2740: istore 12
    //   2742: aload_3
    //   2743: astore 4
    //   2745: iload 12
    //   2747: aload_0
    //   2748: getfield 225	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:x	[Ljava/lang/String;
    //   2751: arraylength
    //   2752: if_icmpge +32 -> 2784
    //   2755: aload_0
    //   2756: getfield 225	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:x	[Ljava/lang/String;
    //   2759: iload 12
    //   2761: aaload
    //   2762: aload_0
    //   2763: getfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   2766: iload 11
    //   2768: aaload
    //   2769: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2772: ifeq +172 -> 2944
    //   2775: aload_0
    //   2776: getfield 277	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:y	[Ljava/lang/String;
    //   2779: iload 12
    //   2781: aaload
    //   2782: astore 4
    //   2784: aload_0
    //   2785: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2788: iload 11
    //   2790: iaload
    //   2791: iflt +18 -> 2809
    //   2794: aload_0
    //   2795: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2798: iload 11
    //   2800: iaload
    //   2801: aload_0
    //   2802: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   2805: arraylength
    //   2806: if_icmplt +20 -> 2826
    //   2809: aload_0
    //   2810: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2813: iload 11
    //   2815: iconst_0
    //   2816: iastore
    //   2817: ldc_w 1255
    //   2820: ldc_w 1257
    //   2823: invokestatic 1261	com/android/dazhihui/d/n:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2826: aload_0
    //   2827: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2830: iload 11
    //   2832: iaload
    //   2833: iconst_1
    //   2834: if_icmpne +119 -> 2953
    //   2837: aload_0
    //   2838: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   2841: new 552	java/lang/StringBuilder
    //   2844: dup
    //   2845: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   2848: aload 4
    //   2850: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2853: ldc_w 1263
    //   2856: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2859: aload_0
    //   2860: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   2863: iconst_2
    //   2864: aaload
    //   2865: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2868: ldc_w 1265
    //   2871: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2874: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2877: invokevirtual 641	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2880: pop
    //   2881: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   2884: new 552	java/lang/StringBuilder
    //   2887: dup
    //   2888: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   2891: ldc_w 1267
    //   2894: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2897: iload 11
    //   2899: invokevirtual 557	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2902: ldc_w 1269
    //   2905: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2908: aload_0
    //   2909: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   2912: iload 11
    //   2914: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2917: checkcast 153	java/lang/String
    //   2920: invokevirtual 1150	java/lang/String:toString	()Ljava/lang/String;
    //   2923: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2926: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2929: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   2932: iload 11
    //   2934: iconst_1
    //   2935: iadd
    //   2936: istore 11
    //   2938: aload 4
    //   2940: astore_3
    //   2941: goto -280 -> 2661
    //   2944: iload 12
    //   2946: iconst_1
    //   2947: iadd
    //   2948: istore 12
    //   2950: goto -208 -> 2742
    //   2953: aload_0
    //   2954: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   2957: iload 11
    //   2959: iaload
    //   2960: iconst_2
    //   2961: if_icmpne +50 -> 3011
    //   2964: aload_0
    //   2965: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   2968: new 552	java/lang/StringBuilder
    //   2971: dup
    //   2972: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   2975: aload 4
    //   2977: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2980: ldc_w 1263
    //   2983: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2986: aload_0
    //   2987: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   2990: iconst_1
    //   2991: aaload
    //   2992: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2995: ldc_w 1265
    //   2998: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3001: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3004: invokevirtual 641	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   3007: pop
    //   3008: goto -127 -> 2881
    //   3011: aload_0
    //   3012: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   3015: new 552	java/lang/StringBuilder
    //   3018: dup
    //   3019: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   3022: aload 4
    //   3024: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3027: ldc_w 1263
    //   3030: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3033: aload_0
    //   3034: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   3037: iconst_0
    //   3038: aaload
    //   3039: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3042: ldc_w 1265
    //   3045: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3048: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3051: invokevirtual 641	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   3054: pop
    //   3055: goto -174 -> 2881
    //   3058: aload_0
    //   3059: getfield 518	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:L	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   3062: aload_0
    //   3063: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   3066: iconst_0
    //   3067: iconst_1
    //   3068: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   3071: aload_0
    //   3072: getfield 522	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:M	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   3075: aload_0
    //   3076: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   3079: iconst_0
    //   3080: iconst_1
    //   3081: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   3084: aload_0
    //   3085: getfield 526	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:N	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   3088: aload_0
    //   3089: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   3092: iconst_0
    //   3093: iconst_1
    //   3094: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   3097: aload_1
    //   3098: aload_0
    //   3099: getfield 1423	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:s	Lcom/android/dazhihui/a/b/t;
    //   3102: if_acmpeq +11 -> 3113
    //   3105: aload_1
    //   3106: aload_0
    //   3107: getfield 1425	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:t	Lcom/android/dazhihui/a/b/t;
    //   3110: if_acmpne +182 -> 3292
    //   3113: new 153	java/lang/String
    //   3116: dup
    //   3117: aload_2
    //   3118: checkcast 1226	com/android/dazhihui/a/b/g
    //   3121: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   3124: invokespecial 1229	java/lang/String:<init>	([B)V
    //   3127: astore_3
    //   3128: new 1364	com/c/a/k
    //   3131: dup
    //   3132: invokespecial 1365	com/c/a/k:<init>	()V
    //   3135: aload_3
    //   3136: ldc_w 1367
    //   3139: invokevirtual 1370	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   3142: checkcast 1367	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse
    //   3145: astore 4
    //   3147: aload 4
    //   3149: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   3152: iconst_0
    //   3153: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3156: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   3159: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   3162: getfield 1384	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_CODE	Ljava/lang/String;
    //   3165: astore 5
    //   3167: aload 4
    //   3169: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   3172: iconst_0
    //   3173: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3176: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   3179: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   3182: getfield 1387	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_TEXT	Ljava/lang/String;
    //   3185: astore 6
    //   3187: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   3190: new 552	java/lang/StringBuilder
    //   3193: dup
    //   3194: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   3197: ldc_w 1397
    //   3200: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3203: aload_3
    //   3204: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3207: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3210: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   3213: aload 5
    //   3215: ldc_w 511
    //   3218: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3221: ifeq +267 -> 3488
    //   3224: aload_0
    //   3225: new 552	java/lang/StringBuilder
    //   3228: dup
    //   3229: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   3232: ldc_w 1355
    //   3235: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3238: aload 4
    //   3240: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   3243: iconst_0
    //   3244: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3247: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   3250: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   3253: iconst_0
    //   3254: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3257: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   3260: getfield 1428	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:SERIAL_NO	Ljava/lang/String;
    //   3263: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3266: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3269: invokevirtual 1358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:b	(Ljava/lang/String;)V
    //   3272: aload_0
    //   3273: invokespecial 431	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:r	()V
    //   3276: aload_0
    //   3277: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   3280: ifne +188 -> 3468
    //   3283: aload_0
    //   3284: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   3287: bipush 8
    //   3289: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   3292: aload_1
    //   3293: aload_0
    //   3294: getfield 1430	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:q	Lcom/android/dazhihui/a/b/t;
    //   3297: if_acmpne -2856 -> 441
    //   3300: new 153	java/lang/String
    //   3303: dup
    //   3304: aload_2
    //   3305: checkcast 1226	com/android/dazhihui/a/b/g
    //   3308: invokevirtual 1228	com/android/dazhihui/a/b/g:a	()[B
    //   3311: invokespecial 1229	java/lang/String:<init>	([B)V
    //   3314: astore_1
    //   3315: new 1364	com/c/a/k
    //   3318: dup
    //   3319: invokespecial 1365	com/c/a/k:<init>	()V
    //   3322: aload_1
    //   3323: ldc_w 1367
    //   3326: invokevirtual 1370	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   3329: checkcast 1367	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse
    //   3332: astore_2
    //   3333: aload_2
    //   3334: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   3337: iconst_0
    //   3338: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3341: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   3344: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   3347: getfield 1384	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_CODE	Ljava/lang/String;
    //   3350: astore_3
    //   3351: aload_2
    //   3352: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   3355: iconst_0
    //   3356: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3359: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   3362: getfield 1379	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_MSG_HDR	Lcom/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr;
    //   3365: getfield 1387	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Msg_Hdr:MSG_TEXT	Ljava/lang/String;
    //   3368: astore 4
    //   3370: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   3373: new 552	java/lang/StringBuilder
    //   3376: dup
    //   3377: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   3380: ldc_w 1397
    //   3383: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3386: aload_1
    //   3387: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3390: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3393: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   3396: aload_3
    //   3397: ldc_w 511
    //   3400: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3403: ifeq +140 -> 3543
    //   3406: aload_0
    //   3407: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   3410: aload_2
    //   3411: getfield 1373	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse:ANSWERS	Ljava/util/ArrayList;
    //   3414: iconst_0
    //   3415: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3418: checkcast 1375	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer
    //   3421: getfield 1390	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Answer:ANS_COMM_DATA	Ljava/util/ArrayList;
    //   3424: iconst_0
    //   3425: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3428: checkcast 1392	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data
    //   3431: getfield 1433	com/android/dazhihui/ui/delegate/screen/jinzheng/JinzhengResponse$Ans_Comm_Data:DRAW_AMT	Ljava/lang/String;
    //   3434: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   3437: return
    //   3438: aload_0
    //   3439: getfield 518	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:L	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   3442: ldc -109
    //   3444: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   3447: aload_0
    //   3448: getfield 522	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:M	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   3451: ldc -109
    //   3453: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   3456: aload_0
    //   3457: getfield 526	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:N	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   3460: ldc -109
    //   3462: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   3465: goto -368 -> 3097
    //   3468: aload_0
    //   3469: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   3472: iconst_1
    //   3473: if_icmpne -181 -> 3292
    //   3476: aload_0
    //   3477: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   3480: bipush 8
    //   3482: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   3485: goto -193 -> 3292
    //   3488: aload_0
    //   3489: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   3492: ifne +23 -> 3515
    //   3495: aload_0
    //   3496: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   3499: aload 6
    //   3501: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   3504: aload_0
    //   3505: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   3508: iconst_0
    //   3509: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   3512: goto -220 -> 3292
    //   3515: aload_0
    //   3516: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   3519: iconst_1
    //   3520: if_icmpne -228 -> 3292
    //   3523: aload_0
    //   3524: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   3527: aload 6
    //   3529: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   3532: aload_0
    //   3533: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   3536: iconst_0
    //   3537: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   3540: goto -248 -> 3292
    //   3543: aload_0
    //   3544: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   3547: ldc_w 1331
    //   3550: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   3553: return
    //   3554: aload_2
    //   3555: checkcast 1435	com/android/dazhihui/a/b/v
    //   3558: invokevirtual 1438	com/android/dazhihui/a/b/v:b	()Lcom/android/dazhihui/ui/delegate/b/u;
    //   3561: astore_2
    //   3562: aload_2
    //   3563: ifnonnull +18 -> 3581
    //   3566: aload_1
    //   3567: aload_0
    //   3568: getfield 988	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:X	Lcom/android/dazhihui/a/b/u;
    //   3571: if_acmpne +56 -> 3627
    //   3574: aload_0
    //   3575: ldc_w 1440
    //   3578: invokevirtual 1297	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:a	(Ljava/lang/String;)V
    //   3581: aload_1
    //   3582: aload_0
    //   3583: getfield 897	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aB	Lcom/android/dazhihui/a/b/u;
    //   3586: if_acmpne +424 -> 4010
    //   3589: aload_2
    //   3590: invokevirtual 1442	com/android/dazhihui/ui/delegate/b/u:e	()[B
    //   3593: invokestatic 1445	com/android/dazhihui/ui/delegate/b/h:b	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   3596: astore_1
    //   3597: aload_1
    //   3598: invokevirtual 1447	com/android/dazhihui/ui/delegate/b/h:b	()Z
    //   3601: ifne +74 -> 3675
    //   3604: aload_0
    //   3605: aload_1
    //   3606: invokevirtual 1449	com/android/dazhihui/ui/delegate/b/h:d	()Ljava/lang/String;
    //   3609: iconst_0
    //   3610: invokestatic 1191	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   3613: astore_1
    //   3614: aload_1
    //   3615: bipush 17
    //   3617: iconst_0
    //   3618: iconst_0
    //   3619: invokevirtual 1195	android/widget/Toast:setGravity	(III)V
    //   3622: aload_1
    //   3623: invokevirtual 1196	android/widget/Toast:show	()V
    //   3626: return
    //   3627: aload_1
    //   3628: aload_0
    //   3629: getfield 1451	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ac	Lcom/android/dazhihui/a/b/u;
    //   3632: if_acmpne +13 -> 3645
    //   3635: aload_0
    //   3636: ldc_w 1453
    //   3639: invokevirtual 1297	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:a	(Ljava/lang/String;)V
    //   3642: goto -61 -> 3581
    //   3645: aload_1
    //   3646: aload_0
    //   3647: getfield 897	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aB	Lcom/android/dazhihui/a/b/u;
    //   3650: if_acmpne -69 -> 3581
    //   3653: aload_0
    //   3654: ldc_w 1455
    //   3657: iconst_0
    //   3658: invokestatic 1191	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   3661: astore_1
    //   3662: aload_1
    //   3663: bipush 17
    //   3665: iconst_0
    //   3666: iconst_0
    //   3667: invokevirtual 1195	android/widget/Toast:setGravity	(III)V
    //   3670: aload_1
    //   3671: invokevirtual 1196	android/widget/Toast:show	()V
    //   3674: return
    //   3675: aload_0
    //   3676: aload_1
    //   3677: invokevirtual 488	com/android/dazhihui/ui/delegate/b/h:g	()I
    //   3680: putfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   3683: aload_0
    //   3684: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   3687: ifne +29 -> 3716
    //   3690: aload_0
    //   3691: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   3694: invokevirtual 1277	com/android/dazhihui/ui/widget/TableLayoutGroup:getDataModel	()Ljava/util/List;
    //   3697: invokeinterface 1282 1 0
    //   3702: ifne +14 -> 3716
    //   3705: aload_0
    //   3706: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   3709: ldc_w 1283
    //   3712: invokevirtual 1286	com/android/dazhihui/ui/widget/TableLayoutGroup:setBackgroundResource	(I)V
    //   3715: return
    //   3716: aload_0
    //   3717: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   3720: aload_0
    //   3721: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   3724: ldc_w 733
    //   3727: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   3730: invokevirtual 1325	com/android/dazhihui/ui/widget/TableLayoutGroup:setBackgroundColor	(I)V
    //   3733: aload_0
    //   3734: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   3737: ifle -3296 -> 441
    //   3740: aload_0
    //   3741: aload_1
    //   3742: ldc_w 1457
    //   3745: invokevirtual 1459	com/android/dazhihui/ui/delegate/b/h:b	(Ljava/lang/String;)I
    //   3748: putfield 378	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:e	I
    //   3751: new 289	java/util/ArrayList
    //   3754: dup
    //   3755: invokespecial 290	java/util/ArrayList:<init>	()V
    //   3758: astore_2
    //   3759: iconst_0
    //   3760: istore 11
    //   3762: iload 11
    //   3764: aload_0
    //   3765: getfield 374	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:c	I
    //   3768: if_icmpge +229 -> 3997
    //   3771: new 906	com/android/dazhihui/ui/widget/mh
    //   3774: dup
    //   3775: invokespecial 1326	com/android/dazhihui/ui/widget/mh:<init>	()V
    //   3778: astore_3
    //   3779: aload_0
    //   3780: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   3783: arraylength
    //   3784: anewarray 153	java/lang/String
    //   3787: astore 4
    //   3789: aload_0
    //   3790: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   3793: arraylength
    //   3794: newarray <illegal type>
    //   3796: astore 5
    //   3798: iconst_0
    //   3799: istore 12
    //   3801: iload 12
    //   3803: aload_0
    //   3804: getfield 358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:at	[Ljava/lang/String;
    //   3807: arraylength
    //   3808: if_icmpge +160 -> 3968
    //   3811: aload 4
    //   3813: iload 12
    //   3815: aload_1
    //   3816: iload 11
    //   3818: aload_0
    //   3819: getfield 362	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:au	[Ljava/lang/String;
    //   3822: iload 12
    //   3824: aaload
    //   3825: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   3828: invokevirtual 1329	java/lang/String:trim	()Ljava/lang/String;
    //   3831: aastore
    //   3832: aload 4
    //   3834: iload 12
    //   3836: aaload
    //   3837: ifnonnull +11 -> 3848
    //   3840: aload 4
    //   3842: iload 12
    //   3844: ldc_w 1331
    //   3847: aastore
    //   3848: aload 4
    //   3850: iload 12
    //   3852: aaload
    //   3853: ldc_w 1331
    //   3856: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3859: ifeq +52 -> 3911
    //   3862: aload_0
    //   3863: getfield 362	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:au	[Ljava/lang/String;
    //   3866: iload 12
    //   3868: aaload
    //   3869: ldc_w 360
    //   3872: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3875: ifeq +36 -> 3911
    //   3878: aload 4
    //   3880: iload 12
    //   3882: aload_1
    //   3883: iload 11
    //   3885: ldc_w 1461
    //   3888: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   3891: invokevirtual 1329	java/lang/String:trim	()Ljava/lang/String;
    //   3894: aastore
    //   3895: aload 4
    //   3897: iload 12
    //   3899: aaload
    //   3900: ifnonnull +11 -> 3911
    //   3903: aload 4
    //   3905: iload 12
    //   3907: ldc_w 1331
    //   3910: aastore
    //   3911: aload 4
    //   3913: iload 12
    //   3915: aload_0
    //   3916: getfield 362	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:au	[Ljava/lang/String;
    //   3919: iload 12
    //   3921: aaload
    //   3922: aload 4
    //   3924: iload 12
    //   3926: aaload
    //   3927: invokestatic 1464	com/android/dazhihui/ui/delegate/b/o:c	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3930: aastore
    //   3931: aload 5
    //   3933: iload 12
    //   3935: aload_0
    //   3936: invokevirtual 732	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:getResources	()Landroid/content/res/Resources;
    //   3939: ldc_w 783
    //   3942: invokevirtual 739	android/content/res/Resources:getColor	(I)I
    //   3945: iastore
    //   3946: iload 12
    //   3948: iconst_1
    //   3949: iadd
    //   3950: istore 12
    //   3952: goto -151 -> 3801
    //   3955: astore 6
    //   3957: aload 4
    //   3959: iload 12
    //   3961: ldc_w 1331
    //   3964: aastore
    //   3965: goto -117 -> 3848
    //   3968: aload_3
    //   3969: aload 4
    //   3971: putfield 908	com/android/dazhihui/ui/widget/mh:a	[Ljava/lang/String;
    //   3974: aload_3
    //   3975: aload 5
    //   3977: putfield 1342	com/android/dazhihui/ui/widget/mh:b	[I
    //   3980: aload_2
    //   3981: aload_3
    //   3982: invokeinterface 1343 2 0
    //   3987: pop
    //   3988: iload 11
    //   3990: iconst_1
    //   3991: iadd
    //   3992: istore 11
    //   3994: goto -232 -> 3762
    //   3997: aload_0
    //   3998: getfield 421	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:an	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   4001: aload_2
    //   4002: aload_0
    //   4003: getfield 394	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aA	I
    //   4006: invokevirtual 1346	com/android/dazhihui/ui/widget/TableLayoutGroup:a	(Ljava/util/List;I)V
    //   4009: return
    //   4010: aload_2
    //   4011: aload_0
    //   4012: invokestatic 1467	com/android/dazhihui/ui/delegate/b/u:a	(Lcom/android/dazhihui/ui/delegate/b/u;Landroid/content/Context;)Z
    //   4015: ifeq -3574 -> 441
    //   4018: aload_1
    //   4019: aload_0
    //   4020: getfield 988	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:X	Lcom/android/dazhihui/a/b/u;
    //   4023: if_acmpne +335 -> 4358
    //   4026: aload_0
    //   4027: aload_2
    //   4028: invokevirtual 1442	com/android/dazhihui/ui/delegate/b/u:e	()[B
    //   4031: invokestatic 1445	com/android/dazhihui/ui/delegate/b/h:b	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   4034: putfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4037: aload_0
    //   4038: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4041: invokevirtual 1447	com/android/dazhihui/ui/delegate/b/h:b	()Z
    //   4044: ifeq +572 -> 4616
    //   4047: aload_0
    //   4048: aload_0
    //   4049: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4052: putfield 484	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:W	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4055: aload_0
    //   4056: aload_0
    //   4057: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4060: invokevirtual 488	com/android/dazhihui/ui/delegate/b/h:g	()I
    //   4063: putfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4066: aload_0
    //   4067: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4070: ifle +516 -> 4586
    //   4073: aload_0
    //   4074: new 289	java/util/ArrayList
    //   4077: dup
    //   4078: invokespecial 290	java/util/ArrayList:<init>	()V
    //   4081: putfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   4084: aload_0
    //   4085: aload_0
    //   4086: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4089: newarray <illegal type>
    //   4091: putfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   4094: aload_0
    //   4095: aload_0
    //   4096: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4099: anewarray 153	java/lang/String
    //   4102: putfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   4105: iconst_0
    //   4106: istore 11
    //   4108: iload 11
    //   4110: aload_0
    //   4111: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4114: if_icmpge +205 -> 4319
    //   4117: aload_0
    //   4118: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4121: iload 11
    //   4123: ldc_w 340
    //   4126: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   4129: invokevirtual 1329	java/lang/String:trim	()Ljava/lang/String;
    //   4132: astore_3
    //   4133: aload_0
    //   4134: getfield 863	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:bb	[Ljava/lang/String;
    //   4137: iload 11
    //   4139: aload_0
    //   4140: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4143: iload 11
    //   4145: ldc_w 870
    //   4148: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   4151: aastore
    //   4152: aload_0
    //   4153: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   4156: iload 11
    //   4158: aload_0
    //   4159: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4162: iload 11
    //   4164: ldc_w 882
    //   4167: invokevirtual 1472	com/android/dazhihui/ui/delegate/b/h:b	(ILjava/lang/String;)I
    //   4170: iastore
    //   4171: aload_0
    //   4172: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   4175: iload 11
    //   4177: iaload
    //   4178: iflt +18 -> 4196
    //   4181: aload_0
    //   4182: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   4185: iload 11
    //   4187: iaload
    //   4188: aload_0
    //   4189: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   4192: arraylength
    //   4193: if_icmplt +20 -> 4213
    //   4196: aload_0
    //   4197: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   4200: iload 11
    //   4202: iconst_0
    //   4203: iastore
    //   4204: ldc_w 1255
    //   4207: ldc_w 1257
    //   4210: invokestatic 1261	com/android/dazhihui/d/n:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   4213: aload_0
    //   4214: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   4217: new 552	java/lang/StringBuilder
    //   4220: dup
    //   4221: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   4224: aload_3
    //   4225: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4228: ldc_w 1263
    //   4231: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4234: aload_0
    //   4235: getfield 300	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:P	[Ljava/lang/String;
    //   4238: aload_0
    //   4239: getfield 302	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Q	[I
    //   4242: iload 11
    //   4244: iaload
    //   4245: aaload
    //   4246: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4249: ldc_w 1265
    //   4252: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4255: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4258: invokevirtual 641	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4261: pop
    //   4262: getstatic 1039	java/lang/System:out	Ljava/io/PrintStream;
    //   4265: new 552	java/lang/StringBuilder
    //   4268: dup
    //   4269: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   4272: ldc_w 1267
    //   4275: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4278: iload 11
    //   4280: invokevirtual 557	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   4283: ldc_w 1269
    //   4286: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4289: aload_0
    //   4290: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   4293: iload 11
    //   4295: invokevirtual 1270	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4298: checkcast 153	java/lang/String
    //   4301: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4304: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4307: invokevirtual 1046	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   4310: iload 11
    //   4312: iconst_1
    //   4313: iadd
    //   4314: istore 11
    //   4316: goto -208 -> 4108
    //   4319: aload_0
    //   4320: getfield 518	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:L	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   4323: aload_0
    //   4324: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   4327: iconst_0
    //   4328: iconst_1
    //   4329: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   4332: aload_0
    //   4333: getfield 522	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:M	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   4336: aload_0
    //   4337: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   4340: iconst_0
    //   4341: iconst_1
    //   4342: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   4345: aload_0
    //   4346: getfield 526	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:N	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   4349: aload_0
    //   4350: getfield 584	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:V	Ljava/util/ArrayList;
    //   4353: iconst_0
    //   4354: iconst_1
    //   4355: invokevirtual 1273	com/android/dazhihui/ui/widget/DropDownEditTextView:a	(Ljava/util/ArrayList;IZ)V
    //   4358: aload_1
    //   4359: aload_0
    //   4360: getfield 1451	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ac	Lcom/android/dazhihui/a/b/u;
    //   4363: if_acmpne +60 -> 4423
    //   4366: aload_0
    //   4367: aload_2
    //   4368: invokevirtual 1442	com/android/dazhihui/ui/delegate/b/u:e	()[B
    //   4371: invokestatic 1445	com/android/dazhihui/ui/delegate/b/h:b	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   4374: putfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4377: aload_0
    //   4378: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4381: invokevirtual 1447	com/android/dazhihui/ui/delegate/b/h:b	()Z
    //   4384: ifeq +265 -> 4649
    //   4387: aload_0
    //   4388: aload_0
    //   4389: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4392: iconst_0
    //   4393: ldc_w 1474
    //   4396: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   4399: invokevirtual 1358	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:b	(Ljava/lang/String;)V
    //   4402: aload_0
    //   4403: invokespecial 431	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:r	()V
    //   4406: aload_0
    //   4407: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   4410: iconst_1
    //   4411: if_icmpne +219 -> 4630
    //   4414: aload_0
    //   4415: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   4418: bipush 8
    //   4420: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4423: aload_1
    //   4424: aload_0
    //   4425: getfield 1476	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ab	Lcom/android/dazhihui/a/b/u;
    //   4428: if_acmpne +102 -> 4530
    //   4431: aload_0
    //   4432: aload_2
    //   4433: invokevirtual 1442	com/android/dazhihui/ui/delegate/b/u:e	()[B
    //   4436: invokestatic 1445	com/android/dazhihui/ui/delegate/b/h:b	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   4439: putfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4442: aload_0
    //   4443: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4446: invokevirtual 1447	com/android/dazhihui/ui/delegate/b/h:b	()Z
    //   4449: ifeq +265 -> 4714
    //   4452: aload_0
    //   4453: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4456: iconst_0
    //   4457: ldc_w 1478
    //   4460: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   4463: astore_3
    //   4464: aload_3
    //   4465: ifnull +56 -> 4521
    //   4468: aload_3
    //   4469: ldc -109
    //   4471: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   4474: ifne +47 -> 4521
    //   4477: aload_0
    //   4478: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   4481: iconst_0
    //   4482: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4485: aload_0
    //   4486: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   4489: new 552	java/lang/StringBuilder
    //   4492: dup
    //   4493: invokespecial 553	java/lang/StringBuilder:<init>	()V
    //   4496: ldc_w 1340
    //   4499: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4502: aload_3
    //   4503: invokevirtual 562	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4506: invokevirtual 565	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4509: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4512: aload_0
    //   4513: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   4516: bipush 8
    //   4518: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4521: aload_0
    //   4522: getfield 480	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aj	Landroid/widget/EditText;
    //   4525: ldc -109
    //   4527: invokevirtual 464	android/widget/EditText:setText	(Ljava/lang/CharSequence;)V
    //   4530: aload_1
    //   4531: aload_0
    //   4532: getfield 1208	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aC	Lcom/android/dazhihui/a/b/u;
    //   4535: if_acmpne -4094 -> 441
    //   4538: aload_2
    //   4539: invokevirtual 1442	com/android/dazhihui/ui/delegate/b/u:e	()[B
    //   4542: invokestatic 1445	com/android/dazhihui/ui/delegate/b/h:b	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   4545: astore_1
    //   4546: aload_1
    //   4547: invokevirtual 1447	com/android/dazhihui/ui/delegate/b/h:b	()Z
    //   4550: ifne +198 -> 4748
    //   4553: aload_0
    //   4554: aload_1
    //   4555: invokevirtual 1449	com/android/dazhihui/ui/delegate/b/h:d	()Ljava/lang/String;
    //   4558: iconst_0
    //   4559: invokestatic 1191	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   4562: astore_1
    //   4563: aload_1
    //   4564: bipush 17
    //   4566: iconst_0
    //   4567: iconst_0
    //   4568: invokevirtual 1195	android/widget/Toast:setGravity	(III)V
    //   4571: aload_1
    //   4572: invokevirtual 1196	android/widget/Toast:show	()V
    //   4575: aload_0
    //   4576: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   4579: ldc_w 1331
    //   4582: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4585: return
    //   4586: aload_0
    //   4587: getfield 518	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:L	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   4590: ldc -109
    //   4592: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   4595: aload_0
    //   4596: getfield 522	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:M	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   4599: ldc -109
    //   4601: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   4604: aload_0
    //   4605: getfield 526	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:N	Lcom/android/dazhihui/ui/widget/DropDownEditTextView;
    //   4608: ldc -109
    //   4610: invokevirtual 1288	com/android/dazhihui/ui/widget/DropDownEditTextView:setText	(Ljava/lang/String;)V
    //   4613: goto -255 -> 4358
    //   4616: aload_0
    //   4617: aload_0
    //   4618: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4621: invokevirtual 1449	com/android/dazhihui/ui/delegate/b/h:d	()Ljava/lang/String;
    //   4624: invokevirtual 1297	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:a	(Ljava/lang/String;)V
    //   4627: goto -269 -> 4358
    //   4630: aload_0
    //   4631: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   4634: ifne -211 -> 4423
    //   4637: aload_0
    //   4638: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   4641: bipush 8
    //   4643: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4646: goto -223 -> 4423
    //   4649: aload_0
    //   4650: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   4653: ifne +28 -> 4681
    //   4656: aload_0
    //   4657: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   4660: aload_0
    //   4661: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4664: invokevirtual 1449	com/android/dazhihui/ui/delegate/b/h:d	()Ljava/lang/String;
    //   4667: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4670: aload_0
    //   4671: getfield 580	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aE	Landroid/widget/TextView;
    //   4674: iconst_0
    //   4675: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4678: goto -255 -> 4423
    //   4681: aload_0
    //   4682: getfield 310	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:ae	I
    //   4685: iconst_1
    //   4686: if_icmpne -263 -> 4423
    //   4689: aload_0
    //   4690: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   4693: aload_0
    //   4694: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4697: invokevirtual 1449	com/android/dazhihui/ui/delegate/b/h:d	()Ljava/lang/String;
    //   4700: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4703: aload_0
    //   4704: getfield 582	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aG	Landroid/widget/TextView;
    //   4707: iconst_0
    //   4708: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4711: goto -288 -> 4423
    //   4714: aload_0
    //   4715: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   4718: aload_0
    //   4719: getfield 1469	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:Y	Lcom/android/dazhihui/ui/delegate/b/h;
    //   4722: invokevirtual 1449	com/android/dazhihui/ui/delegate/b/h:d	()Ljava/lang/String;
    //   4725: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4728: aload_0
    //   4729: getfield 578	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aF	Landroid/widget/TextView;
    //   4732: iconst_0
    //   4733: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4736: aload_0
    //   4737: getfield 659	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aH	Landroid/widget/TextView;
    //   4740: bipush 8
    //   4742: invokevirtual 1338	android/widget/TextView:setVisibility	(I)V
    //   4745: goto -215 -> 4530
    //   4748: aload_0
    //   4749: aload_1
    //   4750: invokevirtual 488	com/android/dazhihui/ui/delegate/b/h:g	()I
    //   4753: putfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4756: aload_0
    //   4757: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4760: ifle +67 -> 4827
    //   4763: iconst_0
    //   4764: istore 11
    //   4766: iload 11
    //   4768: aload_0
    //   4769: getfield 1244	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:aa	I
    //   4772: if_icmpge +66 -> 4838
    //   4775: aload_1
    //   4776: iload 11
    //   4778: ldc_w 1480
    //   4781: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   4784: astore_2
    //   4785: aload_2
    //   4786: ifnull +32 -> 4818
    //   4789: aload_2
    //   4790: ldc_w 507
    //   4793: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   4796: ifeq +22 -> 4818
    //   4799: aload_1
    //   4800: iload 11
    //   4802: ldc_w 1482
    //   4805: invokevirtual 497	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   4808: astore_1
    //   4809: aload_0
    //   4810: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   4813: aload_1
    //   4814: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4817: return
    //   4818: iload 11
    //   4820: iconst_1
    //   4821: iadd
    //   4822: istore 11
    //   4824: goto -58 -> 4766
    //   4827: aload_0
    //   4828: getfield 663	com/android/dazhihui/ui/delegate/screen/TransferMenuNew:K	Landroid/widget/TextView;
    //   4831: ldc_w 1331
    //   4834: invokevirtual 568	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   4837: return
    //   4838: iconst_0
    //   4839: istore 11
    //   4841: goto -42 -> 4799
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	4844	0	this	TransferMenuNew
    //   0	4844	1	paramh	com.android.dazhihui.a.b.h
    //   0	4844	2	paramj	com.android.dazhihui.a.b.j
    //   34	446	3	localObject1	Object
    //   506	92	3	localJSONException1	org.json.JSONException
    //   804	2	3	localJSONException2	org.json.JSONException
    //   831	354	3	localObject2	Object
    //   1219	40	3	localJSONException3	org.json.JSONException
    //   1334	16	3	localJSONObject	org.json.JSONObject
    //   1395	2	3	localJSONException4	org.json.JSONException
    //   1535	2968	3	localObject3	Object
    //   49	69	4	localJSONArray	org.json.JSONArray
    //   472	27	4	localJSONException5	org.json.JSONException
    //   583	424	4	localObject4	Object
    //   1066	49	4	localJSONException6	org.json.JSONException
    //   1199	2771	4	localObject5	Object
    //   127	3849	5	localObject6	Object
    //   137	3391	6	localObject7	Object
    //   3955	1	6	localException1	Exception
    //   625	1614	7	localObject8	Object
    //   634	1652	8	localObject9	Object
    //   791	1	9	localException2	Exception
    //   2096	54	9	str1	String
    //   2123	268	10	str2	String
    //   105	4735	11	k	int
    //   637	3323	12	i1	int
    //   644	7	13	i2	int
    // Exception table:
    //   from	to	target	type
    //   35	104	472	org/json/JSONException
    //   107	197	472	org/json/JSONException
    //   197	214	472	org/json/JSONException
    //   214	315	472	org/json/JSONException
    //   324	363	472	org/json/JSONException
    //   442	469	472	org/json/JSONException
    //   474	498	506	org/json/JSONException
    //   653	673	791	java/lang/Exception
    //   681	694	791	java/lang/Exception
    //   386	441	804	org/json/JSONException
    //   552	585	804	org/json/JSONException
    //   588	636	804	org/json/JSONException
    //   639	646	804	org/json/JSONException
    //   653	673	804	org/json/JSONException
    //   681	694	804	org/json/JSONException
    //   702	751	804	org/json/JSONException
    //   767	782	804	org/json/JSONException
    //   957	993	804	org/json/JSONException
    //   1002	1042	804	org/json/JSONException
    //   1045	1063	804	org/json/JSONException
    //   832	848	1066	org/json/JSONException
    //   851	879	1066	org/json/JSONException
    //   884	939	1066	org/json/JSONException
    //   939	948	1066	org/json/JSONException
    //   1068	1114	1219	org/json/JSONException
    //   1142	1172	1395	org/json/JSONException
    //   1175	1210	1395	org/json/JSONException
    //   1265	1275	1395	org/json/JSONException
    //   1298	1313	1422	org/json/JSONException
    //   1316	1386	1422	org/json/JSONException
    //   1403	1419	1422	org/json/JSONException
    //   1423	1467	1499	org/json/JSONException
    //   1472	1496	1499	org/json/JSONException
    //   3811	3832	3955	java/lang/Exception
  }
  
  public void i()
  {
    if (!o.r()) {
      return;
    }
    Object localObject = new JinZhengRequestData();
    ((JinZhengRequestData)localObject).setType("JinzhengKQZJ_600402");
    ((JinZhengRequestData)localObject).setService_id("600402");
    ((JinZhengRequestData)localObject).setCompany_id(o.q);
    ((JinZhengRequestData)localObject).setUser_id(o.p);
    ((JinZhengRequestData)localObject).setUser_id_cls("2");
    ((JinZhengRequestData)localObject).setSession(o.g);
    ((JinZhengRequestData)localObject).setCurrency("0");
    localObject = ((JinZhengRequestData)localObject).jinzhengJson();
    System.out.println("requestData = " + (String)localObject);
    this.q = new t();
    this.q.c(f.Q);
    this.q.c("Content-Type", "application/json");
    try
    {
      localObject = new StringEntity((String)localObject, "UTF-8");
      this.q.a((HttpEntity)localObject);
      registRequestListener(this.q);
      a(this.q, true);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    a();
  }
  
  public void j()
  {
    if (this.W == null) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    String str4;
    String str2;
    String str3;
    int k;
    String str1;
    if (this.ae == 0)
    {
      str4 = this.ah.getText().toString();
      str2 = this.ai.getText().toString();
      str3 = this.af.getText().toString();
      k = this.Q[this.L.getSelectedItemPosition()];
      str1 = this.bb[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      this.ac = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11122").a("1193", this.ae).a("1186", str1).a("1189", str4).a("1031", str2).a("1192", str3).a("1028", k).h()) });
      registRequestListener(this.ac);
      a(this.ac, true);
      return;
      if (this.ae == 1)
      {
        str4 = this.am.getText().toString();
        str2 = this.al.getText().toString();
        str3 = this.ag.getText().toString();
        k = this.Q[this.M.getSelectedItemPosition()];
        str1 = this.bb[this.M.getSelectedItemPosition()];
      }
      else
      {
        str4 = "";
        str3 = "";
        str2 = "";
        str1 = "";
        k = 0;
      }
    }
  }
  
  public void k()
  {
    if (!this.m) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    SecretToolkit localSecretToolkit = SecretToolkit.getInstance();
    String str3;
    String str1;
    String str2;
    int k;
    String str4;
    if (this.ae == 0)
    {
      str3 = localSecretToolkit.secretIn_password(this.ah.getText().toString());
      str1 = "";
      str2 = this.af.getText().toString();
      k = this.Q[this.L.getSelectedItemPosition()];
      str4 = this.bb[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      this.h = new e();
      this.h.c("https://uatopen.hs.net/secu/v1/banktransfer");
      this.h.b("UTF-8");
      this.h.a("Bearer " + o.d);
      this.h.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.h.a("sendercomp_id", "90013");
      this.h.a("bank_no", this.bb[0]);
      this.h.a("money_type", String.valueOf(k));
      this.h.a("client_account", "");
      this.h.a("transfer_direction", String.valueOf(this.ae + 1));
      this.h.a("occur_balance", str2);
      this.h.a("fund_password", str1);
      this.h.a("bank_password", str3);
      this.h.a("bank_account", "");
      this.h.a("secret_key_info", localSecretToolkit.secretIn_secretkeyinfo());
      registRequestListener(this.h);
      a(this.h, true);
      return;
      if (this.ae == 1)
      {
        str3 = "";
        str1 = localSecretToolkit.secretIn_password(this.al.getText().toString());
        str2 = this.ag.getText().toString();
        k = this.Q[this.M.getSelectedItemPosition()];
        str4 = this.bb[this.M.getSelectedItemPosition()];
      }
      else
      {
        str3 = "";
        str2 = "";
        str1 = "";
        k = 0;
      }
    }
  }
  
  public void l()
  {
    if (!this.u) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    Object localObject = this.ah.getText().toString();
    String str1 = this.af.getText().toString();
    int k = this.Q[this.L.getSelectedItemPosition()];
    String str2 = this.bb[this.L.getSelectedItemPosition()];
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setType("JinzhengYHZZQ_600210");
    localJinZhengRequestData.setService_id("600210");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id(o.p);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setSession(o.g);
    localJinZhengRequestData.setCurrency(k + "");
    localJinZhengRequestData.setExt_inst(str2);
    localJinZhengRequestData.setCptl_amt(str1);
    localJinZhengRequestData.setExt_acc_pwd(new KDEnCode().KDEncode(6, (String)localObject, "410301"));
    localJinZhengRequestData.setCharacter_ter(o.h);
    localJinZhengRequestData.setExt_serial_no(o.b(this));
    localObject = localJinZhengRequestData.jinzhengJson();
    System.out.println("requestData = " + (String)localObject);
    this.s = new t();
    this.s.c(f.Q);
    this.s.c("Content-Type", "application/json");
    try
    {
      localObject = new StringEntity((String)localObject, "UTF-8");
      this.s.a((HttpEntity)localObject);
      registRequestListener(this.s);
      a(this.s, true);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void m()
  {
    if (!this.u) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    Object localObject = this.al.getText().toString();
    String str1 = this.ag.getText().toString();
    int k = this.Q[this.M.getSelectedItemPosition()];
    String str2 = this.bb[this.M.getSelectedItemPosition()];
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setType("JinzhengZQZYH_600220");
    localJinZhengRequestData.setService_id("600220");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id(o.p);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setSession(o.g);
    localJinZhengRequestData.setCurrency(k + "");
    localJinZhengRequestData.setExt_inst(str2);
    localJinZhengRequestData.setCptl_amt(str1);
    localJinZhengRequestData.setAcc_pwd(new KDEnCode().KDEncode(6, (String)localObject, "410301"));
    localJinZhengRequestData.setCharacter_ter(o.h);
    localJinZhengRequestData.setExt_serial_no(o.b(this));
    localObject = localJinZhengRequestData.jinzhengJson();
    System.out.println("requestData = " + (String)localObject);
    this.t = new t();
    this.t.c(f.Q);
    this.t.c("Content-Type", "application/json");
    try
    {
      localObject = new StringEntity((String)localObject, "UTF-8");
      this.t.a((HttpEntity)localObject);
      registRequestListener(this.t);
      a(this.t, true);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void n()
  {
    if ((this.W == null) || (this.Q == null)) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    String str;
    int k;
    if (this.ae == 0)
    {
      str = this.bb[this.L.getSelectedItemPosition()];
      k = this.Q[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      this.ab = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11126").a("1186", str).a("1189", this.aj.getText().toString()).a("1031", this.ak.getText().toString()).a("1028", k).h()) });
      registRequestListener(this.ab);
      a(this.ab, true);
      return;
      if (this.ae == 1)
      {
        str = this.bb[this.M.getSelectedItemPosition()];
        k = this.Q[this.M.getSelectedItemPosition()];
      }
      else
      {
        str = "";
        k = 0;
      }
    }
  }
  
  public void o()
  {
    if ((!this.m) || (this.Q == null)) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    String str = "";
    int k = 0;
    if (this.ae == 0)
    {
      str = this.bb[this.L.getSelectedItemPosition()];
      k = this.Q[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      SecretToolkit localSecretToolkit = SecretToolkit.getInstance();
      this.i = new e();
      this.i.c("https://uatopen.hs.net/secu/v1/bankbalance_qry");
      this.i.b("UTF-8");
      this.i.a("Bearer " + o.d);
      this.i.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.i.a("sendercomp_id", "90013");
      this.i.a("money_type", k + "");
      this.i.a("bank_no", str);
      this.i.a("client_account", "");
      this.i.a("fund_password", "");
      this.i.a("bank_password", localSecretToolkit.secretIn_password(this.aj.getText().toString()));
      this.i.a("secret_key_info", localSecretToolkit.secretIn_secretkeyinfo());
      this.i.a("bank_account", "");
      registRequestListener(this.i);
      a(this.i, true);
      return;
      if (this.ae == 1)
      {
        str = this.bb[this.M.getSelectedItemPosition()];
        k = this.Q[this.M.getSelectedItemPosition()];
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131561137: 
      this.D.setCurrentItem(0);
      a(0);
      return;
    case 2131561138: 
      this.D.setCurrentItem(1);
      a(1);
      return;
    case 2131561139: 
      this.D.setCurrentItem(2);
      a(2);
      return;
    case 2131561108: 
      if (!s())
      {
        paramView = Toast.makeText(this, "　　没能获取可用的银行列表信息，请重试。", 0);
        paramView.setGravity(17, 0, 0);
        paramView.show();
        return;
      }
      d(0);
      return;
    case 2131561134: 
      if (!s())
      {
        paramView = Toast.makeText(this, "　　没能获取可用的银行列表信息，请重试。", 0);
        paramView.setGravity(17, 0, 0);
        paramView.show();
        return;
      }
      d(1);
      return;
    case 2131561117: 
      d(2);
      return;
    case 2131558777: 
      this.aA = 0;
      this.an.a();
      if (o.l())
      {
        this.n = "";
        b(true);
        return;
      }
      if (o.m())
      {
        c(true);
        return;
      }
      a(true);
      return;
    case 2131558775: 
      new DatePickerDialog(this, this.bc, this.aP, this.aQ - 1, this.aR).show();
      return;
    }
    new DatePickerDialog(this, this.bd, this.aT, this.aU - 1, this.aV).show();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void p()
  {
    if ((!this.u) || (this.Q == null)) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    Object localObject = "";
    int k = 0;
    if (this.ae == 0)
    {
      localObject = this.bb[this.L.getSelectedItemPosition()];
      k = this.Q[this.L.getSelectedItemPosition()];
    }
    for (;;)
    {
      JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
      localJinZhengRequestData.setType("JinzhengYECX_600310");
      localJinZhengRequestData.setService_id("600310");
      localJinZhengRequestData.setCompany_id(o.q);
      localJinZhengRequestData.setUser_id(o.p);
      localJinZhengRequestData.setUser_id_cls("2");
      localJinZhengRequestData.setSession(o.g);
      localJinZhengRequestData.setCurrency(k + "");
      localJinZhengRequestData.setExt_inst((String)localObject);
      localObject = localJinZhengRequestData.jinzhengJson();
      System.out.println("requestData = " + (String)localObject);
      this.p = new t();
      this.p.c(f.Q);
      this.p.c("Content-Type", "application/json");
      try
      {
        localObject = new StringEntity((String)localObject, "UTF-8");
        this.p.a((HttpEntity)localObject);
        registRequestListener(this.p);
        a(this.p, true);
        return;
        if (this.ae != 1) {
          continue;
        }
        localObject = this.bb[this.M.getSelectedItemPosition()];
        k = this.Q[this.M.getSelectedItemPosition()];
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\TransferMenuNew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */