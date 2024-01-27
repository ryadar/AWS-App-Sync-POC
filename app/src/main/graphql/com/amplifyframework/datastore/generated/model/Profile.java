package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the Profile type in your schema. */
public final class Profile {
  private final String email;
  private final Integer id;
  private final String name;
  private final String phoneNumber;
  public String getEmail() {
      return email;
  }
  
  public Integer getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getPhoneNumber() {
      return phoneNumber;
  }
  
  private Profile(String email, Integer id, String name, String phoneNumber) {
    this.email = email;
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Profile profile = (Profile) obj;
      return ObjectsCompat.equals(getEmail(), profile.getEmail()) &&
              ObjectsCompat.equals(getId(), profile.getId()) &&
              ObjectsCompat.equals(getName(), profile.getName()) &&
              ObjectsCompat.equals(getPhoneNumber(), profile.getPhoneNumber());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getEmail())
      .append(getId())
      .append(getName())
      .append(getPhoneNumber())
      .toString()
      .hashCode();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(email,
      id,
      name,
      phoneNumber);
  }
  public interface BuildStep {
    Profile build();
    BuildStep email(String email);
    BuildStep id(Integer id);
    BuildStep name(String name);
    BuildStep phoneNumber(String phoneNumber);
  }
  

  public static class Builder implements BuildStep {
    private String email;
    private Integer id;
    private String name;
    private String phoneNumber;
    public Builder() {
      
    }
    
    private Builder(String email, Integer id, String name, String phoneNumber) {
      this.email = email;
      this.id = id;
      this.name = name;
      this.phoneNumber = phoneNumber;
    }
    
    @Override
     public Profile build() {
        
        return new Profile(
          email,
          id,
          name,
          phoneNumber);
    }
    
    @Override
     public BuildStep email(String email) {
        this.email = email;
        return this;
    }
    
    @Override
     public BuildStep id(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
     public BuildStep name(String name) {
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String email, Integer id, String name, String phoneNumber) {
      super(email, id, name, phoneNumber);
      
    }
    
    @Override
     public CopyOfBuilder email(String email) {
      return (CopyOfBuilder) super.email(email);
    }
    
    @Override
     public CopyOfBuilder id(Integer id) {
      return (CopyOfBuilder) super.id(id);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder phoneNumber(String phoneNumber) {
      return (CopyOfBuilder) super.phoneNumber(phoneNumber);
    }
  }
  
}
