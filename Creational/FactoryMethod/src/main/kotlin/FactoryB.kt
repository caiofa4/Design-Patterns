class FactoryB: AbstractFactory() {
    override fun factoryMethod(): AbstractObject {
        return ObjectB()
    }
}