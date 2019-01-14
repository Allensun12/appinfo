package cn.sun.pojo;


import java.io.Serializable;
import java.util.Date;

public class AppInfo implements Serializable {

  private Long id;
  private String softwareName;
  private String apkName;
  private String supportRom;
  private String interfaceLanguage;
  private Double softwareSize;
  private Date updateDate;
  private Long devId;
  private String appInfo;
  private Long status;
  private Date onSaleDate;
  private Date offSaleDate;
  private Long flatformId;
  private Long categoryLevel3;
  private Long downloads;
  private Long createdBy;
  private Date creationDate;
  private Long modifyBy;
  private Date modifyDate;
  private Long categoryLevel1;
  private Long categoryLevel2;
  private String logoPicPath;
  private String logoLocPath;
  private Long versionId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSoftwareName() {
    return softwareName;
  }

  public void setSoftwareName(String softwareName) {
    this.softwareName = softwareName;
  }

  public String getApkName() {
    return apkName;
  }

  public void setApkName(String apkName) {
    this.apkName = apkName;
  }

  public String getSupportRom() {
    return supportRom;
  }

  public void setSupportRom(String supportRom) {
    this.supportRom = supportRom;
  }

  public String getInterfaceLanguage() {
    return interfaceLanguage;
  }

  public void setInterfaceLanguage(String interfaceLanguage) {
    this.interfaceLanguage = interfaceLanguage;
  }

  public Double getSoftwareSize() {
    return softwareSize;
  }

  public void setSoftwareSize(Double softwareSize) {
    this.softwareSize = softwareSize;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public Long getDevId() {
    return devId;
  }

  public void setDevId(Long devId) {
    this.devId = devId;
  }

  public String getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(String appInfo) {
    this.appInfo = appInfo;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Date getOnSaleDate() {
    return onSaleDate;
  }

  public void setOnSaleDate(Date onSaleDate) {
    this.onSaleDate = onSaleDate;
  }

  public Date getOffSaleDate() {
    return offSaleDate;
  }

  public void setOffSaleDate(Date offSaleDate) {
    this.offSaleDate = offSaleDate;
  }

  public Long getFlatformId() {
    return flatformId;
  }

  public void setFlatformId(Long flatformId) {
    this.flatformId = flatformId;
  }

  public Long getCategoryLevel3() {
    return categoryLevel3;
  }

  public void setCategoryLevel3(Long categoryLevel3) {
    this.categoryLevel3 = categoryLevel3;
  }

  public Long getDownloads() {
    return downloads;
  }

  public void setDownloads(Long downloads) {
    this.downloads = downloads;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(Long modifyBy) {
    this.modifyBy = modifyBy;
  }

  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Long getCategoryLevel1() {
    return categoryLevel1;
  }

  public void setCategoryLevel1(Long categoryLevel1) {
    this.categoryLevel1 = categoryLevel1;
  }

  public Long getCategoryLevel2() {
    return categoryLevel2;
  }

  public void setCategoryLevel2(Long categoryLevel2) {
    this.categoryLevel2 = categoryLevel2;
  }

  public String getLogoPicPath() {
    return logoPicPath;
  }

  public void setLogoPicPath(String logoPicPath) {
    this.logoPicPath = logoPicPath;
  }

  public String getLogoLocPath() {
    return logoLocPath;
  }

  public void setLogoLocPath(String logoLocPath) {
    this.logoLocPath = logoLocPath;
  }

  public Long getVersionId() {
    return versionId;
  }

  public void setVersionId(Long versionId) {
    this.versionId = versionId;
  }

  @Override
  public String toString() {
    return "AppInfo{" +
            "id=" + id +
            ", softwareName='" + softwareName + '\'' +
            ", apkName='" + apkName + '\'' +
            ", supportRom='" + supportRom + '\'' +
            ", interfaceLanguage='" + interfaceLanguage + '\'' +
            ", softwareSize=" + softwareSize +
            ", updateDate=" + updateDate +
            ", devId=" + devId +
            ", appInfo='" + appInfo + '\'' +
            ", status=" + status +
            ", onSaleDate=" + onSaleDate +
            ", offSaleDate=" + offSaleDate +
            ", flatformId=" + flatformId +
            ", categoryLevel3=" + categoryLevel3 +
            ", downloads=" + downloads +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", categoryLevel1=" + categoryLevel1 +
            ", categoryLevel2=" + categoryLevel2 +
            ", logoPicPath='" + logoPicPath + '\'' +
            ", logoLocPath='" + logoLocPath + '\'' +
            ", versionId=" + versionId +
            '}';
  }
}
