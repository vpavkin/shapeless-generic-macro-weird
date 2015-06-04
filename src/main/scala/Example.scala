import shapeless._

sealed trait Root
case class A(a: Int) extends Root

object Root {
  implicit val g = Generic[Root]
}
