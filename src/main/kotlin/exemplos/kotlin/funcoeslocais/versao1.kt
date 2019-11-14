package exemplos.kotlin.funcoeslocais

fun saveUser(user: User) {
    if(user.name.isEmpty()) {
        throw IllegalArgumentException("Usuário: ${user.id} esta com nome vazio")
    }
    if(user.address.isEmpty()) {
        throw IllegalArgumentException("Usuário: ${user.id} esta com endereço vazio")
    }

    // salva no banco
}