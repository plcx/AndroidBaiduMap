package com.shz.baidumap;

import android.app.Application;

public class locate extends Application {

    //声明一个变量
    static public double latitude;
    static double longitude;
    static double distance;
    static double setdistance;
    static int score=10;




    public void setlatitude(double latitude) {
        this.latitude = latitude;
    }


    public double getlatitude() {
        return latitude;
    }


    public void setlongitude(double longitude) {
        this.longitude = longitude;
    }


    public double getlongitude() {
        return longitude;
    }


    public void setsetdistance(double setdistance) {
        this.setdistance=setdistance;
    }


    public double getSetdistance() {
        return setdistance;
    }


    public void addscore() {
        score+=30;

    }
    public void minusscore() {
        score-=30;


    }

    //实现getname()方法，获取变量的值
    public int getscore() {
        return score;
    }



    //实现setname()方法，设置变量的值
    public void setdistance(double distance) {
        this.distance = distance;
    }

    //实现getname()方法，获取变量的值
    public double getsdistance() {
        return distance;
    }
}