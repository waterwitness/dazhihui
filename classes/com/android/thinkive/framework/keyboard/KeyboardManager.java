package com.android.thinkive.framework.keyboard;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.thinkive.framework.util.ScreenUtil;

public class KeyboardManager
{
  public static final int KEYBOARD_HEIGHT = 250;
  public static final short KEYBOARD_TYPE_COMMON = 7;
  public static final short KEYBOARD_TYPE_DIGITAL = 3;
  public static final short KEYBOARD_TYPE_ENGLISH = 1;
  public static final short KEYBOARD_TYPE_MERCHANDISE = 6;
  public static final short KEYBOARD_TYPE_RANDOM_COMMON = 5;
  public static final short KEYBOARD_TYPE_RANDOM_DIGITAL = 4;
  public static final short KEYBOARD_TYPE_STOCK = 2;
  private static KeyboardManager sInstance;
  private CommonKeyboard mCommonKeyboard;
  private Context mContext;
  private EditText mEditText;
  private EnglishKeyboard mEnglishKeyboard;
  private KeyboardEventListener mExportActionListener;
  private KeyboardManager.OnInputCompleteListener mInputCompleteListener;
  private boolean mIsKeyboardAddedToWindow = false;
  private KeyboardManager.KeyCodeListener mKeyCodeListener;
  private KeyboardEventListener mKeyboardActionListener = new KeyboardManager.1(this);
  private short mKeyboardType = 1;
  private View mKeyboardView;
  private MerchandiseKeyboard mMerchandiseKeyboard;
  private DigitalKeyboard mRandomDigitalKeyboard;
  private StockKeyboard mStockKeyboard;
  private WindowManager mWindowManager;
  
  public KeyboardManager(Context paramContext, EditText paramEditText, short paramShort)
  {
    this.mContext = paramContext;
    this.mEditText = paramEditText;
    this.mKeyboardType = paramShort;
    init();
    sInstance = this;
  }
  
  public KeyboardManager(Context paramContext, short paramShort)
  {
    this.mContext = paramContext;
    this.mKeyboardType = paramShort;
    init();
    sInstance = this;
  }
  
  public static int getEditTextScrollHeight(Activity paramActivity, EditText paramEditText)
  {
    if ((paramEditText == null) || (paramActivity == null)) {
      return 0;
    }
    int[] arrayOfInt = new int[2];
    paramEditText.getLocationOnScreen(arrayOfInt);
    return (int)(arrayOfInt[1] + paramEditText.getHeight() - (ScreenUtil.getScreenHeight(paramActivity) - ScreenUtil.dpToPx(paramActivity, 250.0F)));
  }
  
  public static KeyboardManager getInstance()
  {
    return sInstance;
  }
  
  private void init()
  {
    if ((this.mContext instanceof Activity)) {}
    for (this.mWindowManager = ((WindowManager)((Activity)this.mContext).getSystemService("window"));; this.mWindowManager = ((WindowManager)this.mContext.getSystemService("window"))) {
      switch (this.mKeyboardType)
      {
      default: 
        return;
      }
    }
    initStockKeyboard();
    return;
    initDigitalKeyboard(false);
    return;
    initDigitalKeyboard(true);
    return;
    initCommonKeyboard(true);
    return;
    initCommonKeyboard(false);
    return;
    initMerchandiseKeyboard();
  }
  
  private void initCommonKeyboard(boolean paramBoolean)
  {
    LinearLayout localLinearLayout = new LinearLayout(this.mContext);
    localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int)ScreenUtil.dpToPx(this.mContext, 250.0F)));
    localLinearLayout.setOrientation(0);
    this.mEnglishKeyboard = new EnglishKeyboard(this.mContext);
    this.mCommonKeyboard = new CommonKeyboard(this.mContext, paramBoolean);
    this.mEnglishKeyboard.setOnKeyboardActionListener(this.mKeyboardActionListener);
    this.mCommonKeyboard.setOnKeyboardActionListener(this.mKeyboardActionListener);
    switch (this.mKeyboardType)
    {
    }
    for (;;)
    {
      this.mKeyboardView = localLinearLayout;
      return;
      localLinearLayout.addView(this.mEnglishKeyboard.getView());
      localLinearLayout.addView(this.mCommonKeyboard.getView());
      continue;
      localLinearLayout.addView(this.mCommonKeyboard.getView());
      localLinearLayout.addView(this.mEnglishKeyboard.getView());
      continue;
      localLinearLayout.addView(this.mCommonKeyboard.getView());
      localLinearLayout.addView(this.mEnglishKeyboard.getView());
    }
  }
  
  private void initDigitalKeyboard(boolean paramBoolean)
  {
    this.mRandomDigitalKeyboard = new DigitalKeyboard(this.mContext, paramBoolean);
    this.mRandomDigitalKeyboard.setOnKeyboardActionListener(this.mKeyboardActionListener);
    this.mKeyboardView = this.mRandomDigitalKeyboard.getView();
  }
  
  private void initMerchandiseKeyboard()
  {
    this.mMerchandiseKeyboard = new MerchandiseKeyboard(this.mContext);
    this.mMerchandiseKeyboard.setOnKeyboardActionListener(this.mKeyboardActionListener);
    this.mKeyboardView = this.mMerchandiseKeyboard.getView();
  }
  
  private void initStockKeyboard()
  {
    LinearLayout localLinearLayout = new LinearLayout(this.mContext);
    localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int)ScreenUtil.dpToPx(this.mContext, 250.0F)));
    localLinearLayout.setOrientation(0);
    this.mEnglishKeyboard = new EnglishKeyboard(this.mContext);
    this.mStockKeyboard = new StockKeyboard(this.mContext);
    this.mEnglishKeyboard.setOnKeyboardActionListener(this.mKeyboardActionListener);
    this.mStockKeyboard.setOnKeyboardActionListener(this.mKeyboardActionListener);
    switch (this.mKeyboardType)
    {
    }
    for (;;)
    {
      this.mKeyboardView = localLinearLayout;
      return;
      localLinearLayout.addView(this.mEnglishKeyboard.getView());
      localLinearLayout.addView(this.mStockKeyboard.getView());
      continue;
      localLinearLayout.addView(this.mStockKeyboard.getView());
      localLinearLayout.addView(this.mEnglishKeyboard.getView());
    }
  }
  
  private void onFunctionCode(int paramInt)
  {
    int i = 0;
    if (this.mEditText != null) {
      i = this.mEditText.getSelectionStart();
    }
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                return;
                              } while ((this.mEditText == null) || (this.mEditText.getText().length() <= 0) || (i <= 0));
                              this.mEditText.getText().delete(i - 1, i);
                              return;
                              dismiss();
                              return;
                              this.mEnglishKeyboard.show();
                              if ((this.mKeyboardType == 5) || (this.mKeyboardType == 7))
                              {
                                this.mCommonKeyboard.hide();
                                return;
                              }
                            } while (this.mKeyboardType != 2);
                            this.mStockKeyboard.hide();
                            return;
                          } while (this.mEditText == null);
                          this.mEditText.getText().clear();
                          return;
                          dismiss();
                          return;
                          if ((this.mKeyboardType == 5) || (this.mKeyboardType == 7)) {
                            this.mCommonKeyboard.show();
                          }
                          for (;;)
                          {
                            this.mEnglishKeyboard.hide();
                            return;
                            if (this.mKeyboardType == 2) {
                              this.mStockKeyboard.show();
                            }
                          }
                        } while (this.mEditText == null);
                        this.mEditText.getText().insert(i, "000");
                        return;
                      } while (this.mEditText == null);
                      this.mEditText.getText().insert(i, "002");
                      return;
                    } while (this.mEditText == null);
                    this.mEditText.getText().insert(i, "300");
                    return;
                  } while (this.mEditText == null);
                  this.mEditText.getText().insert(i, "600");
                  return;
                } while (this.mEditText == null);
                this.mEditText.getText().insert(i, "601");
                return;
              } while (this.mEditText == null);
              this.mEditText.getText().insert(i, ".");
              return;
            } while (this.mEditText == null);
            this.mEditText.getText().insert(i, "00");
            return;
          } while (this.mKeyCodeListener == null);
          this.mKeyCodeListener.onKeyCode(-14);
          return;
        } while (this.mKeyCodeListener == null);
        this.mKeyCodeListener.onKeyCode(-13);
        return;
      } while (this.mKeyCodeListener == null);
      this.mKeyCodeListener.onKeyCode(-12);
      return;
    } while (this.mKeyCodeListener == null);
    this.mKeyCodeListener.onKeyCode(-11);
  }
  
  public void dismiss()
  {
    if (this.mIsKeyboardAddedToWindow)
    {
      this.mWindowManager.removeView(this.mKeyboardView);
      this.mIsKeyboardAddedToWindow = false;
    }
  }
  
  public BaseKeyboard getKeyBoard()
  {
    switch (this.mKeyboardType)
    {
    default: 
      return this.mCommonKeyboard;
    case 1: 
    case 2: 
      return this.mStockKeyboard;
    case 3: 
      return this.mRandomDigitalKeyboard;
    case 4: 
      return this.mRandomDigitalKeyboard;
    case 5: 
      return this.mCommonKeyboard;
    case 7: 
      return this.mCommonKeyboard;
    }
    return this.mMerchandiseKeyboard;
  }
  
  public boolean isShowing()
  {
    return this.mIsKeyboardAddedToWindow;
  }
  
  public void setExportActionListener(KeyboardEventListener paramKeyboardEventListener)
  {
    if (paramKeyboardEventListener == null) {
      return;
    }
    this.mExportActionListener = paramKeyboardEventListener;
  }
  
  public void setInputCompleteListener(KeyboardManager.OnInputCompleteListener paramOnInputCompleteListener)
  {
    this.mInputCompleteListener = paramOnInputCompleteListener;
  }
  
  public void setKeyCodeListener(KeyboardManager.KeyCodeListener paramKeyCodeListener)
  {
    this.mKeyCodeListener = paramKeyCodeListener;
  }
  
  public void setTheme(short paramShort)
  {
    if (this.mCommonKeyboard != null) {
      this.mCommonKeyboard.setTheme(paramShort);
    }
    if (this.mEnglishKeyboard != null) {
      this.mEnglishKeyboard.setTheme(paramShort);
    }
    if (this.mStockKeyboard != null) {
      this.mStockKeyboard.setTheme(paramShort);
    }
    if (this.mRandomDigitalKeyboard != null) {
      this.mRandomDigitalKeyboard.setTheme(paramShort);
    }
    if (this.mMerchandiseKeyboard != null) {
      this.mMerchandiseKeyboard.setTheme(paramShort);
    }
  }
  
  public void show()
  {
    if (!this.mIsKeyboardAddedToWindow)
    {
      WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
      if (!(this.mContext instanceof Activity)) {
        localLayoutParams.type = 2003;
      }
      localLayoutParams.flags = 520;
      localLayoutParams.format = -3;
      localLayoutParams.width = -1;
      localLayoutParams.height = ((int)ScreenUtil.dpToPx(this.mContext, 250.0F));
      localLayoutParams.gravity = 80;
      this.mWindowManager.addView(this.mKeyboardView, localLayoutParams);
      this.mIsKeyboardAddedToWindow = true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\KeyboardManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */