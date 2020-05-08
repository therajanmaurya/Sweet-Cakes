fun main() {

    Dragon("Zolranyrth, the Fast")
//    val color = "RED"
//    val result = if(color === "RED") {
//        println("The color is red")
//        14
//        "Kotlin is awesome"
//        1
//    } else {
//        "The color is not red"
//        13
//    }
//
//    println(result)

}

class Dragon {
    var title = "zolraynthm , the Dark".also (::println )

    constructor(title: String) {
        this.title = title
    }

    init {
        println(title)
    }


}