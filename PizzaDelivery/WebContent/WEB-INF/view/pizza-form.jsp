<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

	<head>
	
		<title>Select your Pizza</title>
		
		<style>
			.error{
				color:red;
			}
		</style>
	
	</head>
	
	<body>
		
		<h2>Fill the details</h2>
	
		<h4>(*) means required</h4>
	
		<form:form action="processForm" modelAttribute="pizza">
			First Name(*):<form:input path="firstName"/>
				<form:errors path="firstName" cssClass="error"></form:errors>
				<br>
				<br>
			Last Name(*):<form:input path="lastName"/>
				<form:errors path="lastName" cssClass="error"></form:errors>
				<br>
				<br>
			Pizza Options:<form:select path="pizzaOptions">
					<form:option value="Veggie" label="Veggie"></form:option>
					<form:option value="Chicken" label="Chicken"></form:option>
					<form:option value="Extravaganza" label="Extravaganza"></form:option>
					<form:option value="Pepperoni" label="Pepperoni"></form:option>
				</form:select>
				<br>
				<br>
			Toppings:<br>
				<form:checkbox path="toppings" value="Mushrooms"/>Mushrooms<br>
				<form:checkbox path="toppings" value="Olives"/>Olives<br>
				<form:checkbox path="toppings" value="Japelano"/>Japelano<br>
				<form:checkbox path="toppings" value="Tomato"/>Tomato
				<br>
				<br>
			Base:<br>
				<form:radiobutton path="base" value="Thin Crust"/>Thin Crust<br>
				<form:radiobutton path="base" value="Hand Tossed"/>Hand tossed<br>
				<form:radiobutton path="base" value="Flatbread"/>Flatbread
				<br>
				<br>
			Quantity:<form:input path="quantity"/>
				<form:errors path="quantity" cssClass="error"></form:errors>
				<br>
				<br>
			Postal Code(*):<form:input path="postalCode"/>
				<form:errors path="postalCode" cssClass="error"></form:errors>
			    <br>
				<br>
			Coupon Code:<form:input path="couponCode"/>
				<form:errors path="couponCode" cssClass="error"></form:errors>
				<br>
				<br>
			<input type="submit" value="Submit">
		
		</form:form>
	
	</body>

</html>