<%--
  Created by IntelliJ IDEA.
  User: yvasi
  Date: 20.10.2023
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h1>Результати обчислень</h1>

        <p>Результат функції: ${functionY}</p>
        <p>Кількість кроків: ${count}</p>
        <p>Індекс мінімального значення: ${imin}, значення елемента: ${min}</p>
        <p>Індекс максимального значення: ${imax}, значення елемента: ${max}</p>
        <p>Сума елементів масиву y: ${sum}</p>
        <p>Середне арифметичне елементів масиву y: ${average}</p>
</body>
</html>
