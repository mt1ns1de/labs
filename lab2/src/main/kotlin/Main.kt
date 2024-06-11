open class Product(val name: String, val price: Double) {
    open fun calculateCost(quantity: Int): Double {
        return price * quantity
    }
}

class Grocery(name: String, price: Double) : Product(name, price) {
    fun displayInfo(quantity: Int) {
        println("Продукти: $name, Ціна за одиницю: $price, Кількість: $quantity, Загальна вартість: ${calculateCost(quantity)}")
    }
}

class Electronics(name: String, price: Double) : Product(name, price) {
    fun displayInfo(quantity: Int) {
        println("Електроніка: $name, Ціна за одиницю: $price, Кількість: $quantity, Загальна вартість: ${calculateCost(quantity)}")
    }
}

class Clothing(name: String, price: Double) : Product(name, price) {
    fun displayInfo(quantity: Int) {
        println("Одяг: $name, Ціна за одиницю: $price, Кількість: $quantity, Загальна вартість: ${calculateCost(quantity)}")
    }
}

fun main() {
    val grocery = Grocery("Лук", 2.5)
    val electronics = Electronics("Смартфон", 8200.0)
    val clothing = Clothing("Сорочка", 540.0)

    grocery.displayInfo(5)
    electronics.displayInfo(2)
    clothing.displayInfo(4)
}
