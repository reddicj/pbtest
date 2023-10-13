package pbtest

import java.io.FileOutputStream
import java.io.FileInputStream
import scala.jdk.CollectionConverters.*
import pbtest.person.Person
import pbtest.person.Person.PhoneNumber
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;

@main def run2() =

  val person  = createPerson(123, "James", "reddicj@gmail.com", List("999"))
  val person2 = createPerson(456, "Tom", "tom@yahoo.com", List("667"))

  println("Write data")
  val fos = new FileOutputStream("data-delimited.bin")
  person.writeDelimitedTo(fos)
  person2.writeDelimitedTo(fos)
  fos.close()

  println("Read data")
  val fis = new FileInputStream("data-delimited.bin")
  try
    while (true) do
      val read = Person.parseDelimitedFrom(fis)
      if read == null then throw new Exception("EOF")
      println(read.toString())
  catch case e: Exception => ()
  finally fis.close()
