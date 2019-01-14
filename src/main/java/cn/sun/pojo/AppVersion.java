package cn.sun.pojo;


import java.io.Serializable;
import java.util.Date;

public class AppVersion implements Serializable {

  private Long id;
  private Long appId;
  private String versionNo;
  private String versionInfo;
  private Long publishStatus;
  private String downloadLink;
  private Double versionSize;
  private Long createdBy;
  private Date creationDate;
  private Long modifyBy;
  private Date modifyDate;
  private String apkLocPath;
  private String apkFileName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public String getVersionNo() {
    return versionNo;
  }

  public void setVersionNo(String versionNo) {
    this.versionNo = versionNo;
  }

  public String getVersionInfo() {
    return versionInfo;
  }

  public void setVersionInfo(String versionInfo) {
    this.versionInfo = versionInfo;
  }

  public Long getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(Long publishStatus) {
    this.publishStatus = publishStatus;
  }

  public String getDownloadLink() {
    return downloadLink;
  }

  public void setDownloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
  }

  public Double getVersionSize() {
    return versionSize;
  }

  public void setVersionSize(Double versionSize) {
    this.versionSize = versionSize;
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

  public String getApkLocPath() {
    return apkLocPath;
  }

  public void setApkLocPath(String apkLocPath) {
    this.apkLocPath = apkLocPath;
  }

  public String getApkFileName() {
    return apkFileName;
  }

  public void setApkFileName(String apkFileName) {
    this.apkFileName = apkFileName;
  }

  @Override
  public String toString() {
    return "AppVersion{" +
            "id=" + id +
            ", appId=" + appId +
            ", versionNo='" + versionNo + '\'' +
            ", versionInfo='" + versionInfo + '\'' +
            ", publishStatus=" + publishStatus +
            ", downloadLink='" + downloadLink + '\'' +
            ", versionSize=" + versionSize +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", apkLocPath='" + apkLocPath + '\'' +
            ", apkFileName='" + apkFileName + '\'' +
            '}';
  }
}
