<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
        <title>Cadastro de Usuário</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- Estilo customizado -->
        <link rel="stylesheet" href="/styles.css">
        <!-- Opcional: jQuery e Popper.js para Bootstrap JS -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>

    <body>

        <div class="container mt-5">
            <h2 class="mb-4 text-center">Formulário de Cadastro de Usuário</h2>
            <div class="form-box">
                <form action="/register" method="post">
                    <div class="form-group">
                        <label for="name">Nome</label>
                        <input type="text" class="form-control" id="name" name="name" required>
                    </div>
                    <div class="form-group">
                        <label for="email">E-mail</label>
                        <input type="email" class="form-control" id="email" name="email" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Senha</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Cadastrar</button>
                </form>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="userRegisteredModal" tabindex="-1" role="dialog"
            aria-labelledby="userRegisteredModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="userRegisteredModalLabel">Usuário Registrado!</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        O ID do usuário registrado é: <strong>${userId}</strong>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                    </div>
                </div>
            </div>
        </div>

        <script>
            // Verifica o parâmetro userId na URL e exibe o modal se estiver presente.
            $(document).ready(function () {
                var urlParams = new URLSearchParams(window.location.search);
                var userId = urlParams.get('userId');
                if (userId) {
                    $('#userRegisteredModal').modal('show');
                    $(".modal-body strong").text(userId);
                }
            });

            $('#userRegisteredModal').on('hidden.bs.modal', function (e) {
                window.location.href = "/";
            });
        </script>

    </body>

    </html>