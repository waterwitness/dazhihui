package com.f.a.a;

import android.content.Context;
import android.content.res.Resources;

public class bp
{
  public static int A()
  {
    return a("drawable/upomp_lthj_set_default_icon");
  }
  
  public static int B()
  {
    return a("drawable/upomp_lthj_unbind_icon");
  }
  
  public static int C()
  {
    return a("drawable/upomp_lthj_default_drop");
  }
  
  public static int D()
  {
    return a("drawable/upomp_lthj_common_drop");
  }
  
  public static int E()
  {
    return a("layout/upomp_lthj_cardinfo_tip");
  }
  
  public static int F()
  {
    return a("layout/upomp_lthj_keyboard");
  }
  
  public static int G()
  {
    return a("layout/upomp_lthj_keyboard_letter");
  }
  
  public static int H()
  {
    return a("layout/upomp_lthj_keyboard_num");
  }
  
  public static int I()
  {
    return a("layout/upomp_lthj_keyboard_sign");
  }
  
  public static int J()
  {
    return a("layout/upomp_lthj_splash");
  }
  
  public static int K()
  {
    return a("layout/upomp_lthj_index");
  }
  
  public static int L()
  {
    return a("layout/upomp_lthj_lineframe");
  }
  
  public static int M()
  {
    return a("layout/upomp_lthj_validatcodeview");
  }
  
  public static int N()
  {
    return a("layout/upomp_lthj_homecardpay");
  }
  
  public static int O()
  {
    return a("layout/upomp_lthj_homeaccount");
  }
  
  public static int P()
  {
    return a("layout/upomp_lthj_commonpay");
  }
  
  public static int Q()
  {
    return a("layout/upomp_lthj_custominput");
  }
  
  public static int R()
  {
    return a("layout/upomp_lthj_findpwd_home");
  }
  
  public static int S()
  {
    return a("layout/upomp_lthj_findpwd_next");
  }
  
  public static int T()
  {
    return a("layout/upomp_lthj_savecardpay");
  }
  
  public static int U()
  {
    return a("layout/upomp_lthj_quickpay_hascard");
  }
  
  public static int V()
  {
    return a("layout/upomp_lthj_quickpay_nocard");
  }
  
  public static int W()
  {
    return a("layout/upomp_lthj_quick_register");
  }
  
  public static int X()
  {
    return a("layout/upomp_lthj_quick_reg_result");
  }
  
  public static int Y()
  {
    return a("layout/upomp_lthj_quick_reg_confirm");
  }
  
  public static int Z()
  {
    return a("layout/upomp_lthj_quick_bindcard");
  }
  
  public static int a()
  {
    return a("string/upomp_lthj_have_no_initfile");
  }
  
  private static int a(String paramString)
  {
    if (u.b != null)
    {
      String str = u.b.getPackageName();
      paramString = str + ":" + paramString;
      z.b("link", paramString);
      return u.b.getResources().getIdentifier(paramString, null, null);
    }
    return 0;
  }
  
  public static int aA()
  {
    return a("id/upomp_lthj_textview_time");
  }
  
  public static int aB()
  {
    return a("id/upomp_lthj_next_btn");
  }
  
  public static int aC()
  {
    return a("id/upomp_lthj_forget_pwd");
  }
  
  public static int aD()
  {
    return a("id/upomp_lthj_help_btn");
  }
  
  public static int aE()
  {
    return a("id/upomp_lthj_safe_ask_drop");
  }
  
  public static int aF()
  {
    return a("id/upomp_lthj_homebackbutton");
  }
  
  public static int aG()
  {
    return a("id/upomp_lthj_about_btn");
  }
  
  public static int aH()
  {
    return a("id/upomp_lthj_error_desc");
  }
  
  public static int aI()
  {
    return a("id/upomp_lthj_reg_prompt");
  }
  
  public static int aJ()
  {
    return a("id/upomp_lthj_date_help");
  }
  
  public static int aK()
  {
    return a("id/upomp_lthj_cvn2_help");
  }
  
  public static int aL()
  {
    return a("id/upomp_lthj_use_card_pay");
  }
  
  public static int aM()
  {
    return a("id/upomp_lthj_use_quick_pay");
  }
  
  public static int aN()
  {
    return a("id/upomp_lthj_lineframe_image");
  }
  
  public static int aO()
  {
    return a("id/upomp_lthj_unfold_btn");
  }
  
  public static int aP()
  {
    return a("id/upomp_lthj_trantime_row");
  }
  
  public static int aQ()
  {
    return a("id/upomp_lthj_orderno_row");
  }
  
  public static int aR()
  {
    return a("id/upomp_lthj_container");
  }
  
  public static int aS()
  {
    return a("id/upomp_lthj_quickpaycard_layout");
  }
  
  public static int aT()
  {
    return a("id/upomp_lthj_lineframe_tv");
  }
  
  public static int aU()
  {
    return a("id/upomp_lthj_lineframe_title");
  }
  
  public static int aV()
  {
    return a("id/upomp_lthj_custominput_tv");
  }
  
  public static int aW()
  {
    return a("id/upomp_lthj_custominput_et");
  }
  
  public static int aX()
  {
    return a("id/upomp_lthj_merchant_tv");
  }
  
  public static int aY()
  {
    return a("id/upomp_lthj_orderamt_tv");
  }
  
  public static int aZ()
  {
    return a("id/upomp_lthj_orderno_tv");
  }
  
  public static int aa()
  {
    return a("layout/upomp_lthj_quick_bind_result");
  }
  
  public static int ab()
  {
    return a("layout/upomp_lthj_onebtn_progress");
  }
  
  public static int ac()
  {
    return a("layout/upomp_lthj_twobtn_progress");
  }
  
  public static int ad()
  {
    return a("layout/upomp_lthj_myinfo");
  }
  
  public static int ae()
  {
    return a("layout/upomp_lthj_changemobile");
  }
  
  public static int af()
  {
    return a("layout/upomp_lthj_changepassword");
  }
  
  public static int ag()
  {
    return a("layout/upomp_lthj_bankcard_item");
  }
  
  public static int ah()
  {
    return a("layout/upomp_lthj_bankcard_list");
  }
  
  public static int ai()
  {
    return a("layout/upomp_lthj_bindcard_home");
  }
  
  public static int aj()
  {
    return a("layout/upomp_lthj_bindcard_next");
  }
  
  public static int ak()
  {
    return a("layout/upomp_lthj_bankcard_itemexpad");
  }
  
  public static int al()
  {
    return a("layout/upomp_lthj_supportcard");
  }
  
  public static int am()
  {
    return a("layout/upomp_lthj_supportcard_bankitem");
  }
  
  public static int an()
  {
    return a("layout/upomp_lthj_userprotocal_item");
  }
  
  public static int ao()
  {
    return a("layout/upomp_lthj_user_protocol");
  }
  
  public static int ap()
  {
    return a("layout/upomp_lthj_traderesult");
  }
  
  public static int aq()
  {
    return a("layout/upomp_lthj_about");
  }
  
  public static int ar()
  {
    return a("id/upomp_lthj_get_imgcode");
  }
  
  public static int as()
  {
    return a("id/upomp_lthj_auto_welcome_btn");
  }
  
  public static int at()
  {
    return a("id/upomp_lthj_user_pro_box");
  }
  
  public static int au()
  {
    return a("id/upomp_lthj_reg_pro_btn");
  }
  
  public static int av()
  {
    return a("id/upomp_lthj_myinfo_view");
  }
  
  public static int aw()
  {
    return a("id/upomp_lthj_build_no");
  }
  
  public static int ax()
  {
    return a("id/upomp_lthj_card_menu_drop");
  }
  
  public static int ay()
  {
    return a("id/upomp_lthj_default_card");
  }
  
  public static int az()
  {
    return a("id/upomp_lthj_splash_seekbar");
  }
  
  public static int b()
  {
    return a("string/upomp_lthj_secureinfo");
  }
  
  public static int bA()
  {
    return a("id/upomp_lthj_bind_number_view");
  }
  
  public static int bB()
  {
    return a("id/upomp_lthj_button_change_pwd");
  }
  
  public static int bC()
  {
    return a("id/upomp_lthj_button_change_mobile");
  }
  
  public static int bD()
  {
    return a("id/upomp_lthj_button_bankcard_manage");
  }
  
  public static int bE()
  {
    return a("id/upomp_lthj_confirm_pwd_input");
  }
  
  public static int bF()
  {
    return a("id/upomp_lthj_new_pwd_input");
  }
  
  public static int bG()
  {
    return a("id/upomp_lthj_old_pwd_input");
  }
  
  public static int bH()
  {
    return a("id/upomp_lthj_new_mobilenum_edit");
  }
  
  public static int bI()
  {
    return a("id/upomp_lthj_bankcard_listview");
  }
  
  public static int bJ()
  {
    return a("id/upomp_lthj_savecard_listview");
  }
  
  public static int bK()
  {
    return a("id/upomp_lthj_support_card_title1");
  }
  
  public static int bL()
  {
    return a("id/upomp_lthj_support_card_title2");
  }
  
  public static int bM()
  {
    return a("id/upomp_lthj_sup_debit_item");
  }
  
  public static int bN()
  {
    return a("id/upomp_lthj_sup_credit_item");
  }
  
  public static int bO()
  {
    return a("id/upomp_lthj_sup_bank_item");
  }
  
  public static int bP()
  {
    return a("id/upomp_lthj_userprotocol_content");
  }
  
  public static int bQ()
  {
    return a("id/upomp_lthj_userprotocol_title");
  }
  
  public static int bR()
  {
    return a("id/upomp_lthj_userprotocol_listview");
  }
  
  public static int bS()
  {
    return a("id/upomp_lthj_add_bankcard_btn");
  }
  
  public static final int bT()
  {
    return a("id/upomp_lthj_keyboardButtonNum");
  }
  
  public static final int bU()
  {
    return a("id/upomp_lthj_keyboard_button0");
  }
  
  public static final int bV()
  {
    return a("id/upomp_lthj_keyboard_button1");
  }
  
  public static final int bW()
  {
    return a("id/upomp_lthj_keyboard_button2");
  }
  
  public static final int bX()
  {
    return a("id/upomp_lthj_keyboard_button3");
  }
  
  public static final int bY()
  {
    return a("id/upomp_lthj_keyboard_button4");
  }
  
  public static final int bZ()
  {
    return a("id/upomp_lthj_keyboard_button5");
  }
  
  public static int ba()
  {
    return a("id/upomp_lthj_ordertime_tv");
  }
  
  public static int bb()
  {
    return a("id/upomp_lthj_card_num_edit");
  }
  
  public static int bc()
  {
    return a("id/upomp_lthj_mobile_num_edit");
  }
  
  public static int bd()
  {
    return a("id/upomp_lthj_cvn2_edit");
  }
  
  public static int be()
  {
    return a("id/upomp_lthj_pin_edit");
  }
  
  public static int bf()
  {
    return a("id/upomp_lthj_date_edit");
  }
  
  public static int bg()
  {
    return a("id/upomp_lthj_button_ok");
  }
  
  public static int bh()
  {
    return a("id/upomp_lthj_refrush_btn");
  }
  
  public static int bi()
  {
    return a("id/upomp_lthj_button_cancel");
  }
  
  public static int bj()
  {
    return a("id/upomp_lthj_mobilemac_edit");
  }
  
  public static int bk()
  {
    return a("id/upomp_lthj_dialog_progress");
  }
  
  public static int bl()
  {
    return a("id/upomp_lthj_dialog_message");
  }
  
  public static int bm()
  {
    return a("id/upomp_lthj_safe_prompt_view");
  }
  
  public static int bn()
  {
    return a("id/upomp_lthj_safe_ask_view");
  }
  
  public static int bo()
  {
    return a("id/upomp_lthj_safe_asw_view");
  }
  
  public static int bp()
  {
    return a("id/upomp_lthj_mobile_number_view");
  }
  
  public static int bq()
  {
    return a("id/upomp_lthj_bankcard_info_view");
  }
  
  public static int br()
  {
    return a("id/upomp_lthj_pin_layout");
  }
  
  public static int bs()
  {
    return a("id/upomp_lthj_date_layout");
  }
  
  public static int bt()
  {
    return a("id/upomp_lthj_cvn2_layout");
  }
  
  public static int bu()
  {
    return a("id/upomp_lthj_get_mac_btn");
  }
  
  public static int bv()
  {
    return a("id/upomp_lthj_username_edit");
  }
  
  public static int bw()
  {
    return a("id/upomp_lthj_password_edit");
  }
  
  public static int bx()
  {
    return a("id/upomp_lthj_welcome_view");
  }
  
  public static int by()
  {
    return a("id/upomp_lthj_username_view");
  }
  
  public static int bz()
  {
    return a("id/upomp_lthj_account_mange_btn");
  }
  
  public static int c()
  {
    return a("string/upomp_lthj_choose_safeask");
  }
  
  public static final int cA()
  {
    return a("id/upomp_lthj_keyboard_button_s");
  }
  
  public static final int cB()
  {
    return a("id/upomp_lthj_keyboard_button_shift");
  }
  
  public static final int cC()
  {
    return a("id/upomp_lthj_keyboard_button_sign1");
  }
  
  public static final int cD()
  {
    return a("id/upomp_lthj_keyboard_button_sign10");
  }
  
  public static final int cE()
  {
    return a("id/upomp_lthj_keyboard_button_sign2");
  }
  
  public static final int cF()
  {
    return a("id/upomp_lthj_keyboard_button_sign3");
  }
  
  public static final int cG()
  {
    return a("id/upomp_lthj_keyboard_button_sign4");
  }
  
  public static final int cH()
  {
    return a("id/upomp_lthj_keyboard_button_sign5");
  }
  
  public static final int cI()
  {
    return a("id/upomp_lthj_keyboard_button_sign6");
  }
  
  public static final int cJ()
  {
    return a("id/upomp_lthj_keyboard_button_sign7");
  }
  
  public static final int cK()
  {
    return a("id/upomp_lthj_keyboard_button_sign8");
  }
  
  public static final int cL()
  {
    return a("id/upomp_lthj_keyboard_button_sign9");
  }
  
  public static final int cM()
  {
    return a("id/upomp_lthj_keyboard_button_signnext");
  }
  
  public static final int cN()
  {
    return a("id/upomp_lthj_keyboard_button_t");
  }
  
  public static final int cO()
  {
    return a("id/upomp_lthj_keyboard_button_u");
  }
  
  public static final int cP()
  {
    return a("id/upomp_lthj_keyboard_button_v");
  }
  
  public static final int cQ()
  {
    return a("id/upomp_lthj_keyboard_button_w");
  }
  
  public static final int cR()
  {
    return a("id/upomp_lthj_keyboard_button_x");
  }
  
  public static final int cS()
  {
    return a("id/upomp_lthj_keyboard_button_y");
  }
  
  public static final int cT()
  {
    return a("id/upomp_lthj_keyboard_button_z");
  }
  
  public static final int cU()
  {
    return a("id/upomp_lthj_keyboard_editText");
  }
  
  public static final int cV()
  {
    return a("id/upomp_lthj_keyboard_layoutRight");
  }
  
  public static final int cW()
  {
    return a("id/upomp_lthj_keyboard_view");
  }
  
  public static final int cX()
  {
    return a("id/upomp_lthj_keyboard_title");
  }
  
  public static final int cY()
  {
    return a("id/upomp_lthj_pay_desc");
  }
  
  public static final int cZ()
  {
    return a("id/upomp_lthj_desc_line");
  }
  
  public static final int ca()
  {
    return a("id/upomp_lthj_keyboard_button6");
  }
  
  public static final int cb()
  {
    return a("id/upomp_lthj_keyboard_button7");
  }
  
  public static final int cc()
  {
    return a("id/upomp_lthj_keyboard_button8");
  }
  
  public static final int cd()
  {
    return a("id/upomp_lthj_keyboard_button9");
  }
  
  public static final int ce()
  {
    return a("id/upomp_lthj_keyboard_buttonC");
  }
  
  public static final int cf()
  {
    return a("id/upomp_lthj_keyboard_buttonLetter");
  }
  
  public static final int cg()
  {
    return a("id/upomp_lthj_keyboard_buttonOK");
  }
  
  public static final int ch()
  {
    return a("id/upomp_lthj_keyboard_buttonSign");
  }
  
  public static final int ci()
  {
    return a("id/upomp_lthj_keyboard_button_a");
  }
  
  public static final int cj()
  {
    return a("id/upomp_lthj_keyboard_button_b");
  }
  
  public static final int ck()
  {
    return a("id/upomp_lthj_keyboard_button_c");
  }
  
  public static final int cl()
  {
    return a("id/upomp_lthj_keyboard_button_d");
  }
  
  public static final int cm()
  {
    return a("id/upomp_lthj_keyboard_button_e");
  }
  
  public static final int cn()
  {
    return a("id/upomp_lthj_keyboard_button_f");
  }
  
  public static final int co()
  {
    return a("id/upomp_lthj_keyboard_button_g");
  }
  
  public static final int cp()
  {
    return a("id/upomp_lthj_keyboard_button_h");
  }
  
  public static final int cq()
  {
    return a("id/upomp_lthj_keyboard_button_i");
  }
  
  public static final int cr()
  {
    return a("id/upomp_lthj_keyboard_button_j");
  }
  
  public static final int cs()
  {
    return a("id/upomp_lthj_keyboard_button_k");
  }
  
  public static final int ct()
  {
    return a("id/upomp_lthj_keyboard_button_l");
  }
  
  public static final int cu()
  {
    return a("id/upomp_lthj_keyboard_button_m");
  }
  
  public static final int cv()
  {
    return a("id/upomp_lthj_keyboard_button_n");
  }
  
  public static final int cw()
  {
    return a("id/upomp_lthj_keyboard_button_o");
  }
  
  public static final int cx()
  {
    return a("id/upomp_lthj_keyboard_button_p");
  }
  
  public static final int cy()
  {
    return a("id/upomp_lthj_keyboard_button_q");
  }
  
  public static final int cz()
  {
    return a("id/upomp_lthj_keyboard_button_r");
  }
  
  public static int d()
  {
    return a("string/upomp_lthj_custom_safeask");
  }
  
  public static final int dA()
  {
    return a("string/upomp_lthj_validateNum_Length_prompt");
  }
  
  public static final int dB()
  {
    return a("string/upomp_lthj_mobileMacError_Length_prompt");
  }
  
  public static final int dC()
  {
    return a("string/upomp_lthj_validateMobileMac_Empty_prompt");
  }
  
  public static final int dD()
  {
    return a("string/upomp_lthj_validateMobileMac_Length_prompt");
  }
  
  public static final int dE()
  {
    return a("string/upomp_lthj_validateMobileMac_Same_prompt");
  }
  
  public static final int dF()
  {
    return a("string/upomp_lthj_validateMobileNum_LengthEmpty_prompt");
  }
  
  public static final int dG()
  {
    return a("string/upomp_lthj_validateMobileNum_FromatError_prompt");
  }
  
  public static final int dH()
  {
    return a("string/upomp_lthj_validateUserName_Empty_prompt");
  }
  
  public static final int dI()
  {
    return a("string/upomp_lthj_validateUser_Protocal_prompt");
  }
  
  public static final int dJ()
  {
    return a("string/upomp_lthj_validateUserName_Length_prompt");
  }
  
  public static final int dK()
  {
    return a("string/upomp_lthj_validatePassWord_Empty_prompt");
  }
  
  public static final int dL()
  {
    return a("string/upomp_lthj_validatePassWord_Length_prompt");
  }
  
  public static final int dM()
  {
    return a("string/upomp_lthj_validateBankPassWord_Length_prompt");
  }
  
  public static final int dN()
  {
    return a("string/upomp_lthj_validateOldPassWord_Empty_prompt");
  }
  
  public static final int dO()
  {
    return a("string/upomp_lthj_validateOldPassWord_Length_prompt");
  }
  
  public static final int dP()
  {
    return a("string/upomp_lthj_validateNewPassWord_Empty_prompt");
  }
  
  public static final int dQ()
  {
    return a("string/upomp_lthj_validateNewPassWord_Length_prompt");
  }
  
  public static final int dR()
  {
    return a("string/upomp_lthj_validatePassWord_Same_prompt");
  }
  
  public static final int dS()
  {
    return a("string/upomp_lthj_validateImageCode_Empty_prompt");
  }
  
  public static final int dT()
  {
    return a("string/upomp_lthj_validateImageCode_Error_prompt");
  }
  
  public static final int dU()
  {
    return a("string/upomp_lthj_validateWelcomeWord_Empty_prompt");
  }
  
  public static final int dV()
  {
    return a("string/upomp_lthj_validateSafeQuestion_Empty_prompt");
  }
  
  public static final int dW()
  {
    return a("string/upomp_lthj_validateSafeAnswer_Empty_prompt");
  }
  
  public static final int dX()
  {
    return a("string/upomp_lthj_validateExpiryMonth_Empty_prompt");
  }
  
  public static final int dY()
  {
    return a("string/upomp_lthj_validateCVN2_Empty_prompt");
  }
  
  public static final int dZ()
  {
    return a("string/upomp_lthj_validateCVN2_Format_prompt");
  }
  
  public static final int da()
  {
    return a("id/upomp_lthj_pay_state");
  }
  
  public static final int db()
  {
    return a("id/upomp_lthj_state_view");
  }
  
  public static final int dc()
  {
    return a("id/upomp_lthj_validatecode_edit");
  }
  
  public static final int dd()
  {
    return a("id/upomp_lthj_validatecode_img");
  }
  
  public static final int de()
  {
    return a("id/upomp_lthj_validatecode_progress");
  }
  
  public static final int df()
  {
    return a("id/upomp_lthj_validatecode_layout");
  }
  
  public static int dg()
  {
    return a("id/upomp_lthj_bankcard_listview_childicon");
  }
  
  public static int dh()
  {
    return a("id/upomp_lthj_bankcard_listview_childtv");
  }
  
  public static int di()
  {
    return a("id/upomp_lthj_no_card_layout");
  }
  
  public static int dj()
  {
    return a("id/upomp_lthj_support_creditcard_tv");
  }
  
  public static int dk()
  {
    return a("id/upomp_lthj_support_debitcard_tv");
  }
  
  public static int dl()
  {
    return a("string/upomp_lthj_getting_mac");
  }
  
  public static int dm()
  {
    return a("string/upomp_lthj_merchantId_Empty_prompt");
  }
  
  public static int dn()
  {
    return a("string/upomp_lthj_save_account");
  }
  
  public static int jdMethod_do()
  {
    return a("string/upomp_lthj_no_save");
  }
  
  public static int dp()
  {
    return a("string/upomp_lthj_merchantId_Length_prompt");
  }
  
  public static int dq()
  {
    return a("string/upomp_lthj_merchantOrderId_Empty_prompt");
  }
  
  public static int dr()
  {
    return a("string/upomp_lthj_merchantOrderTime_Empty_prompt");
  }
  
  public static int ds()
  {
    return a("string/upomp_lthj_merchantOrderTime_error_prompt");
  }
  
  public static int dt()
  {
    return a("string/upomp_lthj_merchantXml_Format_prompt");
  }
  
  public static int du()
  {
    return a("string/upomp_lthj_merchantXml_ReadError_prompt");
  }
  
  public static int dv()
  {
    return a("string/upomp_lthj_merchantXml_HashFormat_prompt");
  }
  
  public static int dw()
  {
    return a("string/upomp_lthj_merchantXml_MD5Error_prompt");
  }
  
  public static final int dx()
  {
    return a("string/upomp_lthj_sendMessageSuccess");
  }
  
  public static final int dy()
  {
    return a("string/upomp_lthj_sendMessageLose");
  }
  
  public static final int dz()
  {
    return a("string/upomp_lthj_validatePassword_complex_prompt_kind");
  }
  
  public static int e()
  {
    return a("string/upomp_lthj_add_card");
  }
  
  public static int eA()
  {
    return a("string/upomp_lthj_check_support");
  }
  
  public static int eB()
  {
    return a("string/upomp_lthj_use_thecard");
  }
  
  public static int eC()
  {
    return a("string/upomp_lthj_set_default");
  }
  
  public static int eD()
  {
    return a("string/upomp_lthj_unbind");
  }
  
  public static int eE()
  {
    return a("style/upomp_lthj_keyboard_dialog");
  }
  
  public static final int ea()
  {
    return a("string/upomp_lthj_validatePan_Empty_prompt");
  }
  
  public static final int eb()
  {
    return a("string/upomp_lthj_validatePan_Format_prompt");
  }
  
  public static final int ec()
  {
    return a("string/upomp_lthj_validatePanPassword_Empty_prompt");
  }
  
  public static final int ed()
  {
    return a("string/upomp_lthj_validatePanPassword_Length_prompt");
  }
  
  public static int ee()
  {
    return a("string/upomp_lthj_get_mac");
  }
  
  public static int ef()
  {
    return a("string/upomp_lthj_please_get_mac");
  }
  
  public static int eg()
  {
    return a("string/upomp_lthj_after_getmobilemacAgain");
  }
  
  public static int eh()
  {
    return a("string/upomp_lthj_nextpage");
  }
  
  public static int ei()
  {
    return a("string/upomp_lthj_backpage");
  }
  
  public static int ej()
  {
    return a("string/upomp_lthj_safe_ask_default");
  }
  
  public static int ek()
  {
    return a("string/upomp_lthj_pay_success");
  }
  
  public static int el()
  {
    return a("string/upomp_lthj_pay_fail");
  }
  
  public static int em()
  {
    return a("string/upomp_lthj_bind_success");
  }
  
  public static int en()
  {
    return a("string/upomp_lthj_bind_fail");
  }
  
  public static int eo()
  {
    return a("string/upomp_lthj_rebind");
  }
  
  public static int ep()
  {
    return a("string/upomp_lthj_bind_now");
  }
  
  public static int eq()
  {
    return a("string/upomp_lthj_no_bind");
  }
  
  public static int er()
  {
    return a("string/upomp_lthj_change_mobile_success");
  }
  
  public static int es()
  {
    return a("string/upomp_lthj_change_pwd_success");
  }
  
  public static int et()
  {
    return a("style/upomp_lthj_common_dialog");
  }
  
  public static int eu()
  {
    return a("raw/upomp_lthj_config_test");
  }
  
  public static int ev()
  {
    return a("raw/upomp_lthj_config_formal");
  }
  
  public static int ew()
  {
    return a("raw/upomp_lthj_authsupport");
  }
  
  public static int ex()
  {
    return a("raw/upomp_lthj_quicksupport");
  }
  
  public static int ey()
  {
    return a("string/upomp_lthj_session_timeout_tip");
  }
  
  public static int ez()
  {
    return a("string/upomp_lthj_multiple_user_login_tip");
  }
  
  public static int f()
  {
    return a("string/upomp_lthj_logout_prompt");
  }
  
  public static int g()
  {
    return a("string/upomp_lthj_close");
  }
  
  public static int h()
  {
    return a("string/upomp_lthj_choose_pay_card");
  }
  
  public static int i()
  {
    return a("string/upomp_lthj_backtomerchant");
  }
  
  public static int j()
  {
    return a("string/upomp_lthj_back");
  }
  
  public static int k()
  {
    return a("string/upomp_lthj_confirm_pwd");
  }
  
  public static int l()
  {
    return a("string/upomp_lthj_password");
  }
  
  public static int m()
  {
    return a("string/upomp_lthj_cvn");
  }
  
  public static int n()
  {
    return a("string/upomp_lthj_unbind_prompt");
  }
  
  public static int o()
  {
    return a("string/upomp_lthj_set_default_prompt");
  }
  
  public static int p()
  {
    return a("string/upomp_lthj_ok");
  }
  
  public static int q()
  {
    return a("string/upomp_lthj_cancel");
  }
  
  public static int r()
  {
    return a("string/upomp_lthj_app_quitNotice_msg");
  }
  
  public static int s()
  {
    return a("string/upomp_lthj_repay");
  }
  
  public static int t()
  {
    return a("drawable/upomp_lthj_dialog_ok_color");
  }
  
  public static int u()
  {
    return a("drawable/upomp_lthj_info_up_btn");
  }
  
  public static int v()
  {
    return a("drawable/upomp_lthj_info_down_btn");
  }
  
  public static int w()
  {
    return a("drawable/upomp_lthj_keybtn_enlarge");
  }
  
  public static int x()
  {
    return a("drawable/upomp_lthj_pay_icon");
  }
  
  public static int y()
  {
    return a("drawable/upomp_lthj_fail_icon");
  }
  
  public static int z()
  {
    return a("drawable/upomp_lthj_success_icon");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */