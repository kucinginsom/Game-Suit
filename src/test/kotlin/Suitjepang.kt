class Suitjepang {
    fun startGame() {
        print("Nama Kamu: ")
        val namaplayer = readLine()
        println("Mantap, $namaplayer !")

        print("Siapa lagi yang mau main: ")
        val namaPlayerdua = readLine()
        println("Jadinya $namaplayer vs $namaPlayerdua ya")

        print("$namaplayer pilih Batu, Gunting atau Kertas?: ")
        val playerchoice1 = readLine()
        when (playerchoice1) {
            "Batu" -> println("$namaplayer pilih Batu")
            "Gunting" -> println("$namaplayer pilih Gunting")
            "Kertas" -> println("$namaplayer pilih Kertas")
            else -> print("Butuh banget diajarin cara main gunting baru kertas hah?")
        }
        print("Sekarang $namaPlayerdua pilih, mau Batu, Gunting atau Kertas? Autowin inimah wkwkw ")
        val playerchoice2 = readLine()
        when (playerchoice2) {
            "Batu" -> println("$namaPlayerdua pilih Batu")
            "Gunting" -> println("$namaPlayerdua pilih Gunting")
            "Kertas" -> println("$namaPlayerdua pilih Kertas")
            else -> print("Yalord autowinpun masih salah")

        }
        if (playerchoice1 == "Batu" && playerchoice2 == "Batu") {
            println("Seri")
        }
        else if (playerchoice1 == "Batu" && playerchoice2 == "Kertas")
            println("$namaplayer kalah")
        else if (playerchoice1 == "Batu" && playerchoice2 == "Gunting")
            println("$namaplayer menang")
        else if (playerchoice1 == "Gunting" && playerchoice2 == "Kertas")
            println("$namaplayer menang")
        else if (playerchoice1 == "Gunting" && playerchoice2 == "Gunting")
            println("Seri")
        else if (playerchoice1 == "Gunting" && playerchoice2 == "Batu")
            println("$namaplayer kalah")
        else if (playerchoice1 == "Kertas" && playerchoice2 == "Kertas")
            println("seri")
        else if (playerchoice1 == "Kertas" && playerchoice2 == "Gunting")
            println("$namaplayer kalah")
        else if (playerchoice1 == "Kertas" && playerchoice2 == "Batu")
            println("$namaplayer menang")
    }
}
