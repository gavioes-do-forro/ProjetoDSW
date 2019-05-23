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
                            <a class="nav-link" href="index.jsp">Procurar Caronas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Registrar Carona</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="pesquisacaronas.jsp">Minhas Caronas</a>
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
        <div class="col-sm-4">
            <h2 class="text-center">Motorista</h2>
            <img class="img-fluid mx-auto d-block" src="imagens/avatar-male.png" alt="Imagem motorista" style="width:80%">
                <h5 class="text-center">Nome: Joao Silva</h5>
                <h5 class="text-center">Vinculo com a faculdade: Discente</h5>
        </div>
        <div class="col-sm-5">
            <div class="container" style="margin-top:25%">
                <h2 class="text-center">Carona</h2>
                <br>
                <h5>Horario: aproximadamente as 18:00</h5>
                <h5>Origem: Bueno</h5>
                <h5>Destino: UFG - Campus 2</h5>
                <button type="button" class="btn btn-success btn-block">
                    Aceitar Carona
                </button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
