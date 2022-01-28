//a singleton can be implemented using a companion object inside a class.

class Singleton {

    companion object {
        val instance = Singleton()
        fun test() = print("test\n")
    }

    fun printClassName() {
        print("Singleton\n")
    }

}