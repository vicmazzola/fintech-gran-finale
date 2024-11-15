<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FinPlus</title>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">

    <!-- Font Awesome CDN -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
          crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!-- Bootstrap CSS -->
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet">



</head>

<body>

<header class="container mt-3 mb-5">
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand logo-text fs-1" href="index.jsp"><i class="fa-solid fa-coins logo-icon text-success"></i> FinPlus</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <i class="fa-solid fa-list"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link fs-4 " href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link fs-4" href="layoutapp.jsp">Descubra o App</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link fs-4" href="login.jsp">Acesse sua Conta!</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link fs-4" href="#contato">Contato</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>


<!-------------------------------------- inicio sobre -------------------------------------->
<section class="container sobre my-5" id="sobre">
    <div class="row d-flex align-items-center justify-content-between">
        <div class="col-lg-6 text-center">
            <img src="./images/porquinho%201.png" alt="imagem porco" class="img-fluid">
        </div>
        <div class="col-lg-6">
            <h2 class="my-title display-5 my-4">A ajuda que você não sabia que precisava!</h2>
            <h3 class="mb-4">Uma empresa que surgiu em 1997, atuando inicialmente com consultoria e, a partir de
                2003, entrando na área financeira.</h3>
            <a href="" class="btn bg-success btn-lg text-light">Mais informações <i
                    class="fa-solid fa-arrow-right-long ms-1"></i></a>
        </div>
    </div>
</section>
<!----------------------------------- fim sobre - ------------------------------------->

<!-------------------------------------- inicio sobre -------------------------------------->
<section class="container my-5" id="sobre_">
    <div class="row d-flex align-items-center justify-content-center">
        <div class="col-lg-6 bg-blue-2 my-2">
            <h4 class="my-1 my-title mt-4">Sobre</h4>
            <h4 class="my-title my-4">Transformando o Mercado Financeiro com Inovação</h4>
            <p class="mb-5">
            <p>A FinPlus é uma fintech inovadora que nasceu com o objetivo de transformar o mercado financeiro.
                Nossos valores fundamentais incluem transparência, excelência no atendimento ao cliente e soluções
                tecnológicas avançadas para impulsionar o crescimento das empresas.</p>
            </p>
            <a href="" class="btn btn-lg bg-success text-light mb-5">Conheça agora <i
                    class="fa-solid fa-arrow-right-long ms-1"></i></a>
        </div>
        <div class="col-lg-6 text-center my-2">
            <div id="carouselExampleIndicators" class="carousel slide">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0"
                            class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                            aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                            aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="./images/carousel/ContandoMoedas.jpg" class="d-block w-100" alt="ContandoMoedas">
                    </div>
                    <div class="carousel-item">
                        <img src="./images/carousel/EntregandoDinheiro.jpg" class="d-block w-100"
                             alt="EntregandoDinheiro">
                    </div>
                    <div class="carousel-item">
                        <img src="./images/carousel/contandodinheiro.jpg" class="d-block w-100"
                             alt="ContandoDinheiro">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
                        data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
                        data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
    </div>
</section>

<!----------------------------------- fim valores -------------------------------------->

<!----------------------------------- inicio serviços -------------------------------------->

<section class="container my-5" id="servicos">
    <h4 class="my-title text-center my-mt">Serviços</h4>
    <h3 class="text-center my-title mb-4">O que oferecemos</h3>

    <div class="row d-flex align-items-center justify-content-center">
        <div class="col-lg-8 my-2">
            <div class="card text-center p-4">
                <i class="fa-solid fa-briefcase icon mb-3"></i>
                <div class="card-body">
                    <h5 class="card-title mb-3">Nossos Serviços</h5>
                    <ul class="list-unstyled">
                        <li class="mb-3">
                            <i class="fa-solid fa-coins icon-small me-2"></i>
                            Consultoria Financeira: Oferecemos consultoria especializada para melhorar a saúde
                            financeira da sua empresa.
                        </li>
                        <li class="mb-3">
                            <i class="fa-solid fa-chart-line icon-small me-2"></i>
                            Planejamento Estratégico: Desenvolvemos planos estratégicos personalizados para alcançar
                            seus objetivos financeiros.
                        </li>
                        <li class="mb-3">
                            <i class="fa-solid fa-handshake icon-small me-2"></i>
                            Educação Financeira: Oferecemos treinamentos e workshops para capacitar sua equipe em
                            finanças.
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>
<!----------------------------------- fim serviços -------------------------------------->

<!----------------------------------- diferenciais -------------------------------------->
<section class="container my-5" id="diferenciais">
    <h4 class="my-title text-center my-mt">Diferenciais</h4>
    <h3 class="text-center my-title mb-4">Descubra como podemos ajudar sua empresa</h3>

    <div class="row d-flex align-items-center justify-content-center">
        <div class="col-lg-4 my-2">
            <div class="card text-center p-4">
                <i class="fa-solid fa-piggy-bank icon"></i>
                <div class="card-body">
                    <h5 class="card-title">Gestão Financeira</h5>
                    <p class="card-text">Oferecemos soluções completas para gestão financeira, ajudando sua
                        empresa a otimizar recursos e maximizar lucros.</p>
                    <a href="#" class="btn bg-success text-light">Mais informações</a>
                </div>
            </div>
        </div>
        <div class="col-lg-4 my-2">
            <div class="card text-center p-4">
                <i class="fa-solid fa-mobile-alt icon"></i>
                <div class="card-body">
                    <h5 class="card-title">Tecnologia Financeira</h5>
                    <p class="card-text">Desenvolvemos soluções tecnológicas inovadoras que facilitam a gestão
                        financeira de sua empresa.</p>
                    <a href="#" class="btn bg-success text-light">Mais informações</a>
                </div>
            </div>
        </div>
        <div class="col-lg-4 my-2">
            <div class="card text-center p-4">
                <i class="fa-solid fa-university icon"></i>
                <div class="card-body">
                    <h5 class="card-title">Educação Financeira</h5>
                    <p class="card-text">Programas de educação financeira para capacitar sua equipe e
                        melhorar a saúde financeira da sua empresa.</p>
                    <a href="#" class="btn bg-success text-light">Mais informações</a>
                </div>
            </div>
        </div>
        <div class="col-lg-4 my-2">
            <div class="card text-center p-4">
                <i class="fa-solid fa-shield-alt icon"></i>
                <div class="card-body">
                    <h5 class="card-title">Segurança de Dados</h5>
                    <p class="card-text">Implementamos as mais rigorosas práticas de segurança para proteger os
                        dados financeiros da sua empresa.</p>
                    <a href="#" class="btn bg-success text-light">Mais informações</a>
                </div>
            </div>
        </div>
        <div class="col-lg-4 my-2">
            <div class="card text-center p-4">
                <i class="fa-solid fa-comments-dollar icon"></i>
                <div class="card-body">
                    <h5 class="card-title">Consultoria Fiscal</h5>
                    <p class="card-text">Oferecemos suporte completo para garantir a
                        conformidade tributária e otimizar a carga fiscal da sua empresa.</p>
                    <a href="#" class="btn bg-success text-light">Mais informações</a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-------------------------------- fim diferenciais -------------------------------------->

<!----------------------------------  inicio modal ---------------------------------------->

<!-- Case Padrão -->
<div class="modal fade" id="caseModal1" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Lorem, ipsum.</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <h2 class="mb-3">Avaliação</h2>
                <p>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Repellendus, ut suscipit praesentium id
                    cum maiores quod assumenda quibusdam! Tempore at nesciunt minima! Beatae veniam omnis, ipsa
                    similique vitae deleniti facere accusantium doloremque, veritatis dolorum itaque fuga debitis
                    sint eaque voluptatum. Placeat similique et beatae reiciendis deleniti vel. Mollitia deserunt
                    rem ut corrupti voluptatibus nihil porro fuga obcaecati, molestias ducimus repellendus saepe
                    provident maiores, ab molestiae aut ratione assumenda? Nisi excepturi, inventore cum architecto
                    expedita accusamus alias officiis sint dicta voluptatum consequuntur voluptates quasi in
                    corporis adipisci magnam nulla error omnis deleniti fuga. Cumque, culpa veritatis ab quis porro
                    neque incidunt quisquam dolore quasi omnis placeat maxime delectus earum quaerat ducimus maiores
                    dignissimos quae vero eveniet a, consequatur explicabo laboriosam libero?
                </p>
            </div>
        </div>
    </div>
</div>
<!-------------------------------- fim modal Padrão ----------------------------------->


<jsp:include page="footer.jsp"/>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>

</html>