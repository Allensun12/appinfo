package cn.sun.pojo.ext;

import cn.sun.pojo.*;

import java.util.List;

public class ExtAppInfo extends AppInfo {
    private DevUser devUser;  // app-开发者 == n:1 :一个app只属于一个开发者，一个开发者可以开发多款app
    private AppCategory appCategoryLevel1;//一级分类
    private AppCategory appCategoryLevel2;//二级分类
    private AppCategory appCategoryLevel3;//三级分类
    private DataDictionary appStatus;//app状态
    private DataDictionary appFlatform;//app使用平台
    private AppVersion versionList; // app-版本 == 1：n ：一款app可能有多个版本，一个版本只能由这一款app

    public DevUser getDevUser() {
        return devUser;
    }

    public void setDevUser(DevUser devUser) {
        this.devUser = devUser;
    }

    public AppCategory getAppCategoryLevel1() {
        return appCategoryLevel1;
    }

    public void setAppCategoryLevel1(AppCategory appCategoryLevel1) {
        this.appCategoryLevel1 = appCategoryLevel1;
    }

    public AppCategory getAppCategoryLevel2() {
        return appCategoryLevel2;
    }

    public void setAppCategoryLevel2(AppCategory appCategoryLevel2) {
        this.appCategoryLevel2 = appCategoryLevel2;
    }

    public AppCategory getAppCategoryLevel3() {
        return appCategoryLevel3;
    }

    public void setAppCategoryLevel3(AppCategory appCategoryLevel3) {
        this.appCategoryLevel3 = appCategoryLevel3;
    }

    public DataDictionary getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(DataDictionary appStatus) {
        this.appStatus = appStatus;
    }

    public DataDictionary getAppFlatform() {
        return appFlatform;
    }

    public void setAppFlatform(DataDictionary appFlatform) {
        this.appFlatform = appFlatform;
    }

    public AppVersion getVersionList() {
        return versionList;
    }

    public void setVersionList(AppVersion versionList) {
        this.versionList = versionList;
    }

    @Override
    public String toString() {
        return "ExtAppInfo{" +
                "devUser=" + devUser +
                ", appCategoryLevel1=" + appCategoryLevel1 +
                ", appCategoryLevel2=" + appCategoryLevel2 +
                ", appCategoryLevel3=" + appCategoryLevel3 +
                ", appStatus=" + appStatus +
                ", appFlatform=" + appFlatform +
                ", versionList=" + versionList +
                '}';
    }
}
