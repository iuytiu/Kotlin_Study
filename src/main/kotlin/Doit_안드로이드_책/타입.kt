package Doit_안드로이드_책

import java.lang.Exception

//02. 타입

//======================================================================================================================

//1. 코틀린 기본(Primitive) 데이터 타입
//1-1. 2진수 표현
// Byte   용량 : 1, 저장가능범위 : -128 ~ 127

//1-2. 정수
// Short  용량 : 2, 저장가능범위 : -3만 2768 ~ 3만 2767
// Int    용량 : 4, 저장가능범위 : -21억 4748만 3648 ~ 21억 4748만 3647
// Long   용량 : 8, 저장가능범위 : -992경 3372조 0368억 5477만 5808 ~ 992경 3372조 0368억 5477만 5807

//1-3. 실수
// Float  용량 : 4, 저장가능범위 : 1.410-45 ~ 3.402823510308
// Double 용량 : 8, 저장가능범위 : 4.910-324 ~ 1.7976931...

//1-4. 문자 or 문자열
// Char     문자(숫자 제외) 1개 저장가능
// String   단어, 문장 등 문자열 저장가능

//1-5. 참 or 거짓
//Boolean   해당 조건에 대해 참(true)과 거짓(false)만 출력가능

//======================================================================================================================

//2. String - 문자열 타입
//2-1. 큰따움표에서 줄바꿈, 들여쓰기 유지 = \(역슬래시), 이스케이프 시퀀스 사용
val string1: String = "Hello \n World"

//2-2. 삼중따음표에서 줄바꿈, 들여쓰기
//삼중따움표 사용 시 .trimMargin() 자동 작성
//trimMargin() = 특정(ㅣ)문자열 앞부분 공백제거
val string2: String = """
    |Hello
    |World
""".trimMargin()

val string3: String = """Hello
    World
"""

//======================================================================================================================

//3. Any - 최상위 클래스(모든 타입의 데이터 할당가능)
val any_data1: Any = true          //Boolean 타입
val any_data2: Any = 10            //Int 타입
val any_data3: Any = '하'          //Char 타입
val any_data4: Any = "공부하자"     //String 타입

//======================================================================================================================

//4. Unit - 반환문이 없는 함수, 데이터 반환 외의 특수상황(함수반환) 표현
val unit_data: Unit = Unit

//4-1. Unit 타입사용
fun unit_data1(): Unit {    //실행결과  //10    //kotlin.Unit
    println(10)
}

//4-2. Unit 타입생략
//함수의 반환타입 생략 시 자동 Unit 타입적용
fun unit_data2(){       //실행결과  //20    //kotlin.Unit
    println(20)
}

//======================================================================================================================

//5. Nothing - 반환값은 존재하지만 의미있는 값은 아님
//5-1. 항상 null값을 반환할 경우
fun nothing_data1(): Nothing? {
    return null
}

//5-2. 예외를 던지는 함수의 반환타입을 지정할 경우
fun nothing_data2(): Nothing {
    throw Exception()
}

//======================================================================================================================

//6-1. 불허용(not null)
fun null_불허용(){
    var not_null_data: Int = 10
    //not_null_data = null      //에러(null 대입불가)
}

//6-2. 널허용(nullable)
fun null_널허용(){
    var nullable_data: Int? = 10
    nullable_data = null        //성공(null 대입가능)
}

//======================================================================================================================

//7. 함수선언
//7-1. fun - 함수선언 키워드
//7-2. 함수의 반환타입 생략 시 Unit타입 자동적용
//7-3. 함수의 매개변수(함수 안에서는) var, val 사용불가
//fun 함수선언(매개변수명: 타입){  //7-4.함수 안에서 매개변수 변경불가  }

//7-5. 매개변수 기본값 선언가능

fun 매개변수_기본값_선언(fun_data1: Int = 10, fun_data2: Int = 20): Int {
    return fun_data1 or fun_data2
}

//7-6. some : 함수에서 사용하는 매개변수에 지정한 대입
fun some(fun_data3: Int, fun_data4: Int) {
    println(some(10, 20))
}

//======================================================================================================================

//8. 컬렉션 타입 - 여러 개의 데이터를 표현하는 방법(Array, List, Set, Map)
//8-1. Array
fun 컬렉션_Array(){
    val 컬렉션_Array: Array<Int> = Array(3){0}     //컬렉션_Array = [0, 0, 0]
}

//8-2. arrayOf
fun 컬렉션_arrayOf(){
    val 컬렉션_arrayOf1: Array<Int> = arrayOf(1, 2, 3)  //컬렉션_arrayOf = [1, 2, 3]
    val 컬렉션_arrayOf2 = arrayOf(1, 2, 3)  //컬렉션_arrayOf = [1, 2, 3]
}

//8-2. 컬렉션 타입 클래스(Collection를 인터페이스 타입으로 표현) = List, Set, Map
//List : 순서있는 데이터 집합(데이터 중복허용)
//Set : 순서없는 데이터 집합(데이터 중복 불허용)
//Map : 키, 값으로 이뤄진 순서없는 데이터 집합(키 중복 불허용)

//8-3.컬렉션 타입 클래스, 불변클래스(immutable) - 초기데이터 대입 후 데이터 변경불가 타입
//size, get 함수만 이용가능 = List(listOf()), Set(setOf()), Map(mapOf())
fun 불변리스트(){
    var var_list = listOf<Int>(10, 20, 30)

    //size - 배열크기 구하기
    var_list.size
    println(var_list.size)

    //get - 배열값 구하기
    println(var_list[0])
    println(var_list.get(1))
}

//8-4.컬레션 타입 클래스, 가변클래스(mutable) - 초기데이터 대입 후 데이터 추가, 변경가능 타입
//size, get, add, set 함수 이용가능 = mutableList(mutableListOf()), mutableSet(mutableSetOf()), mutableMap(mutableMapOf())
fun 가변리스트(){
    var var_mutableList = mutableListOf<Int>(10, 10, 20, 30)

    //size - 배열크기 구하기
    var_mutableList.size
    println(var_mutableList.size)

    //get - 배열값 구하기
    println(var_mutableList.get(1))

    //add - 배열값 추가
    var_mutableList.add(4, 40)
    println(var_mutableList.get(4))

    //set - 배열값 변경
    var_mutableList.set(0, 0)
    println(var_mutableList[0])
}

//8-5. Map **
//키(key)와 값(value)으로 이뤄진 데이터 집합
fun main함수_사용하기(){
    //키, 값을 Pair 객체로 이용하기
    var var_map1 = mapOf<String, String>(Pair("first", "Hello"))

    //'키 to 값' 형태로 이용하기
    var var_map2 = mapOf<String, String>("second" to "world")
}

//======================================================================================================================
