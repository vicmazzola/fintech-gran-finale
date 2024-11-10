
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

    <!-- Bootstrap Icons -->

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
          crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!-- Bootstrap CSS -->
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet">


</head>

<body>


<%@include file="header.jsp" %>

<!-------------------------------- inicio layout -------------------------------------->

<section class="container sobre my-5" id="layout">
    <h1>Layout App Mobile</h1><br><br><br>
    <h2>Olá, Seja Bem-Vindo!</h2><br>
    <h4>Aqui está seu saldo :</h4><br>
    <div class="row">
        <div class="col-sm-6 mb-3 mb-sm-0">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Conta Corrente</h5>
                    <label for="file">R$8.348</label><br>
                    <progress id="file" value="37" max="100"> 32% </progress>
                    <p class="card-text"></p>
                    <a href="#" class="btn btn-primary bg-success">Recentes</a>
                </div>
            </div>
        </div>

        <div class="col-sm-6 mb-3 mb-sm-0">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Poupança</h5>
                    <label for="file">R$12.955</label><br>
                    <progress id="file_" value="48" max="100"> 32% </progress>
                    <p class="card-text"></p>
                    <a href="#" class="btn btn-primary bg-success">Aplicações Recentes</a>
                </div>
            </div>
        </div>
    </div>

    <div class="container my-5">
        <h4 class="text-center">Transações :</h4>
        <div class="row justify-content-center">
            <div class="col-md-4 mb-3">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Five Guys</h5>
                        <p class="card-text text-end">R$ -38.79 <br> Jun 14</p>
                        <button type="button" class="btn btn-primary bg-success" data-bs-toggle="modal"
                                data-bs-target="#exampleModal">
                            Detalhes
                        </button>

                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">Detalhes Transação</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <ul>
                                            <li>Categoria: Comida e Bebidas.</li>
                                            <li>Restaurante: Five Guys</li>
                                            <li>Gasto: R$38.79</li>
                                        </ul>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary"
                                                data-bs-dismiss="modal">Fechar</button>
                                        <button type="button" class="btn btn-primary bg-success"
                                                data-bs-dismiss="modal">Ok</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-md-4 mb-3">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Zalando</h5>
                        <p class="card-text text-end">R$ -89.30 <br> Jun 10</p>
                        <button type="button" class="btn btn-primary bg-success" data-bs-toggle="modal"
                                data-bs-target="#exampleModal2">
                            Detalhes
                        </button>

                        <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title fs-5" id="exampleModal_Label">Detalhes Transação</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <ul>
                                            <li>Categoria: Roupas.</li>
                                            <li>Restaurante: Zalando</li>
                                            <li>Gasto: R$-89.30</li>
                                        </ul>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary"
                                                data-bs-dismiss="modal">Fechar</button>
                                        <button type="button" class="btn btn-primary bg-success"
                                                data-bs-dismiss="modal">Ok</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-------------------------------- fim layout -------------------------------------->

<!----------------------------------  inicio modal ---------------------------------------->

<!-- Case Padrão -->
<div class="modal fade" id="caseModal1" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="example_ModalLabel">Lorem, ipsum.</h1>
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

<!-------------------------------------- inicio contato -------------------------------------->
<jsp:include page="footer.jsp"/>
<!----------------------------------- fim contato -------------------------------------->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>

</html>