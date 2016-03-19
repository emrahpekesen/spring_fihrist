package com.aep.spring.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class EmailAddress {
   private Long emailAddressID;
   private String emailAddress;
   private EmailAddressType emailAddressType;
   private boolean preferred;
}
