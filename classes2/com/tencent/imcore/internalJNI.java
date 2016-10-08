package com.tencent.imcore;

public class internalJNI
{
  static {}
  
  public static final native long AddFriendReqVec_capacity(long paramLong, AddFriendReqVec paramAddFriendReqVec);
  
  public static final native void AddFriendReqVec_clear(long paramLong, AddFriendReqVec paramAddFriendReqVec);
  
  public static final native boolean AddFriendReqVec_empty(long paramLong, AddFriendReqVec paramAddFriendReqVec);
  
  public static final native long AddFriendReqVec_get(long paramLong, AddFriendReqVec paramAddFriendReqVec, int paramInt);
  
  public static final native void AddFriendReqVec_pushBack(long paramLong1, AddFriendReqVec paramAddFriendReqVec, long paramLong2, AddFriendReq paramAddFriendReq);
  
  public static final native void AddFriendReqVec_reserve(long paramLong1, AddFriendReqVec paramAddFriendReqVec, long paramLong2);
  
  public static final native void AddFriendReqVec_set(long paramLong1, AddFriendReqVec paramAddFriendReqVec, int paramInt, long paramLong2, AddFriendReq paramAddFriendReq);
  
  public static final native long AddFriendReqVec_size(long paramLong, AddFriendReqVec paramAddFriendReqVec);
  
  public static final native String AddFriendReq_identifier_get(long paramLong, AddFriendReq paramAddFriendReq);
  
  public static final native void AddFriendReq_identifier_set(long paramLong, AddFriendReq paramAddFriendReq, String paramString);
  
  public static final native byte[] AddFriendReq_nickname_get(long paramLong, AddFriendReq paramAddFriendReq);
  
  public static final native void AddFriendReq_nickname_set(long paramLong, AddFriendReq paramAddFriendReq, byte[] paramArrayOfByte);
  
  public static final native byte[] AddFriendReq_source_get(long paramLong, AddFriendReq paramAddFriendReq);
  
  public static final native void AddFriendReq_source_set(long paramLong, AddFriendReq paramAddFriendReq, byte[] paramArrayOfByte);
  
  public static final native byte[] AddFriendReq_wording_get(long paramLong, AddFriendReq paramAddFriendReq);
  
  public static final native void AddFriendReq_wording_set(long paramLong, AddFriendReq paramAddFriendReq, byte[] paramArrayOfByte);
  
  public static final native void BytesMap_clear(long paramLong, BytesMap paramBytesMap);
  
  public static final native void BytesMap_del(long paramLong, BytesMap paramBytesMap, byte[] paramArrayOfByte);
  
  public static final native boolean BytesMap_empty(long paramLong, BytesMap paramBytesMap);
  
  public static final native byte[] BytesMap_get(long paramLong, BytesMap paramBytesMap, byte[] paramArrayOfByte);
  
  public static final native boolean BytesMap_hasKey(long paramLong, BytesMap paramBytesMap, byte[] paramArrayOfByte);
  
  public static final native void BytesMap_set(long paramLong, BytesMap paramBytesMap, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static final native long BytesMap_size(long paramLong, BytesMap paramBytesMap);
  
  public static final native void BytesMemberInfoMap_clear(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap);
  
  public static final native void BytesMemberInfoMap_del(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap, byte[] paramArrayOfByte);
  
  public static final native boolean BytesMemberInfoMap_empty(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap);
  
  public static final native long BytesMemberInfoMap_get(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap, byte[] paramArrayOfByte);
  
  public static final native boolean BytesMemberInfoMap_hasKey(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap, byte[] paramArrayOfByte);
  
  public static final native void BytesMemberInfoMap_set(long paramLong1, BytesMemberInfoMap paramBytesMemberInfoMap, byte[] paramArrayOfByte, long paramLong2, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native long BytesMemberInfoMap_size(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap);
  
  public static final native void BytesMemberInfoParser_fetchMapKeys(long paramLong1, BytesMemberInfoParser paramBytesMemberInfoParser, long paramLong2);
  
  public static final native long BytesMemberInfoParser_getKey(long paramLong, BytesMemberInfoParser paramBytesMemberInfoParser, int paramInt);
  
  public static final native long BytesMemberInfoParser_getValue(long paramLong1, BytesMemberInfoParser paramBytesMemberInfoParser, long paramLong2, int paramInt);
  
  public static final native long BytesMemberInfoParser_keys_get(long paramLong, BytesMemberInfoParser paramBytesMemberInfoParser);
  
  public static final native void BytesMemberInfoParser_keys_set(long paramLong1, BytesMemberInfoParser paramBytesMemberInfoParser, long paramLong2, StrVec paramStrVec);
  
  public static final native void BytesProfileMapParser_fetchMapKeys(long paramLong1, BytesProfileMapParser paramBytesProfileMapParser, long paramLong2);
  
  public static final native long BytesProfileMapParser_getKey(long paramLong, BytesProfileMapParser paramBytesProfileMapParser, int paramInt);
  
  public static final native long BytesProfileMapParser_getValue(long paramLong1, BytesProfileMapParser paramBytesProfileMapParser, long paramLong2, int paramInt);
  
  public static final native long BytesProfileMapParser_keys_get(long paramLong, BytesProfileMapParser paramBytesProfileMapParser);
  
  public static final native void BytesProfileMapParser_keys_set(long paramLong1, BytesProfileMapParser paramBytesProfileMapParser, long paramLong2, StrVec paramStrVec);
  
  public static final native void BytesProfileMap_clear(long paramLong, BytesProfileMap paramBytesProfileMap);
  
  public static final native void BytesProfileMap_del(long paramLong, BytesProfileMap paramBytesProfileMap, byte[] paramArrayOfByte);
  
  public static final native boolean BytesProfileMap_empty(long paramLong, BytesProfileMap paramBytesProfileMap);
  
  public static final native long BytesProfileMap_get(long paramLong, BytesProfileMap paramBytesProfileMap, byte[] paramArrayOfByte);
  
  public static final native boolean BytesProfileMap_hasKey(long paramLong, BytesProfileMap paramBytesProfileMap, byte[] paramArrayOfByte);
  
  public static final native void BytesProfileMap_set(long paramLong1, BytesProfileMap paramBytesProfileMap, byte[] paramArrayOfByte, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native long BytesProfileMap_size(long paramLong, BytesProfileMap paramBytesProfileMap);
  
  public static final native byte[] BytesVecFetcher_getBytesByIndex(long paramLong, BytesVecFetcher paramBytesVecFetcher, int paramInt);
  
  public static final native long BytesVecFetcher_values_get(long paramLong, BytesVecFetcher paramBytesVecFetcher);
  
  public static final native void BytesVecFetcher_values_set(long paramLong1, BytesVecFetcher paramBytesVecFetcher, long paramLong2, BytesVec paramBytesVec);
  
  public static final native long BytesVec_capacity(long paramLong, BytesVec paramBytesVec);
  
  public static final native void BytesVec_clear(long paramLong, BytesVec paramBytesVec);
  
  public static final native boolean BytesVec_empty(long paramLong, BytesVec paramBytesVec);
  
  public static final native byte[] BytesVec_get(long paramLong, BytesVec paramBytesVec, int paramInt);
  
  public static final native void BytesVec_pushBack(long paramLong, BytesVec paramBytesVec, byte[] paramArrayOfByte);
  
  public static final native void BytesVec_reserve(long paramLong1, BytesVec paramBytesVec, long paramLong2);
  
  public static final native void BytesVec_set(long paramLong, BytesVec paramBytesVec, int paramInt, byte[] paramArrayOfByte);
  
  public static final native long BytesVec_size(long paramLong, BytesVec paramBytesVec);
  
  public static final native long Context_bid_get(long paramLong, Context paramContext);
  
  public static final native void Context_bid_set(long paramLong1, Context paramContext, long paramLong2);
  
  public static final native boolean Context_isLogPrintEnabled_get(long paramLong, Context paramContext);
  
  public static final native void Context_isLogPrintEnabled_set(long paramLong, Context paramContext, boolean paramBoolean);
  
  public static final native String Context_logPath_get(long paramLong, Context paramContext);
  
  public static final native void Context_logPath_set(long paramLong, Context paramContext, String paramString);
  
  public static final native String Context_picCachePath_get(long paramLong, Context paramContext);
  
  public static final native void Context_picCachePath_set(long paramLong, Context paramContext, String paramString);
  
  public static final native long Context_platform_get(long paramLong, Context paramContext);
  
  public static final native void Context_platform_set(long paramLong1, Context paramContext, long paramLong2);
  
  public static final native long Context_svr_time_diff_get(long paramLong, Context paramContext);
  
  public static final native void Context_svr_time_diff_set(long paramLong1, Context paramContext, long paramLong2);
  
  public static final native byte[] CustomElem_data_get(long paramLong, CustomElem paramCustomElem);
  
  public static final native void CustomElem_data_set(long paramLong, CustomElem paramCustomElem, byte[] paramArrayOfByte);
  
  public static final native byte[] CustomElem_desc_get(long paramLong, CustomElem paramCustomElem);
  
  public static final native void CustomElem_desc_set(long paramLong, CustomElem paramCustomElem, byte[] paramArrayOfByte);
  
  public static final native byte[] CustomElem_ext_get(long paramLong, CustomElem paramCustomElem);
  
  public static final native void CustomElem_ext_set(long paramLong, CustomElem paramCustomElem, byte[] paramArrayOfByte);
  
  public static final native byte[] CustomElem_sound_get(long paramLong, CustomElem paramCustomElem);
  
  public static final native void CustomElem_sound_set(long paramLong, CustomElem paramCustomElem, byte[] paramArrayOfByte);
  
  public static final native int ERR_BIND_FAIL_GUID_NULL_get();
  
  public static final native int ERR_BIND_FAIL_ISBINDING_get();
  
  public static final native int ERR_BIND_FAIL_NO_SSOTICKET_get();
  
  public static final native int ERR_BIND_FAIL_REG_TIMEOUT_get();
  
  public static final native int ERR_BIND_FAIL_REPEATD_BIND_get();
  
  public static final native int ERR_BIND_FAIL_TINYID_NULL_get();
  
  public static final native int ERR_BIND_FAIL_UNKNOWN_get();
  
  public static final native int ERR_BIND_FAIL_UNPACK_REGPACK_FAILED_get();
  
  public static final native int ERR_DATABASE_OPERATE_FAILED_get();
  
  public static final native int ERR_EXPIRED_SESSION_NODE_get();
  
  public static final native int ERR_FILE_TRANS_AUTH_FAILED_get();
  
  public static final native int ERR_FILE_TRANS_DOWNLOAD_FAILED_get();
  
  public static final native int ERR_FILE_TRANS_NO_SERVER_get();
  
  public static final native int ERR_FILE_TRANS_UPLOAD_FAILED_get();
  
  public static final native int ERR_FRIENDSHIP_PROXY_LOCAL_CHECK_ERR_get();
  
  public static final native int ERR_FRIENDSHIP_PROXY_NOT_SYNCED_get();
  
  public static final native int ERR_FRIENDSHIP_PROXY_SYNCED_FAIL_get();
  
  public static final native int ERR_FRIENDSHIP_PROXY_SYNCING_get();
  
  public static final native int ERR_GROUP_INVALID_FIELD_get();
  
  public static final native int ERR_GROUP_STORAGE_DISABLED_get();
  
  public static final native int ERR_HTTP_REQ_FAILED_get();
  
  public static final native int ERR_INIT_CORE_FAIL_get();
  
  public static final native int ERR_INVALID_CONVERSATION_get();
  
  public static final native int ERR_INVALID_MSG_ELEM_get();
  
  public static final native int ERR_INVALID_PARAMETERS_get();
  
  public static final native int ERR_IN_PROGESS_get();
  
  public static final native int ERR_LOADGRPINFO_FAILED_get();
  
  public static final native int ERR_LOADMSG_FAILED_get();
  
  public static final native int ERR_LOGIN_AUTH_FAILED_get();
  
  public static final native int ERR_LOGIN_KICKED_OFF_BY_OTHER_get();
  
  public static final native int ERR_LOGIN_SIG_EXPIRE_get();
  
  public static final native int ERR_NO_SUCC_RESULT_get();
  
  public static final native int ERR_OPENBDH_BASE_get();
  
  public static final native int ERR_PACKET_FAIL_FLOW_SAVE_FILTERED_get();
  
  public static final native int ERR_PACKET_FAIL_LOGIC_ERR_get();
  
  public static final native int ERR_PACKET_FAIL_REQ_NO_AUTH_get();
  
  public static final native int ERR_PACKET_FAIL_REQ_NO_NET_get();
  
  public static final native int ERR_PACKET_FAIL_REQ_ON_RESEND_get();
  
  public static final native int ERR_PACKET_FAIL_REQ_OVER_LOAD_get();
  
  public static final native int ERR_PACKET_FAIL_REQ_TIMEOUT_get();
  
  public static final native int ERR_PACKET_FAIL_RESP_NO_NET_get();
  
  public static final native int ERR_PACKET_FAIL_RESP_NO_RESEND_get();
  
  public static final native int ERR_PACKET_FAIL_RESP_TIMEOUT_get();
  
  public static final native int ERR_PACKET_FAIL_SSO_ERR_get();
  
  public static final native int ERR_PACKET_FAIL_UNKNOWN_get();
  
  public static final native int ERR_PARSE_RESPONSE_FAILED_get();
  
  public static final native int ERR_REQUEST_TIMEOUT_get();
  
  public static final native int ERR_REQ_CONTENT_ATTACK_get();
  
  public static final native int ERR_REQ_NO_NET_ON_REQ_get();
  
  public static final native int ERR_REQ_NO_NET_ON_RSP_get();
  
  public static final native int ERR_SDK_NOT_INITIALIZED_get();
  
  public static final native int ERR_SDK_NOT_LOGGED_IN_get();
  
  public static final native int ERR_SERIALIZE_REQ_FAILED_get();
  
  public static final native int ERR_SUCC_get();
  
  public static final native int ERR_TO_USER_INVALID_get();
  
  public static final native int ERR_USER_SIG_EXPIRED_get();
  
  public static final native long Elem_custom_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_custom_set(long paramLong1, Elem paramElem, long paramLong2, CustomElem paramCustomElem);
  
  public static final native long Elem_face_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_face_set(long paramLong1, Elem paramElem, long paramLong2, FaceElem paramFaceElem);
  
  public static final native long Elem_file_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_file_set(long paramLong1, Elem paramElem, long paramLong2, FileElem paramFileElem);
  
  public static final native long Elem_friend_change_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_friend_change_set(long paramLong1, Elem paramElem, long paramLong2, FriendChangeElem paramFriendChangeElem);
  
  public static final native long Elem_group_report_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_group_report_set(long paramLong1, Elem paramElem, long paramLong2, GroupReportElem paramGroupReportElem);
  
  public static final native long Elem_group_tips_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_group_tips_set(long paramLong1, Elem paramElem, long paramLong2, GroupTipsElem paramGroupTipsElem);
  
  public static final native long Elem_image_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_image_set(long paramLong1, Elem paramElem, long paramLong2, ImageElem paramImageElem);
  
  public static final native long Elem_location_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_location_set(long paramLong1, Elem paramElem, long paramLong2, LocationElem paramLocationElem);
  
  public static final native long Elem_profile_change_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_profile_change_set(long paramLong1, Elem paramElem, long paramLong2, ProfileChangeElem paramProfileChangeElem);
  
  public static final native byte[] Elem_resource_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_resource_set(long paramLong, Elem paramElem, byte[] paramArrayOfByte);
  
  public static final native long Elem_sound_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_sound_set(long paramLong1, Elem paramElem, long paramLong2, SoundElem paramSoundElem);
  
  public static final native long Elem_text_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_text_set(long paramLong1, Elem paramElem, long paramLong2, TextElem paramTextElem);
  
  public static final native int Elem_type_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_type_set(long paramLong, Elem paramElem, int paramInt);
  
  public static final native long Elem_video_get(long paramLong, Elem paramElem);
  
  public static final native void Elem_video_set(long paramLong1, Elem paramElem, long paramLong2, VideoElem paramVideoElem);
  
  public static final native void EnvRequestClosure_done(long paramLong, EnvRequestClosure paramEnvRequestClosure, byte[] paramArrayOfByte);
  
  public static final native void EnvRequestClosure_fail(long paramLong, EnvRequestClosure paramEnvRequestClosure, int paramInt, String paramString);
  
  public static final native void EnvRequestClosure_release(long paramLong, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native long ErrCodeManager_get();
  
  public static final native boolean ErrCodeManager_transErrCode(long paramLong1, ErrCodeManager paramErrCodeManager, String paramString, long paramLong2, long paramLong3);
  
  public static final native long ErrInfoVec_capacity(long paramLong, ErrInfoVec paramErrInfoVec);
  
  public static final native void ErrInfoVec_clear(long paramLong, ErrInfoVec paramErrInfoVec);
  
  public static final native boolean ErrInfoVec_empty(long paramLong, ErrInfoVec paramErrInfoVec);
  
  public static final native long ErrInfoVec_get(long paramLong, ErrInfoVec paramErrInfoVec, int paramInt);
  
  public static final native void ErrInfoVec_pushBack(long paramLong1, ErrInfoVec paramErrInfoVec, long paramLong2, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo);
  
  public static final native void ErrInfoVec_reserve(long paramLong1, ErrInfoVec paramErrInfoVec, long paramLong2);
  
  public static final native void ErrInfoVec_set(long paramLong1, ErrInfoVec paramErrInfoVec, int paramInt, long paramLong2, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo);
  
  public static final native long ErrInfoVec_size(long paramLong, ErrInfoVec paramErrInfoVec);
  
  public static final native byte[] FaceElem_buf_get(long paramLong, FaceElem paramFaceElem);
  
  public static final native void FaceElem_buf_set(long paramLong, FaceElem paramFaceElem, byte[] paramArrayOfByte);
  
  public static final native int FaceElem_index_get(long paramLong, FaceElem paramFaceElem);
  
  public static final native void FaceElem_index_set(long paramLong, FaceElem paramFaceElem, int paramInt);
  
  public static final native byte[] FileElem_file_name_get(long paramLong, FileElem paramFileElem);
  
  public static final native void FileElem_file_name_set(long paramLong, FileElem paramFileElem, byte[] paramArrayOfByte);
  
  public static final native byte[] FileElem_file_path_get(long paramLong, FileElem paramFileElem);
  
  public static final native void FileElem_file_path_set(long paramLong, FileElem paramFileElem, byte[] paramArrayOfByte);
  
  public static final native long FileElem_file_size_get(long paramLong, FileElem paramFileElem);
  
  public static final native void FileElem_file_size_set(long paramLong1, FileElem paramFileElem, long paramLong2);
  
  public static final native String FileElem_fileid_get(long paramLong, FileElem paramFileElem);
  
  public static final native void FileElem_fileid_set(long paramLong, FileElem paramFileElem, String paramString);
  
  public static final native int FileElem_taskid_get(long paramLong, FileElem paramFileElem);
  
  public static final native void FileElem_taskid_set(long paramLong, FileElem paramFileElem, int paramInt);
  
  public static final native byte[] FileTransSuccParam_data_get(long paramLong, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void FileTransSuccParam_data_set(long paramLong, FileTransSuccParam paramFileTransSuccParam, byte[] paramArrayOfByte);
  
  public static final native long FileTransSuccParam_dlinfo_get(long paramLong, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void FileTransSuccParam_dlinfo_set(long paramLong1, FileTransSuccParam paramFileTransSuccParam, long paramLong2);
  
  public static final native String FileTransSuccParam_fileid_get(long paramLong, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void FileTransSuccParam_fileid_set(long paramLong, FileTransSuccParam paramFileTransSuccParam, String paramString);
  
  public static final native int FileTransSuccParam_height_get(long paramLong, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void FileTransSuccParam_height_set(long paramLong, FileTransSuccParam paramFileTransSuccParam, int paramInt);
  
  public static final native long FileTransSuccParam_size_get(long paramLong, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void FileTransSuccParam_size_set(long paramLong1, FileTransSuccParam paramFileTransSuccParam, long paramLong2);
  
  public static final native int FileTransSuccParam_width_get(long paramLong, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void FileTransSuccParam_width_set(long paramLong, FileTransSuccParam paramFileTransSuccParam, int paramInt);
  
  public static final native long FileTranser_getImpl(long paramLong, FileTranser paramFileTranser);
  
  public static final native void FileTranser_setCachePath(long paramLong, FileTranser paramFileTranser, String paramString);
  
  public static final native int FirendDeleteBothType_get();
  
  public static final native long FriendChangeElem_ddwDecideReportTimestamp_get(long paramLong, FriendChangeElem paramFriendChangeElem);
  
  public static final native void FriendChangeElem_ddwDecideReportTimestamp_set(long paramLong1, FriendChangeElem paramFriendChangeElem, long paramLong2);
  
  public static final native long FriendChangeElem_ddwPendencyReportTimestamp_get(long paramLong, FriendChangeElem paramFriendChangeElem);
  
  public static final native void FriendChangeElem_ddwPendencyReportTimestamp_set(long paramLong1, FriendChangeElem paramFriendChangeElem, long paramLong2);
  
  public static final native long FriendChangeElem_ddwRecommendReportTimestamp_get(long paramLong, FriendChangeElem paramFriendChangeElem);
  
  public static final native void FriendChangeElem_ddwRecommendReportTimestamp_set(long paramLong1, FriendChangeElem paramFriendChangeElem, long paramLong2);
  
  public static final native long FriendChangeElem_type_get(long paramLong, FriendChangeElem paramFriendChangeElem);
  
  public static final native void FriendChangeElem_type_set(long paramLong1, FriendChangeElem paramFriendChangeElem, long paramLong2);
  
  public static final native long FriendChangeElem_users_get(long paramLong, FriendChangeElem paramFriendChangeElem);
  
  public static final native void FriendChangeElem_users_set(long paramLong1, FriendChangeElem paramFriendChangeElem, long paramLong2, FriendChangeInfoVec paramFriendChangeInfoVec);
  
  public static final native long FriendChangeInfoVec_capacity(long paramLong, FriendChangeInfoVec paramFriendChangeInfoVec);
  
  public static final native void FriendChangeInfoVec_clear(long paramLong, FriendChangeInfoVec paramFriendChangeInfoVec);
  
  public static final native boolean FriendChangeInfoVec_empty(long paramLong, FriendChangeInfoVec paramFriendChangeInfoVec);
  
  public static final native long FriendChangeInfoVec_get(long paramLong, FriendChangeInfoVec paramFriendChangeInfoVec, int paramInt);
  
  public static final native void FriendChangeInfoVec_pushBack(long paramLong1, FriendChangeInfoVec paramFriendChangeInfoVec, long paramLong2, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeInfoVec_reserve(long paramLong1, FriendChangeInfoVec paramFriendChangeInfoVec, long paramLong2);
  
  public static final native void FriendChangeInfoVec_set(long paramLong1, FriendChangeInfoVec paramFriendChangeInfoVec, int paramInt, long paramLong2, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native long FriendChangeInfoVec_size(long paramLong, FriendChangeInfoVec paramFriendChangeInfoVec);
  
  public static final native byte[] FriendChangeUserInfo_add_source_get(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeUserInfo_add_source_set(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendChangeUserInfo_add_wording_get(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeUserInfo_add_wording_set(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendChangeUserInfo_group_get(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeUserInfo_group_set(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo, byte[] paramArrayOfByte);
  
  public static final native String FriendChangeUserInfo_identifier_get(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeUserInfo_identifier_set(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo, String paramString);
  
  public static final native byte[] FriendChangeUserInfo_nick_get(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeUserInfo_nick_set(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendChangeUserInfo_remark_get(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo);
  
  public static final native void FriendChangeUserInfo_remark_set(long paramLong, FriendChangeUserInfo paramFriendChangeUserInfo, byte[] paramArrayOfByte);
  
  public static final native int FriendDeleteSingleType_get();
  
  public static final native long FriendFutureItemVec_capacity(long paramLong, FriendFutureItemVec paramFriendFutureItemVec);
  
  public static final native void FriendFutureItemVec_clear(long paramLong, FriendFutureItemVec paramFriendFutureItemVec);
  
  public static final native boolean FriendFutureItemVec_empty(long paramLong, FriendFutureItemVec paramFriendFutureItemVec);
  
  public static final native long FriendFutureItemVec_get(long paramLong, FriendFutureItemVec paramFriendFutureItemVec, int paramInt);
  
  public static final native void FriendFutureItemVec_pushBack(long paramLong1, FriendFutureItemVec paramFriendFutureItemVec, long paramLong2, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItemVec_reserve(long paramLong1, FriendFutureItemVec paramFriendFutureItemVec, long paramLong2);
  
  public static final native void FriendFutureItemVec_set(long paramLong1, FriendFutureItemVec paramFriendFutureItemVec, int paramInt, long paramLong2, FriendFutureItem paramFriendFutureItem);
  
  public static final native long FriendFutureItemVec_size(long paramLong, FriendFutureItemVec paramFriendFutureItemVec);
  
  public static final native long FriendFutureItem_ddwAddTime_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_ddwAddTime_set(long paramLong1, FriendFutureItem paramFriendFutureItem, long paramLong2);
  
  public static final native int FriendFutureItem_eType_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_eType_set(long paramLong, FriendFutureItem paramFriendFutureItem, int paramInt);
  
  public static final native long FriendFutureItem_mpRecommendTags_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_mpRecommendTags_set(long paramLong1, FriendFutureItem paramFriendFutureItem, long paramLong2, BytesMap paramBytesMap);
  
  public static final native byte[] FriendFutureItem_sAddSource_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_sAddSource_set(long paramLong, FriendFutureItem paramFriendFutureItem, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendFutureItem_sAddWording_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_sAddWording_set(long paramLong, FriendFutureItem paramFriendFutureItem, byte[] paramArrayOfByte);
  
  public static final native String FriendFutureItem_sIdentifier_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_sIdentifier_set(long paramLong, FriendFutureItem paramFriendFutureItem, String paramString);
  
  public static final native long FriendFutureItem_stProfile_get(long paramLong, FriendFutureItem paramFriendFutureItem);
  
  public static final native void FriendFutureItem_stProfile_set(long paramLong1, FriendFutureItem paramFriendFutureItem, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native long FriendGroupItem_identifiers_get(long paramLong, FriendGroupItem paramFriendGroupItem);
  
  public static final native void FriendGroupItem_identifiers_set(long paramLong1, FriendGroupItem paramFriendGroupItem, long paramLong2);
  
  public static final native byte[] FriendGroupItem_name_get(long paramLong, FriendGroupItem paramFriendGroupItem);
  
  public static final native void FriendGroupItem_name_set(long paramLong, FriendGroupItem paramFriendGroupItem, byte[] paramArrayOfByte);
  
  public static final native long FriendGroupVec_capacity(long paramLong, FriendGroupVec paramFriendGroupVec);
  
  public static final native void FriendGroupVec_clear(long paramLong, FriendGroupVec paramFriendGroupVec);
  
  public static final native boolean FriendGroupVec_empty(long paramLong, FriendGroupVec paramFriendGroupVec);
  
  public static final native long FriendGroupVec_get(long paramLong, FriendGroupVec paramFriendGroupVec, int paramInt);
  
  public static final native void FriendGroupVec_pushBack(long paramLong1, FriendGroupVec paramFriendGroupVec, long paramLong2, FriendGroup paramFriendGroup);
  
  public static final native void FriendGroupVec_reserve(long paramLong1, FriendGroupVec paramFriendGroupVec, long paramLong2);
  
  public static final native void FriendGroupVec_set(long paramLong1, FriendGroupVec paramFriendGroupVec, int paramInt, long paramLong2, FriendGroup paramFriendGroup);
  
  public static final native long FriendGroupVec_size(long paramLong, FriendGroupVec paramFriendGroupVec);
  
  public static final native long FriendGroup_count_get(long paramLong, FriendGroup paramFriendGroup);
  
  public static final native void FriendGroup_count_set(long paramLong1, FriendGroup paramFriendGroup, long paramLong2);
  
  public static final native long FriendGroup_identifiers_get(long paramLong, FriendGroup paramFriendGroup);
  
  public static final native void FriendGroup_identifiers_set(long paramLong1, FriendGroup paramFriendGroup, long paramLong2, StrVec paramStrVec);
  
  public static final native byte[] FriendGroup_name_get(long paramLong, FriendGroup paramFriendGroup);
  
  public static final native void FriendGroup_name_set(long paramLong, FriendGroup paramFriendGroup, byte[] paramArrayOfByte);
  
  public static final native long FriendGroup_profiles_get(long paramLong, FriendGroup paramFriendGroup);
  
  public static final native void FriendGroup_profiles_set(long paramLong1, FriendGroup paramFriendGroup, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native long FriendGroup_tinyids_get(long paramLong, FriendGroup paramFriendGroup);
  
  public static final native void FriendGroup_tinyids_set(long paramLong1, FriendGroup paramFriendGroup, long paramLong2);
  
  public static final native long FriendMetaInfo_ddwInfoSeq_get(long paramLong, FriendMetaInfo paramFriendMetaInfo);
  
  public static final native void FriendMetaInfo_ddwInfoSeq_set(long paramLong1, FriendMetaInfo paramFriendMetaInfo, long paramLong2);
  
  public static final native long FriendMetaInfo_ddwNextSeq_get(long paramLong, FriendMetaInfo paramFriendMetaInfo);
  
  public static final native void FriendMetaInfo_ddwNextSeq_set(long paramLong1, FriendMetaInfo paramFriendMetaInfo, long paramLong2);
  
  public static final native long FriendMetaInfo_ddwTimestamp_get(long paramLong, FriendMetaInfo paramFriendMetaInfo);
  
  public static final native void FriendMetaInfo_ddwTimestamp_set(long paramLong1, FriendMetaInfo paramFriendMetaInfo, long paramLong2);
  
  public static final native boolean FriendMetaInfo_recover_get(long paramLong, FriendMetaInfo paramFriendMetaInfo);
  
  public static final native void FriendMetaInfo_recover_set(long paramLong, FriendMetaInfo paramFriendMetaInfo, boolean paramBoolean);
  
  public static final native long FriendPendencyItemVec_capacity(long paramLong, FriendPendencyItemVec paramFriendPendencyItemVec);
  
  public static final native void FriendPendencyItemVec_clear(long paramLong, FriendPendencyItemVec paramFriendPendencyItemVec);
  
  public static final native boolean FriendPendencyItemVec_empty(long paramLong, FriendPendencyItemVec paramFriendPendencyItemVec);
  
  public static final native long FriendPendencyItemVec_get(long paramLong, FriendPendencyItemVec paramFriendPendencyItemVec, int paramInt);
  
  public static final native void FriendPendencyItemVec_pushBack(long paramLong1, FriendPendencyItemVec paramFriendPendencyItemVec, long paramLong2, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItemVec_reserve(long paramLong1, FriendPendencyItemVec paramFriendPendencyItemVec, long paramLong2);
  
  public static final native void FriendPendencyItemVec_set(long paramLong1, FriendPendencyItemVec paramFriendPendencyItemVec, int paramInt, long paramLong2, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native long FriendPendencyItemVec_size(long paramLong, FriendPendencyItemVec paramFriendPendencyItemVec);
  
  public static final native long FriendPendencyItem_ddwAddTime_get(long paramLong, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItem_ddwAddTime_set(long paramLong1, FriendPendencyItem paramFriendPendencyItem, long paramLong2);
  
  public static final native int FriendPendencyItem_iType_get(long paramLong, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItem_iType_set(long paramLong, FriendPendencyItem paramFriendPendencyItem, int paramInt);
  
  public static final native byte[] FriendPendencyItem_sAddSource_get(long paramLong, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItem_sAddSource_set(long paramLong, FriendPendencyItem paramFriendPendencyItem, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendPendencyItem_sAddWording_get(long paramLong, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItem_sAddWording_set(long paramLong, FriendPendencyItem paramFriendPendencyItem, byte[] paramArrayOfByte);
  
  public static final native String FriendPendencyItem_sIdentifier_get(long paramLong, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItem_sIdentifier_set(long paramLong, FriendPendencyItem paramFriendPendencyItem, String paramString);
  
  public static final native byte[] FriendPendencyItem_sNickname_get(long paramLong, FriendPendencyItem paramFriendPendencyItem);
  
  public static final native void FriendPendencyItem_sNickname_set(long paramLong, FriendPendencyItem paramFriendPendencyItem, byte[] paramArrayOfByte);
  
  public static final native long FriendPendencyMeta_ddwNumPerPage_get(long paramLong, FriendPendencyMeta paramFriendPendencyMeta);
  
  public static final native void FriendPendencyMeta_ddwNumPerPage_set(long paramLong1, FriendPendencyMeta paramFriendPendencyMeta, long paramLong2);
  
  public static final native long FriendPendencyMeta_ddwSeq_get(long paramLong, FriendPendencyMeta paramFriendPendencyMeta);
  
  public static final native void FriendPendencyMeta_ddwSeq_set(long paramLong1, FriendPendencyMeta paramFriendPendencyMeta, long paramLong2);
  
  public static final native long FriendPendencyMeta_ddwTimestamp_get(long paramLong, FriendPendencyMeta paramFriendPendencyMeta);
  
  public static final native void FriendPendencyMeta_ddwTimestamp_set(long paramLong1, FriendPendencyMeta paramFriendPendencyMeta, long paramLong2);
  
  public static final native long FriendPendencyMeta_ddwUnReadCnt_get(long paramLong, FriendPendencyMeta paramFriendPendencyMeta);
  
  public static final native void FriendPendencyMeta_ddwUnReadCnt_set(long paramLong1, FriendPendencyMeta paramFriendPendencyMeta, long paramLong2);
  
  public static final native String FriendProfileUpdateItem_bytes_value_get(long paramLong, FriendProfileUpdateItem paramFriendProfileUpdateItem);
  
  public static final native void FriendProfileUpdateItem_bytes_value_set(long paramLong, FriendProfileUpdateItem paramFriendProfileUpdateItem, String paramString);
  
  public static final native String FriendProfileUpdateItem_tag_get(long paramLong, FriendProfileUpdateItem paramFriendProfileUpdateItem);
  
  public static final native void FriendProfileUpdateItem_tag_set(long paramLong, FriendProfileUpdateItem paramFriendProfileUpdateItem, String paramString);
  
  public static final native long FriendProfileUpdateItem_uint64_value_get(long paramLong, FriendProfileUpdateItem paramFriendProfileUpdateItem);
  
  public static final native void FriendProfileUpdateItem_uint64_value_set(long paramLong1, FriendProfileUpdateItem paramFriendProfileUpdateItem, long paramLong2);
  
  public static final native long FriendProfileUpdateItem_vec_bytes_value_get(long paramLong, FriendProfileUpdateItem paramFriendProfileUpdateItem);
  
  public static final native void FriendProfileUpdateItem_vec_bytes_value_set(long paramLong1, FriendProfileUpdateItem paramFriendProfileUpdateItem, long paramLong2, StrVec paramStrVec);
  
  public static final native long FriendProfileVec_capacity(long paramLong, FriendProfileVec paramFriendProfileVec);
  
  public static final native void FriendProfileVec_clear(long paramLong, FriendProfileVec paramFriendProfileVec);
  
  public static final native boolean FriendProfileVec_empty(long paramLong, FriendProfileVec paramFriendProfileVec);
  
  public static final native long FriendProfileVec_get(long paramLong, FriendProfileVec paramFriendProfileVec, int paramInt);
  
  public static final native void FriendProfileVec_pushBack(long paramLong1, FriendProfileVec paramFriendProfileVec, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfileVec_reserve(long paramLong1, FriendProfileVec paramFriendProfileVec, long paramLong2);
  
  public static final native void FriendProfileVec_set(long paramLong1, FriendProfileVec paramFriendProfileVec, int paramInt, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native long FriendProfileVec_size(long paramLong, FriendProfileVec paramFriendProfileVec);
  
  public static final native long FriendProfile_custom_info_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_custom_info_set(long paramLong1, FriendProfile paramFriendProfile, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long FriendProfile_ddwTinyId_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_ddwTinyId_set(long paramLong1, FriendProfile paramFriendProfile, long paramLong2);
  
  public static final native long FriendProfile_result_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_result_set(long paramLong1, FriendProfile paramFriendProfile, long paramLong2);
  
  public static final native byte[] FriendProfile_sAddSource_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sAddSource_set(long paramLong, FriendProfile paramFriendProfile, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendProfile_sAddWording_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sAddWording_set(long paramLong, FriendProfile paramFriendProfile, byte[] paramArrayOfByte);
  
  public static final native String FriendProfile_sAllowType_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sAllowType_set(long paramLong, FriendProfile paramFriendProfile, String paramString);
  
  public static final native byte[] FriendProfile_sFaceURL_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sFaceURL_set(long paramLong, FriendProfile paramFriendProfile, byte[] paramArrayOfByte);
  
  public static final native long FriendProfile_sGroupNames_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sGroupNames_set(long paramLong1, FriendProfile paramFriendProfile, long paramLong2, BytesVec paramBytesVec);
  
  public static final native String FriendProfile_sIdentifier_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sIdentifier_set(long paramLong, FriendProfile paramFriendProfile, String paramString);
  
  public static final native byte[] FriendProfile_sNickname_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sNickname_set(long paramLong, FriendProfile paramFriendProfile, byte[] paramArrayOfByte);
  
  public static final native byte[] FriendProfile_sRemark_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sRemark_set(long paramLong, FriendProfile paramFriendProfile, byte[] paramArrayOfByte);
  
  public static final native String FriendProfile_sResponseAction_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sResponseAction_set(long paramLong, FriendProfile paramFriendProfile, String paramString);
  
  public static final native byte[] FriendProfile_sSelfSignature_get(long paramLong, FriendProfile paramFriendProfile);
  
  public static final native void FriendProfile_sSelfSignature_set(long paramLong, FriendProfile paramFriendProfile, byte[] paramArrayOfByte);
  
  public static final native boolean FriendshipManager_addBlackList(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_addFriend(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, FriendProfileVec paramFriendProfileVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_addFriendToMap(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native boolean FriendshipManager_addFriends2Group(long paramLong1, FriendshipManager paramFriendshipManager, byte[] paramArrayOfByte, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_checkFriend(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, String paramString, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native void FriendshipManager_clearAllData(long paramLong, FriendshipManager paramFriendshipManager);
  
  public static final native boolean FriendshipManager_createFriendGroup(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, BytesVec paramBytesVec, long paramLong3, StrVec paramStrVec, long paramLong4, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_delBlackList(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_delFriend(long paramLong1, FriendshipManager paramFriendshipManager, int paramInt, long paramLong2, FriendProfileVec paramFriendProfileVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_delFriendToMap(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native boolean FriendshipManager_delFriendsFromGroup(long paramLong1, FriendshipManager paramFriendshipManager, byte[] paramArrayOfByte, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_deleteDecide(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_deleteFriendGroup(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, BytesVec paramBytesVec, long paramLong3, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native boolean FriendshipManager_deletePendency(long paramLong1, FriendshipManager paramFriendshipManager, int paramInt, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_deleteRecommend(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_doResponse(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, FriendProfileVec paramFriendProfileVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_getBlackList(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_getFriendGroup(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, BytesVec paramBytesVec, boolean paramBoolean, long paramLong3, IFriendGroupCallback paramIFriendGroupCallback);
  
  public static final native boolean FriendshipManager_getFriendListV2(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, long paramLong3, StrVec paramStrVec, long paramLong4, FriendMetaInfo paramFriendMetaInfo, long paramLong5, IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback);
  
  public static final native boolean FriendshipManager_getFriendList__SWIG_0(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_getFriendList__SWIG_1(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, GetProfileOption paramGetProfileOption, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_getFriendList__SWIG_2(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, long paramLong3, StrVec paramStrVec, long paramLong4, FriendMetaInfo paramFriendMetaInfo, long paramLong5, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback);
  
  public static final native boolean FriendshipManager_getFriendProfile(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, GetProfileOption paramGetProfileOption, long paramLong4, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_getFutureFriends(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, long paramLong3, long paramLong4, StrVec paramStrVec, long paramLong5, FutureFriendMeta paramFutureFriendMeta, long paramLong6, IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback);
  
  public static final native boolean FriendshipManager_getPendencyFromServer(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, FriendPendencyMeta paramFriendPendencyMeta, int paramInt, long paramLong3, IFriendshipPendencyCallback paramIFriendshipPendencyCallback);
  
  public static final native boolean FriendshipManager_getProfile__SWIG_0(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_getProfile__SWIG_1(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, StrVec paramStrVec, long paramLong3, GetProfileOption paramGetProfileOption, long paramLong4, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_modifyFriendGroupName(long paramLong1, FriendshipManager paramFriendshipManager, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong2, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native boolean FriendshipManager_pendencyReport(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, long paramLong3, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native boolean FriendshipManager_recommendReport(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, long paramLong3, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native boolean FriendshipManager_searchFriendsUseNickName(long paramLong1, FriendshipManager paramFriendshipManager, String paramString, long paramLong2, long paramLong3, long paramLong4, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2);
  
  public static final native boolean FriendshipManager_searchUserUseIdentifier(long paramLong1, FriendshipManager paramFriendshipManager, String paramString, long paramLong2, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native void FriendshipManager_setExpire(long paramLong, FriendshipManager paramFriendshipManager);
  
  public static final native boolean FriendshipManager_setProfile__SWIG_0(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, String paramString, long paramLong3, long paramLong4, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native boolean FriendshipManager_setProfile__SWIG_1(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, SetProfileOption paramSetProfileOption, long paramLong3, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native boolean FriendshipManager_setSnsProfile(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2, SNSProfileItemVec paramSNSProfileItemVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native void FriendshipManager_updateFriendGroupSeq(long paramLong1, FriendshipManager paramFriendshipManager, long paramLong2);
  
  public static final native long FriendshipProxyConfig_custom_get(long paramLong, FriendshipProxyConfig paramFriendshipProxyConfig);
  
  public static final native void FriendshipProxyConfig_custom_set(long paramLong1, FriendshipProxyConfig paramFriendshipProxyConfig, long paramLong2, StrVec paramStrVec);
  
  public static final native boolean FriendshipProxyConfig_enable_get(long paramLong, FriendshipProxyConfig paramFriendshipProxyConfig);
  
  public static final native void FriendshipProxyConfig_enable_set(long paramLong, FriendshipProxyConfig paramFriendshipProxyConfig, boolean paramBoolean);
  
  public static final native long FriendshipProxyConfig_flags_get(long paramLong, FriendshipProxyConfig paramFriendshipProxyConfig);
  
  public static final native void FriendshipProxyConfig_flags_set(long paramLong1, FriendshipProxyConfig paramFriendshipProxyConfig, long paramLong2);
  
  public static final native long FriendshipProxyConfig_listener_get(long paramLong, FriendshipProxyConfig paramFriendshipProxyConfig);
  
  public static final native void FriendshipProxyConfig_listener_set(long paramLong1, FriendshipProxyConfig paramFriendshipProxyConfig, long paramLong2, IFriendshipProxyListener paramIFriendshipProxyListener);
  
  public static final native long FriendshipProxy_getAddBlackList(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getAddFriend2GroupCB(long paramLong1, FriendshipProxy paramFriendshipProxy, byte[] paramArrayOfByte, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getCreateFriendGroupCB(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, BytesVec paramBytesVec, long paramLong3, StrVec paramStrVec, long paramLong4, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getCustom(long paramLong, FriendshipProxy paramFriendshipProxy);
  
  public static final native long FriendshipProxy_getDelFriendCB(long paramLong1, FriendshipProxy paramFriendshipProxy, int paramInt, long paramLong2, FriendProfileVec paramFriendProfileVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getDelFriendsFromGroupCB(long paramLong1, FriendshipProxy paramFriendshipProxy, byte[] paramArrayOfByte, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getDeleteFriendGroup(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, BytesVec paramBytesVec, long paramLong3, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native long FriendshipProxy_getDoResponseCB(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, FriendProfileVec paramFriendProfileVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getFriendFlags(long paramLong, FriendshipProxy paramFriendshipProxy);
  
  public static final native int FriendshipProxy_getFriendGroup(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, BytesVec paramBytesVec, long paramLong3, FriendGroupVec paramFriendGroupVec);
  
  public static final native int FriendshipProxy_getFriendList(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native int FriendshipProxy_getFriendProfile(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, StrVec paramStrVec, long paramLong3, FriendProfileVec paramFriendProfileVec);
  
  public static final native long FriendshipProxy_getModifyFriendGroupName(long paramLong1, FriendshipProxy paramFriendshipProxy, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong2, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getMove2FriendGroup(long paramLong1, FriendshipProxy paramFriendshipProxy, String paramString1, String paramString2, long paramLong2, StrVec paramStrVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native long FriendshipProxy_getSetSnsProfileCB(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, SNSProfileItemVec paramSNSProfileItemVec, long paramLong3, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native int FriendshipProxy_getStatus(long paramLong, FriendshipProxy paramFriendshipProxy);
  
  public static final native void FriendshipProxy_init(long paramLong1, FriendshipProxy paramFriendshipProxy, String paramString, long paramLong2, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native boolean FriendshipProxy_isEnable(long paramLong, FriendshipProxy paramFriendshipProxy);
  
  public static final native void FriendshipProxy_onFriendshipEvent(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2);
  
  public static final native void FriendshipProxy_reset(long paramLong, FriendshipProxy paramFriendshipProxy, String paramString);
  
  public static final native void FriendshipProxy_setEnable(long paramLong, FriendshipProxy paramFriendshipProxy, boolean paramBoolean);
  
  public static final native void FriendshipProxy_setFriendFlags(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, long paramLong3, StrVec paramStrVec);
  
  public static final native void FriendshipProxy_setListner(long paramLong1, FriendshipProxy paramFriendshipProxy, long paramLong2, IFriendshipProxyListener paramIFriendshipProxyListener);
  
  public static final native void FriendshipProxy_syncProxy(long paramLong, FriendshipProxy paramFriendshipProxy);
  
  public static final native long FutureFriendMeta_ddwCurrentDecideTimestamp_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwCurrentDecideTimestamp_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwCurrentPendencyTimestamp_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwCurrentPendencyTimestamp_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwCurrentRecommendTimestamp_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwCurrentRecommendTimestamp_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwDecideSequence_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwDecideSequence_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwDecideUnreadCnt_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwDecideUnreadCnt_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwPendencySequence_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwPendencySequence_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwPendencyUnReadCnt_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwPendencyUnReadCnt_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwRecommendSequence_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwRecommendSequence_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwRecommendUnReadCnt_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwRecommendUnReadCnt_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwReqNum_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwReqNum_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native long FutureFriendMeta_ddwTimestamp_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_ddwTimestamp_set(long paramLong1, FutureFriendMeta paramFutureFriendMeta, long paramLong2);
  
  public static final native int FutureFriendMeta_iDirection_get(long paramLong, FutureFriendMeta paramFutureFriendMeta);
  
  public static final native void FutureFriendMeta_iDirection_set(long paramLong, FutureFriendMeta paramFutureFriendMeta, int paramInt);
  
  public static final native int FutureTypeDecide_get();
  
  public static final native int FutureTypePendencyComeIn_get();
  
  public static final native int FutureTypePendencySendOut_get();
  
  public static final native int FutureTypeRecommend_get();
  
  public static final native long GetGroupBaseInfoOption_custom_info_get(long paramLong, GetGroupBaseInfoOption paramGetGroupBaseInfoOption);
  
  public static final native void GetGroupBaseInfoOption_custom_info_set(long paramLong1, GetGroupBaseInfoOption paramGetGroupBaseInfoOption, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long GetGroupBaseInfoOption_flag_get(long paramLong, GetGroupBaseInfoOption paramGetGroupBaseInfoOption);
  
  public static final native void GetGroupBaseInfoOption_flag_set(long paramLong1, GetGroupBaseInfoOption paramGetGroupBaseInfoOption, long paramLong2);
  
  public static final native long GetGroupBaseInfoOption_groups_get(long paramLong, GetGroupBaseInfoOption paramGetGroupBaseInfoOption);
  
  public static final native void GetGroupBaseInfoOption_groups_set(long paramLong1, GetGroupBaseInfoOption paramGetGroupBaseInfoOption, long paramLong2, StrVec paramStrVec);
  
  public static final native long GetGroupMemInfoOption_custom_info_get(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption);
  
  public static final native void GetGroupMemInfoOption_custom_info_set(long paramLong1, GetGroupMemInfoOption paramGetGroupMemInfoOption, long paramLong2, BytesMap paramBytesMap);
  
  public static final native int GetGroupMemInfoOption_filter_get(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption);
  
  public static final native void GetGroupMemInfoOption_filter_set(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption, int paramInt);
  
  public static final native long GetGroupMemInfoOption_flag_get(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption);
  
  public static final native void GetGroupMemInfoOption_flag_set(long paramLong1, GetGroupMemInfoOption paramGetGroupMemInfoOption, long paramLong2);
  
  public static final native String GetGroupMemInfoOption_group_id_get(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption);
  
  public static final native void GetGroupMemInfoOption_group_id_set(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption, String paramString);
  
  public static final native long GetGroupMemInfoOption_members_get(long paramLong, GetGroupMemInfoOption paramGetGroupMemInfoOption);
  
  public static final native void GetGroupMemInfoOption_members_set(long paramLong1, GetGroupMemInfoOption paramGetGroupMemInfoOption, long paramLong2, StrVec paramStrVec);
  
  public static final native long GetGroupPendencyOption_max_limited_get(long paramLong, GetGroupPendencyOption paramGetGroupPendencyOption);
  
  public static final native void GetGroupPendencyOption_max_limited_set(long paramLong1, GetGroupPendencyOption paramGetGroupPendencyOption, long paramLong2);
  
  public static final native long GetGroupPendencyOption_start_time_get(long paramLong, GetGroupPendencyOption paramGetGroupPendencyOption);
  
  public static final native void GetGroupPendencyOption_start_time_set(long paramLong1, GetGroupPendencyOption paramGetGroupPendencyOption, long paramLong2);
  
  public static final native long GetProfileOption_custom_info_get(long paramLong, GetProfileOption paramGetProfileOption);
  
  public static final native void GetProfileOption_custom_info_set(long paramLong1, GetProfileOption paramGetProfileOption, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long GetProfileOption_flag_get(long paramLong, GetProfileOption paramGetProfileOption);
  
  public static final native void GetProfileOption_flag_set(long paramLong1, GetProfileOption paramGetProfileOption, long paramLong2);
  
  public static final native long GroupAssistantConfig_callback_get(long paramLong, GroupAssistantConfig paramGroupAssistantConfig);
  
  public static final native void GroupAssistantConfig_callback_set(long paramLong1, GroupAssistantConfig paramGroupAssistantConfig, long paramLong2, IGroupAssistantCallback paramIGroupAssistantCallback);
  
  public static final native long GroupAssistantConfig_settings_get(long paramLong, GroupAssistantConfig paramGroupAssistantConfig);
  
  public static final native void GroupAssistantConfig_settings_set(long paramLong1, GroupAssistantConfig paramGroupAssistantConfig, long paramLong2, GroupSettings paramGroupSettings);
  
  public static final native boolean GroupAssistant_checkGroupModifyOption(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native boolean GroupAssistant_checkMemberModifyOption(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native long GroupAssistant_getGroupInfoCache(long paramLong, GroupAssistant paramGroupAssistant);
  
  public static final native long GroupAssistant_getGroupSettings(long paramLong, GroupAssistant paramGroupAssistant);
  
  public static final native int GroupAssistant_getGroups(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, StrVec paramStrVec, long paramLong3, GroupCacheInfoVec paramGroupCacheInfoVec);
  
  public static final native void GroupAssistant_init(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native void GroupAssistant_initGroupSettings(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, GroupSettings paramGroupSettings);
  
  public static final native boolean GroupAssistant_isGroupExist(long paramLong, GroupAssistant paramGroupAssistant, String paramString);
  
  public static final native void GroupAssistant_onGroupAdd(long paramLong, GroupAssistant paramGroupAssistant, String paramString);
  
  public static final native void GroupAssistant_onGroupDelete(long paramLong, GroupAssistant paramGroupAssistant, String paramString);
  
  public static final native void GroupAssistant_onGroupSync(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, GroupBaseInfoVec paramGroupBaseInfoVec, long paramLong3, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native void GroupAssistant_onGroupSystemEvent(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2);
  
  public static final native void GroupAssistant_onGroupTipsEvent(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupAssistant_onGroupUpdateOwner(long paramLong, GroupAssistant paramGroupAssistant, String paramString1, String paramString2);
  
  public static final native void GroupAssistant_onGroupUpdateSelfInfo(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void GroupAssistant_onGroupUpdate__SWIG_0(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void GroupAssistant_onGroupUpdate__SWIG_1(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec);
  
  public static final native void GroupAssistant_onMemberJoin(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2);
  
  public static final native void GroupAssistant_onMemberQuit(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2);
  
  public static final native void GroupAssistant_onMemberUpdate(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2);
  
  public static final native long GroupAssistant_prepareDefaultGetGroupOption(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, StrVec paramStrVec);
  
  public static final native long GroupAssistant_prepareDefaultGetMemOption(long paramLong1, GroupAssistant paramGroupAssistant, String paramString, long paramLong2, StrVec paramStrVec);
  
  public static final native void GroupAssistant_setCallback(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, IGroupAssistantCallback paramIGroupAssistantCallback);
  
  public static final native void GroupAssistant_sync(long paramLong1, GroupAssistant paramGroupAssistant, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native long GroupBaseInfoVec_capacity(long paramLong, GroupBaseInfoVec paramGroupBaseInfoVec);
  
  public static final native void GroupBaseInfoVec_clear(long paramLong, GroupBaseInfoVec paramGroupBaseInfoVec);
  
  public static final native boolean GroupBaseInfoVec_empty(long paramLong, GroupBaseInfoVec paramGroupBaseInfoVec);
  
  public static final native long GroupBaseInfoVec_get(long paramLong, GroupBaseInfoVec paramGroupBaseInfoVec, int paramInt);
  
  public static final native void GroupBaseInfoVec_pushBack(long paramLong1, GroupBaseInfoVec paramGroupBaseInfoVec, long paramLong2, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfoVec_reserve(long paramLong1, GroupBaseInfoVec paramGroupBaseInfoVec, long paramLong2);
  
  public static final native void GroupBaseInfoVec_set(long paramLong1, GroupBaseInfoVec paramGroupBaseInfoVec, int paramInt, long paramLong2, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native long GroupBaseInfoVec_size(long paramLong, GroupBaseInfoVec paramGroupBaseInfoVec);
  
  public static final native long GroupBaseInfo_dwInfoSeq_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_dwInfoSeq_set(long paramLong1, GroupBaseInfo paramGroupBaseInfo, long paramLong2);
  
  public static final native long GroupBaseInfo_dwMsgFalg_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_dwMsgFalg_set(long paramLong1, GroupBaseInfo paramGroupBaseInfo, long paramLong2);
  
  public static final native long GroupBaseInfo_dwMsgSeq_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_dwMsgSeq_set(long paramLong1, GroupBaseInfo paramGroupBaseInfo, long paramLong2);
  
  public static final native long GroupBaseInfo_dwReadSeq_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_dwReadSeq_set(long paramLong1, GroupBaseInfo paramGroupBaseInfo, long paramLong2);
  
  public static final native byte[] GroupBaseInfo_sFaceUrl_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_sFaceUrl_set(long paramLong, GroupBaseInfo paramGroupBaseInfo, byte[] paramArrayOfByte);
  
  public static final native String GroupBaseInfo_sGroupId_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_sGroupId_set(long paramLong, GroupBaseInfo paramGroupBaseInfo, String paramString);
  
  public static final native byte[] GroupBaseInfo_sGroupName_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_sGroupName_set(long paramLong, GroupBaseInfo paramGroupBaseInfo, byte[] paramArrayOfByte);
  
  public static final native String GroupBaseInfo_sGroupType_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_sGroupType_set(long paramLong, GroupBaseInfo paramGroupBaseInfo, String paramString);
  
  public static final native long GroupBaseInfo_stSelfInfo_get(long paramLong, GroupBaseInfo paramGroupBaseInfo);
  
  public static final native void GroupBaseInfo_stSelfInfo_set(long paramLong1, GroupBaseInfo paramGroupBaseInfo, long paramLong2, GroupSelfInfo paramGroupSelfInfo);
  
  public static final native long GroupCacheInfoVec_capacity(long paramLong, GroupCacheInfoVec paramGroupCacheInfoVec);
  
  public static final native void GroupCacheInfoVec_clear(long paramLong, GroupCacheInfoVec paramGroupCacheInfoVec);
  
  public static final native boolean GroupCacheInfoVec_empty(long paramLong, GroupCacheInfoVec paramGroupCacheInfoVec);
  
  public static final native long GroupCacheInfoVec_get(long paramLong, GroupCacheInfoVec paramGroupCacheInfoVec, int paramInt);
  
  public static final native void GroupCacheInfoVec_pushBack(long paramLong1, GroupCacheInfoVec paramGroupCacheInfoVec, long paramLong2, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void GroupCacheInfoVec_reserve(long paramLong1, GroupCacheInfoVec paramGroupCacheInfoVec, long paramLong2);
  
  public static final native void GroupCacheInfoVec_set(long paramLong1, GroupCacheInfoVec paramGroupCacheInfoVec, int paramInt, long paramLong2, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native long GroupCacheInfoVec_size(long paramLong, GroupCacheInfoVec paramGroupCacheInfoVec);
  
  public static final native long GroupCacheInfo_groupInfo_get(long paramLong, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void GroupCacheInfo_groupInfo_set(long paramLong1, GroupCacheInfo paramGroupCacheInfo, long paramLong2, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native long GroupCacheInfo_selfInfo_get(long paramLong, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void GroupCacheInfo_selfInfo_set(long paramLong1, GroupCacheInfo paramGroupCacheInfo, long paramLong2, GroupSelfInfo paramGroupSelfInfo);
  
  public static final native long GroupDetailInfoVec_capacity(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native void GroupDetailInfoVec_clear(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native boolean GroupDetailInfoVec_empty(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native long GroupDetailInfoVec_get(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec, int paramInt);
  
  public static final native void GroupDetailInfoVec_pushBack(long paramLong1, GroupDetailInfoVec paramGroupDetailInfoVec, long paramLong2, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfoVec_reserve(long paramLong1, GroupDetailInfoVec paramGroupDetailInfoVec, long paramLong2);
  
  public static final native void GroupDetailInfoVec_set(long paramLong1, GroupDetailInfoVec paramGroupDetailInfoVec, int paramInt, long paramLong2, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native long GroupDetailInfoVec_size(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native long GroupDetailInfo_custom_info_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_custom_info_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long GroupDetailInfo_ddwOwnerTinyId_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_ddwOwnerTinyId_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwAddOption_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwAddOption_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwAppid_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwAppid_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwCreateTime_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwCreateTime_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwInfoSeq_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwInfoSeq_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwLastInfoTime_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwLastInfoTime_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwLastMsgTime_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwLastMsgTime_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwMaxMemberNum_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwMaxMemberNum_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwMemberNum_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwMemberNum_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwNextMsgSeq_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwNextMsgSeq_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native long GroupDetailInfo_dwOnlineMemberNum_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_dwOnlineMemberNum_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2);
  
  public static final native int GroupDetailInfo_eSearchable_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_eSearchable_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, int paramInt);
  
  public static final native int GroupDetailInfo_eVisible_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_eVisible_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, int paramInt);
  
  public static final native long GroupDetailInfo_lastMsg_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_lastMsg_set(long paramLong1, GroupDetailInfo paramGroupDetailInfo, long paramLong2, Msg paramMsg);
  
  public static final native String GroupDetailInfo_sFaceUrl_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sFaceUrl_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, String paramString);
  
  public static final native String GroupDetailInfo_sGroupId_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sGroupId_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, String paramString);
  
  public static final native byte[] GroupDetailInfo_sGroupName_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sGroupName_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, byte[] paramArrayOfByte);
  
  public static final native String GroupDetailInfo_sGroupType_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sGroupType_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, String paramString);
  
  public static final native byte[] GroupDetailInfo_sIntroduction_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sIntroduction_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, byte[] paramArrayOfByte);
  
  public static final native byte[] GroupDetailInfo_sNotification_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sNotification_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, byte[] paramArrayOfByte);
  
  public static final native String GroupDetailInfo_sOwner_get(long paramLong, GroupDetailInfo paramGroupDetailInfo);
  
  public static final native void GroupDetailInfo_sOwner_set(long paramLong, GroupDetailInfo paramGroupDetailInfo, String paramString);
  
  public static final native boolean GroupManager_applyJoinGroup(long paramLong1, GroupManager paramGroupManager, String paramString1, String paramString2, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_createGroup__SWIG_0(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, StrVec paramStrVec, byte[] paramArrayOfByte, long paramLong3, ICreateGroupCallback paramICreateGroupCallback);
  
  public static final native boolean GroupManager_createGroup__SWIG_1(long paramLong1, GroupManager paramGroupManager, long paramLong2, NewGroupInfo paramNewGroupInfo, long paramLong3, ICreateGroupCallback paramICreateGroupCallback);
  
  public static final native boolean GroupManager_deleteGroup(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_deleteGroupMember__SWIG_0(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, StrVec paramStrVec, long paramLong3, IGroupMemberResultCallback paramIGroupMemberResultCallback, byte[] paramArrayOfByte);
  
  public static final native boolean GroupManager_deleteGroupMember__SWIG_1(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, StrVec paramStrVec, long paramLong3, IGroupMemberResultCallback paramIGroupMemberResultCallback);
  
  public static final native boolean GroupManager_getGroupBaseInfo__SWIG_0(long paramLong1, GroupManager paramGroupManager, long paramLong2, StrVec paramStrVec, long paramLong3, IGroupInfoListCallback paramIGroupInfoListCallback);
  
  public static final native boolean GroupManager_getGroupBaseInfo__SWIG_1(long paramLong1, GroupManager paramGroupManager, long paramLong2, GetGroupBaseInfoOption paramGetGroupBaseInfoOption, long paramLong3, IGroupInfoListCallback paramIGroupInfoListCallback);
  
  public static final native boolean GroupManager_getGroupList(long paramLong1, GroupManager paramGroupManager, boolean paramBoolean, long paramLong2, IGroupListCallback paramIGroupListCallback);
  
  public static final native boolean GroupManager_getGroupMembers(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, IGroupMemberCallback paramIGroupMemberCallback);
  
  public static final native boolean GroupManager_getGroupMembersByFilter(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, int paramInt, long paramLong3, BytesVec paramBytesVec, long paramLong4, long paramLong5, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2);
  
  public static final native boolean GroupManager_getGroupMembersInfo__SWIG_0(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, StrVec paramStrVec, long paramLong3, IGroupMemberCallback paramIGroupMemberCallback);
  
  public static final native boolean GroupManager_getGroupMembersInfo__SWIG_1(long paramLong1, GroupManager paramGroupManager, long paramLong2, GetGroupMemInfoOption paramGetGroupMemInfoOption, long paramLong3, IGroupMemberCallback paramIGroupMemberCallback);
  
  public static final native boolean GroupManager_getGroupMembersV2(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, long paramLong3, BytesVec paramBytesVec, long paramLong4, long paramLong5, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2);
  
  public static final native boolean GroupManager_getGroupPublicInfo(long paramLong1, GroupManager paramGroupManager, long paramLong2, StrVec paramStrVec, long paramLong3, IGroupInfoListCallback paramIGroupInfoListCallback);
  
  public static final native boolean GroupManager_getGroupPublicInfoV2(long paramLong1, GroupManager paramGroupManager, long paramLong2, StrVec paramStrVec, long paramLong3, long paramLong4, BytesVec paramBytesVec, long paramLong5, IGroupInfoListCallback paramIGroupInfoListCallback);
  
  public static final native boolean GroupManager_getMsgSeq(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, long paramLong3);
  
  public static final native boolean GroupManager_getPendency(long paramLong1, GroupManager paramGroupManager, long paramLong2, GetGroupPendencyOption paramGetGroupPendencyOption, long paramLong3, IGroupGetPendencyCallback paramIGroupGetPendencyCallback);
  
  public static final native boolean GroupManager_getSelfInfo(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, IGroupMemberCallback paramIGroupMemberCallback);
  
  public static final native boolean GroupManager_handleInviteRequest(long paramLong1, GroupManager paramGroupManager, String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong2, long paramLong3, byte[] paramArrayOfByte3, long paramLong4, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_handleJoinRequest(long paramLong1, GroupManager paramGroupManager, String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong2, long paramLong3, byte[] paramArrayOfByte3, long paramLong4, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_inviteGroupMember(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, StrVec paramStrVec, long paramLong3, IGroupMemberResultCallback paramIGroupMemberResultCallback);
  
  public static final native boolean GroupManager_modifyGroupBaseInfo__SWIG_0(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, byte[] paramArrayOfByte, long paramLong3, long paramLong4, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_modifyGroupBaseInfo__SWIG_1(long paramLong1, GroupManager paramGroupManager, long paramLong2, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, long paramLong3, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_modifyGroupMemberInfo__SWIG_0(long paramLong1, GroupManager paramGroupManager, String paramString1, String paramString2, long paramLong2, long paramLong3, long paramLong4, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_modifyGroupMemberInfo__SWIG_1(long paramLong1, GroupManager paramGroupManager, long paramLong2, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, long paramLong3, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_modifyGroupOwner(long paramLong1, GroupManager paramGroupManager, String paramString1, String paramString2, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_pendencyReport(long paramLong1, GroupManager paramGroupManager, long paramLong2, long paramLong3, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_quitGroup(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native boolean GroupManager_searchGroupByName(long paramLong1, GroupManager paramGroupManager, String paramString, long paramLong2, long paramLong3, BytesVec paramBytesVec, long paramLong4, long paramLong5, long paramLong6, IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2);
  
  public static final native long GroupMemberInfoVec_capacity(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void GroupMemberInfoVec_clear(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native boolean GroupMemberInfoVec_empty(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native long GroupMemberInfoVec_get(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec, int paramInt);
  
  public static final native void GroupMemberInfoVec_pushBack(long paramLong1, GroupMemberInfoVec paramGroupMemberInfoVec, long paramLong2, MemberInfo paramMemberInfo);
  
  public static final native void GroupMemberInfoVec_reserve(long paramLong1, GroupMemberInfoVec paramGroupMemberInfoVec, long paramLong2);
  
  public static final native void GroupMemberInfoVec_set(long paramLong1, GroupMemberInfoVec paramGroupMemberInfoVec, int paramInt, long paramLong2, MemberInfo paramMemberInfo);
  
  public static final native long GroupMemberInfoVec_size(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native long GroupMemberResultVec_capacity(long paramLong, GroupMemberResultVec paramGroupMemberResultVec);
  
  public static final native void GroupMemberResultVec_clear(long paramLong, GroupMemberResultVec paramGroupMemberResultVec);
  
  public static final native boolean GroupMemberResultVec_empty(long paramLong, GroupMemberResultVec paramGroupMemberResultVec);
  
  public static final native long GroupMemberResultVec_get(long paramLong, GroupMemberResultVec paramGroupMemberResultVec, int paramInt);
  
  public static final native void GroupMemberResultVec_pushBack(long paramLong1, GroupMemberResultVec paramGroupMemberResultVec, long paramLong2, MemberResult paramMemberResult);
  
  public static final native void GroupMemberResultVec_reserve(long paramLong1, GroupMemberResultVec paramGroupMemberResultVec, long paramLong2);
  
  public static final native void GroupMemberResultVec_set(long paramLong1, GroupMemberResultVec paramGroupMemberResultVec, int paramInt, long paramLong2, MemberResult paramMemberResult);
  
  public static final native long GroupMemberResultVec_size(long paramLong, GroupMemberResultVec paramGroupMemberResultVec);
  
  public static final native long GroupMsgSeqInfo_readSeq_get(long paramLong, GroupMsgSeqInfo paramGroupMsgSeqInfo);
  
  public static final native void GroupMsgSeqInfo_readSeq_set(long paramLong1, GroupMsgSeqInfo paramGroupMsgSeqInfo, long paramLong2);
  
  public static final native long GroupMsgSeqInfo_svrLatestSeq_get(long paramLong, GroupMsgSeqInfo paramGroupMsgSeqInfo);
  
  public static final native void GroupMsgSeqInfo_svrLatestSeq_set(long paramLong1, GroupMsgSeqInfo paramGroupMsgSeqInfo, long paramLong2);
  
  public static final native long GroupPendencyItemVec_capacity(long paramLong, GroupPendencyItemVec paramGroupPendencyItemVec);
  
  public static final native void GroupPendencyItemVec_clear(long paramLong, GroupPendencyItemVec paramGroupPendencyItemVec);
  
  public static final native boolean GroupPendencyItemVec_empty(long paramLong, GroupPendencyItemVec paramGroupPendencyItemVec);
  
  public static final native long GroupPendencyItemVec_get(long paramLong, GroupPendencyItemVec paramGroupPendencyItemVec, int paramInt);
  
  public static final native void GroupPendencyItemVec_pushBack(long paramLong1, GroupPendencyItemVec paramGroupPendencyItemVec, long paramLong2, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItemVec_reserve(long paramLong1, GroupPendencyItemVec paramGroupPendencyItemVec, long paramLong2);
  
  public static final native void GroupPendencyItemVec_set(long paramLong1, GroupPendencyItemVec paramGroupPendencyItemVec, int paramInt, long paramLong2, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native long GroupPendencyItemVec_size(long paramLong, GroupPendencyItemVec paramGroupPendencyItemVec);
  
  public static final native long GroupPendencyItem_add_time_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_add_time_set(long paramLong1, GroupPendencyItem paramGroupPendencyItem, long paramLong2);
  
  public static final native byte[] GroupPendencyItem_apply_invite_msg_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_apply_invite_msg_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native byte[] GroupPendencyItem_approval_msg_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_approval_msg_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native byte[] GroupPendencyItem_authentication_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_authentication_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native String GroupPendencyItem_from_id_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_from_id_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, String paramString);
  
  public static final native byte[] GroupPendencyItem_from_user_defined_data_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_from_user_defined_data_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native String GroupPendencyItem_group_id_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_group_id_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, String paramString);
  
  public static final native long GroupPendencyItem_handle_result_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_handle_result_set(long paramLong1, GroupPendencyItem paramGroupPendencyItem, long paramLong2);
  
  public static final native long GroupPendencyItem_handled_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_handled_set(long paramLong1, GroupPendencyItem paramGroupPendencyItem, long paramLong2);
  
  public static final native byte[] GroupPendencyItem_key_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_key_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native long GroupPendencyItem_pendency_type_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_pendency_type_set(long paramLong1, GroupPendencyItem paramGroupPendencyItem, long paramLong2);
  
  public static final native byte[] GroupPendencyItem_selfIdentifier_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_selfIdentifier_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native String GroupPendencyItem_to_id_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_to_id_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, String paramString);
  
  public static final native byte[] GroupPendencyItem_to_user_defined_data_get(long paramLong, GroupPendencyItem paramGroupPendencyItem);
  
  public static final native void GroupPendencyItem_to_user_defined_data_set(long paramLong, GroupPendencyItem paramGroupPendencyItem, byte[] paramArrayOfByte);
  
  public static final native long GroupPendencyMeta_next_start_time_get(long paramLong, GroupPendencyMeta paramGroupPendencyMeta);
  
  public static final native void GroupPendencyMeta_next_start_time_set(long paramLong1, GroupPendencyMeta paramGroupPendencyMeta, long paramLong2);
  
  public static final native long GroupPendencyMeta_read_time_seq_get(long paramLong, GroupPendencyMeta paramGroupPendencyMeta);
  
  public static final native void GroupPendencyMeta_read_time_seq_set(long paramLong1, GroupPendencyMeta paramGroupPendencyMeta, long paramLong2);
  
  public static final native long GroupPendencyMeta_unread_num_get(long paramLong, GroupPendencyMeta paramGroupPendencyMeta);
  
  public static final native void GroupPendencyMeta_unread_num_set(long paramLong1, GroupPendencyMeta paramGroupPendencyMeta, long paramLong2);
  
  public static final native byte[] GroupReportElem_authentication_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_authentication_set(long paramLong, GroupReportElem paramGroupReportElem, byte[] paramArrayOfByte);
  
  public static final native String GroupReportElem_group_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native String GroupReportElem_group_name_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_group_name_set(long paramLong, GroupReportElem paramGroupReportElem, String paramString);
  
  public static final native void GroupReportElem_group_set(long paramLong, GroupReportElem paramGroupReportElem, String paramString);
  
  public static final native byte[] GroupReportElem_msg_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native long GroupReportElem_msg_key_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_msg_key_set(long paramLong1, GroupReportElem paramGroupReportElem, long paramLong2);
  
  public static final native void GroupReportElem_msg_set(long paramLong, GroupReportElem paramGroupReportElem, byte[] paramArrayOfByte);
  
  public static final native long GroupReportElem_operator_group_member_info_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_operator_group_member_info_set(long paramLong1, GroupReportElem paramGroupReportElem, long paramLong2, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native String GroupReportElem_operator_user_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native long GroupReportElem_operator_user_info_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_operator_user_info_set(long paramLong1, GroupReportElem paramGroupReportElem, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native void GroupReportElem_operator_user_set(long paramLong, GroupReportElem paramGroupReportElem, String paramString);
  
  public static final native byte[] GroupReportElem_platform_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_platform_set(long paramLong, GroupReportElem paramGroupReportElem, byte[] paramArrayOfByte);
  
  public static final native long GroupReportElem_type_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_type_set(long paramLong1, GroupReportElem paramGroupReportElem, long paramLong2);
  
  public static final native byte[] GroupReportElem_user_data_get(long paramLong, GroupReportElem paramGroupReportElem);
  
  public static final native void GroupReportElem_user_data_set(long paramLong, GroupReportElem paramGroupReportElem, byte[] paramArrayOfByte);
  
  public static final native long GroupSelfInfo_dwMsgFalg_get(long paramLong, GroupSelfInfo paramGroupSelfInfo);
  
  public static final native void GroupSelfInfo_dwMsgFalg_set(long paramLong1, GroupSelfInfo paramGroupSelfInfo, long paramLong2);
  
  public static final native long GroupSelfInfo_joinTime_get(long paramLong, GroupSelfInfo paramGroupSelfInfo);
  
  public static final native void GroupSelfInfo_joinTime_set(long paramLong1, GroupSelfInfo paramGroupSelfInfo, long paramLong2);
  
  public static final native long GroupSelfInfo_role_get(long paramLong, GroupSelfInfo paramGroupSelfInfo);
  
  public static final native void GroupSelfInfo_role_set(long paramLong1, GroupSelfInfo paramGroupSelfInfo, long paramLong2);
  
  public static final native long GroupSelfInfo_unreadNum_get(long paramLong, GroupSelfInfo paramGroupSelfInfo);
  
  public static final native void GroupSelfInfo_unreadNum_set(long paramLong1, GroupSelfInfo paramGroupSelfInfo, long paramLong2);
  
  public static final native long GroupSettings_groupInfoOpt_get(long paramLong, GroupSettings paramGroupSettings);
  
  public static final native void GroupSettings_groupInfoOpt_set(long paramLong1, GroupSettings paramGroupSettings, long paramLong2, UpdateInfoOpt paramUpdateInfoOpt);
  
  public static final native long GroupSettings_memberInfoOpt_get(long paramLong, GroupSettings paramGroupSettings);
  
  public static final native void GroupSettings_memberInfoOpt_set(long paramLong1, GroupSettings paramGroupSettings, long paramLong2, UpdateInfoOpt paramUpdateInfoOpt);
  
  public static final native boolean GroupSettings_storageEnabled_get(long paramLong, GroupSettings paramGroupSettings);
  
  public static final native void GroupSettings_storageEnabled_set(long paramLong, GroupSettings paramGroupSettings, boolean paramBoolean);
  
  public static final native long GroupTipsElem_GroupInfoVec_capacity(long paramLong, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec);
  
  public static final native void GroupTipsElem_GroupInfoVec_clear(long paramLong, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec);
  
  public static final native boolean GroupTipsElem_GroupInfoVec_empty(long paramLong, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec);
  
  public static final native long GroupTipsElem_GroupInfoVec_get(long paramLong, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec, int paramInt);
  
  public static final native void GroupTipsElem_GroupInfoVec_pushBack(long paramLong1, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec, long paramLong2, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo);
  
  public static final native void GroupTipsElem_GroupInfoVec_reserve(long paramLong1, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec, long paramLong2);
  
  public static final native void GroupTipsElem_GroupInfoVec_set(long paramLong1, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec, int paramInt, long paramLong2, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo);
  
  public static final native long GroupTipsElem_GroupInfoVec_size(long paramLong, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec);
  
  public static final native int GroupTipsElem_GroupInfo_type_get(long paramLong, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo);
  
  public static final native void GroupTipsElem_GroupInfo_type_set(long paramLong, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo, int paramInt);
  
  public static final native byte[] GroupTipsElem_GroupInfo_value_get(long paramLong, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo);
  
  public static final native void GroupTipsElem_GroupInfo_value_set(long paramLong, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo, byte[] paramArrayOfByte);
  
  public static final native long GroupTipsElem_MemberInfoVec_capacity(long paramLong, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec);
  
  public static final native void GroupTipsElem_MemberInfoVec_clear(long paramLong, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec);
  
  public static final native boolean GroupTipsElem_MemberInfoVec_empty(long paramLong, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec);
  
  public static final native long GroupTipsElem_MemberInfoVec_get(long paramLong, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec, int paramInt);
  
  public static final native void GroupTipsElem_MemberInfoVec_pushBack(long paramLong1, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec, long paramLong2, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo);
  
  public static final native void GroupTipsElem_MemberInfoVec_reserve(long paramLong1, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec, long paramLong2);
  
  public static final native void GroupTipsElem_MemberInfoVec_set(long paramLong1, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec, int paramInt, long paramLong2, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo);
  
  public static final native long GroupTipsElem_MemberInfoVec_size(long paramLong, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec);
  
  public static final native String GroupTipsElem_MemberInfo_identifier_get(long paramLong, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo);
  
  public static final native void GroupTipsElem_MemberInfo_identifier_set(long paramLong, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo, String paramString);
  
  public static final native long GroupTipsElem_MemberInfo_shutup_time_get(long paramLong, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo);
  
  public static final native void GroupTipsElem_MemberInfo_shutup_time_set(long paramLong1, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo, long paramLong2);
  
  public static final native long GroupTipsElem_changed_group_member_info_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_changed_group_member_info_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2);
  
  public static final native long GroupTipsElem_changed_user_info_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_changed_user_info_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2);
  
  public static final native long GroupTipsElem_group_change_list_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_group_change_list_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec);
  
  public static final native byte[] GroupTipsElem_group_id_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_group_id_set(long paramLong, GroupTipsElem paramGroupTipsElem, byte[] paramArrayOfByte);
  
  public static final native byte[] GroupTipsElem_group_name_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_group_name_set(long paramLong, GroupTipsElem paramGroupTipsElem, byte[] paramArrayOfByte);
  
  public static final native long GroupTipsElem_member_change_list_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_member_change_list_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2, GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec);
  
  public static final native long GroupTipsElem_op_group_member_info_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_op_group_member_info_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native String GroupTipsElem_op_user_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native long GroupTipsElem_op_user_info_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_op_user_info_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native void GroupTipsElem_op_user_set(long paramLong, GroupTipsElem paramGroupTipsElem, String paramString);
  
  public static final native byte[] GroupTipsElem_platform_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_platform_set(long paramLong, GroupTipsElem paramGroupTipsElem, byte[] paramArrayOfByte);
  
  public static final native long GroupTipsElem_time_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_time_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2);
  
  public static final native int GroupTipsElem_type_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_type_set(long paramLong, GroupTipsElem paramGroupTipsElem, int paramInt);
  
  public static final native long GroupTipsElem_user_list_get(long paramLong, GroupTipsElem paramGroupTipsElem);
  
  public static final native void GroupTipsElem_user_list_set(long paramLong1, GroupTipsElem paramGroupTipsElem, long paramLong2, StrVec paramStrVec);
  
  public static final native void IApplyDownloadFileCallback_change_ownership(IApplyDownloadFileCallback paramIApplyDownloadFileCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IApplyDownloadFileCallback_director_connect(IApplyDownloadFileCallback paramIApplyDownloadFileCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IApplyDownloadFileCallback_done(long paramLong1, IApplyDownloadFileCallback paramIApplyDownloadFileCallback, long paramLong2, StrVec paramStrVec);
  
  public static final native void IApplyDownloadFileCallback_doneSwigExplicitIApplyDownloadFileCallback(long paramLong1, IApplyDownloadFileCallback paramIApplyDownloadFileCallback, long paramLong2, StrVec paramStrVec);
  
  public static final native void IApplyDownloadFileCallback_fail(long paramLong, IApplyDownloadFileCallback paramIApplyDownloadFileCallback, int paramInt, String paramString);
  
  public static final native void IApplyDownloadFileCallback_failSwigExplicitIApplyDownloadFileCallback(long paramLong, IApplyDownloadFileCallback paramIApplyDownloadFileCallback, int paramInt, String paramString);
  
  public static final native void IAvInviteCallBack_change_ownership(IAvInviteCallBack paramIAvInviteCallBack, long paramLong, boolean paramBoolean);
  
  public static final native void IAvInviteCallBack_director_connect(IAvInviteCallBack paramIAvInviteCallBack, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IAvInviteCallBack_onAvInviteBuf(long paramLong, IAvInviteCallBack paramIAvInviteCallBack, byte[] paramArrayOfByte);
  
  public static final native void IAvInviteCallBack_onAvInviteBufSwigExplicitIAvInviteCallBack(long paramLong, IAvInviteCallBack paramIAvInviteCallBack, byte[] paramArrayOfByte);
  
  public static final native int IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_code_get(long paramLong, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo);
  
  public static final native void IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_code_set(long paramLong, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo, int paramInt);
  
  public static final native String IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_msg_get(long paramLong, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo);
  
  public static final native void IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_msg_set(long paramLong, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo, String paramString);
  
  public static final native String IBatchOprCallback_BatchOprDetailInfo_ErrInfo_id_get(long paramLong, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo);
  
  public static final native void IBatchOprCallback_BatchOprDetailInfo_ErrInfo_id_set(long paramLong, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo, String paramString);
  
  public static final native long IBatchOprCallback_BatchOprDetailInfo_errs_get(long paramLong, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo);
  
  public static final native void IBatchOprCallback_BatchOprDetailInfo_errs_set(long paramLong1, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo, long paramLong2, ErrInfoVec paramErrInfoVec);
  
  public static final native long IBatchOprCallback_BatchOprDetailInfo_fail_num_get(long paramLong, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo);
  
  public static final native void IBatchOprCallback_BatchOprDetailInfo_fail_num_set(long paramLong1, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo, long paramLong2);
  
  public static final native long IBatchOprCallback_BatchOprDetailInfo_succ_num_get(long paramLong, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo);
  
  public static final native void IBatchOprCallback_BatchOprDetailInfo_succ_num_set(long paramLong1, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo, long paramLong2);
  
  public static final native void IBatchOprCallback_change_ownership(IBatchOprCallback paramIBatchOprCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IBatchOprCallback_director_connect(IBatchOprCallback paramIBatchOprCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IBatchOprCallback_done(long paramLong, IBatchOprCallback paramIBatchOprCallback);
  
  public static final native void IBatchOprCallback_doneSwigExplicitIBatchOprCallback(long paramLong, IBatchOprCallback paramIBatchOprCallback);
  
  public static final native void IBatchOprCallback_fail(long paramLong1, IBatchOprCallback paramIBatchOprCallback, int paramInt, String paramString, long paramLong2, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo);
  
  public static final native void IBatchOprCallback_failSwigExplicitIBatchOprCallback(long paramLong1, IBatchOprCallback paramIBatchOprCallback, int paramInt, String paramString, long paramLong2, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo);
  
  public static final native void IBatchOprCallback_setLogin(long paramLong, IBatchOprCallback paramIBatchOprCallback, String paramString, boolean paramBoolean);
  
  public static final native void IBatchOprCallback_setLoginSwigExplicitIBatchOprCallback(long paramLong, IBatchOprCallback paramIBatchOprCallback, String paramString, boolean paramBoolean);
  
  public static final native void ICreateGroupCallback_change_ownership(ICreateGroupCallback paramICreateGroupCallback, long paramLong, boolean paramBoolean);
  
  public static final native void ICreateGroupCallback_director_connect(ICreateGroupCallback paramICreateGroupCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void ICreateGroupCallback_done(long paramLong, ICreateGroupCallback paramICreateGroupCallback, String paramString);
  
  public static final native void ICreateGroupCallback_doneSwigExplicitICreateGroupCallback(long paramLong, ICreateGroupCallback paramICreateGroupCallback, String paramString);
  
  public static final native void ICreateGroupCallback_fail(long paramLong, ICreateGroupCallback paramICreateGroupCallback, int paramInt, String paramString);
  
  public static final native void ICreateGroupCallback_failSwigExplicitICreateGroupCallback(long paramLong, ICreateGroupCallback paramICreateGroupCallback, int paramInt, String paramString);
  
  public static final native void IDeleteLocalMsg_change_ownership(IDeleteLocalMsg paramIDeleteLocalMsg, long paramLong, boolean paramBoolean);
  
  public static final native void IDeleteLocalMsg_director_connect(IDeleteLocalMsg paramIDeleteLocalMsg, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IDeleteLocalMsg_done(long paramLong, IDeleteLocalMsg paramIDeleteLocalMsg);
  
  public static final native void IDeleteLocalMsg_doneSwigExplicitIDeleteLocalMsg(long paramLong, IDeleteLocalMsg paramIDeleteLocalMsg);
  
  public static final native void IDeleteLocalMsg_fail(long paramLong, IDeleteLocalMsg paramIDeleteLocalMsg, int paramInt, String paramString);
  
  public static final native void IDeleteLocalMsg_failSwigExplicitIDeleteLocalMsg(long paramLong, IDeleteLocalMsg paramIDeleteLocalMsg, int paramInt, String paramString);
  
  public static final native void IEnv_change_ownership(IEnv paramIEnv, long paramLong, boolean paramBoolean);
  
  public static final native boolean IEnv_createThread(long paramLong1, IEnv paramIEnv, long paramLong2, ThreadEntry paramThreadEntry);
  
  public static final native boolean IEnv_createThreadSwigExplicitIEnv(long paramLong1, IEnv paramIEnv, long paramLong2, ThreadEntry paramThreadEntry);
  
  public static final native void IEnv_director_connect(IEnv paramIEnv, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native boolean IEnv_httpRequest(long paramLong1, IEnv paramIEnv, String paramString1, int paramInt, String paramString2, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native boolean IEnv_httpRequestSwigExplicitIEnv(long paramLong1, IEnv paramIEnv, String paramString1, int paramInt, String paramString2, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native boolean IEnv_runOnMainThread(long paramLong1, IEnv paramIEnv, long paramLong2, RunClosure paramRunClosure);
  
  public static final native boolean IEnv_runOnMainThreadSwigExplicitIEnv(long paramLong1, IEnv paramIEnv, long paramLong2, RunClosure paramRunClosure);
  
  public static final native boolean IEnv_sSORequestSwigExplicitIEnv__SWIG_0(long paramLong1, IEnv paramIEnv, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure, long paramLong3);
  
  public static final native boolean IEnv_sSORequestSwigExplicitIEnv__SWIG_1(long paramLong1, IEnv paramIEnv, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native boolean IEnv_sSORequest__SWIG_0(long paramLong1, IEnv paramIEnv, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure, long paramLong3);
  
  public static final native boolean IEnv_sSORequest__SWIG_1(long paramLong1, IEnv paramIEnv, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native void IEnv_setLogin(long paramLong, IEnv paramIEnv, String paramString, boolean paramBoolean);
  
  public static final native void IEnv_setLoginSwigExplicitIEnv(long paramLong, IEnv paramIEnv, String paramString, boolean paramBoolean);
  
  public static final native boolean IEnv_uploadLogFile(long paramLong, IEnv paramIEnv, String paramString1, String paramString2, String paramString3);
  
  public static final native boolean IEnv_uploadLogFileSwigExplicitIEnv(long paramLong, IEnv paramIEnv, String paramString1, String paramString2, String paramString3);
  
  public static final native void IFileTrans_change_ownership(IFileTrans paramIFileTrans, long paramLong, boolean paramBoolean);
  
  public static final native void IFileTrans_director_connect(IFileTrans paramIFileTrans, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFileTrans_done(long paramLong1, IFileTrans paramIFileTrans, long paramLong2, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void IFileTrans_doneSwigExplicitIFileTrans(long paramLong1, IFileTrans paramIFileTrans, long paramLong2, FileTransSuccParam paramFileTransSuccParam);
  
  public static final native void IFileTrans_fail(long paramLong, IFileTrans paramIFileTrans, int paramInt, String paramString);
  
  public static final native void IFileTrans_failSwigExplicitIFileTrans(long paramLong, IFileTrans paramIFileTrans, int paramInt, String paramString);
  
  public static final native void IFriendGroupCallback_change_ownership(IFriendGroupCallback paramIFriendGroupCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendGroupCallback_director_connect(IFriendGroupCallback paramIFriendGroupCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendGroupCallback_done(long paramLong1, IFriendGroupCallback paramIFriendGroupCallback, long paramLong2, FriendGroupVec paramFriendGroupVec);
  
  public static final native void IFriendGroupCallback_doneSwigExplicitIFriendGroupCallback(long paramLong1, IFriendGroupCallback paramIFriendGroupCallback, long paramLong2, FriendGroupVec paramFriendGroupVec);
  
  public static final native void IFriendGroupCallback_fail(long paramLong, IFriendGroupCallback paramIFriendGroupCallback, int paramInt, String paramString);
  
  public static final native void IFriendGroupCallback_failSwigExplicitIFriendGroupCallback(long paramLong, IFriendGroupCallback paramIFriendGroupCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipActionCallbackV2_change_ownership(IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipActionCallbackV2_director_connect(IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipActionCallbackV2_done(long paramLong1, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, long paramLong2, long paramLong3, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipActionCallbackV2_doneSwigExplicitIFriendshipActionCallbackV2(long paramLong1, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, long paramLong2, long paramLong3, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipActionCallbackV2_fail(long paramLong, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, int paramInt, String paramString);
  
  public static final native void IFriendshipActionCallbackV2_failSwigExplicitIFriendshipActionCallbackV2(long paramLong, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, int paramInt, String paramString);
  
  public static final native long IFriendshipActionCallbackV2_vecFriends_get(long paramLong, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2);
  
  public static final native void IFriendshipActionCallbackV2_vecFriends_set(long paramLong1, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipActionCallback_change_ownership(IFriendshipActionCallback paramIFriendshipActionCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipActionCallback_director_connect(IFriendshipActionCallback paramIFriendshipActionCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipActionCallback_done(long paramLong1, IFriendshipActionCallback paramIFriendshipActionCallback, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipActionCallback_doneSwigExplicitIFriendshipActionCallback(long paramLong1, IFriendshipActionCallback paramIFriendshipActionCallback, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipActionCallback_fail(long paramLong, IFriendshipActionCallback paramIFriendshipActionCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipActionCallback_failSwigExplicitIFriendshipActionCallback(long paramLong, IFriendshipActionCallback paramIFriendshipActionCallback, int paramInt, String paramString);
  
  public static final native long IFriendshipActionCallback_vecFriends_get(long paramLong, IFriendshipActionCallback paramIFriendshipActionCallback);
  
  public static final native void IFriendshipActionCallback_vecFriends_set(long paramLong1, IFriendshipActionCallback paramIFriendshipActionCallback, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipCallback_change_ownership(IFriendshipCallback paramIFriendshipCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipCallback_director_connect(IFriendshipCallback paramIFriendshipCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipCallback_done(long paramLong, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native void IFriendshipCallback_doneSwigExplicitIFriendshipCallback(long paramLong, IFriendshipCallback paramIFriendshipCallback);
  
  public static final native void IFriendshipCallback_fail(long paramLong, IFriendshipCallback paramIFriendshipCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipCallback_failSwigExplicitIFriendshipCallback(long paramLong, IFriendshipCallback paramIFriendshipCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipGetFriendV2Callback_change_ownership(IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipGetFriendV2Callback_director_connect(IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipGetFriendV2Callback_done(long paramLong1, IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, long paramLong2, FriendMetaInfo paramFriendMetaInfo, long paramLong3, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipGetFriendV2Callback_doneSwigExplicitIFriendshipGetFriendV2Callback(long paramLong1, IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, long paramLong2, FriendMetaInfo paramFriendMetaInfo, long paramLong3, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipGetFriendV2Callback_fail(long paramLong, IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, int paramInt, String paramString);
  
  public static final native void IFriendshipGetFriendV2Callback_failSwigExplicitIFriendshipGetFriendV2Callback(long paramLong, IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, int paramInt, String paramString);
  
  public static final native void IFriendshipGetFutureCallback_change_ownership(IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipGetFutureCallback_director_connect(IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipGetFutureCallback_done(long paramLong1, IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, long paramLong2, FutureFriendMeta paramFutureFriendMeta, long paramLong3, FriendFutureItemVec paramFriendFutureItemVec);
  
  public static final native void IFriendshipGetFutureCallback_doneSwigExplicitIFriendshipGetFutureCallback(long paramLong1, IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, long paramLong2, FutureFriendMeta paramFutureFriendMeta, long paramLong3, FriendFutureItemVec paramFriendFutureItemVec);
  
  public static final native void IFriendshipGetFutureCallback_fail(long paramLong, IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipGetFutureCallback_failSwigExplicitIFriendshipGetFutureCallback(long paramLong, IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipPendencyCallback_change_ownership(IFriendshipPendencyCallback paramIFriendshipPendencyCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipPendencyCallback_director_connect(IFriendshipPendencyCallback paramIFriendshipPendencyCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipPendencyCallback_done(long paramLong1, IFriendshipPendencyCallback paramIFriendshipPendencyCallback, long paramLong2, FriendPendencyMeta paramFriendPendencyMeta, long paramLong3, FriendPendencyItemVec paramFriendPendencyItemVec);
  
  public static final native void IFriendshipPendencyCallback_doneSwigExplicitIFriendshipPendencyCallback(long paramLong1, IFriendshipPendencyCallback paramIFriendshipPendencyCallback, long paramLong2, FriendPendencyMeta paramFriendPendencyMeta, long paramLong3, FriendPendencyItemVec paramFriendPendencyItemVec);
  
  public static final native void IFriendshipPendencyCallback_fail(long paramLong, IFriendshipPendencyCallback paramIFriendshipPendencyCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipPendencyCallback_failSwigExplicitIFriendshipPendencyCallback(long paramLong, IFriendshipPendencyCallback paramIFriendshipPendencyCallback, int paramInt, String paramString);
  
  public static final native void IFriendshipProxyActionCallback_done(long paramLong1, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback, long paramLong2, FriendProfileVec paramFriendProfileVec, long paramLong3, long paramLong4);
  
  public static final native void IFriendshipProxyActionCallback_fail(long paramLong, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback, int paramInt, String paramString);
  
  public static final native boolean IFriendshipProxyActionCallback_getAllFlag(long paramLong, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback);
  
  public static final native void IFriendshipProxyActionCallback_setAllFlag(long paramLong, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback, boolean paramBoolean);
  
  public static final native long IFriendshipProxyActionCallback_vecFriends_get(long paramLong, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback);
  
  public static final native void IFriendshipProxyActionCallback_vecFriends_set(long paramLong1, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipProxyListener_change_ownership(IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong, boolean paramBoolean);
  
  public static final native void IFriendshipProxyListener_director_connect(IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IFriendshipProxyListener_onAddFriendNotify(long paramLong1, IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipProxyListener_onAddFriendReq(long paramLong1, IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong2, AddFriendReqVec paramAddFriendReqVec);
  
  public static final native void IFriendshipProxyListener_onDeleteFriendNotify(long paramLong1, IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong2, StrVec paramStrVec);
  
  public static final native void IFriendshipProxyListener_onFriendProfileUpdate(long paramLong1, IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong2, FriendProfileVec paramFriendProfileVec);
  
  public static final native void IFriendshipProxyListener_onProxyStatusChange(long paramLong, IFriendshipProxyListener paramIFriendshipProxyListener, int paramInt);
  
  public static final native void IGetMsgs_change_ownership(IGetMsgs paramIGetMsgs, long paramLong, boolean paramBoolean);
  
  public static final native void IGetMsgs_director_connect(IGetMsgs paramIGetMsgs, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGetMsgs_done(long paramLong1, IGetMsgs paramIGetMsgs, long paramLong2, MsgVec paramMsgVec);
  
  public static final native void IGetMsgs_doneSwigExplicitIGetMsgs(long paramLong1, IGetMsgs paramIGetMsgs, long paramLong2, MsgVec paramMsgVec);
  
  public static final native void IGetMsgs_fail(long paramLong, IGetMsgs paramIGetMsgs, int paramInt, String paramString);
  
  public static final native void IGetMsgs_failSwigExplicitIGetMsgs(long paramLong, IGetMsgs paramIGetMsgs, int paramInt, String paramString);
  
  public static final native void IGroupAssistantCallback_change_ownership(IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupAssistantCallback_director_connect(IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupAssistantCallback_onGroupAdd(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong2, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void IGroupAssistantCallback_onGroupAddSwigExplicitIGroupAssistantCallback(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong2, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void IGroupAssistantCallback_onGroupDelete(long paramLong, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString);
  
  public static final native void IGroupAssistantCallback_onGroupDeleteSwigExplicitIGroupAssistantCallback(long paramLong, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString);
  
  public static final native void IGroupAssistantCallback_onGroupUpdate(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong2, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void IGroupAssistantCallback_onGroupUpdateSwigExplicitIGroupAssistantCallback(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong2, GroupCacheInfo paramGroupCacheInfo);
  
  public static final native void IGroupAssistantCallback_onMemberJoin(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong2, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupAssistantCallback_onMemberJoinSwigExplicitIGroupAssistantCallback(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong2, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupAssistantCallback_onMemberQuit(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong2, StrVec paramStrVec);
  
  public static final native void IGroupAssistantCallback_onMemberQuitSwigExplicitIGroupAssistantCallback(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong2, StrVec paramStrVec);
  
  public static final native void IGroupAssistantCallback_onMemberUpdate(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong2, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupAssistantCallback_onMemberUpdateSwigExplicitIGroupAssistantCallback(long paramLong1, IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong2, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupGetPendencyCallback_change_ownership(IGroupGetPendencyCallback paramIGroupGetPendencyCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupGetPendencyCallback_director_connect(IGroupGetPendencyCallback paramIGroupGetPendencyCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupGetPendencyCallback_done(long paramLong1, IGroupGetPendencyCallback paramIGroupGetPendencyCallback, long paramLong2, GroupPendencyMeta paramGroupPendencyMeta, long paramLong3, GroupPendencyItemVec paramGroupPendencyItemVec);
  
  public static final native void IGroupGetPendencyCallback_doneSwigExplicitIGroupGetPendencyCallback(long paramLong1, IGroupGetPendencyCallback paramIGroupGetPendencyCallback, long paramLong2, GroupPendencyMeta paramGroupPendencyMeta, long paramLong3, GroupPendencyItemVec paramGroupPendencyItemVec);
  
  public static final native void IGroupGetPendencyCallback_fail(long paramLong, IGroupGetPendencyCallback paramIGroupGetPendencyCallback, int paramInt, String paramString);
  
  public static final native void IGroupGetPendencyCallback_failSwigExplicitIGroupGetPendencyCallback(long paramLong, IGroupGetPendencyCallback paramIGroupGetPendencyCallback, int paramInt, String paramString);
  
  public static final native void IGroupInfoListCallbackV2_change_ownership(IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupInfoListCallbackV2_director_connect(IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupInfoListCallbackV2_done(long paramLong1, IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, long paramLong2, long paramLong3, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native void IGroupInfoListCallbackV2_doneSwigExplicitIGroupInfoListCallbackV2(long paramLong1, IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, long paramLong2, long paramLong3, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native void IGroupInfoListCallbackV2_fail(long paramLong, IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, int paramInt, String paramString);
  
  public static final native void IGroupInfoListCallbackV2_failSwigExplicitIGroupInfoListCallbackV2(long paramLong, IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, int paramInt, String paramString);
  
  public static final native void IGroupInfoListCallback_change_ownership(IGroupInfoListCallback paramIGroupInfoListCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupInfoListCallback_director_connect(IGroupInfoListCallback paramIGroupInfoListCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupInfoListCallback_done(long paramLong1, IGroupInfoListCallback paramIGroupInfoListCallback, long paramLong2, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native void IGroupInfoListCallback_doneSwigExplicitIGroupInfoListCallback(long paramLong1, IGroupInfoListCallback paramIGroupInfoListCallback, long paramLong2, GroupDetailInfoVec paramGroupDetailInfoVec);
  
  public static final native void IGroupInfoListCallback_fail(long paramLong, IGroupInfoListCallback paramIGroupInfoListCallback, int paramInt, String paramString);
  
  public static final native void IGroupInfoListCallback_failSwigExplicitIGroupInfoListCallback(long paramLong, IGroupInfoListCallback paramIGroupInfoListCallback, int paramInt, String paramString);
  
  public static final native void IGroupListCallback_change_ownership(IGroupListCallback paramIGroupListCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupListCallback_director_connect(IGroupListCallback paramIGroupListCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupListCallback_done(long paramLong1, IGroupListCallback paramIGroupListCallback, long paramLong2, GroupBaseInfoVec paramGroupBaseInfoVec);
  
  public static final native void IGroupListCallback_doneSwigExplicitIGroupListCallback(long paramLong1, IGroupListCallback paramIGroupListCallback, long paramLong2, GroupBaseInfoVec paramGroupBaseInfoVec);
  
  public static final native void IGroupListCallback_fail(long paramLong, IGroupListCallback paramIGroupListCallback, int paramInt, String paramString);
  
  public static final native void IGroupListCallback_failSwigExplicitIGroupListCallback(long paramLong, IGroupListCallback paramIGroupListCallback, int paramInt, String paramString);
  
  public static final native void IGroupMemberCallbackV2_change_ownership(IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupMemberCallbackV2_director_connect(IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupMemberCallbackV2_done(long paramLong1, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, long paramLong2, long paramLong3, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupMemberCallbackV2_doneSwigExplicitIGroupMemberCallbackV2(long paramLong1, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, long paramLong2, long paramLong3, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupMemberCallbackV2_fail(long paramLong, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, int paramInt, String paramString);
  
  public static final native void IGroupMemberCallbackV2_failSwigExplicitIGroupMemberCallbackV2(long paramLong, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, int paramInt, String paramString);
  
  public static final native void IGroupMemberCallback_change_ownership(IGroupMemberCallback paramIGroupMemberCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupMemberCallback_director_connect(IGroupMemberCallback paramIGroupMemberCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupMemberCallback_done(long paramLong1, IGroupMemberCallback paramIGroupMemberCallback, long paramLong2, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupMemberCallback_doneSwigExplicitIGroupMemberCallback(long paramLong1, IGroupMemberCallback paramIGroupMemberCallback, long paramLong2, GroupMemberInfoVec paramGroupMemberInfoVec);
  
  public static final native void IGroupMemberCallback_fail(long paramLong, IGroupMemberCallback paramIGroupMemberCallback, int paramInt, String paramString);
  
  public static final native void IGroupMemberCallback_failSwigExplicitIGroupMemberCallback(long paramLong, IGroupMemberCallback paramIGroupMemberCallback, int paramInt, String paramString);
  
  public static final native void IGroupMemberResultCallback_change_ownership(IGroupMemberResultCallback paramIGroupMemberResultCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupMemberResultCallback_director_connect(IGroupMemberResultCallback paramIGroupMemberResultCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupMemberResultCallback_done(long paramLong1, IGroupMemberResultCallback paramIGroupMemberResultCallback, long paramLong2, GroupMemberResultVec paramGroupMemberResultVec);
  
  public static final native void IGroupMemberResultCallback_doneSwigExplicitIGroupMemberResultCallback(long paramLong1, IGroupMemberResultCallback paramIGroupMemberResultCallback, long paramLong2, GroupMemberResultVec paramGroupMemberResultVec);
  
  public static final native void IGroupMemberResultCallback_fail(long paramLong, IGroupMemberResultCallback paramIGroupMemberResultCallback, int paramInt, String paramString);
  
  public static final native void IGroupMemberResultCallback_failSwigExplicitIGroupMemberResultCallback(long paramLong, IGroupMemberResultCallback paramIGroupMemberResultCallback, int paramInt, String paramString);
  
  public static final native void IGroupNotifyCallback_change_ownership(IGroupNotifyCallback paramIGroupNotifyCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupNotifyCallback_director_connect(IGroupNotifyCallback paramIGroupNotifyCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupNotifyCallback_done(long paramLong, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native void IGroupNotifyCallback_doneSwigExplicitIGroupNotifyCallback(long paramLong, IGroupNotifyCallback paramIGroupNotifyCallback);
  
  public static final native void IGroupNotifyCallback_fail(long paramLong, IGroupNotifyCallback paramIGroupNotifyCallback, int paramInt, String paramString);
  
  public static final native void IGroupNotifyCallback_failSwigExplicitIGroupNotifyCallback(long paramLong, IGroupNotifyCallback paramIGroupNotifyCallback, int paramInt, String paramString);
  
  public static final native void IGroupTipsEventCallback_change_ownership(IGroupTipsEventCallback paramIGroupTipsEventCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupTipsEventCallback_director_connect(IGroupTipsEventCallback paramIGroupTipsEventCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupTipsEventCallback_onGroupTipsEvent(long paramLong1, IGroupTipsEventCallback paramIGroupTipsEventCallback, long paramLong2, GroupTipsElem paramGroupTipsElem);
  
  public static final native void IGroupTipsEventCallback_onGroupTipsEventSwigExplicitIGroupTipsEventCallback(long paramLong1, IGroupTipsEventCallback paramIGroupTipsEventCallback, long paramLong2, GroupTipsElem paramGroupTipsElem);
  
  public static final native void IGroupUpdateCallback_change_ownership(IGroupUpdateCallback paramIGroupUpdateCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IGroupUpdateCallback_director_connect(IGroupUpdateCallback paramIGroupUpdateCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IGroupUpdateCallback_onMembersUpdate(long paramLong1, IGroupUpdateCallback paramIGroupUpdateCallback, long paramLong2, GroupTipsElem paramGroupTipsElem);
  
  public static final native void IGroupUpdateCallback_onMembersUpdateSwigExplicitIGroupUpdateCallback(long paramLong1, IGroupUpdateCallback paramIGroupUpdateCallback, long paramLong2, GroupTipsElem paramGroupTipsElem);
  
  public static final native void IImageUploadCallback_change_ownership(IImageUploadCallback paramIImageUploadCallback, long paramLong, boolean paramBoolean);
  
  public static final native void IImageUploadCallback_director_connect(IImageUploadCallback paramIImageUploadCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IImageUploadCallback_done(long paramLong1, IImageUploadCallback paramIImageUploadCallback, long paramLong2, ImageElem paramImageElem);
  
  public static final native void IImageUploadCallback_doneSwigExplicitIImageUploadCallback(long paramLong1, IImageUploadCallback paramIImageUploadCallback, long paramLong2, ImageElem paramImageElem);
  
  public static final native void IImageUploadCallback_fail(long paramLong, IImageUploadCallback paramIImageUploadCallback, int paramInt, String paramString);
  
  public static final native void IImageUploadCallback_failSwigExplicitIImageUploadCallback(long paramLong, IImageUploadCallback paramIImageUploadCallback, int paramInt, String paramString);
  
  public static final native void IInit_change_ownership(IInit paramIInit, long paramLong, boolean paramBoolean);
  
  public static final native void IInit_director_connect(IInit paramIInit, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void IInit_done(long paramLong, IInit paramIInit);
  
  public static final native void IInit_doneSwigExplicitIInit(long paramLong, IInit paramIInit);
  
  public static final native void IInit_fail(long paramLong, IInit paramIInit, int paramInt, String paramString);
  
  public static final native void IInit_failSwigExplicitIInit(long paramLong, IInit paramIInit, int paramInt, String paramString);
  
  public static final native void ILogMsgCallback_change_ownership(ILogMsgCallback paramILogMsgCallback, long paramLong, boolean paramBoolean);
  
  public static final native void ILogMsgCallback_director_connect(ILogMsgCallback paramILogMsgCallback, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void ILogMsgCallback_onLogMsg(long paramLong, ILogMsgCallback paramILogMsgCallback, String paramString1, int paramInt, String paramString2);
  
  public static final native void ILogMsgCallback_onLogMsgSwigExplicitILogMsgCallback(long paramLong, ILogMsgCallback paramILogMsgCallback, String paramString1, int paramInt, String paramString2);
  
  public static final native int IMCORE_GROUP_INFO_CHAGE_TYPE_FACE_URL_get();
  
  public static final native int IMCORE_GROUP_INFO_CHAGE_TYPE_GROUP_NAME_get();
  
  public static final native int IMCORE_GROUP_INFO_CHAGE_TYPE_INTRODUCTION_get();
  
  public static final native int IMCORE_GROUP_INFO_CHAGE_TYPE_NOTIFACTION_get();
  
  public static final native int IMCORE_GROUP_INFO_CHAGE_TYPE_OWNER_get();
  
  public static final native String IMCORE_VERSION_get();
  
  public static final native String IMCoreUser_a2(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native int IMCoreUser_applyDownloadFile(long paramLong1, IMCoreUser paramIMCoreUser, String paramString, long paramLong2, long paramLong3, IApplyDownloadFileCallback paramIApplyDownloadFileCallback);
  
  public static final native int IMCoreUser_cancelAllPicupTask(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native void IMCoreUser_cancelTask(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native void IMCoreUser_clearCookie(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native int IMCoreUser_compressPic(long paramLong, IMCoreUser paramIMCoreUser, String paramString1, String paramString2, int paramInt);
  
  public static final native boolean IMCoreUser_deleteGroupMsgs(long paramLong1, IMCoreUser paramIMCoreUser, String paramString, long paramLong2, long paramLong3);
  
  public static final native boolean IMCoreUser_deleteSession(long paramLong, IMCoreUser paramIMCoreUser, int paramInt, String paramString);
  
  public static final native boolean IMCoreUser_deleteSessionAndMsgs(long paramLong, IMCoreUser paramIMCoreUser, int paramInt, String paramString);
  
  public static final native boolean IMCoreUser_fake(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getAvInviteCallBack(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getFileTranser(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getFriendShipMgr(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getFriendShipPrxy(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getGroupAssistant(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getGroupMgr(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getGroupTipsEventCallback(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getGroupUpdateCallback(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native int IMCoreUser_getImageUploadProgrss(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native long IMCoreUser_getSelfProfile(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native long IMCoreUser_getSession__SWIG_0(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native long IMCoreUser_getSession__SWIG_1(long paramLong, IMCoreUser paramIMCoreUser, int paramInt, String paramString);
  
  public static final native long IMCoreUser_getStatusMgr(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native boolean IMCoreUser_httpRequest(long paramLong1, IMCoreUser paramIMCoreUser, int paramInt, String paramString, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native String IMCoreUser_ip(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native void IMCoreUser_loginSyncCache(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native void IMCoreUser_loginSyncMsg(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native int IMCoreUser_manualPush(long paramLong, IMCoreUser paramIMCoreUser, byte[] paramArrayOfByte);
  
  public static final native long IMCoreUser_newSession(long paramLong, IMCoreUser paramIMCoreUser, int paramInt, String paramString);
  
  public static final native boolean IMCoreUser_runOnIOThread(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native boolean IMCoreUser_runOnMainThread(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native boolean IMCoreUser_runOnTaskThread(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native boolean IMCoreUser_sSORequest__SWIG_0(long paramLong1, IMCoreUser paramIMCoreUser, String paramString, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure, long paramLong3);
  
  public static final native boolean IMCoreUser_sSORequest__SWIG_1(long paramLong1, IMCoreUser paramIMCoreUser, String paramString, byte[] paramArrayOfByte, long paramLong2, EnvRequestClosure paramEnvRequestClosure);
  
  public static final native void IMCoreUser_saveSelfProfile(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2, FriendProfile paramFriendProfile);
  
  public static final native long IMCoreUser_sdkAppId(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native void IMCoreUser_sendMsgToMultiUsers(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2, StrVec paramStrVec, long paramLong3, Msg paramMsg, long paramLong4, IBatchOprCallback paramIBatchOprCallback);
  
  public static final native long IMCoreUser_sessionCount(long paramLong, IMCoreUser paramIMCoreUser);
  
  public static final native void IMCoreUser_setA2(long paramLong, IMCoreUser paramIMCoreUser, String paramString);
  
  public static final native void IMCoreUser_setAvInviteCallBack(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2, IAvInviteCallBack paramIAvInviteCallBack);
  
  public static final native void IMCoreUser_setGroupTipsEventCallback(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2, IGroupTipsEventCallback paramIGroupTipsEventCallback);
  
  public static final native void IMCoreUser_setGroupUpdateCallback(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2, IGroupUpdateCallback paramIGroupUpdateCallback);
  
  public static final native void IMCoreUser_setIp(long paramLong, IMCoreUser paramIMCoreUser, String paramString);
  
  public static final native boolean IMCoreUser_setLogin(long paramLong, IMCoreUser paramIMCoreUser, String paramString, boolean paramBoolean);
  
  public static final native void IMCoreUser_setSdkAppId(long paramLong1, IMCoreUser paramIMCoreUser, long paramLong2);
  
  public static final native long IMCoreUser_submitUploadTask__SWIG_0(long paramLong1, IMCoreUser paramIMCoreUser, String paramString, long paramLong2, IImageUploadCallback paramIImageUploadCallback, int paramInt);
  
  public static final native long IMCoreUser_submitUploadTask__SWIG_1(long paramLong1, IMCoreUser paramIMCoreUser, String paramString, long paramLong2, IImageUploadCallback paramIImageUploadCallback);
  
  public static final native void IMCore_clearLog__SWIG_0(long paramLong1, IMCore paramIMCore, String paramString1, long paramLong2, String paramString2, long paramLong3, int paramInt);
  
  public static final native void IMCore_clearLog__SWIG_1(long paramLong1, IMCore paramIMCore, String paramString1, long paramLong2, String paramString2, long paramLong3);
  
  public static final native void IMCore_clearLog__SWIG_2(long paramLong1, IMCore paramIMCore, String paramString1, long paramLong2, String paramString2);
  
  public static final native void IMCore_clearLog__SWIG_3(long paramLong1, IMCore paramIMCore, String paramString, long paramLong2);
  
  public static final native void IMCore_disableAutoReport(long paramLong, IMCore paramIMCore);
  
  public static final native void IMCore_disableStorage(long paramLong, IMCore paramIMCore);
  
  public static final native String IMCore_encodeHttpSsoListReq(long paramLong1, IMCore paramIMCore, String paramString1, String paramString2, boolean paramBoolean, String paramString3, long paramLong2);
  
  public static final native long IMCore_get();
  
  public static final native long IMCore_getContext(long paramLong, IMCore paramIMCore);
  
  public static final native boolean IMCore_getRecentContactEnableFlag(long paramLong, IMCore paramIMCore);
  
  public static final native long IMCore_getUser(long paramLong, IMCore paramIMCore, String paramString);
  
  public static final native String IMCore_getVersion(long paramLong, IMCore paramIMCore, int paramInt);
  
  public static final native boolean IMCore_initOpenIM(long paramLong1, IMCore paramIMCore, String paramString1, String paramString2, long paramLong2, IEnv paramIEnv);
  
  public static final native int IMCore_initUser(long paramLong1, IMCore paramIMCore, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5, String paramString6, long paramLong2, INotify paramINotify, long paramLong3, FriendshipProxyConfig paramFriendshipProxyConfig, long paramLong4, GroupAssistantConfig paramGroupAssistantConfig, long paramLong5, IInit paramIInit);
  
  public static final native boolean IMCore_isStorageEnabled(long paramLong, IMCore paramIMCore);
  
  public static final native void IMCore_lOGGERINIT(long paramLong1, IMCore paramIMCore, String paramString1, String paramString2, boolean paramBoolean, long paramLong2, ILogMsgCallback paramILogMsgCallback);
  
  public static final native void IMCore_lOGGERLOG(long paramLong, IMCore paramIMCore, int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4);
  
  public static final native void IMCore_lOGGERSETLOGCBLEVEL(long paramLong, IMCore paramIMCore, String paramString);
  
  public static final native long IMCore_parseHttpSsoListRsp(long paramLong, IMCore paramIMCore, String paramString);
  
  public static final native long IMCore_parseSsoList(long paramLong, IMCore paramIMCore, byte[] paramArrayOfByte);
  
  public static final native void IMCore_setContext(long paramLong1, IMCore paramIMCore, long paramLong2, Context paramContext);
  
  public static final native void IMCore_setRecentContactEnableFlag(long paramLong, IMCore paramIMCore, boolean paramBoolean);
  
  public static final native int IMCore_unInitUser(long paramLong, IMCore paramIMCore, String paramString);
  
  public static final native boolean IMCore_uploadLogFile(long paramLong, IMCore paramIMCore, String paramString1, String paramString2, String paramString3);
  
  public static final native void INotify_change_ownership(INotify paramINotify, long paramLong, boolean paramBoolean);
  
  public static final native void INotify_director_connect(INotify paramINotify, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void INotify_onMsgEvent(long paramLong1, INotify paramINotify, long paramLong2, MsgVec paramMsgVec);
  
  public static final native void INotify_onMsgEventSwigExplicitINotify(long paramLong1, INotify paramINotify, long paramLong2, MsgVec paramMsgVec);
  
  public static final native void INotify_onMsgUpdate(long paramLong1, INotify paramINotify, long paramLong2, MsgVec paramMsgVec);
  
  public static final native void INotify_onMsgUpdateSwigExplicitINotify(long paramLong1, INotify paramINotify, long paramLong2, MsgVec paramMsgVec);
  
  public static final native void INotify_onRefresh(long paramLong, INotify paramINotify);
  
  public static final native void INotify_onRefreshSwigExplicitINotify(long paramLong, INotify paramINotify);
  
  public static final native void INotify_onUploadProgress(long paramLong1, INotify paramINotify, long paramLong2, Msg paramMsg, int paramInt1, int paramInt2, int paramInt3);
  
  public static final native void INotify_onUploadProgressSwigExplicitINotify(long paramLong1, INotify paramINotify, long paramLong2, Msg paramMsg, int paramInt1, int paramInt2, int paramInt3);
  
  public static final native void ISendMsg_change_ownership(ISendMsg paramISendMsg, long paramLong, boolean paramBoolean);
  
  public static final native void ISendMsg_director_connect(ISendMsg paramISendMsg, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void ISendMsg_done(long paramLong, ISendMsg paramISendMsg);
  
  public static final native void ISendMsg_doneSwigExplicitISendMsg(long paramLong, ISendMsg paramISendMsg);
  
  public static final native void ISendMsg_fail(long paramLong, ISendMsg paramISendMsg, int paramInt, String paramString);
  
  public static final native void ISendMsg_failSwigExplicitISendMsg(long paramLong, ISendMsg paramISendMsg, int paramInt, String paramString);
  
  public static final native void ISetReadMsg_change_ownership(ISetReadMsg paramISetReadMsg, long paramLong, boolean paramBoolean);
  
  public static final native void ISetReadMsg_director_connect(ISetReadMsg paramISetReadMsg, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static final native void ISetReadMsg_done(long paramLong, ISetReadMsg paramISetReadMsg);
  
  public static final native void ISetReadMsg_doneSwigExplicitISetReadMsg(long paramLong, ISetReadMsg paramISetReadMsg);
  
  public static final native void ISetReadMsg_fail(long paramLong, ISetReadMsg paramISetReadMsg, int paramInt, String paramString);
  
  public static final native void ISetReadMsg_failSwigExplicitISetReadMsg(long paramLong, ISetReadMsg paramISetReadMsg, int paramInt, String paramString);
  
  public static final native void ISsoList_onNewSsoList(long paramLong1, ISsoList paramISsoList, long paramLong2, SsoAddrVec paramSsoAddrVec);
  
  public static final native void IStatusCallback_done(long paramLong1, IStatusCallback paramIStatusCallback, long paramLong2);
  
  public static final native void IStatusCallback_fail(long paramLong, IStatusCallback paramIStatusCallback, int paramInt, String paramString);
  
  public static final native long IStatusCallback_vecUserStatus_get(long paramLong, IStatusCallback paramIStatusCallback);
  
  public static final native void IStatusCallback_vecUserStatus_set(long paramLong1, IStatusCallback paramIStatusCallback, long paramLong2);
  
  public static final native void IStatusSetUserDefCallback_done(long paramLong, IStatusSetUserDefCallback paramIStatusSetUserDefCallback);
  
  public static final native void IStatusSetUserDefCallback_fail(long paramLong, IStatusSetUserDefCallback paramIStatusSetUserDefCallback, int paramInt, String paramString);
  
  public static final native String ImageElem_fileid_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_fileid_set(long paramLong, ImageElem paramImageElem, String paramString);
  
  public static final native int ImageElem_format_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_format_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native String ImageElem_large_url_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_large_url_set(long paramLong, ImageElem paramImageElem, String paramString);
  
  public static final native int ImageElem_level_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_level_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native String ImageElem_orig_url_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_orig_url_set(long paramLong, ImageElem paramImageElem, String paramString);
  
  public static final native int ImageElem_pic_height_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_height_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_large_height_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_large_height_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_large_size_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_large_size_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_large_width_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_large_width_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_size_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_size_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_thumb_height_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_thumb_height_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_thumb_size_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_thumb_size_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_thumb_width_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_thumb_width_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_pic_width_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_pic_width_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native int ImageElem_taskid_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_taskid_set(long paramLong, ImageElem paramImageElem, int paramInt);
  
  public static final native String ImageElem_thumb_url_get(long paramLong, ImageElem paramImageElem);
  
  public static final native void ImageElem_thumb_url_set(long paramLong, ImageElem paramImageElem, String paramString);
  
  public static final native long InstStatus_ddwClientType_get(long paramLong, InstStatus paramInstStatus);
  
  public static final native void InstStatus_ddwClientType_set(long paramLong1, InstStatus paramInstStatus, long paramLong2);
  
  public static final native String InstStatus_sUserDefine_get(long paramLong, InstStatus paramInstStatus);
  
  public static final native void InstStatus_sUserDefine_set(long paramLong, InstStatus paramInstStatus, String paramString);
  
  public static final native byte[] LocationElem_desc_get(long paramLong, LocationElem paramLocationElem);
  
  public static final native void LocationElem_desc_set(long paramLong, LocationElem paramLocationElem, byte[] paramArrayOfByte);
  
  public static final native double LocationElem_latitude_get(long paramLong, LocationElem paramLocationElem);
  
  public static final native void LocationElem_latitude_set(long paramLong, LocationElem paramLocationElem, double paramDouble);
  
  public static final native double LocationElem_longitude_get(long paramLong, LocationElem paramLocationElem);
  
  public static final native void LocationElem_longitude_set(long paramLong, LocationElem paramLocationElem, double paramDouble);
  
  public static final native int MAX_CACHE_MSG_NUM_get();
  
  public static final native void MapKeyFetcher_fetchMapKeys(long paramLong1, MapKeyFetcher paramMapKeyFetcher, long paramLong2, BytesMap paramBytesMap);
  
  public static final native byte[] MapKeyFetcher_getKey(long paramLong, MapKeyFetcher paramMapKeyFetcher, int paramInt);
  
  public static final native byte[] MapKeyFetcher_getValue(long paramLong1, MapKeyFetcher paramMapKeyFetcher, long paramLong2, BytesMap paramBytesMap, int paramInt);
  
  public static final native long MapKeyFetcher_keys_get(long paramLong, MapKeyFetcher paramMapKeyFetcher);
  
  public static final native void MapKeyFetcher_keys_set(long paramLong1, MapKeyFetcher paramMapKeyFetcher, long paramLong2, BytesVec paramBytesVec);
  
  public static final native long MemberInfo_custom_info_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_custom_info_set(long paramLong1, MemberInfo paramMemberInfo, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long MemberInfo_join_time_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_join_time_set(long paramLong1, MemberInfo paramMemberInfo, long paramLong2);
  
  public static final native String MemberInfo_member_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_member_set(long paramLong, MemberInfo paramMemberInfo, String paramString);
  
  public static final native long MemberInfo_msg_flag_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_msg_flag_set(long paramLong1, MemberInfo paramMemberInfo, long paramLong2);
  
  public static final native long MemberInfo_msg_seq_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_msg_seq_set(long paramLong1, MemberInfo paramMemberInfo, long paramLong2);
  
  public static final native byte[] MemberInfo_name_card_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_name_card_set(long paramLong, MemberInfo paramMemberInfo, byte[] paramArrayOfByte);
  
  public static final native long MemberInfo_role_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_role_set(long paramLong1, MemberInfo paramMemberInfo, long paramLong2);
  
  public static final native long MemberInfo_shutup_time_get(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native void MemberInfo_shutup_time_set(long paramLong1, MemberInfo paramMemberInfo, long paramLong2);
  
  public static final native long MemberResult_status_get(long paramLong, MemberResult paramMemberResult);
  
  public static final native void MemberResult_status_set(long paramLong1, MemberResult paramMemberResult, long paramLong2);
  
  public static final native String MemberResult_user_get(long paramLong, MemberResult paramMemberResult);
  
  public static final native void MemberResult_user_set(long paramLong, MemberResult paramMemberResult, String paramString);
  
  public static final native long ModifyGroupBaseInfoOption_add_option_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_add_option_set(long paramLong1, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, long paramLong2);
  
  public static final native long ModifyGroupBaseInfoOption_custom_info_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_custom_info_set(long paramLong1, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, long paramLong2, BytesMap paramBytesMap);
  
  public static final native byte[] ModifyGroupBaseInfoOption_face_url_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_face_url_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, byte[] paramArrayOfByte);
  
  public static final native long ModifyGroupBaseInfoOption_flag_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_flag_set(long paramLong1, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, long paramLong2);
  
  public static final native String ModifyGroupBaseInfoOption_group_id_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_group_id_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, String paramString);
  
  public static final native byte[] ModifyGroupBaseInfoOption_group_name_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_group_name_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, byte[] paramArrayOfByte);
  
  public static final native byte[] ModifyGroupBaseInfoOption_introduction_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_introduction_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, byte[] paramArrayOfByte);
  
  public static final native long ModifyGroupBaseInfoOption_max_member_num_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_max_member_num_set(long paramLong1, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, long paramLong2);
  
  public static final native byte[] ModifyGroupBaseInfoOption_notification_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_notification_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, byte[] paramArrayOfByte);
  
  public static final native int ModifyGroupBaseInfoOption_searchable_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_searchable_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, int paramInt);
  
  public static final native int ModifyGroupBaseInfoOption_visible_get(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption);
  
  public static final native void ModifyGroupBaseInfoOption_visible_set(long paramLong, ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, int paramInt);
  
  public static final native long ModifyGroupMemberInfoOption_custom_info_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_custom_info_set(long paramLong1, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long ModifyGroupMemberInfoOption_flag_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_flag_set(long paramLong1, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, long paramLong2);
  
  public static final native String ModifyGroupMemberInfoOption_group_id_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_group_id_set(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, String paramString);
  
  public static final native String ModifyGroupMemberInfoOption_member_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_member_set(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, String paramString);
  
  public static final native long ModifyGroupMemberInfoOption_msg_flag_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_msg_flag_set(long paramLong1, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, long paramLong2);
  
  public static final native byte[] ModifyGroupMemberInfoOption_name_card_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_name_card_set(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, byte[] paramArrayOfByte);
  
  public static final native long ModifyGroupMemberInfoOption_role_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_role_set(long paramLong1, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, long paramLong2);
  
  public static final native long ModifyGroupMemberInfoOption_shutup_time_get(long paramLong, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption);
  
  public static final native void ModifyGroupMemberInfoOption_shutup_time_set(long paramLong1, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, long paramLong2);
  
  public static final native long MsgVec_capacity(long paramLong, MsgVec paramMsgVec);
  
  public static final native void MsgVec_clear(long paramLong, MsgVec paramMsgVec);
  
  public static final native boolean MsgVec_empty(long paramLong, MsgVec paramMsgVec);
  
  public static final native long MsgVec_get(long paramLong, MsgVec paramMsgVec, int paramInt);
  
  public static final native void MsgVec_pushBack(long paramLong1, MsgVec paramMsgVec, long paramLong2, Msg paramMsg);
  
  public static final native void MsgVec_reserve(long paramLong1, MsgVec paramMsgVec, long paramLong2);
  
  public static final native void MsgVec_set(long paramLong1, MsgVec paramMsgVec, int paramInt, long paramLong2, Msg paramMsg);
  
  public static final native long MsgVec_size(long paramLong, MsgVec paramMsgVec);
  
  public static final native void Msg_addElem(long paramLong1, Msg paramMsg, long paramLong2, Elem paramElem);
  
  public static final native long Msg_cloneShared(long paramLong, Msg paramMsg);
  
  public static final native int Msg_customInt(long paramLong, Msg paramMsg);
  
  public static final native String Msg_customStr(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_deleteFromStorage(long paramLong, Msg paramMsg);
  
  public static final native long Msg_elemSize(long paramLong, Msg paramMsg);
  
  public static final native int Msg_elemType(long paramLong1, Msg paramMsg, long paramLong2);
  
  public static final native long Msg_flag(long paramLong, Msg paramMsg);
  
  public static final native long Msg_getElem(long paramLong1, Msg paramMsg, long paramLong2);
  
  public static final native byte[] Msg_getGroupName(long paramLong, Msg paramMsg);
  
  public static final native String Msg_getSender(long paramLong, Msg paramMsg);
  
  public static final native long Msg_getSenderGroupMemberProfile(long paramLong, Msg paramMsg);
  
  public static final native long Msg_getSenderProfile(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_hasGap(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_isRead(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_isSelf(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_isValid(long paramLong, Msg paramMsg);
  
  public static final native byte[] Msg_msgid(long paramLong, Msg paramMsg);
  
  public static final native long Msg_newMsg__SWIG_0();
  
  public static final native long Msg_newMsg__SWIG_1(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_parse(long paramLong, Msg paramMsg, byte[] paramArrayOfByte);
  
  public static final native long Msg_rand(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_remove(long paramLong, Msg paramMsg);
  
  public static final native long Msg_seq(long paramLong, Msg paramMsg);
  
  public static final native byte[] Msg_serialize(long paramLong, Msg paramMsg);
  
  public static final native long Msg_session(long paramLong, Msg paramMsg);
  
  public static final native boolean Msg_setCustomInt(long paramLong, Msg paramMsg, int paramInt);
  
  public static final native boolean Msg_setCustomStr(long paramLong, Msg paramMsg, String paramString);
  
  public static final native int Msg_status(long paramLong, Msg paramMsg);
  
  public static final native long Msg_time(long paramLong, Msg paramMsg);
  
  public static final native long Msg_uniqueid(long paramLong, Msg paramMsg);
  
  public static final native long NewGroupInfo_add_option_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_add_option_set(long paramLong1, NewGroupInfo paramNewGroupInfo, long paramLong2);
  
  public static final native long NewGroupInfo_base_custom_info_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_base_custom_info_set(long paramLong1, NewGroupInfo paramNewGroupInfo, long paramLong2, BytesMap paramBytesMap);
  
  public static final native String NewGroupInfo_face_url_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_face_url_set(long paramLong, NewGroupInfo paramNewGroupInfo, String paramString);
  
  public static final native byte[] NewGroupInfo_group_id_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_group_id_set(long paramLong, NewGroupInfo paramNewGroupInfo, byte[] paramArrayOfByte);
  
  public static final native long NewGroupInfo_group_members_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_group_members_set(long paramLong1, NewGroupInfo paramNewGroupInfo, long paramLong2, NewGroupMemVec paramNewGroupMemVec);
  
  public static final native byte[] NewGroupInfo_group_name_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_group_name_set(long paramLong, NewGroupInfo paramNewGroupInfo, byte[] paramArrayOfByte);
  
  public static final native String NewGroupInfo_group_type_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_group_type_set(long paramLong, NewGroupInfo paramNewGroupInfo, String paramString);
  
  public static final native byte[] NewGroupInfo_introduction_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_introduction_set(long paramLong, NewGroupInfo paramNewGroupInfo, byte[] paramArrayOfByte);
  
  public static final native long NewGroupInfo_max_member_num_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_max_member_num_set(long paramLong1, NewGroupInfo paramNewGroupInfo, long paramLong2);
  
  public static final native byte[] NewGroupInfo_notification_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_notification_set(long paramLong, NewGroupInfo paramNewGroupInfo, byte[] paramArrayOfByte);
  
  public static final native long NewGroupInfo_owner_tiny_id_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_owner_tiny_id_set(long paramLong1, NewGroupInfo paramNewGroupInfo, long paramLong2);
  
  public static final native boolean NewGroupInfo_set_add_option_get(long paramLong, NewGroupInfo paramNewGroupInfo);
  
  public static final native void NewGroupInfo_set_add_option_set(long paramLong, NewGroupInfo paramNewGroupInfo, boolean paramBoolean);
  
  public static final native long NewGroupMemVec_capacity(long paramLong, NewGroupMemVec paramNewGroupMemVec);
  
  public static final native void NewGroupMemVec_clear(long paramLong, NewGroupMemVec paramNewGroupMemVec);
  
  public static final native boolean NewGroupMemVec_empty(long paramLong, NewGroupMemVec paramNewGroupMemVec);
  
  public static final native long NewGroupMemVec_get(long paramLong, NewGroupMemVec paramNewGroupMemVec, int paramInt);
  
  public static final native void NewGroupMemVec_pushBack(long paramLong1, NewGroupMemVec paramNewGroupMemVec, long paramLong2, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native void NewGroupMemVec_reserve(long paramLong1, NewGroupMemVec paramNewGroupMemVec, long paramLong2);
  
  public static final native void NewGroupMemVec_set(long paramLong1, NewGroupMemVec paramNewGroupMemVec, int paramInt, long paramLong2, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native long NewGroupMemVec_size(long paramLong, NewGroupMemVec paramNewGroupMemVec);
  
  public static final native long NewGroupMemberInfo_custom_info_get(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native void NewGroupMemberInfo_custom_info_set(long paramLong1, NewGroupMemberInfo paramNewGroupMemberInfo, long paramLong2, BytesMap paramBytesMap);
  
  public static final native String NewGroupMemberInfo_identifier_get(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native void NewGroupMemberInfo_identifier_set(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo, String paramString);
  
  public static final native int NewGroupMemberInfo_member_role_get(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native void NewGroupMemberInfo_member_role_set(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo, int paramInt);
  
  public static final native int NewGroupMemberInfo_msg_flag_get(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native void NewGroupMemberInfo_msg_flag_set(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo, int paramInt);
  
  public static final native byte[] NewGroupMemberInfo_name_card_get(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo);
  
  public static final native void NewGroupMemberInfo_name_card_set(long paramLong, NewGroupMemberInfo paramNewGroupMemberInfo, byte[] paramArrayOfByte);
  
  public static final native int PendencyTypeBoth_get();
  
  public static final native int PendencyTypeComeIn_get();
  
  public static final native int PendencyTypeSendOut_get();
  
  public static final native String ProfileChangeElem_from_get(long paramLong, ProfileChangeElem paramProfileChangeElem);
  
  public static final native void ProfileChangeElem_from_set(long paramLong, ProfileChangeElem paramProfileChangeElem, String paramString);
  
  public static final native byte[] ProfileChangeElem_nick_get(long paramLong, ProfileChangeElem paramProfileChangeElem);
  
  public static final native void ProfileChangeElem_nick_set(long paramLong, ProfileChangeElem paramProfileChangeElem, byte[] paramArrayOfByte);
  
  public static final native long ProfileChangeElem_type_get(long paramLong, ProfileChangeElem paramProfileChangeElem);
  
  public static final native void ProfileChangeElem_type_set(long paramLong1, ProfileChangeElem paramProfileChangeElem, long paramLong2);
  
  public static final native void RunClosure_release(long paramLong, RunClosure paramRunClosure);
  
  public static final native void RunClosure_run(long paramLong, RunClosure paramRunClosure);
  
  public static final native long SNSProfileItemVec_capacity(long paramLong, SNSProfileItemVec paramSNSProfileItemVec);
  
  public static final native void SNSProfileItemVec_clear(long paramLong, SNSProfileItemVec paramSNSProfileItemVec);
  
  public static final native boolean SNSProfileItemVec_empty(long paramLong, SNSProfileItemVec paramSNSProfileItemVec);
  
  public static final native long SNSProfileItemVec_get(long paramLong, SNSProfileItemVec paramSNSProfileItemVec, int paramInt);
  
  public static final native void SNSProfileItemVec_pushBack(long paramLong1, SNSProfileItemVec paramSNSProfileItemVec, long paramLong2, SNSProfileItem paramSNSProfileItem);
  
  public static final native void SNSProfileItemVec_reserve(long paramLong1, SNSProfileItemVec paramSNSProfileItemVec, long paramLong2);
  
  public static final native void SNSProfileItemVec_set(long paramLong1, SNSProfileItemVec paramSNSProfileItemVec, int paramInt, long paramLong2, SNSProfileItem paramSNSProfileItem);
  
  public static final native long SNSProfileItemVec_size(long paramLong, SNSProfileItemVec paramSNSProfileItemVec);
  
  public static final native long SNSProfileItem_mpCustom_get(long paramLong, SNSProfileItem paramSNSProfileItem);
  
  public static final native void SNSProfileItem_mpCustom_set(long paramLong1, SNSProfileItem paramSNSProfileItem, long paramLong2, BytesMap paramBytesMap);
  
  public static final native long SNSProfileItem_mpProfiles_get(long paramLong, SNSProfileItem paramSNSProfileItem);
  
  public static final native void SNSProfileItem_mpProfiles_set(long paramLong1, SNSProfileItem paramSNSProfileItem, long paramLong2, BytesMap paramBytesMap);
  
  public static final native String SNSProfileItem_sIdentifier_get(long paramLong, SNSProfileItem paramSNSProfileItem);
  
  public static final native void SNSProfileItem_sIdentifier_set(long paramLong, SNSProfileItem paramSNSProfileItem, String paramString);
  
  public static final native long Session_activeTime(long paramLong, Session paramSession);
  
  public static final native int Session_deleteLocalMsg__SWIG_0(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, long paramLong3, IDeleteLocalMsg paramIDeleteLocalMsg);
  
  public static final native int Session_deleteLocalMsg__SWIG_1(long paramLong1, Session paramSession, long paramLong2, IDeleteLocalMsg paramIDeleteLocalMsg);
  
  public static final native void Session_getLocalMsgs(long paramLong1, Session paramSession, long paramLong2, long paramLong3, Msg paramMsg, long paramLong4, IGetMsgs paramIGetMsgs);
  
  public static final native void Session_getMsgs(long paramLong1, Session paramSession, long paramLong2, long paramLong3, Msg paramMsg, long paramLong4, IGetMsgs paramIGetMsgs);
  
  public static final native void Session_getMsgsForward(long paramLong1, Session paramSession, long paramLong2, long paramLong3, Msg paramMsg, long paramLong4, IGetMsgs paramIGetMsgs);
  
  public static final native long Session_getMsgsFromCache__SWIG_0(long paramLong1, Session paramSession, long paramLong2, long paramLong3, Msg paramMsg);
  
  public static final native long Session_getMsgsFromCache__SWIG_1(long paramLong1, Session paramSession, long paramLong2);
  
  public static final native String Session_iconUrl(long paramLong, Session paramSession);
  
  public static final native String Session_identifier(long paramLong, Session paramSession);
  
  public static final native boolean Session_isValid(long paramLong, Session paramSession);
  
  public static final native long Session_msgUnread(long paramLong, Session paramSession);
  
  public static final native String Session_name(long paramLong, Session paramSession);
  
  public static final native void Session_reportReaded__SWIG_0(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, long paramLong3, ISetReadMsg paramISetReadMsg);
  
  public static final native void Session_reportReaded__SWIG_1(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg);
  
  public static final native void Session_reportReaded__SWIG_2(long paramLong, Session paramSession);
  
  public static final native int Session_saveMsg(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, String paramString, boolean paramBoolean);
  
  public static final native void Session_sendCustomMsg(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, long paramLong3, ISendMsg paramISendMsg, long paramLong4);
  
  public static final native void Session_sendLikeMsg(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, long paramLong3, ISendMsg paramISendMsg);
  
  public static final native void Session_sendMsg(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, long paramLong3, ISendMsg paramISendMsg);
  
  public static final native void Session_sendRedPacketMsg(long paramLong1, Session paramSession, long paramLong2, Msg paramMsg, long paramLong3, ISendMsg paramISendMsg);
  
  public static final native String Session_sid(long paramLong, Session paramSession);
  
  public static final native int Session_type(long paramLong, Session paramSession);
  
  public static final native String SetProfileOption_add_option_get(long paramLong, SetProfileOption paramSetProfileOption);
  
  public static final native void SetProfileOption_add_option_set(long paramLong, SetProfileOption paramSetProfileOption, String paramString);
  
  public static final native long SetProfileOption_custom_info_get(long paramLong, SetProfileOption paramSetProfileOption);
  
  public static final native void SetProfileOption_custom_info_set(long paramLong1, SetProfileOption paramSetProfileOption, long paramLong2, BytesMap paramBytesMap);
  
  public static final native byte[] SetProfileOption_face_url_get(long paramLong, SetProfileOption paramSetProfileOption);
  
  public static final native void SetProfileOption_face_url_set(long paramLong, SetProfileOption paramSetProfileOption, byte[] paramArrayOfByte);
  
  public static final native long SetProfileOption_flag_get(long paramLong, SetProfileOption paramSetProfileOption);
  
  public static final native void SetProfileOption_flag_set(long paramLong1, SetProfileOption paramSetProfileOption, long paramLong2);
  
  public static final native byte[] SetProfileOption_nick_get(long paramLong, SetProfileOption paramSetProfileOption);
  
  public static final native void SetProfileOption_nick_set(long paramLong, SetProfileOption paramSetProfileOption, byte[] paramArrayOfByte);
  
  public static final native byte[] SetProfileOption_self_signature_get(long paramLong, SetProfileOption paramSetProfileOption);
  
  public static final native void SetProfileOption_self_signature_set(long paramLong, SetProfileOption paramSetProfileOption, byte[] paramArrayOfByte);
  
  public static final native byte[] SoundElem_file_path_get(long paramLong, SoundElem paramSoundElem);
  
  public static final native void SoundElem_file_path_set(long paramLong, SoundElem paramSoundElem, byte[] paramArrayOfByte);
  
  public static final native int SoundElem_file_size_get(long paramLong, SoundElem paramSoundElem);
  
  public static final native void SoundElem_file_size_set(long paramLong, SoundElem paramSoundElem, int paramInt);
  
  public static final native int SoundElem_file_time_get(long paramLong, SoundElem paramSoundElem);
  
  public static final native void SoundElem_file_time_set(long paramLong, SoundElem paramSoundElem, int paramInt);
  
  public static final native String SoundElem_fileid_get(long paramLong, SoundElem paramSoundElem);
  
  public static final native void SoundElem_fileid_set(long paramLong, SoundElem paramSoundElem, String paramString);
  
  public static final native int SoundElem_taskid_get(long paramLong, SoundElem paramSoundElem);
  
  public static final native void SoundElem_taskid_set(long paramLong, SoundElem paramSoundElem, int paramInt);
  
  public static final native long SsoAddrVec_capacity(long paramLong, SsoAddrVec paramSsoAddrVec);
  
  public static final native void SsoAddrVec_clear(long paramLong, SsoAddrVec paramSsoAddrVec);
  
  public static final native boolean SsoAddrVec_empty(long paramLong, SsoAddrVec paramSsoAddrVec);
  
  public static final native long SsoAddrVec_get(long paramLong, SsoAddrVec paramSsoAddrVec, int paramInt);
  
  public static final native void SsoAddrVec_pushBack(long paramLong1, SsoAddrVec paramSsoAddrVec, long paramLong2, SsoAddr paramSsoAddr);
  
  public static final native void SsoAddrVec_reserve(long paramLong1, SsoAddrVec paramSsoAddrVec, long paramLong2);
  
  public static final native void SsoAddrVec_set(long paramLong1, SsoAddrVec paramSsoAddrVec, int paramInt, long paramLong2, SsoAddr paramSsoAddr);
  
  public static final native long SsoAddrVec_size(long paramLong, SsoAddrVec paramSsoAddrVec);
  
  public static final native String SsoAddr_ip_get(long paramLong, SsoAddr paramSsoAddr);
  
  public static final native void SsoAddr_ip_set(long paramLong, SsoAddr paramSsoAddr, String paramString);
  
  public static final native long SsoAddr_port_get(long paramLong, SsoAddr paramSsoAddr);
  
  public static final native void SsoAddr_port_set(long paramLong1, SsoAddr paramSsoAddr, long paramLong2);
  
  public static final native boolean StatusManager_getUserStatus(long paramLong1, StatusManager paramStatusManager, long paramLong2, StrVec paramStrVec, long paramLong3, IStatusCallback paramIStatusCallback);
  
  public static final native void StatusManager_setUsedefinedData(long paramLong1, StatusManager paramStatusManager, String paramString, long paramLong2, IStatusSetUserDefCallback paramIStatusSetUserDefCallback);
  
  public static final native long StrVec_capacity(long paramLong, StrVec paramStrVec);
  
  public static final native void StrVec_clear(long paramLong, StrVec paramStrVec);
  
  public static final native boolean StrVec_empty(long paramLong, StrVec paramStrVec);
  
  public static final native String StrVec_get(long paramLong, StrVec paramStrVec, int paramInt);
  
  public static final native void StrVec_pushBack(long paramLong, StrVec paramStrVec, String paramString);
  
  public static final native void StrVec_reserve(long paramLong1, StrVec paramStrVec, long paramLong2);
  
  public static final native void StrVec_set(long paramLong, StrVec paramStrVec, int paramInt, String paramString);
  
  public static final native long StrVec_size(long paramLong, StrVec paramStrVec);
  
  public static void SwigDirector_IApplyDownloadFileCallback_done(IApplyDownloadFileCallback paramIApplyDownloadFileCallback, long paramLong)
  {
    paramIApplyDownloadFileCallback.done(new StrVec(paramLong, false));
  }
  
  public static void SwigDirector_IApplyDownloadFileCallback_fail(IApplyDownloadFileCallback paramIApplyDownloadFileCallback, int paramInt, String paramString)
  {
    paramIApplyDownloadFileCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IAvInviteCallBack_onAvInviteBuf(IAvInviteCallBack paramIAvInviteCallBack, byte[] paramArrayOfByte)
  {
    paramIAvInviteCallBack.onAvInviteBuf(paramArrayOfByte);
  }
  
  public static void SwigDirector_IBatchOprCallback_done(IBatchOprCallback paramIBatchOprCallback)
  {
    paramIBatchOprCallback.done();
  }
  
  public static void SwigDirector_IBatchOprCallback_fail(IBatchOprCallback paramIBatchOprCallback, int paramInt, String paramString, long paramLong)
  {
    if (paramLong == 0L) {}
    for (IBatchOprCallback.BatchOprDetailInfo localBatchOprDetailInfo = null;; localBatchOprDetailInfo = new IBatchOprCallback.BatchOprDetailInfo(paramLong, false))
    {
      paramIBatchOprCallback.fail(paramInt, paramString, localBatchOprDetailInfo);
      return;
    }
  }
  
  public static void SwigDirector_IBatchOprCallback_setLogin(IBatchOprCallback paramIBatchOprCallback, String paramString, boolean paramBoolean)
  {
    paramIBatchOprCallback.setLogin(paramString, paramBoolean);
  }
  
  public static void SwigDirector_ICreateGroupCallback_done(ICreateGroupCallback paramICreateGroupCallback, String paramString)
  {
    paramICreateGroupCallback.done(paramString);
  }
  
  public static void SwigDirector_ICreateGroupCallback_fail(ICreateGroupCallback paramICreateGroupCallback, int paramInt, String paramString)
  {
    paramICreateGroupCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IDeleteLocalMsg_done(IDeleteLocalMsg paramIDeleteLocalMsg)
  {
    paramIDeleteLocalMsg.done();
  }
  
  public static void SwigDirector_IDeleteLocalMsg_fail(IDeleteLocalMsg paramIDeleteLocalMsg, int paramInt, String paramString)
  {
    paramIDeleteLocalMsg.fail(paramInt, paramString);
  }
  
  public static boolean SwigDirector_IEnv_createThread(IEnv paramIEnv, long paramLong)
  {
    if (paramLong == 0L) {}
    for (ThreadEntry localThreadEntry = null;; localThreadEntry = new ThreadEntry(paramLong, true)) {
      return paramIEnv.createThread(localThreadEntry);
    }
  }
  
  public static boolean SwigDirector_IEnv_httpRequest(IEnv paramIEnv, String paramString1, int paramInt, String paramString2, byte[] paramArrayOfByte, long paramLong)
  {
    HttpMethod localHttpMethod = HttpMethod.swigToEnum(paramInt);
    if (paramLong == 0L) {}
    for (EnvRequestClosure localEnvRequestClosure = null;; localEnvRequestClosure = new EnvRequestClosure(paramLong, false)) {
      return paramIEnv.httpRequest(paramString1, localHttpMethod, paramString2, paramArrayOfByte, localEnvRequestClosure);
    }
  }
  
  public static boolean SwigDirector_IEnv_runOnMainThread(IEnv paramIEnv, long paramLong)
  {
    if (paramLong == 0L) {}
    for (RunClosure localRunClosure = null;; localRunClosure = new RunClosure(paramLong, true)) {
      return paramIEnv.runOnMainThread(localRunClosure);
    }
  }
  
  public static boolean SwigDirector_IEnv_sSORequest__SWIG_0(IEnv paramIEnv, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L) {}
    for (EnvRequestClosure localEnvRequestClosure = null;; localEnvRequestClosure = new EnvRequestClosure(paramLong1, false)) {
      return paramIEnv.sSORequest(paramString1, paramString2, paramArrayOfByte, localEnvRequestClosure, paramLong2);
    }
  }
  
  public static boolean SwigDirector_IEnv_sSORequest__SWIG_1(IEnv paramIEnv, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong)
  {
    if (paramLong == 0L) {}
    for (EnvRequestClosure localEnvRequestClosure = null;; localEnvRequestClosure = new EnvRequestClosure(paramLong, false)) {
      return paramIEnv.sSORequest(paramString1, paramString2, paramArrayOfByte, localEnvRequestClosure);
    }
  }
  
  public static void SwigDirector_IEnv_setLogin(IEnv paramIEnv, String paramString, boolean paramBoolean)
  {
    paramIEnv.setLogin(paramString, paramBoolean);
  }
  
  public static boolean SwigDirector_IEnv_uploadLogFile(IEnv paramIEnv, String paramString1, String paramString2, String paramString3)
  {
    return paramIEnv.uploadLogFile(paramString1, paramString2, paramString3);
  }
  
  public static void SwigDirector_IFileTrans_done(IFileTrans paramIFileTrans, long paramLong)
  {
    paramIFileTrans.done(new FileTransSuccParam(paramLong, false));
  }
  
  public static void SwigDirector_IFileTrans_fail(IFileTrans paramIFileTrans, int paramInt, String paramString)
  {
    paramIFileTrans.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendGroupCallback_done(IFriendGroupCallback paramIFriendGroupCallback, long paramLong)
  {
    paramIFriendGroupCallback.done(new FriendGroupVec(paramLong, false));
  }
  
  public static void SwigDirector_IFriendGroupCallback_fail(IFriendGroupCallback paramIFriendGroupCallback, int paramInt, String paramString)
  {
    paramIFriendGroupCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipActionCallbackV2_done(IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, long paramLong1, long paramLong2)
  {
    paramIFriendshipActionCallbackV2.done(paramLong1, new FriendProfileVec(paramLong2, false));
  }
  
  public static void SwigDirector_IFriendshipActionCallbackV2_fail(IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2, int paramInt, String paramString)
  {
    paramIFriendshipActionCallbackV2.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipActionCallback_done(IFriendshipActionCallback paramIFriendshipActionCallback, long paramLong)
  {
    paramIFriendshipActionCallback.done(new FriendProfileVec(paramLong, false));
  }
  
  public static void SwigDirector_IFriendshipActionCallback_fail(IFriendshipActionCallback paramIFriendshipActionCallback, int paramInt, String paramString)
  {
    paramIFriendshipActionCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipCallback_done(IFriendshipCallback paramIFriendshipCallback)
  {
    paramIFriendshipCallback.done();
  }
  
  public static void SwigDirector_IFriendshipCallback_fail(IFriendshipCallback paramIFriendshipCallback, int paramInt, String paramString)
  {
    paramIFriendshipCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipGetFriendV2Callback_done(IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, long paramLong1, long paramLong2)
  {
    paramIFriendshipGetFriendV2Callback.done(new FriendMetaInfo(paramLong1, false), new FriendProfileVec(paramLong2, false));
  }
  
  public static void SwigDirector_IFriendshipGetFriendV2Callback_fail(IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback, int paramInt, String paramString)
  {
    paramIFriendshipGetFriendV2Callback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipGetFutureCallback_done(IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, long paramLong1, long paramLong2)
  {
    paramIFriendshipGetFutureCallback.done(new FutureFriendMeta(paramLong1, false), new FriendFutureItemVec(paramLong2, false));
  }
  
  public static void SwigDirector_IFriendshipGetFutureCallback_fail(IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback, int paramInt, String paramString)
  {
    paramIFriendshipGetFutureCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipPendencyCallback_done(IFriendshipPendencyCallback paramIFriendshipPendencyCallback, long paramLong1, long paramLong2)
  {
    paramIFriendshipPendencyCallback.done(new FriendPendencyMeta(paramLong1, false), new FriendPendencyItemVec(paramLong2, false));
  }
  
  public static void SwigDirector_IFriendshipPendencyCallback_fail(IFriendshipPendencyCallback paramIFriendshipPendencyCallback, int paramInt, String paramString)
  {
    paramIFriendshipPendencyCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IFriendshipProxyListener_onAddFriendNotify(IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong)
  {
    paramIFriendshipProxyListener.onAddFriendNotify(new FriendProfileVec(paramLong, false));
  }
  
  public static void SwigDirector_IFriendshipProxyListener_onAddFriendReq(IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong)
  {
    paramIFriendshipProxyListener.onAddFriendReq(new AddFriendReqVec(paramLong, false));
  }
  
  public static void SwigDirector_IFriendshipProxyListener_onDeleteFriendNotify(IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong)
  {
    paramIFriendshipProxyListener.onDeleteFriendNotify(new StrVec(paramLong, false));
  }
  
  public static void SwigDirector_IFriendshipProxyListener_onFriendProfileUpdate(IFriendshipProxyListener paramIFriendshipProxyListener, long paramLong)
  {
    paramIFriendshipProxyListener.onFriendProfileUpdate(new FriendProfileVec(paramLong, false));
  }
  
  public static void SwigDirector_IFriendshipProxyListener_onProxyStatusChange(IFriendshipProxyListener paramIFriendshipProxyListener, int paramInt)
  {
    paramIFriendshipProxyListener.onProxyStatusChange(FriendProxyStatus.swigToEnum(paramInt));
  }
  
  public static void SwigDirector_IGetMsgs_done(IGetMsgs paramIGetMsgs, long paramLong)
  {
    paramIGetMsgs.done(new MsgVec(paramLong, false));
  }
  
  public static void SwigDirector_IGetMsgs_fail(IGetMsgs paramIGetMsgs, int paramInt, String paramString)
  {
    paramIGetMsgs.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupAssistantCallback_onGroupAdd(IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong)
  {
    paramIGroupAssistantCallback.onGroupAdd(new GroupCacheInfo(paramLong, false));
  }
  
  public static void SwigDirector_IGroupAssistantCallback_onGroupDelete(IGroupAssistantCallback paramIGroupAssistantCallback, String paramString)
  {
    paramIGroupAssistantCallback.onGroupDelete(paramString);
  }
  
  public static void SwigDirector_IGroupAssistantCallback_onGroupUpdate(IGroupAssistantCallback paramIGroupAssistantCallback, long paramLong)
  {
    paramIGroupAssistantCallback.onGroupUpdate(new GroupCacheInfo(paramLong, false));
  }
  
  public static void SwigDirector_IGroupAssistantCallback_onMemberJoin(IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong)
  {
    paramIGroupAssistantCallback.onMemberJoin(paramString, new GroupMemberInfoVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupAssistantCallback_onMemberQuit(IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong)
  {
    paramIGroupAssistantCallback.onMemberQuit(paramString, new StrVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupAssistantCallback_onMemberUpdate(IGroupAssistantCallback paramIGroupAssistantCallback, String paramString, long paramLong)
  {
    paramIGroupAssistantCallback.onMemberUpdate(paramString, new GroupMemberInfoVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupGetPendencyCallback_done(IGroupGetPendencyCallback paramIGroupGetPendencyCallback, long paramLong1, long paramLong2)
  {
    paramIGroupGetPendencyCallback.done(new GroupPendencyMeta(paramLong1, false), new GroupPendencyItemVec(paramLong2, false));
  }
  
  public static void SwigDirector_IGroupGetPendencyCallback_fail(IGroupGetPendencyCallback paramIGroupGetPendencyCallback, int paramInt, String paramString)
  {
    paramIGroupGetPendencyCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupInfoListCallbackV2_done(IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, long paramLong1, long paramLong2)
  {
    paramIGroupInfoListCallbackV2.done(paramLong1, new GroupDetailInfoVec(paramLong2, false));
  }
  
  public static void SwigDirector_IGroupInfoListCallbackV2_fail(IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2, int paramInt, String paramString)
  {
    paramIGroupInfoListCallbackV2.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupInfoListCallback_done(IGroupInfoListCallback paramIGroupInfoListCallback, long paramLong)
  {
    paramIGroupInfoListCallback.done(new GroupDetailInfoVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupInfoListCallback_fail(IGroupInfoListCallback paramIGroupInfoListCallback, int paramInt, String paramString)
  {
    paramIGroupInfoListCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupListCallback_done(IGroupListCallback paramIGroupListCallback, long paramLong)
  {
    paramIGroupListCallback.done(new GroupBaseInfoVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupListCallback_fail(IGroupListCallback paramIGroupListCallback, int paramInt, String paramString)
  {
    paramIGroupListCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupMemberCallbackV2_done(IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, long paramLong1, long paramLong2)
  {
    paramIGroupMemberCallbackV2.done(paramLong1, new GroupMemberInfoVec(paramLong2, false));
  }
  
  public static void SwigDirector_IGroupMemberCallbackV2_fail(IGroupMemberCallbackV2 paramIGroupMemberCallbackV2, int paramInt, String paramString)
  {
    paramIGroupMemberCallbackV2.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupMemberCallback_done(IGroupMemberCallback paramIGroupMemberCallback, long paramLong)
  {
    paramIGroupMemberCallback.done(new GroupMemberInfoVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupMemberCallback_fail(IGroupMemberCallback paramIGroupMemberCallback, int paramInt, String paramString)
  {
    paramIGroupMemberCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupMemberResultCallback_done(IGroupMemberResultCallback paramIGroupMemberResultCallback, long paramLong)
  {
    paramIGroupMemberResultCallback.done(new GroupMemberResultVec(paramLong, false));
  }
  
  public static void SwigDirector_IGroupMemberResultCallback_fail(IGroupMemberResultCallback paramIGroupMemberResultCallback, int paramInt, String paramString)
  {
    paramIGroupMemberResultCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupNotifyCallback_done(IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    paramIGroupNotifyCallback.done();
  }
  
  public static void SwigDirector_IGroupNotifyCallback_fail(IGroupNotifyCallback paramIGroupNotifyCallback, int paramInt, String paramString)
  {
    paramIGroupNotifyCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IGroupTipsEventCallback_onGroupTipsEvent(IGroupTipsEventCallback paramIGroupTipsEventCallback, long paramLong)
  {
    paramIGroupTipsEventCallback.onGroupTipsEvent(new GroupTipsElem(paramLong, false));
  }
  
  public static void SwigDirector_IGroupUpdateCallback_onMembersUpdate(IGroupUpdateCallback paramIGroupUpdateCallback, long paramLong)
  {
    paramIGroupUpdateCallback.onMembersUpdate(new GroupTipsElem(paramLong, false));
  }
  
  public static void SwigDirector_IImageUploadCallback_done(IImageUploadCallback paramIImageUploadCallback, long paramLong)
  {
    paramIImageUploadCallback.done(new ImageElem(paramLong, false));
  }
  
  public static void SwigDirector_IImageUploadCallback_fail(IImageUploadCallback paramIImageUploadCallback, int paramInt, String paramString)
  {
    paramIImageUploadCallback.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_IInit_done(IInit paramIInit)
  {
    paramIInit.done();
  }
  
  public static void SwigDirector_IInit_fail(IInit paramIInit, int paramInt, String paramString)
  {
    paramIInit.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_ILogMsgCallback_onLogMsg(ILogMsgCallback paramILogMsgCallback, String paramString1, int paramInt, String paramString2)
  {
    paramILogMsgCallback.onLogMsg(paramString1, LogLevel.swigToEnum(paramInt), paramString2);
  }
  
  public static void SwigDirector_INotify_onMsgEvent(INotify paramINotify, long paramLong)
  {
    paramINotify.onMsgEvent(new MsgVec(paramLong, false));
  }
  
  public static void SwigDirector_INotify_onMsgUpdate(INotify paramINotify, long paramLong)
  {
    paramINotify.onMsgUpdate(new MsgVec(paramLong, false));
  }
  
  public static void SwigDirector_INotify_onRefresh(INotify paramINotify)
  {
    paramINotify.onRefresh();
  }
  
  public static void SwigDirector_INotify_onUploadProgress(INotify paramINotify, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    paramINotify.onUploadProgress(new Msg(paramLong, false), paramInt1, paramInt2, paramInt3);
  }
  
  public static void SwigDirector_ISendMsg_done(ISendMsg paramISendMsg)
  {
    paramISendMsg.done();
  }
  
  public static void SwigDirector_ISendMsg_fail(ISendMsg paramISendMsg, int paramInt, String paramString)
  {
    paramISendMsg.fail(paramInt, paramString);
  }
  
  public static void SwigDirector_ISetReadMsg_done(ISetReadMsg paramISetReadMsg)
  {
    paramISetReadMsg.done();
  }
  
  public static void SwigDirector_ISetReadMsg_fail(ISetReadMsg paramISetReadMsg, int paramInt, String paramString)
  {
    paramISetReadMsg.fail(paramInt, paramString);
  }
  
  public static final native byte[] TextElem_content_get(long paramLong, TextElem paramTextElem);
  
  public static final native void TextElem_content_set(long paramLong, TextElem paramTextElem, byte[] paramArrayOfByte);
  
  public static final native void ThreadEntry_release(long paramLong, ThreadEntry paramThreadEntry);
  
  public static final native void ThreadEntry_run(long paramLong, ThreadEntry paramThreadEntry);
  
  public static final native long UpdateInfoOpt_customInfoTags_get(long paramLong, UpdateInfoOpt paramUpdateInfoOpt);
  
  public static final native void UpdateInfoOpt_customInfoTags_set(long paramLong1, UpdateInfoOpt paramUpdateInfoOpt, long paramLong2, BytesVec paramBytesVec);
  
  public static final native long UpdateInfoOpt_flag_get(long paramLong, UpdateInfoOpt paramUpdateInfoOpt);
  
  public static final native void UpdateInfoOpt_flag_set(long paramLong1, UpdateInfoOpt paramUpdateInfoOpt, long paramLong2);
  
  public static final native long UserStatus_ddwTinyId_get(long paramLong, UserStatus paramUserStatus);
  
  public static final native void UserStatus_ddwTinyId_set(long paramLong1, UserStatus paramUserStatus, long paramLong2);
  
  public static final native String UserStatus_sUserId_get(long paramLong, UserStatus paramUserStatus);
  
  public static final native void UserStatus_sUserId_set(long paramLong, UserStatus paramUserStatus, String paramString);
  
  public static final native long UserStatus_stInstStatus_get(long paramLong, UserStatus paramUserStatus);
  
  public static final native void UserStatus_stInstStatus_set(long paramLong1, UserStatus paramUserStatus, long paramLong2);
  
  public static final native byte[] VideoElem_imageId_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_imageId_set(long paramLong, VideoElem paramVideoElem, byte[] paramArrayOfByte);
  
  public static final native long VideoElem_image_height_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_image_height_set(long paramLong1, VideoElem paramVideoElem, long paramLong2);
  
  public static final native byte[] VideoElem_image_path_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_image_path_set(long paramLong, VideoElem paramVideoElem, byte[] paramArrayOfByte);
  
  public static final native long VideoElem_image_size_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_image_size_set(long paramLong1, VideoElem paramVideoElem, long paramLong2);
  
  public static final native byte[] VideoElem_image_type_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_image_type_set(long paramLong, VideoElem paramVideoElem, byte[] paramArrayOfByte);
  
  public static final native long VideoElem_image_width_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_image_width_set(long paramLong1, VideoElem paramVideoElem, long paramLong2);
  
  public static final native long VideoElem_taskid_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_taskid_set(long paramLong1, VideoElem paramVideoElem, long paramLong2);
  
  public static final native byte[] VideoElem_videoId_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_videoId_set(long paramLong, VideoElem paramVideoElem, byte[] paramArrayOfByte);
  
  public static final native long VideoElem_video_duration_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_video_duration_set(long paramLong1, VideoElem paramVideoElem, long paramLong2);
  
  public static final native byte[] VideoElem_video_path_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_video_path_set(long paramLong, VideoElem paramVideoElem, byte[] paramArrayOfByte);
  
  public static final native long VideoElem_video_size_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_video_size_set(long paramLong1, VideoElem paramVideoElem, long paramLong2);
  
  public static final native byte[] VideoElem_video_type_get(long paramLong, VideoElem paramVideoElem);
  
  public static final native void VideoElem_video_type_set(long paramLong, VideoElem paramVideoElem, byte[] paramArrayOfByte);
  
  public static final native boolean checkFriendCustomTag(String paramString);
  
  public static final native boolean checkProfileCustomTag(String paramString);
  
  public static final native void delete_AddFriendReq(long paramLong);
  
  public static final native void delete_AddFriendReqVec(long paramLong);
  
  public static final native void delete_BytesMap(long paramLong);
  
  public static final native void delete_BytesMemberInfoMap(long paramLong);
  
  public static final native void delete_BytesMemberInfoParser(long paramLong);
  
  public static final native void delete_BytesProfileMap(long paramLong);
  
  public static final native void delete_BytesProfileMapParser(long paramLong);
  
  public static final native void delete_BytesVec(long paramLong);
  
  public static final native void delete_BytesVecFetcher(long paramLong);
  
  public static final native void delete_Context(long paramLong);
  
  public static final native void delete_CustomElem(long paramLong);
  
  public static final native void delete_Elem(long paramLong);
  
  public static final native void delete_EnvRequestClosure(long paramLong);
  
  public static final native void delete_ErrCodeManager(long paramLong);
  
  public static final native void delete_ErrInfoVec(long paramLong);
  
  public static final native void delete_FaceElem(long paramLong);
  
  public static final native void delete_FileElem(long paramLong);
  
  public static final native void delete_FileTransSuccParam(long paramLong);
  
  public static final native void delete_FileTranser(long paramLong);
  
  public static final native void delete_FriendChangeElem(long paramLong);
  
  public static final native void delete_FriendChangeInfoVec(long paramLong);
  
  public static final native void delete_FriendChangeUserInfo(long paramLong);
  
  public static final native void delete_FriendFutureItem(long paramLong);
  
  public static final native void delete_FriendFutureItemVec(long paramLong);
  
  public static final native void delete_FriendGroup(long paramLong);
  
  public static final native void delete_FriendGroupItem(long paramLong);
  
  public static final native void delete_FriendGroupVec(long paramLong);
  
  public static final native void delete_FriendMetaInfo(long paramLong);
  
  public static final native void delete_FriendPendencyItem(long paramLong);
  
  public static final native void delete_FriendPendencyItemVec(long paramLong);
  
  public static final native void delete_FriendPendencyMeta(long paramLong);
  
  public static final native void delete_FriendProfile(long paramLong);
  
  public static final native void delete_FriendProfileUpdateItem(long paramLong);
  
  public static final native void delete_FriendProfileVec(long paramLong);
  
  public static final native void delete_FriendshipManager(long paramLong);
  
  public static final native void delete_FriendshipProxy(long paramLong);
  
  public static final native void delete_FriendshipProxyConfig(long paramLong);
  
  public static final native void delete_FutureFriendMeta(long paramLong);
  
  public static final native void delete_GetGroupBaseInfoOption(long paramLong);
  
  public static final native void delete_GetGroupMemInfoOption(long paramLong);
  
  public static final native void delete_GetGroupPendencyOption(long paramLong);
  
  public static final native void delete_GetProfileOption(long paramLong);
  
  public static final native void delete_GroupAssistant(long paramLong);
  
  public static final native void delete_GroupAssistantConfig(long paramLong);
  
  public static final native void delete_GroupBaseInfo(long paramLong);
  
  public static final native void delete_GroupBaseInfoVec(long paramLong);
  
  public static final native void delete_GroupCacheInfo(long paramLong);
  
  public static final native void delete_GroupCacheInfoVec(long paramLong);
  
  public static final native void delete_GroupDetailInfo(long paramLong);
  
  public static final native void delete_GroupDetailInfoVec(long paramLong);
  
  public static final native void delete_GroupManager(long paramLong);
  
  public static final native void delete_GroupMemberInfoVec(long paramLong);
  
  public static final native void delete_GroupMemberResultVec(long paramLong);
  
  public static final native void delete_GroupMsgSeqInfo(long paramLong);
  
  public static final native void delete_GroupPendencyItem(long paramLong);
  
  public static final native void delete_GroupPendencyItemVec(long paramLong);
  
  public static final native void delete_GroupPendencyMeta(long paramLong);
  
  public static final native void delete_GroupReportElem(long paramLong);
  
  public static final native void delete_GroupSelfInfo(long paramLong);
  
  public static final native void delete_GroupSettings(long paramLong);
  
  public static final native void delete_GroupTipsElem(long paramLong);
  
  public static final native void delete_GroupTipsElem_GroupInfo(long paramLong);
  
  public static final native void delete_GroupTipsElem_GroupInfoVec(long paramLong);
  
  public static final native void delete_GroupTipsElem_MemberInfo(long paramLong);
  
  public static final native void delete_GroupTipsElem_MemberInfoVec(long paramLong);
  
  public static final native void delete_IApplyDownloadFileCallback(long paramLong);
  
  public static final native void delete_IAvInviteCallBack(long paramLong);
  
  public static final native void delete_IBatchOprCallback(long paramLong);
  
  public static final native void delete_IBatchOprCallback_BatchOprDetailInfo(long paramLong);
  
  public static final native void delete_IBatchOprCallback_BatchOprDetailInfo_ErrInfo(long paramLong);
  
  public static final native void delete_ICreateGroupCallback(long paramLong);
  
  public static final native void delete_IDeleteLocalMsg(long paramLong);
  
  public static final native void delete_IEnv(long paramLong);
  
  public static final native void delete_IFileTrans(long paramLong);
  
  public static final native void delete_IFriendGroupCallback(long paramLong);
  
  public static final native void delete_IFriendshipActionCallback(long paramLong);
  
  public static final native void delete_IFriendshipActionCallbackV2(long paramLong);
  
  public static final native void delete_IFriendshipCallback(long paramLong);
  
  public static final native void delete_IFriendshipGetFriendV2Callback(long paramLong);
  
  public static final native void delete_IFriendshipGetFutureCallback(long paramLong);
  
  public static final native void delete_IFriendshipPendencyCallback(long paramLong);
  
  public static final native void delete_IFriendshipProxyActionCallback(long paramLong);
  
  public static final native void delete_IFriendshipProxyListener(long paramLong);
  
  public static final native void delete_IGetMsgs(long paramLong);
  
  public static final native void delete_IGroupAssistantCallback(long paramLong);
  
  public static final native void delete_IGroupGetPendencyCallback(long paramLong);
  
  public static final native void delete_IGroupInfoListCallback(long paramLong);
  
  public static final native void delete_IGroupInfoListCallbackV2(long paramLong);
  
  public static final native void delete_IGroupListCallback(long paramLong);
  
  public static final native void delete_IGroupMemberCallback(long paramLong);
  
  public static final native void delete_IGroupMemberCallbackV2(long paramLong);
  
  public static final native void delete_IGroupMemberResultCallback(long paramLong);
  
  public static final native void delete_IGroupNotifyCallback(long paramLong);
  
  public static final native void delete_IGroupTipsEventCallback(long paramLong);
  
  public static final native void delete_IGroupUpdateCallback(long paramLong);
  
  public static final native void delete_IImageUploadCallback(long paramLong);
  
  public static final native void delete_IInit(long paramLong);
  
  public static final native void delete_ILogMsgCallback(long paramLong);
  
  public static final native void delete_IMCoreUser(long paramLong);
  
  public static final native void delete_INotify(long paramLong);
  
  public static final native void delete_ISendMsg(long paramLong);
  
  public static final native void delete_ISetReadMsg(long paramLong);
  
  public static final native void delete_ISsoList(long paramLong);
  
  public static final native void delete_IStatusCallback(long paramLong);
  
  public static final native void delete_IStatusSetUserDefCallback(long paramLong);
  
  public static final native void delete_ImageElem(long paramLong);
  
  public static final native void delete_InstStatus(long paramLong);
  
  public static final native void delete_LocationElem(long paramLong);
  
  public static final native void delete_MapKeyFetcher(long paramLong);
  
  public static final native void delete_MemberInfo(long paramLong);
  
  public static final native void delete_MemberResult(long paramLong);
  
  public static final native void delete_ModifyGroupBaseInfoOption(long paramLong);
  
  public static final native void delete_ModifyGroupMemberInfoOption(long paramLong);
  
  public static final native void delete_Msg(long paramLong);
  
  public static final native void delete_MsgVec(long paramLong);
  
  public static final native void delete_NewGroupInfo(long paramLong);
  
  public static final native void delete_NewGroupMemVec(long paramLong);
  
  public static final native void delete_NewGroupMemberInfo(long paramLong);
  
  public static final native void delete_ProfileChangeElem(long paramLong);
  
  public static final native void delete_RunClosure(long paramLong);
  
  public static final native void delete_SNSProfileItem(long paramLong);
  
  public static final native void delete_SNSProfileItemVec(long paramLong);
  
  public static final native void delete_Session(long paramLong);
  
  public static final native void delete_SetProfileOption(long paramLong);
  
  public static final native void delete_SoundElem(long paramLong);
  
  public static final native void delete_SsoAddr(long paramLong);
  
  public static final native void delete_SsoAddrVec(long paramLong);
  
  public static final native void delete_StatusManager(long paramLong);
  
  public static final native void delete_StrVec(long paramLong);
  
  public static final native void delete_TextElem(long paramLong);
  
  public static final native void delete_ThreadEntry(long paramLong);
  
  public static final native void delete_UpdateInfoOpt(long paramLong);
  
  public static final native void delete_UserStatus(long paramLong);
  
  public static final native void delete_VideoElem(long paramLong);
  
  public static final native int eAndroid_get();
  
  public static final native int eIOS_get();
  
  public static final native int ePC_get();
  
  public static final native int kAllGroupNotify_get();
  
  public static final native int kAllNotify_get();
  
  public static final native int kC2CNotify_get();
  
  public static final native int kClose_get();
  
  public static final native int kFriendProxyStatusNone_get();
  
  public static final native int kFriendProxyStatusSyncFailed_get();
  
  public static final native int kFriendProxyStatusSynced_get();
  
  public static final native int kFriendProxyStatusSyncing_get();
  
  public static final native int kGetGroupBaseInfoAddOpton_get();
  
  public static final native int kGetGroupBaseInfoAppId_get();
  
  public static final native int kGetGroupBaseInfoCreateTime_get();
  
  public static final native int kGetGroupBaseInfoFaceUrl_get();
  
  public static final native int kGetGroupBaseInfoGroupType_get();
  
  public static final native int kGetGroupBaseInfoIntroduction_get();
  
  public static final native int kGetGroupBaseInfoLastMsgTime_get();
  
  public static final native int kGetGroupBaseInfoLastMsg_get();
  
  public static final native int kGetGroupBaseInfoMaxMemberNum_get();
  
  public static final native int kGetGroupBaseInfoMemberNum_get();
  
  public static final native int kGetGroupBaseInfoName_get();
  
  public static final native int kGetGroupBaseInfoNextMsgSeq_get();
  
  public static final native int kGetGroupBaseInfoNone_get();
  
  public static final native int kGetGroupBaseInfoNotification_get();
  
  public static final native int kGetGroupBaseInfoOnlineNum_get();
  
  public static final native int kGetGroupBaseInfoOwnerUin_get();
  
  public static final native int kGetGroupBaseInfoSearchable_get();
  
  public static final native int kGetGroupBaseInfoSeq_get();
  
  public static final native int kGetGroupBaseInfoTime_get();
  
  public static final native int kGetGroupBaseInfoVisible_get();
  
  public static final native int kGetGroupMemInfoNone_get();
  
  public static final native int kGetGroupMemJionTime_get();
  
  public static final native int kGetGroupMemMsgFlag_get();
  
  public static final native int kGetGroupMemMsgSeq_get();
  
  public static final native int kGetGroupMemNameCard_get();
  
  public static final native int kGetGroupMemRole_get();
  
  public static final native int kGetGroupMemShutupUntill_get();
  
  public static final native int kGroupMemRoleAdmin_get();
  
  public static final native int kGroupMemRoleCommon_member_get();
  
  public static final native int kGroupMemRoleOwner_get();
  
  public static final native int kGroupMemberAll_get();
  
  public static final native int kHasDeleted_get();
  
  public static final native int kInvalid_get();
  
  public static final native int kModifyGroupAddOption_get();
  
  public static final native int kModifyGroupFaceUrl_get();
  
  public static final native int kModifyGroupIntroduction_get();
  
  public static final native int kModifyGroupMaxMmeberNum_get();
  
  public static final native int kModifyGroupMemberMsgFlag_get();
  
  public static final native int kModifyGroupMemberNameCard_get();
  
  public static final native int kModifyGroupMemberNone_get();
  
  public static final native int kModifyGroupMemberRole_get();
  
  public static final native int kModifyGroupMemberShutupTime_get();
  
  public static final native int kModifyGroupName_get();
  
  public static final native int kModifyGroupNone_get();
  
  public static final native int kModifyGroupNotification_get();
  
  public static final native int kModifyGroupSearchable_get();
  
  public static final native int kModifyGroupVisible_get();
  
  public static final native int kNotSet_get();
  
  public static final native int kNull_get();
  
  public static final native int kOff_get();
  
  public static final native int kOpen_get();
  
  public static final native int kPicFile_get();
  
  public static final native int kPost_get();
  
  public static final native int kProfileFlagAllowType_get();
  
  public static final native int kProfileFlagFaceUrl_get();
  
  public static final native int kProfileFlagGroup_get();
  
  public static final native int kProfileFlagNick_get();
  
  public static final native int kProfileFlagNone_get();
  
  public static final native int kProfileFlagRemark_get();
  
  public static final native int kProfileFlagSelfSignature_get();
  
  public static final native int kSendFail_get();
  
  public static final native int kSendSucc_get();
  
  public static final native int kSending_get();
  
  public static final native long new_AddFriendReq();
  
  public static final native long new_AddFriendReqVec__SWIG_0();
  
  public static final native long new_AddFriendReqVec__SWIG_1(long paramLong);
  
  public static final native long new_BytesMap__SWIG_0();
  
  public static final native long new_BytesMap__SWIG_1(long paramLong, BytesMap paramBytesMap);
  
  public static final native long new_BytesMemberInfoMap__SWIG_0();
  
  public static final native long new_BytesMemberInfoMap__SWIG_1(long paramLong, BytesMemberInfoMap paramBytesMemberInfoMap);
  
  public static final native long new_BytesMemberInfoParser();
  
  public static final native long new_BytesProfileMapParser();
  
  public static final native long new_BytesProfileMap__SWIG_0();
  
  public static final native long new_BytesProfileMap__SWIG_1(long paramLong, BytesProfileMap paramBytesProfileMap);
  
  public static final native long new_BytesVecFetcher(long paramLong, BytesVec paramBytesVec);
  
  public static final native long new_BytesVec__SWIG_0();
  
  public static final native long new_BytesVec__SWIG_1(long paramLong);
  
  public static final native long new_Context();
  
  public static final native long new_CustomElem();
  
  public static final native long new_Elem();
  
  public static final native long new_ErrCodeManager();
  
  public static final native long new_ErrInfoVec__SWIG_0();
  
  public static final native long new_ErrInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_FaceElem();
  
  public static final native long new_FileElem();
  
  public static final native long new_FileTransSuccParam();
  
  public static final native long new_FileTranser(long paramLong);
  
  public static final native long new_FriendChangeElem();
  
  public static final native long new_FriendChangeInfoVec__SWIG_0();
  
  public static final native long new_FriendChangeInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_FriendChangeUserInfo();
  
  public static final native long new_FriendFutureItem();
  
  public static final native long new_FriendFutureItemVec__SWIG_0();
  
  public static final native long new_FriendFutureItemVec__SWIG_1(long paramLong);
  
  public static final native long new_FriendGroup();
  
  public static final native long new_FriendGroupItem();
  
  public static final native long new_FriendGroupVec__SWIG_0();
  
  public static final native long new_FriendGroupVec__SWIG_1(long paramLong);
  
  public static final native long new_FriendMetaInfo();
  
  public static final native long new_FriendPendencyItem();
  
  public static final native long new_FriendPendencyItemVec__SWIG_0();
  
  public static final native long new_FriendPendencyItemVec__SWIG_1(long paramLong);
  
  public static final native long new_FriendPendencyMeta();
  
  public static final native long new_FriendProfile();
  
  public static final native long new_FriendProfileUpdateItem();
  
  public static final native long new_FriendProfileVec__SWIG_0();
  
  public static final native long new_FriendProfileVec__SWIG_1(long paramLong);
  
  public static final native long new_FriendshipManager(String paramString);
  
  public static final native long new_FriendshipProxy();
  
  public static final native long new_FriendshipProxyConfig();
  
  public static final native long new_FutureFriendMeta();
  
  public static final native long new_GetGroupBaseInfoOption();
  
  public static final native long new_GetGroupMemInfoOption();
  
  public static final native long new_GetGroupPendencyOption();
  
  public static final native long new_GetProfileOption();
  
  public static final native long new_GroupAssistant(String paramString);
  
  public static final native long new_GroupAssistantConfig();
  
  public static final native long new_GroupBaseInfo();
  
  public static final native long new_GroupBaseInfoVec__SWIG_0();
  
  public static final native long new_GroupBaseInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupCacheInfo();
  
  public static final native long new_GroupCacheInfoVec__SWIG_0();
  
  public static final native long new_GroupCacheInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupDetailInfo();
  
  public static final native long new_GroupDetailInfoVec__SWIG_0();
  
  public static final native long new_GroupDetailInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupManager(String paramString);
  
  public static final native long new_GroupMemberInfoVec__SWIG_0();
  
  public static final native long new_GroupMemberInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupMemberResultVec__SWIG_0();
  
  public static final native long new_GroupMemberResultVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupMsgSeqInfo();
  
  public static final native long new_GroupPendencyItem();
  
  public static final native long new_GroupPendencyItemVec__SWIG_0();
  
  public static final native long new_GroupPendencyItemVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupPendencyMeta();
  
  public static final native long new_GroupReportElem();
  
  public static final native long new_GroupSelfInfo__SWIG_0();
  
  public static final native long new_GroupSelfInfo__SWIG_1(long paramLong, MemberInfo paramMemberInfo);
  
  public static final native long new_GroupSettings();
  
  public static final native long new_GroupTipsElem();
  
  public static final native long new_GroupTipsElem_GroupInfo();
  
  public static final native long new_GroupTipsElem_GroupInfoVec__SWIG_0();
  
  public static final native long new_GroupTipsElem_GroupInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_GroupTipsElem_MemberInfo();
  
  public static final native long new_GroupTipsElem_MemberInfoVec__SWIG_0();
  
  public static final native long new_GroupTipsElem_MemberInfoVec__SWIG_1(long paramLong);
  
  public static final native long new_IApplyDownloadFileCallback();
  
  public static final native long new_IAvInviteCallBack();
  
  public static final native long new_IBatchOprCallback();
  
  public static final native long new_IBatchOprCallback_BatchOprDetailInfo();
  
  public static final native long new_IBatchOprCallback_BatchOprDetailInfo_ErrInfo();
  
  public static final native long new_ICreateGroupCallback();
  
  public static final native long new_IDeleteLocalMsg();
  
  public static final native long new_IEnv();
  
  public static final native long new_IFileTrans();
  
  public static final native long new_IFriendGroupCallback();
  
  public static final native long new_IFriendshipActionCallback();
  
  public static final native long new_IFriendshipActionCallbackV2();
  
  public static final native long new_IFriendshipCallback();
  
  public static final native long new_IFriendshipGetFriendV2Callback();
  
  public static final native long new_IFriendshipGetFutureCallback();
  
  public static final native long new_IFriendshipPendencyCallback();
  
  public static final native long new_IFriendshipProxyListener();
  
  public static final native long new_IGetMsgs();
  
  public static final native long new_IGroupAssistantCallback();
  
  public static final native long new_IGroupGetPendencyCallback();
  
  public static final native long new_IGroupInfoListCallback();
  
  public static final native long new_IGroupInfoListCallbackV2();
  
  public static final native long new_IGroupListCallback();
  
  public static final native long new_IGroupMemberCallback();
  
  public static final native long new_IGroupMemberCallbackV2();
  
  public static final native long new_IGroupMemberResultCallback();
  
  public static final native long new_IGroupNotifyCallback();
  
  public static final native long new_IGroupTipsEventCallback();
  
  public static final native long new_IGroupUpdateCallback();
  
  public static final native long new_IImageUploadCallback();
  
  public static final native long new_IInit();
  
  public static final native long new_ILogMsgCallback();
  
  public static final native long new_INotify();
  
  public static final native long new_ISendMsg();
  
  public static final native long new_ISetReadMsg();
  
  public static final native long new_ISsoList();
  
  public static final native long new_IStatusCallback();
  
  public static final native long new_IStatusSetUserDefCallback();
  
  public static final native long new_ImageElem();
  
  public static final native long new_InstStatus();
  
  public static final native long new_LocationElem();
  
  public static final native long new_MapKeyFetcher();
  
  public static final native long new_MemberInfo();
  
  public static final native long new_MemberResult();
  
  public static final native long new_ModifyGroupBaseInfoOption();
  
  public static final native long new_ModifyGroupMemberInfoOption();
  
  public static final native long new_MsgVec__SWIG_0();
  
  public static final native long new_MsgVec__SWIG_1(long paramLong);
  
  public static final native long new_Msg__SWIG_0();
  
  public static final native long new_Msg__SWIG_1(long paramLong);
  
  public static final native long new_NewGroupInfo();
  
  public static final native long new_NewGroupMemVec__SWIG_0();
  
  public static final native long new_NewGroupMemVec__SWIG_1(long paramLong);
  
  public static final native long new_NewGroupMemberInfo();
  
  public static final native long new_ProfileChangeElem();
  
  public static final native long new_SNSProfileItem();
  
  public static final native long new_SNSProfileItemVec__SWIG_0();
  
  public static final native long new_SNSProfileItemVec__SWIG_1(long paramLong);
  
  public static final native long new_Session();
  
  public static final native long new_SetProfileOption();
  
  public static final native long new_SoundElem();
  
  public static final native long new_SsoAddrVec__SWIG_0();
  
  public static final native long new_SsoAddrVec__SWIG_1(long paramLong);
  
  public static final native long new_SsoAddr__SWIG_0();
  
  public static final native long new_SsoAddr__SWIG_1(String paramString, long paramLong);
  
  public static final native long new_StatusManager(String paramString);
  
  public static final native long new_StrVec__SWIG_0();
  
  public static final native long new_StrVec__SWIG_1(long paramLong);
  
  public static final native long new_TextElem();
  
  public static final native long new_UpdateInfoOpt(long paramLong);
  
  public static final native long new_UserStatus();
  
  public static final native long new_VideoElem();
  
  private static final native void swig_module_init();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\internalJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */