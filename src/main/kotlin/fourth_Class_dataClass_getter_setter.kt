fun main(){
    val suJin1 = Person("suJin", 21)
    val suJin2 = Person("suJin", 21)

    println(suJin1)
    println(suJin2)
    println(suJin1.equals(suJin2))
    println(suJin1.hobby)
}


//간단한 기본생성자 작성방법 = 작성내용은 suJin1와 suJin2는 같지 않은 내용으로 인식됨
//접근제한자가 없는 경우 = public(기본설정, 생략가능), 값 수정, 접근가능
//                     private(접근불가), 값 수정불가, getter 작성 필요없음
//결과 = Person@7ef20235 / Person@27d6c5e0 / false
//val -> suJin.name 수정불가
//var -> suJin.age 수정가능
//class Person (
//    val name: String,
//    var age: Int
//)


//간단하게 클래스 정의하기***************
//작성내용은 suJin1와 suJin2는 같은 내용으로 인식됨 = data(toString 재정의 필요없음)
//결과 = Person(name=suJin, age=21) / Person(name=suJin, age=21) / true
//data class Person (
//    val name: String,
//    var age: Int
//)


//기본생성자 + 추가 작성내용 = 생성 시마다 init 코드 실행
data class Person(
    val name: String,
    val age: Int
){
    //변수작성 가능
    var hobby = "축구"
        //getter 작성(재정의) = $field를 통해 hobby에 접근해 값 변경
        private set get() = "취미 : $field"
    init{
        println("생성자 1개 마다 init 코드 실행")
    }
    //init 밑에 메소드 작성가능
    fun some(){
        hobby = "농구"
    }
}