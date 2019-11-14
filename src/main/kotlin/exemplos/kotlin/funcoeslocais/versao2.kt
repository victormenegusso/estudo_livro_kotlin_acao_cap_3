package exemplos.kotlin.funcoeslocais

fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Usuário: ${user.id} esta com $fieldName vazio")
        }
    }

    validate(user.name, "Nome")
    validate(user.address, "Endereco")

    // salva no banco
}