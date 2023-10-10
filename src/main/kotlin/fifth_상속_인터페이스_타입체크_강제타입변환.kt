//오버라이드 불가(기본 상속)
//abstract class Animal(){
//    fun move(){
//        println("움직이는 동물")
//    }
//}

//클래스() = 기본생성자 호출(중요)
//class Dog : Animal()

//Java에서 오버로드 = 열려있음 = 자유롭게 작성가능, 허용
//Kotlin에서 오버로드 = 닫혀있음 = 기본적으로 사용불가
//일반 클래스는 상속불가 -> open을 붙여 열어줘야 상속가능
//오버라이드 가능
abstract class Animal(){
    open fun move(){
        println("움직이는 동물")
    }
}

//오버라이드 수행한 기본생성자
class Cat1 : Animal(){
    override fun move() {
        //super.move()
        println("야옹, 고양이")
    }
}

class Dog1 : Animal(){
    override fun move() {
        //super.move()
        println("멍멍, 강아지")
    }
}


//===================================================================


//인터페이스(클래스 뒤에 , 찍고 계속 추가가능 )
interface Eat{
    fun eat()
}


class Cat2 : Animal(), Eat{
    override fun move() {
        //super.move()
        println("야옹, 고양이")
    }

    //인터페이스 구현(오버라이드까지 실행)
    override fun eat() {
        TODO("Not yet implemented")
    }
}

class Dog2 : Animal(), Eat{
    override fun move() {
        //super.move()
        println("멍멍, 강아지")
    }

    //인터페이스 구현(오버라이드까지 실행)
    override fun eat() {
        TODO("Not yet implemented")
    }
}


//==============================================================


fun main(){
    val dog = Dog2()
    val cat : Animal = Cat2()
    
    //is = 타입체크
    //타입체크1 = 타입이 맞을 때(굳이 할 필요없는 부분타입체크)
    if(dog is Dog2){
        //dog.move() dog.eat() = 둘 다 사용가능
        println("멍멍, 강아지가 맞다")
    }

    //타입체크2 = 타입이 맞을 때
    if(cat is Animal){
        //cat.move() = 사용가능
        //cat.eat() = 타입이 맞지 않기 때문에 사용불가
        println("야옹, 고양이가 맞다")
    }
    
    //타입체크3 = 타입이 맞을 때
    if(cat is Cat2){
        //cat.move() cat.eat() = 둘 다 사용가능
        println("야옹, 고양이가 맞다")
    }

    //타입체크4 = 타입이 틀릴 때
    if(cat is Dog2){
        println("고양이가 맞는가?")
    }
    
    //==============================================================
    //as = 강제 타입변환
    //타입이 맞지 않을 경우 = ClassCastException 발생
    
    //cat as Dog2
    //if(dog is Dog2){
    //    println("멍멍이가 맞다")
    //}

}