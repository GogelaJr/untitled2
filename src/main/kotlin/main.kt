fun main() {
    val f1 = Fraction(1F, 3F)


    val f2 = Fraction(2F, 6F)

    println(f1==f2)
    println(f1+f2)
    println(f1 * f2)

}


class Fraction(n1 : Float, d1: Float) {
    private var numerator: Float = n1
    private var denominator: Float = d1

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if(numerator * other.denominator/denominator ==  other.numerator){
                return true
            }
        }
        return false
        }
    override fun toString(): String {
        return "$numerator/$denominator"
    }

    operator fun plus(other: Any): Float {
        val a = 2 * (numerator/denominator )
        if (other is Fraction) {
            val b = (a + other.numerator/other.denominator)
            return b
        }
        return 3F
    }

    operator fun times(other: Any?): Float {
        if (other is Fraction){
            val a = (numerator * other.numerator)
            val b = (denominator * other.denominator)
            val c = (a/b)
            return (c)
        }
        return 5f

    }

}