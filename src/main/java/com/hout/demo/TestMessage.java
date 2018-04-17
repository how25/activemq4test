package com.hout.demo;

import java.io.Serializable;

public class TestMessage implements Serializable {
    private static final long serialVersionUID = -2132582539599141027L;

    private Integer id;
    private String msg;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "TestMessage [id=" + id + ", msg=" + msg + "]";
    }
}
