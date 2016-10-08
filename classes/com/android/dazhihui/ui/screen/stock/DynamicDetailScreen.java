package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.CommentListBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonCommentItem;
import com.android.dazhihui.ui.model.stock.JsonHDItem;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.AppendList;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DynamicDetailScreen
  extends BaseActivity
  implements View.OnClickListener, i, cp, cs, com.android.dazhihui.ui.widget.g
{
  private TextView a = null;
  private TextView b = null;
  private TextView c = null;
  private TextView d = null;
  private TextView e = null;
  private TextView f = null;
  private ImageView g = null;
  private EditText h = null;
  private TextView i = null;
  private AppendList j = null;
  private int k;
  private DzhHeader l;
  private String m;
  private ArrayList<String> n;
  private bn o = null;
  private View p;
  private m q = null;
  private JsonHDItem r = null;
  private ArrayList<JsonCommentItem> s = null;
  private long t = 0L;
  private int u = 0;
  private boolean v = false;
  private final long w = 5000L;
  
  private void a(String paramString)
  {
    Object localObject = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new CommentBodyField(3, com.android.dazhihui.g.a().v(), w.a().n(), w.a().g(), this.r.getId(), paramString));
    localLinkedHashMap.put("header", new HeaderField(101));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = ((k)localObject).a(paramString, new bj(this).getType());
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    this.q = new m((x)localObject, com.android.dazhihui.a.b.n.a);
    this.q.a(this);
    com.android.dazhihui.a.g.a().a(this.q);
  }
  
  private void d()
  {
    if (this.r != null)
    {
      this.b.setText(this.r.getTitle());
      this.b.setVisibility(0);
      this.a.setVisibility(8);
      this.c.setText(this.r.getSummary());
      this.d.setText(com.android.dazhihui.d.n.q(this.r.getOtime()));
      this.e.setText(String.format("浏览: %s", new Object[] { this.r.getBrowsec() }));
      this.f.setText(String.format("回复: %s", new Object[] { this.r.getRecoverc() }));
    }
  }
  
  private void e()
  {
    if (this.v)
    {
      this.j.a(2200, 3001, false);
      Toast.makeText(this, getResources().getString(2131165581), 0).show();
      return;
    }
    Object localObject1 = new r().a().b();
    Object localObject2 = new LinkedHashMap();
    ((Map)localObject2).put("data", new CommentListBodyField(1, this.r.getId(), this.u + 1));
    ((Map)localObject2).put("header", new HeaderField(101));
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(localObject2);
    localObject1 = ((k)localObject1).a(localArrayList, new bk(this).getType());
    localObject2 = new x(3005);
    ((x)localObject2).b(2);
    ((x)localObject2).a(((String)localObject1).getBytes());
    this.q = new m((x)localObject2, com.android.dazhihui.a.b.n.a);
    this.q.a(this);
    com.android.dazhihui.a.g.a().a(this.q);
  }
  
  private void f()
  {
    Intent localIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
    localIntent.putExtra("android.speech.extra.PROMPT", getString(2131166265));
    if ((this.n != null) && (this.n.size() > 0)) {
      this.n.clear();
    }
    startActivityForResult(localIntent, 1024);
  }
  
  private void g()
  {
    if (System.currentTimeMillis() - this.t < 5000L)
    {
      this.j.a(2100, 3001, false);
      Toast.makeText(this, getResources().getString(2131166004), 0).show();
      return;
    }
    i();
  }
  
  private void h()
  {
    i();
  }
  
  private void i()
  {
    if (this.s == null) {
      this.s = new ArrayList();
    }
    this.s.clear();
    this.o.notifyDataSetChanged();
    this.u = 0;
    this.v = false;
    e();
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      g();
    }
  }
  
  protected void a()
  {
    this.p = LayoutInflater.from(this).inflate(2130903556, null);
    this.a = ((TextView)this.p.findViewById(2131561229));
    this.b = ((TextView)this.p.findViewById(2131561228));
    this.c = ((TextView)this.p.findViewById(2131561230));
    this.d = ((TextView)this.p.findViewById(2131561231));
    this.e = ((TextView)this.p.findViewById(2131561232));
    this.f = ((TextView)this.p.findViewById(2131561233));
    this.j = ((AppendList)findViewById(2131558834));
    this.g = ((ImageView)findViewById(2131558830));
    this.h = ((EditText)findViewById(2131558833));
    this.i = ((TextView)findViewById(2131558617));
    this.l = ((DzhHeader)findViewById(2131558828));
  }
  
  public void a(View paramView, int paramInt)
  {
    if (paramInt == 2200)
    {
      paramView = (TextView)findViewById(2131559237);
      ProgressBar localProgressBar = (ProgressBar)findViewById(2131559239);
      if (this.u >= 0) {
        e();
      }
      localProgressBar.setVisibility(0);
      paramView.setText(getResources().getString(2131165396));
      return;
    }
    paramView = (TextView)findViewById(2131559240);
    paramView = (ProgressBar)findViewById(2131559242);
    g();
  }
  
  public void a(View paramView1, View paramView2)
  {
    ((ImageView)findViewById(2131559238)).setImageResource(2130837530);
    ((TextView)findViewById(2131559237)).setText(getResources().getString(2131165424));
    ((ProgressBar)findViewById(2131559239)).setVisibility(4);
    ((ImageView)findViewById(2131559241)).setImageResource(2130837529);
    ((TextView)findViewById(2131559240)).setText(getResources().getString(2131165423));
    ((ProgressBar)findViewById(2131559242)).setVisibility(4);
  }
  
  public void a(View paramView1, View paramView2, int paramInt) {}
  
  protected void b()
  {
    this.g.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.l.setOnHeaderButtonClickListener(this);
  }
  
  public void b(View paramView, int paramInt)
  {
    if (paramView.getId() == 2131559238)
    {
      localTextView = (TextView)findViewById(2131559237);
      if (paramInt == 4000)
      {
        ((ImageView)paramView).setImageResource(2130837530);
        localTextView.setText(getResources().getString(2131166190));
        return;
      }
      ((ImageView)paramView).setImageResource(2130837529);
      localTextView.setText(getResources().getString(2131165424));
      return;
    }
    TextView localTextView = (TextView)findViewById(2131559240);
    if (paramInt == 4000)
    {
      ((ImageView)paramView).setImageResource(2130837529);
      localTextView.setText(getResources().getString(2131166190));
      return;
    }
    ((ImageView)paramView).setImageResource(2130837530);
    localTextView.setText(getResources().getString(2131165423));
  }
  
  public void b(View paramView1, View paramView2, int paramInt)
  {
    if (paramInt == 2200)
    {
      ((TextView)findViewById(2131559237)).setText(getResources().getString(2131165424));
      return;
    }
    ((TextView)findViewById(2131559240)).setText(getResources().getString(2131165423));
  }
  
  protected void c()
  {
    this.o = new bn(this);
    this.j.a(this.p);
    this.j.setDivider(getResources().getDrawable(2130838348));
    this.j.setAdapter(this.o);
    this.j.setOnLoadingListener(this);
    this.j.b(AnimationUtils.loadAnimation(getApplicationContext(), 2130968624), AnimationUtils.loadAnimation(getApplicationContext(), 2130968622), 2131559238);
    this.j.a(AnimationUtils.loadAnimation(getApplicationContext(), 2130968624), AnimationUtils.loadAnimation(getApplicationContext(), 2130968622), 2131559241);
    e();
    if (TextUtils.isEmpty(this.m)) {
      this.m = "盘中直击";
    }
    this.l.a(this, this);
  }
  
  public void c(View paramView1, View paramView2, int paramInt)
  {
    if (paramInt == 2200)
    {
      ((ProgressBar)findViewById(2131559239)).setVisibility(4);
      return;
    }
    ((ProgressBar)findViewById(2131559242)).setVisibility(4);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (bm.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.l == null);
      this.l.a(paramy);
      return;
    } while (this.l == null);
    this.l.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8744;
    paramct.d = this.m;
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.q)
    {
      paramh = ((o)paramj).h();
      if ((paramh != null) && (paramh.a == 3005))
      {
        paramj = new q(paramh.b);
        int i1 = (short)(paramh.b.length - 1);
        paramj.b();
        paramh = new String(paramh.b, 1, i1);
        com.android.dazhihui.d.n.d("OFF", "CONTENT" + paramh);
      }
    }
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty(paramh))
        {
          showShortToast("Empty Json data ");
          if (this.k == 2100)
          {
            this.j.a(2100, 3001, false);
            return;
          }
          this.j.a(2200, 3001, false);
          return;
        }
        Object localObject = new JSONArray(paramh).getJSONObject(0);
        paramj = new k();
        paramh = (JsonHeader)paramj.a(((JSONObject)localObject).getJSONObject("header").toString(), JsonHeader.class);
        if (("1".equals(paramh.getError())) && ("111".equals(paramh.getService())))
        {
          str = paramh.getType();
          if (!"1".equals(str)) {
            continue;
          }
          Toast.makeText(this, getResources().getString(2131165394), 0).show();
        }
        if (!"1".equals(paramh.getType())) {
          break label648;
        }
        localObject = ((JSONObject)localObject).getJSONArray("data");
        if (this.s == null) {
          this.s = new ArrayList();
        }
        com.android.dazhihui.d.n.c("data: " + ((JSONArray)localObject).toString());
        paramj = (ArrayList)paramj.a(((JSONArray)localObject).toString(), new bl(this).getType());
        if ((paramj == null) || (paramj.size() <= 0)) {
          continue;
        }
        if ((paramh.getNext() == null) || (paramh.getNext().equals(""))) {
          this.v = true;
        }
        if (this.r == null) {
          this.r = new JsonHDItem();
        }
        if (this.u == 0)
        {
          paramh = (JsonCommentItem)paramj.remove(0);
          this.r.setId(paramh.getId());
          this.r.setIp(paramh.getIp());
          this.r.setSummary(paramh.getContent());
          this.r.setOtime(paramh.getCtime());
          if (!TextUtils.isEmpty(paramh.getTitle())) {
            this.r.setTitle(paramh.getTitle());
          }
        }
        this.s.addAll(paramj);
        this.o.a(this.s);
        this.t = System.currentTimeMillis();
        this.u += 1;
      }
      catch (JSONException paramh)
      {
        String str;
        paramh.printStackTrace();
        if (this.k != 2100) {
          break label711;
        }
        this.j.a(2100, 3001, false);
        return;
        Toast.makeText(this, getResources().getString(2131165397), 0).show();
        continue;
      }
      finally
      {
        if (this.k != 2100) {
          break label726;
        }
      }
      if (this.k != 2100) {
        break label696;
      }
      this.j.a(2100, 3001, false);
      return;
      if ("3".equals(str)) {
        Toast.makeText(this, getResources().getString(2131165359), 0).show();
      }
    }
    this.j.a(2100, 3001, false);
    for (;;)
    {
      throw paramh;
      label648:
      if (!"3".equals(paramh.getType())) {
        break;
      }
      Toast.makeText(this, getResources().getString(2131165360), 0).show();
      h();
      this.h.setText("");
      break;
      label696:
      this.j.a(2200, 3001, false);
      return;
      label711:
      this.j.a(2200, 3001, false);
      return;
      label726:
      this.j.a(2200, 3001, false);
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent();
    this.r = ((JsonHDItem)paramBundle.getSerializableExtra("data"));
    this.m = paramBundle.getStringExtra("title");
    setContentView(2130903100);
    a();
    b();
    c();
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558830: 
      if (getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() != 0)
      {
        f();
        return;
      }
      Toast.makeText(this, 2131166013, 0).show();
      return;
    }
    paramView = this.h.getEditableText().toString();
    if ((paramView == null) || ("".equals(paramView)))
    {
      Toast.makeText(this, getResources().getString(2131165357), 0).show();
      return;
    }
    a(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\DynamicDetailScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */