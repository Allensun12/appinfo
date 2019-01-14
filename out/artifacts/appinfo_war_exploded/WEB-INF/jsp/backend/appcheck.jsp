<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
      <div class="x_title">
        <h2>查看并审核APP信息 <i class="fa fa-user"></i><small>${sessionScope.userSession.userName}</small></h2>
        <div class="clearfix"></div>
      </div>
      <div class="x_title">
        <h2>APP基础信息</h2>
        <div class="clearfix"></div>
      </div>
      <div class="x_content1">
        <form class="form-horizontal form-label-left" action="checksave" method="post">
          <input type="hidden" name="id" value="${ExtAppInfo.id}">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwareName">软件名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareName" class="form-control col-md-7 col-xs-12" value="${ExtAppInfo.softwareName}"
                     type="text" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="APKName">APK名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="APKName" type="text" class="form-control col-md-7 col-xs-12"
                     value="${ExtAppInfo.APKName}" readonly="readonly">
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="supportROM">支持ROM <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="supportROM" class="form-control col-md-7 col-xs-12"
                     value="${ExtAppInfo.supportROM}" type="text" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="interfaceLanguage">界面语言 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="interfaceLanguage" class="form-control col-md-7 col-xs-12" readonly="readonly"
                     value="${ExtAppInfo.interfaceLanguage}" type="text">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwareSize">软件大小 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareSize" type="text" value="${ExtAppInfo.softwareSize}"
                     class="form-control col-md-7 col-xs-12" readonly="readonly">
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="downloads">下载次数 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="downloads" type="text" value="${ExtAppInfo.downloads}"
                     class="form-control col-md-7 col-xs-12" readonly="readonly">
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="flatformName">所属平台 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="flatformName" type="text" class="form-control col-md-7 col-xs-12"
                     value="${ExtAppInfo.flatformName}" readonly="readonly">

            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="category">所属分类 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="category" type="text" class="form-control col-md-7 col-xs-12"
                     value="${ExtAppInfo.categoryLevel1Name} --> ${ExtAppInfo.categoryLevel2Name} --> ${ExtAppInfo.categoryLevel3Name}" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="statusName">APP状态 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="statusName" type="text" class="form-control col-md-7 col-xs-12"
                     value="${ExtAppInfo.statusName}" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="ExtAppInfo">应用简介 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="ExtAppInfo" class="form-control col-md-7 col-xs-12" readonly="readonly">
                ${ExtAppInfo.appInfo}</textarea>
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="logoPicPath">LOGO图片 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <c:choose>
                <c:when test="${ExtAppInfo.logoPicPath == null || ExtAppInfo.logoPicPath == ''}">
                  暂无
                </c:when>
                <c:otherwise>
                  <img id="logoPicPath" src="${ExtAppInfo.logoPicPath }?m=1" width="100px;"/>
                </c:otherwise>
              </c:choose>
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-6 col-md-offset-3">
              <button  type="submit" name="status" value="2" class="btn btn-success">审核通过</button>
              <button  type="submit" name="status" value="3" class="btn btn-success">审核不通过</button>
              <button type="button" class="btn btn-primary" id="back">返回</button>
            </div>
          </div>
        </form>
      </div>
      <div class="clearfix"></div>
      <div class="x_title">
        <h2>最新版本信息</h2>
        <ul class="nav navbar-right panel_toolbox">
          <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
          </li>
        </ul>
        <div class="clearfix"></div>
      </div>
      <div class="x_content" style="display: block;">
        <br>
        <form class="form-horizontal form-label-left">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="versionNo">版本号 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="versionNo" class="form-control col-md-7 col-xs-12" value="${ExtAppVersion.versionNo }"
                     type="text" readonly="readonly" >
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="versionSize">版本大小 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="versionSize" type="number" value="${ExtAppVersion.versionSize }" class="form-control col-md-7 col-xs-12">
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="publishStatus">发布状态 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="hidden" name="publishStatus" id="publishStatus" value="3">预发布
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="versionInfo">版本简介 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="versionInfo" class="form-control col-md-7 col-xs-12">
                ${ExtAppVersion.versionInfo }</textarea>
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="downloadLink">apk文件 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <c:choose>
                <c:when test="${ExtAppVersion.downloadLink == null || ExtAppVersion.downloadLink == ''}">
                  暂无
                </c:when>
                <c:otherwise>
                  <p>${ExtAppVersion.apkFileName}&nbsp;&nbsp;
                    <a id="downloadLink" href="${ExtAppVersion.downloadLink}" >下载</a>
                  </p>
                </c:otherwise>
              </c:choose>
            </div>
          </div>
          <div class="clearfix"></div>
          <br/><br/>
        </form>
      </div>
      <div class="clearfix"></div>
      <br/><br/>
    </div>
  </div>
  <%@include file="common/footer.jsp"%>
  <script src="${pageContext.request.contextPath }/statics/localjs/appcheck.js"></script>