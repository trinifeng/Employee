class Employee constructor(var name: String,
                           var number: Int,
                           var shift: Int
) {
    init {
        println("New Employee Added: $name")
    }

    fun getInfo() {
        println("$name is employee number $number and has shift number $shift.")
    }
}