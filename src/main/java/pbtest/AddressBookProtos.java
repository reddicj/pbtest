// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package pbtest;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pbtest_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pbtest_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021addressbook.proto\022\006pbtest\032\023person/pers" +
      "on.proto\"4\n\013AddressBook\022%\n\006people\030\001 \003(\0132" +
      "\025.pbtest.person.PersonB\035\n\006pbtestB\021Addres" +
      "sBookProtosP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          pbtest.person.PersonProtos.getDescriptor(),
        });
    internal_static_pbtest_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pbtest_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pbtest_AddressBook_descriptor,
        new java.lang.String[] { "People", });
    pbtest.person.PersonProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}