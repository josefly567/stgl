<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>明细管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/mx/scoreinfo/scoreInfo/">明细列表</a></li>
		<shiro:hasPermission name="mx:scoreinfo:scoreInfo:edit"><li><a href="${ctx}/mx/scoreinfo/scoreInfo/form">明细添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="scoreInfo" action="${ctx}/mx/scoreinfo/scoreInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>type：</label>
				<form:select path="type" class="input-medium">
					<form:option value="" label=""/>
					<form:options items="${fns:getDictList('score_info_type')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>
			</li>
			<li><label>number：</label>
				<form:input path="number" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>更新时间</th>
				<th>备注信息</th>
				<th>type</th>
				<th>describe</th>
				<th>number</th>
				<th>score</th>
				<shiro:hasPermission name="mx:scoreinfo:scoreInfo:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scoreInfo">
			<tr>
				<td><a href="${ctx}/mx/scoreinfo/scoreInfo/form?id=${scoreInfo.id}">
					<fmt:formatDate value="${scoreInfo.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</a></td>
				<td>
					${scoreInfo.remarks}
				</td>
				<td>
					${fns:getDictLabel(scoreInfo.type, 'score_info_type', '')}
				</td>
				<td>
					${scoreInfo.describe}
				</td>
				<td>
					${scoreInfo.number}
				</td>
				<td>
					${scoreInfo.score}
				</td>
				<shiro:hasPermission name="mx:scoreinfo:scoreInfo:edit"><td>
    				<a href="${ctx}/mx/scoreinfo/scoreInfo/form?id=${scoreInfo.id}">修改</a>
					<a href="${ctx}/mx/scoreinfo/scoreInfo/delete?id=${scoreInfo.id}" onclick="return confirmx('确认要删除该明细吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>