package scala.DemoOops

class Dog(name:String,breed:String,age:Int,color:String) {
  println("My name is "+name+"my bread is:"+breed)

}
object  Main{
 def main(args: Array[String]): Unit = {
   var obj=new Dog("tuffy","puppy",23,"white")
 }
}
