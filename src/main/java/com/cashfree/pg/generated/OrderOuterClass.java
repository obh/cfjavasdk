// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.cashfree.pg.generated;

public final class OrderOuterClass {
  private OrderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cashfree_pg_generated_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cashfree_pg_generated_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cashfree_pg_generated_CustomerDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cashfree_pg_generated_CustomerDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\022\031com.cashfree.pg.generated" +
      "\"\253\001\n\005Order\022\017\n\002id\030\001 \001(\tH\000\210\001\001\022\024\n\014order_amo" +
      "unt\030\002 \001(\001\022\033\n\016order_currency\030\003 \001(\tH\001\210\001\001\022D" +
      "\n\020customer_details\030\004 \001(\0132*.com.cashfree." +
      "pg.generated.CustomerDetailsB\005\n\003_idB\021\n\017_" +
      "order_currency\"V\n\017CustomerDetails\022\023\n\013cus" +
      "tomer_id\030\001 \001(\t\022\026\n\016customer_email\030\002 \001(\t\022\026" +
      "\n\016customer_phone\030\003 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_cashfree_pg_generated_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_cashfree_pg_generated_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cashfree_pg_generated_Order_descriptor,
        new java.lang.String[] { "Id", "OrderAmount", "OrderCurrency", "CustomerDetails", "Id", "OrderCurrency", });
    internal_static_com_cashfree_pg_generated_CustomerDetails_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_cashfree_pg_generated_CustomerDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cashfree_pg_generated_CustomerDetails_descriptor,
        new java.lang.String[] { "CustomerId", "CustomerEmail", "CustomerPhone", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
