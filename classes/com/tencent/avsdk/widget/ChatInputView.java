package com.tencent.avsdk.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.Toast;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.cloud.ui.RecognizerDialogListener;
import com.iflytek.sunflower.FlowerCollector;
import com.tencent.Util.JsonParser;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.ChatEntity.ChatGuestType;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.control.MessageControl;
import com.tencent.avsdk.control.QavsdkControl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class ChatInputView
  extends RelativeLayout
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener
{
  private static String TAG = ChatInputView.class.getSimpleName();
  public boolean isRecord = false;
  private Handler mActivityHandler;
  private Context mContext;
  private String mEngineType = "cloud";
  private SpeechRecognizer mIat;
  private RecognizerDialog mIatDialog;
  private HashMap<String, String> mIatResults = new LinkedHashMap();
  private LayoutInflater mInflater;
  private InitListener mInitListener = new ChatInputView.2(this);
  public EditText mInputEdit;
  private View mInputSend;
  private RecognizerDialogListener mRecognizerDialogListener = new ChatInputView.4(this);
  private View mRecordBtn;
  private Scroller mScroller;
  private ChatInputView.SizeChange mSizeChange;
  private ChatInputView.SpeechState mSpeechState = ChatInputView.SpeechState.SPEECH_IDLE;
  private SwitchView mSwitchView;
  private Toast mToast;
  private int maxHeight;
  
  public ChatInputView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ChatInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ChatInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mToast = Toast.makeText(this.mContext, "", 0);
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903178, this);
    this.mSwitchView = ((SwitchView)findViewById(2131559359));
    this.mInputEdit = ((EditText)findViewById(2131559361));
    this.mInputSend = findViewById(2131559362);
    this.mRecordBtn = findViewById(2131559360);
    this.mRecordBtn.setOnClickListener(this);
    this.mInputSend.setOnClickListener(this);
    this.mSwitchView.setOnCheckedChangeListener(this);
    this.mInputEdit.setOnKeyListener(new ChatInputView.1(this));
    this.mIat = SpeechRecognizer.createRecognizer(paramContext, this.mInitListener);
    this.mIatDialog = new RecognizerDialog(this.mContext, this.mInitListener);
  }
  
  private boolean isAllowSpeech()
  {
    long l1 = SystemClock.uptimeMillis() - AboveVideoBottomView.mLastStartSpeechProcessTime;
    long l2 = SystemClock.uptimeMillis() - AboveVideoBottomView.mLastRecoverHostAudioTime;
    Log.i("chatinputview_above", "speech isAllowSpeech diff=" + l1 + " diff2=" + l2);
    return (l1 > 2000L) && (l2 > 1000L);
  }
  
  private void printResult(RecognizerResult paramRecognizerResult)
  {
    String str = JsonParser.parseIatResult(paramRecognizerResult.getResultString());
    Iterator localIterator = null;
    try
    {
      paramRecognizerResult = new JSONObject(paramRecognizerResult.getResultString()).optString("sn");
      this.mIatResults.put(paramRecognizerResult, str);
      paramRecognizerResult = new StringBuffer();
      localIterator = this.mIatResults.keySet().iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        paramRecognizerResult.append((String)this.mIatResults.get(str));
      }
    }
    catch (JSONException paramRecognizerResult)
    {
      for (;;)
      {
        paramRecognizerResult.printStackTrace();
        paramRecognizerResult = localIterator;
      }
      this.mInputEdit.setText(paramRecognizerResult.toString());
      this.mInputEdit.setSelection(this.mInputEdit.length());
    }
  }
  
  private void showTip(String paramString)
  {
    if ((getContext() == null) || (((getContext() instanceof Activity)) && (((Activity)getContext()).isFinishing()))) {
      return;
    }
    this.mToast.setText(paramString);
    this.mToast.show();
  }
  
  public void cancel() {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131559359: 
    case 2131559361: 
    default: 
      return;
    case 2131559362: 
      if (!UserilvbManager.getInstance().isFromDZHAccount())
      {
        UserilvbManager.getInstance().showLoginDialog(this.mContext);
        return;
      }
      if ((!UserilvbManager.getInstance().isNoSpeak) || ((UserilvbManager.getInstance().noSpeakSurplus > -1) && (System.currentTimeMillis() - UserilvbManager.getInstance().noSpeakTime > UserilvbManager.getInstance().noSpeakSurplus * 1000)))
      {
        paramView = this.mInputEdit.getText().toString();
        this.mActivityHandler.obtainMessage(259, paramView).sendToTarget();
        this.mInputEdit.setText("");
        return;
      }
      paramView = MessageControl.getChatEntity(ChatEntity.ChatGuestType.CHAT_ERROR, "", "你已被主播禁止发言!", "", "");
      Message localMessage = this.mActivityHandler.obtainMessage(260);
      localMessage.obj = paramView;
      localMessage.sendToTarget();
      return;
    }
    if ((isAllowSpeech()) && (this.mSpeechState == ChatInputView.SpeechState.SPEECH_IDLE))
    {
      this.isRecord = true;
      AboveVideoBottomView.mLastStartSpeechProcessTime = SystemClock.uptimeMillis();
      this.mSpeechState = ChatInputView.SpeechState.SPEECH_USER_IS_SPEAKING;
      onRecord();
      return;
    }
    showTip("点击速度太快，请松开重按！");
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void onRecord()
  {
    if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().stopTRAEServiceWhenIsSystemApp();
    }
    FlowerCollector.onEvent(getContext(), "iat_recognize");
    this.mInputEdit.setText(null);
    this.mIatResults.clear();
    setParam();
    this.mIatDialog.setListener(this.mRecognizerDialogListener);
    this.mIatDialog.show();
    this.mIatDialog.setOnCancelListener(new ChatInputView.3(this));
  }
  
  public void onSend()
  {
    if (!UserilvbManager.getInstance().isFromDZHAccount())
    {
      UserilvbManager.getInstance().showLoginDialog(this.mContext);
      return;
    }
    Object localObject;
    if ((!UserilvbManager.getInstance().isNoSpeak) || ((UserilvbManager.getInstance().noSpeakSurplus > -1) && (System.currentTimeMillis() - UserilvbManager.getInstance().noSpeakTime > UserilvbManager.getInstance().noSpeakSurplus * 1000)))
    {
      localObject = this.mInputEdit.getText().toString().trim();
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        Toast.makeText(this.mContext, "发言不能为空！", 0).show();
      }
    }
    else
    {
      localObject = MessageControl.getChatEntity(ChatEntity.ChatGuestType.CHAT_ERROR, "", "你已被主播禁止发言!", "", "");
      Message localMessage = this.mActivityHandler.obtainMessage(260);
      localMessage.obj = localObject;
      localMessage.sendToTarget();
      return;
    }
    this.mActivityHandler.obtainMessage(259, localObject).sendToTarget();
    this.mInputEdit.setText("");
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((getResources().getConfiguration().orientation == 1) && (this.mSizeChange != null))
    {
      if (paramInt4 == 0) {
        break label78;
      }
      paramInt1 = paramInt2 - paramInt4;
      if (Math.abs(paramInt1) > 100)
      {
        if (paramInt1 <= 0) {
          break label65;
        }
        this.mSizeChange.onSizeChange(false, paramInt1);
      }
    }
    label65:
    label78:
    do
    {
      do
      {
        return;
        this.mSizeChange.onSizeChange(true, -paramInt1);
        return;
      } while ((this.maxHeight == 0) || (paramInt2 == 0) || (paramInt2 >= this.maxHeight));
      paramInt1 = paramInt2 - this.maxHeight;
    } while (Math.abs(paramInt1) <= 100);
    if (paramInt1 > 0)
    {
      this.mSizeChange.onSizeChange(false, paramInt1);
      return;
    }
    this.mSizeChange.onSizeChange(true, -paramInt1);
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.maxHeight = paramInt;
  }
  
  public void setOnSizeChange(ChatInputView.SizeChange paramSizeChange)
  {
    this.mSizeChange = paramSizeChange;
  }
  
  public void setParam()
  {
    this.mIat.setParameter("params", null);
    this.mIat.setParameter("result_type", "json");
    this.mIat.setParameter("language", "zh_cn");
    this.mIat.setParameter("accent", "mandarin");
    this.mIat.setParameter("vad_bos", "4000");
    this.mIat.setParameter("vad_eos", "1000");
    this.mIat.setParameter("asr_ptt", "0");
    this.mIat.setParameter("speech_timeout", "6000");
  }
  
  public void start() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */