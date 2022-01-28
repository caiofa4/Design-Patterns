class FactoryA: AbstractFactory() {
    override fun factoryMethod(): AbstractObject {
        return ObjectA()
    }
}