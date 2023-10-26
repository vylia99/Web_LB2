<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Введення початкових даних</title>
</head>
<body>
<h1>Введення початкових даних</h1>
<form action="calculate" method="post">
    <label for="x">x:</label>
    <input type="number" name="x" id="x" step="any"><br>

    <label for="a">a:</label>
    <input type="number" name="a" id="a" step="any"><br>

    <label for="b">b:</label>
    <input type="number" name="b" id="b" step="any"><br>

    <label for="c">c:</label>
    <input type="number" name="c" id="c" step="any" ><br>

    <label for="start">Початок діапазону:</label>
    <input type="number" name="start" id="start" step="any"><br>

    <label for="end">Кінець діапазону:</label>
    <input type="number" name="end" id="end" step="any"><br>

    <label for="step">Крок зміни аргумента:</label>
    <input type="number" name="step" id="step" step="any"><br>

    <input type="submit" value="Calculate">
</form>
</body>
</html>
