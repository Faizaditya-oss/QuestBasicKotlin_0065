fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
}

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

    println()
println("=== CONDITIONAL EXPRESSIONS ===")

// If expression
val score = 85

if (score >= 75) {
    println("Nilai: $score")
    println("Keterangan: Lulus")
} else {
    println("Nilai: $score")
    println("Keterangan: Tidak Lulus")
}

// When expression
val gradeResult = "A"

when (gradeResult) {
    "A" -> println("Grade A: Sangat Baik")
    "B" -> println("Grade B: Baik")
    "C" -> println("Grade C: Cukup")
    else -> println("Grade tidak diketahui")
}

println()
println("=== RANGES ===")

print("1..4: ")
for (number in 1..4) {
    print("$number ")
}
println()

print("1..<4: ")
for (number in 1..<4) {
    print("$number ")
}
println()

print("4 downTo 1: ")
for (number in 4 downTo 1) {
    print("$number ")
}
println()

print("1..5 step 2: ")
for (number in 1..5 step 2) {
    print("$number ")
}
println()

print("'a'..'d': ")
for (letter in 'a'..'d') {
    print("$letter ")
}
println()

print("'z' downTo 's' step 2: ")
for (letter in 'z' downTo 's' step 2) {
    print("$letter ")
}
println()

    println()
    println("=== LOOPS ===")

    // For loop
    println("For loop:")
    for (number in 1..5) {
        print("$number ")
    }
    println()

    // While loop
    println("While loop:")
    var counter = 1

    while (counter <= 5) {
        print("$counter ")
        counter++
    }
    println()

    // Do-while loop
    println("Do-while loop:")
    var number = 1

    do {
        print("$number ")
        number++
    } while (number <= 5)

    println()

        println()
    println("=== FUNCTIONS ===")

    // Function dengan parameter dan return
    val result = sum(10, 20)
    println("Hasil sum(10, 20): $result")

    // Named arguments
    printMessageWithPrefix(
        prefix = "Log",
        message = "Belajar Kotlin"
    )

    // Default parameter
    printMessageWithPrefix("Hello")

    // Function tanpa return
    printMessage("Ini adalah function tanpa return")

        println()
    println("=== LAMBDA EXPRESSIONS ===")

    // Lambda expression
    val sumLambda = { x: Int, y: Int -> x + y }

    println("Hasil lambda: ${sumLambda(10, 20)}")
}

