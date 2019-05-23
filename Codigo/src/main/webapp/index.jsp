<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Pagina inicial</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Procurar Caronas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Registrar Carona</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Minhas Caronas</a>
                        </li>
                        <li class="nav-item dropdown">

                        </li>
                    </ul>
                    <ul class="navbar-nav ml-md-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                Conta
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href="#">Sair</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-center">
                UniversiRides
            </h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-11">

            <h2>O que voce deseja?</h2>

            <ul class="nav nav-pills nav-justified">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="pill" href="#IrUFG">Ir para UFG</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="pill" href="#VoltarUFG">Voltar da UFG</a>
                </li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane container active" id="IrUFG">
                    <div class="row">
                        <div class="col-md-4">
                            <h3>Origem: </h3>
                        </div>
                        <div class="col-md-8">
                            <div class="dropdown">
                                <button type="button" class="btn btn-primary dropdown-toggle btn-block"
                                        data-toggle="dropdown">
                                    Escolha o bairro
                                </button>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="#">Sao Judas</a>
                                    <a class="dropdown-item" href="#">Bueno</a>
                                    <a class="dropdown-item" href="#">Itatiaia</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <h3>Destino: </h3>
                        </div>
                        <div class="col-md-8">
                            <div class="dropdown">
                                <button type="button" class="btn disabled dropdown-toggle btn-block"
                                        data-toggle="dropdown">
                                    UFG - Campus 2
                                </button>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="tab-pane container fade" id="VoltarUFG">
                    <div class="row">
                        <div class="col-md-4">
                            <h3>Origem: </h3>
                        </div>
                        <div class="col-md-8">
                            <div class="dropdown">
                                <button type="button" class="btn disabled dropdown-toggle btn-block"
                                        data-toggle="dropdown">
                                    UFG - Campus 2
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <h3>Destino: </h3>
                        </div>
                        <div class="col-md-8">
                            <div class="dropdown">
                                <button type="button" class="btn btn-primary dropdown-toggle btn-block"
                                        data-toggle="dropdown">
                                    Escolha o bairro
                                </button>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="#">Sao Judas</a>
                                    <a class="dropdown-item" href="#">Bueno</a>
                                    <a class="dropdown-item" href="#">Itatiaia</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <button type="button" class="btn btn-success">
                Pesquisar
            </button>
        </div>
        <div class="col-md-2">
        </div>
    </div>
</div>

</body>
</html>