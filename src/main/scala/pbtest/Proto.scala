package pbtest

import java.io.FileOutputStream
import java.io.FileInputStream

@main def hello() =

  val personBuilder = Person.newBuilder().nn
  personBuilder.setId(123)
  personBuilder.setName("James")
  personBuilder.setEmail("reddicj@gmail.com")
  val phoneBuilder = Person.PhoneNumber.newBuilder().nn 
  phoneBuilder.setType(Person.PhoneType.MOBILE)
  phoneBuilder.setNumber("999")
  personBuilder.addPhones(phoneBuilder)
  val person = personBuilder.build().nn

  println("Write person data as pb to test.bin")
  val fos = new FileOutputStream("test.bin")
  person.writeTo(fos)
  fos.close()
  println(person.toString())

  println("Read person data as pb from test.bin")
  val fis  = new FileInputStream("test.bin")
  val read = Person.parseFrom(fis).nn
  fis.close()
  println(read.toString())
