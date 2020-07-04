fun main(){
    val syntaxx = DifSyntax()
    val javaVar = JavaSyntax()
    val kotlinVar = KotlinSyntax()

    println("Different Syntax between Java and Kotlin \n")

    syntaxx.namaBhsProgmSyntax(javaVar)
    syntaxx.tipeDataSyntax(javaVar)
    syntaxx.tipeArraySyntax(javaVar)
    syntaxx.tipePerulanganSyntax(javaVar)
    println()
    syntaxx.namaBhsProgmSyntax(kotlinVar)
    syntaxx.tipeDataSyntax(kotlinVar)
    syntaxx.tipeArraySyntax(kotlinVar)
    syntaxx.tipePerulanganSyntax(kotlinVar)
}