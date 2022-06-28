fun main(){
    initiazeGame()
    println("Pilihan: ")
    val pilihan = readLine() ?: "0"
    chooseGame(pilihan)
}

fun initiazeGame(){
    var gameSuit = arrayListOf<String>("Hopimpa", "Suit Jepang", "Suit Standar")
    println("==========================")
    println("GAMETERMINAL VERSION");2
    println("==========================")
    println("Pilih Game:")
    for((index, suit) in gameSuit.withIndex()){
        println((index+1).toString()+".  "+suit)
    }
}

fun chooseGame(pilihan: String = "0"){
    when(pilihan){
        "1","hopimpa" -> {
            val hopimpa = Hopimpa()
            hopimpa.startGame()
        }
        "2", "Suit Jepang" -> {
            val suitjepang = Suitjepang()
            suitjepang.startGame()
        }

        else -> {
            println("Game lain belum terdaftar.")
        }
    }
}