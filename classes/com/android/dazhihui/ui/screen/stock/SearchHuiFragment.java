package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.r;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.model.stock.SearchHuiShowConfigVo;
import com.android.dazhihui.ui.model.stock.SearchHuiVo.SearchHuiResult;
import com.android.dazhihui.ui.model.stock.SearchHuiVo.SearchSuggestResult;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.w;
import com.c.a.k;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.cloud.ui.RecognizerDialogListener;
import com.iflytek.speech.util.JsonParser;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class SearchHuiFragment
  extends com.android.dazhihui.ui.screen.a
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  private int A = 0;
  private int B = 0;
  private SearchHuiShowConfigVo C;
  private f D;
  private View E;
  private TextView F;
  private TextView G;
  private TextView H;
  private SpeechRecognizer I;
  private RecognizerDialog J;
  private HashMap<String, String> K = new LinkedHashMap();
  private Toast L;
  private String M = "cloud";
  private int N = 0;
  private View O;
  private InitListener P = new qu(this);
  private RecognizerDialogListener Q = new qj(this);
  private RecognizerListener R = new qk(this);
  View a;
  View b;
  ListView c;
  EditText d;
  View e;
  View f;
  qx g;
  TextView h;
  View i;
  ArrayList<SearchHuiVo.SearchSuggestResult> j;
  String k = null;
  View l;
  View m;
  TextView n;
  ListView o;
  View p;
  Handler q = new qp(this);
  int r = 0;
  private f s;
  private ArrayList<String> t;
  private qv u;
  private View v;
  private final int w = 20;
  private TextView x;
  private MyWebView y;
  private View z;
  
  private void a(RecognizerResult paramRecognizerResult)
  {
    String str = JsonParser.parseIatResult(paramRecognizerResult.getResultString());
    Object localObject = null;
    try
    {
      paramRecognizerResult = new JSONObject(paramRecognizerResult.getResultString()).optString("sn");
      this.K.put(paramRecognizerResult, str);
      paramRecognizerResult = new StringBuffer();
      localObject = this.K.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        paramRecognizerResult.append((String)this.K.get(str));
      }
    }
    catch (JSONException paramRecognizerResult)
    {
      for (;;)
      {
        paramRecognizerResult.printStackTrace();
        paramRecognizerResult = (RecognizerResult)localObject;
      }
      if ((this.C != null) && (this.C.isVoiceGo.booleanValue() == true))
      {
        this.B += 1;
        localObject = new Message();
        ((Message)localObject).what = 572671044;
        ((Message)localObject).obj = paramRecognizerResult.toString();
        this.q.sendMessageDelayed((Message)localObject, 800L);
        return;
      }
      this.d.setText(paramRecognizerResult.toString());
      this.d.setSelection(this.d.getText().length());
    }
  }
  
  private void a(String paramString1, int paramInt, String paramString2)
  {
    paramString1 = paramString1.trim();
    this.d.setText(paramString1);
    this.d.setSelection(this.d.getText().length());
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.startsWith("@@")))
    {
      this.t.remove(paramString1);
      this.t.add(0, paramString1);
    }
    if (this.t.size() > 20) {
      this.t.remove(20);
    }
    this.u.notifyDataSetChanged();
    a(this.t);
    b(paramString1, paramInt, paramString2);
  }
  
  private void b(String paramString)
  {
    this.L.setText(paramString);
    this.L.show();
  }
  
  private void b(String paramString1, int paramInt, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      this.s = new f();
      if (paramInt != 0) {
        break label100;
      }
      this.s.c("http://gwapi.bankuang.com/router?wt=json&q=" + paramString1 + "&voice=" + this.N + "&token=" + w.a().o() + "&qs=0");
    }
    for (;;)
    {
      registRequestListener(this.s);
      sendRequest(this.s);
      return;
      label100:
      this.s.c("http://gwapi.bankuang.com/router?wt=json&q=" + paramString1 + "&voice=" + this.N + "&token=" + w.a().o() + "&qs=1" + "&key=" + paramString2);
    }
  }
  
  private void d()
  {
    this.y.setBackgroundColor(0);
    this.y.setWebViewLoadListener(new qq(this));
    this.y.setLayerType(2, null);
    this.y.loadUrl("http://i.bankuang.com/#!/homeNav?&voice=" + this.N + "&token=" + w.a().o());
    this.y.requestLayout();
    this.y.postInvalidate();
  }
  
  public void a()
  {
    this.t = ((ArrayList)DzhApplication.a().b().a("historyHuilist", new qr(this)));
    if (this.t == null) {
      this.t = new ArrayList();
    }
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getActivity().getSystemService("input_method");
    if (paramBoolean.booleanValue())
    {
      paramView.requestFocus();
      localInputMethodManager.showSoftInput(paramView, 2);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString.trim())) {
      return;
    }
    if (TextUtils.isEmpty(this.k)) {
      this.k = o.a().c();
    }
    paramString = "http://gwapi.bankuang.com/qs?key=" + paramString;
    System.out.println("search url = " + paramString);
    new qs(this).execute(new String[] { paramString });
  }
  
  public void a(ArrayList<String> paramArrayList)
  {
    DzhApplication.a().b().a("historyHuilist", paramArrayList);
  }
  
  public void b()
  {
    this.I.setParameter("params", null);
    this.I.setParameter("engine_type", this.M);
    this.I.setParameter("result_type", "json");
    this.I.setParameter("language", "zh_cn");
    this.I.setParameter("accent", "mandarin");
    this.I.setParameter("vad_bos", "4000");
    this.I.setParameter("vad_eos", "1000");
    this.I.setParameter("asr_ptt", "0");
    this.I.setParameter("audio_format", "wav");
    this.I.setParameter("asr_audio_path", Environment.getExternalStorageDirectory() + "/msc/iat.wav");
  }
  
  public void c()
  {
    this.C = ((SearchHuiShowConfigVo)DzhApplication.a().b().a("mSearchHuiShowConfigVo", new ql(this)));
    if ((this.C == null) || (!this.C.isSameDay()))
    {
      this.D = new f();
      this.D.c("http://gwapi.bankuang.com/config");
      registRequestListener(this.D);
      sendRequest(this.D);
      return;
    }
    this.d.setHint(this.C.SearchBoxPlaceholder);
    this.H.setText(this.C.VoiceButtonText);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    switch (qm.a[paramy.ordinal()])
    {
    default: 
      return;
    }
    this.a.setBackgroundColor(getResources().getColor(2131493605));
    this.b.setBackgroundResource(2130838818);
    this.d.setTextColor(-14540254);
    this.x.setTextColor(-6710887);
    this.p.setBackgroundResource(2130838817);
    this.l.setBackgroundColor(-2697514);
    this.m.setBackgroundColor(-2697514);
    this.n.setTextColor(-14540254);
    this.G.setTextColor(-14540254);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      if (paramh == this.s)
      {
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        paramh = (SearchHuiVo.SearchHuiResult)new k().a(paramh, SearchHuiVo.SearchHuiResult.class);
        if (paramh != null)
        {
          if (paramh.type.equals("native"))
          {
            r.a(paramh.url, getActivity(), null, null);
            return;
          }
          if (paramh.type.equals("webview"))
          {
            paramj = new Intent();
            Bundle localBundle = new Bundle();
            localBundle.putString("nexturl", paramh.url);
            localBundle.putString("names", "慧搜");
            paramj.putExtras(localBundle);
            paramj.setClass(getActivity(), BrowserActivity.class);
            getActivity().startActivity(paramj);
          }
        }
      }
      else if (paramh == this.D)
      {
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        this.C = ((SearchHuiShowConfigVo)new k().a(paramh, SearchHuiShowConfigVo.class));
        if (this.C != null)
        {
          this.d.setHint(this.C.SearchBoxPlaceholder);
          this.H.setText(this.C.VoiceButtonText);
          DzhApplication.a().b().a("mSearchHuiShowConfigVo", this.C);
        }
      }
      return;
    }
    catch (Exception paramh) {}
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131560291: 
    case 2131560293: 
      do
      {
        return;
        this.d.setText("");
        this.E.setVisibility(8);
        return;
        if (((TextView)paramView).getText().toString().equals("取消"))
        {
          this.d.setFocusable(false);
          a(Boolean.valueOf(false), this.d);
          this.N = 0;
          this.E.setVisibility(8);
          return;
        }
      } while (!((TextView)paramView).getText().toString().equals("搜索"));
      a(this.d.getText().toString(), 0, null);
      return;
    case 2131560297: 
      a(this.d.getText().toString(), 0, null);
      return;
    case 2131560290: 
      this.d.setFocusable(true);
      this.d.setFocusableInTouchMode(true);
      this.d.requestFocus();
      this.d.findFocus();
      a(Boolean.valueOf(true), this.d);
      return;
    }
    this.t.clear();
    this.u.notifyDataSetChanged();
    this.o.setVisibility(8);
    a(this.t);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903399, paramViewGroup, true);
    this.c = ((ListView)this.a.findViewById(2131558568));
    this.b = this.a.findViewById(2131560289);
    this.d = ((EditText)this.a.findViewById(2131560290));
    this.e = this.a.findViewById(2131558861);
    this.f = this.a.findViewById(2131560291);
    this.l = this.a.findViewById(2131560292);
    this.n = ((TextView)this.a.findViewById(2131560293));
    this.n.setVisibility(8);
    this.d.setFocusable(false);
    this.i = this.a.findViewById(2131560295);
    this.h = ((TextView)this.a.findViewById(2131560296));
    this.z = this.a.findViewById(2131560301);
    this.O = this.a.findViewById(2131560300);
    this.H = ((TextView)this.a.findViewById(2131560302));
    this.o = ((ListView)this.a.findViewById(2131560294));
    paramViewGroup = new AbsListView.LayoutParams(-1, -2);
    this.v = paramLayoutInflater.inflate(2130903395, null);
    this.v.setLayoutParams(paramViewGroup);
    this.o.addFooterView(this.v);
    this.p = this.v.findViewById(2131560281);
    this.m = this.v.findViewById(2131560283);
    this.x = ((TextView)this.v.findViewById(2131560282));
    this.E = this.a.findViewById(2131560297);
    this.F = ((TextView)this.a.findViewById(2131560298));
    this.G = ((TextView)this.a.findViewById(2131560299));
    this.E.setOnClickListener(this);
    this.y = ((MyWebView)this.a.findViewById(2131558473));
    d();
    this.f.setOnClickListener(this);
    this.n.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.x.setOnClickListener(this);
    a();
    this.u = new qv(this);
    this.o.setAdapter(this.u);
    this.o.setOnItemClickListener(new qi(this));
    this.g = new qx(this);
    this.c.setAdapter(this.g);
    this.c.setOnItemClickListener(this);
    changeLookFace(com.android.dazhihui.g.a().b());
    this.d.addTextChangedListener(new qn(this));
    this.d.setOnFocusChangeListener(new qo(this));
    return this.a;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.I.cancel();
    this.I.destroy();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((!TextUtils.isEmpty(((SearchHuiVo.SearchSuggestResult)this.j.get(paramInt)).url)) && (!((SearchHuiVo.SearchSuggestResult)this.j.get(paramInt)).url.startsWith("@@")))
    {
      this.t.remove(((SearchHuiVo.SearchSuggestResult)this.j.get(paramInt)).url);
      this.t.add(0, ((SearchHuiVo.SearchSuggestResult)this.j.get(paramInt)).url);
    }
    if (this.t.size() > 20) {
      this.t.remove(20);
    }
    this.u.notifyDataSetChanged();
    a(this.t);
    b(((SearchHuiVo.SearchSuggestResult)this.j.get(paramInt)).url, 1, this.d.getText().toString().trim());
  }
  
  public void onPause()
  {
    super.onPause();
    ((AudioManager)getActivity().getApplicationContext().getSystemService("audio")).setStreamMute(3, false);
    this.I.stopListening();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    c();
    this.I = SpeechRecognizer.createRecognizer(getActivity(), this.P);
    this.J = new RecognizerDialog(getActivity(), this.P);
    this.L = Toast.makeText(getActivity(), "", 0);
    this.z.setOnTouchListener(new qt(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SearchHuiFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */