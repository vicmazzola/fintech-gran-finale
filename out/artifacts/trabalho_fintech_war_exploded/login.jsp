<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login | FinPlus</title>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">

    <!-- Bootstrap CSS -->
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
          crossorigin="anonymous" referrerpolicy="no-referrer" />
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

<section class="container my-5">
    <div class="row justify-content-center">
        <div class="col-lg-6">
            <h2 class="my-title display-5 text-center mb-4">Acesse sua conta</h2>
            <form action="home-logado.jsp" method="post" class="p-4 border rounded shadow">
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="mb-3">
                    <label for="senha" class="form-label">Senha</label>
                    <input type="password" class="form-control" id="senha" name="senha" required>
                </div>
                <div class="mb-3 form-check">
                    <input type="checkbox" class="form-check-input" id="remember" name="remember">
                    <label class="form-check-label" for="remember">Lembrar de mim</label>
                </div>
                <button type="submit" class="btn bg-success text-light w-100">Entrar</button>
                <p class="mt-3 text-center">Ainda não tem uma conta? <a href="cadastro-conta.jsp">Cadastre-se aqui!</a></p>
            </form>
        </div>
    </div>
</section>

<!-------------------------------------- inicio contato -------------------------------------->
<jsp:include page="footer.jsp"/>

</body>
</html>
