private val gameSuit = arrayListOf<String>("Hopimpa", "Suit Jepang", "Suit Standar")
fun main(){
    initiazeGame()
    print("Pilihan: ")
    val pilihan = readLine() ?: "0"
    chooseGame(pilihan)
}
fun initiazeGame(){
    println("==========================")
    println("GAMETERMINAL VERSION")
    println("==========================")
    println("Pilih Game:")
    for((index, suit) in gameSuit.withIndex()){
        println((index+1).toString()+".  "+suit)
    }
}
fun chooseGame(pilihan: String = "0"){
    when(pilihan.lowercase()){
        "1","hopimpa" -> {
            val hopimpa = Hopimpa(gameSuit[0])
            hopimpa.startGame()
        }
        "3", "Suit Standar" -> {
            val suitStandar = SuitStandar(gameSuit[2])
            suitStandar.startGame()
        }
        else -> {
            println("Game lain belum terdaftar.")
        }
    }
}