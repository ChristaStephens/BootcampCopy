<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Tip</title>
	<style>
		form {
			border: 2px dashed black;
			padding: 1em;
			margin-bottom: .5em;
		}
	</style>
</head>
<body>

	<form action="/submit-tip">
		<p>Total: <input type="number" name="total" /> </p>
		<p>Tip: 15%</p>
		<input type="hidden" name="tip" value="15" />
		<p><button type="submit">Calculate Tip</button></p>
	</form>

	<form action="/submit-tip">
		<p>Total: <input type="number" name="total" /> </p>
		<p>Tip:
			<label><input type="radio" name="tip" value="15" /> 15%</label>
			<label><input type="radio" name="tip" value="18" /> 18%</label>
			<label><input type="radio" name="tip" value="20" /> 20%</label>
		</p>
		<p><button type="submit">Calculate Tip</button></p>
	</form>
	
	<form action="/submit-tip">
		<p>Total: <input type="number" name="total" /> </p>
		<p>Tip:
			<label><input type="radio" name="tip" value="15" /> 15%</label>
			<label><input type="radio" name="tip" value="18" /> 18%</label>
			<label><input type="radio" name="tip" value="20" /> 20%</label>
			<label><input type="radio" name="tip" value="-1" /> Custom</label>
		</p>
		<p>Custom Tip %: <input type="number" name="custom-tip" /> </p>
		<p><button type="submit">Calculate Tip</button></p>
	</form>
</body>
</html>