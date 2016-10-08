package com.android.dazhihui.ui.screen;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertBitmap;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LeftMenuVo.ShowTime;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.widget.adv.GifView;
import com.android.dazhihui.ui.widget.adv.ad;
import com.android.dazhihui.ui.widget.stockchart.StockChartPager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class InitScreen
  extends Activity
{
  private int a = 3000;
  private ViewFlipper b;
  private AdvertVo.AdvertBitmap c;
  private ViewTreeObserver.OnPreDrawListener d;
  private RTBAdvertResultVo e;
  private GifView f;
  private View g;
  private TextView h;
  private int i;
  private x j = new x(this);
  
  /* Error */
  private void a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 54
    //   3: iconst_0
    //   4: invokevirtual 58	com/android/dazhihui/ui/screen/InitScreen:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   7: astore 5
    //   9: aload 5
    //   11: ldc 60
    //   13: ldc 62
    //   15: invokeinterface 68 3 0
    //   20: astore 6
    //   22: aload_1
    //   23: invokevirtual 74	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   26: astore_2
    //   27: aload_2
    //   28: aload_1
    //   29: invokevirtual 78	android/content/Context:getPackageName	()Ljava/lang/String;
    //   32: iconst_0
    //   33: invokevirtual 84	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   36: getfield 90	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   39: astore_3
    //   40: aload_3
    //   41: astore_2
    //   42: aload_3
    //   43: invokestatic 96	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   46: ifeq +10 -> 56
    //   49: aload_1
    //   50: ldc 97
    //   52: invokevirtual 100	android/content/Context:getString	(I)Ljava/lang/String;
    //   55: astore_2
    //   56: aload 6
    //   58: invokestatic 96	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   61: ifne +12 -> 73
    //   64: aload 6
    //   66: aload_2
    //   67: invokevirtual 106	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   70: ifne +29 -> 99
    //   73: aload_1
    //   74: ldc 108
    //   76: iconst_0
    //   77: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   80: invokeinterface 113 1 0
    //   85: ldc 115
    //   87: iconst_1
    //   88: invokeinterface 121 3 0
    //   93: invokeinterface 125 1 0
    //   98: pop
    //   99: aload 6
    //   101: invokestatic 96	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   104: ifne +12 -> 116
    //   107: aload 6
    //   109: aload_2
    //   110: invokevirtual 106	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   113: ifne +213 -> 326
    //   116: invokestatic 130	com/android/dazhihui/ui/a/a:c	()Lcom/android/dazhihui/ui/a/a;
    //   119: aconst_null
    //   120: invokevirtual 133	com/android/dazhihui/ui/a/a:a	(Lcom/android/dazhihui/ui/model/stock/AdvertVo;)V
    //   123: invokestatic 130	com/android/dazhihui/ui/a/a:c	()Lcom/android/dazhihui/ui/a/a;
    //   126: aconst_null
    //   127: invokevirtual 136	com/android/dazhihui/ui/a/a:a	(Lcom/android/dazhihui/ui/model/stock/GroupAdvertVo;)V
    //   130: invokestatic 130	com/android/dazhihui/ui/a/a:c	()Lcom/android/dazhihui/ui/a/a;
    //   133: iconst_0
    //   134: putfield 137	com/android/dazhihui/ui/a/a:a	I
    //   137: invokestatic 142	com/android/dazhihui/DzhApplication:a	()Lcom/android/dazhihui/DzhApplication;
    //   140: invokevirtual 145	com/android/dazhihui/DzhApplication:b	()Lcom/android/dazhihui/c/b/a;
    //   143: aconst_null
    //   144: invokevirtual 150	com/android/dazhihui/c/b/a:a	(Ljava/lang/String;)V
    //   147: aload_1
    //   148: ldc -104
    //   150: iconst_0
    //   151: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   154: invokeinterface 113 1 0
    //   159: ldc -104
    //   161: invokeinterface 156 2 0
    //   166: invokeinterface 125 1 0
    //   171: pop
    //   172: aload_1
    //   173: ldc -98
    //   175: iconst_0
    //   176: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   179: invokeinterface 113 1 0
    //   184: ldc -98
    //   186: invokeinterface 156 2 0
    //   191: invokeinterface 125 1 0
    //   196: pop
    //   197: aload_1
    //   198: ldc -96
    //   200: iconst_0
    //   201: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   204: invokeinterface 113 1 0
    //   209: ldc -96
    //   211: invokeinterface 156 2 0
    //   216: invokeinterface 125 1 0
    //   221: pop
    //   222: aload_1
    //   223: ldc -94
    //   225: iconst_0
    //   226: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   229: invokeinterface 113 1 0
    //   234: ldc -92
    //   236: invokeinterface 156 2 0
    //   241: invokeinterface 125 1 0
    //   246: pop
    //   247: aload_1
    //   248: ldc -90
    //   250: iconst_0
    //   251: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   254: astore_1
    //   255: aload_1
    //   256: invokeinterface 113 1 0
    //   261: ldc -88
    //   263: invokeinterface 156 2 0
    //   268: invokeinterface 125 1 0
    //   273: pop
    //   274: aload_1
    //   275: invokeinterface 113 1 0
    //   280: ldc -86
    //   282: invokeinterface 156 2 0
    //   287: invokeinterface 125 1 0
    //   292: pop
    //   293: aload 5
    //   295: invokeinterface 113 1 0
    //   300: ldc 60
    //   302: aload_2
    //   303: invokeinterface 174 3 0
    //   308: invokeinterface 125 1 0
    //   313: pop
    //   314: return
    //   315: astore_3
    //   316: ldc 62
    //   318: astore_2
    //   319: aload_3
    //   320: invokevirtual 177	java/lang/Exception:printStackTrace	()V
    //   323: goto -267 -> 56
    //   326: invokestatic 130	com/android/dazhihui/ui/a/a:c	()Lcom/android/dazhihui/ui/a/a;
    //   329: aload_1
    //   330: aconst_null
    //   331: invokevirtual 180	com/android/dazhihui/ui/a/a:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   334: pop
    //   335: return
    //   336: astore 4
    //   338: aload_3
    //   339: astore_2
    //   340: aload 4
    //   342: astore_3
    //   343: goto -24 -> 319
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	InitScreen
    //   0	346	1	paramContext	android.content.Context
    //   26	314	2	localObject1	Object
    //   39	4	3	str1	String
    //   315	24	3	localException1	Exception
    //   342	1	3	localObject2	Object
    //   336	5	4	localException2	Exception
    //   7	287	5	localSharedPreferences	android.content.SharedPreferences
    //   20	88	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   27	40	315	java/lang/Exception
    //   42	56	336	java/lang/Exception
  }
  
  private void b()
  {
    Object localObject;
    if ((this.c != null) && (this.c.bytes != null))
    {
      this.a = 3000;
      this.f.setImage(this.c.bytes);
      this.f.setOnClickListener(new t(this));
      localObject = this.c.advData;
      if (!((AdvertVo.AdvertData)localObject).closetype.equals("0"))
      {
        this.a = 5000;
        this.g.setVisibility(0);
        this.g.setOnClickListener(new u(this));
      }
      if ((!TextUtils.isEmpty(((AdvertVo.AdvertData)localObject).intervals)) && (!((AdvertVo.AdvertData)localObject).intervals.equals("0")))
      {
        this.i = Integer.parseInt(((AdvertVo.AdvertData)localObject).intervals);
        this.a = (this.i * 1000);
        this.h.setVisibility(0);
        this.h.setText(((AdvertVo.AdvertData)localObject).intervals);
        this.h.postDelayed(new v(this), 1000L);
      }
      if (!TextUtils.isEmpty(this.c.advItem.countid)) {
        n.a(String.valueOf(this.c.advData.pcode), Integer.parseInt(this.c.advItem.countid));
      }
      this.b.showNext();
    }
    for (;;)
    {
      c();
      return;
      this.a = 1000;
      try
      {
        localObject = DateFormat.format("yyyy-MM-dd", System.currentTimeMillis()).toString();
        DzhApplication.a().b().a((String)localObject, "PushAd", "不存在109广告", 7);
      }
      catch (Exception localException) {}
    }
  }
  
  private void c()
  {
    this.b.removeCallbacks(this.j);
    this.b.postDelayed(this.j, this.a);
  }
  
  private void d()
  {
    Object localObject1 = getIntent();
    Object localObject2 = ((Intent)localObject1).getStringExtra("BUNDLE_ACTION");
    if (localObject2 == null) {
      startActivity(new Intent(this, MainScreen.class));
    }
    int k;
    for (;;)
    {
      finish();
      return;
      if (((String)localObject2).equals("com.dazhihui.android.ACTION_MAIN"))
      {
        k = ((Intent)localObject1).getIntExtra("index", 0);
        int m = ((Intent)localObject1).getIntExtra("index_type", 0);
        localObject1 = new Bundle();
        ((Bundle)localObject1).putInt("fragment_index", k);
        if (m == 1) {
          ((Bundle)localObject1).putInt("TAB_ID", q.d);
        }
        for (;;)
        {
          localObject2 = new Intent(this, MainScreen.class);
          ((Intent)localObject2).putExtras((Bundle)localObject1);
          startActivity((Intent)localObject2);
          break;
          if (m == 2) {
            ((Bundle)localObject1).putInt("TAB_ID", q.b);
          } else {
            ((Bundle)localObject1).putInt("TAB_ID", q.a);
          }
        }
      }
      if (!((String)localObject2).equals("com.dazhihui.android.START_LOTTERY")) {
        if (((String)localObject2).equals("com.dazhihui.android.START_FINANCIAL"))
        {
          com.android.dazhihui.d.r.a(this);
        }
        else if (((String)localObject2).equals("com.dazhihui.android.ACTION_VIEW_STOCK"))
        {
          localObject1 = new StockVo(((Intent)localObject1).getStringExtra("name"), ((Intent)localObject1).getStringExtra("code"), ((Intent)localObject1).getIntExtra("type", 1), false);
          localObject2 = new Bundle();
          ((Bundle)localObject2).putParcelable("stock_vo", (Parcelable)localObject1);
          com.android.dazhihui.d.r.a(this, (StockVo)localObject1, (Bundle)localObject2);
        }
        else
        {
          if (!((String)localObject2).equals("com.dazhihui.android.ACTION_TRADE")) {
            break;
          }
          o.a(this);
        }
      }
    }
    localObject2 = (LeftMenuVo)DzhApplication.a().b().a("LeftMenuJson", new w(this));
    localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    label339:
    Object localObject3;
    if ((localObject2 != null) && (((LeftMenuVo)localObject2).getShowTime() != null) && (((LeftMenuVo)localObject2).getShowTime().size() > 0))
    {
      localObject2 = ((LeftMenuVo)localObject2).getShowTime().iterator();
      if (!((Iterator)localObject2).hasNext()) {
        break label574;
      }
      localObject3 = (LeftMenuVo.ShowTime)((Iterator)localObject2).next();
    }
    for (;;)
    {
      try
      {
        Date localDate1 = new Date();
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(localDate1);
        Date localDate2 = ((SimpleDateFormat)localObject1).parse(str + " " + ((LeftMenuVo.ShowTime)localObject3).starTime);
        localObject3 = ((SimpleDateFormat)localObject1).parse(str + " " + ((LeftMenuVo.ShowTime)localObject3).endTime);
        if (!localDate1.after(localDate2)) {
          break label339;
        }
        boolean bool = localDate1.before((Date)localObject3);
        if (!bool) {
          break label339;
        }
        k = 1;
        if (k == 0) {
          break label512;
        }
        startActivity(new Intent(this, MainScreen.class));
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
      break label339;
      label512:
      localObject1 = new Intent(this, MainScreen.class);
      localObject2 = new Bundle();
      ((Bundle)localObject2).putInt("TAB_ID", q.c);
      ((Intent)localObject1).putExtras((Bundle)localObject2);
      startActivity((Intent)localObject1);
      break;
      startActivity(new Intent(this, MainScreen.class));
      break;
      label574:
      k = 0;
    }
  }
  
  public void a()
  {
    if (g.a().l() > 0) {
      return;
    }
    getWindow().findViewById(16908290);
    Rect localRect = new Rect();
    int k = localRect.top;
    getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    g.a().b(localRect.top);
    if (getWindow().findViewById(16908290).getTop() == 0) {}
    k = ((WindowManager)getSystemService("window")).getDefaultDisplay().getHeight() - localRect.bottom;
    g.a().c(k);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    g.a().a(localDisplayMetrics.density);
    g.a().d(localDisplayMetrics.widthPixels);
    g.a().e(localDisplayMetrics.heightPixels - localRect.top - k);
  }
  
  public void onBackPressed()
  {
    try
    {
      if (this.b != null) {
        this.b.removeCallbacks(this.j);
      }
      d();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(this);
    DzhPushService.a(this);
    g.a().g(true);
    paramBundle = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
    g.a().a(paramBundle.density);
    Object localObject = g.a();
    if (paramBundle.widthPixels <= paramBundle.heightPixels)
    {
      k = paramBundle.widthPixels;
      ((g)localObject).d(k);
      localObject = g.a();
      if (paramBundle.widthPixels > paramBundle.heightPixels) {
        break label416;
      }
    }
    label416:
    for (int k = paramBundle.heightPixels;; k = paramBundle.widthPixels)
    {
      ((g)localObject).e(k);
      StockChartPager.a();
      paramBundle = getIntent();
      k = paramBundle.getIntExtra("BUNDLE_SHORT", 0);
      g.a().b(paramBundle.getStringExtra("channel"));
      g.a().c(paramBundle.getStringExtra("bank_package_name"));
      g.a().d(paramBundle.getStringExtra("bank_class_name"));
      if ((k == 1) && (g.a().h()))
      {
        paramBundle = new StockVo(paramBundle.getStringExtra("name"), paramBundle.getStringExtra("code"), paramBundle.getIntExtra("type", 1), false);
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("stock_vo", paramBundle);
        com.android.dazhihui.d.r.a(this, paramBundle, (Bundle)localObject);
        finish();
      }
      setContentView(2130903216);
      this.b = ((ViewFlipper)findViewById(2131559503));
      this.b.postDelayed(this.j, this.a);
      this.b.setInAnimation(this, 2130968582);
      this.b.setOutAnimation(this, 2130968583);
      this.d = new r(this);
      this.b.getViewTreeObserver().addOnPreDrawListener(this.d);
      this.g = findViewById(2131559506);
      this.h = ((TextView)findViewById(2131559505));
      this.f = ((GifView)findViewById(2131559504));
      com.android.dazhihui.ui.a.a.c().d();
      if (com.android.dazhihui.ui.a.a.c().b() != null)
      {
        paramBundle = com.android.dazhihui.ui.a.a.c().b().getAdvert(109);
        if (paramBundle != null)
        {
          if (!paramBundle.isDSP) {
            break label424;
          }
          ad.a(this, 109, new s(this, paramBundle));
        }
      }
      return;
      k = paramBundle.heightPixels;
      break;
    }
    label424:
    this.c = com.android.dazhihui.ui.a.a.c().a(109, false);
    b();
  }
  
  public void onResume()
  {
    super.onResume();
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\InitScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */