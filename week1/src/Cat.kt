class Cat(val name: String, var age: Int, var weight: Int) {

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    public fun eat(amount: Int) : Boolean {
        if (weight + amount <= 20) {
            weight += amount
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}