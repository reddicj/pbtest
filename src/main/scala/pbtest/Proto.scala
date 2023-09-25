package pbtest

import java.io.FileOutputStream
import java.io.FileInputStream
import scala.jdk.CollectionConverters.*
import pbtest.person.Person
import pbtest.person.Person.PhoneNumber
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;

@main def hello() =

  val person      = createPerson(123, "James", "reddicj@gmail.com", List("999"))
  val person2     = createPerson(456, "Tom", "tom@yahoo.com", List("667"))
  val addressBook = createAddressBook(List(person, person2))

  println("Write data as pb to test.bin")
  val fos = new FileOutputStream("persons.bin")
  person.writeDelimitedTo(fos)
  person2.writeDelimitedTo(fos)
  // person.writeTo(fos)
  // person2.writeDelimitedTo(fos)
  fos.close()

  // println("Read data as pb from test.bin")
  // val fis  = new FileInputStream("test.bin")
  // val read = AddressBook.parseFrom(fis)
  // fis.close()
  // println(read.toString())

  println("Read data")
  val fis = new FileInputStream("persons.bin")
  try
    while (true) do
      val read = Person.parseDelimitedFrom(fis)
      if read == null then throw new Exception("EOF")
      println(read.toString())
  catch case e: Exception => ()
  finally fis.close()

def createAddressBook(people: List[Person]): AddressBook =
  val addressBookBuilder = AddressBook.newBuilder()
  addressBookBuilder.addAllPeople(people.asJava)
  addressBookBuilder.build()

def createPerson(
  id: Int,
  name: String,
  email: String,
  phoneNumbers: List[String]
): Person =

  def createPhone(phoneNumber: String): PhoneNumber =
    val phoneBuilder = Person.PhoneNumber.newBuilder()
    phoneBuilder.setType(Person.PhoneType.MOBILE)
    phoneBuilder.setNumber(phoneNumber)
    phoneBuilder.build()

  val timestamp = Timestamps.fromSeconds(System.currentTimeMillis() / 1000)

  val personBuilder = Person.newBuilder()
  personBuilder.setId(id)
  personBuilder.setName(name)
  personBuilder.setEmail(email)
  personBuilder.setDob(timestamp)
  phoneNumbers.foreach(x => personBuilder.addPhones(createPhone(x)))
  personBuilder.build()
