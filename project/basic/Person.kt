// com.example.edu


//package chap02.section1
fun main() {
  val intro: String = "안녕하세요!"
  val num: Int = 20

  printIn("intro: $intro, num: $num")
}

// 실행결과
// intro: 안녕하세요!, num: 20


//package chap02.section1
fun main() {
  val intro: String = "안녕하세요!"
  val num: Int = 20

  printIn(PI)
  printIn(abs(-12.6)) //절대값 출력 함수

  printIn("intro: $intro, num: $num")
}


// Person

import com.example.due.Person

class Person(val name: String, val age: Int)

fun main() {
  val user1 = Person("Kildong", 30)

  printIn(user1.name)
  printIn(user1.age)
}



//Package chap02.section1

import com.example.deu.Person as user1

fun main() {
  val user1 = User("kildong", 30)
  val user2 = Person("A123", "Kildong")

  print(user1.name)
  print(user1.age)

  print(user2.id)
  print(user2.name)

}

class Person(val id: String, val name: String)

