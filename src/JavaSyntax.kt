open class JavaSyntax : DifSyntaxCallBack {

    private var doSyntax = true

    override fun namaBhsProgm() {
        println("Java Language")
    }

    override fun tipeData() {
        if (doSyntax){
            println("int number = 2 ")
        } else{
            println("val number:Int =2 ")
        }
    }

    override fun tipeArray() {
        if (doSyntax){
            println("int[] age = {22,23,24}  ")
        } else{
            println("val age = intArrayOf(23,24,25)")
        }
    }

    override fun tipePerulangan() {
        if (doSyntax){
            println("int[] number = {1,2,3,4,5}; ")
            println("for (int i=0; i < number.length; i = i++) ")
        } else{
            println("val number = intArrayOf(1,2,3,4,5)  ")
            println("for (i in number.indices)")
        }
    }
}