package com.yljx.official.entity.comm;

/**
 * Created by yangpeng on 2017/12/4.
 */
public class AjaxMsg {
    private String message;
    private Integer code;
    private Object datas;

    public AjaxMsg() {
        this.code = Constants.AJAX_CODE_SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "AjaxMsg{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", datas=" + datas +
                '}';
    }
}
