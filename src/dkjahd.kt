import kotlin.test.assertEquals

class HappyMap<K, V>(val map : MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map{
    override fun get(key: K): V? {
        return map.get(key).apply {
            println("It's value $this")
        }
    }
    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply {
            if (this == null) {
                println("Yay! $key")
            }
        }
    }
}

fun main() {
    HappyMap(mutableMapOf(Pair(4, 2))).apply { put(3, 2) }[4]

    val someAnimal = UncertainAnimal()
    println(someAnimal.makeSound())

    someAnimal.makeSound = fun () {
        println("Woof!")
    }

    println(someAnimal.makeSound())
}

class UncertainAnimal {
    var makeSound = fun () {
        println("Meow!")
    }
}

interface newInterface {
    fun example(): Int {
        val dd = 3
        return dd
    }
}

