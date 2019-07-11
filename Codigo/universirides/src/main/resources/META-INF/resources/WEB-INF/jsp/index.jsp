<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Lista Caronas</title>
</head>
<body>
<div align="center">
    <h2>Lista Caronas</h2>

    <h3><a href="/carona/new">Nova Carona</a></h3>

    <table border="1" cellpadding="5">
        <tr>
            <th>Id</th>
            <th>Descricao</th>
            <th>Tipo</th>
            <th>Turno</th>
            <th>Bairro</th>
            <th>Usuario</th>
            <%--<th>Action</th>--%>
        </tr>
        <c:forEach items="${listCaronas}" var="carona">
            <tr>
                <td>${carona.id}</td>
                <td>${carona.descricao}</td>
                <td>${carona.tipo}</td>
                <td>${carona.turno}</td>
                <td>${carona.bairro.nome}</td>
                <td>${carona.usuario.nome}</td>
                <%--<td>--%>
                    <%--<a href="/edit?id=${carona.id}">Edit</a>--%>
                    <%--&nbsp;&nbsp;&nbsp;--%>
                    <%--<a href="/delete?id=${carona.id}">Delete</a>--%>
                <%--</td>--%>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>