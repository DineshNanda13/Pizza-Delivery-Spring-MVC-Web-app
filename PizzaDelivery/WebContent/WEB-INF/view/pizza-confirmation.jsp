<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>

<html>

	<head>
	
		<title>Confirmation</title>
	
	</head>
	
	<body>
	
		Full Name: ${pizza.firstName} ${pizza.lastName} 
		<br>
		<br>
		Pizza Selceted: ${pizza.pizzaOptions}
		<br>
		<br>
		Toppings:
		<ul>
			<c:forEach var="temp" items="${pizza.toppings}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
		Base selected: ${pizza.base}
		<br>
		<br>
		Number of pizza: ${pizza.quantity}
		<br>
		<br>
		Postal Code: ${pizza.postalCode}
		<br>
		<br>
		Coupon Code: ${pizza.couponCode}
		
	</body>

</html>