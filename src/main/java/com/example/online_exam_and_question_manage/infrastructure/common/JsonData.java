package com.example.online_exam_and_question_manage.infrastructure.common;

/** 返回数据结构 */
public class JsonData {
    private int code;
    private Object data;
    private String msg;

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
