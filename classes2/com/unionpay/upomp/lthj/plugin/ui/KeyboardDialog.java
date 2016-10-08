package com.unionpay.upomp.lthj.plugin.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import com.f.a.a.bp;
import com.f.a.a.cl;
import com.f.a.a.d;
import com.f.a.a.ec;
import com.f.a.a.u;
import java.util.Date;
import java.util.Random;

public class KeyboardDialog
  extends Dialog
  implements View.OnClickListener, View.OnTouchListener, CompoundButton.OnCheckedChangeListener
{
  private Button[] A;
  private int B;
  private Context a;
  private WindowManager b;
  private EditText c;
  private EditText d;
  private Button e;
  private Button f;
  private RadioButton g;
  private RadioButton h;
  private RadioButton i;
  private Button j;
  private View k;
  private View l;
  private View m;
  private Button[] n;
  private Button[] o;
  private int[] p = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  private Button q;
  private boolean r;
  private LinearLayout s;
  private PopupWindow t;
  private int u;
  private View v;
  private int w;
  private int x;
  private Object y;
  private String[] z;
  
  public KeyboardDialog(Context paramContext)
  {
    super(paramContext);
    this.b = ((WindowManager)paramContext.getSystemService("window"));
    this.a = paramContext;
  }
  
  public KeyboardDialog(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.b = ((WindowManager)paramContext.getSystemService("window"));
    this.a = paramContext;
  }
  
  public KeyboardDialog(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super(paramContext, paramBoolean, paramOnCancelListener);
    this.b = ((WindowManager)paramContext.getSystemService("window"));
    this.a = paramContext;
  }
  
  private void a()
  {
    if (this.k != null)
    {
      this.e = ((Button)this.k.findViewById(bp.ce()));
      this.e.setOnClickListener(this);
      this.e.setOnTouchListener(this);
      this.n = new Button[10];
      Button localButton = (Button)this.k.findViewById(bp.bV());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[0] = localButton;
      localButton = (Button)this.k.findViewById(bp.bW());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[1] = localButton;
      localButton = (Button)this.k.findViewById(bp.bX());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[2] = localButton;
      localButton = (Button)this.k.findViewById(bp.bY());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[3] = localButton;
      localButton = (Button)this.k.findViewById(bp.bZ());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[4] = localButton;
      localButton = (Button)this.k.findViewById(bp.ca());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[5] = localButton;
      localButton = (Button)this.k.findViewById(bp.cb());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[6] = localButton;
      localButton = (Button)this.k.findViewById(bp.cc());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[7] = localButton;
      localButton = (Button)this.k.findViewById(bp.cd());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[8] = localButton;
      localButton = (Button)this.k.findViewById(bp.bU());
      localButton.setOnClickListener(this);
      localButton.setOnTouchListener(this);
      this.n[9] = localButton;
      if ((this.u != 5) && (this.u != 6) && (this.u != 4)) {
        a(this.p);
      }
      if ((this.p != null) && (this.p.length == 10))
      {
        int i1 = 0;
        while (i1 < this.p.length)
        {
          this.n[i1].setText(this.p[i1] + "");
          i1 += 1;
        }
      }
    }
  }
  
  private void a(char paramChar)
  {
    int i3 = this.d.getSelectionStart();
    int i1 = this.d.getSelectionEnd();
    if (i3 > i1) {}
    for (;;)
    {
      Editable localEditable = this.d.getText();
      if (paramChar != '\b') {
        if ((this.u == 0) && (localEditable.length() >= 6)) {
          break label55;
        }
      }
      for (;;)
      {
        label55:
        return;
        label157:
        label256:
        if (((this.u != 2) || (localEditable.length() < 3)) && ((this.u != 5) || (localEditable.length() < 11)) && ((this.u != 6) || (localEditable.length() < 6)) && ((this.u != 3) || (localEditable.length() < 6)))
        {
          if (this.u == 4)
          {
            if (this.d.getText().length() > 22) {
              break;
            }
            localEditable.replace(i1, i3, String.valueOf(paramChar), 0, 1);
            i1 += 1;
          }
          for (;;)
          {
            if (this.u == 4) {
              break label256;
            }
            this.d.setSelection(i1);
            return;
            if (this.d.getText().length() <= 11) {
              break label157;
            }
            return;
            i2 = i1;
            if (i1 == i3)
            {
              i2 = i1;
              if (i1 > 0) {
                i2 = i1 - 1;
              }
            }
            if (i2 + i3 == 0) {
              break;
            }
            localEditable.delete(i2, i3);
            i1 = i2;
          }
        }
      }
      int i2 = i1;
      i1 = i3;
      i3 = i2;
    }
  }
  
  private void a(int paramInt)
  {
    int i1 = 0;
    while (i1 <= 10)
    {
      this.A[i1].setText(this.z[(this.A.length * paramInt + i1)]);
      i1 += 1;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.l != null)
    {
      if (this.o == null)
      {
        this.e = ((Button)this.l.findViewById(bp.ce()));
        this.e.setOnClickListener(this);
        this.e.setOnTouchListener(this);
        this.o = new Button[26];
        Button localButton = (Button)this.l.findViewById(bp.ci());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[0] = localButton;
        localButton = (Button)this.l.findViewById(bp.cj());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[1] = localButton;
        localButton = (Button)this.l.findViewById(bp.ck());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[2] = localButton;
        localButton = (Button)this.l.findViewById(bp.cl());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[3] = localButton;
        localButton = (Button)this.l.findViewById(bp.cm());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[4] = localButton;
        localButton = (Button)this.l.findViewById(bp.cn());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[5] = localButton;
        localButton = (Button)this.l.findViewById(bp.co());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[6] = localButton;
        localButton = (Button)this.l.findViewById(bp.cp());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[7] = localButton;
        localButton = (Button)this.l.findViewById(bp.cq());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[8] = localButton;
        localButton = (Button)this.l.findViewById(bp.cr());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[9] = localButton;
        localButton = (Button)this.l.findViewById(bp.cs());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[10] = localButton;
        localButton = (Button)this.l.findViewById(bp.ct());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[11] = localButton;
        localButton = (Button)this.l.findViewById(bp.cu());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[12] = localButton;
        localButton = (Button)this.l.findViewById(bp.cv());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[13] = localButton;
        localButton = (Button)this.l.findViewById(bp.cw());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[14] = localButton;
        localButton = (Button)this.l.findViewById(bp.cx());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[15] = localButton;
        localButton = (Button)this.l.findViewById(bp.cy());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[16] = localButton;
        localButton = (Button)this.l.findViewById(bp.cz());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[17] = localButton;
        localButton = (Button)this.l.findViewById(bp.cA());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[18] = localButton;
        localButton = (Button)this.l.findViewById(bp.cN());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[19] = localButton;
        localButton = (Button)this.l.findViewById(bp.cO());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[20] = localButton;
        localButton = (Button)this.l.findViewById(bp.cP());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[21] = localButton;
        localButton = (Button)this.l.findViewById(bp.cQ());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[22] = localButton;
        localButton = (Button)this.l.findViewById(bp.cR());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[23] = localButton;
        localButton = (Button)this.l.findViewById(bp.cS());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[24] = localButton;
        localButton = (Button)this.l.findViewById(bp.cT());
        localButton.setOnClickListener(this);
        localButton.setOnTouchListener(this);
        this.o[25] = localButton;
      }
      int i1 = 0;
      if (i1 < this.o.length)
      {
        char c1;
        if (paramBoolean)
        {
          c1 = (char)(i1 + 97);
          this.o[i1].setText(c1 + "");
        }
        for (;;)
        {
          i1 += 1;
          break;
          c1 = (char)(i1 + 65);
          this.o[i1].setText(c1 + "");
        }
      }
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i1 = paramArrayOfInt.length;
    int[] arrayOfInt = a(1, i1 * i1 * i1, i1);
    i1 -= 1;
    while (i1 > 0)
    {
      int i2 = 0;
      while (i2 < i1)
      {
        if (arrayOfInt[i2] > arrayOfInt[(i2 + 1)])
        {
          int i3 = paramArrayOfInt[i2];
          paramArrayOfInt[i2] = paramArrayOfInt[(i2 + 1)];
          paramArrayOfInt[(i2 + 1)] = i3;
          i3 = arrayOfInt[i2];
          arrayOfInt[i2] = arrayOfInt[(i2 + 1)];
          arrayOfInt[(i2 + 1)] = i3;
        }
        i2 += 1;
      }
      i1 -= 1;
    }
  }
  
  private int[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt2) {}
    for (;;)
    {
      Random localRandom = new Random(new Date().getSeconds());
      int[] arrayOfInt = new int[paramInt3];
      int i1 = 0;
      while (i1 < paramInt3)
      {
        arrayOfInt[i1] = ((int)(localRandom.nextDouble() * (Math.abs(paramInt1 - paramInt2) + 1)) + paramInt2);
        i1 += 1;
      }
      return arrayOfInt;
      i1 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i1;
    }
  }
  
  private void b()
  {
    if (this.k != null)
    {
      this.e = ((Button)this.m.findViewById(bp.ce()));
      this.e.setOnClickListener(this);
      this.e.setOnTouchListener(this);
      this.z = new String[] { "!", "@", "#", "$", "%", "&", "*", "+", "-", "_", "下一页", "/", "?", ":", ";", ",", ".", "'", "\"", "^", "上一页", "下一页", "[", "]", "{", "}", "=", "(", ")", "\\", "~", "上一页", "下一页", "|", "<", ">", "€", "￥", "￡", "《", "》", "。", "…", "上一页" };
      this.A = new Button[11];
      this.A[0] = ((Button)this.m.findViewById(bp.cC()));
      this.A[1] = ((Button)this.m.findViewById(bp.cE()));
      this.A[2] = ((Button)this.m.findViewById(bp.cF()));
      this.A[3] = ((Button)this.m.findViewById(bp.cG()));
      this.A[4] = ((Button)this.m.findViewById(bp.cH()));
      this.A[5] = ((Button)this.m.findViewById(bp.cI()));
      this.A[6] = ((Button)this.m.findViewById(bp.cJ()));
      this.A[7] = ((Button)this.m.findViewById(bp.cK()));
      this.A[8] = ((Button)this.m.findViewById(bp.cL()));
      this.A[9] = ((Button)this.m.findViewById(bp.cD()));
      this.A[10] = ((Button)this.m.findViewById(bp.cM()));
      int i1 = 0;
      while (i1 < this.A.length)
      {
        this.A[i1].setOnClickListener(this);
        this.A[i1].setOnTouchListener(this);
        i1 += 1;
      }
      this.B = 0;
      a(this.B);
    }
  }
  
  public void dismiss()
  {
    super.dismiss();
    this.c.setClickable(true);
  }
  
  public int getType()
  {
    return this.u;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramCompoundButton != this.h) {
        break label115;
      }
      this.s.removeAllViews();
      if (this.l == null)
      {
        this.l = View.inflate(this.a, bp.G(), null);
        this.r = true;
        a(this.r);
        this.l.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
        this.q = ((Button)this.l.findViewById(bp.cB()));
        this.q.setOnTouchListener(this);
        this.q.setOnClickListener(this);
      }
      this.s.addView(this.l);
    }
    label115:
    do
    {
      return;
      if (paramCompoundButton == this.g)
      {
        this.s.removeAllViews();
        if (this.k == null)
        {
          this.k = View.inflate(this.a, bp.H(), null);
          a();
          this.k.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
        }
        this.s.addView(this.k);
        return;
      }
    } while (paramCompoundButton != this.i);
    this.s.removeAllViews();
    if (this.m == null)
    {
      this.m = View.inflate(this.a, bp.I(), null);
      b();
      this.m.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
    }
    this.s.addView(this.m);
  }
  
  public void onClick(View paramView)
  {
    boolean bool = true;
    if (paramView.getId() == bp.bi())
    {
      this.c.setClickable(true);
      dismiss();
      this.d.setText("");
      this.d = null;
      return;
    }
    if (paramView == this.q)
    {
      if (!this.r)
      {
        this.r = bool;
        if (!this.r) {
          break label93;
        }
        this.q.setText("shift");
      }
      for (;;)
      {
        a(this.r);
        return;
        bool = false;
        break;
        label93:
        this.q.setText("SHIFT");
      }
    }
    if (paramView.getId() == bp.ce())
    {
      a('\b');
      return;
    }
    int i1;
    if (paramView != this.f)
    {
      paramView = (Button)paramView;
      if (paramView.getText().equals(this.a.getString(bp.eh())))
      {
        i1 = this.B + 1;
        this.B = i1;
        a(i1);
        return;
      }
      if (paramView.getText().equals(this.a.getString(bp.ei())))
      {
        i1 = this.B - 1;
        this.B = i1;
        a(i1);
        return;
      }
      a(paramView.getText().charAt(0));
      return;
    }
    if ((this.u == 0) && (this.d.getText().length() != 6))
    {
      ec.b(this.a, this.a.getString(bp.dM()));
      return;
    }
    if ((this.u == 2) && (this.d.getText().length() != 3))
    {
      ec.b(this.a, this.a.getString(bp.dZ()));
      return;
    }
    if ((this.u == 1) && (this.d.getText().length() < 6))
    {
      ec.b(this.a, this.a.getString(bp.dL()));
      return;
    }
    if ((this.u == 9) && (this.d.getText().length() < 6))
    {
      ec.b(this.a, this.a.getString(bp.dL()));
      return;
    }
    if ((this.u == 7) && (this.d.getText().length() < 6))
    {
      ec.b(this.a, this.a.getString(bp.dL()));
      return;
    }
    if ((this.u == 8) && (this.d.getText().length() < 6))
    {
      ec.b(this.a, this.a.getString(bp.dL()));
      return;
    }
    if ((this.u == 5) && (this.d.getText().length() < 11))
    {
      ec.b(this.a, this.a.getString(bp.dA()));
      return;
    }
    if ((this.u == 6) && (this.d.getText().length() < 6))
    {
      ec.b(this.a, this.a.getString(bp.dB()));
      return;
    }
    paramView = new StringBuffer();
    paramView.append(this.d.getText().toString());
    if ((this.u == 5) || (this.u == 6) || (this.u == 4))
    {
      this.c.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
      switch (this.u)
      {
      }
    }
    for (;;)
    {
      dismiss();
      this.c.setText(paramView.toString());
      if ((paramView != null) && (paramView.toString().length() > 0))
      {
        i1 = paramView.length();
        this.c.setSelection(i1);
      }
      this.c.setClickable(true);
      this.c.dispatchKeyEvent(new KeyEvent(1, 66));
      paramView.delete(0, paramView.length());
      this.d.setText("");
      this.d = null;
      return;
      this.c.setTransformationMethod(PasswordTransformationMethod.getInstance());
      break;
      u.a().z.delete(0, u.a().z.length());
      u.a().z.append(new String(JniMethod.getJniMethod().encryptPinBlock(u.a().e.a.toString().getBytes(), u.a().e.a.toString().getBytes().length, paramView.toString().getBytes(), paramView.toString().getBytes().length)));
      i1 = 1;
      while (i1 <= paramView.length())
      {
        paramView.replace(i1 - 1, i1, "*");
        i1 += 1;
      }
      if (paramView.toString().matches("^(\\d+)|([A-Za-z]+)$"))
      {
        ec.b(getContext(), getContext().getString(bp.dz()));
        return;
      }
      byte[] arrayOfByte = JniMethod.getJniMethod().encryptPasswdLogin(paramView.toString().getBytes(), paramView.toString().length());
      u.a().e.d.setLength(0);
      u.a().e.d.append(new String(arrayOfByte));
      i1 = 1;
      while (i1 <= paramView.length())
      {
        paramView.replace(i1 - 1, i1, "*");
        i1 += 1;
      }
      arrayOfByte = JniMethod.getJniMethod().encryptPasswdLogin(paramView.toString().getBytes(), paramView.toString().length());
      u.a().e.c.setLength(0);
      u.a().e.c.append(new String(arrayOfByte));
      i1 = 1;
      while (i1 <= paramView.length())
      {
        paramView.replace(i1 - 1, i1, "*");
        i1 += 1;
      }
      arrayOfByte = JniMethod.getJniMethod().encryptPasswdLogin(paramView.toString().getBytes(), paramView.toString().length());
      u.a().C.setLength(0);
      u.a().C.append(new String(arrayOfByte));
      i1 = 1;
      while (i1 <= paramView.length())
      {
        paramView.replace(i1 - 1, i1, "*");
        i1 += 1;
      }
      if (paramView.toString().matches("^(\\d+)|([A-Za-z]+)$"))
      {
        ec.b(getContext(), getContext().getString(bp.dz()));
        return;
      }
      arrayOfByte = JniMethod.getJniMethod().encryptPasswdLogin(paramView.toString().getBytes(), paramView.toString().length());
      u.a().e.e.setLength(0);
      u.a().e.e.append(new String(arrayOfByte));
      i1 = 1;
      while (i1 <= paramView.length())
      {
        paramView.replace(i1 - 1, i1, "*");
        i1 += 1;
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(bp.F());
    paramBundle = (TextView)findViewById(bp.cX());
    switch (this.u)
    {
    default: 
      paramBundle.setText(bp.l());
      this.y = this.c.getTag();
      paramBundle = this.b.getDefaultDisplay();
      WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
      localLayoutParams.height = ((int)(paramBundle.getHeight() * 0.5D));
      if (this.a.getResources().getConfiguration().orientation == 2) {
        localLayoutParams.height = ((int)(paramBundle.getHeight() * 0.8D));
      }
      localLayoutParams.width = paramBundle.getWidth();
      localLayoutParams.x = 0;
      localLayoutParams.y = (paramBundle.getHeight() - localLayoutParams.height);
      getWindow().setAttributes(localLayoutParams);
      this.d = ((EditText)findViewById(bp.cU()));
      this.d.setText(this.c.getText().toString());
      if (this.c.getHint() != null) {
        this.d.setHint(this.c.getHint());
      }
      if ((this.d.getText() != null) && (this.d.getText().length() > 0)) {
        this.d.setSelection(this.d.getText().length());
      }
      if ((this.u == 5) || (this.u == 6) || (this.u == 4)) {
        this.d.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
      }
      break;
    }
    for (;;)
    {
      this.v = findViewById(bp.cW());
      this.j = ((Button)findViewById(bp.bi()));
      this.j.setOnClickListener(this);
      this.j.setOnTouchListener(this);
      this.s = ((LinearLayout)findViewById(bp.cV()));
      this.s.removeAllViews();
      this.f = ((Button)findViewById(bp.cg()));
      this.f.setOnClickListener(this);
      this.f.setOnTouchListener(this);
      this.g = ((RadioButton)findViewById(bp.bT()));
      this.h = ((RadioButton)findViewById(bp.cf()));
      this.i = ((RadioButton)findViewById(bp.ch()));
      this.g.setChecked(true);
      this.g.setOnCheckedChangeListener(this);
      this.h.setOnCheckedChangeListener(this);
      this.i.setOnCheckedChangeListener(this);
      if (this.u == 4) {
        this.d.addTextChangedListener(new cl(this.d));
      }
      if ((this.u == 0) || (this.u == 2) || (this.u == 3) || (this.u == 5) || (this.u == 6) || (this.u == 4))
      {
        this.h.setEnabled(false);
        this.i.setEnabled(false);
      }
      if (this.k == null)
      {
        this.k = View.inflate(this.a, bp.H(), null);
        a();
        this.k.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
        this.s.addView(this.k);
      }
      return;
      paramBundle.setText(bp.m());
      break;
      paramBundle.setText(bp.k());
      break;
      this.d.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    this.c.setClickable(true);
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onStop()
  {
    this.c.setError(null);
    super.onStop();
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.w = ((int)(this.i.getWidth() * 1.2D));
    this.x = ((int)(this.i.getHeight() * 1.2D));
    paramView = (Button)paramView;
    if (paramView.getText().toString().length() > 1) {}
    do
    {
      int i4;
      int i2;
      int i3;
      float f1;
      int i5;
      do
      {
        return false;
        i4 = paramView.getWidth();
        int i1 = paramView.getHeight();
        i2 = (int)(i4 * 1.2D);
        i3 = (int)(i1 * 1.2D);
        i1 = i2;
        if (i2 < this.w) {
          i1 = this.w;
        }
        i2 = i3;
        if (i3 < this.x) {
          i2 = this.x;
        }
        f1 = paramView.getTextSize();
        int[] arrayOfInt = new int[2];
        paramView.getLocationInWindow(arrayOfInt);
        i3 = arrayOfInt[0];
        i4 = (i1 - i4) / 2;
        i5 = arrayOfInt[1];
        if (paramMotionEvent.getAction() != 0) {
          break;
        }
        paramMotionEvent = new Button(this.a);
        paramMotionEvent.setWidth(i1);
        paramMotionEvent.setHeight(i2);
        paramMotionEvent.setGravity(17);
        paramMotionEvent.setText(paramView.getText().toString());
        paramMotionEvent.setBackgroundResource(bp.w());
      } while (paramMotionEvent.getText().toString().length() >= 2);
      paramMotionEvent.setTextSize(f1 * 1.3F);
      paramMotionEvent.setTypeface(Typeface.DEFAULT_BOLD);
      this.t = new PopupWindow(paramMotionEvent, -2, -2);
      this.t.showAtLocation(this.v, 51, i3 - i4, i5 - (int)(i2 * 1.3D));
      return false;
    } while ((1 != paramMotionEvent.getAction()) || (this.t == null));
    this.t.dismiss();
    return false;
  }
  
  public void setInputText(EditText paramEditText)
  {
    this.c = paramEditText;
  }
  
  public void setType(int paramInt)
  {
    this.u = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\KeyboardDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */