package cn.sun.pojo;


import java.io.Serializable;
import java.util.Date;

public class AdPromotion implements Serializable {

  private Long id;
  private Long appId;
  private String adPicPath;
  private Long adPv;
  private Long carouselPosition;
  private Date startTime;
  private Date endTime;
  private Long createdBy;
  private Date creationDate;
  private Long modifyBy;
  private Date modifyDate;

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

  public String getAdPicPath() {
    return adPicPath;
  }

  public void setAdPicPath(String adPicPath) {
    this.adPicPath = adPicPath;
  }

  public Long getAdPv() {
    return adPv;
  }

  public void setAdPv(Long adPv) {
    this.adPv = adPv;
  }

  public Long getCarouselPosition() {
    return carouselPosition;
  }

  public void setCarouselPosition(Long carouselPosition) {
    this.carouselPosition = carouselPosition;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
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

  @Override
  public String toString() {
    return "AdPromotion{" +
            "id=" + id +
            ", appId=" + appId +
            ", adPicPath='" + adPicPath + '\'' +
            ", adPv=" + adPv +
            ", carouselPosition=" + carouselPosition +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            '}';
  }
}
