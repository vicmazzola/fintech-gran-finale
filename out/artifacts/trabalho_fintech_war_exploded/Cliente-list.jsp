<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FinPlus</title>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">

    <!-- Bootstrap Icons -->

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
          crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!-- Bootstrap CSS -->
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>
<%@include file="header.jsp"%>
<div class="container">
    <div class="mt-5 ms-5 me-5">

        <div class="card mb-3">
            <div class="card-header">
                <h2>Lista de Clientes<h2>
            </div>
            <div class="card-body">
                <h5 class="card-title">Catálogo de Clientes</h5>
                <p class="card-text">Mantenha a lista de clientes atualizada e acessíveis.</p>
                <c:if test="${not empty mensagem}">
                    <div class="alert alert-secondary" role="alert">
                       ${mensagem}
                    </div>
                </c:if>

            <table class="table table-striped table-bordered">
                <thead>
                <tr>
                    <th>Nome</th>
                    <th class="text-start">Date_nascimento</th>
                    <th class="text-start">Telefone</th>
                    <th class="text-start">Email</th>
                    <th class="text-start">Endereco</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${clientes}" var="cliente">
                    <tr>
                        <td>${cliente.nome}</td>
                        <td class="text-start">${cliente.date_nascimento}</td> <!-- Mantido como date_nascimento -->
                        <td class="text-center">${cliente.telefone}</td>
                        <td class="text-center">${cliente.email}</td>
                        <td class="text-center">${cliente.endereco}</td>
                        <td class="text-center"><input type="checkbox" checked="checked" disabled="disabled"></td>
                    </tr>
                </c:forEach>


                </tbody>
            </table>
                <a href="cadastro-cliente.jsp" class="btn bg-success text-light">Cadastrar novo cliente</a>
            </div>
        </div>
    </div>
</div>

<!-------------------------------------- inicio contato -------------------------------------->
<jsp:include page="footer.jsp"/>


<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>
