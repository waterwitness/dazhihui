package com.android.dazhihui.d;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.c.b.c;
import com.android.dazhihui.d.a.a;
import com.android.dazhihui.richscan.DzhRichScanActivity;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.moneybox.FundHome;
import com.android.dazhihui.ui.screen.q;
import com.android.dazhihui.ui.screen.stock.AboutActivity;
import com.android.dazhihui.ui.screen.stock.BBSMyStatementActivity;
import com.android.dazhihui.ui.screen.stock.DecisionScreen;
import com.android.dazhihui.ui.screen.stock.GetAddressBookActivity;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.MarketFocusScreen;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import com.android.dazhihui.ui.screen.stock.MessageCenterList;
import com.android.dazhihui.ui.screen.stock.MessageWarnScreen;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.stock.MorningPostScreen;
import com.android.dazhihui.ui.screen.stock.OptionListActivity;
import com.android.dazhihui.ui.screen.stock.PDFActivity;
import com.android.dazhihui.ui.screen.stock.PlateLinkageActivity;
import com.android.dazhihui.ui.screen.stock.ProfitExpectedScreen;
import com.android.dazhihui.ui.screen.stock.RecentBrowseStockScreen;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockMoreListScreen;
import com.android.dazhihui.ui.screen.stock.StockChartScreen;
import com.android.dazhihui.ui.screen.stock.SystemSetingScreen;
import com.android.dazhihui.ui.screen.stock.gx;
import com.android.dazhihui.ui.screen.stock.ti;
import com.android.dazhihui.ui.screen.stock.uc;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.w;
import com.cairh.app.sjkh.MainActivity;
import com.tencent.avsdk.Util;
import com.tencent.avsdk.activity.AvGuestActivity;
import com.tencent.avsdk.activity.IlvbAccountRechargeScreen;
import com.tencent.avsdk.activity.MyFavoriteActivity;
import com.tencent.avsdk.control.MyFavoriteManager;
import com.tencent.avsdkhost.activity.AvHostActivity;
import com.tencent.avsdkhost.control.IlvbHostPhotoManage;
import com.thinkive.mobile.account.base.IfassPluginManager;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Vector;
import org.json.JSONObject;

public final class r
{
  private static boolean a = false;
  private static int b;
  private static Context c;
  private static WebView d;
  private static String e;
  
  private static String a(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if ((i >= paramString.length()) || (paramString.charAt(i) == '&')) {
        return paramString.substring(0, i);
      }
      i += 1;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    int i = paramString1.indexOf(paramString2);
    if (i > 0)
    {
      Object localObject = String.valueOf(paramString1.charAt(i - 1));
      if ((!((String)localObject).equals("&")) && (!((String)localObject).equals("?"))) {
        return paramString1;
      }
      int j = paramString1.indexOf("&", i);
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(paramString1.substring(0, i + paramString2.length()));
      ((StringBuffer)localObject).append(paramString3);
      if (j > 0) {
        ((StringBuffer)localObject).append(paramString1.substring(j));
      }
      return ((StringBuffer)localObject).toString();
    }
    if (paramString1.contains("?")) {}
    for (paramString1 = paramString1 + "&" + paramString2 + paramString3;; paramString1 = paramString1 + "?" + paramString2 + paramString3) {
      return paramString1;
    }
  }
  
  private static void a(Activity paramActivity, WebView paramWebView, String paramString)
  {
    int j = Integer.parseInt(b("goto", paramString, "0"));
    int k = Integer.parseInt(b("type", paramString, "-1"));
    int i = Integer.parseInt(b("kind", paramString, "-1"));
    Object localObject10 = b("code", paramString, "");
    Object localObject11 = b("newcode", paramString, "");
    Object localObject9 = b("price", paramString, "0");
    int m = Integer.parseInt(b("screen", paramString, "-1"));
    Object localObject4 = "";
    try
    {
      localObject1 = URLDecoder.decode(b("name", paramString, ""), "utf-8");
      localObject4 = localObject1;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject1;
        localException1.printStackTrace();
      }
    }
    localObject1 = "";
    try
    {
      localObject6 = URLDecoder.decode(b("title", paramString, ""), "utf-8");
      localObject1 = localObject6;
    }
    catch (Exception localException4)
    {
      String str;
      do
      {
        for (;;)
        {
          Object localObject6;
          localException4.printStackTrace();
        }
        paramWebView = b("kind", paramString, "1");
      } while (paramActivity == null);
      i = 1;
      if (!paramWebView.equals("1")) {
        break label569;
      }
      i = 1;
      for (;;)
      {
        paramWebView = new Intent(paramActivity, MainScreen.class);
        paramString = new Bundle();
        paramString.putInt("TAB_ID", q.e);
        paramString.putInt("fragment_sub_index", i);
        paramWebView.putExtras(paramString);
        paramActivity.startActivity(paramWebView);
        return;
        if (paramWebView.equals("2")) {
          i = 2;
        } else if (paramWebView.equals("3")) {
          i = 3;
        } else if (paramWebView.equals("4")) {
          i = 4;
        }
      }
      new e(paramActivity, new aj(paramWebView), i).a((String)localObject12, (String)localObject9, (String)localObject10, str);
      return;
    }
    Object localObject12 = b("id", paramString, "-1");
    str = b("resource", paramString, "");
    label569:
    Object localObject3;
    Object localObject7;
    Object localObject5;
    if (j == 0) {
      if (m != -1)
      {
        localObject6 = new Bundle();
        localObject11 = new Intent();
        switch (m)
        {
        case 136: 
        case 137: 
        case 138: 
        case 139: 
        case 140: 
        case 141: 
        case 142: 
        case 181: 
        case 182: 
        case 183: 
        case 184: 
        case 185: 
        case 203: 
        default: 
        case 204: 
        case 202: 
        case 201: 
        case 200: 
        case 199: 
        case 188: 
        case 198: 
        case 197: 
        case 194: 
        case 195: 
        case 196: 
        case 193: 
        case 180: 
        case 189: 
        case 187: 
        case 186: 
        case 179: 
        case 190: 
        case 177: 
        case 175: 
        case 174: 
        case 170: 
        case 135: 
        case 144: 
          do
          {
            do
            {
              do
              {
                for (;;)
                {
                  return;
                  paramActivity.startActivity(new Intent(paramActivity, AboutActivity.class));
                  return;
                  paramWebView = paramActivity.getString(2131165457);
                  new AlertDialog.Builder(paramActivity).setMessage(paramWebView).setPositiveButton(paramActivity.getString(2131165363), new am(paramActivity)).setNegativeButton(paramActivity.getString(2131165331), new al()).setOnCancelListener(new ak()).create().show();
                  return;
                  paramWebView = LayoutInflater.from(paramActivity).inflate(2130903187, null);
                  paramString = new PopupWindow(paramWebView, -1, -2, true);
                  paramWebView.findViewById(2131559410).setOnClickListener(new an(paramString));
                  paramWebView.findViewById(2131559409).setOnClickListener(new ao(paramActivity, paramString));
                  paramWebView.findViewById(2131559408).setOnClickListener(new t(paramActivity, paramString));
                  paramString.setOutsideTouchable(true);
                  paramString.setBackgroundDrawable(new ColorDrawable(0));
                  paramString.setWindowLayoutMode(-1, -2);
                  paramString.showAtLocation(paramActivity.getWindow().getDecorView(), 81, 0, 0);
                  return;
                  if ((paramActivity != null) && ((paramActivity instanceof BrowserActivity)))
                  {
                    ((BrowserActivity)paramActivity).refresh();
                    return;
                    paramWebView = "http://www.baidu.com";
                    try
                    {
                      localObject2 = URLDecoder.decode(b("url", paramString, "http://www.baidu.com"), "utf-8");
                      paramWebView = (WebView)localObject2;
                    }
                    catch (Exception localException2)
                    {
                      for (;;)
                      {
                        Object localObject2;
                        localException2.printStackTrace();
                      }
                    }
                    j = 100;
                    i = 100;
                    try
                    {
                      localObject2 = b("proportion", paramString, "");
                      if (!TextUtils.isEmpty((CharSequence)localObject2))
                      {
                        i = ((String)localObject2).indexOf("_");
                        paramString = ((String)localObject2).substring(0, i);
                        localObject2 = ((String)localObject2).substring(i + 1, ((String)localObject2).length());
                        j = Integer.parseInt(paramString);
                        i = Integer.parseInt((String)localObject2);
                      }
                    }
                    catch (Exception paramString)
                    {
                      for (;;)
                      {
                        paramString = paramString;
                        paramString.printStackTrace();
                        j = 100;
                        i = 100;
                      }
                    }
                    finally {}
                    Log.i("ilvb", "上传图片 url=" + paramWebView + " outputX=" + j + " outputY=" + i);
                    if ((paramActivity != null) && (!TextUtils.isEmpty(paramWebView)) && ((paramActivity instanceof BrowserActivity)))
                    {
                      paramString = new IlvbHostPhotoManage(paramActivity);
                      paramString.setOutput(j, i);
                      localObject2 = LayoutInflater.from(paramActivity).inflate(2130903187, null);
                      localObject4 = new PopupWindow((View)localObject2, -1, -2, true);
                      ((View)localObject2).findViewById(2131559410).setOnClickListener(new u((PopupWindow)localObject4));
                      ((View)localObject2).findViewById(2131559409).setOnClickListener(new v(paramString, paramWebView, paramActivity, (PopupWindow)localObject4));
                      ((View)localObject2).findViewById(2131559408).setOnClickListener(new x(paramString, paramWebView, paramActivity, (PopupWindow)localObject4));
                      ((PopupWindow)localObject4).setOutsideTouchable(true);
                      ((PopupWindow)localObject4).setBackgroundDrawable(new ColorDrawable(0));
                      ((PopupWindow)localObject4).setWindowLayoutMode(-1, -2);
                      ((BrowserActivity)paramActivity).setIlvbHostPhotoManage(paramString);
                      ((PopupWindow)localObject4).showAtLocation(paramActivity.getWindow().getDecorView(), 81, 0, 0);
                      return;
                      if (paramActivity != null)
                      {
                        paramActivity.sendBroadcast(new Intent("com.dazhihui.avsdk.ACTION_SHOW_GIFT_VIEW"));
                        if ((!(paramActivity instanceof MainScreen)) && (!(paramActivity instanceof AvGuestActivity)) && (!(paramActivity instanceof AvHostActivity)))
                        {
                          paramActivity.finish();
                          return;
                          paramWebView = b("kind", paramString, "1");
                          if (paramActivity != null)
                          {
                            i = 1;
                            if (paramWebView.equals("1")) {
                              i = 0;
                            }
                            for (;;)
                            {
                              paramWebView = new Intent(paramActivity, MainScreen.class);
                              paramString = new Bundle();
                              paramString.putInt("TAB_ID", q.c);
                              paramString.putInt("fragment_index", i);
                              paramWebView.putExtras(paramString);
                              paramActivity.startActivity(paramWebView);
                              return;
                              if (paramWebView.equals("2")) {
                                i = 1;
                              } else if (paramWebView.equals("3")) {
                                i = 2;
                              }
                            }
                            paramWebView = b("kind", paramString, "1");
                            if (paramActivity != null)
                            {
                              paramString = new Intent(paramActivity, MainScreen.class);
                              localObject3 = new Bundle();
                              ((Bundle)localObject3).putInt("TAB_ID", q.d);
                              ((Bundle)localObject3).putInt("fragment_index", 0);
                              i = 0;
                              if (paramWebView.equals("1")) {
                                i = 0;
                              }
                              for (;;)
                              {
                                ((Bundle)localObject3).putInt("fragment_sub_index", i);
                                paramString.putExtras((Bundle)localObject3);
                                paramActivity.startActivity(paramString);
                                return;
                                if (paramWebView.equals("2")) {
                                  i = 1;
                                } else if (paramWebView.equals("3")) {
                                  i = 2;
                                } else if (paramWebView.equals("4")) {
                                  i = 3;
                                } else if (paramWebView.equals("5")) {
                                  i = 4;
                                }
                              }
                              paramWebView = com.android.dazhihui.g.a();
                              localObject3 = com.android.dazhihui.c.a.d.a();
                              paramString = b("kind", paramString, "");
                              if (paramString.equals("0")) {
                                if (paramWebView.b().a() == 1)
                                {
                                  paramWebView.a(y.a);
                                  ((com.android.dazhihui.c.a.d)localObject3).a("dzh_look_face", 0);
                                  ((com.android.dazhihui.c.a.d)localObject3).g();
                                }
                              }
                              while ((paramActivity instanceof BaseActivity))
                              {
                                ((BaseActivity)paramActivity).setLookFace();
                                return;
                                paramWebView.a(y.b);
                                ((com.android.dazhihui.c.a.d)localObject3).a("dzh_look_face", 1);
                                ((com.android.dazhihui.c.a.d)localObject3).g();
                                continue;
                                if (paramString.equals("1"))
                                {
                                  paramWebView.a(y.b);
                                  ((com.android.dazhihui.c.a.d)localObject3).a("dzh_look_face", 1);
                                  ((com.android.dazhihui.c.a.d)localObject3).g();
                                }
                                else if (paramString.equals("2"))
                                {
                                  paramWebView.a(y.a);
                                  ((com.android.dazhihui.c.a.d)localObject3).a("dzh_look_face", 0);
                                  ((com.android.dazhihui.c.a.d)localObject3).g();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                paramWebView = b("kind", paramString, "0");
                byte b1 = 5;
                if (paramWebView.equals("0")) {
                  b1 = 5;
                }
                for (;;)
                {
                  paramWebView = new Intent();
                  localException4.putByte("type", b1);
                  paramWebView.putExtras(localException4);
                  paramWebView.setClass(paramActivity, MessageCenterList.class);
                  paramActivity.startActivity(paramWebView);
                  return;
                  if (paramWebView.equals("1")) {
                    b1 = 2;
                  } else if (paramWebView.equals("2")) {
                    b1 = 0;
                  } else if (paramWebView.equals("3")) {
                    b1 = 3;
                  } else if (paramWebView.equals("4")) {
                    b1 = 1;
                  }
                }
                paramWebView = new Intent(paramActivity, MoreNewsListScreen.class);
                paramString = new Bundle();
                paramString.putString("url", "1");
                paramString.putInt("type", 2);
                paramString.putString("name", paramActivity.getResources().getString(2131166276));
                paramWebView.putExtras(paramString);
                paramActivity.startActivity(paramWebView);
                return;
                paramWebView = "";
                localObject3 = "";
                try
                {
                  localObject4 = URLDecoder.decode(b("title", paramString, ""), "utf-8");
                  paramWebView = (WebView)localObject4;
                  paramWebView = new Intent(paramActivity, IlvbAccountRechargeScreen.class);
                }
                catch (Exception localException3)
                {
                  try
                  {
                    for (;;)
                    {
                      paramString = URLDecoder.decode(b("url", paramString, ""), "utf-8");
                      MyFavoriteManager.getInstance().addToMyFavorite(paramActivity, paramWebView, paramString, false);
                      return;
                      localException3 = localException3;
                      localException3.printStackTrace();
                    }
                  }
                  catch (Exception paramString)
                  {
                    for (;;)
                    {
                      paramString.printStackTrace();
                      paramString = (String)localObject3;
                    }
                  }
                }
                paramWebView.putExtra("price", (String)localObject9);
                paramActivity.startActivity(paramWebView);
                return;
                Util.closeILVBVideoScreen(paramActivity);
                localObject3 = "";
                j = 0;
                localObject7 = "0";
                localObject9 = "0";
                i = j;
                paramWebView = (WebView)localObject7;
                try
                {
                  localObject5 = URLDecoder.decode(b("accout", paramString, ""), "utf-8");
                  i = j;
                  localObject3 = localObject5;
                  paramWebView = (WebView)localObject7;
                  j = Integer.parseInt(b("roomid", paramString, "0"));
                  i = j;
                  localObject3 = localObject5;
                  paramWebView = (WebView)localObject7;
                  localObject7 = URLDecoder.decode(b("groupid", paramString, "0"), "utf-8");
                  i = j;
                  localObject3 = localObject5;
                  paramWebView = (WebView)localObject7;
                  paramString = URLDecoder.decode(b("resource", paramString, "0"), "utf-8");
                  paramWebView = (WebView)localObject7;
                  localObject3 = localObject5;
                  i = j;
                }
                catch (Exception paramString)
                {
                  for (;;)
                  {
                    paramString.printStackTrace();
                    paramString = (String)localObject9;
                  }
                }
                Log.d("ilvb", "跳转互动直播 mIlvbHostAccount=" + (String)localObject3 + " mIlvbRoomId=" + i + " mIlvbGroupId=" + paramWebView);
                AvGuestActivity.startAvGuestActivity(null, -1, paramActivity, false, i, (String)localObject3, null, null, 0, paramWebView, paramString, null);
                return;
                Util.closeILVBVideoScreen(paramActivity);
                try
                {
                  paramWebView = b("channel_key", paramString, "");
                  localObject3 = b("sec_name_en", paramString, "");
                  localObject5 = b("ext", paramString, "");
                  paramString = b("channel_url", paramString, "http://120.27.182.208");
                  System.out.println("--channel_key = " + paramWebView);
                  System.out.println("--sec_name_en = " + (String)localObject3);
                  System.out.println("--ext = " + (String)localObject5);
                  System.out.println("--url = " + paramString);
                  localObject7 = new JSONObject();
                  ((JSONObject)localObject7).put("channel_ext", localObject5);
                  localObject5 = new HashMap();
                  ((HashMap)localObject5).put("channel_key", paramWebView);
                  ((HashMap)localObject5).put("sec_name_en", localObject3);
                  ((HashMap)localObject5).put("ext", ((JSONObject)localObject7).toString());
                  ((HashMap)localObject5).put("url", paramString);
                  IfassPluginManager.call((HashMap)localObject5, paramActivity, new z());
                  return;
                }
                catch (Exception paramActivity)
                {
                  paramActivity.printStackTrace();
                  return;
                }
                Util.closeILVBVideoScreen(paramActivity);
                try
                {
                  paramWebView = b("type", paramString, "");
                  localObject3 = b("ext", paramString, "");
                  localObject5 = b("channel", paramString, "");
                  localObject7 = b("mobileNo", paramString, "");
                  paramString = b("configUrl", paramString, "");
                  System.out.println("--type = " + paramWebView);
                  System.out.println("--ext = " + (String)localObject3);
                  System.out.println("--channel = " + (String)localObject5);
                  System.out.println("--mobileNo = " + (String)localObject7);
                  System.out.println("--configUrl = " + paramString);
                  localObject9 = new Intent();
                  ((Intent)localObject9).putExtra("type", Integer.valueOf(paramWebView));
                  ((Intent)localObject9).putExtra("ext", (String)localObject3);
                  ((Intent)localObject9).putExtra("channel", (String)localObject5);
                  if (!TextUtils.isEmpty((CharSequence)localObject7)) {
                    ((Intent)localObject9).putExtra("mobileNo", (String)localObject7);
                  }
                  ((Intent)localObject9).putExtra("configUrl", paramString);
                  ((Intent)localObject9).setClass(paramActivity, MainActivity.class);
                  paramActivity.startActivity((Intent)localObject9);
                  return;
                }
                catch (Exception paramActivity)
                {
                  paramActivity.printStackTrace();
                  return;
                }
                paramActivity.startActivity(new Intent(paramActivity, BBSMyStatementActivity.class));
                return;
                paramWebView = b("icon", paramString, "");
              } while (TextUtils.isEmpty(paramWebView));
              a(paramActivity, (String)localObject3, paramWebView, k, i);
              return;
              paramActivity.startActivity(new Intent(paramActivity, GetAddressBookActivity.class));
              return;
              com.android.dazhihui.a.g.a().a(0L);
              w.a().b(true);
            } while (paramActivity == null);
            paramWebView = new Intent(paramActivity, MainScreen.class);
            paramString = new Bundle();
            paramString.putInt("TAB_ID", q.a);
            paramString.putInt("fragment_index", 0);
            paramWebView.putExtras(paramString);
            paramActivity.startActivity(paramWebView);
            return;
            ((Bundle)localObject7).putParcelable("market_vo", MarketManager.get().getMarketVo("沪深市场"));
            ((Bundle)localObject7).putInt("child_index", 1);
            paramWebView = new Intent(paramActivity, MarketListScreenActivity.class);
            paramWebView.putExtras((Bundle)localObject7);
            paramActivity.startActivity(paramWebView);
            return;
          } while (TextUtils.isEmpty((CharSequence)localObject10));
          ((Bundle)localObject7).putBoolean("check", true);
          ((Bundle)localObject7).putBoolean("gotoPlateLinkage", true);
          ((Bundle)localObject7).putString("code", (String)localObject10);
          ((Bundle)localObject7).putString("name", (String)localObject5);
          ((Bundle)localObject7).putParcelable("stock_vo", new StockVo("", (String)localObject10, -1, false));
          ((Intent)localObject11).setClass(paramActivity, PlateLinkageActivity.class);
          ((Intent)localObject11).putExtras((Bundle)localObject7);
          paramActivity.startActivity((Intent)localObject11);
          return;
        case 143: 
          paramWebView = "";
          localObject3 = "";
          localObject5 = "";
          try
          {
            localObject7 = URLDecoder.decode(b("title", paramString, ""), "utf-8");
            paramWebView = (WebView)localObject7;
          }
          catch (Exception localException5)
          {
            for (;;)
            {
              label3022:
              label3042:
              localException5.printStackTrace();
            }
          }
          try
          {
            localObject7 = URLDecoder.decode(b("text", paramString, ""), "utf-8");
            localObject3 = localObject7;
          }
          catch (Exception localException6)
          {
            localException6.printStackTrace();
            break label3022;
          }
          try
          {
            localObject7 = URLDecoder.decode(b("url", paramString, ""), "utf-8");
            localObject5 = localObject7;
          }
          catch (Exception localException7)
          {
            localException7.printStackTrace();
            break label3042;
          }
          localObject11 = b("icon", paramString, "");
          localObject10 = b("newsID", paramString, "");
          j = paramActivity.getResources().getDimensionPixelSize(2131230837);
          localObject12 = new LinearLayout(paramActivity);
          ((LinearLayout)localObject12).setOrientation(0);
          ((LinearLayout)localObject12).setBackgroundColor(-1118482);
          k = paramActivity.getResources().getDimensionPixelSize(2131230788);
          ((LinearLayout)localObject12).setPadding(k, k, k, k);
          if (i <= 0) {
            i = 7;
          }
          break;
        }
      }
    }
    for (;;)
    {
      if ((i & 0x1) == 1)
      {
        paramString = new TextView(paramActivity);
        paramString.setCompoundDrawablesWithIntrinsicBounds(0, 2130839005, 0, 0);
        paramString.setCompoundDrawablePadding(j);
        paramString.setText("微信");
        paramString.setGravity(17);
        paramString.setTextSize(2, 14.0F);
        paramString.setTextColor(-13684941);
        paramString.setOnClickListener(new aa((String)localObject10, paramActivity, paramWebView, (String)localObject11, (String)localObject3, (String)localObject5));
      }
      for (;;)
      {
        if ((i & 0x2) == 2)
        {
          localObject7 = new TextView(paramActivity);
          ((TextView)localObject7).setCompoundDrawablesWithIntrinsicBounds(0, 2130838511, 0, 0);
          ((TextView)localObject7).setCompoundDrawablePadding(j);
          ((TextView)localObject7).setText("朋友圈");
          ((TextView)localObject7).setGravity(17);
          ((TextView)localObject7).setPadding(k, 0, k, 0);
          ((TextView)localObject7).setTextSize(2, 14.0F);
          ((TextView)localObject7).setTextColor(-13684941);
          ((TextView)localObject7).setOnClickListener(new ab((String)localObject10, paramActivity, paramWebView, (String)localObject11, (String)localObject3, (String)localObject5));
        }
        for (;;)
        {
          if ((i & 0x4) == 4)
          {
            localObject9 = new TextView(paramActivity);
            ((TextView)localObject9).setCompoundDrawablesWithIntrinsicBounds(0, 2130838946, 0, 0);
            ((TextView)localObject9).setCompoundDrawablePadding(j);
            ((TextView)localObject9).setText("微博");
            ((TextView)localObject9).setGravity(17);
            ((TextView)localObject9).setTextSize(2, 14.0F);
            ((TextView)localObject9).setTextColor(-13684941);
            ((TextView)localObject9).setOnClickListener(new ac((String)localObject10, paramActivity, paramWebView, (String)localObject5));
          }
          for (;;)
          {
            localObject10 = null;
            if ((i & 0x8) == 8)
            {
              localObject10 = new TextView(paramActivity);
              ((TextView)localObject10).setCompoundDrawablesWithIntrinsicBounds(0, 2130838599, 0, 0);
              ((TextView)localObject10).setCompoundDrawablePadding(j);
              ((TextView)localObject10).setText("股友圈");
              ((TextView)localObject10).setGravity(17);
              ((TextView)localObject10).setPadding(k, 0, k, 0);
              ((TextView)localObject10).setTextSize(2, 14.0F);
              ((TextView)localObject10).setTextColor(-13684941);
              ((TextView)localObject10).setOnClickListener(new ad(paramActivity, paramWebView, (String)localObject11, (String)localObject3, (String)localObject5));
            }
            ((LinearLayout)localObject12).setPadding(k, paramActivity.getResources().getDimensionPixelSize(2131230799), 0, paramActivity.getResources().getDimensionPixelSize(2131230814));
            if (paramString != null) {
              ((LinearLayout)localObject12).addView(paramString);
            }
            if (localObject7 != null) {
              ((LinearLayout)localObject12).addView((View)localObject7);
            }
            if (localObject9 != null) {
              ((LinearLayout)localObject12).addView((View)localObject9);
            }
            if (localObject10 != null) {
              ((LinearLayout)localObject12).addView((View)localObject10);
            }
            paramActivity = new AlertDialog.Builder(paramActivity, 3).setTitle("分享").setView((View)localObject12).create();
            paramActivity.setCancelable(true);
            paramActivity.setCanceledOnTouchOutside(true);
            paramActivity.show();
            return;
            b("title", paramString, "");
            paramWebView = b("play", paramString, "");
            paramString = new Intent("android.intent.action.VIEW");
            paramString.addFlags(268435456);
            paramString.setDataAndType(Uri.parse(paramWebView), "video/*");
            if (com.android.dazhihui.a.g.a().q() != 1)
            {
              new AlertDialog.Builder(paramActivity).setMessage("你当前非WLAN网络,播放可能会产生流量,是否继续？").setTitle("提示").setNegativeButton("取消", null).setPositiveButton("确定", new ae(paramActivity, paramString)).show();
              return;
            }
            try
            {
              paramActivity.startActivity(paramString);
              return;
            }
            catch (ActivityNotFoundException paramActivity)
            {
              paramActivity.printStackTrace();
              return;
            }
            paramString = MarketManager.get().getMarketVoById(m);
            if (paramString == null) {
              break;
            }
            paramWebView = new Bundle();
            paramWebView.putParcelable("market_vo", paramString);
            paramString = new Intent(paramActivity, MarketListScreenActivity.class);
            paramString.putExtras(paramWebView);
            paramActivity.startActivity(paramString);
            return;
            paramWebView = (WebView)localObject3;
            if (localObject3 == null) {
              paramWebView = "";
            }
            try
            {
              paramString = URLDecoder.decode(b("url", paramString, ""), "utf-8");
              if ((paramString == null) || (paramString.isEmpty())) {
                break;
              }
              localObject3 = new Intent();
              ((Intent)localObject3).setClass(paramActivity, MoreNewsListScreen.class);
              ((Intent)localObject3).putExtra("name", paramWebView);
              ((Intent)localObject3).putExtra("type", 1);
              ((Intent)localObject3).putExtra("url", paramString);
              paramActivity.startActivity((Intent)localObject3);
              return;
            }
            catch (Exception paramString)
            {
              for (;;)
              {
                paramString.printStackTrace();
                paramString = "";
              }
            }
            paramWebView = new Intent();
            paramWebView.setClass(paramActivity, DzhRichScanActivity.class);
            paramActivity.startActivity(paramWebView);
            return;
            paramWebView = new Intent();
            if (w.a().l())
            {
              paramWebView.setClass(paramActivity, MyFavoriteActivity.class);
              paramActivity.startActivity(paramWebView);
              return;
            }
            paramWebView = new Intent(paramActivity, LoginMainScreen.class);
            paramWebView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
            paramActivity.startActivity(paramWebView);
            return;
            if ((paramActivity != null) && (w.a().l()))
            {
              Log.d("ilvb", "跳转主播功能 成功");
              AvHostActivity.startAvGuestActivity(paramActivity);
              return;
            }
            Log.e("ilvb", "跳转主播功能 失败");
            return;
            if (k == -1) {
              break;
            }
            switch (k)
            {
            default: 
              return;
            case 2331: 
              if (i == -1) {
                break;
              }
              b(paramActivity, i);
              return;
            case 2955: 
              if (i == -1) {
                break;
              }
              a(paramActivity, i);
              return;
            case 2987: 
              if (i == -1) {
                break;
              }
              paramWebView = new Bundle();
              paramString = new Intent(paramActivity, OptionListActivity.class);
              switch (i)
              {
              case 0: 
              case 2: 
              default: 
                return;
              }
              paramWebView.putString("BUNDLE_OPTION_TITLE", "");
              paramWebView.putParcelable("stock_vo", new StockVo("", "SH510050", 0, false));
              paramString.putExtras(paramWebView);
              paramActivity.startActivity(paramString);
              return;
            case 2970: 
              if (TextUtils.isEmpty((CharSequence)localObject10)) {
                break;
              }
              j = 1;
              if (i != -1) {
                j = i;
              }
              paramWebView = new StockVo("", (String)localObject10, j, false);
              paramString = new Bundle();
              paramString.putBoolean("check", true);
              paramString.putParcelable("stock_vo", paramWebView);
              a(paramActivity, paramWebView, paramString);
              return;
            case 2944: 
              if (TextUtils.isEmpty((CharSequence)localObject10)) {
                break;
              }
              if (i != -1) {}
              for (;;)
              {
                paramWebView = new StockVo("", (String)localObject10, i, false);
                paramString = new Bundle();
                paramString.putBoolean("check", true);
                paramString.putBoolean("go_kline", true);
                paramString.putParcelable("stock_vo", paramWebView);
                paramString.putInt("index_type", 1);
                a(paramActivity, paramWebView, paramString);
                return;
                if ((j != 1) || (m == -1)) {
                  break;
                }
                new Bundle();
                new Intent();
                switch (m)
                {
                default: 
                  return;
                case 136: 
                  Util.closeILVBVideoScreen(paramActivity);
                  paramWebView = paramString.split("url=");
                  if ((paramWebView == null) || (paramWebView.length <= 1)) {
                    break;
                  }
                  a(paramActivity, paramWebView[1]);
                  return;
                case 137: 
                  if (TextUtils.isEmpty((CharSequence)localObject10)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject10, null, 17);
                  return;
                case 138: 
                  if (TextUtils.isEmpty((CharSequence)localObject10)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject10, null, 0);
                  return;
                case 139: 
                  if (TextUtils.isEmpty((CharSequence)localObject10)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject10, null, 1);
                  return;
                case 140: 
                  if (TextUtils.isEmpty((CharSequence)localObject10)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject10, null, 11);
                  return;
                case 141: 
                  if (TextUtils.isEmpty((CharSequence)localObject11)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject11, null, 14);
                  return;
                case 142: 
                  if (TextUtils.isEmpty((CharSequence)localObject10)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject10, null, 18);
                  return;
                case 181: 
                  if (TextUtils.isEmpty((CharSequence)localObject10)) {
                    break;
                  }
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, (String)localObject10, null, 12);
                  return;
                case 183: 
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, null, null, 15);
                  return;
                case 184: 
                  com.android.dazhihui.ui.delegate.b.o.a(paramActivity, 1, null, null, 16);
                  return;
                  i = 1;
                }
              }
              localObject9 = null;
            }
          }
          Object localObject8 = null;
        }
        paramString = null;
      }
    }
  }
  
  public static void a(Activity paramActivity, WebView paramWebView, String paramString1, String paramString2)
  {
    if (paramString1.contains("dzh_browser_url"))
    {
      paramString2 = paramString1;
      if (!paramString1.startsWith("dzh_browser_url")) {
        paramString2 = paramString1.substring(paramString1.indexOf("dzh_browser_url"));
      }
    }
    do
    {
      try
      {
        a(paramActivity, paramWebView, paramString2);
        return;
      }
      catch (Exception paramActivity)
      {
        paramActivity.printStackTrace();
        return;
      }
      if (paramString1.toLowerCase(Locale.getDefault()).endsWith(".pdf"))
      {
        paramWebView = new Intent();
        paramWebView.putExtra("PDF_URL", paramString1);
        paramWebView.setClass(paramActivity, PDFActivity.class);
        paramActivity.startActivity(paramWebView);
        return;
      }
      if (paramString1.contains("81?"))
      {
        paramString1 = paramString1.substring(paramString1.indexOf("81?") + 3);
        paramWebView = new Bundle();
        paramWebView.putString("nexturl", paramString1);
        paramWebView.putString("names", "云社区");
        paramString1 = new Intent();
        paramString1.setClass(paramActivity, BrowserActivity.class);
        paramString1.putExtras(paramWebView);
        paramActivity.startActivity(paramString1);
        return;
      }
      if ((paramString2 == null) || (!paramString1.startsWith(paramString2))) {
        break;
      }
      paramString2 = paramString1.substring(paramString2.length(), paramString1.length());
      if (!paramString2.startsWith("SP ")) {
        break;
      }
    } while (!paramString2.contains("?"));
    a(paramString2, paramActivity, paramWebView, true);
    return;
    e = com.android.dazhihui.ui.widget.b.d.a(paramString1);
    for (;;)
    {
      try
      {
        if (paramString1.length() > e.length())
        {
          paramString2 = paramString1.substring(e.length(), paramString1.length());
          if (paramString2.startsWith("http://"))
          {
            e = com.android.dazhihui.ui.widget.b.d.a(paramString2);
            b(paramActivity, paramWebView, paramString2);
            return;
          }
          if (paramString2.startsWith("@min="))
          {
            paramString1 = paramString2.substring(5);
            paramWebView = new Bundle();
            paramString1 = new StockVo("", paramString1, -1, false);
            paramWebView.putBoolean("check", true);
            paramWebView.putParcelable("stock_vo", paramString1);
            a(paramActivity, paramString1, paramWebView);
            return;
          }
          if (paramString2.startsWith("@kline="))
          {
            paramWebView = new StockVo("", paramString2.substring(7), -1, false);
            paramString1 = new Bundle();
            paramString1.putBoolean("check", true);
            paramString1.putBoolean("go_kline", true);
            paramString1.putParcelable("stock_vo", paramWebView);
            paramString1.putInt("index_type", 1);
            a(paramActivity, paramWebView, paramString1);
            return;
          }
          boolean bool = paramString2.startsWith("29?phone=");
          if (bool) {
            try
            {
              paramString1 = paramString2.substring(9);
              paramWebView = a(paramString1);
              paramString1 = paramString1.substring(paramWebView.length() + 9);
              paramWebView = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + paramWebView));
              paramWebView.putExtra("sms_body", paramString1);
              paramActivity.startActivity(paramWebView);
              paramActivity.finish();
              return;
            }
            catch (Exception paramActivity)
            {
              return;
            }
          }
          if (paramString2.startsWith("33?"))
          {
            paramActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString1.substring(paramString1.indexOf("?") + 1))));
            return;
          }
          if (paramString2.startsWith("44?tel="))
          {
            paramWebView = a(paramString2.substring(7).trim());
            paramActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + paramWebView)));
            paramActivity.finish();
            return;
          }
          if (TextUtils.isDigitsOnly(paramString2))
          {
            a(paramActivity, paramWebView, Integer.parseInt(paramString2));
            return;
          }
          b(paramActivity, paramWebView, e + paramString2);
          return;
        }
      }
      catch (Exception paramActivity)
      {
        return;
      }
      paramString2 = paramString1;
    }
  }
  
  public static void a(Activity paramActivity, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("HTML5_ACCOUNT", true);
    localBundle.putString("HTML5_ACCOUNT_URL", paramString);
    uc localuc2 = m.a().M();
    uc localuc1 = localuc2;
    if (localuc2 == null)
    {
      localuc1 = new uc();
      m.a().a(localuc1);
    }
    localBundle.putString("notice", localuc1.a);
    localBundle.putInt("HResolution", localuc1.b);
    localBundle.putInt("VResolution", localuc1.c);
    localBundle.putInt("FrameRate", localuc1.d);
    localBundle.putString("HTML5_ACCOUNT_URL", paramString);
    paramString = new Intent(paramActivity, BrowserActivity.class);
    paramString.putExtras(localBundle);
    paramActivity.startActivity(paramString);
  }
  
  public static void a(Context paramContext)
  {
    com.android.dazhihui.o.a().c(new s(paramContext));
    n.a("", 1164);
  }
  
  private static void a(Context paramContext, int paramInt)
  {
    Bundle localBundle = new Bundle();
    if ((paramInt == 124) || (paramInt == 125)) {}
    for (MarketVo localMarketVo = new MarketVo(n.i(paramInt), true, false, paramInt);; localMarketVo = new MarketVo(n.i(paramInt), false, false, paramInt))
    {
      localBundle.putParcelable("market_vo", localMarketVo);
      Intent localIntent = new Intent(paramContext, MarketListScreenActivity.class);
      localIntent.putExtras(localBundle);
      paramContext.startActivity(localIntent);
      MarketManager.get().setStatisticsUserAction("", localMarketVo.getName());
      return;
    }
  }
  
  public static void a(Context paramContext, WebView paramWebView, int paramInt)
  {
    c = paramContext;
    d = paramWebView;
    MarketManager localMarketManager = MarketManager.get();
    ArrayList localArrayList = localMarketManager.getChildList("商品期货");
    Object localObject = null;
    Bundle localBundle = new Bundle();
    w.a();
    switch (paramInt)
    {
    case 3: 
    case 7: 
    case 13: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 20: 
    case 22: 
    case 23: 
    case 25: 
    case 27: 
    case 29: 
    case 31: 
    case 32: 
    case 33: 
    case 35: 
    case 36: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
    case 73: 
    case 74: 
    case 75: 
    case 76: 
    case 77: 
    case 78: 
    case 79: 
    case 80: 
    case 81: 
    case 82: 
    case 83: 
    case 84: 
    case 85: 
    case 86: 
    case 87: 
    case 90: 
    case 91: 
    default: 
      paramWebView.loadUrl("http://mo.gw.com.cn/util/1121tz/index.php");
    case 41: 
    case 89: 
    case 120: 
    case 121: 
    case 1: 
    case 6: 
    case 8: 
    case 10: 
    case 14: 
    case 24: 
    case 19: 
    case 26: 
    case 28: 
    case 2: 
    case 5: 
    case 9: 
    case 11: 
    case 12: 
    case 21: 
    case 30: 
    case 34: 
    case 37: 
    case 38: 
    case 96: 
    case 97: 
    case 98: 
    case 99: 
    case 100: 
    case 101: 
    case 102: 
    case 103: 
    case 104: 
    case 105: 
    case 106: 
    case 107: 
    case 108: 
    case 109: 
    case 110: 
    case 111: 
    case 112: 
    case 113: 
    case 114: 
    case 115: 
    case 116: 
    case 117: 
    case 118: 
    case 119: 
    case 127: 
    case 4: 
    case 39: 
    case 40: 
    case 42: 
    case 128: 
    case 88: 
    case 92: 
    case 93: 
    case 94: 
    case 95: 
    case 122: 
      do
      {
        do
        {
          do
          {
            return;
            localBundle.putParcelable("market_vo", new MarketVo("板块综合", false, false, -100));
            paramWebView = new Intent(paramContext, MarketListScreenActivity.class);
            paramWebView.putExtras(localBundle);
            paramContext.startActivity(paramWebView);
            return;
            localBundle.putParcelable("market_vo", localMarketManager.getMarketVo("常用指数"));
            paramWebView = new Intent(paramContext, MarketListScreenActivity.class);
            paramWebView.putExtras(localBundle);
            paramContext.startActivity(paramWebView);
            return;
            paramWebView = new Intent(paramContext, MainScreen.class);
            localObject = new Bundle();
            ((Bundle)localObject).putInt("TAB_ID", q.a);
            paramWebView.putExtras((Bundle)localObject);
            paramContext.startActivity(paramWebView);
            return;
            paramWebView = new Intent(paramContext, SearchStockScreen.class);
            localObject = new Bundle();
            ((Bundle)localObject).putInt("searchType", 0);
            paramWebView.putExtras((Bundle)localObject);
            paramContext.startActivity(paramWebView);
            return;
            com.android.dazhihui.ui.delegate.b.o.a(paramContext);
            return;
            localBundle.putParcelable("market_vo", (MarketVo)MarketManager.get().getChildList("商品期货").get(1));
            paramWebView = new Intent(paramContext, MarketListScreenActivity.class);
            paramWebView.putExtras(localBundle);
            paramContext.startActivity(paramWebView);
            return;
            new gx().a(paramContext);
            return;
            if (!w.a().l())
            {
              paramWebView = new Intent(paramContext, LoginMainScreen.class);
              paramWebView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
              paramContext.startActivity(paramWebView);
            }
            for (;;)
            {
              n.a("", 1320);
              return;
              SystemSetingScreen.a();
              Toast.makeText(paramContext, "抱歉!帐号信息出现异常，请重新登录", 0).show();
              paramWebView = new Intent(paramContext, LoginMainScreen.class);
              paramWebView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
              paramContext.startActivity(paramWebView);
            }
            if (w.a().l())
            {
              ti.a(paramContext);
              return;
            }
            paramWebView = new Intent(paramContext, LoginMainScreen.class);
            paramWebView.putExtra("REGISTER_FROM_TYPE", "FROM_LOTTERY");
            paramContext.startActivity(paramWebView);
            return;
            int i = paramInt;
            if (paramInt == 11) {
              i = 118;
            }
            paramWebView = MarketManager.get().getMarketVoById(i);
          } while (paramWebView == null);
          localBundle.putParcelable("market_vo", paramWebView);
          paramWebView = new Intent(paramContext, MarketListScreenActivity.class);
          paramWebView.putExtras(localBundle);
          paramContext.startActivity(paramWebView);
          return;
          paramContext.startActivity(new Intent(paramContext, RecentBrowseStockScreen.class));
          return;
          paramContext.startActivity(new Intent(paramContext, MessageWarnScreen.class));
          n.a("", 1129);
          return;
          paramContext.startActivity(new Intent(paramContext, ProfitExpectedScreen.class));
          return;
          paramWebView = new Intent(paramContext, MarketFocusScreen.class);
          localObject = MarketManager.get().getMarketVoById(42);
        } while (localObject == null);
        localBundle.putParcelable("market_vo", (Parcelable)localObject);
        paramWebView.putExtras(localBundle);
        paramContext.startActivity(paramWebView);
        return;
        paramContext.startActivity(new Intent(paramContext, MorningPostScreen.class));
        return;
        ti.a(paramContext);
        return;
        paramContext.startActivity(new Intent(paramContext, FundHome.class));
        n.a("", 1165);
        return;
        paramWebView = new Intent(paramContext, SelfStockMoreListScreen.class);
        paramWebView.putExtra("mode", 106);
        paramContext.startActivity(paramWebView);
        return;
        paramWebView = new Intent(paramContext, SelfStockMoreListScreen.class);
        paramWebView.putExtra("mode", 107);
        paramContext.startActivity(paramWebView);
        return;
        paramWebView = new Intent(paramContext, MainScreen.class);
        localObject = new Bundle();
        ((Bundle)localObject).putInt("TAB_ID", q.d);
        ((Bundle)localObject).putInt("fragment_index", 0);
        paramWebView.putExtras((Bundle)localObject);
        paramContext.startActivity(paramWebView);
        return;
      } while (localArrayList == null);
      paramInt = 0;
      paramWebView = (WebView)localObject;
      label1285:
      if (paramInt < localArrayList.size())
      {
        if (!((MarketVo)localArrayList.get(paramInt)).getName().equals("纽约NYMEX")) {
          break label1668;
        }
        paramWebView = (MarketVo)localArrayList.get(paramInt);
      }
      break;
    }
    label1668:
    for (;;)
    {
      paramInt += 1;
      break label1285;
      if (paramWebView == null) {
        break;
      }
      localBundle.putParcelable("market_vo", paramWebView);
      paramWebView = new Intent(paramContext, MarketListScreenActivity.class);
      paramWebView.putExtras(localBundle);
      paramContext.startActivity(paramWebView);
      return;
      paramWebView = new Intent();
      localBundle.putByte("type", (byte)5);
      paramWebView.putExtras(localBundle);
      paramWebView.setClass(paramContext, MessageCenterList.class);
      paramContext.startActivity(paramWebView);
      return;
      paramContext.startActivity(new Intent(paramContext, MessageWarnScreen.class));
      return;
      paramContext.startActivity(new Intent(paramContext, SystemSetingScreen.class));
      return;
      paramContext.startActivity(new Intent(paramContext, DecisionScreen.class));
      return;
      paramWebView = new Intent(paramContext, MainScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putInt("TAB_ID", q.b);
      ((Bundle)localObject).putInt("fragment_index", 0);
      paramWebView.putExtras((Bundle)localObject);
      paramContext.startActivity(paramWebView);
      return;
      paramWebView = new Intent(paramContext, MainScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putInt("TAB_ID", q.b);
      ((Bundle)localObject).putInt("fragment_index", 1);
      paramWebView.putExtras((Bundle)localObject);
      paramContext.startActivity(paramWebView);
      return;
      paramWebView = new Intent(paramContext, MainScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putInt("TAB_ID", q.b);
      ((Bundle)localObject).putInt("fragment_index", 2);
      paramWebView.putExtras((Bundle)localObject);
      paramContext.startActivity(paramWebView);
      return;
      paramWebView = new Intent(paramContext, MainScreen.class);
      localObject = new Bundle();
      ((Bundle)localObject).putInt("TAB_ID", q.b);
      ((Bundle)localObject).putInt("fragment_index", 3);
      paramWebView.putExtras((Bundle)localObject);
      paramContext.startActivity(paramWebView);
      return;
      a(paramContext);
      return;
      if (!(paramContext instanceof Activity)) {
        break;
      }
      ((Activity)paramContext).finish();
      return;
    }
  }
  
  public static void a(Context paramContext, StockVo paramStockVo, Bundle paramBundle)
  {
    Vector localVector = m.a().v();
    localVector.clear();
    localVector.add(paramStockVo);
    m.a().u(0);
    paramStockVo = new Intent();
    if (paramBundle != null) {
      paramStockVo.putExtras(paramBundle);
    }
    paramStockVo.setClass(paramContext, StockChartScreen.class);
    paramContext.startActivity(paramStockVo);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    com.android.dazhihui.ui.widget.a.r.a(paramContext).a(paramString2, new ai(paramString1, paramInt2, paramInt1, paramContext));
  }
  
  public static void a(Context paramContext, Vector<StockVo> paramVector, int paramInt, Bundle paramBundle)
  {
    Vector localVector = m.a().v();
    localVector.clear();
    localVector.addAll(paramVector);
    m.a().u(paramInt);
    paramVector = new Intent();
    if (paramBundle != null) {
      paramVector.putExtras(paramBundle);
    }
    paramVector.setClass(paramContext, StockChartScreen.class);
    paramContext.startActivity(paramVector);
  }
  
  public static void a(String paramString, Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {}
    do
    {
      return;
      paramContext = (Activity)paramContext;
    } while ((TextUtils.isEmpty(paramString)) || (paramContext == null) || (paramContext.isFinishing()) || (paramContext.getWindow() == null) || (paramContext.getWindow().getDecorView() == null));
    ViewGroup localViewGroup = (ViewGroup)LayoutInflater.from(paramContext).inflate(2130903092, null);
    MyWebView localMyWebView = (MyWebView)localViewGroup.findViewById(2131558818);
    localMyWebView.getSettings().setBuiltInZoomControls(false);
    localMyWebView.setHorizontalFadingEdgeEnabled(false);
    localMyWebView.setHorizontalScrollBarEnabled(false);
    localMyWebView.setHorizontalScrollbarOverlay(false);
    localMyWebView.setVerticalFadingEdgeEnabled(false);
    localMyWebView.setVerticalScrollBarEnabled(false);
    localMyWebView.setVerticalScrollbarOverlay(false);
    localMyWebView.setWebViewLoadListener(new ag((TextView)localViewGroup.findViewById(2131558567)));
    localMyWebView.setBackgroundColor(-1);
    localMyWebView.setLayerType(2, null);
    PopupWindow localPopupWindow = new PopupWindow(localViewGroup, -2, -2, true);
    ((ImageView)localViewGroup.findViewById(2131558817)).setOnClickListener(new ah(localPopupWindow));
    localPopupWindow.setOutsideTouchable(true);
    localPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
    localPopupWindow.setWindowLayoutMode(-2, -2);
    localMyWebView.loadUrl(paramString);
    localPopupWindow.showAtLocation(paramContext.getWindow().getDecorView(), 1, 0, 0);
  }
  
  public static void a(String paramString, Context paramContext, WebView paramWebView, boolean paramBoolean)
  {
    c = paramContext;
    d = paramWebView;
    if ((paramString == null) || (paramString.length() < 1)) {}
    String str2;
    String str1;
    do
    {
      return;
      String[] arrayOfString = a(paramString, "");
      str2 = arrayOfString[0];
      str1 = arrayOfString[1];
      if ((Boolean.parseBoolean(arrayOfString[2])) && (!w.a().l()))
      {
        LoginMainScreen.b = new af(paramString, paramContext, paramWebView, paramBoolean);
        paramString = new Intent(paramContext, LoginMainScreen.class);
        paramString.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        paramContext.startActivity(paramString);
        return;
      }
      if (str2.equals("0"))
      {
        paramString = new Intent(paramContext, BrowserActivity.class);
        paramWebView = new Bundle();
        paramWebView.putString("nexturl", str1);
        paramString.putExtras(paramWebView);
        if (!a)
        {
          paramContext.startActivity(paramString);
          return;
        }
        if ((paramContext instanceof Activity))
        {
          ((Activity)paramContext).startActivityForResult(paramString, b);
          return;
        }
        paramContext.startActivity(paramString);
        return;
      }
      if (str2.equals("1")) {
        try
        {
          paramString = new Intent();
          paramString.setAction("android.intent.action.VIEW");
          paramString.setData(Uri.parse(str1));
          paramContext.startActivity(paramString);
          return;
        }
        catch (Exception paramString)
        {
          paramString.printStackTrace();
          return;
        }
      }
      if (str2.equals("2"))
      {
        if (paramWebView != null)
        {
          paramWebView.loadUrl(str1);
          return;
        }
        paramString = new Intent(paramContext, BrowserActivity.class);
        paramWebView = new Bundle();
        paramWebView.putString("nexturl", str1);
        paramString.putExtras(paramWebView);
        if (!a)
        {
          paramContext.startActivity(paramString);
          return;
        }
        if ((paramContext instanceof Activity))
        {
          ((Activity)paramContext).startActivityForResult(paramString, b);
          return;
        }
        paramContext.startActivity(paramString);
        return;
      }
    } while (!str2.equals("3"));
    a(str1, paramContext);
  }
  
  public static void a(String paramString1, Context paramContext, String paramString2, WebView paramWebView)
  {
    c = paramContext;
    d = paramWebView;
    if ((paramString2 != null) && (!paramString2.isEmpty())) {
      n.a("", Integer.parseInt(paramString2));
    }
    if ((paramString1 == null) || (paramString1.length() < 1)) {
      return;
    }
    if ((paramString1.contains("DZHSPECIAL=")) || (paramString1.contains("SP+")))
    {
      a(paramString1, paramContext, paramWebView, true);
      return;
    }
    a((Activity)paramContext, null, paramString1, null);
  }
  
  public static void a(boolean paramBoolean, int paramInt)
  {
    a = paramBoolean;
    if (paramBoolean)
    {
      b = paramInt;
      return;
    }
    b = -100;
  }
  
  private static String[] a(int paramInt, String paramString1, String paramString2)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "2";
    arrayOfString[1] = paramString2;
    arrayOfString[2] = String.valueOf(false);
    if ((paramInt & 0x1) == 1)
    {
      arrayOfString[0] = "0";
      if ((paramInt & 0x4) != 4) {
        break label474;
      }
    }
    label456:
    String str2;
    label474:
    for (String str1 = a(paramString2, "deviceId=", com.android.dazhihui.g.a().v());; str2 = paramString2)
    {
      paramString2 = str1;
      if ((paramInt & 0x8) == 8) {
        paramString2 = a(str1, "version=", com.android.dazhihui.g.a().r());
      }
      Object localObject = "gphcloud";
      if ("app_dzh".equals("app_sb")) {
        localObject = com.android.dazhihui.g.a().t();
      }
      str1 = paramString2;
      if ((paramInt & 0x10) == 16) {
        str1 = a(paramString2, "marked=", (String)localObject);
      }
      if ((paramInt & 0x20) != 32)
      {
        paramString2 = str1;
        if ((paramInt & 0x100) != 256) {}
      }
      else
      {
        if ((paramInt & 0x100) == 256) {
          arrayOfString[2] = String.valueOf(true);
        }
        paramString2 = a(str1, "token=", com.android.dazhihui.o.a().b());
      }
      str1 = paramString2;
      if ((paramInt & 0x40) == 64) {}
      try
      {
        str1 = new BigDecimal(com.android.dazhihui.g.a().aq()).setScale(3, 4).toString();
        localObject = new BigDecimal(com.android.dazhihui.g.a().ap()).setScale(3, 4);
        str1 = a(paramString2, "gps=", str1 + "," + ((BigDecimal)localObject).toString());
        paramString2 = str1;
        if ((paramInt & 0x80) == 128)
        {
          paramString2 = m.a();
          localObject = paramString2.t(paramString2.x());
          if (paramString1 != null)
          {
            paramString2 = paramString1;
            if (!paramString1.equals("")) {}
          }
          else
          {
            paramString2 = paramString1;
            if (localObject != null) {
              paramString2 = ((StockVo)localObject).getCode();
            }
          }
          if ((paramString2 != null) && (!paramString2.equals(""))) {
            break label456;
          }
        }
        for (paramString2 = a(str1, "code=", "");; paramString2 = a(str1, "code=", paramString2))
        {
          paramString1 = paramString2;
          if ((paramInt & 0x200) == 512) {
            paramString1 = a(paramString2, "channel=", com.android.dazhihui.g.a().u());
          }
          paramString2 = paramString1;
          if ((paramInt & 0x800) == 2048) {
            paramString2 = a(paramString1, "hostAccount=", AvGuestActivity.mHostIdentifier);
          }
          arrayOfString[1] = paramString2;
          return arrayOfString;
          if ((paramInt & 0x2) == 2)
          {
            arrayOfString[0] = "1";
            break;
          }
          if ((paramInt & 0x400) == 1024)
          {
            arrayOfString[0] = "3";
            break;
          }
          arrayOfString[0] = "2";
          break;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          str2 = paramString2;
        }
      }
    }
  }
  
  public static String[] a(String paramString1, String paramString2)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "2";
    arrayOfString[1] = paramString1;
    arrayOfString[2] = String.valueOf(false);
    if (paramString1 == null) {}
    do
    {
      do
      {
        return arrayOfString;
        if (!paramString1.contains("SP+")) {
          break;
        }
      } while (!paramString1.contains("?"));
      int j = paramString1.indexOf("SP+");
      int i = paramString1.indexOf("?", j);
      try
      {
        j = Integer.valueOf(paramString1.substring(j + 3, i)).intValue();
        return a(j, paramString2, paramString1.substring(i + 1));
      }
      catch (Exception paramString2)
      {
        arrayOfString[1] = paramString1;
        return arrayOfString;
      }
    } while (!paramString1.contains("DZHSPECIAL="));
    return b(paramString1, paramString2);
  }
  
  public static String b(String paramString1, String paramString2, String paramString3)
  {
    int i = paramString1.length();
    int j;
    if (paramString2.contains("&" + paramString1 + "="))
    {
      j = paramString2.indexOf("&" + paramString1 + "=");
      int k = paramString2.indexOf("&", j + 1);
      if (k > 0) {
        paramString3 = paramString2.substring(i + j + 1 + 1, k);
      }
    }
    else
    {
      return paramString3;
    }
    return paramString2.substring(i + j + 1 + 1);
  }
  
  private static void b(Activity paramActivity, WebView paramWebView, String paramString)
  {
    Object localObject1;
    Object localObject4;
    if (!TextUtils.isEmpty(paramString))
    {
      localObject1 = "";
      if (paramString.endsWith(".apk")) {
        localObject1 = paramString;
      }
      Object localObject3 = localObject1;
      int i;
      if (paramString.contains("/33?")) {
        i = paramString.indexOf("33?");
      }
      try
      {
        localObject3 = paramString.substring(i + 3);
        if (!TextUtils.isEmpty((CharSequence)localObject3))
        {
          paramActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)localObject3)));
          return;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        for (;;)
        {
          localIndexOutOfBoundsException.printStackTrace();
          localObject4 = localObject1;
        }
      }
    }
    if (paramString.contains("91?type=100&pwd=")) {
      localObject1 = paramString.substring(paramString.lastIndexOf("&pwd=") + 5);
    }
    for (;;)
    {
      try
      {
        localObject1 = a.a(new String(((String)localObject1).getBytes(), "utf-8").getBytes());
        w.a().e(new String((byte[])localObject1, "utf-8"));
        com.android.dazhihui.g.a().k();
        localObject1 = com.android.dazhihui.c.a.d.a();
        ((com.android.dazhihui.c.a.d)localObject1).a("USER_MD5_PWD", w.a().i());
        ((com.android.dazhihui.c.a.d)localObject1).g();
        ((com.android.dazhihui.c.a.d)localObject1).a("USER_RSA_PWD", w.a().j());
        ((com.android.dazhihui.c.a.d)localObject1).g();
        w.a().b(true);
        if (paramWebView != null) {
          break label507;
        }
        paramWebView = new Bundle();
        paramWebView.putString("nexturl", paramString);
        if ((!TextUtils.isEmpty(paramString)) && (paramString.contains("http://sq.gw.com.cn/market/register"))) {
          paramWebView.putString("names", paramActivity.getString(2131166188));
        }
        paramString = new Intent();
        paramString.setClass(paramActivity, BrowserActivity.class);
        paramString.putExtras(paramWebView);
        if (a) {
          break;
        }
        paramActivity.startActivity(paramString);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      Object localObject2;
      if (paramString.contains("91?type=300&mobile="))
      {
        localObject2 = paramString.substring(paramString.lastIndexOf("&mobile=") + 8);
        w.a().f((String)localObject2);
      }
      else if (paramString.contains("91?type=200&nick="))
      {
        localObject2 = URLDecoder.decode(paramString);
        localObject2 = ((String)localObject2).substring(((String)localObject2).lastIndexOf("&nick=") + 6);
        w.a().c((String)localObject2);
        localObject2 = com.android.dazhihui.c.a.d.a();
        ((com.android.dazhihui.c.a.d)localObject2).a("NICK_NAME", w.a().g());
        ((com.android.dazhihui.c.a.d)localObject2).g();
      }
      else if (paramString.contains("91?type=400&mobile="))
      {
        c.a(paramActivity, "mobileMD5", paramString.substring(paramString.lastIndexOf("&mobile=") + 8));
      }
      else if ((paramString.contains("91?")) && (paramString.contains("type=500")))
      {
        localObject2 = b("user", paramString, "");
        localObject4 = a.a(b("pwd", paramString, "").getBytes());
        w.a().a((String)localObject2, new String((byte[])localObject4));
      }
    }
    paramActivity.startActivityForResult(paramString, b);
    return;
    label507:
    paramWebView.loadUrl(paramString);
  }
  
  private static void b(Context paramContext, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("market_vo", new MarketVo(n.j(paramInt), false, false, paramInt));
    Intent localIntent = new Intent(paramContext, MarketListScreenActivity.class);
    localIntent.putExtras(localBundle);
    paramContext.startActivity(localIntent);
  }
  
  private static void b(Context paramContext, String paramString)
  {
    Object localObject = com.android.dazhihui.g.a();
    paramString = "http://ads.gw.com.cn/adsFrontv/financialStreet.php?service=index" + "&token=" + paramString + "&marked=" + "Android" + "&version=" + ((com.android.dazhihui.g)localObject).r();
    localObject = new Intent(paramContext, BrowserActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramString);
    localBundle.putString("names", paramContext.getResources().getString(2131165603));
    localBundle.putInt("api_type", 1);
    ((Intent)localObject).putExtras(localBundle);
    paramContext.startActivity((Intent)localObject);
  }
  
  private static String[] b(String paramString1, String paramString2)
  {
    int i = 0;
    int j = paramString1.indexOf("DZHSPECIAL=");
    if (j > -1)
    {
      int k = paramString1.indexOf("&", j);
      if (k > -1) {}
      for (;;)
      {
        try
        {
          j = Integer.parseInt(paramString1.substring("DZHSPECIAL=".length() + j, k));
          i = j;
        }
        catch (Exception localException)
        {
          continue;
        }
        return a(i, paramString2, paramString1);
        j = Integer.parseInt(paramString1.substring("DZHSPECIAL=".length() + j));
        i = j;
      }
    }
    return new String[] { "2", paramString1, String.valueOf(false) };
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */