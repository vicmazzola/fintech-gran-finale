<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
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

<header class="container mt-3 mb-5">
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand logo-text fs-1" href="index.jsp"><i class="fa-solid fa-coins logo-icon text-success"></i>
                FinPlus</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <i class="fa-solid fa-list"></i>
            </button>


            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link primary-color fs-4" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link fs-4" href="#contato">Contato</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>



<div class="container">
    <div class="mt-5 ms-5 me-5">
        <div class="card mb-3">
            <div class="card-header">
                <h2>Cadastro de Conta<h2>
            </div>
            <div class="card-body">
                <form action="cliente" method="post">
                    <div class="form-group">
                        <label for="id-nome">Nome</label>
                        <input type="text" name="Nome" id="id-nome" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="id-nome">Email</label>
                        <input type="text" name="Nome" id="id-email" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="id-nome">Senha</label>
                        <input type="text" name="Nome" id="id-senha" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="id-nome">Confirmar Senha</label>
                        <input type="text" name="Nome" id="id-senha" class="form-control">
                    </div>
                    <div class="form-group mt-3">
                        <label for="id-Date_nascimento">Nascimento</label>
                        <input type="text" name="Date_nascimento" id="id-Date_nascimento" class="form-control">
                    </div>
                    <div class="form-group mt-3">
                        <label for="id-Telefone">Telefone</label>
                        <input type="number"  name="telefone" id="id-Telefone" class="form-control">
                    </div>
                    <div class="form-group mt-3">
                        <label for="id-Email">Email</label>
                        <input type="text"  name="Email" id="id-Email" class="form-control">
                    </div>
                    <div class="form-group mt-3">
                        <label for="id-Endereco">Endereco</label>
                        <input type="text" name="Endereco" id="id-Endereco" class="form-control">
                    </div>
                    <input type="submit" value="Salvar" class="btn btn-success mt-3">
                </form>
            </div>
        </div>
    </div>
</div>

<!-------------------------------------- inicio contato -------------------------------------->
<jsp:include page="footer.jsp"/>


<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>