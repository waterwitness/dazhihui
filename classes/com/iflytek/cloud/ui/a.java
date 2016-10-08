package com.iflytek.cloud.ui;

import android.content.Context;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.resource.Resource;
import com.iflytek.thirdparty.N;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.an;
import com.iflytek.thirdparty.aq;
import com.iflytek.thirdparty.ar;

public final class a
  extends aq
  implements View.OnClickListener
{
  public static int a = 9;
  private LinearLayout d;
  private ar e = null;
  private RotateAnimation f = null;
  private SpeechRecognizer g;
  private RecognizerDialogListener h;
  private long i = 0L;
  private RecognizerListener j = new a.1(this);
  private volatile int k;
  
  public a(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext.getApplicationContext());
    this.g = SpeechRecognizer.createRecognizer(paramContext.getApplicationContext(), paramInitListener);
    a();
  }
  
  private void a(SpeechError paramSpeechError)
  {
    try
    {
      LinearLayout localLinearLayout = (LinearLayout)this.d.findViewWithTag("error");
      a((TextView)localLinearLayout.findViewWithTag("errtxt"), paramSpeechError);
      localLinearLayout.findViewWithTag("errview").setBackgroundDrawable(an.a(getContext(), "warning"));
      setTag(paramSpeechError);
      this.k = 3;
      k();
      return;
    }
    catch (Exception paramSpeechError)
    {
      X.a(paramSpeechError);
    }
  }
  
  private void g()
  {
    X.a("startRecognizing");
    long l = this.i;
    this.i = SystemClock.elapsedRealtime();
    if (this.i - l < 300L) {
      return;
    }
    this.g.setParameter("msc.skin", "default");
    int m = this.g.startListening(this.j);
    if (m != 0)
    {
      a(new SpeechError(m));
      return;
    }
    i();
  }
  
  private void h()
  {
    if (this.d != null)
    {
      this.d.destroyDrawingCache();
      this.d = null;
    }
    this.e = null;
    System.gc();
  }
  
  private void i()
  {
    if (this.e == null) {
      this.e = new ar(getContext().getApplicationContext());
    }
    this.k = 1;
    k();
  }
  
  private void j()
  {
    try
    {
      ((FrameLayout)this.d.findViewWithTag("waiting")).findViewWithTag("control").startAnimation(this.f);
      this.k = 2;
      k();
      return;
    }
    catch (Exception localException)
    {
      X.a(localException);
    }
  }
  
  private void k()
  {
    FrameLayout localFrameLayout = (FrameLayout)this.d.findViewWithTag("waiting");
    TextView localTextView1 = (TextView)this.d.findViewWithTag("title");
    LinearLayout localLinearLayout = (LinearLayout)this.d.findViewWithTag("error");
    TextView localTextView2 = (TextView)localFrameLayout.findViewWithTag("tips");
    if (this.k == 1)
    {
      localLinearLayout.setVisibility(8);
      localTextView1.setVisibility(0);
      localFrameLayout.setVisibility(8);
      localTextView1.setText(Resource.getTitle(2));
      this.e.a(0);
      this.e.invalidate();
      this.e.setVisibility(0);
    }
    do
    {
      return;
      if (this.k == 2)
      {
        localTextView1.setVisibility(8);
        this.e.setVisibility(8);
        localFrameLayout.setVisibility(0);
        localTextView2.setVisibility(0);
        localTextView2.setText(Resource.getTitle(3));
        return;
      }
    } while (this.k != 3);
    localTextView1.setVisibility(8);
    this.e.setVisibility(8);
    localFrameLayout.setVisibility(8);
    localLinearLayout.setVisibility(0);
  }
  
  public void a()
  {
    try
    {
      Object localObject = getContext().getApplicationContext();
      View localView = an.a((Context)localObject, "recognize", this);
      localView.setBackgroundDrawable(an.a(((Context)localObject).getApplicationContext(), "voice_bg.9"));
      this.d = ((LinearLayout)localView.findViewWithTag("container"));
      N.a(this);
      this.e = new ar(((Context)localObject).getApplicationContext());
      localObject = new LinearLayout.LayoutParams(-1, 0, 1.0F);
      ((LinearLayout.LayoutParams)localObject).bottomMargin = 20;
      this.d.addView(this.e, 1, (ViewGroup.LayoutParams)localObject);
      ((FrameLayout)this.d.findViewWithTag("waiting")).findViewWithTag("control").setBackgroundDrawable(an.a(getContext(), "waiting"));
      this.f = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
      this.f.setRepeatCount(-1);
      this.f.setInterpolator(new LinearInterpolator());
      this.f.setDuration(700L);
      return;
    }
    catch (Exception localException)
    {
      X.a(localException);
    }
  }
  
  public void a(TextView paramTextView, SpeechError paramSpeechError)
  {
    Object localObject1 = this.g.getParameter("view_tips_plain");
    if ((localObject1 != null) && ((((String)localObject1).equalsIgnoreCase("true")) || (((String)localObject1).equalsIgnoreCase("1")))) {}
    for (int m = 1;; m = 0)
    {
      if (m == 0) {}
      Object localObject2;
      int i1;
      for (boolean bool = true;; bool = false)
      {
        paramTextView.setText(Html.fromHtml(paramSpeechError.getHtmlDescription(bool)));
        paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
        paramTextView.bringToFront();
        localObject2 = paramTextView.getText();
        if (!(localObject2 instanceof Spannable)) {
          break label347;
        }
        i1 = ((CharSequence)localObject2).length();
        localObject1 = (Spannable)paramTextView.getText();
        URLSpan[] arrayOfURLSpan = (URLSpan[])((Spannable)localObject1).getSpans(0, i1, URLSpan.class);
        localObject2 = new SpannableStringBuilder((CharSequence)localObject2);
        ((SpannableStringBuilder)localObject2).clearSpans();
        i2 = arrayOfURLSpan.length;
        n = 0;
        while (n < i2)
        {
          URLSpan localURLSpan = arrayOfURLSpan[n];
          ((SpannableStringBuilder)localObject2).setSpan(new a.a(this, localURLSpan.getURL()), ((Spannable)localObject1).getSpanStart(localURLSpan), ((Spannable)localObject1).getSpanEnd(localURLSpan), 34);
          n += 1;
        }
      }
      int n = paramSpeechError.getHtmlDescription(false).length();
      int i2 = paramSpeechError.getHtmlDescription(true).length();
      int i3 = "<br>".length();
      ((SpannableStringBuilder)localObject2).setSpan(new ForegroundColorSpan(an.a()[0]), 0, n, 34);
      ((SpannableStringBuilder)localObject2).setSpan(new AbsoluteSizeSpan(an.b()[0], true), 0, n, 33);
      if (m == 0)
      {
        ((SpannableStringBuilder)localObject2).setSpan(new ForegroundColorSpan(an.a()[1]), n + 1, i2 - i3 + 1, 34);
        ((SpannableStringBuilder)localObject2).setSpan(new AbsoluteSizeSpan(an.b()[1], true), n + 1, i1, 34);
      }
      paramTextView.setText((CharSequence)localObject2);
      label347:
      return;
    }
  }
  
  public void a(RecognizerDialogListener paramRecognizerDialogListener)
  {
    this.h = paramRecognizerDialogListener;
    setOnClickListener(this);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.g.setParameter(paramString1, paramString2);
  }
  
  public void b()
  {
    super.b();
    g();
  }
  
  public void c()
  {
    if (this.g.isListening()) {
      this.g.cancel();
    }
    super.c();
  }
  
  protected boolean d()
  {
    if (super.d())
    {
      h();
      return this.g.destroy();
    }
    return false;
  }
  
  public void onClick(View paramView)
  {
    switch (this.k)
    {
    case 2: 
    default: 
      return;
    case 3: 
      if ((paramView.getTag() != null) && (((SpeechError)paramView.getTag()).getErrorCode() == 20001))
      {
        e();
        return;
      }
      g();
      return;
    }
    this.g.stopListening();
    j();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */