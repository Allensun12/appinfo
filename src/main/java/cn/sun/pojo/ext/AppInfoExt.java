package cn.sun.pojo.ext;

import cn.sun.pojo.AppInfo;

public class AppInfoExt extends AppInfo {
    private String devlName;
    private String appStatus;
    private String flatformName;
    private String level1;
    private String level2;
    private String level3;
    private String versionNo;

    public String getDevlName() {
        return devlName;
    }

    public void setDevlName(String devlName) {
        this.devlName = devlName;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getFlatformName() {
        return flatformName;
    }

    public void setFlatformName(String flatformName) {
        this.flatformName = flatformName;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }
}
