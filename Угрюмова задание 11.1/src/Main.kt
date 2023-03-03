fun main(){
    var answer: String
    while(true){
        println("выберите класс с которым хотите работать: Day или Color?")
        answer = readLine().toString()
        if(answer == "Цвет" || answer == "День") break
    }
    when(answer){
        "Цвет" ->{
            var Color: Colors = Colors.

        }
        "День" ->{
            var Day: Days = Days.Пятница
            Day.NumberDays()
            Day.WeekWorks()
            println(Day.PastDay())
            println(Day.RandomDay())
        }
    }
}