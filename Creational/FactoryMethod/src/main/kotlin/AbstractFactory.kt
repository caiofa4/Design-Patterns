abstract class AbstractFactory {

    abstract fun factoryMethod(): AbstractObject

    fun printObjectName() {
        val factoryObject = factoryMethod()
        factoryObject.printObjectName()
    }


}