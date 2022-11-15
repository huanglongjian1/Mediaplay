package com.example.retrofittest2;

public class Data {
    /**
     * code : 1
     * data : {"name":"原谅","url":"http://music.163.com/song/media/outer/url?id=1989430006","picurl":"http://p3.music.126.net/76CCJfSM1-FNjmFHg4EqpQ==/109951167965483435.jpg","artistsname":"买辣椒也用券"}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
