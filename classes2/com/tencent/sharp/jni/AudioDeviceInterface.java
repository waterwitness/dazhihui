package com.tencent.sharp.jni;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.av.utils.QLog;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(16)
public class AudioDeviceInterface
{
  private static int _channelInType = 16;
  private static int _channelOutType;
  private static boolean _dumpEnable = false;
  private static boolean _logEnable = true;
  private TraeAudioSession _as = null;
  private AudioManager _audioManager = null;
  private AudioRecord _audioRecord = null;
  private boolean _audioRouteChanged = false;
  private int _audioSource = 0;
  private int _audioSourcePolicy = -1;
  private int _audioStreamTypePolicy = -1;
  private AudioTrack _audioTrack = null;
  private int _bufferedPlaySamples = 0;
  private int _bufferedRecSamples = 0;
  private String _connectedDev = "DEVICE_NONE";
  private Context _context = null;
  private boolean _doPlayInit = true;
  private boolean _doRecInit = true;
  private boolean _isPlaying = false;
  private boolean _isRecording = false;
  private int _modePolicy = -1;
  private ByteBuffer _playBuffer;
  private final ReentrantLock _playLock = new ReentrantLock();
  private int _playPosition = 0;
  private int _playSamplerate = 8000;
  private File _play_dump = null;
  private FileOutputStream _play_out = null;
  private boolean _preDone = false;
  private Condition _precon = this._prelock.newCondition();
  private ReentrantLock _prelock = new ReentrantLock();
  private ByteBuffer _recBuffer;
  private final ReentrantLock _recLock = new ReentrantLock();
  private File _rec_dump = null;
  private FileOutputStream _rec_out = null;
  private int _sceneModeKey = 0;
  private int _sessionId = 0;
  private int _streamType = 0;
  private byte[] _tempBufPlay;
  private byte[] _tempBufRec;
  private int switchState = 0;
  private boolean usingJava = true;
  
  static
  {
    _channelOutType = 4;
  }
  
  public AudioDeviceInterface()
  {
    try
    {
      this._playBuffer = ByteBuffer.allocateDirect(1920);
      this._recBuffer = ByteBuffer.allocateDirect(960);
      this._tempBufPlay = new byte['ހ'];
      this._tempBufRec = new byte['π'];
      int i = Build.VERSION.SDK_INT;
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "AudioDeviceInterface apiLevel:" + i);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, " SDK_INT:" + Build.VERSION.SDK_INT);
      }
      if ((i > 0) || (QLog.isColorLevel())) {
        QLog.w("TRAE", 0, "manufacture:" + Build.MANUFACTURER);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "MODEL:" + Build.MODEL);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, localException.getMessage());
        }
      }
    }
  }
  
  private int GetPlayoutVolume()
  {
    if ((this._audioManager == null) && (this._context != null)) {
      this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
    }
    int i = -1;
    if (this._audioManager != null) {
      i = this._audioManager.getStreamVolume(0);
    }
    return i;
  }
  
  private int InitPlayback(int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "InitPlayback entry: sampleRate " + paramInt);
    }
    if ((this._isPlaying) || (this._audioTrack != null))
    {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "InitPlayback _isPlaying:" + this._isPlaying);
      }
      return -1;
    }
    if (this._audioManager == null) {}
    label442:
    label534:
    label695:
    label704:
    label882:
    for (;;)
    {
      int j;
      try
      {
        this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
        this._playSamplerate = paramInt;
        int m = AudioTrack.getMinBufferSize(paramInt, _channelOutType, 2);
        if (_channelOutType == 12)
        {
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, "InitPlayback, _channelOutType stero");
          }
        }
        else
        {
          int i = paramInt * 20 * 1 * 2 / 1000;
          if (_channelOutType != 12) {
            break label882;
          }
          i *= 2;
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, "InitPlayback: minPlayBufSize:" + m + " 20msFz:" + i);
          }
          this._bufferedPlaySamples = 0;
          if (this._audioTrack != null)
          {
            this._audioTrack.release();
            this._audioTrack = null;
          }
          int[] arrayOfInt = new int[4];
          tmp241_240 = arrayOfInt;
          tmp241_240[0] = 0;
          tmp245_241 = tmp241_240;
          tmp245_241[1] = 0;
          tmp249_245 = tmp245_241;
          tmp249_245[2] = 3;
          tmp253_249 = tmp249_245;
          tmp253_249[3] = 1;
          tmp253_249;
          this._streamType = TraeAudioManager.getAudioStreamType(this._audioStreamTypePolicy);
          if (this._audioRouteChanged) {
            break label442;
          }
          arrayOfInt[0] = this._streamType;
          j = 0;
          paramInt = m;
          if ((j >= arrayOfInt.length) || (this._audioTrack != null)) {
            break label704;
          }
          this._streamType = arrayOfInt[j];
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, "InitPlayback: min play buf size is " + m + " hw_sr:" + AudioTrack.getNativeOutputSampleRate(this._streamType));
          }
          int k = 1;
          if (k > 2) {
            break label695;
          }
          paramInt = m * k;
          if ((paramInt >= i * 4) || (k >= 2)) {
            break label534;
          }
          k += 1;
          continue;
        }
        if (_channelOutType != 4) {
          continue;
        }
      }
      catch (Exception localException1)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, localException1.getMessage());
        }
        return -1;
      }
      if (QLog.isColorLevel())
      {
        QLog.w("TRAE", 0, "InitPlayback, _channelOutType Mono");
        continue;
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, "_audioRouteChanged:" + this._audioRouteChanged + " _streamType:" + this._streamType);
        }
        if ((this._audioManager.getMode() == 0) && (this._connectedDev.equals("DEVICE_SPEAKERPHONE"))) {}
        for (this._streamType = 3;; this._streamType = 0)
        {
          this._audioRouteChanged = false;
          break;
        }
        try
        {
          this._audioTrack = new AudioTrack(this._streamType, this._playSamplerate, _channelOutType, 2, paramInt, 1);
          if (this._audioTrack.getState() == 1) {
            break label695;
          }
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, "InitPlayback: play not initialized playBufSize:" + paramInt + " sr:" + this._playSamplerate);
          }
          this._audioTrack.release();
          this._audioTrack = null;
        }
        catch (Exception localException2)
        {
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, localException2.getMessage() + " _audioTrack:" + this._audioTrack);
          }
          if (this._audioTrack != null) {
            this._audioTrack.release();
          }
          this._audioTrack = null;
        }
        continue;
        j += 1;
        continue;
        if (this._audioTrack == null)
        {
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, "InitPlayback fail!!!");
          }
          return -1;
        }
        if ((this._as != null) && (this._audioManager != null)) {
          this._as.voiceCallAudioParamChanged(this._audioManager.getMode(), this._streamType);
        }
        this._playPosition = this._audioTrack.getPlaybackHeadPosition();
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, "InitPlayback exit: streamType:" + this._streamType + " samplerate:" + this._playSamplerate + " _playPosition:" + this._playPosition + " playBufSize:" + paramInt);
        }
        AudioManager localAudioManager = this._audioManager;
        if (this._connectedDev.equals("DEVICE_BLUETOOTHHEADSET")) {}
        for (paramInt = 6;; paramInt = this._audioTrack.getStreamType())
        {
          TraeAudioManager.forceVolumeControlStream(localAudioManager, paramInt);
          return 0;
        }
      }
    }
  }
  
  private int InitRecording(int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "InitRecording entry:" + paramInt);
    }
    if ((this._isRecording) || (this._audioRecord != null))
    {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "InitRecording _isRecording:" + this._isRecording);
      }
      return -1;
    }
    int m = AudioRecord.getMinBufferSize(paramInt, _channelInType, 2);
    int n = paramInt * 20 * 1 * 2 / 1000;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "InitRecording: min rec buf size is " + m + " sr:" + getLowlatencySamplerate() + " fp" + getLowlatencyFramesPerBuffer() + " 20msFZ:" + n);
    }
    this._bufferedRecSamples = (paramInt * 5 / 200);
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "  rough rec delay set to " + this._bufferedRecSamples);
    }
    if (this._audioRecord != null)
    {
      this._audioRecord.release();
      this._audioRecord = null;
    }
    int[] arrayOfInt = new int[4];
    int[] tmp247_246 = arrayOfInt;
    tmp247_246[0] = 0;
    int[] tmp251_247 = tmp247_246;
    tmp251_247[1] = 1;
    int[] tmp255_251 = tmp251_247;
    tmp255_251[2] = 5;
    int[] tmp259_255 = tmp255_251;
    tmp259_255[3] = 0;
    tmp259_255;
    arrayOfInt[0] = TraeAudioManager.getAudioSource(this._audioSourcePolicy);
    int j = 0;
    int i = m;
    while ((j < arrayOfInt.length) && (this._audioRecord == null))
    {
      this._audioSource = arrayOfInt[j];
      int k = 1;
      if (k <= 2)
      {
        i = m * k;
        if ((i < n * 4) && (k < 2)) {}
        for (;;)
        {
          k += 1;
          break;
          try
          {
            this._audioRecord = new AudioRecord(this._audioSource, paramInt, _channelInType, 2, i);
            if (this._audioRecord.getState() == 1) {
              break label512;
            }
            if (QLog.isColorLevel()) {
              QLog.w("TRAE", 0, "InitRecording:  rec not initialized,try agine,  minbufsize:" + i + " sr:" + paramInt + " as:" + this._audioSource);
            }
            this._audioRecord.release();
            this._audioRecord = null;
          }
          catch (Exception localException)
          {
            if (QLog.isColorLevel()) {
              QLog.w("TRAE", 0, localException.getMessage() + " _audioRecord:" + this._audioRecord);
            }
            if (this._audioRecord != null) {
              this._audioRecord.release();
            }
            this._audioRecord = null;
          }
        }
      }
      label512:
      j += 1;
    }
    if (this._audioRecord == null)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "InitRecording fail!!!");
      }
      return -1;
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, " [Config] InitRecording: audioSession:" + this._sessionId + " audioSource:" + this._audioSource + " rec sample rate set to " + paramInt + " recBufSize:" + i);
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "InitRecording exit");
    }
    return this._bufferedRecSamples;
  }
  
  private int InitSetting(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this._audioSourcePolicy = paramInt1;
    this._audioStreamTypePolicy = paramInt2;
    this._modePolicy = paramInt3;
    this._sceneModeKey = paramInt4;
    if ((this._sceneModeKey == 1) || (this._sceneModeKey == 2)) {
      TraeAudioManager.IsMusicScene = true;
    }
    for (_channelOutType = 12;; _channelOutType = 4)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "InitSetting: _audioSourcePolicy:" + this._audioSourcePolicy + " _audioStreamTypePolicy:" + this._audioStreamTypePolicy + " _modePolicy:" + this._modePolicy + " sceneModeKey:" + paramInt4);
      }
      return 0;
      TraeAudioManager.IsMusicScene = false;
    }
  }
  
  public static final void LogTraceEntry(String paramString)
  {
    if (!_logEnable) {}
    do
    {
      return;
      paramString = getTraceInfo() + " entry:" + paramString;
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 0, paramString);
  }
  
  public static final void LogTraceExit()
  {
    if (!_logEnable) {}
    String str;
    do
    {
      return;
      str = getTraceInfo() + " exit";
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 0, str);
  }
  
  private int OpenslesNeedResetAudioTrack(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (!TraeAudioManager.isCloseSystemAPM(this._modePolicy)) {
          return -1;
        }
        if ((this._audioRouteChanged) || (paramBoolean))
        {
          if ((this._audioManager == null) && (this._context != null)) {
            this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
          }
          if (this._audioManager == null) {
            return 0;
          }
          if ((this._audioManager.getMode() != 0) || (!this._connectedDev.equals("DEVICE_SPEAKERPHONE"))) {
            continue;
          }
          this._audioStreamTypePolicy = 3;
          this._audioRouteChanged = false;
        }
      }
      catch (Exception localException)
      {
        localException = localException;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e("TRAE", 0, "PlayAudio Exception: " + localException.getMessage());
        continue;
      }
      finally {}
      return this._audioStreamTypePolicy;
      this._audioStreamTypePolicy = 0;
    }
  }
  
  /* Error */
  private int PlayAudio(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   4: ifne +74 -> 78
    //   7: iconst_1
    //   8: istore 4
    //   10: aload_0
    //   11: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   14: ifnonnull +70 -> 84
    //   17: iconst_1
    //   18: istore 5
    //   20: iload 4
    //   22: iload 5
    //   24: ior
    //   25: ifeq +65 -> 90
    //   28: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   31: ifeq +45 -> 76
    //   34: ldc -76
    //   36: iconst_0
    //   37: new 182	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   44: ldc_w 417
    //   47: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: aload_0
    //   51: getfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   54: invokevirtual 241	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   57: ldc_w 419
    //   60: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload_0
    //   64: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   67: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   76: iconst_m1
    //   77: ireturn
    //   78: iconst_0
    //   79: istore 4
    //   81: goto -71 -> 10
    //   84: iconst_0
    //   85: istore 5
    //   87: goto -67 -> 20
    //   90: aload_0
    //   91: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   94: invokevirtual 422	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   97: aload_0
    //   98: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   101: astore_2
    //   102: aload_2
    //   103: ifnonnull +13 -> 116
    //   106: aload_0
    //   107: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   110: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   113: bipush -2
    //   115: ireturn
    //   116: aload_0
    //   117: getfield 111	com/tencent/sharp/jni/AudioDeviceInterface:_doPlayInit	Z
    //   120: istore 11
    //   122: iload 11
    //   124: iconst_1
    //   125: if_icmpne +13 -> 138
    //   128: bipush -19
    //   130: invokestatic 431	android/os/Process:setThreadPriority	(I)V
    //   133: aload_0
    //   134: iconst_0
    //   135: putfield 111	com/tencent/sharp/jni/AudioDeviceInterface:_doPlayInit	Z
    //   138: getstatic 66	com/tencent/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   141: ifeq +25 -> 166
    //   144: aload_0
    //   145: getfield 131	com/tencent/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   148: astore_2
    //   149: aload_2
    //   150: ifnull +16 -> 166
    //   153: aload_0
    //   154: getfield 131	com/tencent/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   157: aload_0
    //   158: getfield 165	com/tencent/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   161: iconst_0
    //   162: iconst_0
    //   163: invokevirtual 437	java/io/FileOutputStream:write	([BII)V
    //   166: aload_0
    //   167: getfield 139	com/tencent/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   170: ifne +510 -> 680
    //   173: iconst_0
    //   174: istore 4
    //   176: aload_0
    //   177: getfield 161	com/tencent/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   180: aload_0
    //   181: getfield 165	com/tencent/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   184: invokevirtual 441	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   187: pop
    //   188: iload 4
    //   190: ifeq +942 -> 1132
    //   193: aload_0
    //   194: getfield 161	com/tencent/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   197: invokevirtual 445	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   200: pop
    //   201: invokestatic 451	android/os/SystemClock:elapsedRealtime	()J
    //   204: lstore 9
    //   206: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   209: ifeq +48 -> 257
    //   212: ldc -76
    //   214: iconst_0
    //   215: new 182	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   222: ldc_w 453
    //   225: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload_0
    //   229: getfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   232: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   235: ldc_w 455
    //   238: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: aload_0
    //   242: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   245: invokevirtual 331	android/media/AudioTrack:getStreamType	()I
    //   248: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   251: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   254: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   257: aload_0
    //   258: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   261: invokevirtual 458	android/media/AudioTrack:getPlayState	()I
    //   264: istore 4
    //   266: iload 4
    //   268: iconst_3
    //   269: if_icmpne +120 -> 389
    //   272: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   275: ifeq +12 -> 287
    //   278: ldc -76
    //   280: iconst_0
    //   281: ldc_w 460
    //   284: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   287: aload_0
    //   288: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   291: invokevirtual 463	android/media/AudioTrack:stop	()V
    //   294: aload_0
    //   295: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   298: invokevirtual 466	android/media/AudioTrack:flush	()V
    //   301: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   304: ifeq +35 -> 339
    //   307: ldc -76
    //   309: iconst_0
    //   310: new 182	java/lang/StringBuilder
    //   313: dup
    //   314: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   317: ldc_w 468
    //   320: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: aload_0
    //   324: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   327: invokevirtual 458	android/media/AudioTrack:getPlayState	()I
    //   330: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   333: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   339: aload_0
    //   340: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   343: invokevirtual 259	android/media/AudioTrack:release	()V
    //   346: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   349: ifeq +35 -> 384
    //   352: ldc -76
    //   354: iconst_0
    //   355: new 182	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   362: ldc_w 470
    //   365: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: aload_0
    //   369: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   372: invokevirtual 458	android/media/AudioTrack:getPlayState	()I
    //   375: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   378: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   381: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   384: aload_0
    //   385: aconst_null
    //   386: putfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   389: aload_0
    //   390: getfield 86	com/tencent/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   393: getstatic 70	com/tencent/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   396: iconst_2
    //   397: invokestatic 250	android/media/AudioTrack:getMinBufferSize	(III)I
    //   400: istore 7
    //   402: iconst_4
    //   403: newarray <illegal type>
    //   405: astore_2
    //   406: aload_2
    //   407: dup
    //   408: iconst_0
    //   409: iconst_0
    //   410: iastore
    //   411: dup
    //   412: iconst_1
    //   413: iconst_0
    //   414: iastore
    //   415: dup
    //   416: iconst_2
    //   417: iconst_3
    //   418: iastore
    //   419: dup
    //   420: iconst_3
    //   421: iconst_1
    //   422: iastore
    //   423: pop
    //   424: aload_2
    //   425: iconst_0
    //   426: aload_0
    //   427: getfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   430: iastore
    //   431: aload_0
    //   432: getfield 86	com/tencent/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   435: bipush 20
    //   437: imul
    //   438: iconst_1
    //   439: imul
    //   440: iconst_2
    //   441: imul
    //   442: sipush 1000
    //   445: idiv
    //   446: istore 4
    //   448: getstatic 70	com/tencent/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   451: bipush 12
    //   453: if_icmpne +903 -> 1356
    //   456: iload 4
    //   458: iconst_2
    //   459: imul
    //   460: istore 4
    //   462: goto +894 -> 1356
    //   465: iload 5
    //   467: aload_2
    //   468: arraylength
    //   469: if_icmpge +529 -> 998
    //   472: aload_0
    //   473: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   476: ifnonnull +522 -> 998
    //   479: aload_0
    //   480: aload_2
    //   481: iload 5
    //   483: iaload
    //   484: putfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   487: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   490: ifeq +46 -> 536
    //   493: ldc -76
    //   495: iconst_0
    //   496: new 182	java/lang/StringBuilder
    //   499: dup
    //   500: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   503: ldc_w 266
    //   506: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: iload 7
    //   511: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   514: ldc_w 268
    //   517: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: aload_0
    //   521: getfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   524: invokestatic 271	android/media/AudioTrack:getNativeOutputSampleRate	(I)I
    //   527: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   530: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   533: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   536: iconst_1
    //   537: istore 6
    //   539: iload 6
    //   541: iconst_2
    //   542: if_icmpgt +820 -> 1362
    //   545: iload 7
    //   547: iload 6
    //   549: imul
    //   550: istore 8
    //   552: iload 8
    //   554: iload 4
    //   556: iconst_4
    //   557: imul
    //   558: if_icmpge +242 -> 800
    //   561: iload 6
    //   563: iconst_2
    //   564: if_icmpge +236 -> 800
    //   567: iload 6
    //   569: iconst_1
    //   570: iadd
    //   571: istore 6
    //   573: goto -34 -> 539
    //   576: astore_2
    //   577: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   580: ifeq -447 -> 133
    //   583: ldc -76
    //   585: iconst_0
    //   586: new 182	java/lang/StringBuilder
    //   589: dup
    //   590: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   593: ldc_w 472
    //   596: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   599: aload_2
    //   600: invokevirtual 217	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   603: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   609: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   612: goto -479 -> 133
    //   615: astore_2
    //   616: iconst_0
    //   617: istore_1
    //   618: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   621: ifeq +32 -> 653
    //   624: ldc -76
    //   626: iconst_0
    //   627: new 182	java/lang/StringBuilder
    //   630: dup
    //   631: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   634: ldc_w 410
    //   637: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   640: aload_2
    //   641: invokevirtual 217	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   644: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   650: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   653: aload_0
    //   654: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   657: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   660: iload_1
    //   661: ireturn
    //   662: astore_2
    //   663: aload_2
    //   664: invokevirtual 475	java/io/IOException:printStackTrace	()V
    //   667: goto -501 -> 166
    //   670: astore_2
    //   671: aload_0
    //   672: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   675: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   678: aload_2
    //   679: athrow
    //   680: aload_0
    //   681: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   684: ifnonnull +26 -> 710
    //   687: aload_0
    //   688: getfield 94	com/tencent/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   691: ifnull +19 -> 710
    //   694: aload_0
    //   695: aload_0
    //   696: getfield 94	com/tencent/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   699: ldc -35
    //   701: invokevirtual 227	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   704: checkcast 229	android/media/AudioManager
    //   707: putfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   710: aload_0
    //   711: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   714: invokevirtual 280	android/media/AudioManager:getMode	()I
    //   717: ifne +46 -> 763
    //   720: aload_0
    //   721: getfield 137	com/tencent/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   724: ldc_w 282
    //   727: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   730: ifeq +33 -> 763
    //   733: aload_0
    //   734: iconst_3
    //   735: putfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   738: aload_0
    //   739: getfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   742: aload_0
    //   743: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   746: invokevirtual 331	android/media/AudioTrack:getStreamType	()I
    //   749: if_icmpne +22 -> 771
    //   752: iconst_0
    //   753: istore 4
    //   755: aload_0
    //   756: iconst_0
    //   757: putfield 139	com/tencent/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   760: goto -584 -> 176
    //   763: aload_0
    //   764: iconst_0
    //   765: putfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   768: goto -30 -> 738
    //   771: iconst_1
    //   772: istore 4
    //   774: goto -19 -> 755
    //   777: astore_2
    //   778: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   781: ifeq -392 -> 389
    //   784: ldc -76
    //   786: iconst_0
    //   787: ldc_w 477
    //   790: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   793: goto -404 -> 389
    //   796: astore_2
    //   797: goto -179 -> 618
    //   800: aload_0
    //   801: new 246	android/media/AudioTrack
    //   804: dup
    //   805: aload_0
    //   806: getfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   809: aload_0
    //   810: getfield 86	com/tencent/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   813: getstatic 70	com/tencent/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   816: iconst_2
    //   817: iload 8
    //   819: iconst_1
    //   820: invokespecial 291	android/media/AudioTrack:<init>	(IIIIII)V
    //   823: putfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   826: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   829: ifeq +32 -> 861
    //   832: ldc -76
    //   834: iconst_0
    //   835: new 182	java/lang/StringBuilder
    //   838: dup
    //   839: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   842: ldc_w 300
    //   845: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   848: aload_0
    //   849: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   852: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   855: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   858: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   861: aload_0
    //   862: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   865: invokevirtual 294	android/media/AudioTrack:getState	()I
    //   868: iconst_1
    //   869: if_icmpeq +493 -> 1362
    //   872: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   875: ifeq +43 -> 918
    //   878: ldc -76
    //   880: iconst_0
    //   881: new 182	java/lang/StringBuilder
    //   884: dup
    //   885: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   888: ldc_w 296
    //   891: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   894: iload 8
    //   896: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   899: ldc_w 298
    //   902: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   905: aload_0
    //   906: getfield 86	com/tencent/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   909: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   912: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   915: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   918: aload_0
    //   919: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   922: invokevirtual 259	android/media/AudioTrack:release	()V
    //   925: aload_0
    //   926: aconst_null
    //   927: putfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   930: goto -363 -> 567
    //   933: astore_3
    //   934: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   937: ifeq +39 -> 976
    //   940: ldc -76
    //   942: iconst_0
    //   943: new 182	java/lang/StringBuilder
    //   946: dup
    //   947: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   950: aload_3
    //   951: invokevirtual 217	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   954: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   957: ldc_w 300
    //   960: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: aload_0
    //   964: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   967: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   970: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   973: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   976: aload_0
    //   977: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   980: ifnull +10 -> 990
    //   983: aload_0
    //   984: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   987: invokevirtual 259	android/media/AudioTrack:release	()V
    //   990: aload_0
    //   991: aconst_null
    //   992: putfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   995: goto -428 -> 567
    //   998: aload_0
    //   999: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1002: astore_2
    //   1003: aload_2
    //   1004: ifnull +57 -> 1061
    //   1007: aload_0
    //   1008: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1011: invokevirtual 480	android/media/AudioTrack:play	()V
    //   1014: aload_0
    //   1015: getfield 133	com/tencent/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/sharp/jni/TraeAudioSession;
    //   1018: aload_0
    //   1019: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   1022: invokevirtual 280	android/media/AudioManager:getMode	()I
    //   1025: aload_0
    //   1026: getfield 84	com/tencent/sharp/jni/AudioDeviceInterface:_streamType	I
    //   1029: invokevirtual 311	com/tencent/sharp/jni/TraeAudioSession:voiceCallAudioParamChanged	(II)I
    //   1032: pop
    //   1033: aload_0
    //   1034: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   1037: astore_2
    //   1038: aload_0
    //   1039: getfield 137	com/tencent/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   1042: ldc_w 324
    //   1045: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1048: ifeq +72 -> 1120
    //   1051: bipush 6
    //   1053: istore 4
    //   1055: aload_2
    //   1056: iload 4
    //   1058: invokestatic 328	com/tencent/sharp/jni/TraeAudioManager:forceVolumeControlStream	(Landroid/media/AudioManager;I)V
    //   1061: iload_1
    //   1062: istore 4
    //   1064: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   1067: ifeq +43 -> 1110
    //   1070: ldc -76
    //   1072: iconst_0
    //   1073: new 182	java/lang/StringBuilder
    //   1076: dup
    //   1077: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   1080: ldc_w 482
    //   1083: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1086: invokestatic 451	android/os/SystemClock:elapsedRealtime	()J
    //   1089: lload 9
    //   1091: lsub
    //   1092: invokevirtual 485	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1095: ldc_w 487
    //   1098: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1101: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1104: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1107: iload_1
    //   1108: istore 4
    //   1110: aload_0
    //   1111: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   1114: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1117: iload 4
    //   1119: ireturn
    //   1120: aload_0
    //   1121: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1124: invokevirtual 331	android/media/AudioTrack:getStreamType	()I
    //   1127: istore 4
    //   1129: goto -74 -> 1055
    //   1132: aload_0
    //   1133: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1136: aload_0
    //   1137: getfield 165	com/tencent/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   1140: iconst_0
    //   1141: iload_1
    //   1142: invokevirtual 490	android/media/AudioTrack:write	([BII)I
    //   1145: istore 4
    //   1147: aload_0
    //   1148: getfield 161	com/tencent/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   1151: invokevirtual 445	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   1154: pop
    //   1155: iload 4
    //   1157: ifge +61 -> 1218
    //   1160: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   1163: ifeq +46 -> 1209
    //   1166: ldc -76
    //   1168: iconst_0
    //   1169: new 182	java/lang/StringBuilder
    //   1172: dup
    //   1173: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   1176: ldc_w 492
    //   1179: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1182: iload 4
    //   1184: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1187: ldc_w 494
    //   1190: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1193: iload_1
    //   1194: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1197: ldc_w 496
    //   1200: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1203: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1206: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1209: aload_0
    //   1210: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   1213: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1216: iconst_m1
    //   1217: ireturn
    //   1218: iload 4
    //   1220: iload_1
    //   1221: if_icmpeq +52 -> 1273
    //   1224: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   1227: ifeq +46 -> 1273
    //   1230: ldc -76
    //   1232: iconst_0
    //   1233: new 182	java/lang/StringBuilder
    //   1236: dup
    //   1237: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   1240: ldc_w 498
    //   1243: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1246: iload 4
    //   1248: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1251: ldc_w 494
    //   1254: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1257: iload_1
    //   1258: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1261: ldc_w 496
    //   1264: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1267: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1270: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1273: aload_0
    //   1274: aload_0
    //   1275: getfield 121	com/tencent/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1278: iload 4
    //   1280: iconst_1
    //   1281: ishr
    //   1282: iadd
    //   1283: putfield 121	com/tencent/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1286: aload_0
    //   1287: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1290: invokevirtual 314	android/media/AudioTrack:getPlaybackHeadPosition	()I
    //   1293: istore_1
    //   1294: iload_1
    //   1295: aload_0
    //   1296: getfield 123	com/tencent/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1299: if_icmpge +8 -> 1307
    //   1302: aload_0
    //   1303: iconst_0
    //   1304: putfield 123	com/tencent/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1307: aload_0
    //   1308: aload_0
    //   1309: getfield 121	com/tencent/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1312: iload_1
    //   1313: aload_0
    //   1314: getfield 123	com/tencent/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1317: isub
    //   1318: isub
    //   1319: putfield 121	com/tencent/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1322: aload_0
    //   1323: iload_1
    //   1324: putfield 123	com/tencent/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1327: aload_0
    //   1328: getfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   1331: ifne +22 -> 1353
    //   1334: aload_0
    //   1335: getfield 121	com/tencent/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1338: istore_1
    //   1339: goto -229 -> 1110
    //   1342: astore_2
    //   1343: iload 4
    //   1345: istore_1
    //   1346: goto -728 -> 618
    //   1349: astore_2
    //   1350: goto -289 -> 1061
    //   1353: goto -243 -> 1110
    //   1356: iconst_0
    //   1357: istore 5
    //   1359: goto -894 -> 465
    //   1362: iload 5
    //   1364: iconst_1
    //   1365: iadd
    //   1366: istore 5
    //   1368: goto -903 -> 465
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1371	0	this	AudioDeviceInterface
    //   0	1371	1	paramInt	int
    //   101	380	2	localObject1	Object
    //   576	24	2	localException1	Exception
    //   615	26	2	localException2	Exception
    //   662	2	2	localIOException	java.io.IOException
    //   670	9	2	localObject2	Object
    //   777	1	2	localIllegalStateException	IllegalStateException
    //   796	1	2	localException3	Exception
    //   1002	54	2	localObject3	Object
    //   1342	1	2	localException4	Exception
    //   1349	1	2	localException5	Exception
    //   933	18	3	localException6	Exception
    //   8	1336	4	i	int
    //   18	1349	5	j	int
    //   537	35	6	k	int
    //   400	150	7	m	int
    //   550	345	8	n	int
    //   204	886	9	l	long
    //   120	6	11	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   128	133	576	java/lang/Exception
    //   97	102	615	java/lang/Exception
    //   116	122	615	java/lang/Exception
    //   133	138	615	java/lang/Exception
    //   138	149	615	java/lang/Exception
    //   153	166	615	java/lang/Exception
    //   166	173	615	java/lang/Exception
    //   176	188	615	java/lang/Exception
    //   577	612	615	java/lang/Exception
    //   663	667	615	java/lang/Exception
    //   680	710	615	java/lang/Exception
    //   710	738	615	java/lang/Exception
    //   738	752	615	java/lang/Exception
    //   755	760	615	java/lang/Exception
    //   763	768	615	java/lang/Exception
    //   1132	1147	615	java/lang/Exception
    //   153	166	662	java/io/IOException
    //   97	102	670	finally
    //   116	122	670	finally
    //   128	133	670	finally
    //   133	138	670	finally
    //   138	149	670	finally
    //   153	166	670	finally
    //   166	173	670	finally
    //   176	188	670	finally
    //   193	257	670	finally
    //   257	266	670	finally
    //   272	287	670	finally
    //   287	339	670	finally
    //   339	384	670	finally
    //   384	389	670	finally
    //   389	456	670	finally
    //   465	536	670	finally
    //   577	612	670	finally
    //   618	653	670	finally
    //   663	667	670	finally
    //   680	710	670	finally
    //   710	738	670	finally
    //   738	752	670	finally
    //   755	760	670	finally
    //   763	768	670	finally
    //   778	793	670	finally
    //   800	826	670	finally
    //   826	861	670	finally
    //   861	918	670	finally
    //   918	930	670	finally
    //   934	976	670	finally
    //   976	990	670	finally
    //   990	995	670	finally
    //   998	1003	670	finally
    //   1007	1051	670	finally
    //   1055	1061	670	finally
    //   1064	1107	670	finally
    //   1120	1129	670	finally
    //   1132	1147	670	finally
    //   1147	1155	670	finally
    //   1160	1209	670	finally
    //   1224	1273	670	finally
    //   1273	1307	670	finally
    //   1307	1339	670	finally
    //   272	287	777	java/lang/IllegalStateException
    //   287	339	777	java/lang/IllegalStateException
    //   339	384	777	java/lang/IllegalStateException
    //   384	389	777	java/lang/IllegalStateException
    //   193	257	796	java/lang/Exception
    //   257	266	796	java/lang/Exception
    //   272	287	796	java/lang/Exception
    //   287	339	796	java/lang/Exception
    //   339	384	796	java/lang/Exception
    //   384	389	796	java/lang/Exception
    //   389	456	796	java/lang/Exception
    //   465	536	796	java/lang/Exception
    //   778	793	796	java/lang/Exception
    //   826	861	796	java/lang/Exception
    //   861	918	796	java/lang/Exception
    //   918	930	796	java/lang/Exception
    //   934	976	796	java/lang/Exception
    //   976	990	796	java/lang/Exception
    //   990	995	796	java/lang/Exception
    //   998	1003	796	java/lang/Exception
    //   1064	1107	796	java/lang/Exception
    //   800	826	933	java/lang/Exception
    //   1147	1155	1342	java/lang/Exception
    //   1160	1209	1342	java/lang/Exception
    //   1224	1273	1342	java/lang/Exception
    //   1273	1307	1342	java/lang/Exception
    //   1307	1339	1342	java/lang/Exception
    //   1007	1051	1349	java/lang/Exception
    //   1055	1061	1349	java/lang/Exception
    //   1120	1129	1349	java/lang/Exception
  }
  
  /* Error */
  private int RecordAudio(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   4: ifne +40 -> 44
    //   7: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   10: ifeq +32 -> 42
    //   13: ldc -76
    //   15: iconst_0
    //   16: new 182	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   23: ldc_w 501
    //   26: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_0
    //   30: getfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   33: invokevirtual 241	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   36: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   42: iconst_m1
    //   43: ireturn
    //   44: aload_0
    //   45: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   48: invokevirtual 422	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   51: aload_0
    //   52: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   55: astore_2
    //   56: aload_2
    //   57: ifnonnull +13 -> 70
    //   60: aload_0
    //   61: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   64: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   67: bipush -2
    //   69: ireturn
    //   70: aload_0
    //   71: getfield 113	com/tencent/sharp/jni/AudioDeviceInterface:_doRecInit	Z
    //   74: istore 4
    //   76: iload 4
    //   78: iconst_1
    //   79: if_icmpne +13 -> 92
    //   82: bipush -19
    //   84: invokestatic 431	android/os/Process:setThreadPriority	(I)V
    //   87: aload_0
    //   88: iconst_0
    //   89: putfield 113	com/tencent/sharp/jni/AudioDeviceInterface:_doRecInit	Z
    //   92: aload_0
    //   93: getfield 163	com/tencent/sharp/jni/AudioDeviceInterface:_recBuffer	Ljava/nio/ByteBuffer;
    //   96: invokevirtual 445	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   99: pop
    //   100: aload_0
    //   101: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   104: aload_0
    //   105: getfield 167	com/tencent/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   108: iconst_0
    //   109: iload_1
    //   110: invokevirtual 504	android/media/AudioRecord:read	([BII)I
    //   113: istore_3
    //   114: iload_3
    //   115: ifge +146 -> 261
    //   118: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   121: ifeq +45 -> 166
    //   124: ldc -76
    //   126: iconst_0
    //   127: new 182	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   134: ldc_w 506
    //   137: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: iload_3
    //   141: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   144: ldc_w 494
    //   147: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: iload_1
    //   151: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   154: ldc_w 496
    //   157: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   166: aload_0
    //   167: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   170: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   173: iconst_m1
    //   174: ireturn
    //   175: astore_2
    //   176: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   179: ifeq -92 -> 87
    //   182: ldc -76
    //   184: iconst_0
    //   185: new 182	java/lang/StringBuilder
    //   188: dup
    //   189: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   192: ldc_w 508
    //   195: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload_2
    //   199: invokevirtual 217	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   202: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   211: goto -124 -> 87
    //   214: astore_2
    //   215: iconst_0
    //   216: istore_3
    //   217: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   220: ifeq +32 -> 252
    //   223: ldc -76
    //   225: iconst_0
    //   226: new 182	java/lang/StringBuilder
    //   229: dup
    //   230: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   233: ldc_w 510
    //   236: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: aload_2
    //   240: invokevirtual 217	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   243: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   252: aload_0
    //   253: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   256: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   259: iload_3
    //   260: ireturn
    //   261: aload_0
    //   262: getfield 163	com/tencent/sharp/jni/AudioDeviceInterface:_recBuffer	Ljava/nio/ByteBuffer;
    //   265: aload_0
    //   266: getfield 167	com/tencent/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   269: iconst_0
    //   270: iload_3
    //   271: invokevirtual 514	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   274: pop
    //   275: getstatic 66	com/tencent/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   278: ifeq +25 -> 303
    //   281: aload_0
    //   282: getfield 129	com/tencent/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   285: astore_2
    //   286: aload_2
    //   287: ifnull +16 -> 303
    //   290: aload_0
    //   291: getfield 129	com/tencent/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   294: aload_0
    //   295: getfield 167	com/tencent/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   298: iconst_0
    //   299: iload_3
    //   300: invokevirtual 437	java/io/FileOutputStream:write	([BII)V
    //   303: iload_3
    //   304: iload_1
    //   305: if_icmpeq +72 -> 377
    //   308: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   311: ifeq +45 -> 356
    //   314: ldc -76
    //   316: iconst_0
    //   317: new 182	java/lang/StringBuilder
    //   320: dup
    //   321: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   324: ldc_w 516
    //   327: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: iload_3
    //   331: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   334: ldc_w 494
    //   337: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: iload_1
    //   341: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   344: ldc_w 496
    //   347: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   356: aload_0
    //   357: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   360: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   363: iconst_m1
    //   364: ireturn
    //   365: astore_2
    //   366: aload_2
    //   367: invokevirtual 475	java/io/IOException:printStackTrace	()V
    //   370: goto -67 -> 303
    //   373: astore_2
    //   374: goto -157 -> 217
    //   377: aload_0
    //   378: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   381: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   384: iload_3
    //   385: ireturn
    //   386: astore_2
    //   387: aload_0
    //   388: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   391: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   394: aload_2
    //   395: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	396	0	this	AudioDeviceInterface
    //   0	396	1	paramInt	int
    //   55	2	2	localAudioRecord	AudioRecord
    //   175	24	2	localException1	Exception
    //   214	26	2	localException2	Exception
    //   285	2	2	localFileOutputStream	FileOutputStream
    //   365	2	2	localIOException	java.io.IOException
    //   373	1	2	localException3	Exception
    //   386	9	2	localObject	Object
    //   113	272	3	i	int
    //   74	6	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   82	87	175	java/lang/Exception
    //   51	56	214	java/lang/Exception
    //   70	76	214	java/lang/Exception
    //   87	92	214	java/lang/Exception
    //   92	114	214	java/lang/Exception
    //   176	211	214	java/lang/Exception
    //   290	303	365	java/io/IOException
    //   118	166	373	java/lang/Exception
    //   261	286	373	java/lang/Exception
    //   290	303	373	java/lang/Exception
    //   308	356	373	java/lang/Exception
    //   366	370	373	java/lang/Exception
    //   51	56	386	finally
    //   70	76	386	finally
    //   82	87	386	finally
    //   87	92	386	finally
    //   92	114	386	finally
    //   118	166	386	finally
    //   176	211	386	finally
    //   217	252	386	finally
    //   261	286	386	finally
    //   290	303	386	finally
    //   308	356	386	finally
    //   366	370	386	finally
  }
  
  private int SetPlayoutVolume(int paramInt)
  {
    if ((this._audioManager == null) && (this._context != null)) {
      this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
    }
    int i = -1;
    if (this._audioManager != null)
    {
      this._audioManager.setStreamVolume(0, paramInt, 0);
      i = 0;
    }
    return i;
  }
  
  /* Error */
  private int StartPlayback()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   6: ifeq +20 -> 26
    //   9: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   12: ifeq +12 -> 24
    //   15: ldc -76
    //   17: iconst_0
    //   18: ldc_w 526
    //   21: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   24: iconst_m1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   30: ifnonnull +40 -> 70
    //   33: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   36: ifeq -12 -> 24
    //   39: ldc -76
    //   41: iconst_0
    //   42: new 182	java/lang/StringBuilder
    //   45: dup
    //   46: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   49: ldc_w 528
    //   52: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: aload_0
    //   56: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   59: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   68: iconst_m1
    //   69: ireturn
    //   70: aload_0
    //   71: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   74: invokevirtual 480	android/media/AudioTrack:play	()V
    //   77: getstatic 66	com/tencent/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   80: ifeq +52 -> 132
    //   83: aload_0
    //   84: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   87: ifnull +11 -> 98
    //   90: aload_0
    //   91: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   94: invokevirtual 280	android/media/AudioManager:getMode	()I
    //   97: istore_2
    //   98: aload_0
    //   99: new 530	java/io/File
    //   102: dup
    //   103: aload_0
    //   104: ldc_w 532
    //   107: iload_2
    //   108: invokespecial 536	com/tencent/sharp/jni/AudioDeviceInterface:getDumpFilePath	(Ljava/lang/String;I)Ljava/lang/String;
    //   111: invokespecial 538	java/io/File:<init>	(Ljava/lang/String;)V
    //   114: putfield 127	com/tencent/sharp/jni/AudioDeviceInterface:_play_dump	Ljava/io/File;
    //   117: aload_0
    //   118: new 433	java/io/FileOutputStream
    //   121: dup
    //   122: aload_0
    //   123: getfield 127	com/tencent/sharp/jni/AudioDeviceInterface:_play_dump	Ljava/io/File;
    //   126: invokespecial 541	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   129: putfield 131	com/tencent/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   132: aload_0
    //   133: iconst_1
    //   134: putfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   137: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   140: ifeq +12 -> 152
    //   143: ldc -76
    //   145: iconst_0
    //   146: ldc_w 543
    //   149: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   152: iconst_0
    //   153: ireturn
    //   154: astore_1
    //   155: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   158: ifeq +12 -> 170
    //   161: ldc -76
    //   163: iconst_0
    //   164: ldc_w 545
    //   167: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   170: aload_1
    //   171: invokevirtual 546	java/lang/IllegalStateException:printStackTrace	()V
    //   174: iconst_m1
    //   175: ireturn
    //   176: astore_1
    //   177: aload_1
    //   178: invokevirtual 547	java/io/FileNotFoundException:printStackTrace	()V
    //   181: goto -49 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	AudioDeviceInterface
    //   154	17	1	localIllegalStateException	IllegalStateException
    //   176	2	1	localFileNotFoundException	java.io.FileNotFoundException
    //   1	107	2	i	int
    // Exception table:
    //   from	to	target	type
    //   70	77	154	java/lang/IllegalStateException
    //   117	132	176	java/io/FileNotFoundException
  }
  
  /* Error */
  private int StartRecording()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   5: ifeq +12 -> 17
    //   8: ldc -76
    //   10: iconst_0
    //   11: ldc_w 550
    //   14: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   17: aload_0
    //   18: getfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   21: ifeq +40 -> 61
    //   24: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   27: ifeq +32 -> 59
    //   30: ldc -76
    //   32: iconst_0
    //   33: new 182	java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   40: ldc_w 552
    //   43: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: aload_0
    //   47: getfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   50: invokevirtual 241	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   53: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   59: iconst_m1
    //   60: ireturn
    //   61: aload_0
    //   62: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   65: ifnonnull +40 -> 105
    //   68: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   71: ifeq -12 -> 59
    //   74: ldc -76
    //   76: iconst_0
    //   77: new 182	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   84: ldc_w 554
    //   87: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload_0
    //   91: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   94: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   103: iconst_m1
    //   104: ireturn
    //   105: aload_0
    //   106: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   109: invokevirtual 557	android/media/AudioRecord:startRecording	()V
    //   112: getstatic 66	com/tencent/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   115: ifeq +52 -> 167
    //   118: aload_0
    //   119: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   122: ifnull +11 -> 133
    //   125: aload_0
    //   126: getfield 102	com/tencent/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   129: invokevirtual 280	android/media/AudioManager:getMode	()I
    //   132: istore_2
    //   133: aload_0
    //   134: new 530	java/io/File
    //   137: dup
    //   138: aload_0
    //   139: ldc_w 559
    //   142: iload_2
    //   143: invokespecial 536	com/tencent/sharp/jni/AudioDeviceInterface:getDumpFilePath	(Ljava/lang/String;I)Ljava/lang/String;
    //   146: invokespecial 538	java/io/File:<init>	(Ljava/lang/String;)V
    //   149: putfield 125	com/tencent/sharp/jni/AudioDeviceInterface:_rec_dump	Ljava/io/File;
    //   152: aload_0
    //   153: new 433	java/io/FileOutputStream
    //   156: dup
    //   157: aload_0
    //   158: getfield 125	com/tencent/sharp/jni/AudioDeviceInterface:_rec_dump	Ljava/io/File;
    //   161: invokespecial 541	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   164: putfield 129	com/tencent/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   167: aload_0
    //   168: iconst_1
    //   169: putfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   172: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   175: ifeq +12 -> 187
    //   178: ldc -76
    //   180: iconst_0
    //   181: ldc_w 561
    //   184: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   187: iconst_0
    //   188: ireturn
    //   189: astore_1
    //   190: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   193: ifeq +12 -> 205
    //   196: ldc -76
    //   198: iconst_0
    //   199: ldc_w 563
    //   202: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   205: aload_1
    //   206: invokevirtual 546	java/lang/IllegalStateException:printStackTrace	()V
    //   209: iconst_m1
    //   210: ireturn
    //   211: astore_1
    //   212: aload_1
    //   213: invokevirtual 547	java/io/FileNotFoundException:printStackTrace	()V
    //   216: goto -49 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	this	AudioDeviceInterface
    //   189	17	1	localIllegalStateException	IllegalStateException
    //   211	2	1	localFileNotFoundException	java.io.FileNotFoundException
    //   1	142	2	i	int
    // Exception table:
    //   from	to	target	type
    //   105	112	189	java/lang/IllegalStateException
    //   152	167	211	java/io/FileNotFoundException
  }
  
  /* Error */
  private int StopPlayback()
  {
    // Byte code:
    //   0: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   3: ifeq +32 -> 35
    //   6: ldc -76
    //   8: iconst_0
    //   9: new 182	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   16: ldc_w 566
    //   19: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_0
    //   23: getfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   26: invokevirtual 241	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   29: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   35: aload_0
    //   36: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   39: ifnonnull +53 -> 92
    //   42: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   45: ifeq +45 -> 90
    //   48: ldc -76
    //   50: iconst_0
    //   51: new 182	java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   58: ldc_w 568
    //   61: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: aload_0
    //   65: getfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   68: invokevirtual 241	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   71: ldc_w 419
    //   74: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   81: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   90: iconst_m1
    //   91: ireturn
    //   92: aload_0
    //   93: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   96: invokevirtual 422	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   99: aload_0
    //   100: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   103: invokevirtual 458	android/media/AudioTrack:getPlayState	()I
    //   106: istore_2
    //   107: iload_2
    //   108: iconst_3
    //   109: if_icmpne +70 -> 179
    //   112: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   115: ifeq +12 -> 127
    //   118: ldc -76
    //   120: iconst_0
    //   121: ldc_w 460
    //   124: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   127: aload_0
    //   128: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   131: invokevirtual 463	android/media/AudioTrack:stop	()V
    //   134: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   137: ifeq +35 -> 172
    //   140: ldc -76
    //   142: iconst_0
    //   143: new 182	java/lang/StringBuilder
    //   146: dup
    //   147: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   150: ldc_w 468
    //   153: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload_0
    //   157: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   160: invokevirtual 458	android/media/AudioTrack:getPlayState	()I
    //   163: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   172: aload_0
    //   173: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   176: invokevirtual 466	android/media/AudioTrack:flush	()V
    //   179: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   182: ifeq +35 -> 217
    //   185: ldc -76
    //   187: iconst_0
    //   188: new 182	java/lang/StringBuilder
    //   191: dup
    //   192: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   195: ldc_w 470
    //   198: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: aload_0
    //   202: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   205: invokevirtual 458	android/media/AudioTrack:getPlayState	()I
    //   208: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   211: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   217: aload_0
    //   218: getfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   221: invokevirtual 259	android/media/AudioTrack:release	()V
    //   224: aload_0
    //   225: aconst_null
    //   226: putfield 80	com/tencent/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   229: aload_0
    //   230: iconst_0
    //   231: putfield 117	com/tencent/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   234: aload_0
    //   235: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   238: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   241: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   244: ifeq +12 -> 256
    //   247: ldc -76
    //   249: iconst_0
    //   250: ldc_w 570
    //   253: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   256: iconst_0
    //   257: ireturn
    //   258: astore_1
    //   259: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   262: ifeq +12 -> 274
    //   265: ldc -76
    //   267: iconst_0
    //   268: ldc_w 477
    //   271: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   274: aload_1
    //   275: invokevirtual 546	java/lang/IllegalStateException:printStackTrace	()V
    //   278: aload_0
    //   279: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   282: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   285: iconst_m1
    //   286: ireturn
    //   287: astore_1
    //   288: aload_0
    //   289: getfield 107	com/tencent/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   292: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   295: aload_1
    //   296: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	297	0	this	AudioDeviceInterface
    //   258	17	1	localIllegalStateException	IllegalStateException
    //   287	9	1	localObject	Object
    //   106	4	2	i	int
    // Exception table:
    //   from	to	target	type
    //   112	127	258	java/lang/IllegalStateException
    //   127	134	258	java/lang/IllegalStateException
    //   99	107	287	finally
    //   112	127	287	finally
    //   127	134	287	finally
    //   134	172	287	finally
    //   172	179	287	finally
    //   179	217	287	finally
    //   217	234	287	finally
    //   259	274	287	finally
    //   274	278	287	finally
  }
  
  /* Error */
  private int StopRecording()
  {
    // Byte code:
    //   0: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   3: ifeq +12 -> 15
    //   6: ldc -76
    //   8: iconst_0
    //   9: ldc_w 573
    //   12: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   15: aload_0
    //   16: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   19: ifnonnull +40 -> 59
    //   22: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   25: ifeq +32 -> 57
    //   28: ldc -76
    //   30: iconst_0
    //   31: new 182	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   38: ldc_w 575
    //   41: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_0
    //   45: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   48: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   57: iconst_m1
    //   58: ireturn
    //   59: aload_0
    //   60: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   63: invokevirtual 422	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   66: aload_0
    //   67: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   70: invokevirtual 578	android/media/AudioRecord:getRecordingState	()I
    //   73: istore_2
    //   74: iload_2
    //   75: iconst_3
    //   76: if_icmpne +48 -> 124
    //   79: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   82: ifeq +35 -> 117
    //   85: ldc -76
    //   87: iconst_0
    //   88: new 182	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   95: ldc_w 580
    //   98: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_0
    //   102: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   105: invokevirtual 578	android/media/AudioRecord:getRecordingState	()I
    //   108: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   111: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   117: aload_0
    //   118: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   121: invokevirtual 581	android/media/AudioRecord:stop	()V
    //   124: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   127: ifeq +35 -> 162
    //   130: ldc -76
    //   132: iconst_0
    //   133: new 182	java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   140: ldc_w 583
    //   143: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: aload_0
    //   147: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   150: invokevirtual 578	android/media/AudioRecord:getRecordingState	()I
    //   153: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   162: aload_0
    //   163: getfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   166: invokevirtual 354	android/media/AudioRecord:release	()V
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 82	com/tencent/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield 115	com/tencent/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   179: aload_0
    //   180: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   183: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   186: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   189: ifeq +12 -> 201
    //   192: ldc -76
    //   194: iconst_0
    //   195: ldc_w 585
    //   198: invokestatic 200	com/tencent/av/utils/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   201: iconst_0
    //   202: ireturn
    //   203: astore_1
    //   204: invokestatic 178	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   207: ifeq +12 -> 219
    //   210: ldc -76
    //   212: iconst_0
    //   213: ldc_w 587
    //   216: invokestatic 244	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   219: aload_1
    //   220: invokevirtual 546	java/lang/IllegalStateException:printStackTrace	()V
    //   223: aload_0
    //   224: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   227: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   230: iconst_m1
    //   231: ireturn
    //   232: astore_1
    //   233: aload_0
    //   234: getfield 109	com/tencent/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   237: invokevirtual 425	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   240: aload_1
    //   241: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	this	AudioDeviceInterface
    //   203	17	1	localIllegalStateException	IllegalStateException
    //   232	9	1	localObject	Object
    //   73	4	2	i	int
    // Exception table:
    //   from	to	target	type
    //   79	117	203	java/lang/IllegalStateException
    //   117	124	203	java/lang/IllegalStateException
    //   66	74	232	finally
    //   79	117	232	finally
    //   117	124	232	finally
    //   124	162	232	finally
    //   162	179	232	finally
    //   204	219	232	finally
    //   219	223	232	finally
  }
  
  @TargetApi(16)
  private int getAudioSessionId(AudioRecord paramAudioRecord)
  {
    return 0;
  }
  
  private String getDumpFilePath(String paramString, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "manufacture:" + Build.MANUFACTURER);
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "MODEL:" + Build.MODEL);
    }
    paramString = Environment.getExternalStorageDirectory().getPath() + "/MF-" + Build.MANUFACTURER + "-M-" + Build.MODEL + "-as-" + TraeAudioManager.getAudioSource(this._audioSourcePolicy) + "-st-" + this._streamType + "-m-" + paramInt + "-" + paramString;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "dump:" + paramString);
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "dump replace:" + paramString.replace(" ", "_"));
    }
    return paramString.replace(" ", "_");
  }
  
  private int getLowlatencyFramesPerBuffer()
  {
    if ((this._context == null) || (Build.VERSION.SDK_INT < 9))
    {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
      }
      return 0;
    }
    boolean bool = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder().append("LOW_LATENCY:");
      if (bool != true) {
        break label146;
      }
    }
    label146:
    for (String str = "Y";; str = "N")
    {
      QLog.w("TRAE", 0, str);
      if ((Build.VERSION.SDK_INT >= 17) || (!QLog.isColorLevel())) {
        break;
      }
      QLog.e("TRAE", 0, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
      return 0;
    }
  }
  
  private int getLowlatencySamplerate()
  {
    if ((this._context == null) || (Build.VERSION.SDK_INT < 9)) {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
      }
    }
    label146:
    label153:
    do
    {
      return 0;
      boolean bool = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
      StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder().append("LOW_LATENCY:");
        if (bool != true) {
          break label146;
        }
      }
      for (String str = "Y";; str = "N")
      {
        QLog.w("TRAE", 0, str);
        if (Build.VERSION.SDK_INT >= 17) {
          break label153;
        }
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.e("TRAE", 0, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
        return 0;
      }
    } while (!QLog.isColorLevel());
    QLog.e("TRAE", 0, "getLowlatencySamplerate not support right now!");
    return 0;
  }
  
  public static String getTraceInfo()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    int i = arrayOfStackTraceElement.length;
    localStringBuffer.append("").append(arrayOfStackTraceElement[2].getClassName()).append(".").append(arrayOfStackTraceElement[2].getMethodName()).append(": ").append(arrayOfStackTraceElement[2].getLineNumber());
    return localStringBuffer.toString();
  }
  
  private void initTRAEAudioManager()
  {
    if (this._context != null)
    {
      TraeAudioManager.init(this._context);
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "initTRAEAudioManager , TraeAudioSession startService");
      }
    }
  }
  
  private void onOutputChanage(String paramString)
  {
    setAudioRouteSwitchState(paramString);
    if (!TraeAudioManager.isCloseSystemAPM(this._modePolicy)) {}
    while ((this._sceneModeKey == 1) || (this._sceneModeKey == 2)) {
      return;
    }
    this._connectedDev = paramString;
    Object localObject;
    if (QLog.isColorLevel())
    {
      StringBuilder localStringBuilder = new StringBuilder().append(" onOutputChanage:").append(paramString);
      if (this._audioManager != null) {
        break label215;
      }
      localObject = " am==null";
      localStringBuilder = localStringBuilder.append((String)localObject).append(" st:").append(this._streamType);
      if (this._audioTrack != null) {
        break label245;
      }
      localObject = "_audioTrack==null";
      label102:
      QLog.w("TRAE", 0, (String)localObject);
    }
    for (;;)
    {
      try
      {
        if (this._audioManager == null) {
          this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
        }
        if (QLog.isColorLevel())
        {
          localObject = new StringBuilder().append(" curr mode:").append(paramString);
          if (this._audioManager != null) {
            continue;
          }
          paramString = "am==null";
          QLog.w("TRAE", 0, paramString);
        }
        if (this._connectedDev.equals("DEVICE_SPEAKERPHONE")) {
          this._audioManager.setMode(0);
        }
      }
      catch (Exception paramString)
      {
        label215:
        label245:
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.w("TRAE", 0, paramString.getMessage());
        continue;
      }
      this._audioRouteChanged = true;
      return;
      localObject = " mode:" + this._audioManager.getMode();
      break;
      localObject = " at.st:" + this._audioTrack.getStreamType();
      break label102;
      paramString = " mode:" + this._audioManager.getMode();
    }
  }
  
  private void setAudioRouteSwitchState(String paramString)
  {
    if (paramString.equals("DEVICE_EARPHONE"))
    {
      this.switchState = 1;
      return;
    }
    if (paramString.equals("DEVICE_SPEAKERPHONE"))
    {
      this.switchState = 2;
      return;
    }
    if (paramString.equals("DEVICE_WIREDHEADSET"))
    {
      this.switchState = 3;
      return;
    }
    if (paramString.equals("DEVICE_BLUETOOTHHEADSET"))
    {
      this.switchState = 4;
      return;
    }
    this.switchState = 0;
  }
  
  private void uninitTRAEAudioManager()
  {
    if (this._context != null)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "uninitTRAEAudioManager , stopService");
      }
      TraeAudioManager.uninit();
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.w("TRAE", 0, "uninitTRAEAudioManager , context null");
  }
  
  public int call_postprocess()
  {
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as != null)
    {
      this._as.voiceCallPostprocess();
      this._as.release();
      this._as = null;
    }
    LogTraceExit();
    return 0;
  }
  
  public int call_preprocess()
  {
    LogTraceEntry("");
    this.switchState = 0;
    this._streamType = TraeAudioManager.getAudioStreamType(this._audioStreamTypePolicy);
    if (this._as == null) {
      this._as = new TraeAudioSession(this._context, new AudioDeviceInterface.1(this));
    }
    this._preDone = false;
    if (this._as != null) {
      this._prelock.lock();
    }
    int i;
    int j;
    label208:
    for (;;)
    {
      try
      {
        this._as.getConnectedDevice();
        this._as.voiceCallPreprocess(this._modePolicy, this._streamType);
        i = 7;
        j = i - 1;
        if (i <= 0) {}
      }
      finally
      {
        this._prelock.unlock();
      }
      try
      {
        if (!this._preDone)
        {
          this._precon.await(1L, TimeUnit.SECONDS);
          if (!QLog.isColorLevel()) {
            break label208;
          }
          QLog.e("TRAE", 0, "call_preprocess waiting...  as:" + this._as);
          i = j;
          continue;
        }
        if (QLog.isColorLevel()) {
          QLog.e("TRAE", 0, "call_preprocess done!");
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        continue;
        i = j;
      }
      this._prelock.unlock();
      LogTraceExit();
      return 0;
    }
  }
  
  public int getAudioRouteSwitchState()
  {
    return this.switchState;
  }
  
  public void setContext(Context paramContext)
  {
    this._context = paramContext;
  }
  
  public void setJavaInterface(int paramInt)
  {
    if (paramInt == 0) {}
    for (this.usingJava = false;; this.usingJava = true)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "setJavaInterface flg:" + paramInt);
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\AudioDeviceInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */