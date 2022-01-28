fun main() {

    var abstractFactory: AbstractFactory

    abstractFactory = FactoryA()
    abstractFactory.printObjectName()

    abstractFactory = FactoryB()
    abstractFactory.printObjectName()
}