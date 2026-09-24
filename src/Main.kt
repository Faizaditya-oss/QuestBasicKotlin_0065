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
}
}
