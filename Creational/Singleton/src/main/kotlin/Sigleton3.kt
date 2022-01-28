//a singleton can be implemented using a companion object inside a class.

class Singleton3 {

    companion object {
        private var sing: Singleton3? = null
        fun getInstance(): Singleton3 {
            if (sing == null) {
                sing = Singleton3()
            }
            return sing as Singleton3
        }
    }

    fun printClassName() {
        print("Singleton 3\n")
    }

}