fun main() {
        // Square Variables
        val sqSide = 7
        val sqChar1 = "X  "
        val sqChar2 = "O  "

        for(outer in 1..sqSide){
            for (inner in 1..sqSide){
                if (inner % 2 == 0 && outer % 2 == 0 ||inner % 2 == 1 && outer % 2 == 1)  {
                    print(sqChar1)
                } else {
                    print(sqChar2)
                }
            }
            println()
        }

    println()

        // Triangle Variables
        val triRows = 10
        var triCount = 0
        var triRowLen = triRows
        val triChar1 = "/  "
        val triChar2 = "   "

        // Normal triangle
        for(utter in triRows downTo 1){
            triCount = 0
            while (triCount < triRowLen){
                triCount++
                print(triChar1)
            }
            println()
            triRowLen--
        }

        // Border Triangle (mute the normal triangle to run this)
        for(utter in triRows downTo 1){
            triCount = 0
            while (triCount < triRowLen){
                triCount++
                if (triCount != 1 && triCount != triRowLen && utter != triRows){
                    print(triChar2)
                } else {
                    print(triChar1)
                }
            }
            println()
            triRowLen--
        }
}