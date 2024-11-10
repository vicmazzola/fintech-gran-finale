<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="br.com.fiap.fintechfinplus.trabalho_fintech.Dao.ContaDao" %>
<%@ page import="br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.ContaDaoImpl" %>
<%@ page import="br.com.fiap.fintechfinplus.trabalho_fintech.Model.Conta" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gerenciamento de Contas</title>
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
<%@include file="header.jsp" %>

<div class="container">
    <div class="mt-5">
        <div class="card mb-3">
            <div class="card-header">
                <h2>Gerenciamento de Contas</h2>
            </div>
            <div class="card-body">
                <h5 class="card-title">Inserir Nova Conta</h5>
                <form action="conta" method="post"> <!-- Altera o action para o servlet -->
                    <input type="hidden" name="action" value="insert"> <!-- Adiciona a ação de inserir -->
                    <div class="form-group">
                        <label for="idCliente">ID Cliente:</label>
                        <input type="number" name="idCliente" id="idCliente" class="form-control" required>
                    </div>
                    <div class="form-group mt-3">
                        <label for="tipoConta">Tipo de Conta:</label>
                        <input type="text" name="tipoConta" id="tipoConta" class="form-control" required>
                    </div>
                    <div class="form-group mt-3">
                        <label for="saldo">Saldo:</label>
                        <input type="number" name="saldo" id="saldo" class="form-control" step="0.01" required>
                    </div>
                    <input type="submit" value="Inserir Conta" class="btn btn-success mt-3">
                </form>
            </div>
        </div>

        <h5 class="mt-5">Contas Cadastradas</h5>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID Conta</th>
                <th>ID Cliente</th>
                <th>Tipo de Conta</th>
                <th>Saldo</th>
                <th>Ações</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Conta> contas = (List<Conta>) request.getAttribute("contas"); // Recupera as contas do atributo
                if (contas != null && !contas.isEmpty()) {
                    for (Conta conta : contas) {
            %>
            <tr>
                <td><%= conta.getIdConta() %></td>
                <td><%= conta.getIdCliente() %></td>
                <td><%= conta.getTipoConta() %></td>
                <td><%= conta.getSaldo() %></td>
                <td>
                    <form action="conta" method="post" style="display:inline;">
                        <input type="hidden" name="action" value="delete">
                        <input type="hidden" name="idConta" value="<%= conta.getIdConta() %>">
                        <input type="submit" value="Excluir" class="btn btn-danger btn-sm" onclick="return confirm('Tem certeza que deseja excluir esta conta?');">
                    </form>
                    <form action="conta" method="post" style="display:inline;">
                        <input type="hidden" name="action" value="update">
                        <input type="hidden" name="idConta" value="<%= conta.getIdConta() %>">
                        <input type="text" name="tipoConta" value="<%= conta.getTipoConta() %>" required class="form-control-sm" style="width: 100px; display: inline;">
                        <input type="number" name="saldo" value="<%= conta.getSaldo() %>" step="0.01" required class="form-control-sm" style="width: 100px; display: inline;">
                        <input type="submit" value="Alterar" class="btn btn-warning btn-sm">
                    </form>
                </td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="5" class="text-center">Nenhuma conta cadastrada.</td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>
</div>

<jsp:include page="footer.jsp"/>

<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>