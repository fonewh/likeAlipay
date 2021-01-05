<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<script src="<%=request.getContextPath() %>/static/js/jquery.min.js" type="text/javascript"></script>

<html>

	<title>支付页面</title>
    <head>
        
    </head>
    
    <body>
        
    <form id="payForm" action="<%=request.getContextPath() %>/alipay/goAlipay.action" method="post">
    	<input type="hidden" name="orderId" value="${order.id }" />
        <table>
        	<tr>
        		<td>
        			订单编号: ${order.id }
<%--					order.id--%>
        		</td>
        	</tr>
        		<td>
        			产品名称: ${p.name }
        		</td>
        	<tr>
        	</tr>
        		<td>
        			订单价格: ${order.orderAmount }
        		</td>
        	<tr>
        	</tr>
        		<td>
        			购买个数：${order.buyCounts }
        		</td>
        	</tr>
        	</tr>
        		<td>
        			<input type="submit" value="前往支付宝进行支付">
        		</td>
        	</tr>
        </table>
    </form>
    
    	
        <input type="hidden" id="hdnContextPath" name="hdnContextPath" value="<%=request.getContextPath() %>"/>
    </body>
    
</html>




