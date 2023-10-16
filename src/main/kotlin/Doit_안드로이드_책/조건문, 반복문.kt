package Doit_안드로이드_책

//03. 조건문, 반목문

//======================================================================================================================

//프로그램 흐름제어에 가장 많이 사용
//1-1. if ~ else문
fun if_else문(){
    var var_data1 = 10

    if(var_data1 > 0){
        println("var_data1은 0보다 크다")
    }else if(var_data1 < 20) {
        println("var_data1은 20보다 작다")
    }else {
        (var_data1 == 10)
        println("var_data1은 10과 같다")
    }
}

//1-2. if ~ else문을 표현식으로(else 생략불가)
fun if_else_표현식(){
    var var_data2 = 10
    val val_result = if (var_data2 > 0){
        println("var_data2는 0보다 크다")
        true
    } else {
        println("var_data2는 0보다 작다")
        false
    }
    println(val_result)
}

//======================================================================================================================

//2-1. when문
fun when문1(){
    var var_data3 = "when문"
    when(var_data3){
        "if ~ else문" -> println("var_data3는 if ~ else문")
        "when문" -> println("var_data3는 when문")
        else -> {
            println("var_data3는 해당하는 조건문 없음")
         }
    }
}

//2-2. 다양한 데이터 타입, 범위 명시가능
//is - 타입확인 연산자
//in - 범위 지정 연산자
fun when문2(){
    var var_data4: Any = 10
    when (var_data4){
        is String -> println("var_data4는 String이다")
        20, 30-> println("var_data4가 20 or 30이다")
        in 1..10 -> println("var_data4는 1 ~ 10에 포함된다")
        else -> println("var_data4는 알수없다")
    }
}

//2-3. when문 조건만 명시(데이터 명시안함)
fun when3문(){
    var var_data5 = 10
    when {
        var_data5 <= 0 -> println("var_data5는 0보다 작거나 크다")
        var_data5 > 100 -> println("var_data5는 100보다 크다")
        else -> println("var_data5를 알수없다")
    }
}

//2-4. when문을 표현식으로(else 생략불가)
fun when문4(){
    var var_data6 = 10
    val result = when {
        var_data6 <= 0 -> "var_data6는 0보다 작거나 같다"
        var_data6 > 100 -> "var_data6은 100보다 크다"
        else -> "var_data6은 알수없다"
    }
    println(result)
}

//======================================================================================================================

//제어 변숫값을 증감하면서 특정 조건이 참일 때까지 구문반복 실행
//3-1. for문 - 조건을 데이터 값으로 표시
fun for문1(){
    var var_data7: Int = 0
    for (i in 1..10){
        var_data7 += i
    }
    println(var_data7)
}

//3-2. 컬렉션 타입의 데이터 갯수만큼 for문 반복시키기(증감조건 숫자명시 안함)
//indices : 컬렉션 타입의 인덱스값 의미
fun for문2(){
     var var_data8 = arrayOf<Int>(1, 2, 3)
    for (i in var_data8.indices){
        println(var_data8[i])
    }
}

//3-3. withIndx 사용해서 for문 돌리기
//withIndex : 인덱스(키, key)와 실제데이터(값, value)를 함께 가져오기
fun for3문(){
    var var_data9 = arrayOf<Int>(1, 2, 3)
    for ((index, value) in var_data9.withIndex()){
        println("${index}, ${value}")
    }
}

//======================================================================================================================

//4. while문
fun while문(){
    var var_data10 = 0
    var sum = 0
    while (var_data10 < 10){
        sum += ++var_data10
    }
    println(var_data10)
}

//======================================================================================================================

//5. 증감연산자 사용법
fun 증감연산자(){
    //1씩 증가
    for(i in 1..10) {}

    //1씩 증가(맨 마지막 숫자는 증가제외)
    for(i in 1 until 10) {}

    //1씩 감소
    for(i in 10 downTo 1) {}

    //2씩 증가
    for(i in 2..10 step 2) {}
}

//======================================================================================================================