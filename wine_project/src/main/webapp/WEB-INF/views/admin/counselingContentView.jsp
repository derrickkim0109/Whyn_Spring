<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문의글 보기</title>
<style>
.aa radio{width:30px; height:30px; font-size:20px;}
.container{border:2px #997f49 solid; width:500px; height:420px; margin:50px auto; padding:30px;}
.qList01{width:360px; height:130px; margin:20px auto; text-align: center; clear:both; border-bottom:1px #997f49 dotted;}
.qList01 .q1{width:100px; padding:10px; margin-bottom:20px; float:left; font-size:12px;}
.q1t{font-size:40px; color:#997f49; font-weight:bold;}
.qList01 .tt{ color:#997f49; text-align: left; }
#star_grade{text-align: center; padding:10px;}
#star_grade a{text-decoration: none; color: gray; text-align: center; font-size:35px;}
#star_grade a.on{color:#997f49;}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="counselingWrite.do" method="post">
<div class="container">
<p style="color:#997f49; font-size:25px; padding:20px; font-weight: bold" >문의글</p>
	
	<div style="margin:0 auto; text-align:center;">		
	
		<table>
			<tr>
				<td style="color:#997f49;"> 제목 </td>
				<td> <input type="text" name = "ctitle" style="margin: 20px; width:380px; padding:10px;"> </td>
			</tr>
			
			<tr>
				<td style="color:#997f49;"> 내용 </td>
				<td> <textarea style="resize:none; text-align:left; width:360px; height:130px; padding:20px; clear:both;" name ="ccontent"></textarea> </td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="돌아가기" style="width:60px; height:30px; color:#997f49; border:1px #997f49 solid; background: #fff;"></td></tr>
		</table>
		
		
	</div>
</div>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>