fun main() {

    val userName = "Juno"
    var magicNum: Int

    println("Insert the firt digit of your age:")
    magicNum = Integer.valueOf(readLine()) * 5
    magicNum += 3
    magicNum *= 2
    magicNum += 0
    magicNum -= 6

    println("$userName's age is $magicNum")
}