fun main() {

    println("=== BASIC KOTLIN ===")
    println("Subbab: WHAT ?")
    println()

    // Basic output
    println("Hello, world!")

    // Variables
    val name = "Faiz Aditya"
    var age = 20

    println()
    println("Nama: $name")
    println("Umur: $age")

    // Mengubah nilai var
    age = 21
    println("Umur setelah diubah: $age")

    // String template
    val customers = 10
    println("Jumlah customer: $customers")
    println()
    println("=== TIPE DATA DASAR ===")

    // Integer
    val byteValue: Byte = 10
    val shortValue: Short = 100
    val intValue: Int = 1000
    val longValue: Long = 100000L

    // Floating-point
    val floatValue: Float = 3.14f
    val doubleValue: Double = 3.141592

    // Boolean
    val isStudent: Boolean = true

    // Character
    val grade: Char = 'A'

    // String
    val university: String = "Universitas"

    println("Byte: $byteValue")
    println("Short: $shortValue")
    println("Int: $intValue")
    println("Long: $longValue")
    println("Float: $floatValue")
    println("Double: $doubleValue")
    println("Boolean: $isStudent")
    println("Char: $grade")
    println("String: $university")

        println()
    println("=== COLLECTION ===")

    // List
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("List: $readOnlyShapes")
    println("Item pertama: ${readOnlyShapes.first()}")
    println("Item terakhir: ${readOnlyShapes.last()}")
    println("Jumlah item: ${readOnlyShapes.count()}")
    println("Apakah circle ada? ${"circle" in readOnlyShapes}")

    // Mutable List
    val shapes = mutableListOf("triangle", "square", "circle")
    shapes.add("rectangle")
    println("Mutable List setelah ditambah: $shapes")
    shapes.remove("square")
    println("Mutable List setelah dihapus: $shapes")

    // Set
    val fruits = setOf("apple", "banana", "cherry", "cherry")
    println("Set: $fruits")
    println("Jumlah item unik: ${fruits.count()}")
    println("Apakah apple ada? ${"apple" in fruits}")

    // Map
    val juiceMenu = mapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )

    println("Map: $juiceMenu")
    println("Harga apple juice: ${juiceMenu["apple"]}")
    println("Jumlah menu: ${juiceMenu.count()}")
    println("Apakah apple tersedia? ${juiceMenu.containsKey("apple")}")
}

