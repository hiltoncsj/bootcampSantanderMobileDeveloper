package one.digitalinnovation.collections

class Repository<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value
    }

    fun findById(id: String) = map[id]

    fun remover(id: String) = map.remove(id)

    fun findAll() = map.values

}