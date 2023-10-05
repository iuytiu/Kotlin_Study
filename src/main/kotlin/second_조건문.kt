class second_조건문{
    var i = 10

    //9-1. Java if문 - if문 자체가 값으로 인식(식으로 치환불가 = 값 리턴불가)
    fun if문1(){
        if(i < 10){
            print("i는 10보다 크다")
        }else if(i > 10){
            print("i는 10보다 작다")
        }else {
            print("i는 10이다")
        }
    }

    //9-2. Kotlin if문 - if문을 식으로 사용가능(값 리턴)
    //When문으로 치환가능(단축기 : Alt + Shift)
    fun if문2(){
        var result1 = if(i < 10){
            print("i는 10보다 크다")
        }else if(i > 10){
            print("i는 10보다 작다")
        }else {
            print("i는 10이다")
        }
        print(result1)   //if문이 식으로 작성되었기 때문에 return값인 "i는 10이다" 출력됨
    }



    //10-1. when문(Java의 Select 구문과 유사하지만 더 강력함)
    fun when문1(){
        when{
            i < 10 -> {
                print("i는 10보다 크다")
            }
            i > 10 -> {
                print("i는 10보다 작다")
            }else -> {
                print("i는 10이다")
            }
        }
    }

    //10-2. when문 간략히
    fun when문2(){
        when{
            i < 10 -> print("i는 10보다 크다")
            i > 10 -> print("i는 10보다 작다")
            else -> print("i는 10이다")
        }
    }

    //10-3. when문 식으로 사용가능
    fun when문3() {
        var result2 = when {
            i < 10 -> {
                print("i는 10보다 크다")
            }i > 10 -> {
                print("i는 10보다 작다")
            }else -> {
                print("i는 10이다")
            }
        }
        print(result2)      //when문이 식으로 작성되었기 때문에 return값인 "i는 10이다" 출력됨

    }

    
    
    //11. 삼항연산자
    //i가 10보다 크다면 true를 반환하고 그렇지 않다면 false의 값을 반환해 result3에 넣어라
     val result3 = if(i > 10) true else false
}