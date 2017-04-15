
package collections

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Matchers
import org.scalatest.FlatSpec
import ListSort._

@RunWith(classOf[JUnitRunner])
class ListSortSuite extends FlatSpec with Matchers {
  it should "sort the empty list" in {
    isort(Nil) shouldBe Nil
  }

  it should "sort List(1,4,5,2,3,7)" in {
    isort(List(1, 4, 5, 2, 3, 7)) shouldBe List(1, 2, 3, 4, 5, 7)
  }

  it should "insert into the empty list" in {
    insert(0, Nil) shouldBe List(0)
  }

  it should "insert 2 into List(1,3) " in {
    insert(2, List(1, 3)) shouldBe List(1, 2, 3)
  }

}
