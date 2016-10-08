package com.iflytek.thirdparty;

import android.os.Environment;
import java.io.File;

public class ab
{
  public static String a = "wtime";
  public static final String b = Environment.getExternalStorageDirectory().getPath() + "/msc/ist/audio/";
  public static final String[][] c;
  
  static
  {
    String[] arrayOfString1 = { "surl", "server_url" };
    String[] arrayOfString2 = { "besturl_search", "search_best_url" };
    String[] arrayOfString3 = { "bsts", "search_best_url" };
    String[] arrayOfString4 = { "asr_sch", "sch" };
    String[] arrayOfString5 = { "scene", "scn" };
    String[] arrayOfString6 = { "asr_nomatch_error", "asr_nme" };
    String[] arrayOfString7 = { "result_type", "rst" };
    String[] arrayOfString8 = { "vad_bos", "vad_timeout" };
    String[] arrayOfString9 = { "bos", "vad_timeout" };
    String[] arrayOfString10 = { "vad_eos", "vad_speech_tail", "eos" };
    String[] arrayOfString11 = { "eos", "vad_speech_tail", "eos" };
    String[] arrayOfString12 = { "tts_buffer_time", "tbt" };
    String[] arrayOfString13 = { "data_type", "dtt" };
    String[] arrayOfString14 = { "asr_nbest", "nbest" };
    String[] arrayOfString15 = { "asr_wbest", "wbest" };
    String[] arrayOfString16 = { "asr_dwa", "dwa" };
    String[] arrayOfString17 = { "voice_name", "vcn" };
    String[] arrayOfString18 = { "text_encoding", "tte" };
    String[] arrayOfString19 = { "ivw_net_mode", "ivwnet_mode" };
    c = new String[][] { arrayOfString1, arrayOfString2, arrayOfString3, arrayOfString4, arrayOfString5, arrayOfString6, { "asr_ptt", "ptt" }, arrayOfString7, { "result_level", "rst_level" }, arrayOfString8, arrayOfString9, arrayOfString10, arrayOfString11, { "asr_audio_path", "aap" }, arrayOfString12, { "tts_audio_path", "tap" }, { "subject", "sub" }, arrayOfString13, arrayOfString14, arrayOfString15, arrayOfString16, arrayOfString17, { "background_sound", "bgs" }, arrayOfString18, arrayOfString19 };
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */