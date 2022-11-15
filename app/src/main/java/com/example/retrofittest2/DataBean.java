package com.example.retrofittest2;

public class DataBean {
    /**
     * name : 原谅
     * url : http://music.163.com/song/media/outer/url?id=1989430006
     * picurl : http://p3.music.126.net/76CCJfSM1-FNjmFHg4EqpQ==/109951167965483435.jpg
     * artistsname : 买辣椒也用券
     */

    private String name;
    private String url;
    private String picurl;
    private String artistsname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", picurl='" + picurl + '\'' +
                ", artistsname='" + artistsname + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getArtistsname() {
        return artistsname;
    }

    public void setArtistsname(String artistsname) {
        this.artistsname = artistsname;
    }
}
