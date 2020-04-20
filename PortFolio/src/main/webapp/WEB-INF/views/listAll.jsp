<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html> 
<html>
<head>
<title>게시판 목록</title>
</head>

<body>

	<table border="1" width="880">    
		<c:forEach items="${list}" var="BoardVO">
			<tr>
				<td>${BoardVO.test}</td>
				<td>${BoardVO.test2}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</form>
</html>