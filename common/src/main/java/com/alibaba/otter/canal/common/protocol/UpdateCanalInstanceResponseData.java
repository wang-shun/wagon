package com.alibaba.otter.canal.common.protocol;

import com.alibaba.otter.canal.common.protocol.RemotingSerializable;

public class UpdateCanalInstanceResponseData extends RemotingSerializable {

    public static final int RESULT_CODE_SUCCESS = 1;
    public static final int RESULT_CODE_FAILED = -1;

    private int resultCode = RESULT_CODE_SUCCESS;
    private String resultMsg = "successful";

    public UpdateCanalInstanceResponseData() {
    }

    public UpdateCanalInstanceResponseData(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public UpdateCanalInstanceResponseData(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public static UpdateCanalInstanceResponseData buildFailedResult(String resultMsg) {
        return new UpdateCanalInstanceResponseData(RESULT_CODE_FAILED, resultMsg);
    }

    // ================== setter / getter ===================
    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

}
